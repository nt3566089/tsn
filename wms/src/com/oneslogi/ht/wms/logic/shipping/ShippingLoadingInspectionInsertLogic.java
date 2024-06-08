package com.oneslogi.ht.wms.logic.shipping;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.WHtLoadingBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 積込検品ワークテーブル登録クラス
 */
public class ShippingLoadingInspectionInsertLogic extends AbstractWmsLogic {


	@Inject
	WHtLoadingBhv wHtLoadingBhv;
	@Inject
	TPackingHBhv tPackingHBhv;

	/**
	 *積込検品ワークテーブル登録
	 * @param wHtLoading
	 */
	public void insertWHtLoading(WHtLoading wHtLoading){

		TPackingHCB tPackingHCb = tPackingHBhv.newMyConditionBean();
		tPackingHCb.query().setCenterId_Equal(wHtLoading.getCenterId());
		tPackingHCb.query().setClientId_Equal(wHtLoading.getClientId());
		tPackingHCb.query().setCarrierTraceNum_Equal(wHtLoading.getCarrierTraceNum());
		tPackingHCb.query().setShippingPackingNo_Equal(wHtLoading.getShippingPackingNo());
		tPackingHCb.query().setLoadingFlg_Equal_$0();
		tPackingHCb.query().addOrderBy_PackingHId_Asc();
		tPackingHCb.fetchFirst(1);

		TPackingH tPackingH = tPackingHBhv.selectEntity(tPackingHCb);

		WHtLoading entity = new WHtLoading();
		entity.setMacAddress(wHtLoading.getMacAddress());
		entity.setClientId(wHtLoading.getClientId());
		entity.setCenterId(wHtLoading.getCenterId());
		entity.setPackingHId(tPackingH.getPackingHId());
		entity.setCarrierTraceNum(wHtLoading.getCarrierTraceNum());
		entity.setShippingPackingNo(wHtLoading.getShippingPackingNo());
		entity.setDeliveryCourseId(wHtLoading.getDeliveryCourseId());

		wHtLoadingBhv.insert(entity);

	}

}
