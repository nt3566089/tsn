package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBSystem;

/**
 * The entity of B_SYSTEM.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BSystem extends BsBSystem {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public BTimeZone chaseBTimeZone() {
        return _bTimeZone != null ? _bTimeZone : new BTimeZone();
    }

   	// ======================================================
}
