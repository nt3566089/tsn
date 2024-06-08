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
 * The base condition-query of T_STOCK_REPORT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStockReportCQ extends AbstractBsTStockReportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStockReportCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_STOCK_REPORT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStockReportCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStockReportCIQ xcreateCIQ() {
        TStockReportCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStockReportCIQ xnewCIQ() {
        return new TStockReportCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_STOCK_REPORT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStockReportCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStockReportCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
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
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _storeNumDay;
    public ConditionValue xdfgetStoreNumDay()
    { if (_storeNumDay == null) { _storeNumDay = nCV(); }
      return _storeNumDay; }
    protected ConditionValue xgetCValueStoreNumDay() { return xdfgetStoreNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_StoreNumDay_Asc() { regOBA("STORE_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_StoreNumDay_Desc() { regOBD("STORE_NUM_DAY"); return this; }

    protected ConditionValue _pickingNumDay;
    public ConditionValue xdfgetPickingNumDay()
    { if (_pickingNumDay == null) { _pickingNumDay = nCV(); }
      return _pickingNumDay; }
    protected ConditionValue xgetCValuePickingNumDay() { return xdfgetPickingNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PickingNumDay_Asc() { regOBA("PICKING_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PickingNumDay_Desc() { regOBD("PICKING_NUM_DAY"); return this; }

    protected ConditionValue _movePlsNumDay;
    public ConditionValue xdfgetMovePlsNumDay()
    { if (_movePlsNumDay == null) { _movePlsNumDay = nCV(); }
      return _movePlsNumDay; }
    protected ConditionValue xgetCValueMovePlsNumDay() { return xdfgetMovePlsNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MovePlsNumDay_Asc() { regOBA("MOVE_PLS_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MovePlsNumDay_Desc() { regOBD("MOVE_PLS_NUM_DAY"); return this; }

    protected ConditionValue _moveMnsNumDay;
    public ConditionValue xdfgetMoveMnsNumDay()
    { if (_moveMnsNumDay == null) { _moveMnsNumDay = nCV(); }
      return _moveMnsNumDay; }
    protected ConditionValue xgetCValueMoveMnsNumDay() { return xdfgetMoveMnsNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveMnsNumDay_Asc() { regOBA("MOVE_MNS_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveMnsNumDay_Desc() { regOBD("MOVE_MNS_NUM_DAY"); return this; }

    protected ConditionValue _adjPlsNumDay;
    public ConditionValue xdfgetAdjPlsNumDay()
    { if (_adjPlsNumDay == null) { _adjPlsNumDay = nCV(); }
      return _adjPlsNumDay; }
    protected ConditionValue xgetCValueAdjPlsNumDay() { return xdfgetAdjPlsNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjPlsNumDay_Asc() { regOBA("ADJ_PLS_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjPlsNumDay_Desc() { regOBD("ADJ_PLS_NUM_DAY"); return this; }

    protected ConditionValue _adjMnsNumDay;
    public ConditionValue xdfgetAdjMnsNumDay()
    { if (_adjMnsNumDay == null) { _adjMnsNumDay = nCV(); }
      return _adjMnsNumDay; }
    protected ConditionValue xgetCValueAdjMnsNumDay() { return xdfgetAdjMnsNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjMnsNumDay_Asc() { regOBA("ADJ_MNS_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjMnsNumDay_Desc() { regOBD("ADJ_MNS_NUM_DAY"); return this; }

    protected ConditionValue _pChargeNumDay;
    public ConditionValue xdfgetPChargeNumDay()
    { if (_pChargeNumDay == null) { _pChargeNumDay = nCV(); }
      return _pChargeNumDay; }
    protected ConditionValue xgetCValuePChargeNumDay() { return xdfgetPChargeNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PChargeNumDay_Asc() { regOBA("P_CHARGE_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PChargeNumDay_Desc() { regOBD("P_CHARGE_NUM_DAY"); return this; }

    protected ConditionValue _pAllocNumDay;
    public ConditionValue xdfgetPAllocNumDay()
    { if (_pAllocNumDay == null) { _pAllocNumDay = nCV(); }
      return _pAllocNumDay; }
    protected ConditionValue xgetCValuePAllocNumDay() { return xdfgetPAllocNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PAllocNumDay_Asc() { regOBA("P_ALLOC_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PAllocNumDay_Desc() { regOBD("P_ALLOC_NUM_DAY"); return this; }

    protected ConditionValue _pMoveNumDay;
    public ConditionValue xdfgetPMoveNumDay()
    { if (_pMoveNumDay == null) { _pMoveNumDay = nCV(); }
      return _pMoveNumDay; }
    protected ConditionValue xgetCValuePMoveNumDay() { return xdfgetPMoveNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PMoveNumDay_Asc() { regOBA("P_MOVE_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PMoveNumDay_Desc() { regOBD("P_MOVE_NUM_DAY"); return this; }

    protected ConditionValue _pTransitNumDay;
    public ConditionValue xdfgetPTransitNumDay()
    { if (_pTransitNumDay == null) { _pTransitNumDay = nCV(); }
      return _pTransitNumDay; }
    protected ConditionValue xgetCValuePTransitNumDay() { return xdfgetPTransitNumDay(); }

    /**
     * Add order-by as ascend. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PTransitNumDay_Asc() { regOBA("P_TRANSIT_NUM_DAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PTransitNumDay_Desc() { regOBD("P_TRANSIT_NUM_DAY"); return this; }

    protected ConditionValue _storeNumMonth;
    public ConditionValue xdfgetStoreNumMonth()
    { if (_storeNumMonth == null) { _storeNumMonth = nCV(); }
      return _storeNumMonth; }
    protected ConditionValue xgetCValueStoreNumMonth() { return xdfgetStoreNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_StoreNumMonth_Asc() { regOBA("STORE_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_StoreNumMonth_Desc() { regOBD("STORE_NUM_MONTH"); return this; }

    protected ConditionValue _pickingNumMonth;
    public ConditionValue xdfgetPickingNumMonth()
    { if (_pickingNumMonth == null) { _pickingNumMonth = nCV(); }
      return _pickingNumMonth; }
    protected ConditionValue xgetCValuePickingNumMonth() { return xdfgetPickingNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PickingNumMonth_Asc() { regOBA("PICKING_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PickingNumMonth_Desc() { regOBD("PICKING_NUM_MONTH"); return this; }

    protected ConditionValue _movePlsNumMonth;
    public ConditionValue xdfgetMovePlsNumMonth()
    { if (_movePlsNumMonth == null) { _movePlsNumMonth = nCV(); }
      return _movePlsNumMonth; }
    protected ConditionValue xgetCValueMovePlsNumMonth() { return xdfgetMovePlsNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MovePlsNumMonth_Asc() { regOBA("MOVE_PLS_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MovePlsNumMonth_Desc() { regOBD("MOVE_PLS_NUM_MONTH"); return this; }

    protected ConditionValue _moveMnsNumMonth;
    public ConditionValue xdfgetMoveMnsNumMonth()
    { if (_moveMnsNumMonth == null) { _moveMnsNumMonth = nCV(); }
      return _moveMnsNumMonth; }
    protected ConditionValue xgetCValueMoveMnsNumMonth() { return xdfgetMoveMnsNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveMnsNumMonth_Asc() { regOBA("MOVE_MNS_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveMnsNumMonth_Desc() { regOBD("MOVE_MNS_NUM_MONTH"); return this; }

    protected ConditionValue _adjPlsNumMonth;
    public ConditionValue xdfgetAdjPlsNumMonth()
    { if (_adjPlsNumMonth == null) { _adjPlsNumMonth = nCV(); }
      return _adjPlsNumMonth; }
    protected ConditionValue xgetCValueAdjPlsNumMonth() { return xdfgetAdjPlsNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjPlsNumMonth_Asc() { regOBA("ADJ_PLS_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjPlsNumMonth_Desc() { regOBD("ADJ_PLS_NUM_MONTH"); return this; }

    protected ConditionValue _adjMnsNumMonth;
    public ConditionValue xdfgetAdjMnsNumMonth()
    { if (_adjMnsNumMonth == null) { _adjMnsNumMonth = nCV(); }
      return _adjMnsNumMonth; }
    protected ConditionValue xgetCValueAdjMnsNumMonth() { return xdfgetAdjMnsNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjMnsNumMonth_Asc() { regOBA("ADJ_MNS_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AdjMnsNumMonth_Desc() { regOBD("ADJ_MNS_NUM_MONTH"); return this; }

    protected ConditionValue _pChargeNumMonth;
    public ConditionValue xdfgetPChargeNumMonth()
    { if (_pChargeNumMonth == null) { _pChargeNumMonth = nCV(); }
      return _pChargeNumMonth; }
    protected ConditionValue xgetCValuePChargeNumMonth() { return xdfgetPChargeNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PChargeNumMonth_Asc() { regOBA("P_CHARGE_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PChargeNumMonth_Desc() { regOBD("P_CHARGE_NUM_MONTH"); return this; }

    protected ConditionValue _pAllocNumMonth;
    public ConditionValue xdfgetPAllocNumMonth()
    { if (_pAllocNumMonth == null) { _pAllocNumMonth = nCV(); }
      return _pAllocNumMonth; }
    protected ConditionValue xgetCValuePAllocNumMonth() { return xdfgetPAllocNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PAllocNumMonth_Asc() { regOBA("P_ALLOC_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PAllocNumMonth_Desc() { regOBD("P_ALLOC_NUM_MONTH"); return this; }

    protected ConditionValue _pMoveNumMonth;
    public ConditionValue xdfgetPMoveNumMonth()
    { if (_pMoveNumMonth == null) { _pMoveNumMonth = nCV(); }
      return _pMoveNumMonth; }
    protected ConditionValue xgetCValuePMoveNumMonth() { return xdfgetPMoveNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PMoveNumMonth_Asc() { regOBA("P_MOVE_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PMoveNumMonth_Desc() { regOBD("P_MOVE_NUM_MONTH"); return this; }

    protected ConditionValue _pTransitNumMonth;
    public ConditionValue xdfgetPTransitNumMonth()
    { if (_pTransitNumMonth == null) { _pTransitNumMonth = nCV(); }
      return _pTransitNumMonth; }
    protected ConditionValue xgetCValuePTransitNumMonth() { return xdfgetPTransitNumMonth(); }

    /**
     * Add order-by as ascend. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PTransitNumMonth_Asc() { regOBA("P_TRANSIT_NUM_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_PTransitNumMonth_Desc() { regOBD("P_TRANSIT_NUM_MONTH"); return this; }

    protected ConditionValue _chargeNum10;
    public ConditionValue xdfgetChargeNum10()
    { if (_chargeNum10 == null) { _chargeNum10 = nCV(); }
      return _chargeNum10; }
    protected ConditionValue xgetCValueChargeNum10() { return xdfgetChargeNum10(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNum10_Asc() { regOBA("CHARGE_NUM_10"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNum10_Desc() { regOBD("CHARGE_NUM_10"); return this; }

    protected ConditionValue _allocNum10;
    public ConditionValue xdfgetAllocNum10()
    { if (_allocNum10 == null) { _allocNum10 = nCV(); }
      return _allocNum10; }
    protected ConditionValue xgetCValueAllocNum10() { return xdfgetAllocNum10(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNum10_Asc() { regOBA("ALLOC_NUM_10"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNum10_Desc() { regOBD("ALLOC_NUM_10"); return this; }

    protected ConditionValue _moveNum10;
    public ConditionValue xdfgetMoveNum10()
    { if (_moveNum10 == null) { _moveNum10 = nCV(); }
      return _moveNum10; }
    protected ConditionValue xgetCValueMoveNum10() { return xdfgetMoveNum10(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNum10_Asc() { regOBA("MOVE_NUM_10"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNum10_Desc() { regOBD("MOVE_NUM_10"); return this; }

    protected ConditionValue _transitNum10;
    public ConditionValue xdfgetTransitNum10()
    { if (_transitNum10 == null) { _transitNum10 = nCV(); }
      return _transitNum10; }
    protected ConditionValue xgetCValueTransitNum10() { return xdfgetTransitNum10(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNum10_Asc() { regOBA("TRANSIT_NUM_10"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNum10_Desc() { regOBD("TRANSIT_NUM_10"); return this; }

    protected ConditionValue _chargeNum15;
    public ConditionValue xdfgetChargeNum15()
    { if (_chargeNum15 == null) { _chargeNum15 = nCV(); }
      return _chargeNum15; }
    protected ConditionValue xgetCValueChargeNum15() { return xdfgetChargeNum15(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNum15_Asc() { regOBA("CHARGE_NUM_15"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNum15_Desc() { regOBD("CHARGE_NUM_15"); return this; }

    protected ConditionValue _allocNum15;
    public ConditionValue xdfgetAllocNum15()
    { if (_allocNum15 == null) { _allocNum15 = nCV(); }
      return _allocNum15; }
    protected ConditionValue xgetCValueAllocNum15() { return xdfgetAllocNum15(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNum15_Asc() { regOBA("ALLOC_NUM_15"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNum15_Desc() { regOBD("ALLOC_NUM_15"); return this; }

    protected ConditionValue _moveNum15;
    public ConditionValue xdfgetMoveNum15()
    { if (_moveNum15 == null) { _moveNum15 = nCV(); }
      return _moveNum15; }
    protected ConditionValue xgetCValueMoveNum15() { return xdfgetMoveNum15(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNum15_Asc() { regOBA("MOVE_NUM_15"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNum15_Desc() { regOBD("MOVE_NUM_15"); return this; }

    protected ConditionValue _transitNum15;
    public ConditionValue xdfgetTransitNum15()
    { if (_transitNum15 == null) { _transitNum15 = nCV(); }
      return _transitNum15; }
    protected ConditionValue xgetCValueTransitNum15() { return xdfgetTransitNum15(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNum15_Asc() { regOBA("TRANSIT_NUM_15"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNum15_Desc() { regOBD("TRANSIT_NUM_15"); return this; }

    protected ConditionValue _chargeNum20;
    public ConditionValue xdfgetChargeNum20()
    { if (_chargeNum20 == null) { _chargeNum20 = nCV(); }
      return _chargeNum20; }
    protected ConditionValue xgetCValueChargeNum20() { return xdfgetChargeNum20(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNum20_Asc() { regOBA("CHARGE_NUM_20"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNum20_Desc() { regOBD("CHARGE_NUM_20"); return this; }

    protected ConditionValue _allocNum20;
    public ConditionValue xdfgetAllocNum20()
    { if (_allocNum20 == null) { _allocNum20 = nCV(); }
      return _allocNum20; }
    protected ConditionValue xgetCValueAllocNum20() { return xdfgetAllocNum20(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNum20_Asc() { regOBA("ALLOC_NUM_20"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNum20_Desc() { regOBD("ALLOC_NUM_20"); return this; }

    protected ConditionValue _moveNum20;
    public ConditionValue xdfgetMoveNum20()
    { if (_moveNum20 == null) { _moveNum20 = nCV(); }
      return _moveNum20; }
    protected ConditionValue xgetCValueMoveNum20() { return xdfgetMoveNum20(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNum20_Asc() { regOBA("MOVE_NUM_20"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNum20_Desc() { regOBD("MOVE_NUM_20"); return this; }

    protected ConditionValue _transitNum20;
    public ConditionValue xdfgetTransitNum20()
    { if (_transitNum20 == null) { _transitNum20 = nCV(); }
      return _transitNum20; }
    protected ConditionValue xgetCValueTransitNum20() { return xdfgetTransitNum20(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNum20_Asc() { regOBA("TRANSIT_NUM_20"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNum20_Desc() { regOBD("TRANSIT_NUM_20"); return this; }

    protected ConditionValue _chargeNumLast;
    public ConditionValue xdfgetChargeNumLast()
    { if (_chargeNumLast == null) { _chargeNumLast = nCV(); }
      return _chargeNumLast; }
    protected ConditionValue xgetCValueChargeNumLast() { return xdfgetChargeNumLast(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNumLast_Asc() { regOBA("CHARGE_NUM_LAST"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ChargeNumLast_Desc() { regOBD("CHARGE_NUM_LAST"); return this; }

    protected ConditionValue _allocNumLast;
    public ConditionValue xdfgetAllocNumLast()
    { if (_allocNumLast == null) { _allocNumLast = nCV(); }
      return _allocNumLast; }
    protected ConditionValue xgetCValueAllocNumLast() { return xdfgetAllocNumLast(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNumLast_Asc() { regOBA("ALLOC_NUM_LAST"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AllocNumLast_Desc() { regOBD("ALLOC_NUM_LAST"); return this; }

    protected ConditionValue _moveNumLast;
    public ConditionValue xdfgetMoveNumLast()
    { if (_moveNumLast == null) { _moveNumLast = nCV(); }
      return _moveNumLast; }
    protected ConditionValue xgetCValueMoveNumLast() { return xdfgetMoveNumLast(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNumLast_Asc() { regOBA("MOVE_NUM_LAST"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_MoveNumLast_Desc() { regOBD("MOVE_NUM_LAST"); return this; }

    protected ConditionValue _transitNumLast;
    public ConditionValue xdfgetTransitNumLast()
    { if (_transitNumLast == null) { _transitNumLast = nCV(); }
      return _transitNumLast; }
    protected ConditionValue xgetCValueTransitNumLast() { return xdfgetTransitNumLast(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNumLast_Asc() { regOBA("TRANSIT_NUM_LAST"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_TransitNumLast_Desc() { regOBD("TRANSIT_NUM_LAST"); return this; }

    protected ConditionValue _lastStoreDt;
    public ConditionValue xdfgetLastStoreDt()
    { if (_lastStoreDt == null) { _lastStoreDt = nCV(); }
      return _lastStoreDt; }
    protected ConditionValue xgetCValueLastStoreDt() { return xdfgetLastStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_LastStoreDt_Asc() { regOBA("LAST_STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_STORE_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_LastStoreDt_Desc() { regOBD("LAST_STORE_DT"); return this; }

    protected ConditionValue _lastPickingDt;
    public ConditionValue xdfgetLastPickingDt()
    { if (_lastPickingDt == null) { _lastPickingDt = nCV(); }
      return _lastPickingDt; }
    protected ConditionValue xgetCValueLastPickingDt() { return xdfgetLastPickingDt(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_LastPickingDt_Asc() { regOBA("LAST_PICKING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_PICKING_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_LastPickingDt_Desc() { regOBD("LAST_PICKING_DT"); return this; }

    protected ConditionValue _lastreceivedate;
    public ConditionValue xdfgetLastreceivedate()
    { if (_lastreceivedate == null) { _lastreceivedate = nCV(); }
      return _lastreceivedate; }
    protected ConditionValue xgetCValueLastreceivedate() { return xdfgetLastreceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * LASTRECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_Lastreceivedate_Asc() { regOBA("LASTRECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LASTRECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_Lastreceivedate_Desc() { regOBD("LASTRECEIVEDATE"); return this; }

    protected ConditionValue _lastshipdate;
    public ConditionValue xdfgetLastshipdate()
    { if (_lastshipdate == null) { _lastshipdate = nCV(); }
      return _lastshipdate; }
    protected ConditionValue xgetCValueLastshipdate() { return xdfgetLastshipdate(); }

    /**
     * Add order-by as ascend. <br>
     * LASTSHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_Lastshipdate_Asc() { regOBA("LASTSHIPDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LASTSHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_Lastshipdate_Desc() { regOBD("LASTSHIPDATE"); return this; }

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
    public BsTStockReportCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStockReportCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStockReportCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStockReportCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStockReportCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStockReportCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStockReportCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStockReportCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStockReportCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStockReportCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStockReportCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStockReportCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStockReportCQ bq = (TStockReportCQ)bqs;
        TStockReportCQ uq = (TStockReportCQ)uqs;
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("T_STOCK_REPORT", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStockReportCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStockReportCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStockReportCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStockReportCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStockReportCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStockReportCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStockReportCQ> _myselfExistsMap;
    public Map<String, TStockReportCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStockReportCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStockReportCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStockReportCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStockReportCB.class.getName(); }
    protected String xCQ() { return TStockReportCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
