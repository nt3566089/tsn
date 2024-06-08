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
 * The base condition-query of B_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsBLogCQ extends AbstractBsBLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BLogCIQ xcreateCIQ() {
        BLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BLogCIQ xnewCIQ() {
        return new BLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _logId;
    public ConditionValue xdfgetLogId()
    { if (_logId == null) { _logId = nCV(); }
      return _logId; }
    protected ConditionValue xgetCValueLogId() { return xdfgetLogId(); }

    public Map<String, BLogDtlCQ> xdfgetLogId_ExistsReferrer_BLogDtlList() { return xgetSQueMap("logId_ExistsReferrer_BLogDtlList"); }
    public String keepLogId_ExistsReferrer_BLogDtlList(BLogDtlCQ sq) { return xkeepSQue("logId_ExistsReferrer_BLogDtlList", sq); }

    public Map<String, BLogDtlCQ> xdfgetLogId_NotExistsReferrer_BLogDtlList() { return xgetSQueMap("logId_NotExistsReferrer_BLogDtlList"); }
    public String keepLogId_NotExistsReferrer_BLogDtlList(BLogDtlCQ sq) { return xkeepSQue("logId_NotExistsReferrer_BLogDtlList", sq); }

    public Map<String, BLogDtlCQ> xdfgetLogId_SpecifyDerivedReferrer_BLogDtlList() { return xgetSQueMap("logId_SpecifyDerivedReferrer_BLogDtlList"); }
    public String keepLogId_SpecifyDerivedReferrer_BLogDtlList(BLogDtlCQ sq) { return xkeepSQue("logId_SpecifyDerivedReferrer_BLogDtlList", sq); }

    public Map<String, BLogDtlCQ> xdfgetLogId_QueryDerivedReferrer_BLogDtlList() { return xgetSQueMap("logId_QueryDerivedReferrer_BLogDtlList"); }
    public String keepLogId_QueryDerivedReferrer_BLogDtlList(BLogDtlCQ sq) { return xkeepSQue("logId_QueryDerivedReferrer_BLogDtlList", sq); }
    public Map<String, Object> xdfgetLogId_QueryDerivedReferrer_BLogDtlListParameter() { return xgetSQuePmMap("logId_QueryDerivedReferrer_BLogDtlList"); }
    public String keepLogId_QueryDerivedReferrer_BLogDtlListParameter(Object pm) { return xkeepSQuePm("logId_QueryDerivedReferrer_BLogDtlList", pm); }

    /**
     * Add order-by as ascend. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogId_Asc() { regOBA("LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogId_Desc() { regOBD("LOG_ID"); return this; }

    protected ConditionValue _logStatus;
    public ConditionValue xdfgetLogStatus()
    { if (_logStatus == null) { _logStatus = nCV(); }
      return _logStatus; }
    protected ConditionValue xgetCValueLogStatus() { return xdfgetLogStatus(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogStatus_Asc() { regOBA("LOG_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogStatus_Desc() { regOBD("LOG_STATUS"); return this; }

    protected ConditionValue _logGroupCd;
    public ConditionValue xdfgetLogGroupCd()
    { if (_logGroupCd == null) { _logGroupCd = nCV(); }
      return _logGroupCd; }
    protected ConditionValue xgetCValueLogGroupCd() { return xdfgetLogGroupCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogGroupCd_Asc() { regOBA("LOG_GROUP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_GROUP_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogGroupCd_Desc() { regOBD("LOG_GROUP_CD"); return this; }

    protected ConditionValue _logGroupNm;
    public ConditionValue xdfgetLogGroupNm()
    { if (_logGroupNm == null) { _logGroupNm = nCV(); }
      return _logGroupNm; }
    protected ConditionValue xgetCValueLogGroupNm() { return xdfgetLogGroupNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogGroupNm_Asc() { regOBA("LOG_GROUP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_GROUP_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogGroupNm_Desc() { regOBD("LOG_GROUP_NM"); return this; }

    protected ConditionValue _logGroupProcessId;
    public ConditionValue xdfgetLogGroupProcessId()
    { if (_logGroupProcessId == null) { _logGroupProcessId = nCV(); }
      return _logGroupProcessId; }
    protected ConditionValue xgetCValueLogGroupProcessId() { return xdfgetLogGroupProcessId(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogGroupProcessId_Asc() { regOBA("LOG_GROUP_PROCESS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_GROUP_PROCESS_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_LogGroupProcessId_Desc() { regOBD("LOG_GROUP_PROCESS_ID"); return this; }

    protected ConditionValue _pgmCd;
    public ConditionValue xdfgetPgmCd()
    { if (_pgmCd == null) { _pgmCd = nCV(); }
      return _pgmCd; }
    protected ConditionValue xgetCValuePgmCd() { return xdfgetPgmCd(); }

    /**
     * Add order-by as ascend. <br>
     * PGM_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_PgmCd_Asc() { regOBA("PGM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PGM_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_PgmCd_Desc() { regOBD("PGM_CD"); return this; }

    protected ConditionValue _pgmNm;
    public ConditionValue xdfgetPgmNm()
    { if (_pgmNm == null) { _pgmNm = nCV(); }
      return _pgmNm; }
    protected ConditionValue xgetCValuePgmNm() { return xdfgetPgmNm(); }

    /**
     * Add order-by as ascend. <br>
     * PGM_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_PgmNm_Asc() { regOBA("PGM_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PGM_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_PgmNm_Desc() { regOBD("PGM_NM"); return this; }

    protected ConditionValue _processStartDt;
    public ConditionValue xdfgetProcessStartDt()
    { if (_processStartDt == null) { _processStartDt = nCV(); }
      return _processStartDt; }
    protected ConditionValue xgetCValueProcessStartDt() { return xdfgetProcessStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_ProcessStartDt_Asc() { regOBA("PROCESS_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_ProcessStartDt_Desc() { regOBD("PROCESS_START_DT"); return this; }

    protected ConditionValue _processEndDt;
    public ConditionValue xdfgetProcessEndDt()
    { if (_processEndDt == null) { _processEndDt = nCV(); }
      return _processEndDt; }
    protected ConditionValue xgetCValueProcessEndDt() { return xdfgetProcessEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_ProcessEndDt_Asc() { regOBA("PROCESS_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_END_DT: {IX, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_ProcessEndDt_Desc() { regOBD("PROCESS_END_DT"); return this; }

    protected ConditionValue _attribute1;
    public ConditionValue xdfgetAttribute1()
    { if (_attribute1 == null) { _attribute1 = nCV(); }
      return _attribute1; }
    protected ConditionValue xgetCValueAttribute1() { return xdfgetAttribute1(); }

    /**
     * Add order-by as ascend. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute1_Asc() { regOBA("ATTRIBUTE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute1_Desc() { regOBD("ATTRIBUTE1"); return this; }

    protected ConditionValue _attribute2;
    public ConditionValue xdfgetAttribute2()
    { if (_attribute2 == null) { _attribute2 = nCV(); }
      return _attribute2; }
    protected ConditionValue xgetCValueAttribute2() { return xdfgetAttribute2(); }

    /**
     * Add order-by as ascend. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute2_Asc() { regOBA("ATTRIBUTE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute2_Desc() { regOBD("ATTRIBUTE2"); return this; }

    protected ConditionValue _attribute3;
    public ConditionValue xdfgetAttribute3()
    { if (_attribute3 == null) { _attribute3 = nCV(); }
      return _attribute3; }
    protected ConditionValue xgetCValueAttribute3() { return xdfgetAttribute3(); }

    /**
     * Add order-by as ascend. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute3_Asc() { regOBA("ATTRIBUTE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute3_Desc() { regOBD("ATTRIBUTE3"); return this; }

    protected ConditionValue _attribute4;
    public ConditionValue xdfgetAttribute4()
    { if (_attribute4 == null) { _attribute4 = nCV(); }
      return _attribute4; }
    protected ConditionValue xgetCValueAttribute4() { return xdfgetAttribute4(); }

    /**
     * Add order-by as ascend. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute4_Asc() { regOBA("ATTRIBUTE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute4_Desc() { regOBD("ATTRIBUTE4"); return this; }

    protected ConditionValue _attribute5;
    public ConditionValue xdfgetAttribute5()
    { if (_attribute5 == null) { _attribute5 = nCV(); }
      return _attribute5; }
    protected ConditionValue xgetCValueAttribute5() { return xdfgetAttribute5(); }

    /**
     * Add order-by as ascend. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute5_Asc() { regOBA("ATTRIBUTE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_Attribute5_Desc() { regOBD("ATTRIBUTE5"); return this; }

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
    public BsBLogCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBLogCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBLogCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBLogCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBLogCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBLogCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBLogCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBLogCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBLogCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBLogCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BLogCQ bq = (BLogCQ)bqs;
        BLogCQ uq = (BLogCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByLogStatus()) {
            uq.queryBClassDtlByLogStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByLogStatus(), uq.queryBClassDtlByLogStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOG_STATUS, named 'BClassDtlByLogStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLogStatus() {
        return xdfgetConditionQueryBClassDtlByLogStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLogStatus() {
        String prop = "bClassDtlByLogStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLogStatus()); xsetupOuterJoinBClassDtlByLogStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLogStatus() {
        String nrp = xresolveNRP("B_LOG", "bClassDtlByLogStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLogStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLogStatus() { xregOutJo("bClassDtlByLogStatus"); }
    public boolean hasConditionQueryBClassDtlByLogStatus() { return xhasQueRlMap("bClassDtlByLogStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BLogCQ> _myselfExistsMap;
    public Map<String, BLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BLogCB.class.getName(); }
    protected String xCQ() { return BLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
