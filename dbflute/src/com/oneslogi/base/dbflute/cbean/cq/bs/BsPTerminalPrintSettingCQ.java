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
 * The base condition-query of P_TERMINAL_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public class BsPTerminalPrintSettingCQ extends AbstractBsPTerminalPrintSettingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PTerminalPrintSettingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPTerminalPrintSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_TERMINAL_PRINT_SETTING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PTerminalPrintSettingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PTerminalPrintSettingCIQ xcreateCIQ() {
        PTerminalPrintSettingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PTerminalPrintSettingCIQ xnewCIQ() {
        return new PTerminalPrintSettingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_TERMINAL_PRINT_SETTING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PTerminalPrintSettingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PTerminalPrintSettingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _terminalPrintSettingId;
    public ConditionValue xdfgetTerminalPrintSettingId()
    { if (_terminalPrintSettingId == null) { _terminalPrintSettingId = nCV(); }
      return _terminalPrintSettingId; }
    protected ConditionValue xgetCValueTerminalPrintSettingId() { return xdfgetTerminalPrintSettingId(); }

    /**
     * Add order-by as ascend. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_TerminalPrintSettingId_Asc() { regOBA("TERMINAL_PRINT_SETTING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMINAL_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_TerminalPrintSettingId_Desc() { regOBD("TERMINAL_PRINT_SETTING_ID"); return this; }

    protected ConditionValue _terminalAssignCd;
    public ConditionValue xdfgetTerminalAssignCd()
    { if (_terminalAssignCd == null) { _terminalAssignCd = nCV(); }
      return _terminalAssignCd; }
    protected ConditionValue xgetCValueTerminalAssignCd() { return xdfgetTerminalAssignCd(); }

    /**
     * Add order-by as ascend. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_TerminalAssignCd_Asc() { regOBA("TERMINAL_ASSIGN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_TerminalAssignCd_Desc() { regOBD("TERMINAL_ASSIGN_CD"); return this; }

    protected ConditionValue _reportLayoutId;
    public ConditionValue xdfgetReportLayoutId()
    { if (_reportLayoutId == null) { _reportLayoutId = nCV(); }
      return _reportLayoutId; }
    protected ConditionValue xgetCValueReportLayoutId() { return xdfgetReportLayoutId(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_ReportLayoutId_Asc() { regOBA("REPORT_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_ReportLayoutId_Desc() { regOBD("REPORT_LAYOUT_ID"); return this; }

    protected ConditionValue _printerGroupId;
    public ConditionValue xdfgetPrinterGroupId()
    { if (_printerGroupId == null) { _printerGroupId = nCV(); }
      return _printerGroupId; }
    protected ConditionValue xgetCValuePrinterGroupId() { return xdfgetPrinterGroupId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printerId;
    public ConditionValue xdfgetPrinterId()
    { if (_printerId == null) { _printerId = nCV(); }
      return _printerId; }
    protected ConditionValue xgetCValuePrinterId() { return xdfgetPrinterId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_PrinterId_Asc() { regOBA("PRINTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_PrinterId_Desc() { regOBD("PRINTER_ID"); return this; }

    protected ConditionValue _printerAttributeId;
    public ConditionValue xdfgetPrinterAttributeId()
    { if (_printerAttributeId == null) { _printerAttributeId = nCV(); }
      return _printerAttributeId; }
    protected ConditionValue xgetCValuePrinterAttributeId() { return xdfgetPrinterAttributeId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_PrinterAttributeId_Asc() { regOBA("PRINTER_ATTRIBUTE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_PrinterAttributeId_Desc() { regOBD("PRINTER_ATTRIBUTE_ID"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPTerminalPrintSettingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPTerminalPrintSettingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPTerminalPrintSettingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPTerminalPrintSettingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, PTerminalPrintSettingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PTerminalPrintSettingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PTerminalPrintSettingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PTerminalPrintSettingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PTerminalPrintSettingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PTerminalPrintSettingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PTerminalPrintSettingCQ> _myselfExistsMap;
    public Map<String, PTerminalPrintSettingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PTerminalPrintSettingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PTerminalPrintSettingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PTerminalPrintSettingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PTerminalPrintSettingCB.class.getName(); }
    protected String xCQ() { return PTerminalPrintSettingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
