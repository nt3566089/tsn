package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MSetParentCB;
import com.oneslogi.base.dbflute.exbhv.MSetParentBhv;
import com.oneslogi.base.dbflute.exentity.MSetParent;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * セット品親マスタ取得共通ロジッククラス
 */
public class SetParentLogic extends AbstractWmsLogic {

	@Inject
	private MSetParentBhv mSetParentBhv;

	/**
	 * <h2>セット品親マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセット品親マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity セット品親マスタ：商品ID
	 * @return MSetParent セット品親マスタ
	 */
	public MSetParent getUkEntityWithDeletedCheck(MSetParent entity) {
		if (entity.getProductId() == null) {
			return null;
		}

		MSetParentCB cb = mSetParentBhv.newMyConditionBean();
		cb.query().setProductId_Equal(entity.getProductId());
		return mSetParentBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>セット品親マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセット品親マスタデータを取得する。
	 * </pre>
	 * @param entity セット品親マスタ：商品ID
	 * @return MSetParent セット品親マスタ
	 */
	public MSetParent getUkEntity(MSetParent entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>セット品親マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセット品親マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity セット品親マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MSetParent セット品親マスタ
	 */
	public MSetParent getUkEntity(MSetParent entity, ErrorStatus errSts) {
		MSetParent resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "SetParentFoundError");
		}
		return resultEntity;
	}

}
