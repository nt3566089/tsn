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
 * The base condition-query of T_INVENTORY_INP_HIST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryInpHistCQ extends AbstractBsTInventoryInpHistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryInpHistCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryInpHistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_INVENTORY_INP_HIST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryInpHistCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryInpHistCIQ xcreateCIQ() {
        TInventoryInpHistCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryInpHistCIQ xnewCIQ() {
        return new TInventoryInpHistCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_INVENTORY_INP_HIST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryInpHistCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryInpHistCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryInpHistId;
    public ConditionValue xdfgetInventoryInpHistId()
    { if (_inventoryInpHistId == null) { _inventoryInpHistId = nCV(); }
      return _inventoryInpHistId; }
    protected ConditionValue xgetCValueInventoryInpHistId() { return xdfgetInventoryInpHistId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InventoryInpHistId_Asc() { regOBA("INVENTORY_INP_HIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InventoryInpHistId_Desc() { regOBD("INVENTORY_INP_HIST_ID"); return this; }

    protected ConditionValue _inputDt;
    public ConditionValue xdfgetInputDt()
    { if (_inputDt == null) { _inputDt = nCV(); }
      return _inputDt; }
    protected ConditionValue xgetCValueInputDt() { return xdfgetInputDt(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InputDt_Asc() { regOBA("INPUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InputDt_Desc() { regOBD("INPUT_DT"); return this; }

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
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InventoryBId_Asc() { regOBA("INVENTORY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InventoryBId_Desc() { regOBD("INVENTORY_B_ID"); return this; }

    protected ConditionValue _inventoryNum;
    public ConditionValue xdfgetInventoryNum()
    { if (_inventoryNum == null) { _inventoryNum = nCV(); }
      return _inventoryNum; }
    protected ConditionValue xgetCValueInventoryNum() { return xdfgetInventoryNum(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InventoryNum_Asc() { regOBA("INVENTORY_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_InventoryNum_Desc() { regOBD("INVENTORY_NUM"); return this; }

    protected ConditionValue _lastFlg;
    public ConditionValue xdfgetLastFlg()
    { if (_lastFlg == null) { _lastFlg = nCV(); }
      return _lastFlg; }
    protected ConditionValue xgetCValueLastFlg() { return xdfgetLastFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_LastFlg_Asc() { regOBA("LAST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_LastFlg_Desc() { regOBD("LAST_FLG"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryInpHistCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryInpHistCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryInpHistCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryInpHistCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryInpHistCQ bq = (TInventoryInpHistCQ)bqs;
        TInventoryInpHistCQ uq = (TInventoryInpHistCQ)uqs;
        if (bq.hasConditionQueryTInventoryB()) {
            uq.queryTInventoryB().reflectRelationOnUnionQuery(bq.queryTInventoryB(), uq.queryTInventoryB());
        }
        if (bq.hasConditionQueryBClassDtlByLastFlg()) {
            uq.queryBClassDtlByLastFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLastFlg(), uq.queryBClassDtlByLastFlg());
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
        String nrp = xresolveNRP("T_INVENTORY_INP_HIST", "tInventoryB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryB", nrp);
    }
    protected void xsetupOuterJoinTInventoryB() { xregOutJo("tInventoryB"); }
    public boolean hasConditionQueryTInventoryB() { return xhasQueRlMap("tInventoryB"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LAST_FLG, named 'BClassDtlByLastFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLastFlg() {
        return xdfgetConditionQueryBClassDtlByLastFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLastFlg() {
        String prop = "bClassDtlByLastFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLastFlg()); xsetupOuterJoinBClassDtlByLastFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLastFlg() {
        String nrp = xresolveNRP("T_INVENTORY_INP_HIST", "bClassDtlByLastFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLastFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLastFlg() { xregOutJo("bClassDtlByLastFlg"); }
    public boolean hasConditionQueryBClassDtlByLastFlg() { return xhasQueRlMap("bClassDtlByLastFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryInpHistCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryInpHistCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryInpHistCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryInpHistCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryInpHistCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryInpHistCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryInpHistCQ> _myselfExistsMap;
    public Map<String, TInventoryInpHistCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryInpHistCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryInpHistCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryInpHistCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryInpHistCB.class.getName(); }
    protected String xCQ() { return TInventoryInpHistCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
