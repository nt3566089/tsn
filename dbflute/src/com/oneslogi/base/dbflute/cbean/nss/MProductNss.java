package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MProductCQ;

/**
 * The nest select set-upper of M_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class MProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MProductCQ _query;
    public MProductNss(MProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProductSelf() {
        _query.xdoNss(() -> _query.queryMProductSelf());
        return new MProductNss(_query.queryMProductSelf());
    }
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
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitDtManagFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitDtManagFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitDtManagFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitDtReverseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitDtReverseFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitDtReverseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLotManagFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLotManagFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLotManagFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLotReverseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLotReverseFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLotReverseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMergeCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByMergeCls());
        return new BClassDtlNss(_query.queryBClassDtlByMergeCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByShippingStopFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByShippingStopFlg());
        return new BClassDtlNss(_query.queryBClassDtlByShippingStopFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFreightCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByFreightCls());
        return new BClassDtlNss(_query.queryBClassDtlByFreightCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProductSelfAsOne() {
        _query.xdoNss(() -> _query.queryMProductSelfAsOne());
        return new MProductNss(_query.queryMProductSelfAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductTermNss withMProductTermAsOne() {
        _query.xdoNss(() -> _query.queryMProductTermAsOne());
        return new MProductTermNss(_query.queryMProductTermAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MSetParentNss withMSetParentAsOne() {
        _query.xdoNss(() -> _query.queryMSetParentAsOne());
        return new MSetParentNss(_query.queryMSetParentAsOne());
    }
}
