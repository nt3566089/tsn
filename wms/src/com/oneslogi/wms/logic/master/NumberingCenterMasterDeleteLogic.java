package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *センタ採番マスタメンテナンス削除ロジッククラス
 */
public class NumberingCenterMasterDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;

	/**
	 * <h2>センタ採番マスタを削除する。</h2>
	 * <pre>
	 * 引数のセンタ採番マスタを削除する。
	 * </pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MNumberingCenter mNumberingCenter, ErrorStatus errSts) {

		// =====センタ採番マスタ削除実行 =====
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu Start
		try {
			mNumberingCenterBhv.delete(mNumberingCenter);
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