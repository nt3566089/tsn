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
 * The base condition-query of P_USER_AUTO_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public class BsPUserAutoPrintSettingCQ extends AbstractBsPUserAutoPrintSettingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PUserAutoPrintSettingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPUserAutoPrintSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_USER_AUTO_PRINT_SETTING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PUserAutoPrintSettingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PUserAutoPrintSettingCIQ xcreateCIQ() {
        PUserAutoPrintSettingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PUserAutoPrintSettingCIQ xnewCIQ() {
        return new PUserAutoPrintSettingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_USER_AUTO_PRINT_SETTING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PUserAutoPrintSettingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PUserAutoPrintSettingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userAutoPrintSettingId;
    public ConditionValue xdfgetUserAutoPrintSettingId()
    { if (_userAutoPrintSettingId == null) { _userAutoPrintSettingId = nCV(); }
      return _userAutoPrintSettingId; }
    protected ConditionValue xgetCValueUserAutoPrintSettingId() { return xdfgetUserAutoPrintSettingId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_AUTO_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UserAutoPrintSettingId_Asc() { regOBA("USER_AUTO_PRINT_SETTING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_AUTO_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UserAutoPrintSettingId_Desc() { regOBD("USER_AUTO_PRINT_SETTING_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {UQ+, IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {UQ+, IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _reportLayoutId;
    public ConditionValue xdfgetReportLayoutId()
    { if (_reportLayoutId == null) { _reportLayoutId = nCV(); }
      return _reportLayoutId; }
    protected ConditionValue xgetCValueReportLayoutId() { return xdfgetReportLayoutId(); }

    public Map<String, PReportLayoutCQ> getReportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId() { return xgetSQueMap("reportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId"); }
    public String keepReportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId(PReportLayoutCQ sq) { return xkeepSQue("reportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId", sq); }

    public Map<String, PReportLayoutCQ> getReportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId() { return xgetSQueMap("reportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId"); }
    public String keepReportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId(PReportLayoutCQ sq) { return xkeepSQue("reportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_ReportLayoutId_Asc() { regOBA("REPORT_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_ReportLayoutId_Desc() { regOBD("REPORT_LAYOUT_ID"); return this; }

    protected ConditionValue _printerGroupId;
    public ConditionValue xdfgetPrinterGroupId()
    { if (_printerGroupId == null) { _printerGroupId = nCV(); }
      return _printerGroupId; }
    protected ConditionValue xgetCValuePrinterGroupId() { return xdfgetPrinterGroupId(); }

    public Map<String, PPrinterGroupCQ> getPrinterGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId() { return xgetSQueMap("printerGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId"); }
    public String keepPrinterGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId(PPrinterGroupCQ sq) { return xkeepSQue("printerGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId", sq); }

    public Map<String, PPrinterGroupCQ> getPrinterGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId() { return xgetSQueMap("printerGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId"); }
    public String keepPrinterGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId(PPrinterGroupCQ sq) { return xkeepSQue("printerGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printerId;
    public ConditionValue xdfgetPrinterId()
    { if (_printerId == null) { _printerId = nCV(); }
      return _printerId; }
    protected ConditionValue xgetCValuePrinterId() { return xdfgetPrinterId(); }

    public Map<String, PPrinterCQ> getPrinterId_InScopeRelation_PPrinterByPrinterId() { return xgetSQueMap("printerId_InScopeRelation_PPrinterByPrinterId"); }
    public String keepPrinterId_InScopeRelation_PPrinterByPrinterId(PPrinterCQ sq) { return xkeepSQue("printerId_InScopeRelation_PPrinterByPrinterId", sq); }

    public Map<String, PPrinterCQ> getPrinterId_NotInScopeRelation_PPrinterByPrinterId() { return xgetSQueMap("printerId_NotInScopeRelation_PPrinterByPrinterId"); }
    public String keepPrinterId_NotInScopeRelation_PPrinterByPrinterId(PPrinterCQ sq) { return xkeepSQue("printerId_NotInScopeRelation_PPrinterByPrinterId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_PrinterId_Asc() { regOBA("PRINTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_PrinterId_Desc() { regOBD("PRINTER_ID"); return this; }

    protected ConditionValue _printerAttributeId;
    public ConditionValue xdfgetPrinterAttributeId()
    { if (_printerAttributeId == null) { _printerAttributeId = nCV(); }
      return _printerAttributeId; }
    protected ConditionValue xgetCValuePrinterAttributeId() { return xdfgetPrinterAttributeId(); }

    public Map<String, PPrinterAttributeCQ> getPrinterAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId() { return xgetSQueMap("printerAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId"); }
    public String keepPrinterAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId(PPrinterAttributeCQ sq) { return xkeepSQue("printerAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId", sq); }

    public Map<String, PPrinterAttributeCQ> getPrinterAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId() { return xgetSQueMap("printerAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId"); }
    public String keepPrinterAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId(PPrinterAttributeCQ sq) { return xkeepSQue("printerAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_PrinterAttributeId_Asc() { regOBA("PRINTER_ATTRIBUTE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_PrinterAttributeId_Desc() { regOBD("PRINTER_ATTRIBUTE_ID"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPUserAutoPrintSettingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPUserAutoPrintSettingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPUserAutoPrintSettingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPUserAutoPrintSettingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PUserAutoPrintSettingCQ bq = (PUserAutoPrintSettingCQ)bqs;
        PUserAutoPrintSettingCQ uq = (PUserAutoPrintSettingCQ)uqs;
        if (bq.hasConditionQueryPReportLayoutByReportLayoutId()) {
            uq.queryPReportLayoutByReportLayoutId().reflectRelationOnUnionQuery(bq.queryPReportLayoutByReportLayoutId(), uq.queryPReportLayoutByReportLayoutId());
        }
        if (bq.hasConditionQueryPPrinterGroupByPrinterGroupId()) {
            uq.queryPPrinterGroupByPrinterGroupId().reflectRelationOnUnionQuery(bq.queryPPrinterGroupByPrinterGroupId(), uq.queryPPrinterGroupByPrinterGroupId());
        }
        if (bq.hasConditionQueryPPrinterByPrinterId()) {
            uq.queryPPrinterByPrinterId().reflectRelationOnUnionQuery(bq.queryPPrinterByPrinterId(), uq.queryPPrinterByPrinterId());
        }
        if (bq.hasConditionQueryPPrinterAttributeByPrinterAttributeId()) {
            uq.queryPPrinterAttributeByPrinterAttributeId().reflectRelationOnUnionQuery(bq.queryPPrinterAttributeByPrinterAttributeId(), uq.queryPPrinterAttributeByPrinterAttributeId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @return The instance of condition-query. (NotNull)
     */
    public PReportLayoutCQ queryPReportLayoutByReportLayoutId() {
        return xdfgetConditionQueryPReportLayoutByReportLayoutId();
    }
    public PReportLayoutCQ xdfgetConditionQueryPReportLayoutByReportLayoutId() {
        String prop = "pReportLayoutByReportLayoutId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPReportLayoutByReportLayoutId()); xsetupOuterJoinPReportLayoutByReportLayoutId(); }
        return xgetQueRlMap(prop);
    }
    protected PReportLayoutCQ xcreateQueryPReportLayoutByReportLayoutId() {
        String nrp = xresolveNRP("P_USER_AUTO_PRINT_SETTING", "pReportLayoutByReportLayoutId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PReportLayoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pReportLayoutByReportLayoutId", nrp);
    }
    protected void xsetupOuterJoinPReportLayoutByReportLayoutId() { xregOutJo("pReportLayoutByReportLayoutId"); }
    public boolean hasConditionQueryPReportLayoutByReportLayoutId() { return xhasQueRlMap("pReportLayoutByReportLayoutId"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrinterGroupCQ queryPPrinterGroupByPrinterGroupId() {
        return xdfgetConditionQueryPPrinterGroupByPrinterGroupId();
    }
    public PPrinterGroupCQ xdfgetConditionQueryPPrinterGroupByPrinterGroupId() {
        String prop = "pPrinterGroupByPrinterGroupId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrinterGroupByPrinterGroupId()); xsetupOuterJoinPPrinterGroupByPrinterGroupId(); }
        return xgetQueRlMap(prop);
    }
    protected PPrinterGroupCQ xcreateQueryPPrinterGroupByPrinterGroupId() {
        String nrp = xresolveNRP("P_USER_AUTO_PRINT_SETTING", "pPrinterGroupByPrinterGroupId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterGroupCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinterGroupByPrinterGroupId", nrp);
    }
    protected void xsetupOuterJoinPPrinterGroupByPrinterGroupId() { xregOutJo("pPrinterGroupByPrinterGroupId"); }
    public boolean hasConditionQueryPPrinterGroupByPrinterGroupId() { return xhasQueRlMap("pPrinterGroupByPrinterGroupId"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrinterCQ queryPPrinterByPrinterId() {
        return xdfgetConditionQueryPPrinterByPrinterId();
    }
    public PPrinterCQ xdfgetConditionQueryPPrinterByPrinterId() {
        String prop = "pPrinterByPrinterId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrinterByPrinterId()); xsetupOuterJoinPPrinterByPrinterId(); }
        return xgetQueRlMap(prop);
    }
    protected PPrinterCQ xcreateQueryPPrinterByPrinterId() {
        String nrp = xresolveNRP("P_USER_AUTO_PRINT_SETTING", "pPrinterByPrinterId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinterByPrinterId", nrp);
    }
    protected void xsetupOuterJoinPPrinterByPrinterId() { xregOutJo("pPrinterByPrinterId"); }
    public boolean hasConditionQueryPPrinterByPrinterId() { return xhasQueRlMap("pPrinterByPrinterId"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrinterAttributeCQ queryPPrinterAttributeByPrinterAttributeId() {
        return xdfgetConditionQueryPPrinterAttributeByPrinterAttributeId();
    }
    public PPrinterAttributeCQ xdfgetConditionQueryPPrinterAttributeByPrinterAttributeId() {
        String prop = "pPrinterAttributeByPrinterAttributeId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrinterAttributeByPrinterAttributeId()); xsetupOuterJoinPPrinterAttributeByPrinterAttributeId(); }
        return xgetQueRlMap(prop);
    }
    protected PPrinterAttributeCQ xcreateQueryPPrinterAttributeByPrinterAttributeId() {
        String nrp = xresolveNRP("P_USER_AUTO_PRINT_SETTING", "pPrinterAttributeByPrinterAttributeId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterAttributeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinterAttributeByPrinterAttributeId", nrp);
    }
    protected void xsetupOuterJoinPPrinterAttributeByPrinterAttributeId() { xregOutJo("pPrinterAttributeByPrinterAttributeId"); }
    public boolean hasConditionQueryPPrinterAttributeByPrinterAttributeId() { return xhasQueRlMap("pPrinterAttributeByPrinterAttributeId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PUserAutoPrintSettingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PUserAutoPrintSettingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PUserAutoPrintSettingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PUserAutoPrintSettingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PUserAutoPrintSettingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PUserAutoPrintSettingCQ> _myselfExistsMap;
    public Map<String, PUserAutoPrintSettingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PUserAutoPrintSettingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PUserAutoPrintSettingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PUserAutoPrintSettingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PUserAutoPrintSettingCB.class.getName(); }
    protected String xCQ() { return PUserAutoPrintSettingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
