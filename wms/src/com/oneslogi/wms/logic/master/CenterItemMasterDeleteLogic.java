package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ項目マスタメンテナンス削除ロジッククラス
 */
public class CenterItemMasterDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterItemBhv mCenterItemBhv;

	/**
	 * <h2>センタ項目マスタを削除する。</h2>
	 * <pre>
	 * 引数のセンタ項目マスタを削除する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCenterItem mCenterItem, ErrorStatus errSts) {

		// ===== センタ項目マスタ削除実行 =====
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu Start
		try {
			mCenterItemBhv.delete(mCenterItem);
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