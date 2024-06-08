package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterClassDtlCQ;

/**
 * The nest select set-upper of M_CENTER_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterClassDtlCQ _query;
    public MCenterClassDtlNss(MCenterClassDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassNss withMCenterClass() {
        _query.xdoNss(() -> _query.queryMCenterClass());
        return new MCenterClassNss(_query.queryMCenterClass());
    }
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlSubNss withMCenterClassDtlSubAsOne() {
        _query.xdoNss(() -> _query.queryMCenterClassDtlSubAsOne());
        return new MCenterClassDtlSubNss(_query.queryMCenterClassDtlSubAsOne());
    }
}
