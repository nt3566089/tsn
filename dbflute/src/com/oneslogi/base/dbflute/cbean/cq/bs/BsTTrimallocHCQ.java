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
 * The base condition-query of T_TRIMALLOC_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrimallocHCQ extends AbstractBsTTrimallocHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrimallocHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrimallocHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRIMALLOC_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrimallocHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrimallocHCIQ xcreateCIQ() {
        TTrimallocHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrimallocHCIQ xnewCIQ() {
        return new TTrimallocHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRIMALLOC_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrimallocHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrimallocHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trimallocHId;
    public ConditionValue xdfgetTrimallocHId()
    { if (_trimallocHId == null) { _trimallocHId = nCV(); }
      return _trimallocHId; }
    protected ConditionValue xgetCValueTrimallocHId() { return xdfgetTrimallocHId(); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrimallocHId_ExistsReferrer_TTrimallocschkriList() { return xgetSQueMap("trimallocHId_ExistsReferrer_TTrimallocschkriList"); }
    public String keepTrimallocHId_ExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trimallocHId_ExistsReferrer_TTrimallocschkriList", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrimallocHId_NotExistsReferrer_TTrimallocschkriList() { return xgetSQueMap("trimallocHId_NotExistsReferrer_TTrimallocschkriList"); }
    public String keepTrimallocHId_NotExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trimallocHId_NotExistsReferrer_TTrimallocschkriList", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList() { return xgetSQueMap("trimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList"); }
    public String keepTrimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList", sq); }

    public Map<String, TTrimallocschkriCQ> xdfgetTrimallocHId_QueryDerivedReferrer_TTrimallocschkriList() { return xgetSQueMap("trimallocHId_QueryDerivedReferrer_TTrimallocschkriList"); }
    public String keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq) { return xkeepSQue("trimallocHId_QueryDerivedReferrer_TTrimallocschkriList", sq); }
    public Map<String, Object> xdfgetTrimallocHId_QueryDerivedReferrer_TTrimallocschkriListParameter() { return xgetSQuePmMap("trimallocHId_QueryDerivedReferrer_TTrimallocschkriList"); }
    public String keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriListParameter(Object pm) { return xkeepSQuePm("trimallocHId_QueryDerivedReferrer_TTrimallocschkriList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_TrimallocHId_Asc() { regOBA("TRIMALLOC_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_TrimallocHId_Desc() { regOBD("TRIMALLOC_H_ID"); return this; }

    protected ConditionValue _allocImpKey;
    public ConditionValue xdfgetAllocImpKey()
    { if (_allocImpKey == null) { _allocImpKey = nCV(); }
      return _allocImpKey; }
    protected ConditionValue xgetCValueAllocImpKey() { return xdfgetAllocImpKey(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AllocImpKey_Asc() { regOBA("ALLOC_IMP_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AllocImpKey_Desc() { regOBD("ALLOC_IMP_KEY"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _shipschDate;
    public ConditionValue xdfgetShipschDate()
    { if (_shipschDate == null) { _shipschDate = nCV(); }
      return _shipschDate; }
    protected ConditionValue xgetCValueShipschDate() { return xdfgetShipschDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_ShipschDate_Asc() { regOBA("SHIPSCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_ShipschDate_Desc() { regOBD("SHIPSCH_DATE"); return this; }

    protected ConditionValue _pickBatchKey;
    public ConditionValue xdfgetPickBatchKey()
    { if (_pickBatchKey == null) { _pickBatchKey = nCV(); }
      return _pickBatchKey; }
    protected ConditionValue xgetCValuePickBatchKey() { return xdfgetPickBatchKey(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_PickBatchKey_Asc() { regOBA("PICK_BATCH_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_PickBatchKey_Desc() { regOBD("PICK_BATCH_KEY"); return this; }

    protected ConditionValue _restockFlg;
    public ConditionValue xdfgetRestockFlg()
    { if (_restockFlg == null) { _restockFlg = nCV(); }
      return _restockFlg; }
    protected ConditionValue xgetCValueRestockFlg() { return xdfgetRestockFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_RestockFlg_Asc() { regOBA("RESTOCK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_RestockFlg_Desc() { regOBD("RESTOCK_FLG"); return this; }

    protected ConditionValue _priorities;
    public ConditionValue xdfgetPriorities()
    { if (_priorities == null) { _priorities = nCV(); }
      return _priorities; }
    protected ConditionValue xgetCValuePriorities() { return xdfgetPriorities(); }

    /**
     * Add order-by as ascend. <br>
     * PRIORITIES: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_Priorities_Asc() { regOBA("PRIORITIES"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRIORITIES: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_Priorities_Desc() { regOBD("PRIORITIES"); return this; }

    protected ConditionValue _pickadjustSts;
    public ConditionValue xdfgetPickadjustSts()
    { if (_pickadjustSts == null) { _pickadjustSts = nCV(); }
      return _pickadjustSts; }
    protected ConditionValue xgetCValuePickadjustSts() { return xdfgetPickadjustSts(); }

    /**
     * Add order-by as ascend. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_PickadjustSts_Asc() { regOBA("PICKADJUST_STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_PickadjustSts_Desc() { regOBD("PICKADJUST_STS"); return this; }

    protected ConditionValue _alcimrsnFlg;
    public ConditionValue xdfgetAlcimrsnFlg()
    { if (_alcimrsnFlg == null) { _alcimrsnFlg = nCV(); }
      return _alcimrsnFlg; }
    protected ConditionValue xgetCValueAlcimrsnFlg() { return xdfgetAlcimrsnFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AlcimrsnFlg_Asc() { regOBA("ALCIMRSN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AlcimrsnFlg_Desc() { regOBD("ALCIMRSN_FLG"); return this; }

    protected ConditionValue _qtyAdjustFlg;
    public ConditionValue xdfgetQtyAdjustFlg()
    { if (_qtyAdjustFlg == null) { _qtyAdjustFlg = nCV(); }
      return _qtyAdjustFlg; }
    protected ConditionValue xgetCValueQtyAdjustFlg() { return xdfgetQtyAdjustFlg(); }

    /**
     * Add order-by as ascend. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_QtyAdjustFlg_Asc() { regOBA("QTY_ADJUST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_QtyAdjustFlg_Desc() { regOBD("QTY_ADJUST_FLG"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _rcvStkexaDate;
    public ConditionValue xdfgetRcvStkexaDate()
    { if (_rcvStkexaDate == null) { _rcvStkexaDate = nCV(); }
      return _rcvStkexaDate; }
    protected ConditionValue xgetCValueRcvStkexaDate() { return xdfgetRcvStkexaDate(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_RcvStkexaDate_Asc() { regOBA("RCV_STKEXA_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_RcvStkexaDate_Desc() { regOBD("RCV_STKEXA_DATE"); return this; }

    protected ConditionValue _stockShortageQty;
    public ConditionValue xdfgetStockShortageQty()
    { if (_stockShortageQty == null) { _stockShortageQty = nCV(); }
      return _stockShortageQty; }
    protected ConditionValue xgetCValueStockShortageQty() { return xdfgetStockShortageQty(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_StockShortageQty_Asc() { regOBA("STOCK_SHORTAGE_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_StockShortageQty_Desc() { regOBD("STOCK_SHORTAGE_QTY"); return this; }

    protected ConditionValue _stockSumQty;
    public ConditionValue xdfgetStockSumQty()
    { if (_stockSumQty == null) { _stockSumQty = nCV(); }
      return _stockSumQty; }
    protected ConditionValue xgetCValueStockSumQty() { return xdfgetStockSumQty(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_StockSumQty_Asc() { regOBA("STOCK_SUM_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_StockSumQty_Desc() { regOBD("STOCK_SUM_QTY"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrimallocHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrimallocHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrimallocHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrimallocHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrimallocHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrimallocHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrimallocHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrimallocHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrimallocHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrimallocHCQ> _myselfExistsMap;
    public Map<String, TTrimallocHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrimallocHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrimallocHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrimallocHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrimallocHCB.class.getName(); }
    protected String xCQ() { return TTrimallocHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
