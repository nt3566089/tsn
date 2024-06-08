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
 * The base condition-query of B_SYSTEM_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsBSystemLogCQ extends AbstractBsBSystemLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BSystemLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBSystemLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_SYSTEM_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BSystemLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BSystemLogCIQ xcreateCIQ() {
        BSystemLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BSystemLogCIQ xnewCIQ() {
        return new BSystemLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_SYSTEM_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BSystemLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BSystemLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _systemLogId;
    public ConditionValue xdfgetSystemLogId()
    { if (_systemLogId == null) { _systemLogId = nCV(); }
      return _systemLogId; }
    protected ConditionValue xgetCValueSystemLogId() { return xdfgetSystemLogId(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogId_Asc() { regOBA("SYSTEM_LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogId_Desc() { regOBD("SYSTEM_LOG_ID"); return this; }

    protected ConditionValue _systemLogProcessId;
    public ConditionValue xdfgetSystemLogProcessId()
    { if (_systemLogProcessId == null) { _systemLogProcessId = nCV(); }
      return _systemLogProcessId; }
    protected ConditionValue xgetCValueSystemLogProcessId() { return xdfgetSystemLogProcessId(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogProcessId_Asc() { regOBA("SYSTEM_LOG_PROCESS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogProcessId_Desc() { regOBD("SYSTEM_LOG_PROCESS_ID"); return this; }

    protected ConditionValue _systemLogType;
    public ConditionValue xdfgetSystemLogType()
    { if (_systemLogType == null) { _systemLogType = nCV(); }
      return _systemLogType; }
    protected ConditionValue xgetCValueSystemLogType() { return xdfgetSystemLogType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogType_Asc() { regOBA("SYSTEM_LOG_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogType_Desc() { regOBD("SYSTEM_LOG_TYPE"); return this; }

    protected ConditionValue _systemLogStatus;
    public ConditionValue xdfgetSystemLogStatus()
    { if (_systemLogStatus == null) { _systemLogStatus = nCV(); }
      return _systemLogStatus; }
    protected ConditionValue xgetCValueSystemLogStatus() { return xdfgetSystemLogStatus(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogStatus_Asc() { regOBA("SYSTEM_LOG_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_SystemLogStatus_Desc() { regOBD("SYSTEM_LOG_STATUS"); return this; }

    protected ConditionValue _classCd;
    public ConditionValue xdfgetClassCd()
    { if (_classCd == null) { _classCd = nCV(); }
      return _classCd; }
    protected ConditionValue xgetCValueClassCd() { return xdfgetClassCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ClassCd_Asc() { regOBA("CLASS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ClassCd_Desc() { regOBD("CLASS_CD"); return this; }

    protected ConditionValue _methodCd;
    public ConditionValue xdfgetMethodCd()
    { if (_methodCd == null) { _methodCd = nCV(); }
      return _methodCd; }
    protected ConditionValue xgetCValueMethodCd() { return xdfgetMethodCd(); }

    /**
     * Add order-by as ascend. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_MethodCd_Asc() { regOBA("METHOD_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * METHOD_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_MethodCd_Desc() { regOBD("METHOD_CD"); return this; }

    protected ConditionValue _processInfo;
    public ConditionValue xdfgetProcessInfo()
    { if (_processInfo == null) { _processInfo = nCV(); }
      return _processInfo; }
    protected ConditionValue xgetCValueProcessInfo() { return xdfgetProcessInfo(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ProcessInfo_Asc() { regOBA("PROCESS_INFO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ProcessInfo_Desc() { regOBD("PROCESS_INFO"); return this; }

    protected ConditionValue _processDt;
    public ConditionValue xdfgetProcessDt()
    { if (_processDt == null) { _processDt = nCV(); }
      return _processDt; }
    protected ConditionValue xgetCValueProcessDt() { return xdfgetProcessDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ProcessDt_Asc() { regOBA("PROCESS_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ProcessDt_Desc() { regOBD("PROCESS_DT"); return this; }

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
    public BsBSystemLogCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBSystemLogCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBSystemLogCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBSystemLogCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBSystemLogCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBSystemLogCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBSystemLogCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBSystemLogCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBSystemLogCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBSystemLogCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBSystemLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBSystemLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BSystemLogCQ bq = (BSystemLogCQ)bqs;
        BSystemLogCQ uq = (BSystemLogCQ)uqs;
        if (bq.hasConditionQueryBClassDtlBySystemLogType()) {
            uq.queryBClassDtlBySystemLogType().reflectRelationOnUnionQuery(bq.queryBClassDtlBySystemLogType(), uq.queryBClassDtlBySystemLogType());
        }
        if (bq.hasConditionQueryBClassDtlBySystemLogStatus()) {
            uq.queryBClassDtlBySystemLogStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlBySystemLogStatus(), uq.queryBClassDtlBySystemLogStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SYSTEM_LOG_TYPE, named 'BClassDtlBySystemLogType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySystemLogType() {
        return xdfgetConditionQueryBClassDtlBySystemLogType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySystemLogType() {
        String prop = "bClassDtlBySystemLogType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySystemLogType()); xsetupOuterJoinBClassDtlBySystemLogType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySystemLogType() {
        String nrp = xresolveNRP("B_SYSTEM_LOG", "bClassDtlBySystemLogType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySystemLogType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySystemLogType() { xregOutJo("bClassDtlBySystemLogType"); }
    public boolean hasConditionQueryBClassDtlBySystemLogType() { return xhasQueRlMap("bClassDtlBySystemLogType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SYSTEM_LOG_STATUS, named 'BClassDtlBySystemLogStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySystemLogStatus() {
        return xdfgetConditionQueryBClassDtlBySystemLogStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySystemLogStatus() {
        String prop = "bClassDtlBySystemLogStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySystemLogStatus()); xsetupOuterJoinBClassDtlBySystemLogStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySystemLogStatus() {
        String nrp = xresolveNRP("B_SYSTEM_LOG", "bClassDtlBySystemLogStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySystemLogStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySystemLogStatus() { xregOutJo("bClassDtlBySystemLogStatus"); }
    public boolean hasConditionQueryBClassDtlBySystemLogStatus() { return xhasQueRlMap("bClassDtlBySystemLogStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BSystemLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BSystemLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BSystemLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BSystemLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BSystemLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BSystemLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BSystemLogCQ> _myselfExistsMap;
    public Map<String, BSystemLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BSystemLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BSystemLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BSystemLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BSystemLogCB.class.getName(); }
    protected String xCQ() { return BSystemLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
