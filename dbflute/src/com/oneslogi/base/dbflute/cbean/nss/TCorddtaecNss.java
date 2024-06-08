package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TCorddtaecCQ;

/**
 * The nest select set-upper of T_CORDDTAEC.
 * @author DBFlute(AutoGenerator)
 */
public class TCorddtaecNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TCorddtaecCQ _query;
    public TCorddtaecNss(TCorddtaecCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TCordhdrNss withTCordhdr() {
        _query.xdoNss(() -> _query.queryTCordhdr());
        return new TCordhdrNss(_query.queryTCordhdr());
    }
}
