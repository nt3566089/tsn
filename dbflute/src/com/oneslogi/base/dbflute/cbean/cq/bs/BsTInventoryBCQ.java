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
 * The base condition-query of T_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryBCQ extends AbstractBsTInventoryBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_INVENTORY_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryBCIQ xcreateCIQ() {
        TInventoryBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryBCIQ xnewCIQ() {
        return new TInventoryBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_INVENTORY_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryBId;
    public ConditionValue xdfgetInventoryBId()
    { if (_inventoryBId == null) { _inventoryBId = nCV(); }
      return _inventoryBId; }
    protected ConditionValue xgetCValueInventoryBId() { return xdfgetInventoryBId(); }

    public Map<String, TInventoryInpHistCQ> xdfgetInventoryBId_ExistsReferrer_TInventoryInpHistList() { return xgetSQueMap("inventoryBId_ExistsReferrer_TInventoryInpHistList"); }
    public String keepInventoryBId_ExistsReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq) { return xkeepSQue("inventoryBId_ExistsReferrer_TInventoryInpHistList", sq); }

    public Map<String, TInventoryRCQ> xdfgetInventoryBId_ExistsReferrer_TInventoryRAsOne() { return xgetSQueMap("inventoryBId_ExistsReferrer_TInventoryRAsOne"); }
    public String keepInventoryBId_ExistsReferrer_TInventoryRAsOne(TInventoryRCQ sq) { return xkeepSQue("inventoryBId_ExistsReferrer_TInventoryRAsOne", sq); }

    public Map<String, TInventoryInpHistCQ> xdfgetInventoryBId_NotExistsReferrer_TInventoryInpHistList() { return xgetSQueMap("inventoryBId_NotExistsReferrer_TInventoryInpHistList"); }
    public String keepInventoryBId_NotExistsReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq) { return xkeepSQue("inventoryBId_NotExistsReferrer_TInventoryInpHistList", sq); }

    public Map<String, TInventoryRCQ> xdfgetInventoryBId_NotExistsReferrer_TInventoryRAsOne() { return xgetSQueMap("inventoryBId_NotExistsReferrer_TInventoryRAsOne"); }
    public String keepInventoryBId_NotExistsReferrer_TInventoryRAsOne(TInventoryRCQ sq) { return xkeepSQue("inventoryBId_NotExistsReferrer_TInventoryRAsOne", sq); }

    public Map<String, TInventoryInpHistCQ> xdfgetInventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList() { return xgetSQueMap("inventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList"); }
    public String keepInventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq) { return xkeepSQue("inventoryBId_SpecifyDerivedReferrer_TInventoryInpHistList", sq); }

    public Map<String, TInventoryInpHistCQ> xdfgetInventoryBId_QueryDerivedReferrer_TInventoryInpHistList() { return xgetSQueMap("inventoryBId_QueryDerivedReferrer_TInventoryInpHistList"); }
    public String keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistList(TInventoryInpHistCQ sq) { return xkeepSQue("inventoryBId_QueryDerivedReferrer_TInventoryInpHistList", sq); }
    public Map<String, Object> xdfgetInventoryBId_QueryDerivedReferrer_TInventoryInpHistListParameter() { return xgetSQuePmMap("inventoryBId_QueryDerivedReferrer_TInventoryInpHistList"); }
    public String keepInventoryBId_QueryDerivedReferrer_TInventoryInpHistListParameter(Object pm) { return xkeepSQuePm("inventoryBId_QueryDerivedReferrer_TInventoryInpHistList", pm); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryBId_Asc() { regOBA("INVENTORY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryBId_Desc() { regOBD("INVENTORY_B_ID"); return this; }

    protected ConditionValue _inventoryHId;
    public ConditionValue xdfgetInventoryHId()
    { if (_inventoryHId == null) { _inventoryHId = nCV(); }
      return _inventoryHId; }
    protected ConditionValue xgetCValueInventoryHId() { return xdfgetInventoryHId(); }

    public Map<String, TInventoryHCQ> getInventoryHId_InScopeRelation_TInventoryH() { return xgetSQueMap("inventoryHId_InScopeRelation_TInventoryH"); }
    public String keepInventoryHId_InScopeRelation_TInventoryH(TInventoryHCQ sq) { return xkeepSQue("inventoryHId_InScopeRelation_TInventoryH", sq); }

    public Map<String, TInventoryHCQ> getInventoryHId_NotInScopeRelation_TInventoryH() { return xgetSQueMap("inventoryHId_NotInScopeRelation_TInventoryH"); }
    public String keepInventoryHId_NotInScopeRelation_TInventoryH(TInventoryHCQ sq) { return xkeepSQue("inventoryHId_NotInScopeRelation_TInventoryH", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TStockCQ> getStockId_InScopeRelation_TStock() { return xgetSQueMap("stockId_InScopeRelation_TStock"); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_TStock", sq); }

    public Map<String, TStockCQ> getStockId_NotInScopeRelation_TStock() { return xgetSQueMap("stockId_NotInScopeRelation_TStock"); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_TStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    public Map<String, MWarehouseCQ> getWarehouseId_InScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_InScopeRelation_MWarehouse"); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_InScopeRelation_MWarehouse", sq); }

    public Map<String, MWarehouseCQ> getWarehouseId_NotInScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_NotInScopeRelation_MWarehouse"); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_NotInScopeRelation_MWarehouse", sq); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTInventoryBCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    public Map<String, MLocationCQ> getLocationId_InScopeRelation_MLocation() { return xgetSQueMap("locationId_InScopeRelation_MLocation"); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("locationId_NotInScopeRelation_MLocation"); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    public Map<String, MCustomerCQ> getDepositId_InScopeRelation_MCustomerByDepositId() { return xgetSQueMap("depositId_InScopeRelation_MCustomerByDepositId"); }
    public String keepDepositId_InScopeRelation_MCustomerByDepositId(MCustomerCQ sq) { return xkeepSQue("depositId_InScopeRelation_MCustomerByDepositId", sq); }

    public Map<String, MCustomerCQ> getDepositId_NotInScopeRelation_MCustomerByDepositId() { return xgetSQueMap("depositId_NotInScopeRelation_MCustomerByDepositId"); }
    public String keepDepositId_NotInScopeRelation_MCustomerByDepositId(MCustomerCQ sq) { return xkeepSQue("depositId_NotInScopeRelation_MCustomerByDepositId", sq); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    public Map<String, TLotCQ> getLotId_InScopeRelation_TLot() { return xgetSQueMap("lotId_InScopeRelation_TLot"); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq) { return xkeepSQue("lotId_InScopeRelation_TLot", sq); }

    public Map<String, TLotCQ> getLotId_NotInScopeRelation_TLot() { return xgetSQueMap("lotId_NotInScopeRelation_TLot"); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq) { return xkeepSQue("lotId_NotInScopeRelation_TLot", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsTInventoryBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsTInventoryBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    public Map<String, TStoreNoCQ> getStoreNoId_InScopeRelation_TStoreNo() { return xgetSQueMap("storeNoId_InScopeRelation_TStoreNo"); }
    public String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq) { return xkeepSQue("storeNoId_InScopeRelation_TStoreNo", sq); }

    public Map<String, TStoreNoCQ> getStoreNoId_NotInScopeRelation_TStoreNo() { return xgetSQueMap("storeNoId_NotInScopeRelation_TStoreNo"); }
    public String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq) { return xkeepSQue("storeNoId_NotInScopeRelation_TStoreNo", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

    protected ConditionValue _storeLabelNo;
    public ConditionValue xdfgetStoreLabelNo()
    { if (_storeLabelNo == null) { _storeLabelNo = nCV(); }
      return _storeLabelNo; }
    protected ConditionValue xgetCValueStoreLabelNo() { return xdfgetStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

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
    public BsTInventoryBCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

    protected ConditionValue _supplierId;
    public ConditionValue xdfgetSupplierId()
    { if (_supplierId == null) { _supplierId = nCV(); }
      return _supplierId; }
    protected ConditionValue xgetCValueSupplierId() { return xdfgetSupplierId(); }

    public Map<String, MCustomerCQ> getSupplierId_InScopeRelation_MCustomerBySupplierId() { return xgetSQueMap("supplierId_InScopeRelation_MCustomerBySupplierId"); }
    public String keepSupplierId_InScopeRelation_MCustomerBySupplierId(MCustomerCQ sq) { return xkeepSQue("supplierId_InScopeRelation_MCustomerBySupplierId", sq); }

    public Map<String, MCustomerCQ> getSupplierId_NotInScopeRelation_MCustomerBySupplierId() { return xgetSQueMap("supplierId_NotInScopeRelation_MCustomerBySupplierId"); }
    public String keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(MCustomerCQ sq) { return xkeepSQue("supplierId_NotInScopeRelation_MCustomerBySupplierId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

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
    public BsTInventoryBCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

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
    public BsTInventoryBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

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
    public BsTInventoryBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _chargeNum;
    public ConditionValue xdfgetChargeNum()
    { if (_chargeNum == null) { _chargeNum = nCV(); }
      return _chargeNum; }
    protected ConditionValue xgetCValueChargeNum() { return xdfgetChargeNum(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ChargeNum_Asc() { regOBA("CHARGE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ChargeNum_Desc() { regOBD("CHARGE_NUM"); return this; }

    protected ConditionValue _allocNum;
    public ConditionValue xdfgetAllocNum()
    { if (_allocNum == null) { _allocNum = nCV(); }
      return _allocNum; }
    protected ConditionValue xgetCValueAllocNum() { return xdfgetAllocNum(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_AllocNum_Asc() { regOBA("ALLOC_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_AllocNum_Desc() { regOBD("ALLOC_NUM"); return this; }

    protected ConditionValue _moveNum;
    public ConditionValue xdfgetMoveNum()
    { if (_moveNum == null) { _moveNum = nCV(); }
      return _moveNum; }
    protected ConditionValue xgetCValueMoveNum() { return xdfgetMoveNum(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_MoveNum_Asc() { regOBA("MOVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_MoveNum_Desc() { regOBD("MOVE_NUM"); return this; }

    protected ConditionValue _inventoryNum;
    public ConditionValue xdfgetInventoryNum()
    { if (_inventoryNum == null) { _inventoryNum = nCV(); }
      return _inventoryNum; }
    protected ConditionValue xgetCValueInventoryNum() { return xdfgetInventoryNum(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryNum_Asc() { regOBA("INVENTORY_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryNum_Desc() { regOBD("INVENTORY_NUM"); return this; }

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
    public BsTInventoryBCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

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
    public BsTInventoryBCQ addOrderBy_StockAdjustFlg_Asc() { regOBA("STOCK_ADJUST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_StockAdjustFlg_Desc() { regOBD("STOCK_ADJUST_FLG"); return this; }

    protected ConditionValue _moveInstHId;
    public ConditionValue xdfgetMoveInstHId()
    { if (_moveInstHId == null) { _moveInstHId = nCV(); }
      return _moveInstHId; }
    protected ConditionValue xgetCValueMoveInstHId() { return xdfgetMoveInstHId(); }

    public Map<String, TMoveInstHCQ> getMoveInstHId_InScopeRelation_TMoveInstH() { return xgetSQueMap("moveInstHId_InScopeRelation_TMoveInstH"); }
    public String keepMoveInstHId_InScopeRelation_TMoveInstH(TMoveInstHCQ sq) { return xkeepSQue("moveInstHId_InScopeRelation_TMoveInstH", sq); }

    public Map<String, TMoveInstHCQ> getMoveInstHId_NotInScopeRelation_TMoveInstH() { return xgetSQueMap("moveInstHId_NotInScopeRelation_TMoveInstH"); }
    public String keepMoveInstHId_NotInScopeRelation_TMoveInstH(TMoveInstHCQ sq) { return xkeepSQue("moveInstHId_NotInScopeRelation_TMoveInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_MoveInstHId_Asc() { regOBA("MOVE_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_MoveInstHId_Desc() { regOBD("MOVE_INST_H_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _firmtransportCd;
    public ConditionValue xdfgetFirmtransportCd()
    { if (_firmtransportCd == null) { _firmtransportCd = nCV(); }
      return _firmtransportCd; }
    protected ConditionValue xgetCValueFirmtransportCd() { return xdfgetFirmtransportCd(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_FirmtransportCd_Asc() { regOBA("FIRMTRANSPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_FirmtransportCd_Desc() { regOBD("FIRMTRANSPORT_CD"); return this; }

    protected ConditionValue _manufactureDt;
    public ConditionValue xdfgetManufactureDt()
    { if (_manufactureDt == null) { _manufactureDt = nCV(); }
      return _manufactureDt; }
    protected ConditionValue xgetCValueManufactureDt() { return xdfgetManufactureDt(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ManufactureDt_Asc() { regOBA("MANUFACTURE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ManufactureDt_Desc() { regOBD("MANUFACTURE_DT"); return this; }

    protected ConditionValue _manufactureSymbol;
    public ConditionValue xdfgetManufactureSymbol()
    { if (_manufactureSymbol == null) { _manufactureSymbol = nCV(); }
      return _manufactureSymbol; }
    protected ConditionValue xgetCValueManufactureSymbol() { return xdfgetManufactureSymbol(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ManufactureSymbol_Asc() { regOBA("MANUFACTURE_SYMBOL"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_SYMBOL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ManufactureSymbol_Desc() { regOBD("MANUFACTURE_SYMBOL"); return this; }

    protected ConditionValue _fcflg;
    public ConditionValue xdfgetFcflg()
    { if (_fcflg == null) { _fcflg = nCV(); }
      return _fcflg; }
    protected ConditionValue xgetCValueFcflg() { return xdfgetFcflg(); }

    /**
     * Add order-by as ascend. <br>
     * FCFLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_Fcflg_Asc() { regOBA("FCFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FCFLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_Fcflg_Desc() { regOBD("FCFLG"); return this; }

    protected ConditionValue _diffqtyHenpin;
    public ConditionValue xdfgetDiffqtyHenpin()
    { if (_diffqtyHenpin == null) { _diffqtyHenpin = nCV(); }
      return _diffqtyHenpin; }
    protected ConditionValue xgetCValueDiffqtyHenpin() { return xdfgetDiffqtyHenpin(); }

    /**
     * Add order-by as ascend. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DiffqtyHenpin_Asc() { regOBA("DIFFQTY_HENPIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIFFQTY_HENPIN: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DiffqtyHenpin_Desc() { regOBD("DIFFQTY_HENPIN"); return this; }

    protected ConditionValue _diffqtyTaxrefond;
    public ConditionValue xdfgetDiffqtyTaxrefond()
    { if (_diffqtyTaxrefond == null) { _diffqtyTaxrefond = nCV(); }
      return _diffqtyTaxrefond; }
    protected ConditionValue xgetCValueDiffqtyTaxrefond() { return xdfgetDiffqtyTaxrefond(); }

    /**
     * Add order-by as ascend. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DiffqtyTaxrefond_Asc() { regOBA("DIFFQTY_TAXREFOND"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DiffqtyTaxrefond_Desc() { regOBD("DIFFQTY_TAXREFOND"); return this; }

    protected ConditionValue _suffererQty;
    public ConditionValue xdfgetSuffererQty()
    { if (_suffererQty == null) { _suffererQty = nCV(); }
      return _suffererQty; }
    protected ConditionValue xgetCValueSuffererQty() { return xdfgetSuffererQty(); }

    /**
     * Add order-by as ascend. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_SuffererQty_Asc() { regOBA("SUFFERER_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUFFERER_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_SuffererQty_Desc() { regOBD("SUFFERER_QTY"); return this; }

    protected ConditionValue _monthStatussu;
    public ConditionValue xdfgetMonthStatussu()
    { if (_monthStatussu == null) { _monthStatussu = nCV(); }
      return _monthStatussu; }
    protected ConditionValue xgetCValueMonthStatussu() { return xdfgetMonthStatussu(); }

    /**
     * Add order-by as ascend. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_MonthStatussu_Asc() { regOBA("MONTH_STATUSSU"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH_STATUSSU: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_MonthStatussu_Desc() { regOBD("MONTH_STATUSSU"); return this; }

    protected ConditionValue _blukRecivedQty;
    public ConditionValue xdfgetBlukRecivedQty()
    { if (_blukRecivedQty == null) { _blukRecivedQty = nCV(); }
      return _blukRecivedQty; }
    protected ConditionValue xgetCValueBlukRecivedQty() { return xdfgetBlukRecivedQty(); }

    /**
     * Add order-by as ascend. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_BlukRecivedQty_Asc() { regOBA("BLUK_RECIVED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_BlukRecivedQty_Desc() { regOBD("BLUK_RECIVED_QTY"); return this; }

    protected ConditionValue _refunditemQty;
    public ConditionValue xdfgetRefunditemQty()
    { if (_refunditemQty == null) { _refunditemQty = nCV(); }
      return _refunditemQty; }
    protected ConditionValue xgetCValueRefunditemQty() { return xdfgetRefunditemQty(); }

    /**
     * Add order-by as ascend. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_RefunditemQty_Asc() { regOBA("REFUNDITEM_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFUNDITEM_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_RefunditemQty_Desc() { regOBD("REFUNDITEM_QTY"); return this; }

    protected ConditionValue _inventoryInputFlg;
    public ConditionValue xdfgetInventoryInputFlg()
    { if (_inventoryInputFlg == null) { _inventoryInputFlg = nCV(); }
      return _inventoryInputFlg; }
    protected ConditionValue xgetCValueInventoryInputFlg() { return xdfgetInventoryInputFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryInputFlg_Asc() { regOBA("INVENTORY_INPUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_InventoryInputFlg_Desc() { regOBD("INVENTORY_INPUT_FLG"); return this; }

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
    public BsTInventoryBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryBCQ bq = (TInventoryBCQ)bqs;
        TInventoryBCQ uq = (TInventoryBCQ)uqs;
        if (bq.hasConditionQueryMCustomerByDepositId()) {
            uq.queryMCustomerByDepositId().reflectRelationOnUnionQuery(bq.queryMCustomerByDepositId(), uq.queryMCustomerByDepositId());
        }
        if (bq.hasConditionQueryTInventoryH()) {
            uq.queryTInventoryH().reflectRelationOnUnionQuery(bq.queryTInventoryH(), uq.queryTInventoryH());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryTMoveInstH()) {
            uq.queryTMoveInstH().reflectRelationOnUnionQuery(bq.queryTMoveInstH(), uq.queryTMoveInstH());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryTStoreNo()) {
            uq.queryTStoreNo().reflectRelationOnUnionQuery(bq.queryTStoreNo(), uq.queryTStoreNo());
        }
        if (bq.hasConditionQueryMCustomerBySupplierId()) {
            uq.queryMCustomerBySupplierId().reflectRelationOnUnionQuery(bq.queryMCustomerBySupplierId(), uq.queryMCustomerBySupplierId());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByStockAdjustFlg()) {
            uq.queryBClassDtlByStockAdjustFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockAdjustFlg(), uq.queryBClassDtlByStockAdjustFlg());
        }
        if (bq.hasConditionQueryTInventoryRAsOne()) {
            uq.queryTInventoryRAsOne().reflectRelationOnUnionQuery(bq.queryTInventoryRAsOne(), uq.queryTInventoryRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerByDepositId() {
        return xdfgetConditionQueryMCustomerByDepositId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerByDepositId() {
        String prop = "mCustomerByDepositId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerByDepositId()); xsetupOuterJoinMCustomerByDepositId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerByDepositId() {
        String nrp = xresolveNRP("T_INVENTORY_B", "mCustomerByDepositId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByDepositId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByDepositId() { xregOutJo("mCustomerByDepositId"); }
    public boolean hasConditionQueryMCustomerByDepositId() { return xhasQueRlMap("mCustomerByDepositId"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TInventoryHCQ queryTInventoryH() {
        return xdfgetConditionQueryTInventoryH();
    }
    public TInventoryHCQ xdfgetConditionQueryTInventoryH() {
        String prop = "tInventoryH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTInventoryH()); xsetupOuterJoinTInventoryH(); }
        return xgetQueRlMap(prop);
    }
    protected TInventoryHCQ xcreateQueryTInventoryH() {
        String nrp = xresolveNRP("T_INVENTORY_B", "tInventoryH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryH", nrp);
    }
    protected void xsetupOuterJoinTInventoryH() { xregOutJo("tInventoryH"); }
    public boolean hasConditionQueryTInventoryH() { return xhasQueRlMap("tInventoryH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The instance of condition-query. (NotNull)
     */
    public MLocationCQ queryMLocation() {
        return xdfgetConditionQueryMLocation();
    }
    public MLocationCQ xdfgetConditionQueryMLocation() {
        String prop = "mLocation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMLocation()); xsetupOuterJoinMLocation(); }
        return xgetQueRlMap(prop);
    }
    protected MLocationCQ xcreateQueryMLocation() {
        String nrp = xresolveNRP("T_INVENTORY_B", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The instance of condition-query. (NotNull)
     */
    public TLotCQ queryTLot() {
        return xdfgetConditionQueryTLot();
    }
    public TLotCQ xdfgetConditionQueryTLot() {
        String prop = "tLot";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTLot()); xsetupOuterJoinTLot(); }
        return xgetQueRlMap(prop);
    }
    protected TLotCQ xcreateQueryTLot() {
        String nrp = xresolveNRP("T_INVENTORY_B", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveInstHCQ queryTMoveInstH() {
        return xdfgetConditionQueryTMoveInstH();
    }
    public TMoveInstHCQ xdfgetConditionQueryTMoveInstH() {
        String prop = "tMoveInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveInstH()); xsetupOuterJoinTMoveInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveInstHCQ xcreateQueryTMoveInstH() {
        String nrp = xresolveNRP("T_INVENTORY_B", "tMoveInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstH", nrp);
    }
    protected void xsetupOuterJoinTMoveInstH() { xregOutJo("tMoveInstH"); }
    public boolean hasConditionQueryTMoveInstH() { return xhasQueRlMap("tMoveInstH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("T_INVENTORY_B", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

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
        String nrp = xresolveNRP("T_INVENTORY_B", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockCQ queryTStock() {
        return xdfgetConditionQueryTStock();
    }
    public TStockCQ xdfgetConditionQueryTStock() {
        String prop = "tStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStock()); xsetupOuterJoinTStock(); }
        return xgetQueRlMap(prop);
    }
    protected TStockCQ xcreateQueryTStock() {
        String nrp = xresolveNRP("T_INVENTORY_B", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

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
        String nrp = xresolveNRP("T_INVENTORY_B", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreNoCQ queryTStoreNo() {
        return xdfgetConditionQueryTStoreNo();
    }
    public TStoreNoCQ xdfgetConditionQueryTStoreNo() {
        String prop = "tStoreNo";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreNo()); xsetupOuterJoinTStoreNo(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreNoCQ xcreateQueryTStoreNo() {
        String nrp = xresolveNRP("T_INVENTORY_B", "tStoreNo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreNoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreNo", nrp);
    }
    protected void xsetupOuterJoinTStoreNo() { xregOutJo("tStoreNo"); }
    public boolean hasConditionQueryTStoreNo() { return xhasQueRlMap("tStoreNo"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerBySupplierId() {
        return xdfgetConditionQueryMCustomerBySupplierId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerBySupplierId() {
        String prop = "mCustomerBySupplierId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerBySupplierId()); xsetupOuterJoinMCustomerBySupplierId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerBySupplierId() {
        String nrp = xresolveNRP("T_INVENTORY_B", "mCustomerBySupplierId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerBySupplierId", nrp);
    }
    protected void xsetupOuterJoinMCustomerBySupplierId() { xregOutJo("mCustomerBySupplierId"); }
    public boolean hasConditionQueryMCustomerBySupplierId() { return xhasQueRlMap("mCustomerBySupplierId"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MWarehouseCQ queryMWarehouse() {
        return xdfgetConditionQueryMWarehouse();
    }
    public MWarehouseCQ xdfgetConditionQueryMWarehouse() {
        String prop = "mWarehouse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMWarehouse()); xsetupOuterJoinMWarehouse(); }
        return xgetQueRlMap(prop);
    }
    protected MWarehouseCQ xcreateQueryMWarehouse() {
        String nrp = xresolveNRP("T_INVENTORY_B", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

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
        String nrp = xresolveNRP("T_INVENTORY_B", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_INVENTORY_B", "bClassDtlByStockAdjustFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockAdjustFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockAdjustFlg() { xregOutJo("bClassDtlByStockAdjustFlg"); }
    public boolean hasConditionQueryBClassDtlByStockAdjustFlg() { return xhasQueRlMap("bClassDtlByStockAdjustFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TInventoryRCQ queryTInventoryRAsOne() { return xdfgetConditionQueryTInventoryRAsOne(); }
    public TInventoryRCQ xdfgetConditionQueryTInventoryRAsOne() {
        String prop = "tInventoryRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTInventoryRAsOne()); xsetupOuterJoinTInventoryRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TInventoryRCQ xcreateQueryTInventoryRAsOne() {
        String nrp = xresolveNRP("T_INVENTORY_B", "tInventoryRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryRAsOne", nrp);
    }
    protected void xsetupOuterJoinTInventoryRAsOne() { xregOutJo("tInventoryRAsOne"); }
    public boolean hasConditionQueryTInventoryRAsOne() { return xhasQueRlMap("tInventoryRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryBCQ> _myselfExistsMap;
    public Map<String, TInventoryBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryBCB.class.getName(); }
    protected String xCQ() { return TInventoryBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
