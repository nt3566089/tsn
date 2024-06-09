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
 * The base condition-query of T_ALLOC_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTAllocInstBCQ extends AbstractBsTAllocInstBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAllocInstBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAllocInstBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_ALLOC_INST_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TAllocInstBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TAllocInstBCIQ xcreateCIQ() {
        TAllocInstBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TAllocInstBCIQ xnewCIQ() {
        return new TAllocInstBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_ALLOC_INST_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TAllocInstBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TAllocInstBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _allocInstBId;
    public ConditionValue xdfgetAllocInstBId()
    { if (_allocInstBId == null) { _allocInstBId = nCV(); }
      return _allocInstBId; }
    protected ConditionValue xgetCValueAllocInstBId() { return xdfgetAllocInstBId(); }

    public Map<String, TAllocLotCQ> xdfgetAllocInstBId_ExistsReferrer_TAllocLotAsOne() { return xgetSQueMap("allocInstBId_ExistsReferrer_TAllocLotAsOne"); }
    public String keepAllocInstBId_ExistsReferrer_TAllocLotAsOne(TAllocLotCQ sq) { return xkeepSQue("allocInstBId_ExistsReferrer_TAllocLotAsOne", sq); }

    public Map<String, TPackingBCQ> xdfgetAllocInstBId_ExistsReferrer_TPackingBList() { return xgetSQueMap("allocInstBId_ExistsReferrer_TPackingBList"); }
    public String keepAllocInstBId_ExistsReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("allocInstBId_ExistsReferrer_TPackingBList", sq); }

    public Map<String, TPickingBCQ> xdfgetAllocInstBId_ExistsReferrer_TPickingBList() { return xgetSQueMap("allocInstBId_ExistsReferrer_TPickingBList"); }
    public String keepAllocInstBId_ExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("allocInstBId_ExistsReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetAllocInstBId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("allocInstBId_ExistsReferrer_TShippingInstBList"); }
    public String keepAllocInstBId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("allocInstBId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockInoutCQ> xdfgetAllocInstBId_ExistsReferrer_TStockInoutList() { return xgetSQueMap("allocInstBId_ExistsReferrer_TStockInoutList"); }
    public String keepAllocInstBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("allocInstBId_ExistsReferrer_TStockInoutList", sq); }

    public Map<String, TAllocLotCQ> xdfgetAllocInstBId_NotExistsReferrer_TAllocLotAsOne() { return xgetSQueMap("allocInstBId_NotExistsReferrer_TAllocLotAsOne"); }
    public String keepAllocInstBId_NotExistsReferrer_TAllocLotAsOne(TAllocLotCQ sq) { return xkeepSQue("allocInstBId_NotExistsReferrer_TAllocLotAsOne", sq); }

    public Map<String, TPackingBCQ> xdfgetAllocInstBId_NotExistsReferrer_TPackingBList() { return xgetSQueMap("allocInstBId_NotExistsReferrer_TPackingBList"); }
    public String keepAllocInstBId_NotExistsReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("allocInstBId_NotExistsReferrer_TPackingBList", sq); }

    public Map<String, TPickingBCQ> xdfgetAllocInstBId_NotExistsReferrer_TPickingBList() { return xgetSQueMap("allocInstBId_NotExistsReferrer_TPickingBList"); }
    public String keepAllocInstBId_NotExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("allocInstBId_NotExistsReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetAllocInstBId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("allocInstBId_NotExistsReferrer_TShippingInstBList"); }
    public String keepAllocInstBId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("allocInstBId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockInoutCQ> xdfgetAllocInstBId_NotExistsReferrer_TStockInoutList() { return xgetSQueMap("allocInstBId_NotExistsReferrer_TStockInoutList"); }
    public String keepAllocInstBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("allocInstBId_NotExistsReferrer_TStockInoutList", sq); }

    public Map<String, TPackingBCQ> xdfgetAllocInstBId_SpecifyDerivedReferrer_TPackingBList() { return xgetSQueMap("allocInstBId_SpecifyDerivedReferrer_TPackingBList"); }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("allocInstBId_SpecifyDerivedReferrer_TPackingBList", sq); }

    public Map<String, TPickingBCQ> xdfgetAllocInstBId_SpecifyDerivedReferrer_TPickingBList() { return xgetSQueMap("allocInstBId_SpecifyDerivedReferrer_TPickingBList"); }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("allocInstBId_SpecifyDerivedReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetAllocInstBId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("allocInstBId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("allocInstBId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockInoutCQ> xdfgetAllocInstBId_SpecifyDerivedReferrer_TStockInoutList() { return xgetSQueMap("allocInstBId_SpecifyDerivedReferrer_TStockInoutList"); }
    public String keepAllocInstBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("allocInstBId_SpecifyDerivedReferrer_TStockInoutList", sq); }

    public Map<String, TPackingBCQ> xdfgetAllocInstBId_QueryDerivedReferrer_TPackingBList() { return xgetSQueMap("allocInstBId_QueryDerivedReferrer_TPackingBList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("allocInstBId_QueryDerivedReferrer_TPackingBList", sq); }
    public Map<String, Object> xdfgetAllocInstBId_QueryDerivedReferrer_TPackingBListParameter() { return xgetSQuePmMap("allocInstBId_QueryDerivedReferrer_TPackingBList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TPackingBListParameter(Object pm) { return xkeepSQuePm("allocInstBId_QueryDerivedReferrer_TPackingBList", pm); }

    public Map<String, TPickingBCQ> xdfgetAllocInstBId_QueryDerivedReferrer_TPickingBList() { return xgetSQueMap("allocInstBId_QueryDerivedReferrer_TPickingBList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("allocInstBId_QueryDerivedReferrer_TPickingBList", sq); }
    public Map<String, Object> xdfgetAllocInstBId_QueryDerivedReferrer_TPickingBListParameter() { return xgetSQuePmMap("allocInstBId_QueryDerivedReferrer_TPickingBList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TPickingBListParameter(Object pm) { return xkeepSQuePm("allocInstBId_QueryDerivedReferrer_TPickingBList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetAllocInstBId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("allocInstBId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("allocInstBId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetAllocInstBId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("allocInstBId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("allocInstBId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockInoutCQ> xdfgetAllocInstBId_QueryDerivedReferrer_TStockInoutList() { return xgetSQueMap("allocInstBId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("allocInstBId_QueryDerivedReferrer_TStockInoutList", sq); }
    public Map<String, Object> xdfgetAllocInstBId_QueryDerivedReferrer_TStockInoutListParameter() { return xgetSQuePmMap("allocInstBId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepAllocInstBId_QueryDerivedReferrer_TStockInoutListParameter(Object pm) { return xkeepSQuePm("allocInstBId_QueryDerivedReferrer_TStockInoutList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AllocInstBId_Asc() { regOBA("ALLOC_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AllocInstBId_Desc() { regOBD("ALLOC_INST_B_ID"); return this; }

    protected ConditionValue _allocInstHId;
    public ConditionValue xdfgetAllocInstHId()
    { if (_allocInstHId == null) { _allocInstHId = nCV(); }
      return _allocInstHId; }
    protected ConditionValue xgetCValueAllocInstHId() { return xdfgetAllocInstHId(); }

    public Map<String, TAllocInstHCQ> getAllocInstHId_InScopeRelation_TAllocInstH() { return xgetSQueMap("allocInstHId_InScopeRelation_TAllocInstH"); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq) { return xkeepSQue("allocInstHId_InScopeRelation_TAllocInstH", sq); }

    public Map<String, TAllocInstHCQ> getAllocInstHId_NotInScopeRelation_TAllocInstH() { return xgetSQueMap("allocInstHId_NotInScopeRelation_TAllocInstH"); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq) { return xkeepSQue("allocInstHId_NotInScopeRelation_TAllocInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {IX, NotNull, bigint(19), FK to T_ALLOC_INST_H}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    public Map<String, MCustomerCQ> getDepositId_InScopeRelation_MCustomer() { return xgetSQueMap("depositId_InScopeRelation_MCustomer"); }
    public String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("depositId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getDepositId_NotInScopeRelation_MCustomer() { return xgetSQueMap("depositId_NotInScopeRelation_MCustomer"); }
    public String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("depositId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _shapeCd;
    public ConditionValue xdfgetShapeCd()
    { if (_shapeCd == null) { _shapeCd = nCV(); }
      return _shapeCd; }
    protected ConditionValue xgetCValueShapeCd() { return xdfgetShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

    protected ConditionValue _limitDtReverseFlg;
    public ConditionValue xdfgetLimitDtReverseFlg()
    { if (_limitDtReverseFlg == null) { _limitDtReverseFlg = nCV(); }
      return _limitDtReverseFlg; }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return xdfgetLimitDtReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LimitDtReverseFlg_Asc() { regOBA("LIMIT_DT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LimitDtReverseFlg_Desc() { regOBD("LIMIT_DT_REVERSE_FLG"); return this; }

    protected ConditionValue _shippingLimitDt;
    public ConditionValue xdfgetShippingLimitDt()
    { if (_shippingLimitDt == null) { _shippingLimitDt = nCV(); }
      return _shippingLimitDt; }
    protected ConditionValue xgetCValueShippingLimitDt() { return xdfgetShippingLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ShippingLimitDt_Asc() { regOBA("SHIPPING_LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ShippingLimitDt_Desc() { regOBD("SHIPPING_LIMIT_DT"); return this; }

    protected ConditionValue _lotManagFlg;
    public ConditionValue xdfgetLotManagFlg()
    { if (_lotManagFlg == null) { _lotManagFlg = nCV(); }
      return _lotManagFlg; }
    protected ConditionValue xgetCValueLotManagFlg() { return xdfgetLotManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LotManagFlg_Asc() { regOBA("LOT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LotManagFlg_Desc() { regOBD("LOT_MANAG_FLG"); return this; }

    protected ConditionValue _limitDtManagFlg;
    public ConditionValue xdfgetLimitDtManagFlg()
    { if (_limitDtManagFlg == null) { _limitDtManagFlg = nCV(); }
      return _limitDtManagFlg; }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return xdfgetLimitDtManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LimitDtManagFlg_Asc() { regOBA("LIMIT_DT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_LimitDtManagFlg_Desc() { regOBD("LIMIT_DT_MANAG_FLG"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _processNo;
    public ConditionValue xdfgetProcessNo()
    { if (_processNo == null) { _processNo = nCV(); }
      return _processNo; }
    protected ConditionValue xgetCValueProcessNo() { return xdfgetProcessNo(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ProcessNo_Asc() { regOBA("PROCESS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ProcessNo_Desc() { regOBD("PROCESS_NO"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_AllocNum_Asc() { regOBA("ALLOC_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AllocNum_Desc() { regOBD("ALLOC_NUM"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTAllocInstBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAllocInstBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTAllocInstBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTAllocInstBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TAllocInstBCQ bq = (TAllocInstBCQ)bqs;
        TAllocInstBCQ uq = (TAllocInstBCQ)uqs;
        if (bq.hasConditionQueryTAllocInstH()) {
            uq.queryTAllocInstH().reflectRelationOnUnionQuery(bq.queryTAllocInstH(), uq.queryTAllocInstH());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryTStoreNo()) {
            uq.queryTStoreNo().reflectRelationOnUnionQuery(bq.queryTStoreNo(), uq.queryTStoreNo());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtManagFlg()) {
            uq.queryBClassDtlByLimitDtManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtManagFlg(), uq.queryBClassDtlByLimitDtManagFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtReverseFlg()) {
            uq.queryBClassDtlByLimitDtReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtReverseFlg(), uq.queryBClassDtlByLimitDtReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLotManagFlg()) {
            uq.queryBClassDtlByLotManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLotManagFlg(), uq.queryBClassDtlByLotManagFlg());
        }
        if (bq.hasConditionQueryTAllocLotAsOne()) {
            uq.queryTAllocLotAsOne().reflectRelationOnUnionQuery(bq.queryTAllocLotAsOne(), uq.queryTAllocLotAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocInstHCQ queryTAllocInstH() {
        return xdfgetConditionQueryTAllocInstH();
    }
    public TAllocInstHCQ xdfgetConditionQueryTAllocInstH() {
        String prop = "tAllocInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocInstH()); xsetupOuterJoinTAllocInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocInstHCQ xcreateQueryTAllocInstH() {
        String nrp = xresolveNRP("T_ALLOC_INST_B", "tAllocInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstH", nrp);
    }
    protected void xsetupOuterJoinTAllocInstH() { xregOutJo("tAllocInstH"); }
    public boolean hasConditionQueryTAllocInstH() { return xhasQueRlMap("tAllocInstH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("T_ALLOC_INST_B", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "tStoreNo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreNoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreNo", nrp);
    }
    protected void xsetupOuterJoinTStoreNo() { xregOutJo("tStoreNo"); }
    public boolean hasConditionQueryTStoreNo() { return xhasQueRlMap("tStoreNo"); }

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
        String nrp = xresolveNRP("T_ALLOC_INST_B", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtManagFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtManagFlg() {
        String prop = "bClassDtlByLimitDtManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtManagFlg()); xsetupOuterJoinBClassDtlByLimitDtManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtManagFlg() {
        String nrp = xresolveNRP("T_ALLOC_INST_B", "bClassDtlByLimitDtManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtManagFlg() { xregOutJo("bClassDtlByLimitDtManagFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtManagFlg() { return xhasQueRlMap("bClassDtlByLimitDtManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtReverseFlg() {
        String prop = "bClassDtlByLimitDtReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtReverseFlg()); xsetupOuterJoinBClassDtlByLimitDtReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtReverseFlg() {
        String nrp = xresolveNRP("T_ALLOC_INST_B", "bClassDtlByLimitDtReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtReverseFlg() { xregOutJo("bClassDtlByLimitDtReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtReverseFlg() { return xhasQueRlMap("bClassDtlByLimitDtReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLotManagFlg() {
        return xdfgetConditionQueryBClassDtlByLotManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLotManagFlg() {
        String prop = "bClassDtlByLotManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLotManagFlg()); xsetupOuterJoinBClassDtlByLotManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLotManagFlg() {
        String nrp = xresolveNRP("T_ALLOC_INST_B", "bClassDtlByLotManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLotManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLotManagFlg() { xregOutJo("bClassDtlByLotManagFlg"); }
    public boolean hasConditionQueryBClassDtlByLotManagFlg() { return xhasQueRlMap("bClassDtlByLotManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_ALLOC_LOT by ALLOC_INST_B_ID, named 'TAllocLotAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocLotCQ queryTAllocLotAsOne() { return xdfgetConditionQueryTAllocLotAsOne(); }
    public TAllocLotCQ xdfgetConditionQueryTAllocLotAsOne() {
        String prop = "tAllocLotAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocLotAsOne()); xsetupOuterJoinTAllocLotAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocLotCQ xcreateQueryTAllocLotAsOne() {
        String nrp = xresolveNRP("T_ALLOC_INST_B", "tAllocLotAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocLotAsOne", nrp);
    }
    protected void xsetupOuterJoinTAllocLotAsOne() { xregOutJo("tAllocLotAsOne"); }
    public boolean hasConditionQueryTAllocLotAsOne() { return xhasQueRlMap("tAllocLotAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TAllocInstBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TAllocInstBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TAllocInstBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TAllocInstBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TAllocInstBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TAllocInstBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TAllocInstBCQ> _myselfExistsMap;
    public Map<String, TAllocInstBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TAllocInstBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TAllocInstBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TAllocInstBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TAllocInstBCB.class.getName(); }
    protected String xCQ() { return TAllocInstBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
