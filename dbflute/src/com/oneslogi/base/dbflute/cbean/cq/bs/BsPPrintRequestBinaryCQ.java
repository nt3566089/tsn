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
 * The base condition-query of P_PRINT_REQUEST_BINARY.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrintRequestBinaryCQ extends AbstractBsPPrintRequestBinaryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrintRequestBinaryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintRequestBinaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINT_REQUEST_BINARY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrintRequestBinaryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrintRequestBinaryCIQ xcreateCIQ() {
        PPrintRequestBinaryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrintRequestBinaryCIQ xnewCIQ() {
        return new PPrintRequestBinaryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINT_REQUEST_BINARY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrintRequestBinaryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrintRequestBinaryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printRequestBinaryId;
    public ConditionValue xdfgetPrintRequestBinaryId()
    { if (_printRequestBinaryId == null) { _printRequestBinaryId = nCV(); }
      return _printRequestBinaryId; }
    protected ConditionValue xgetCValuePrintRequestBinaryId() { return xdfgetPrintRequestBinaryId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintRequestBinaryId_Asc() { regOBA("PRINT_REQUEST_BINARY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintRequestBinaryId_Desc() { regOBD("PRINT_REQUEST_BINARY_ID"); return this; }

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
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintRequestId_Asc() { regOBA("PRINT_REQUEST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintRequestId_Desc() { regOBD("PRINT_REQUEST_ID"); return this; }

    protected ConditionValue _srcFileIndex;
    public ConditionValue xdfgetSrcFileIndex()
    { if (_srcFileIndex == null) { _srcFileIndex = nCV(); }
      return _srcFileIndex; }
    protected ConditionValue xgetCValueSrcFileIndex() { return xdfgetSrcFileIndex(); }

    /**
     * Add order-by as ascend. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_SrcFileIndex_Asc() { regOBA("SRC_FILE_INDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_SrcFileIndex_Desc() { regOBD("SRC_FILE_INDEX"); return this; }

    protected ConditionValue _reportBinary;
    public ConditionValue xdfgetReportBinary()
    { if (_reportBinary == null) { _reportBinary = nCV(); }
      return _reportBinary; }
    protected ConditionValue xgetCValueReportBinary() { return xdfgetReportBinary(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_BINARY: {varbinary(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_ReportBinary_Asc() { regOBA("REPORT_BINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_BINARY: {varbinary(2147483647)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_ReportBinary_Desc() { regOBD("REPORT_BINARY"); return this; }

    protected ConditionValue _printCustomRangeFlg;
    public ConditionValue xdfgetPrintCustomRangeFlg()
    { if (_printCustomRangeFlg == null) { _printCustomRangeFlg = nCV(); }
      return _printCustomRangeFlg; }
    protected ConditionValue xgetCValuePrintCustomRangeFlg() { return xdfgetPrintCustomRangeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintCustomRangeFlg_Asc() { regOBA("PRINT_CUSTOM_RANGE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintCustomRangeFlg_Desc() { regOBD("PRINT_CUSTOM_RANGE_FLG"); return this; }

    protected ConditionValue _printFirstPage;
    public ConditionValue xdfgetPrintFirstPage()
    { if (_printFirstPage == null) { _printFirstPage = nCV(); }
      return _printFirstPage; }
    protected ConditionValue xgetCValuePrintFirstPage() { return xdfgetPrintFirstPage(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintFirstPage_Asc() { regOBA("PRINT_FIRST_PAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintFirstPage_Desc() { regOBD("PRINT_FIRST_PAGE"); return this; }

    protected ConditionValue _printLastPage;
    public ConditionValue xdfgetPrintLastPage()
    { if (_printLastPage == null) { _printLastPage = nCV(); }
      return _printLastPage; }
    protected ConditionValue xgetCValuePrintLastPage() { return xdfgetPrintLastPage(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintLastPage_Asc() { regOBA("PRINT_LAST_PAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_LAST_PAGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_PrintLastPage_Desc() { regOBD("PRINT_LAST_PAGE"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrintRequestBinaryCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintRequestBinaryCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrintRequestBinaryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrintRequestBinaryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrintRequestBinaryCQ bq = (PPrintRequestBinaryCQ)bqs;
        PPrintRequestBinaryCQ uq = (PPrintRequestBinaryCQ)uqs;
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
        String nrp = xresolveNRP("P_PRINT_REQUEST_BINARY", "pPrintRequest"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, PPrintRequestBinaryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrintRequestBinaryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrintRequestBinaryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrintRequestBinaryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrintRequestBinaryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrintRequestBinaryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrintRequestBinaryCQ> _myselfExistsMap;
    public Map<String, PPrintRequestBinaryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrintRequestBinaryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrintRequestBinaryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrintRequestBinaryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrintRequestBinaryCB.class.getName(); }
    protected String xCQ() { return PPrintRequestBinaryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
