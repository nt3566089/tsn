package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryBCQ;

/**
 * The nest select set-upper of T_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryBCQ _query;
    public TInventoryBNss(TInventoryBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerByDepositId() {
        _query.xdoNss(() -> _query.queryMCustomerByDepositId());
        return new MCustomerNss(_query.queryMCustomerByDepositId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TInventoryHNss withTInventoryH() {
        _query.xdoNss(() -> _query.queryTInventoryH());
        return new TInventoryHNss(_query.queryTInventoryH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MStockTypeNss withMStockType() {
        _query.xdoNss(() -> _query.queryMStockType());
        return new MStockTypeNss(_query.queryMStockType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWarehouseNss withMWarehouse() {
        _query.xdoNss(() -> _query.queryMWarehouse());
        return new MWarehouseNss(_query.queryMWarehouse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoNss withTStoreNo() {
        _query.xdoNss(() -> _query.queryTStoreNo());
        return new TStoreNoNss(_query.queryTStoreNo());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerBySupplierId() {
        _query.xdoNss(() -> _query.queryMCustomerBySupplierId());
        return new MCustomerNss(_query.queryMCustomerBySupplierId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstHNss withTMoveInstH() {
        _query.xdoNss(() -> _query.queryTMoveInstH());
        return new TMoveInstHNss(_query.queryTMoveInstH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TLotNss withTLot() {
        _query.xdoNss(() -> _query.queryTLot());
        return new TLotNss(_query.queryTLot());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockNss withTStock() {
        _query.xdoNss(() -> _query.queryTStock());
        return new TStockNss(_query.queryTStock());
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
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInputType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInputType());
        return new BClassDtlNss(_query.queryBClassDtlByInputType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockAdjustFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockAdjustFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockAdjustFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TInventoryRNss withTInventoryRAsOne() {
        _query.xdoNss(() -> _query.queryTInventoryRAsOne());
        return new TInventoryRNss(_query.queryTInventoryRAsOne());
    }
}
