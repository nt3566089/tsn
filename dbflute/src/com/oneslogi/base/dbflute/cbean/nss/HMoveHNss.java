package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HMoveHCQ;

/**
 * The nest select set-upper of H_MOVE_H.
 * @author DBFlute(AutoGenerator)
 */
public class HMoveHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HMoveHCQ _query;
    public HMoveHNss(HMoveHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
}
