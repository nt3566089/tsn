package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷)登録ロジッククラス
 */
public class SerialReceiveInspectionUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TSerialNoBhv tSerialNoBhv;

	public void update(TSerialNo TSerialNoReault, WHtSerialReceiveInsp wHtSerialReceiveInsp, MClientCenter mClientCenter) {
		if (wHtSerialReceiveInsp.getMCustomer() != null) {
			TSerialNoReault.setSupplierCd(wHtSerialReceiveInsp.getMCustomer().getCustomerCd());
			TSerialNoReault.setSupplierNm(wHtSerialReceiveInsp.getMCustomer().getCustomerNm());
		} else {
			TSerialNoReault.setSupplierCd(null);
			TSerialNoReault.setSupplierNm(null);
		}
		TSerialNoReault.setReceiveSlipNo(wHtSerialReceiveInsp.getReceiveSlipNo());
		TSerialNoReault.setReceiveDt(mClientCenter.getSystemDt());
		tSerialNoBhv.update(TSerialNoReault);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End