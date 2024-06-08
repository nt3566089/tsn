package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値グループマスタメンテナンス削除ロジッククラス
 */
public class CenterClassGrpMasterDeleteLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;

	/**
	 * <h2>センタ区分値グループマスタを削除する。</h2>
	 * <pre>
	 * センタ区分値グループマスタを削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenterClassGrp センタ区分値グループマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCenterClassGrp mCenterClassGrp, ErrorStatus errSts) {

		// ===== センタ区分値グループマスタ削除実行 =====
		try {
			mCenterClassGrpBhv.delete(mCenterClassGrp);
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
	}

}
