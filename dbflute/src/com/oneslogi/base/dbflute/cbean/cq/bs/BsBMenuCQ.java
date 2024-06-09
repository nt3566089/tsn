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
 * The base condition-query of B_MENU.
 * @author DBFlute(AutoGenerator)
 */
public class BsBMenuCQ extends AbstractBsBMenuCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BMenuCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBMenuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_MENU) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BMenuCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BMenuCIQ xcreateCIQ() {
        BMenuCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BMenuCIQ xnewCIQ() {
        return new BMenuCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_MENU on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BMenuCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BMenuCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _menuId;
    public ConditionValue xdfgetMenuId()
    { if (_menuId == null) { _menuId = nCV(); }
      return _menuId; }
    protected ConditionValue xgetCValueMenuId() { return xdfgetMenuId(); }

    /**
     * Add order-by as ascend. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_MenuId_Asc() { regOBA("MENU_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MENU_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_MenuId_Desc() { regOBD("MENU_ID"); return this; }

    protected ConditionValue _menuGrpId;
    public ConditionValue xdfgetMenuGrpId()
    { if (_menuGrpId == null) { _menuGrpId = nCV(); }
      return _menuGrpId; }
    protected ConditionValue xgetCValueMenuGrpId() { return xdfgetMenuGrpId(); }

    public Map<String, BMenuGrpCQ> getMenuGrpId_InScopeRelation_BMenuGrp() { return xgetSQueMap("menuGrpId_InScopeRelation_BMenuGrp"); }
    public String keepMenuGrpId_InScopeRelation_BMenuGrp(BMenuGrpCQ sq) { return xkeepSQue("menuGrpId_InScopeRelation_BMenuGrp", sq); }

    public Map<String, BMenuGrpCQ> getMenuGrpId_NotInScopeRelation_BMenuGrp() { return xgetSQueMap("menuGrpId_NotInScopeRelation_BMenuGrp"); }
    public String keepMenuGrpId_NotInScopeRelation_BMenuGrp(BMenuGrpCQ sq) { return xkeepSQue("menuGrpId_NotInScopeRelation_BMenuGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_MenuGrpId_Asc() { regOBA("MENU_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_MenuGrpId_Desc() { regOBD("MENU_GRP_ID"); return this; }

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
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_ScreenId_Asc() { regOBA("SCREEN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCREEN_ID: {IX, bigint(19), FK to B_SCREEN}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_ScreenId_Desc() { regOBD("SCREEN_ID"); return this; }

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
    public BsBMenuCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _urlPath;
    public ConditionValue xdfgetUrlPath()
    { if (_urlPath == null) { _urlPath = nCV(); }
      return _urlPath; }
    protected ConditionValue xgetCValueUrlPath() { return xdfgetUrlPath(); }

    /**
     * Add order-by as ascend. <br>
     * URL_PATH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_UrlPath_Asc() { regOBA("URL_PATH"); return this; }

    /**
     * Add order-by as descend. <br>
     * URL_PATH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_UrlPath_Desc() { regOBD("URL_PATH"); return this; }

    protected ConditionValue _viewOrder;
    public ConditionValue xdfgetViewOrder()
    { if (_viewOrder == null) { _viewOrder = nCV(); }
      return _viewOrder; }
    protected ConditionValue xgetCValueViewOrder() { return xdfgetViewOrder(); }

    /**
     * Add order-by as ascend. <br>
     * VIEW_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_ViewOrder_Asc() { regOBA("VIEW_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * VIEW_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_ViewOrder_Desc() { regOBD("VIEW_ORDER"); return this; }

    protected ConditionValue _targetWindow;
    public ConditionValue xdfgetTargetWindow()
    { if (_targetWindow == null) { _targetWindow = nCV(); }
      return _targetWindow; }
    protected ConditionValue xgetCValueTargetWindow() { return xdfgetTargetWindow(); }

    /**
     * Add order-by as ascend. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_TargetWindow_Asc() { regOBA("TARGET_WINDOW"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_TargetWindow_Desc() { regOBD("TARGET_WINDOW"); return this; }

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
    public BsBMenuCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBMenuCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBMenuCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBMenuCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBMenuCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBMenuCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBMenuCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBMenuCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBMenuCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMenuCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBMenuCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBMenuCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BMenuCQ bq = (BMenuCQ)bqs;
        BMenuCQ uq = (BMenuCQ)uqs;
        if (bq.hasConditionQueryBMenuGrp()) {
            uq.queryBMenuGrp().reflectRelationOnUnionQuery(bq.queryBMenuGrp(), uq.queryBMenuGrp());
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
        if (bq.hasConditionQueryBClassDtlByTargetWindow()) {
            uq.queryBClassDtlByTargetWindow().reflectRelationOnUnionQuery(bq.queryBClassDtlByTargetWindow(), uq.queryBClassDtlByTargetWindow());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_MENU_GRP by my MENU_GRP_ID, named 'BMenuGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public BMenuGrpCQ queryBMenuGrp() {
        return xdfgetConditionQueryBMenuGrp();
    }
    public BMenuGrpCQ xdfgetConditionQueryBMenuGrp() {
        String prop = "bMenuGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBMenuGrp()); xsetupOuterJoinBMenuGrp(); }
        return xgetQueRlMap(prop);
    }
    protected BMenuGrpCQ xcreateQueryBMenuGrp() {
        String nrp = xresolveNRP("B_MENU", "bMenuGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BMenuGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bMenuGrp", nrp);
    }
    protected void xsetupOuterJoinBMenuGrp() { xregOutJo("bMenuGrp"); }
    public boolean hasConditionQueryBMenuGrp() { return xhasQueRlMap("bMenuGrp"); }

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
        String nrp = xresolveNRP("B_MENU", "bScreen"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_MENU", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_MENU", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VHtDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vHtDict", nrp);
    }
    protected void xsetupOuterJoinVHtDict() { xregOutJo("vHtDict"); }
    public boolean hasConditionQueryVHtDict() { return xhasQueRlMap("vHtDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TARGET_WINDOW, named 'BClassDtlByTargetWindow'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTargetWindow() {
        return xdfgetConditionQueryBClassDtlByTargetWindow();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTargetWindow() {
        String prop = "bClassDtlByTargetWindow";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTargetWindow()); xsetupOuterJoinBClassDtlByTargetWindow(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTargetWindow() {
        String nrp = xresolveNRP("B_MENU", "bClassDtlByTargetWindow"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTargetWindow", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTargetWindow() { xregOutJo("bClassDtlByTargetWindow"); }
    public boolean hasConditionQueryBClassDtlByTargetWindow() { return xhasQueRlMap("bClassDtlByTargetWindow"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        if ("vHtDict".equalsIgnoreCase(property)) { return _parameterMapVHtDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BMenuCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BMenuCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BMenuCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BMenuCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BMenuCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BMenuCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BMenuCQ> _myselfExistsMap;
    public Map<String, BMenuCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BMenuCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BMenuCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BMenuCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BMenuCB.class.getName(); }
    protected String xCQ() { return BMenuCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
