package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HShippingHCQ;

/**
 * The nest select set-upper of H_SHIPPING_H.
 * @author DBFlute(AutoGenerator)
 */
public class HShippingHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HShippingHCQ _query;
    public HShippingHNss(HShippingHCQ query) { _query = query; }
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
     * B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelivTz() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelivTz());
        return new BClassDtlNss(_query.queryBClassDtlByDelivTz());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEmergencyFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByEmergencyFlg());
        return new BClassDtlNss(_query.queryBClassDtlByEmergencyFlg());
    }
}
