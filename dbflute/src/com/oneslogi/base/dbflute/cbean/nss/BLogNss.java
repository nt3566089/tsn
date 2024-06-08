package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BLogCQ;

/**
 * The nest select set-upper of B_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BLogNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BLogCQ _query;
    public BLogNss(BLogCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOG_STATUS, named 'BClassDtlByLogStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLogStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByLogStatus());
        return new BClassDtlNss(_query.queryBClassDtlByLogStatus());
    }
}
