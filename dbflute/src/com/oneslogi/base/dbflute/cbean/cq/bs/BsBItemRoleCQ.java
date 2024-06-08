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
 * The base condition-query of B_ITEM_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBItemRoleCQ extends AbstractBsBItemRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BItemRoleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBItemRoleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_ITEM_ROLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BItemRoleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BItemRoleCIQ xcreateCIQ() {
        BItemRoleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BItemRoleCIQ xnewCIQ() {
        return new BItemRoleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_ITEM_ROLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BItemRoleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BItemRoleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _itemRoleId;
    public ConditionValue xdfgetItemRoleId()
    { if (_itemRoleId == null) { _itemRoleId = nCV(); }
      return _itemRoleId; }
    protected ConditionValue xgetCValueItemRoleId() { return xdfgetItemRoleId(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_ItemRoleId_Asc() { regOBA("ITEM_ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_ItemRoleId_Desc() { regOBD("ITEM_ROLE_ID"); return this; }

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
    public BsBItemRoleCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

    protected ConditionValue _itemId;
    public ConditionValue xdfgetItemId()
    { if (_itemId == null) { _itemId = nCV(); }
      return _itemId; }
    protected ConditionValue xgetCValueItemId() { return xdfgetItemId(); }

    public Map<String, BItemCQ> getItemId_InScopeRelation_BItem() { return xgetSQueMap("itemId_InScopeRelation_BItem"); }
    public String keepItemId_InScopeRelation_BItem(BItemCQ sq) { return xkeepSQue("itemId_InScopeRelation_BItem", sq); }

    public Map<String, BItemCQ> getItemId_NotInScopeRelation_BItem() { return xgetSQueMap("itemId_NotInScopeRelation_BItem"); }
    public String keepItemId_NotInScopeRelation_BItem(BItemCQ sq) { return xkeepSQue("itemId_NotInScopeRelation_BItem", sq); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_ItemId_Asc() { regOBA("ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_ItemId_Desc() { regOBD("ITEM_ID"); return this; }

    protected ConditionValue _visible;
    public ConditionValue xdfgetVisible()
    { if (_visible == null) { _visible = nCV(); }
      return _visible; }
    protected ConditionValue xgetCValueVisible() { return xdfgetVisible(); }

    /**
     * Add order-by as ascend. <br>
     * VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

    protected ConditionValue _editable;
    public ConditionValue xdfgetEditable()
    { if (_editable == null) { _editable = nCV(); }
      return _editable; }
    protected ConditionValue xgetCValueEditable() { return xdfgetEditable(); }

    /**
     * Add order-by as ascend. <br>
     * EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_Editable_Asc() { regOBA("EDITABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_Editable_Desc() { regOBD("EDITABLE"); return this; }

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
    public BsBItemRoleCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBItemRoleCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBItemRoleCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBItemRoleCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBItemRoleCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBItemRoleCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBItemRoleCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBItemRoleCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBItemRoleCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBItemRoleCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBItemRoleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBItemRoleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BItemRoleCQ bq = (BItemRoleCQ)bqs;
        BItemRoleCQ uq = (BItemRoleCQ)uqs;
        if (bq.hasConditionQueryBRole()) {
            uq.queryBRole().reflectRelationOnUnionQuery(bq.queryBRole(), uq.queryBRole());
        }
        if (bq.hasConditionQueryBItem()) {
            uq.queryBItem().reflectRelationOnUnionQuery(bq.queryBItem(), uq.queryBItem());
        }
        if (bq.hasConditionQueryBClassDtlByVisible()) {
            uq.queryBClassDtlByVisible().reflectRelationOnUnionQuery(bq.queryBClassDtlByVisible(), uq.queryBClassDtlByVisible());
        }
        if (bq.hasConditionQueryBClassDtlByEditable()) {
            uq.queryBClassDtlByEditable().reflectRelationOnUnionQuery(bq.queryBClassDtlByEditable(), uq.queryBClassDtlByEditable());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("B_ITEM_ROLE", "bRole"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BRoleCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bRole", nrp);
    }
    protected void xsetupOuterJoinBRole() { xregOutJo("bRole"); }
    public boolean hasConditionQueryBRole() { return xhasQueRlMap("bRole"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The instance of condition-query. (NotNull)
     */
    public BItemCQ queryBItem() {
        return xdfgetConditionQueryBItem();
    }
    public BItemCQ xdfgetConditionQueryBItem() {
        String prop = "bItem";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBItem()); xsetupOuterJoinBItem(); }
        return xgetQueRlMap(prop);
    }
    protected BItemCQ xcreateQueryBItem() {
        String nrp = xresolveNRP("B_ITEM_ROLE", "bItem"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BItemCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bItem", nrp);
    }
    protected void xsetupOuterJoinBItem() { xregOutJo("bItem"); }
    public boolean hasConditionQueryBItem() { return xhasQueRlMap("bItem"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByVisible() {
        return xdfgetConditionQueryBClassDtlByVisible();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByVisible() {
        String prop = "bClassDtlByVisible";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByVisible()); xsetupOuterJoinBClassDtlByVisible(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByVisible() {
        String nrp = xresolveNRP("B_ITEM_ROLE", "bClassDtlByVisible"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByVisible", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByVisible() { xregOutJo("bClassDtlByVisible"); }
    public boolean hasConditionQueryBClassDtlByVisible() { return xhasQueRlMap("bClassDtlByVisible"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEditable() {
        return xdfgetConditionQueryBClassDtlByEditable();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEditable() {
        String prop = "bClassDtlByEditable";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEditable()); xsetupOuterJoinBClassDtlByEditable(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEditable() {
        String nrp = xresolveNRP("B_ITEM_ROLE", "bClassDtlByEditable"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEditable", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEditable() { xregOutJo("bClassDtlByEditable"); }
    public boolean hasConditionQueryBClassDtlByEditable() { return xhasQueRlMap("bClassDtlByEditable"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BItemRoleCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BItemRoleCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BItemRoleCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BItemRoleCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BItemRoleCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BItemRoleCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BItemRoleCQ> _myselfExistsMap;
    public Map<String, BItemRoleCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BItemRoleCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BItemRoleCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BItemRoleCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BItemRoleCB.class.getName(); }
    protected String xCQ() { return BItemRoleCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
