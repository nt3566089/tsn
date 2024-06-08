package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BColExtUserCQ;

/**
 * The nest select set-upper of B_COL_EXT_USER.
 * @author DBFlute(AutoGenerator)
 */
public class BColExtUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BColExtUserCQ _query;
    public BColExtUserNss(BColExtUserCQ query) { _query = query; }
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