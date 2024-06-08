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
 * The base condition-query of M_CENTER_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterClassDtlCQ extends AbstractBsMCenterClassDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterClassDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterClassDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CENTER_CLASS_DTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterClassDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterClassDtlCIQ xcreateCIQ() {
        MCenterClassDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterClassDtlCIQ xnewCIQ() {
        return new MCenterClassDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CENTER_CLASS_DTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterClassDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterClassDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerClassDtlId;
    public ConditionValue xdfgetCenterClassDtlId()
    { if (_centerClassDtlId == null) { _centerClassDtlId = nCV(); }
      return _centerClassDtlId; }
    protected ConditionValue xgetCValueCenterClassDtlId() { return xdfgetCenterClassDtlId(); }

    public Map<String, MCenterClassDtlSubCQ> xdfgetCenterClassDtlId_ExistsReferrer_MCenterClassDtlSubAsOne() { return xgetSQueMap("centerClassDtlId_ExistsReferrer_MCenterClassDtlSubAsOne"); }
    public String keepCenterClassDtlId_ExistsReferrer_MCenterClassDtlSubAsOne(MCenterClassDtlSubCQ sq) { return xkeepSQue("centerClassDtlId_ExistsReferrer_MCenterClassDtlSubAsOne", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassDtlId_ExistsReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassDtlId_ExistsReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassDtlId_ExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassDtlId_ExistsReferrer_MCenterClassGrpDtlList", sq); }

    public Map<String, MCenterClassDtlSubCQ> xdfgetCenterClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne() { return xgetSQueMap("centerClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne"); }
    public String keepCenterClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne(MCenterClassDtlSubCQ sq) { return xkeepSQue("centerClassDtlId_NotExistsReferrer_MCenterClassDtlSubAsOne", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassDtlId_NotExistsReferrer_MCenterClassGrpDtlList", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassDtlId_SpecifyDerivedReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassDtlId_SpecifyDerivedReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassDtlId_SpecifyDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassDtlId_SpecifyDerivedReferrer_MCenterClassGrpDtlList", sq); }

    public Map<String, MCenterClassGrpDtlCQ> xdfgetCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList() { return xgetSQueMap("centerClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq) { return xkeepSQue("centerClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList", sq); }
    public Map<String, Object> xdfgetCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter() { return xgetSQuePmMap("centerClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList"); }
    public String keepCenterClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter(Object pm) { return xkeepSQuePm("centerClassDtlId_QueryDerivedReferrer_MCenterClassGrpDtlList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_CenterClassDtlId_Asc() { regOBA("CENTER_CLASS_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_CenterClassDtlId_Desc() { regOBD("CENTER_CLASS_DTL_ID"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_CenterClassId_Asc() { regOBA("CENTER_CLASS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_CenterClassId_Desc() { regOBD("CENTER_CLASS_ID"); return this; }

    protected ConditionValue _classDtlCd;
    public ConditionValue xdfgetClassDtlCd()
    { if (_classDtlCd == null) { _classDtlCd = nCV(); }
      return _classDtlCd; }
    protected ConditionValue xgetCValueClassDtlCd() { return xdfgetClassDtlCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_ClassDtlCd_Asc() { regOBA("CLASS_DTL_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_ClassDtlCd_Desc() { regOBD("CLASS_DTL_CD"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_ViewOrder_Asc() { regOBA("VIEW_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * VIEW_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_ViewOrder_Desc() { regOBD("VIEW_ORDER"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_DefaultFlg_Asc() { regOBA("DEFAULT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_DefaultFlg_Desc() { regOBD("DEFAULT_FLG"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCenterClassDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterClassDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCenterClassDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCenterClassDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterClassDtlCQ bq = (MCenterClassDtlCQ)bqs;
        MCenterClassDtlCQ uq = (MCenterClassDtlCQ)uqs;
        if (bq.hasConditionQueryMCenterClass()) {
            uq.queryMCenterClass().reflectRelationOnUnionQuery(bq.queryMCenterClass(), uq.queryMCenterClass());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryMCenterClassDtlSubAsOne()) {
            uq.queryMCenterClassDtlSubAsOne().reflectRelationOnUnionQuery(bq.queryMCenterClassDtlSubAsOne(), uq.queryMCenterClassDtlSubAsOne());
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
        String nrp = xresolveNRP("M_CENTER_CLASS_DTL", "mCenterClass"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClass", nrp);
    }
    protected void xsetupOuterJoinMCenterClass() { xregOutJo("mCenterClass"); }
    public boolean hasConditionQueryMCenterClass() { return xhasQueRlMap("mCenterClass"); }

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
        String nrp = xresolveNRP("M_CENTER_CLASS_DTL", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL_SUB by CENTER_CLASS_DTL_ID, named 'MCenterClassDtlSubAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlSubCQ queryMCenterClassDtlSubAsOne() { return xdfgetConditionQueryMCenterClassDtlSubAsOne(); }
    public MCenterClassDtlSubCQ xdfgetConditionQueryMCenterClassDtlSubAsOne() {
        String prop = "mCenterClassDtlSubAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlSubAsOne()); xsetupOuterJoinMCenterClassDtlSubAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterClassDtlSubCQ xcreateQueryMCenterClassDtlSubAsOne() {
        String nrp = xresolveNRP("M_CENTER_CLASS_DTL", "mCenterClassDtlSubAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlSubCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlSubAsOne", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlSubAsOne() { xregOutJo("mCenterClassDtlSubAsOne"); }
    public boolean hasConditionQueryMCenterClassDtlSubAsOne() { return xhasQueRlMap("mCenterClassDtlSubAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCenterClassDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterClassDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterClassDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterClassDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterClassDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterClassDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterClassDtlCQ> _myselfExistsMap;
    public Map<String, MCenterClassDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterClassDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterClassDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterClassDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterClassDtlCB.class.getName(); }
    protected String xCQ() { return MCenterClassDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
