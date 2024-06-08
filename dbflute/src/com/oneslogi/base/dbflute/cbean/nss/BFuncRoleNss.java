package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BFuncRoleCQ;

/**
 * The nest select set-upper of B_FUNC_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BFuncRoleNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BFuncRoleCQ _query;
    public BFuncRoleNss(BFuncRoleCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_FUNC by my FUNC_ID, named 'BFunc'.
     */
    public void withBFunc() {
        _query.xdoNss(() -> _query.queryBFunc());
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
