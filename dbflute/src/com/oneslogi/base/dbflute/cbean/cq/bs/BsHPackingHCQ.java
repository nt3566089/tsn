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
 * The base condition-query of H_PACKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsHPackingHCQ extends AbstractBsHPackingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HPackingHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHPackingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_PACKING_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HPackingHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HPackingHCIQ xcreateCIQ() {
        HPackingHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HPackingHCIQ xnewCIQ() {
        return new HPackingHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_PACKING_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HPackingHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HPackingHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _packingHId;
    public ConditionValue xdfgetPackingHId()
    { if (_packingHId == null) { _packingHId = nCV(); }
      return _packingHId; }
    protected ConditionValue xgetCValuePackingHId() { return xdfgetPackingHId(); }

    public Map<String, HPackingBCQ> xdfgetPackingHId_ExistsReferrer_HPackingBList() { return xgetSQueMap("packingHId_ExistsReferrer_HPackingBList"); }
    public String keepPackingHId_ExistsReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("packingHId_ExistsReferrer_HPackingBList", sq); }

    public Map<String, HPackingBCQ> xdfgetPackingHId_NotExistsReferrer_HPackingBList() { return xgetSQueMap("packingHId_NotExistsReferrer_HPackingBList"); }
    public String keepPackingHId_NotExistsReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("packingHId_NotExistsReferrer_HPackingBList", sq); }

    public Map<String, HPackingBCQ> xdfgetPackingHId_SpecifyDerivedReferrer_HPackingBList() { return xgetSQueMap("packingHId_SpecifyDerivedReferrer_HPackingBList"); }
    public String keepPackingHId_SpecifyDerivedReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("packingHId_SpecifyDerivedReferrer_HPackingBList", sq); }

    public Map<String, HPackingBCQ> xdfgetPackingHId_QueryDerivedReferrer_HPackingBList() { return xgetSQueMap("packingHId_QueryDerivedReferrer_HPackingBList"); }
    public String keepPackingHId_QueryDerivedReferrer_HPackingBList(HPackingBCQ sq) { return xkeepSQue("packingHId_QueryDerivedReferrer_HPackingBList", sq); }
    public Map<String, Object> xdfgetPackingHId_QueryDerivedReferrer_HPackingBListParameter() { return xgetSQuePmMap("packingHId_QueryDerivedReferrer_HPackingBList"); }
    public String keepPackingHId_QueryDerivedReferrer_HPackingBListParameter(Object pm) { return xkeepSQuePm("packingHId_QueryDerivedReferrer_HPackingBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_PackingHId_Asc() { regOBA("PACKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_PackingHId_Desc() { regOBD("PACKING_H_ID"); return this; }

    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, HShippingHCQ> getShippingInstHId_InScopeRelation_HShippingH() { return xgetSQueMap("shippingInstHId_InScopeRelation_HShippingH"); }
    public String keepShippingInstHId_InScopeRelation_HShippingH(HShippingHCQ sq) { return xkeepSQue("shippingInstHId_InScopeRelation_HShippingH", sq); }

    public Map<String, HShippingHCQ> getShippingInstHId_NotInScopeRelation_HShippingH() { return xgetSQueMap("shippingInstHId_NotInScopeRelation_HShippingH"); }
    public String keepShippingInstHId_NotInScopeRelation_HShippingH(HShippingHCQ sq) { return xkeepSQue("shippingInstHId_NotInScopeRelation_HShippingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

    protected ConditionValue _processTypeId;
    public ConditionValue xdfgetProcessTypeId()
    { if (_processTypeId == null) { _processTypeId = nCV(); }
      return _processTypeId; }
    protected ConditionValue xgetCValueProcessTypeId() { return xdfgetProcessTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _carrierTraceNum;
    public ConditionValue xdfgetCarrierTraceNum()
    { if (_carrierTraceNum == null) { _carrierTraceNum = nCV(); }
      return _carrierTraceNum; }
    protected ConditionValue xgetCValueCarrierTraceNum() { return xdfgetCarrierTraceNum(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_CarrierTraceNum_Asc() { regOBA("CARRIER_TRACE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_CarrierTraceNum_Desc() { regOBD("CARRIER_TRACE_NUM"); return this; }

    protected ConditionValue _boxId;
    public ConditionValue xdfgetBoxId()
    { if (_boxId == null) { _boxId = nCV(); }
      return _boxId; }
    protected ConditionValue xgetCValueBoxId() { return xdfgetBoxId(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_BoxId_Asc() { regOBA("BOX_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_BoxId_Desc() { regOBD("BOX_ID"); return this; }

    protected ConditionValue _boxCd;
    public ConditionValue xdfgetBoxCd()
    { if (_boxCd == null) { _boxCd = nCV(); }
      return _boxCd; }
    protected ConditionValue xgetCValueBoxCd() { return xdfgetBoxCd(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_BoxCd_Asc() { regOBA("BOX_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_BoxCd_Desc() { regOBD("BOX_CD"); return this; }

    protected ConditionValue _boxNm;
    public ConditionValue xdfgetBoxNm()
    { if (_boxNm == null) { _boxNm = nCV(); }
      return _boxNm; }
    protected ConditionValue xgetCValueBoxNm() { return xdfgetBoxNm(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_BoxNm_Asc() { regOBA("BOX_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_BoxNm_Desc() { regOBD("BOX_NM"); return this; }

    protected ConditionValue _grossWeight;
    public ConditionValue xdfgetGrossWeight()
    { if (_grossWeight == null) { _grossWeight = nCV(); }
      return _grossWeight; }
    protected ConditionValue xgetCValueGrossWeight() { return xdfgetGrossWeight(); }

    /**
     * Add order-by as ascend. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_GrossWeight_Asc() { regOBA("GROSS_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_GrossWeight_Desc() { regOBD("GROSS_WEIGHT"); return this; }

    protected ConditionValue _totalVolume;
    public ConditionValue xdfgetTotalVolume()
    { if (_totalVolume == null) { _totalVolume = nCV(); }
      return _totalVolume; }
    protected ConditionValue xgetCValueTotalVolume() { return xdfgetTotalVolume(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_TotalVolume_Asc() { regOBA("TOTAL_VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_TotalVolume_Desc() { regOBD("TOTAL_VOLUME"); return this; }

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
    public BsHPackingHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHPackingHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHPackingHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHPackingHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHPackingHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHPackingHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHPackingHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHPackingHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHPackingHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHPackingHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHPackingHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHPackingHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HPackingHCQ bq = (HPackingHCQ)bqs;
        HPackingHCQ uq = (HPackingHCQ)uqs;
        if (bq.hasConditionQueryHShippingH()) {
            uq.queryHShippingH().reflectRelationOnUnionQuery(bq.queryHShippingH(), uq.queryHShippingH());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * H_SHIPPING_H by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public HShippingHCQ queryHShippingH() {
        return xdfgetConditionQueryHShippingH();
    }
    public HShippingHCQ xdfgetConditionQueryHShippingH() {
        String prop = "hShippingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryHShippingH()); xsetupOuterJoinHShippingH(); }
        return xgetQueRlMap(prop);
    }
    protected HShippingHCQ xcreateQueryHShippingH() {
        String nrp = xresolveNRP("H_PACKING_H", "hShippingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new HShippingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "hShippingH", nrp);
    }
    protected void xsetupOuterJoinHShippingH() { xregOutJo("hShippingH"); }
    public boolean hasConditionQueryHShippingH() { return xhasQueRlMap("hShippingH"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HPackingHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HPackingHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HPackingHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HPackingHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HPackingHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HPackingHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HPackingHCQ> _myselfExistsMap;
    public Map<String, HPackingHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HPackingHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HPackingHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HPackingHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HPackingHCB.class.getName(); }
    protected String xCQ() { return HPackingHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
