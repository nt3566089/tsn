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
 * The base condition-query of B_ARG.
 * @author DBFlute(AutoGenerator)
 */
public class BsBArgCQ extends AbstractBsBArgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BArgCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBArgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_ARG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BArgCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BArgCIQ xcreateCIQ() {
        BArgCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BArgCIQ xnewCIQ() {
        return new BArgCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_ARG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BArgCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BArgCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _argId;
    public ConditionValue xdfgetArgId()
    { if (_argId == null) { _argId = nCV(); }
      return _argId; }
    protected ConditionValue xgetCValueArgId() { return xdfgetArgId(); }

    public Map<String, BArgValidCQ> xdfgetArgId_ExistsReferrer_BArgValidAsOne() { return xgetSQueMap("argId_ExistsReferrer_BArgValidAsOne"); }
    public String keepArgId_ExistsReferrer_BArgValidAsOne(BArgValidCQ sq) { return xkeepSQue("argId_ExistsReferrer_BArgValidAsOne", sq); }

    public Map<String, BArgValidCQ> xdfgetArgId_NotExistsReferrer_BArgValidAsOne() { return xgetSQueMap("argId_NotExistsReferrer_BArgValidAsOne"); }
    public String keepArgId_NotExistsReferrer_BArgValidAsOne(BArgValidCQ sq) { return xkeepSQue("argId_NotExistsReferrer_BArgValidAsOne", sq); }

    /**
     * Add order-by as ascend. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ArgId_Asc() { regOBA("ARG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ArgId_Desc() { regOBD("ARG_ID"); return this; }

    protected ConditionValue _funcId;
    public ConditionValue xdfgetFuncId()
    { if (_funcId == null) { _funcId = nCV(); }
      return _funcId; }
    protected ConditionValue xgetCValueFuncId() { return xdfgetFuncId(); }

    public Map<String, BFuncCQ> getFuncId_InScopeRelation_BFunc() { return xgetSQueMap("funcId_InScopeRelation_BFunc"); }
    public String keepFuncId_InScopeRelation_BFunc(BFuncCQ sq) { return xkeepSQue("funcId_InScopeRelation_BFunc", sq); }

    public Map<String, BFuncCQ> getFuncId_NotInScopeRelation_BFunc() { return xgetSQueMap("funcId_NotInScopeRelation_BFunc"); }
    public String keepFuncId_NotInScopeRelation_BFunc(BFuncCQ sq) { return xkeepSQue("funcId_NotInScopeRelation_BFunc", sq); }

    /**
     * Add order-by as ascend. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_FuncId_Asc() { regOBA("FUNC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_FuncId_Desc() { regOBD("FUNC_ID"); return this; }

    protected ConditionValue _argCd;
    public ConditionValue xdfgetArgCd()
    { if (_argCd == null) { _argCd = nCV(); }
      return _argCd; }
    protected ConditionValue xgetCValueArgCd() { return xdfgetArgCd(); }

    /**
     * Add order-by as ascend. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ArgCd_Asc() { regOBA("ARG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ArgCd_Desc() { regOBD("ARG_CD"); return this; }

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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _argType;
    public ConditionValue xdfgetArgType()
    { if (_argType == null) { _argType = nCV(); }
      return _argType; }
    protected ConditionValue xgetCValueArgType() { return xdfgetArgType(); }

    /**
     * Add order-by as ascend. <br>
     * ARG_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ArgType_Asc() { regOBA("ARG_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARG_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ArgType_Desc() { regOBD("ARG_TYPE"); return this; }

    protected ConditionValue _necessary;
    public ConditionValue xdfgetNecessary()
    { if (_necessary == null) { _necessary = nCV(); }
      return _necessary; }
    protected ConditionValue xgetCValueNecessary() { return xdfgetNecessary(); }

    /**
     * Add order-by as ascend. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_Necessary_Asc() { regOBA("NECESSARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_Necessary_Desc() { regOBD("NECESSARY"); return this; }

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
    public BsBArgCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBArgCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBArgCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBArgCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBArgCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBArgCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBArgCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBArgCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBArgCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBArgCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBArgCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBArgCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BArgCQ bq = (BArgCQ)bqs;
        BArgCQ uq = (BArgCQ)uqs;
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
        }
        if (bq.hasConditionQueryBFunc()) {
            uq.queryBFunc().reflectRelationOnUnionQuery(bq.queryBFunc(), uq.queryBFunc());
        }
        if (bq.hasConditionQueryVHtDict()) {
            uq.xsetParameterMapVHtDict(bq.xdfgetParameterMapVHtDict());
            uq.xdfgetConditionQueryVHtDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVHtDict(), uq.xdfgetConditionQueryVHtDict());
        }
        if (bq.hasConditionQueryBArgValidAsOne()) {
            uq.queryBArgValidAsOne().reflectRelationOnUnionQuery(bq.queryBArgValidAsOne(), uq.queryBArgValidAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The instance of condition-query. (NotNull)
     */
    public BDictCQ queryBDict() {
        return xdfgetConditionQueryBDict();
    }
    public BDictCQ xdfgetConditionQueryBDict() {
        String prop = "bDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBDict()); xsetupOuterJoinBDict(); }
        return xgetQueRlMap(prop);
    }
    protected BDictCQ xcreateQueryBDict() {
        String nrp = xresolveNRP("B_ARG", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDict", nrp);
    }
    protected void xsetupOuterJoinBDict() { xregOutJo("bDict"); }
    public boolean hasConditionQueryBDict() { return xhasQueRlMap("bDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_FUNC by my FUNC_ID, named 'BFunc'.
     * @return The instance of condition-query. (NotNull)
     */
    public BFuncCQ queryBFunc() {
        return xdfgetConditionQueryBFunc();
    }
    public BFuncCQ xdfgetConditionQueryBFunc() {
        String prop = "bFunc";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBFunc()); xsetupOuterJoinBFunc(); }
        return xgetQueRlMap(prop);
    }
    protected BFuncCQ xcreateQueryBFunc() {
        String nrp = xresolveNRP("B_ARG", "bFunc"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BFuncCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bFunc", nrp);
    }
    protected void xsetupOuterJoinBFunc() { xregOutJo("bFunc"); }
    public boolean hasConditionQueryBFunc() { return xhasQueRlMap("bFunc"); }

    /**
     * Get the condition-query for relation table. <br>
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VHtDictCQ queryVHtDict(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVHtDict();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vHtDict", parameterMap);
        return xdfgetConditionQueryVHtDict();
    }
    public VHtDictCQ xdfgetConditionQueryVHtDict() {
        String prop = "vHtDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVHtDict()); xsetupOuterJoinVHtDict(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVHtDict;
    public Map<String, Object> xdfgetParameterMapVHtDict()
    { if (_parameterMapVHtDict == null) { _parameterMapVHtDict = newLinkedHashMapSized(4); }
      return _parameterMapVHtDict; }
    public void xsetParameterMapVHtDict(Map<String, Object> parameterMap)
    { _parameterMapVHtDict = parameterMap; } // for UnionQuery
    protected VHtDictCQ xcreateQueryVHtDict() {
        String nrp = xresolveNRP("B_ARG", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VHtDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vHtDict", nrp);
    }
    protected void xsetupOuterJoinVHtDict() { xregOutJo("vHtDict"); }
    public boolean hasConditionQueryVHtDict() { return xhasQueRlMap("vHtDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BArgValidCQ queryBArgValidAsOne() { return xdfgetConditionQueryBArgValidAsOne(); }
    public BArgValidCQ xdfgetConditionQueryBArgValidAsOne() {
        String prop = "bArgValidAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBArgValidAsOne()); xsetupOuterJoinBArgValidAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BArgValidCQ xcreateQueryBArgValidAsOne() {
        String nrp = xresolveNRP("B_ARG", "bArgValidAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BArgValidCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bArgValidAsOne", nrp);
    }
    protected void xsetupOuterJoinBArgValidAsOne() { xregOutJo("bArgValidAsOne"); }
    public boolean hasConditionQueryBArgValidAsOne() { return xhasQueRlMap("bArgValidAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vHtDict".equalsIgnoreCase(property)) { return _parameterMapVHtDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BArgCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BArgCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BArgCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BArgCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BArgCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BArgCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BArgCQ> _myselfExistsMap;
    public Map<String, BArgCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BArgCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BArgCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BArgCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BArgCB.class.getName(); }
    protected String xCQ() { return BArgCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
