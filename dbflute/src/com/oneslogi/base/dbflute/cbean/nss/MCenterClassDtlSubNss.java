package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterClassDtlSubCQ;

/**
 * The nest select set-upper of M_CENTER_CLASS_DTL_SUB.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDtlSubNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterClassDtlSubCQ _query;
    public MCenterClassDtlSubNss(MCenterClassDtlSubCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtl() {
        _query.xdoNss(() -> _query.queryMCenterClassDtl());
        return new MCenterClassDtlNss(_query.queryMCenterClassDtl());
    }
}
