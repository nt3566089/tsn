package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ列マスタメンテナンス削除ロジッククラス
 */
public class CenterColMasterDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterColBhv mCenterColBhv;

	/**
	 * <h2>センタ列マスタを削除する。</h2>
	 * <pre>
	 * 引数のセンタ列マスタを削除する。
	 * </pre>
	 * @param mCenterCol センタ列マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCenterCol mCenterCol, ErrorStatus errSts) {

		// ===== センタ列マスタ削除実行 =====
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu Start
		try {
			mCenterColBhv.delete(mCenterCol);
		} catch(SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu End
	}

}