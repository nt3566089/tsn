package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrrcvextendCQ;

/**
 * The nest select set-upper of T_TRRCVEXTEND.
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvextendNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrrcvextendCQ _query;
    public TTrrcvextendNss(TTrrcvextendCQ query) { _query = query; }
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
}
