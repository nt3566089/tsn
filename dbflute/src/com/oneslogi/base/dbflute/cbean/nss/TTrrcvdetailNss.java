package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrrcvdetailCQ;

/**
 * The nest select set-upper of T_TRRCVDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvdetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrrcvdetailCQ _query;
    public TTrrcvdetailNss(TTrrcvdetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrrcvNss withTTrrcv() {
        _query.xdoNss(() -> _query.queryTTrrcv());
        return new TTrrcvNss(_query.queryTTrrcv());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_RECEIVE_PLAN_B by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanBNss withTReceivePlanB() {
        _query.xdoNss(() -> _query.queryTReceivePlanB());
        return new TReceivePlanBNss(_query.queryTReceivePlanB());
    }
}
