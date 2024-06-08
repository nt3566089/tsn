package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MProductTermCQ;

/**
 * The nest select set-upper of M_PRODUCT_TERM.
 * @author DBFlute(AutoGenerator)
 */
public class MProductTermNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MProductTermCQ _query;
    public MProductTermNss(MProductTermCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
}
