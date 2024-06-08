package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BRoleGrpCQ;

/**
 * The nest select set-upper of B_ROLE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BRoleGrpNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BRoleGrpCQ _query;
    public BRoleGrpNss(BRoleGrpCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my ROLE_CONTROL_CLASS, named 'BClassDtlByRoleControlClass'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByRoleControlClass() {
        _query.xdoNss(() -> _query.queryBClassDtlByRoleControlClass());
        return new BClassDtlNss(_query.queryBClassDtlByRoleControlClass());
    }
}
