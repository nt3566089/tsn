package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BInfoCQ;

/**
 * The nest select set-upper of B_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class BInfoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BInfoCQ _query;
    public BInfoNss(BInfoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureNss withBCulture() {
        _query.xdoNss(() -> _query.queryBCulture());
        return new BCultureNss(_query.queryBCulture());
    }
}
