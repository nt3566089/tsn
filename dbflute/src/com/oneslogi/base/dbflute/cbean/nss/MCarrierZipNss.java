package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierZipCQ;

/**
 * The nest select set-upper of M_CARRIER_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierZipNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierZipCQ _query;
    public MCarrierZipNss(MCarrierZipCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCommonCarrierNss withMCommonCarrier() {
        _query.xdoNss(() -> _query.queryMCommonCarrier());
        return new MCommonCarrierNss(_query.queryMCommonCarrier());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_ZIP by my ZIP_ID, named 'MZip'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MZipNss withMZip() {
        _query.xdoNss(() -> _query.queryMZip());
        return new MZipNss(_query.queryMZip());
    }
}
