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
 * The base condition-query of B_CLASS_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBClassGrpDtlCQ extends AbstractBsBClassGrpDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BClassGrpDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBClassGrpDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_CLASS_GRP_DTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BClassGrpDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BClassGrpDtlCIQ xcreateCIQ() {
        BClassGrpDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BClassGrpDtlCIQ xnewCIQ() {
        return new BClassGrpDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_CLASS_GRP_DTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BClassGrpDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BClassGrpDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _classGrpDtlId;
    public ConditionValue xdfgetClassGrpDtlId()
    { if (_classGrpDtlId == null) { _classGrpDtlId = nCV(); }
      return _classGrpDtlId; }
    protected ConditionValue xgetCValueClassGrpDtlId() { return xdfgetClassGrpDtlId(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ClassGrpDtlId_Asc() { regOBA("CLASS_GRP_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ClassGrpDtlId_Desc() { regOBD("CLASS_GRP_DTL_ID"); return this; }

    protected ConditionValue _classGrpId;
    public ConditionValue xdfgetClassGrpId()
    { if (_classGrpId == null) { _classGrpId = nCV(); }
      return _classGrpId; }
    protected ConditionValue xgetCValueClassGrpId() { return xdfgetClassGrpId(); }

    public Map<String, BClassGrpCQ> getClassGrpId_InScopeRelation_BClassGrp() { return xgetSQueMap("classGrpId_InScopeRelation_BClassGrp"); }
    public String keepClassGrpId_InScopeRelation_BClassGrp(BClassGrpCQ sq) { return xkeepSQue("classGrpId_InScopeRelation_BClassGrp", sq); }

    public Map<String, BClassGrpCQ> getClassGrpId_NotInScopeRelation_BClassGrp() { return xgetSQueMap("classGrpId_NotInScopeRelation_BClassGrp"); }
    public String keepClassGrpId_NotInScopeRelation_BClassGrp(BClassGrpCQ sq) { return xkeepSQue("classGrpId_NotInScopeRelation_BClassGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS_GRP}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ClassGrpId_Asc() { regOBA("CLASS_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS_GRP}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ClassGrpId_Desc() { regOBD("CLASS_GRP_ID"); return this; }

    protected ConditionValue _classDtlId;
    public ConditionValue xdfgetClassDtlId()
    { if (_classDtlId == null) { _classDtlId = nCV(); }
      return _classDtlId; }
    protected ConditionValue xgetCValueClassDtlId() { return xdfgetClassDtlId(); }

    public Map<String, BClassDtlCQ> getClassDtlId_InScopeRelation_BClassDtl() { return xgetSQueMap("classDtlId_InScopeRelation_BClassDtl"); }
    public String keepClassDtlId_InScopeRelation_BClassDtl(BClassDtlCQ sq) { return xkeepSQue("classDtlId_InScopeRelation_BClassDtl", sq); }

    public Map<String, BClassDtlCQ> getClassDtlId_NotInScopeRelation_BClassDtl() { return xgetSQueMap("classDtlId_NotInScopeRelation_BClassDtl"); }
    public String keepClassDtlId_NotInScopeRelation_BClassDtl(BClassDtlCQ sq) { return xkeepSQue("classDtlId_NotInScopeRelation_BClassDtl", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CLASS_DTL}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ClassDtlId_Asc() { regOBA("CLASS_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CLASS_DTL}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ClassDtlId_Desc() { regOBD("CLASS_DTL_ID"); return this; }

    protected ConditionValue _defaultFlg;
    public ConditionValue xdfgetDefaultFlg()
    { if (_defaultFlg == null) { _defaultFlg = nCV(); }
      return _defaultFlg; }
    protected ConditionValue xgetCValueDefaultFlg() { return xdfgetDefaultFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_DefaultFlg_Asc() { regOBA("DEFAULT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_DefaultFlg_Desc() { regOBD("DEFAULT_FLG"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBClassGrpDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassGrpDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBClassGrpDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBClassGrpDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BClassGrpDtlCQ bq = (BClassGrpDtlCQ)bqs;
        BClassGrpDtlCQ uq = (BClassGrpDtlCQ)uqs;
        if (bq.hasConditionQueryBClassDtl()) {
            uq.queryBClassDtl().reflectRelationOnUnionQuery(bq.queryBClassDtl(), uq.queryBClassDtl());
        }
        if (bq.hasConditionQueryBClassGrp()) {
            uq.queryBClassGrp().reflectRelationOnUnionQuery(bq.queryBClassGrp(), uq.queryBClassGrp());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CLASS_DTL_ID, named 'BClassDtl'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtl() {
        return xdfgetConditionQueryBClassDtl();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtl() {
        String prop = "bClassDtl";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtl()); xsetupOuterJoinBClassDtl(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtl() {
        String nrp = xresolveNRP("B_CLASS_GRP_DTL", "bClassDtl"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtl", nrp);
    }
    protected void xsetupOuterJoinBClassDtl() { xregOutJo("bClassDtl"); }
    public boolean hasConditionQueryBClassDtl() { return xhasQueRlMap("bClassDtl"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_GRP by my CLASS_GRP_ID, named 'BClassGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassGrpCQ queryBClassGrp() {
        return xdfgetConditionQueryBClassGrp();
    }
    public BClassGrpCQ xdfgetConditionQueryBClassGrp() {
        String prop = "bClassGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassGrp()); xsetupOuterJoinBClassGrp(); }
        return xgetQueRlMap(prop);
    }
    protected BClassGrpCQ xcreateQueryBClassGrp() {
        String nrp = xresolveNRP("B_CLASS_GRP_DTL", "bClassGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassGrp", nrp);
    }
    protected void xsetupOuterJoinBClassGrp() { xregOutJo("bClassGrp"); }
    public boolean hasConditionQueryBClassGrp() { return xhasQueRlMap("bClassGrp"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BClassGrpDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BClassGrpDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BClassGrpDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BClassGrpDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BClassGrpDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BClassGrpDtlCQ> _myselfExistsMap;
    public Map<String, BClassGrpDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BClassGrpDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BClassGrpDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BClassGrpDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BClassGrpDtlCB.class.getName(); }
    protected String xCQ() { return BClassGrpDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
