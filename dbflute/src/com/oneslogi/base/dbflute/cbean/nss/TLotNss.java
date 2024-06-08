package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TLotCQ;

/**
 * The nest select set-upper of T_LOT.
 * @author DBFlute(AutoGenerator)
 */
public class TLotNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TLotCQ _query;
    public TLotNss(TLotCQ query) { _query = query; }
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
