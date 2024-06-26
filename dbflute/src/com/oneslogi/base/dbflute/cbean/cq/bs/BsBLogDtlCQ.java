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
 * The base condition-query of B_LOG_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBLogDtlCQ extends AbstractBsBLogDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BLogDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBLogDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_LOG_DTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BLogDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BLogDtlCIQ xcreateCIQ() {
        BLogDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BLogDtlCIQ xnewCIQ() {
        return new BLogDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_LOG_DTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BLogDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BLogDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _logDtlId;
    public ConditionValue xdfgetLogDtlId()
    { if (_logDtlId == null) { _logDtlId = nCV(); }
      return _logDtlId; }
    protected ConditionValue xgetCValueLogDtlId() { return xdfgetLogDtlId(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlId_Asc() { regOBA("LOG_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlId_Desc() { regOBD("LOG_DTL_ID"); return this; }

    protected ConditionValue _logId;
    public ConditionValue xdfgetLogId()
    { if (_logId == null) { _logId = nCV(); }
      return _logId; }
    protected ConditionValue xgetCValueLogId() { return xdfgetLogId(); }

    public Map<String, BLogCQ> getLogId_InScopeRelation_BLog() { return xgetSQueMap("logId_InScopeRelation_BLog"); }
    public String keepLogId_InScopeRelation_BLog(BLogCQ sq) { return xkeepSQue("logId_InScopeRelation_BLog", sq); }

    public Map<String, BLogCQ> getLogId_NotInScopeRelation_BLog() { return xgetSQueMap("logId_NotInScopeRelation_BLog"); }
    public String keepLogId_NotInScopeRelation_BLog(BLogCQ sq) { return xkeepSQue("logId_NotInScopeRelation_BLog", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogId_Asc() { regOBA("LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogId_Desc() { regOBD("LOG_ID"); return this; }

    protected ConditionValue _logDtlType;
    public ConditionValue xdfgetLogDtlType()
    { if (_logDtlType == null) { _logDtlType = nCV(); }
      return _logDtlType; }
    protected ConditionValue xgetCValueLogDtlType() { return xdfgetLogDtlType(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlType_Asc() { regOBA("LOG_DTL_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlType_Desc() { regOBD("LOG_DTL_TYPE"); return this; }

    protected ConditionValue _logDtlStatus;
    public ConditionValue xdfgetLogDtlStatus()
    { if (_logDtlStatus == null) { _logDtlStatus = nCV(); }
      return _logDtlStatus; }
    protected ConditionValue xgetCValueLogDtlStatus() { return xdfgetLogDtlStatus(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlStatus_Asc() { regOBA("LOG_DTL_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlStatus_Desc() { regOBD("LOG_DTL_STATUS"); return this; }

    protected ConditionValue _logDtlSectionId;
    public ConditionValue xdfgetLogDtlSectionId()
    { if (_logDtlSectionId == null) { _logDtlSectionId = nCV(); }
      return _logDtlSectionId; }
    protected ConditionValue xgetCValueLogDtlSectionId() { return xdfgetLogDtlSectionId(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlSectionId_Asc() { regOBA("LOG_DTL_SECTION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_DTL_SECTION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlSectionId_Desc() { regOBD("LOG_DTL_SECTION_ID"); return this; }

    protected ConditionValue _logDtlSectionNm;
    public ConditionValue xdfgetLogDtlSectionNm()
    { if (_logDtlSectionNm == null) { _logDtlSectionNm = nCV(); }
      return _logDtlSectionNm; }
    protected ConditionValue xgetCValueLogDtlSectionNm() { return xdfgetLogDtlSectionNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlSectionNm_Asc() { regOBA("LOG_DTL_SECTION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOG_DTL_SECTION_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_LogDtlSectionNm_Desc() { regOBD("LOG_DTL_SECTION_NM"); return this; }

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
    public BsBLogDtlCQ addOrderBy_ProcessInfo_Asc() { regOBA("PROCESS_INFO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_INFO: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_ProcessInfo_Desc() { regOBD("PROCESS_INFO"); return this; }

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
    public BsBLogDtlCQ addOrderBy_ProcessDt_Asc() { regOBA("PROCESS_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_DT: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_ProcessDt_Desc() { regOBD("PROCESS_DT"); return this; }

    protected ConditionValue _messageReplaceString1;
    public ConditionValue xdfgetMessageReplaceString1()
    { if (_messageReplaceString1 == null) { _messageReplaceString1 = nCV(); }
      return _messageReplaceString1; }
    protected ConditionValue xgetCValueMessageReplaceString1() { return xdfgetMessageReplaceString1(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString1_Asc() { regOBA("MESSAGE_REPLACE_STRING1"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString1_Desc() { regOBD("MESSAGE_REPLACE_STRING1"); return this; }

    protected ConditionValue _messageReplaceString2;
    public ConditionValue xdfgetMessageReplaceString2()
    { if (_messageReplaceString2 == null) { _messageReplaceString2 = nCV(); }
      return _messageReplaceString2; }
    protected ConditionValue xgetCValueMessageReplaceString2() { return xdfgetMessageReplaceString2(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString2_Asc() { regOBA("MESSAGE_REPLACE_STRING2"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString2_Desc() { regOBD("MESSAGE_REPLACE_STRING2"); return this; }

    protected ConditionValue _messageReplaceString3;
    public ConditionValue xdfgetMessageReplaceString3()
    { if (_messageReplaceString3 == null) { _messageReplaceString3 = nCV(); }
      return _messageReplaceString3; }
    protected ConditionValue xgetCValueMessageReplaceString3() { return xdfgetMessageReplaceString3(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString3_Asc() { regOBA("MESSAGE_REPLACE_STRING3"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString3_Desc() { regOBD("MESSAGE_REPLACE_STRING3"); return this; }

    protected ConditionValue _messageReplaceString4;
    public ConditionValue xdfgetMessageReplaceString4()
    { if (_messageReplaceString4 == null) { _messageReplaceString4 = nCV(); }
      return _messageReplaceString4; }
    protected ConditionValue xgetCValueMessageReplaceString4() { return xdfgetMessageReplaceString4(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString4_Asc() { regOBA("MESSAGE_REPLACE_STRING4"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString4_Desc() { regOBD("MESSAGE_REPLACE_STRING4"); return this; }

    protected ConditionValue _messageReplaceString5;
    public ConditionValue xdfgetMessageReplaceString5()
    { if (_messageReplaceString5 == null) { _messageReplaceString5 = nCV(); }
      return _messageReplaceString5; }
    protected ConditionValue xgetCValueMessageReplaceString5() { return xdfgetMessageReplaceString5(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString5_Asc() { regOBA("MESSAGE_REPLACE_STRING5"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_MessageReplaceString5_Desc() { regOBD("MESSAGE_REPLACE_STRING5"); return this; }

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
    public BsBLogDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBLogDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBLogDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBLogDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBLogDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBLogDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBLogDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBLogDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBLogDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBLogDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBLogDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBLogDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BLogDtlCQ bq = (BLogDtlCQ)bqs;
        BLogDtlCQ uq = (BLogDtlCQ)uqs;
        if (bq.hasConditionQueryBLog()) {
            uq.queryBLog().reflectRelationOnUnionQuery(bq.queryBLog(), uq.queryBLog());
        }
        if (bq.hasConditionQueryBClassDtlByLogDtlType()) {
            uq.queryBClassDtlByLogDtlType().reflectRelationOnUnionQuery(bq.queryBClassDtlByLogDtlType(), uq.queryBClassDtlByLogDtlType());
        }
        if (bq.hasConditionQueryBClassDtlByLogDtlStatus()) {
            uq.queryBClassDtlByLogDtlStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByLogDtlStatus(), uq.queryBClassDtlByLogDtlStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_LOG by my LOG_ID, named 'BLog'.
     * @return The instance of condition-query. (NotNull)
     */
    public BLogCQ queryBLog() {
        return xdfgetConditionQueryBLog();
    }
    public BLogCQ xdfgetConditionQueryBLog() {
        String prop = "bLog";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBLog()); xsetupOuterJoinBLog(); }
        return xgetQueRlMap(prop);
    }
    protected BLogCQ xcreateQueryBLog() {
        String nrp = xresolveNRP("B_LOG_DTL", "bLog"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BLogCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bLog", nrp);
    }
    protected void xsetupOuterJoinBLog() { xregOutJo("bLog"); }
    public boolean hasConditionQueryBLog() { return xhasQueRlMap("bLog"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLogDtlType() {
        return xdfgetConditionQueryBClassDtlByLogDtlType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLogDtlType() {
        String prop = "bClassDtlByLogDtlType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLogDtlType()); xsetupOuterJoinBClassDtlByLogDtlType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLogDtlType() {
        String nrp = xresolveNRP("B_LOG_DTL", "bClassDtlByLogDtlType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLogDtlType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLogDtlType() { xregOutJo("bClassDtlByLogDtlType"); }
    public boolean hasConditionQueryBClassDtlByLogDtlType() { return xhasQueRlMap("bClassDtlByLogDtlType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLogDtlStatus() {
        return xdfgetConditionQueryBClassDtlByLogDtlStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLogDtlStatus() {
        String prop = "bClassDtlByLogDtlStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLogDtlStatus()); xsetupOuterJoinBClassDtlByLogDtlStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLogDtlStatus() {
        String nrp = xresolveNRP("B_LOG_DTL", "bClassDtlByLogDtlStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLogDtlStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLogDtlStatus() { xregOutJo("bClassDtlByLogDtlStatus"); }
    public boolean hasConditionQueryBClassDtlByLogDtlStatus() { return xhasQueRlMap("bClassDtlByLogDtlStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BLogDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BLogDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BLogDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BLogDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BLogDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BLogDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BLogDtlCQ> _myselfExistsMap;
    public Map<String, BLogDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BLogDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BLogDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BLogDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BLogDtlCB.class.getName(); }
    protected String xCQ() { return BLogDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
