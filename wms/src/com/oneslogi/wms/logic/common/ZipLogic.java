package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 郵便番号共通ロジッククラス
 */
public class ZipLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZipBhv mZipBhv;

	// [EC-CT1-193] app.propertiesの読込みをbaseクラスに集約 2015.04.10 kawana

	/**
	 * <h2>登録時郵便番号CD存在チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・郵便番号CD存在チェック
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号
	 * @return boolean (true:郵便番号CD未存在)
	 */
	public boolean checkZipCd(MZip mZip) {
		boolean result = false;
		result = checkZipCd(mZip, null);
		return result;
	}

	/**
	 * <h2>登録時郵便番号CD存在チェック処理を行う。</h2>
	 * <pre>
	 * 郵便番号チェックの無効制御が「0：無効」場合、falseを返す。
	 *
	 * 郵便番号チェックの無効制御が「1：有効」場合、
	 * 引数の郵便番号CDを条件に郵便番号マスタのデータを検索し、
	 * 郵便番号CDが空白又検索件数が0件の場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:郵便番号CD未存在)
	 */
	public boolean checkZipCd(MZip mZip, ErrorStatus errSts) {

		// 削除フラグの自動検索無効化
		//this.setBehaviorAutoDelFlg(false);

		// [ON推-品向-845] システム設定テーブルを作成 2015.2.3 ichikawa Start
		int zipCdExistsCheckFlg = getPropertyIntValue(WmsPropertyConst.ZIP_CD_EXISTS_CHECK_FLG);
		// [ON推-品向-845] システム設定テーブルを作成 2015.2.3 ichikawa End

		// [EC-CT1-191] 郵便番号チェックの無効制御追加 ＋ NULLチェック追加 2015.04.09 kawana Start
		if (zipCdExistsCheckFlg == 0) {
			return false;
		}

		if (CU.isNullOrEmpty(mZip.getZipCd())) {
			this.getErrorManager().add(errSts, "zipCodeNotFoundError");
			return true;
		}
		// [EC-CT1-191] 郵便番号チェックの無効制御追加 ＋ NULLチェック追加 2015.04.09 kawana End

		MZipCB cb = mZipBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZipCd_Equal(mZip.getZipCd());

		int count = mZipBhv.selectCount(cb);
		if (count == 0) {
			this.getErrorManager().add(errSts, "zipCodeNotFoundError");
			return true;
		}
		return false;
	}

	// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
	/**
	 * <h2>一括取込用郵便番号CD存在チェック処理を行う。</h2>
	 * <pre>
	 * 郵便番号チェックの無効制御が「0：無効」場合、falseを返す。
	 *
	 * 郵便番号チェックの無効制御が「1：有効」場合、以下のチェック処理を行う。
	 * 郵便番号CD必須チェック エラーの場合、必須エラーをエラー情報として管理する。
	 * 郵便番号CD文字種チェック エラーの場合、文字種エラーをエラー情報として管理する。
	 * 郵便番号CD長さチェック エラーの場合、長さエラーをエラー情報として管理する。
	 * 郵便番号CDマスタ存在チェック 検索件数が0件の場合、マスタ未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号
	 * @param patternStr 文字種チェック用正規表現のコンテンツ
	 * @param lengthPatternStr 長さチェック用正規表現のコンテンツ
	 * @param lengthStr 長さチェック用エラーメッセージ置き換え文字
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:郵便番号CDチェックエラー有り)
	 */
	public boolean bulkInputCheckZipCd(MZip mZip, String patternStr, String lengthPatternStr, String length, ErrorStatus errSts) {

		int zipCdExistsCheckFlg = getPropertyIntValue(WmsPropertyConst.ZIP_CD_EXISTS_CHECK_FLG);

		if (zipCdExistsCheckFlg == 0) {
			return false;
		}

		if (CU.isNullOrEmpty(mZip.getZipCd())) {
			this.getErrorManager().add(errSts, WmsMessageConst.ZIP_CODE_NOT_INPUT_ERROR);
			return true;
		}
		if (!WmsCommonUtil.checkPatternInput(patternStr, mZip.getZipCd())) {
			// 文字種エラー
			this.getErrorManager().add(errSts, WmsMessageConst.ZIP_CD_CHECK_NUMERIC_ONLY_ERROR);
			return true;
		}
		if (!WmsCommonUtil.checkPatternInput(lengthPatternStr, mZip.getZipCd())) {
			// 長さエラー
			this.getErrorManager().add(errSts, WmsMessageConst.ZIP_CD_CHECK_INPUT_MAX_ERROR);
			return true;
		}

		MZipCB cb = mZipBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZipCd_Equal(mZip.getZipCd());

		int count = mZipBhv.selectCount(cb);
		if (count == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
			return true;
		}
		return false;
	}
	// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End

	/**
	 * <h2>登録時郵便番号CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・郵便番号CD重複チェック
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号
	 * @return boolean (true:郵便番号CD重複)
	 */
	public boolean checkZipCdInsert(MZip mZip) {
		boolean result = false;
		result = checkZipCdInsert(mZip, null);
		return result;
	}

	/**
	 * <h2>登録時郵便番号CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に郵便番号マスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:郵便番号CD重複)
	 */
	public boolean checkZipCdInsert(MZip mZip, ErrorStatus errSts) {

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MZipCB cb = mZipBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZipCd_Equal(mZip.getZipCd());

		int count = mZipBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時郵便番号CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・郵便番号CD重複チェック
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号・郵便番号ID
	 * @return boolean (true:郵便番号CD重複)
	 */
	public boolean checkZipCdUpdate(MZip mZip) {
		boolean result = false;
		result = checkZipCdUpdate(mZip, null);
		return result;
	}

	/**
	 * <h2>更新時郵便番号CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に郵便番号マスタのデータを検索し、
	 * 検索結果が見つかった場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号・郵便番号ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:郵便番号CD重複)
	 */
	public boolean checkZipCdUpdate(MZip mZip, ErrorStatus errSts) {

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MZipCB cb = mZipBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZipCd_Equal(mZip.getZipCd());
		MZip zip = mZipBhv.selectEntity(cb);

		if (zip != null && zip.getZipId().longValue() != mZip.getZipId().longValue()) {
			this.getErrorManager().add(errSts, "zipCodeDuplicateError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>郵便番号マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に郵便番号マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 郵便番号マスタ：郵便番号ID
	 * @return MZip 郵便番号マスタ
	 */
	public MZip getPkEntityWithDeletedCheck(MZip entity) {
		if (entity.getZipId() == null) {
			return null;
		}
		return mZipBhv.selectByPKValueWithDeletedCheck(entity.getZipId());
	}

	/**
	 * <h2>郵便番号マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に郵便番号マスタデータを取得する。
	 * </pre>
	 * @param entity 郵便番号マスタ：郵便番号ID
	 * @return MZip 郵便番号マスタ
	 */
	public MZip getPkEntity(MZip entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>郵便番号マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に郵便番号マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 郵便番号マスタ：郵便番号ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MZip 郵便番号マスタ
	 */
	public MZip getPkEntity(MZip entity, ErrorStatus errSts) {
		MZip resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "zipNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>郵便番号マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に郵便番号マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 郵便番号マスタ：郵便番号
	 * @return MZip 郵便番号マスタ
	 */
	public MZip getUkEntityWithDeletedCheck(MZip entity) {

		if (CU.isNullOrEmpty(entity.getZipCd())) {
			return null;
		}

		MZipCB cb = mZipBhv.newMyConditionBean();
		cb.query().setZipCd_Equal(entity.getZipCd());
		return mZipBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>郵便番号マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に郵便番号マスタデータを取得する。
	 * </pre>
	 * @param entity 郵便番号マスタ：郵便番号
	 * @return MZip 郵便番号マスタ
	 */
	public MZip getUkEntity(MZip entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>郵便番号マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に郵便番号マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 郵便番号マスタ：郵便番号
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MZip 郵便番号マスタ
	 */
	public MZip getUkEntity(MZip entity, ErrorStatus errSts) {
		MZip resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "zipNotFoundError");
		}
		return resultEntity;
	}

}
