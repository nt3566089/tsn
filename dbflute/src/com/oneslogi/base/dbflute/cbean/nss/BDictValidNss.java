package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BDictValidCQ;

/**
 * The nest select set-upper of B_DICT_VALID.
 * @author DBFlute(AutoGenerator)
 */
public class BDictValidNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BDictValidCQ _query;
    public BDictValidNss(BDictValidCQ query) { _query = query; }
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
