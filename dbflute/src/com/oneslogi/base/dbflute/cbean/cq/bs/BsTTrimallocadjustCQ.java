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
 * The base condition-query of T_TRIMALLOCADJUST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrimallocadjustCQ extends AbstractBsTTrimallocadjustCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrimallocadjustCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrimallocadjustCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRIMALLOCADJUST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrimallocadjustCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrimallocadjustCIQ xcreateCIQ() {
        TTrimallocadjustCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrimallocadjustCIQ xnewCIQ() {
        return new TTrimallocadjustCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRIMALLOCADJUST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrimallocadjustCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrimallocadjustCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trimallocadjustId;
    public ConditionValue xdfgetTrimallocadjustId()
    { if (_trimallocadjustId == null) { _trimallocadjustId = nCV(); }
      return _trimallocadjustId; }
    protected ConditionValue xgetCValueTrimallocadjustId() { return xdfgetTrimallocadjustId(); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_TrimallocadjustId_Asc() { regOBA("TRIMALLOCADJUST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_TrimallocadjustId_Desc() { regOBD("TRIMALLOCADJUST_ID"); return this; }

    protected ConditionValue _trimallocstockId;
    public ConditionValue xdfgetTrimallocstockId()
    { if (_trimallocstockId == null) { _trimallocstockId = nCV(); }
      return _trimallocstockId; }
    protected ConditionValue xgetCValueTrimallocstockId() { return xdfgetTrimallocstockId(); }

    public Map<String, TTrimallocstockCQ> getTrimallocstockId_InScopeRelation_TTrimallocstock() { return xgetSQueMap("trimallocstockId_InScopeRelation_TTrimallocstock"); }
    public String keepTrimallocstockId_InScopeRelation_TTrimallocstock(TTrimallocstockCQ sq) { return xkeepSQue("trimallocstockId_InScopeRelation_TTrimallocstock", sq); }

    public Map<String, TTrimallocstockCQ> getTrimallocstockId_NotInScopeRelation_TTrimallocstock() { return xgetSQueMap("trimallocstockId_NotInScopeRelation_TTrimallocstock"); }
    public String keepTrimallocstockId_NotInScopeRelation_TTrimallocstock(TTrimallocstockCQ sq) { return xkeepSQue("trimallocstockId_NotInScopeRelation_TTrimallocstock", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_TrimallocstockId_Asc() { regOBA("TRIMALLOCSTOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_TrimallocstockId_Desc() { regOBD("TRIMALLOCSTOCK_ID"); return this; }

    protected ConditionValue _trimallocschId;
    public ConditionValue xdfgetTrimallocschId()
    { if (_trimallocschId == null) { _trimallocschId = nCV(); }
      return _trimallocschId; }
    protected ConditionValue xgetCValueTrimallocschId() { return xdfgetTrimallocschId(); }

    public Map<String, TTrimallocschkriCQ> getTrimallocschId_InScopeRelation_TTrimallocschkri() { return xgetSQueMap("trimallocschId_InScopeRelation_TTrimallocschkri"); }
    public String keepTrimallocschId_InScopeRelation_TTrimallocschkri(TTrimallocschkriCQ sq) { return xkeepSQue("trimallocschId_InScopeRelation_TTrimallocschkri", sq); }

    public Map<String, TTrimallocschkriCQ> getTrimallocschId_NotInScopeRelation_TTrimallocschkri() { return xgetSQueMap("trimallocschId_NotInScopeRelation_TTrimallocschkri"); }
    public String keepTrimallocschId_NotInScopeRelation_TTrimallocschkri(TTrimallocschkriCQ sq) { return xkeepSQue("trimallocschId_NotInScopeRelation_TTrimallocschkri", sq); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_TrimallocschId_Asc() { regOBA("TRIMALLOCSCH_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_TrimallocschId_Desc() { regOBD("TRIMALLOCSCH_ID"); return this; }

    protected ConditionValue _allocImpKey;
    public ConditionValue xdfgetAllocImpKey()
    { if (_allocImpKey == null) { _allocImpKey = nCV(); }
      return _allocImpKey; }
    protected ConditionValue xgetCValueAllocImpKey() { return xdfgetAllocImpKey(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AllocImpKey_Asc() { regOBA("ALLOC_IMP_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AllocImpKey_Desc() { regOBD("ALLOC_IMP_KEY"); return this; }

    protected ConditionValue _alcImpResgNo;
    public ConditionValue xdfgetAlcImpResgNo()
    { if (_alcImpResgNo == null) { _alcImpResgNo = nCV(); }
      return _alcImpResgNo; }
    protected ConditionValue xgetCValueAlcImpResgNo() { return xdfgetAlcImpResgNo(); }

    /**
     * Add order-by as ascend. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AlcImpResgNo_Asc() { regOBA("ALC_IMP_RESG_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AlcImpResgNo_Desc() { regOBD("ALC_IMP_RESG_NO"); return this; }

    protected ConditionValue _alcImpStkgNo;
    public ConditionValue xdfgetAlcImpStkgNo()
    { if (_alcImpStkgNo == null) { _alcImpStkgNo = nCV(); }
      return _alcImpStkgNo; }
    protected ConditionValue xgetCValueAlcImpStkgNo() { return xdfgetAlcImpStkgNo(); }

    /**
     * Add order-by as ascend. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AlcImpStkgNo_Asc() { regOBA("ALC_IMP_STKG_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AlcImpStkgNo_Desc() { regOBD("ALC_IMP_STKG_NO"); return this; }

    protected ConditionValue _adjustedQty;
    public ConditionValue xdfgetAdjustedQty()
    { if (_adjustedQty == null) { _adjustedQty = nCV(); }
      return _adjustedQty; }
    protected ConditionValue xgetCValueAdjustedQty() { return xdfgetAdjustedQty(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AdjustedQty_Asc() { regOBA("ADJUSTED_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AdjustedQty_Desc() { regOBD("ADJUSTED_QTY"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrimallocadjustCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocadjustCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrimallocadjustCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrimallocadjustCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrimallocadjustCQ bq = (TTrimallocadjustCQ)bqs;
        TTrimallocadjustCQ uq = (TTrimallocadjustCQ)uqs;
        if (bq.hasConditionQueryTTrimallocschkri()) {
            uq.queryTTrimallocschkri().reflectRelationOnUnionQuery(bq.queryTTrimallocschkri(), uq.queryTTrimallocschkri());
        }
        if (bq.hasConditionQueryTTrimallocstock()) {
            uq.queryTTrimallocstock().reflectRelationOnUnionQuery(bq.queryTTrimallocstock(), uq.queryTTrimallocstock());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_TRIMALLOCSCHKRI by my TRIMALLOCSCH_ID, named 'TTrimallocschkri'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrimallocschkriCQ queryTTrimallocschkri() {
        return xdfgetConditionQueryTTrimallocschkri();
    }
    public TTrimallocschkriCQ xdfgetConditionQueryTTrimallocschkri() {
        String prop = "tTrimallocschkri";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrimallocschkri()); xsetupOuterJoinTTrimallocschkri(); }
        return xgetQueRlMap(prop);
    }
    protected TTrimallocschkriCQ xcreateQueryTTrimallocschkri() {
        String nrp = xresolveNRP("T_TRIMALLOCADJUST", "tTrimallocschkri"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrimallocschkriCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrimallocschkri", nrp);
    }
    protected void xsetupOuterJoinTTrimallocschkri() { xregOutJo("tTrimallocschkri"); }
    public boolean hasConditionQueryTTrimallocschkri() { return xhasQueRlMap("tTrimallocschkri"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_TRIMALLOCSTOCK by my TRIMALLOCSTOCK_ID, named 'TTrimallocstock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrimallocstockCQ queryTTrimallocstock() {
        return xdfgetConditionQueryTTrimallocstock();
    }
    public TTrimallocstockCQ xdfgetConditionQueryTTrimallocstock() {
        String prop = "tTrimallocstock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrimallocstock()); xsetupOuterJoinTTrimallocstock(); }
        return xgetQueRlMap(prop);
    }
    protected TTrimallocstockCQ xcreateQueryTTrimallocstock() {
        String nrp = xresolveNRP("T_TRIMALLOCADJUST", "tTrimallocstock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrimallocstockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrimallocstock", nrp);
    }
    protected void xsetupOuterJoinTTrimallocstock() { xregOutJo("tTrimallocstock"); }
    public boolean hasConditionQueryTTrimallocstock() { return xhasQueRlMap("tTrimallocstock"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrimallocadjustCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrimallocadjustCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrimallocadjustCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrimallocadjustCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrimallocadjustCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrimallocadjustCQ> _myselfExistsMap;
    public Map<String, TTrimallocadjustCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrimallocadjustCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrimallocadjustCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrimallocadjustCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrimallocadjustCB.class.getName(); }
    protected String xCQ() { return TTrimallocadjustCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
