package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCommonCarrierCQ;

/**
 * The nest select set-upper of M_COMMON_CARRIER.
 * @author DBFlute(AutoGenerator)
 */
public class MCommonCarrierNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCommonCarrierCQ _query;
    public MCommonCarrierNss(MCommonCarrierCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my ARRIVAL_STORE_FORMAT, named 'BClassDtlByArrivalStoreFormat'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByArrivalStoreFormat() {
        _query.xdoNss(() -> _query.queryBClassDtlByArrivalStoreFormat());
        return new BClassDtlNss(_query.queryBClassDtlByArrivalStoreFormat());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my BOL_OUTPUT_TARGET_FLG, named 'BClassDtlByBolOutputTargetFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByBolOutputTargetFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByBolOutputTargetFlg());
        return new BClassDtlNss(_query.queryBClassDtlByBolOutputTargetFlg());
    }
}
