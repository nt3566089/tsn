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
 * The base condition-query of P_LAYOUT_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public class BsPLayoutPrintSettingCQ extends AbstractBsPLayoutPrintSettingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PLayoutPrintSettingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPLayoutPrintSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_LAYOUT_PRINT_SETTING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PLayoutPrintSettingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PLayoutPrintSettingCIQ xcreateCIQ() {
        PLayoutPrintSettingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PLayoutPrintSettingCIQ xnewCIQ() {
        return new PLayoutPrintSettingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_LAYOUT_PRINT_SETTING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PLayoutPrintSettingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PLayoutPrintSettingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _layoutPrintSettingId;
    public ConditionValue xdfgetLayoutPrintSettingId()
    { if (_layoutPrintSettingId == null) { _layoutPrintSettingId = nCV(); }
      return _layoutPrintSettingId; }
    protected ConditionValue xgetCValueLayoutPrintSettingId() { return xdfgetLayoutPrintSettingId(); }

    /**
     * Add order-by as ascend. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_LayoutPrintSettingId_Asc() { regOBA("LAYOUT_PRINT_SETTING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_LayoutPrintSettingId_Desc() { regOBD("LAYOUT_PRINT_SETTING_ID"); return this; }

    protected ConditionValue _reportLayoutId;
    public ConditionValue xdfgetReportLayoutId()
    { if (_reportLayoutId == null) { _reportLayoutId = nCV(); }
      return _reportLayoutId; }
    protected ConditionValue xgetCValueReportLayoutId() { return xdfgetReportLayoutId(); }

    public Map<String, PReportLayoutCQ> getReportLayoutId_InScopeRelation_PReportLayout() { return xgetSQueMap("reportLayoutId_InScopeRelation_PReportLayout"); }
    public String keepReportLayoutId_InScopeRelation_PReportLayout(PReportLayoutCQ sq) { return xkeepSQue("reportLayoutId_InScopeRelation_PReportLayout", sq); }

    public Map<String, PReportLayoutCQ> getReportLayoutId_NotInScopeRelation_PReportLayout() { return xgetSQueMap("reportLayoutId_NotInScopeRelation_PReportLayout"); }
    public String keepReportLayoutId_NotInScopeRelation_PReportLayout(PReportLayoutCQ sq) { return xkeepSQue("reportLayoutId_NotInScopeRelation_PReportLayout", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_ReportLayoutId_Asc() { regOBA("REPORT_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_ReportLayoutId_Desc() { regOBD("REPORT_LAYOUT_ID"); return this; }

    protected ConditionValue _printerGroupId;
    public ConditionValue xdfgetPrinterGroupId()
    { if (_printerGroupId == null) { _printerGroupId = nCV(); }
      return _printerGroupId; }
    protected ConditionValue xgetCValuePrinterGroupId() { return xdfgetPrinterGroupId(); }

    public Map<String, PPrinterGroupCQ> getPrinterGroupId_InScopeRelation_PPrinterGroup() { return xgetSQueMap("printerGroupId_InScopeRelation_PPrinterGroup"); }
    public String keepPrinterGroupId_InScopeRelation_PPrinterGroup(PPrinterGroupCQ sq) { return xkeepSQue("printerGroupId_InScopeRelation_PPrinterGroup", sq); }

    public Map<String, PPrinterGroupCQ> getPrinterGroupId_NotInScopeRelation_PPrinterGroup() { return xgetSQueMap("printerGroupId_NotInScopeRelation_PPrinterGroup"); }
    public String keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(PPrinterGroupCQ sq) { return xkeepSQue("printerGroupId_NotInScopeRelation_PPrinterGroup", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printerId;
    public ConditionValue xdfgetPrinterId()
    { if (_printerId == null) { _printerId = nCV(); }
      return _printerId; }
    protected ConditionValue xgetCValuePrinterId() { return xdfgetPrinterId(); }

    public Map<String, PPrinterCQ> getPrinterId_InScopeRelation_PPrinter() { return xgetSQueMap("printerId_InScopeRelation_PPrinter"); }
    public String keepPrinterId_InScopeRelation_PPrinter(PPrinterCQ sq) { return xkeepSQue("printerId_InScopeRelation_PPrinter", sq); }

    public Map<String, PPrinterCQ> getPrinterId_NotInScopeRelation_PPrinter() { return xgetSQueMap("printerId_NotInScopeRelation_PPrinter"); }
    public String keepPrinterId_NotInScopeRelation_PPrinter(PPrinterCQ sq) { return xkeepSQue("printerId_NotInScopeRelation_PPrinter", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrinterId_Asc() { regOBA("PRINTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrinterId_Desc() { regOBD("PRINTER_ID"); return this; }

    protected ConditionValue _printerAttributeId;
    public ConditionValue xdfgetPrinterAttributeId()
    { if (_printerAttributeId == null) { _printerAttributeId = nCV(); }
      return _printerAttributeId; }
    protected ConditionValue xgetCValuePrinterAttributeId() { return xdfgetPrinterAttributeId(); }

    public Map<String, PPrinterAttributeCQ> getPrinterAttributeId_InScopeRelation_PPrinterAttribute() { return xgetSQueMap("printerAttributeId_InScopeRelation_PPrinterAttribute"); }
    public String keepPrinterAttributeId_InScopeRelation_PPrinterAttribute(PPrinterAttributeCQ sq) { return xkeepSQue("printerAttributeId_InScopeRelation_PPrinterAttribute", sq); }

    public Map<String, PPrinterAttributeCQ> getPrinterAttributeId_NotInScopeRelation_PPrinterAttribute() { return xgetSQueMap("printerAttributeId_NotInScopeRelation_PPrinterAttribute"); }
    public String keepPrinterAttributeId_NotInScopeRelation_PPrinterAttribute(PPrinterAttributeCQ sq) { return xkeepSQue("printerAttributeId_NotInScopeRelation_PPrinterAttribute", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrinterAttributeId_Asc() { regOBA("PRINTER_ATTRIBUTE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrinterAttributeId_Desc() { regOBD("PRINTER_ATTRIBUTE_ID"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_PrintNum_Asc() { regOBA("PRINT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_PrintNum_Desc() { regOBD("PRINT_NUM"); return this; }

    protected ConditionValue _sheetCollate;
    public ConditionValue xdfgetSheetCollate()
    { if (_sheetCollate == null) { _sheetCollate = nCV(); }
      return _sheetCollate; }
    protected ConditionValue xgetCValueSheetCollate() { return xdfgetSheetCollate(); }

    /**
     * Add order-by as ascend. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_SheetCollate_Asc() { regOBA("SHEET_COLLATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_SheetCollate_Desc() { regOBD("SHEET_COLLATE"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPLayoutPrintSettingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPLayoutPrintSettingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPLayoutPrintSettingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPLayoutPrintSettingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PLayoutPrintSettingCQ bq = (PLayoutPrintSettingCQ)bqs;
        PLayoutPrintSettingCQ uq = (PLayoutPrintSettingCQ)uqs;
        if (bq.hasConditionQueryPPrinterAttribute()) {
            uq.queryPPrinterAttribute().reflectRelationOnUnionQuery(bq.queryPPrinterAttribute(), uq.queryPPrinterAttribute());
        }
        if (bq.hasConditionQueryPPrinterGroup()) {
            uq.queryPPrinterGroup().reflectRelationOnUnionQuery(bq.queryPPrinterGroup(), uq.queryPPrinterGroup());
        }
        if (bq.hasConditionQueryPPrinter()) {
            uq.queryPPrinter().reflectRelationOnUnionQuery(bq.queryPPrinter(), uq.queryPPrinter());
        }
        if (bq.hasConditionQueryPReportLayout()) {
            uq.queryPReportLayout().reflectRelationOnUnionQuery(bq.queryPReportLayout(), uq.queryPReportLayout());
        }
        if (bq.hasConditionQueryBClassDtlBySheetCollate()) {
            uq.queryBClassDtlBySheetCollate().reflectRelationOnUnionQuery(bq.queryBClassDtlBySheetCollate(), uq.queryBClassDtlBySheetCollate());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrinterAttributeCQ queryPPrinterAttribute() {
        return xdfgetConditionQueryPPrinterAttribute();
    }
    public PPrinterAttributeCQ xdfgetConditionQueryPPrinterAttribute() {
        String prop = "pPrinterAttribute";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrinterAttribute()); xsetupOuterJoinPPrinterAttribute(); }
        return xgetQueRlMap(prop);
    }
    protected PPrinterAttributeCQ xcreateQueryPPrinterAttribute() {
        String nrp = xresolveNRP("P_LAYOUT_PRINT_SETTING", "pPrinterAttribute"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterAttributeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinterAttribute", nrp);
    }
    protected void xsetupOuterJoinPPrinterAttribute() { xregOutJo("pPrinterAttribute"); }
    public boolean hasConditionQueryPPrinterAttribute() { return xhasQueRlMap("pPrinterAttribute"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrinterGroupCQ queryPPrinterGroup() {
        return xdfgetConditionQueryPPrinterGroup();
    }
    public PPrinterGroupCQ xdfgetConditionQueryPPrinterGroup() {
        String prop = "pPrinterGroup";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrinterGroup()); xsetupOuterJoinPPrinterGroup(); }
        return xgetQueRlMap(prop);
    }
    protected PPrinterGroupCQ xcreateQueryPPrinterGroup() {
        String nrp = xresolveNRP("P_LAYOUT_PRINT_SETTING", "pPrinterGroup"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterGroupCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinterGroup", nrp);
    }
    protected void xsetupOuterJoinPPrinterGroup() { xregOutJo("pPrinterGroup"); }
    public boolean hasConditionQueryPPrinterGroup() { return xhasQueRlMap("pPrinterGroup"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @return The instance of condition-query. (NotNull)
     */
    public PPrinterCQ queryPPrinter() {
        return xdfgetConditionQueryPPrinter();
    }
    public PPrinterCQ xdfgetConditionQueryPPrinter() {
        String prop = "pPrinter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPPrinter()); xsetupOuterJoinPPrinter(); }
        return xgetQueRlMap(prop);
    }
    protected PPrinterCQ xcreateQueryPPrinter() {
        String nrp = xresolveNRP("P_LAYOUT_PRINT_SETTING", "pPrinter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinter", nrp);
    }
    protected void xsetupOuterJoinPPrinter() { xregOutJo("pPrinter"); }
    public boolean hasConditionQueryPPrinter() { return xhasQueRlMap("pPrinter"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @return The instance of condition-query. (NotNull)
     */
    public PReportLayoutCQ queryPReportLayout() {
        return xdfgetConditionQueryPReportLayout();
    }
    public PReportLayoutCQ xdfgetConditionQueryPReportLayout() {
        String prop = "pReportLayout";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPReportLayout()); xsetupOuterJoinPReportLayout(); }
        return xgetQueRlMap(prop);
    }
    protected PReportLayoutCQ xcreateQueryPReportLayout() {
        String nrp = xresolveNRP("P_LAYOUT_PRINT_SETTING", "pReportLayout"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PReportLayoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pReportLayout", nrp);
    }
    protected void xsetupOuterJoinPReportLayout() { xregOutJo("pReportLayout"); }
    public boolean hasConditionQueryPReportLayout() { return xhasQueRlMap("pReportLayout"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySheetCollate() {
        return xdfgetConditionQueryBClassDtlBySheetCollate();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySheetCollate() {
        String prop = "bClassDtlBySheetCollate";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySheetCollate()); xsetupOuterJoinBClassDtlBySheetCollate(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySheetCollate() {
        String nrp = xresolveNRP("P_LAYOUT_PRINT_SETTING", "bClassDtlBySheetCollate"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySheetCollate", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySheetCollate() { xregOutJo("bClassDtlBySheetCollate"); }
    public boolean hasConditionQueryBClassDtlBySheetCollate() { return xhasQueRlMap("bClassDtlBySheetCollate"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PLayoutPrintSettingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PLayoutPrintSettingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PLayoutPrintSettingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PLayoutPrintSettingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PLayoutPrintSettingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PLayoutPrintSettingCQ> _myselfExistsMap;
    public Map<String, PLayoutPrintSettingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PLayoutPrintSettingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PLayoutPrintSettingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PLayoutPrintSettingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PLayoutPrintSettingCB.class.getName(); }
    protected String xCQ() { return PLayoutPrintSettingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
