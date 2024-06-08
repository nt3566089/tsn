package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BScreenRoleCQ;

/**
 * The nest select set-upper of B_SCREEN_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BScreenRoleNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BScreenRoleCQ _query;
    public BScreenRoleNss(BScreenRoleCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BRoleNss withBRole() {
        _query.xdoNss(() -> _query.queryBRole());
        return new BRoleNss(_query.queryBRole());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BScreenNss withBScreen() {
        _query.xdoNss(() -> _query.queryBScreen());
        return new BScreenNss(_query.queryBScreen());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByVisible() {
        _query.xdoNss(() -> _query.queryBClassDtlByVisible());
        return new BClassDtlNss(_query.queryBClassDtlByVisible());
    }
}
