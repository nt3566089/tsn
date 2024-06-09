package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierBoxCQ;

/**
 * The nest select set-upper of M_CARRIER_BOX.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierBoxNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierBoxCQ _query;
    public MCarrierBoxNss(MCarrierBoxCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_BOX by my BOX_ID, named 'MBox'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MBoxNss withMBox() {
        _query.xdoNss(() -> _query.queryMBox());
        return new MBoxNss(_query.queryMBox());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrier() {
        _query.xdoNss(() -> _query.queryMCarrier());
        return new MCarrierNss(_query.queryMCarrier());
    }
}
