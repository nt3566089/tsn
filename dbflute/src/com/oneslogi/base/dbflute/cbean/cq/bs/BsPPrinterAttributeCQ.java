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
 * The base condition-query of P_PRINTER_ATTRIBUTE.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrinterAttributeCQ extends AbstractBsPPrinterAttributeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrinterAttributeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrinterAttributeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINTER_ATTRIBUTE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrinterAttributeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrinterAttributeCIQ xcreateCIQ() {
        PPrinterAttributeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrinterAttributeCIQ xnewCIQ() {
        return new PPrinterAttributeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINTER_ATTRIBUTE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrinterAttributeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrinterAttributeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printerAttributeId;
    public ConditionValue xdfgetPrinterAttributeId()
    { if (_printerAttributeId == null) { _printerAttributeId = nCV(); }
      return _printerAttributeId; }
    protected ConditionValue xgetCValuePrinterAttributeId() { return xdfgetPrinterAttributeId(); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterAttributeId_ExistsReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerAttributeId_ExistsReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterAttributeId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_ExistsReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterAttributeId_NotExistsReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerAttributeId_NotExistsReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterAttributeId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_NotExistsReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList", sq); }
    public Map<String, Object> xdfgetPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingListParameter() { return xgetSQuePmMap("printerAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object pm) { return xkeepSQuePm("printerAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList", pm); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList", sq); }
    public Map<String, Object> xdfgetPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdListParameter() { return xgetSQuePmMap("printerAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdListParameter(Object pm) { return xkeepSQuePm("printerAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList", pm); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList() { return xgetSQueMap("printerAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList", sq); }
    public Map<String, Object> xdfgetPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdListParameter() { return xgetSQuePmMap("printerAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList"); }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdListParameter(Object pm) { return xkeepSQuePm("printerAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_PrinterAttributeId_Asc() { regOBA("PRINTER_ATTRIBUTE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_PrinterAttributeId_Desc() { regOBD("PRINTER_ATTRIBUTE_ID"); return this; }

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
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_PrinterId_Asc() { regOBA("PRINTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_PrinterId_Desc() { regOBD("PRINTER_ID"); return this; }

    protected ConditionValue _trayNm;
    public ConditionValue xdfgetTrayNm()
    { if (_trayNm == null) { _trayNm = nCV(); }
      return _trayNm; }
    protected ConditionValue xgetCValueTrayNm() { return xdfgetTrayNm(); }

    /**
     * Add order-by as ascend. <br>
     * TRAY_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_TrayNm_Asc() { regOBA("TRAY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRAY_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_TrayNm_Desc() { regOBD("TRAY_NM"); return this; }

    protected ConditionValue _visible;
    public ConditionValue xdfgetVisible()
    { if (_visible == null) { _visible = nCV(); }
      return _visible; }
    protected ConditionValue xgetCValueVisible() { return xdfgetVisible(); }

    /**
     * Add order-by as ascend. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

    protected ConditionValue _addTerminal;
    public ConditionValue xdfgetAddTerminal()
    { if (_addTerminal == null) { _addTerminal = nCV(); }
      return _addTerminal; }
    protected ConditionValue xgetCValueAddTerminal() { return xdfgetAddTerminal(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_AddTerminal_Asc() { regOBA("ADD_TERMINAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_AddTerminal_Desc() { regOBD("ADD_TERMINAL"); return this; }

    protected ConditionValue _updTerminal;
    public ConditionValue xdfgetUpdTerminal()
    { if (_updTerminal == null) { _updTerminal = nCV(); }
      return _updTerminal; }
    protected ConditionValue xgetCValueUpdTerminal() { return xdfgetUpdTerminal(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_UpdTerminal_Asc() { regOBA("UPD_TERMINAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_UpdTerminal_Desc() { regOBD("UPD_TERMINAL"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrinterAttributeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrinterAttributeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrinterAttributeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrinterAttributeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrinterAttributeCQ bq = (PPrinterAttributeCQ)bqs;
        PPrinterAttributeCQ uq = (PPrinterAttributeCQ)uqs;
        if (bq.hasConditionQueryPPrinter()) {
            uq.queryPPrinter().reflectRelationOnUnionQuery(bq.queryPPrinter(), uq.queryPPrinter());
        }
        if (bq.hasConditionQueryBClassDtlByVisible()) {
            uq.queryBClassDtlByVisible().reflectRelationOnUnionQuery(bq.queryBClassDtlByVisible(), uq.queryBClassDtlByVisible());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("P_PRINTER_ATTRIBUTE", "pPrinter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinter", nrp);
    }
    protected void xsetupOuterJoinPPrinter() { xregOutJo("pPrinter"); }
    public boolean hasConditionQueryPPrinter() { return xhasQueRlMap("pPrinter"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByVisible() {
        return xdfgetConditionQueryBClassDtlByVisible();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByVisible() {
        String prop = "bClassDtlByVisible";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByVisible()); xsetupOuterJoinBClassDtlByVisible(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByVisible() {
        String nrp = xresolveNRP("P_PRINTER_ATTRIBUTE", "bClassDtlByVisible"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByVisible", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByVisible() { xregOutJo("bClassDtlByVisible"); }
    public boolean hasConditionQueryBClassDtlByVisible() { return xhasQueRlMap("bClassDtlByVisible"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PPrinterAttributeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrinterAttributeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrinterAttributeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrinterAttributeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrinterAttributeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrinterAttributeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrinterAttributeCQ> _myselfExistsMap;
    public Map<String, PPrinterAttributeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrinterAttributeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrinterAttributeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrinterAttributeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrinterAttributeCB.class.getName(); }
    protected String xCQ() { return PPrinterAttributeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
