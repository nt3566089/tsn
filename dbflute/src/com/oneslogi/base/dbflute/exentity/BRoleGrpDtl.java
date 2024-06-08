package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBRoleGrpDtl;

/**
 * The entity of b_role_grp_dtl.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpDtl extends BsBRoleGrpDtl {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public BRoleGrp chaseBRoleGrp() {
        return _bRoleGrp != null ? _bRoleGrp : new BRoleGrp();
    }

   	// ======================================================
}
