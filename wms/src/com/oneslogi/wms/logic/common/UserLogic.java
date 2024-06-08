package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザマスタ共通ロジッククラス
 */
public class UserLogic extends AbstractWmsLogic {

	@Inject
	private BUserBhv bUserBhv;

	/**
	 * <h2>ユーザマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にユーザマスタデータを取得する。
	 * </pre>
	 * @param entity ユーザマスタ：ユーザID
	 * @return BUser ユーザマスタ
	 */
	public BUser getPkEntityWithDeletedCheck(BUser entity) {
		if (entity.getUserId() == null) {
			return null;
		}
		return bUserBhv.selectByPKValueWithDeletedCheck(entity.getUserId());
	}

	/**
	 * <h2>ユーザマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にユーザマスタデータを取得する。
	 * </pre>
	 * @param entity ユーザマスタ：ユーザID
	 * @return BUser ユーザマスタ
	 */
	public BUser getPkEntity(BUser entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>ユーザマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にユーザマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ユーザマスタ：ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return BUser ユーザマスタ
	 */
	public BUser getPkEntity(BUser entity, ErrorStatus errSts) {
		BUser resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "clientNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>ユーザマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にユーザマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ユーザマスタ：ユーザCD
	 * @return BUser ユーザマスタ
	 */
	public BUser getUkEntityWithDeletedCheck(BUser entity) {

//		Long cultureId = this.getCultureId();
//		if (cultureId == null) {
//			return null;
//		}
		String userCd = entity.getUserCd();
		if (userCd == null) {
			return null;
		}

		BUserCB cb = bUserBhv.newMyConditionBean();
//		cb.query().setCultureId_Equal(cultureId);
		cb.query().setUserCd_Equal(userCd);

		return bUserBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>ユーザマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にユーザマスタデータを取得する。
	 * </pre>
	 * @param entity ユーザマスタ：ユーザCD
	 * @return BUser ユーザマスタ
	 */
	public BUser getUkEntity(BUser entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ユーザマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にユーザマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ユーザマスタ：ユーザCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return BUser ユーザマスタ
	 */
	public BUser getUkEntity(BUser entity, ErrorStatus errSts) {
		BUser resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "clientNotFoundError");
		}
		return resultEntity;
	}


}
