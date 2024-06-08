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
 * The base condition-query of B_USER_AUTH.
 * @author DBFlute(AutoGenerator)
 */
public class BsBUserAuthCQ extends AbstractBsBUserAuthCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BUserAuthCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBUserAuthCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_USER_AUTH) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BUserAuthCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BUserAuthCIQ xcreateCIQ() {
        BUserAuthCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BUserAuthCIQ xnewCIQ() {
        return new BUserAuthCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_USER_AUTH on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BUserAuthCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BUserAuthCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, BUserCQ> getUserId_InScopeRelation_BUser() { return xgetSQueMap("userId_InScopeRelation_BUser"); }
    public String keepUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("userId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getUserId_NotInScopeRelation_BUser() { return xgetSQueMap("userId_NotInScopeRelation_BUser"); }
    public String keepUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("userId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _salt;
    public ConditionValue xdfgetSalt()
    { if (_salt == null) { _salt = nCV(); }
      return _salt; }
    protected ConditionValue xgetCValueSalt() { return xdfgetSalt(); }

    /**
     * Add order-by as ascend. <br>
     * SALT: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_Salt_Asc() { regOBA("SALT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALT: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_Salt_Desc() { regOBD("SALT"); return this; }

    protected ConditionValue _passwordReset;
    public ConditionValue xdfgetPasswordReset()
    { if (_passwordReset == null) { _passwordReset = nCV(); }
      return _passwordReset; }
    protected ConditionValue xgetCValuePasswordReset() { return xdfgetPasswordReset(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_PasswordReset_Asc() { regOBA("PASSWORD_RESET"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_PasswordReset_Desc() { regOBD("PASSWORD_RESET"); return this; }

    protected ConditionValue _passwordModifiedDate;
    public ConditionValue xdfgetPasswordModifiedDate()
    { if (_passwordModifiedDate == null) { _passwordModifiedDate = nCV(); }
      return _passwordModifiedDate; }
    protected ConditionValue xgetCValuePasswordModifiedDate() { return xdfgetPasswordModifiedDate(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_PasswordModifiedDate_Asc() { regOBA("PASSWORD_MODIFIED_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_PasswordModifiedDate_Desc() { regOBD("PASSWORD_MODIFIED_DATE"); return this; }

    protected ConditionValue _lastLoginDate;
    public ConditionValue xdfgetLastLoginDate()
    { if (_lastLoginDate == null) { _lastLoginDate = nCV(); }
      return _lastLoginDate; }
    protected ConditionValue xgetCValueLastLoginDate() { return xdfgetLastLoginDate(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_LastLoginDate_Asc() { regOBA("LAST_LOGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_LastLoginDate_Desc() { regOBD("LAST_LOGIN_DATE"); return this; }

    protected ConditionValue _lastFailedLoginDate;
    public ConditionValue xdfgetLastFailedLoginDate()
    { if (_lastFailedLoginDate == null) { _lastFailedLoginDate = nCV(); }
      return _lastFailedLoginDate; }
    protected ConditionValue xgetCValueLastFailedLoginDate() { return xdfgetLastFailedLoginDate(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_LastFailedLoginDate_Asc() { regOBA("LAST_FAILED_LOGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_LastFailedLoginDate_Desc() { regOBD("LAST_FAILED_LOGIN_DATE"); return this; }

    protected ConditionValue _failedLoginAttempts;
    public ConditionValue xdfgetFailedLoginAttempts()
    { if (_failedLoginAttempts == null) { _failedLoginAttempts = nCV(); }
      return _failedLoginAttempts; }
    protected ConditionValue xgetCValueFailedLoginAttempts() { return xdfgetFailedLoginAttempts(); }

    /**
     * Add order-by as ascend. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_FailedLoginAttempts_Asc() { regOBA("FAILED_LOGIN_ATTEMPTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_FailedLoginAttempts_Desc() { regOBD("FAILED_LOGIN_ATTEMPTS"); return this; }

    protected ConditionValue _lockout;
    public ConditionValue xdfgetLockout()
    { if (_lockout == null) { _lockout = nCV(); }
      return _lockout; }
    protected ConditionValue xgetCValueLockout() { return xdfgetLockout(); }

    /**
     * Add order-by as ascend. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_Lockout_Asc() { regOBA("LOCKOUT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_Lockout_Desc() { regOBD("LOCKOUT"); return this; }

    protected ConditionValue _lockoutDate;
    public ConditionValue xdfgetLockoutDate()
    { if (_lockoutDate == null) { _lockoutDate = nCV(); }
      return _lockoutDate; }
    protected ConditionValue xgetCValueLockoutDate() { return xdfgetLockoutDate(); }

    /**
     * Add order-by as ascend. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_LockoutDate_Asc() { regOBA("LOCKOUT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_LockoutDate_Desc() { regOBD("LOCKOUT_DATE"); return this; }

    protected ConditionValue _availableStartDate;
    public ConditionValue xdfgetAvailableStartDate()
    { if (_availableStartDate == null) { _availableStartDate = nCV(); }
      return _availableStartDate; }
    protected ConditionValue xgetCValueAvailableStartDate() { return xdfgetAvailableStartDate(); }

    /**
     * Add order-by as ascend. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AvailableStartDate_Asc() { regOBA("AVAILABLE_START_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AvailableStartDate_Desc() { regOBD("AVAILABLE_START_DATE"); return this; }

    protected ConditionValue _availableEndDate;
    public ConditionValue xdfgetAvailableEndDate()
    { if (_availableEndDate == null) { _availableEndDate = nCV(); }
      return _availableEndDate; }
    protected ConditionValue xgetCValueAvailableEndDate() { return xdfgetAvailableEndDate(); }

    /**
     * Add order-by as ascend. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AvailableEndDate_Asc() { regOBA("AVAILABLE_END_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AvailableEndDate_Desc() { regOBD("AVAILABLE_END_DATE"); return this; }

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
    public BsBUserAuthCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBUserAuthCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBUserAuthCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBUserAuthCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBUserAuthCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBUserAuthCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBUserAuthCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBUserAuthCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBUserAuthCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBUserAuthCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBUserAuthCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBUserAuthCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BUserAuthCQ bq = (BUserAuthCQ)bqs;
        BUserAuthCQ uq = (BUserAuthCQ)uqs;
        if (bq.hasConditionQueryBUser()) {
            uq.queryBUser().reflectRelationOnUnionQuery(bq.queryBUser(), uq.queryBUser());
        }
        if (bq.hasConditionQueryBClassDtlByPasswordReset()) {
            uq.queryBClassDtlByPasswordReset().reflectRelationOnUnionQuery(bq.queryBClassDtlByPasswordReset(), uq.queryBClassDtlByPasswordReset());
        }
        if (bq.hasConditionQueryBClassDtlByLockout()) {
            uq.queryBClassDtlByLockout().reflectRelationOnUnionQuery(bq.queryBClassDtlByLockout(), uq.queryBClassDtlByLockout());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my USER_ID, named 'BUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUser() {
        return xdfgetConditionQueryBUser();
    }
    public BUserCQ xdfgetConditionQueryBUser() {
        String prop = "bUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUser()); xsetupOuterJoinBUser(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUser() {
        String nrp = xresolveNRP("B_USER_AUTH", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUser", nrp);
    }
    protected void xsetupOuterJoinBUser() { xregOutJo("bUser"); }
    public boolean hasConditionQueryBUser() { return xhasQueRlMap("bUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PASSWORD_RESET, named 'BClassDtlByPasswordReset'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPasswordReset() {
        return xdfgetConditionQueryBClassDtlByPasswordReset();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPasswordReset() {
        String prop = "bClassDtlByPasswordReset";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPasswordReset()); xsetupOuterJoinBClassDtlByPasswordReset(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPasswordReset() {
        String nrp = xresolveNRP("B_USER_AUTH", "bClassDtlByPasswordReset"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPasswordReset", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPasswordReset() { xregOutJo("bClassDtlByPasswordReset"); }
    public boolean hasConditionQueryBClassDtlByPasswordReset() { return xhasQueRlMap("bClassDtlByPasswordReset"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOCKOUT, named 'BClassDtlByLockout'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLockout() {
        return xdfgetConditionQueryBClassDtlByLockout();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLockout() {
        String prop = "bClassDtlByLockout";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLockout()); xsetupOuterJoinBClassDtlByLockout(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLockout() {
        String nrp = xresolveNRP("B_USER_AUTH", "bClassDtlByLockout"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLockout", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLockout() { xregOutJo("bClassDtlByLockout"); }
    public boolean hasConditionQueryBClassDtlByLockout() { return xhasQueRlMap("bClassDtlByLockout"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BUserAuthCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BUserAuthCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BUserAuthCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BUserAuthCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BUserAuthCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BUserAuthCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BUserAuthCQ> _myselfExistsMap;
    public Map<String, BUserAuthCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BUserAuthCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BUserAuthCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BUserAuthCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BUserAuthCB.class.getName(); }
    protected String xCQ() { return BUserAuthCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
