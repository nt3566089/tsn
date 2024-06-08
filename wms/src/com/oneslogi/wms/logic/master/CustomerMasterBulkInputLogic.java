package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlECustomerListPmb;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.ECustomerCB;
import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.dto.MCenterCustomerDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.customize.SqlECustomerListDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterCustomerDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.ECustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.ECustomer;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタ一括取込データ取得ロジッククラス
 */
public class CustomerMasterBulkInputLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 (全体見直し) 2016.08.01 kawana Start

	// ===== 使用テーブル =====
	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;
	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End
	@Inject
	private ECustomerBhv eCustomerBhv;

	// ===== 使用ロジック =====
	@Inject
	private CustomerMasterInsertLogic customerMasterInsertLogic;
	@Inject
	private CustomerMasterUpdateLogic customerMasterUpdateLogic;
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

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

	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
	/** 区分値マップ(キャッシュとして使用) */
	private Map<ClassKey, List<BClassDtl>> classListMap = new HashMap<ClassKey, List<BClassDtl>>();
	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End

	/** ログの書込み有無 */
	private OutputLog outputLog = OutputLog.FALSE;

	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param programCd プログラムCD
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字
	 */

	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param clientCd 荷主CD
	 */
	public void startLog(String receiveCd, String clientCd) {

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.CUSTOMER_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// [#169] メッセージの重複を削除 2016.12.05 kawana Start
		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_PARAMETER_CLIENT_CD_ONLY_INFORMATION, receiveCd, clientCd);
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
	 * @param eCustomerList 一括登録
	 */
	public void insertECustomer(List<ECustomer> eCustomerList) {
		eCustomerBhv.batchInsert(eCustomerList);
	}

	/**
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param receiveCd 受信CD
	 */
	public void checkError(String receiveCd) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<ECustomer> checkCustomerList = selectECustomerList(receiveCd);
		// 必須、文字数などのチェック
		int errCount = checkError(checkCustomerList, DbUpdateForError.TRUE);
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(receiveCd);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			int count = checkCustomerList.size();
			int errCountAll = errCount + errCountMaster;
			int normalCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION, String.valueOf(errCountAll), String.valueOf(normalCount));
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eCustomerList
	 * @param doUpdate
	 * @return エラー件数
	 */
	private int checkError(List<ECustomer> eCustomerList, DbUpdateForError doUpdate) {

		// 取引先CD重複チェック用
		Set<String> customerCdSet = new HashSet<String>();
		// エラー件数
		int errorCount = 0;

		for (ECustomer customer : eCustomerList) {

			// ===== 取引先CD チェック =====

			String customerCd = customer.getCustomerCd();
			if (CU.isNullOrEmpty(customerCd)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!matchePattern("^[0-9a-zA-Z\\-]*$", customerCd)) {
				// 文字エラー
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!matchePattern("[0-9a-zA-Z\\-]{1,10}$", customerCd)) {
				// 長さエラー
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_CODE_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (customerCdSet.contains(customerCd)) {
				// 重複エラー
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_CODE_DUPLICATE_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// 重複チェック用リストに追加
			customerCdSet.add(customerCd);

			// ===== 取引先名称 =====

			String customerNm = customer.getCustomerNm();
			if (CU.isNullOrEmpty(customerNm)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_NM_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
			if (!matchePattern(".{1,50}$", customerNm)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_NM_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 取引先略称 =====

			String customerAbbr = customer.getCustomerAbbr();
			if (CU.isNullOrEmpty(customerAbbr)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_ABBR_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
			if (!matchePattern(".{1,15}$", customerAbbr)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(customer, WmsMessageConst.CUSTOMER_ABBR_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 仕入先フラグ =====

			String vendorFlg = customer.getVendorFlg();
			if (CU.isNullOrEmpty(vendorFlg)) {
				// 必須エラー
				updateErrorExecute(customer, WmsMessageConst.VENDOR_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!existClass(vendorFlg, getClassList("VENDOR_FLG"))) {
				// 区分値エラー
				updateErrorExecute(customer, WmsMessageConst.VENDOR_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 納品先フラグ =====

			String deliveryFlg = customer.getDeliveryFlg();
			if (CU.isNullOrEmpty(deliveryFlg)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.DELIVERY_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!existClass(deliveryFlg, getClassList("DELIVERY_FLG"))) {
				// 区分値エラー
				updateErrorExecute(customer, WmsMessageConst.DELIVERY_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ワンタイムフラグ =====

			String onetimeFlg = customer.getOnetimeFlg();
			if (CU.isNullOrEmpty(onetimeFlg)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.ONETIME_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!existClass(onetimeFlg, getClassList("ONETIME_FLG"))) {
				// 区分値エラー
				updateErrorExecute(customer, WmsMessageConst.ONETIME_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 預託先フラグ =====

			String depositFlg = customer.getDepositFlg();

			if (CU.isNullOrEmpty(depositFlg)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.DEPOSIT_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!existClass(depositFlg, getClassList("DEPOSIT_FLG"))) {
				// 区分値エラー
				updateErrorExecute(customer, WmsMessageConst.DEPOSIT_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 郵便番号 =====

			String zipCd = customer.getZipCd();
			if (!CU.isNullOrEmpty(zipCd)) {
				if (!matchePattern("^[0-9]*$", zipCd)) {
					// 文字エラー
					//[#2143][ver2.1.0]エラー表示を預託フラグエラーから数値のみエラーに修正 2017.07.20 miyabe Start
					updateErrorExecute(customer, WmsMessageConst.ZIP_CD_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					//[#2143][ver2.1.0]エラー表示を預託フラグエラーから数値のみエラーに修正 2017.07.20 miyabe End
					errorCount++;
					continue;
				}

				if (!matchePattern("[0-9]{1,7}$", zipCd)) {
					// 長さエラー
					updateErrorExecute(customer, WmsMessageConst.ZIP_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 住所 =====

			String address1 = customer.getAddress1();
			if (!CU.isNullOrEmpty(address1)) {

				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!matchePattern(".{1,50}$", address1)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(customer, WmsMessageConst.ADDRESS1_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			String address2 = customer.getAddress2();
			if (!CU.isNullOrEmpty(address2)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!matchePattern(".{1,50}$", address2)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(customer, WmsMessageConst.ADDRESS2_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			String address3 = customer.getAddress3();
			if (!CU.isNullOrEmpty(address3)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!matchePattern(".{1,50}$", address3)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(customer, WmsMessageConst.ADDRESS3_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 電話番号 =====

			String telNo = customer.getTelNo();
			if (!CU.isNullOrEmpty(telNo)) {

				if (!matchePattern("^[0-9\\-]*$", telNo)) {
					// 文字エラー
					updateErrorExecute(customer, WmsMessageConst.TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!matchePattern("[0-9\\-]{1,15}$", telNo)) {
					// 長さエラー
					updateErrorExecute(customer, WmsMessageConst.TEL_NO_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu Start
			// ===== 引当順序 =====

			String allocOrder = customer.getAllocOrder();
			if (CU.isNullOrEmpty(allocOrder)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.ALLOC_ORDER_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!matchePattern("^(-)?\\d+(\\.\\d+)?$", allocOrder)) {
				// 文字エラー
				updateErrorExecute(customer, WmsMessageConst.ALLOC_ORDER_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!matchePattern("^(-)?[0-9]{1,5}+(\\.\\d+)?$", allocOrder)) {
				// 整数5桁以内
				updateErrorExecute(customer, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_INTEGER_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!matchePattern("^(-)?\\d+$", allocOrder)) {
				// 小数不可
				updateErrorExecute(customer, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (Long.parseLong(allocOrder) < 0) {
				// 最小0以上
				updateErrorExecute(customer, WmsMessageConst.ALLOC_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu End

			// ===== 出荷停止フラグ =====

			String shippingStopFlg = customer.getShippingStopFlg();
			if (CU.isNullOrEmpty(shippingStopFlg)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.SHIPPING_STOP_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!existClass(shippingStopFlg, getClassList("SHIPPING_STOP_FLG"))) {
				// 区分値エラー
				updateErrorExecute(customer, WmsMessageConst.SHIPPING_STOP_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ロット逆転防止フラグ =====
			// チェックなし

			// ===== 期限日逆転防止フラグ =====

			String limitDtReverseFlg = customer.getLimitDtReverseFlg();
			if (CU.isNullOrEmpty(limitDtReverseFlg)) {
				// 必須
				updateErrorExecute(customer, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			if (!existClass(limitDtReverseFlg, getClassList("LIMIT_DT_REVERSE_FLG"))) {
				// 区分値エラー
				updateErrorExecute(customer, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 配送コースCD =====

			String deliveryCourseCd = customer.getDeliveryCourseCd();
			if (!CU.isNullOrEmpty(deliveryCourseCd)) {

				if (!matchePattern("^[0-9a-zA-Z\\-]*$", deliveryCourseCd)) {
					// 文字エラー
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_COURSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!matchePattern(".{1,5}$", deliveryCourseCd)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_COURSE_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu Start
			// ===== 配送順 =====

			String deliveryOrder = customer.getDeliveryOrder();
			if (!CU.isNullOrEmpty(deliveryOrder)) {
				// [Ver3.0][#4292] 正規表現の変更 2018.04.11 shimizu Start
				if (!matchePattern("^(-)?\\d+(\\.\\d+)?$", deliveryOrder)) {
					// 文字エラー
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_ORDER_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!matchePattern("^(-)?[0-9]{1,5}+(\\.\\d+)?$", deliveryOrder)) {
					// 整数5桁以内
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_ORDER_CHECK_INPUT_INTEGER_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!matchePattern("^(-)?\\d+$", deliveryOrder)) {
					// 小数不可
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_ORDER_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (Long.valueOf(deliveryOrder) < 1) {
					// 最小1以上
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_ORDER_INPUT_REQUEST_MIN_IS_ONE_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4292] 正規表現の変更 2018.04.11 shimizu End
			}
			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu End

			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu Start
			// ===== 配送リードタイム =====

			String deliveryReadtime = customer.getDeliveryReadtime();
			if (!CU.isNullOrEmpty(deliveryReadtime)) {
				// [Ver3.0][#4292] 正規表現の変更 2018.04.11 shimizu Start
				if (!matchePattern("^(-)?\\d+(\\.\\d+)?$", deliveryReadtime)) {
					// 文字エラー
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_READTIME_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!matchePattern("^(-)?[0-9]{1,5}+(\\.\\d+)?$", deliveryReadtime)) {
					// 整数5桁以内
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_READTIME_CHECK_INPUT_INTEGER_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (!matchePattern("^(-)?\\d+$", deliveryReadtime)) {
					// 小数不可
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_READTIME_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
					errorCount++;
					continue;
				}

				if (Long.valueOf(deliveryReadtime) < 1) {
					// 最小1以上
					updateErrorExecute(customer, WmsMessageConst.DELIVERY_READ_TIME_INPUT_REQUEST_MIN_IS_ONE_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4292] 正規表現の変更 2018.04.11 shimizu End
			}
			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu End

			// エラー無を設定
			updateNormalExecute(customer, WmsMessageConst.DELIVERY_READTIME_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
		}

		return errorCount;
	}

	/**
	 * <h2>関連マスタ存在チェック.</h2>
	 * @param receiveCd 受信CD
	 * @return
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Mod Start
//	private int checkErrorMaster(String receiveCd) {
	public int checkErrorMaster(String receiveCd) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Mod End

		int zipCdExistsCheckFlg = getPropertyIntValue(WmsPropertyConst.ZIP_CD_EXISTS_CHECK_FLG);

		int errorCount = 0;

		List<MCenterCustomerDto> checkList = selectAndConvertECustomerList(receiveCd, SelectCls.NO_ERROR_ONLY);
		for (MCenterCustomerDto dto : checkList) {

			if (zipCdExistsCheckFlg == 1) {

				if (!CU.isNullOrEmpty(dto.getMCustomer().getZipCd()) && dto.getMCustomer().getZipId() == null) {
					// 郵便番号マスタ未存在
					updateErrorExecute(eCustomerBhv.selectByPKValue(dto.getCustomerRevieceId()), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR, DbUpdateForError.TRUE);
					errorCount++;
					continue;
				}
			}

			if (!CU.isNullOrEmpty(dto.getMDeliveryCourse().getDeliveryCourseCd()) && dto.getMDeliveryCourse().getDeliveryCourseId() == null) {

				// [#169] メッセージの重複を削除 2016.12.05 kawana Start
				// 配送コースマスタ未存在
				updateErrorExecute(eCustomerBhv.selectByPKValue(dto.getCustomerRevieceId()), WmsMessageConst.DELIVERY_COURSE_CD_NOT_FOUND_ERROR, DbUpdateForError.TRUE);
				// [#169] メッセージの重複を削除 2016.12.05 kawana End
				errorCount++;
				continue;
			}

		}

		return errorCount;
	}

	/**
	 * <h2>取引先マスタ受信テーブルのエラー設定.</h2>
	 */
	private void updateErrorExecute(ECustomer eCustomer, String errorMessageCd, DbUpdateForError doUpdate) {
		eCustomer.setErrorFlg("1");
		eCustomer.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eCustomerBhv.update(eCustomer);
		}
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eCustomer.getReceiveRowId()), errorMessageCd);
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
	}

	/**
	 * <h2>取引先マスタ受信テーブルのエラー無し設定.</h2>
	 */
	private void updateNormalExecute(ECustomer eCustomer, String deliveryReadtimeCheckInputDecimalError, DbUpdateForError doUpdate) {
		eCustomer.setErrorFlg("0");
		eCustomer.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eCustomerBhv.update(eCustomer);
		}
	}

	/**
	 * <h2>ファイル取込データから取引先マスタ受信テーブルのエンティティに変換.</h2>
	 * @param mCenter センタマスタ
	 * @param mClient 荷主マスタ
	 * @param customerList 取込取引先マスタリスト
	 * @param receiveCd 設定する受信CD
	 * @return 取引先マスタ受信テーブルのリスト
	 */
	public List<ECustomer> convertECustomer(MCenter mCenter, MClient mClient, List<MCenterCustomerDto> customerList, String receiveCd) {

		List<ECustomer> eCustomerList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < customerList.size(); row++) {

			MCenterCustomerDto data = customerList.get(row);
			ECustomer eCustomer = new ECustomer();
			eCustomer.setCenterCd(mCenter.getCenterCd());
			eCustomer.setClientCd(mClient.getClientCd());
			eCustomer.setReceiveRowId(Long.valueOf(row + 1));
			eCustomer.setReceiveCd(receiveCd);
			eCustomer.setImportFlg("0");
			eCustomer.setErrorFlg("0");
			String customerCd = data.getMCustomer().getCustomerCd();
			eCustomer.setCustomerCd(customerCd);
			String customerNm = data.getMCustomer().getCustomerNm();
			eCustomer.setCustomerNm(customerNm);
			String customerAbbr = data.getMCustomer().getCustomerAbbr();
			eCustomer.setCustomerAbbr(customerAbbr);
			String vendorFlg = data.getMCustomer().getVendorFlg();
			eCustomer.setVendorFlg(vendorFlg);
			String deliveryFlg = data.getMCustomer().getDeliveryFlg();
			eCustomer.setDeliveryFlg(deliveryFlg);
			String onetimeFlg = data.getMCustomer().getOnetimeFlg();
			eCustomer.setOnetimeFlg(onetimeFlg);
			String depositFlg = data.getMCustomer().getDepositFlg();
			eCustomer.setDepositFlg(depositFlg);
			String zipCd = data.getMCustomer().getZipCd();
			eCustomer.setZipCd(zipCd);
			String address1 = data.getMCustomer().getAddress1();
			eCustomer.setAddress1(address1);
			String address2 = data.getMCustomer().getAddress2();
			eCustomer.setAddress2(address2);
			String address3 = data.getMCustomer().getAddress3();
			eCustomer.setAddress3(address3);
			String telNo = data.getMCustomer().getTelNo();
			eCustomer.setTelNo(telNo);
			String allocOrder = (data.getMCustomer().getAllocOrder() == null ? "" : CU.convertNumberToString(data.getMCustomer().getAllocOrder()));
			eCustomer.setAllocOrder(allocOrder);
			String shippingStopFlg = data.getMCustomer().getShippingStopFlg();
			eCustomer.setShippingStopFlg(shippingStopFlg);
			String lotReverseFlg = data.getMCustomer().getLotReverseFlg();
			eCustomer.setLotReverseFlg(lotReverseFlg);
			String limitDtReverseFlg = data.getMCustomer().getLimitDtReverseFlg();
			eCustomer.setLimitDtReverseFlg(limitDtReverseFlg);
			String deliveryCourseCd = data.getMDeliveryCourse().getDeliveryCourseCd();
			eCustomer.setDeliveryCourseCd(deliveryCourseCd);
			String deliveryOrder = (data.getDeliveryOrder() == null ? "" : CU.convertNumberToString(data.getDeliveryOrder()));
			eCustomer.setDeliveryOrder(deliveryOrder);
			String deliveryReadtime = (data.getDeliveryReadTime() == null ? "" : CU.convertNumberToString(data.getDeliveryReadTime()));
			eCustomer.setDeliveryReadtime(deliveryReadtime);
			eCustomerList.add(eCustomer);
		}

		return eCustomerList;
	}

	/**
	 * <h2>取引先マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<ECustomer> selectECustomerList(String receiveCd) {

		ECustomerCB cb = eCustomerBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eCustomerBhv.selectList(cb);
	}

	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add Start
	/**
	 * <h2>取引先マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<ECustomer> selectECustomerList(String receiveCd, SelectCls cls) {

		ECustomerCB cb = eCustomerBhv.newMyConditionBean();

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

		return eCustomerBhv.selectList(cb);
	}
	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add End

	/**
	 * <h2>取引先マスタ受信テーブル検索(センタ取引先マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<MCenterCustomerDto> selectAndConvertECustomerList(String receiveCd, SelectCls cls) {
		return selectAndConvertECustomerList(receiveCd, null, cls);
	}

	/**
	 * <h2>取引先マスタ受信テーブル検索(センタ取引先マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param paging ページング設定
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<MCenterCustomerDto> selectAndConvertECustomerList(String receiveCd, PagingData paging, SelectCls cls) {

		String path = ECustomerBhv.PATH_selectSqlECustomerList;

		BsSqlECustomerListPmb pmb = new BsSqlECustomerListPmb();
		pmb.setReceiveCd(receiveCd);

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

		Class<SqlECustomerListDto> entityType = SqlECustomerListDto.class;

		List<SqlECustomerListDto> sqlDtoList;
		if (paging != null) {
			sqlDtoList = super.selectPage(eCustomerBhv, path, pmb, entityType, paging);
		} else {
			sqlDtoList = super.selectList(eCustomerBhv, path, pmb, entityType);
		}

		List<MCenterCustomerDto> result = new ArrayList<>();

		for (SqlECustomerListDto searchDto : sqlDtoList) {

			MCenterCustomerDto mCenterCustomerDto = new MCenterCustomerDto();
			mCenterCustomerDto.setCustomerRevieceId(searchDto.getCustomerId());
			mCenterCustomerDto.setLineNo(CU.convertNumberToString(searchDto.getReceiveRowId()));
			mCenterCustomerDto.setErrorFlg(searchDto.getErrorFlg());
			mCenterCustomerDto.setErrorMessageCd(searchDto.getErrorMessageCd());
			mCenterCustomerDto.setErrorMessageNm(searchDto.getMessageNm());
			MCustomerDto mCustomerDto = new MCustomerDto();

			mCustomerDto.setCustomerId(searchDto.getMcuCustomerId());

			MClientDto mClientDto = new MClientDto();
			mClientDto.setClientId(searchDto.getClientId());
			mClientDto.setClientCd(searchDto.getClientCd());
			mClientDto.setClientNm(searchDto.getClientNm());
			mCustomerDto.setMClient(mClientDto);
			mCustomerDto.setClientId(searchDto.getClientId());

			mCustomerDto.setCustomerCd(searchDto.getCustomerCd());
			mCustomerDto.setCustomerNm(searchDto.getCustomerNm());
			mCustomerDto.setCustomerAbbr(searchDto.getCustomerAbbr());

			mCustomerDto.setVendorFlg(searchDto.getVendorFlg());
			// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
			mCustomerDto.setVendorFlgNm(getClassDtlDisplayStr(getClassList("VENDOR_FLG"), searchDto.getVendorFlg()));

			mCustomerDto.setDeliveryFlg(searchDto.getDeliveryFlg());
			mCustomerDto.setDeliveryFlgNm(getClassDtlDisplayStr(getClassList("DELIVERY_FLG"), searchDto.getDeliveryFlg()));

			mCustomerDto.setOnetimeFlg(searchDto.getOnetimeFlg());
			mCustomerDto.setOnetimeFlgNm(getClassDtlDisplayStr(getClassList("ONETIME_FLG"), searchDto.getOnetimeFlg()));

			mCustomerDto.setDepositFlg(searchDto.getDepositFlg());
			mCustomerDto.setDepositFlgNm(getClassDtlDisplayStr(getClassList("DEPOSIT_FLG"), searchDto.getDepositFlg()));
			// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End

			mCustomerDto.setAddress1((CU.isNullOrEmpty(searchDto.getAddress1()) && CU.isNullOrEmpty(searchDto.getAddress2()) && CU.isNullOrEmpty(searchDto.getAddress3())) ? searchDto.getZipAddress1()
					: searchDto.getAddress1());
			mCustomerDto.setAddress2((CU.isNullOrEmpty(searchDto.getAddress1()) && CU.isNullOrEmpty(searchDto.getAddress2()) && CU.isNullOrEmpty(searchDto.getAddress3())) ? searchDto.getZipAddress2()
					: searchDto.getAddress2());
			mCustomerDto.setAddress3((CU.isNullOrEmpty(searchDto.getAddress1()) && CU.isNullOrEmpty(searchDto.getAddress2()) && CU.isNullOrEmpty(searchDto.getAddress3())) ? searchDto.getZipAddress3()
					: searchDto.getAddress3());
			mCustomerDto.setZipCd(searchDto.getZipCd());
			mCustomerDto.setZipId(searchDto.getMzZipId());
			mCustomerDto.setTelNo(searchDto.getTelNo());
			mCustomerDto.setAllocOrder(CU.isNullOrEmpty(searchDto.getAllocOrder()) ? null : Long.parseLong(searchDto.getAllocOrder()));

			// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
			mCustomerDto.setShippingStopFlg(searchDto.getShippingStopFlg());
			mCustomerDto.setShippingStopFlgNm(getClassDtlDisplayStr(getClassList("SHIPPING_STOP_FLG"), searchDto.getShippingStopFlg()));

			mCustomerDto.setLimitDtReverseFlg(searchDto.getLimitDtReverseFlg());
			mCustomerDto.setLimitDtReverseFlgNm(getClassDtlDisplayStr(getClassList("LIMIT_DT_REVERSE_FLG"), searchDto.getLimitDtReverseFlg()));
			// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End

			mCustomerDto.setDelFlg("0");
			mCustomerDto.setVersionNo(searchDto.getMcuVersionNo());

			mCenterCustomerDto.setMCustomer(mCustomerDto);
			mCenterCustomerDto.setCustomerId(searchDto.getMcuCustomerId());

			MDeliveryCourseDto mDeliveryCourse = new MDeliveryCourseDto();
			mDeliveryCourse.setDeliveryCourseCd(searchDto.getDeliveryCourseCd());
			mDeliveryCourse.setDeliveryCourseNm(searchDto.getDeliveryCourseNm());
			mDeliveryCourse.setDeliveryCourseId(searchDto.getDeliveryCourseId());
			mDeliveryCourse.setVersionNo(searchDto.getMdcVersionNo());
			mCenterCustomerDto.setMDeliveryCourse(mDeliveryCourse);
			mCenterCustomerDto.setDeliveryCourseId(searchDto.getDeliveryCourseId());

			MCenterDto mCenterDto = new MCenterDto();
			mCenterDto.setCenterId(searchDto.getCenterId());
			mCenterDto.setCenterCd(searchDto.getCenterCd());
			mCenterDto.setCenterNm(searchDto.getCenterNm());
			mCenterCustomerDto.setMCenter(mCenterDto);
			mCenterCustomerDto.setCenterId(searchDto.getCenterId());

			mCenterCustomerDto.setDeliveryOrder(CU.isNullOrEmpty(searchDto.getDeliveryOrder()) ? null : Long.parseLong(searchDto.getDeliveryOrder()));
			mCenterCustomerDto.setDeliveryReadTime(CU.isNullOrEmpty(searchDto.getDeliveryReadtime()) ? null : Long.parseLong(searchDto.getDeliveryReadtime()));

			mCenterCustomerDto.setDelFlg("0");

			if (mCenterCustomerDto.getCenterId() != null &&
					mCenterCustomerDto.getCustomerId() != null ) {
				// [Ver3.0][#4625] 配送先情報の除去対応 2018.05.18 shimizu
				// センタ取引先マスタ検索
				MCenterCustomerCB mccCb = mCenterCustomerBhv.newMyConditionBean();
				mccCb.checkInvalidQuery();
				mccCb.query().setCenterId_Equal(mCenterCustomerDto.getCenterId());
				mccCb.query().setCustomerId_Equal(mCenterCustomerDto.getCustomerId());
				// [Ver3.0][#4625] 配送先情報の除去対応 2018.05.18 shimizu
				mccCb.query().addOrderBy_CenterCustomerId_Desc();
				mccCb.fetchFirst(1);

				MCenterCustomer mcc = mCenterCustomerBhv.selectEntity(mccCb);
				if (mcc != null) {
					mCenterCustomerDto.setCenterCustomerId(mcc.getCenterCustomerId());
					mCenterCustomerDto.setVersionNo(mcc.getVersionNo());
				}
			}

			result.add(mCenterCustomerDto);
		}

		return result;
	}

	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
	/**
	 * <h2>区分値 表示文字列の取得。</h2>
	 *
	 * @param list 区分値明細マスタのリスト
	 * @param classDtlCd 区分値明細CD(区分値の値)
	 * @return String 表示文字列 「区分値明細CD:区分値明細名称」
	 */
	private String getClassDtlDisplayStr(List<BClassDtl> list, String classDtlCd) {
		String result = "";
		if (CU.isNullOrEmpty(classDtlCd)) {
			return result;
		}
		for (BClassDtl mCenterClassDtl : list) {
			if (classDtlCd.equals(mCenterClassDtl.getClassDtlCd())) {
				result = classDtlCd + ":" + mCenterClassDtl.getVDict().getDictNm();
				break;
			}
		}
		if (CU.isNullOrEmpty(result)) {
			return classDtlCd;
		}
		return result;
	}
	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End

	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 */
	private boolean matchePattern(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
	/**
	 * 区分値が存在するかのチェック.
	 * 値が空の場合はtrueを返す
	 * @return true:区分値が存在または空文字
	 */
	private boolean existClass(String classValue, List<BClassDtl> classList) {

		if (CU.isNullOrEmpty(classValue)) {
			return true;
		}

		for (BClassDtl classDtl : classList) {
			if (classValue.equals(classDtl.getClassDtlCd())) {
				return true;
			}
		}

		return false;
	}
	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End

	/**
	 * <h2>取引先マスタ一括登録.</h2>
	 * @param receiveCd 受信CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(String receiveCd, ErrorStatus errSts) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		List<MCenterCustomerDto> customerMaster = selectAndConvertECustomerList(receiveCd, SelectCls.NO_ERROR_ONLY);
		if (customerMaster.size() < 1) {
			getErrorManager().add(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			if (outputLog == OutputLog.TRUE) {
				// ログ書込

				getDatabaseLogger().addErrorLogDtl(WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
				getDatabaseLogger().endLogDtl();
				endFailureLog();
			}
			return;
		}

		MCustomerDtoMapper customerMapper = new MCustomerDtoMapper();
		MCenterCustomerDtoMapper centerCustomerDtoMapper = new MCenterCustomerDtoMapper();

		int insertCount = 0;
		int updateCount = 0;

		List<MCenterCustomer> mCenterCustomer = new ArrayList<MCenterCustomer>();

		// [C-CWMS-0039] センタ間移動機能を追加(不要な処理を削除) 2015.09.17 kawana

		//一覧データ件数分ループ
		for (int row = 0; row < customerMaster.size(); row++) {
			MCenterCustomerDto data = customerMaster.get(row);

			//センタ取引先マスタマスタをエンティティに変換
			MCenterCustomer wCenterCustomer = centerCustomerDtoMapper.mappingToEntity(data);
			//取引先マスタをエンティティに変換
			MCustomer mCustomer = customerMapper.mappingToEntity(data.getMCustomer());

			mCenterCustomer.clear();
			mCenterCustomer.add(wCenterCustomer);

			// 取引先IDがNULL(マスタ未登録)の場合、取引先マスタ登録、登録済みの場合は取引先マスタ更新
			if (mCustomer.getCustomerId() == null) {
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
				// 取引先マスタ登録メソッドを呼出し
				customerMasterInsertLogic.insert(mCustomer, mCenterCustomer, errRetSts(errSts, row));
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
				insertCount++;
			} else {
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
				// 取引先マスタ更新メソッドを呼出し
				customerMasterUpdateLogic.update(mCustomer, mCenterCustomer, errRetSts(errSts, row));
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
				updateCount++;
			}
			if (0 < getErrorManager().size()) {
				return;
			}

			// 取込フラグ更新
			ECustomerCB eCustomerUpdateCb = eCustomerBhv.newMyConditionBean();
			eCustomerUpdateCb.query().setCustomerId_Equal(data.getCustomerRevieceId());

			ECustomer eCustomerUpdateEntity = new ECustomer();
			eCustomerUpdateEntity.setImportFlg("1");
			eCustomerBhv.queryUpdate(eCustomerUpdateEntity, eCustomerUpdateCb);
		}

		// [#1853] 正常メッセージが2件出力される問題を修正([#665]で追加した問題のコードを削除) 2017.06.06 kawana

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_INFORMATION, String.valueOf(insertCount), String.valueOf(updateCount));
			getDatabaseLogger().endLogDtl();
		}
	}

	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod Start
	/**
	 * <h2>区分値マスタ取得。</h2>
	 * <pre>
	 * 区分値マスタ明細情報を取得する
	 * </pre>
	 * @param classCd クラスCD
	 * @return List<BClassDtl> 区分値マスタ明細情報
	 */
	private List<BClassDtl> getClassList(String classCd) {

		if (CU.isNullOrEmpty(classCd)) {
			return new ArrayList<BClassDtl>();
		}

		ClassKey key = new ClassKey(classCd);
		if (classListMap.containsKey(key)) {
			return classListMap.get(key);
		}

		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		List<BClassDtl> bClassDtlList = bClassDtlBhv.selectList(cb);

		classListMap.put(key, bClassDtlList);

		return bClassDtlList;
	}

	/** 区分値キークラス */
	private static class ClassKey {
		private String classCd;

		public ClassKey(String classCd) {
			this.classCd = classCd;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((classCd == null) ? 0 : classCd.hashCode());
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
			ClassKey other = (ClassKey) obj;
			if (classCd == null) {
				if (other.classCd != null)
					return false;
			} else if (!classCd.equals(other.classCd))
				return false;
			return true;
		}
	}
	// [#3615] 区分値マスタ存在チェック処理不正(取引先マスタ一括取込) 2018.02.05 honma Mod End

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 (全体見直し) 2016.08.01 kawana End

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>取引先マスタ受信テーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @return int セレクト件数
	 */
	public int getECustomerCount(String receiveCd) {

		String path = ECustomerBhv.PATH_selectSqlECustomerList;

		BsSqlECustomerListPmb pmb = new BsSqlECustomerListPmb();
		pmb.setReceiveCd(receiveCd);
		pmb.setImportFlg("0");
		pmb.setCultureId(getCultureId());

		Class<SqlECustomerListDto> entityType = SqlECustomerListDto.class;

		return eCustomerBhv.outsideSql().selectList(path, pmb, entityType).size();
	}

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}