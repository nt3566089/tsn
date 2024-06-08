package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BClassCQ;

/**
 * The nest select set-upper of B_CLASS.
 * @author DBFlute(AutoGenerator)
 */
public class BClassNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BClassCQ _query;
    public BClassNss(BClassCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySystemType() {
        _query.xdoNss(() -> _query.queryBClassDtlBySystemType());
        return new BClassDtlNss(_query.queryBClassDtlBySystemType());
    }
}
