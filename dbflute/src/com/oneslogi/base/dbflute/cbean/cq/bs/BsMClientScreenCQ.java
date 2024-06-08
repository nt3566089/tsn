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
 * The base condition-query of M_CLIENT_SCREEN.
 * @author DBFlute(AutoGenerator)
 */
public class BsMClientScreenCQ extends AbstractBsMClientScreenCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MClientScreenCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMClientScreenCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CLIENT_SCREEN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MClientScreenCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MClientScreenCIQ xcreateCIQ() {
        MClientScreenCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MClientScreenCIQ xnewCIQ() {
        return new MClientScreenCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CLIENT_SCREEN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MClientScreenCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MClientScreenCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clientScreenId;
    public ConditionValue xdfgetClientScreenId()
    { if (_clientScreenId == null) { _clientScreenId = nCV(); }
      return _clientScreenId; }
    protected ConditionValue xgetCValueClientScreenId() { return xdfgetClientScreenId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ClientScreenId_Asc() { regOBA("CLIENT_SCREEN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ClientScreenId_Desc() { regOBD("CLIENT_SCREEN_ID"); return this; }

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
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _screenId;
    public ConditionValue xdfgetScreenId()
    { if (_screenId == null) { _screenId = nCV(); }
      return _screenId; }
    protected ConditionValue xgetCValueScreenId() { return xdfgetScreenId(); }

    public Map<String, BScreenCQ> getScreenId_InScopeRelation_BScreen() { return xgetSQueMap("screenId_InScopeRelation_BScreen"); }
    public String keepScreenId_InScopeRelation_BScreen(BScreenCQ sq) { return xkeepSQue("screenId_InScopeRelation_BScreen", sq); }

    public Map<String, BScreenCQ> getScreenId_NotInScopeRelation_BScreen() { return xgetSQueMap("screenId_NotInScopeRelation_BScreen"); }
    public String keepScreenId_NotInScopeRelation_BScreen(BScreenCQ sq) { return xkeepSQue("screenId_NotInScopeRelation_BScreen", sq); }

    /**
     * Add order-by as ascend. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ScreenId_Asc() { regOBA("SCREEN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ScreenId_Desc() { regOBD("SCREEN_ID"); return this; }

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
    public BsMClientScreenCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _visible;
    public ConditionValue xdfgetVisible()
    { if (_visible == null) { _visible = nCV(); }
      return _visible; }
    protected ConditionValue xgetCValueVisible() { return xdfgetVisible(); }

    /**
     * Add order-by as ascend. <br>
     * VISIBLE: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {char(1)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

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
    public BsMClientScreenCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMClientScreenCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMClientScreenCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMClientScreenCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMClientScreenCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMClientScreenCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMClientScreenCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMClientScreenCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMClientScreenCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMClientScreenCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMClientScreenCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMClientScreenCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MClientScreenCQ bq = (MClientScreenCQ)bqs;
        MClientScreenCQ uq = (MClientScreenCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryBScreen()) {
            uq.queryBScreen().reflectRelationOnUnionQuery(bq.queryBScreen(), uq.queryBScreen());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryVHtDict()) {
            uq.xsetParameterMapVHtDict(bq.xdfgetParameterMapVHtDict());
            uq.xdfgetConditionQueryVHtDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVHtDict(), uq.xdfgetConditionQueryVHtDict());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("M_CLIENT_SCREEN", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The instance of condition-query. (NotNull)
     */
    public BScreenCQ queryBScreen() {
        return xdfgetConditionQueryBScreen();
    }
    public BScreenCQ xdfgetConditionQueryBScreen() {
        String prop = "bScreen";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBScreen()); xsetupOuterJoinBScreen(); }
        return xgetQueRlMap(prop);
    }
    protected BScreenCQ xcreateQueryBScreen() {
        String nrp = xresolveNRP("M_CLIENT_SCREEN", "bScreen"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BScreenCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bScreen", nrp);
    }
    protected void xsetupOuterJoinBScreen() { xregOutJo("bScreen"); }
    public boolean hasConditionQueryBScreen() { return xhasQueRlMap("bScreen"); }

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
        String nrp = xresolveNRP("M_CLIENT_SCREEN", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

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
        String nrp = xresolveNRP("M_CLIENT_SCREEN", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VHtDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vHtDict", nrp);
    }
    protected void xsetupOuterJoinVHtDict() { xregOutJo("vHtDict"); }
    public boolean hasConditionQueryVHtDict() { return xhasQueRlMap("vHtDict"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        if ("vHtDict".equalsIgnoreCase(property)) { return _parameterMapVHtDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MClientScreenCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MClientScreenCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MClientScreenCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MClientScreenCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MClientScreenCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MClientScreenCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MClientScreenCQ> _myselfExistsMap;
    public Map<String, MClientScreenCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MClientScreenCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MClientScreenCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MClientScreenCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MClientScreenCB.class.getName(); }
    protected String xCQ() { return MClientScreenCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
