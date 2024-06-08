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
 * The base condition-query of T_WORK_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsTWorkDataCQ extends AbstractBsTWorkDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TWorkDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTWorkDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_WORK_DATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TWorkDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TWorkDataCIQ xcreateCIQ() {
        TWorkDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TWorkDataCIQ xnewCIQ() {
        return new TWorkDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_WORK_DATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TWorkDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TWorkDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _workDataId;
    public ConditionValue xdfgetWorkDataId()
    { if (_workDataId == null) { _workDataId = nCV(); }
      return _workDataId; }
    protected ConditionValue xgetCValueWorkDataId() { return xdfgetWorkDataId(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_WorkDataId_Asc() { regOBA("WORK_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_WorkDataId_Desc() { regOBD("WORK_DATA_ID"); return this; }

    protected ConditionValue _userCd;
    public ConditionValue xdfgetUserCd()
    { if (_userCd == null) { _userCd = nCV(); }
      return _userCd; }
    protected ConditionValue xgetCValueUserCd() { return xdfgetUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * USER_CD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_UserCd_Asc() { regOBA("USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_CD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_UserCd_Desc() { regOBD("USER_CD"); return this; }

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
    public BsTWorkDataCQ addOrderBy_WorkCd_Asc() { regOBA("WORK_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_WorkCd_Desc() { regOBD("WORK_CD"); return this; }

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
    public BsTWorkDataCQ addOrderBy_WorkQty_Asc() { regOBA("WORK_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_WorkQty_Desc() { regOBD("WORK_QTY"); return this; }

    protected ConditionValue _macAddress;
    public ConditionValue xdfgetMacAddress()
    { if (_macAddress == null) { _macAddress = nCV(); }
      return _macAddress; }
    protected ConditionValue xgetCValueMacAddress() { return xdfgetMacAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_MacAddress_Asc() { regOBA("MAC_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_MacAddress_Desc() { regOBD("MAC_ADDRESS"); return this; }

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
    public BsTWorkDataCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsTWorkDataCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _workLogId;
    public ConditionValue xdfgetWorkLogId()
    { if (_workLogId == null) { _workLogId = nCV(); }
      return _workLogId; }
    protected ConditionValue xgetCValueWorkLogId() { return xdfgetWorkLogId(); }

    public Map<String, TWorkLogCQ> getWorkLogId_InScopeRelation_TWorkLog() { return xgetSQueMap("workLogId_InScopeRelation_TWorkLog"); }
    public String keepWorkLogId_InScopeRelation_TWorkLog(TWorkLogCQ sq) { return xkeepSQue("workLogId_InScopeRelation_TWorkLog", sq); }

    public Map<String, TWorkLogCQ> getWorkLogId_NotInScopeRelation_TWorkLog() { return xgetSQueMap("workLogId_NotInScopeRelation_TWorkLog"); }
    public String keepWorkLogId_NotInScopeRelation_TWorkLog(TWorkLogCQ sq) { return xkeepSQue("workLogId_NotInScopeRelation_TWorkLog", sq); }

    /**
     * Add order-by as ascend. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_WorkLogId_Asc() { regOBA("WORK_LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_WorkLogId_Desc() { regOBD("WORK_LOG_ID"); return this; }

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
    public BsTWorkDataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTWorkDataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTWorkDataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTWorkDataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTWorkDataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTWorkDataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTWorkDataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTWorkDataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTWorkDataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTWorkDataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTWorkDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTWorkDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TWorkDataCQ bq = (TWorkDataCQ)bqs;
        TWorkDataCQ uq = (TWorkDataCQ)uqs;
        if (bq.hasConditionQueryTWorkLog()) {
            uq.queryTWorkLog().reflectRelationOnUnionQuery(bq.queryTWorkLog(), uq.queryTWorkLog());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_WORK_LOG by my WORK_LOG_ID, named 'TWorkLog'.
     * @return The instance of condition-query. (NotNull)
     */
    public TWorkLogCQ queryTWorkLog() {
        return xdfgetConditionQueryTWorkLog();
    }
    public TWorkLogCQ xdfgetConditionQueryTWorkLog() {
        String prop = "tWorkLog";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTWorkLog()); xsetupOuterJoinTWorkLog(); }
        return xgetQueRlMap(prop);
    }
    protected TWorkLogCQ xcreateQueryTWorkLog() {
        String nrp = xresolveNRP("T_WORK_DATA", "tWorkLog"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TWorkLogCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tWorkLog", nrp);
    }
    protected void xsetupOuterJoinTWorkLog() { xregOutJo("tWorkLog"); }
    public boolean hasConditionQueryTWorkLog() { return xhasQueRlMap("tWorkLog"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TWorkDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TWorkDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TWorkDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TWorkDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TWorkDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TWorkDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TWorkDataCQ> _myselfExistsMap;
    public Map<String, TWorkDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TWorkDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TWorkDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TWorkDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TWorkDataCB.class.getName(); }
    protected String xCQ() { return TWorkDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
