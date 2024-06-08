package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ画面マスタメンテナンス削除ロジッククラス
 */
public class CenterScreenMasterDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterScreenBhv mCenterScreenBhv;

	/**
	 * <h2>センタ画面マスタを削除する。</h2>
	 * <pre>
	 * 引数のセンタ画面マスタを削除する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCenterScreen mCenterScreen, ErrorStatus errSts) {

		// ===== センタ画面マスタ削除実行 =====
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu Start
		try {
			mCenterScreenBhv.delete(mCenterScreen);
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