package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 佐川送り状マスタメンテナンス削除ロジッククラス
 */
public class CarrierSlipSgwMasterDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;

	/**
	 * <h2>佐川送り状マスタを削除する。</h2>
	 * <pre>
	 * 引数の佐川送り状マスタを削除する。
	 * </pre>
	 * @param mCarrierSlipSgw 佐川送り状マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MCarrierSlipSgw mCarrierSlipSgw, ErrorStatus errSts) {

		// ===== 佐川送り状マスタ削除実行 =====
		// [Ver3.0][#4569] 外部キー制約エラーの制御 2018.05.16 shimizu Start
		try {
			mCarrierSlipSgwBhv.delete(mCarrierSlipSgw);
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