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
 * The base condition-query of B_SCREEN.
 * @author DBFlute(AutoGenerator)
 */
public class BsBScreenCQ extends AbstractBsBScreenCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BScreenCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBScreenCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_SCREEN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BScreenCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BScreenCIQ xcreateCIQ() {
        BScreenCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BScreenCIQ xnewCIQ() {
        return new BScreenCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_SCREEN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BScreenCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BScreenCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _screenId;
    public ConditionValue xdfgetScreenId()
    { if (_screenId == null) { _screenId = nCV(); }
      return _screenId; }
    protected ConditionValue xgetCValueScreenId() { return xdfgetScreenId(); }

    public Map<String, BItemCQ> xdfgetScreenId_ExistsReferrer_BItemList() { return xgetSQueMap("screenId_ExistsReferrer_BItemList"); }
    public String keepScreenId_ExistsReferrer_BItemList(BItemCQ sq) { return xkeepSQue("screenId_ExistsReferrer_BItemList", sq); }

    public Map<String, BMenuCQ> xdfgetScreenId_ExistsReferrer_BMenuList() { return xgetSQueMap("screenId_ExistsReferrer_BMenuList"); }
    public String keepScreenId_ExistsReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("screenId_ExistsReferrer_BMenuList", sq); }

    public Map<String, BScreenRoleCQ> xdfgetScreenId_ExistsReferrer_BScreenRoleList() { return xgetSQueMap("screenId_ExistsReferrer_BScreenRoleList"); }
    public String keepScreenId_ExistsReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("screenId_ExistsReferrer_BScreenRoleList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetScreenId_ExistsReferrer_MCenterScreenList() { return xgetSQueMap("screenId_ExistsReferrer_MCenterScreenList"); }
    public String keepScreenId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("screenId_ExistsReferrer_MCenterScreenList", sq); }

