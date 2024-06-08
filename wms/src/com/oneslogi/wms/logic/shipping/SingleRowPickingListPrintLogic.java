package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTPickingB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.dto.TPickingBDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingBDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.util.WRMT;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 単行ピッキングリスト発行データ取得ロジッククラス
 */
public class SingleRowPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;

	// ===== 使用ロジック =====

	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>単行ピッキングリストデータを取得する。</h2>
	 * <pre>
	 * 単行ピッキングリストのデータを取得する。
	 * 0件の場合はエラーとする。
	 *
	 * また、ピッキンググループNo.、仮置No.を設定しDB更新する。
	 * 仮置No.、指示数毎にピック数を合計した出庫ボディリストを返却。
	 *
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingB> 単行ピッキングリスト発行データリスト
	 */
	public List<TPickingB> selectProgressData(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		// 対象の出庫ボディリストを取得
		List<TPickingB> pickingDataList = selectPickingDataList(tPickingR);
		if (pickingDataList.isEmpty()) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.30 tanaka Start
		if (isReportMaxTest()) {
			return testMaxDtoList(pickingDataList);
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.30 tanaka End

		// 荷姿計算用マップ
		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		// 処理中の出庫ボディ、ピッキンググループNo.
		TPickingB currentPickingB = null;
		String currentPickingGroupNo = null;

		// ピッキンググループNo.更新用リスト
		List<TPickingH> updatePickingHList = new ArrayList<TPickingH>();
		// 仮置No.
		int tempNo = 0;
		// ピック数集計クラス
		SingleRowSumPickingNum currentSumCls = null;

		// 返却用リスト(ピック数集計済リスト)
		List<TPickingB> sumPickingBList = new ArrayList<TPickingB>();

		// 取得データ分繰返
		for (TPickingB pickingB : pickingDataList) {

			// 入庫No.管理フラグ
			pickingB.setStoreNoFlg(storeNoFlg);

			TPickingH pickingH = pickingB.getTPickingH();
			String pickingGroupNo = pickingH.getPickingGroupNo();

			if (CU.isNullOrEmpty(pickingGroupNo)) {
				// ピッキンググループNo.未設定

				// ピッキンググループNo.を変更するか
				boolean changePickingGroupNo = changePickingGroupNo(currentPickingB, pickingB);

				if (changePickingGroupNo) {
					// ピッキンググループNo.を変更

					// ピッキンググループNo.採番
					pickingGroupNo = numberingLogic.getNumbering(pickingH.getCenterId(), WmsCoreNumberingConst.PICKING_GROUP_NO);
				} else {
					pickingGroupNo = currentPickingGroupNo;
				}

				// 出庫ヘッダに設定
				pickingH.setPickingGroupNo(pickingGroupNo);
				updatePickingHList.add(pickingH);
			}

			if (!CU.equals(pickingGroupNo, currentPickingGroupNo)) {
				// ピッキンググループNo.が変更された

				// 仮置No.をクリア
				tempNo = 0;
				// 処理中の出庫ボディをクリア
				currentPickingB = null;
			}

			// 在庫ID単位に集計
			if (equalStockId(currentPickingB, pickingB)) {
				// 在庫IDが一緒

				// 集計クラスに出庫ボディを追加
				currentSumCls.sumPickingNum(pickingB);
			} else {
				// 在庫IDが異なる

				if (currentSumCls != null) {
					// 集計していた出庫ボディを処理

					// 仮置No.更新 (DB)
					currentSumCls.updateTempNo(tPickingBBhv);
					// 計算クラスから計算後の出庫ボディを取得 ⇒ 返却用リストに追加
					sumPickingBList.addAll(currentSumCls.getSumPickingBList(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap));
				}

				// 集計クラスを新規作成
				tempNo++;
				currentSumCls = new SingleRowSumPickingNum(tempNo);

				// 集計クラスに出庫ボディを追加
				currentSumCls.sumPickingNum(pickingB);
			}

			// 処理中の出庫ボディ、ピッキンググループNo.を更新
			currentPickingB = pickingB;
			currentPickingGroupNo = pickingGroupNo;
		}

		// 仮置No.更新 (DB)
		currentSumCls.updateTempNo(tPickingBBhv);
		// 返信用リストに計算した後の出庫ボディリストを追加
		sumPickingBList.addAll(currentSumCls.getSumPickingBList(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap));

		if (!updatePickingHList.isEmpty()) {
			// ピッキンググループNo.の更新 (DB)
			tPickingHBhv.batchUpdate(updatePickingHList);
		}

		return sumPickingBList;
	}

	/**
	 * ピッキング対象データの検索
	 */
	private List<TPickingB> selectPickingDataList(TPickingR tPickingR) {

		final Long cultureId = getCultureId();

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();

		// ===== テーブル結合 =====

		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TPickingH().withMClient();
		cb.setupSelect_TPickingH().withMCenter();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TStock().withMLocation().withMZone().withMWarehouse();
		cb.setupSelect_TStock().withMStockType().withVDict(cultureId);
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withTStoreNo();
		cb.setupSelect_TAllocInstB();

		// ===== 検索条件 =====

		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().queryTPickingH().setSglRowPicFlg_Equal_$1();

		// ===== ソート順 =====

		// ヘッダ項目
		// 再発行(ピッキンググループNo) ＞ 荷主CD ＞ センタCD ＞ 倉庫CD ＞ 作業日 ＞ 在庫区分CD ＞ ピッキング順序(ゾーン) ＞ ゾーンCD
		cb.query().queryTPickingH().addOrderBy_PickingGroupNo_Asc();
		cb.query().queryTPickingH().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryTPickingH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTStock().queryMStockType().addOrderBy_StockTypeCd_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		// ボディ項目
		// ロケーションCD ＞ 商品CD ＞ 期限日 ＞ ロット ＞ 入庫ラベルNo. ＞ 指示数
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		cb.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
		cb.query().queryTAllocInstB().addOrderBy_InstNum_Asc();

		// ===== 検索実行 =====

		List<TPickingB> pickingBList = tPickingBBhv.selectList(cb);

		tPickingBBhv.load(pickingBList, new ReferrerLoaderHandler<LoaderOfTPickingB>() {

			@Override
			public void handle(LoaderOfTPickingB loader) {
				loader.pulloutTStock().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});

		return pickingBList;
	}

	/**
	 * ピッキンググループNo変更有無
	 */
	private boolean changePickingGroupNo(TPickingB currentPickingB, TPickingB pickingB) {

		if (currentPickingB == null) {
			return true;
		}

		if (currentPickingB.getTStock().getMLocation().getZoneId().longValue() != pickingB.getTStock().getMLocation().getZoneId().longValue()) {
			// ゾーン違い
			return true;
		}

		if (currentPickingB.getTStock().getStockTypeId().longValue() != pickingB.getTStock().getStockTypeId().longValue()) {
			// 在庫区分違い
			return true;
		}

		TPickingH headerA = currentPickingB.getTPickingH();
		TPickingH headerB = pickingB.getTPickingH();

		if (headerA.getCenterId().longValue() != headerB.getCenterId().longValue()) {
			// センタ違い
			return true;
		}

		if (headerA.getClientId().longValue() != headerB.getClientId().longValue()) {
			// 荷主違い
			return true;
		}

		if (!CU.equals(headerA.getTAllocInstH().getWorkDt(), headerB.getTAllocInstH().getWorkDt())) {
			// 作業日違い
			return true;
		}

		return false;
	}

	/**
	 * 在庫IDが一致しているか
	 */
	private boolean equalStockId(TPickingB currentPickingB, TPickingB pickingB) {

		if (currentPickingB == null) {
			return false;
		}

		if (currentPickingB.getStockId().longValue() == pickingB.getStockId().longValue()) {
			return true;
		}

		return false;
	}

	/**
	 * 出庫ボディのピック数集計クラス
	 */
	private static class SingleRowSumPickingNum {

		/** 合計ピック数 */
		private BigDecimal sumPickingNum = WCC.ZERO;
		/** 出庫ボディIDリスト(仮置No更新で使用) */
		private List<Long> pickingBIdList = new ArrayList<Long>();
		/** 商品マスタ */
		private MProduct product = null;
		/** 指示数別の出庫ボディ(キー：指示数) */
		private Map<Long, TPickingB> instNumPickingBMap = new LinkedHashMap<Long, TPickingB>();
		/** 仮置No. */
		private String tempNo;

		/**
		 * コンストラクタ
		 */
		public SingleRowSumPickingNum(int tempNo) {

			String tmpNoStr = "0000" + String.valueOf(tempNo);
			tmpNoStr = tmpNoStr.substring(tmpNoStr.length() - 4);

			this.tempNo = tmpNoStr;
		}

		/**
		 * ピック数の集計
		 */
		public void sumPickingNum(TPickingB pickingB) {

			// 合計ピック数に加算
			sumPickingNum = WCC.add(sumPickingNum, pickingB.getPickingNum());
			// DB更新用のIDリストに追加
			pickingBIdList.add(pickingB.getPickingBId());
			if (product == null) {
				product = pickingB.getTStock().getMProduct();
			}

			// 指示数別の出庫ボディにピック数を加算
			long instNum = WCC.longValue(pickingB.getTAllocInstB().getInstNum());
			if (instNumPickingBMap.containsKey(instNum)) {

				TPickingB instNumPickingB = instNumPickingBMap.get(instNum);
				instNumPickingB.setPickingNum(WCC.add(instNumPickingB.getPickingNum(), pickingB.getPickingNum()));
			} else {

				instNumPickingBMap.put(instNum, pickingB);
			}
		}

		/**
		 * ピック数を集計・設定した出庫ボディを取得
		 */
		public List<TPickingB> getSumPickingBList(Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap, Map<Long, List<Long>> parentUnitNumMap,
				Map<Long, List<String>> parentUnitMap) {

			// 荷姿要変数の設定
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, product);

			// 商品単位
			String unitNm = WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, product);
			// 荷姿内訳の取得
			String stringUnitNum = WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, product);
			// 合計の入数内訳の取得
			String sumBreakdown = WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sumPickingNum, minimumUnitMap, parentUnitNumMap, parentUnitMap, product,
					WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY);

			List<TPickingB> sumPickingBList = new ArrayList<TPickingB>();

			for (TPickingB pickingB : instNumPickingBMap.values()) {

				// 仮置No.
				pickingB.setTempNo(tempNo);
				// 内訳
				pickingB.setStringUnitNum(stringUnitNum);
				// 最小梱包単位
				pickingB.setMinimumPackingUnit(unitNm);
				// 指示数の入数内訳
				pickingB.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, pickingB.getPickingNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap, product,
						WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// 合計
				pickingB.setSumPickingNum(sumPickingNum);
				// 合計の入数内訳
				pickingB.setSumBreakdown(sumBreakdown);

				sumPickingBList.add(pickingB);
			}

			return sumPickingBList;
		}

		/**
		 * 仮置No.更新
		 */
		public void updateTempNo(TPickingBBhv bhv) {

			// 更新条件
			TPickingBCB cb = bhv.newMyConditionBean();
			cb.checkInvalidQuery();
			cb.query().setPickingBId_InScope(pickingBIdList);

			// 更新値 (仮置No.)
			TPickingB updateEntity = bhv.newMyEntity();
			updateEntity.setTempNo(tempNo);

			// 更新実行
			bhv.queryUpdate(updateEntity, cb);
		}
	}

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start
	/**
	 * <h2>単行ピッキングリスト最大桁出力用</h2>
	 * <pre>
	 * 最大桁を設定しリストを返す。
	 * </pre>
	 *
	 * @param List<TPickingB> 単行ピッキングリスト発行データリスト
	 * @return List<TPickingB> 単行ピッキングリスト発行データリスト
	 */
	private List<TPickingB> testMaxDtoList(List<TPickingB> tPickingB) {

		TPickingB entity = tPickingB.get(0);
		entity.getTPickingH().getMCenter().setCenterCd(WRMT.centerCd());
		entity.getTPickingH().getMCenter().setCenterAbbr(WRMT.centerAbbr());
		entity.getTPickingH().getMClient().setClientCd(WRMT.clientCd());
		entity.getTPickingH().getMClient().setClientAbbr(WRMT.clientAbbr());
		entity.getTStock().getTLot().setLimitDt(WRMT.date());
		entity.getTStock().getMLocation().setLocationCd(WRMT.locationCd());
		entity.getTStock().getMProduct().setProductCd(WRMT.productCd());
		entity.getTStock().getMProduct().setProductAbbr(WRMT.productAbbr());
		entity.getTPickingH().getTPickingRAsOne().setSplOutFlg("1");
		entity.getTStock().getMStockType().setStockTypeCd(WRMT.stockTypeCd());
		entity.getTStock().getMStockType().getVDict().setDictNm(WRMT.stockTypeNm());
		entity.getTStock().getTStoreNo().setStoreLabelNo(WRMT.storeLabelNo());
		entity.setSumPickingNum(WRMT.stockNum());
		entity.getTPickingH().getTAllocInstH().setWorkDt(WRMT.date());
		entity.getTStock().getMLocation().setLocationNm(WRMT.locationNm());
		entity.getTStock().getTLot().setLot(WRMT.lot());
		entity.getTStock().getTStoreNo().setStoreDt(WRMT.date());
		entity.setStoreNoFlg("0");
		entity.setBreakdown(WRMT.breakDown());
		entity.setMinimumPackingUnit(WRMT.minimumUnit());
		entity.setStringUnitNum(WRMT.unitNum());
		entity.getTStock().getMProduct().setJanCd(WRMT.janCd());
		entity.getTStock().setChargeNum(WRMT.stockNum());
		entity.getTPickingH().setPickingGroupNo(WRMT.pickingGroupNo());
		entity.getTStock().getMLocation().getMZone().setZoneCd(WRMT.zoneCd());
		entity.getTStock().getMLocation().getMZone().setZoneNm(WRMT.zoneNm());
		entity.getTAllocInstB().setInstNum(WCC.toBigDecimal("9"));
		entity.setPickingNum(WRMT.stockNum());
		entity.getTStock().getMLocation().getMZone().getMWarehouse().setWarehouseCd(WRMT.warehouseCd());
		entity.getTStock().getMLocation().getMZone().getMWarehouse().setWarehouseAbbr(WRMT.warehouseAbbr());
		entity.setSumBreakdown(WRMT.breakDown());

		List<TPickingB> dataList = new ArrayList<TPickingB>();

		for (int i = 0; i < 996; i++) {
			// 995行作成 (総合計の10桁表示のため)

			TPickingBDtoMapper mapper = new TPickingBDtoMapper();
			TPickingBDto dto = mapper.mappingToDto(entity);
			TPickingB repentity = mapper.mappingToEntity(dto);

			// 仮置きNo.を変更
			repentity.setTempNo(WRMT.tempNo(i + 1));

			dataList.add(repentity);
		}

		return dataList;
	}

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

}
