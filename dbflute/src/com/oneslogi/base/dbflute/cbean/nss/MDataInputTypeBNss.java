package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MDataInputTypeBCQ;

/**
 * The nest select set-upper of M_DATA_INPUT_TYPE_B.
 * @author DBFlute(AutoGenerator)
 */
public class MDataInputTypeBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MDataInputTypeBCQ _query;
    public MDataInputTypeBNss(MDataInputTypeBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_DATA_INPUT_TYPE by my DATA_INPUT_TYPE_ID, named 'MDataInputType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MDataInputTypeNss withMDataInputType() {
        _query.xdoNss(() -> _query.queryMDataInputType());
        return new MDataInputTypeNss(_query.queryMDataInputType());
    }
}
