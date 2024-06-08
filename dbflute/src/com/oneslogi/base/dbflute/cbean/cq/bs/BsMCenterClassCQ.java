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
 * The base condition-query of M_CENTER_CLASS.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterClassCQ extends AbstractBsMCenterClassCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterClassCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterClassCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CENTER_CLASS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterClassCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterClassCIQ xcreateCIQ() {
        MCenterClassCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterClassCIQ xnewCIQ() {
        return new MCenterClassCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CENTER_CLASS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterClassCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterClassCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerClassId;
    public ConditionValue xdfgetCenterClassId()
    { if (_centerClassId == null) { _centerClassId = nCV(); }
      return _centerClassId; }
    protected ConditionValue xgetCValueCenterClassId() { return xdfgetCenterClassId(); }

    public Map<String, MCenterClassDtlCQ> xdfgetCenterClassId_ExistsReferrer_MCenterClassDtlList() { return xgetSQueMap("centerClassId_ExistsReferrer_MCenterClassDtlList"); }
    public String keepCenterClassId_ExistsReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq) { return xkeepSQue("centerClassId_ExistsReferrer_MCenterClassDtlList", sq); }

    public Map<String, MCenterClassGrpCQ> xdfgetCenterClassId_ExistsReferrer_MCenterClassGrpList() { return xgetSQueMap("centerClassId_ExistsReferrer_MCenterClassGrpList"); }
    public String keepCenterClassId_ExistsReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq) { return xkeepSQue("centerClassId_ExistsReferrer_MCenterClassGrpList", sq); }

    public Map<String, MCenterClassDtlCQ> xdfgetCenterClassId_NotExistsReferrer_MCenterClassDtlList() { return xgetSQueMap("centerClassId_NotExistsReferrer_MCenterClassDtlList"); }
    public String keepCenterClassId_NotExistsReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq) { return xkeepSQue("centerClassId_NotExistsReferrer_MCenterClassDtlList", sq); }

    public Map<String, MCenterClassGrpCQ> xdfgetCenterClassId_NotExistsReferrer_MCenterClassGrpList() { return xgetSQueMap("centerClassId_NotExistsReferrer_MCenterClassGrpList"); }
    public String keepCenterClassId_NotExistsReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq) { return xkeepSQue("centerClassId_NotExistsReferrer_MCenterClassGrpList", sq); }

    public Map<String, MCenterClassDtlCQ> xdfgetCenterClassId_SpecifyDerivedReferrer_MCenterClassDtlList() { return xgetSQueMap("centerClassId_SpecifyDerivedReferrer_MCenterClassDtlList"); }
    public String keepCenterClassId_SpecifyDerivedReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq) { return xkeepSQue("centerClassId_SpecifyDerivedReferrer_MCenterClassDtlList", sq); }

    public Map<String, MCenterClassGrpCQ> xdfgetCenterClassId_SpecifyDerivedReferrer_MCenterClassGrpList() { return xgetSQueMap("centerClassId_SpecifyDerivedReferrer_MCenterClassGrpList"); }
    public String keepCenterClassId_SpecifyDerivedReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq) { return xkeepSQue("centerClassId_SpecifyDerivedReferrer_MCenterClassGrpList", sq); }

    public Map<String, MCenterClassDtlCQ> xdfgetCenterClassId_QueryDerivedReferrer_MCenterClassDtlList() { return xgetSQueMap("centerClassId_QueryDerivedReferrer_MCenterClassDtlList"); }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq) { return xkeepSQue("centerClassId_QueryDerivedReferrer_MCenterClassDtlList", sq); }
    public Map<String, Object> xdfgetCenterClassId_QueryDerivedReferrer_MCenterClassDtlListParameter() { return xgetSQuePmMap("centerClassId_QueryDerivedReferrer_MCenterClassDtlList"); }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassDtlListParameter(Object pm) { return xkeepSQuePm("centerClassId_QueryDerivedReferrer_MCenterClassDtlList", pm); }

    public Map<String, MCenterClassGrpCQ> xdfgetCenterClassId_QueryDerivedReferrer_MCenterClassGrpList() { return xgetSQueMap("centerClassId_QueryDerivedReferrer_MCenterClassGrpList"); }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq) { return xkeepSQue("centerClassId_QueryDerivedReferrer_MCenterClassGrpList", sq); }
    public Map<String, Object> xdfgetCenterClassId_QueryDerivedReferrer_MCenterClassGrpListParameter() { return xgetSQuePmMap("centerClassId_QueryDerivedReferrer_MCenterClassGrpList"); }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassGrpListParameter(Object pm) { return xkeepSQuePm("centerClassId_QueryDerivedReferrer_MCenterClassGrpList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_CenterClassId_Asc() { regOBA("CENTER_CLASS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_CenterClassId_Desc() { regOBD("CENTER_CLASS_ID"); return this; }

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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _classCd;
    public ConditionValue xdfgetClassCd()
    { if (_classCd == null) { _classCd = nCV(); }
      return _classCd; }
    protected ConditionValue xgetCValueClassCd() { return xdfgetClassCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_CD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_ClassCd_Asc() { regOBA("CLASS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_CD: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_ClassCd_Desc() { regOBD("CLASS_CD"); return this; }

    protected ConditionValue _classComment;
    public ConditionValue xdfgetClassComment()
    { if (_classComment == null) { _classComment = nCV(); }
      return _classComment; }
    protected ConditionValue xgetCValueClassComment() { return xdfgetClassComment(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_ClassComment_Asc() { regOBA("CLASS_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_COMMENT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_ClassComment_Desc() { regOBD("CLASS_COMMENT"); return this; }

    protected ConditionValue _systemType;
    public ConditionValue xdfgetSystemType()
    { if (_systemType == null) { _systemType = nCV(); }
      return _systemType; }
    protected ConditionValue xgetCValueSystemType() { return xdfgetSystemType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_SystemType_Asc() { regOBA("SYSTEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_SystemType_Desc() { regOBD("SYSTEM_TYPE"); return this; }

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
    public BsMCenterClassCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCenterClassCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCenterClassCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCenterClassCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCenterClassCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCenterClassCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCenterClassCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCenterClassCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCenterClassCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCenterClassCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCenterClassCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterClassCQ bq = (MCenterClassCQ)bqs;
        MCenterClassCQ uq = (MCenterClassCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryBClassDtlBySystemType()) {
            uq.queryBClassDtlBySystemType().reflectRelationOnUnionQuery(bq.queryBClassDtlBySystemType(), uq.queryBClassDtlBySystemType());
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
        String nrp = xresolveNRP("M_CENTER_CLASS", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySystemType() {
        return xdfgetConditionQueryBClassDtlBySystemType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySystemType() {
        String prop = "bClassDtlBySystemType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySystemType()); xsetupOuterJoinBClassDtlBySystemType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySystemType() {
        String nrp = xresolveNRP("M_CENTER_CLASS", "bClassDtlBySystemType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySystemType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySystemType() { xregOutJo("bClassDtlBySystemType"); }
    public boolean hasConditionQueryBClassDtlBySystemType() { return xhasQueRlMap("bClassDtlBySystemType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCenterClassCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterClassCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterClassCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterClassCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterClassCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterClassCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterClassCQ> _myselfExistsMap;
    public Map<String, MCenterClassCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterClassCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterClassCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterClassCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterClassCB.class.getName(); }
    protected String xCQ() { return MCenterClassCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
