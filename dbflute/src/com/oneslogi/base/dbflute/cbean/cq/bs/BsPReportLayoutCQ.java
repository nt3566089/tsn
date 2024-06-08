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
 * The base condition-query of P_REPORT_LAYOUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsPReportLayoutCQ extends AbstractBsPReportLayoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PReportLayoutCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPReportLayoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_REPORT_LAYOUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PReportLayoutCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PReportLayoutCIQ xcreateCIQ() {
        PReportLayoutCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PReportLayoutCIQ xnewCIQ() {
        return new PReportLayoutCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_REPORT_LAYOUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PReportLayoutCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PReportLayoutCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _reportLayoutId;
    public ConditionValue xdfgetReportLayoutId()
    { if (_reportLayoutId == null) { _reportLayoutId = nCV(); }
      return _reportLayoutId; }
    protected ConditionValue xgetCValueReportLayoutId() { return xdfgetReportLayoutId(); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetReportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne() { return xgetSQueMap("reportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne"); }
    public String keepReportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne(PLayoutPrintSettingCQ sq) { return xkeepSQue("reportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetReportLayoutId_ExistsReferrer_PReportLayoutItemList() { return xgetSQueMap("reportLayoutId_ExistsReferrer_PReportLayoutItemList"); }
    public String keepReportLayoutId_ExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("reportLayoutId_ExistsReferrer_PReportLayoutItemList", sq); }

    public Map<String, PSubrepLayoutCQ> xdfgetReportLayoutId_ExistsReferrer_PSubrepLayoutAsOne() { return xgetSQueMap("reportLayoutId_ExistsReferrer_PSubrepLayoutAsOne"); }
    public String keepReportLayoutId_ExistsReferrer_PSubrepLayoutAsOne(PSubrepLayoutCQ sq) { return xkeepSQue("reportLayoutId_ExistsReferrer_PSubrepLayoutAsOne", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetReportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList"); }
    public String keepReportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("reportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetReportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList"); }
    public String keepReportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("reportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList", sq); }

    public Map<String, PLayoutPrintSettingCQ> xdfgetReportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne() { return xgetSQueMap("reportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne"); }
    public String keepReportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne(PLayoutPrintSettingCQ sq) { return xkeepSQue("reportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetReportLayoutId_NotExistsReferrer_PReportLayoutItemList() { return xgetSQueMap("reportLayoutId_NotExistsReferrer_PReportLayoutItemList"); }
    public String keepReportLayoutId_NotExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("reportLayoutId_NotExistsReferrer_PReportLayoutItemList", sq); }

    public Map<String, PSubrepLayoutCQ> xdfgetReportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne() { return xgetSQueMap("reportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne"); }
    public String keepReportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne(PSubrepLayoutCQ sq) { return xkeepSQue("reportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetReportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList"); }
    public String keepReportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("reportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetReportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList"); }
    public String keepReportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("reportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetReportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList() { return xgetSQueMap("reportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList"); }
    public String keepReportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("reportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList", sq); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetReportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList"); }
    public String keepReportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("reportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList", sq); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetReportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList"); }
    public String keepReportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("reportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetReportLayoutId_QueryDerivedReferrer_PReportLayoutItemList() { return xgetSQueMap("reportLayoutId_QueryDerivedReferrer_PReportLayoutItemList"); }
    public String keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("reportLayoutId_QueryDerivedReferrer_PReportLayoutItemList", sq); }
    public Map<String, Object> xdfgetReportLayoutId_QueryDerivedReferrer_PReportLayoutItemListParameter() { return xgetSQuePmMap("reportLayoutId_QueryDerivedReferrer_PReportLayoutItemList"); }
    public String keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemListParameter(Object pm) { return xkeepSQuePm("reportLayoutId_QueryDerivedReferrer_PReportLayoutItemList", pm); }

    public Map<String, PUserAutoPrintSettingCQ> xdfgetReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList"); }
    public String keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq) { return xkeepSQue("reportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList", sq); }
    public Map<String, Object> xdfgetReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdListParameter() { return xgetSQuePmMap("reportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList"); }
    public String keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdListParameter(Object pm) { return xkeepSQuePm("reportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList", pm); }

    public Map<String, PTerminalAutoPrintSetCQ> xdfgetReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList() { return xgetSQueMap("reportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList"); }
    public String keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq) { return xkeepSQue("reportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList", sq); }
    public Map<String, Object> xdfgetReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdListParameter() { return xgetSQuePmMap("reportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList"); }
    public String keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdListParameter(Object pm) { return xkeepSQuePm("reportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportLayoutId_Asc() { regOBA("REPORT_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportLayoutId_Desc() { regOBD("REPORT_LAYOUT_ID"); return this; }

    protected ConditionValue _reportId;
    public ConditionValue xdfgetReportId()
    { if (_reportId == null) { _reportId = nCV(); }
      return _reportId; }
    protected ConditionValue xgetCValueReportId() { return xdfgetReportId(); }

    public Map<String, PReportCQ> getReportId_InScopeRelation_PReport() { return xgetSQueMap("reportId_InScopeRelation_PReport"); }
    public String keepReportId_InScopeRelation_PReport(PReportCQ sq) { return xkeepSQue("reportId_InScopeRelation_PReport", sq); }

    public Map<String, PReportCQ> getReportId_NotInScopeRelation_PReport() { return xgetSQueMap("reportId_NotInScopeRelation_PReport"); }
    public String keepReportId_NotInScopeRelation_PReport(PReportCQ sq) { return xkeepSQue("reportId_NotInScopeRelation_PReport", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportId_Asc() { regOBA("REPORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportId_Desc() { regOBD("REPORT_ID"); return this; }

    protected ConditionValue _reportLayoutNm;
    public ConditionValue xdfgetReportLayoutNm()
    { if (_reportLayoutNm == null) { _reportLayoutNm = nCV(); }
      return _reportLayoutNm; }
    protected ConditionValue xgetCValueReportLayoutNm() { return xdfgetReportLayoutNm(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportLayoutNm_Asc() { regOBA("REPORT_LAYOUT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportLayoutNm_Desc() { regOBD("REPORT_LAYOUT_NM"); return this; }

    protected ConditionValue _reportLayoutData;
    public ConditionValue xdfgetReportLayoutData()
    { if (_reportLayoutData == null) { _reportLayoutData = nCV(); }
      return _reportLayoutData; }
    protected ConditionValue xgetCValueReportLayoutData() { return xdfgetReportLayoutData(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportLayoutData_Asc() { regOBA("REPORT_LAYOUT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ReportLayoutData_Desc() { regOBD("REPORT_LAYOUT_DATA"); return this; }

    protected ConditionValue _updatable;
    public ConditionValue xdfgetUpdatable()
    { if (_updatable == null) { _updatable = nCV(); }
      return _updatable; }
    protected ConditionValue xgetCValueUpdatable() { return xdfgetUpdatable(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Updatable_Asc() { regOBA("UPDATABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Updatable_Desc() { regOBD("UPDATABLE"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_Attribute1_Asc() { regOBA("ATTRIBUTE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE1: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Attribute1_Desc() { regOBD("ATTRIBUTE1"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_Attribute2_Asc() { regOBA("ATTRIBUTE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE2: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Attribute2_Desc() { regOBD("ATTRIBUTE2"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_Attribute3_Asc() { regOBA("ATTRIBUTE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE3: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Attribute3_Desc() { regOBD("ATTRIBUTE3"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_Attribute4_Asc() { regOBA("ATTRIBUTE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE4: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Attribute4_Desc() { regOBD("ATTRIBUTE4"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_Attribute5_Asc() { regOBA("ATTRIBUTE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * ATTRIBUTE5: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_Attribute5_Desc() { regOBD("ATTRIBUTE5"); return this; }

    protected ConditionValue _autoPrintTargetFlg;
    public ConditionValue xdfgetAutoPrintTargetFlg()
    { if (_autoPrintTargetFlg == null) { _autoPrintTargetFlg = nCV(); }
      return _autoPrintTargetFlg; }
    protected ConditionValue xgetCValueAutoPrintTargetFlg() { return xdfgetAutoPrintTargetFlg(); }

    /**
     * Add order-by as ascend. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_AutoPrintTargetFlg_Asc() { regOBA("AUTO_PRINT_TARGET_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_AutoPrintTargetFlg_Desc() { regOBD("AUTO_PRINT_TARGET_FLG"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPReportLayoutCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPReportLayoutCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPReportLayoutCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPReportLayoutCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PReportLayoutCQ bq = (PReportLayoutCQ)bqs;
        PReportLayoutCQ uq = (PReportLayoutCQ)uqs;
        if (bq.hasConditionQueryPReport()) {
            uq.queryPReport().reflectRelationOnUnionQuery(bq.queryPReport(), uq.queryPReport());
        }
        if (bq.hasConditionQueryBClassDtlByUpdatable()) {
            uq.queryBClassDtlByUpdatable().reflectRelationOnUnionQuery(bq.queryBClassDtlByUpdatable(), uq.queryBClassDtlByUpdatable());
        }
        if (bq.hasConditionQueryBClassDtlByAutoPrintTargetFlg()) {
            uq.queryBClassDtlByAutoPrintTargetFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAutoPrintTargetFlg(), uq.queryBClassDtlByAutoPrintTargetFlg());
        }
        if (bq.hasConditionQueryPLayoutPrintSettingAsOne()) {
            uq.queryPLayoutPrintSettingAsOne().reflectRelationOnUnionQuery(bq.queryPLayoutPrintSettingAsOne(), uq.queryPLayoutPrintSettingAsOne());
        }
        if (bq.hasConditionQueryPSubrepLayoutAsOne()) {
            uq.queryPSubrepLayoutAsOne().reflectRelationOnUnionQuery(bq.queryPSubrepLayoutAsOne(), uq.queryPSubrepLayoutAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * P_REPORT by my REPORT_ID, named 'PReport'.
     * @return The instance of condition-query. (NotNull)
     */
    public PReportCQ queryPReport() {
        return xdfgetConditionQueryPReport();
    }
    public PReportCQ xdfgetConditionQueryPReport() {
        String prop = "pReport";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPReport()); xsetupOuterJoinPReport(); }
        return xgetQueRlMap(prop);
    }
    protected PReportCQ xcreateQueryPReport() {
        String nrp = xresolveNRP("P_REPORT_LAYOUT", "pReport"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PReportCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pReport", nrp);
    }
    protected void xsetupOuterJoinPReport() { xregOutJo("pReport"); }
    public boolean hasConditionQueryPReport() { return xhasQueRlMap("pReport"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByUpdatable() {
        return xdfgetConditionQueryBClassDtlByUpdatable();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByUpdatable() {
        String prop = "bClassDtlByUpdatable";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByUpdatable()); xsetupOuterJoinBClassDtlByUpdatable(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByUpdatable() {
        String nrp = xresolveNRP("P_REPORT_LAYOUT", "bClassDtlByUpdatable"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByUpdatable", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByUpdatable() { xregOutJo("bClassDtlByUpdatable"); }
    public boolean hasConditionQueryBClassDtlByUpdatable() { return xhasQueRlMap("bClassDtlByUpdatable"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAutoPrintTargetFlg() {
        return xdfgetConditionQueryBClassDtlByAutoPrintTargetFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAutoPrintTargetFlg() {
        String prop = "bClassDtlByAutoPrintTargetFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAutoPrintTargetFlg()); xsetupOuterJoinBClassDtlByAutoPrintTargetFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAutoPrintTargetFlg() {
        String nrp = xresolveNRP("P_REPORT_LAYOUT", "bClassDtlByAutoPrintTargetFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAutoPrintTargetFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAutoPrintTargetFlg() { xregOutJo("bClassDtlByAutoPrintTargetFlg"); }
    public boolean hasConditionQueryBClassDtlByAutoPrintTargetFlg() { return xhasQueRlMap("bClassDtlByAutoPrintTargetFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public PLayoutPrintSettingCQ queryPLayoutPrintSettingAsOne() { return xdfgetConditionQueryPLayoutPrintSettingAsOne(); }
    public PLayoutPrintSettingCQ xdfgetConditionQueryPLayoutPrintSettingAsOne() {
        String prop = "pLayoutPrintSettingAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPLayoutPrintSettingAsOne()); xsetupOuterJoinPLayoutPrintSettingAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected PLayoutPrintSettingCQ xcreateQueryPLayoutPrintSettingAsOne() {
        String nrp = xresolveNRP("P_REPORT_LAYOUT", "pLayoutPrintSettingAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PLayoutPrintSettingCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pLayoutPrintSettingAsOne", nrp);
    }
    protected void xsetupOuterJoinPLayoutPrintSettingAsOne() { xregOutJo("pLayoutPrintSettingAsOne"); }
    public boolean hasConditionQueryPLayoutPrintSettingAsOne() { return xhasQueRlMap("pLayoutPrintSettingAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public PSubrepLayoutCQ queryPSubrepLayoutAsOne() { return xdfgetConditionQueryPSubrepLayoutAsOne(); }
    public PSubrepLayoutCQ xdfgetConditionQueryPSubrepLayoutAsOne() {
        String prop = "pSubrepLayoutAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPSubrepLayoutAsOne()); xsetupOuterJoinPSubrepLayoutAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected PSubrepLayoutCQ xcreateQueryPSubrepLayoutAsOne() {
        String nrp = xresolveNRP("P_REPORT_LAYOUT", "pSubrepLayoutAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PSubrepLayoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pSubrepLayoutAsOne", nrp);
    }
    protected void xsetupOuterJoinPSubrepLayoutAsOne() { xregOutJo("pSubrepLayoutAsOne"); }
    public boolean hasConditionQueryPSubrepLayoutAsOne() { return xhasQueRlMap("pSubrepLayoutAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PReportLayoutCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PReportLayoutCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PReportLayoutCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PReportLayoutCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PReportLayoutCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PReportLayoutCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PReportLayoutCQ> _myselfExistsMap;
    public Map<String, PReportLayoutCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PReportLayoutCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PReportLayoutCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PReportLayoutCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PReportLayoutCB.class.getName(); }
    protected String xCQ() { return PReportLayoutCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
