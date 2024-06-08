package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MUserLoginCB;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザログインマスタ共通ロジッククラス
 */
public class UserLoginLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MUserLoginBhv mUserLoginBhv;

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にユーザログインマスタデータを取得する。
	 * </pre>
	 * @param entity ユーザログインマスタ：ユーザID
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getPkEntity(MUserLogin entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にユーザログインマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ユーザログインマスタ：ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getPkEntity(MUserLogin entity, ErrorStatus errSts) {
		MUserLogin resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.USER_LOGIN_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にユーザログインマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ユーザログインマスタ：ユーザID
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getPkEntityWithDeletedCheck(MUserLogin entity) {
		if (entity.getUserId() == null) {
			return null;
		}
		return mUserLoginBhv.selectByPKValueWithDeletedCheck(entity.getUserId());
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * 受取った引数をキーにユーザログインマスタデータを取得する。
	 * </pre>
	 * @param entity ユーザログインマスタ：ユーザID
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getUkEntity(MUserLogin entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * 引数を条件にユーザログインマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ユーザログインマスタ：ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getUkEntity(MUserLogin entity, ErrorStatus errSts) {
		MUserLogin resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.USER_LOGIN_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * 引数を条件にユーザログインマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ユーザログインマスタ：ユーザID
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getUkEntityWithDeletedCheck(MUserLogin entity) {
		if (entity.getUserId() == null) {
			return null;
		}

		MUserLoginCB cb = mUserLoginBhv.newMyConditionBean();
		cb.query().setUserId_Equal(entity.getUserId());
		return mUserLoginBhv.selectEntityWithDeletedCheck(cb);
	}
}