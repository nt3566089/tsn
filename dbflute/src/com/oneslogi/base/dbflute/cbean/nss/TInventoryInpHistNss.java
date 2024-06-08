package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryInpHistCQ;

/**
 * The nest select set-upper of T_INVENTORY_INP_HIST.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInpHistNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryInpHistCQ _query;
    public TInventoryInpHistNss(TInventoryInpHistCQ query) { _query = query; }
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
     * B_CLASS_DTL by my LAST_FLG, named 'BClassDtlByLastFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLastFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLastFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLastFlg());
    }
}
