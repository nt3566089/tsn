package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterClassGrpDtlCQ;

/**
 * The nest select set-upper of M_CENTER_CLASS_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassGrpDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterClassGrpDtlCQ _query;
    public MCenterClassGrpDtlNss(MCenterClassGrpDtlCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_GRP by my CENTER_CLASS_GRP_ID, named 'MCenterClassGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassGrpNss withMCenterClassGrp() {
        _query.xdoNss(() -> _query.queryMCenterClassGrp());
        return new MCenterClassGrpNss(_query.queryMCenterClassGrp());
    }
}
