package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCblkCQ;

/**
 * The nest select set-upper of M_CBLK.
 * @author DBFlute(AutoGenerator)
 */
public class MCblkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCblkCQ _query;
    public MCblkNss(MCblkCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
}
