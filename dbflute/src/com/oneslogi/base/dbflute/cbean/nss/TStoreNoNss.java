package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStoreNoCQ;

/**
 * The nest select set-upper of T_STORE_NO.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreNoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStoreNoCQ _query;
    public TStoreNoNss(TStoreNoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_STORE_NO by my OLD_STORE_NUM_ID, named 'TStoreNoSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoNss withTStoreNoSelf() {
        _query.xdoNss(() -> _query.queryTStoreNoSelf());
        return new TStoreNoNss(_query.queryTStoreNoSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STORE_NO_R by STORE_NO_ID, named 'TStoreNoRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoRNss withTStoreNoRAsOne() {
        _query.xdoNss(() -> _query.queryTStoreNoRAsOne());
        return new TStoreNoRNss(_query.queryTStoreNoRAsOne());
    }
}
