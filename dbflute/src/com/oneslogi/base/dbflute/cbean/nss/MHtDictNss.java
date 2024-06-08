package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MHtDictCQ;

/**
 * The nest select set-upper of M_HT_DICT.
 * @author DBFlute(AutoGenerator)
 */
public class MHtDictNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MHtDictCQ _query;
    public MHtDictNss(MHtDictCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictNss withBDict() {
        _query.xdoNss(() -> _query.queryBDict());
        return new BDictNss(_query.queryBDict());
    }
}
