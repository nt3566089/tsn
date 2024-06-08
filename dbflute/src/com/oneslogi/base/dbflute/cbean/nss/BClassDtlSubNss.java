package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BClassDtlSubCQ;

/**
 * The nest select set-upper of B_CLASS_DTL_SUB.
 * @author DBFlute(AutoGenerator)
 */
public class BClassDtlSubNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BClassDtlSubCQ _query;
    public BClassDtlSubNss(BClassDtlSubCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CLASS_DTL_ID, named 'BClassDtl'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtl() {
        _query.xdoNss(() -> _query.queryBClassDtl());
        return new BClassDtlNss(_query.queryBClassDtl());
    }
}
