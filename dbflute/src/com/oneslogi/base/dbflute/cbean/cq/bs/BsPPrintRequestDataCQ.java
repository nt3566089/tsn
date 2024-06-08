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
 * The base condition-query of P_PRINT_REQUEST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrintRequestDataCQ extends AbstractBsPPrintRequestDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrintRequestDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintRequestDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINT_REQUEST_DATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrintRequestDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrintRequestDataCIQ xcreateCIQ() {
        PPrintRequestDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrintRequestDataCIQ xnewCIQ() {
        return new PPrintRequestDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINT_REQUEST_DATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrintRequestDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrintRequestDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
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
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_PrintRequestId_Asc() { regOBA("PRINT_REQUEST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_PrintRequestId_Desc() { regOBD("PRINT_REQUEST_ID"); return this; }

    protected ConditionValue _reportLayoutData;
    public ConditionValue xdfgetReportLayoutData()
    { if (_reportLayoutData == null) { _reportLayoutData = nCV(); }
      return _reportLayoutData; }
    protected ConditionValue xgetCValueReportLayoutData() { return xdfgetReportLayoutData(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_ReportLayoutData_Asc() { regOBA("REPORT_LAYOUT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_ReportLayoutData_Desc() { regOBD("REPORT_LAYOUT_DATA"); return this; }

    protected ConditionValue _subrepLayoutData;
    public ConditionValue xdfgetSubrepLayoutData()
    { if (_subrepLayoutData == null) { _subrepLayoutData = nCV(); }
      return _subrepLayoutData; }
    protected ConditionValue xgetCValueSubrepLayoutData() { return xdfgetSubrepLayoutData(); }

    /**
     * Add order-by as ascend. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_SubrepLayoutData_Asc() { regOBA("SUBREP_LAYOUT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_SubrepLayoutData_Desc() { regOBD("SUBREP_LAYOUT_DATA"); return this; }

    protected ConditionValue _reportLayoutBinary;
    public ConditionValue xdfgetReportLayoutBinary()
    { if (_reportLayoutBinary == null) { _reportLayoutBinary = nCV(); }
      return _reportLayoutBinary; }
    protected ConditionValue xgetCValueReportLayoutBinary() { return xdfgetReportLayoutBinary(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_BINARY: {varbinary(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_ReportLayoutBinary_Asc() { regOBA("REPORT_LAYOUT_BINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_BINARY: {varbinary(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_ReportLayoutBinary_Desc() { regOBD("REPORT_LAYOUT_BINARY"); return this; }

    protected ConditionValue _subrepLayoutBinary;
    public ConditionValue xdfgetSubrepLayoutBinary()
    { if (_subrepLayoutBinary == null) { _subrepLayoutBinary = nCV(); }
      return _subrepLayoutBinary; }
    protected ConditionValue xgetCValueSubrepLayoutBinary() { return xdfgetSubrepLayoutBinary(); }

    /**
     * Add order-by as ascend. <br>
     * SUBREP_LAYOUT_BINARY: {varbinary(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_SubrepLayoutBinary_Asc() { regOBA("SUBREP_LAYOUT_BINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBREP_LAYOUT_BINARY: {varbinary(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_SubrepLayoutBinary_Desc() { regOBD("SUBREP_LAYOUT_BINARY"); return this; }

    protected ConditionValue _dataForReport;
    public ConditionValue xdfgetDataForReport()
    { if (_dataForReport == null) { _dataForReport = nCV(); }
      return _dataForReport; }
    protected ConditionValue xgetCValueDataForReport() { return xdfgetDataForReport(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DataForReport_Asc() { regOBA("DATA_FOR_REPORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DataForReport_Desc() { regOBD("DATA_FOR_REPORT"); return this; }

    protected ConditionValue _cultureCd;
    public ConditionValue xdfgetCultureCd()
    { if (_cultureCd == null) { _cultureCd = nCV(); }
      return _cultureCd; }
    protected ConditionValue xgetCValueCultureCd() { return xdfgetCultureCd(); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_CultureCd_Asc() { regOBA("CULTURE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_CultureCd_Desc() { regOBD("CULTURE_CD"); return this; }

    protected ConditionValue _timeZoneCd;
    public ConditionValue xdfgetTimeZoneCd()
    { if (_timeZoneCd == null) { _timeZoneCd = nCV(); }
      return _timeZoneCd; }
    protected ConditionValue xgetCValueTimeZoneCd() { return xdfgetTimeZoneCd(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_TimeZoneCd_Asc() { regOBA("TIME_ZONE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_ZONE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_TimeZoneCd_Desc() { regOBD("TIME_ZONE_CD"); return this; }

    protected ConditionValue _dateTimeFormat;
    public ConditionValue xdfgetDateTimeFormat()
    { if (_dateTimeFormat == null) { _dateTimeFormat = nCV(); }
      return _dateTimeFormat; }
    protected ConditionValue xgetCValueDateTimeFormat() { return xdfgetDateTimeFormat(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DateTimeFormat_Asc() { regOBA("DATE_TIME_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_TIME_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DateTimeFormat_Desc() { regOBD("DATE_TIME_FORMAT"); return this; }

    protected ConditionValue _dateFormat;
    public ConditionValue xdfgetDateFormat()
    { if (_dateFormat == null) { _dateFormat = nCV(); }
      return _dateFormat; }
    protected ConditionValue xgetCValueDateFormat() { return xdfgetDateFormat(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DateFormat_Asc() { regOBA("DATE_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DateFormat_Desc() { regOBD("DATE_FORMAT"); return this; }

    protected ConditionValue _timeFormat;
    public ConditionValue xdfgetTimeFormat()
    { if (_timeFormat == null) { _timeFormat = nCV(); }
      return _timeFormat; }
    protected ConditionValue xgetCValueTimeFormat() { return xdfgetTimeFormat(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_TimeFormat_Asc() { regOBA("TIME_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_TimeFormat_Desc() { regOBD("TIME_FORMAT"); return this; }

    protected ConditionValue _numberFormat;
    public ConditionValue xdfgetNumberFormat()
    { if (_numberFormat == null) { _numberFormat = nCV(); }
      return _numberFormat; }
    protected ConditionValue xgetCValueNumberFormat() { return xdfgetNumberFormat(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_NumberFormat_Asc() { regOBA("NUMBER_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_NumberFormat_Desc() { regOBD("NUMBER_FORMAT"); return this; }

    protected ConditionValue _currencyFormat;
    public ConditionValue xdfgetCurrencyFormat()
    { if (_currencyFormat == null) { _currencyFormat = nCV(); }
      return _currencyFormat; }
    protected ConditionValue xgetCValueCurrencyFormat() { return xdfgetCurrencyFormat(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_CurrencyFormat_Asc() { regOBA("CURRENCY_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENCY_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_CurrencyFormat_Desc() { regOBD("CURRENCY_FORMAT"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrintRequestDataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestDataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrintRequestDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrintRequestDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrintRequestDataCQ bq = (PPrintRequestDataCQ)bqs;
        PPrintRequestDataCQ uq = (PPrintRequestDataCQ)uqs;
        if (bq.hasConditionQueryPPrintRequest()) {
            uq.queryPPrintRequest().reflectRelationOnUnionQuery(bq.queryPPrintRequest(), uq.queryPPrintRequest());
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
        String nrp = xresolveNRP("P_PRINT_REQUEST_DATA", "pPrintRequest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PPrintRequestCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pPrintRequest", nrp);
    }
    protected void xsetupOuterJoinPPrintRequest() { xregOutJo("pPrintRequest"); }
    public boolean hasConditionQueryPPrintRequest() { return xhasQueRlMap("pPrintRequest"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PPrintRequestDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrintRequestDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrintRequestDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrintRequestDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrintRequestDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrintRequestDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrintRequestDataCQ> _myselfExistsMap;
    public Map<String, PPrintRequestDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrintRequestDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrintRequestDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrintRequestDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrintRequestDataCB.class.getName(); }
    protected String xCQ() { return PPrintRequestDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
