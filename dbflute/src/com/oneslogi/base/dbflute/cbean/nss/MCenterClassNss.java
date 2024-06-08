package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterClassCQ;

/**
 * The nest select set-upper of M_CENTER_CLASS.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterClassCQ _query;
    public MCenterClassNss(MCenterClassCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySystemType() {
        _query.xdoNss(() -> _query.queryBClassDtlBySystemType());
        return new BClassDtlNss(_query.queryBClassDtlBySystemType());
    }
}
