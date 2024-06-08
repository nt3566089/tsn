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
 * The base condition-query of T_TRWORK.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrworkCQ extends AbstractBsTTrworkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrworkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrworkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRWORK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrworkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrworkCIQ xcreateCIQ() {
        TTrworkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrworkCIQ xnewCIQ() {
        return new TTrworkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRWORK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrworkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrworkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sequenceno;
    public ConditionValue xdfgetSequenceno()
    { if (_sequenceno == null) { _sequenceno = nCV(); }
      return _sequenceno; }
    protected ConditionValue xgetCValueSequenceno() { return xdfgetSequenceno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Sequenceno_Asc() { regOBA("SEQUENCENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Sequenceno_Desc() { regOBD("SEQUENCENO"); return this; }

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
    public BsTTrworkCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsTTrworkCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _usercd;
    public ConditionValue xdfgetUsercd()
    { if (_usercd == null) { _usercd = nCV(); }
      return _usercd; }
    protected ConditionValue xgetCValueUsercd() { return xdfgetUsercd(); }

    /**
     * Add order-by as ascend. <br>
     * USERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Usercd_Asc() { regOBA("USERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Usercd_Desc() { regOBD("USERCD"); return this; }

    protected ConditionValue _taskType;
    public ConditionValue xdfgetTaskType()
    { if (_taskType == null) { _taskType = nCV(); }
      return _taskType; }
    protected ConditionValue xgetCValueTaskType() { return xdfgetTaskType(); }

    /**
     * Add order-by as ascend. <br>
     * TASK_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_TaskType_Asc() { regOBA("TASK_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TASK_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_TaskType_Desc() { regOBD("TASK_TYPE"); return this; }

    protected ConditionValue _taskTypeDetail;
    public ConditionValue xdfgetTaskTypeDetail()
    { if (_taskTypeDetail == null) { _taskTypeDetail = nCV(); }
      return _taskTypeDetail; }
    protected ConditionValue xgetCValueTaskTypeDetail() { return xdfgetTaskTypeDetail(); }

    /**
     * Add order-by as ascend. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_TaskTypeDetail_Asc() { regOBA("TASK_TYPE_DETAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_TaskTypeDetail_Desc() { regOBD("TASK_TYPE_DETAIL"); return this; }

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
    public BsTTrworkCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _worktime;
    public ConditionValue xdfgetWorktime()
    { if (_worktime == null) { _worktime = nCV(); }
      return _worktime; }
    protected ConditionValue xgetCValueWorktime() { return xdfgetWorktime(); }

    /**
     * Add order-by as ascend. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Worktime_Asc() { regOBA("WORKTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Worktime_Desc() { regOBD("WORKTIME"); return this; }

    protected ConditionValue _startEnd;
    public ConditionValue xdfgetStartEnd()
    { if (_startEnd == null) { _startEnd = nCV(); }
      return _startEnd; }
    protected ConditionValue xgetCValueStartEnd() { return xdfgetStartEnd(); }

    /**
     * Add order-by as ascend. <br>
     * START_END: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_StartEnd_Asc() { regOBA("START_END"); return this; }

    /**
     * Add order-by as descend. <br>
     * START_END: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_StartEnd_Desc() { regOBD("START_END"); return this; }

    protected ConditionValue _workPalletQty;
    public ConditionValue xdfgetWorkPalletQty()
    { if (_workPalletQty == null) { _workPalletQty = nCV(); }
      return _workPalletQty; }
    protected ConditionValue xgetCValueWorkPalletQty() { return xdfgetWorkPalletQty(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkPalletQty_Asc() { regOBA("WORK_PALLET_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkPalletQty_Desc() { regOBD("WORK_PALLET_QTY"); return this; }

    protected ConditionValue _workCaseQty;
    public ConditionValue xdfgetWorkCaseQty()
    { if (_workCaseQty == null) { _workCaseQty = nCV(); }
      return _workCaseQty; }
    protected ConditionValue xgetCValueWorkCaseQty() { return xdfgetWorkCaseQty(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkCaseQty_Asc() { regOBA("WORK_CASE_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkCaseQty_Desc() { regOBD("WORK_CASE_QTY"); return this; }

    protected ConditionValue _workCartonQty;
    public ConditionValue xdfgetWorkCartonQty()
    { if (_workCartonQty == null) { _workCartonQty = nCV(); }
      return _workCartonQty; }
    protected ConditionValue xgetCValueWorkCartonQty() { return xdfgetWorkCartonQty(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkCartonQty_Asc() { regOBA("WORK_CARTON_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkCartonQty_Desc() { regOBD("WORK_CARTON_QTY"); return this; }

    protected ConditionValue _workQty;
    public ConditionValue xdfgetWorkQty()
    { if (_workQty == null) { _workQty = nCV(); }
      return _workQty; }
    protected ConditionValue xgetCValueWorkQty() { return xdfgetWorkQty(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkQty_Asc() { regOBA("WORK_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_WorkQty_Desc() { regOBD("WORK_QTY"); return this; }

    protected ConditionValue _errcd;
    public ConditionValue xdfgetErrcd()
    { if (_errcd == null) { _errcd = nCV(); }
      return _errcd; }
    protected ConditionValue xgetCValueErrcd() { return xdfgetErrcd(); }

    /**
     * Add order-by as ascend. <br>
     * ERRCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Errcd_Asc() { regOBA("ERRCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERRCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_Errcd_Desc() { regOBD("ERRCD"); return this; }

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
    public BsTTrworkCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrworkCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrworkCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrworkCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrworkCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrworkCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrworkCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrworkCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrworkCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrworkCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrworkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrworkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrworkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrworkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrworkCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrworkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrworkCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrworkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrworkCQ> _myselfExistsMap;
    public Map<String, TTrworkCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrworkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrworkCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrworkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrworkCB.class.getName(); }
    protected String xCQ() { return TTrworkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
