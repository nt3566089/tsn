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
 * The base condition-query of P_PRINTER.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrinterCQ extends AbstractBsPPrinterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrinterCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrinterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINTER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrinterCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrinterCIQ xcreateCIQ() {
        PPrinterCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrinterCIQ xnewCIQ() {
        return new PPrinterCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINTER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrinterCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrinterCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printerId;
    public ConditionValue xdfgetPrinterId()
    { if (_printerId == null) { _printerId = nCV(); }
      return _printerId; }
    protected ConditionValue xgetCValuePrinterId() { return xdfgetPrinterId(); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterId_ExistsReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerId_ExistsReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerId_ExistsReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PPrinterAttributeCQ> xdfgetPrinterId_ExistsReferrer_PPrinterAttributeList() { return xgetSQueMap("printerId_ExistsReferrer_PPrinterAttributeList"); }
    public String keepPrinterId_ExistsReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq) { return xkeepSQue("printerId_ExistsReferrer_PPrinterAttributeList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterId_ExistsReferrer_PUserAutoPrintSettingByPrinterIdList() { return xgetSQueMap("printerId_ExistsReferrer_PUserAutoPrintSettingByPrinterIdList"); }
    public String keepPrinterId_ExistsReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerId_ExistsReferrer_PUserAutoPrintSettingByPrinterIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterId_ExistsReferrer_PTerminalAutoPrintSetByPrinterIdList() { return xgetSQueMap("printerId_ExistsReferrer_PTerminalAutoPrintSetByPrinterIdList"); }
    public String keepPrinterId_ExistsReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerId_ExistsReferrer_PTerminalAutoPrintSetByPrinterIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterId_NotExistsReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerId_NotExistsReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerId_NotExistsReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PPrinterAttributeCQ> xdfgetPrinterId_NotExistsReferrer_PPrinterAttributeList() { return xgetSQueMap("printerId_NotExistsReferrer_PPrinterAttributeList"); }
    public String keepPrinterId_NotExistsReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq) { return xkeepSQue("printerId_NotExistsReferrer_PPrinterAttributeList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterId_NotExistsReferrer_PUserAutoPrintSettingByPrinterIdList() { return xgetSQueMap("printerId_NotExistsReferrer_PUserAutoPrintSettingByPrinterIdList"); }
    public String keepPrinterId_NotExistsReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerId_NotExistsReferrer_PUserAutoPrintSettingByPrinterIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterIdList() { return xgetSQueMap("printerId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterIdList"); }
    public String keepPrinterId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterId_SpecifyDerivedReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerId_SpecifyDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerId_SpecifyDerivedReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PPrinterAttributeCQ> xdfgetPrinterId_SpecifyDerivedReferrer_PPrinterAttributeList() { return xgetSQueMap("printerId_SpecifyDerivedReferrer_PPrinterAttributeList"); }
    public String keepPrinterId_SpecifyDerivedReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq) { return xkeepSQue("printerId_SpecifyDerivedReferrer_PPrinterAttributeList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterIdList() { return xgetSQueMap("printerId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterIdList"); }
    public String keepPrinterId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList() { return xgetSQueMap("printerId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList"); }
    public String keepPrinterId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterId_QueryDerivedReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerId_QueryDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerId_QueryDerivedReferrer_PLayoutPrintSettingList", sq); }
    public Map<String, Object> xdfgetPrinterId_QueryDerivedReferrer_PLayoutPrintSettingListParameter() { return xgetSQuePmMap("printerId_QueryDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object pm) { return xkeepSQuePm("printerId_QueryDerivedReferrer_PLayoutPrintSettingList", pm); }

    public Map<String, PPrinterAttributeCQ> xdfgetPrinterId_QueryDerivedReferrer_PPrinterAttributeList() { return xgetSQueMap("printerId_QueryDerivedReferrer_PPrinterAttributeList"); }
    public String keepPrinterId_QueryDerivedReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq) { return xkeepSQue("printerId_QueryDerivedReferrer_PPrinterAttributeList", sq); }
    public Map<String, Object> xdfgetPrinterId_QueryDerivedReferrer_PPrinterAttributeListParameter() { return xgetSQuePmMap("printerId_QueryDerivedReferrer_PPrinterAttributeList"); }
    public String keepPrinterId_QueryDerivedReferrer_PPrinterAttributeListParameter(Object pm) { return xkeepSQuePm("printerId_QueryDerivedReferrer_PPrinterAttributeList", pm); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList() { return xgetSQueMap("printerId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList"); }
    public String keepPrinterId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList", sq); }
    public Map<String, Object> xdfgetPrinterId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdListParameter() { return xgetSQuePmMap("printerId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList"); }
    public String keepPrinterId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdListParameter(Object pm) { return xkeepSQuePm("printerId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList", pm); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList() { return xgetSQueMap("printerId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList"); }
    public String keepPrinterId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList", sq); }
    public Map<String, Object> xdfgetPrinterId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdListParameter() { return xgetSQuePmMap("printerId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList"); }
    public String keepPrinterId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdListParameter(Object pm) { return xkeepSQuePm("printerId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_PrinterId_Asc() { regOBA("PRINTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_PrinterId_Desc() { regOBD("PRINTER_ID"); return this; }

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
     * PRINTER_GROUP_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printerNm;
    public ConditionValue xdfgetPrinterNm()
    { if (_printerNm == null) { _printerNm = nCV(); }
      return _printerNm; }
    protected ConditionValue xgetCValuePrinterNm() { return xdfgetPrinterNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_NM: {+UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_PrinterNm_Asc() { regOBA("PRINTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_NM: {+UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_PrinterNm_Desc() { regOBD("PRINTER_NM"); return this; }

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
    public BsPPrinterCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

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
    public BsPPrinterCQ addOrderBy_AddTerminal_Asc() { regOBA("ADD_TERMINAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_TERMINAL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_AddTerminal_Desc() { regOBD("ADD_TERMINAL"); return this; }

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
    public BsPPrinterCQ addOrderBy_UpdTerminal_Asc() { regOBA("UPD_TERMINAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TERMINAL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_UpdTerminal_Desc() { regOBD("UPD_TERMINAL"); return this; }

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
    public BsPPrinterCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrinterCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrinterCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrinterCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrinterCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrinterCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrinterCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrinterCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrinterCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrinterCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrinterCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrinterCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrinterCQ bq = (PPrinterCQ)bqs;
        PPrinterCQ uq = (PPrinterCQ)uqs;
        if (bq.hasConditionQueryPPrinterGroup()) {
            uq.queryPPrinterGroup().reflectRelationOnUnionQuery(bq.queryPPrinterGroup(), uq.queryPPrinterGroup());
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
        String nrp = xresolveNRP("P_PRINTER", "pPrinterGroup"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrinterGroupCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrinterGroup", nrp);
    }
    protected void xsetupOuterJoinPPrinterGroup() { xregOutJo("pPrinterGroup"); }
    public boolean hasConditionQueryPPrinterGroup() { return xhasQueRlMap("pPrinterGroup"); }

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
        String nrp = xresolveNRP("P_PRINTER", "bClassDtlByVisible"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, PPrinterCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrinterCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrinterCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrinterCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrinterCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrinterCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrinterCQ> _myselfExistsMap;
    public Map<String, PPrinterCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrinterCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrinterCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrinterCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrinterCB.class.getName(); }
    protected String xCQ() { return PPrinterCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
