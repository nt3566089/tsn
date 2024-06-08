package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MLocationCQ;

/**
 * The nest select set-upper of M_LOCATION.
 * @author DBFlute(AutoGenerator)
 */
public class MLocationNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MLocationCQ _query;
    public MLocationNss(MLocationCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT_SHAPE by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductShapeNss withMProductShapeByMaxStoreProductShapeId() {
        _query.xdoNss(() -> _query.queryMProductShapeByMaxStoreProductShapeId());
        return new MProductShapeNss(_query.queryMProductShapeByMaxStoreProductShapeId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_ZONE by my ZONE_ID, named 'MZone'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MZoneNss withMZone() {
        _query.xdoNss(() -> _query.queryMZone());
        return new MZoneNss(_query.queryMZone());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT_SHAPE by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductShapeNss withMProductShapeByReplenishPProductShapeId() {
        _query.xdoNss(() -> _query.queryMProductShapeByReplenishPProductShapeId());
        return new MProductShapeNss(_query.queryMProductShapeByReplenishPProductShapeId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_STOCK_TYPE by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MStockTypeNss withMStockType() {
        _query.xdoNss(() -> _query.queryMStockType());
        return new MStockTypeNss(_query.queryMStockType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
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
     * B_CLASS_DTL by my ALLOC_NG_FLG, named 'BClassDtlByAllocNgFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAllocNgFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAllocNgFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAllocNgFlg());
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
     * B_CLASS_DTL by my LOCATION_TYPE, named 'BClassDtlByLocationType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLocationType() {
        _query.xdoNss(() -> _query.queryBClassDtlByLocationType());
        return new BClassDtlNss(_query.queryBClassDtlByLocationType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PICKING_LOCATION_FLG, named 'BClassDtlByPickingLocationFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPickingLocationFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPickingLocationFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPickingLocationFlg());
    }
}
