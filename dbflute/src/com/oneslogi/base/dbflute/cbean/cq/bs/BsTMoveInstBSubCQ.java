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
 * The base condition-query of T_MOVE_INST_B_SUB.
 * @author DBFlute(AutoGenerator)
 */
public class BsTMoveInstBSubCQ extends AbstractBsTMoveInstBSubCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMoveInstBSubCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMoveInstBSubCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_MOVE_INST_B_SUB) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TMoveInstBSubCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TMoveInstBSubCIQ xcreateCIQ() {
        TMoveInstBSubCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TMoveInstBSubCIQ xnewCIQ() {
        return new TMoveInstBSubCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_MOVE_INST_B_SUB on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TMoveInstBSubCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TMoveInstBSubCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tMoveInstBSubId;
    public ConditionValue xdfgetTMoveInstBSubId()
    { if (_tMoveInstBSubId == null) { _tMoveInstBSubId = nCV(); }
      return _tMoveInstBSubId; }
    protected ConditionValue xgetCValueTMoveInstBSubId() { return xdfgetTMoveInstBSubId(); }

    public Map<String, TMoveInstBCQ> getTMoveInstBSubId_InScopeRelation_TMoveInstB() { return xgetSQueMap("tMoveInstBSubId_InScopeRelation_TMoveInstB"); }
    public String keepTMoveInstBSubId_InScopeRelation_TMoveInstB(TMoveInstBCQ sq) { return xkeepSQue("tMoveInstBSubId_InScopeRelation_TMoveInstB", sq); }

    public Map<String, TMoveInstBCQ> getTMoveInstBSubId_NotInScopeRelation_TMoveInstB() { return xgetSQueMap("tMoveInstBSubId_NotInScopeRelation_TMoveInstB"); }
    public String keepTMoveInstBSubId_NotInScopeRelation_TMoveInstB(TMoveInstBCQ sq) { return xkeepSQue("tMoveInstBSubId_NotInScopeRelation_TMoveInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TMoveInstBSubId_Asc() { regOBA("T_MOVE_INST_B_SUB_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TMoveInstBSubId_Desc() { regOBD("T_MOVE_INST_B_SUB_ID"); return this; }

    protected ConditionValue _tMoveInstBId;
    public ConditionValue xdfgetTMoveInstBId()
    { if (_tMoveInstBId == null) { _tMoveInstBId = nCV(); }
      return _tMoveInstBId; }
    protected ConditionValue xgetCValueTMoveInstBId() { return xdfgetTMoveInstBId(); }

    /**
     * Add order-by as ascend. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TMoveInstBId_Asc() { regOBA("T_MOVE_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TMoveInstBId_Desc() { regOBD("T_MOVE_INST_B_ID"); return this; }

    protected ConditionValue _trpalletId;
    public ConditionValue xdfgetTrpalletId()
    { if (_trpalletId == null) { _trpalletId = nCV(); }
      return _trpalletId; }
    protected ConditionValue xgetCValueTrpalletId() { return xdfgetTrpalletId(); }

    /**
     * Add order-by as ascend. <br>
     * TRPALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TrpalletId_Asc() { regOBA("TRPALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TrpalletId_Desc() { regOBD("TRPALLET_ID"); return this; }

    protected ConditionValue _trsymbolId;
    public ConditionValue xdfgetTrsymbolId()
    { if (_trsymbolId == null) { _trsymbolId = nCV(); }
      return _trsymbolId; }
    protected ConditionValue xgetCValueTrsymbolId() { return xdfgetTrsymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TrsymbolId_Asc() { regOBA("TRSYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOL_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_TrsymbolId_Desc() { regOBD("TRSYMBOL_ID"); return this; }

    protected ConditionValue _moveInstStatus;
    public ConditionValue xdfgetMoveInstStatus()
    { if (_moveInstStatus == null) { _moveInstStatus = nCV(); }
      return _moveInstStatus; }
    protected ConditionValue xgetCValueMoveInstStatus() { return xdfgetMoveInstStatus(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_MoveInstStatus_Asc() { regOBA("MOVE_INST_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_INST_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_MoveInstStatus_Desc() { regOBD("MOVE_INST_STATUS"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTMoveInstBSubCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTMoveInstBSubCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTMoveInstBSubCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTMoveInstBSubCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TMoveInstBSubCQ bq = (TMoveInstBSubCQ)bqs;
        TMoveInstBSubCQ uq = (TMoveInstBSubCQ)uqs;
        if (bq.hasConditionQueryTMoveInstB()) {
            uq.queryTMoveInstB().reflectRelationOnUnionQuery(bq.queryTMoveInstB(), uq.queryTMoveInstB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_MOVE_INST_B by my T_MOVE_INST_B_SUB_ID, named 'TMoveInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TMoveInstBCQ queryTMoveInstB() {
        return xdfgetConditionQueryTMoveInstB();
    }
    public TMoveInstBCQ xdfgetConditionQueryTMoveInstB() {
        String prop = "tMoveInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTMoveInstB()); xsetupOuterJoinTMoveInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TMoveInstBCQ xcreateQueryTMoveInstB() {
        String nrp = xresolveNRP("T_MOVE_INST_B_SUB", "tMoveInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TMoveInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tMoveInstB", nrp);
    }
    protected void xsetupOuterJoinTMoveInstB() { xregOutJo("tMoveInstB"); }
    public boolean hasConditionQueryTMoveInstB() { return xhasQueRlMap("tMoveInstB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TMoveInstBSubCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TMoveInstBSubCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TMoveInstBSubCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TMoveInstBSubCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TMoveInstBSubCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TMoveInstBSubCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TMoveInstBSubCQ> _myselfExistsMap;
    public Map<String, TMoveInstBSubCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TMoveInstBSubCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TMoveInstBSubCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TMoveInstBSubCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TMoveInstBSubCB.class.getName(); }
    protected String xCQ() { return TMoveInstBSubCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
