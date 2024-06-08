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
 * The base condition-query of P_SUBREP_LAYOUT_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public class BsPSubrepLayoutItemCQ extends AbstractBsPSubrepLayoutItemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PSubrepLayoutItemCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPSubrepLayoutItemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from P_SUBREP_LAYOUT_ITEM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PSubrepLayoutItemCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PSubrepLayoutItemCIQ xcreateCIQ() {
        PSubrepLayoutItemCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PSubrepLayoutItemCIQ xnewCIQ() {
        return new PSubrepLayoutItemCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join P_SUBREP_LAYOUT_ITEM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PSubrepLayoutItemCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PSubrepLayoutItemCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _subrepLayoutItemId;
    public ConditionValue xdfgetSubrepLayoutItemId()
    { if (_subrepLayoutItemId == null) { _subrepLayoutItemId = nCV(); }
      return _subrepLayoutItemId; }
    protected ConditionValue xgetCValueSubrepLayoutItemId() { return xdfgetSubrepLayoutItemId(); }

    /**
     * Add order-by as ascend. <br>
     * SUBREP_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_SubrepLayoutItemId_Asc() { regOBA("SUBREP_LAYOUT_ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBREP_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_SubrepLayoutItemId_Desc() { regOBD("SUBREP_LAYOUT_ITEM_ID"); return this; }

    protected ConditionValue _subrepLayoutId;
    public ConditionValue xdfgetSubrepLayoutId()
    { if (_subrepLayoutId == null) { _subrepLayoutId = nCV(); }
      return _subrepLayoutId; }
    protected ConditionValue xgetCValueSubrepLayoutId() { return xdfgetSubrepLayoutId(); }

    public Map<String, PSubrepLayoutCQ> getSubrepLayoutId_InScopeRelation_PSubrepLayout() { return xgetSQueMap("subrepLayoutId_InScopeRelation_PSubrepLayout"); }
    public String keepSubrepLayoutId_InScopeRelation_PSubrepLayout(PSubrepLayoutCQ sq) { return xkeepSQue("subrepLayoutId_InScopeRelation_PSubrepLayout", sq); }

    public Map<String, PSubrepLayoutCQ> getSubrepLayoutId_NotInScopeRelation_PSubrepLayout() { return xgetSQueMap("subrepLayoutId_NotInScopeRelation_PSubrepLayout"); }
    public String keepSubrepLayoutId_NotInScopeRelation_PSubrepLayout(PSubrepLayoutCQ sq) { return xkeepSQue("subrepLayoutId_NotInScopeRelation_PSubrepLayout", sq); }

    /**
     * Add order-by as ascend. <br>
     * SUBREP_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_SUBREP_LAYOUT}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_SubrepLayoutId_Asc() { regOBA("SUBREP_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBREP_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_SUBREP_LAYOUT}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_SubrepLayoutId_Desc() { regOBD("SUBREP_LAYOUT_ID"); return this; }

    protected ConditionValue _itemCd;
    public ConditionValue xdfgetItemCd()
    { if (_itemCd == null) { _itemCd = nCV(); }
      return _itemCd; }
    protected ConditionValue xgetCValueItemCd() { return xdfgetItemCd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ItemCd_Asc() { regOBA("ITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ItemCd_Desc() { regOBD("ITEM_CD"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _itemType;
    public ConditionValue xdfgetItemType()
    { if (_itemType == null) { _itemType = nCV(); }
      return _itemType; }
    protected ConditionValue xgetCValueItemType() { return xdfgetItemType(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ItemType_Asc() { regOBA("ITEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ItemType_Desc() { regOBD("ITEM_TYPE"); return this; }

    protected ConditionValue _visible;
    public ConditionValue xdfgetVisible()
    { if (_visible == null) { _visible = nCV(); }
      return _visible; }
    protected ConditionValue xgetCValueVisible() { return xdfgetVisible(); }

    /**
     * Add order-by as ascend. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

    protected ConditionValue _itemFormat;
    public ConditionValue xdfgetItemFormat()
    { if (_itemFormat == null) { _itemFormat = nCV(); }
      return _itemFormat; }
    protected ConditionValue xgetCValueItemFormat() { return xdfgetItemFormat(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ItemFormat_Asc() { regOBA("ITEM_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_FORMAT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ItemFormat_Desc() { regOBD("ITEM_FORMAT"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPSubrepLayoutItemCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutItemCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPSubrepLayoutItemCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPSubrepLayoutItemCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PSubrepLayoutItemCQ bq = (PSubrepLayoutItemCQ)bqs;
        PSubrepLayoutItemCQ uq = (PSubrepLayoutItemCQ)uqs;
        if (bq.hasConditionQueryPSubrepLayout()) {
            uq.queryPSubrepLayout().reflectRelationOnUnionQuery(bq.queryPSubrepLayout(), uq.queryPSubrepLayout());
        }
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * P_SUBREP_LAYOUT by my SUBREP_LAYOUT_ID, named 'PSubrepLayout'.
     * @return The instance of condition-query. (NotNull)
     */
    public PSubrepLayoutCQ queryPSubrepLayout() {
        return xdfgetConditionQueryPSubrepLayout();
    }
    public PSubrepLayoutCQ xdfgetConditionQueryPSubrepLayout() {
        String prop = "pSubrepLayout";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPSubrepLayout()); xsetupOuterJoinPSubrepLayout(); }
        return xgetQueRlMap(prop);
    }
    protected PSubrepLayoutCQ xcreateQueryPSubrepLayout() {
        String nrp = xresolveNRP("P_SUBREP_LAYOUT_ITEM", "pSubrepLayout"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PSubrepLayoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pSubrepLayout", nrp);
    }
    protected void xsetupOuterJoinPSubrepLayout() { xregOutJo("pSubrepLayout"); }
    public boolean hasConditionQueryPSubrepLayout() { return xhasQueRlMap("pSubrepLayout"); }

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
        String nrp = xresolveNRP("P_SUBREP_LAYOUT_ITEM", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDict", nrp);
    }
    protected void xsetupOuterJoinBDict() { xregOutJo("bDict"); }
    public boolean hasConditionQueryBDict() { return xhasQueRlMap("bDict"); }

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
        String nrp = xresolveNRP("P_SUBREP_LAYOUT_ITEM", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PSubrepLayoutItemCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PSubrepLayoutItemCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PSubrepLayoutItemCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PSubrepLayoutItemCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PSubrepLayoutItemCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PSubrepLayoutItemCQ> _myselfExistsMap;
    public Map<String, PSubrepLayoutItemCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PSubrepLayoutItemCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PSubrepLayoutItemCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PSubrepLayoutItemCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PSubrepLayoutItemCB.class.getName(); }
    protected String xCQ() { return PSubrepLayoutItemCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
