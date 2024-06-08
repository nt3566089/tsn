package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtReceiveInspectionCB;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveInspectionBhv;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷検品・格納削除ロジッククラス
 */
public class ReceiveInspecStoreDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 入荷検品ワーク     */
	@Inject
	private WHtReceiveInspectionBhv wHtReceiveInspectionBhv;

	/**
	 * <h2>入荷検品ワークテーブルを削除する。</h2>
	 * <pre>
	 * 引数を条件に入荷検品ワークから対象のデータを削除する。
	 * </pre>
	 * @param wHtReceiveInspection 入荷検品ワーク：MACアドレス・ＨＴ作業ＮＯ
	 */
	public void clearWHtReceiveInspection(WHtReceiveInspection wHtReceiveInspection) {

		//入荷検品ワークテーブルの取得
		WHtReceiveInspectionCB wHtReceiveInspectionCB = wHtReceiveInspectionBhv.newConditionBean();
		wHtReceiveInspectionCB.query().setHtWorkNo_Equal(wHtReceiveInspection.getHtWorkNo());
		wHtReceiveInspectionCB.query().setMacAddress_Equal(wHtReceiveInspection.getMacAddress());

		wHtReceiveInspectionBhv.varyingQueryDelete(wHtReceiveInspectionCB, op -> op.allowNonQueryDelete());
	}
}