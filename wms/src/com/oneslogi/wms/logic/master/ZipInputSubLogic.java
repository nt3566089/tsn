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
import com.oneslogi.base.dbflute.cbean.WZipInputCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierZipBhv;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exbhv.WZipInputBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.WZipInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 郵便番号マスタ取込ロジッククラス
 */
public class ZipInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierZipBhv mCarrierZipBhv;
	@Inject
	private MZipBhv mZipBhv;
	@Inject
	private WZipInputBhv wZipInputBhv;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipMasterInsertLogic zipMasterInsertLogic;

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ取込ワークテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WZipInput> lstWZipInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWZipInput, errSts);
	}

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを郵便番号マスタ取込ワークテーブルに登録する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WZipInput> lstWZipInput, ErrorStatus errSts) {
		// [Ver3.0][#4450] ワークテーブルに格納する前に旧郵便番号の半角スペースの除去 2018.04.20 shimizu Start
		for(WZipInput wZipInput: lstWZipInput) {
			if(!CU.isNullOrEmpty(wZipInput.getZipCd5())) {
				wZipInput.setZipCd5(StringUtils.stripEnd(wZipInput.getZipCd5(), null));
			}
		}
		// [Ver3.0][#4450] ワークテーブルに格納する前に旧郵便番号の半角スペースの除去 2018.04.20 shimizu End
		wZipInputBhv.batchInsert(lstWZipInput);
	}

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、郵便番号マスタ取込ワークを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、郵便番号マスタ取込ワークを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「郵便番号マスタ取込ワーク」テーブルを全件削除する
		try {
			WZipInputCB wZipInputCB = wZipInputBhv.newConditionBean();
			wZipInputBhv.varyingQueryDelete(wZipInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wZipInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>郵便番号マスタを移行する（コミットあり）。</h2>
	 * <pre>
	 * 郵便番号マスタ登録を呼出し、郵便番号マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WZipInput> lstWZipInput, ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWZipInput, errSts);
	}

	/**
	 * <h2>郵便番号マスタを移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、郵便番号マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWZipInput 郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, List<WZipInput> lstWZipInput, ErrorStatus errSts) throws Exception {

		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
		// ===== 各種区分値CDより区分値明細マスタマップ取得 =====
		// フラグ
		Map<String, String> zipFlgMap = centerClassLogic.getClassMapByCd("ZIP_FLG");
		// 更新区分
		Map<String, String> updTypeMap = centerClassLogic.getClassMapByCd("UPD_TYPE");
		// 変更理由
		Map<String, String> reasonTypeMap = centerClassLogic.getClassMapByCd("REASON_TYPE");
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

		for (WZipInput wZipInput : lstWZipInput) {
			MZip mZip = new MZip();
			getErrorManager().clear();

			// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
			// 取込データのチェック処理を行う
			checkRegister(wZipInput, mZip, zipFlgMap, updTypeMap, reasonTypeMap, errSts);
			// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wZipInput, getErrorManager());
				wZipInputBhv.update(wZipInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// [#434] 同一郵便番号が存在した場合はスキップして正常終了 2016.12.14 kawana Start
			// 郵便番号マスタ登録処理を行う
			zipMasterInsertLogic.insertMZip(mZip);
			// [#434] 同一郵便番号が存在した場合はスキップして正常終了 2016.12.14 kawana End

			wZipInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wZipInputBhv.update(wZipInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、下記のチェックを行う。
	 *・郵便番号の必須チェック
	 *・一町域が二以上の郵便番号で表される場合の表示(フラグ1)の区分値明細マスタ存在チェック
	 *・小字毎に番地が起番されている町域の表示(フラグ2)の区分値明細マスタ存在チェック
	 *・丁目を有する町域の場合の表示(フラグ3)の区分値明細マスタ存在チェック
	 *・一つの郵便番号で二以上の町域を表す場合の表示(フラグ4)の区分値明細マスタ存在チェック
	 *・更新区分の区分値明細マスタ存在チェック
	 *・変更理由の区分値明細マスタ存在チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 引数の郵便番号マスタに設定する。
	 * 引数の郵便番号マスタに郵便番号マスタ取込ワーク情報を設定する。
	 * </pre>
	 * @param wZipInput 郵便番号マスタ取込ワーク：全項目
	 * @param mZip 郵便番号
	 * @param zipFlgMap フラグ区分値明細マスタマップ
	 * @param updTypeMap 更新区分区分値明細マスタマップ
	 * @param reasonTypeMap 変更理由区分値明細マスタマップ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkRegister(WZipInput wZipInput, MZip mZip, Map<String, String> zipFlgMap, Map<String, String> updTypeMap, Map<String, String> reasonTypeMap, ErrorStatus errSts) {

		wZipInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wZipInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 項目チェック
		// 全国地方公共団体コード
		if (!CU.isNullOrEmpty(wZipInput.getPublicCd())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wZipInput.getPublicCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,5}$", wZipInput.getPublicCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.PUBLIC_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// （旧）郵便番号
		if (!CU.isNullOrEmpty(wZipInput.getZipCd5())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wZipInput.getZipCd5())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD5_CHECK_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,5}$", wZipInput.getZipCd5())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD5_CHECK_INPUT_MAX_ERROR, "5");
			}
		}
		// 郵便番号
		if (CU.isNullOrEmpty(wZipInput.getZipCd())) {
			getErrorManager().add(errSts, WmsMessageConst.ZIP_CODE_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wZipInput.getZipCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD_CHECK_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,7}$", wZipInput.getZipCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD_CHECK_INPUT_MAX_ERROR);
			}
		}
		// 都道府県名カナ
		if (!CU.isNullOrEmpty(wZipInput.getAddressKn1())) {
			if (!WmsCommonUtil.checkPatternInput("^[ -~｡-ﾟ]*$", wZipInput.getAddressKn1())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_KN1_CHECK_HALF_WIDTH_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[ -~｡-ﾟ]{1,76}$", wZipInput.getAddressKn1())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_KN1_CHECK_INPUT_MAX_ERROR, "76");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 市区町村名カナ
		if (!CU.isNullOrEmpty(wZipInput.getAddressKn2())) {
			if (!WmsCommonUtil.checkPatternInput("^[ -~｡-ﾟ]*$", wZipInput.getAddressKn2())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_KN2_CHECK_HALF_WIDTH_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[ -~｡-ﾟ]{1,76}$", wZipInput.getAddressKn2())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_KN2_CHECK_INPUT_MAX_ERROR, "76");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 町域名カナ
		if (!CU.isNullOrEmpty(wZipInput.getAddressKn3())) {
			if (!WmsCommonUtil.checkPatternInput("^[ -~｡-ﾟ]*$", wZipInput.getAddressKn3())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_KN3_CHECK_HALF_WIDTH_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[ -~｡-ﾟ]{1,76}$", wZipInput.getAddressKn3())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_KN3_CHECK_INPUT_MAX_ERROR, "76");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 都道府県名
		if (!CU.isNullOrEmpty(wZipInput.getAddress1())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipInput.getAddress1())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS1_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,38}$", wZipInput.getAddress1())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS1_CHECK_INPUT_MAX_ERROR, "38");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 市区町村名
		if (!CU.isNullOrEmpty(wZipInput.getAddress2())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipInput.getAddress2())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS2_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,38}$", wZipInput.getAddress2())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS2_CHECK_INPUT_MAX_ERROR, "38");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 町域名
		if (!CU.isNullOrEmpty(wZipInput.getAddress3())) {
			if (!WmsCommonUtil.checkPatternInput("^[^ -~｡-ﾟ]*$", wZipInput.getAddress3())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS3_CHECK_FULL_WIDTH_ONLY_ERROR);
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana Start
			if (!WmsCommonUtil.checkPatternInput("[^ -~｡-ﾟ]{1,38}$", wZipInput.getAddress3())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS3_CHECK_INPUT_MAX_ERROR, "38");
			}
			// [#4511] 文字数チェックを修正 2018.05.07 kawana End
		}
		// 都道府県、市区町村、町域いずれか必須
		if (CU.isNullOrEmpty(wZipInput.getAddress1()) && CU.isNullOrEmpty(wZipInput.getAddress2()) && CU.isNullOrEmpty(wZipInput.getAddress3())) {
			getErrorManager().add(errSts, WmsMessageConst.ZIP_ADDRESS_CHECK_NOT_INPUT_ERROR);
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
		// フラグ1(一町域が二以上の郵便番号で表される場合の表示)
		if (!CU.isNullOrEmpty(wZipInput.getFlg1())) {
			// 区分値明細マスタ存在チェック
			if (!zipFlgMap.containsKey(wZipInput.getFlg1())) {
				getErrorManager().add(errSts, WmsMessageConst.FLG1_NOT_FOUND_ERROR);
			}
		}
		// フラグ2(小字毎に番地が起番されている町域の表示)
		if (!CU.isNullOrEmpty(wZipInput.getFlg2())) {
			// 区分値明細マスタ存在チェック
			if (!zipFlgMap.containsKey(wZipInput.getFlg2())) {
				getErrorManager().add(errSts, WmsMessageConst.FLG2_NOT_FOUND_ERROR);
			}
		}
		// フラグ3(丁目を有する町域の場合の表示)
		if (!CU.isNullOrEmpty(wZipInput.getFlg3())) {
			// 区分値明細マスタ存在チェック
			if (!zipFlgMap.containsKey(wZipInput.getFlg3())) {
				getErrorManager().add(errSts, WmsMessageConst.FLG3_NOT_FOUND_ERROR);
			}
		}
		// フラグ4(一つの郵便番号で二以上の町域を表す場合の表示)
		if (!CU.isNullOrEmpty(wZipInput.getFlg4())) {
			// 区分値明細マスタ存在チェック
			if (!zipFlgMap.containsKey(wZipInput.getFlg4())) {
				getErrorManager().add(errSts, WmsMessageConst.FLG4_NOT_FOUND_ERROR);
			}
		}
		// 更新区分
		if (!CU.isNullOrEmpty(wZipInput.getUpdType())) {
			// 区分値明細マスタ存在チェック
			if (!updTypeMap.containsKey(wZipInput.getUpdType())) {
				getErrorManager().add(errSts, WmsMessageConst.UPD_TYPE_NOT_FOUND_ERROR);
			}
		}
		// 変更理由
		if (!CU.isNullOrEmpty(wZipInput.getReasonType())) {
			// 区分値明細マスタ存在チェック
			if (!reasonTypeMap.containsKey(wZipInput.getReasonType())) {
				getErrorManager().add(errSts, WmsMessageConst.REASON_TYPE_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

		if (getErrorManager().size() > 0) {
			return;
		}

		mZip.setPublicCd(wZipInput.getPublicCd());
		mZip.setZipCd5(wZipInput.getZipCd5());
		mZip.setZipCd(wZipInput.getZipCd());
		mZip.setAddressKn1(wZipInput.getAddressKn1());
		mZip.setAddressKn2(wZipInput.getAddressKn2());
		mZip.setAddressKn3(wZipInput.getAddressKn3());
		mZip.setAddress1(wZipInput.getAddress1());
		mZip.setAddress2(wZipInput.getAddress2());
		mZip.setAddress3(wZipInput.getAddress3());
		mZip.setFlg1(wZipInput.getFlg1());
		mZip.setFlg2(wZipInput.getFlg2());
		mZip.setFlg3(wZipInput.getFlg3());
		mZip.setFlg4(wZipInput.getFlg4());
		mZip.setUpdType(wZipInput.getUpdType());
		mZip.setReasonType(wZipInput.getReasonType());
	}

	/**
	 * <h2>郵便番号マスタテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 郵便番号マスタ移行が全削除後追記の場合、郵便番号マスタを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(ErrorStatus errSts) {
		delete(errSts);
	}

	/**
	 * <h2>郵便番号マスタテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 郵便番号マスタ移行が全削除後追記の場合、センタ郵便番号マスタと郵便番号マスタを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(ErrorStatus errSts) {
		//「運送業者郵便番号マスタ」テーブルを全件削除する
		try {
			MCarrierZipCB mCarrierZipCB = mCarrierZipBhv.newConditionBean();
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

		//「郵便番号マスタ」テーブルを全件削除する
		try {
			MZipCB mZipCB = mZipBhv.newConditionBean();
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

}
