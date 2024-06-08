package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTAllocLot;

/**
 * The entity of t_alloc_lot.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocLot extends BsTAllocLot {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TLot chaseTLot() {
		return _tLot != null ? _tLot : new TLot();
	}

	// ======================================================
}
