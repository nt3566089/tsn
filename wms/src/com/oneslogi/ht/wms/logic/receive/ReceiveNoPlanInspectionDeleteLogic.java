package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtReceiveNoPlanInspCB;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveNoPlanInspBhv;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 予定無し入荷削除ロジッククラス
 */
public class ReceiveNoPlanInspectionDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 予定無し入荷ワーク     */
	@Inject
	private WHtReceiveNoPlanInspBhv wHtReceiveNoPlanInspecBhv;

	/**
	 * <h2>予定無し入荷ワークテーブルを削除する。</h2>
	 * <pre>
	 * 引数を条件に予定無し入荷ワークから対象のデータを削除する。
	 * </pre>
	 * @param wHtReceiveNoPlanInspec 予定無し入荷ワーク：MACアドレス
	 */
	public void clearWHtReceiveNoPlanInsption(WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec) {

		//予定無し入荷ワークテーブルの取得
		WHtReceiveNoPlanInspCB wHtReceiveNoPlanInspecCB = wHtReceiveNoPlanInspecBhv.newConditionBean();
		wHtReceiveNoPlanInspecCB.query().setMacAddress_Equal(wHtReceiveNoPlanInspec.getMacAddress());

		wHtReceiveNoPlanInspecBhv.varyingQueryDelete(wHtReceiveNoPlanInspecCB, op -> op.allowNonQueryDelete());
	}
}