package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCarrierZipCB;
import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.cbean.WCarrierZipInputCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierZipBhv;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exbhv.WCarrierZipInputBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierZip;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.WCarrierZipInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CommonCarrierLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 運送業者郵便番号マスタ取込ロジッククラス
 */
public class CarrierZipInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WCarrierZipInputBhv wCarrierZipInputBhv;
	@Inject
	private MCarrierZipBhv mCarrierZipBhv;
	// [#436] 郵便番号が重複して登録されていると途中でエラーになる問題を修正 2016.12.14 kawana Start
	@Inject
	private MZipBhv mZipBhv;
	// [#436] 郵便番号が重複して登録されていると途中でエラーになる問題を修正 2016.12.14 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private CommonCarrierLogic commonCarrierLogic;
	@Inject
	private CarrierZipMasterInsertLogic carrierZipMasterInsertLogic;

	// [#436] 郵便番号が重複して登録されていると途中でエラーになる問題を修正(ZipLogicを削除) 2016.12.14 kawana


	/**
	 * <h2運送業者郵便番号マスタ取込ワークテーブルに登録処理（コミットある）</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを運送業者郵便番号マスタ取込ワークテーブルに登録する事。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCarrierZipInput 運送業者郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WCarrierZipInput> lstWCarrierZipInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWCarrierZipInput, errSts);
	}

	/**
	 * <h2>運送業者郵便番号マスタ取込ワークテーブルに登録処理（コミットなし）</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを運送業者郵便番号マスタ取込ワークテーブルに登録する事。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCarrierZipInput 運送業者郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WCarrierZipInput> lstWCarrierZipInput, ErrorStatus errSts) {
		wCarrierZipInputBhv.batchInsert(lstWCarrierZipInput);
	}

	/**
	 * <h2>運送業者郵便番号マスタ取込ワークテーブルを全件削除処理（コミットある）</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、運送業者郵便番号マスタ取込ワークを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>運送業者郵便番号マスタ取込ワークテーブルを全件削除処理（コミットなし）</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、運送業者郵便番号マスタ取込ワークを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「ヤマト着店マスタ取込ワーク」テーブルを全件削除する
		try {
			WCarrierZipInputCB wCarrierZipInputCB = wCarrierZipInputBhv.newConditionBean();
			wCarrierZipInputBhv.varyingQueryDelete(wCarrierZipInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wCarrierZipInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>運送業者郵便番号マスタを移行する（コミットあり）。</h2>
	 * <pre>
	 * 運送業者郵便番号マスタ登録を呼出し、運送業者郵便番号マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCarrierZipInput運送業者郵便番号マスタ 取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Mod Start
	public void deleteWithCommit(DataInputDto dataInputDto, List<WCarrierZipInput> lstWCarrierZipInput, ErrorStatus errSts) {
		delete(dataInputDto, lstWCarrierZipInput, errSts);
	}
	// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Mod End

	/**
	 * <h2>運送業者郵便番号マスタテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 運送業者郵便番号マスタ移行が全削除後追記の場合、センタ運送業者郵便番号マスタと取引先マスタを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Mod Start
	public void delete(DataInputDto dataInputDto, List<WCarrierZipInput> lstWCarrierZipInput, ErrorStatus errSts) {
	// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Mod End
		//「運送業者郵便番号マスタにパラメータマスタの運送業者郵便番号マスタ以外のデータ」テーブルを全件削除する
		try {
			// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Add Start
			// 共通運送業者マスタから削除対象の共通運送業者を取得
			MCommonCarrier mCommonCarrier = new MCommonCarrier();
			if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$06.code())) {
				mCommonCarrier.setCarrierCd("YMT");
			}else if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$07.code())) {
				mCommonCarrier.setCarrierCd("JP");
			}
			mCommonCarrier = commonCarrierLogic.getUkEntity(mCommonCarrier);
			Long lngCommonCarriengId = mCommonCarrier.getCommonCarrierId();
			// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Add End
			MCarrierZipCB mCarrierZipCB = mCarrierZipBhv.newConditionBean();
				// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Add Start
				mCarrierZipCB.query().setCommonCarrierId_Equal(lngCommonCarriengId);
				// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Add End
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
	}

	/**
	 * <h2>運送業者郵便番号マスタを移行する（コミットあり）。</h2>
	 * <pre>
	 * 運送業者郵便番号マスタ登録を呼出し、運送業者郵便番号マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCarrierZipInput 運送業者郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WCarrierZipInput> lstWCarrierZipInput,
			ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWCarrierZipInput, errSts);
	}

	/**
	 * <h2>運送業者郵便番号マスタを移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、運送業者郵便番号マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCarrierZipInput 運送業者郵便番号マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, List<WCarrierZipInput> lstWCarrierZipInput,
			ErrorStatus errSts) throws Exception {

		// 送業者郵便番号マスタ登録処理を行う
		MCommonCarrier mCommonCarrier = new MCommonCarrier();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$06.code())) {
			mCommonCarrier.setCarrierCd("YMT");
		}else if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$07.code())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			mCommonCarrier.setCarrierCd("JP");
		}
		mCommonCarrier = commonCarrierLogic.getUkEntity(mCommonCarrier);
		Long lngCommonCarriengId = mCommonCarrier.getCommonCarrierId();

		for (WCarrierZipInput wCarrierZipInput : lstWCarrierZipInput) {

			MCarrierZip mCarrierZip  = new MCarrierZip();

			getErrorManager().clear();

			// 取込データのチェック処理を行う
			mCarrierZip.setCommonCarrierId(lngCommonCarriengId);
			checkRegister(wCarrierZipInput, mCarrierZip, errSts);
			if (getErrorManager().size() > 0) {
				setErrorMessage(wCarrierZipInput, getErrorManager());
				wCarrierZipInputBhv.update(wCarrierZipInput);
				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}
			carrierZipMasterInsertLogic.insert(mCarrierZip, errSts);
			if (getErrorManager().size() > 0) {
				setErrorMessage(wCarrierZipInput, getErrorManager());
				wCarrierZipInputBhv.update(wCarrierZipInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			wCarrierZipInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wCarrierZipInputBhv.update(wCarrierZipInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、下記のチェックを行う。
	 *・ 郵便番号CDの存在チェック
	 *・郵便番号CDの必須チェック
	 *・仕分コードの必須チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 運送業者郵便番号マスタ取込ワークの郵便番号CDによりセンタ運送業者郵便番号マスタ情報を取得し、
	 * 引数のセンタ運送業者郵便番号マスタに設定する。
	 * 引数の運送業者郵便番号マスタに運送業者郵便番号マスタ取込ワーク情報を設定する。
	 * </pre>
	 * @param wCarrierZipInput 運送業者郵便番号マスタ取込ワーク：全項目
	 * @param mCarrierZip 運送業者郵便番号マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkRegister(WCarrierZipInput wCarrierZipInput, MCarrierZip mCarrierZip, ErrorStatus errSts) {

		wCarrierZipInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wCarrierZipInput.setErrorMsg("");

		// [#436] 郵便番号が重複して登録されていると途中でエラーになる問題を修正 2016.12.14 kawana Start

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// ===== チェック =====

		// 郵便番号CD
		if (CU.isNullOrEmpty(wCarrierZipInput.getZipCd())) {
			// 必須エラー
			getErrorManager().add(errSts, WmsMessageConst.ZIP_CODE_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9]*$", wCarrierZipInput.getZipCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD_CHECK_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9]{1,7}$", wCarrierZipInput.getZipCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZIP_CD_CHECK_INPUT_MAX_ERROR);
			}
		}

		// 仕分コード
		if (CU.isNullOrEmpty(wCarrierZipInput.getArrivalStoreCd())) {
			// 必須エラー
			getErrorManager().add(errSts, WmsMessageConst.ARRIVAL_STORE_CD_NOT_INPUT_ERROR);
		} else {
			// [Ver3.0][#4613] 仕分CDチェックなのに、郵便番号のチェックをしていたため、修正 2018.05.15 shimizu Start
			if (!WmsCommonUtil.checkPatternInput(".{1,30}$", wCarrierZipInput.getArrivalStoreCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ARRIVAL_STORE_CD_CHECK_INPUT_MAX_ERROR, "30");
			}
			// [Ver3.0][#4613] 仕分CDチェックなのに、郵便番号のチェックをしていたため、修正 2018.05.15 shimizu End
		}

		// [Ver3.0][#4613] 仕分名称のエラーチェック追加 2018.05.15 shimizu Start
		// 仕分名称
		if(!CU.isNullOrEmpty(wCarrierZipInput.getArrivalStoreNm())) {
			if (!WmsCommonUtil.checkPatternInput(".{1,50}$", wCarrierZipInput.getArrivalStoreNm())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ARRIVAL_STORE_NM_CHECK_INPUT_MAX_ERROR, "50");
			}
		}
		// [Ver3.0][#4613] 仕分名称のエラーチェック追加 2018.05.15 shimizu End

		if (getErrorManager().size() > 0) {
			return;
		}

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

		// ===== 郵便番号ID設定 =====

		MZipCB zipCb = mZipBhv.newMyConditionBean();
		zipCb.query().setZipCd_Equal(wCarrierZipInput.getZipCd());
		List<MZip> zipList = mZipBhv.selectList(zipCb);
		if (zipList.size() < 1) {
			// 郵便番号マスタに登録なし
			// ※※※ 郵便番号がないデータが多数あるのでエラーとしない

			// [#436] 郵便場号がない場合、エラーとせずにスキップする(エラーの登録処理を削除) 2016.12.15 kawana
			return;
		}

		// 1件目のIDを使用
		mCarrierZip.setZipId(zipList.get(0).getZipId());
		// [#436] 郵便番号が重複して登録されていると途中でエラーになる問題を修正 2016.12.14 kawana End

		mCarrierZip.setArrivalStoreCd(wCarrierZipInput.getArrivalStoreCd());
		mCarrierZip.setArrivalStoreNm(wCarrierZipInput.getArrivalStoreNm());
	}

}
