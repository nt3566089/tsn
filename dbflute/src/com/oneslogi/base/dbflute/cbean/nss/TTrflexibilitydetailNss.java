package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrflexibilitydetailCQ;

/**
 * The nest select set-upper of T_TRFLEXIBILITYDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilitydetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrflexibilitydetailCQ _query;
    public TTrflexibilitydetailNss(TTrflexibilitydetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'.
     */
    public void withTTrflexibility() {
        _query.xdoNss(() -> _query.queryTTrflexibility());
    }
}
