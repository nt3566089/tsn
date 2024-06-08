package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TAllocInstBCQ;

/**
 * The nest select set-upper of T_ALLOC_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TAllocInstBCQ _query;
    public TAllocInstBNss(TAllocInstBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWarehouseNss withMWarehouse() {
        _query.xdoNss(() -> _query.queryMWarehouse());
        return new MWarehouseNss(_query.queryMWarehouse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
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
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
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
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoNss withTStoreNo() {
        _query.xdoNss(() -> _query.queryTStoreNo());
        return new TStoreNoNss(_query.queryTStoreNo());
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
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstHNss withTAllocInstH() {
        _query.xdoNss(() -> _query.queryTAllocInstH());
        return new TAllocInstHNss(_query.queryTAllocInstH());
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
     * T_ALLOC_LOT by ALLOC_INST_B_ID, named 'TAllocLotAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocLotNss withTAllocLotAsOne() {
        _query.xdoNss(() -> _query.queryTAllocLotAsOne());
        return new TAllocLotNss(_query.queryTAllocLotAsOne());
    }
}
