package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTKeepingLot;

/**
 * The entity of t_keeping_lot.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TKeepingLot extends BsTKeepingLot {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TLot chaseTLot() {
		return _tLot != null ? _tLot : new TLot();
	}

	// ======================================================
}
