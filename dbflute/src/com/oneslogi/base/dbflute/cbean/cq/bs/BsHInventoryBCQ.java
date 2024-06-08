package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of H_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsHInventoryBCQ extends AbstractBsHInventoryBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HInventoryBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHInventoryBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_INVENTORY_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HInventoryBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HInventoryBCIQ xcreateCIQ() {
        HInventoryBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HInventoryBCIQ xnewCIQ() {
        return new HInventoryBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_INVENTORY_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HInventoryBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HInventoryBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryBId;
    public ConditionValue xdfgetInventoryBId()
    { if (_inventoryBId == null) { _inventoryBId = nCV(); }
      return _inventoryBId; }
    protected ConditionValue xgetCValueInventoryBId() { return xdfgetInventoryBId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InventoryBId_Asc() { regOBA("INVENTORY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InventoryBId_Desc() { regOBD("INVENTORY_B_ID"); return this; }

    protected ConditionValue _inventoryHId;
    public ConditionValue xdfgetInventoryHId()
    { if (_inventoryHId == null) { _inventoryHId = nCV(); }
      return _inventoryHId; }
    protected ConditionValue xgetCValueInventoryHId() { return xdfgetInventoryHId(); }

    public Map<String, HInventoryHCQ> getInventoryHId_InScopeRelation_HInventoryH() { return xgetSQueMap("inventoryHId_InScopeRelation_HInventoryH"); }
    public String keepInventoryHId_InScopeRelation_HInventoryH(HInventoryHCQ sq) { return xkeepSQue("inventoryHId_InScopeRelation_HInventoryH", sq); }

    public Map<String, HInventoryHCQ> getInventoryHId_NotInScopeRelation_HInventoryH() { return xgetSQueMap("inventoryHId_NotInScopeRelation_HInventoryH"); }
    public String keepInventoryHId_NotInScopeRelation_HInventoryH(HInventoryHCQ sq) { return xkeepSQue("inventoryHId_NotInScopeRelation_HInventoryH", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to H_INVENTORY_H}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to H_INVENTORY_H}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, HStockCQ> getStockId_InScopeRelation_HStock() { return xgetSQueMap("stockId_InScopeRelation_HStock"); }
    public String keepStockId_InScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_HStock", sq); }

    public Map<String, HStockCQ> getStockId_NotInScopeRelation_HStock() { return xgetSQueMap("stockId_NotInScopeRelation_HStock"); }
    public String keepStockId_NotInScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_HStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _warehouseNm;
    public ConditionValue xdfgetWarehouseNm()
    { if (_warehouseNm == null) { _warehouseNm = nCV(); }
      return _warehouseNm; }
    protected ConditionValue xgetCValueWarehouseNm() { return xdfgetWarehouseNm(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_WarehouseNm_Asc() { regOBA("WAREHOUSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_WarehouseNm_Desc() { regOBD("WAREHOUSE_NM"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _locationNm;
    public ConditionValue xdfgetLocationNm()
    { if (_locationNm == null) { _locationNm = nCV(); }
      return _locationNm; }
    protected ConditionValue xgetCValueLocationNm() { return xdfgetLocationNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LocationNm_Asc() { regOBA("LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LocationNm_Desc() { regOBD("LOCATION_NM"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _depositCd;
    public ConditionValue xdfgetDepositCd()
    { if (_depositCd == null) { _depositCd = nCV(); }
      return _depositCd; }
    protected ConditionValue xgetCValueDepositCd() { return xdfgetDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

    protected ConditionValue _depositNm;
    public ConditionValue xdfgetDepositNm()
    { if (_depositNm == null) { _depositNm = nCV(); }
      return _depositNm; }
    protected ConditionValue xgetCValueDepositNm() { return xdfgetDepositNm(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DepositNm_Asc() { regOBA("DEPOSIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DepositNm_Desc() { regOBD("DEPOSIT_NM"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    public Map<String, MShapeCQ> getShapeId_InScopeRelation_MShape() { return xgetSQueMap("shapeId_InScopeRelation_MShape"); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_InScopeRelation_MShape", sq); }

    public Map<String, MShapeCQ> getShapeId_NotInScopeRelation_MShape() { return xgetSQueMap("shapeId_NotInScopeRelation_MShape"); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_NotInScopeRelation_MShape", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

    protected ConditionValue _storeLabelNo;
    public ConditionValue xdfgetStoreLabelNo()
    { if (_storeLabelNo == null) { _storeLabelNo = nCV(); }
      return _storeLabelNo; }
    protected ConditionValue xgetCValueStoreLabelNo() { return xdfgetStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

    protected ConditionValue _supplierId;
    public ConditionValue xdfgetSupplierId()
    { if (_supplierId == null) { _supplierId = nCV(); }
      return _supplierId; }
    protected ConditionValue xgetCValueSupplierId() { return xdfgetSupplierId(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

    protected ConditionValue _supplierCd;
    public ConditionValue xdfgetSupplierCd()
    { if (_supplierCd == null) { _supplierCd = nCV(); }
      return _supplierCd; }
    protected ConditionValue xgetCValueSupplierCd() { return xdfgetSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

    protected ConditionValue _supplierNm;
    public ConditionValue xdfgetSupplierNm()
    { if (_supplierNm == null) { _supplierNm = nCV(); }
      return _supplierNm; }
    protected ConditionValue xgetCValueSupplierNm() { return xdfgetSupplierNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_SupplierNm_Asc() { regOBA("SUPPLIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_SupplierNm_Desc() { regOBD("SUPPLIER_NM"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

    protected ConditionValue _unitNum;
    public ConditionValue xdfgetUnitNum()
    { if (_unitNum == null) { _unitNum = nCV(); }
      return _unitNum; }
    protected ConditionValue xgetCValueUnitNum() { return xdfgetUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _chargeNum;
    public ConditionValue xdfgetChargeNum()
    { if (_chargeNum == null) { _chargeNum = nCV(); }
      return _chargeNum; }
    protected ConditionValue xgetCValueChargeNum() { return xdfgetChargeNum(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ChargeNum_Asc() { regOBA("CHARGE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ChargeNum_Desc() { regOBD("CHARGE_NUM"); return this; }

    protected ConditionValue _allocNum;
    public ConditionValue xdfgetAllocNum()
    { if (_allocNum == null) { _allocNum = nCV(); }
      return _allocNum; }
    protected ConditionValue xgetCValueAllocNum() { return xdfgetAllocNum(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AllocNum_Asc() { regOBA("ALLOC_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AllocNum_Desc() { regOBD("ALLOC_NUM"); return this; }

    protected ConditionValue _moveNum;
    public ConditionValue xdfgetMoveNum()
    { if (_moveNum == null) { _moveNum = nCV(); }
      return _moveNum; }
    protected ConditionValue xgetCValueMoveNum() { return xdfgetMoveNum(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_MoveNum_Asc() { regOBA("MOVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_MoveNum_Desc() { regOBD("MOVE_NUM"); return this; }

    protected ConditionValue _inventoryNum;
    public ConditionValue xdfgetInventoryNum()
    { if (_inventoryNum == null) { _inventoryNum = nCV(); }
      return _inventoryNum; }
    protected ConditionValue xgetCValueInventoryNum() { return xdfgetInventoryNum(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InventoryNum_Asc() { regOBA("INVENTORY_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InventoryNum_Desc() { regOBD("INVENTORY_NUM"); return this; }

    protected ConditionValue _inputType;
    public ConditionValue xdfgetInputType()
    { if (_inputType == null) { _inputType = nCV(); }
      return _inputType; }
    protected ConditionValue xgetCValueInputType() { return xdfgetInputType(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

    protected ConditionValue _stockAdjustFlg;
    public ConditionValue xdfgetStockAdjustFlg()
    { if (_stockAdjustFlg == null) { _stockAdjustFlg = nCV(); }
      return _stockAdjustFlg; }
    protected ConditionValue xgetCValueStockAdjustFlg() { return xdfgetStockAdjustFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StockAdjustFlg_Asc() { regOBA("STOCK_ADJUST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_StockAdjustFlg_Desc() { regOBD("STOCK_ADJUST_FLG"); return this; }

    protected ConditionValue _moveInstHId;
    public ConditionValue xdfgetMoveInstHId()
    { if (_moveInstHId == null) { _moveInstHId = nCV(); }
      return _moveInstHId; }
    protected ConditionValue xgetCValueMoveInstHId() { return xdfgetMoveInstHId(); }

    public Map<String, HMoveHCQ> getMoveInstHId_InScopeRelation_HMoveH() { return xgetSQueMap("moveInstHId_InScopeRelation_HMoveH"); }
    public String keepMoveInstHId_InScopeRelation_HMoveH(HMoveHCQ sq) { return xkeepSQue("moveInstHId_InScopeRelation_HMoveH", sq); }

    public Map<String, HMoveHCQ> getMoveInstHId_NotInScopeRelation_HMoveH() { return xgetSQueMap("moveInstHId_NotInScopeRelation_HMoveH"); }
    public String keepMoveInstHId_NotInScopeRelation_HMoveH(HMoveHCQ sq) { return xkeepSQue("moveInstHId_NotInScopeRelation_HMoveH", sq); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to H_MOVE_H}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_MoveInstHId_Asc() { regOBA("MOVE_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to H_MOVE_H}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_MoveInstHId_Desc() { regOBD("MOVE_INST_H_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsHInventoryBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HInventoryBCQ bq = (HInventoryBCQ)bqs;
        HInventoryBCQ uq = (HInventoryBCQ)uqs;
        if (bq.hasConditionQueryHMoveH()) {
            uq.queryHMoveH().reflectRelationOnUnionQuery(bq.queryHMoveH(), uq.queryHMoveH());
        }
        if (bq.hasConditionQueryHStock()) {
            uq.queryHStock().reflectRelationOnUnionQuery(bq.queryHStock(), uq.queryHStock());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryHInventoryH()) {
            uq.queryHInventoryH().reflectRelationOnUnionQuery(bq.queryHInventoryH(), uq.queryHInventoryH());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByStockAdjustFlg()) {
            uq.queryBClassDtlByStockAdjustFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockAdjustFlg(), uq.queryBClassDtlByStockAdjustFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'.
     * @return The instance of condition-query. (NotNull)
     */
    public HMoveHCQ queryHMoveH() {
        return xdfgetConditionQueryHMoveH();
    }
    public HMoveHCQ xdfgetConditionQueryHMoveH() {
        String prop = "hMoveH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHMoveH()); xsetupOuterJoinHMoveH(); }
        return xgetQueRlMap(prop);
    }
    protected HMoveHCQ xcreateQueryHMoveH() {
        String nrp = xresolveNRP("H_INVENTORY_B", "hMoveH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HMoveHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hMoveH", nrp);
    }
    protected void xsetupOuterJoinHMoveH() { xregOutJo("hMoveH"); }
    public boolean hasConditionQueryHMoveH() { return xhasQueRlMap("hMoveH"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public HStockCQ queryHStock() {
        return xdfgetConditionQueryHStock();
    }
    public HStockCQ xdfgetConditionQueryHStock() {
        String prop = "hStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHStock()); xsetupOuterJoinHStock(); }
        return xgetQueRlMap(prop);
    }
    protected HStockCQ xcreateQueryHStock() {
        String nrp = xresolveNRP("H_INVENTORY_B", "hStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hStock", nrp);
    }
    protected void xsetupOuterJoinHStock() { xregOutJo("hStock"); }
    public boolean hasConditionQueryHStock() { return xhasQueRlMap("hStock"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeCQ queryMShape() {
        return xdfgetConditionQueryMShape();
    }
    public MShapeCQ xdfgetConditionQueryMShape() {
        String prop = "mShape";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShape()); xsetupOuterJoinMShape(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeCQ xcreateQueryMShape() {
        String nrp = xresolveNRP("H_INVENTORY_B", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_INVENTORY_H by my INVENTORY_H_ID, named 'HInventoryH'.
     * @return The instance of condition-query. (NotNull)
     */
    public HInventoryHCQ queryHInventoryH() {
        return xdfgetConditionQueryHInventoryH();
    }
    public HInventoryHCQ xdfgetConditionQueryHInventoryH() {
        String prop = "hInventoryH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHInventoryH()); xsetupOuterJoinHInventoryH(); }
        return xgetQueRlMap(prop);
    }
    protected HInventoryHCQ xcreateQueryHInventoryH() {
        String nrp = xresolveNRP("H_INVENTORY_B", "hInventoryH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HInventoryHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hInventoryH", nrp);
    }
    protected void xsetupOuterJoinHInventoryH() { xregOutJo("hInventoryH"); }
    public boolean hasConditionQueryHInventoryH() { return xhasQueRlMap("hInventoryH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("H_INVENTORY_B", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInputType() {
        return xdfgetConditionQueryBClassDtlByInputType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInputType() {
        String prop = "bClassDtlByInputType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInputType()); xsetupOuterJoinBClassDtlByInputType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInputType() {
        String nrp = xresolveNRP("H_INVENTORY_B", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInputType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInputType() { xregOutJo("bClassDtlByInputType"); }
    public boolean hasConditionQueryBClassDtlByInputType() { return xhasQueRlMap("bClassDtlByInputType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockAdjustFlg() {
        return xdfgetConditionQueryBClassDtlByStockAdjustFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockAdjustFlg() {
        String prop = "bClassDtlByStockAdjustFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockAdjustFlg()); xsetupOuterJoinBClassDtlByStockAdjustFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockAdjustFlg() {
        String nrp = xresolveNRP("H_INVENTORY_B", "bClassDtlByStockAdjustFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockAdjustFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockAdjustFlg() { xregOutJo("bClassDtlByStockAdjustFlg"); }
    public boolean hasConditionQueryBClassDtlByStockAdjustFlg() { return xhasQueRlMap("bClassDtlByStockAdjustFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HInventoryBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HInventoryBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HInventoryBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HInventoryBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HInventoryBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HInventoryBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HInventoryBCQ> _myselfExistsMap;
    public Map<String, HInventoryBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HInventoryBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HInventoryBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HInventoryBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HInventoryBCB.class.getName(); }
    protected String xCQ() { return HInventoryBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
