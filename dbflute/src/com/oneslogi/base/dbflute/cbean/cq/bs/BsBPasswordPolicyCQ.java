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
 * The base condition-query of B_PASSWORD_POLICY.
 * @author DBFlute(AutoGenerator)
 */
public class BsBPasswordPolicyCQ extends AbstractBsBPasswordPolicyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BPasswordPolicyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBPasswordPolicyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_PASSWORD_POLICY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BPasswordPolicyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BPasswordPolicyCIQ xcreateCIQ() {
        BPasswordPolicyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BPasswordPolicyCIQ xnewCIQ() {
        return new BPasswordPolicyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_PASSWORD_POLICY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BPasswordPolicyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BPasswordPolicyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _passwordPolicyId;
    public ConditionValue xdfgetPasswordPolicyId()
    { if (_passwordPolicyId == null) { _passwordPolicyId = nCV(); }
      return _passwordPolicyId; }
    protected ConditionValue xgetCValuePasswordPolicyId() { return xdfgetPasswordPolicyId(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_PasswordPolicyId_Asc() { regOBA("PASSWORD_POLICY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_PasswordPolicyId_Desc() { regOBD("PASSWORD_POLICY_ID"); return this; }

    protected ConditionValue _passwordPolicyNm;
    public ConditionValue xdfgetPasswordPolicyNm()
    { if (_passwordPolicyNm == null) { _passwordPolicyNm = nCV(); }
      return _passwordPolicyNm; }
    protected ConditionValue xgetCValuePasswordPolicyNm() { return xdfgetPasswordPolicyNm(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_PasswordPolicyNm_Asc() { regOBA("PASSWORD_POLICY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_PasswordPolicyNm_Desc() { regOBD("PASSWORD_POLICY_NM"); return this; }

    protected ConditionValue _firstChangeControl;
    public ConditionValue xdfgetFirstChangeControl()
    { if (_firstChangeControl == null) { _firstChangeControl = nCV(); }
      return _firstChangeControl; }
    protected ConditionValue xgetCValueFirstChangeControl() { return xdfgetFirstChangeControl(); }

    /**
     * Add order-by as ascend. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_FirstChangeControl_Asc() { regOBA("FIRST_CHANGE_CONTROL"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_FirstChangeControl_Desc() { regOBD("FIRST_CHANGE_CONTROL"); return this; }

    protected ConditionValue _minLength;
    public ConditionValue xdfgetMinLength()
    { if (_minLength == null) { _minLength = nCV(); }
      return _minLength; }
    protected ConditionValue xgetCValueMinLength() { return xdfgetMinLength(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinLength_Asc() { regOBA("MIN_LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinLength_Desc() { regOBD("MIN_LENGTH"); return this; }

    protected ConditionValue _minAlpha;
    public ConditionValue xdfgetMinAlpha()
    { if (_minAlpha == null) { _minAlpha = nCV(); }
      return _minAlpha; }
    protected ConditionValue xgetCValueMinAlpha() { return xdfgetMinAlpha(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinAlpha_Asc() { regOBA("MIN_ALPHA"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinAlpha_Desc() { regOBD("MIN_ALPHA"); return this; }

    protected ConditionValue _minLowerCase;
    public ConditionValue xdfgetMinLowerCase()
    { if (_minLowerCase == null) { _minLowerCase = nCV(); }
      return _minLowerCase; }
    protected ConditionValue xgetCValueMinLowerCase() { return xdfgetMinLowerCase(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinLowerCase_Asc() { regOBA("MIN_LOWER_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinLowerCase_Desc() { regOBD("MIN_LOWER_CASE"); return this; }

    protected ConditionValue _minUpperCase;
    public ConditionValue xdfgetMinUpperCase()
    { if (_minUpperCase == null) { _minUpperCase = nCV(); }
      return _minUpperCase; }
    protected ConditionValue xgetCValueMinUpperCase() { return xdfgetMinUpperCase(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinUpperCase_Asc() { regOBA("MIN_UPPER_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinUpperCase_Desc() { regOBD("MIN_UPPER_CASE"); return this; }

    protected ConditionValue _minNumbers;
    public ConditionValue xdfgetMinNumbers()
    { if (_minNumbers == null) { _minNumbers = nCV(); }
      return _minNumbers; }
    protected ConditionValue xgetCValueMinNumbers() { return xdfgetMinNumbers(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinNumbers_Asc() { regOBA("MIN_NUMBERS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinNumbers_Desc() { regOBD("MIN_NUMBERS"); return this; }

    protected ConditionValue _minSymbol;
    public ConditionValue xdfgetMinSymbol()
    { if (_minSymbol == null) { _minSymbol = nCV(); }
      return _minSymbol; }
    protected ConditionValue xgetCValueMinSymbol() { return xdfgetMinSymbol(); }

    /**
     * Add order-by as ascend. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinSymbol_Asc() { regOBA("MIN_SYMBOL"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MinSymbol_Desc() { regOBD("MIN_SYMBOL"); return this; }

    protected ConditionValue _maxAge;
    public ConditionValue xdfgetMaxAge()
    { if (_maxAge == null) { _maxAge = nCV(); }
      return _maxAge; }
    protected ConditionValue xgetCValueMaxAge() { return xdfgetMaxAge(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MaxAge_Asc() { regOBA("MAX_AGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MaxAge_Desc() { regOBD("MAX_AGE"); return this; }

    protected ConditionValue _maxFailure;
    public ConditionValue xdfgetMaxFailure()
    { if (_maxFailure == null) { _maxFailure = nCV(); }
      return _maxFailure; }
    protected ConditionValue xgetCValueMaxFailure() { return xdfgetMaxFailure(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MaxFailure_Asc() { regOBA("MAX_FAILURE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_MaxFailure_Desc() { regOBD("MAX_FAILURE"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBPasswordPolicyCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBPasswordPolicyCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBPasswordPolicyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBPasswordPolicyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, BPasswordPolicyCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BPasswordPolicyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BPasswordPolicyCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BPasswordPolicyCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BPasswordPolicyCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BPasswordPolicyCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BPasswordPolicyCQ> _myselfExistsMap;
    public Map<String, BPasswordPolicyCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BPasswordPolicyCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BPasswordPolicyCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BPasswordPolicyCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BPasswordPolicyCB.class.getName(); }
    protected String xCQ() { return BPasswordPolicyCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
