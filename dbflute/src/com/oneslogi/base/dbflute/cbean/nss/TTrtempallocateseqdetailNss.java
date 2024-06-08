package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrtempallocateseqdetailCQ;

/**
 * The nest select set-upper of T_TRTEMPALLOCATESEQDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrtempallocateseqdetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrtempallocateseqdetailCQ _query;
    public TTrtempallocateseqdetailNss(TTrtempallocateseqdetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'.
     */
    public void withTTrtempallocateseq() {
        _query.xdoNss(() -> _query.queryTTrtempallocateseq());
    }
}
