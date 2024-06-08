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
 * The base condition-query of W_CARRIER_ZIP_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWCarrierZipInputCQ extends AbstractBsWCarrierZipInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WCarrierZipInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWCarrierZipInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_CARRIER_ZIP_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WCarrierZipInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WCarrierZipInputCIQ xcreateCIQ() {
        WCarrierZipInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WCarrierZipInputCIQ xnewCIQ() {
        return new WCarrierZipInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_CARRIER_ZIP_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WCarrierZipInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WCarrierZipInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierZipInputId;
    public ConditionValue xdfgetCarrierZipInputId()
    { if (_carrierZipInputId == null) { _carrierZipInputId = nCV(); }
      return _carrierZipInputId; }
    protected ConditionValue xgetCValueCarrierZipInputId() { return xdfgetCarrierZipInputId(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_CarrierZipInputId_Asc() { regOBA("CARRIER_ZIP_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_CarrierZipInputId_Desc() { regOBD("CARRIER_ZIP_INPUT_ID"); return this; }

    protected ConditionValue _zipCd;
    public ConditionValue xdfgetZipCd()
    { if (_zipCd == null) { _zipCd = nCV(); }
      return _zipCd; }
    protected ConditionValue xgetCValueZipCd() { return xdfgetZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _arrivalStoreCd;
    public ConditionValue xdfgetArrivalStoreCd()
    { if (_arrivalStoreCd == null) { _arrivalStoreCd = nCV(); }
      return _arrivalStoreCd; }
    protected ConditionValue xgetCValueArrivalStoreCd() { return xdfgetArrivalStoreCd(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ArrivalStoreCd_Asc() { regOBA("ARRIVAL_STORE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ArrivalStoreCd_Desc() { regOBD("ARRIVAL_STORE_CD"); return this; }

    protected ConditionValue _arrivalStoreNm;
    public ConditionValue xdfgetArrivalStoreNm()
    { if (_arrivalStoreNm == null) { _arrivalStoreNm = nCV(); }
      return _arrivalStoreNm; }
    protected ConditionValue xgetCValueArrivalStoreNm() { return xdfgetArrivalStoreNm(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ArrivalStoreNm_Asc() { regOBA("ARRIVAL_STORE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ArrivalStoreNm_Desc() { regOBD("ARRIVAL_STORE_NM"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWCarrierZipInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWCarrierZipInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWCarrierZipInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWCarrierZipInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WCarrierZipInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WCarrierZipInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WCarrierZipInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WCarrierZipInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WCarrierZipInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WCarrierZipInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WCarrierZipInputCQ> _myselfExistsMap;
    public Map<String, WCarrierZipInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WCarrierZipInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WCarrierZipInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WCarrierZipInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WCarrierZipInputCB.class.getName(); }
    protected String xCQ() { return WCarrierZipInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