    public Map<String, MClientScreenCQ> xdfgetScreenId_ExistsReferrer_MClientScreenList() { return xgetSQueMap("screenId_ExistsReferrer_MClientScreenList"); }
    public String keepScreenId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("screenId_ExistsReferrer_MClientScreenList", sq); }

    public Map<String, BItemCQ> xdfgetScreenId_NotExistsReferrer_BItemList() { return xgetSQueMap("screenId_NotExistsReferrer_BItemList"); }
    public String keepScreenId_NotExistsReferrer_BItemList(BItemCQ sq) { return xkeepSQue("screenId_NotExistsReferrer_BItemList", sq); }

    public Map<String, BMenuCQ> xdfgetScreenId_NotExistsReferrer_BMenuList() { return xgetSQueMap("screenId_NotExistsReferrer_BMenuList"); }
    public String keepScreenId_NotExistsReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("screenId_NotExistsReferrer_BMenuList", sq); }

    public Map<String, BScreenRoleCQ> xdfgetScreenId_NotExistsReferrer_BScreenRoleList() { return xgetSQueMap("screenId_NotExistsReferrer_BScreenRoleList"); }
    public String keepScreenId_NotExistsReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("screenId_NotExistsReferrer_BScreenRoleList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetScreenId_NotExistsReferrer_MCenterScreenList() { return xgetSQueMap("screenId_NotExistsReferrer_MCenterScreenList"); }
    public String keepScreenId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("screenId_NotExistsReferrer_MCenterScreenList", sq); }

    public Map<String, MClientScreenCQ> xdfgetScreenId_NotExistsReferrer_MClientScreenList() { return xgetSQueMap("screenId_NotExistsReferrer_MClientScreenList"); }
    public String keepScreenId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("screenId_NotExistsReferrer_MClientScreenList", sq); }

    public Map<String, BItemCQ> xdfgetScreenId_SpecifyDerivedReferrer_BItemList() { return xgetSQueMap("screenId_SpecifyDerivedReferrer_BItemList"); }
    public String keepScreenId_SpecifyDerivedReferrer_BItemList(BItemCQ sq) { return xkeepSQue("screenId_SpecifyDerivedReferrer_BItemList", sq); }

    public Map<String, BMenuCQ> xdfgetScreenId_SpecifyDerivedReferrer_BMenuList() { return xgetSQueMap("screenId_SpecifyDerivedReferrer_BMenuList"); }
    public String keepScreenId_SpecifyDerivedReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("screenId_SpecifyDerivedReferrer_BMenuList", sq); }

    public Map<String, BScreenRoleCQ> xdfgetScreenId_SpecifyDerivedReferrer_BScreenRoleList() { return xgetSQueMap("screenId_SpecifyDerivedReferrer_BScreenRoleList"); }
    public String keepScreenId_SpecifyDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("screenId_SpecifyDerivedReferrer_BScreenRoleList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetScreenId_SpecifyDerivedReferrer_MCenterScreenList() { return xgetSQueMap("screenId_SpecifyDerivedReferrer_MCenterScreenList"); }
    public String keepScreenId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("screenId_SpecifyDerivedReferrer_MCenterScreenList", sq); }

    public Map<String, MClientScreenCQ> xdfgetScreenId_SpecifyDerivedReferrer_MClientScreenList() { return xgetSQueMap("screenId_SpecifyDerivedReferrer_MClientScreenList"); }
    public String keepScreenId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("screenId_SpecifyDerivedReferrer_MClientScreenList", sq); }

    public Map<String, BItemCQ> xdfgetScreenId_QueryDerivedReferrer_BItemList() { return xgetSQueMap("screenId_QueryDerivedReferrer_BItemList"); }
    public String keepScreenId_QueryDerivedReferrer_BItemList(BItemCQ sq) { return xkeepSQue("screenId_QueryDerivedReferrer_BItemList", sq); }
    public Map<String, Object> xdfgetScreenId_QueryDerivedReferrer_BItemListParameter() { return xgetSQuePmMap("screenId_QueryDerivedReferrer_BItemList"); }
    public String keepScreenId_QueryDerivedReferrer_BItemListParameter(Object pm) { return xkeepSQuePm("screenId_QueryDerivedReferrer_BItemList", pm); }

    public Map<String, BMenuCQ> xdfgetScreenId_QueryDerivedReferrer_BMenuList() { return xgetSQueMap("screenId_QueryDerivedReferrer_BMenuList"); }
    public String keepScreenId_QueryDerivedReferrer_BMenuList(BMenuCQ sq) { return xkeepSQue("screenId_QueryDerivedReferrer_BMenuList", sq); }
    public Map<String, Object> xdfgetScreenId_QueryDerivedReferrer_BMenuListParameter() { return xgetSQuePmMap("screenId_QueryDerivedReferrer_BMenuList"); }
    public String keepScreenId_QueryDerivedReferrer_BMenuListParameter(Object pm) { return xkeepSQuePm("screenId_QueryDerivedReferrer_BMenuList", pm); }

    public Map<String, BScreenRoleCQ> xdfgetScreenId_QueryDerivedReferrer_BScreenRoleList() { return xgetSQueMap("screenId_QueryDerivedReferrer_BScreenRoleList"); }
    public String keepScreenId_QueryDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq) { return xkeepSQue("screenId_QueryDerivedReferrer_BScreenRoleList", sq); }
    public Map<String, Object> xdfgetScreenId_QueryDerivedReferrer_BScreenRoleListParameter() { return xgetSQuePmMap("screenId_QueryDerivedReferrer_BScreenRoleList"); }
    public String keepScreenId_QueryDerivedReferrer_BScreenRoleListParameter(Object pm) { return xkeepSQuePm("screenId_QueryDerivedReferrer_BScreenRoleList", pm); }

    public Map<String, MCenterScreenCQ> xdfgetScreenId_QueryDerivedReferrer_MCenterScreenList() { return xgetSQueMap("screenId_QueryDerivedReferrer_MCenterScreenList"); }
    public String keepScreenId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("screenId_QueryDerivedReferrer_MCenterScreenList", sq); }
    public Map<String, Object> xdfgetScreenId_QueryDerivedReferrer_MCenterScreenListParameter() { return xgetSQuePmMap("screenId_QueryDerivedReferrer_MCenterScreenList"); }
    public String keepScreenId_QueryDerivedReferrer_MCenterScreenListParameter(Object pm) { return xkeepSQuePm("screenId_QueryDerivedReferrer_MCenterScreenList", pm); }

    public Map<String, MClientScreenCQ> xdfgetScreenId_QueryDerivedReferrer_MClientScreenList() { return xgetSQueMap("screenId_QueryDerivedReferrer_MClientScreenList"); }
    public String keepScreenId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("screenId_QueryDerivedReferrer_MClientScreenList", sq); }
    public Map<String, Object> xdfgetScreenId_QueryDerivedReferrer_MClientScreenListParameter() { return xgetSQuePmMap("screenId_QueryDerivedReferrer_MClientScreenList"); }
    public String keepScreenId_QueryDerivedReferrer_MClientScreenListParameter(Object pm) { return xkeepSQuePm("screenId_QueryDerivedReferrer_MClientScreenList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_ScreenId_Asc() { regOBA("SCREEN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_ScreenId_Desc() { regOBD("SCREEN_ID"); return this; }

    protected ConditionValue _screenCd;
    public ConditionValue xdfgetScreenCd()
    { if (_screenCd == null) { _screenCd = nCV(); }
      return _screenCd; }
    protected ConditionValue xgetCValueScreenCd() { return xdfgetScreenCd(); }

    /**
     * Add order-by as ascend. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_ScreenCd_Asc() { regOBA("SCREEN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_ScreenCd_Desc() { regOBD("SCREEN_CD"); return this; }

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
    public BsBScreenCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _systemType;
    public ConditionValue xdfgetSystemType()
    { if (_systemType == null) { _systemType = nCV(); }
      return _systemType; }
    protected ConditionValue xgetCValueSystemType() { return xdfgetSystemType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_SystemType_Asc() { regOBA("SYSTEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_SystemType_Desc() { regOBD("SYSTEM_TYPE"); return this; }

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
    public BsBScreenCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBScreenCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBScreenCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBScreenCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBScreenCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBScreenCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBScreenCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBScreenCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBScreenCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBScreenCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBScreenCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBScreenCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BScreenCQ bq = (BScreenCQ)bqs;
        BScreenCQ uq = (BScreenCQ)uqs;
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
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
        String nrp = xresolveNRP("B_SCREEN", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_SCREEN", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_SCREEN", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, BScreenCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BScreenCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BScreenCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BScreenCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BScreenCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BScreenCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BScreenCQ> _myselfExistsMap;
    public Map<String, BScreenCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BScreenCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BScreenCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BScreenCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BScreenCB.class.getName(); }
    protected String xCQ() { return BScreenCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
