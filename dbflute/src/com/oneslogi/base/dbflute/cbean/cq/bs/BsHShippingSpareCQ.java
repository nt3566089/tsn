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
 * The base condition-query of H_SHIPPING_SPARE.
 * @author DBFlute(AutoGenerator)
 */
public class BsHShippingSpareCQ extends AbstractBsHShippingSpareCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HShippingSpareCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHShippingSpareCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_SHIPPING_SPARE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HShippingSpareCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HShippingSpareCIQ xcreateCIQ() {
        HShippingSpareCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HShippingSpareCIQ xnewCIQ() {
        return new HShippingSpareCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_SHIPPING_SPARE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HShippingSpareCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HShippingSpareCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
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
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

    protected ConditionValue _spareStr1;
    public ConditionValue xdfgetSpareStr1()
    { if (_spareStr1 == null) { _spareStr1 = nCV(); }
      return _spareStr1; }
    protected ConditionValue xgetCValueSpareStr1() { return xdfgetSpareStr1(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareStr1_Asc() { regOBA("SPARE_STR_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareStr1_Desc() { regOBD("SPARE_STR_1"); return this; }

    protected ConditionValue _spareStr2;
    public ConditionValue xdfgetSpareStr2()
    { if (_spareStr2 == null) { _spareStr2 = nCV(); }
      return _spareStr2; }
    protected ConditionValue xgetCValueSpareStr2() { return xdfgetSpareStr2(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareStr2_Asc() { regOBA("SPARE_STR_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareStr2_Desc() { regOBD("SPARE_STR_2"); return this; }

    protected ConditionValue _spareStr3;
    public ConditionValue xdfgetSpareStr3()
    { if (_spareStr3 == null) { _spareStr3 = nCV(); }
      return _spareStr3; }
    protected ConditionValue xgetCValueSpareStr3() { return xdfgetSpareStr3(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareStr3_Asc() { regOBA("SPARE_STR_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareStr3_Desc() { regOBD("SPARE_STR_3"); return this; }

    protected ConditionValue _spareNum1;
    public ConditionValue xdfgetSpareNum1()
    { if (_spareNum1 == null) { _spareNum1 = nCV(); }
      return _spareNum1; }
    protected ConditionValue xgetCValueSpareNum1() { return xdfgetSpareNum1(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareNum1_Asc() { regOBA("SPARE_NUM_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareNum1_Desc() { regOBD("SPARE_NUM_1"); return this; }

    protected ConditionValue _spareNum2;
    public ConditionValue xdfgetSpareNum2()
    { if (_spareNum2 == null) { _spareNum2 = nCV(); }
      return _spareNum2; }
    protected ConditionValue xgetCValueSpareNum2() { return xdfgetSpareNum2(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareNum2_Asc() { regOBA("SPARE_NUM_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareNum2_Desc() { regOBD("SPARE_NUM_2"); return this; }

    protected ConditionValue _spareNum3;
    public ConditionValue xdfgetSpareNum3()
    { if (_spareNum3 == null) { _spareNum3 = nCV(); }
      return _spareNum3; }
    protected ConditionValue xgetCValueSpareNum3() { return xdfgetSpareNum3(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareNum3_Asc() { regOBA("SPARE_NUM_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_SpareNum3_Desc() { regOBD("SPARE_NUM_3"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHShippingSpareCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHShippingSpareCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHShippingSpareCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHShippingSpareCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HShippingSpareCQ bq = (HShippingSpareCQ)bqs;
        HShippingSpareCQ uq = (HShippingSpareCQ)uqs;
        if (bq.hasConditionQueryHShippingB()) {
            uq.queryHShippingB().reflectRelationOnUnionQuery(bq.queryHShippingB(), uq.queryHShippingB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("H_SHIPPING_SPARE", "hShippingB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HShippingBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hShippingB", nrp);
    }
    protected void xsetupOuterJoinHShippingB() { xregOutJo("hShippingB"); }
    public boolean hasConditionQueryHShippingB() { return xhasQueRlMap("hShippingB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HShippingSpareCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HShippingSpareCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HShippingSpareCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HShippingSpareCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HShippingSpareCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HShippingSpareCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HShippingSpareCQ> _myselfExistsMap;
    public Map<String, HShippingSpareCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HShippingSpareCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HShippingSpareCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HShippingSpareCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HShippingSpareCB.class.getName(); }
    protected String xCQ() { return HShippingSpareCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}