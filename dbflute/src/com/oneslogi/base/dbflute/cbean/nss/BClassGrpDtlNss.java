package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BClassGrpDtlCQ;

/**
 * The nest select set-upper of B_CLASS_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BClassGrpDtlCQ _query;
    public BClassGrpDtlNss(BClassGrpDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CLASS_DTL_ID, named 'BClassDtl'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtl() {
        _query.xdoNss(() -> _query.queryBClassDtl());
        return new BClassDtlNss(_query.queryBClassDtl());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_GRP by my CLASS_GRP_ID, named 'BClassGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassGrpNss withBClassGrp() {
        _query.xdoNss(() -> _query.queryBClassGrp());
        return new BClassGrpNss(_query.queryBClassGrp());
    }
}
