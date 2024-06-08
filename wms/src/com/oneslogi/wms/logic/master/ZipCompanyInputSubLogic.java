package com.oneslogi.wms.logic.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCarrierZipCB;
import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.cbean.WZipCompanyInputCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierZipBhv;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exbhv.WZipCompanyInputBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.WZipCompanyInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 郵便番号マスタ（大口事業所）取込ロジッククラス
 */
public class ZipCompanyInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WZipCompanyInputBhv wZipCompanyInputBhv;
	@Inject
	private MZipBhv mZipBhv;
	@Inject
	private MCarrierZipBhv mCarrierZipBhv;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipMasterInsertLogic zipMasterInsertLogic;

	/**
	 * <h2>郵便番号マスタ（大口事業所）取込ワークテーブルを登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ（大口事業所）取込ワークテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipCompanyInput 郵便番号マスタ（大口事業所）取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WZipCompanyInput> lstWZipCompanyInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWZipCompanyInput, errSts);
	}

	/**
	 * <h2>郵便番号マスタ（大口事業所）取込ワークテーブルを登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ（大口事業所）取込ワークテーブルに登録する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipCompanyInput 郵便番号マスタ（大口事業所）取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WZipCompanyInput> lstWZipCompanyInput, ErrorStatus errSts) {
		// [Ver3.0][#4450] ワークテーブルに格納する前に旧郵便番号の半角スペースの除去 2018.04.20 shimizu Start
		for(WZipCompanyInput wZipCompanyInput: lstWZipCompanyInput) {
			if(!CU.isNullOrEmpty(wZipCompanyInput.getZipCd5())) {
				wZipCompanyInput.setZipCd5(StringUtils.stripEnd(wZipCompanyInput.getZipCd5(), null));
			}
		}
		// [Ver3.0][#4450] ワークテーブルに格納する前に旧郵便番号の半角スペースの除去 2018.04.20 shimizu End
		wZipCompanyInputBhv.batchInsert(lstWZipCompanyInput);
	}

	/**
	 * <h2>郵便番号マスタ（大口事業所）取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、郵便番号マスタ（大口事業所）取込ワークを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>郵便番号マスタ(大口事業所)取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、郵便番号マスタ(大口事業所)取込ワークを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「郵便番号マスタ(大口事業所)取込ワーク」テーブルを全件削除する
		try {
			WZipCompanyInputCB wZipCompanyInputCB = wZipCompanyInputBhv.newConditionBean();
			wZipCompanyInputBhv.varyingQueryDelete(wZipCompanyInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wZipCompanyInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>郵便番号マスタ(大口事業所)を移行する（コミットあり）。</h2>
	 * <pre>
	 * 郵便番号マスタ(大口事業所)登録を呼出し、郵便番号マスタ(大口事業所)テーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(ErrorStatus errSts) {
		delete(errSts);
	}

	/**
	 * <h2>郵便番号マスタ(大口事業所)テーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 郵便番号マスタ(大口事業所)移行が全削除後追記の場合、センタ郵便番号マスタ(大口事業所)と取引先マスタを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(ErrorStatus errSts) {
		//「運送業者郵便番号マスタ」テーブルを全件削除する
		try {
			MCarrierZipCB mCarrierZipCB = mCarrierZipBhv.newConditionBean();
			mCarrierZipCB.setupSelect_MZip();
			mCarrierZipCB.query().queryMZip().setCompanyFlg_Equal_$1();
			mCarrierZipBhv.varyingQueryDelete(mCarrierZipCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCarrierZipBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCarrierZipBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCarrierZipBhv.asTableDbName().toUpperCase());
			return;
		}
		//「郵便番号マスタ(大口事業所)にパラメータマスタの郵便番号以外のデータ」テーブルを全件削除する
		try {
			MZipCB mZipCB = mZipBhv.newConditionBean();
			mZipCB.query().setCompanyFlg_Equal_$1();
			mZipBhv.varyingQueryDelete(mZipCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mZipBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mZipBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mZipBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>郵便番号マスタ(大口事業所)を移行する（コミットあり）。</h2>
	 * <pre>
	 * 郵便番号マスタ(大口事業所)登録を呼出し、郵便番号マスタ(大口事業所)テーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipCompanyInput 郵便番号マスタ(大口事業所)取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WZipCompanyInput> lstWZipCompanyInput,
			ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWZipCompanyInput, errSts);
	}

	/**
	 * <h2>郵便番号マスタ(大口事業所)を移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、郵便番号マスタ(大口事業所)テーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipCompanyInput 郵便番号マスタ(大口事業所)取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, List<WZipCompanyInput> lstWZipCompanyInput,
			ErrorStatus errSts) throws Exception {

		// [#3614][#4511][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.05.07 honma/kawana Add Start
		// ===== 各種区分値CDより区分値明細マスタマップ取得 =====

		// フラグ5(個別番号の種別の表示)
		Map<String, String> codeTypeMap = centerClassLogic.getClassMapByCd("CODE_TYPE");
		// フラグ6(複数番号の有無)
		Map<String, String> codeFlgMap = centerClassLogic.getClassMapByCd("CODE_FLG");
		// 修正コード
		Map<String, String> UpdCdMap = centerClassLogic.getClassMapByCd("UPD_CD");
		// [#3614][#4511][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.05.07 honma/kawana Add End

		for (WZipCompanyInput wZipCompanyInput : lstWZipCompanyInput) {
			MZip mZip = new MZip();

			getErrorManager().clear();

			// [#3614][#4511][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.05.07 honma/kawana Add Start
			// 取込データのチェック処理を行う
			checkRegister(wZipCompanyInput, mZip, codeTypeMap, codeFlgMap, UpdCdMap, errSts);
			// [#3614][#4511][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.05.07 honma/kawana Add End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wZipCompanyInput, getErrorManager());
				wZipCompanyInputBhv.update(wZipCompanyInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// [#434] 同一郵便番号が存在した場合はスキップして正常終了 2016.12.14 kawana Start
			// 郵便番号マスタ(大口事業所)登録処理を行う
			zipMasterInsertLogic.insertMZip(mZip);
			// [#434] 同一郵便番号が存在した場合はスキップして正常終了 2016.12.14 kawana End

			wZipCompanyInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wZipCompanyInputBhv.update(wZipCompanyInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、下記のチェックを行う。
	 *・大口事業所個別番号の必須チェック
	 *・個別番号の種別の表示の区分値明細マスタ存在チェック
	 *・複数番号の有無の区分値明細マスタ存在チェック
	 *・修正コードの区分値明細マスタ存在チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 郵便番号マスタ(大口事業所)取込ワークのセンタCDと取引先CDによりセンタ郵便番号マスタ(大口事業所)情報を取得し、
	 * 引数のセンタ郵便番号マスタ(大口事業所)に設定する。
	 * 引数の郵便番号マスタ(大口事業所)に郵便番号マスタ(大口事業所)取込ワーク情報を設定する。
	 * </pre>
	 * @param wZipCompanyInput 郵便番号マスタ(大口事業所)取込ワーク：全項目
	 * @param mZip 郵便番号マスタ
	 * @param codeTypeMap フラグ5(個別番号の種別の表示) 区分値明細マスタマップ
	 * @param codeFlgMap フラグ6(複数番号の有無) 区分値明細マスタマップ
	 * @param updCdMap 修正コード 区分値明細マスタマップ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkRegister(WZipCompanyInput wZipCompanyInput, MZip mZip, Map<String, String> codeTypeMap, Map<String, String> codeFlgMap, Map<String, String> updCdMap, ErrorStatus errSts) {

		wZipCompanyInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wZipCompanyInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 項目チェック
		// 大口事業所の所在地のJISコード
		if (!CU.isNullOrEmpty(wZipCompanyInput.getPublicCd())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wZipCompanyInput.getPublicCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,5}$", wZipCompanyInput.getPublicCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_PUBLIC_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 大口事業所名（カナ）
		if (!CU.isNullOrEmpty(wZipCompanyInput.getCompanyKn())) {
			if (!WmsCommonUtil.checkPatternInput("^[ -~｡-ﾟ]*$", wZipCompanyInput.getCompanyKn())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_KN_CHECK_HALF_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[ -~｡-ﾟ]{1,100}$", wZipCompanyInput.getCompanyKn())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_KN_CHECK_INPUT_MAX_ERROR, "100");
			}
		}
		// 大口事業所名（漢字）
		if (!CU.isNullOrEmpty(wZipCompanyInput.getCompanyNm())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipCompanyInput.getCompanyNm())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_NM_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,80}$", wZipCompanyInput.getCompanyNm())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_NM_CHECK_INPUT_MAX_ERROR, "80");
			}
		}
		// 都道府県名
		if (!CU.isNullOrEmpty(wZipCompanyInput.getAddress1())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipCompanyInput.getAddress1())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS1_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,4}$", wZipCompanyInput.getAddress1())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS1_CHECK_INPUT_MAX_ERROR, "4");
			}
		}
		// 市区町村名
		if (!CU.isNullOrEmpty(wZipCompanyInput.getAddress2())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipCompanyInput.getAddress2())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS2_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,12}$", wZipCompanyInput.getAddress2())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS2_CHECK_INPUT_MAX_ERROR, "12");
			}
		}
		// 町域名
		if (!CU.isNullOrEmpty(wZipCompanyInput.getAddress3())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipCompanyInput.getAddress3())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS3_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,12}$", wZipCompanyInput.getAddress3())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS3_CHECK_INPUT_MAX_ERROR, "12");
			}
		}
		// 都道府県、市区町村、町域いずれか必須
		if (CU.isNullOrEmpty(wZipCompanyInput.getAddress1()) && CU.isNullOrEmpty(wZipCompanyInput.getAddress2()) && CU.isNullOrEmpty(wZipCompanyInput.getAddress3())) {
			getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_CHECK_NOT_INPUT_ERROR);
		}
		// 小字名、丁目、番地等
		if (!CU.isNullOrEmpty(wZipCompanyInput.getAddress4())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipCompanyInput.getAddress4())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS4_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,62}$", wZipCompanyInput.getAddress4())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS4_CHECK_INPUT_MAX_ERROR, "62");
			}
		}
		// 大口事業所個別番号
		if (CU.isNullOrEmpty(wZipCompanyInput.getZipCd())) {
			getErrorManager().add(errSts, WmsMessageConst.COMPANY_ZIP_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wZipCompanyInput.getZipCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,7}$", wZipCompanyInput.getZipCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.COMPANY_ZIP_CD_CHECK_INPUT_MAX_ERROR, "7");
			}
		}
		// （旧）郵便番号
		if (!CU.isNullOrEmpty(wZipCompanyInput.getZipCd5())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wZipCompanyInput.getZipCd5())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD5_CHECK_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,5}$", wZipCompanyInput.getZipCd5())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD5_CHECK_INPUT_MAX_ERROR, "5");
			}
		}
		// 取扱局
		if (!CU.isNullOrEmpty(wZipCompanyInput.getHandlingAddress())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipCompanyInput.getHandlingAddress())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.HANDLING_ADDRESS_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,20}$", wZipCompanyInput.getHandlingAddress())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.HANDLING_ADDRESS_CHECK_INPUT_MAX_ERROR, "20");
			}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
		// フラグ5(個別番号の種別の表示)
		if (!CU.isNullOrEmpty(wZipCompanyInput.getFlg5())) {
			// [#4511] 区分値間違い修正 2018.05.07 kawana Start
			// 区分値明細マスタ存在チェック
			if (!codeTypeMap.containsKey(wZipCompanyInput.getFlg5())) {
				// [#4511] 区分値間違い修正 2018.05.07 kawana End
				getErrorManager().add(errSts, WmsMessageConst.FLG5_NOT_FOUND_ERROR);
			}
		}
		// フラグ6(複数番号の有無)
		if (!CU.isNullOrEmpty(wZipCompanyInput.getFlg6())) {
			// [#4511] 区分値間違い修正 2018.05.07 kawana Start
			// 区分値明細マスタ存在チェック
			if (!codeFlgMap.containsKey(wZipCompanyInput.getFlg6())) {
				// [#4511] 区分値間違い修正 2018.05.07 kawana End
				getErrorManager().add(errSts, WmsMessageConst.FLG6_NOT_FOUND_ERROR);
			}
		}
		// 修正コード
		if (!CU.isNullOrEmpty(wZipCompanyInput.getUpdCd())) {
			// 区分値明細マスタ存在チェック
			if (!updCdMap.containsKey(wZipCompanyInput.getUpdCd())) {
				getErrorManager().add(errSts, WmsMessageConst.UPD_CD_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

		if (getErrorManager().size() > 0) {
			return;
		}
		mZip.setPublicCd(wZipCompanyInput.getPublicCd());
		mZip.setCompanyKn(wZipCompanyInput.getCompanyKn());
		mZip.setCompanyNm(wZipCompanyInput.getCompanyNm());
		mZip.setAddress1(wZipCompanyInput.getAddress1());
		mZip.setAddress2(wZipCompanyInput.getAddress2());
		mZip.setAddress3(wZipCompanyInput.getAddress3());
		mZip.setAddress4(wZipCompanyInput.getAddress4());
		mZip.setZipCd(wZipCompanyInput.getZipCd());
		mZip.setZipCd5(wZipCompanyInput.getZipCd5());
		mZip.setHandlingAddress(wZipCompanyInput.getHandlingAddress());
		mZip.setFlg5(wZipCompanyInput.getFlg5());
		mZip.setFlg6(wZipCompanyInput.getFlg6());
		mZip.setUpdCd(wZipCompanyInput.getUpdCd());
		mZip.setCompanyFlg("1");
	}

}
