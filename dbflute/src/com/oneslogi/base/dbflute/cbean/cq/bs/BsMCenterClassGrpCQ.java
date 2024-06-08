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
 * The base condition-query of M_CENTER_CLASS_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterClassGrpCQ extends AbstractBsMCenterClassGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterClassGrpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterClassGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CENTER_CLASS_GRP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterClassGrpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterClassGrpCIQ xcreateCIQ() {
        MCenterClassGrpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterClassGrpCIQ xnewCIQ() {
        return new MCenterClassGrpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CENTER_CLASS_GRP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterClassGrpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterClassGrpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerClassGrpId;
    public ConditionValue xdfgetCenterClassGrpId()
    { if (_centerClassGrpId == null) { _centerClassGrpId = nCV(); }
      return _centerClassGrpId; }
    protected ConditionValue xgetCValueCenterClassGrpId() { return xdfgetCenterClassGrpId(); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassGrpId_ExistsReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassGrpId_ExistsReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassGrpId_ExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassGrpId_ExistsReferrer_MCenterClassGrpDtlList", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassGrpId_SpecifyDerivedReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassGrpId_SpecifyDerivedReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassGrpId_SpecifyDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassGrpId_SpecifyDerivedReferrer_MCenterClassGrpDtlList", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList", sq); }
    public Map<String, Object> xdfgetCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter() { return xgetSQuePmMap("centerClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter(Object pm) { return xkeepSQuePm("centerClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_CenterClassGrpId_Asc() { regOBA("CENTER_CLASS_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_CenterClassGrpId_Desc() { regOBD("CENTER_CLASS_GRP_ID"); return this; }

    protected ConditionValue _classGrpCd;
    public ConditionValue xdfgetClassGrpCd()
    { if (_classGrpCd == null) { _classGrpCd = nCV(); }
      return _classGrpCd; }
    protected ConditionValue xgetCValueClassGrpCd() { return xdfgetClassGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_ClassGrpCd_Asc() { regOBA("CLASS_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_ClassGrpCd_Desc() { regOBD("CLASS_GRP_CD"); return this; }

    protected ConditionValue _classGrpComment;
    public ConditionValue xdfgetClassGrpComment()
    { if (_classGrpComment == null) { _classGrpComment = nCV(); }
      return _classGrpComment; }
    protected ConditionValue xgetCValueClassGrpComment() { return xdfgetClassGrpComment(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_ClassGrpComment_Asc() { regOBA("CLASS_GRP_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_ClassGrpComment_Desc() { regOBD("CLASS_GRP_COMMENT"); return this; }

    protected ConditionValue _centerClassId;
    public ConditionValue xdfgetCenterClassId()
    { if (_centerClassId == null) { _centerClassId = nCV(); }
      return _centerClassId; }
    protected ConditionValue xgetCValueCenterClassId() { return xdfgetCenterClassId(); }

    public Map<String, MCenterClassCQ> getCenterClassId_InScopeRelation_MCenterClass() { return xgetSQueMap("centerClassId_InScopeRelation_MCenterClass"); }
    public String keepCenterClassId_InScopeRelation_MCenterClass(MCenterClassCQ sq) { return xkeepSQue("centerClassId_InScopeRelation_MCenterClass", sq); }

    public Map<String, MCenterClassCQ> getCenterClassId_NotInScopeRelation_MCenterClass() { return xgetSQueMap("centerClassId_NotInScopeRelation_MCenterClass"); }
    public String keepCenterClassId_NotInScopeRelation_MCenterClass(MCenterClassCQ sq) { return xkeepSQue("centerClassId_NotInScopeRelation_MCenterClass", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_CenterClassId_Asc() { regOBA("CENTER_CLASS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_CenterClassId_Desc() { regOBD("CENTER_CLASS_ID"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCenterClassGrpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassGrpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCenterClassGrpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCenterClassGrpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterClassGrpCQ bq = (MCenterClassGrpCQ)bqs;
        MCenterClassGrpCQ uq = (MCenterClassGrpCQ)uqs;
        if (bq.hasConditionQueryMCenterClass()) {
            uq.queryMCenterClass().reflectRelationOnUnionQuery(bq.queryMCenterClass(), uq.queryMCenterClass());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassCQ queryMCenterClass() {
        return xdfgetConditionQueryMCenterClass();
    }
    public MCenterClassCQ xdfgetConditionQueryMCenterClass() {
        String prop = "mCenterClass";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClass()); xsetupOuterJoinMCenterClass(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterClassCQ xcreateQueryMCenterClass() {
        String nrp = xresolveNRP("M_CENTER_CLASS_GRP", "mCenterClass"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClass", nrp);
    }
    protected void xsetupOuterJoinMCenterClass() { xregOutJo("mCenterClass"); }
    public boolean hasConditionQueryMCenterClass() { return xhasQueRlMap("mCenterClass"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCenterClassGrpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterClassGrpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterClassGrpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterClassGrpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterClassGrpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterClassGrpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterClassGrpCQ> _myselfExistsMap;
    public Map<String, MCenterClassGrpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterClassGrpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterClassGrpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterClassGrpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterClassGrpCB.class.getName(); }
    protected String xCQ() { return MCenterClassGrpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
