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
 * The base condition-query of T_MOVE_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTMoveInstBCQ extends AbstractBsTMoveInstBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMoveInstBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMoveInstBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_MOVE_INST_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TMoveInstBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TMoveInstBCIQ xcreateCIQ() {
        TMoveInstBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TMoveInstBCIQ xnewCIQ() {
        return new TMoveInstBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_MOVE_INST_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TMoveInstBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TMoveInstBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _moveInstBId;
    public ConditionValue xdfgetMoveInstBId()
    { if (_moveInstBId == null) { _moveInstBId = nCV(); }
      return _moveInstBId; }
    protected ConditionValue xgetCValueMoveInstBId() { return xdfgetMoveInstBId(); }

    public Map<String, TMoveInstBSubCQ> xdfgetMoveInstBId_ExistsReferrer_TMoveInstBSubAsOne() { return xgetSQueMap("moveInstBId_ExistsReferrer_TMoveInstBSubAsOne"); }
    public String keepMoveInstBId_ExistsReferrer_TMoveInstBSubAsOne(TMoveInstBSubCQ sq) { return xkeepSQue("moveInstBId_ExistsReferrer_TMoveInstBSubAsOne", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstBId_ExistsReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstBId_ExistsReferrer_TMoveRecordBList"); }
    public String keepMoveInstBId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstBId_ExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TMoveInstBSubCQ> xdfgetMoveInstBId_NotExistsReferrer_TMoveInstBSubAsOne() { return xgetSQueMap("moveInstBId_NotExistsReferrer_TMoveInstBSubAsOne"); }
    public String keepMoveInstBId_NotExistsReferrer_TMoveInstBSubAsOne(TMoveInstBSubCQ sq) { return xkeepSQue("moveInstBId_NotExistsReferrer_TMoveInstBSubAsOne", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstBId_NotExistsReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstBId_NotExistsReferrer_TMoveRecordBList"); }
    public String keepMoveInstBId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstBId_NotExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstBId_SpecifyDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstBId_SpecifyDerivedReferrer_TMoveRecordBList"); }
    public String keepMoveInstBId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstBId_SpecifyDerivedReferrer_TMoveRecordBList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetMoveInstBId_QueryDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("moveInstBId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepMoveInstBId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("moveInstBId_QueryDerivedReferrer_TMoveRecordBList", sq); }
    public Map<String, Object> xdfgetMoveInstBId_QueryDerivedReferrer_TMoveRecordBListParameter() { return xgetSQuePmMap("moveInstBId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepMoveInstBId_QueryDerivedReferrer_TMoveRecordBListParameter(Object pm) { return xkeepSQuePm("moveInstBId_QueryDerivedReferrer_TMoveRecordBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_MoveInstBId_Asc() { regOBA("MOVE_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_MoveInstBId_Desc() { regOBD("MOVE_INST_B_ID"); return this; }

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
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_MoveInstHId_Asc() { regOBA("MOVE_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_MoveInstHId_Desc() { regOBD("MOVE_INST_H_ID"); return this; }

    protected ConditionValue _moveInstStatus;
    public ConditionValue xdfgetMoveInstStatus()
    { if (_moveInstStatus == null) { _moveInstStatus = nCV(); }
      return _moveInstStatus; }
    protected ConditionValue xgetCValueMoveInstStatus() { return xdfgetMoveInstStatus(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_MoveInstStatus_Asc() { regOBA("MOVE_INST_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_MoveInstStatus_Desc() { regOBD("MOVE_INST_STATUS"); return this; }

    protected ConditionValue _inoutType;
    public ConditionValue xdfgetInoutType()
    { if (_inoutType == null) { _inoutType = nCV(); }
      return _inoutType; }
    protected ConditionValue xgetCValueInoutType() { return xdfgetInoutType(); }

    /**
     * Add order-by as ascend. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_InoutType_Asc() { regOBA("INOUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_InoutType_Desc() { regOBD("INOUT_TYPE"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, varchar(100)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _stockTypeCd;
    public ConditionValue xdfgetStockTypeCd()
    { if (_stockTypeCd == null) { _stockTypeCd = nCV(); }
      return _stockTypeCd; }
    protected ConditionValue xgetCValueStockTypeCd() { return xdfgetStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, bigint(19), FK to T_LOT}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _damageflg;
    public ConditionValue xdfgetDamageflg()
    { if (_damageflg == null) { _damageflg = nCV(); }
      return _damageflg; }
    protected ConditionValue xgetCValueDamageflg() { return xdfgetDamageflg(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Damageflg_Asc() { regOBA("DAMAGEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGEFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Damageflg_Desc() { regOBD("DAMAGEFLG"); return this; }

    protected ConditionValue _noshippingflg;
    public ConditionValue xdfgetNoshippingflg()
    { if (_noshippingflg == null) { _noshippingflg = nCV(); }
      return _noshippingflg; }
    protected ConditionValue xgetCValueNoshippingflg() { return xdfgetNoshippingflg(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

    protected ConditionValue _foreigncargoflg;
    public ConditionValue xdfgetForeigncargoflg()
    { if (_foreigncargoflg == null) { _foreigncargoflg = nCV(); }
      return _foreigncargoflg; }
    protected ConditionValue xgetCValueForeigncargoflg() { return xdfgetForeigncargoflg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _customsreleaseflg;
    public ConditionValue xdfgetCustomsreleaseflg()
    { if (_customsreleaseflg == null) { _customsreleaseflg = nCV(); }
      return _customsreleaseflg; }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return xdfgetCustomsreleaseflg(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Customsreleaseflg_Asc() { regOBA("CUSTOMSRELEASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Customsreleaseflg_Desc() { regOBD("CUSTOMSRELEASEFLG"); return this; }

    protected ConditionValue _taxflg;
    public ConditionValue xdfgetTaxflg()
    { if (_taxflg == null) { _taxflg = nCV(); }
      return _taxflg; }
    protected ConditionValue xgetCValueTaxflg() { return xdfgetTaxflg(); }

    /**
     * Add order-by as ascend. <br>
     * TAXFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Taxflg_Asc() { regOBA("TAXFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_Taxflg_Desc() { regOBD("TAXFLG"); return this; }

    protected ConditionValue _tranceportCd;
    public ConditionValue xdfgetTranceportCd()
    { if (_tranceportCd == null) { _tranceportCd = nCV(); }
      return _tranceportCd; }
    protected ConditionValue xgetCValueTranceportCd() { return xdfgetTranceportCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_TranceportCd_Asc() { regOBA("TRANCEPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANCEPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_TranceportCd_Desc() { regOBD("TRANCEPORT_CD"); return this; }

    protected ConditionValue _sourceCd;
    public ConditionValue xdfgetSourceCd()
    { if (_sourceCd == null) { _sourceCd = nCV(); }
      return _sourceCd; }
    protected ConditionValue xgetCValueSourceCd() { return xdfgetSourceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SourceCd_Asc() { regOBA("SOURCE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SourceCd_Desc() { regOBD("SOURCE_CD"); return this; }

    protected ConditionValue _sourceNm;
    public ConditionValue xdfgetSourceNm()
    { if (_sourceNm == null) { _sourceNm = nCV(); }
      return _sourceNm; }
    protected ConditionValue xgetCValueSourceNm() { return xdfgetSourceNm(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SourceNm_Asc() { regOBA("SOURCE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SourceNm_Desc() { regOBD("SOURCE_NM"); return this; }

    protected ConditionValue _schDt;
    public ConditionValue xdfgetSchDt()
    { if (_schDt == null) { _schDt = nCV(); }
      return _schDt; }
    protected ConditionValue xgetCValueSchDt() { return xdfgetSchDt(); }

    /**
     * Add order-by as ascend. <br>
     * SCH_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SchDt_Asc() { regOBA("SCH_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCH_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_SchDt_Desc() { regOBD("SCH_DT"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTMoveInstBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTMoveInstBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTMoveInstBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TMoveInstBCQ bq = (TMoveInstBCQ)bqs;
        TMoveInstBCQ uq = (TMoveInstBCQ)uqs;
        if (bq.hasConditionQueryTMoveInstH()) {
            uq.queryTMoveInstH().reflectRelationOnUnionQuery(bq.queryTMoveInstH(), uq.queryTMoveInstH());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
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
        if (bq.hasConditionQueryMCustomerByDepositId()) {
            uq.queryMCustomerByDepositId().reflectRelationOnUnionQuery(bq.queryMCustomerByDepositId(), uq.queryMCustomerByDepositId());
        }
        if (bq.hasConditionQueryBClassDtlByInoutType()) {
            uq.queryBClassDtlByInoutType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInoutType(), uq.queryBClassDtlByInoutType());
        }
        if (bq.hasConditionQueryBClassDtlByMoveInstStatus()) {
            uq.queryBClassDtlByMoveInstStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByMoveInstStatus(), uq.queryBClassDtlByMoveInstStatus());
        }
        if (bq.hasConditionQueryTMoveInstBSubAsOne()) {
            uq.queryTMoveInstBSubAsOne().reflectRelationOnUnionQuery(bq.queryTMoveInstBSubAsOne(), uq.queryTMoveInstBSubAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("T_MOVE_INST_B", "tMoveInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstH", nrp);
    }
    protected void xsetupOuterJoinTMoveInstH() { xregOutJo("tMoveInstH"); }
    public boolean hasConditionQueryTMoveInstH() { return xhasQueRlMap("tMoveInstH"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_MOVE_INST_B", "tStoreNo"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mCustomerBySupplierId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerBySupplierId", nrp);
    }
    protected void xsetupOuterJoinMCustomerBySupplierId() { xregOutJo("mCustomerBySupplierId"); }
    public boolean hasConditionQueryMCustomerBySupplierId() { return xhasQueRlMap("mCustomerBySupplierId"); }

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
        String nrp = xresolveNRP("T_MOVE_INST_B", "mCustomerByDepositId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByDepositId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByDepositId() { xregOutJo("mCustomerByDepositId"); }
    public boolean hasConditionQueryMCustomerByDepositId() { return xhasQueRlMap("mCustomerByDepositId"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInoutType() {
        return xdfgetConditionQueryBClassDtlByInoutType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInoutType() {
        String prop = "bClassDtlByInoutType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInoutType()); xsetupOuterJoinBClassDtlByInoutType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInoutType() {
        String nrp = xresolveNRP("T_MOVE_INST_B", "bClassDtlByInoutType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInoutType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInoutType() { xregOutJo("bClassDtlByInoutType"); }
    public boolean hasConditionQueryBClassDtlByInoutType() { return xhasQueRlMap("bClassDtlByInoutType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMoveInstStatus() {
        return xdfgetConditionQueryBClassDtlByMoveInstStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMoveInstStatus() {
        String prop = "bClassDtlByMoveInstStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMoveInstStatus()); xsetupOuterJoinBClassDtlByMoveInstStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMoveInstStatus() {
        String nrp = xresolveNRP("T_MOVE_INST_B", "bClassDtlByMoveInstStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMoveInstStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMoveInstStatus() { xregOutJo("bClassDtlByMoveInstStatus"); }
    public boolean hasConditionQueryBClassDtlByMoveInstStatus() { return xhasQueRlMap("bClassDtlByMoveInstStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveInstBSubCQ queryTMoveInstBSubAsOne() { return xdfgetConditionQueryTMoveInstBSubAsOne(); }
    public TMoveInstBSubCQ xdfgetConditionQueryTMoveInstBSubAsOne() {
        String prop = "tMoveInstBSubAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveInstBSubAsOne()); xsetupOuterJoinTMoveInstBSubAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveInstBSubCQ xcreateQueryTMoveInstBSubAsOne() {
        String nrp = xresolveNRP("T_MOVE_INST_B", "tMoveInstBSubAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstBSubCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstBSubAsOne", nrp);
    }
    protected void xsetupOuterJoinTMoveInstBSubAsOne() { xregOutJo("tMoveInstBSubAsOne"); }
    public boolean hasConditionQueryTMoveInstBSubAsOne() { return xhasQueRlMap("tMoveInstBSubAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TMoveInstBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TMoveInstBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TMoveInstBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TMoveInstBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TMoveInstBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TMoveInstBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TMoveInstBCQ> _myselfExistsMap;
    public Map<String, TMoveInstBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TMoveInstBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TMoveInstBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TMoveInstBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TMoveInstBCB.class.getName(); }
    protected String xCQ() { return TMoveInstBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
