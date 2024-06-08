package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMCarrier;

/**
 * The entity of M_CARRIER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCarrier extends BsMCarrier {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCommonCarrier chaseMCommonCarrier() {
		return _mCommonCarrier != null ? _mCommonCarrier : new MCommonCarrier();
	}

	// ======================================================
}
