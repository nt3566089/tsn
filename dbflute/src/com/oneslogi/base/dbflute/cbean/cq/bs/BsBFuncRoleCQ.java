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
 * The base condition-query of B_FUNC_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBFuncRoleCQ extends AbstractBsBFuncRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BFuncRoleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBFuncRoleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_FUNC_ROLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BFuncRoleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BFuncRoleCIQ xcreateCIQ() {
        BFuncRoleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BFuncRoleCIQ xnewCIQ() {
        return new BFuncRoleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_FUNC_ROLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BFuncRoleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BFuncRoleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _funcRoleId;
    public ConditionValue xdfgetFuncRoleId()
    { if (_funcRoleId == null) { _funcRoleId = nCV(); }
      return _funcRoleId; }
    protected ConditionValue xgetCValueFuncRoleId() { return xdfgetFuncRoleId(); }

    /**
     * Add order-by as ascend. <br>
     * FUNC_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_FuncRoleId_Asc() { regOBA("FUNC_ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FUNC_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_FuncRoleId_Desc() { regOBD("FUNC_ROLE_ID"); return this; }

    protected ConditionValue _funcId;
    public ConditionValue xdfgetFuncId()
    { if (_funcId == null) { _funcId = nCV(); }
      return _funcId; }
    protected ConditionValue xgetCValueFuncId() { return xdfgetFuncId(); }

    public Map<String, BFuncCQ> getFuncId_InScopeRelation_BFunc() { return xgetSQueMap("funcId_InScopeRelation_BFunc"); }
    public String keepFuncId_InScopeRelation_BFunc(BFuncCQ sq) { return xkeepSQue("funcId_InScopeRelation_BFunc", sq); }

    public Map<String, BFuncCQ> getFuncId_NotInScopeRelation_BFunc() { return xgetSQueMap("funcId_NotInScopeRelation_BFunc"); }
    public String keepFuncId_NotInScopeRelation_BFunc(BFuncCQ sq) { return xkeepSQue("funcId_NotInScopeRelation_BFunc", sq); }

    /**
     * Add order-by as ascend. <br>
     * FUNC_ID: {+UQ, IX, NotNull, bigint(19), FK to B_FUNC}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_FuncId_Asc() { regOBA("FUNC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FUNC_ID: {+UQ, IX, NotNull, bigint(19), FK to B_FUNC}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_FuncId_Desc() { regOBD("FUNC_ID"); return this; }

    protected ConditionValue _roleId;
    public ConditionValue xdfgetRoleId()
    { if (_roleId == null) { _roleId = nCV(); }
      return _roleId; }
    protected ConditionValue xgetCValueRoleId() { return xdfgetRoleId(); }

    public Map<String, BRoleCQ> getRoleId_InScopeRelation_BRole() { return xgetSQueMap("roleId_InScopeRelation_BRole"); }
    public String keepRoleId_InScopeRelation_BRole(BRoleCQ sq) { return xkeepSQue("roleId_InScopeRelation_BRole", sq); }

    public Map<String, BRoleCQ> getRoleId_NotInScopeRelation_BRole() { return xgetSQueMap("roleId_NotInScopeRelation_BRole"); }
    public String keepRoleId_NotInScopeRelation_BRole(BRoleCQ sq) { return xkeepSQue("roleId_NotInScopeRelation_BRole", sq); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

    protected ConditionValue _usable;
    public ConditionValue xdfgetUsable()
    { if (_usable == null) { _usable = nCV(); }
      return _usable; }
    protected ConditionValue xgetCValueUsable() { return xdfgetUsable(); }

    /**
     * Add order-by as ascend. <br>
     * USABLE: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_Usable_Asc() { regOBA("USABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * USABLE: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_Usable_Desc() { regOBD("USABLE"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBFuncRoleCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBFuncRoleCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBFuncRoleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBFuncRoleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BFuncRoleCQ bq = (BFuncRoleCQ)bqs;
        BFuncRoleCQ uq = (BFuncRoleCQ)uqs;
        if (bq.hasConditionQueryBFunc()) {
            uq.queryBFunc().reflectRelationOnUnionQuery(bq.queryBFunc(), uq.queryBFunc());
        }
        if (bq.hasConditionQueryBRole()) {
            uq.queryBRole().reflectRelationOnUnionQuery(bq.queryBRole(), uq.queryBRole());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_FUNC by my FUNC_ID, named 'BFunc'.
     * @return The instance of condition-query. (NotNull)
     */
    public BFuncCQ queryBFunc() {
        return xdfgetConditionQueryBFunc();
    }
    public BFuncCQ xdfgetConditionQueryBFunc() {
        String prop = "bFunc";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBFunc()); xsetupOuterJoinBFunc(); }
        return xgetQueRlMap(prop);
    }
    protected BFuncCQ xcreateQueryBFunc() {
        String nrp = xresolveNRP("B_FUNC_ROLE", "bFunc"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BFuncCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bFunc", nrp);
    }
    protected void xsetupOuterJoinBFunc() { xregOutJo("bFunc"); }
    public boolean hasConditionQueryBFunc() { return xhasQueRlMap("bFunc"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_ROLE by my ROLE_ID, named 'BRole'.
     * @return The instance of condition-query. (NotNull)
     */
    public BRoleCQ queryBRole() {
        return xdfgetConditionQueryBRole();
    }
    public BRoleCQ xdfgetConditionQueryBRole() {
        String prop = "bRole";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBRole()); xsetupOuterJoinBRole(); }
        return xgetQueRlMap(prop);
    }
    protected BRoleCQ xcreateQueryBRole() {
        String nrp = xresolveNRP("B_FUNC_ROLE", "bRole"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BRoleCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bRole", nrp);
    }
    protected void xsetupOuterJoinBRole() { xregOutJo("bRole"); }
    public boolean hasConditionQueryBRole() { return xhasQueRlMap("bRole"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BFuncRoleCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BFuncRoleCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BFuncRoleCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BFuncRoleCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BFuncRoleCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BFuncRoleCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BFuncRoleCQ> _myselfExistsMap;
    public Map<String, BFuncRoleCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BFuncRoleCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BFuncRoleCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BFuncRoleCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BFuncRoleCB.class.getName(); }
    protected String xCQ() { return BFuncRoleCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
