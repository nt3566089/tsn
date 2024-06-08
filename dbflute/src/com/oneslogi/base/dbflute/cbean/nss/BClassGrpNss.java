package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BClassGrpCQ;

/**
 * The nest select set-upper of B_CLASS_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BClassGrpCQ _query;
    public BClassGrpNss(BClassGrpCQ query) { _query = query; }
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
}
