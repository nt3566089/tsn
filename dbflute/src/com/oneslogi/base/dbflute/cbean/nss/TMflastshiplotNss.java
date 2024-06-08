package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMflastshiplotCQ;

/**
 * The nest select set-upper of T_MFLASTSHIPLOT.
 * @author DBFlute(AutoGenerator)
 */
public class TMflastshiplotNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMflastshiplotCQ _query;
    public TMflastshiplotNss(TMflastshiplotCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
}
