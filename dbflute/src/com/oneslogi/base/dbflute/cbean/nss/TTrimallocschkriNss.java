package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrimallocschkriCQ;

/**
 * The nest select set-upper of T_TRIMALLOCSCHKRI.
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocschkriNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrimallocschkriCQ _query;
    public TTrimallocschkriNss(TTrimallocschkriCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TYtrsodetailNss withTYtrsodetail() {
        _query.xdoNss(() -> _query.queryTYtrsodetail());
        return new TYtrsodetailNss(_query.queryTYtrsodetail());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'.
     */
    public void withTTrimallocH() {
        _query.xdoNss(() -> _query.queryTTrimallocH());
    }
}
