package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.cbean.EZipCB;
import com.oneslogi.base.dbflute.dto.customize.SqlEZipListDto;
import com.oneslogi.base.dbflute.exbhv.EZipBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlEZipListPmb;
import com.oneslogi.base.dbflute.exentity.EZip;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.customize.SqlEZipList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.ZipMasterBulkInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.ZipLogic;

public class ZipMasterBulkInputLogic extends AbstractWmsLogic {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {

		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;

		/**
		 * 郵便番号マスタ登録異常
		 */
		protected static final int ZIP_MASTER_INSERT_FAILED = 1;

		/**
		 * 警告終了
		 */
		protected static final int WARN_INFORMATION = 21;
	}

	// ===== 使用テーブル =====v
	@Inject
	private EZipBhv eZipBhv;

	@Inject
	private ZipLogic zipLogic;

	@Inject
	private CenterClassLogic centerClassLogic;

	@Inject
	private ZipMasterInsertLogic insertLogic;

	@Inject
	private ZipMasterUpdateLogic updateLogic;

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
	 * 正規表現処理方法。
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 */
	private boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	/**
	 * <h2>郵便番号マスタ受信テーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @param cls エラー検索区分
	 * @return List<SqlEZipList> 郵便番号マスタ受信テーブル
	 */
	public List<SqlEZipList> getEZipList(String receiveCd, SqlEZipListDto header, PagingData paging, SelectCls cls) {

		// フラグ1～4
		Map<String, String> zipFlgMap = centerClassLogic.getClassMapByCd("ZIP_FLG");
		// 更新区分
		Map<String, String> updTypeMap = centerClassLogic.getClassMapByCd("UPD_TYPE");
		// 変更理由
		Map<String, String> reasonTypeMap = centerClassLogic.getClassMapByCd("REASON_TYPE");
		// フラグ5
		Map<String, String> codeTypeMap = centerClassLogic.getClassMapByCd("CODE_TYPE");
		// フラグ6
		Map<String, String> codeFlgMap = centerClassLogic.getClassMapByCd("CODE_FLG");
		// 修正コード
		Map<String, String> updCdMap = centerClassLogic.getClassMapByCd("UPD_CD");
		// 大口事業所フラグ
		Map<String, String> companyFlgMap = centerClassLogic.getClassMapByCd("COMPANY_FLG");

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 外出しSQLの定義
		String path = EZipBhv.PATH_selectSqlEZipList;

		SqlEZipListPmb pmb = new SqlEZipListPmb();

		pmb.setReceiveCd(receiveCd == null ? "0" : receiveCd);
		pmb.setCultureId(getCultureId());

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

		Class<SqlEZipList> entityType = SqlEZipList.class;

		List<SqlEZipList> sqlDtoList = null;

		sqlDtoList = selectWork(path, pmb, entityType, paging);

		for (SqlEZipList sqlEZipList2 : sqlDtoList) {

			sqlEZipList2.setLineNo(CU.convertNumberToString(sqlEZipList2.getReceiveRowId()));

			if (!CU.isNullOrEmpty(sqlEZipList2.getFlg1())) {
				if (!zipFlgMap.containsKey(sqlEZipList2.getFlg1())) {
					sqlEZipList2.setFlg1Nm(sqlEZipList2.getFlg1());
				} else {
					sqlEZipList2.setFlg1Nm(sqlEZipList2.getFlg1() + ":" + zipFlgMap.get(sqlEZipList2.getFlg1()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getFlg2())) {
				if (!zipFlgMap.containsKey(sqlEZipList2.getFlg2())) {
					sqlEZipList2.setFlg2Nm(sqlEZipList2.getFlg2());
				} else {
					sqlEZipList2.setFlg2Nm(sqlEZipList2.getFlg2() + ":" + zipFlgMap.get(sqlEZipList2.getFlg2()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getFlg3())) {
				if (!zipFlgMap.containsKey(sqlEZipList2.getFlg3())) {
					sqlEZipList2.setFlg3Nm(sqlEZipList2.getFlg3());
				} else {
					sqlEZipList2.setFlg3Nm(sqlEZipList2.getFlg3() + ":" + zipFlgMap.get(sqlEZipList2.getFlg3()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getFlg4())) {
				if (!zipFlgMap.containsKey(sqlEZipList2.getFlg4())) {
					sqlEZipList2.setFlg4Nm(sqlEZipList2.getFlg4());
				} else {
					sqlEZipList2.setFlg4Nm(sqlEZipList2.getFlg4() + ":" + zipFlgMap.get(sqlEZipList2.getFlg4()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getUpdType())) {
				if (!updTypeMap.containsKey(sqlEZipList2.getUpdType())) {
					sqlEZipList2.setUpdTypeNm(sqlEZipList2.getUpdType());
				} else {
					sqlEZipList2.setUpdTypeNm(sqlEZipList2.getUpdType() + ":" + updTypeMap.get(sqlEZipList2.getUpdType()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getReasonType())) {
				if (!reasonTypeMap.containsKey(sqlEZipList2.getReasonType())) {
					sqlEZipList2.setReasonTypeNm(sqlEZipList2.getReasonType());
				} else {
					sqlEZipList2.setReasonTypeNm(sqlEZipList2.getReasonType() + ":" + reasonTypeMap.get(sqlEZipList2.getReasonType()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getFlg5())) {
				if (!codeTypeMap.containsKey(sqlEZipList2.getFlg5())) {
					sqlEZipList2.setFlg5Nm(sqlEZipList2.getFlg5());
				} else {
					sqlEZipList2.setFlg5Nm(sqlEZipList2.getFlg5() + ":" + codeTypeMap.get(sqlEZipList2.getFlg5()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getFlg6())) {
				if (!codeFlgMap.containsKey(sqlEZipList2.getFlg6())) {
					sqlEZipList2.setFlg6Nm(sqlEZipList2.getFlg6());
				} else {
					sqlEZipList2.setFlg6Nm(sqlEZipList2.getFlg6() + ":" + codeFlgMap.get(sqlEZipList2.getFlg6()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getUpdCd())) {
				if (!updCdMap.containsKey(sqlEZipList2.getUpdCd())) {
					sqlEZipList2.setUpdCdNm(sqlEZipList2.getUpdCd());
				} else {
					sqlEZipList2.setUpdCdNm(sqlEZipList2.getUpdCd() + ":" + updCdMap.get(sqlEZipList2.getUpdCd()));
				}
			}

			if (!CU.isNullOrEmpty(sqlEZipList2.getCompanyFlg())) {
				if (!companyFlgMap.containsKey(sqlEZipList2.getCompanyFlg())) {
					sqlEZipList2.setCompanyFlgNm(sqlEZipList2.getCompanyFlg());
				} else {
					sqlEZipList2.setCompanyFlgNm(sqlEZipList2.getCompanyFlg() + ":" + companyFlgMap.get(sqlEZipList2.getCompanyFlg()));
				}
			}
		}

		return sqlDtoList;
	}

	/**
	 * <h2>郵便番号マスタ受信テーブルにレコードを一緒に新規する。</h2>
	 * <pre>
	 * 郵便番号マスタ受信テーブルにレコードを一緒に新規する。
	 * </pre>
	 *
	 * @param eZipList 新規したいレコードリスト
	 */
	public void batchInsert(List<EZip> eZipList) {
		for (EZip eZip : eZipList) {
			eZipBhv.insert(eZip);
		}
	}

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
	public void startLog(String receiveCd, String uploadZipType) {

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.ZIP_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// ログ開始
		getDatabaseLogger().startLog();

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_ZIP_PARAMETER_INFORMATION, receiveCd, uploadZipType);
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
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param zipMasterBulkInputDto 郵便番号マスタ一括取込画面用DTO
	 */
	public void checkError(ZipMasterBulkInputDto zipMasterBulkInputDto) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<EZip> checkZipList = selectEZipList(zipMasterBulkInputDto.data.receiveCd);
		// 必須、文字数などのチェック
		int errCount = checkError(checkZipList, DbUpdateForError.TRUE);
		//マスタチェックは不要
		// 郵便番号マスタの登録/更新チェック
		//int errCountZipMaster = checkErrorZipMaster(zipMasterBulkInputDto);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			int count = checkZipList.size();
			int errCountAll = errCount;
			int normalCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION, String.valueOf(errCountAll), String.valueOf(normalCount));
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eZipList 郵便番号マスタ受信テーブルリスト
	 * @param clientCd 荷主CD
	 * @param doUpdate
	 * @return エラー件数
	 */
	private int checkError(List<EZip> eZipList, DbUpdateForError doUpdate) {

		// フラグ1～4
		Map<String, String> zipFlgMap = centerClassLogic.getClassMapByCd("ZIP_FLG");
		// 更新区分
		Map<String, String> updTypeMap = centerClassLogic.getClassMapByCd("UPD_TYPE");
		// 変更理由
		Map<String, String> reasonTypeMap = centerClassLogic.getClassMapByCd("REASON_TYPE");
		// フラグ5
		Map<String, String> codeTypeMap = centerClassLogic.getClassMapByCd("CODE_TYPE");
		// フラグ6
		Map<String, String> codeFlgMap = centerClassLogic.getClassMapByCd("CODE_FLG");
		// 修正コード
		Map<String, String> updCdMap = centerClassLogic.getClassMapByCd("UPD_CD");
		// 大口事業所フラグ
		Map<String, String> companyFlgMap = centerClassLogic.getClassMapByCd("COMPANY_FLG");

		// エラー件数
		int errorCount = 0;

		for (EZip eZip : eZipList) {

			// ===== 郵便番号CD チェック =====

			// 必須
			if (CU.isNullOrEmpty(eZip.getZipCd())) {
				updateErrorExecute(eZip, WmsMessageConst.ZIP_CODE_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 文字種エラー
			if (!checkExcelCellInput("^[0-9]*$", eZip.getZipCd())) {
				updateErrorExecute(eZip, WmsMessageConst.ZIP_CD_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 長さエラー
			if (!checkExcelCellInput(".{1,7}$", eZip.getZipCd())) {
				updateErrorExecute(eZip, WmsMessageConst.ZIP_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 都道府県、市区町村、町域 =====
			// 必須複合チェック
			if (CU.isNullOrEmpty(eZip.getAddress1()) && CU.isNullOrEmpty(eZip.getAddress2()) && CU.isNullOrEmpty(eZip.getAddress3())) {
				updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_CHECK_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 全国地方公共団体コード チェック =====

			if (!CU.isNullOrEmpty(eZip.getPublicCd())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[0-9]*$", eZip.getPublicCd())) {
					updateErrorExecute(eZip, WmsMessageConst.PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,5}$", eZip.getPublicCd())) {
					updateErrorExecute(eZip, WmsMessageConst.PUBLIC_CD_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 旧郵便番号 チェック =====

			if (!CU.isNullOrEmpty(eZip.getZipCd5())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[0-9]*$", eZip.getZipCd5().trim())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_CD5_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,5}$", eZip.getZipCd5().trim())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_CD5_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 都道府県カナ チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddressKn1())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[ -~｡-ﾟ]*$", eZip.getAddressKn1())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_KN1_CHECK_HALF_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,76}$", eZip.getAddressKn1())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_KN1_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 市区町村カナ チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddressKn2())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[ -~｡-ﾟ]*$", eZip.getAddressKn2())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_KN2_CHECK_HALF_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,76}$", eZip.getAddressKn2())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_KN2_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 町域カナ チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddressKn3())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[ -~｡-ﾟ]*$", eZip.getAddressKn3())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_KN3_CHECK_HALF_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,76}$", eZip.getAddressKn3())) {
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS_KN3_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 大口事務所名カナ チェック =====

			if (!CU.isNullOrEmpty(eZip.getCompanyKn())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[ -~｡-ﾟ]*$", eZip.getCompanyKn())) {
					updateErrorExecute(eZip, WmsMessageConst.COMPANY_KN_CHECK_HALF_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,100}$", eZip.getCompanyKn())) {
					updateErrorExecute(eZip, WmsMessageConst.COMPANY_KN_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 都道府県 チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddress1())) {
				if (!checkExcelCellInput("^[^ -~｡-ﾟ]*$", eZip.getAddress1())) {
					// 文字種エラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS1_CHECK_FULL_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput(".{1,38}$", eZip.getAddress1())) {
					// 長さエラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS1_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 市区町村 チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddress2())) {
				if (!checkExcelCellInput("^[^ -~｡-ﾟ]*$", eZip.getAddress2())) {
					// 文字種エラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS2_CHECK_FULL_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput(".{1,38}$", eZip.getAddress2())) {
					// 長さエラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS2_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 町域 チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddress3())) {
				if (!checkExcelCellInput("^[^ -~｡-ﾟ]*$", eZip.getAddress3())) {
					// 文字種エラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS3_CHECK_FULL_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput(".{1,38}$", eZip.getAddress3())) {
					// 長さエラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS3_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 小字 チェック =====

			if (!CU.isNullOrEmpty(eZip.getAddress4())) {
				if (!checkExcelCellInput("^[^ -~｡-ﾟ]*$", eZip.getAddress4())) {
					// 文字種エラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS4_CHECK_FULL_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput(".{1,62}$", eZip.getAddress4())) {
					// 長さエラー
					updateErrorExecute(eZip, WmsMessageConst.ZIP_ADDRESS4_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 大口事業所名 チェック =====

			if (!CU.isNullOrEmpty(eZip.getCompanyNm())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[^ -~｡-ﾟ]*$", eZip.getCompanyNm())) {
					updateErrorExecute(eZip, WmsMessageConst.COMPANY_NM_CHECK_FULL_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,80}$", eZip.getCompanyNm())) {
					updateErrorExecute(eZip, WmsMessageConst.COMPANY_NM_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== フラグ1 チェック =====

			if (!CU.isNullOrEmpty(eZip.getFlg1())) {
				// フラグ1がセンタ区分値明細マスタにない。
				if (!zipFlgMap.containsKey(eZip.getFlg1())) {
					updateErrorExecute(eZip, WmsMessageConst.FLG1_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== フラグ2 チェック =====

			if (!CU.isNullOrEmpty(eZip.getFlg2())) {
				// フラグ2がセンタ区分値明細マスタにない。
				if (!zipFlgMap.containsKey(eZip.getFlg2())) {
					updateErrorExecute(eZip, WmsMessageConst.FLG2_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== フラグ3 チェック =====

			if (!CU.isNullOrEmpty(eZip.getFlg3())) {
				// フラグ3がセンタ区分値明細マスタにない。
				if (!zipFlgMap.containsKey(eZip.getFlg3())) {
					updateErrorExecute(eZip, WmsMessageConst.FLG3_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== フラグ4 チェック =====

			if (!CU.isNullOrEmpty(eZip.getFlg4())) {
				// フラグ4がセンタ区分値明細マスタにない。
				if (!zipFlgMap.containsKey(eZip.getFlg4())) {
					updateErrorExecute(eZip, WmsMessageConst.FLG4_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 更新区分 チェック =====

			if (!CU.isNullOrEmpty(eZip.getUpdType())) {
				// 更新区分がセンタ区分値明細マスタにない。
				if (!updTypeMap.containsKey(eZip.getUpdType())) {
					updateErrorExecute(eZip, WmsMessageConst.UPD_TYPE_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 変更理由 チェック =====

			if (!CU.isNullOrEmpty(eZip.getReasonType())) {
				// 変更理由がセンタ区分値明細マスタにない。
				if (!reasonTypeMap.containsKey(eZip.getReasonType())) {
					updateErrorExecute(eZip, WmsMessageConst.REASON_TYPE_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 取扱局 チェック =====

			if (!CU.isNullOrEmpty(eZip.getHandlingAddress())) {
				// 文字種エラー
				if (!checkExcelCellInput("^[^ -~｡-ﾟ]*$", eZip.getHandlingAddress())) {
					updateErrorExecute(eZip, WmsMessageConst.HANDLING_ADDRESS_CHECK_FULL_WIDTH_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 長さエラー
				if (!checkExcelCellInput(".{1,20}$", eZip.getHandlingAddress())) {
					updateErrorExecute(eZip, WmsMessageConst.HANDLING_ADDRESS_BULK_INPUT_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== フラグ5 チェック =====

			if (!CU.isNullOrEmpty(eZip.getFlg5())) {
				// フラグ5がセンタ区分値明細マスタにない。
				if (!codeTypeMap.containsKey(eZip.getFlg5())) {
					updateErrorExecute(eZip, WmsMessageConst.FLG5_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== フラグ6 チェック =====

			if (!CU.isNullOrEmpty(eZip.getFlg6())) {
				// フラグ6がセンタ区分値明細マスタにない。
				if (!codeFlgMap.containsKey(eZip.getFlg6())) {
					updateErrorExecute(eZip, WmsMessageConst.FLG6_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}

			}

			// ===== 修正コード チェック =====

			if (!CU.isNullOrEmpty(eZip.getUpdCd())) {
				// 修正コードがセンタ区分値明細マスタにない。
				if (!updCdMap.containsKey(eZip.getUpdCd())) {
					updateErrorExecute(eZip, WmsMessageConst.UPD_CD_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			// ===== 大口フラグ チェック =====

			if (!CU.isNullOrEmpty(eZip.getCompanyFlg())) {
				// 大口フラグがセンタ区分値明細マスタにない。
				if (!companyFlgMap.containsKey(eZip.getCompanyFlg())) {
					updateErrorExecute(eZip, WmsMessageConst.COMPANY_FLG_NOT_FOUND_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

		}

		return errorCount;
	}

	/**
	 * <h2>郵便番号マスタ登録チェック.</h2>
	 * @param zipMasterBulkInputDto 郵便番号マスタ一括取込画面用DTO
	 * @return エラー件数
	 */
	public int checkErrorZipMaster(ZipMasterBulkInputDto zipMasterBulkInputDto) {

		// エラー件数
		int errorCount = 0;

		// 郵便番号マスタ受信テーブルから、正常データ（エラーフラグ＝０）を選択して、整合性チェックを行う。
		List<SqlEZipList> sqlEZipListList = getEZipList(zipMasterBulkInputDto.data.receiveCd, zipMasterBulkInputDto.data.head, null, SelectCls.NO_ERROR_ONLY);
		List<MZip> zipList = new ArrayList<MZip>();

		// SqlEZipListから、MZipに変更する。
		mappingEZipToMZip(sqlEZipListList, zipList);

		errorCount = check(zipList, sqlEZipListList, 1, zipMasterBulkInputDto);

		return errorCount;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・郵便番号ＣＤ重複チェック
	 * ・郵便番号名称重複チェック
	 * ・在庫チェック存在チェック
	 * </pre>
	 * @param mZipList 郵便番号マスタ画面List
	 * @param clientId 荷主Id
	 * @param sqlEZipListList 郵便番号マスタ受信テーブル
	 * @param insertFlg エラー内容登録フラグ(1：登録)
	 * @return int エラー件数
	 */
	protected int check(List<MZip> mZipList, List<SqlEZipList> sqlEZipListList, int insertFlg, ZipMasterBulkInputDto zipMasterBulkInputDto) {
		boolean isNullStock = false;
		int rowIndex = -1;

		List<EZip> errorEZipList = new ArrayList<EZip>();
		EZip eZip = null;

		boolean info_Warn = false;
		// チェック処理
		for (MZip mZip : mZipList) {
			getErrorManager().clear();
			rowIndex++;
			// 郵便番号CDチェック
			if (mZip.getZipId() == null) {
				// 登録の場合
				// 郵便番号CD重複チェック
				getErrorManager().clear();
				boolean isDuplicateZipCdInsert = zipLogic.checkZipCdInsert(mZip);
				if (isDuplicateZipCdInsert) {
					// MZipから、EZipに変更する。
					if (insertFlg == 1) {
						eZip = new EZip();
						setupEZip(eZip, sqlEZipListList.get(rowIndex));
						errorEZipList.add(eZip);
						eZip.setErrorFlg("1");
						eZip.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						if (zipMasterBulkInputDto.isOverCommitUnitNum(errorEZipList.size())) {
							eZipBhv.batchUpdate(errorEZipList);
							errorEZipList = new ArrayList<EZip>();
						}

						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eZip.getReceiveRowId()), eZip.getErrorMessageCd());
					}
					mZip.setErrorFlg("1");
					info_Warn = true;
					continue;
				}
			}
		}

		// エラー内容の登録
		if (errorEZipList.size() > 0) {
			eZipBhv.batchUpdate(errorEZipList);
		}

		// 結果の設定
		if (isNullStock || info_Warn) {
			getErrorManager().clear();
		}

		return errorEZipList.size();
	}

	/**
	 * SqlEZipListから、MZipに変更する。
	 *
	 * @param sqlEZipListList
	 * @param zipList
	 * @param clientCd 荷主CD
	 */
	private void mappingEZipToMZip(List<SqlEZipList> sqlEZipListList, List<MZip> zipList) {

		// SqlEZipListから、MZipに変更する。
		for (SqlEZipList sqlEZipList : sqlEZipListList) {
			MZip mzip = new MZip();

			zipList.add(mzip);

			// 郵便番号CD
			mzip.setZipCd(sqlEZipList.getZipCd());
			// 全国地方公共団体コード
			mzip.setPublicCd(sqlEZipList.getPublicCd());
			// 旧郵便番号
			mzip.setZipCd5(sqlEZipList.getZipCd5().trim());
			// 都道府県カナ
			mzip.setAddressKn1(sqlEZipList.getAddressKn1());
			// 市区町村カナ
			mzip.setAddressKn2(sqlEZipList.getAddressKn2());
			// 町域カナ
			mzip.setAddressKn3(sqlEZipList.getAddressKn3());
			// 大口事務所カナ
			mzip.setCompanyKn(sqlEZipList.getCompanyKn());
			// 都道府県
			mzip.setAddress1(sqlEZipList.getAddress1());
			// 市区町村
			mzip.setAddress2(sqlEZipList.getAddress2());
			// 町域
			mzip.setAddress3(sqlEZipList.getAddress3());
			// 小字
			mzip.setAddress4(sqlEZipList.getAddress4());
			// 大口事業所名称
			mzip.setCompanyNm(sqlEZipList.getCompanyNm());
			// フラグ1
			mzip.setFlg1(sqlEZipList.getFlg1());
			// フラグ2
			mzip.setFlg2(sqlEZipList.getFlg2());
			// フラグ3
			mzip.setFlg3(sqlEZipList.getFlg3());
			// フラグ4
			mzip.setFlg4(sqlEZipList.getFlg4());
			// 更新区分
			mzip.setUpdType(sqlEZipList.getUpdType());
			// 変更理由
			mzip.setReasonType(sqlEZipList.getReasonType());
			// 取扱局
			mzip.setHandlingAddress(sqlEZipList.getHandlingAddress());
			// フラグ5
			mzip.setFlg5(sqlEZipList.getFlg5());
			// フラグ6
			mzip.setFlg6(sqlEZipList.getFlg6());
			// 修正コード
			mzip.setUpdCd(sqlEZipList.getUpdCd());
			// 大口事務所フラグ
			mzip.setCompanyFlg(sqlEZipList.getCompanyFlg() == null ? "0" : String.valueOf(sqlEZipList.getCompanyFlg()));
			// 郵便番号ID
			mzip.setZipId(sqlEZipList.getMzipId());
			// 郵便番号ID
			mzip.setEZipId(sqlEZipList.getMzipId() == null ? null : String.valueOf(sqlEZipList.getMzipId()));
			// バージョンNo.
			mzip.setVersionNo(sqlEZipList.getVersionNo());
			// 削除フラグ
			mzip.setDelFlg(sqlEZipList.getDelFlg());
			// バージョンNo.
			mzip.setVersionNo(sqlEZipList.getMversionNo());

		}
	}

	/**
	 * 登録データの組み立て
	 * @param eZip
	 * @param sqlEZipList
	 */
	private void setupEZip(EZip eZip, SqlEZipList sqlEZipList) {
		eZip.setZipId(sqlEZipList.getZipId());
		eZip.setReceiveCd(sqlEZipList.getReceiveCd());
		eZip.setReceiveRowId(sqlEZipList.getReceiveRowId());
		eZip.setImportFlg(sqlEZipList.getImportFlg());
		eZip.setErrorFlg(sqlEZipList.getErrorFlg());
		eZip.setErrorMessageCd(sqlEZipList.getErrorMessageCd());
		eZip.setZipCd(sqlEZipList.getZipCd());
		eZip.setPublicCd(sqlEZipList.getPublicCd());
		eZip.setZipCd5(sqlEZipList.getZipCd5());
		eZip.setAddressKn1(sqlEZipList.getAddressKn1());
		eZip.setAddressKn2(sqlEZipList.getAddressKn2());
		eZip.setAddressKn3(sqlEZipList.getAddressKn3());
		eZip.setCompanyKn(sqlEZipList.getCompanyKn());
		eZip.setAddress1(sqlEZipList.getAddress1());
		eZip.setAddress2(sqlEZipList.getAddress2());
		eZip.setAddress3(sqlEZipList.getAddress3());
		eZip.setAddress4(sqlEZipList.getAddress4());
		eZip.setCompanyNm(sqlEZipList.getCompanyNm());
		eZip.setFlg1(sqlEZipList.getFlg1());
		eZip.setFlg2(sqlEZipList.getFlg2());
		eZip.setFlg3(sqlEZipList.getFlg3());
		eZip.setFlg4(sqlEZipList.getFlg4());
		eZip.setUpdType(sqlEZipList.getUpdType());
		eZip.setReasonType(sqlEZipList.getReasonType());
		eZip.setHandlingAddress(sqlEZipList.getHandlingAddress());
		eZip.setFlg5(sqlEZipList.getFlg5());
		eZip.setFlg6(sqlEZipList.getFlg6());
		eZip.setUpdCd(sqlEZipList.getUpdCd());
		eZip.setCompanyFlg(sqlEZipList.getCompanyFlg());
		eZip.setDelFlg(sqlEZipList.getDelFlg());
		eZip.setVersionNo(sqlEZipList.getVersionNo());
		eZip.setControlNo(sqlEZipList.getControlNo());
		eZip.setAddDt(sqlEZipList.getAddDt());
		eZip.setAddUser(sqlEZipList.getAddUser());
		eZip.setAddProcess(sqlEZipList.getAddProcess());
		eZip.setUpdDt(sqlEZipList.getUpdDt());
		eZip.setUpdUser(sqlEZipList.getUpdUser());
		eZip.setUpdProcess(sqlEZipList.getUpdProcess());
	}

	/**
	 * <h2>郵便番号マスタ受信テーブルのエラー設定.</h2>
	 * @param eZip
	 * @param errorMessageCd
	 * @param doUpdate
	 */
	private void updateErrorExecute(EZip eZip, String errorMessageCd, DbUpdateForError doUpdate) {
		eZip.setErrorFlg("1");
		eZip.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eZipBhv.update(eZip);
		}
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eZip.getReceiveRowId()), errorMessageCd);
	}

	/**
	 * <h2>ファイル取込データから郵便番号マスタ受信テーブルのエンティティに変換.</h2>
	 * @param zipList 取込郵便番号マスタリスト
	 * @param receiveCd 設定する受信CD
	 * @return 郵便番号マスタ受信テーブルのリスト
	 */
	public List<EZip> convertEZip(List<SqlEZipListDto> zipList, String receiveCd, String uploadZipType) {

		List<EZip> eZipList = new ArrayList<>();

		Set<String> eZipSetList = new HashSet<String>();

		// 一覧件数分ループ
		int lineNo = 0;
		int errorCount = 0;
		for (int row = 0; row < zipList.size(); row++) {

			SqlEZipListDto data = zipList.get(row);
			EZip eZip = new EZip();
			eZip.setReceiveRowId(Long.valueOf(lineNo + 1));
			eZip.setReceiveCd(receiveCd);
			eZip.setImportFlg("0");
			eZip.setErrorFlg("0");
			String zipCd = data.getZipCd();
			eZip.setZipCd(zipCd);
			String publicCd = data.getPublicCd();
			eZip.setPublicCd(publicCd);
			String zipCd5 = data.getZipCd5();
			eZip.setZipCd5(zipCd5);
			String addressKn1 = data.getAddressKn1();
			eZip.setAddressKn1(addressKn1);
			String addressKn2 = data.getAddressKn2();
			eZip.setAddressKn2(addressKn2);
			String addressKn3 = data.getAddressKn3();
			eZip.setAddressKn3(addressKn3);
			String companyKn = data.getCompanyKn();
			eZip.setCompanyKn(companyKn);
			String address1 = data.getAddress1();
			eZip.setAddress1(address1);
			String address2 = data.getAddress2();
			eZip.setAddress2(address2);
			String address3 = data.getAddress3();
			eZip.setAddress3(address3);
			String address4 = data.getAddress4();
			eZip.setAddress4(address4);
			String companyNm = data.getCompanyNm();
			eZip.setCompanyNm(companyNm);
			String flg1 = data.getFlg1();
			eZip.setFlg1(flg1);
			String flg2 = data.getFlg2();
			eZip.setFlg2(flg2);
			String flg3 = data.getFlg3();
			eZip.setFlg3(flg3);
			String flg4 = data.getFlg4();
			eZip.setFlg4(flg4);
			String updType = data.getUpdType();
			eZip.setUpdType(updType);
			String reasonType = data.getReasonType();
			eZip.setReasonType(reasonType);
			String handlingAddress = data.getHandlingAddress();
			eZip.setHandlingAddress(handlingAddress);
			String flg5 = data.getFlg5();
			eZip.setFlg5(flg5);
			String flg6 = data.getFlg6();
			eZip.setFlg6(flg6);
			String updCd = data.getUpdCd();
			eZip.setUpdCd(updCd);
			eZip.setCompanyFlg(uploadZipType);
			String delFlg = data.getDelFlg();
			eZip.setDelFlg(delFlg);
			if (CU.isNullOrEmpty(eZip.getZipCd())) {
				eZipList.add(eZip);
				lineNo++;
			} else if (!eZipSetList.contains(eZip.getZipCd())) {
				eZipList.add(eZip);
				eZipSetList.add(eZip.getZipCd());
				lineNo++;
			} else {
				errorCount++;
			}
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.ZIP_INSERT_INFO, Integer.toString(lineNo), Integer.toString(errorCount));

		return eZipList;
	}

	/**
	 * <h2>郵便番号マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<EZip> selectEZipList(String receiveCd) {

		EZipCB cb = eZipBhv.newConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eZipBhv.selectList(cb);
	}

	/**
	 * <h2>郵便番号マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<EZip> selectEZipList(String receiveCd, SelectCls cls) {

		EZipCB cb = eZipBhv.newConditionBean();

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

		return eZipBhv.selectList(cb);
	}

	/**
	 * <h2>郵便番号マスタ一括登録.</h2>
	 * @param zipMasterDto 郵便番号マスタ一括取込画面用DTO
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(ZipMasterBulkInputDto zipMasterBulkInputDto, ErrorStatus errSts) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		zipMasterBulkInputDto.data.commitUnitNum = getPropertyLongValue(WmsPropertyConst.DATA_INPUT_COMMIT_UNIT_NUM);

		// 郵便番号マスタ受信テーブルから、正常データ（エラーフラグ＝０）を選択して、整合性チェックを行う。
		List<SqlEZipList> sqlEZipListList = getEZipList(zipMasterBulkInputDto.data.receiveCd, zipMasterBulkInputDto.data.head, null, SelectCls.NO_ERROR_ONLY);

		List<MZip> zipList = new ArrayList<MZip>();

		// SqlEZipListから、MZipに変更する。
		mappingEZipToMZip(sqlEZipListList, zipList);

		List<MZip> insertList = new ArrayList<MZip>();

		List<MZip> updateList = new ArrayList<MZip>();

		Set<String> setList = new HashSet<String>();

		Long insertRows = 0L;
		Long updateRows = 0L;
		Long exclusionRows = 0L;

		for (MZip mZip : zipList) {

			if (!setList.contains(mZip.getZipCd())) {
				setList.add(mZip.getZipCd());
				if ("1".equals(mZip.getErrorFlg())) {
					continue;
				}

				if (mZip.getEZipId() == null) {
					// 登録
					insertList.add(mZip);
					if (zipMasterBulkInputDto.isOverCommitUnitNum(insertList.size())) {
						insertWork(insertList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));
						insertRows = insertRows + insertList.size();
						insertList = new ArrayList<MZip>();
					}
				} else {
					// 修正
					updateList.add(mZip);
					if (zipMasterBulkInputDto.isOverCommitUnitNum(updateList.size())) {
						updateWork(updateList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));
						updateRows = updateRows + updateList.size();
						updateList = new ArrayList<MZip>();
					}
				}
			} else {
				exclusionRows++;
			}
		}

		if (insertList.size() > 0) {
			insertWork(insertList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));
			insertRows = insertRows + insertList.size();
		}

		if (updateList.size() > 0) {
			updateWork(updateList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));
			updateRows = updateRows + updateList.size();
		}

		// 取込みフラグは１を設定する。
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		EZipCB cb = new EZipCB();
		cb.query().setReceiveCd_Equal(zipMasterBulkInputDto.data.receiveCd);
		cb.query().setErrorFlg_Equal("0");
		List<EZip> updEReceive = eZipBhv.selectList(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		for (int i = 0; i < updEReceive.size(); i++) {
			updEReceive.get(i).setImportFlg("1");
		}
		eZipBhv.batchUpdate(updEReceive);

		if (!insertList.isEmpty() || !updateList.isEmpty()) {
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		} else {
			getErrorManager().add(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			if (outputLog == OutputLog.TRUE) {
				// ログ書込

				getDatabaseLogger().addErrorLogDtl(WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
				getDatabaseLogger().endLogDtl();
				endFailureLog();
			}
		}

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.ZIP_INSERT_BATCH_INFO, String.valueOf(insertRows), String.valueOf(updateRows), String.valueOf(exclusionRows));
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを検索する。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ取込ワークテーブルに検索する。
	 * トランザクション分割のため、別メソッドへ分割
	 * </pre>
	 * @param path 外だしSQLパス
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<SqlEZipList> selectWork(String path, SqlEZipListPmb pmb, Class<SqlEZipList> entityType, PagingData paging){

		List<SqlEZipList> sqlDtoList = null;

		if (paging != null) {
			pmb.paging(paging.pageSize, paging.currentPage);
			sqlDtoList = eZipBhv.outsideSql().autoPaging().selectPage(path, pmb, entityType);
			setRecordCount((PagingResultBean<?>) sqlDtoList, paging);
		} else {
			sqlDtoList = eZipBhv.outsideSql().selectList(path, pmb, entityType);
		}

		return sqlDtoList;

	}

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを登録する。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ取込ワークテーブルに登録する。
	 * トランザクション分割のため、別メソッドへ分割
	 * </pre>
	 * @param path 外だしSQLパス
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void insertWork(List<MZip> insertList, ErrorStatus errSts){

		insertLogic.batchInsert(insertList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));

	}

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを登録する。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ取込ワークテーブルに登録する。
	 * トランザクション分割のため、別メソッドへ分割
	 * </pre>
	 * @param path 外だしSQLパス
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void updateWork(List<MZip> updateList, ErrorStatus errSts){

		updateLogic.batchUpdate(updateList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));

	}

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>郵便番号マスタ受信テーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @param cls エラー検索区分
	 * @return List<SqlEZipList> 郵便番号マスタ受信テーブル
	 */
	public int getEZipCount(String receiveCd) {

		// 外出しSQLの定義
		String path = EZipBhv.PATH_selectSqlEZipList;

		SqlEZipListPmb pmb = new SqlEZipListPmb();

		pmb.setReceiveCd(receiveCd == null ? "0" : receiveCd);
		pmb.setCultureId(getCultureId());
		pmb.setImportFlg("0");

		Class<SqlEZipList> entityType = SqlEZipList.class;

		return eZipBhv.outsideSql().selectList(path, pmb, entityType).size();
	}

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}
