package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrintQueueCQ;

/**
 * The nest select set-upper of P_PRINT_QUEUE.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintQueueNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrintQueueCQ _query;
    public PPrintQueueNss(PPrintQueueCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PRINT_QUEUE_STATUS, named 'BClassDtlByPrintQueueStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPrintQueueStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByPrintQueueStatus());
        return new BClassDtlNss(_query.queryBClassDtlByPrintQueueStatus());
    }
}
