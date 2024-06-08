package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TWorkLogCQ;

/**
 * The nest select set-upper of T_WORK_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class TWorkLogNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TWorkLogCQ _query;
    public TWorkLogNss(TWorkLogCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my WORK_STATUS, named 'BClassDtlByWorkStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByWorkStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByWorkStatus());
        return new BClassDtlNss(_query.queryBClassDtlByWorkStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my WORK_LOG_OUT_FLG, named 'BClassDtlByWorkLogOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByWorkLogOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByWorkLogOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByWorkLogOutFlg());
    }
}
