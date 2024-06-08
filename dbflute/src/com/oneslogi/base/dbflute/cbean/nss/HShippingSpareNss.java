package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HShippingSpareCQ;

/**
 * The nest select set-upper of H_SHIPPING_SPARE.
 * @author DBFlute(AutoGenerator)
 */
public class HShippingSpareNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HShippingSpareCQ _query;
    public HShippingSpareNss(HShippingSpareCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HShippingBNss withHShippingB() {
        _query.xdoNss(() -> _query.queryHShippingB());
        return new HShippingBNss(_query.queryHShippingB());
    }
}
