package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザマスデータの更新ロジッククラス
 */
public class UserEditUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private BUserBhv bUserBhv;

	/**
	 * <h2>ユーザマスタデータの更新処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをユーザマスタに更新する。
	 * </pre>
	 * @param bUser ユーザマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(BUser bUser, ErrorStatus errSts) {

		// ===== 商品マスタ更新実行 =====
		bUserBhv.update(bUser);
	}
}