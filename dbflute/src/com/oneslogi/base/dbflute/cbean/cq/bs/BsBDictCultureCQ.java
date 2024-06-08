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
 * The base condition-query of B_DICT_CULTURE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBDictCultureCQ extends AbstractBsBDictCultureCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BDictCultureCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBDictCultureCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_DICT_CULTURE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BDictCultureCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BDictCultureCIQ xcreateCIQ() {
        BDictCultureCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BDictCultureCIQ xnewCIQ() {
        return new BDictCultureCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_DICT_CULTURE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BDictCultureCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BDictCultureCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dictCultureId;
    public ConditionValue xdfgetDictCultureId()
    { if (_dictCultureId == null) { _dictCultureId = nCV(); }
      return _dictCultureId; }
    protected ConditionValue xgetCValueDictCultureId() { return xdfgetDictCultureId(); }

    public Map<String, MHtDictCultureCQ> xdfgetDictCultureId_ExistsReferrer_MHtDictCultureAsOne() { return xgetSQueMap("dictCultureId_ExistsReferrer_MHtDictCultureAsOne"); }
    public String keepDictCultureId_ExistsReferrer_MHtDictCultureAsOne(MHtDictCultureCQ sq) { return xkeepSQue("dictCultureId_ExistsReferrer_MHtDictCultureAsOne", sq); }

    public Map<String, MHtDictCultureCQ> xdfgetDictCultureId_NotExistsReferrer_MHtDictCultureAsOne() { return xgetSQueMap("dictCultureId_NotExistsReferrer_MHtDictCultureAsOne"); }
    public String keepDictCultureId_NotExistsReferrer_MHtDictCultureAsOne(MHtDictCultureCQ sq) { return xkeepSQue("dictCultureId_NotExistsReferrer_MHtDictCultureAsOne", sq); }

    /**
     * Add order-by as ascend. <br>
     * DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DictCultureId_Asc() { regOBA("DICT_CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DictCultureId_Desc() { regOBD("DICT_CULTURE_ID"); return this; }

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
     * DICT_ID: {UQ+, IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {UQ+, IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> getCultureId_InScopeRelation_BCulture() { return xgetSQueMap("cultureId_InScopeRelation_BCulture"); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_InScopeRelation_BCulture", sq); }

    public Map<String, BCultureCQ> getCultureId_NotInScopeRelation_BCulture() { return xgetSQueMap("cultureId_NotInScopeRelation_BCulture"); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_NotInScopeRelation_BCulture", sq); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

    protected ConditionValue _dictNm;
    public ConditionValue xdfgetDictNm()
    { if (_dictNm == null) { _dictNm = nCV(); }
      return _dictNm; }
    protected ConditionValue xgetCValueDictNm() { return xdfgetDictNm(); }

    /**
     * Add order-by as ascend. <br>
     * DICT_NM: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DictNm_Asc() { regOBA("DICT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_NM: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DictNm_Desc() { regOBD("DICT_NM"); return this; }

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
    public BsBDictCultureCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBDictCultureCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBDictCultureCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBDictCultureCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBDictCultureCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBDictCultureCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBDictCultureCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBDictCultureCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBDictCultureCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBDictCultureCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBDictCultureCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBDictCultureCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BDictCultureCQ bq = (BDictCultureCQ)bqs;
        BDictCultureCQ uq = (BDictCultureCQ)uqs;
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
        }
        if (bq.hasConditionQueryBCulture()) {
            uq.queryBCulture().reflectRelationOnUnionQuery(bq.queryBCulture(), uq.queryBCulture());
        }
        if (bq.hasConditionQueryMHtDictCultureAsOne()) {
            uq.queryMHtDictCultureAsOne().reflectRelationOnUnionQuery(bq.queryMHtDictCultureAsOne(), uq.queryMHtDictCultureAsOne());
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
        String nrp = xresolveNRP("B_DICT_CULTURE", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDict", nrp);
    }
    protected void xsetupOuterJoinBDict() { xregOutJo("bDict"); }
    public boolean hasConditionQueryBDict() { return xhasQueRlMap("bDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCulture() {
        return xdfgetConditionQueryBCulture();
    }
    public BCultureCQ xdfgetConditionQueryBCulture() {
        String prop = "bCulture";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCulture()); xsetupOuterJoinBCulture(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCulture() {
        String nrp = xresolveNRP("B_DICT_CULTURE", "bCulture"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCulture", nrp);
    }
    protected void xsetupOuterJoinBCulture() { xregOutJo("bCulture"); }
    public boolean hasConditionQueryBCulture() { return xhasQueRlMap("bCulture"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_HT_DICT_CULTURE by DICT_CULTURE_ID, named 'MHtDictCultureAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MHtDictCultureCQ queryMHtDictCultureAsOne() { return xdfgetConditionQueryMHtDictCultureAsOne(); }
    public MHtDictCultureCQ xdfgetConditionQueryMHtDictCultureAsOne() {
        String prop = "mHtDictCultureAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMHtDictCultureAsOne()); xsetupOuterJoinMHtDictCultureAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MHtDictCultureCQ xcreateQueryMHtDictCultureAsOne() {
        String nrp = xresolveNRP("B_DICT_CULTURE", "mHtDictCultureAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MHtDictCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mHtDictCultureAsOne", nrp);
    }
    protected void xsetupOuterJoinMHtDictCultureAsOne() { xregOutJo("mHtDictCultureAsOne"); }
    public boolean hasConditionQueryMHtDictCultureAsOne() { return xhasQueRlMap("mHtDictCultureAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BDictCultureCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BDictCultureCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BDictCultureCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BDictCultureCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BDictCultureCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BDictCultureCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BDictCultureCQ> _myselfExistsMap;
    public Map<String, BDictCultureCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BDictCultureCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BDictCultureCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BDictCultureCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BDictCultureCB.class.getName(); }
    protected String xCQ() { return BDictCultureCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
