package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HPackingHCQ;

/**
 * The nest select set-upper of H_PACKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class HPackingHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HPackingHCQ _query;
    public HPackingHNss(HPackingHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * H_SHIPPING_H by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HShippingHNss withHShippingH() {
        _query.xdoNss(() -> _query.queryHShippingH());
        return new HShippingHNss(_query.queryHShippingH());
    }
}
