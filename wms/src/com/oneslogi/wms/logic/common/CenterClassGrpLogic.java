package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterClassGrpCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CU;

/**
 * センタ区分値グループマスタ共通ロジッククラス。
 */
public class CenterClassGrpLogic extends AbstractLogic {

	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;

	/**
	 * <h2>センタ区分値グループマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値グループマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ区分値グループマスタ：区分値グループCD・センタ区分値ID
	 * @return MCenterClassGrp センタ区分値グループマスタ
	 */
	public MCenterClassGrp getUkEntityWithDeletedCheck(MCenterClassGrp entity) {

		if (CU.isNullOrEmpty(entity.getClassGrpCd())) {
			return null;
		}
		MCenterClassGrpCB cb = mCenterClassGrpBhv.newMyConditionBean();
		cb.query().setClassGrpCd_Equal(entity.getClassGrpCd());
		cb.query().setCenterClassId_Equal(entity.getCenterClassId());
		return mCenterClassGrpBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>センタ区分値グループマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値グループマスタデータを取得する。
	 * </pre>
	 * @param entity センタ区分値グループマスタ：区分値グループCD・センタ区分値ID
	 * @return MCenterClassGrp センタ区分値グループマスタ
	 */
	public MCenterClassGrp getUkEntity(MCenterClassGrp entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタ区分値グループマスタを取得する（エラー情報あり）。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値グループマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ区分値グループマスタ：区分値グループCD・センタ区分値ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterClassGrp センタ区分値グループマスタ
	 */
	public MCenterClassGrp getUkEntity(MCenterClassGrp entity, ErrorStatus errSts) {
		MCenterClassGrp resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "ClassNotFoundError");
		}
		return resultEntity;
	}

}
