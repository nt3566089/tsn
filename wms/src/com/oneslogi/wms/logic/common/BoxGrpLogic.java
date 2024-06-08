package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MBoxGrpCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
/**
 * 荷材グループマスタ共通ロジッククラス
 */
public class BoxGrpLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private MBoxGrpBhv mBoxGrpBhv;

	/**
	 * <h2>荷材グループマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷材グループマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷材グループマスタ：センタID・荷材グループCD
	 * @return MBoxGrp 荷材グループマスタ
	 */
	public MBoxGrp getUkEntityWithDeletedCheck(MBoxGrp entity) {

		if (entity.getCenterId() == null) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getBoxGrpCd())) {
			return null;
		}

		MBoxGrpCB cb = mBoxGrpBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setBoxGrpCd_Equal(entity.getBoxGrpCd());
		return mBoxGrpBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>荷材グループマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷材グループマスタデータを取得する。
	 * </pre>
	 * @param entity 荷材グループマスタ：センタID・荷材グループCD
	 * @return MBoxGrp 荷材グループマスタ
	 */
	public MBoxGrp getUkEntity(MBoxGrp entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷材グループマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷材グループマスタデータを取得する。
	 * 検索対象が見つからない場合、未選択エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷材グループマスタ：センタID・荷材グループCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MBoxGrp 荷材グループマスタ
	 */
	public MBoxGrp getUkEntity(MBoxGrp entity, ErrorStatus errSts) {
		MBoxGrp resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.BOX_TYPE_NOT_SELECT_ERROR);
		}
		return resultEntity;
	}
}
