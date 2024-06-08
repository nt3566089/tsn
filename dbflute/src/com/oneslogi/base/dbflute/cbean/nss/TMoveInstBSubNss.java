package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMoveInstBSubCQ;

/**
 * The nest select set-upper of T_MOVE_INST_B_SUB.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstBSubNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMoveInstBSubCQ _query;
    public TMoveInstBSubNss(TMoveInstBSubCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_MOVE_INST_B by my T_MOVE_INST_B_SUB_ID, named 'TMoveInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstBNss withTMoveInstB() {
        _query.xdoNss(() -> _query.queryTMoveInstB());
        return new TMoveInstBNss(_query.queryTMoveInstB());
    }
}
