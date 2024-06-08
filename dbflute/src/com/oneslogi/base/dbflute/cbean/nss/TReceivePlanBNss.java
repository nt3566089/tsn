package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TReceivePlanBCQ;

/**
 * The nest select set-upper of T_RECEIVE_PLAN_B.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReceivePlanBCQ _query;
    public TReceivePlanBNss(TReceivePlanBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_LOCATION by my PLAN_LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_WAREHOUSE by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWarehouseNss withMWarehouse() {
        _query.xdoNss(() -> _query.queryMWarehouse());
        return new MWarehouseNss(_query.queryMWarehouse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanHNss withTReceivePlanH() {
        _query.xdoNss(() -> _query.queryTReceivePlanH());
        return new TReceivePlanHNss(_query.queryTReceivePlanH());
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
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByErrorFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByErrorFlg());
        return new BClassDtlNss(_query.queryBClassDtlByErrorFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReceiveStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByReceiveStatus());
        return new BClassDtlNss(_query.queryBClassDtlByReceiveStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_RECEIVE_PLAN_SPARE by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanSpareNss withTReceivePlanSpareAsOne() {
        _query.xdoNss(() -> _query.queryTReceivePlanSpareAsOne());
        return new TReceivePlanSpareNss(_query.queryTReceivePlanSpareAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_TRRCVDETAIL by RECEIVE_PLAN_B_ID, named 'TTrrcvdetailAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrrcvdetailNss withTTrrcvdetailAsOne() {
        _query.xdoNss(() -> _query.queryTTrrcvdetailAsOne());
        return new TTrrcvdetailNss(_query.queryTTrrcvdetailAsOne());
    }
}
