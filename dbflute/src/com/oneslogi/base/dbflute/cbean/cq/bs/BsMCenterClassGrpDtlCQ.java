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
 * The base condition-query of M_CENTER_CLASS_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterClassGrpDtlCQ extends AbstractBsMCenterClassGrpDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterClassGrpDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterClassGrpDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CENTER_CLASS_GRP_DTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterClassGrpDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterClassGrpDtlCIQ xcreateCIQ() {
        MCenterClassGrpDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterClassGrpDtlCIQ xnewCIQ() {
        return new MCenterClassGrpDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CENTER_CLASS_GRP_DTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterClassGrpDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterClassGrpDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerClassGrpDtlId;
    public ConditionValue xdfgetCenterClassGrpDtlId()
    { if (_centerClassGrpDtlId == null) { _centerClassGrpDtlId = nCV(); }
      return _centerClassGrpDtlId; }
    protected ConditionValue xgetCValueCenterClassGrpDtlId() { return xdfgetCenterClassGrpDtlId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_CenterClassGrpDtlId_Asc() { regOBA("CENTER_CLASS_GRP_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_CenterClassGrpDtlId_Desc() { regOBD("CENTER_CLASS_GRP_DTL_ID"); return this; }

    protected ConditionValue _centerClassGrpId;
    public ConditionValue xdfgetCenterClassGrpId()
    { if (_centerClassGrpId == null) { _centerClassGrpId = nCV(); }
      return _centerClassGrpId; }
    protected ConditionValue xgetCValueCenterClassGrpId() { return xdfgetCenterClassGrpId(); }

    public Map<String, MCenterClassGrpCQ> getCenterClassGrpId_InScopeRelation_MCenterClassGrp() { return xgetSQueMap("centerClassGrpId_InScopeRelation_MCenterClassGrp"); }
    public String keepCenterClassGrpId_InScopeRelation_MCenterClassGrp(MCenterClassGrpCQ sq) { return xkeepSQue("centerClassGrpId_InScopeRelation_MCenterClassGrp", sq); }

    public Map<String, MCenterClassGrpCQ> getCenterClassGrpId_NotInScopeRelation_MCenterClassGrp() { return xgetSQueMap("centerClassGrpId_NotInScopeRelation_MCenterClassGrp"); }
    public String keepCenterClassGrpId_NotInScopeRelation_MCenterClassGrp(MCenterClassGrpCQ sq) { return xkeepSQue("centerClassGrpId_NotInScopeRelation_MCenterClassGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_CenterClassGrpId_Asc() { regOBA("CENTER_CLASS_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_GRP}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_CenterClassGrpId_Desc() { regOBD("CENTER_CLASS_GRP_ID"); return this; }

    protected ConditionValue _centerClassDtlId;
    public ConditionValue xdfgetCenterClassDtlId()
    { if (_centerClassDtlId == null) { _centerClassDtlId = nCV(); }
      return _centerClassDtlId; }
    protected ConditionValue xgetCValueCenterClassDtlId() { return xdfgetCenterClassDtlId(); }

    public Map<String, MCenterClassDtlCQ> getCenterClassDtlId_InScopeRelation_MCenterClassDtl() { return xgetSQueMap("centerClassDtlId_InScopeRelation_MCenterClassDtl"); }
    public String keepCenterClassDtlId_InScopeRelation_MCenterClassDtl(MCenterClassDtlCQ sq) { return xkeepSQue("centerClassDtlId_InScopeRelation_MCenterClassDtl", sq); }

    public Map<String, MCenterClassDtlCQ> getCenterClassDtlId_NotInScopeRelation_MCenterClassDtl() { return xgetSQueMap("centerClassDtlId_NotInScopeRelation_MCenterClassDtl"); }
    public String keepCenterClassDtlId_NotInScopeRelation_MCenterClassDtl(MCenterClassDtlCQ sq) { return xkeepSQue("centerClassDtlId_NotInScopeRelation_MCenterClassDtl", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_CenterClassDtlId_Asc() { regOBA("CENTER_CLASS_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_CenterClassDtlId_Desc() { regOBD("CENTER_CLASS_DTL_ID"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_DefaultFlg_Asc() { regOBA("DEFAULT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_DefaultFlg_Desc() { regOBD("DEFAULT_FLG"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCenterClassGrpDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCenterClassGrpDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCenterClassGrpDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterClassGrpDtlCQ bq = (MCenterClassGrpDtlCQ)bqs;
        MCenterClassGrpDtlCQ uq = (MCenterClassGrpDtlCQ)uqs;
        if (bq.hasConditionQueryMCenterClassDtl()) {
            uq.queryMCenterClassDtl().reflectRelationOnUnionQuery(bq.queryMCenterClassDtl(), uq.queryMCenterClassDtl());
        }
        if (bq.hasConditionQueryMCenterClassGrp()) {
            uq.queryMCenterClassGrp().reflectRelationOnUnionQuery(bq.queryMCenterClassGrp(), uq.queryMCenterClassGrp());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtl() {
        return xdfgetConditionQueryMCenterClassDtl();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtl() {
        String prop = "mCenterClassDtl";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtl()); xsetupOuterJoinMCenterClassDtl(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtl() {
        String nrp = xresolveNRP("M_CENTER_CLASS_GRP_DTL", "mCenterClassDtl"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtl", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtl() { xregOutJo("mCenterClassDtl"); }
    public boolean hasConditionQueryMCenterClassDtl() { return xhasQueRlMap("mCenterClassDtl"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_GRP by my CENTER_CLASS_GRP_ID, named 'MCenterClassGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassGrpCQ queryMCenterClassGrp() {
        return xdfgetConditionQueryMCenterClassGrp();
    }
    public MCenterClassGrpCQ xdfgetConditionQueryMCenterClassGrp() {
        String prop = "mCenterClassGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassGrp()); xsetupOuterJoinMCenterClassGrp(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterClassGrpCQ xcreateQueryMCenterClassGrp() {
        String nrp = xresolveNRP("M_CENTER_CLASS_GRP_DTL", "mCenterClassGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassGrp", nrp);
    }
    protected void xsetupOuterJoinMCenterClassGrp() { xregOutJo("mCenterClassGrp"); }
    public boolean hasConditionQueryMCenterClassGrp() { return xhasQueRlMap("mCenterClassGrp"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCenterClassGrpDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterClassGrpDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterClassGrpDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterClassGrpDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterClassGrpDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterClassGrpDtlCQ> _myselfExistsMap;
    public Map<String, MCenterClassGrpDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterClassGrpDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterClassGrpDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterClassGrpDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterClassGrpDtlCB.class.getName(); }
    protected String xCQ() { return MCenterClassGrpDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
