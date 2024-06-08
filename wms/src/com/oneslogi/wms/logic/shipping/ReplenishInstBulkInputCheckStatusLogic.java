package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.BsWReplenishInstInputBhv;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TTrflexibilityCB;
import com.oneslogi.base.dbflute.cbean.WReplenishInstInputCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TTrflexibilityBhv;
import com.oneslogi.base.dbflute.exbhv.WReplenishInstInputBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlDuplicateReplenishInstDataListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTTrflexibilitybreakdownDataListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTTrflexibilitydetailDataListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTtrflexlbilacceptplanDataListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlWReplenishInstInputProductListPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TTrflexibility;
import com.oneslogi.base.dbflute.exentity.WReplenishInstInput;
import com.oneslogi.base.dbflute.exentity.customize.SqlDuplicateReplenishInstDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrflexibilitybreakdownDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrflexibilitydetailDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTtrflexlbilacceptplanDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlWReplenishInstInputDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlWReplenishInstInputProductList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 融通指示一括登録データチェックロジッククラス
 */
public class ReplenishInstBulkInputCheckStatusLogic extends AbstractWmsLogic {


	// ===== 定数定義 =====
	/**
	 * その他CD
	 */
	protected static final String OTHER_CD_0 = "0";
	/**
	 * ステータス
	 */
	protected static final Long STS_500 = 500L;
	
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 納品先マスタ存在異常
		 */
		protected static final int SUPPLIER_NOT_FOUND = 2;
		/**
		 * 預託マスタ存在異常
		 */
		protected static final int DEPOSIT_NOT_FOUND = 3;
		/**
		 * 処理区分マスタ存在異常
		 */
		protected static final int PROCESS_TYPE_NOT_FOUND = 4;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 5;
		/**
		 * 在庫区分マスタ存在異常
		 */
		protected static final int STOCKTYPE_NOT_FOUND_FOUND = 6;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND = 7;
		/**
		 * 出荷指示データ登録異常
		 */
		protected static final int SHIPPING_PLAN_INSERT_FAILED = 8;
		/**
		 * 配送コース異常
		 */
		protected static final int DELIVERY_COUSE_NOT_FOUND = 9;
		/**
		 * 重複レコードチェック異常
		 */
		protected static final int DUPLICATE_RECORD_CHECK_FAILED = 10;
		/**
		 * 出荷日と納品予定日チェック異常
		 */
		protected static final int SHIPPINGDT_DELIVPLANDT_CHECK_FAILED = 11;
		/**
		 * 出荷日と納品指定日チェック異常
		 */
		protected static final int SHIPPINGDT_DELIVDT_CHECK_FAILED = 12;
		/**
		 * 作業日と納品予定日チェック異常
		 */
		protected static final int WORKDT_DELIVPLANDT_CHECK_FAILED = 13;
		/**
		 * 作業日と出荷日チェック異常
		 */
		protected static final int WORKDT_SHIPPINGDT_CHECK_FAILED = 14;
		/**
		 * 顧客出荷指示No.存在チェックのエラー
		 */
		protected static final int CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR = 15;
		// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
		/**
		 * 納品先マスタ存在異常(届先CD)
		 */
		protected static final int DELIVERY_NOT_FOUND_DATA_FAILED = 16;
		/**
		 * 届先住所未入力(ワンタイム)
		 */
		protected static final int DELIVERY_ADDRESS_NO_INPUT = 17;
		// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana Start
		/**
		 * 倉庫マスタ存在異常(届先CD)
		 */
		protected static final int WAREHOUSE_NOT_FOUND = 18;
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana End
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの設定変更 2015.11.18 koyama Start
		/**
		 * 届先マスタ存在異常
		 */
		protected static final int DELIVERY_NOT_FOUND = 19;
	}

	@Inject
	private ReplenishInstBulkInputSelectLogic replenishInstBulkInputSelectLogic;
	@Inject
	private MessageLogic messageLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;

	@Inject
	private WReplenishInstInputBhv wReplenishInstInputBhv;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private TTrflexibilityBhv trflexibilityBhv;
	// ===== 使用共通関数 =====

	// ===== enum =====

	/**
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param outputLog ログの書込み有無
	 * @param updateList 
	 */
	public void checkError(String receiveCd, MCenter mCenter, MClient mClient, List<WReplenishInstInput> updateList, ErrorStatus errorStatus) {

		// チェックデータ取得
		List<SqlWReplenishInstInputDataList> list = replenishInstBulkInputSelectLogic.selectCheckDataList(receiveCd, mCenter, mClient, errorStatus);

		// 荷主拠点マスタを単一検索、システム管理日付を取得する。
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mCenter.getCenterId());
		mClientCenter.setCenterId(mClient.getClientId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
		
		if (mClientCenter == null) {
			getErrorManager().add(errorStatus, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
			return;
		}
		
		checkError(receiveCd, list, mCenter, mClient, mClientCenter, updateList);
		
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param updateList 
	 * @param eShippingInstList 取込出荷予定データリスト
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param doUpdate エラー時DB更新有無
	 * @param outputLog ログの書込み有無
	 * @return エラー件数
	 */
	private int checkError(String receiveCd, List<SqlWReplenishInstInputDataList> list, MCenter mCenter, MClient mClient, MClientCenter mClientCenter, List<WReplenishInstInput> updateList) {

		// エラー件数
		int errorCount = 0;

		for (SqlWReplenishInstInputDataList data : list) {

			// ===== 指示No チェック =====

			String flexlnsNo = data.getFlexlnsNo();
			if (CU.isNullOrEmpty(flexlnsNo)) {
				// 必須
				updateErrorExecute(data, WmsMessageConst.PLAN_NO_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			
			if (!checkExcelCellInput("^[0-9]*$", flexlnsNo)) {
				// 文字エラー
				updateErrorExecute(data, WmsMessageConst.PLAN_NO_CHECK_NUMERIC_ONLY_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[0-9]{1,10}$", flexlnsNo)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.FLEXLNS_NO_CHECK_INPUT_INTEGER_ERROR, "10");
				errorCount++;
				continue;
			}

			// ===== 発送予定日 チェック =====

			String schDate = CU.isNullOrEmpty(data.getSchDate()) ? "" : data.getSchDate().replaceAll("/", "");
			if (CU.isNullOrEmpty(schDate)) {
				// 必須
				updateErrorExecute(data, WmsMessageConst.SHIPPING_PLAN_DATE_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!WCU.checkDateStr(schDate)) {
				// 日付型エラー
				updateErrorExecute(data, WmsMessageConst.SHIPPING_PLAN_DATE_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,8}$", schDate)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.SCH_DATE_CHECK_INPUT_MAX_ERROR, "8");
				errorCount++;
				continue;
			}
			// 発送予定日 < システム管理日付
			if (schDate.compareTo(mClientCenter.getSystemDt()) < 0) {
				updateErrorExecute(data, WmsMessageConst.PREVIOUS_SHIPPING_PLAN_DATE_INPUT_ERROR);
				errorCount++;
				continue;
			}

			// ===== 発送元CD チェック =====

			String supplierCd = data.getSupplierCd();
			if (CU.isNullOrEmpty(supplierCd)) {
				// 必須
				updateErrorExecute(data, WmsMessageConst.SHIPPING_FROM_COMPANY_CD_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,4}$", supplierCd)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.SHIPPING_FROM_COMPANY_CD_CHECK_INPUT_MAX_ERROR, "4");
				errorCount++;
				continue;
			}

			// ===== 発送先CD チェック =====

			String shipCd = data.getShipCd();
			if (CU.isNullOrEmpty(shipCd)) {
				// 必須
				updateErrorExecute(data, WmsMessageConst.SHIPPING_TO_COMPANY_CD_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,4}$", shipCd)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.SHIP_CD_CHECK_INPUT_MAX_ERROR, "4");
				errorCount++;
				continue;
			}

			// 発送元CD == 発送先CD
			if (supplierCd.equals(shipCd)) {
				updateErrorExecute(data, WmsMessageConst.SHIPPING_TO_COMPANY_CD_CANNOT_INPUT_SAME_SHIPPING_FROM_COMPANY_CD_ERROR);
				errorCount++;
				continue;
			}

			// ===== 受入予定日 チェック =====

			String rcvDate = CU.isNullOrEmpty(data.getRcvDate()) ? "" : data.getRcvDate().replaceAll("/", "");
			if (CU.isNullOrEmpty(rcvDate)) {
				updateErrorExecute(data, WmsMessageConst.RECEIVE_PLAN_DATE_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!WCU.checkDateStr(rcvDate)) {
				updateErrorExecute(data, WmsMessageConst.RECEIVE_PLAN_DATE_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,8}$", rcvDate)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.RCV_DATE_CHECK_INPUT_MAX_ERROR, "8");
				errorCount++;
				continue;
			}
			// 受入予定日 < システム管理日付
			if (rcvDate.compareTo(mClientCenter.getSystemDt()) < 0) {
				updateErrorExecute(data, WmsMessageConst.PREVIOUS_RECEIVE_PLAN_DATE_INPUT_ERROR);
				errorCount++;
				continue;
			}
			// 受入予定日 < 発送予定日
			if (rcvDate.compareTo(schDate) < 0) {
				updateErrorExecute(data, WmsMessageConst.RECEIVE_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIPPING_PLAN_DATE_ERROR);
				errorCount++;
				continue;
			}

			// ===== 銘柄CD チェック =====

			String itemCd = data.getItemCd();
			if (CU.isNullOrEmpty(itemCd)) {
				// 必須
				updateErrorExecute(data, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,6}$", itemCd)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_LENGTH_ERROR, "6");
				errorCount++;
				continue;
			}

			// ===== 製造年月日 チェック =====

			String manufactureDate = CU.isNullOrEmpty(data.getManufactureDate()) ? "" : data.getManufactureDate().replaceAll("/", "");
			if (CU.isNullOrEmpty(manufactureDate)) {
				// 必須
				updateErrorExecute(data, WmsMessageConst.PRODUCTION_DATE_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!WCU.checkDateStr(manufactureDate)) {
				// 日付不正エラー
				updateErrorExecute(data, WmsMessageConst.PRODUCTION_DATE_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,8}$", manufactureDate)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.MANUFACTURE_DATE_CHECK_INPUT_MAX_ERROR, "8");
				errorCount++;
				continue;
			}
			// 製造年月日 > システム管理日付
			if (manufactureDate.compareTo(mClientCenter.getSystemDt()) > 0) {
				updateErrorExecute(data, WmsMessageConst.FUTURE_MADE_DATE_INPUT_ERROR);
				errorCount++;
				continue;
			}

			// ===== デザイン区分 チェック =====

			String designCd = data.getDesignCd();
			if (CU.isNullOrEmpty(designCd)) {
				updateErrorExecute(data, WmsMessageConst.TYPE_DESIGN_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(".{1,2}$", designCd)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.DESIGN_TYPE_CHECK_INPUT_MAX_ERROR, "2");
				errorCount++;
				continue;
			}

			// ===== 数量（個数） チェック =====

			String qty = data.getQty();
			if (CU.isNullOrEmpty(qty)) {
				updateErrorExecute(data, WmsMessageConst.QTY_NOT_INPUT_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[0-9]*$", qty)) {
				updateErrorExecute(data, WmsMessageConst.QTY_CHECK_NUMERIC_ONLY_ERROR);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[0-9]{1,13}$", qty)) {
				// 長さエラー
				updateErrorExecute(data, WmsMessageConst.QTY_CHECK_INPUT_INTEGER_ERROR, "13");
				errorCount++;
				continue;
			}
			
			// ===== 画面更新者 チェック =====
			String flexUpdUserCd = data.getFlexUpdUserCd();
			
			if (!CU.isNullOrEmpty(flexUpdUserCd)) {
				if (!checkExcelCellInput(".{0,30}$", flexUpdUserCd)) {
					// 長さエラー
					updateErrorExecute(data, WmsMessageConst.FLEXIBITY_UPD_USER_CHECK_INPUT_MAX_ERROR, "30");
					errorCount++;
					continue;
				}
			}
			
			// 国産、輸入製品で指定できないデザイン区分が入力されています
			if ((CU.isNullOrEmpty(data.getOthercd1()) || OTHER_CD_0.equals(data.getOthercd1())) &&
					(CU.isNullOrEmpty(data.getOthercd2()) || OTHER_CD_0.equals(data.getOthercd2()))) {
				updateErrorExecute(data, WmsMessageConst.DOMESTIC_PRODUCT_AND_IMPORTED_PRODUCT_REARRANGEMENT_TYPE_DESIGN_ERROR);
				errorCount++;
				continue;
			}
			
			// 発送元CDが拠点マスタに存在しません
			MCenterCB centerCB = mCenterBhv.newConditionBean();
			centerCB.query().setCenterCd_Equal(supplierCd);
			centerCB.query().setDelFlg_Equal_$0();
			int centerCount = mCenterBhv.selectCount(centerCB);
			if (centerCount == 0) {
				updateErrorExecute(data, WmsMessageConst.SHIPPING_FROM_COMPANY_CD_NOT_FOUND_IN_CENTER_MASTER_ERROR);
				errorCount++;
				continue;
			}
			
			// 発送先CDが拠点マスタに存在しません
			centerCB = mCenterBhv.newConditionBean();
			centerCB.query().setCenterCd_Equal(shipCd);
			centerCB.query().setDelFlg_Equal_$0();
			centerCount = mCenterBhv.selectCount(centerCB);
			if (centerCount == 0) {
				updateErrorExecute(data, WmsMessageConst.SHIPPING_TO_COMPANY_CD_NOT_FOUND_IN_CENTER_MASTER_ERROR);
				errorCount++;
				continue;
			}
			
			// 銘柄CDが銘柄マスタに存在しません
			MProductCB productCB = mProductBhv.newConditionBean();
			productCB.query().setClientId_Equal(mClient.getClientId());
			productCB.query().setProductCd_Equal(itemCd);
			productCB.query().setDelFlg_Equal_$0();
			List<MProduct> productList = mProductBhv.selectList(productCB);
			if (productList.size() == 0) {
				updateErrorExecute(data, WmsMessageConst.PRODUCT_CD_NOT_FOUND_IN_PRODUCT_MASTER_ERROR);
				errorCount++;
				continue;
			}
			
			// 数量(個数)はケース、カートン換算値ではありません
			BigDecimal qtyNum = new BigDecimal(data.getQty());
			BigDecimal unit2 = productList.get(0).getUnit2();
			if (qtyNum.compareTo(WCC.ZERO) != 0 && unit2.compareTo(WCC.ZERO) != 0 && qtyNum.remainder(unit2).compareTo(WCC.ZERO)!=0) {
				updateErrorExecute(data, WmsMessageConst.QTY_FRACTION_CASE_UNIT_AND_CARTON_UNIT_QTY_ERROR);
				errorCount++;
				continue;
			}
			
			// 指示No.内に異なる発送予定日が混在しています
			WReplenishInstInputCB wReplenishInstInputCB = wReplenishInstInputBhv.newConditionBean();
			wReplenishInstInputCB.query().setReceiveCd_Equal(receiveCd);
			wReplenishInstInputCB.query().setCenterCd_Equal(mCenter.getCenterCd());
			wReplenishInstInputCB.query().setClientCd_Equal(mClient.getClientCd());
			wReplenishInstInputCB.query().setFlexlnsNo_Equal(flexlnsNo);
			wReplenishInstInputCB.query().setSchDate_NotEqual(schDate);
			wReplenishInstInputCB.query().setDelFlg_Equal_$0();
			int wReplenishInstInputCount = wReplenishInstInputBhv.selectCount(wReplenishInstInputCB);
			if (wReplenishInstInputCount > 0) {
				updateErrorExecute(data, WmsMessageConst.MIXED_SHIPPING_PLAN_DATE_IN_PLAN_NO_ERROR);
				errorCount++;
				continue;
			}
			
			// 指示No.内に異なる発送元CDが混在しています
			wReplenishInstInputCB = wReplenishInstInputBhv.newConditionBean();
			wReplenishInstInputCB.query().setReceiveCd_Equal(receiveCd);
			wReplenishInstInputCB.query().setCenterCd_Equal(mCenter.getCenterCd());
			wReplenishInstInputCB.query().setClientCd_Equal(mClient.getClientCd());
			wReplenishInstInputCB.query().setFlexlnsNo_Equal(flexlnsNo);
			wReplenishInstInputCB.query().setSupplierCd_NotEqual(supplierCd);
			wReplenishInstInputCB.query().setDelFlg_Equal_$0();
			wReplenishInstInputCount = wReplenishInstInputBhv.selectCount(wReplenishInstInputCB);
			if (wReplenishInstInputCount > 0) {
				updateErrorExecute(data, WmsMessageConst.MIXED_SHIPPING_FROM_COMPANY_CD_IN_PLAN_NO_ERROR);
				errorCount++;
				continue;
			}
			
			// 指示No.内に異なる受入予定日が混在しています
			wReplenishInstInputCB = wReplenishInstInputBhv.newConditionBean();
			wReplenishInstInputCB.query().setReceiveCd_Equal(receiveCd);
			wReplenishInstInputCB.query().setCenterCd_Equal(mCenter.getCenterCd());
			wReplenishInstInputCB.query().setClientCd_Equal(mClient.getClientCd());
			wReplenishInstInputCB.query().setFlexlnsNo_Equal(flexlnsNo);
			wReplenishInstInputCB.query().setRcvDate_NotEqual(rcvDate);
			wReplenishInstInputCB.query().setDelFlg_Equal_$0();
			wReplenishInstInputCount = wReplenishInstInputBhv.selectCount(wReplenishInstInputCB);
			if (wReplenishInstInputCount > 0) {
				updateErrorExecute(data, WmsMessageConst.MIXED_RECEIVE_PLAN_DATE_IN_PLAN_NO_ERROR);
				errorCount++;
				continue;
			}
			
			// 指示No.内に異なる発送先CDが混在しています
			wReplenishInstInputCB = wReplenishInstInputBhv.newConditionBean();
			wReplenishInstInputCB.query().setReceiveCd_Equal(receiveCd);
			wReplenishInstInputCB.query().setCenterCd_Equal(mCenter.getCenterCd());
			wReplenishInstInputCB.query().setClientCd_Equal(mClient.getClientCd());
			wReplenishInstInputCB.query().setFlexlnsNo_Equal(flexlnsNo);
			wReplenishInstInputCB.query().setShipCd_NotEqual(shipCd);
			wReplenishInstInputCB.query().setDelFlg_Equal_$0();
			wReplenishInstInputCount = wReplenishInstInputBhv.selectCount(wReplenishInstInputCB);
			if (wReplenishInstInputCount > 0) {
				updateErrorExecute(data, WmsMessageConst.MIXED_SHIPPING_TO_COMPANY_CD_IN_PLAN_NO_ERROR);
				errorCount++;
				continue;
			}
			
			// 指示No.内の銘柄に国産、輸入製品が混在しています
			String path = BsWReplenishInstInputBhv.PATH_selectSqlWReplenishInstInputProductList;
			
			// 引数設定
			SqlWReplenishInstInputProductListPmb pmb = new SqlWReplenishInstInputProductListPmb();

			pmb.setClientId(mClient.getClientId());
			pmb.setCenterCd(mCenter.getCenterCd());
			pmb.setClientCd(mClient.getClientCd());
			pmb.setReceiveCd(receiveCd);
			pmb.setFlexlnsNo(flexlnsNo);
			pmb.setUserNum1(CU.nullToZero(productList.get(0).getUsernum1()));

			// 検索実行
			Class<SqlWReplenishInstInputProductList> entityType = SqlWReplenishInstInputProductList.class;

			SqlWReplenishInstInputProductList sqlWReplenishInstInputProductList = wReplenishInstInputBhv.outsideSql().entityHandling().selectEntity(path,pmb,entityType);
			if (sqlWReplenishInstInputProductList.getCountNum() > 0) {
				updateErrorExecute(data, WmsMessageConst.MIXED_DOMESTIC_PRODUCT_AND_IMPORTED_PRODUCT_IN_PLAN_NO_ERROR);
				errorCount++;
				continue;
			}
			
			// 指示No.内に同一の銘柄コード、製造年月日、デザイン区分が存在します。集約してください
			wReplenishInstInputCB = wReplenishInstInputBhv.newConditionBean();
			wReplenishInstInputCB.query().setReceiveCd_Equal(receiveCd);
			wReplenishInstInputCB.query().setCenterCd_Equal(mCenter.getCenterCd());
			wReplenishInstInputCB.query().setClientCd_Equal(mClient.getClientCd());
			wReplenishInstInputCB.query().setFlexlnsNo_Equal(flexlnsNo);
			wReplenishInstInputCB.query().setItemCd_Equal(itemCd);
			wReplenishInstInputCB.query().setManufactureDate_Equal(manufactureDate);
			wReplenishInstInputCB.query().setDesignCd_Equal(designCd);
			wReplenishInstInputCB.query().setDelFlg_Equal_$0();
			wReplenishInstInputCount = wReplenishInstInputBhv.selectCount(wReplenishInstInputCB);
			if (wReplenishInstInputCount > 1) {
				updateErrorExecute(data, WmsMessageConst.PLAN_NO_CANNOT_INPUT_SAME_CONDITION_ERROR);
				errorCount++;
				continue;
			}
			
			// 重複する融通指示データが存在します
			String pathDuplicateReplenishInst = BsWReplenishInstInputBhv.PATH_selectSqlDuplicateReplenishInstDataList;
			
			// 引数設定
			SqlDuplicateReplenishInstDataListPmb pmbDuplicateReplenishInst = new SqlDuplicateReplenishInstDataListPmb();

			pmbDuplicateReplenishInst.setCenterCd(mCenter.getCenterCd());
			pmbDuplicateReplenishInst.setClientCd(mClient.getClientCd());
			pmbDuplicateReplenishInst.setReceiveCd(receiveCd);
			pmbDuplicateReplenishInst.setFlexlnsNo(flexlnsNo);

			// 検索実行
			Class<SqlDuplicateReplenishInstDataList> entityTypeDuplicateReplenishInst = SqlDuplicateReplenishInstDataList.class;

			List<SqlDuplicateReplenishInstDataList> sqlDuplicateReplenishInstDataList = wReplenishInstInputBhv.outsideSql().selectList(pathDuplicateReplenishInst, pmbDuplicateReplenishInst, entityTypeDuplicateReplenishInst);
			if (sqlDuplicateReplenishInstDataList != null && sqlDuplicateReplenishInstDataList.size() > 0) {
				updateErrorExecute(data, WmsMessageConst.REPLENISH_PLAN_DUPLICATE_ERRO);
				errorCount++;
				continue;
			}
			
			// 輸送番号照合を行う
			// 変数の初期化を行う
			// 融通輸送受払計画情報読込み件数
			int tTrflexibilacceptplanCount = 0;
			// 融通輸送情報読込み件数
			int tTrflexibilityCount = 0;
			// 融通内訳情報読込み件数
			int tTrflexibilitybreakdownCount = 0;
			// 融通輸送受払計画情報整理番号
			String tTrflexibilacceptplanRefNo = null;
			// 融通輸送情報融通No.
			BigDecimal tTrflexibilityFlexibityNo = new BigDecimal(-1);
			// 融通輸送情報輸送番号
			String tTrflexibilityTransPortCd = null;
			// 融通内訳情報整理番号
			String tTrflexibilitybreakdownRefNo = null;
			// ワーク融通No.
			BigDecimal flexibityNo = new BigDecimal(-1);
			// ワーク輸送番号
			String transPortCd = null;
			
			// 融通指示一括取込ワークを基に融通輸送受払計画情報を検索する。
			String pathTtrflexlbilacceptplan = BsWReplenishInstInputBhv.PATH_selectSqlTtrflexlbilacceptplanDataList;
			
			// 引数設定
			SqlTtrflexlbilacceptplanDataListPmb pmbTtrflexlbilacceptplan = new SqlTtrflexlbilacceptplanDataListPmb();

			pmbTtrflexlbilacceptplan.setCenterCd(mCenter.getCenterCd());
			pmbTtrflexlbilacceptplan.setClientCd(mClient.getClientCd());
			pmbTtrflexlbilacceptplan.setReceiveCd(receiveCd);
			pmbTtrflexlbilacceptplan.setFlexlnsNo(flexlnsNo);

			// 検索実行
			Class<SqlTtrflexlbilacceptplanDataList> entityTypeTtrflexlbilacceptplan = SqlTtrflexlbilacceptplanDataList.class;

			List<SqlTtrflexlbilacceptplanDataList> ttrflexlbilacceptplanDataList = wReplenishInstInputBhv.outsideSql().selectList(pathTtrflexlbilacceptplan,pmbTtrflexlbilacceptplan,entityTypeTtrflexlbilacceptplan);
			
			for (SqlTtrflexlbilacceptplanDataList sqlTtrflexlbilacceptplanDataList : ttrflexlbilacceptplanDataList) {
				// 融通輸送受払計画情報読込み件数
				tTrflexibilacceptplanCount += 1;
				// 融通輸送受払計画情報整理番号
				tTrflexibilacceptplanRefNo = sqlTtrflexlbilacceptplanDataList.getRefno();
			}
			
			// 融通指示一括取込ワークを基に融通輸送情報、融通輸送明細情報を検索する
			String pathTTrflexibilitydetail = BsWReplenishInstInputBhv.PATH_selectSqlTTrflexibilitydetailDataList;
			// 引数設定
			SqlTTrflexibilitydetailDataListPmb pmbTTrflexibilitydetail = new SqlTTrflexibilitydetailDataListPmb();

			pmbTTrflexibilitydetail.setCenterCd(mCenter.getCenterCd());
			pmbTTrflexibilitydetail.setClientCd(mClient.getClientCd());
			pmbTTrflexibilitydetail.setReceiveCd(receiveCd);
			pmbTTrflexibilitydetail.setFlexlnsNo(flexlnsNo);
			pmbTTrflexibilitydetail.setClientId(mClient.getClientId());

			// 検索実行
			Class<SqlTTrflexibilitydetailDataList> entityTypeTTrflexibilitydetail = SqlTTrflexibilitydetailDataList.class;

			List<SqlTTrflexibilitydetailDataList> trflexibilitydetailDataListList = wReplenishInstInputBhv.outsideSql().selectList(pathTTrflexibilitydetail,pmbTTrflexibilitydetail,entityTypeTTrflexibilitydetail);
			
			for (SqlTTrflexibilitydetailDataList sqlTTrflexibilitydetailDataList : trflexibilitydetailDataListList) {
				// 融通輸送情報読込み件数
				tTrflexibilityCount += 1;
				// 融通輸送情報融通No.
				tTrflexibilityFlexibityNo = sqlTTrflexibilitydetailDataList.getFlexibityno();
				// 融通輸送情報輸送番号
				tTrflexibilityTransPortCd = sqlTTrflexibilitydetailDataList.getTransportcd();
			}
			
			// 融通指示一括取込ワークを基に融通内訳情報を検索する
			String pathTTrflexibilitybreakdown = BsWReplenishInstInputBhv.PATH_selectSqlTTrflexibilitybreakdownDataList;
			// 引数設定
			SqlTTrflexibilitybreakdownDataListPmb pmbTTrflexibilitybreakdown = new SqlTTrflexibilitybreakdownDataListPmb();

			pmbTTrflexibilitybreakdown.setCenterCd(mCenter.getCenterCd());
			pmbTTrflexibilitybreakdown.setClientCd(mClient.getClientCd());
			pmbTTrflexibilitybreakdown.setReceiveCd(receiveCd);
			pmbTTrflexibilitybreakdown.setFlexlnsNo(flexlnsNo);
			pmbTTrflexibilitybreakdown.setClientId(mClient.getClientId());

			// 検索実行
			Class<SqlTTrflexibilitybreakdownDataList> entityTypeTTrflexibilitybreakdown = SqlTTrflexibilitybreakdownDataList.class;

			List<SqlTTrflexibilitybreakdownDataList> trflexibilitybreakdownDataList = wReplenishInstInputBhv.outsideSql().selectList(pathTTrflexibilitybreakdown,pmbTTrflexibilitybreakdown,entityTypeTTrflexibilitybreakdown);
		
			for (SqlTTrflexibilitybreakdownDataList sqlTTrflexibilitybreakdownDataList : trflexibilitybreakdownDataList) {
				// 融通内訳情報読込み件数
				tTrflexibilitybreakdownCount += 1;
				// 融通内訳情報整理番号
				tTrflexibilitybreakdownRefNo = sqlTTrflexibilitybreakdownDataList.getRefno();
			}
			
			// 変数.融通輸送情報読込み件数 == 1 の場合
			if (tTrflexibilityCount == 1) {
				// 変数.融通輸送受払計画情報読込み件数 == 1 の場合
				if (tTrflexibilacceptplanCount == 1) {
					// ワーク融通No.
					flexibityNo = tTrflexibilityFlexibityNo;
					// ワーク輸送番号
					transPortCd = tTrflexibilacceptplanRefNo;
				}
				
				// 変数.融通輸送受払計画情報読込み件数 == 0 かつ 変数.融通内訳情報読込み件数 == 1 の場合
				if (tTrflexibilacceptplanCount == 0 && tTrflexibilitybreakdownCount == 1) {
					// ワーク融通No.
					flexibityNo = tTrflexibilityFlexibityNo;
					// ワーク輸送番号
					transPortCd = tTrflexibilitybreakdownRefNo;
				}
				
				// 変数.融通輸送受払計画情報読込み件数 == 0 かつ 変数.融通内訳情報読込み件数 == 0 の場合
				if (tTrflexibilacceptplanCount == 0 && tTrflexibilitybreakdownCount == 0) {
					// ワーク融通No.
					flexibityNo = tTrflexibilityFlexibityNo;
					// ワーク輸送番号
					transPortCd = tTrflexibilityTransPortCd;
				}
				
				// 変数.ワーク融通No.で融通輸送情報を検索する。
				TTrflexibilityCB tTrflexibilityCB = trflexibilityBhv.newConditionBean();
				tTrflexibilityCB.query().setFlexibityno_Equal(flexibityNo);
				tTrflexibilityCB.query().setDelFlg_Equal_$0();
				
				List<TTrflexibility> trflexibilitieList = trflexibilityBhv.selectList(tTrflexibilityCB);
				
				if (trflexibilitieList.size() > 0) {
					TTrflexibility tTrflexibility = trflexibilitieList.get(0);
					if (tTrflexibility.getSts().compareTo(STS_500) > 0) {
						updateErrorExecute(data, WmsMessageConst.CANNOT_CHANGE_ALREADY_SEND_DATA_ERROR);
						errorCount++;
						continue;
					}
				}
				
				// 融通指示一括登録用DTO.受信CD で 融通指示一括取込ワーク を検索する。
				wReplenishInstInputCB = wReplenishInstInputBhv.newConditionBean();
				wReplenishInstInputCB.query().setReceiveCd_Equal(receiveCd);
				wReplenishInstInputCB.query().setCenterCd_Equal(mCenter.getCenterCd());
				wReplenishInstInputCB.query().setClientCd_Equal(mClient.getClientCd());
				wReplenishInstInputCB.query().setFlexlnsNo_Equal(flexlnsNo);
				wReplenishInstInputCB.query().setDelFlg_Equal_$0();
				wReplenishInstInputCB.query().addOrderBy_LineNo_Asc();
				List<WReplenishInstInput> wReplenishInstInputList = wReplenishInstInputBhv.selectList(wReplenishInstInputCB);
			
				for (WReplenishInstInput wReplenishInstInput : wReplenishInstInputList) {
					WReplenishInstInput updateEntity = new WReplenishInstInput();
					// 融通指示一括取込ワークID
					updateEntity.setReplenishInstInputId(wReplenishInstInput.getReplenishInstInputId());
					// 融通No.
					updateEntity.setFlexibityno(flexibityNo.longValue());
					// 輸送番号
					updateEntity.setTransportcd(transPortCd);
					// バージョンNo.
					updateEntity.setVersionNo(wReplenishInstInput.getVersionNo());
					
					updateList.add(updateEntity);
				}
				
			}else {
				if (tTrflexibilacceptplanCount > 1 || tTrflexibilitybreakdownCount > 1 || tTrflexibilityCount > 1) {
					updateErrorExecute(data, WmsMessageConst.MULTIPLE_DATA_IDENTICAL_TO_FLEXIBILITY_REGIST_ERROR);
					errorCount++;
					continue;
				}
			}
		}
		
		updateList = updateList.stream().distinct().collect(Collectors.toList());

		wReplenishInstInputBhv.batchUpdate(updateList);

		return errorCount;
	}


	/**
	 * <h2>融通指示一括取込ワーク を更新するのエラー設定.</h2>
	 */
	private void updateErrorExecute(SqlWReplenishInstInputDataList data, String errorMessageCd, String... replaceValue) {
		WReplenishInstInput wReplenishInstInput = new WReplenishInstInput();
		wReplenishInstInput.setReplenishInstInputId(data.getReplenishInstInputId());
		wReplenishInstInput.setErrorFlg(CDef.ErrorFlg.$1.code());
		wReplenishInstInput.setErrorMsg(messageLogic.getMessageNm(errorMessageCd, replaceValue));
		wReplenishInstInput.setVersionNo(data.getVersionNo());
		wReplenishInstInputBhv.update(wReplenishInstInput);
	}

	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean
	 * */
	public boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	/**
	 * <h2>日付を「yyyyMMdd」形式へ変換する。</h2>
	 * <pre>
	 * 次の形式の日付文字列に対応
	 * yyyy/MM/dd
	 * yy/MM/dd
	 * yyyy-MM-dd
	 * yy-MM-dd
	 * yyyyMMdd
	 * yyyy/M/d
	 * yy/M/d
	 * yyyy-M-d
	 * yy-M-d
	 * </pre>
	 * @param dateString 日付文字列
	 * @return yyyyMMddに変換した文字列
	 */
	public String dateRegExp(String pattern) {
		String temp = "";
		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.substring(i, i + 1).equals("/")) {
				temp += "\\/";
			} else if (pattern.substring(i, i + 1).equals(".")) {
				temp += "\\.";
			} else {
				temp += pattern.substring(i, i + 1);
			}
		}
		pattern = temp;
		pattern = pattern.replace("yyyy", "(19[0-9]{2}|[2-9]{1}[0-9]{1}[0-9]{2})"); //1900-9999
		pattern = pattern.replace("yy", "([0-9]{2})"); //00-99
		pattern = pattern.replace("MM", "(0[1-9]|1[0-2])");
		pattern = pattern.replace("M", "([1-9]|1[0-2])");
		pattern = pattern.replace("dd", "(3[01]|[12][0-9]|0[1-9])");
		pattern = pattern.replace("d", "(3[01]|[12][0-9]|[1-9])");
		pattern = "^" + pattern + "$";
		return pattern;
	}


	// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

}