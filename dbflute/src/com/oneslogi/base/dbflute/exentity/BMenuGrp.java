package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBMenuGrp;

/**
 * The entity of b_menu_grp.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BMenuGrp extends BsBMenuGrp {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public BMenuGrp chaseBMenuGrpSelf() {
        return _bMenuGrpSelf != null ? _bMenuGrpSelf : new BMenuGrp();
    }

   	// ======================================================
}
