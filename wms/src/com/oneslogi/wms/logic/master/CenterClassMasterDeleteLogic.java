package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値マスタメンテナンス削除ロジッククラス
 */
public class CenterClassMasterDeleteLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;

	/**
	 * <h2>センタ区分値マスタを削除する。</h2>
	 * <pre>
	 * センタ区分値マスタを削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCenterClass mCenterClass, ErrorStatus errSts) {

		// ===== センタ区分値マスタ削除実行 =====
		try{
			mCenterClassBhv.delete(mCenterClass);
		}catch(SQLFailureException e){
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
	}

}
