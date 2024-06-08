package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrpicklistexpCQ;

/**
 * The nest select set-upper of T_TRPICKLISTEXP.
 * @author DBFlute(AutoGenerator)
 */
public class TTrpicklistexpNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrpicklistexpCQ _query;
    public TTrpicklistexpNss(TTrpicklistexpCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrPicklistNss withTTrPicklist() {
        _query.xdoNss(() -> _query.queryTTrPicklist());
        return new TTrPicklistNss(_query.queryTTrPicklist());
    }
}
