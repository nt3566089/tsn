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
 * The base condition-query of P_LS_REPORT_PRINTER_BY_SITE.
 * @author DBFlute(AutoGenerator)
 */
public class BsPLsReportPrinterBySiteCQ extends AbstractBsPLsReportPrinterBySiteCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PLsReportPrinterBySiteCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPLsReportPrinterBySiteCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_LS_REPORT_PRINTER_BY_SITE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PLsReportPrinterBySiteCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PLsReportPrinterBySiteCIQ xcreateCIQ() {
        PLsReportPrinterBySiteCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PLsReportPrinterBySiteCIQ xnewCIQ() {
        return new PLsReportPrinterBySiteCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_LS_REPORT_PRINTER_BY_SITE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PLsReportPrinterBySiteCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PLsReportPrinterBySiteCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _reportFormName;
    public ConditionValue xdfgetReportFormName()
    { if (_reportFormName == null) { _reportFormName = nCV(); }
      return _reportFormName; }
    protected ConditionValue xgetCValueReportFormName() { return xdfgetReportFormName(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ReportFormName_Asc() { regOBA("REPORT_FORM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ReportFormName_Desc() { regOBD("REPORT_FORM_NAME"); return this; }

    protected ConditionValue _printerGroup;
    public ConditionValue xdfgetPrinterGroup()
    { if (_printerGroup == null) { _printerGroup = nCV(); }
      return _printerGroup; }
    protected ConditionValue xgetCValuePrinterGroup() { return xdfgetPrinterGroup(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_PrinterGroup_Asc() { regOBA("PRINTER_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_PrinterGroup_Desc() { regOBD("PRINTER_GROUP"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _reportServerName;
    public ConditionValue xdfgetReportServerName()
    { if (_reportServerName == null) { _reportServerName = nCV(); }
      return _reportServerName; }
    protected ConditionValue xgetCValueReportServerName() { return xdfgetReportServerName(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ReportServerName_Asc() { regOBA("REPORT_SERVER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ReportServerName_Desc() { regOBD("REPORT_SERVER_NAME"); return this; }

    protected ConditionValue _reportPrinterName;
    public ConditionValue xdfgetReportPrinterName()
    { if (_reportPrinterName == null) { _reportPrinterName = nCV(); }
      return _reportPrinterName; }
    protected ConditionValue xgetCValueReportPrinterName() { return xdfgetReportPrinterName(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ReportPrinterName_Asc() { regOBA("REPORT_PRINTER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ReportPrinterName_Desc() { regOBD("REPORT_PRINTER_NAME"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

    protected ConditionValue _autoFlg;
    public ConditionValue xdfgetAutoFlg()
    { if (_autoFlg == null) { _autoFlg = nCV(); }
      return _autoFlg; }
    protected ConditionValue xgetCValueAutoFlg() { return xdfgetAutoFlg(); }

    /**
     * Add order-by as ascend. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_AutoFlg_Asc() { regOBA("AUTO_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTO_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_AutoFlg_Desc() { regOBD("AUTO_FLG"); return this; }

    protected ConditionValue _terminalCd;
    public ConditionValue xdfgetTerminalCd()
    { if (_terminalCd == null) { _terminalCd = nCV(); }
      return _terminalCd; }
    protected ConditionValue xgetCValueTerminalCd() { return xdfgetTerminalCd(); }

    /**
     * Add order-by as ascend. <br>
     * TERMINAL_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_TerminalCd_Asc() { regOBA("TERMINAL_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMINAL_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_TerminalCd_Desc() { regOBD("TERMINAL_CD"); return this; }

    protected ConditionValue _priterNo;
    public ConditionValue xdfgetPriterNo()
    { if (_priterNo == null) { _priterNo = nCV(); }
      return _priterNo; }
    protected ConditionValue xgetCValuePriterNo() { return xdfgetPriterNo(); }

    /**
     * Add order-by as ascend. <br>
     * PRITER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_PriterNo_Asc() { regOBA("PRITER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRITER_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_PriterNo_Desc() { regOBD("PRITER_NO"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPLsReportPrinterBySiteCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPLsReportPrinterBySiteCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPLsReportPrinterBySiteCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, PLsReportPrinterBySiteCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PLsReportPrinterBySiteCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PLsReportPrinterBySiteCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PLsReportPrinterBySiteCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PLsReportPrinterBySiteCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PLsReportPrinterBySiteCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PLsReportPrinterBySiteCQ> _myselfExistsMap;
    public Map<String, PLsReportPrinterBySiteCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PLsReportPrinterBySiteCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PLsReportPrinterBySiteCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PLsReportPrinterBySiteCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PLsReportPrinterBySiteCB.class.getName(); }
    protected String xCQ() { return PLsReportPrinterBySiteCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
