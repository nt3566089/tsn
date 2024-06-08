package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrintRequestDataCQ;

/**
 * The nest select set-upper of P_PRINT_REQUEST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestDataNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrintRequestDataCQ _query;
    public PPrintRequestDataNss(PPrintRequestDataCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrintRequestNss withPPrintRequest() {
        _query.xdoNss(() -> _query.queryPPrintRequest());
        return new PPrintRequestNss(_query.queryPPrintRequest());
    }
}
