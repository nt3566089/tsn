package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゆうパック送り状マスタメンテナンス削除ロジッククラス
 */
public class CarrierSlipYupkMasterDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	/**
	 * <h2>ゆうパック送り状マスタを削除する。</h2>
	 * <pre>
	 * 引数のゆうパック送り状マスタを削除する。
	 * </pre>
	 * @param mCarrierSlipYupk ゆうパック送り状マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCarrierSlipYupk mCarrierSlipYupk, ErrorStatus errSts) {

		// ===== ゆうパック送り状マスタ削除実行 =====
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu Start
		try {
			mCarrierSlipYupkBhv.delete(mCarrierSlipYupk);
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