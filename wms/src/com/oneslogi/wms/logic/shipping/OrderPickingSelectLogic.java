package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlOrderPickingDataListPmb;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.customize.SqlOrderPickingDataList;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.OrderPickingListDto;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * オーダーピッキング検索ロジッククラス
 */
public class OrderPickingSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPackingHBhv packingHBhv;
	// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
	@Inject
	private MProductBhv mProductBhv;
	// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End

	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start

	// ===== 使用ロジック =====

	@Inject
	private PickingWorkMessageSelectLogic pickingWorkMessageSelectLogic;

	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End

	// ===== 定数 =====

	/**
	 * 梱包ステータスの絞込条件
	 */
	private static final List<CDef.PackingStatus> IN_SCOPE_PACKING_STATUS = Collections.unmodifiableList(new ArrayList<CDef.PackingStatus>() {
		{
			add(CDef.PackingStatus.$25); // 出庫指示済
			add(CDef.PackingStatus.$30); // ピッキング中
		}
	});

	/**
	 * <h2>オーダーピッキングの指示データ検索.</h2>
	 * <pre>
	 * 引数の条件を指定してピッキングデータを検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param condition 検索条件
	 * @param errSts エラー時に登録するエラーステータス
	 * @return 検索結果(出荷梱包No.単位)
	 */
	public List<OrderPickingListDto> selectPickingHeadDataList(final SelectCondition condition, PagingDto.PagingData paging, ErrorStatus errSts) {

		final long centerId = condition.getCenterId();
		final long cultureId = getCultureId();

		TPackingHCB cb = packingHBhv.newMyConditionBean();

		cb.specify().specifyTAllocInstH().derivedTShippingInstHList().min(new SubQuery<TShippingInstHCB>() {

			@Override
			public void query(TShippingInstHCB subCb) {
				subCb.specify().columnPickingBatchNo();
			}
		}, TPackingH.ALIAS_pickingBatchNo);

		// ===== 結合条件 =====

		cb.setupSelect_TPickingH();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByPackingStatus().withVDict(cultureId);
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.21 kawana Start
		cb.setupSelect_BUserByUpdUser();
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.21 kawana End

		// ===== 検索条件 =====

		// センタID
		cb.query().setCenterId_Equal(centerId);

		// 荷主ID
		cb.query().setClientId_Equal(condition.getClientId());

		// 混載フラグ(混載)
		cb.query().setMixedFlg_Equal_$1();

		// 梱包ステータス
		cb.query().setPackingStatus_InScope_AsPackingStatus(IN_SCOPE_PACKING_STATUS);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.21 kawana Start
		// 更新ユーザCD
		cb.query().setUpdUser_Equal(condition.getUpdUserCd());
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.21 kawana End

		// 出荷梱包No.
		cb.query().setShippingPackingNo_LikeSearch(condition.getShippingPackingNoSuffix(), new LikeSearchOption().likeSuffix());

		// 出庫作業No.(後方一致)
		cb.query().queryTPickingH().setPickingWorkNo_LikeSearch(condition.getPickingWorkNoSuffix(), new LikeSearchOption().likeSuffix());

		// 作業日
		cb.query().queryTAllocInstH().setWorkDt_GreaterEqual(condition.getWorkDtFrom());
		cb.query().queryTAllocInstH().setWorkDt_LessEqual(condition.getWorkDtTo());

		// 出荷日
		cb.query().queryTAllocInstH().setShippingDt_GreaterEqual(condition.getShippingDtFrom());
		cb.query().queryTAllocInstH().setShippingDt_LessEqual(condition.getShippingDtTo());

		// 納品先CD(前方一致)
		cb.query().queryTAllocInstH().queryMCustomerBySupplyCustomerId().setCustomerCd_PrefixSearch(condition.getSupplyCustomerCdPrefix());

		// 配送コースCD(前方一致)
		cb.query().queryTAllocInstH().queryMDeliveryCourse().setDeliveryCourseCd_PrefixSearch(condition.getDeliveryCourseCdPrefix());

		// 梱包ボディから条件指定
		cb.query().existsTPackingBList(new SubQuery<TPackingBCB>() {

			@Override
			public void query(TPackingBCB subCb) {

				// ピッキング済・検品済 以外
				subCb.query().setPickingFlg_NotEqual_$1();
				subCb.query().setInspectionFlg_NotEqual_$1();
				// 緊急フラグ
				subCb.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().setEmergencyFlg_Equal(condition.getEmergencyFlg());

				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.27 kawana Start

				if (!CU.isNullOrEmpty(condition.getStockOutFlg())) {

					// 欠品有無
					if (condition.getStockOutFlg().equals("1")) {
						// 欠品有のみ表示

						subCb.query().queryTPickingB().queryTShippingInstB().setStockOutNum_GreaterThan(WCC.ZERO);
					} else if (condition.getStockOutFlg().equals("0")) {
						// 欠品無のみ表示

						subCb.query().queryTPickingB().queryTShippingInstB().setStockOutNum_Equal(WCC.ZERO);
					}
				}

				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.27 kawana End

				// 出庫指示バッチNo.
				subCb.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().setPickingBatchNo_Equal(condition.getPickingBatchNo());
			}
		});
		//[Ver3.1][#5239]検索条件に出庫ヘッダを追加 2018.09.28 miyabe add Start
		// 単行ピックフラグが「1:単行ピック有」のものは対象から除外
		cb.query().queryTPickingH().setSglRowPicFlg_NotEqual_$1();
		//[Ver3.1][#5239]検索条件に出庫ヘッダを追加 2018.09.28 miyabe add End

		// ===== ソート順 =====

		cb.query().queryTPickingH().queryTPickingRAsOne().addOrderBy_OplOutFlg_Asc(); // 発行フラグ
		cb.query().queryMClient().addOrderBy_ClientCd_Asc(); // 荷主CD
		cb.query().queryMCenter().addOrderBy_CenterCd_Asc(); // センタCD
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc(); // 作業日
		cb.query().queryTAllocInstH().addSpecifiedDerivedOrderBy_Asc(TPackingH.ALIAS_pickingBatchNo); // 出荷指示バッチNo.
		cb.query().queryTPickingH().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc(); // 配送コースCD
		cb.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc(); // 出庫作業No.
		cb.query().addOrderBy_ShippingPackingNo_Asc(); // 出荷梱包No.

		// ===== 検索実行 =====

		List<TPackingH> selectList = selectPage(packingHBhv, cb, paging);

		// ===== ０件チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return new ArrayList<OrderPickingListDto>();
		}

		List<OrderPickingListDto> dtoList = convertHeadDto(selectList);

		return dtoList;
	}

	// [#1942] ページング不正を修正 2017.06.20 kawana Start

	/**
	 * <h2>オーダーピッキングデータの検索.</h2>
	 * <pre>
	 * 引数の条件を指定してピッキングデータを検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param condition 検索条件
	 * @param errSts エラー時に登録するエラーステータス
	 * @return 検索結果
	 */
	public List<SqlOrderPickingDataList> selectPickingDataList(SelectCondition condition, PagingDto.PagingData paging, ErrorStatus errSts) {

		final long centerId = condition.getCenterId();
		final long clientId = condition.getClientId();

		// 外出しSQLの定義
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
		String sqlPath = MProductBhv.PATH_selectSqlOrderPickingDataList;
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End

		// ===== 検索条件の設定 =====

		SqlOrderPickingDataListPmb pmb = new SqlOrderPickingDataListPmb();
		pmb.setCenterId(centerId);
		pmb.setCultureId(getCultureId());
		pmb.setClientId(clientId);
		pmb.setShippingPackingNo(condition.getShippingPackingNoSuffix());

		// ===== 検索実行 =====

		// 検索実行
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
		List<SqlOrderPickingDataList> selectList = selectPage(mProductBhv, sqlPath, pmb, SqlOrderPickingDataList.class, paging);
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End

		// ===== ０件チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return selectList;
	}

	/**
	 * <h2>オーダーピッキングデータの検索(1件).</h2>
	 * <pre>
	 * 引数の条件を指定してピッキングデータを検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param stockId 在庫ID
	 * @param errSts エラーステータス
	 * @return ピッキングデータ
	 */
	public SqlOrderPickingDataList selectPickingDataDetail(long centerId, long clientId, String shippingPackingNo, long stockId, ErrorStatus errSts) {

		// 外出しSQLの定義
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
		String sqlPath = MProductBhv.PATH_selectSqlOrderPickingDataList;
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End

		// ===== 検索条件の設定 =====

		SqlOrderPickingDataListPmb pmb = new SqlOrderPickingDataListPmb();
		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setCultureId(getCultureId());
		pmb.setStockId(stockId);
		pmb.setShippingPackingNo(shippingPackingNo);

		// ===== 検索実行 =====

		// 検索実行
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
		List<SqlOrderPickingDataList> selectList = selectList(mProductBhv, sqlPath, pmb, SqlOrderPickingDataList.class);
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End

		// ===== 件数チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		if (selectList.size() != 1) {
			this.getErrorManager().throwException(new IllegalStateException());
		}

		SqlOrderPickingDataList resultEntity = selectList.get(0);

		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		if (resultEntity.prepareDomain() != null) {
			mProductBhv.loadMProductShapeList(resultEntity.prepareDomain(), new ConditionBeanSetupper<MProductShapeCB>() {
				public void setup(MProductShapeCB cb) {
					cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
					cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
					cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
					cb.query().setDelFlg_Equal_$0();
					cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				}
			});
		}
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, resultEntity.prepareDomain());

		resultEntity.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, resultEntity.prepareDomain()));
		resultEntity.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, resultEntity.prepareDomain()));
		resultEntity.setPickingBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, resultEntity.getPickingNum(), minimumUnitMap, parentUnitNumMap
				, parentUnitMap, resultEntity.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
		resultEntity.setChargeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, resultEntity.getChargeNum(), minimumUnitMap, parentUnitNumMap
				, parentUnitMap, resultEntity.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		// [#3114][Ver3.0] ＳＤオーダーピッキング - UoM対応 2017.12.20 honma Mod End

		// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.26 kawana Start
		// 出庫作業メッセージが複数件
		resultEntity.setPickingWorkMessage(pickingWorkMessageSelectLogic.selectPickingWorkMessage(resultEntity.getPickingWorkNo()));
		// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.26 kawana End

		return resultEntity;
	}

	// [#1942] ページング不正を修正 2017.06.20 kawana End

	private List<OrderPickingListDto> convertHeadDto(List<TPackingH> selectList) {

		List<OrderPickingListDto> convertDtoList = new ArrayList<OrderPickingListDto>();

		for (TPackingH packingH : selectList) {

			OrderPickingListDto dto = newPickingListDto(packingH);
			convertDtoList.add(dto);
		}

		return convertDtoList;
	}

	private OrderPickingListDto newPickingListDto(TPackingH packingH) {

		OrderPickingListDto dto = new OrderPickingListDto();

		// 出荷梱包No.
		dto.setShippingPackingNo(packingH.getShippingPackingNo());

		// 出庫作業No.
		dto.setPickingWorkNo(packingH.getTPickingH().getPickingWorkNo());

		// [Ver3.1][#5130]ピッキングリストから出庫指示バッチNo.を削除 2018.09.21 matsumoto Del

		// 梱包ステータス
		dto.setPackingStatus(packingH.getPackingStatus());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		dto.setPackingStatusNm(packingH.getBClassDtlByPackingStatus().getVDict().getDictNm());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.21 kawana Start

		// 更新ユーザ
		dto.setUserCd(packingH.getUpdUser());
		dto.setUserNm(packingH.chaseBUserByUpdUser().getUserNm());

		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.21 kawana End

		return dto;
	}

	/**
	 * <h2>検索処理の引数クラス.</h2>
	 */
	public static class SelectCondition {
		private long centerId;
		private Long clientId;
		private String workDtFrom;
		private String workDtTo;
		private String shippingDtFrom;
		private String shippingDtTo;
		private String pickingBatchNo;
		private String pickingWorkNoSuffix;
		private String shippingPackingNoSuffix;
		private String supplyCustomerCdPrefix;
		private String emergencyFlg;
		private String stockOutFlg;
		private String deliveryCourseCdPrefix;
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.16 kawana Start
		private String updUserCd;
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.16 kawana End

		public SelectCondition(long centerId) {
			this.centerId = centerId;
		}

		public long getCenterId() {
			return centerId;
		}

		public Long getClientId() {
			return clientId;
		}

		public String getWorkDtFrom() {
			return workDtFrom;
		}

		public String getWorkDtTo() {
			return workDtTo;
		}

		public String getShippingDtFrom() {
			return shippingDtFrom;
		}

		public String getShippingDtTo() {
			return shippingDtTo;
		}

		public String getPickingBatchNo() {
			return pickingBatchNo;
		}

		public String getPickingWorkNoSuffix() {
			return pickingWorkNoSuffix;
		}

		public String getShippingPackingNoSuffix() {
			return shippingPackingNoSuffix;
		}

		public String getSupplyCustomerCdPrefix() {
			return supplyCustomerCdPrefix;
		}

		public String getEmergencyFlg() {
			return emergencyFlg;
		}

		public String getStockOutFlg() {
			return stockOutFlg;
		}

		public String getDeliveryCourseCdPrefix() {
			return deliveryCourseCdPrefix;
		}

		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}

		public void setWorkDtFrom(String workDtFrom) {
			this.workDtFrom = workDtFrom;
		}

		public void setWorkDtTo(String workDtTo) {
			this.workDtTo = workDtTo;
		}

		public void setShippingDtFrom(String shippingDtFrom) {
			this.shippingDtFrom = shippingDtFrom;
		}

		public void setShippingDtTo(String shippingDtTo) {
			this.shippingDtTo = shippingDtTo;
		}

		public void setPickingBatchNo(String pickingBatchNo) {
			this.pickingBatchNo = pickingBatchNo;
		}

		public void setPickingWorkNoSuffix(String pickingWorkNoSuffix) {
			this.pickingWorkNoSuffix = pickingWorkNoSuffix;
		}

		public void setShippingPackingNoSuffix(String shippingPackingNoSuffix) {
			this.shippingPackingNoSuffix = shippingPackingNoSuffix;
		}

		public void setSupplyCustomerCdPrefix(String supplyCustomerCdPrefix) {
			this.supplyCustomerCdPrefix = supplyCustomerCdPrefix;
		}

		public void setEmergencyFlg(String emergencyFlg) {
			this.emergencyFlg = emergencyFlg;
		}

		public void setStockOutFlg(String stockOutFlg) {
			this.stockOutFlg = stockOutFlg;
		}

		public void setDeliveryCourseCdPrefix(String deliveryCourseCdPrefix) {
			this.deliveryCourseCdPrefix = deliveryCourseCdPrefix;
		}

		public String getUpdUserCd() {
			return updUserCd;
		}

		public void setUpdUserCd(String updUserCd) {
			this.updUserCd = updUserCd;
		}

	}
}