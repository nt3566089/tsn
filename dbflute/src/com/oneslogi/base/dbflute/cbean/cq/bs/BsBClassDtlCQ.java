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
 * The base condition-query of B_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBClassDtlCQ extends AbstractBsBClassDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BClassDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBClassDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_CLASS_DTL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BClassDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BClassDtlCIQ xcreateCIQ() {
        BClassDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BClassDtlCIQ xnewCIQ() {
        return new BClassDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_CLASS_DTL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BClassDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BClassDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _classDtlId;
    public ConditionValue xdfgetClassDtlId()
    { if (_classDtlId == null) { _classDtlId = nCV(); }
      return _classDtlId; }
    protected ConditionValue xgetCValueClassDtlId() { return xdfgetClassDtlId(); }

    public Map<String, BClassDtlSubCQ> xdfgetClassDtlId_ExistsReferrer_BClassDtlSubAsOne() { return xgetSQueMap("classDtlId_ExistsReferrer_BClassDtlSubAsOne"); }
    public String keepClassDtlId_ExistsReferrer_BClassDtlSubAsOne(BClassDtlSubCQ sq) { return xkeepSQue("classDtlId_ExistsReferrer_BClassDtlSubAsOne", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassDtlId_ExistsReferrer_BClassGrpDtlList() { return xgetSQueMap("classDtlId_ExistsReferrer_BClassGrpDtlList"); }
    public String keepClassDtlId_ExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classDtlId_ExistsReferrer_BClassGrpDtlList", sq); }

    public Map<String, BClassDtlSubCQ> xdfgetClassDtlId_NotExistsReferrer_BClassDtlSubAsOne() { return xgetSQueMap("classDtlId_NotExistsReferrer_BClassDtlSubAsOne"); }
    public String keepClassDtlId_NotExistsReferrer_BClassDtlSubAsOne(BClassDtlSubCQ sq) { return xkeepSQue("classDtlId_NotExistsReferrer_BClassDtlSubAsOne", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassDtlId_NotExistsReferrer_BClassGrpDtlList() { return xgetSQueMap("classDtlId_NotExistsReferrer_BClassGrpDtlList"); }
    public String keepClassDtlId_NotExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classDtlId_NotExistsReferrer_BClassGrpDtlList", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassDtlId_SpecifyDerivedReferrer_BClassGrpDtlList() { return xgetSQueMap("classDtlId_SpecifyDerivedReferrer_BClassGrpDtlList"); }
    public String keepClassDtlId_SpecifyDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classDtlId_SpecifyDerivedReferrer_BClassGrpDtlList", sq); }

    public Map<String, BClassGrpDtlCQ> xdfgetClassDtlId_QueryDerivedReferrer_BClassGrpDtlList() { return xgetSQueMap("classDtlId_QueryDerivedReferrer_BClassGrpDtlList"); }
    public String keepClassDtlId_QueryDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq) { return xkeepSQue("classDtlId_QueryDerivedReferrer_BClassGrpDtlList", sq); }
    public Map<String, Object> xdfgetClassDtlId_QueryDerivedReferrer_BClassGrpDtlListParameter() { return xgetSQuePmMap("classDtlId_QueryDerivedReferrer_BClassGrpDtlList"); }
    public String keepClassDtlId_QueryDerivedReferrer_BClassGrpDtlListParameter(Object pm) { return xkeepSQuePm("classDtlId_QueryDerivedReferrer_BClassGrpDtlList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ClassDtlId_Asc() { regOBA("CLASS_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ClassDtlId_Desc() { regOBD("CLASS_DTL_ID"); return this; }

    protected ConditionValue _classId;
    public ConditionValue xdfgetClassId()
    { if (_classId == null) { _classId = nCV(); }
      return _classId; }
    protected ConditionValue xgetCValueClassId() { return xdfgetClassId(); }

    public Map<String, BClassCQ> getClassId_InScopeRelation_BClass() { return xgetSQueMap("classId_InScopeRelation_BClass"); }
    public String keepClassId_InScopeRelation_BClass(BClassCQ sq) { return xkeepSQue("classId_InScopeRelation_BClass", sq); }

    public Map<String, BClassCQ> getClassId_NotInScopeRelation_BClass() { return xgetSQueMap("classId_NotInScopeRelation_BClass"); }
    public String keepClassId_NotInScopeRelation_BClass(BClassCQ sq) { return xkeepSQue("classId_NotInScopeRelation_BClass", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ClassId_Asc() { regOBA("CLASS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ClassId_Desc() { regOBD("CLASS_ID"); return this; }

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
    public BsBClassDtlCQ addOrderBy_ClassDtlCd_Asc() { regOBA("CLASS_DTL_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ClassDtlCd_Desc() { regOBD("CLASS_DTL_CD"); return this; }

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
    public BsBClassDtlCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

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
    public BsBClassDtlCQ addOrderBy_ViewOrder_Asc() { regOBA("VIEW_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * VIEW_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ViewOrder_Desc() { regOBD("VIEW_ORDER"); return this; }

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
    public BsBClassDtlCQ addOrderBy_DefaultFlg_Asc() { regOBA("DEFAULT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_DefaultFlg_Desc() { regOBD("DEFAULT_FLG"); return this; }

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
    public BsBClassDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBClassDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBClassDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBClassDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBClassDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBClassDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBClassDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBClassDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBClassDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBClassDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBClassDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBClassDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BClassDtlCQ bq = (BClassDtlCQ)bqs;
        BClassDtlCQ uq = (BClassDtlCQ)uqs;
        if (bq.hasConditionQueryBClass()) {
            uq.queryBClass().reflectRelationOnUnionQuery(bq.queryBClass(), uq.queryBClass());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryBClassDtlSubAsOne()) {
            uq.queryBClassDtlSubAsOne().reflectRelationOnUnionQuery(bq.queryBClassDtlSubAsOne(), uq.queryBClassDtlSubAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassCQ queryBClass() {
        return xdfgetConditionQueryBClass();
    }
    public BClassCQ xdfgetConditionQueryBClass() {
        String prop = "bClass";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClass()); xsetupOuterJoinBClass(); }
        return xgetQueRlMap(prop);
    }
    protected BClassCQ xcreateQueryBClass() {
        String nrp = xresolveNRP("B_CLASS_DTL", "bClass"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClass", nrp);
    }
    protected void xsetupOuterJoinBClass() { xregOutJo("bClass"); }
    public boolean hasConditionQueryBClass() { return xhasQueRlMap("bClass"); }

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
        String nrp = xresolveNRP("B_CLASS_DTL", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlSubCQ queryBClassDtlSubAsOne() { return xdfgetConditionQueryBClassDtlSubAsOne(); }
    public BClassDtlSubCQ xdfgetConditionQueryBClassDtlSubAsOne() {
        String prop = "bClassDtlSubAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlSubAsOne()); xsetupOuterJoinBClassDtlSubAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlSubCQ xcreateQueryBClassDtlSubAsOne() {
        String nrp = xresolveNRP("B_CLASS_DTL", "bClassDtlSubAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlSubCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlSubAsOne", nrp);
    }
    protected void xsetupOuterJoinBClassDtlSubAsOne() { xregOutJo("bClassDtlSubAsOne"); }
    public boolean hasConditionQueryBClassDtlSubAsOne() { return xhasQueRlMap("bClassDtlSubAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BClassDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BClassDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BClassDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BClassDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BClassDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BClassDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BClassDtlCQ> _myselfExistsMap;
    public Map<String, BClassDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BClassDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BClassDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BClassDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BClassDtlCB.class.getName(); }
    protected String xCQ() { return BClassDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
