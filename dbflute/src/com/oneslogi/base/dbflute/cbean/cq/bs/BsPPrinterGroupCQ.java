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
 * The base condition-query of P_PRINTER_GROUP.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrinterGroupCQ extends AbstractBsPPrinterGroupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrinterGroupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrinterGroupCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINTER_GROUP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrinterGroupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrinterGroupCIQ xcreateCIQ() {
        PPrinterGroupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrinterGroupCIQ xnewCIQ() {
        return new PPrinterGroupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINTER_GROUP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrinterGroupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrinterGroupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printerGroupId;
    public ConditionValue xdfgetPrinterGroupId()
    { if (_printerGroupId == null) { _printerGroupId = nCV(); }
      return _printerGroupId; }
    protected ConditionValue xgetCValuePrinterGroupId() { return xdfgetPrinterGroupId(); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterGroupId_ExistsReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerGroupId_ExistsReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterGroupId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerGroupId_ExistsReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PPrinterCQ> xdfgetPrinterGroupId_ExistsReferrer_PPrinterList() { return xgetSQueMap("printerGroupId_ExistsReferrer_PPrinterList"); }
    public String keepPrinterGroupId_ExistsReferrer_PPrinterList(PPrinterCQ sq) { return xkeepSQue("printerGroupId_ExistsReferrer_PPrinterList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList"); }
    public String keepPrinterGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList"); }
    public String keepPrinterGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterGroupId_NotExistsReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerGroupId_NotExistsReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterGroupId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerGroupId_NotExistsReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PPrinterCQ> xdfgetPrinterGroupId_NotExistsReferrer_PPrinterList() { return xgetSQueMap("printerGroupId_NotExistsReferrer_PPrinterList"); }
    public String keepPrinterGroupId_NotExistsReferrer_PPrinterList(PPrinterCQ sq) { return xkeepSQue("printerGroupId_NotExistsReferrer_PPrinterList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList"); }
    public String keepPrinterGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList"); }
    public String keepPrinterGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList", sq); }

    public Map<String, PPrinterCQ> xdfgetPrinterGroupId_SpecifyDerivedReferrer_PPrinterList() { return xgetSQueMap("printerGroupId_SpecifyDerivedReferrer_PPrinterList"); }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PPrinterList(PPrinterCQ sq) { return xkeepSQue("printerGroupId_SpecifyDerivedReferrer_PPrinterList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList"); }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList"); }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingList() { return xgetSQueMap("printerGroupId_QueryDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq) { return xkeepSQue("printerGroupId_QueryDerivedReferrer_PLayoutPrintSettingList", sq); }
    public Map<String, Object> xdfgetPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingListParameter() { return xgetSQuePmMap("printerGroupId_QueryDerivedReferrer_PLayoutPrintSettingList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object pm) { return xkeepSQuePm("printerGroupId_QueryDerivedReferrer_PLayoutPrintSettingList", pm); }

    public Map<String, PPrinterCQ> xdfgetPrinterGroupId_QueryDerivedReferrer_PPrinterList() { return xgetSQueMap("printerGroupId_QueryDerivedReferrer_PPrinterList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PPrinterList(PPrinterCQ sq) { return xkeepSQue("printerGroupId_QueryDerivedReferrer_PPrinterList", sq); }
    public Map<String, Object> xdfgetPrinterGroupId_QueryDerivedReferrer_PPrinterListParameter() { return xgetSQuePmMap("printerGroupId_QueryDerivedReferrer_PPrinterList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PPrinterListParameter(Object pm) { return xkeepSQuePm("printerGroupId_QueryDerivedReferrer_PPrinterList", pm); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("printerGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList", sq); }
    public Map<String, Object> xdfgetPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdListParameter() { return xgetSQuePmMap("printerGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdListParameter(Object pm) { return xkeepSQuePm("printerGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList", pm); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList() { return xgetSQueMap("printerGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("printerGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList", sq); }
    public Map<String, Object> xdfgetPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdListParameter() { return xgetSQuePmMap("printerGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList"); }
    public String keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdListParameter(Object pm) { return xkeepSQuePm("printerGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printerGroupNm;
    public ConditionValue xdfgetPrinterGroupNm()
    { if (_printerGroupNm == null) { _printerGroupNm = nCV(); }
      return _printerGroupNm; }
    protected ConditionValue xgetCValuePrinterGroupNm() { return xdfgetPrinterGroupNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_PrinterGroupNm_Asc() { regOBA("PRINTER_GROUP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_PrinterGroupNm_Desc() { regOBD("PRINTER_GROUP_NM"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_Attribute1_Asc() { regOBA("ATTRIBUTE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_Attribute1_Desc() { regOBD("ATTRIBUTE1"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_Attribute2_Asc() { regOBA("ATTRIBUTE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_Attribute2_Desc() { regOBD("ATTRIBUTE2"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_Attribute3_Asc() { regOBA("ATTRIBUTE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_Attribute3_Desc() { regOBD("ATTRIBUTE3"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_Attribute4_Asc() { regOBA("ATTRIBUTE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_Attribute4_Desc() { regOBD("ATTRIBUTE4"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_Attribute5_Asc() { regOBA("ATTRIBUTE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_Attribute5_Desc() { regOBD("ATTRIBUTE5"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrinterGroupCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrinterGroupCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrinterGroupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrinterGroupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, PPrinterGroupCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrinterGroupCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrinterGroupCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrinterGroupCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrinterGroupCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrinterGroupCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrinterGroupCQ> _myselfExistsMap;
    public Map<String, PPrinterGroupCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrinterGroupCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrinterGroupCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrinterGroupCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrinterGroupCB.class.getName(); }
    protected String xCQ() { return PPrinterGroupCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
