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
 * The base condition-query of B_ROLE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BsBRoleGrpCQ extends AbstractBsBRoleGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BRoleGrpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBRoleGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_ROLE_GRP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BRoleGrpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BRoleGrpCIQ xcreateCIQ() {
        BRoleGrpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BRoleGrpCIQ xnewCIQ() {
        return new BRoleGrpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_ROLE_GRP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BRoleGrpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BRoleGrpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _roleGrpId;
    public ConditionValue xdfgetRoleGrpId()
    { if (_roleGrpId == null) { _roleGrpId = nCV(); }
      return _roleGrpId; }
    protected ConditionValue xgetCValueRoleGrpId() { return xdfgetRoleGrpId(); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleGrpId_ExistsReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleGrpId_ExistsReferrer_BRoleGrpDtlList"); }
    public String keepRoleGrpId_ExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleGrpId_ExistsReferrer_BRoleGrpDtlList", sq); }

    public Map<String, BUserCQ> xdfgetRoleGrpId_ExistsReferrer_BUserList() { return xgetSQueMap("roleGrpId_ExistsReferrer_BUserList"); }
    public String keepRoleGrpId_ExistsReferrer_BUserList(BUserCQ sq) { return xkeepSQue("roleGrpId_ExistsReferrer_BUserList", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleGrpId_NotExistsReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleGrpId_NotExistsReferrer_BRoleGrpDtlList"); }
    public String keepRoleGrpId_NotExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleGrpId_NotExistsReferrer_BRoleGrpDtlList", sq); }

    public Map<String, BUserCQ> xdfgetRoleGrpId_NotExistsReferrer_BUserList() { return xgetSQueMap("roleGrpId_NotExistsReferrer_BUserList"); }
    public String keepRoleGrpId_NotExistsReferrer_BUserList(BUserCQ sq) { return xkeepSQue("roleGrpId_NotExistsReferrer_BUserList", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleGrpId_SpecifyDerivedReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleGrpId_SpecifyDerivedReferrer_BRoleGrpDtlList"); }
    public String keepRoleGrpId_SpecifyDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleGrpId_SpecifyDerivedReferrer_BRoleGrpDtlList", sq); }

    public Map<String, BUserCQ> xdfgetRoleGrpId_SpecifyDerivedReferrer_BUserList() { return xgetSQueMap("roleGrpId_SpecifyDerivedReferrer_BUserList"); }
    public String keepRoleGrpId_SpecifyDerivedReferrer_BUserList(BUserCQ sq) { return xkeepSQue("roleGrpId_SpecifyDerivedReferrer_BUserList", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlList() { return xgetSQueMap("roleGrpId_QueryDerivedReferrer_BRoleGrpDtlList"); }
    public String keepRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq) { return xkeepSQue("roleGrpId_QueryDerivedReferrer_BRoleGrpDtlList", sq); }
    public Map<String, Object> xdfgetRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlListParameter() { return xgetSQuePmMap("roleGrpId_QueryDerivedReferrer_BRoleGrpDtlList"); }
    public String keepRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlListParameter(Object pm) { return xkeepSQuePm("roleGrpId_QueryDerivedReferrer_BRoleGrpDtlList", pm); }

    public Map<String, BUserCQ> xdfgetRoleGrpId_QueryDerivedReferrer_BUserList() { return xgetSQueMap("roleGrpId_QueryDerivedReferrer_BUserList"); }
    public String keepRoleGrpId_QueryDerivedReferrer_BUserList(BUserCQ sq) { return xkeepSQue("roleGrpId_QueryDerivedReferrer_BUserList", sq); }
    public Map<String, Object> xdfgetRoleGrpId_QueryDerivedReferrer_BUserListParameter() { return xgetSQuePmMap("roleGrpId_QueryDerivedReferrer_BUserList"); }
    public String keepRoleGrpId_QueryDerivedReferrer_BUserListParameter(Object pm) { return xkeepSQuePm("roleGrpId_QueryDerivedReferrer_BUserList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_RoleGrpId_Asc() { regOBA("ROLE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_RoleGrpId_Desc() { regOBD("ROLE_GRP_ID"); return this; }

    protected ConditionValue _roleGrpCd;
    public ConditionValue xdfgetRoleGrpCd()
    { if (_roleGrpCd == null) { _roleGrpCd = nCV(); }
      return _roleGrpCd; }
    protected ConditionValue xgetCValueRoleGrpCd() { return xdfgetRoleGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_RoleGrpCd_Asc() { regOBA("ROLE_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_RoleGrpCd_Desc() { regOBD("ROLE_GRP_CD"); return this; }

    protected ConditionValue _dictId;
    public ConditionValue xdfgetDictId()
    { if (_dictId == null) { _dictId = nCV(); }
      return _dictId; }
    protected ConditionValue xgetCValueDictId() { return xdfgetDictId(); }

    public Map<String, BDictCQ> getDictId_InScopeRelation_BDict() { return xgetSQueMap("dictId_InScopeRelation_BDict"); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_InScopeRelation_BDict", sq); }

    public Map<String, BDictCQ> getDictId_NotInScopeRelation_BDict() { return xgetSQueMap("dictId_NotInScopeRelation_BDict"); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_NotInScopeRelation_BDict", sq); }

    /**
     * Add order-by as ascend. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _roleControlClass;
    public ConditionValue xdfgetRoleControlClass()
    { if (_roleControlClass == null) { _roleControlClass = nCV(); }
      return _roleControlClass; }
    protected ConditionValue xgetCValueRoleControlClass() { return xdfgetRoleControlClass(); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_RoleControlClass_Asc() { regOBA("ROLE_CONTROL_CLASS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_RoleControlClass_Desc() { regOBD("ROLE_CONTROL_CLASS"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBRoleGrpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBRoleGrpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBRoleGrpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BRoleGrpCQ bq = (BRoleGrpCQ)bqs;
        BRoleGrpCQ uq = (BRoleGrpCQ)uqs;
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryBClassDtlByRoleControlClass()) {
            uq.queryBClassDtlByRoleControlClass().reflectRelationOnUnionQuery(bq.queryBClassDtlByRoleControlClass(), uq.queryBClassDtlByRoleControlClass());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VDictCQ queryVDict(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVDict();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vDict", parameterMap);
        return xdfgetConditionQueryVDict();
    }
    public VDictCQ xdfgetConditionQueryVDict() {
        String prop = "vDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVDict()); xsetupOuterJoinVDict(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVDict;
    public Map<String, Object> xdfgetParameterMapVDict()
    { if (_parameterMapVDict == null) { _parameterMapVDict = newLinkedHashMapSized(4); }
      return _parameterMapVDict; }
    public void xsetParameterMapVDict(Map<String, Object> parameterMap)
    { _parameterMapVDict = parameterMap; } // for UnionQuery
    protected VDictCQ xcreateQueryVDict() {
        String nrp = xresolveNRP("B_ROLE_GRP", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ROLE_CONTROL_CLASS, named 'BClassDtlByRoleControlClass'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByRoleControlClass() {
        return xdfgetConditionQueryBClassDtlByRoleControlClass();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByRoleControlClass() {
        String prop = "bClassDtlByRoleControlClass";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByRoleControlClass()); xsetupOuterJoinBClassDtlByRoleControlClass(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByRoleControlClass() {
        String nrp = xresolveNRP("B_ROLE_GRP", "bClassDtlByRoleControlClass"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByRoleControlClass", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByRoleControlClass() { xregOutJo("bClassDtlByRoleControlClass"); }
    public boolean hasConditionQueryBClassDtlByRoleControlClass() { return xhasQueRlMap("bClassDtlByRoleControlClass"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BRoleGrpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BRoleGrpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BRoleGrpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BRoleGrpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BRoleGrpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BRoleGrpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BRoleGrpCQ> _myselfExistsMap;
    public Map<String, BRoleGrpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BRoleGrpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BRoleGrpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BRoleGrpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BRoleGrpCB.class.getName(); }
    protected String xCQ() { return BRoleGrpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
