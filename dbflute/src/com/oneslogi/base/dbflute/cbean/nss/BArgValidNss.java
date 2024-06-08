package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BArgValidCQ;

/**
 * The nest select set-upper of B_ARG_VALID.
 * @author DBFlute(AutoGenerator)
 */
public class BArgValidNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BArgValidCQ _query;
    public BArgValidNss(BArgValidCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_ARG by my ARG_ID, named 'BArg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BArgNss withBArg() {
        _query.xdoNss(() -> _query.queryBArg());
        return new BArgNss(_query.queryBArg());
    }
}
