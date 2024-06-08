package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BSystemLogCQ;

/**
 * The nest select set-upper of B_SYSTEM_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BSystemLogNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BSystemLogCQ _query;
    public BSystemLogNss(BSystemLogCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SYSTEM_LOG_TYPE, named 'BClassDtlBySystemLogType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySystemLogType() {
        _query.xdoNss(() -> _query.queryBClassDtlBySystemLogType());
        return new BClassDtlNss(_query.queryBClassDtlBySystemLogType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SYSTEM_LOG_STATUS, named 'BClassDtlBySystemLogStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySystemLogStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlBySystemLogStatus());
        return new BClassDtlNss(_query.queryBClassDtlBySystemLogStatus());
    }
}
