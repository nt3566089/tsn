package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrrcvCQ;

/**
 * The nest select set-upper of T_TRRCV.
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrrcvCQ _query;
    public TTrrcvNss(TTrrcvCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanHNss withTReceivePlanH() {
        _query.xdoNss(() -> _query.queryTReceivePlanH());
        return new TReceivePlanHNss(_query.queryTReceivePlanH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_TRRCVEXTEND by RECEIVE_PLAN_H_ID, named 'TTrrcvextendAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrrcvextendNss withTTrrcvextendAsOne() {
        _query.xdoNss(() -> _query.queryTTrrcvextendAsOne());
        return new TTrrcvextendNss(_query.queryTTrrcvextendAsOne());
    }
}
