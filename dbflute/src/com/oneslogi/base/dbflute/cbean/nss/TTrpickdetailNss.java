package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrpickdetailCQ;

/**
 * The nest select set-upper of T_TRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrpickdetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrpickdetailCQ _query;
    public TTrpickdetailNss(TTrpickdetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockNss withTStock() {
        _query.xdoNss(() -> _query.queryTStock());
        return new TStockNss(_query.queryTStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TYtrsodetailNss withTYtrsodetail() {
        _query.xdoNss(() -> _query.queryTYtrsodetail());
        return new TYtrsodetailNss(_query.queryTYtrsodetail());
    }
}
