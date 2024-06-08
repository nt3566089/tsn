package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsWHtReceiveNoPlanInsp;

/**
 * The entity of w_ht_receive_no_plan_insp.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveNoPlanInsp extends BsWHtReceiveNoPlanInsp {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomerByDepositId() {
		return _mCustomerByDepositId != null ? _mCustomerByDepositId : new MCustomer();
	}

	public MCustomer chaseMCustomerBySupplierId() {
		return _mCustomerBySupplierId != null ? _mCustomerBySupplierId : new MCustomer();
	}

	public MProcessType chaseMProcessType() {
		return _mProcessType != null ? _mProcessType : new MProcessType();
	}

	public MStockType chaseMStockType() {
		return _mStockType != null ? _mStockType : new MStockType();
	}

	// ======================================================
}
