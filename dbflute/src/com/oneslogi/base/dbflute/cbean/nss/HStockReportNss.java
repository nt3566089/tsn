package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HStockReportCQ;

/**
 * The nest select set-upper of H_STOCK_REPORT.
 * @author DBFlute(AutoGenerator)
 */
public class HStockReportNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HStockReportCQ _query;
    public HStockReportNss(HStockReportCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HStockNss withHStock() {
        _query.xdoNss(() -> _query.queryHStock());
        return new HStockNss(_query.queryHStock());
    }
}
