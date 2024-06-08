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
 * The base condition-query of B_MENU_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BsBMenuGrpCQ extends AbstractBsBMenuGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BMenuGrpCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBMenuGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_MENU_GRP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BMenuGrpCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BMenuGrpCIQ xcreateCIQ() {
        BMenuGrpCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BMenuGrpCIQ xnewCIQ() {
        return new BMenuGrpCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_MENU_GRP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BMenuGrpCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BMenuGrpCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _menuGrpId;
    public ConditionValue xdfgetMenuGrpId()
    { if (_menuGrpId == null) { _menuGrpId = nCV(); }
      return _menuGrpId; }
    protected ConditionValue xgetCValueMenuGrpId() { return xdfgetMenuGrpId(); }

    public Map<String, BMenuCQ> xdfgetMenuGrpId_ExistsReferrer_BMenuList() { return xgetSQueMap("menuGrpId_ExistsReferrer_BMenuList"); }
    public String keepMenuGrpId_ExistsReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("menuGrpId_ExistsReferrer_BMenuList", sq); }

    public Map<String, BMenuGrpCQ> xdfgetMenuGrpId_ExistsReferrer_BMenuGrpSelfList() { return xgetSQueMap("menuGrpId_ExistsReferrer_BMenuGrpSelfList"); }
    public String keepMenuGrpId_ExistsReferrer_BMenuGrpSelfList(BMenuGrpCQ sq) { return xkeepSQue("menuGrpId_ExistsReferrer_BMenuGrpSelfList", sq); }

    public Map<String, BMenuCQ> xdfgetMenuGrpId_NotExistsReferrer_BMenuList() { return xgetSQueMap("menuGrpId_NotExistsReferrer_BMenuList"); }
    public String keepMenuGrpId_NotExistsReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("menuGrpId_NotExistsReferrer_BMenuList", sq); }

    public Map<String, BMenuGrpCQ> xdfgetMenuGrpId_NotExistsReferrer_BMenuGrpSelfList() { return xgetSQueMap("menuGrpId_NotExistsReferrer_BMenuGrpSelfList"); }
    public String keepMenuGrpId_NotExistsReferrer_BMenuGrpSelfList(BMenuGrpCQ sq) { return xkeepSQue("menuGrpId_NotExistsReferrer_BMenuGrpSelfList", sq); }

    public Map<String, BMenuCQ> xdfgetMenuGrpId_SpecifyDerivedReferrer_BMenuList() { return xgetSQueMap("menuGrpId_SpecifyDerivedReferrer_BMenuList"); }
    public String keepMenuGrpId_SpecifyDerivedReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("menuGrpId_SpecifyDerivedReferrer_BMenuList", sq); }

    public Map<String, BMenuGrpCQ> xdfgetMenuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList() { return xgetSQueMap("menuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList"); }
    public String keepMenuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList(BMenuGrpCQ sq) { return xkeepSQue("menuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList", sq); }

    public Map<String, BMenuCQ> xdfgetMenuGrpId_QueryDerivedReferrer_BMenuList() { return xgetSQueMap("menuGrpId_QueryDerivedReferrer_BMenuList"); }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("menuGrpId_QueryDerivedReferrer_BMenuList", sq); }
    public Map<String, Object> xdfgetMenuGrpId_QueryDerivedReferrer_BMenuListParameter() { return xgetSQuePmMap("menuGrpId_QueryDerivedReferrer_BMenuList"); }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuListParameter(Object pm) { return xkeepSQuePm("menuGrpId_QueryDerivedReferrer_BMenuList", pm); }

    public Map<String, BMenuGrpCQ> xdfgetMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfList() { return xgetSQueMap("menuGrpId_QueryDerivedReferrer_BMenuGrpSelfList"); }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfList(BMenuGrpCQ sq) { return xkeepSQue("menuGrpId_QueryDerivedReferrer_BMenuGrpSelfList", sq); }
    public Map<String, Object> xdfgetMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfListParameter() { return xgetSQuePmMap("menuGrpId_QueryDerivedReferrer_BMenuGrpSelfList"); }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfListParameter(Object pm) { return xkeepSQuePm("menuGrpId_QueryDerivedReferrer_BMenuGrpSelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_MenuGrpId_Asc() { regOBA("MENU_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_MenuGrpId_Desc() { regOBD("MENU_GRP_ID"); return this; }

    protected ConditionValue _menuGrpCd;
    public ConditionValue xdfgetMenuGrpCd()
    { if (_menuGrpCd == null) { _menuGrpCd = nCV(); }
      return _menuGrpCd; }
    protected ConditionValue xgetCValueMenuGrpCd() { return xdfgetMenuGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_MenuGrpCd_Asc() { regOBA("MENU_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_MenuGrpCd_Desc() { regOBD("MENU_GRP_CD"); return this; }

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
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _parentMenuGrpId;
    public ConditionValue xdfgetParentMenuGrpId()
    { if (_parentMenuGrpId == null) { _parentMenuGrpId = nCV(); }
      return _parentMenuGrpId; }
    protected ConditionValue xgetCValueParentMenuGrpId() { return xdfgetParentMenuGrpId(); }

    public Map<String, BMenuGrpCQ> getParentMenuGrpId_InScopeRelation_BMenuGrpSelf() { return xgetSQueMap("parentMenuGrpId_InScopeRelation_BMenuGrpSelf"); }
    public String keepParentMenuGrpId_InScopeRelation_BMenuGrpSelf(BMenuGrpCQ sq) { return xkeepSQue("parentMenuGrpId_InScopeRelation_BMenuGrpSelf", sq); }

    public Map<String, BMenuGrpCQ> getParentMenuGrpId_NotInScopeRelation_BMenuGrpSelf() { return xgetSQueMap("parentMenuGrpId_NotInScopeRelation_BMenuGrpSelf"); }
    public String keepParentMenuGrpId_NotInScopeRelation_BMenuGrpSelf(BMenuGrpCQ sq) { return xkeepSQue("parentMenuGrpId_NotInScopeRelation_BMenuGrpSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_ParentMenuGrpId_Asc() { regOBA("PARENT_MENU_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_ParentMenuGrpId_Desc() { regOBD("PARENT_MENU_GRP_ID"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_ViewOrder_Asc() { regOBA("VIEW_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * VIEW_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_ViewOrder_Desc() { regOBD("VIEW_ORDER"); return this; }

    protected ConditionValue _visibleType;
    public ConditionValue xdfgetVisibleType()
    { if (_visibleType == null) { _visibleType = nCV(); }
      return _visibleType; }
    protected ConditionValue xgetCValueVisibleType() { return xdfgetVisibleType(); }

    /**
     * Add order-by as ascend. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_VisibleType_Asc() { regOBA("VISIBLE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_VisibleType_Desc() { regOBD("VISIBLE_TYPE"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBMenuGrpCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMenuGrpCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBMenuGrpCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBMenuGrpCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BMenuGrpCQ bq = (BMenuGrpCQ)bqs;
        BMenuGrpCQ uq = (BMenuGrpCQ)uqs;
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
        }
        if (bq.hasConditionQueryBMenuGrpSelf()) {
            uq.queryBMenuGrpSelf().reflectRelationOnUnionQuery(bq.queryBMenuGrpSelf(), uq.queryBMenuGrpSelf());
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
        String nrp = xresolveNRP("B_MENU_GRP", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDict", nrp);
    }
    protected void xsetupOuterJoinBDict() { xregOutJo("bDict"); }
    public boolean hasConditionQueryBDict() { return xhasQueRlMap("bDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_MENU_GRP by my PARENT_MENU_GRP_ID, named 'BMenuGrpSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public BMenuGrpCQ queryBMenuGrpSelf() {
        return xdfgetConditionQueryBMenuGrpSelf();
    }
    public BMenuGrpCQ xdfgetConditionQueryBMenuGrpSelf() {
        String prop = "bMenuGrpSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBMenuGrpSelf()); xsetupOuterJoinBMenuGrpSelf(); }
        return xgetQueRlMap(prop);
    }
    protected BMenuGrpCQ xcreateQueryBMenuGrpSelf() {
        String nrp = xresolveNRP("B_MENU_GRP", "bMenuGrpSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BMenuGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bMenuGrpSelf", nrp);
    }
    protected void xsetupOuterJoinBMenuGrpSelf() { xregOutJo("bMenuGrpSelf"); }
    public boolean hasConditionQueryBMenuGrpSelf() { return xhasQueRlMap("bMenuGrpSelf"); }

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
        String nrp = xresolveNRP("B_MENU_GRP", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_MENU_GRP", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, BMenuGrpCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BMenuGrpCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BMenuGrpCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BMenuGrpCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BMenuGrpCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BMenuGrpCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BMenuGrpCQ> _myselfExistsMap;
    public Map<String, BMenuGrpCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BMenuGrpCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BMenuGrpCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BMenuGrpCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BMenuGrpCB.class.getName(); }
    protected String xCQ() { return BMenuGrpCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
