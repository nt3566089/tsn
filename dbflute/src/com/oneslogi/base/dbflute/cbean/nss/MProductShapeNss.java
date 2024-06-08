package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MProductShapeCQ;

/**
 * The nest select set-upper of M_PRODUCT_SHAPE.
 * @author DBFlute(AutoGenerator)
 */
public class MProductShapeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MProductShapeCQ _query;
    public MProductShapeNss(MProductShapeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeGrpDtlNss withMShapeGrpDtl() {
        _query.xdoNss(() -> _query.queryMShapeGrpDtl());
        return new MShapeGrpDtlNss(_query.queryMShapeGrpDtl());
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
