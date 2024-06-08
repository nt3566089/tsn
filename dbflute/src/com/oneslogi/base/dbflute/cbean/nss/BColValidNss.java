package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BColValidCQ;

/**
 * The nest select set-upper of B_COL_VALID.
 * @author DBFlute(AutoGenerator)
 */
public class BColValidNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BColValidCQ _query;
    public BColValidNss(BColValidCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_COL by my COL_ID, named 'BCol'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BColNss withBCol() {
        _query.xdoNss(() -> _query.queryBCol());
        return new BColNss(_query.queryBCol());
    }
}
