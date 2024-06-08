package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTStoreRecordH;

/**
 * The entity of T_STORE_RECORD_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordH extends BsTStoreRecordH {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MProcessType chaseMProcessType() {
		return _mProcessType != null ? _mProcessType : new MProcessType();
	}

	public TReceivePlanH chaseTReceivePlanH() {
		return _tReceivePlanH != null ? _tReceivePlanH : new TReceivePlanH();
	}

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	public MCustomer chaseMCustomerByDepositId() {
		return _mCustomerByDepositId != null ? _mCustomerByDepositId : new MCustomer();
	}

	public MCustomer chaseMCustomerBySupplierId() {
		return _mCustomerBySupplierId != null ? _mCustomerBySupplierId : new MCustomer();
	}

	// ======================================================

    //倉庫
    private Long warehouseId;

	public Long getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}
}
