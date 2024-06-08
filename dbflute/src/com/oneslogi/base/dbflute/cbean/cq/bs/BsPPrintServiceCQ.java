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
 * The base condition-query of P_PRINT_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public class BsPPrintServiceCQ extends AbstractBsPPrintServiceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PPrintServiceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintServiceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_PRINT_SERVICE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PPrintServiceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PPrintServiceCIQ xcreateCIQ() {
        PPrintServiceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PPrintServiceCIQ xnewCIQ() {
        return new PPrintServiceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_PRINT_SERVICE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PPrintServiceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PPrintServiceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printServiceId;
    public ConditionValue xdfgetPrintServiceId()
    { if (_printServiceId == null) { _printServiceId = nCV(); }
      return _printServiceId; }
    protected ConditionValue xgetCValuePrintServiceId() { return xdfgetPrintServiceId(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrintServiceId_Asc() { regOBA("PRINT_SERVICE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrintServiceId_Desc() { regOBD("PRINT_SERVICE_ID"); return this; }

    protected ConditionValue _printServiceNm;
    public ConditionValue xdfgetPrintServiceNm()
    { if (_printServiceNm == null) { _printServiceNm = nCV(); }
      return _printServiceNm; }
    protected ConditionValue xgetCValuePrintServiceNm() { return xdfgetPrintServiceNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrintServiceNm_Asc() { regOBA("PRINT_SERVICE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_SERVICE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrintServiceNm_Desc() { regOBD("PRINT_SERVICE_NM"); return this; }

    protected ConditionValue _terminalNm;
    public ConditionValue xdfgetTerminalNm()
    { if (_terminalNm == null) { _terminalNm = nCV(); }
      return _terminalNm; }
    protected ConditionValue xgetCValueTerminalNm() { return xdfgetTerminalNm(); }

    /**
     * Add order-by as ascend. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_TerminalNm_Asc() { regOBA("TERMINAL_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TERMINAL_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_TerminalNm_Desc() { regOBD("TERMINAL_NM"); return this; }

    protected ConditionValue _macAddress;
    public ConditionValue xdfgetMacAddress()
    { if (_macAddress == null) { _macAddress = nCV(); }
      return _macAddress; }
    protected ConditionValue xgetCValueMacAddress() { return xdfgetMacAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_MacAddress_Asc() { regOBA("MAC_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAC_ADDRESS: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_MacAddress_Desc() { regOBD("MAC_ADDRESS"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_PrinterGroupId_Asc() { regOBA("PRINTER_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTER_GROUP_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrinterGroupId_Desc() { regOBD("PRINTER_GROUP_ID"); return this; }

    protected ConditionValue _printServiceStatus;
    public ConditionValue xdfgetPrintServiceStatus()
    { if (_printServiceStatus == null) { _printServiceStatus = nCV(); }
      return _printServiceStatus; }
    protected ConditionValue xgetCValuePrintServiceStatus() { return xdfgetPrintServiceStatus(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrintServiceStatus_Asc() { regOBA("PRINT_SERVICE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_PrintServiceStatus_Desc() { regOBD("PRINT_SERVICE_STATUS"); return this; }

    protected ConditionValue _startDt;
    public ConditionValue xdfgetStartDt()
    { if (_startDt == null) { _startDt = nCV(); }
      return _startDt; }
    protected ConditionValue xgetCValueStartDt() { return xdfgetStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * START_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_StartDt_Asc() { regOBA("START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * START_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_StartDt_Desc() { regOBD("START_DT"); return this; }

    protected ConditionValue _endDt;
    public ConditionValue xdfgetEndDt()
    { if (_endDt == null) { _endDt = nCV(); }
      return _endDt; }
    protected ConditionValue xgetCValueEndDt() { return xdfgetEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * END_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_EndDt_Asc() { regOBA("END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * END_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_EndDt_Desc() { regOBD("END_DT"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPPrintServiceCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPPrintServiceCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPPrintServiceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPPrintServiceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PPrintServiceCQ bq = (PPrintServiceCQ)bqs;
        PPrintServiceCQ uq = (PPrintServiceCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByPrintServiceStatus()) {
            uq.queryBClassDtlByPrintServiceStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByPrintServiceStatus(), uq.queryBClassDtlByPrintServiceStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRINT_SERVICE_STATUS, named 'BClassDtlByPrintServiceStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPrintServiceStatus() {
        return xdfgetConditionQueryBClassDtlByPrintServiceStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPrintServiceStatus() {
        String prop = "bClassDtlByPrintServiceStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPrintServiceStatus()); xsetupOuterJoinBClassDtlByPrintServiceStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPrintServiceStatus() {
        String nrp = xresolveNRP("P_PRINT_SERVICE", "bClassDtlByPrintServiceStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPrintServiceStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPrintServiceStatus() { xregOutJo("bClassDtlByPrintServiceStatus"); }
    public boolean hasConditionQueryBClassDtlByPrintServiceStatus() { return xhasQueRlMap("bClassDtlByPrintServiceStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PPrintServiceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PPrintServiceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PPrintServiceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PPrintServiceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PPrintServiceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PPrintServiceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PPrintServiceCQ> _myselfExistsMap;
    public Map<String, PPrintServiceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PPrintServiceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PPrintServiceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PPrintServiceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PPrintServiceCB.class.getName(); }
    protected String xCQ() { return PPrintServiceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
