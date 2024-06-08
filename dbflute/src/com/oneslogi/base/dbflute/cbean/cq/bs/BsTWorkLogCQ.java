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
 * The base condition-query of T_WORK_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsTWorkLogCQ extends AbstractBsTWorkLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TWorkLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTWorkLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_WORK_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TWorkLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TWorkLogCIQ xcreateCIQ() {
        TWorkLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TWorkLogCIQ xnewCIQ() {
        return new TWorkLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_WORK_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TWorkLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TWorkLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _workLogId;
    public ConditionValue xdfgetWorkLogId()
    { if (_workLogId == null) { _workLogId = nCV(); }
      return _workLogId; }
    protected ConditionValue xgetCValueWorkLogId() { return xdfgetWorkLogId(); }

    public Map<String, TWorkDataCQ> xdfgetWorkLogId_ExistsReferrer_TWorkDataList() { return xgetSQueMap("workLogId_ExistsReferrer_TWorkDataList"); }
    public String keepWorkLogId_ExistsReferrer_TWorkDataList(TWorkDataCQ sq) { return xkeepSQue("workLogId_ExistsReferrer_TWorkDataList", sq); }

    public Map<String, TWorkDataCQ> xdfgetWorkLogId_NotExistsReferrer_TWorkDataList() { return xgetSQueMap("workLogId_NotExistsReferrer_TWorkDataList"); }
    public String keepWorkLogId_NotExistsReferrer_TWorkDataList(TWorkDataCQ sq) { return xkeepSQue("workLogId_NotExistsReferrer_TWorkDataList", sq); }

    public Map<String, TWorkDataCQ> xdfgetWorkLogId_SpecifyDerivedReferrer_TWorkDataList() { return xgetSQueMap("workLogId_SpecifyDerivedReferrer_TWorkDataList"); }
    public String keepWorkLogId_SpecifyDerivedReferrer_TWorkDataList(TWorkDataCQ sq) { return xkeepSQue("workLogId_SpecifyDerivedReferrer_TWorkDataList", sq); }

    public Map<String, TWorkDataCQ> xdfgetWorkLogId_QueryDerivedReferrer_TWorkDataList() { return xgetSQueMap("workLogId_QueryDerivedReferrer_TWorkDataList"); }
    public String keepWorkLogId_QueryDerivedReferrer_TWorkDataList(TWorkDataCQ sq) { return xkeepSQue("workLogId_QueryDerivedReferrer_TWorkDataList", sq); }
    public Map<String, Object> xdfgetWorkLogId_QueryDerivedReferrer_TWorkDataListParameter() { return xgetSQuePmMap("workLogId_QueryDerivedReferrer_TWorkDataList"); }
    public String keepWorkLogId_QueryDerivedReferrer_TWorkDataListParameter(Object pm) { return xkeepSQuePm("workLogId_QueryDerivedReferrer_TWorkDataList", pm); }

    /**
     * Add order-by as ascend. <br>
     * WORK_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkLogId_Asc() { regOBA("WORK_LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkLogId_Desc() { regOBD("WORK_LOG_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

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
    public BsTWorkLogCQ addOrderBy_UserCd_Asc() { regOBA("USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_UserCd_Desc() { regOBD("USER_CD"); return this; }

    protected ConditionValue _workCd;
    public ConditionValue xdfgetWorkCd()
    { if (_workCd == null) { _workCd = nCV(); }
      return _workCd; }
    protected ConditionValue xgetCValueWorkCd() { return xdfgetWorkCd(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkCd_Asc() { regOBA("WORK_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkCd_Desc() { regOBD("WORK_CD"); return this; }

    protected ConditionValue _workDt;
    public ConditionValue xdfgetWorkDt()
    { if (_workDt == null) { _workDt = nCV(); }
      return _workDt; }
    protected ConditionValue xgetCValueWorkDt() { return xdfgetWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _workStartDt;
    public ConditionValue xdfgetWorkStartDt()
    { if (_workStartDt == null) { _workStartDt = nCV(); }
      return _workStartDt; }
    protected ConditionValue xgetCValueWorkStartDt() { return xdfgetWorkStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkStartDt_Asc() { regOBA("WORK_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_START_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkStartDt_Desc() { regOBD("WORK_START_DT"); return this; }

    protected ConditionValue _workEndDt;
    public ConditionValue xdfgetWorkEndDt()
    { if (_workEndDt == null) { _workEndDt = nCV(); }
      return _workEndDt; }
    protected ConditionValue xgetCValueWorkEndDt() { return xdfgetWorkEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkEndDt_Asc() { regOBA("WORK_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_END_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkEndDt_Desc() { regOBD("WORK_END_DT"); return this; }

    protected ConditionValue _workQty;
    public ConditionValue xdfgetWorkQty()
    { if (_workQty == null) { _workQty = nCV(); }
      return _workQty; }
    protected ConditionValue xgetCValueWorkQty() { return xdfgetWorkQty(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkQty_Asc() { regOBA("WORK_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkQty_Desc() { regOBD("WORK_QTY"); return this; }

    protected ConditionValue _traceItem;
    public ConditionValue xdfgetTraceItem()
    { if (_traceItem == null) { _traceItem = nCV(); }
      return _traceItem; }
    protected ConditionValue xgetCValueTraceItem() { return xdfgetTraceItem(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_ITEM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_TraceItem_Asc() { regOBA("TRACE_ITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_ITEM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_TraceItem_Desc() { regOBD("TRACE_ITEM"); return this; }

    protected ConditionValue _macAddress;
    public ConditionValue xdfgetMacAddress()
    { if (_macAddress == null) { _macAddress = nCV(); }
      return _macAddress; }
    protected ConditionValue xgetCValueMacAddress() { return xdfgetMacAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAC_ADDRESS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_MacAddress_Asc() { regOBA("MAC_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAC_ADDRESS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_MacAddress_Desc() { regOBD("MAC_ADDRESS"); return this; }

    protected ConditionValue _workStatus;
    public ConditionValue xdfgetWorkStatus()
    { if (_workStatus == null) { _workStatus = nCV(); }
      return _workStatus; }
    protected ConditionValue xgetCValueWorkStatus() { return xdfgetWorkStatus(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkStatus_Asc() { regOBA("WORK_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkStatus_Desc() { regOBD("WORK_STATUS"); return this; }

    protected ConditionValue _workLogOutFlg;
    public ConditionValue xdfgetWorkLogOutFlg()
    { if (_workLogOutFlg == null) { _workLogOutFlg = nCV(); }
      return _workLogOutFlg; }
    protected ConditionValue xgetCValueWorkLogOutFlg() { return xdfgetWorkLogOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkLogOutFlg_Asc() { regOBA("WORK_LOG_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkLogOutFlg_Desc() { regOBD("WORK_LOG_OUT_FLG"); return this; }

    protected ConditionValue _workLogOutDt;
    public ConditionValue xdfgetWorkLogOutDt()
    { if (_workLogOutDt == null) { _workLogOutDt = nCV(); }
      return _workLogOutDt; }
    protected ConditionValue xgetCValueWorkLogOutDt() { return xdfgetWorkLogOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_LOG_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkLogOutDt_Asc() { regOBA("WORK_LOG_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_LOG_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_WorkLogOutDt_Desc() { regOBD("WORK_LOG_OUT_DT"); return this; }

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
    public BsTWorkLogCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTWorkLogCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTWorkLogCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTWorkLogCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTWorkLogCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTWorkLogCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTWorkLogCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTWorkLogCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTWorkLogCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTWorkLogCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTWorkLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTWorkLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TWorkLogCQ bq = (TWorkLogCQ)bqs;
        TWorkLogCQ uq = (TWorkLogCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByWorkStatus()) {
            uq.queryBClassDtlByWorkStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByWorkStatus(), uq.queryBClassDtlByWorkStatus());
        }
        if (bq.hasConditionQueryBClassDtlByWorkLogOutFlg()) {
            uq.queryBClassDtlByWorkLogOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByWorkLogOutFlg(), uq.queryBClassDtlByWorkLogOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my WORK_STATUS, named 'BClassDtlByWorkStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByWorkStatus() {
        return xdfgetConditionQueryBClassDtlByWorkStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByWorkStatus() {
        String prop = "bClassDtlByWorkStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByWorkStatus()); xsetupOuterJoinBClassDtlByWorkStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByWorkStatus() {
        String nrp = xresolveNRP("T_WORK_LOG", "bClassDtlByWorkStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByWorkStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByWorkStatus() { xregOutJo("bClassDtlByWorkStatus"); }
    public boolean hasConditionQueryBClassDtlByWorkStatus() { return xhasQueRlMap("bClassDtlByWorkStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my WORK_LOG_OUT_FLG, named 'BClassDtlByWorkLogOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByWorkLogOutFlg() {
        return xdfgetConditionQueryBClassDtlByWorkLogOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByWorkLogOutFlg() {
        String prop = "bClassDtlByWorkLogOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByWorkLogOutFlg()); xsetupOuterJoinBClassDtlByWorkLogOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByWorkLogOutFlg() {
        String nrp = xresolveNRP("T_WORK_LOG", "bClassDtlByWorkLogOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByWorkLogOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByWorkLogOutFlg() { xregOutJo("bClassDtlByWorkLogOutFlg"); }
    public boolean hasConditionQueryBClassDtlByWorkLogOutFlg() { return xhasQueRlMap("bClassDtlByWorkLogOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TWorkLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TWorkLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TWorkLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TWorkLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TWorkLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TWorkLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TWorkLogCQ> _myselfExistsMap;
    public Map<String, TWorkLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TWorkLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TWorkLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TWorkLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TWorkLogCB.class.getName(); }
    protected String xCQ() { return TWorkLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
