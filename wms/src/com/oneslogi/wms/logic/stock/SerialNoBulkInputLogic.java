package com.oneslogi.wms.logic.stock;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlESerialInputListPmb;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.ESerialInputCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.dto.TSerialNoDto;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.ESerialInputBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.ESerialInput;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.customize.SqlESerialInputList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.BaseException;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.util.WCU;

/**
 * シリアルNo.一括取込ロジッククラス
 */
public class SerialNoBulkInputLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private ESerialInputBhv eSerialInputBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;

	// ===== 使用ロジック =====

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private SerialNoCheckReceiveLogic checkReceiveLogic;
	@Inject
	private SerialNoCheckShippingLogic checkShippingLogic;
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete

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
	/** 「英数字と-のみ」の正規表現パターン */
	private static String PARTTEN_CHARATER = "^[0-9a-zA-Z\\-]*$";

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
	public void startLog(String receiveCd, String centerCd, String clientCd) {

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.RECEIVE_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// 属性１設定(センタCD)
		getDatabaseLogger().setAttribute1(centerCd);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_PARAMETER_INFORMATION, receiveCd, centerCd, clientCd);
	}

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
			// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
			// ログ追加（エラー情報）
			getDatabaseLogger().addErrorLogDtl(processInfo, replaceValue[0], replaceValue[1]);
		}
	}

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
	 * @param eSerialInputList 一括登録
	 */
	public void batchInsertESerialInput(List<ESerialInput> eSerialInputList) {
		eSerialInputBhv.batchInsert(eSerialInputList);
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
		List<ESerialInput> eSerialInputList = selectESerialInputList(receiveCd);
		// 必須、文字数などのチェック
		int errCount = checkError(eSerialInputList, centerCd, clientCd, DbUpdateForError.TRUE);
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(receiveCd, centerCd, clientCd);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			// チェック後のデータ取得
			List<ESerialInput> checkedESerialInputList = selectESerialInputList(receiveCd);
			int count = checkedESerialInputList.size();
			int errCountAll = errCount + errCountMaster;
			int normalCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION
					, String.valueOf(errCountAll), String.valueOf(normalCount));
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eSerialInputList 取込シリアルNo.リスト
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param doUpdate エラー時DB更新有無
	 * @return エラー件数
	 */
	private int checkError(List<ESerialInput> eSerialInputList, String centerCd, String clientCd, DbUpdateForError doUpdate) {

		// エラー件数
		int errorCount = 0;

		// 処理区分 List
		// 区分値CDにより、区分値明細マスタマップを選択する。(処理区分)processTypeNotFoundError
		Map<String, String> processTypeMap = getClassMapByCd("SERIAL_OPERATION_TYPE");

		for (ESerialInput eSerialInput : eSerialInputList) {

			// ===== 処理区分 チェック =====
			String processType = eSerialInput.getProcessType();
			if (CU.isNullOrEmpty(processType)) {
				// 必須
				updateErrorExecute(eSerialInput, WmsMessageConst.PROCESS_TYPE_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!processTypeMap.containsKey(processType)) {
				updateErrorExecute(eSerialInput, WmsMessageConst.PROCESS_TYPE_CD_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 商品CD チェック =====
			String productCd = eSerialInput.getProductCd();
			if (CU.isNullOrEmpty(productCd)) {
				// 必須
				updateErrorExecute(eSerialInput, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== シリアルNo. チェック =====
			String serialNo = eSerialInput.getSerialNo();
			if (CU.isNullOrEmpty(serialNo)) {
				// 必須
				updateErrorExecute(eSerialInput, WmsMessageConst.SERIAL_NO_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput(PARTTEN_CHARATER, serialNo)) {
				// 文字エラー
				updateErrorExecute(eSerialInput, WmsMessageConst.SERIAL_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (serialNo.length() > 30) {
				// 長さエラー
				updateErrorExecute(eSerialInput, WmsMessageConst.SERIAL_NO_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if ("1".equals(processType)) {
				// ===== 仕入先CD チェック =====
				String supplierCd = eSerialInput.getSupplierCd();
				if (!CU.isNullOrEmpty(supplierCd)) {
					if (!checkExcelCellInput(PARTTEN_CHARATER, supplierCd)) {
						// 文字エラー
						updateErrorExecute(eSerialInput, WmsMessageConst.PLAN_SUPPLIER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (supplierCd.length() > 10) {
						// 長さエラー
						updateErrorExecute(eSerialInput, WmsMessageConst.PLAN_SUPPLIER_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}

				// ===== 仕入先名称 チェック =====
				String supplierNm = eSerialInput.getSupplierNm();
				if (!CU.isNullOrEmpty(supplierNm)) {
					if (supplierNm.length() > 50) {
						// 長さエラー
						updateErrorExecute(eSerialInput, WmsMessageConst.SUPPLIER_NM_CHECK_INPUT_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}

				// ===== WMS入荷伝票No.チェック =====
				String receiveSlipNo = eSerialInput.getReceiveSlipNo();
				if (!CU.isNullOrEmpty(receiveSlipNo)) {
					if (!checkExcelCellInput(PARTTEN_CHARATER, receiveSlipNo)) {
						// 文字エラー
						updateErrorExecute(eSerialInput, WmsMessageConst.RECEIVE_SLIP_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (receiveSlipNo.length() > 13) {
						// 長さエラー
						updateErrorExecute(eSerialInput, WmsMessageConst.RECEIVE_SLIP_NO_CHECK_INPUT_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}
			}

			if ("2".equals(processType)) {
				// ===== 納品先CD チェック =====
				String supplyCustomerCd = eSerialInput.getSupplyCustomerCd();
				if (!CU.isNullOrEmpty(supplyCustomerCd)) {
					if (!checkExcelCellInput(PARTTEN_CHARATER, supplyCustomerCd)) {
						// 文字エラー
						updateErrorExecute(eSerialInput, WmsMessageConst.SUPPLY_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (supplyCustomerCd.length() > 10) {
						// 長さエラー
						updateErrorExecute(eSerialInput, WmsMessageConst.SUPPLY_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}

				// ===== 納品先名称 チェック =====
				String supplyCustomerNm = eSerialInput.getSupplyCustomerNm();
				if (!CU.isNullOrEmpty(supplyCustomerNm)) {
					if (supplyCustomerNm.length() > 50) {
						// 長さエラー
						updateErrorExecute(eSerialInput, WmsMessageConst.SUPPLY_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}

				// ===== 出庫作業Noチェック =====
				String pickingWorkNo = eSerialInput.getPickingWorkNo();
				if (!CU.isNullOrEmpty(pickingWorkNo)) {
					if (!checkExcelCellInput(PARTTEN_CHARATER, pickingWorkNo)) {
						// 文字エラー
						updateErrorExecute(eSerialInput, WmsMessageConst.PICKING_WORK_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (pickingWorkNo.length() > 13) {
						// 長さエラー
						updateErrorExecute(eSerialInput, WmsMessageConst.PICKING_WORK_NO_CHECK_INPUT_MAX_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}
			}

			// ===== 作業日 チェック =====
			String workDt = (eSerialInput.getWorkDt() == null ? "" : eSerialInput.getWorkDt().replaceAll("/", ""));
			if (CU.isNullOrEmpty(workDt)) {
				if (("1".equals(processType) && !CU.isNullOrEmpty(eSerialInput.getReceiveSlipNo())) || ("2".equals(processType) && !CU.isNullOrEmpty(eSerialInput.getPickingWorkNo()))) {
					// 必須
					updateErrorExecute(eSerialInput, WmsMessageConst.WORK_DT_NOT_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			} else {
				if (checkExcelCellInput(dateRegExp("yyMMdd"), workDt)) {
					workDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + workDt;
				}
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
				if (!WCU.checkDateStr(workDt)) {
					// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
					// 日付不正エラー
					updateErrorExecute(eSerialInput, WmsMessageConst.WORK_DT_DATE_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// エラー無を設定
			updateNormalExecute(eSerialInput, doUpdate);
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
	public int checkErrorMaster(String receiveCd, String centerCd, String clientCd) {

		// ※※ 本メソッドでエラー管理クラスをクリアする処理があるため、空であることをチェックする
		if (0 < getErrorManager().size()) {

			return 0;
		}

		int errorCount = 0;

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		List<TSerialNo> checkList = selectAndConvertESerialInputList(receiveCd, centerCd, clientCd, SelectCls.NO_ERROR_ONLY);

		// 超過チェック用変数 (WMS出荷伝票No.と商品単位に入荷数を数える)
		Map<CheckOrverQuantityKey, List<TSerialNo>> receiveSerialMap = new HashMap<SerialNoBulkInputLogic.CheckOrverQuantityKey, List<TSerialNo>>();
		// 超過チェック用変数 (出庫作業No./出荷梱包No.と商品単位に出荷数を数える)
		Map<CheckOrverQuantityKey, List<TSerialNo>> shippingSerialMap = new HashMap<SerialNoBulkInputLogic.CheckOrverQuantityKey, List<TSerialNo>>();

		// 入荷シリアルNo. (商品ID毎に入荷シリアルNo.を管理)
		Map<Long, Set<String>> updReceiveSerialNoMap = new HashMap<Long, Set<String>>();
		// 出荷シリアルNo. (商品ID単位に出荷シリアルNo.管理)
		Map<Long, Set<String>> updShippingSerialNoMap = new HashMap<Long, Set<String>>();
		// 削除シリアルNo. (商品ID単位に削除シリアルNo.管理)
		Map<Long, Set<String>> delSerialNoMap = new HashMap<Long, Set<String>>();

		for (TSerialNo updEntity : checkList) {

			updEntity.setCenterId(centerId);
			updEntity.setClientId(clientId);

			final Long productId = updEntity.getProductId();
			final String serialNo = updEntity.getSerialNo();

			// 商品マスタチェック
			if (productId == null) {

				updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.PRODUCT_CD_NOT_FOUND_ERROR, DbUpdateForError.TRUE);
				errorCount++;
				continue;
			}

			// 処理区分
			String processType = updEntity.getProcessType();

			// ===== 処理区分が「1：入荷」の場合、入荷情報 チェック =====

			if ("1".equals(processType)) {

				// 入荷日を設定 ※ 現状はチェックなし (入庫日は複数日存在する可能性があるため)
				updEntity.setReceiveDt(updEntity.getWorkDt());

				// 入荷ヘッダチェック
				checkReceiveLogic.checkAndSetHeader(updEntity, new ErrorStatus());
				if (0 < getErrorManager().size()) {
					// エラー

					updateErrorByErrorManager(updEntity);
					errorCount++;
					getErrorManager().clear();
					continue;
				}

				// 入荷商品チェック
				checkReceiveLogic.checkProduct(updEntity, new ErrorStatus());
				if (0 < getErrorManager().size()) {
					// エラーメッセージCDに埋め込み文字があるためエラーの詰め替え

					updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.PRODUCT_CD_NOT_FOUND_RECEIVE_DATA_ERROR, DbUpdateForError.TRUE);
					errorCount++;
					getErrorManager().clear();
					continue;
				}

				// 入荷数チェック用変数を設定

				// シリアルNo.重複チェックと入荷シリアルNo.に追加
				if (updReceiveSerialNoMap.containsKey(productId)) {

					Set<String> serialNoSet = updReceiveSerialNoMap.get(productId);
					if (serialNoSet.contains(serialNo)) {
						// 重複エラー

						updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.PRODUCT_CD_AND_SERIAL_NO_DUPLICATE_ERROR, DbUpdateForError.TRUE);
						errorCount++;
						continue;
					}
					serialNoSet.add(serialNo);
				} else {

					Set<String> serialNoSet = new HashSet<String>();
					serialNoSet.add(serialNo);
					updReceiveSerialNoMap.put(productId, serialNoSet);
				}

				// 入荷登録シリアルマップに追加
				if (!CU.isNullOrEmpty(updEntity.getReceiveSlipNo())) {

					CheckOrverQuantityKey checkQuantityKey = new CheckOrverQuantityKey(updEntity.getReceiveSlipNo(), productId);
					if (receiveSerialMap.containsKey(checkQuantityKey)) {

						receiveSerialMap.get(checkQuantityKey).add(updEntity);
					} else {

						List<TSerialNo> receiveSerialNoList = new ArrayList<TSerialNo>();
						receiveSerialNoList.add(updEntity);
						receiveSerialMap.put(checkQuantityKey, receiveSerialNoList);
					}
				}
			}

			// ===== 処理区分が「2：出荷」の場合、出荷情報 チェック =====

			if ("2".equals(processType)) {

				// 入荷日を設定 ※ 現状はチェックなし (入庫日は複数日存在する可能性があるため)
				updEntity.setShippingDt(updEntity.getWorkDt());

				// 出荷ヘッダチェック
				checkShippingLogic.checkAndSetHeader(updEntity, new ErrorStatus());
				if (0 < getErrorManager().size()) {
					// エラー

					updateErrorByErrorManager(updEntity);
					errorCount++;
					getErrorManager().clear();
					continue;
				}

				// 出荷商品チェック
				checkShippingLogic.checkProduct(updEntity, new ErrorStatus());
				if (0 < getErrorManager().size()) {
					// エラーメッセージCDに埋め込み文字があるためエラーの詰め替え

					updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.PRODUCT_CD_NOT_FOUND_SHIPPING_DATA_ERROR, DbUpdateForError.TRUE);
					errorCount++;
					getErrorManager().clear();
					continue;
				}

				// 出荷数チェック用変数を設定

				// シリアルNo.重複チェックと出荷シリアルNo.に追加
				if (updShippingSerialNoMap.containsKey(productId)) {

					Set<String> serialNoSet = updShippingSerialNoMap.get(productId);
					if (serialNoSet.contains(serialNo)) {
						// 重複エラー

						updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.PRODUCT_CD_AND_SERIAL_NO_DUPLICATE_ERROR, DbUpdateForError.TRUE);
						errorCount++;
						continue;
					}
					serialNoSet.add(serialNo);
				} else {

					Set<String> serialNoSet = new HashSet<String>();
					serialNoSet.add(serialNo);
					updShippingSerialNoMap.put(productId, serialNoSet);
				}

				// 出荷登録シリアルマップに追加
				if (!CU.isNullOrEmpty(updEntity.getPickingWorkNo())) {

					CheckOrverQuantityKey checkQuantityKey = new CheckOrverQuantityKey(updEntity.getPickingWorkNo(), productId);
					if (shippingSerialMap.containsKey(checkQuantityKey)) {
						shippingSerialMap.get(checkQuantityKey).add(updEntity);
					} else {
						List<TSerialNo> shippingSerialNoList = new ArrayList<TSerialNo>();
						shippingSerialNoList.add(updEntity);
						shippingSerialMap.put(checkQuantityKey, shippingSerialNoList);
					}
				}
			}

			// ===== 処理区分が「3：削除」の場合、シリアルNo.管理テーブルの存在チェック =====

			if ("3".equals(processType)) {

				// シリアルNo.重複チェック
				if (delSerialNoMap.containsKey(productId)) {

					Set<String> serialNoSet = delSerialNoMap.get(productId);
					if (serialNoSet.contains(serialNo)) {
						// 重複エラー

						updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.PRODUCT_CD_AND_SERIAL_NO_DUPLICATE_ERROR, DbUpdateForError.TRUE);
						errorCount++;
						continue;
					}
					serialNoSet.add(serialNo);
				} else {

					Set<String> serialNoSet = new HashSet<String>();
					serialNoSet.add(serialNo);
					delSerialNoMap.put(productId, serialNoSet);
				}

				// DB登録チェック
				if (selectTSerialNo(updEntity) == null) {
					// DB未登録エラー

					updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), WmsMessageConst.SERIAL_NO_NOT_FOUND_ERROR, DbUpdateForError.TRUE);
					errorCount++;
					continue;
				}
			}
		}

		// ※ 登録シリアルNo.を全て対象外とするために上記for文が終わった後に
		//    超過チェックを別for文で行う

		// ===== 入荷数超過チェック(商品単位) =====

		for (Map.Entry<CheckOrverQuantityKey, List<TSerialNo>> entry : receiveSerialMap.entrySet()) {

			CheckOrverQuantityKey key = entry.getKey();
			String receiveSlipNo = key.getManageNo();
			long productId = key.getProductId();
			List<TSerialNo> addSerialNoList = entry.getValue();

			// 超過するまでは正常とするため、1件ずつチェックする

			Set<String> addSerialNoSet = new HashSet<String>();
			for (TSerialNo addSerial : addSerialNoList) {

				// 登録シリアルNo.に追加
				addSerialNoSet.add(addSerial.getSerialNo());
				checkReceiveLogic.checkOrverQuantity(centerId, clientId, receiveSlipNo, productId, addSerialNoSet, updReceiveSerialNoMap.get(productId), new ErrorStatus());
				if (0 < getErrorManager().size()) {
					// エラー

					updateErrorByErrorManager(addSerial);
					errorCount++;
					getErrorManager().clear();
					continue;
				}
			}
		}

		// ===== 出庫数超過チェック(商品単位) =====

		for (Map.Entry<CheckOrverQuantityKey, List<TSerialNo>> entry : shippingSerialMap.entrySet()) {

			CheckOrverQuantityKey key = entry.getKey();
			String pickingWorkNo = key.getManageNo();
			long productId = key.getProductId();
			List<TSerialNo> addSerialNoList = entry.getValue();

			// 超過するまでは正常とするため、1件ずつチェックする

			Set<String> addSerialNoSet = new HashSet<String>();
			for (TSerialNo addSerial : addSerialNoList) {

				// 登録シリアルNo.に追加
				addSerialNoSet.add(addSerial.getSerialNo());
				checkShippingLogic.checkOrverQuantity(centerId, clientId, pickingWorkNo, productId, addSerialNoSet, updShippingSerialNoMap.get(productId), new ErrorStatus());
				if (0 < getErrorManager().size()) {
					// エラー

					updateErrorByErrorManager(addSerial);
					errorCount++;
					getErrorManager().clear();
					continue;
				}
			}
		}

		return errorCount;
	}

	/**
	 * <h2>シリアルNo.受信テーブルのエラー設定.</h2>
	 */
	private void updateErrorExecute(ESerialInput eSerialInput, String errorMessageCd, DbUpdateForError doUpdate) {
		eSerialInput.setErrorFlg("1");
		eSerialInput.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eSerialInputBhv.update(eSerialInput);
		}
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eSerialInput.getReceiveRowId()), errorMessageCd);
	}

	/**
	 * <h2>シリアルNo.受信テーブルのエラー無し設定.</h2>
	 */
	private void updateNormalExecute(ESerialInput eSerialInput, DbUpdateForError doUpdate) {
		eSerialInput.setErrorFlg("0");
		eSerialInput.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eSerialInputBhv.update(eSerialInput);
		}
	}

	/**
	 * エラー管理クラスから取得したエラーを登録する
	 */
	private void updateErrorByErrorManager(TSerialNo updEntity) {

		for (Map.Entry<Integer, BaseException> entry : getErrorManager().get().entrySet()) {

			BaseException e = entry.getValue();
			if (e instanceof CommonException) {
				// 1件目のエラーメッセージを登録

				String messageCd = ((CommonException) e).getMessageCd();
				updateErrorExecute(eSerialInputBhv.selectByPKValue(updEntity.getSerialInputId()), messageCd, DbUpdateForError.TRUE);
				break;
			}
		}
	}

	/**
	 * <h2>ファイル取込データからシリアルNo.受信テーブルのエンティティに変換.</h2>
	 * @param receiveCd 設定する受信CD
	 * @param mCenter センタマスタ
	 * @param mClient 荷主マスタ
	 * @param serialNoList 取込シリアルNo.リスト
	 * @return シリアルNo.受信テーブルのリスト
	 */
	public List<ESerialInput> convertESerialInput(String receiveCd, MCenter mCenter, MClient mClient, List<TSerialNoDto> serialNoList) {

		List<ESerialInput> eSerialInputList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < serialNoList.size(); row++) {
			TSerialNoDto data = serialNoList.get(row);
			// シリアルNo.受信テーブル
			ESerialInput eSerialInput = new ESerialInput();
			eSerialInput.setCenterCd(mCenter.getCenterCd());
			eSerialInput.setClientCd(mClient.getClientCd());
			eSerialInput.setReceiveRowId(Long.valueOf(row + 1));
			eSerialInput.setReceiveCd(receiveCd);
			eSerialInput.setImportFlg("0");
			eSerialInput.setErrorFlg("0");
			//処理区分
			String processType = data.getProcessType();
			eSerialInput.setProcessType(processType);
			//商品CD
			String productCd = data.getMProduct().getProductCd();
			eSerialInput.setProductCd(productCd);
			//シリアルNo.
			String serialNo = data.getSerialNo();
			eSerialInput.setSerialNo(serialNo);
			//仕入先CD
			String supplierCd = data.getSupplierCd();
			eSerialInput.setSupplierCd(supplierCd);
			//仕入先名称
			String supplierNm = data.getSupplierNm();
			eSerialInput.setSupplierNm(supplierNm);
			//WMS入荷伝票No.
			String receiveSlipNo = data.getReceiveSlipNo();
			eSerialInput.setReceiveSlipNo(receiveSlipNo);
			//納品先CD
			String supplyCustomerCd = data.getSupplyCustomerCd();
			eSerialInput.setSupplyCustomerCd(supplyCustomerCd);
			//納品先名称
			String supplyCustomerNm = data.getSupplyCustomerNm();
			eSerialInput.setSupplyCustomerNm(supplyCustomerNm);
			//出庫作業No.
			String pickingWorkNo = data.getPickingWorkNo();
			eSerialInput.setPickingWorkNo(pickingWorkNo);
			//作業日
			String workDt = (data.getWorkDt() == null ? "" : data.getWorkDt().replaceAll("/", ""));
			eSerialInput.setWorkDt(workDt);

			eSerialInputList.add(eSerialInput);
		}

		return eSerialInputList;
	}

	/**
	 * <h2>シリアルNo.受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<ESerialInput> selectESerialInputList(String receiveCd) {

		ESerialInputCB cb = eSerialInputBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eSerialInputBhv.selectList(cb);
	}

	/**
	 * <h2>シリアルNo.受信テーブル検索(シリアルNo.管理DTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<TSerialNo> selectAndConvertESerialInputList(String receiveCd, String centerCd, String clientCd, SelectCls cls) {
		return selectAndConvertESerialInputList(receiveCd, centerCd, clientCd, null, cls);
	}

	/**
	 * <h2>取引先マスタ受信テーブル検索(シリアルNo.管理DTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param paging ページング設定
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<TSerialNo> selectAndConvertESerialInputList(String receiveCd, String centerCd, String clientCd, PagingData paging, SelectCls cls) {

		// 外出しSQLの定義
		String path = ESerialInputBhv.PATH_selectSqlESerialInputList;

		BsSqlESerialInputListPmb pmb = new BsSqlESerialInputListPmb();
		pmb.setClientCd(clientCd);
		pmb.setReceiveCd(receiveCd);
		pmb.setCenterCd(centerCd);

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

		Class<SqlESerialInputList> entityType = SqlESerialInputList.class;
		List<SqlESerialInputList> selectList;
		if (paging != null) {
			selectList = super.selectPage(eSerialInputBhv, path, pmb, entityType, paging);
		} else {
			selectList = super.selectList(eSerialInputBhv, path, pmb, entityType);
		}

		List<TSerialNo> tSerialNoList = new ArrayList<>();
		for (SqlESerialInputList selectEntity : selectList) {
			TSerialNo tSerialNo = new TSerialNo();
			tSerialNo.setLineNo(Long.valueOf(CU.convertNumberToString(selectEntity.getReceiveRowId())));
			tSerialNo.setProcessType(selectEntity.getProcessType());
			if (!CU.isNullOrEmpty(selectEntity.getProcessType())) {
				tSerialNo.setProcessTypeNm(selectEntity.getProcessType() + (selectEntity.getProcessTypeNm() != null ? ":" + selectEntity.getProcessTypeNm() : ""));
			} else {
				tSerialNo.setProcessTypeNm("");
			}
			tSerialNo.setProductId(selectEntity.getProductId());
			MProduct mProduct = new MProduct();
			mProduct.setProductId(selectEntity.getProductId());
			mProduct.setProductCd(selectEntity.getProductCd());
			mProduct.setProductNm(selectEntity.getProductNm());
			tSerialNo.setMProduct(mProduct);
			tSerialNo.setSerialNo(selectEntity.getSerialNo());
			tSerialNo.setSupplierCd(selectEntity.getSupplierCd());
			tSerialNo.setSupplierNm(CU.isNullOrEmpty(selectEntity.getSupplierNm()) ? selectEntity.getSupplierNm2() : selectEntity.getSupplierNm());
			tSerialNo.setSupplierId(selectEntity.getSupplierId());
			tSerialNo.setReceiveSlipNo(selectEntity.getReceiveSlipNo());
			tSerialNo.setSupplyCustomerCd(selectEntity.getSupplyCustomerCd());
			tSerialNo.setSupplyCustomerNm(CU.isNullOrEmpty(selectEntity.getSupplyCustomerNm()) ? selectEntity.getSupplyCustomerNm2() : selectEntity.getSupplyCustomerNm());
			tSerialNo.setSupplyCustomerId(selectEntity.getSupplyCustomerId());
			tSerialNo.setPickingWorkNo(selectEntity.getPickingWorkNo());
			tSerialNo.setWorkDt(formatDate(selectEntity.getWorkDt()));

			tSerialNo.setErrorMessageCd(selectEntity.getErrorMessageCd());
			tSerialNo.setErrorMessageNm(selectEntity.getMessageNm());
			tSerialNo.setErrorFlg(selectEntity.getErrorFlg());
			tSerialNo.setLineNo(selectEntity.getReceiveRowId());
			tSerialNo.setSerialInputId(selectEntity.getSerialInputId());
			tSerialNo.seteReceiveVerNo(selectEntity.getVersionNo());
			tSerialNoList.add(tSerialNo);
		}

		return tSerialNoList;
	}

	/**
	 * <h2>シリアルNo.管理登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースにシリアルNo.管理データを登録し、完了メッセージを設定する
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

		// データ取得
		List<TSerialNo> selectList = selectAndConvertESerialInputList(receiveCd, centerCd, clientCd, SelectCls.NO_ERROR_ONLY);
		if (selectList.size() < 1) {

			addError(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			return;
		}

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(centerCd);
		final long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		final long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		List<TSerialNo> insertList = new ArrayList<>();
		List<TSerialNo> updateList = new ArrayList<>();
		List<TSerialNo> deleteList = new ArrayList<>();

		Map<SerialNoKey, TSerialNo> tSerialNoMap = new HashMap<SerialNoKey, TSerialNo>();

		for (TSerialNo selectSerialNo : selectList) {

			final long productId = selectSerialNo.getProductId();
			final String serialNo = selectSerialNo.getSerialNo();

			SerialNoKey key = new SerialNoKey(productId, serialNo);

			TSerialNo tSerialNo = null;
			if (tSerialNoMap.containsKey(key)) {
				// 既に作成またはDBから取得済

				tSerialNo = tSerialNoMap.get(key);
			} else {
				// 未作成

				// 登録されているシリアルNo.をDBから取得
				selectSerialNo.setCenterId(centerId);
				selectSerialNo.setClientId(clientId);
				tSerialNo = selectTSerialNo(selectSerialNo);

				if (tSerialNo == null) {
					// DB未登録 -> 新規作成

					tSerialNo = new TSerialNo();
					tSerialNo.setCenterId(centerId);
					tSerialNo.setClientId(clientId);
					tSerialNo.setProductId(productId);
					tSerialNo.setSerialNo(serialNo);
				}
				tSerialNoMap.put(key, tSerialNo);
			}

			if ("1".equals(selectSerialNo.getProcessType())) {
				// 処理区分が「1：入荷」 -> 入荷情報を設定

				tSerialNo.setSupplierCd(selectSerialNo.getSupplierCd());
				tSerialNo.setSupplierNm(selectSerialNo.getSupplierNm());
				tSerialNo.setReceiveSlipNo(selectSerialNo.getReceiveSlipNo());
				tSerialNo.setReceiveDt(selectSerialNo.getWorkDt() == null ? "" : selectSerialNo.getWorkDt().replace("/", ""));

				// ヘッダ情報の設定
				checkReceiveLogic.checkAndSetHeader(tSerialNo, null);
			}

			if ("2".equals(selectSerialNo.getProcessType())) {
				// 処理区分が「2：出荷」 -> 出荷情報を設定

				tSerialNo.setSupplyCustomerCd(selectSerialNo.getSupplyCustomerCd());
				tSerialNo.setSupplyCustomerNm(selectSerialNo.getSupplyCustomerNm());
				tSerialNo.setPickingWorkNo(selectSerialNo.getPickingWorkNo());
				tSerialNo.setShippingDt(selectSerialNo.getWorkDt() == null ? "" : selectSerialNo.getWorkDt().replace("/", ""));

				// ヘッダ情報の設定
				checkShippingLogic.checkAndSetHeader(tSerialNo, null);
			}

			if ("3".equals(selectSerialNo.getProcessType())) {
				// 処理区分が「3：削除」の場合

				// 削除
				deleteList.add(tSerialNo);
			}
		}

		// 登録または更新リスト作成
		// ※ 入荷と出荷で同じシリアルNo.がある場合、重複して登録・更新リストに追加されてしまうのを防ぐため
		// 上のfor文では登録・更新リストに追加しない
		for (TSerialNo tSerialNo : tSerialNoMap.values()) {

			if (tSerialNo.getSerialNoId() == null) {
				// 登録
				insertList.add(tSerialNo);
			} else {
				// 修正
				updateList.add(tSerialNo);
			}
		}

		if (insertList.isEmpty() && updateList.isEmpty() && deleteList.isEmpty()) {
			// 登録データなし

			addError(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			return;
		}

		if (!insertList.isEmpty()) {
			batchInsert(insertList, errSts);
		}

		if (!updateList.isEmpty()) {
			batchUpdate(updateList, errSts);
		}

		if (!deleteList.isEmpty()) {
			batchDelete(deleteList, errSts);
		}

		// 取込みフラグを「1:取込済」に更新
		ESerialInputCB cb = new ESerialInputCB();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().setErrorFlg_Equal("0");
		cb.query().setImportFlg_Equal("0");

		ESerialInput updEntity = new ESerialInput();
		updEntity.setImportFlg("1");

		int importCout = eSerialInputBhv.queryUpdate(updEntity, cb);

		if (selectList.size() != importCout) {
			// 取得件数と更新件数の相違エラー

			addError(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_DELETE_INFORMATION, String.valueOf(insertList.size()), String.valueOf(updateList.size()),
					String.valueOf(deleteList.size()));
			getDatabaseLogger().endLogDtl();
		}
	}

	private void addError(ErrorStatus errSts, String messageCd) {

		getErrorManager().add(errSts, messageCd);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().addErrorLogDtl(messageCd);
			getDatabaseLogger().endLogDtl();
			endFailureLog();
		}
	}

	/**
	 * <h2>シリアルNo.管理一括取込データ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースからシリアルNo.管理データを取得する。
	 *
	 * </pre>
	 * @param tSerialNo シリアルNo.管理データ
	 * @return TSerialNo シリアルNo.管理データ
	 */
	private TSerialNo selectTSerialNo(TSerialNo tSerialNo) {

		TSerialNoCB cb = tSerialNoBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(tSerialNo.getCenterId());
		cb.query().setClientId_Equal(tSerialNo.getClientId());
		cb.query().setProductId_Equal(tSerialNo.getProductId());
		cb.query().setSerialNo_Equal(tSerialNo.getSerialNo());

		TSerialNo result = tSerialNoBhv.selectEntity(cb);

		return result;
	}

	/**
	 * <h2>入荷予定ヘッダデータ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースから入荷予定ヘッダデータを取得する。
	 *
	 * 【パラメータの使用項目】
	 *  シリアルNo.管理データ
	 *
	 * </pre>
	 * @param tSerialNo シリアルNo.管理データ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TReceivePlanH> 入荷予定ヘッダデータリスト
	 */
	public List<TReceivePlanH> selectTReceivePlanHList(TSerialNo tSerialNo, ErrorStatus errSts) {

		List<TReceivePlanH> result = null;

		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();

		//荷主ID（Client_ID）
		tReceivePlanHCB.query().setClientId_Equal(tSerialNo.getClientId());
		//センタID（Center_ID）
		tReceivePlanHCB.query().setCenterId_Equal(tSerialNo.getCenterId());
		//入荷予定日（Receive_Plan_Dt）
		tReceivePlanHCB.query().setReceivePlanDt_Equal(tSerialNo.getWorkDt().replace("/", ""));
		//WMS入荷伝票No.（Receive_Slip_No）
		tReceivePlanHCB.query().setReceiveSlipNo_Equal(tSerialNo.getReceiveSlipNo());

		result = tReceivePlanHBhv.selectList(tReceivePlanHCB);

		return result;
	}

	/**
	 * <h2>出庫ヘッダデータ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースから出庫ヘッダデータを取得する。
	 *
	 * 【パラメータの使用項目】
	 *  シリアルNo.管理データ
	 *
	 * </pre>
	 * @param tSerialNo シリアルNo.管理データ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TRPickingH> 出庫ヘッダデータリスト
	 */
	public List<TPickingH> selectTPickingHList(TSerialNo tSerialNo, ErrorStatus errSts) {

		List<TPickingH> result = null;

		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TAllocInstH();

		//荷主ID（Client_ID）
		tPickingHCB.query().setClientId_Equal(tSerialNo.getClientId());
		//センタID（Center_ID）
		tPickingHCB.query().setCenterId_Equal(tSerialNo.getCenterId());
		//出庫作業No.（Picking_Work_No）
		tPickingHCB.query().setPickingWorkNo_Equal(tSerialNo.getPickingWorkNo());
		//出荷日（Shipping_Dt）
		tPickingHCB.query().queryTAllocInstH().setShippingDt_Equal(tSerialNo.getWorkDt() == null ? "" : tSerialNo.getWorkDt().replace("/", ""));

		result = tPickingHBhv.selectList(tPickingHCB);

		return result;
	}

	/**
	 * <h2>出庫ボディデータ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースから出庫ボディデータを取得する。
	 *
	 * 【パラメータの使用項目】
	 *  シリアルNo.管理データ
	 *
	 * </pre>
	 * @param tSerialNo シリアルNo.管理データ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TPickingB> 出庫ボディデータリスト
	 */
	public List<TPickingB> selectTPickingBList(TSerialNo tSerialNo, ErrorStatus errSts) {

		List<TPickingB> result = null;

		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TPickingH().withTAllocInstH();

		//荷主ID（Client_ID）
		tPickingBCB.query().queryTPickingH().setClientId_Equal(tSerialNo.getClientId());
		//センタID（Center_ID）
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(tSerialNo.getCenterId());
		//出庫作業No.（Picking_Work_No）
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(tSerialNo.getPickingWorkNo());
		//出荷日（Shipping_Dt）
		tPickingBCB.query().queryTPickingH().queryTAllocInstH().setShippingDt_Equal(tSerialNo.getWorkDt() == null ? "" : tSerialNo.getWorkDt().replace("/", ""));
		//商品ID（Product_Id）
		tPickingBCB.query().queryTAllocInstB().setProductId_Equal(tSerialNo.getProductId());
		//納品先CD（SupplyCustomerCd）
		tPickingBCB.query().queryTPickingH().queryTAllocInstH().setSupplyCustomerCd_Equal(tSerialNo.getSupplyCustomerCd());

		result = tPickingBBhv.selectList(tPickingBCB);

		return result;
	}

	/**
	 * <h2>梱包ヘッダデータ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースから梱包ヘッダデータを取得する。
	 *
	 * 【パラメータの使用項目】
	 *  シリアルNo.管理データ
	 *
	 * </pre>
	 * @param tSerialNo シリアルNo.管理データ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TPackingH> 梱包ヘッダデータリスト
	 */
	public List<TPackingH> selectTPackingHList(TSerialNo tSerialNo, ErrorStatus errSts) {

		List<TPackingH> result = null;

		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.setupSelect_TAllocInstH();

		//荷主ID（Client_ID）
		tPackingHCB.query().setClientId_Equal(tSerialNo.getClientId());
		//センタID（Center_ID）
		tPackingHCB.query().setCenterId_Equal(tSerialNo.getCenterId());
		//出庫作業No.（Picking_Work_No）
		tPackingHCB.query().setShippingPackingNo_Equal(tSerialNo.getPickingWorkNo());
		//出荷日（Shipping_Dt）
		tPackingHCB.query().queryTAllocInstH().setShippingDt_Equal(tSerialNo.getWorkDt() == null ? "" : tSerialNo.getWorkDt().replace("/", ""));

		result = tPackingHBhv.selectList(tPackingHCB);

		return result;
	}

	/**
	 * <h2>梱包ヘッダデータ取得。</h2>
	 * <pre>
	 *
	 * 引数をキーにデータベースから梱包ヘッダデータを取得する。
	 *
	 * 【パラメータの使用項目】
	 *  シリアルNo.管理データ
	 *
	 * </pre>
	 * @param tSerialNo シリアルNo.管理データ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TPackingB> 梱包ヘッダデータリスト
	 */
	public List<TPackingB> selectTPackingBList(TSerialNo tSerialNo, ErrorStatus errSts) {

		List<TPackingB> result = null;

		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TAllocInstB();
		tPackingBCB.setupSelect_TPackingH();
		tPackingBCB.setupSelect_TPackingH().withTAllocInstH();

		//荷主ID（Client_ID）
		tPackingBCB.query().queryTPackingH().setClientId_Equal(tSerialNo.getClientId());
		//センタID（Center_ID）
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(tSerialNo.getCenterId());
		//出庫作業No.（Picking_Work_No）
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(tSerialNo.getPickingWorkNo());
		//出荷日（Shipping_Dt）
		tPackingBCB.query().queryTPackingH().queryTAllocInstH().setShippingDt_Equal(tSerialNo.getWorkDt() == null ? "" : tSerialNo.getWorkDt().replace("/", ""));
		//商品ID（Product_Id）
		tPackingBCB.query().queryTAllocInstB().setProductId_Equal(tSerialNo.getProductId());
		//納品先CD（SupplyCustomerCd）
		tPackingBCB.query().queryTPackingH().queryTAllocInstH().setSupplyCustomerCd_Equal(tSerialNo.getSupplyCustomerCd());

		result = tPackingBBhv.selectList(tPackingBCB);

		return result;
	}

	/**
	 * <h2>シリアルNo.管理テーブルを一括登録する。</h2>
	 * <pre>
	 * 引数のシリアルNo.管理テーブルを一括登録する。
	 * </pre>
	 * @param tSerialNoList シリアルNo.管理テーブルリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<TSerialNo> tSerialNoList, ErrorStatus errSts) {
		// =====シリアルNo.管理テーブル登録実行 =====
		tSerialNoBhv.batchInsert(tSerialNoList);
	}

	/**
	 * <h2>シリアルNo.管理テーブルを一括更新する。</h2>
	 * <pre>
	 * 引数のシリアルNo.管理テーブルを一括更新する。
	 * </pre>
	 * @param tSerialNoList シリアルNo.管理テーブルリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<TSerialNo> tSerialNoList, ErrorStatus errSts) {
		// =====シリアルNo.管理テーブル更新実行 =====
		for (TSerialNo tSerialNo : tSerialNoList) {
			tSerialNoBhv.update(tSerialNo);
		}
	}

	/**
	 * <h2>シリアルNo.管理テーブルを一括削除する。</h2>
	 * <pre>
	 * 引数のシリアルNo.管理テーブルを一括削除する。
	 * </pre>
	 * @param tSerialNoList シリアルNo.管理テーブルリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchDelete(List<TSerialNo> tSerialNoList, ErrorStatus errSts) {
		// =====シリアルNo.管理テーブル更新実行 =====
		tSerialNoBhv.batchDeleteNonstrict(tSerialNoList);
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
	 * <h2>区分値明細マスタデータを取得する。</h2>
	 * <pre>
	 * 引数の区分値CDをキーに、区分値明細マスタデータを取得する。
	 * </pre>
	 * @param classCd 区分値CD
	 * @return Map<String, String> 区分値明細マスタマップ
	 */
	public Map<String, String> getClassMapByCd(String classCd) {
		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		ListResultBean<BClassDtl> bClassDtl = bClassDtlBhv.selectList(cb);

		Map<String, String> retMap = new LinkedHashMap<String, String>();

		for (BClassDtl o : bClassDtl) {
			retMap.put(o.getClassDtlCd(), o.getVDict().getDictNm());
		}

		return retMap;
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
		if (CU.isNullOrEmpty(dateTime)) {
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

	/** 商品とシリアルNo.でキー */
	private static class SerialNoKey {

		private long productId;
		private String serialNo;

		SerialNoKey(long productId, String serialNo) {
			this.productId = productId;
			this.serialNo = serialNo;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (productId ^ (productId >>> 32));
			result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SerialNoKey other = (SerialNoKey) obj;
			if (productId != other.productId)
				return false;
			if (serialNo == null) {
				if (other.serialNo != null)
					return false;
			} else if (!serialNo.equals(other.serialNo))
				return false;
			return true;
		}
	}

	/**
	 * 入荷数、出荷数超過チェック用のキー
	 */
	private static class CheckOrverQuantityKey {

		private String manageNo;
		private long productId;

		CheckOrverQuantityKey(String manageNo, long productId) {
			this.manageNo = manageNo;
			this.productId = productId;
		}

		public String getManageNo() {
			return manageNo;
		}

		public long getProductId() {
			return productId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((manageNo == null) ? 0 : manageNo.hashCode());
			result = prime * result + (int) (productId ^ (productId >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CheckOrverQuantityKey other = (CheckOrverQuantityKey) obj;
			if (manageNo == null) {
				if (other.manageNo != null)
					return false;
			} else if (!manageNo.equals(other.manageNo))
				return false;
			if (productId != other.productId)
				return false;
			return true;
		}
	}

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka start
	/**
	 * <h2>取引先マスタ受信テーブル検索(シリアルNo.管理DTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @return セレクト件数
	 */
	public int getESerialCount(String receiveCd, String centerCd, String clientCd) {

		// 外出しSQLの定義
		String path = ESerialInputBhv.PATH_selectSqlESerialInputList;

		BsSqlESerialInputListPmb pmb = new BsSqlESerialInputListPmb();
		pmb.setClientCd(clientCd);
		pmb.setReceiveCd(receiveCd);
		pmb.setCenterCd(centerCd);
		pmb.setImportFlg("0");
		pmb.setCultureId(getCultureId());

		Class<SqlESerialInputList> entityType = SqlESerialInputList.class;

		return eSerialInputBhv.outsideSql().selectList(path, pmb, entityType).size();
	}
	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka end
}
