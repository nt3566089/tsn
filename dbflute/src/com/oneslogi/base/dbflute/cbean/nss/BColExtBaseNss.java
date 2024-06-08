package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BColExtBaseCQ;

/**
 * The nest select set-upper of B_COL_EXT_BASE.
 * @author DBFlute(AutoGenerator)
 */
public class BColExtBaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BColExtBaseCQ _query;
    public BColExtBaseNss(BColExtBaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BItemNss withBItem() {
        _query.xdoNss(() -> _query.queryBItem());
        return new BItemNss(_query.queryBItem());
    }
}
