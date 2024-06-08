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
 * The base condition-query of T_ALLOC_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTAllocInstHCQ extends AbstractBsTAllocInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAllocInstHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAllocInstHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_ALLOC_INST_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TAllocInstHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TAllocInstHCIQ xcreateCIQ() {
        TAllocInstHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TAllocInstHCIQ xnewCIQ() {
        return new TAllocInstHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_ALLOC_INST_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TAllocInstHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TAllocInstHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _allocInstHId;
    public ConditionValue xdfgetAllocInstHId()
    { if (_allocInstHId == null) { _allocInstHId = nCV(); }
      return _allocInstHId; }
    protected ConditionValue xgetCValueAllocInstHId() { return xdfgetAllocInstHId(); }

    public Map<String, TAllocInstBCQ> xdfgetAllocInstHId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("allocInstHId_ExistsReferrer_TAllocInstBList"); }
    public String keepAllocInstHId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("allocInstHId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TPackingHCQ> xdfgetAllocInstHId_ExistsReferrer_TPackingHList() { return xgetSQueMap("allocInstHId_ExistsReferrer_TPackingHList"); }
    public String keepAllocInstHId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("allocInstHId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPickingHCQ> xdfgetAllocInstHId_ExistsReferrer_TPickingHList() { return xgetSQueMap("allocInstHId_ExistsReferrer_TPickingHList"); }
    public String keepAllocInstHId_ExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("allocInstHId_ExistsReferrer_TPickingHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetAllocInstHId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("allocInstHId_ExistsReferrer_TShippingInstHList"); }
    public String keepAllocInstHId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("allocInstHId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetAllocInstHId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("allocInstHId_NotExistsReferrer_TAllocInstBList"); }
    public String keepAllocInstHId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("allocInstHId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TPackingHCQ> xdfgetAllocInstHId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("allocInstHId_NotExistsReferrer_TPackingHList"); }
    public String keepAllocInstHId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("allocInstHId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPickingHCQ> xdfgetAllocInstHId_NotExistsReferrer_TPickingHList() { return xgetSQueMap("allocInstHId_NotExistsReferrer_TPickingHList"); }
    public String keepAllocInstHId_NotExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("allocInstHId_NotExistsReferrer_TPickingHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetAllocInstHId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("allocInstHId_NotExistsReferrer_TShippingInstHList"); }
    public String keepAllocInstHId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("allocInstHId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetAllocInstHId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("allocInstHId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("allocInstHId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TPackingHCQ> xdfgetAllocInstHId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("allocInstHId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("allocInstHId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPickingHCQ> xdfgetAllocInstHId_SpecifyDerivedReferrer_TPickingHList() { return xgetSQueMap("allocInstHId_SpecifyDerivedReferrer_TPickingHList"); }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("allocInstHId_SpecifyDerivedReferrer_TPickingHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetAllocInstHId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("allocInstHId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("allocInstHId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetAllocInstHId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("allocInstHId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("allocInstHId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetAllocInstHId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("allocInstHId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("allocInstHId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TPackingHCQ> xdfgetAllocInstHId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("allocInstHId_QueryDerivedReferrer_TPackingHList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("allocInstHId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetAllocInstHId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("allocInstHId_QueryDerivedReferrer_TPackingHList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("allocInstHId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPickingHCQ> xdfgetAllocInstHId_QueryDerivedReferrer_TPickingHList() { return xgetSQueMap("allocInstHId_QueryDerivedReferrer_TPickingHList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("allocInstHId_QueryDerivedReferrer_TPickingHList", sq); }
    public Map<String, Object> xdfgetAllocInstHId_QueryDerivedReferrer_TPickingHListParameter() { return xgetSQuePmMap("allocInstHId_QueryDerivedReferrer_TPickingHList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TPickingHListParameter(Object pm) { return xkeepSQuePm("allocInstHId_QueryDerivedReferrer_TPickingHList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetAllocInstHId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("allocInstHId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("allocInstHId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetAllocInstHId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("allocInstHId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepAllocInstHId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("allocInstHId_QueryDerivedReferrer_TShippingInstHList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _processTypeId;
    public ConditionValue xdfgetProcessTypeId()
    { if (_processTypeId == null) { _processTypeId = nCV(); }
      return _processTypeId; }
    protected ConditionValue xgetCValueProcessTypeId() { return xdfgetProcessTypeId(); }

    public Map<String, MProcessTypeCQ> getProcessTypeId_InScopeRelation_MProcessType() { return xgetSQueMap("processTypeId_InScopeRelation_MProcessType"); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq) { return xkeepSQue("processTypeId_InScopeRelation_MProcessType", sq); }

    public Map<String, MProcessTypeCQ> getProcessTypeId_NotInScopeRelation_MProcessType() { return xgetSQueMap("processTypeId_NotInScopeRelation_MProcessType"); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq) { return xkeepSQue("processTypeId_NotInScopeRelation_MProcessType", sq); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _workDt;
    public ConditionValue xdfgetWorkDt()
    { if (_workDt == null) { _workDt = nCV(); }
      return _workDt; }
    protected ConditionValue xgetCValueWorkDt() { return xdfgetWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _delivPlanDt;
    public ConditionValue xdfgetDelivPlanDt()
    { if (_delivPlanDt == null) { _delivPlanDt = nCV(); }
      return _delivPlanDt; }
    protected ConditionValue xgetCValueDelivPlanDt() { return xdfgetDelivPlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivPlanDt_Asc() { regOBA("DELIV_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivPlanDt_Desc() { regOBD("DELIV_PLAN_DT"); return this; }

    protected ConditionValue _delivDt;
    public ConditionValue xdfgetDelivDt()
    { if (_delivDt == null) { _delivDt = nCV(); }
      return _delivDt; }
    protected ConditionValue xgetCValueDelivDt() { return xdfgetDelivDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

    protected ConditionValue _delivTz;
    public ConditionValue xdfgetDelivTz()
    { if (_delivTz == null) { _delivTz = nCV(); }
      return _delivTz; }
    protected ConditionValue xgetCValueDelivTz() { return xdfgetDelivTz(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

    protected ConditionValue _supplyCustomerId;
    public ConditionValue xdfgetSupplyCustomerId()
    { if (_supplyCustomerId == null) { _supplyCustomerId = nCV(); }
      return _supplyCustomerId; }
    protected ConditionValue xgetCValueSupplyCustomerId() { return xdfgetSupplyCustomerId(); }

    public Map<String, MCustomerCQ> getSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId() { return xgetSQueMap("supplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId"); }
    public String keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq) { return xkeepSQue("supplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId", sq); }

    public Map<String, MCustomerCQ> getSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId() { return xgetSQueMap("supplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId"); }
    public String keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq) { return xkeepSQue("supplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_SupplyCustomerId_Asc() { regOBA("SUPPLY_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_SupplyCustomerId_Desc() { regOBD("SUPPLY_CUSTOMER_ID"); return this; }

    protected ConditionValue _supplyCustomerCd;
    public ConditionValue xdfgetSupplyCustomerCd()
    { if (_supplyCustomerCd == null) { _supplyCustomerCd = nCV(); }
      return _supplyCustomerCd; }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return xdfgetSupplyCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

    protected ConditionValue _supplyCustomerNm;
    public ConditionValue xdfgetSupplyCustomerNm()
    { if (_supplyCustomerNm == null) { _supplyCustomerNm = nCV(); }
      return _supplyCustomerNm; }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return xdfgetSupplyCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivCustomerId;
    public ConditionValue xdfgetDelivCustomerId()
    { if (_delivCustomerId == null) { _delivCustomerId = nCV(); }
      return _delivCustomerId; }
    protected ConditionValue xgetCValueDelivCustomerId() { return xdfgetDelivCustomerId(); }

    public Map<String, MCustomerCQ> getDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId() { return xgetSQueMap("delivCustomerId_InScopeRelation_MCustomerByDelivCustomerId"); }
    public String keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq) { return xkeepSQue("delivCustomerId_InScopeRelation_MCustomerByDelivCustomerId", sq); }

    public Map<String, MCustomerCQ> getDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId() { return xgetSQueMap("delivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId"); }
    public String keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq) { return xkeepSQue("delivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivCustomerId_Asc() { regOBA("DELIV_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivCustomerId_Desc() { regOBD("DELIV_CUSTOMER_ID"); return this; }

    protected ConditionValue _delivCustomerCd;
    public ConditionValue xdfgetDelivCustomerCd()
    { if (_delivCustomerCd == null) { _delivCustomerCd = nCV(); }
      return _delivCustomerCd; }
    protected ConditionValue xgetCValueDelivCustomerCd() { return xdfgetDelivCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivCustomerCd_Asc() { regOBA("DELIV_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivCustomerCd_Desc() { regOBD("DELIV_CUSTOMER_CD"); return this; }

    protected ConditionValue _delivZipCd;
    public ConditionValue xdfgetDelivZipCd()
    { if (_delivZipCd == null) { _delivZipCd = nCV(); }
      return _delivZipCd; }
    protected ConditionValue xgetCValueDelivZipCd() { return xdfgetDelivZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

    protected ConditionValue _delivAddress1;
    public ConditionValue xdfgetDelivAddress1()
    { if (_delivAddress1 == null) { _delivAddress1 = nCV(); }
      return _delivAddress1; }
    protected ConditionValue xgetCValueDelivAddress1() { return xdfgetDelivAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

    protected ConditionValue _delivAddress2;
    public ConditionValue xdfgetDelivAddress2()
    { if (_delivAddress2 == null) { _delivAddress2 = nCV(); }
      return _delivAddress2; }
    protected ConditionValue xgetCValueDelivAddress2() { return xdfgetDelivAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

    protected ConditionValue _delivAddress3;
    public ConditionValue xdfgetDelivAddress3()
    { if (_delivAddress3 == null) { _delivAddress3 = nCV(); }
      return _delivAddress3; }
    protected ConditionValue xgetCValueDelivAddress3() { return xdfgetDelivAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

    protected ConditionValue _delivAddressSupply;
    public ConditionValue xdfgetDelivAddressSupply()
    { if (_delivAddressSupply == null) { _delivAddressSupply = nCV(); }
      return _delivAddressSupply; }
    protected ConditionValue xgetCValueDelivAddressSupply() { return xdfgetDelivAddressSupply(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddressSupply_Asc() { regOBA("DELIV_ADDRESS_SUPPLY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivAddressSupply_Desc() { regOBD("DELIV_ADDRESS_SUPPLY"); return this; }

    protected ConditionValue _delivCustomerNm;
    public ConditionValue xdfgetDelivCustomerNm()
    { if (_delivCustomerNm == null) { _delivCustomerNm = nCV(); }
      return _delivCustomerNm; }
    protected ConditionValue xgetCValueDelivCustomerNm() { return xdfgetDelivCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivCustomerNm_Asc() { regOBA("DELIV_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivCustomerNm_Desc() { regOBD("DELIV_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivTelNo;
    public ConditionValue xdfgetDelivTelNo()
    { if (_delivTelNo == null) { _delivTelNo = nCV(); }
      return _delivTelNo; }
    protected ConditionValue xgetCValueDelivTelNo() { return xdfgetDelivTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

    protected ConditionValue _deliveryCourseId;
    public ConditionValue xdfgetDeliveryCourseId()
    { if (_deliveryCourseId == null) { _deliveryCourseId = nCV(); }
      return _deliveryCourseId; }
    protected ConditionValue xgetCValueDeliveryCourseId() { return xdfgetDeliveryCourseId(); }

    public Map<String, MDeliveryCourseCQ> getDeliveryCourseId_InScopeRelation_MDeliveryCourse() { return xgetSQueMap("deliveryCourseId_InScopeRelation_MDeliveryCourse"); }
    public String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq) { return xkeepSQue("deliveryCourseId_InScopeRelation_MDeliveryCourse", sq); }

    public Map<String, MDeliveryCourseCQ> getDeliveryCourseId_NotInScopeRelation_MDeliveryCourse() { return xgetSQueMap("deliveryCourseId_NotInScopeRelation_MDeliveryCourse"); }
    public String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq) { return xkeepSQue("deliveryCourseId_NotInScopeRelation_MDeliveryCourse", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTAllocInstHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAllocInstHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTAllocInstHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTAllocInstHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TAllocInstHCQ bq = (TAllocInstHCQ)bqs;
        TAllocInstHCQ uq = (TAllocInstHCQ)uqs;
        if (bq.hasConditionQueryMCustomerBySupplyCustomerId()) {
            uq.queryMCustomerBySupplyCustomerId().reflectRelationOnUnionQuery(bq.queryMCustomerBySupplyCustomerId(), uq.queryMCustomerBySupplyCustomerId());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCustomerByDelivCustomerId()) {
            uq.queryMCustomerByDelivCustomerId().reflectRelationOnUnionQuery(bq.queryMCustomerByDelivCustomerId(), uq.queryMCustomerByDelivCustomerId());
        }
        if (bq.hasConditionQueryMDeliveryCourse()) {
            uq.queryMDeliveryCourse().reflectRelationOnUnionQuery(bq.queryMDeliveryCourse(), uq.queryMDeliveryCourse());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryTPickingH()) {
            uq.queryTPickingH().reflectRelationOnUnionQuery(bq.queryTPickingH(), uq.queryTPickingH());
        }
        if (bq.hasConditionQueryMCenterCustomerByDelivCustomerId()) {
            uq.queryMCenterCustomerByDelivCustomerId().reflectRelationOnUnionQuery(bq.queryMCenterCustomerByDelivCustomerId(), uq.queryMCenterCustomerByDelivCustomerId());
        }
        if (bq.hasConditionQueryMCenterCustomerBySupplyCustomerId()) {
            uq.queryMCenterCustomerBySupplyCustomerId().reflectRelationOnUnionQuery(bq.queryMCenterCustomerBySupplyCustomerId(), uq.queryMCenterCustomerBySupplyCustomerId());
        }
        if (bq.hasConditionQueryBClassDtlByDelivTz()) {
            uq.queryBClassDtlByDelivTz().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelivTz(), uq.queryBClassDtlByDelivTz());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerBySupplyCustomerId() {
        return xdfgetConditionQueryMCustomerBySupplyCustomerId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerBySupplyCustomerId() {
        String prop = "mCustomerBySupplyCustomerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerBySupplyCustomerId()); xsetupOuterJoinMCustomerBySupplyCustomerId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerBySupplyCustomerId() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mCustomerBySupplyCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerBySupplyCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCustomerBySupplyCustomerId() { xregOutJo("mCustomerBySupplyCustomerId"); }
    public boolean hasConditionQueryMCustomerBySupplyCustomerId() { return xhasQueRlMap("mCustomerBySupplyCustomerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProcessTypeCQ queryMProcessType() {
        return xdfgetConditionQueryMProcessType();
    }
    public MProcessTypeCQ xdfgetConditionQueryMProcessType() {
        String prop = "mProcessType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProcessType()); xsetupOuterJoinMProcessType(); }
        return xgetQueRlMap(prop);
    }
    protected MProcessTypeCQ xcreateQueryMProcessType() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerByDelivCustomerId() {
        return xdfgetConditionQueryMCustomerByDelivCustomerId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerByDelivCustomerId() {
        String prop = "mCustomerByDelivCustomerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerByDelivCustomerId()); xsetupOuterJoinMCustomerByDelivCustomerId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerByDelivCustomerId() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mCustomerByDelivCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByDelivCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByDelivCustomerId() { xregOutJo("mCustomerByDelivCustomerId"); }
    public boolean hasConditionQueryMCustomerByDelivCustomerId() { return xhasQueRlMap("mCustomerByDelivCustomerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MDeliveryCourseCQ queryMDeliveryCourse() {
        return xdfgetConditionQueryMDeliveryCourse();
    }
    public MDeliveryCourseCQ xdfgetConditionQueryMDeliveryCourse() {
        String prop = "mDeliveryCourse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMDeliveryCourse()); xsetupOuterJoinMDeliveryCourse(); }
        return xgetQueRlMap(prop);
    }
    protected MDeliveryCourseCQ xcreateQueryMDeliveryCourse() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mDeliveryCourse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MDeliveryCourseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mDeliveryCourse", nrp);
    }
    protected void xsetupOuterJoinMDeliveryCourse() { xregOutJo("mDeliveryCourse"); }
    public boolean hasConditionQueryMDeliveryCourse() { return xhasQueRlMap("mDeliveryCourse"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PICKING_H by my ALLOC_INST_H_ID, named 'TPickingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingHCQ queryTPickingH() {
        return xdfgetConditionQueryTPickingH();
    }
    public TPickingHCQ xdfgetConditionQueryTPickingH() {
        String prop = "tPickingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingH()); xsetupOuterJoinTPickingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingHCQ xcreateQueryTPickingH() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "tPickingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingH", nrp);
    }
    protected void xsetupOuterJoinTPickingH() { xregOutJo("tPickingH"); }
    public boolean hasConditionQueryTPickingH() { return xhasQueRlMap("tPickingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CUSTOMER by my CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerByDelivCustomerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCustomerCQ queryMCenterCustomerByDelivCustomerId() {
        return xdfgetConditionQueryMCenterCustomerByDelivCustomerId();
    }
    public MCenterCustomerCQ xdfgetConditionQueryMCenterCustomerByDelivCustomerId() {
        String prop = "mCenterCustomerByDelivCustomerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterCustomerByDelivCustomerId()); xsetupOuterJoinMCenterCustomerByDelivCustomerId(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCustomerCQ xcreateQueryMCenterCustomerByDelivCustomerId() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mCenterCustomerByDelivCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterCustomerByDelivCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCenterCustomerByDelivCustomerId() { xregOutJo("mCenterCustomerByDelivCustomerId"); }
    public boolean hasConditionQueryMCenterCustomerByDelivCustomerId() { return xhasQueRlMap("mCenterCustomerByDelivCustomerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CUSTOMER by my CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerBySupplyCustomerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCustomerCQ queryMCenterCustomerBySupplyCustomerId() {
        return xdfgetConditionQueryMCenterCustomerBySupplyCustomerId();
    }
    public MCenterCustomerCQ xdfgetConditionQueryMCenterCustomerBySupplyCustomerId() {
        String prop = "mCenterCustomerBySupplyCustomerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterCustomerBySupplyCustomerId()); xsetupOuterJoinMCenterCustomerBySupplyCustomerId(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCustomerCQ xcreateQueryMCenterCustomerBySupplyCustomerId() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "mCenterCustomerBySupplyCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterCustomerBySupplyCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCenterCustomerBySupplyCustomerId() { xregOutJo("mCenterCustomerBySupplyCustomerId"); }
    public boolean hasConditionQueryMCenterCustomerBySupplyCustomerId() { return xhasQueRlMap("mCenterCustomerBySupplyCustomerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelivTz() {
        return xdfgetConditionQueryBClassDtlByDelivTz();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelivTz() {
        String prop = "bClassDtlByDelivTz";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelivTz()); xsetupOuterJoinBClassDtlByDelivTz(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelivTz() {
        String nrp = xresolveNRP("T_ALLOC_INST_H", "bClassDtlByDelivTz"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelivTz", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelivTz() { xregOutJo("bClassDtlByDelivTz"); }
    public boolean hasConditionQueryBClassDtlByDelivTz() { return xhasQueRlMap("bClassDtlByDelivTz"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TAllocInstHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TAllocInstHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TAllocInstHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TAllocInstHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TAllocInstHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TAllocInstHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TAllocInstHCQ> _myselfExistsMap;
    public Map<String, TAllocInstHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TAllocInstHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TAllocInstHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TAllocInstHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TAllocInstHCB.class.getName(); }
    protected String xCQ() { return TAllocInstHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
