package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TReceivePlanSpareCQ;

/**
 * The nest select set-upper of T_RECEIVE_PLAN_SPARE.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanSpareNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReceivePlanSpareCQ _query;
    public TReceivePlanSpareNss(TReceivePlanSpareCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
