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
 * The base condition-query of T_TR_PICKLIST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrPicklistCQ extends AbstractBsTTrPicklistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrPicklistCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrPicklistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TR_PICKLIST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrPicklistCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrPicklistCIQ xcreateCIQ() {
        TTrPicklistCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrPicklistCIQ xnewCIQ() {
        return new TTrPicklistCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TR_PICKLIST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrPicklistCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrPicklistCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tTrPicklistId;
    public ConditionValue xdfgetTTrPicklistId()
    { if (_tTrPicklistId == null) { _tTrPicklistId = nCV(); }
      return _tTrPicklistId; }
    protected ConditionValue xgetCValueTTrPicklistId() { return xdfgetTTrPicklistId(); }

    public Map<String, TTrpicklistexpCQ> xdfgetTTrPicklistId_ExistsReferrer_TTrpicklistexpList() { return xgetSQueMap("tTrPicklistId_ExistsReferrer_TTrpicklistexpList"); }
    public String keepTTrPicklistId_ExistsReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq) { return xkeepSQue("tTrPicklistId_ExistsReferrer_TTrpicklistexpList", sq); }

    public Map<String, TTrpicklistexpCQ> xdfgetTTrPicklistId_NotExistsReferrer_TTrpicklistexpList() { return xgetSQueMap("tTrPicklistId_NotExistsReferrer_TTrpicklistexpList"); }
    public String keepTTrPicklistId_NotExistsReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq) { return xkeepSQue("tTrPicklistId_NotExistsReferrer_TTrpicklistexpList", sq); }

    public Map<String, TTrpicklistexpCQ> xdfgetTTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList() { return xgetSQueMap("tTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList"); }
    public String keepTTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq) { return xkeepSQue("tTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList", sq); }

    public Map<String, TTrpicklistexpCQ> xdfgetTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList() { return xgetSQueMap("tTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList"); }
    public String keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq) { return xkeepSQue("tTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList", sq); }
    public Map<String, Object> xdfgetTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpListParameter() { return xgetSQuePmMap("tTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList"); }
    public String keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpListParameter(Object pm) { return xkeepSQuePm("tTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList", pm); }

    /**
     * Add order-by as ascend. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_TTrPicklistId_Asc() { regOBA("T_TR_PICKLIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_TTrPicklistId_Desc() { regOBD("T_TR_PICKLIST_ID"); return this; }

    protected ConditionValue _trpickdetailId;
    public ConditionValue xdfgetTrpickdetailId()
    { if (_trpickdetailId == null) { _trpickdetailId = nCV(); }
      return _trpickdetailId; }
    protected ConditionValue xgetCValueTrpickdetailId() { return xdfgetTrpickdetailId(); }

    public Map<String, TTrpickdetailCQ> getTrpickdetailId_InScopeRelation_TTrpickdetail() { return xgetSQueMap("trpickdetailId_InScopeRelation_TTrpickdetail"); }
    public String keepTrpickdetailId_InScopeRelation_TTrpickdetail(TTrpickdetailCQ sq) { return xkeepSQue("trpickdetailId_InScopeRelation_TTrpickdetail", sq); }

    public Map<String, TTrpickdetailCQ> getTrpickdetailId_NotInScopeRelation_TTrpickdetail() { return xgetSQueMap("trpickdetailId_NotInScopeRelation_TTrpickdetail"); }
    public String keepTrpickdetailId_NotInScopeRelation_TTrpickdetail(TTrpickdetailCQ sq) { return xkeepSQue("trpickdetailId_NotInScopeRelation_TTrpickdetail", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_TrpickdetailId_Asc() { regOBA("TRPICKDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_TrpickdetailId_Desc() { regOBD("TRPICKDETAIL_ID"); return this; }

    protected ConditionValue _pickListKey;
    public ConditionValue xdfgetPickListKey()
    { if (_pickListKey == null) { _pickListKey = nCV(); }
      return _pickListKey; }
    protected ConditionValue xgetCValuePickListKey() { return xdfgetPickListKey(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PickListKey_Asc() { regOBA("PICK_LIST_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PickListKey_Desc() { regOBD("PICK_LIST_KEY"); return this; }

    protected ConditionValue _picklistGNo;
    public ConditionValue xdfgetPicklistGNo()
    { if (_picklistGNo == null) { _picklistGNo = nCV(); }
      return _picklistGNo; }
    protected ConditionValue xgetCValuePicklistGNo() { return xdfgetPicklistGNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PicklistGNo_Asc() { regOBA("PICKLIST_G_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PicklistGNo_Desc() { regOBD("PICKLIST_G_NO"); return this; }

    protected ConditionValue _plBatchKey;
    public ConditionValue xdfgetPlBatchKey()
    { if (_plBatchKey == null) { _plBatchKey = nCV(); }
      return _plBatchKey; }
    protected ConditionValue xgetCValuePlBatchKey() { return xdfgetPlBatchKey(); }

    /**
     * Add order-by as ascend. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PlBatchKey_Asc() { regOBA("PL_BATCH_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PlBatchKey_Desc() { regOBD("PL_BATCH_KEY"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _picklistDate;
    public ConditionValue xdfgetPicklistDate()
    { if (_picklistDate == null) { _picklistDate = nCV(); }
      return _picklistDate; }
    protected ConditionValue xgetCValuePicklistDate() { return xdfgetPicklistDate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PicklistDate_Asc() { regOBA("PICKLIST_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_PicklistDate_Desc() { regOBD("PICKLIST_DATE"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _manufactureDate;
    public ConditionValue xdfgetManufactureDate()
    { if (_manufactureDate == null) { _manufactureDate = nCV(); }
      return _manufactureDate; }
    protected ConditionValue xgetCValueManufactureDate() { return xdfgetManufactureDate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ManufactureDate_Asc() { regOBA("MANUFACTURE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ManufactureDate_Desc() { regOBD("MANUFACTURE_DATE"); return this; }

    protected ConditionValue _designFlg;
    public ConditionValue xdfgetDesignFlg()
    { if (_designFlg == null) { _designFlg = nCV(); }
      return _designFlg; }
    protected ConditionValue xgetCValueDesignFlg() { return xdfgetDesignFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DesignFlg_Asc() { regOBA("DESIGN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DesignFlg_Desc() { regOBD("DESIGN_FLG"); return this; }

    protected ConditionValue _monthFlg;
    public ConditionValue xdfgetMonthFlg()
    { if (_monthFlg == null) { _monthFlg = nCV(); }
      return _monthFlg; }
    protected ConditionValue xgetCValueMonthFlg() { return xdfgetMonthFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MONTH_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_MonthFlg_Asc() { regOBA("MONTH_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_MonthFlg_Desc() { regOBD("MONTH_FLG"); return this; }

    protected ConditionValue _dailyFlg;
    public ConditionValue xdfgetDailyFlg()
    { if (_dailyFlg == null) { _dailyFlg = nCV(); }
      return _dailyFlg; }
    protected ConditionValue xgetCValueDailyFlg() { return xdfgetDailyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DAILY_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DailyFlg_Asc() { regOBA("DAILY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAILY_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DailyFlg_Desc() { regOBD("DAILY_FLG"); return this; }

    protected ConditionValue _frontRackFlg;
    public ConditionValue xdfgetFrontRackFlg()
    { if (_frontRackFlg == null) { _frontRackFlg = nCV(); }
      return _frontRackFlg; }
    protected ConditionValue xgetCValueFrontRackFlg() { return xdfgetFrontRackFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_FrontRackFlg_Asc() { regOBA("FRONT_RACK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_FrontRackFlg_Desc() { regOBD("FRONT_RACK_FLG"); return this; }

    protected ConditionValue _locFlg;
    public ConditionValue xdfgetLocFlg()
    { if (_locFlg == null) { _locFlg = nCV(); }
      return _locFlg; }
    protected ConditionValue xgetCValueLocFlg() { return xdfgetLocFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOC_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_LocFlg_Asc() { regOBA("LOC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_LocFlg_Desc() { regOBD("LOC_FLG"); return this; }

    protected ConditionValue _stdDifFlg;
    public ConditionValue xdfgetStdDifFlg()
    { if (_stdDifFlg == null) { _stdDifFlg = nCV(); }
      return _stdDifFlg; }
    protected ConditionValue xgetCValueStdDifFlg() { return xdfgetStdDifFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_StdDifFlg_Asc() { regOBA("STD_DIF_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_StdDifFlg_Desc() { regOBD("STD_DIF_FLG"); return this; }

    protected ConditionValue _orderType;
    public ConditionValue xdfgetOrderType()
    { if (_orderType == null) { _orderType = nCV(); }
      return _orderType; }
    protected ConditionValue xgetCValueOrderType() { return xdfgetOrderType(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_OrderType_Asc() { regOBA("ORDER_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_OrderType_Desc() { regOBD("ORDER_TYPE"); return this; }

    protected ConditionValue _shipTosub;
    public ConditionValue xdfgetShipTosub()
    { if (_shipTosub == null) { _shipTosub = nCV(); }
      return _shipTosub; }
    protected ConditionValue xgetCValueShipTosub() { return xdfgetShipTosub(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ShipTosub_Asc() { regOBA("SHIP_TOSUB"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ShipTosub_Desc() { regOBD("SHIP_TOSUB"); return this; }

    protected ConditionValue _rmaNo;
    public ConditionValue xdfgetRmaNo()
    { if (_rmaNo == null) { _rmaNo = nCV(); }
      return _rmaNo; }
    protected ConditionValue xgetCValueRmaNo() { return xdfgetRmaNo(); }

    /**
     * Add order-by as ascend. <br>
     * RMA_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_RmaNo_Asc() { regOBA("RMA_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMA_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_RmaNo_Desc() { regOBD("RMA_NO"); return this; }

    protected ConditionValue _sotedLocationId;
    public ConditionValue xdfgetSotedLocationId()
    { if (_sotedLocationId == null) { _sotedLocationId = nCV(); }
      return _sotedLocationId; }
    protected ConditionValue xgetCValueSotedLocationId() { return xdfgetSotedLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_SotedLocationId_Asc() { regOBA("SOTED_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_SotedLocationId_Desc() { regOBD("SOTED_LOCATION_ID"); return this; }

    protected ConditionValue _sotedLocationCd;
    public ConditionValue xdfgetSotedLocationCd()
    { if (_sotedLocationCd == null) { _sotedLocationCd = nCV(); }
      return _sotedLocationCd; }
    protected ConditionValue xgetCValueSotedLocationCd() { return xdfgetSotedLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_SotedLocationCd_Asc() { regOBA("SOTED_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_SotedLocationCd_Desc() { regOBD("SOTED_LOCATION_CD"); return this; }

    protected ConditionValue _allocLocationId;
    public ConditionValue xdfgetAllocLocationId()
    { if (_allocLocationId == null) { _allocLocationId = nCV(); }
      return _allocLocationId; }
    protected ConditionValue xgetCValueAllocLocationId() { return xdfgetAllocLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AllocLocationId_Asc() { regOBA("ALLOC_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AllocLocationId_Desc() { regOBD("ALLOC_LOCATION_ID"); return this; }

    protected ConditionValue _allocLocationCd;
    public ConditionValue xdfgetAllocLocationCd()
    { if (_allocLocationCd == null) { _allocLocationCd = nCV(); }
      return _allocLocationCd; }
    protected ConditionValue xgetCValueAllocLocationCd() { return xdfgetAllocLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AllocLocationCd_Asc() { regOBA("ALLOC_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AllocLocationCd_Desc() { regOBD("ALLOC_LOCATION_CD"); return this; }

    protected ConditionValue _rootOutSeq;
    public ConditionValue xdfgetRootOutSeq()
    { if (_rootOutSeq == null) { _rootOutSeq = nCV(); }
      return _rootOutSeq; }
    protected ConditionValue xgetCValueRootOutSeq() { return xdfgetRootOutSeq(); }

    /**
     * Add order-by as ascend. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_RootOutSeq_Asc() { regOBA("ROOT_OUT_SEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_RootOutSeq_Desc() { regOBD("ROOT_OUT_SEQ"); return this; }

    protected ConditionValue _directionComment;
    public ConditionValue xdfgetDirectionComment()
    { if (_directionComment == null) { _directionComment = nCV(); }
      return _directionComment; }
    protected ConditionValue xgetCValueDirectionComment() { return xdfgetDirectionComment(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DirectionComment_Asc() { regOBA("DIRECTION_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DirectionComment_Desc() { regOBD("DIRECTION_COMMENT"); return this; }

    protected ConditionValue _qtyCase;
    public ConditionValue xdfgetQtyCase()
    { if (_qtyCase == null) { _qtyCase = nCV(); }
      return _qtyCase; }
    protected ConditionValue xgetCValueQtyCase() { return xdfgetQtyCase(); }

    /**
     * Add order-by as ascend. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_QtyCase_Asc() { regOBA("QTY_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_QtyCase_Desc() { regOBD("QTY_CASE"); return this; }

    protected ConditionValue _qtyBowl;
    public ConditionValue xdfgetQtyBowl()
    { if (_qtyBowl == null) { _qtyBowl = nCV(); }
      return _qtyBowl; }
    protected ConditionValue xgetCValueQtyBowl() { return xdfgetQtyBowl(); }

    /**
     * Add order-by as ascend. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_QtyBowl_Asc() { regOBA("QTY_BOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_QtyBowl_Desc() { regOBD("QTY_BOWL"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _htQtyCase;
    public ConditionValue xdfgetHtQtyCase()
    { if (_htQtyCase == null) { _htQtyCase = nCV(); }
      return _htQtyCase; }
    protected ConditionValue xgetCValueHtQtyCase() { return xdfgetHtQtyCase(); }

    /**
     * Add order-by as ascend. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_HtQtyCase_Asc() { regOBA("HT_QTY_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_HtQtyCase_Desc() { regOBD("HT_QTY_CASE"); return this; }

    protected ConditionValue _htQtyBowl;
    public ConditionValue xdfgetHtQtyBowl()
    { if (_htQtyBowl == null) { _htQtyBowl = nCV(); }
      return _htQtyBowl; }
    protected ConditionValue xgetCValueHtQtyBowl() { return xdfgetHtQtyBowl(); }

    /**
     * Add order-by as ascend. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_HtQtyBowl_Asc() { regOBA("HT_QTY_BOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_HtQtyBowl_Desc() { regOBD("HT_QTY_BOWL"); return this; }

    protected ConditionValue _htQty;
    public ConditionValue xdfgetHtQty()
    { if (_htQty == null) { _htQty = nCV(); }
      return _htQty; }
    protected ConditionValue xgetCValueHtQty() { return xdfgetHtQty(); }

    /**
     * Add order-by as ascend. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_HtQty_Asc() { regOBA("HT_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_HtQty_Desc() { regOBD("HT_QTY"); return this; }

    protected ConditionValue _completeSts;
    public ConditionValue xdfgetCompleteSts()
    { if (_completeSts == null) { _completeSts = nCV(); }
      return _completeSts; }
    protected ConditionValue xgetCValueCompleteSts() { return xdfgetCompleteSts(); }

    /**
     * Add order-by as ascend. <br>
     * COMPLETE_STS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_CompleteSts_Asc() { regOBA("COMPLETE_STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPLETE_STS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_CompleteSts_Desc() { regOBD("COMPLETE_STS"); return this; }

    protected ConditionValue _startTime;
    public ConditionValue xdfgetStartTime()
    { if (_startTime == null) { _startTime = nCV(); }
      return _startTime; }
    protected ConditionValue xgetCValueStartTime() { return xdfgetStartTime(); }

    /**
     * Add order-by as ascend. <br>
     * START_TIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_StartTime_Asc() { regOBA("START_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * START_TIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_StartTime_Desc() { regOBD("START_TIME"); return this; }

    protected ConditionValue _endTime;
    public ConditionValue xdfgetEndTime()
    { if (_endTime == null) { _endTime = nCV(); }
      return _endTime; }
    protected ConditionValue xgetCValueEndTime() { return xdfgetEndTime(); }

    /**
     * Add order-by as ascend. <br>
     * END_TIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_EndTime_Asc() { regOBA("END_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * END_TIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_EndTime_Desc() { regOBD("END_TIME"); return this; }

    protected ConditionValue _userCd;
    public ConditionValue xdfgetUserCd()
    { if (_userCd == null) { _userCd = nCV(); }
      return _userCd; }
    protected ConditionValue xgetCValueUserCd() { return xdfgetUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_UserCd_Asc() { regOBA("USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_UserCd_Desc() { regOBD("USER_CD"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

    protected ConditionValue _caseOutNumber;
    public ConditionValue xdfgetCaseOutNumber()
    { if (_caseOutNumber == null) { _caseOutNumber = nCV(); }
      return _caseOutNumber; }
    protected ConditionValue xgetCValueCaseOutNumber() { return xdfgetCaseOutNumber(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_CaseOutNumber_Asc() { regOBA("CASE_OUT_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_CaseOutNumber_Desc() { regOBD("CASE_OUT_NUMBER"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _sortingRackNo;
    public ConditionValue xdfgetSortingRackNo()
    { if (_sortingRackNo == null) { _sortingRackNo = nCV(); }
      return _sortingRackNo; }
    protected ConditionValue xgetCValueSortingRackNo() { return xdfgetSortingRackNo(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_SortingRackNo_Asc() { regOBA("SORTING_RACK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_SortingRackNo_Desc() { regOBD("SORTING_RACK_NO"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrPicklistCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrPicklistCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrPicklistCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrPicklistCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrPicklistCQ bq = (TTrPicklistCQ)bqs;
        TTrPicklistCQ uq = (TTrPicklistCQ)uqs;
        if (bq.hasConditionQueryTTrpickdetail()) {
            uq.queryTTrpickdetail().reflectRelationOnUnionQuery(bq.queryTTrpickdetail(), uq.queryTTrpickdetail());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrpickdetailCQ queryTTrpickdetail() {
        return xdfgetConditionQueryTTrpickdetail();
    }
    public TTrpickdetailCQ xdfgetConditionQueryTTrpickdetail() {
        String prop = "tTrpickdetail";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrpickdetail()); xsetupOuterJoinTTrpickdetail(); }
        return xgetQueRlMap(prop);
    }
    protected TTrpickdetailCQ xcreateQueryTTrpickdetail() {
        String nrp = xresolveNRP("T_TR_PICKLIST", "tTrpickdetail"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrpickdetailCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrpickdetail", nrp);
    }
    protected void xsetupOuterJoinTTrpickdetail() { xregOutJo("tTrpickdetail"); }
    public boolean hasConditionQueryTTrpickdetail() { return xhasQueRlMap("tTrpickdetail"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrPicklistCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrPicklistCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrPicklistCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrPicklistCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrPicklistCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrPicklistCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrPicklistCQ> _myselfExistsMap;
    public Map<String, TTrPicklistCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrPicklistCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrPicklistCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrPicklistCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrPicklistCB.class.getName(); }
    protected String xCQ() { return TTrPicklistCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
