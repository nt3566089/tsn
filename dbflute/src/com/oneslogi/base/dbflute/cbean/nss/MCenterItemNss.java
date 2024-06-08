package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterItemCQ;

/**
 * The nest select set-upper of M_CENTER_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterItemNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterItemCQ _query;
    public MCenterItemNss(MCenterItemCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BItemNss withBItem() {
        _query.xdoNss(() -> _query.queryBItem());
        return new BItemNss(_query.queryBItem());
    }
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
}
