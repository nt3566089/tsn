package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMCarrierSlipYmt;

/**
 * The entity of m_carrier_slip_ymt.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYmt extends BsMCarrierSlipYmt {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public BClassDtl chaseBClassDtlByCoolCls() {
		return _bClassDtlByCoolCls != null ? _bClassDtlByCoolCls : new BClassDtl();
	}

	// ======================================================
}
