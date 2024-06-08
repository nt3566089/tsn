package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TYtrsodetailCQ;

/**
 * The nest select set-upper of T_YTRSODETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TYtrsodetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TYtrsodetailCQ _query;
    public TYtrsodetailNss(TYtrsodetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_YTRSO by my TRSO_ID, named 'TYtrso'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TYtrsoNss withTYtrso() {
        _query.xdoNss(() -> _query.queryTYtrso());
        return new TYtrsoNss(_query.queryTYtrso());
    }
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
