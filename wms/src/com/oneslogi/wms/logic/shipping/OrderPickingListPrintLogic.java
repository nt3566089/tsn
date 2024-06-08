package com.oneslogi.wms.logic.shipping;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlOrderPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlOrderPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.OrderPickingListDto;
import com.oneslogi.wms.util.WRMT;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;
/**
 * オーダーピッキングリスト発行データ取得ロジッククラス
 */
public class OrderPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start
	@Inject
	private MProductBhv mProductBhv;
	// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End

	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start

	// ===== 使用ロジック =====
	@Inject
	private PickingWorkMessageSelectLogic pickingWorkMessageSelectLogic;

	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End

	/**
	 * <h2>オーダーピッキングリストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しオーダーピッキングリストのデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<OrderPickingListDto> オーダーピッキングリスト発行データリスト
	 */
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod Start
	public List<OrderPickingListDto> select(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod End

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start
		if (isReportMaxTest()) {
			return testMaxDtoList();
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

		List<SqlOrderPickingListPrint> result = new ArrayList<SqlOrderPickingListPrint>();

		// 外出しSQLの定義
		// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start
		String path = MProductBhv.PATH_selectSqlOrderPickingListPrint;
		// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End

		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumIntegerDigits(3);
		formatter.setGroupingUsed(false);

		// 検索条件の設定
		SqlOrderPickingListPrintPmb pmb = new SqlOrderPickingListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());

		// 検索実行
		Class<SqlOrderPickingListPrint> entityType = SqlOrderPickingListPrint.class;
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start
		result = selectListToReport(mProductBhv, path, pmb, entityType);
		// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		//名寄せ分母
		int intDELIV_UNIT_NO = 0;
		//名寄せ分子
		int intPICKING_WORK_NO = 0;

		//出庫ヘッダリスト名寄せ分子/名寄せ分母取得
		List<TPickingH> receiveTPickingHList = setCondition(tPickingR);

		// ===== ０件チェック =====
		if (receiveTPickingHList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start
		List<MProduct> pickingProductList = new ArrayList<>();
		for (SqlOrderPickingListPrint pickingProduct : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			if (pickingProduct.prepareDomain() != null) {
				pickingProductList.add(pickingProduct.prepareDomain());
			}
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		mProductBhv.loadMProductShapeList(pickingProductList, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB cb) {
				cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				cb.query().setDelFlg_Equal_$0();
				cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
			}
		});

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		for(SqlOrderPickingListPrint pickingProduct : result){
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, pickingProduct.prepareDomain());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End

		//名寄せ分子/名寄せ分母作成
		List<TPickingH> receiveTPickingHOneList = new ArrayList<TPickingH>();
		TPickingH TPickingHOne = new TPickingH();
		for (TPickingH SqlListA : receiveTPickingHList) {
			for (TPickingH SqlListB : receiveTPickingHList) {

				if (!(CU.isNullOrEmpty(SqlListA.getDelivUnitNo()) || CU.isNullOrEmpty(SqlListB.getDelivUnitNo()) || CU.isNullOrEmpty(SqlListA.getPickingWorkNo()) || CU.isNullOrEmpty(SqlListB
						.getPickingWorkNo()))) {
					//listA.届先単位No. = listB.届先単位No.の場合
					if (SqlListA.getDelivUnitNo().equals(SqlListB.getDelivUnitNo())) {
						intDELIV_UNIT_NO = intDELIV_UNIT_NO + 1;
						if (SqlListB.getPickingWorkNo().compareTo(SqlListA.getPickingWorkNo()) >= 0) {
							intPICKING_WORK_NO = intPICKING_WORK_NO + 1;
						}
					}
				}
			}

			if (!(CU.isNullOrEmpty(SqlListA.getPickingWorkNo()))) {
				TPickingHOne = new TPickingH();
				TPickingHOne.setStrFractionOne(formatter.format(intPICKING_WORK_NO) + '/' + formatter.format(intDELIV_UNIT_NO));
				TPickingHOne.setPickingWorkNo(SqlListA.getPickingWorkNo());
				receiveTPickingHOneList.add(TPickingHOne);
				intPICKING_WORK_NO = 0;
				intDELIV_UNIT_NO = 0;
			}
		}

		List<OrderPickingListDto> dataList = new ArrayList<OrderPickingListDto>();
		for (SqlOrderPickingListPrint SqlListA : result) {
			OrderPickingListDto dataListDto = new OrderPickingListDto();
			dataListDto.setCultureId(getCultureId());
			// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			//入数
			dataListDto.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, SqlListA.prepareDomain()));
			//内訳
			dataListDto.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, SqlListA.getPickingNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, SqlListA.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			dataListDto.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, SqlListA.prepareDomain()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End
			dataListDto.setCarrierCd(SqlListA.getCarrierCd());
			dataListDto.setCarrierNm(SqlListA.getCarrierNm());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataListDto.setCenterCd(SqlListA.getCenterCd());
			dataListDto.setCenterNm(SqlListA.getCenterNm());
			dataListDto.setChargeNum(SqlListA.getChargeNum());
			dataListDto.setClientCd(SqlListA.getClientCd());
			dataListDto.setClientNm(SqlListA.getClientNm());
			dataListDto.setDelivDt(SqlListA.getDelivDt());
			dataListDto.setDeliveryCourseCd(SqlListA.getDeliveryCourseCd());
			dataListDto.setDeliveryCourseNm(SqlListA.getDeliveryCourseNm());
			dataListDto.setDelivUnitNo(SqlListA.getDelivUnitNo());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			dataListDto.setJanCd(SqlListA.getJanCd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
			dataListDto.setLimitDt(SqlListA.getLimitDt());
			dataListDto.setLocationCd(SqlListA.getLocationCd());
			dataListDto.setLot(SqlListA.getLot());
			// [Ver3.1][#5130]ピッキングリストから出庫指示バッチNo.を削除 2018.09.21 matsumoto Del
			dataListDto.setPickingNum(SqlListA.getPickingNum());
			// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
			if (1 < CU.nullToZero(SqlListA.getPickingWorkMessageCount().longValue())) {
				// 複数メッセージあり
				dataListDto.setPickingWorkMessage(pickingWorkMessageSelectLogic.selectPickingWorkMessage(SqlListA.getPickingWorkNo()));
			} else {
				dataListDto.setPickingWorkMessage(SqlListA.getPickingWorkMessage());
			}
			// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
			dataListDto.setPickingWorkNo(SqlListA.getPickingWorkNo());
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka Start
			// [ON推-品向-555] 5桁の出庫作業Noをjava側で作成 2015.01.15 kawana Start
			// 作業出庫No.(省略形)の設定
			if (SqlListA.getPickingWorkNo().length() > 5) {
				dataListDto.setPickingWorkNoAbbr(SqlListA.getPickingWorkNo().substring(SqlListA.getPickingWorkNo().length() - 5));
			} else {
				dataListDto.setPickingWorkNoAbbr(SqlListA.getPickingWorkNo());
			}
			// [ON推-品向-555] 5桁の出庫作業Noをjava側で作成 2015.01.15 kawana End
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka End
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
			dataListDto.setShippingPackingNo(SqlListA.getShippingPackingNo());
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka Start
			// 出荷梱包No.(省略形)の設定
			if (SqlListA.getShippingPackingNo().length() > 5) {
				dataListDto.setShippingPackingNoAbbr(SqlListA.getShippingPackingNo().substring(SqlListA.getShippingPackingNo().length() - 5));
			} else {
				dataListDto.setShippingPackingNoAbbr(SqlListA.getShippingPackingNo());
			}
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka End
			dataListDto.setBoxCd(SqlListA.getBoxCd());
			dataListDto.setBoxNm(SqlListA.getBoxNm());
			dataListDto.setPackingCalCls(SqlListA.getPackingCalCls());
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja End
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataListDto.setProductCd(SqlListA.getProductCd());
			dataListDto.setProductNm(SqlListA.getProductNm());
			dataListDto.setShippingSlipNo(SqlListA.getShippingSlipNo());
			//伝票№件数
			// [ON推-品向-1139] "件"のハードコーディングを辞書マスタから取得するように修正 2016.04.21 kawana Start
			dataListDto.setShippingSlipNoNum(CU.nullToZero(SqlListA.getShippingSlipNo()).toString());
			// [ON推-品向-1139] "件"のハードコーディングを辞書マスタから取得するように修正 2016.04.21 kawana End
	        // [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana Start
			dataListDto.setClientShippingNo(SqlListA.getClientShippingNo());
	        // [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana End
			dataListDto.setStoreLabelNo(SqlListA.getStoreLabelNo());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataListDto.setSupplyCustomerCd(SqlListA.getSupplyCustomerCd());
			dataListDto.setSupplyCustomerNm(SqlListA.getSupplyCustomerNm());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka Start
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka End
			dataListDto.setWarehouseCd(SqlListA.getWarehouseCd());
			dataListDto.setWarehouseNm(SqlListA.getWarehouseNm());
			dataListDto.setWmsShippingSlipNo(SqlListA.getWmsShippingSlipNo());
			dataListDto.setWorkDt(SqlListA.getWorkDt());
			dataListDto.setPrintFlg(SqlListA.getOplOutFlg());
			dataListDto.setCenterAbbr(SqlListA.getCenterAbbr());
			dataListDto.setClientAbbr(SqlListA.getClientAbbr());
			dataListDto.setWarehouseAbbr(SqlListA.getWarehouseAbbr());
			dataListDto.setLocationNm(SqlListA.getLocationNm());
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
			dataListDto.setStoreDt(SqlListA.getStoreDt());
			dataListDto.setStoreNoFlg(storeNoFlg);
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
			dataList.add(dataListDto);
		}

		for (OrderPickingListDto SqlListA : dataList) {
			for (TPickingH SqlListB : receiveTPickingHOneList) {
				if (SqlListB.getPickingWorkNo().equals(SqlListA.getPickingWorkNo())) {
					if (SqlListB.getPickingWorkNo().equals(SqlListA.getPickingWorkNo())) {
						SqlListA.setStrFraction(SqlListB.getStrFractionOne());
					}
				}
			}
		}

		return dataList;
	}

	/**
	 * <h2>出庫ヘッダのデータを取得する。</h2>
	 * <pre>
	 * 引数のコントロールNo.を条件に出庫ヘッダのデータを取得する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> setCondition(TPickingR tPickingR) {

		List<TPickingH> result = new ArrayList<TPickingH>();

		// 検索条件の設定
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();

		cb.setupSelect_TPickingRAsOne();
		cb.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().addOrderBy_DelivUnitNo_Asc();
		cb.query().addOrderBy_PickingStatus_Asc();

		// 検索実行
		result = tPickingHBhv.selectList(cb);
		return result;

	}

	/**
	 *<h2>リスト最大桁テスト用</h2>
	 * <pre>
	 * 最大桁テストを行う場合に実行する。
	 * 本メソッドを使用する場合はB_PROPATYマスタの[reportMaxTestMode]を'test'に設定すること
	 * </pre>
	 * @param なし
	 * @return List<PLPickingListDto> 出力用リスト
	 */
	public List<OrderPickingListDto> testMaxDtoList() {

		OrderPickingListDto redto = new OrderPickingListDto();
		redto.setCultureId(1);
		redto.setStringUnitNum(WRMT.unitNum());
		redto.setBreakdown(WRMT.breakDown());
		redto.setMinimumPackingUnit(WRMT.minimumUnit());
		redto.setCarrierCd(WRMT.carrierCd());
		redto.setCarrierNm(WRMT.carrierAbbr());
		redto.setCenterCd(WRMT.centerCd());
		redto.setCenterAbbr(WRMT.centerAbbr());
		redto.setChargeNum(WRMT.stockNum());
		redto.setClientCd(WRMT.clientCd());
		redto.setClientAbbr(WRMT.clientAbbr());
		redto.setDelivDt(WRMT.date());
		redto.setDeliveryCourseCd(WRMT.deliveryCourseCd());
		redto.setDeliveryCourseNm(WRMT.deliveryCourseNm());
		redto.setDelivUnitNo(WRMT.delivUnitNo());
		redto.setJanCd(WRMT.janCd());
		redto.setLimitDt(WRMT.date());
		redto.setLot(WRMT.lot());
		redto.setPickingNum(WRMT.stockNum());
		redto.setPickingWorkMessage(WRMT.pickingWorkMessage());
		redto.setPickingWorkNo(WRMT.pickingWorkNo());
		if (redto.getPickingWorkNo().length() > 5) {
			redto.setPickingWorkNoAbbr(redto.getPickingWorkNo().substring(redto.getPickingWorkNo().length() - 5));
		} else {
			redto.setPickingWorkNoAbbr(redto.getPickingWorkNo());
		}
		redto.setWmsShippingSlipNo(WRMT.wmsShippingSlipNo());
		redto.setClientShippingNo(WRMT.clientShippingNo());
		redto.setShippingSlipNoNum(WRMT.slipNum());
		redto.setPrintFlg("1");
		redto.setWorkDt(WRMT.date());
		redto.setBoxNm(WRMT.boxNm());
		redto.setSupplyCustomerCd(WRMT.customerCd());
		redto.setSupplyCustomerNm(WRMT.customerAbbr());
		redto.setLocationCd(WRMT.locationCd());
		redto.setLocationNm(WRMT.locationNm());
		redto.setStoreDt(WRMT.date());
		redto.setProductCd(WRMT.productCd());
		redto.setProductNm(WRMT.productAbbr());
		redto.setShippingSlipNo(1L);
		redto.setWarehouseAbbr(WRMT.warehouseAbbr());
		redto.setStoreNoFlg("0");


		List<OrderPickingListDto> dataList = new ArrayList<OrderPickingListDto>();
		for (int i = 0; i < 994; i++) {
			// 994行作成 (総合計の10桁表示のため)
			dataList.add(redto);
		}

		return dataList;
	}

}
