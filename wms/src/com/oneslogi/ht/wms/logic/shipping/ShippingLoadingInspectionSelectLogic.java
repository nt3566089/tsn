package com.oneslogi.ht.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.cbean.WHtLoadingCB;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exbhv.WHtLoadingBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 積込検品データ取得ロジッククラス
 */
public class ShippingLoadingInspectionSelectLogic extends AbstractWmsLogic {

	@Inject
	MDeliveryCourseBhv mDeliveryCourseBhv;
	@Inject
	WHtLoadingBhv wHtLoadingBhv;


	/**
	 * 配送コースマスタからデータ取得
	 *
	 * @param mCenter
	 * @return
	 * @throws Exception
	 */
	public List<MDeliveryCourse> selectDeliveryCourseList(MCenter mCenter) throws Exception{

		List<MDeliveryCourse> list;

		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(mCenter.getCenterId());
		list = mDeliveryCourseBhv.selectList(cb);

		return list;

	}

	/**
	 * 配送コース情報取得
	 * @param mCenter
	 * @param mDeliveryCourse
	 * @return retMDeliveryCourse
	 */
	public MDeliveryCourse getMDeliveryCourse(MCenter mCenter,MDeliveryCourse mDeliveryCourse){

		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(mCenter.getCenterId());
		cb.query().setDeliveryCourseCd_Equal(mDeliveryCourse.getDeliveryCourseCd());

		MDeliveryCourse retMDeliveryCourse = mDeliveryCourseBhv.selectEntity(cb);

		return retMDeliveryCourse;
	}

	public List<WHtLoading> selectList(WHtLoading wHtLoading)throws Exception{
		WHtLoadingCB cb = wHtLoadingBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(wHtLoading.getCenterId());
		cb.query().setClientId_Equal(wHtLoading.getClientId());
		cb.query().setMacAddress_Equal(wHtLoading.getMacAddress());
		List<WHtLoading> lstWhtLoading = wHtLoadingBhv.selectList(cb);

		if(lstWhtLoading.size() == 0){
			getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
		}
		return lstWhtLoading;
	}



}
