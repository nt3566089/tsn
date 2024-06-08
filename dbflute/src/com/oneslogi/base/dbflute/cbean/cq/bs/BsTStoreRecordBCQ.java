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
 * The base condition-query of T_STORE_RECORD_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStoreRecordBCQ extends AbstractBsTStoreRecordBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStoreRecordBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreRecordBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_STORE_RECORD_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStoreRecordBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStoreRecordBCIQ xcreateCIQ() {
        TStoreRecordBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStoreRecordBCIQ xnewCIQ() {
        return new TStoreRecordBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_STORE_RECORD_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStoreRecordBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStoreRecordBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _storeRecordBId;
    public ConditionValue xdfgetStoreRecordBId()
    { if (_storeRecordBId == null) { _storeRecordBId = nCV(); }
      return _storeRecordBId; }
    protected ConditionValue xgetCValueStoreRecordBId() { return xdfgetStoreRecordBId(); }

    public Map<String, TStockInoutCQ> xdfgetStoreRecordBId_ExistsReferrer_TStockInoutList() { return xgetSQueMap("storeRecordBId_ExistsReferrer_TStockInoutList"); }
    public String keepStoreRecordBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("storeRecordBId_ExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStoreRecordBId_NotExistsReferrer_TStockInoutList() { return xgetSQueMap("storeRecordBId_NotExistsReferrer_TStockInoutList"); }
    public String keepStoreRecordBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("storeRecordBId_NotExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStoreRecordBId_SpecifyDerivedReferrer_TStockInoutList() { return xgetSQueMap("storeRecordBId_SpecifyDerivedReferrer_TStockInoutList"); }
    public String keepStoreRecordBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("storeRecordBId_SpecifyDerivedReferrer_TStockInoutList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStoreRecordBId_QueryDerivedReferrer_TStockInoutList() { return xgetSQueMap("storeRecordBId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepStoreRecordBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("storeRecordBId_QueryDerivedReferrer_TStockInoutList", sq); }
    public Map<String, Object> xdfgetStoreRecordBId_QueryDerivedReferrer_TStockInoutListParameter() { return xgetSQuePmMap("storeRecordBId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepStoreRecordBId_QueryDerivedReferrer_TStockInoutListParameter(Object pm) { return xkeepSQuePm("storeRecordBId_QueryDerivedReferrer_TStockInoutList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreRecordBId_Asc() { regOBA("STORE_RECORD_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreRecordBId_Desc() { regOBD("STORE_RECORD_B_ID"); return this; }

    protected ConditionValue _storeRecordHId;
    public ConditionValue xdfgetStoreRecordHId()
    { if (_storeRecordHId == null) { _storeRecordHId = nCV(); }
      return _storeRecordHId; }
    protected ConditionValue xgetCValueStoreRecordHId() { return xdfgetStoreRecordHId(); }

    public Map<String, TStoreRecordHCQ> getStoreRecordHId_InScopeRelation_TStoreRecordH() { return xgetSQueMap("storeRecordHId_InScopeRelation_TStoreRecordH"); }
    public String keepStoreRecordHId_InScopeRelation_TStoreRecordH(TStoreRecordHCQ sq) { return xkeepSQue("storeRecordHId_InScopeRelation_TStoreRecordH", sq); }

    public Map<String, TStoreRecordHCQ> getStoreRecordHId_NotInScopeRelation_TStoreRecordH() { return xgetSQueMap("storeRecordHId_NotInScopeRelation_TStoreRecordH"); }
    public String keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(TStoreRecordHCQ sq) { return xkeepSQue("storeRecordHId_NotInScopeRelation_TStoreRecordH", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to T_STORE_RECORD_H}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreRecordHId_Asc() { regOBA("STORE_RECORD_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to T_STORE_RECORD_H}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreRecordHId_Desc() { regOBD("STORE_RECORD_H_ID"); return this; }

    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    public Map<String, TReceivePlanBCQ> getReceivePlanBId_InScopeRelation_TReceivePlanB() { return xgetSQueMap("receivePlanBId_InScopeRelation_TReceivePlanB"); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanBId_InScopeRelation_TReceivePlanB", sq); }

    public Map<String, TReceivePlanBCQ> getReceivePlanBId_NotInScopeRelation_TReceivePlanB() { return xgetSQueMap("receivePlanBId_NotInScopeRelation_TReceivePlanB"); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanBId_NotInScopeRelation_TReceivePlanB", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

    protected ConditionValue _processNo;
    public ConditionValue xdfgetProcessNo()
    { if (_processNo == null) { _processNo = nCV(); }
      return _processNo; }
    protected ConditionValue xgetCValueProcessNo() { return xdfgetProcessNo(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ProcessNo_Asc() { regOBA("PROCESS_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ProcessNo_Desc() { regOBD("PROCESS_NO"); return this; }

    protected ConditionValue _clientOrderNo;
    public ConditionValue xdfgetClientOrderNo()
    { if (_clientOrderNo == null) { _clientOrderNo = nCV(); }
      return _clientOrderNo; }
    protected ConditionValue xgetCValueClientOrderNo() { return xdfgetClientOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ORDER_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ClientOrderNo_Asc() { regOBA("CLIENT_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ORDER_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ClientOrderNo_Desc() { regOBD("CLIENT_ORDER_NO"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

    protected ConditionValue _storeNum;
    public ConditionValue xdfgetStoreNum()
    { if (_storeNum == null) { _storeNum = nCV(); }
      return _storeNum; }
    protected ConditionValue xgetCValueStoreNum() { return xdfgetStoreNum(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreNum_Asc() { regOBA("STORE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreNum_Desc() { regOBD("STORE_NUM"); return this; }

    protected ConditionValue _storeFlg;
    public ConditionValue xdfgetStoreFlg()
    { if (_storeFlg == null) { _storeFlg = nCV(); }
      return _storeFlg; }
    protected ConditionValue xgetCValueStoreFlg() { return xdfgetStoreFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreFlg_Asc() { regOBA("STORE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreFlg_Desc() { regOBD("STORE_FLG"); return this; }

    protected ConditionValue _storeLocationId;
    public ConditionValue xdfgetStoreLocationId()
    { if (_storeLocationId == null) { _storeLocationId = nCV(); }
      return _storeLocationId; }
    protected ConditionValue xgetCValueStoreLocationId() { return xdfgetStoreLocationId(); }

    public Map<String, MLocationCQ> getStoreLocationId_InScopeRelation_MLocation() { return xgetSQueMap("storeLocationId_InScopeRelation_MLocation"); }
    public String keepStoreLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("storeLocationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getStoreLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("storeLocationId_NotInScopeRelation_MLocation"); }
    public String keepStoreLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("storeLocationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreLocationId_Asc() { regOBA("STORE_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreLocationId_Desc() { regOBD("STORE_LOCATION_ID"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

    protected ConditionValue _htStoreInspectionDt;
    public ConditionValue xdfgetHtStoreInspectionDt()
    { if (_htStoreInspectionDt == null) { _htStoreInspectionDt = nCV(); }
      return _htStoreInspectionDt; }
    protected ConditionValue xgetCValueHtStoreInspectionDt() { return xdfgetHtStoreInspectionDt(); }

    /**
     * Add order-by as ascend. <br>
     * HT_STORE_INSPECTION_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_HtStoreInspectionDt_Asc() { regOBA("HT_STORE_INSPECTION_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_STORE_INSPECTION_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_HtStoreInspectionDt_Desc() { regOBD("HT_STORE_INSPECTION_DT"); return this; }

    protected ConditionValue _htStoreInspectionUserId;
    public ConditionValue xdfgetHtStoreInspectionUserId()
    { if (_htStoreInspectionUserId == null) { _htStoreInspectionUserId = nCV(); }
      return _htStoreInspectionUserId; }
    protected ConditionValue xgetCValueHtStoreInspectionUserId() { return xdfgetHtStoreInspectionUserId(); }

    /**
     * Add order-by as ascend. <br>
     * HT_STORE_INSPECTION_USER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_HtStoreInspectionUserId_Asc() { regOBA("HT_STORE_INSPECTION_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_STORE_INSPECTION_USER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_HtStoreInspectionUserId_Desc() { regOBD("HT_STORE_INSPECTION_USER_ID"); return this; }

    protected ConditionValue _storeRecordBComment;
    public ConditionValue xdfgetStoreRecordBComment()
    { if (_storeRecordBComment == null) { _storeRecordBComment = nCV(); }
      return _storeRecordBComment; }
    protected ConditionValue xgetCValueStoreRecordBComment() { return xdfgetStoreRecordBComment(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_B_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreRecordBComment_Asc() { regOBA("STORE_RECORD_B_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_B_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_StoreRecordBComment_Desc() { regOBD("STORE_RECORD_B_COMMENT"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStoreRecordBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStoreRecordBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStoreRecordBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStoreRecordBCQ bq = (TStoreRecordBCQ)bqs;
        TStoreRecordBCQ uq = (TStoreRecordBCQ)uqs;
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryTStoreRecordH()) {
            uq.queryTStoreRecordH().reflectRelationOnUnionQuery(bq.queryTStoreRecordH(), uq.queryTStoreRecordH());
        }
        if (bq.hasConditionQueryTReceivePlanB()) {
            uq.queryTReceivePlanB().reflectRelationOnUnionQuery(bq.queryTReceivePlanB(), uq.queryTReceivePlanB());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByStoreFlg()) {
            uq.queryBClassDtlByStoreFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStoreFlg(), uq.queryBClassDtlByStoreFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_LOCATION by my STORE_LOCATION_ID, named 'MLocation'.
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
        String nrp = xresolveNRP("T_STORE_RECORD_B", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreRecordHCQ queryTStoreRecordH() {
        return xdfgetConditionQueryTStoreRecordH();
    }
    public TStoreRecordHCQ xdfgetConditionQueryTStoreRecordH() {
        String prop = "tStoreRecordH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreRecordH()); xsetupOuterJoinTStoreRecordH(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreRecordHCQ xcreateQueryTStoreRecordH() {
        String nrp = xresolveNRP("T_STORE_RECORD_B", "tStoreRecordH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreRecordHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreRecordH", nrp);
    }
    protected void xsetupOuterJoinTStoreRecordH() { xregOutJo("tStoreRecordH"); }
    public boolean hasConditionQueryTStoreRecordH() { return xhasQueRlMap("tStoreRecordH"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_RECEIVE_PLAN_B by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanBCQ queryTReceivePlanB() {
        return xdfgetConditionQueryTReceivePlanB();
    }
    public TReceivePlanBCQ xdfgetConditionQueryTReceivePlanB() {
        String prop = "tReceivePlanB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanB()); xsetupOuterJoinTReceivePlanB(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanBCQ xcreateQueryTReceivePlanB() {
        String nrp = xresolveNRP("T_STORE_RECORD_B", "tReceivePlanB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanB", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanB() { xregOutJo("tReceivePlanB"); }
    public boolean hasConditionQueryTReceivePlanB() { return xhasQueRlMap("tReceivePlanB"); }

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
        String nrp = xresolveNRP("T_STORE_RECORD_B", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInputType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInputType() { xregOutJo("bClassDtlByInputType"); }
    public boolean hasConditionQueryBClassDtlByInputType() { return xhasQueRlMap("bClassDtlByInputType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStoreFlg() {
        return xdfgetConditionQueryBClassDtlByStoreFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStoreFlg() {
        String prop = "bClassDtlByStoreFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStoreFlg()); xsetupOuterJoinBClassDtlByStoreFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStoreFlg() {
        String nrp = xresolveNRP("T_STORE_RECORD_B", "bClassDtlByStoreFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStoreFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStoreFlg() { xregOutJo("bClassDtlByStoreFlg"); }
    public boolean hasConditionQueryBClassDtlByStoreFlg() { return xhasQueRlMap("bClassDtlByStoreFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStoreRecordBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStoreRecordBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStoreRecordBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStoreRecordBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStoreRecordBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStoreRecordBCQ> _myselfExistsMap;
    public Map<String, TStoreRecordBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStoreRecordBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStoreRecordBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStoreRecordBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStoreRecordBCB.class.getName(); }
    protected String xCQ() { return TStoreRecordBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
