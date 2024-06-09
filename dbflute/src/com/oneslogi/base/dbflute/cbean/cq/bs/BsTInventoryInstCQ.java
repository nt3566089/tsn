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
 * The base condition-query of T_INVENTORY_INST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryInstCQ extends AbstractBsTInventoryInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryInstCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryInstCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_INVENTORY_INST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryInstCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryInstCIQ xcreateCIQ() {
        TInventoryInstCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryInstCIQ xnewCIQ() {
        return new TInventoryInstCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_INVENTORY_INST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryInstCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryInstCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryInstId;
    public ConditionValue xdfgetInventoryInstId()
    { if (_inventoryInstId == null) { _inventoryInstId = nCV(); }
      return _inventoryInstId; }
    protected ConditionValue xgetCValueInventoryInstId() { return xdfgetInventoryInstId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryInstId_Asc() { regOBA("INVENTORY_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryInstId_Desc() { regOBD("INVENTORY_INST_ID"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _fromLocationCd;
    public ConditionValue xdfgetFromLocationCd()
    { if (_fromLocationCd == null) { _fromLocationCd = nCV(); }
      return _fromLocationCd; }
    protected ConditionValue xgetCValueFromLocationCd() { return xdfgetFromLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromLocationCd_Asc() { regOBA("FROM_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromLocationCd_Desc() { regOBD("FROM_LOCATION_CD"); return this; }

    protected ConditionValue _toLocationCd;
    public ConditionValue xdfgetToLocationCd()
    { if (_toLocationCd == null) { _toLocationCd = nCV(); }
      return _toLocationCd; }
    protected ConditionValue xgetCValueToLocationCd() { return xdfgetToLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToLocationCd_Asc() { regOBA("TO_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToLocationCd_Desc() { regOBD("TO_LOCATION_CD"); return this; }

    protected ConditionValue _zoneId;
    public ConditionValue xdfgetZoneId()
    { if (_zoneId == null) { _zoneId = nCV(); }
      return _zoneId; }
    protected ConditionValue xgetCValueZoneId() { return xdfgetZoneId(); }

    public Map<String, MZoneCQ> getZoneId_InScopeRelation_MZone() { return xgetSQueMap("zoneId_InScopeRelation_MZone"); }
    public String keepZoneId_InScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("zoneId_InScopeRelation_MZone", sq); }

    public Map<String, MZoneCQ> getZoneId_NotInScopeRelation_MZone() { return xgetSQueMap("zoneId_NotInScopeRelation_MZone"); }
    public String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("zoneId_NotInScopeRelation_MZone", sq); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ZoneId_Asc() { regOBA("ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ZoneId_Desc() { regOBD("ZONE_ID"); return this; }

    protected ConditionValue _fromStockInoutDt;
    public ConditionValue xdfgetFromStockInoutDt()
    { if (_fromStockInoutDt == null) { _fromStockInoutDt = nCV(); }
      return _fromStockInoutDt; }
    protected ConditionValue xgetCValueFromStockInoutDt() { return xdfgetFromStockInoutDt(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromStockInoutDt_Asc() { regOBA("FROM_STOCK_INOUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_STOCK_INOUT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromStockInoutDt_Desc() { regOBD("FROM_STOCK_INOUT_DT"); return this; }

    protected ConditionValue _toStockInoutDt;
    public ConditionValue xdfgetToStockInoutDt()
    { if (_toStockInoutDt == null) { _toStockInoutDt = nCV(); }
      return _toStockInoutDt; }
    protected ConditionValue xgetCValueToStockInoutDt() { return xdfgetToStockInoutDt(); }

    /**
     * Add order-by as ascend. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToStockInoutDt_Asc() { regOBA("TO_STOCK_INOUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_STOCK_INOUT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToStockInoutDt_Desc() { regOBD("TO_STOCK_INOUT_DT"); return this; }

    protected ConditionValue _stockExistOnlyFlg;
    public ConditionValue xdfgetStockExistOnlyFlg()
    { if (_stockExistOnlyFlg == null) { _stockExistOnlyFlg = nCV(); }
      return _stockExistOnlyFlg; }
    protected ConditionValue xgetCValueStockExistOnlyFlg() { return xdfgetStockExistOnlyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockExistOnlyFlg_Asc() { regOBA("STOCK_EXIST_ONLY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockExistOnlyFlg_Desc() { regOBD("STOCK_EXIST_ONLY_FLG"); return this; }

    protected ConditionValue _inventoryInstKbn;
    public ConditionValue xdfgetInventoryInstKbn()
    { if (_inventoryInstKbn == null) { _inventoryInstKbn = nCV(); }
      return _inventoryInstKbn; }
    protected ConditionValue xgetCValueInventoryInstKbn() { return xdfgetInventoryInstKbn(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryInstKbn_Asc() { regOBA("INVENTORY_INST_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INST_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryInstKbn_Desc() { regOBD("INVENTORY_INST_KBN"); return this; }

    protected ConditionValue _lineBlock;
    public ConditionValue xdfgetLineBlock()
    { if (_lineBlock == null) { _lineBlock = nCV(); }
      return _lineBlock; }
    protected ConditionValue xgetCValueLineBlock() { return xdfgetLineBlock(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _directionalPiston;
    public ConditionValue xdfgetDirectionalPiston()
    { if (_directionalPiston == null) { _directionalPiston = nCV(); }
      return _directionalPiston; }
    protected ConditionValue xgetCValueDirectionalPiston() { return xdfgetDirectionalPiston(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DirectionalPiston_Asc() { regOBA("DIRECTIONAL_PISTON"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DirectionalPiston_Desc() { regOBD("DIRECTIONAL_PISTON"); return this; }

    protected ConditionValue _sortingOrder;
    public ConditionValue xdfgetSortingOrder()
    { if (_sortingOrder == null) { _sortingOrder = nCV(); }
      return _sortingOrder; }
    protected ConditionValue xgetCValueSortingOrder() { return xdfgetSortingOrder(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_SortingOrder_Asc() { regOBA("SORTING_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_SortingOrder_Desc() { regOBD("SORTING_ORDER"); return this; }

    protected ConditionValue _sortingNumTimes;
    public ConditionValue xdfgetSortingNumTimes()
    { if (_sortingNumTimes == null) { _sortingNumTimes = nCV(); }
      return _sortingNumTimes; }
    protected ConditionValue xgetCValueSortingNumTimes() { return xdfgetSortingNumTimes(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_SortingNumTimes_Asc() { regOBA("SORTING_NUM_TIMES"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_NUM_TIMES: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_SortingNumTimes_Desc() { regOBD("SORTING_NUM_TIMES"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productDivision;
    public ConditionValue xdfgetProductDivision()
    { if (_productDivision == null) { _productDivision = nCV(); }
      return _productDivision; }
    protected ConditionValue xgetCValueProductDivision() { return xdfgetProductDivision(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ProductDivision_Asc() { regOBA("PRODUCT_DIVISION"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_DIVISION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ProductDivision_Desc() { regOBD("PRODUCT_DIVISION"); return this; }

    protected ConditionValue _locationGrp;
    public ConditionValue xdfgetLocationGrp()
    { if (_locationGrp == null) { _locationGrp = nCV(); }
      return _locationGrp; }
    protected ConditionValue xgetCValueLocationGrp() { return xdfgetLocationGrp(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_GRP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LocationGrp_Asc() { regOBA("LOCATION_GRP"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_GRP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LocationGrp_Desc() { regOBD("LOCATION_GRP"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryInstCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryInstCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryInstCQ bq = (TInventoryInstCQ)bqs;
        TInventoryInstCQ uq = (TInventoryInstCQ)uqs;
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryTInventoryH()) {
            uq.queryTInventoryH().reflectRelationOnUnionQuery(bq.queryTInventoryH(), uq.queryTInventoryH());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryMZone()) {
            uq.queryMZone().reflectRelationOnUnionQuery(bq.queryMZone(), uq.queryMZone());
        }
        if (bq.hasConditionQueryBClassDtlByStockExistOnlyFlg()) {
            uq.queryBClassDtlByStockExistOnlyFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockExistOnlyFlg(), uq.queryBClassDtlByStockExistOnlyFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("T_INVENTORY_INST", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

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
        String nrp = xresolveNRP("T_INVENTORY_INST", "tInventoryH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryH", nrp);
    }
    protected void xsetupOuterJoinTInventoryH() { xregOutJo("tInventoryH"); }
    public boolean hasConditionQueryTInventoryH() { return xhasQueRlMap("tInventoryH"); }

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
        String nrp = xresolveNRP("T_INVENTORY_INST", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_ZONE by my ZONE_ID, named 'MZone'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZoneCQ queryMZone() {
        return xdfgetConditionQueryMZone();
    }
    public MZoneCQ xdfgetConditionQueryMZone() {
        String prop = "mZone";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZone()); xsetupOuterJoinMZone(); }
        return xgetQueRlMap(prop);
    }
    protected MZoneCQ xcreateQueryMZone() {
        String nrp = xresolveNRP("T_INVENTORY_INST", "mZone"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZoneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZone", nrp);
    }
    protected void xsetupOuterJoinMZone() { xregOutJo("mZone"); }
    public boolean hasConditionQueryMZone() { return xhasQueRlMap("mZone"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockExistOnlyFlg() {
        return xdfgetConditionQueryBClassDtlByStockExistOnlyFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockExistOnlyFlg() {
        String prop = "bClassDtlByStockExistOnlyFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockExistOnlyFlg()); xsetupOuterJoinBClassDtlByStockExistOnlyFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockExistOnlyFlg() {
        String nrp = xresolveNRP("T_INVENTORY_INST", "bClassDtlByStockExistOnlyFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockExistOnlyFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockExistOnlyFlg() { xregOutJo("bClassDtlByStockExistOnlyFlg"); }
    public boolean hasConditionQueryBClassDtlByStockExistOnlyFlg() { return xhasQueRlMap("bClassDtlByStockExistOnlyFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryInstCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryInstCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryInstCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryInstCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryInstCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryInstCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryInstCQ> _myselfExistsMap;
    public Map<String, TInventoryInstCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryInstCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryInstCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryInstCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryInstCB.class.getName(); }
    protected String xCQ() { return TInventoryInstCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
