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
 * The base condition-query of T_INVENTORY_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryHCQ extends AbstractBsTInventoryHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_INVENTORY_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryHCIQ xcreateCIQ() {
        TInventoryHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryHCIQ xnewCIQ() {
        return new TInventoryHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_INVENTORY_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryHId;
    public ConditionValue xdfgetInventoryHId()
    { if (_inventoryHId == null) { _inventoryHId = nCV(); }
      return _inventoryHId; }
    protected ConditionValue xgetCValueInventoryHId() { return xdfgetInventoryHId(); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_ExistsReferrer_TInventoryBList"); }
    public String keepInventoryHId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_ExistsReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_ExistsReferrer_TInventoryInstList"); }
    public String keepInventoryHId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_ExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_NotExistsReferrer_TInventoryBList"); }
    public String keepInventoryHId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_NotExistsReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_NotExistsReferrer_TInventoryInstList"); }
    public String keepInventoryHId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_NotExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepInventoryHId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_SpecifyDerivedReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_SpecifyDerivedReferrer_TInventoryInstList"); }
    public String keepInventoryHId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_SpecifyDerivedReferrer_TInventoryInstList", sq); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("inventoryHId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("inventoryHId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_QueryDerivedReferrer_TInventoryInstList", sq); }
    public Map<String, Object> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryInstListParameter() { return xgetSQuePmMap("inventoryHId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryInstListParameter(Object pm) { return xkeepSQuePm("inventoryHId_QueryDerivedReferrer_TInventoryInstList", pm); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _batchNum;
    public ConditionValue xdfgetBatchNum()
    { if (_batchNum == null) { _batchNum = nCV(); }
      return _batchNum; }
    protected ConditionValue xgetCValueBatchNum() { return xdfgetBatchNum(); }

    /**
     * Add order-by as ascend. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_BatchNum_Asc() { regOBA("BATCH_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_BatchNum_Desc() { regOBD("BATCH_NUM"); return this; }

    protected ConditionValue _inventoryDt;
    public ConditionValue xdfgetInventoryDt()
    { if (_inventoryDt == null) { _inventoryDt = nCV(); }
      return _inventoryDt; }
    protected ConditionValue xgetCValueInventoryDt() { return xdfgetInventoryDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryDt_Asc() { regOBA("INVENTORY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryDt_Desc() { regOBD("INVENTORY_DT"); return this; }

    protected ConditionValue _inventoryKey;
    public ConditionValue xdfgetInventoryKey()
    { if (_inventoryKey == null) { _inventoryKey = nCV(); }
      return _inventoryKey; }
    protected ConditionValue xgetCValueInventoryKey() { return xdfgetInventoryKey(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryKey_Asc() { regOBA("INVENTORY_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryKey_Desc() { regOBD("INVENTORY_KEY"); return this; }

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
    public BsTInventoryHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryHCQ bq = (TInventoryHCQ)bqs;
        TInventoryHCQ uq = (TInventoryHCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_INVENTORY_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_INVENTORY_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryHCQ> _myselfExistsMap;
    public Map<String, TInventoryHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryHCB.class.getName(); }
    protected String xCQ() { return TInventoryHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
