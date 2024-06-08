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
 * The base condition-query of B_FUNC.
 * @author DBFlute(AutoGenerator)
 */
public class BsBFuncCQ extends AbstractBsBFuncCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BFuncCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBFuncCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_FUNC) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BFuncCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BFuncCIQ xcreateCIQ() {
        BFuncCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BFuncCIQ xnewCIQ() {
        return new BFuncCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_FUNC on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BFuncCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BFuncCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _funcId;
    public ConditionValue xdfgetFuncId()
    { if (_funcId == null) { _funcId = nCV(); }
      return _funcId; }
    protected ConditionValue xgetCValueFuncId() { return xdfgetFuncId(); }

    public Map<String, BArgCQ> xdfgetFuncId_ExistsReferrer_BArgList() { return xgetSQueMap("funcId_ExistsReferrer_BArgList"); }
    public String keepFuncId_ExistsReferrer_BArgList(BArgCQ sq) { return xkeepSQue("funcId_ExistsReferrer_BArgList", sq); }

    public Map<String, BFuncRoleCQ> xdfgetFuncId_ExistsReferrer_BFuncRoleList() { return xgetSQueMap("funcId_ExistsReferrer_BFuncRoleList"); }
    public String keepFuncId_ExistsReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("funcId_ExistsReferrer_BFuncRoleList", sq); }

    public Map<String, BArgCQ> xdfgetFuncId_NotExistsReferrer_BArgList() { return xgetSQueMap("funcId_NotExistsReferrer_BArgList"); }
    public String keepFuncId_NotExistsReferrer_BArgList(BArgCQ sq) { return xkeepSQue("funcId_NotExistsReferrer_BArgList", sq); }

    public Map<String, BFuncRoleCQ> xdfgetFuncId_NotExistsReferrer_BFuncRoleList() { return xgetSQueMap("funcId_NotExistsReferrer_BFuncRoleList"); }
    public String keepFuncId_NotExistsReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("funcId_NotExistsReferrer_BFuncRoleList", sq); }

    public Map<String, BArgCQ> xdfgetFuncId_SpecifyDerivedReferrer_BArgList() { return xgetSQueMap("funcId_SpecifyDerivedReferrer_BArgList"); }
    public String keepFuncId_SpecifyDerivedReferrer_BArgList(BArgCQ sq) { return xkeepSQue("funcId_SpecifyDerivedReferrer_BArgList", sq); }

    public Map<String, BFuncRoleCQ> xdfgetFuncId_SpecifyDerivedReferrer_BFuncRoleList() { return xgetSQueMap("funcId_SpecifyDerivedReferrer_BFuncRoleList"); }
    public String keepFuncId_SpecifyDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("funcId_SpecifyDerivedReferrer_BFuncRoleList", sq); }

    public Map<String, BArgCQ> xdfgetFuncId_QueryDerivedReferrer_BArgList() { return xgetSQueMap("funcId_QueryDerivedReferrer_BArgList"); }
    public String keepFuncId_QueryDerivedReferrer_BArgList(BArgCQ sq) { return xkeepSQue("funcId_QueryDerivedReferrer_BArgList", sq); }
    public Map<String, Object> xdfgetFuncId_QueryDerivedReferrer_BArgListParameter() { return xgetSQuePmMap("funcId_QueryDerivedReferrer_BArgList"); }
    public String keepFuncId_QueryDerivedReferrer_BArgListParameter(Object pm) { return xkeepSQuePm("funcId_QueryDerivedReferrer_BArgList", pm); }

    public Map<String, BFuncRoleCQ> xdfgetFuncId_QueryDerivedReferrer_BFuncRoleList() { return xgetSQueMap("funcId_QueryDerivedReferrer_BFuncRoleList"); }
    public String keepFuncId_QueryDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq) { return xkeepSQue("funcId_QueryDerivedReferrer_BFuncRoleList", sq); }
    public Map<String, Object> xdfgetFuncId_QueryDerivedReferrer_BFuncRoleListParameter() { return xgetSQuePmMap("funcId_QueryDerivedReferrer_BFuncRoleList"); }
    public String keepFuncId_QueryDerivedReferrer_BFuncRoleListParameter(Object pm) { return xkeepSQuePm("funcId_QueryDerivedReferrer_BFuncRoleList", pm); }

    /**
     * Add order-by as ascend. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_FuncId_Asc() { regOBA("FUNC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_FuncId_Desc() { regOBD("FUNC_ID"); return this; }

    protected ConditionValue _classCd;
    public ConditionValue xdfgetClassCd()
    { if (_classCd == null) { _classCd = nCV(); }
      return _classCd; }
    protected ConditionValue xgetCValueClassCd() { return xdfgetClassCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_ClassCd_Asc() { regOBA("CLASS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_ClassCd_Desc() { regOBD("CLASS_CD"); return this; }

    protected ConditionValue _methodCd;
    public ConditionValue xdfgetMethodCd()
    { if (_methodCd == null) { _methodCd = nCV(); }
      return _methodCd; }
    protected ConditionValue xgetCValueMethodCd() { return xdfgetMethodCd(); }

    /**
     * Add order-by as ascend. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_MethodCd_Asc() { regOBA("METHOD_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_MethodCd_Desc() { regOBD("METHOD_CD"); return this; }

    protected ConditionValue _funcCd;
    public ConditionValue xdfgetFuncCd()
    { if (_funcCd == null) { _funcCd = nCV(); }
      return _funcCd; }
    protected ConditionValue xgetCValueFuncCd() { return xdfgetFuncCd(); }

    /**
     * Add order-by as ascend. <br>
     * FUNC_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_FuncCd_Asc() { regOBA("FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FUNC_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_FuncCd_Desc() { regOBD("FUNC_CD"); return this; }

    protected ConditionValue _funcNm;
    public ConditionValue xdfgetFuncNm()
    { if (_funcNm == null) { _funcNm = nCV(); }
      return _funcNm; }
    protected ConditionValue xgetCValueFuncNm() { return xdfgetFuncNm(); }

    /**
     * Add order-by as ascend. <br>
     * FUNC_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_FuncNm_Asc() { regOBA("FUNC_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FUNC_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_FuncNm_Desc() { regOBD("FUNC_NM"); return this; }

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
    public BsBFuncCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBFuncCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBFuncCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBFuncCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBFuncCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBFuncCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBFuncCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBFuncCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBFuncCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBFuncCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBFuncCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBFuncCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, BFuncCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BFuncCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BFuncCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BFuncCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BFuncCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BFuncCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BFuncCQ> _myselfExistsMap;
    public Map<String, BFuncCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BFuncCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BFuncCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BFuncCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BFuncCB.class.getName(); }
    protected String xCQ() { return BFuncCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
