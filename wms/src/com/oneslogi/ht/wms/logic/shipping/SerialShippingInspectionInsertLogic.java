package com.oneslogi.ht.wms.logic.shipping;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtSerialShippingInspCB;
import com.oneslogi.base.dbflute.exbhv.WHtSerialShippingInspBhv;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷)登録ロジッククラス
 */
public class SerialShippingInspectionInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private WHtSerialShippingInspBhv wHtSerialShippingInspBhv;

	public int insertWHtSerialShippingInspec(WHtSerialShippingInsp wHtSerialShippingInsp) {

		// ===== 既登録チェック =====

		WHtSerialShippingInspCB checkCb = wHtSerialShippingInspBhv.newMyConditionBean();
		checkCb.specify().columnHtSerialShippingInspId();
		checkCb.checkInvalidQuery();
		checkCb.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		checkCb.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		checkCb.query().setMacAddress_Equal(wHtSerialShippingInsp.getMacAddress());
		checkCb.query().setProductCd_Equal(wHtSerialShippingInsp.getProductCd());
		checkCb.query().setSerialNo_Equal(wHtSerialShippingInsp.getSerialNo());

		WHtSerialShippingInsp entity = wHtSerialShippingInspBhv.selectEntity(checkCb);

		boolean doUpdate = false;
		if (entity != null) {
			// 登録済

			// 追加ではなく更新
			doUpdate = true;
			wHtSerialShippingInsp.setHtSerialShippingInspId(entity.getHtSerialShippingInspId());
		}

		// ===== 登録(追加または更新) =====

		if (doUpdate) {
			wHtSerialShippingInspBhv.updateNonstrict(wHtSerialShippingInsp);
			return 0;
		} else {
			wHtSerialShippingInspBhv.insert(wHtSerialShippingInsp);
			return 1;
		}
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
