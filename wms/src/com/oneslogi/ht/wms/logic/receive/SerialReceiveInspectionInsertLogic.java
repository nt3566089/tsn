package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import org.dbflute.optional.OptionalEntity;

import com.oneslogi.base.dbflute.cbean.WHtSerialReceiveInspCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialReceiveInspBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷)登録ロジッククラス
 */
public class SerialReceiveInspectionInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private WHtSerialReceiveInspBhv wHtSerialReceiveInspBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;

	public void insert(WHtSerialReceiveInsp list, MProduct mProduct, MClientCenter mClientCenter) {
		TSerialNo tSerialNo = new TSerialNo();
		if (list.getMCustomer() != null) {
			tSerialNo.setSupplierCd(list.getMCustomer().getCustomerCd());
			tSerialNo.setSupplierNm(list.getMCustomer().getCustomerNm());
		}
		tSerialNo.setCenterId(list.getCenterId());
		tSerialNo.setClientId(list.getClientId());
		tSerialNo.setSerialNo(list.getSerialNo());
		tSerialNo.setProductId(mProduct.getProductId());
		tSerialNo.setReceiveSlipNo(list.getReceiveSlipNo());
		tSerialNo.setReceiveDt(mClientCenter.getSystemDt());
		tSerialNoBhv.insert(tSerialNo);
	}

	/**
	 * <h2>シリアル登録(入荷)ワーク登録.</h2>
	 * <pre>
	 * 引数のシリアル登録(入荷)ワークをDBに登録する。
	 * 既に登録済のシリアルNo.の場合は、上書き更新する。
	 *
	 * </pre>
	 * @param wHtSerialReceiveInsp シリアル登録(入荷)ワーク
	 * @param supplierCd 仕入先CD
	 * @return 1:追加  0:更新
	 */
	public int insertWHtSerialReceiveInspec(WHtSerialReceiveInsp wHtSerialReceiveInsp, String supplierCd) {

		// ===== 既登録チェック =====

		WHtSerialReceiveInspCB checkCb = wHtSerialReceiveInspBhv.newMyConditionBean();
		checkCb.specify().columnHtSerialReceiveInspId();
		checkCb.checkInvalidQuery();
		checkCb.query().setCenterId_Equal(wHtSerialReceiveInsp.getCenterId());
		checkCb.query().setClientId_Equal(wHtSerialReceiveInsp.getClientId());
		checkCb.query().setMacAddress_Equal(wHtSerialReceiveInsp.getMacAddress());
		checkCb.query().setProductCd_Equal(wHtSerialReceiveInsp.getProductCd());
		checkCb.query().setSerialNo_Equal(wHtSerialReceiveInsp.getSerialNo());

		WHtSerialReceiveInsp entity = wHtSerialReceiveInspBhv.selectEntity(checkCb);

		boolean doUpdate = false;
		if (entity != null) {
			// 登録済

			// 追加ではなく更新
			doUpdate = true;
			wHtSerialReceiveInsp.setHtSerialReceiveInspId(entity.getHtSerialReceiveInspId());
		}

		// ===== 仕入先IDの取得 =====

		if (!CU.isNullOrEmpty(supplierCd)) {
			OptionalEntity<MCustomer> mCustomer = mCustomerBhv.selectByUniqueOf(wHtSerialReceiveInsp.getClientId(), supplierCd);
			wHtSerialReceiveInsp.setCustomerId(mCustomer.get().getCustomerId());
		} else {
			Long customerId = null;
			wHtSerialReceiveInsp.setCustomerId(customerId);
		}

		// ===== 登録(追加または更新) =====

		if (doUpdate) {
			wHtSerialReceiveInspBhv.updateNonstrict(wHtSerialReceiveInsp);
			return 0;
		} else {
			wHtSerialReceiveInspBhv.insert(wHtSerialReceiveInsp);
			return 1;
		}
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
