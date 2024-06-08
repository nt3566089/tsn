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
 * The base condition-query of H_PACKING_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsHPackingBCQ extends AbstractBsHPackingBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HPackingBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHPackingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_PACKING_B) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HPackingBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HPackingBCIQ xcreateCIQ() {
        HPackingBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HPackingBCIQ xnewCIQ() {
        return new HPackingBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_PACKING_B on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HPackingBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HPackingBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _packingBId;
    public ConditionValue xdfgetPackingBId()
    { if (_packingBId == null) { _packingBId = nCV(); }
      return _packingBId; }
    protected ConditionValue xgetCValuePackingBId() { return xdfgetPackingBId(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_PackingBId_Asc() { regOBA("PACKING_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_PackingBId_Desc() { regOBD("PACKING_B_ID"); return this; }

    protected ConditionValue _packingHId;
    public ConditionValue xdfgetPackingHId()
    { if (_packingHId == null) { _packingHId = nCV(); }
      return _packingHId; }
    protected ConditionValue xgetCValuePackingHId() { return xdfgetPackingHId(); }

    public Map<String, HPackingHCQ> getPackingHId_InScopeRelation_HPackingH() { return xgetSQueMap("packingHId_InScopeRelation_HPackingH"); }
    public String keepPackingHId_InScopeRelation_HPackingH(HPackingHCQ sq) { return xkeepSQue("packingHId_InScopeRelation_HPackingH", sq); }

    public Map<String, HPackingHCQ> getPackingHId_NotInScopeRelation_HPackingH() { return xgetSQueMap("packingHId_NotInScopeRelation_HPackingH"); }
    public String keepPackingHId_NotInScopeRelation_HPackingH(HPackingHCQ sq) { return xkeepSQue("packingHId_NotInScopeRelation_HPackingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_PackingHId_Asc() { regOBA("PACKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_PackingHId_Desc() { regOBD("PACKING_H_ID"); return this; }

    protected ConditionValue _shippingInstBId;
    public ConditionValue xdfgetShippingInstBId()
    { if (_shippingInstBId == null) { _shippingInstBId = nCV(); }
      return _shippingInstBId; }
    protected ConditionValue xgetCValueShippingInstBId() { return xdfgetShippingInstBId(); }

    public Map<String, HShippingBCQ> getShippingInstBId_InScopeRelation_HShippingB() { return xgetSQueMap("shippingInstBId_InScopeRelation_HShippingB"); }
    public String keepShippingInstBId_InScopeRelation_HShippingB(HShippingBCQ sq) { return xkeepSQue("shippingInstBId_InScopeRelation_HShippingB", sq); }

    public Map<String, HShippingBCQ> getShippingInstBId_NotInScopeRelation_HShippingB() { return xgetSQueMap("shippingInstBId_NotInScopeRelation_HShippingB"); }
    public String keepShippingInstBId_NotInScopeRelation_HShippingB(HShippingBCQ sq) { return xkeepSQue("shippingInstBId_NotInScopeRelation_HShippingB", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, HStockCQ> getStockId_InScopeRelation_HStock() { return xgetSQueMap("stockId_InScopeRelation_HStock"); }
    public String keepStockId_InScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_HStock", sq); }

    public Map<String, HStockCQ> getStockId_NotInScopeRelation_HStock() { return xgetSQueMap("stockId_NotInScopeRelation_HStock"); }
    public String keepStockId_NotInScopeRelation_HStock(HStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_HStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _packingNum;
    public ConditionValue xdfgetPackingNum()
    { if (_packingNum == null) { _packingNum = nCV(); }
      return _packingNum; }
    protected ConditionValue xgetCValuePackingNum() { return xdfgetPackingNum(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_PackingNum_Asc() { regOBA("PACKING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_PackingNum_Desc() { regOBD("PACKING_NUM"); return this; }

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
    public BsHPackingBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHPackingBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHPackingBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHPackingBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHPackingBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHPackingBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHPackingBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHPackingBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHPackingBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHPackingBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHPackingBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHPackingBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HPackingBCQ bq = (HPackingBCQ)bqs;
        HPackingBCQ uq = (HPackingBCQ)uqs;
        if (bq.hasConditionQueryHPackingH()) {
            uq.queryHPackingH().reflectRelationOnUnionQuery(bq.queryHPackingH(), uq.queryHPackingH());
        }
        if (bq.hasConditionQueryHShippingB()) {
            uq.queryHShippingB().reflectRelationOnUnionQuery(bq.queryHShippingB(), uq.queryHShippingB());
        }
        if (bq.hasConditionQueryHStock()) {
            uq.queryHStock().reflectRelationOnUnionQuery(bq.queryHStock(), uq.queryHStock());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * H_PACKING_H by my PACKING_H_ID, named 'HPackingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public HPackingHCQ queryHPackingH() {
        return xdfgetConditionQueryHPackingH();
    }
    public HPackingHCQ xdfgetConditionQueryHPackingH() {
        String prop = "hPackingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHPackingH()); xsetupOuterJoinHPackingH(); }
        return xgetQueRlMap(prop);
    }
    protected HPackingHCQ xcreateQueryHPackingH() {
        String nrp = xresolveNRP("H_PACKING_B", "hPackingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HPackingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hPackingH", nrp);
    }
    protected void xsetupOuterJoinHPackingH() { xregOutJo("hPackingH"); }
    public boolean hasConditionQueryHPackingH() { return xhasQueRlMap("hPackingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @return The instance of condition-query. (NotNull)
     */
    public HShippingBCQ queryHShippingB() {
        return xdfgetConditionQueryHShippingB();
    }
    public HShippingBCQ xdfgetConditionQueryHShippingB() {
        String prop = "hShippingB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHShippingB()); xsetupOuterJoinHShippingB(); }
        return xgetQueRlMap(prop);
    }
    protected HShippingBCQ xcreateQueryHShippingB() {
        String nrp = xresolveNRP("H_PACKING_B", "hShippingB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HShippingBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hShippingB", nrp);
    }
    protected void xsetupOuterJoinHShippingB() { xregOutJo("hShippingB"); }
    public boolean hasConditionQueryHShippingB() { return xhasQueRlMap("hShippingB"); }

    /**
     * Get the condition-query for relation table. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public HStockCQ queryHStock() {
        return xdfgetConditionQueryHStock();
    }
    public HStockCQ xdfgetConditionQueryHStock() {
        String prop = "hStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHStock()); xsetupOuterJoinHStock(); }
        return xgetQueRlMap(prop);
    }
    protected HStockCQ xcreateQueryHStock() {
        String nrp = xresolveNRP("H_PACKING_B", "hStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hStock", nrp);
    }
    protected void xsetupOuterJoinHStock() { xregOutJo("hStock"); }
    public boolean hasConditionQueryHStock() { return xhasQueRlMap("hStock"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HPackingBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HPackingBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HPackingBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HPackingBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HPackingBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HPackingBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HPackingBCQ> _myselfExistsMap;
    public Map<String, HPackingBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HPackingBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HPackingBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HPackingBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HPackingBCB.class.getName(); }
    protected String xCQ() { return HPackingBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
