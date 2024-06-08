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
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPLPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlPLPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.PLPickingListDto;
import com.oneslogi.wms.util.WRMT;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 摘み取りピッキングリスト発行データ取得ロジッククラス
 */
public class PLPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;

	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
	@Inject
	private MProductBhv mProductBhv;
	// [Ver3.0] unit of measure対応 2017.11.23 REN End

	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start

	// ===== 使用ロジック =====
	@Inject
	private PickingWorkMessageSelectLogic pickingWorkMessageSelectLogic;

	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End

	/**
	 * <h2>摘み取りピッキングリストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し、摘み取りピッキングリストデータを取得する。
	 * 出庫ヘッダから対象のデータを取得し、名寄せ分子、分母を設定する。
	 * 摘み取りピッキングリストデータ及び名寄せ分子、分母を摘み取りピッキングリスト発行データDTOに設定する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<PLPickingListDto> 摘み取りピッキングリスト発行データリスト
	 */
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod Start
	public List<PLPickingListDto> select(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod End

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start
		if (isReportMaxTest()) {
			return testPLPickingMaxDtoList();
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

		List<SqlPLPickingListPrint> result = new ArrayList<SqlPLPickingListPrint>();

		// 外出しSQLの定義
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		String path = MProductBhv.PATH_selectSqlPLPickingListPrint;
		// [Ver3.0] unit of measure対応 2017.11.23 REN End

		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumIntegerDigits(3);
		formatter.setGroupingUsed(false);

		// 検索条件の設定
		SqlPLPickingListPrintPmb pmb = new SqlPLPickingListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());

		// 検索実行
		Class<SqlPLPickingListPrint> entityType = SqlPLPickingListPrint.class;
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		result = selectListToReport(mProductBhv, path, pmb, entityType);
		// [Ver3.0] unit of measure対応 2017.11.23 REN End
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return  null;
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
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		List<MProduct> pickingProductList = new ArrayList<>();
		for (SqlPLPickingListPrint pickingProduct : result) {
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
		for(SqlPLPickingListPrint pickingProduct : result){
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, pickingProduct.prepareDomain());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.23 REN End
		//名寄せ分子/名寄せ分母作成

		List<TPickingH> receiveTPickingHOneList =  new ArrayList<TPickingH>();
		TPickingH TPickingHOne = new TPickingH();
		for (TPickingH SqlListA : receiveTPickingHList) {
			for (TPickingH SqlListB : receiveTPickingHList) {

				if(!(CU.isNullOrEmpty(SqlListA.getDelivUnitNo()) ||CU.isNullOrEmpty(SqlListB.getDelivUnitNo()) ||CU.isNullOrEmpty(SqlListA.getPickingWorkNo())||CU.isNullOrEmpty(SqlListB.getPickingWorkNo()))){
					//listA.届先単位No. = listB.届先単位No.の場合
					if (SqlListA.getDelivUnitNo().equals(SqlListB.getDelivUnitNo()) ) {
						intDELIV_UNIT_NO=intDELIV_UNIT_NO+1;
						if (SqlListB.getPickingWorkNo().compareTo(SqlListA.getPickingWorkNo()) >= 0 ) {
							intPICKING_WORK_NO=intPICKING_WORK_NO+1;
						}
					}
				}
			}
			if(!(CU.isNullOrEmpty(SqlListA.getPickingWorkNo()))){
				TPickingHOne = new TPickingH();
				TPickingHOne.setStrFractionOne(formatter.format(intPICKING_WORK_NO)+'/'+formatter.format(intDELIV_UNIT_NO));
				TPickingHOne.setPickingWorkNo(SqlListA.getPickingWorkNo());
				receiveTPickingHOneList.add(TPickingHOne);
				intPICKING_WORK_NO=0;
				intDELIV_UNIT_NO=0;
			}
		}

		List<PLPickingListDto> dataList = new ArrayList<PLPickingListDto>();
		for (SqlPLPickingListPrint SqlListA : result) {
			PLPickingListDto dataListDto = new PLPickingListDto();
			dataListDto.setCultureId(getCultureId());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			//入数
			dataListDto.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, SqlListA.prepareDomain()));
			//内訳
			dataListDto.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, SqlListA.getPickingNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, SqlListA.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			dataListDto.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, SqlListA.prepareDomain()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.23 REN End
			dataListDto.setCarrierCd(SqlListA.getCarrierCd());
			dataListDto.setCarrierNm(SqlListA.getCarrierNm());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataListDto.setCenterCd(SqlListA.getCenterCd());
			dataListDto.setCenterNm(SqlListA.getCenterNm());
			dataListDto.setClientCd(SqlListA.getClientCd());
			dataListDto.setClientNm(SqlListA.getClientNm());
			dataListDto.setDelivDt(SqlListA.getDelivDt());
			dataListDto.setDeliveryCourseCd(SqlListA.getDeliveryCourseCd());
			dataListDto.setDeliveryCourseNm(SqlListA.getDeliveryCourseNm());
			dataListDto.setDelivUnitNo(SqlListA.getDelivUnitNo());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			dataListDto.setJancd(SqlListA.getJancd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
			dataListDto.setLimitDt(SqlListA.getLimitDt());
			dataListDto.setLocationCd(SqlListA.getLocationCd());
			dataListDto.setLot(SqlListA.getLot());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
			dataListDto.setPickingGroupNo(SqlListA.getPickingGroupNo());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
			dataListDto.setPickingNum(SqlListA.getPickingNum());
			// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
			if (1 < CU.nullToZero(SqlListA.getPickingWorkMessageCount().longValue())) {
				// 出庫作業メッセージ複数件あり
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
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja Start
			dataListDto.setShippingPackingNo(SqlListA.getShippingPackingNo());
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka Start
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja Start
			if (SqlListA.getShippingPackingNo().length() > 5) {
				dataListDto.setShippingPackingNoAbbr(SqlListA.getShippingPackingNo().substring(SqlListA.getShippingPackingNo().length() - 5));
			} else {
				dataListDto.setShippingPackingNoAbbr(SqlListA.getShippingPackingNo());
			}
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja End
			// LogicクラスとResourceクラスで2回Dto入替をしている部分を1回に収束 2016.02.16 yokosuka End
			dataListDto.setBoxCd(SqlListA.getBoxCd());
			dataListDto.setBoxNm(SqlListA.getBoxNm());
			dataListDto.setPackingCalCls(SqlListA.getPackingCalCls());
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja End
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataListDto.setProductCd(SqlListA.getProductCd());
			dataListDto.setProductNm(SqlListA.getProductNm());
			dataListDto.setShippingSlipNo(SqlListA.getShippingSlipNo());
			//伝票№件数
			// [ON推-品向-1139] "件"のハードコーディングを辞書マスタから取得するように修正 2016.04.21 kawana Start
			dataListDto.setShippingSlipNoNum(CU.nullToZero(SqlListA.getShippingSlipNo()).toString());
			// [ON推-品向-1139] "件"のハードコーディングを辞書マスタから取得するように修正 2016.04.21 kawana End
			dataListDto.setStoreLabelNo(SqlListA.getStoreLabelNo());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataListDto.setSupplyCustomerCd(SqlListA.getSupplyCustomerCd());
			dataListDto.setSupplyCustomerNm(SqlListA.getSupplyCustomerNm());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja Start
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja End
			dataListDto.setWarehouseCd(SqlListA.getWarehouseCd());
			dataListDto.setWarehouseNm(SqlListA.getWarehouseNm());
			dataListDto.setWmsShippingSlipNo(SqlListA.getWmsShippingSlipNo());
			dataListDto.setWorkDt(SqlListA.getWorkDt());
			dataListDto.setTempNo(SqlListA.getTempNo());
			dataListDto.setPrintFlg(SqlListA.getPlOutFlg());
			dataListDto.setCenterAbbr(SqlListA.getCenterAbbr());
			dataListDto.setClientAbbr(SqlListA.getClientAbbr());
			dataListDto.setWarehouseAbbr(SqlListA.getWarehouseAbbr());
			dataListDto.setLocationNm(SqlListA.getLocationNm());

			dataListDto.setSeedingNo(SqlListA.getSeedingNo());

			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
			dataListDto.setStoreDt(SqlListA.getStoreDt());
			dataListDto.setStoreNoFlg(storeNoFlg);
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

			// [1.1.4-CT-080] 摘み取りリストにバケットNoを表示 2016.06.14 kawana Start
			dataListDto.setCartNo(SqlListA.getCartNo());
			dataListDto.setBucketRowColNo(CU.join("", nullToStr(SqlListA.getBucketRowNo()), getBucketColStr(SqlListA.getBucketColNo())));
			// [1.1.4-CT-080] 摘み取りリストにバケットNoを表示 2016.06.14 kawana End

			dataList.add(dataListDto);
		}

		for (PLPickingListDto SqlListA : dataList) {
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
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQLの検索条件を設定する。
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

	// [1.1.4-CT-080] 摘み取りリストにバケットNoを表示 2016.06.14 kawana Start
	private String nullToStr(Long l) {
		if (l == null) {
			return "";
		}

		return String.valueOf(l);
	}

	private String getBucketColStr(Long backetColNo) {
		String colStr = "";
		switch ((int) CU.nullToZero(backetColNo).longValue()) {
		case 1:
			colStr = "A";
			break;
		case 2:
			colStr = "B";
			break;
		case 3:
			colStr = "C";
			break;
		case 4:
			colStr = "D";
			break;
		case 5:
			colStr = "E";
			break;
		case 6:
			colStr = "F";
			break;
		default:
			colStr = "";
			break;
		}
		return colStr;
	}
	// [1.1.4-CT-080] 摘み取りリストにバケットNoを表示 2016.06.14 kawana End

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start

	/**
	 *<h2>リスト最大桁テスト用</h2>
	 * <pre>
	 * 最大桁テストを行う場合に実行する。
	 * 本メソッドを使用する場合はB_PROPATYマスタの[reportMaxTestMode]を'test'に設定すること
	 * </pre>
	 * @param なし
	 * @return List<PLPickingListDto> 出力用リスト
	 */
	public List<PLPickingListDto> testPLPickingMaxDtoList() {

		PLPickingListDto redto = new PLPickingListDto();
		redto.setCultureId(1);
		redto.setStringUnitNum(WRMT.unitNum());
		redto.setBreakdown(WRMT.breakDown());
		redto.setMinimumPackingUnit(WRMT.minimumUnit());
		redto.setCarrierCd(WRMT.carrierCd());
		redto.setCarrierNm(WRMT.carrierAbbr());
		redto.setCenterCd(WRMT.centerCd());
		redto.setCenterNm(WRMT.centerAbbr());
		redto.setClientCd(WRMT.clientCd());
		redto.setClientNm(WRMT.clientAbbr());
		redto.setDelivDt(WRMT.date());
		redto.setDeliveryCourseCd(WRMT.deliveryCourseCd());
		redto.setDeliveryCourseNm(WRMT.deliveryCourseNm());
		redto.setDelivUnitNo(WRMT.delivUnitNo());
		redto.setJancd(WRMT.janCd());
		redto.setLimitDt(WRMT.date());
		redto.setLot(WRMT.lot());
		redto.setLocationCd(WRMT.locationCd());
		redto.setPickingGroupNo(WRMT.pickingGroupNo());
		redto.setPickingNum(WRMT.stockNum());
		redto.setPickingWorkMessage(WRMT.pickingWorkMessage());
		redto.setPickingWorkNo(WRMT.pickingWorkNo());
		if (redto.getPickingWorkNo().length() > 5) {
			redto.setPickingWorkNoAbbr(redto.getPickingWorkNo().substring(redto.getPickingWorkNo().length() - 5));
		} else {
			redto.setPickingWorkNoAbbr(redto.getPickingWorkNo());
		}
		redto.setShippingPackingNo(WRMT.shippingPackingNo());
		if (redto.getShippingPackingNo().length() > 5) {
			redto.setShippingPackingNoAbbr(redto.getShippingPackingNo().substring(redto.getShippingPackingNo().length() - 5));
		} else {
			redto.setShippingPackingNoAbbr(redto.getShippingPackingNo());
		}
		redto.setBoxCd(WRMT.boxCd());
		redto.setBoxNm(WRMT.boxNm());
		redto.setPackingCalCls("0");
		redto.setProductCd(WRMT.productCd());
		redto.setProductNm(WRMT.productAbbr());
		redto.setShippingSlipNo(999L);
		redto.setShippingSlipNoNum(WRMT.slipNum());
		redto.setStoreLabelNo(WRMT.storeLabelNo());
		redto.setSupplyCustomerCd(WRMT.customerCd());
		redto.setSupplyCustomerNm(WRMT.customerAbbr());
		redto.setWarehouseCd(WRMT.warehouseCd());
		redto.setWarehouseNm(WRMT.warehouseAbbr());
		redto.setWmsShippingSlipNo(WRMT.wmsShippingSlipNo());
		redto.setWorkDt(WRMT.date());
		redto.setTempNo(WRMT.tempNo());
		redto.setPrintFlg("1");
		redto.setCenterAbbr(WRMT.centerAbbr());
		redto.setClientAbbr(WRMT.clientAbbr());
		redto.setWarehouseAbbr(WRMT.warehouseAbbr());
		redto.setLocationNm(WRMT.locationNm());
		redto.setSeedingNo(WRMT.seedingNo());
		redto.setStoreDt(WRMT.date());
		redto.setStoreNoFlg("0");
		redto.setCartNo(999L);
		redto.setBucketRowColNo("9W");

		List<PLPickingListDto> dataList = new ArrayList<PLPickingListDto>();
		for (int i = 0; i < 1000; i++) {
			// 1000行作成 (総合計の10桁表示のため)
			dataList.add(redto);
		}

		return dataList;

	}

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

}
