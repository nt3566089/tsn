package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HReceiveHCQ;

/**
 * The nest select set-upper of H_RECEIVE_H.
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HReceiveHCQ _query;
    public HReceiveHNss(HReceiveHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReceiveDeliveryStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByReceiveDeliveryStatus());
        return new BClassDtlNss(_query.queryBClassDtlByReceiveDeliveryStatus());
    }
}
