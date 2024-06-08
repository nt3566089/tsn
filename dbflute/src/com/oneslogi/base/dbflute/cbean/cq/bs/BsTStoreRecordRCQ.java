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
 * The base condition-query of T_STORE_RECORD_R.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStoreRecordRCQ extends AbstractBsTStoreRecordRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStoreRecordRCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreRecordRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_STORE_RECORD_R) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStoreRecordRCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStoreRecordRCIQ xcreateCIQ() {
        TStoreRecordRCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStoreRecordRCIQ xnewCIQ() {
        return new TStoreRecordRCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_STORE_RECORD_R on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStoreRecordRCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStoreRecordRCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _storeRecordHId;
    public ConditionValue xdfgetStoreRecordHId()
    { if (_storeRecordHId == null) { _storeRecordHId = nCV(); }
      return _storeRecordHId; }
    protected ConditionValue xgetCValueStoreRecordHId() { return xdfgetStoreRecordHId(); }

    public Map<String, TStoreRecordHCQ> getStoreRecordHId_InScopeRelation_TStoreRecordH() { return xgetSQueMap("storeRecordHId_InScopeRelation_TStoreRecordH"); }
    public String keepStoreRecordHId_InScopeRelation_TStoreRecordH(TStoreRecordHCQ sq) { return xkeepSQue("storeRecordHId_InScopeRelation_TStoreRecordH", sq); }

    public Map<String, TStoreRecordHCQ> getStoreRecordHId_NotInScopeRelation_TStoreRecordH() { return xgetSQueMap("storeRecordHId_NotInScopeRelation_TStoreRecordH"); }
    public String keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(TStoreRecordHCQ sq) { return xkeepSQue("storeRecordHId_NotInScopeRelation_TStoreRecordH", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_StoreRecordHId_Asc() { regOBA("STORE_RECORD_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_StoreRecordHId_Desc() { regOBD("STORE_RECORD_H_ID"); return this; }

    protected ConditionValue _receiveRecordOutFlg;
    public ConditionValue xdfgetReceiveRecordOutFlg()
    { if (_receiveRecordOutFlg == null) { _receiveRecordOutFlg = nCV(); }
      return _receiveRecordOutFlg; }
    protected ConditionValue xgetCValueReceiveRecordOutFlg() { return xdfgetReceiveRecordOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ReceiveRecordOutFlg_Asc() { regOBA("RECEIVE_RECORD_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ReceiveRecordOutFlg_Desc() { regOBD("RECEIVE_RECORD_OUT_FLG"); return this; }

    protected ConditionValue _receiveRecordOutUserId;
    public ConditionValue xdfgetReceiveRecordOutUserId()
    { if (_receiveRecordOutUserId == null) { _receiveRecordOutUserId = nCV(); }
      return _receiveRecordOutUserId; }
    protected ConditionValue xgetCValueReceiveRecordOutUserId() { return xdfgetReceiveRecordOutUserId(); }

    public Map<String, BUserCQ> getReceiveRecordOutUserId_InScopeRelation_BUser() { return xgetSQueMap("receiveRecordOutUserId_InScopeRelation_BUser"); }
    public String keepReceiveRecordOutUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("receiveRecordOutUserId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getReceiveRecordOutUserId_NotInScopeRelation_BUser() { return xgetSQueMap("receiveRecordOutUserId_NotInScopeRelation_BUser"); }
    public String keepReceiveRecordOutUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("receiveRecordOutUserId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ReceiveRecordOutUserId_Asc() { regOBA("RECEIVE_RECORD_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ReceiveRecordOutUserId_Desc() { regOBD("RECEIVE_RECORD_OUT_USER_ID"); return this; }

    protected ConditionValue _receiveRecordOutDt;
    public ConditionValue xdfgetReceiveRecordOutDt()
    { if (_receiveRecordOutDt == null) { _receiveRecordOutDt = nCV(); }
      return _receiveRecordOutDt; }
    protected ConditionValue xgetCValueReceiveRecordOutDt() { return xdfgetReceiveRecordOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ReceiveRecordOutDt_Asc() { regOBA("RECEIVE_RECORD_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_RECORD_OUT_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ReceiveRecordOutDt_Desc() { regOBD("RECEIVE_RECORD_OUT_DT"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStoreRecordRCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordRCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStoreRecordRCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStoreRecordRCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStoreRecordRCQ bq = (TStoreRecordRCQ)bqs;
        TStoreRecordRCQ uq = (TStoreRecordRCQ)uqs;
        if (bq.hasConditionQueryBUser()) {
            uq.queryBUser().reflectRelationOnUnionQuery(bq.queryBUser(), uq.queryBUser());
        }
        if (bq.hasConditionQueryTStoreRecordH()) {
            uq.queryTStoreRecordH().reflectRelationOnUnionQuery(bq.queryTStoreRecordH(), uq.queryTStoreRecordH());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveRecordOutFlg()) {
            uq.queryBClassDtlByReceiveRecordOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveRecordOutFlg(), uq.queryBClassDtlByReceiveRecordOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'.
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
        String nrp = xresolveNRP("T_STORE_RECORD_R", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUser", nrp);
    }
    protected void xsetupOuterJoinBUser() { xregOutJo("bUser"); }
    public boolean hasConditionQueryBUser() { return xhasQueRlMap("bUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_RECORD_H by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreRecordHCQ queryTStoreRecordH() {
        return xdfgetConditionQueryTStoreRecordH();
    }
    public TStoreRecordHCQ xdfgetConditionQueryTStoreRecordH() {
        String prop = "tStoreRecordH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreRecordH()); xsetupOuterJoinTStoreRecordH(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreRecordHCQ xcreateQueryTStoreRecordH() {
        String nrp = xresolveNRP("T_STORE_RECORD_R", "tStoreRecordH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreRecordHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreRecordH", nrp);
    }
    protected void xsetupOuterJoinTStoreRecordH() { xregOutJo("tStoreRecordH"); }
    public boolean hasConditionQueryTStoreRecordH() { return xhasQueRlMap("tStoreRecordH"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RECEIVE_RECORD_OUT_FLG, named 'BClassDtlByReceiveRecordOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveRecordOutFlg() {
        return xdfgetConditionQueryBClassDtlByReceiveRecordOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveRecordOutFlg() {
        String prop = "bClassDtlByReceiveRecordOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveRecordOutFlg()); xsetupOuterJoinBClassDtlByReceiveRecordOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveRecordOutFlg() {
        String nrp = xresolveNRP("T_STORE_RECORD_R", "bClassDtlByReceiveRecordOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveRecordOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveRecordOutFlg() { xregOutJo("bClassDtlByReceiveRecordOutFlg"); }
    public boolean hasConditionQueryBClassDtlByReceiveRecordOutFlg() { return xhasQueRlMap("bClassDtlByReceiveRecordOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStoreRecordRCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStoreRecordRCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStoreRecordRCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStoreRecordRCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStoreRecordRCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStoreRecordRCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStoreRecordRCQ> _myselfExistsMap;
    public Map<String, TStoreRecordRCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStoreRecordRCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStoreRecordRCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStoreRecordRCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStoreRecordRCB.class.getName(); }
    protected String xCQ() { return TStoreRecordRCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
