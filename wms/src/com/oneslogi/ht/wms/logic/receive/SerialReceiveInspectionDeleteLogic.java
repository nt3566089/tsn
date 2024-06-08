package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtSerialReceiveInspCB;
import com.oneslogi.base.dbflute.exbhv.WHtSerialReceiveInspBhv;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷)削除ロジッククラス
 */
public class SerialReceiveInspectionDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* シリアル登録(入荷)ワーク    */
	@Inject
	private WHtSerialReceiveInspBhv wHtSerialReceiveInspBhv;

	/**
	 * <h2>シリアル登録(入荷)ワーク削除(全て).</h2>
	 * <pre>
	 * MACアドレスを条件にシリアル登録(入荷)ワークデータを削除する。
	 * </pre>
	 * @param WHtSerialReceiveInsp シリアル登録(入荷)ワーク：MACアドレス
	 */
	public void clearWHtSerialReceiveInspection(WHtSerialReceiveInsp wHtSerialReceiveInsp) {

		// シリアル入荷ワークテーブル削除
		WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newConditionBean();
		cb.checkInvalidQuery();
		cb.query().setMacAddress_Equal(wHtSerialReceiveInsp.getMacAddress());

		wHtSerialReceiveInspBhv.queryDelete(cb);
	}

	/**
	 * <h2>シリアル登録(入荷)ワークを削除する(商品).</h2>
	 * <pre>
	 * MACアドレス、商品CDを条件にシリアル登録(入荷)ワークデータを削除する。
	 * </pre>
	 * @param WHtSerialReceiveInsp シリアル登録(入荷)ワーク：MACアドレス、商品CD
	 */
	public void clearWHtSerialReceiveInspectionProduct(WHtSerialReceiveInsp wHtSerialReceiveInsp) {

		// シリアル入荷ワークテーブル削除
		WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newConditionBean();
		cb.checkInvalidQuery();
		cb.query().setProductCd_Equal(wHtSerialReceiveInsp.getProductCd());
		cb.query().setMacAddress_Equal(wHtSerialReceiveInsp.getMacAddress());

		wHtSerialReceiveInspBhv.queryDelete(cb);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End