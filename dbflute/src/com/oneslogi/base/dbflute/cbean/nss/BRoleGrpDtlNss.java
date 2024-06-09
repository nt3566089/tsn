package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BRoleGrpDtlCQ;

/**
 * The nest select set-upper of B_ROLE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BRoleGrpDtlCQ _query;
    public BRoleGrpDtlNss(BRoleGrpDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_ROLE_GRP by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BRoleGrpNss withBRoleGrp() {
        _query.xdoNss(() -> _query.queryBRoleGrp());
        return new BRoleGrpNss(_query.queryBRoleGrp());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BRoleNss withBRole() {
        _query.xdoNss(() -> _query.queryBRole());
        return new BRoleNss(_query.queryBRole());
    }
}
