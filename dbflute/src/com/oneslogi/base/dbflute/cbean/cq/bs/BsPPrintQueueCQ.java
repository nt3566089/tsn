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
 * The base condition-query of P_PRINT_QUEUE.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrintQueueCQ extends AbstractBsPPrintQueueCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrintQueueCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintQueueCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINT_QUEUE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrintQueueCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrintQueueCIQ xcreateCIQ() {
        PPrintQueueCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrintQueueCIQ xnewCIQ() {
        return new PPrintQueueCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINT_QUEUE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrintQueueCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrintQueueCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printQueueId;
    public ConditionValue xdfgetPrintQueueId()
    { if (_printQueueId == null) { _printQueueId = nCV(); }
      return _printQueueId; }
    protected ConditionValue xgetCValuePrintQueueId() { return xdfgetPrintQueueId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintQueueId_Asc() { regOBA("PRINT_QUEUE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintQueueId_Desc() { regOBD("PRINT_QUEUE_ID"); return this; }

    protected ConditionValue _printRequestId;
    public ConditionValue xdfgetPrintRequestId()
    { if (_printRequestId == null) { _printRequestId = nCV(); }
      return _printRequestId; }
    protected ConditionValue xgetCValuePrintRequestId() { return xdfgetPrintRequestId(); }

    public Map<String, PPrintRequestCQ> getPrintRequestId_InScopeRelation_PPrintRequest() { return xgetSQueMap("printRequestId_InScopeRelation_PPrintRequest"); }
    public String keepPrintRequestId_InScopeRelation_PPrintRequest(PPrintRequestCQ sq) { return xkeepSQue("printRequestId_InScopeRelation_PPrintRequest", sq); }

    public Map<String, PPrintRequestCQ> getPrintRequestId_NotInScopeRelation_PPrintRequest() { return xgetSQueMap("printRequestId_NotInScopeRelation_PPrintRequest"); }
    public String keepPrintRequestId_NotInScopeRelation_PPrintRequest(PPrintRequestCQ sq) { return xkeepSQue("printRequestId_NotInScopeRelation_PPrintRequest", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintRequestId_Asc() { regOBA("PRINT_REQUEST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintRequestId_Desc() { regOBD("PRINT_REQUEST_ID"); return this; }

    protected ConditionValue _printerGroupId;
    public ConditionValue xdfgetPrinterGroupId()
    { if (_printerGroupId == null) { _printerGroupId = nCV(); }
      return _printerGroupId; }
    protected ConditionValue xgetCValuePrinterGroupId() { return xdfgetPrinterGroupId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printQueueStatus;
    public ConditionValue xdfgetPrintQueueStatus()
    { if (_printQueueStatus == null) { _printQueueStatus = nCV(); }
      return _printQueueStatus; }
    protected ConditionValue xgetCValuePrintQueueStatus() { return xdfgetPrintQueueStatus(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintQueueStatus_Asc() { regOBA("PRINT_QUEUE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintQueueStatus_Desc() { regOBD("PRINT_QUEUE_STATUS"); return this; }

    protected ConditionValue _printerNm;
    public ConditionValue xdfgetPrinterNm()
    { if (_printerNm == null) { _printerNm = nCV(); }
      return _printerNm; }
    protected ConditionValue xgetCValuePrinterNm() { return xdfgetPrinterNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrinterNm_Asc() { regOBA("PRINTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrinterNm_Desc() { regOBD("PRINTER_NM"); return this; }

    protected ConditionValue _trayNm;
    public ConditionValue xdfgetTrayNm()
    { if (_trayNm == null) { _trayNm = nCV(); }
      return _trayNm; }
    protected ConditionValue xgetCValueTrayNm() { return xdfgetTrayNm(); }

    /**
     * Add order-by as ascend. <br>
     * TRAY_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_TrayNm_Asc() { regOBA("TRAY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRAY_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_TrayNm_Desc() { regOBD("TRAY_NM"); return this; }

    protected ConditionValue _printNum;
    public ConditionValue xdfgetPrintNum()
    { if (_printNum == null) { _printNum = nCV(); }
      return _printNum; }
    protected ConditionValue xgetCValuePrintNum() { return xdfgetPrintNum(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintNum_Asc() { regOBA("PRINT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_PrintNum_Desc() { regOBD("PRINT_NUM"); return this; }

    protected ConditionValue _sheetCollate;
    public ConditionValue xdfgetSheetCollate()
    { if (_sheetCollate == null) { _sheetCollate = nCV(); }
      return _sheetCollate; }
    protected ConditionValue xgetCValueSheetCollate() { return xdfgetSheetCollate(); }

    /**
     * Add order-by as ascend. <br>
     * SHEET_COLLATE: {char(1)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_SheetCollate_Asc() { regOBA("SHEET_COLLATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHEET_COLLATE: {char(1)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_SheetCollate_Desc() { regOBD("SHEET_COLLATE"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrintQueueCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintQueueCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrintQueueCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrintQueueCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrintQueueCQ bq = (PPrintQueueCQ)bqs;
        PPrintQueueCQ uq = (PPrintQueueCQ)uqs;
        if (bq.hasConditionQueryPPrintRequest()) {
            uq.queryPPrintRequest().reflectRelationOnUnionQuery(bq.queryPPrintRequest(), uq.queryPPrintRequest());
        }
        if (bq.hasConditionQueryBClassDtlByPrintQueueStatus()) {
            uq.queryBClassDtlByPrintQueueStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByPrintQueueStatus(), uq.queryBClassDtlByPrintQueueStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrintRequestCQ queryPPrintRequest() {
        return xdfgetConditionQueryPPrintRequest();
    }
    public PPrintRequestCQ xdfgetConditionQueryPPrintRequest() {
        String prop = "pPrintRequest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrintRequest()); xsetupOuterJoinPPrintRequest(); }
        return xgetQueRlMap(prop);
    }
    protected PPrintRequestCQ xcreateQueryPPrintRequest() {
        String nrp = xresolveNRP("P_PRINT_QUEUE", "pPrintRequest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrintRequestCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrintRequest", nrp);
    }
    protected void xsetupOuterJoinPPrintRequest() { xregOutJo("pPrintRequest"); }
    public boolean hasConditionQueryPPrintRequest() { return xhasQueRlMap("pPrintRequest"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRINT_QUEUE_STATUS, named 'BClassDtlByPrintQueueStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPrintQueueStatus() {
        return xdfgetConditionQueryBClassDtlByPrintQueueStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPrintQueueStatus() {
        String prop = "bClassDtlByPrintQueueStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPrintQueueStatus()); xsetupOuterJoinBClassDtlByPrintQueueStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPrintQueueStatus() {
        String nrp = xresolveNRP("P_PRINT_QUEUE", "bClassDtlByPrintQueueStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPrintQueueStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPrintQueueStatus() { xregOutJo("bClassDtlByPrintQueueStatus"); }
    public boolean hasConditionQueryBClassDtlByPrintQueueStatus() { return xhasQueRlMap("bClassDtlByPrintQueueStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PPrintQueueCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrintQueueCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrintQueueCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrintQueueCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrintQueueCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrintQueueCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrintQueueCQ> _myselfExistsMap;
    public Map<String, PPrintQueueCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrintQueueCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrintQueueCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrintQueueCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrintQueueCB.class.getName(); }
    protected String xCQ() { return PPrintQueueCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
