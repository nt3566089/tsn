package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TShippingInstSpareCQ;

/**
 * The nest select set-upper of T_SHIPPING_INST_SPARE.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstSpareNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShippingInstSpareCQ _query;
    public TShippingInstSpareNss(TShippingInstSpareCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_SHIPPING_INST_B by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstBNss withTShippingInstB() {
        _query.xdoNss(() -> _query.queryTShippingInstB());
        return new TShippingInstBNss(_query.queryTShippingInstB());
    }
}
