package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BClassDtlCQ;

/**
 * The nest select set-upper of B_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BClassDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BClassDtlCQ _query;
    public BClassDtlNss(BClassDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassNss withBClass() {
        _query.xdoNss(() -> _query.queryBClass());
        return new BClassNss(_query.queryBClass());
    }
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
     * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlSubNss withBClassDtlSubAsOne() {
        _query.xdoNss(() -> _query.queryBClassDtlSubAsOne());
        return new BClassDtlSubNss(_query.queryBClassDtlSubAsOne());
    }
}
