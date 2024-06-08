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
 * The base condition-query of T_TRIMALLOCSTOCK.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrimallocstockCQ extends AbstractBsTTrimallocstockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrimallocstockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrimallocstockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRIMALLOCSTOCK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrimallocstockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrimallocstockCIQ xcreateCIQ() {
        TTrimallocstockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrimallocstockCIQ xnewCIQ() {
        return new TTrimallocstockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRIMALLOCSTOCK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrimallocstockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrimallocstockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trimallocstockId;
    public ConditionValue xdfgetTrimallocstockId()
    { if (_trimallocstockId == null) { _trimallocstockId = nCV(); }
      return _trimallocstockId; }
    protected ConditionValue xgetCValueTrimallocstockId() { return xdfgetTrimallocstockId(); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocstockId_ExistsReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocstockId_ExistsReferrer_TTrimallocadjustList"); }
    public String keepTrimallocstockId_ExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocstockId_ExistsReferrer_TTrimallocadjustList", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocstockId_NotExistsReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocstockId_NotExistsReferrer_TTrimallocadjustList"); }
    public String keepTrimallocstockId_NotExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocstockId_NotExistsReferrer_TTrimallocadjustList", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocstockId_SpecifyDerivedReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocstockId_SpecifyDerivedReferrer_TTrimallocadjustList"); }
    public String keepTrimallocstockId_SpecifyDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocstockId_SpecifyDerivedReferrer_TTrimallocadjustList", sq); }

    public Map<String, TTrimallocadjustCQ> xdfgetTrimallocstockId_QueryDerivedReferrer_TTrimallocadjustList() { return xgetSQueMap("trimallocstockId_QueryDerivedReferrer_TTrimallocadjustList"); }
    public String keepTrimallocstockId_QueryDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq) { return xkeepSQue("trimallocstockId_QueryDerivedReferrer_TTrimallocadjustList", sq); }
    public Map<String, Object> xdfgetTrimallocstockId_QueryDerivedReferrer_TTrimallocadjustListParameter() { return xgetSQuePmMap("trimallocstockId_QueryDerivedReferrer_TTrimallocadjustList"); }
    public String keepTrimallocstockId_QueryDerivedReferrer_TTrimallocadjustListParameter(Object pm) { return xkeepSQuePm("trimallocstockId_QueryDerivedReferrer_TTrimallocadjustList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_TrimallocstockId_Asc() { regOBA("TRIMALLOCSTOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_TrimallocstockId_Desc() { regOBD("TRIMALLOCSTOCK_ID"); return this; }

    protected ConditionValue _trimallocHId;
    public ConditionValue xdfgetTrimallocHId()
    { if (_trimallocHId == null) { _trimallocHId = nCV(); }
      return _trimallocHId; }
    protected ConditionValue xgetCValueTrimallocHId() { return xdfgetTrimallocHId(); }

    /**
     * Add order-by as ascend. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_TrimallocHId_Asc() { regOBA("TRIMALLOC_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_TrimallocHId_Desc() { regOBD("TRIMALLOC_H_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TStockCQ> getStockId_InScopeRelation_TStock() { return xgetSQueMap("stockId_InScopeRelation_TStock"); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_TStock", sq); }

    public Map<String, TStockCQ> getStockId_NotInScopeRelation_TStock() { return xgetSQueMap("stockId_NotInScopeRelation_TStock"); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_TStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_AllocImpKey_Asc() { regOBA("ALLOC_IMP_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_AllocImpKey_Desc() { regOBD("ALLOC_IMP_KEY"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_AlcImpStkgNo_Asc() { regOBA("ALC_IMP_STKG_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_AlcImpStkgNo_Desc() { regOBD("ALC_IMP_STKG_NO"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _designFlg;
    public ConditionValue xdfgetDesignFlg()
    { if (_designFlg == null) { _designFlg = nCV(); }
      return _designFlg; }
    protected ConditionValue xgetCValueDesignFlg() { return xdfgetDesignFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_DesignFlg_Asc() { regOBA("DESIGN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_DesignFlg_Desc() { regOBD("DESIGN_FLG"); return this; }

    protected ConditionValue _manufacturedate;
    public ConditionValue xdfgetManufacturedate()
    { if (_manufacturedate == null) { _manufacturedate = nCV(); }
      return _manufacturedate; }
    protected ConditionValue xgetCValueManufacturedate() { return xdfgetManufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_Manufacturedate_Asc() { regOBA("MANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_Manufacturedate_Desc() { regOBD("MANUFACTUREDATE"); return this; }

    protected ConditionValue _monthFlg;
    public ConditionValue xdfgetMonthFlg()
    { if (_monthFlg == null) { _monthFlg = nCV(); }
      return _monthFlg; }
    protected ConditionValue xgetCValueMonthFlg() { return xdfgetMonthFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MONTH_FLG: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_MonthFlg_Asc() { regOBA("MONTH_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH_FLG: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_MonthFlg_Desc() { regOBD("MONTH_FLG"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrimallocstockCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrimallocstockCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrimallocstockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrimallocstockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrimallocstockCQ bq = (TTrimallocstockCQ)bqs;
        TTrimallocstockCQ uq = (TTrimallocstockCQ)uqs;
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockCQ queryTStock() {
        return xdfgetConditionQueryTStock();
    }
    public TStockCQ xdfgetConditionQueryTStock() {
        String prop = "tStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStock()); xsetupOuterJoinTStock(); }
        return xgetQueRlMap(prop);
    }
    protected TStockCQ xcreateQueryTStock() {
        String nrp = xresolveNRP("T_TRIMALLOCSTOCK", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrimallocstockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrimallocstockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrimallocstockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrimallocstockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrimallocstockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrimallocstockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrimallocstockCQ> _myselfExistsMap;
    public Map<String, TTrimallocstockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrimallocstockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrimallocstockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrimallocstockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrimallocstockCB.class.getName(); }
    protected String xCQ() { return TTrimallocstockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
