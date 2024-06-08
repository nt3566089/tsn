package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryRCQ;

/**
 * The nest select set-upper of T_INVENTORY_R.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryRCQ _query;
    public TInventoryRNss(TInventoryRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TInventoryBNss withTInventoryB() {
        _query.xdoNss(() -> _query.queryTInventoryB());
        return new TInventoryBNss(_query.queryTInventoryB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_USER by my TWL_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTwlOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByTwlOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByTwlOutFlg());
    }
}
