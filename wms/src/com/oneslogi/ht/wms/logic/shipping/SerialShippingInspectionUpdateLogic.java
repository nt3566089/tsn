package com.oneslogi.ht.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 *シリアル登録(出荷)更新ロジッククラス
 */
public class SerialShippingInspectionUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private SerialShippingInspectionSelectLogic selectLogic;
	@Inject
	private MProductBhv mProductBhv;

	/**
	 * <h2>シリアルNo.管理(t_serial_no)テーブルを更新する。</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(出荷)ワークテーブルを取得し、
	 * シリアルNo.管理(t_serial_no)テーブルを更新する。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：出庫作業No.・MACアドレス・荷主ID・センタID・商品ID
	 */
	public void updateTSerialNo(WHtSerialShippingInsp wHtSerialShippingInsp) {

		// 荷主センタマスタ検索
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(wHtSerialShippingInsp.getClientId());
		mClientCenter.setCenterId(wHtSerialShippingInsp.getCenterId());
		String systemDt = clientCenterLogic.getUkEntityWithDeletedCheck(mClientCenter).getSystemDt();

		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = selectLogic.selectList(wHtSerialShippingInsp);

		for (WHtSerialShippingInsp serialNoWork : lstWHtSerialShippingInsp) {

			// シリアルNo.管理(t_serial_no)情報を取得
			TSerialNoCB tSerialNoCB = tSerialNoBhv.newMyConditionBean();

			tSerialNoCB.checkInvalidQuery();
			tSerialNoCB.query().setCenterId_Equal(serialNoWork.getCenterId());
			tSerialNoCB.query().setClientId_Equal(serialNoWork.getClientId());
			tSerialNoCB.query().setSerialNo_Equal(serialNoWork.getSerialNo());
			tSerialNoCB.query().queryMProduct().setProductCd_Equal(serialNoWork.getProductCd());

			TSerialNo tSerialNo = tSerialNoBhv.selectEntity(tSerialNoCB);

			if (tSerialNo == null) {
				// 存在しない -> 新規追加

				MProductCB mProductCB = mProductBhv.newMyConditionBean();
				mProductCB.checkInvalidQuery();
				mProductCB.query().setClientId_Equal(serialNoWork.getClientId());
				mProductCB.query().setProductCd_Equal(serialNoWork.getProductCd());
				MProduct mProduct = mProductBhv.selectEntity(mProductCB);

				tSerialNo = new TSerialNo();
				tSerialNo.setCenterId(serialNoWork.getCenterId());
				tSerialNo.setClientId(serialNoWork.getClientId());
				tSerialNo.setSerialNo(serialNoWork.getSerialNo());
				tSerialNo.setProductId(mProduct.getProductId());
			} else {
				// 既に登録済 -> 更新

				String slipNo = tSerialNo.getPickingWorkNo();
				String slipNoWork = CU.nullToStr(serialNoWork.getPickingWorkNo());
				if (!CU.isNullOrEmpty(slipNo)) {

					if (!slipNo.equals(slipNoWork)) {
						// 伝票No.相違エラー

						getErrorManager().add(new ErrorStatus(), WmsMessageConst.SERIAL_NO_ALREADY_REGISTERED_ERROR_SHIPPING, tSerialNo.getSerialNo(), slipNo);
						return;
					}
				}
			}

			if (serialNoWork.getMCustomer() != null) {
				//納品先CD
				tSerialNo.setSupplyCustomerCd(serialNoWork.getMCustomer().getCustomerCd());
				//納品先名称
				tSerialNo.setSupplyCustomerNm(serialNoWork.getMCustomer().getCustomerNm());
			} else {
				//納品先CD
				tSerialNo.setSupplyCustomerCd(null);
				//納品先名称
				tSerialNo.setSupplyCustomerNm(null);
			}

			//出庫作業No.
			tSerialNo.setPickingWorkNo(serialNoWork.getPickingWorkNo());
			//出荷日
			tSerialNo.setShippingDt(systemDt);
			if (tSerialNo.getSerialNoId() != null) {
				//更新を行う
				tSerialNoBhv.update(tSerialNo);
			} else {
				//追加を行う
				tSerialNoBhv.insert(tSerialNo);
			}
		}
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End