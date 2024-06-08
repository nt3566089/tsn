package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlEReceivePlanListPmb;
import com.oneslogi.base.dbflute.cbean.EReceivePlanCB;
import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanSpareDto;
import com.oneslogi.base.dbflute.dto.customize.SqlEReceivePlanListDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanSpareDtoMapper;
import com.oneslogi.base.dbflute.exbhv.EReceivePlanBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exentity.EReceivePlan;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanSpare;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 入荷予定一括取込データ取得ロジッククラス
 */
public class ReceivePlanBulkInputSelectLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.20 honma start
	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 入荷予定データ登録異常
		 */
		protected static final int RECEIVE_PLAN_INSERT_FAILED = 5;

		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 11;

		// コントロールNoでデータベースから取得方法に変更 2016.04.20 nayzaw Start
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 12;

		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 13;
		// コントロールNoでデータベースから取得方法に変更 2016.04.20 nayzaw End

	}

	// ===== 使用テーブル =====

	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private EReceivePlanBhv eReceivePlanBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw Start
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	@Inject
	private ReceivePlanErrorCheckLogic checkLogic;
	// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw End
	@Inject
	private ReceivePlanInsertLogic insertLogic;
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
	// [Ver3.0] unit of measure対応 2017.11.24 潘 Start
	// ===== 使用共通関数 =====
	@Inject
	private HandyCommonUtil util;
	// [Ver3.0] unit of measure対応 2017.11.24 潘 End

	// ===== enum =====

	/** エラーデータ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** エラーデータのみ検索 */
		ERROR_ONLY,
		/** エラー無データのみ検索 */
		NO_ERROR_ONLY
	}

	/** エラー時DB更新有無 */
	private enum DbUpdateForError {
		/** 更新有 */
		TRUE,
		/** 更新無 */
		FALSE
	}

	/** ログ書込 */
	private enum OutputLog {
		/** ログ書込有 */
		TRUE,
		/** ログ書込無 */
		FALSE,
	}

	// ===== 内部変数 =====

	/** ログの書込み有無 */
	private OutputLog outputLog = OutputLog.FALSE;

	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 */
	// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod Start
	public void startLog(String receiveCd, String centerCd, String clientCd) {
	// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod End

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.RECEIVE_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// 属性１設定(センタCD)
		getDatabaseLogger().setAttribute1(centerCd);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// [#169] メッセージの重複を削除 2016.12.05 kawana Start
		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_PARAMETER_INFORMATION, receiveCd, centerCd, clientCd);
		// [#169] メッセージの重複を削除 2016.12.05 kawana End
	}

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	/**
	 * <h2>ログ追加（エラー情報）</h2>
	 * <pre>
	 * 運用ログのエラーチェック情報出力処理
	 * エラーチェック情報を運用ログに出力する
	 * </pre>
	 * @param processInfo 処理情報
	 * @param replaceValue 差し替え文字列
	 */
	public void addErrorCheckLogDtl(String processInfo, String... replaceValue) {

		if (outputLog == OutputLog.TRUE) {
			// メッセージ差替文字列の取得
			// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
			// ログ追加（エラー情報）
			getDatabaseLogger().addErrorLogDtl(processInfo, replaceValue[0], replaceValue[1]);
		}
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	/**
	 * <h2>ログ終了(正常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endSuccessLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（正常終了)
			getDatabaseLogger().endSuccessLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>ログ終了(異常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endFailureLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（異常終了)
			getDatabaseLogger().endFailureLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>一括登録.</h2>
	 * @param eReceivePlanList 一括登録
	 */
	public void batchInsertEReceivePlan(List<EReceivePlan> eReceivePlanList) {
		eReceivePlanBhv.batchInsert(eReceivePlanList);
	}

	/**
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param receiveCd 受信CD
	 */
	public void checkError(String receiveCd, String centerCd, String clientCd) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<EReceivePlan> eReceivePlanList = selectEReceivePlanList(receiveCd);
		// 必須、文字数などのチェック
		int errCount = checkError(eReceivePlanList, centerCd, clientCd, DbUpdateForError.TRUE);
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(receiveCd, centerCd, clientCd);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
			// チェック後のデータ取得
			List<EReceivePlan> checkedEReceivePlanList = selectEReceivePlanList(receiveCd);
			int count = checkedEReceivePlanList.size();
			int headerCount = getEReceivePlanHeader(checkedEReceivePlanList, SelectCls.ALL);
			int errHeaderCount = getEReceivePlanHeader(checkedEReceivePlanList, SelectCls.ERROR_ONLY);
			int normalHeaderCount = headerCount - errHeaderCount;
			int errCountAll = errCount + errCountMaster;
			int normalBodyCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_RECEIVE_PLAN_INFORMATION
					, String.valueOf(errHeaderCount), String.valueOf(errCountAll), String.valueOf(normalHeaderCount), String.valueOf(normalBodyCount));
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eReceivePlanList 取込入荷予定データリスト
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param doUpdate エラー時DB更新有無
	 * @return エラー件数
	 */
	private int checkError(List<EReceivePlan> eReceivePlanList, String centerCd, String clientCd, DbUpdateForError doUpdate) {

		// エラー件数
		int errorCount = 0;

		//処理区分 List
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setReceiveFlg("1");
		List<MProcessType> processTypeList = processTypeLogic.getEntityList(processTypeCondition);
		//処理区分 Map
		Map<String, String> processTypeMap = new LinkedHashMap<String, String>();
		for (MProcessType mProcessType : processTypeList) {
			processTypeMap.put(mProcessType.getProcessTypeCd(), String.valueOf(mProcessType.getProcessTypeId()));
		}

		//在庫区分 Map
		Map<String, String> stockTypeMap = stockTypeLogic.getStockTypeMap();

		//預託CD Map
		Map<String, String> mCustomerMap = customerLogic.getDepositMapByClientCd(clientCd);

		// 倉庫CD List
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();
		MWarehouseCB mWarehouseCB = new MWarehouseCB();
		mWarehouseCB.setupSelect_MCenter();
		mWarehouseCB.query().queryMCenter().setCenterId_Equal(centerId);
		mWarehouseCB.specify().columnWarehouseCd();
		mWarehouseCB.specify().columnWarehouseNm();
		mWarehouseCB.query().addOrderBy_WarehouseCd_Asc();
		List<MWarehouse> mWarehouseList = warehouseLogic.getEntityList(mWarehouseCB);
		// 倉庫CD Map
		Map<String, String> mWarehouseMap = new HashMap<String, String>();
		for (MWarehouse mWarehouse : mWarehouseList) {
			mWarehouseMap.put(mWarehouse.getWarehouseCd(), String.valueOf(mWarehouse.getWarehouseId()));
		}
		// [Ver3.0] unit of measure対応 2017.11.24 潘 Start
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		Long clientId = mClient.getClientId();
		// [Ver3.0] unit of measure対応 2017.11.24 潘 End

		for (EReceivePlan eReceivePlan : eReceivePlanList) {

			// ===== 予定顧客入荷指示No チェック =====

			String planClientReceiveNo = eReceivePlan.getPlanClientReceiveNo();
			if (CU.isNullOrEmpty(planClientReceiveNo)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_CLIENT_RECEIVE_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", planClientReceiveNo)) {
				// 文字エラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_CLIENT_RECEIVE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,20}$", planClientReceiveNo)) {
				// 長さエラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_CLIENT_RECEIVE_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 仕入先CD チェック =====

			String planSupplierCd = eReceivePlan.getPlanSupplierCd();
			if (CU.isNullOrEmpty(planSupplierCd)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_SUPPLIER_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", planSupplierCd)) {
				// 文字エラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_SUPPLIER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,10}$", planSupplierCd)) {
				// 長さエラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_SUPPLIER_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 入荷予定日 チェック =====

			String receivePlanDt = (eReceivePlan.getReceivePlanDt() == null ? "" : eReceivePlan.getReceivePlanDt().replaceAll("/", ""));
			if (CU.isNullOrEmpty(receivePlanDt)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.RECEIVE_PLAN_DT_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (checkExcelCellInput(dateRegExp("yyMMdd"), receivePlanDt)) {
				receivePlanDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + receivePlanDt;
			}
			// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
			if (!WCU.checkDateStr(receivePlanDt)) {
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
				// 日付不正エラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.RECEIVE_PLAN_DT_DATE_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 処理区分CD チェック =====

			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			String processTypeCd = eReceivePlan.getProcessTypeCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			if (CU.isNullOrEmpty(processTypeCd)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.PROCESS_TYPE_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
			if (!checkExcelCellInput(".{1,30}$", processTypeCd)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PROCESS_TYPE_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!processTypeMap.containsKey(processTypeCd)) {
				// 処理区分CDが処理区分マスタにない。
				updateErrorExecute(eReceivePlan, WmsMessageConst.PROCESS_TYPE_CD_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 在庫区分CD チェック =====

			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			String stockTypeCd = eReceivePlan.getStockTypeCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			if (!CU.isNullOrEmpty(stockTypeCd)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,30}$", stockTypeCd)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.STOCK_CLASS_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!stockTypeMap.containsKey(stockTypeCd)) {
					// 在庫区分CDが在庫区分マスタにない。
					updateErrorExecute(eReceivePlan, WmsMessageConst.STOCK_TYPE_CD_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}

			// ===== 未入力の在庫区分 設定 =====
			} else {
				updateStockTypeCdExecute(eReceivePlan, processTypeCd, doUpdate);
			}

			// ===== 予定預託CD チェック =====

			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			String planDepositCd = eReceivePlan.getPlanDepositCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			if (CU.isNullOrEmpty(planDepositCd)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_DEPOSIT_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
			if (!checkExcelCellInput(".{1,30}$", planDepositCd)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_DEPOSIT_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!mCustomerMap.containsKey(planDepositCd)) {
				// 預託CDが取引先マスタにない。
				// [#169] メッセージの重複を削除 2016.12.05 kawana Start
				updateErrorExecute(eReceivePlan, WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR, doUpdate);
				// [#169] メッセージの重複を削除 2016.12.05 kawana End
				errorCount++;
				continue;
			}

			// ===== 商品CD チェック =====

			String productCd = eReceivePlan.getProductCd();
			if (CU.isNullOrEmpty(productCd)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[!-~]*$", productCd)) {
				// 文字エラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", productCd)) {
				// 長さエラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 予定数 チェック =====
			// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
			String planNum = eReceivePlan.getPlanNum();
			if (CU.isNullOrEmpty(planNum)) {
				// 必須
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", planNum)) {
				// 文字エラー
				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End

			//小数有無フラグ取得
			String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

			// [Ver3.0][#3872] マスタに存在しない商品の場合、小数有無フラグがnullとなるため、条件分岐を追加 2018.02.28 shimizu Start
			//小数有無フラグが有の場合
			if(decimalExistFlg != null) {
				if (decimalExistFlg.equals("1")) {

					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", planNum)) {
						// 整数7桁以内
						updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}

					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", planNum)) {
						// 小数3桁以内
						updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}

					if ((WCC.toBigDecimal(planNum).compareTo(WCC.toBigDecimal("0.001")) < 0)) {
						// 最小0.001以上
						updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End

				} else if (decimalExistFlg.equals("0")) {//小数有無フラグが無しの場合

					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", planNum)) {
						// 整数7桁以内
						updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (!checkExcelCellInput("^(-)?\\d+$", planNum)) {
						// 小数0桁以内
						updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if ((WCC.toBigDecimal(planNum).compareTo(WCC.toBigDecimal("1")) < 0)) {
						// 最小1以上
						updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}
			}
			// [Ver3.0][#3872] マスタに存在しない商品の場合、小数有無フラグがnullとなるため、条件分岐を追加 2018.02.28 shimizu End
			// [Ver3.0] unit of measure対応 2017.12.28 潘 End
//			if (!checkExcelCellInput("^\\d+$", planNum)) {
//				// 小数0桁以内
//				updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
//				errorCount++;
//				continue;
//			}

			// ===== 予定倉庫CD チェック =====

			String planWarehouseCd = eReceivePlan.getPlanWarehouseCd();
			if (!CU.isNullOrEmpty(planWarehouseCd)) {
				if (!mWarehouseMap.containsKey(planWarehouseCd)) {
					// 予定倉庫CDが倉庫マスタにない。
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_WAREHOUSE_CD_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 予定ロケーションCD チェック =====

			String planLocationCd = eReceivePlan.getPlanLocationCd();
			if (!CU.isNullOrEmpty(planLocationCd)) {
				if (!checkExcelCellInput("^[0-9a-zA-Z]*$", planLocationCd)) {
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[0-9a-zA-Z]{1,30}$", planLocationCd)) {
					// 長さエラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_LOCATION_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 予定ロット チェック =====

			String planLot = eReceivePlan.getPlanLot();
			if (!CU.isNullOrEmpty(planLot)) {
				if (!checkExcelCellInput("^[ -~｡-ﾟ]*$", planLot)) {
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_LOT_CHECK_HALF_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[ -~｡-ﾟ]{1,10}$", planLot)) {
					// 長さエラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_LOT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 予定期限日 チェック =====

			String planLimitDt = (eReceivePlan.getPlanLimitDt() == null ? "" : eReceivePlan.getPlanLimitDt().replaceAll("/", ""));
			if (!CU.isNullOrEmpty(planLimitDt)) {
				if (checkExcelCellInput(dateRegExp("yyMMdd"), planLimitDt)) {
					planLimitDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + planLimitDt;
				}
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
				if (!WCU.checkDateStr(planLimitDt)) {
					// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
					// 日付不正エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_LIMIT_DT_DATE_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 予定顧客発注№ チェック =====
			String planClientOrderNo = eReceivePlan.getPlanClientOrderNo();
			if (!CU.isNullOrEmpty(planClientOrderNo)) {
				if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", planClientOrderNo)) {
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_CLIENT_ORDER_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,30}$", planClientOrderNo)) {
					// 長さエラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.PLAN_CLIENT_ORDER_NO_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// [#2253]予備項目対応 2017.08.18 sampei Start
			// ===== 予備項目１（文字列） チェック =====
			String spareStr1 = eReceivePlan.getSpareStr1();
			if (!CU.isNullOrEmpty(spareStr1)) {
				if (!checkExcelCellInput(".{1,200}$", spareStr1)) {
					// 長さエラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_STR1_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 予備項目２（文字列） チェック =====
			String spareStr2 = eReceivePlan.getSpareStr2();
			if (!CU.isNullOrEmpty(spareStr2)) {
				if (!checkExcelCellInput(".{1,200}$", spareStr2)) {
					// 長さエラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_STR2_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 予備項目３（文字列） チェック =====
			String spareStr3 = eReceivePlan.getSpareStr3();
			if (!CU.isNullOrEmpty(spareStr3)) {
				if (!checkExcelCellInput(".{1,200}$", spareStr3)) {
					// 長さエラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_STR3_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// [Ver3.0][#4056] 予備項目（数値）の小数桁数を3桁に修正 2018.03.22 shimizu Start
			// ===== 予備項目１（数値） チェック =====
			String spareNum1 = eReceivePlan.getSpareNum1();
			if (!CU.isNullOrEmpty(spareNum1)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", spareNum1)) {
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM1_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", spareNum1)) {
					// 整数7桁以内
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM1_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", spareNum1)) {
					// 小数3桁以内
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM1_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (WCC.isNegative(spareNum1)) {
					// 最小0以上
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM1_CHECK_INPUT_MIN_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 予備項目２（数値） チェック =====
			String spareNum2 = eReceivePlan.getSpareNum2();
			if (!CU.isNullOrEmpty(spareNum2)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", spareNum2)) {
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM2_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", spareNum2)) {
					// 整数7桁以内
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM2_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", spareNum2)) {
					// 小数3桁以内
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM2_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (WCC.isNegative(spareNum2)) {
					// 最小0以上
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM2_CHECK_INPUT_MIN_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 予備項目３（数値） チェック =====
			String spareNum3 = eReceivePlan.getSpareNum3();
			if (!CU.isNullOrEmpty(spareNum3)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", spareNum3)) {
					// 文字エラー
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM3_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", spareNum3)) {
					// 整数7桁以内
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM3_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", spareNum3)) {
					// 小数3桁以内
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM3_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (WCC.isNegative(spareNum3)) {
					// 最小0以上
					updateErrorExecute(eReceivePlan, WmsMessageConst.SPARE_NUM3_CHECK_INPUT_MIN_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}
			// [Ver3.0][#4056] 予備項目（数値）の小数桁数を3桁に修正 2018.03.22 shimizu End
			// [#2253]予備項目対応 2017.08.18 sampei End

			// エラー無を設定
			updateNormalExecute(eReceivePlan, doUpdate);
		}

		return errorCount;
	}

	/**
	 * <h2>関連マスタ存在チェック.</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @return エラー件数
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//	private int checkErrorMaster(String receiveCd, String centerCd, String clientCd) {
	public int checkErrorMaster(String receiveCd, String centerCd, String clientCd) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		int errorCount = 0;

		// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.18 kawana Start
		Map<ClientReceiveNoKey, TReceivePlanBDto> clientReceiveNoMap = new HashMap<ClientReceiveNoKey, TReceivePlanBDto>();
		Map<ClientReceiveNoKey, List<Long>> ePlanIdListMap = new HashMap<ClientReceiveNoKey, List<Long>>();
		Map<ClientReceiveNoKey, String> errList = new HashMap<ClientReceiveNoKey, String>();
		// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.18 kawana End

		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		List<TReceivePlanBDto> checkList = selectAndConvertEReceivePlanList(receiveCd, centerCd, clientCd, SelectCls.NO_ERROR_ONLY);
		for (TReceivePlanBDto updDto : checkList) {
			if (!CU.isNullOrEmpty(updDto.getPlanWarehouseCd()) && !CU.isNullOrEmpty(updDto.getPlanLocationCd()) && !updDto.getPlanWarehouseCd().equals(updDto.getLcsWarehouseCd())) {
				// ロケーションマスタ未存在
				updateErrorExecute(eReceivePlanBhv.selectByPKValue(updDto.getReceivePanId()), WmsMessageConst.LOCATION_NOT_FOUND_ERROR, DbUpdateForError.TRUE);
				errorCount++;
				continue;
			} else if (!CU.isNullOrEmpty(updDto.getPlanLocationCd()) && updDto.getPlanLocationId() == null) {
				// ロケーションマスタ未存在
				updateErrorExecute(eReceivePlanBhv.selectByPKValue(updDto.getReceivePanId()), WmsMessageConst.LOCATION_NOT_FOUND_ERROR, DbUpdateForError.TRUE);
				errorCount++;
				continue;
			}

			if (updDto.getMProduct() != null && "0".equals(updDto.getMProduct().getLotManagFlg())) {
				if (!CU.isNullOrEmpty(updDto.getPlanLot())) {
					// ロット管理対象外 予定ロット入力エラー
					updateErrorExecute(eReceivePlanBhv.selectByPKValue(updDto.getReceivePanId()),
							WmsMessageConst.RECEIVE_LOT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR, DbUpdateForError.TRUE);
					errorCount++;
					continue;
				}
			}

			if (updDto.getMProduct() != null && "0".equals(updDto.getMProduct().getLimitDtManagFlg())) {
				if (!CU.isNullOrEmpty(updDto.getPlanLimitDt())) {
					// 期限日管理対象外 予定期限日エラー
					updateErrorExecute(eReceivePlanBhv.selectByPKValue(updDto.getReceivePanId()),
							WmsMessageConst.RECEIVE_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR, DbUpdateForError.TRUE);
					errorCount++;
					continue;
				}
			}

			// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.18 kawana Start
			// ===== 顧客入荷指示No 内で同一のヘッダ情報 チェック =====
			TReceivePlanHDto planH = updDto.getTReceivePlanH();
			String clientReceiveNo = planH.getPlanClientReceiveNo();
			String supplierCd = planH.getPlanSupplierCd();
			if (CU.isNullOrEmpty(clientReceiveNo) || CU.isNullOrEmpty(supplierCd)) {
				continue;
			}
			// 顧客入荷指示Noと仕入先CDでキーを作成
			ClientReceiveNoKey clientReceiveNoKey = new ClientReceiveNoKey(clientReceiveNo, supplierCd);

			// 既にエラーの顧客入荷指示Noか
			if (errList.containsKey(clientReceiveNoKey)) {
				// エラーを登録
				EReceivePlan eReceivePlan = eReceivePlanBhv.selectByPKValue(updDto.getReceivePanId());
				if (eReceivePlan.getErrorFlg() == null || eReceivePlan.getErrorFlg().equals("0")) {
					eReceivePlan.setErrorFlg("1");
					eReceivePlan.setErrorMessageCd(errList.get(clientReceiveNoKey));
					eReceivePlanBhv.update(eReceivePlan);
					errorCount++;
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eReceivePlan.getReceiveRowId()), eReceivePlan.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
				}
				continue;
			}

			// 同じキー(顧客入荷指示No,仕入先CD)のデータがあるか
			if (clientReceiveNoMap.containsKey(clientReceiveNoKey)) {
				// 同じキーのデータと比較

				TReceivePlanBDto checkPlanB = clientReceiveNoMap.get(clientReceiveNoKey);
				ePlanIdListMap.get(clientReceiveNoKey).add(updDto.getReceivePanId());

				// 入荷予定日 同一チェック
				if (!CU.nullToStr(checkPlanB.getTReceivePlanH().getReceivePlanDt()).equals(CU.nullToStr(planH.getReceivePlanDt()))) {
					// エラー登録
					registerError(ePlanIdListMap.get(clientReceiveNoKey), WmsMessageConst.RECEIVE_PLAN_DT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errList.put(clientReceiveNoKey, WmsMessageConst.RECEIVE_PLAN_DT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errorCount++;
					continue;
				}

				// 処理区分 同一チェック
				if (!CU.nullToStr(checkPlanB.getTReceivePlanH().getMProcessType().getProcessTypeCd()).equals(CU.nullToStr(planH.getMProcessType().getProcessTypeCd()))) {
					// エラー登録
					registerError(ePlanIdListMap.get(clientReceiveNoKey), WmsMessageConst.PROCESS_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errList.put(clientReceiveNoKey, WmsMessageConst.PROCESS_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errorCount++;
					continue;
				}

				// 在庫区分 同一チェック
				if (!CU.nullToStr(checkPlanB.getTReceivePlanH().getMStockType().getStockTypeCd()).equals(CU.nullToStr(planH.getMStockType().getStockTypeCd()))) {
					// エラー登録
					registerError(ePlanIdListMap.get(clientReceiveNoKey), WmsMessageConst.STOCK_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errList.put(clientReceiveNoKey, WmsMessageConst.STOCK_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errorCount++;
					continue;
				}

				// 預託CD 同一チェック
				if (!CU.nullToStr(checkPlanB.getTReceivePlanH().getPlanDepositCd()).equals(CU.nullToStr(planH.getPlanDepositCd()))) {
					// エラー登録
					registerError(ePlanIdListMap.get(clientReceiveNoKey), WmsMessageConst.DEPOSIT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errList.put(clientReceiveNoKey, WmsMessageConst.DEPOSIT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR);
					errorCount++;
					continue;
				}
			} else {
				// データをput
				clientReceiveNoMap.put(clientReceiveNoKey, updDto);
				List<Long> ePlanIdList = new ArrayList<Long>();
				ePlanIdList.add(updDto.getReceivePanId());
				ePlanIdListMap.put(clientReceiveNoKey, ePlanIdList);
			}
			// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.18 kawana End

			// ===== 既存データとの重複エラー チェック =====
			// 入荷予定ヘッダをエンティティに変換
			TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(updDto.getTReceivePlanH());
			tReceivePlanH.setClientId(clientId);
			tReceivePlanH.setCenterId(centerId);
			// 既存入荷予定ヘッダデータリスト取得
			List<TReceivePlanH> tReceivePlanHList = select(tReceivePlanH, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));
			if (tReceivePlanHList.size() > 0) {
				// 既存データとの重複エラー
				updateErrorExecute(eReceivePlanBhv.selectByPKValue(updDto.getReceivePanId()),
						WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR, DbUpdateForError.TRUE);
				errorCount++;
				continue;
			}
		}

		return errorCount;
	}

	/**
	 * <h2>入荷予定受信テーブルの未入力の在庫区分を設定.</h2>
	 * @param eReceivePlan
	 * @param processTypeCd 処理区分CD
	 * @param doUpdate
	 */
	private void updateStockTypeCdExecute(EReceivePlan eReceivePlan, String processTypeCd, DbUpdateForError doUpdate) {
		MProcessType processTypeInit = new MProcessType();
		processTypeInit.setProcessTypeCd(processTypeCd);

		MProcessType processType = processTypeLogic.getUkEntityWithStockTypeAndDeletedCheck(processTypeInit);

		// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
		eReceivePlan.setStockTypeCd(processType.getMStockType().getStockTypeCd());
		// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
		if (doUpdate == DbUpdateForError.TRUE) {
			eReceivePlanBhv.update(eReceivePlan);
		}
	}

	/**
	 * <h2>入荷予定受信テーブルのエラー設定.</h2>
	 */
	private void updateErrorExecute(EReceivePlan eReceivePlan, String errorMessageCd, DbUpdateForError doUpdate) {
		eReceivePlan.setErrorFlg("1");
		eReceivePlan.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eReceivePlanBhv.update(eReceivePlan);
		}
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eReceivePlan.getReceiveRowId()), errorMessageCd);
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
	}

	/**
	 * <h2>入荷予定受信テーブルのエラー無し設定.</h2>
	 */
	private void updateNormalExecute(EReceivePlan eReceivePlan, DbUpdateForError doUpdate) {
		eReceivePlan.setErrorFlg("0");
		eReceivePlan.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eReceivePlanBhv.update(eReceivePlan);
		}
	}

	// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.18 kawana Start

	private void registerError(List<Long> ePlanIdList, String messageCd) {

		EReceivePlanCB cb = new EReceivePlanCB();
		cb.query().setReceivePlanId_InScope(ePlanIdList);
		List<EReceivePlan> eReceivePlanList = eReceivePlanBhv.selectList(cb);
		for (EReceivePlan eReceivePlan : eReceivePlanList) {
			if (eReceivePlan.getErrorFlg() == null || eReceivePlan.getErrorFlg().equals("0")) {
				eReceivePlan.setErrorFlg("1");
				eReceivePlan.setErrorMessageCd(messageCd);
				eReceivePlanBhv.update(eReceivePlan);
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
				// エラー内容ログ書込開始
				addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eReceivePlan.getReceiveRowId()), eReceivePlan.getErrorMessageCd());
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
			}
		}
	}

	private static class ClientReceiveNoKey {
		String clientReceiveNo;
		String supplierCd;

		ClientReceiveNoKey(String clientReceiveNo, String supplierCd) {
			this.clientReceiveNo = clientReceiveNo;
			this.supplierCd = supplierCd;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((clientReceiveNo == null) ? 0 : clientReceiveNo.hashCode());
			result = prime * result + ((supplierCd == null) ? 0 : supplierCd.hashCode());
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ClientReceiveNoKey other = (ClientReceiveNoKey) obj;
			if (clientReceiveNo == null) {
				if (other.clientReceiveNo != null)
					return false;
			} else if (!clientReceiveNo.equals(other.clientReceiveNo))
				return false;
			if (supplierCd == null) {
				if (other.supplierCd != null)
					return false;
			} else if (!supplierCd.equals(other.supplierCd))
				return false;
			return true;
		}
	}
	// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.18 kawana End

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	/**
	 * <h2>取込入荷予定ヘッダ件数取得<h2>
	 * <pre>
	 * 取込入荷予定データリストから、取込入荷予定ヘッダ件数を取得する。
	 * </pre>
	 * @param eReceivePlanList 取込入荷予定データリスト
	 * @param cls エラー検索区分
	 * @return 取込入荷予定ヘッダ件数
	 */
	private int getEReceivePlanHeader(List<EReceivePlan> eReceivePlanList, SelectCls cls) {
		int count = 0;
		String errorFlg = null;

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			errorFlg = "1";
			break;
		case NO_ERROR_ONLY:
			errorFlg = "0";
			break;
		}

		// 入荷予定ヘッダ用Map
		Map<ClientReceiveNoKey, String> clientReceiveNoMap = new HashMap<ClientReceiveNoKey, String>();

		// 件数分ループ
		for (EReceivePlan eReceivePlan : eReceivePlanList) {
			// 顧客入荷指示Noと仕入先CDでキーを作成
			String clientReceiveNo = eReceivePlan.getPlanClientReceiveNo();
			String supplierCd = eReceivePlan.getPlanSupplierCd();
			String receivePlanErrorFlg = eReceivePlan.getErrorFlg();
			ClientReceiveNoKey clientReceiveNoKey = new ClientReceiveNoKey(clientReceiveNo, supplierCd);

			if (!clientReceiveNoMap.containsKey(clientReceiveNoKey)) {
				// ヘッダ未作成

				// 取込入荷予定ヘッダ件数カウント
				switch (cls) {
				case ALL:
				default:
					count++;
					clientReceiveNoMap.put(clientReceiveNoKey, receivePlanErrorFlg);
					break;
				case ERROR_ONLY:
				case NO_ERROR_ONLY:
					if (errorFlg.equals(receivePlanErrorFlg)) {
						count++;
						clientReceiveNoMap.put(clientReceiveNoKey, receivePlanErrorFlg);
					}
					break;
				}
			}
		}

		return count;
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	/**
	 * <h2>ファイル取込データから入荷予定受信テーブルのエンティティに変換.</h2>
	 * @param receiveCd 設定する受信CD
	 * @param mCenter センタマスタ
	 * @param mClient 荷主マスタ
	 * @param receivePlanList 取込入荷予定リスト
	 * @return 入荷予定受信テーブルのリスト
	 */
	public List<EReceivePlan> convertEReceivePlan(String receiveCd, MCenter mCenter, MClient mClient, List<TReceivePlanBDto> receivePlanList) {

		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		List<EReceivePlan> eReceivePlanList = new ArrayList<>();
		// [#2253]予備項目対応 2017.08.18 sampei Start
		TReceivePlanSpareDtoMapper tReceivePlanSpareDtoMapper = new TReceivePlanSpareDtoMapper();
		// [#2253]予備項目対応 2017.08.18 sampei End

		// 一覧件数分ループ
		for (int row = 0; row < receivePlanList.size(); row++) {
			TReceivePlanBDto data = receivePlanList.get(row);
			// 入荷予定ヘッダをエンティティに変換
			TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(data.getTReceivePlanH());

			// [#2253]予備項目対応 2017.08.18 sampei Start
			TReceivePlanSpare tReceivePlanSpare = tReceivePlanSpareDtoMapper.mappingToEntity(data.getTReceivePlanSpareAsOne());
			// [#2253]予備項目対応 2017.08.18 sampei End

			// 入荷予定受信テーブル
			EReceivePlan eReceivePlan = new EReceivePlan();
			eReceivePlan.setCenterCd(mCenter.getCenterCd());
			eReceivePlan.setClientCd(mClient.getClientCd());
			eReceivePlan.setReceiveRowId(Long.valueOf(row + 1));
			eReceivePlan.setReceiveCd(receiveCd);
			eReceivePlan.setImportFlg("0");
			eReceivePlan.setErrorFlg("0");
			//予定顧客入荷指示No.
			String planClientReceiveNo = tReceivePlanH.getPlanClientReceiveNo();
			eReceivePlan.setPlanClientReceiveNo(planClientReceiveNo);
			//仕入先CD
			String planSupplierCd = tReceivePlanH.getPlanSupplierCd();
			eReceivePlan.setPlanSupplierCd(planSupplierCd);
			//入荷予定日
			String receivePlanDt = (tReceivePlanH.getReceivePlanDt() == null ? "" : tReceivePlanH.getReceivePlanDt().replaceAll("/", ""));
			eReceivePlan.setReceivePlanDt(receivePlanDt);
			//処理区分CD
			String processTypeCd = tReceivePlanH.getMProcessType().getProcessTypeCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			eReceivePlan.setProcessTypeCd(processTypeCd);
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			//預託CD
			String planDepositCd = tReceivePlanH.getPlanDepositCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			eReceivePlan.setPlanDepositCd(planDepositCd);
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			//商品CD
			String productCd = data.getProductCd();
			eReceivePlan.setProductCd(productCd);
			//予定数
			BigDecimal planNum = null;
			if (data.getPlanNum() != null) {
				planNum = data.getPlanNum();
			}
			eReceivePlan.setPlanNum((planNum == null) ? null : CU.convertNumberToString(planNum));

			//在庫区分CD
			String stockTypeCd = tReceivePlanH.getMStockType().getStockTypeCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			eReceivePlan.setStockTypeCd(stockTypeCd);
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			//予定倉庫CD
			String planWarehouseCd = data.getPlanWarehouseCd();
			eReceivePlan.setPlanWarehouseCd(planWarehouseCd);
			//予定ロケーションCD
			String planLocationCd = data.getPlanLocationCd();
			eReceivePlan.setPlanLocationCd(planLocationCd);
			//予定ロット
			String planLot = data.getPlanLot();
			eReceivePlan.setPlanLot(planLot);
			//予定期限日
			String planLimitDt = (data.getPlanLimitDt() == null ? "" : data.getPlanLimitDt().replaceAll("/", ""));
			eReceivePlan.setPlanLimitDt(planLimitDt);
			//予定顧客発注№
			String planClientOrderNo = data.getPlanClientOrderNo();
			eReceivePlan.setPlanClientOrderNo(planClientOrderNo);

			// [#2253]予備項目対応 2017.08.18 sampei Start
			String spareStr1 = tReceivePlanSpare.getSpareStr1();
			eReceivePlan.setSpareStr1(spareStr1);

			String spareStr2 = tReceivePlanSpare.getSpareStr2();
			eReceivePlan.setSpareStr2(spareStr2);

			String spareStr3 = tReceivePlanSpare.getSpareStr3();
			eReceivePlan.setSpareStr3(spareStr3);

			BigDecimal spareNum1 = null;
			if (tReceivePlanSpare.getSpareNum1() != null) {
				spareNum1 = tReceivePlanSpare.getSpareNum1();
			}
			eReceivePlan.setSpareNum1((spareNum1 == null) ? null : CU.convertNumberToString(spareNum1));

			BigDecimal spareNum2 = null;
			if (tReceivePlanSpare.getSpareNum2() != null) {
				spareNum2 = tReceivePlanSpare.getSpareNum2();
			}
			eReceivePlan.setSpareNum2((spareNum2 == null) ? null : CU.convertNumberToString(spareNum2));

			BigDecimal spareNum3 = null;
			if (tReceivePlanSpare.getSpareNum3() != null) {
				spareNum3 = tReceivePlanSpare.getSpareNum3();
			}
			eReceivePlan.setSpareNum3((spareNum3 == null) ? null : CU.convertNumberToString(spareNum3));
			// [#2253]予備項目対応 2017.08.18 sampei End

			eReceivePlanList.add(eReceivePlan);
		}

		return eReceivePlanList;
	}

	/**
	 * <h2>入荷予定受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<EReceivePlan> selectEReceivePlanList(String receiveCd) {

		EReceivePlanCB cb = eReceivePlanBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eReceivePlanBhv.selectList(cb);
	}

	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add Start
	/**
	 * <h2>入荷予定受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<EReceivePlan> selectEReceivePlanList(String receiveCd, SelectCls cls) {

		EReceivePlanCB cb = eReceivePlanBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			cb.query().setErrorFlg_Equal("1");
			break;
		case NO_ERROR_ONLY:
			cb.query().setErrorFlg_Equal("0");
			break;
		}

		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eReceivePlanBhv.selectList(cb);
	}
	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add End

	/**
	 * <h2>入荷予定受信テーブル検索(入荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<TReceivePlanBDto> selectAndConvertEReceivePlanList(String receiveCd, String centerCd, String clientCd, SelectCls cls) {
		return selectAndConvertEReceivePlanList(receiveCd, centerCd, clientCd, null, cls);
	}

	/**
	 * <h2>取引先マスタ受信テーブル検索(入荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param paging ページング設定
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<TReceivePlanBDto> selectAndConvertEReceivePlanList(String receiveCd, String centerCd, String clientCd, PagingData paging, SelectCls cls) {

		// センタIDの取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();
		// 倉庫マスタの取得
		MWarehouseCB mWarehouseCB = new MWarehouseCB();
		mWarehouseCB.setupSelect_MCenter();
		mWarehouseCB.query().queryMCenter().setCenterId_Equal(centerId);
		mWarehouseCB.specify().columnWarehouseCd();
		mWarehouseCB.specify().columnWarehouseNm();
		mWarehouseCB.query().addOrderBy_WarehouseCd_Asc();
		List<MWarehouse> mWarehouseList = warehouseLogic.getEntityList(mWarehouseCB);
		// 外出しSQLの定義
		String path = EReceivePlanBhv.PATH_selectSqlEReceivePlanList;

		BsSqlEReceivePlanListPmb pmb = new BsSqlEReceivePlanListPmb();
		pmb.setClientCd(clientCd);
		pmb.setReceiveCd(receiveCd);
		pmb.setCenterCd(centerCd);
		pmb.setCenterId(centerId);

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			pmb.setErrorFlg("1");
			break;
		case NO_ERROR_ONLY:
			pmb.setErrorFlg("0");
			break;
		}

		pmb.setImportFlg("0");

		pmb.setCultureId(getCultureId());

		Class<SqlEReceivePlanListDto> entityType = SqlEReceivePlanListDto.class;
		List<SqlEReceivePlanListDto> sqlDtoList;
		if (paging != null) {
			sqlDtoList = super.selectPage(eReceivePlanBhv, path, pmb, entityType, paging);
		} else {
			sqlDtoList = super.selectList(eReceivePlanBhv, path, pmb, entityType);
		}

		List<TReceivePlanBDto> receivePlan = new ArrayList<>();
		for (SqlEReceivePlanListDto sqlDto : sqlDtoList) {
			TReceivePlanBDto searchDto = new TReceivePlanBDto();
			searchDto.setLineNo(Long.valueOf(CU.convertNumberToString(sqlDto.getReceiveRowId())));
			TReceivePlanHDto tReceivePlanH = new TReceivePlanHDto();
			tReceivePlanH.setPlanClientReceiveNo(sqlDto.getPlanClientReceiveNo());
			tReceivePlanH.setPlanSupplierCd(sqlDto.getPlanSupplierCd());
			MCustomerDto mCustomerByPlanSupplierId = new MCustomerDto();
			mCustomerByPlanSupplierId.setCustomerNm(sqlDto.getCustomerNm());
			mCustomerByPlanSupplierId.setCustomerAbbr(sqlDto.getCustomerAbbr());
			tReceivePlanH.setMCustomerByPlanSupplierId(mCustomerByPlanSupplierId);
			tReceivePlanH.setReceivePlanDt(formatDate(sqlDto.getReceivePlanDt()));
			MProcessTypeDto mProcessType = new MProcessTypeDto();

			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			mProcessType.setProcessTypeCd(sqlDto.getProcessTypeCd());
			if (!CU.isNullOrEmpty(sqlDto.getProcessTypeCd())) {
				mProcessType.setProcessTypeNm(sqlDto.getProcessTypeCd() + (sqlDto.getProcessTypeNm() != null ? ":" + sqlDto.getProcessTypeNm() : ""));
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			} else {
				mProcessType.setProcessTypeNm("");
			}
			tReceivePlanH.setMProcessType(mProcessType);

			MStockTypeDto mStockType = new MStockTypeDto();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			mStockType.setStockTypeCd(sqlDto.getStockTypeCd());
			if (!CU.isNullOrEmpty(sqlDto.getStockTypeCd())) {
				mStockType.setStockTypeNm(sqlDto.getStockTypeCd() + (sqlDto.getStockTypeNm() != null ? ":" + sqlDto.getStockTypeNm() : ""));
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			} else {
				mStockType.setStockTypeNm("");
			}
			tReceivePlanH.setMStockType(mStockType);
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			if (!CU.isNullOrEmpty(sqlDto.getPlanDepositCd())) {
				tReceivePlanH.setPlanDepositNm(sqlDto.getPlanDepositCd() + (sqlDto.getPlanDepositNm() != null ? ":" + sqlDto.getPlanDepositNm() : ""));
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			} else {
				tReceivePlanH.setPlanDepositNm("");
			}
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			tReceivePlanH.setPlanDepositCd(sqlDto.getPlanDepositCd());
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			searchDto.setTReceivePlanH(tReceivePlanH);

			searchDto.setProductCd(sqlDto.getProductCd());
			MProductDto mProduct = new MProductDto();
			mProduct.setProductCd(sqlDto.getProductCd());
			mProduct.setProductNm(sqlDto.getProductNm());
			mProduct.setProductAbbr(sqlDto.getProductAbbr());
			mProduct.setJanCd(sqlDto.getJanCd());
			mProduct.setLotManagFlg(sqlDto.getLotManagFlg());
			mProduct.setLimitDtManagFlg(sqlDto.getLimitDtManagFlg());
			searchDto.setMProduct(mProduct);
			searchDto.setPlanNum(sqlDto.getPlanNum() != null ? WCC.toBigDecimal(sqlDto.getPlanNum()) : null);

			String planWareHouseNm = CU.isNullOrEmpty(sqlDto.getPlanWarehouseCd()) ?sqlDto.getLcsWarehouseCd():sqlDto.getPlanWarehouseCd();
			if (!CU.isNullOrEmpty(planWareHouseNm)) {
				for (MWarehouse warehouse : mWarehouseList) {
					if (planWareHouseNm.equals(warehouse.getWarehouseCd())) {
						planWareHouseNm = planWareHouseNm + ":" + warehouse.getWarehouseNm();
						break;
					}
				}
			}

			if (CU.isNullOrEmpty(sqlDto.getPlanWarehouseCd())){
				searchDto.setPlanWarehouseCd(sqlDto.getLcsWarehouseCd());
			} else {
				searchDto.setPlanWarehouseCd(sqlDto.getPlanWarehouseCd());
			}
			searchDto.setLcsWarehouseCd(sqlDto.getLcsWarehouseCd());
			searchDto.setPlanWarehouseNm(planWareHouseNm);
			searchDto.setPlanLocationCd(sqlDto.getPlanLocationCd());
			searchDto.setPlanLocationId(sqlDto.getLocationId());
			searchDto.setPlanLot(sqlDto.getPlanLot());

			searchDto.setPlanLimitDt(formatDate(sqlDto.getPlanLimitDt()));

			searchDto.setErrorMessageCd(sqlDto.getErrorMessageCd());
			searchDto.setErrorMessageNm(sqlDto.getMessageNm());
			searchDto.setErrorFlg(sqlDto.getErrorFlg());
			searchDto.setPlanClientOrderNo(sqlDto.getPlanClientOrderNo());
			searchDto.setLineNo(sqlDto.getReceiveRowId());
			searchDto.setReceivePanId(sqlDto.getReceivePlanId());
			searchDto.seteReceiveVerNo(sqlDto.getVersionNo());

			TReceivePlanSpareDto tReceivePlanSpareDto = new TReceivePlanSpareDto();
			// [#2253]予備項目対応 2017.08.18 sampei Start
			tReceivePlanSpareDto.setSpareStr1(sqlDto.getSpareStr1());
			tReceivePlanSpareDto.setSpareStr2(sqlDto.getSpareStr2());
			tReceivePlanSpareDto.setSpareStr3(sqlDto.getSpareStr3());

			if(!CU.isNullOrEmpty(sqlDto.getSpareNum1())){
				BigDecimal spareNum1 = new BigDecimal(sqlDto.getSpareNum1());
				tReceivePlanSpareDto.setSpareNum1(spareNum1);
			}

			if(!CU.isNullOrEmpty(sqlDto.getSpareNum2())){
				BigDecimal spareNum2 = new BigDecimal(sqlDto.getSpareNum2());
				tReceivePlanSpareDto.setSpareNum2(spareNum2);
			}

			if(!CU.isNullOrEmpty(sqlDto.getSpareNum3())){
				BigDecimal spareNum3 = new BigDecimal(sqlDto.getSpareNum3());
				tReceivePlanSpareDto.setSpareNum3(spareNum3);
			}

			searchDto.setTReceivePlanSpareAsOne(tReceivePlanSpareDto);

			// [#2253]予備項目対応 2017.08.18 sampei End

			receivePlan.add(searchDto);
		}

		return receivePlan;
	}

	/**
	 * <h2>入荷予定登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに入荷予定データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	public void register(String receiveCd, String centerCd, String clientCd, ErrorStatus errSts) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		//取込みチェックNGのデータ保存リスト
		List<String> listForRemove = new ArrayList<String>();

		List<TReceivePlanBDto> insertReceivePlanList = selectAndCheckRemoveDataForRegisterList(receiveCd, centerCd, clientCd, listForRemove);
		if (insertReceivePlanList.size() < 1) {
			getErrorManager().add(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			if (outputLog == OutputLog.TRUE) {
				// ログ書込

				getDatabaseLogger().addErrorLogDtl(WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
				getDatabaseLogger().endLogDtl();
				endFailureLog();
			}
			return;
		}

		// 登録データの組み立て
		insertReceivePlanList = setupRegisterData(insertReceivePlanList, centerCd, clientCd, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw Start
		//コントロールNo取得
		Long controlNo = numberingCenterLogic.getControlNo();

		int headerCount = 0;
		// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw End

		// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.24 kawana Start

		// ===== 入荷予定ヘッダ、入荷予定ボディを作成 =====

		Map<ClientReceiveNoKey, TReceivePlanH> clientReceiveNoMap = new LinkedHashMap<ClientReceiveNoKey, TReceivePlanH>();

		for (TReceivePlanBDto planBDto : insertReceivePlanList) {

			TReceivePlanHDto planHDto = planBDto.getTReceivePlanH();

			// 顧客入荷指示Noと仕入先CDでキーを作成
			String clientReceiveNo = planHDto.getPlanClientReceiveNo();
			String supplierCd = planHDto.getPlanSupplierCd();
			ClientReceiveNoKey clientReceiveNoKey = new ClientReceiveNoKey(clientReceiveNo, supplierCd);

			if (!clientReceiveNoMap.containsKey(clientReceiveNoKey)) {
				// ヘッダ未作成のため作成

				// ===== 入荷予定ヘッダ作成 =====
				TReceivePlanH planH = new TReceivePlanH();
				planH.setClientId(planHDto.getClientId());
				planH.setCenterId(planHDto.getCenterId());
				planH.setPlanClientReceiveNo(planHDto.getPlanClientReceiveNo());
				planH.setPlanSupplierCd(planHDto.getPlanSupplierCd());
				planH.setReceivePlanDt(planHDto.getReceivePlanDt() == null ? "" : planHDto.getReceivePlanDt().replaceAll("/", ""));
				planH.setProcessTypeId(planHDto.getProcessTypeId());
				// [Ver1.1.1] [ON推-品向-936] 予定在庫区分を追加する 2015.09.14 hayashi Start
				planH.setStockTypeId(planHDto.getStockTypeId());
				// [Ver1.1.1] [ON推-品向-936] 予定在庫区分を追加する 2015.09.14 hayashi End
				planH.setPlanDepositCd(planHDto.getPlanDepositCd());
				planH.setReceiveStatus(planHDto.getReceiveStatus());
				planH.setInputType(planHDto.getInputType());
				planH.setErrorFlg(planHDto.getErrorFlg());
				planH.setErrorMessageCd(planHDto.getErrorMessageCd());
				planH.setPlanSupplierId(planHDto.getPlanSupplierId());
				planH.setPlanDepositId(planHDto.getPlanDepositId());
				planH.setReceiveDeliveryStatus(planHDto.getReceiveDeliveryStatus());
				// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw Start
				planH.setControlNo(controlNo);
				// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw End
				headerCount++;

				List<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
				planH.setTReceivePlanBList(planBList);

				clientReceiveNoMap.put(clientReceiveNoKey, planH);
			}

			// ===== 入荷予定ボディ作成 =====
			TReceivePlanB planB = new TReceivePlanB();
			planB.setPlanNum(planBDto.getPlanNum());
			planB.setPlanLocationCd(planBDto.getPlanLocationCd());
			planB.setPlanWarehouseCd(planBDto.getPlanWarehouseCd());
			planB.setPlanLot(planBDto.getPlanLot());
			planB.setPlanLimitDt(planBDto.getPlanLimitDt() == null ? "" : planBDto.getPlanLimitDt().replaceAll("/", ""));
			planB.setPlanClientOrderNo(planBDto.getPlanClientOrderNo());
			planB.setReceiveStatus(planBDto.getReceiveStatus());
			planB.setProductCd(planBDto.getProductCd());
			planB.setPlanWarehouseId(planBDto.getPlanWarehouseId());
			planB.setProductId(planBDto.getProductId());
			planB.setErrorFlg(planBDto.getErrorFlg());
			planB.setPlanLocationId(planBDto.getPlanLocationId());
			planB.setLineNo(planBDto.getLineNo());

			if (planBDto.getErrorMessageCd() != null) {
				planB.setErrorMessageCd(planBDto.getErrorMessageCd());
				planB.setReceiveStatus_$99();
				planB.setErrorFlg_$1();
			}

			// [#2253]予備項目対応 2017.08.18 sampei Start
			TReceivePlanSpare planSpare = new TReceivePlanSpare();
			planSpare.setSpareStr1(planBDto.getTReceivePlanSpareAsOne().getSpareStr1());
			planSpare.setSpareStr2(planBDto.getTReceivePlanSpareAsOne().getSpareStr2());
			planSpare.setSpareStr3(planBDto.getTReceivePlanSpareAsOne().getSpareStr3());
			planSpare.setSpareNum1(planBDto.getTReceivePlanSpareAsOne().getSpareNum1());
			planSpare.setSpareNum2(planBDto.getTReceivePlanSpareAsOne().getSpareNum2());
			planSpare.setSpareNum3(planBDto.getTReceivePlanSpareAsOne().getSpareNum3());
			planB.setTReceivePlanSpareAsOne(planSpare);
			// [#2253]予備項目対応 2017.08.18 sampei End

			// ヘッダにボディを追加
			clientReceiveNoMap.get(clientReceiveNoKey).getTReceivePlanBList().add(planB);
		}

		// ===== 入荷予定ヘッダ、入荷予定ボディを登録 =====

		for (TReceivePlanH planH : clientReceiveNoMap.values()) {

			insertLogic.insert(planH, planH.getTReceivePlanBList(), errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));
			if (getErrorManager().size() > 0) {
				if (outputLog == OutputLog.TRUE) {
					// ログ書込
					getDatabaseLogger().endLogDtl();
					endFailureLog();
				}
				return;
			}
		}

		// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正 2016.05.24 kawana End
		//[ON推-1.1.4-CT-114]CT指摘の修正対応 2016.06.16 chou Mod Start
		// 取込フラグ更新
		EReceivePlanCB eReceivePlanCB = new EReceivePlanCB();
		eReceivePlanCB.query().setReceiveCd_Equal(receiveCd);
		List<EReceivePlan> dataList = eReceivePlanBhv.selectList(eReceivePlanCB);
		Iterator<EReceivePlan> iterator = dataList.iterator();

		while (iterator.hasNext()) {
			EReceivePlan eReceivePlan = iterator.next();
			StringBuffer sb = new StringBuffer();
			sb.append(eReceivePlan.getPlanClientReceiveNo())
				.append(eReceivePlan.getPlanSupplierCd());

			if (listForRemove.contains(sb.toString())) {
				//リストからエラーのあったデータを削除する
				iterator.remove();
			}else{
				eReceivePlan.setImportFlg("1");
			}
		}
		eReceivePlanBhv.batchUpdate(dataList);
		//[ON推-1.1.4-CT-114]CT指摘の修正対応 2016.06.16 chou Mod End
		// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw Start

		boolean err = checkLogic.check(controlNo, null, errSts);

		//コントロールNo.のクリア処理
		Long oldControlNo = controlNo;
		controlNo = null;
		int updateCount = updateControlNoLogic.updateTReceivePlanHByControlNo(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		if (updateCount != headerCount) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return;
		}

		// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw End

		if (insertReceivePlanList.size() > 0) {
			// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw Start
			if(err == true){
				getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			}
			// コントロールNoでエラーチェック処理対応 2016.04.20 NayZaw End
		}

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_RECEIVE_PLAN_INFORMATION
					, String.valueOf(headerCount), String.valueOf(insertReceivePlanList.size()));
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End
			getDatabaseLogger().endLogDtl();
		}
	}

	//[ON推-1.1.4-CT-114]CT指摘の修正対応 2016.06.16 chou Add Start
	/**
	 * <h2>登録対象取込入荷予定データリスト取得</h2>
	 * <pre>
	 * 取込入荷予定データリスト全件検索を行い、
	 * 登録時点にエラーありのデータをチェックして削除。
	 * </pre>
	 * @param receiveCd 受信ID
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param listForRemove 取込みチェックNGのデータ保存リスト
	 * @return List<TReceivePlanBDto> 登録対象データリスト
	 */
	public List<TReceivePlanBDto> selectAndCheckRemoveDataForRegisterList(String receiveCd, String centerCd, String clientCd, List<String> listForRemove) {

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntityWithDeletedCheck(mClient);

		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenter);

		//受信行IDのリスト
		List<Long> receiveRowIdList = new ArrayList<Long>();

		// 取込入荷予定データリスト全件検索
		List<TReceivePlanBDto> tReceivePlanBDtoList = selectAndConvertEReceivePlanList(receiveCd, centerCd, clientCd, SelectCls.ALL);

		for (TReceivePlanBDto data : tReceivePlanBDtoList) {
			if ("0".equals(data.getErrorFlg())) {
				receiveRowIdList.add(data.getLineNo());
			} else {
				//1伝票にエラー有りのデータを削除リストに保存
				StringBuffer sb = new StringBuffer();
				TReceivePlanHDto tReceivePlanHDto = data.getTReceivePlanH();
				sb.append(tReceivePlanHDto.getPlanClientReceiveNo())
					.append(tReceivePlanHDto.getPlanSupplierCd());

				if (!listForRemove.contains(sb.toString())) {
					listForRemove.add(sb.toString());
				}
			}
		}

		Iterator<TReceivePlanBDto> iterator = tReceivePlanBDtoList.iterator();

		//1伝票内でエラーがある場合に、その伝票はエラーとして、関連データを全て削除。
		while (iterator.hasNext()) {
			TReceivePlanBDto tReceivePlanBDto = iterator.next();
			TReceivePlanHDto planHDto = tReceivePlanBDto.getTReceivePlanH();
			StringBuffer sb = new StringBuffer();
			sb.append(planHDto.getPlanClientReceiveNo())
				.append(planHDto.getPlanSupplierCd());

			if (listForRemove.contains(sb.toString())) {
				//1伝票分のデータをリストから削除する
				iterator.remove();
			}
		}

		return tReceivePlanBDtoList;
	}
	//[ON推-1.1.4-CT-114]CT指摘の修正対応 2016.06.16 chou Add End

	/**
	 * <h2>登録データの組み立て。</h2>
	 * <pre>
	 * 一括取込されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 * 【入荷予定ヘッダ】
	 * ・荷主ID
	 * ・センタID
	 * ・処理区分ID
	 * ・予定仕入先ID
	 * ・予定預託ID
	 * 【入荷予定ボディ】
	 * ・商品ID
	 * ・予定ロケーションID（ロケーションコードが入力されているときのみ）
	 * ・予定倉庫ID（ロケーションコードが入力されているときのみ）
	 * ・予定倉庫CD（ロケーションコードが入力されているときのみ）
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 仕入先マスタ存在異常、ロケーションマスタ存在異常
	 * 商品マスタ存在チェック警告 : 商品マスタのみ存在異常
	 * チェック正常 : 正常
	 * </pre>
	 * @param receivePlanList 取込登録データリスト
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param errSts エラーステータス
	 * @return List<TReceivePlanBDto> 処理結果DTO
	 */
	protected List<TReceivePlanBDto> setupRegisterData(List<TReceivePlanBDto> receivePlanList, String centerCd, String clientCd, ErrorStatus errSts) {

		TReceivePlanBDtoMapper tReceivePlanBDtoMapper = new TReceivePlanBDtoMapper();
		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 入荷予定ボディリスト
		List<TReceivePlanB> lstReceivePlanB = new ArrayList<TReceivePlanB>();

		// 入荷予定エラーリスト
		List<EReceivePlan> eReceiveList = new ArrayList<>();

		// 入荷予定登録データの組み立てリスト
		List<TReceivePlanBDto> setupDataList = new ArrayList<>();

		// [1.1.4-CT-026][1.1.4-CT-027][1.1.4-CT-028] 予定顧客入荷指示Noが同一でも仕入先が異なる場合はエラーにならないように修正(不要になったチェックを削除) 2016.05.18 kawana

		int j = 0;
		for (int row = 0; row < receivePlanList.size(); row++) {
			if ("1".equals(receivePlanList.get(row).getErrorFlg())) {
				continue;
			}

			// [EC-CT1-095] 途中でエラーがある以降のデータが全てエラーになる 2015.03.06 kawana Start
			// ヘッダ用エラーフラグ
			boolean isHeaderError = false;
			// ヘッダ用エラーメッセージCD
			String headerErrMessageCd = null;
			// [EC-CT1-095] 途中でエラーがある以降のデータが全てエラーになる 2015.03.06 kawana End
			TReceivePlanBDto data = receivePlanList.get(row);

			//入荷予定ボディをエンティティに変換
			TReceivePlanB tReceivePlanB = tReceivePlanBDtoMapper.mappingToEntity(data);

			// マスタから取得処理を外す 2016.05.26 nayzaw

			// 入荷ステータスを未入荷に設定する
			tReceivePlanB.setReceiveStatus_$01();

			// エラーフラグをエラーにする
			tReceivePlanB.setErrorFlg_$0();

			// エラーメッセージCD設定
			tReceivePlanB.setErrorMessageCd(null);

			// マスタから取得処理を外す 2016.05.26 nayzaw

			// 処理区分IDを取得
			MProcessType processTypeCondition = new MProcessType();
			processTypeCondition.setProcessTypeCd(data.getTReceivePlanH().getMProcessType().getProcessTypeCd());
			long processTypeId = processTypeLogic.getUkEntityWithDeletedCheck(processTypeCondition).getProcessTypeId();

			// [Ver1.1.1] [ON推-品向-936] 予定在庫区分を追加する 2015.09.14 hayashi Start
			// 在庫区分IDを取得
			MStockType stockTypeCondition = new MStockType();
			stockTypeCondition.setStockTypeCd(data.getTReceivePlanH().getMStockType().getStockTypeCd());
			long stockTypeId = stockTypeLogic.getUkEntityWithDeletedCheck(stockTypeCondition).getStockTypeId();
			// [Ver1.1.1] [ON推-品向-936] 予定在庫区分を追加する 2015.09.14 hayashi End

			// マスタから取得処理を外す 2016.05.26 nayzaw

			tReceivePlanB.getTReceivePlanH().setCenterId(centerId);
			tReceivePlanB.getTReceivePlanH().setClientId(clientId);
			tReceivePlanB.getTReceivePlanH().setProcessTypeId(processTypeId);
			// [Ver1.1.1] [ON推-品向-936] 予定在庫区分を追加する 2015.09.14 hayashi Start
			tReceivePlanB.getTReceivePlanH().setStockTypeId(stockTypeId);
			// [Ver1.1.1] [ON推-品向-936] 予定在庫区分を追加する 2015.09.14 hayashi End

			// マスタから取得処理を外す 2016.05.26 nayzaw

			tReceivePlanB.getTReceivePlanH().setReceiveDeliveryStatus_$00();
			tReceivePlanB.getTReceivePlanH().setInputType_$10();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
			tReceivePlanB.getTReceivePlanH().setCenterTransitFlg_$0();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End

			// ステータス
			if (isHeaderError) {

				// 入荷ステータスをエラー有にする
				tReceivePlanB.getTReceivePlanH().setReceiveStatus_$99();

				// エラーフラグをエラー有にする
				tReceivePlanB.getTReceivePlanH().setErrorFlg_$1();

				// エラーメッセージCDの設定
				tReceivePlanB.getTReceivePlanH().setErrorMessageCd(headerErrMessageCd);
			} else {

				// 入荷ステータスを未入荷にする
				tReceivePlanB.getTReceivePlanH().setReceiveStatus_$01();

				// エラーフラグをエラー無にする
				tReceivePlanB.getTReceivePlanH().setErrorFlg_$0();

				// エラーメッセージCDの設定
				tReceivePlanB.getTReceivePlanH().setErrorMessageCd(headerErrMessageCd);

				lstReceivePlanB.add(j, tReceivePlanB);
			}

			j++;
		}

		// Dto変換処理
		TReceivePlanBDtoMapper bodyMapper = new TReceivePlanBDtoMapper();
		setupDataList = bodyMapper.mappingToDtoList(lstReceivePlanB);

		if (!eReceiveList.isEmpty()) {
			eReceivePlanBhv.batchUpdate(eReceiveList);
		}

		return setupDataList;
	}

	/**
	 * <h2>入荷予定一括取込データ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースから入荷予定データを取得する。
	 *
	 * 【パラメータの使用項目】
	 *  入荷予定ヘッダリストマスタ
	 *
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダリストマスタ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TReceivePlanH> 入荷予定ヘッダデータのリスト
	 */
	public List<TReceivePlanH> select(TReceivePlanH tReceivePlanH, ErrorStatus errSts) {

		List<TReceivePlanH> result = null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();

		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
		//荷主ID（Client_ID）
		tReceivePlanHCB.query().setClientId_Equal(tReceivePlanH.getClientId());
		//センタID（Center_ID）
		tReceivePlanHCB.query().setCenterId_Equal(tReceivePlanH.getCenterId());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

		tReceivePlanHCB.query().setPlanClientReceiveNo_Equal(tReceivePlanH.getPlanClientReceiveNo());
		tReceivePlanHCB.query().setPlanSupplierCd_Equal(tReceivePlanH.getPlanSupplierCd());
		// [ON推-品向-512] 一度取込んだ顧客入荷指示Noのデータを削除して、再度同じデータを取込むと重複エラーを解消するために、入荷ステータスが[90：入荷削除]の検索条件を追加。 2015/01/09 許 Start
		tReceivePlanHCB.query().setReceiveStatus_NotEqual_$90();
		// [ON推-品向-512] 一度取込んだ顧客入荷指示Noのデータを削除して、再度同じデータを取込むと重複エラーを解消するために、入荷ステータスが[90：入荷削除]の検索条件を追加。 2015/01/09 許 End

		result = tReceivePlanHBhv.selectList(tReceivePlanHCB);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 * */
	private boolean checkExcelCellInput(String patternStr, String inputStr) {
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
	 * @param pattern 日付文字列
	 * @return String yyyyMMddに変換した文字列
	 */
	private String dateRegExp(String pattern) {
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

	/**
	 *<h2>日付を「yyyy/MM/dd」形式へ変換する。</h2>
	 * <pre>
	 * 次の形式の日付文字列に対応
	 * yyyyMMdd
	 * </pre>
	 * @return String yyyy/MM/ddに変換した文字列
	 * */
	private String formatDate(String dateTime) {
		if (CU.isNullOrEmpty(dateTime)){
			return dateTime;
		}
		// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
		if (!WCU.checkDateStr(dateTime)) {
			// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
			return dateTime;
		}

		SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd");
		String sfstr = "";
		try {
			sfstr = sf2.format(sf1.parse(dateTime));
		} catch (Exception e) {

		}
		return sfstr;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.20 honma end

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>取引先マスタ受信テーブル検索(入荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @return セレクト件数
	 */
	public int getEReceivePlanCount(String receiveCd, String centerCd, String clientCd) {

		// センタIDの取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();
		// 外出しSQLの定義
		String path = EReceivePlanBhv.PATH_selectSqlEReceivePlanList;

		BsSqlEReceivePlanListPmb pmb = new BsSqlEReceivePlanListPmb();
		pmb.setClientCd(clientCd);
		pmb.setReceiveCd(receiveCd);
		pmb.setCenterCd(centerCd);
		pmb.setCenterId(centerId);
		pmb.setImportFlg("0");
		pmb.setCultureId(getCultureId());

		Class<SqlEReceivePlanListDto> entityType = SqlEReceivePlanListDto.class;

		return eReceivePlanBhv.outsideSql().selectList(path, pmb, entityType).size();
	}
	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}
