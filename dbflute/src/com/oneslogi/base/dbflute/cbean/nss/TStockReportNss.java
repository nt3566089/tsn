package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStockReportCQ;

/**
 * The nest select set-upper of T_STOCK_REPORT.
 * @author DBFlute(AutoGenerator)
 */
public class TStockReportNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStockReportCQ _query;
    public TStockReportNss(TStockReportCQ query) { _query = query; }
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
}
