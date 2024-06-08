package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrPicklistCQ;

/**
 * The nest select set-upper of T_TR_PICKLIST.
 * @author DBFlute(AutoGenerator)
 */
public class TTrPicklistNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrPicklistCQ _query;
    public TTrPicklistNss(TTrPicklistCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrpickdetailNss withTTrpickdetail() {
        _query.xdoNss(() -> _query.queryTTrpickdetail());
        return new TTrpickdetailNss(_query.queryTTrpickdetail());
    }
}
