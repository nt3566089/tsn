package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MHtMessageCQ;

/**
 * The nest select set-upper of M_HT_MESSAGE.
 * @author DBFlute(AutoGenerator)
 */
public class MHtMessageNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MHtMessageCQ _query;
    public MHtMessageNss(MHtMessageCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_MESSAGE by my MESSAGE_ID, named 'BMessage'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BMessageNss withBMessage() {
        _query.xdoNss(() -> _query.queryBMessage());
        return new BMessageNss(_query.queryBMessage());
    }
}
