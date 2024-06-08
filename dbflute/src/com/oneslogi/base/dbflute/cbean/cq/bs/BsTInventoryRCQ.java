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
 * The base condition-query of T_INVENTORY_R.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryRCQ extends AbstractBsTInventoryRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryRCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_INVENTORY_R) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryRCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryRCIQ xcreateCIQ() {
        TInventoryRCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryRCIQ xnewCIQ() {
        return new TInventoryRCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_INVENTORY_R on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryRCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryRCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryBId;
    public ConditionValue xdfgetInventoryBId()
    { if (_inventoryBId == null) { _inventoryBId = nCV(); }
      return _inventoryBId; }
    protected ConditionValue xgetCValueInventoryBId() { return xdfgetInventoryBId(); }

    public Map<String, TInventoryBCQ> getInventoryBId_InScopeRelation_TInventoryB() { return xgetSQueMap("inventoryBId_InScopeRelation_TInventoryB"); }
    public String keepInventoryBId_InScopeRelation_TInventoryB(TInventoryBCQ sq) { return xkeepSQue("inventoryBId_InScopeRelation_TInventoryB", sq); }

    public Map<String, TInventoryBCQ> getInventoryBId_NotInScopeRelation_TInventoryB() { return xgetSQueMap("inventoryBId_NotInScopeRelation_TInventoryB"); }
    public String keepInventoryBId_NotInScopeRelation_TInventoryB(TInventoryBCQ sq) { return xkeepSQue("inventoryBId_NotInScopeRelation_TInventoryB", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_INVENTORY_B}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryBId_Asc() { regOBA("INVENTORY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_INVENTORY_B}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryBId_Desc() { regOBD("INVENTORY_B_ID"); return this; }

    protected ConditionValue _twlOutFlg;
    public ConditionValue xdfgetTwlOutFlg()
    { if (_twlOutFlg == null) { _twlOutFlg = nCV(); }
      return _twlOutFlg; }
    protected ConditionValue xgetCValueTwlOutFlg() { return xdfgetTwlOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TWL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutFlg_Asc() { regOBA("TWL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutFlg_Desc() { regOBD("TWL_OUT_FLG"); return this; }

    protected ConditionValue _twlOutUserId;
    public ConditionValue xdfgetTwlOutUserId()
    { if (_twlOutUserId == null) { _twlOutUserId = nCV(); }
      return _twlOutUserId; }
    protected ConditionValue xgetCValueTwlOutUserId() { return xdfgetTwlOutUserId(); }

    public Map<String, BUserCQ> getTwlOutUserId_InScopeRelation_BUser() { return xgetSQueMap("twlOutUserId_InScopeRelation_BUser"); }
    public String keepTwlOutUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("twlOutUserId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getTwlOutUserId_NotInScopeRelation_BUser() { return xgetSQueMap("twlOutUserId_NotInScopeRelation_BUser"); }
    public String keepTwlOutUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("twlOutUserId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * TWL_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutUserId_Asc() { regOBA("TWL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWL_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutUserId_Desc() { regOBD("TWL_OUT_USER_ID"); return this; }

    protected ConditionValue _twlOutDt;
    public ConditionValue xdfgetTwlOutDt()
    { if (_twlOutDt == null) { _twlOutDt = nCV(); }
      return _twlOutDt; }
    protected ConditionValue xgetCValueTwlOutDt() { return xdfgetTwlOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * TWL_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutDt_Asc() { regOBA("TWL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWL_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutDt_Desc() { regOBD("TWL_OUT_DT"); return this; }

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
    public BsTInventoryRCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryRCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryRCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryRCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryRCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryRCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryRCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryRCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryRCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryRCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryRCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryRCQ bq = (TInventoryRCQ)bqs;
        TInventoryRCQ uq = (TInventoryRCQ)uqs;
        if (bq.hasConditionQueryTInventoryB()) {
            uq.queryTInventoryB().reflectRelationOnUnionQuery(bq.queryTInventoryB(), uq.queryTInventoryB());
        }
        if (bq.hasConditionQueryBUser()) {
            uq.queryBUser().reflectRelationOnUnionQuery(bq.queryBUser(), uq.queryBUser());
        }
        if (bq.hasConditionQueryBClassDtlByTwlOutFlg()) {
            uq.queryBClassDtlByTwlOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByTwlOutFlg(), uq.queryBClassDtlByTwlOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TInventoryBCQ queryTInventoryB() {
        return xdfgetConditionQueryTInventoryB();
    }
    public TInventoryBCQ xdfgetConditionQueryTInventoryB() {
        String prop = "tInventoryB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTInventoryB()); xsetupOuterJoinTInventoryB(); }
        return xgetQueRlMap(prop);
    }
    protected TInventoryBCQ xcreateQueryTInventoryB() {
        String nrp = xresolveNRP("T_INVENTORY_R", "tInventoryB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryB", nrp);
    }
    protected void xsetupOuterJoinTInventoryB() { xregOutJo("tInventoryB"); }
    public boolean hasConditionQueryTInventoryB() { return xhasQueRlMap("tInventoryB"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my TWL_OUT_USER_ID, named 'BUser'.
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
        String nrp = xresolveNRP("T_INVENTORY_R", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUser", nrp);
    }
    protected void xsetupOuterJoinBUser() { xregOutJo("bUser"); }
    public boolean hasConditionQueryBUser() { return xhasQueRlMap("bUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTwlOutFlg() {
        return xdfgetConditionQueryBClassDtlByTwlOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTwlOutFlg() {
        String prop = "bClassDtlByTwlOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTwlOutFlg()); xsetupOuterJoinBClassDtlByTwlOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTwlOutFlg() {
        String nrp = xresolveNRP("T_INVENTORY_R", "bClassDtlByTwlOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTwlOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTwlOutFlg() { xregOutJo("bClassDtlByTwlOutFlg"); }
    public boolean hasConditionQueryBClassDtlByTwlOutFlg() { return xhasQueRlMap("bClassDtlByTwlOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryRCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryRCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryRCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryRCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryRCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryRCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryRCQ> _myselfExistsMap;
    public Map<String, TInventoryRCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryRCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryRCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryRCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryRCB.class.getName(); }
    protected String xCQ() { return TInventoryRCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
