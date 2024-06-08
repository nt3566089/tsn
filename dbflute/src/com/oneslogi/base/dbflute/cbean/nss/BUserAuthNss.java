package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BUserAuthCQ;

/**
 * The nest select set-upper of B_USER_AUTH.
 * @author DBFlute(AutoGenerator)
 */
public class BUserAuthNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BUserAuthCQ _query;
    public BUserAuthNss(BUserAuthCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_USER by my USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PASSWORD_RESET, named 'BClassDtlByPasswordReset'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPasswordReset() {
        _query.xdoNss(() -> _query.queryBClassDtlByPasswordReset());
        return new BClassDtlNss(_query.queryBClassDtlByPasswordReset());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOCKOUT, named 'BClassDtlByLockout'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLockout() {
        _query.xdoNss(() -> _query.queryBClassDtlByLockout());
        return new BClassDtlNss(_query.queryBClassDtlByLockout());
    }
}
