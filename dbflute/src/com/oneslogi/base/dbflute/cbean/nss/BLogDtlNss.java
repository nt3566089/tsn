package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BLogDtlCQ;

/**
 * The nest select set-upper of B_LOG_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BLogDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BLogDtlCQ _query;
    public BLogDtlNss(BLogDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_LOG by my LOG_ID, named 'BLog'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BLogNss withBLog() {
        _query.xdoNss(() -> _query.queryBLog());
        return new BLogNss(_query.queryBLog());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLogDtlType() {
        _query.xdoNss(() -> _query.queryBClassDtlByLogDtlType());
        return new BClassDtlNss(_query.queryBClassDtlByLogDtlType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLogDtlStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByLogDtlStatus());
        return new BClassDtlNss(_query.queryBClassDtlByLogDtlStatus());
    }
}
