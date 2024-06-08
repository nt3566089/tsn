package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HReceiveSpareCQ;

/**
 * The nest select set-upper of H_RECEIVE_SPARE.
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveSpareNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HReceiveSpareCQ _query;
    public HReceiveSpareNss(HReceiveSpareCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * H_RECEIVE_B by my STORE_RECORD_B_ID, named 'HReceiveB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HReceiveBNss withHReceiveB() {
        _query.xdoNss(() -> _query.queryHReceiveB());
        return new HReceiveBNss(_query.queryHReceiveB());
    }
}
