package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタマスタ共通ロジッククラス
 */
public class CenterLogic extends AbstractWmsLogic {

	@Inject
	private MCenterBhv mCenterBhv;

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタマスタ：センタID
	 * @return MCenter センタマスタ
	 */
	public MCenter getPkEntityWithDeletedCheck(MCenter entity) {
		if (entity.getCenterId() == null) {
			return null;
		}
		return mCenterBhv.selectByPKValueWithDeletedCheck(entity.getCenterId());
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタマスタデータを取得する。
	 * </pre>
	 * @param entity センタマスタ：センタID
	 * @return MCenter センタマスタ
	 */
	public MCenter getPkEntity(MCenter entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタマスタ：センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenter センタマスタ
	 */
	public MCenter getPkEntity(MCenter entity, ErrorStatus errSts) {
		MCenter resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "CenterNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタマスタ：センタCD
	 * @return MCenter センタマスタ
	 */
	public MCenter getUkEntityWithDeletedCheck(MCenter entity) {

		if (CU.isNullOrEmpty(entity.getCenterCd())) {
			return null;
		}

		MCenterCB cb = mCenterBhv.newMyConditionBean();
		cb.query().setCenterCd_Equal(entity.getCenterCd());
		return mCenterBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタマスタデータを取得する。
	 * </pre>
	 * @param entity センタマスタ：センタCD
	 * @return MCenter センタマスタ
	 */
	public MCenter getUkEntity(MCenter entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタマスタ：センタCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenter センタマスタ
	 */
	public MCenter getUkEntity(MCenter entity, ErrorStatus errSts) {
		MCenter resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

}
