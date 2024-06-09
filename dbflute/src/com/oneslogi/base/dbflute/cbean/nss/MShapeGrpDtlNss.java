package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MShapeGrpDtlCQ;

/**
 * The nest select set-upper of M_SHAPE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MShapeGrpDtlCQ _query;
    public MShapeGrpDtlNss(MShapeGrpDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeGrpNss withMShapeGrp() {
        _query.xdoNss(() -> _query.queryMShapeGrp());
        return new MShapeGrpNss(_query.queryMShapeGrp());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeNss withMShape() {
        _query.xdoNss(() -> _query.queryMShape());
        return new MShapeNss(_query.queryMShape());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCasePickFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCasePickFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCasePickFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEmReplenishShapeFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByEmReplenishShapeFlg());
        return new BClassDtlNss(_query.queryBClassDtlByEmReplenishShapeFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
}
