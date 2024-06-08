package com.oneslogi.ht.wms.logic.shipping;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 積込検品、梱包ヘッダデータ更新ロジッククラス
 */
public class ShippingLoadingInspectionUpdateLogic extends AbstractWmsLogic {

	@Inject
	TPackingHBhv tPackingHBhv;

	/**
	 * 積込フラグを更新する
	 * @param tPackingH 梱包ヘッダ
	 */
	public void updateTPackingH(WHtLoading wHtLoading){
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.query().setCenterId_Equal(wHtLoading.getCenterId());
		tPackingHCB.query().setClientId_Equal(wHtLoading.getClientId());
		tPackingHCB.query().setCarrierTraceNum_Equal(wHtLoading.getCarrierTraceNum());
		tPackingHCB.query().setShippingPackingNo_Equal(wHtLoading.getShippingPackingNo());
		tPackingHCB.query().setLoadingFlg_Equal_$0();
		tPackingHCB.query().addOrderBy_PackingHId_Asc();
		tPackingHCB.fetchFirst(1);
		TPackingH entity = tPackingHBhv.selectEntity(tPackingHCB) ;

		if(entity != null){
			entity.setLoadingFlg_$1();
			tPackingHBhv.update(entity);
		}
	}

}
