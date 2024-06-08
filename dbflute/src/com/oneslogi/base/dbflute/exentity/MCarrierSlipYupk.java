package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMCarrierSlipYupk;

/**
 * The entity of m_carrier_slip_yupk.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYupk extends BsMCarrierSlipYupk {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public BClassDtl chaseBClassDtlByCoolType() {
		return _bClassDtlByCoolType != null ? _bClassDtlByCoolType : new BClassDtl();
	}

	// ======================================================
}
