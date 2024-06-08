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
 * The base condition-query of T_SHIPPING_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstHCQ extends AbstractBsTShippingInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_SHIPPING_INST_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingInstHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingInstHCIQ xcreateCIQ() {
        TShippingInstHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingInstHCIQ xnewCIQ() {
        return new TShippingInstHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_SHIPPING_INST_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingInstHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingInstHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_TEcOrderHList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_TShippingInstBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _inputType;
    public ConditionValue xdfgetInputType()
    { if (_inputType == null) { _inputType = nCV(); }
      return _inputType; }
    protected ConditionValue xgetCValueInputType() { return xdfgetInputType(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivPlanDt_Asc() { regOBA("DELIV_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivPlanDt_Desc() { regOBD("DELIV_PLAN_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

    protected ConditionValue _clientShippingNo;
    public ConditionValue xdfgetClientShippingNo()
    { if (_clientShippingNo == null) { _clientShippingNo = nCV(); }
      return _clientShippingNo; }
    protected ConditionValue xgetCValueClientShippingNo() { return xdfgetClientShippingNo(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ClientShippingNo_Asc() { regOBA("CLIENT_SHIPPING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ClientShippingNo_Desc() { regOBD("CLIENT_SHIPPING_NO"); return this; }

    protected ConditionValue _shippingSlipNo;
    public ConditionValue xdfgetShippingSlipNo()
    { if (_shippingSlipNo == null) { _shippingSlipNo = nCV(); }
      return _shippingSlipNo; }
    protected ConditionValue xgetCValueShippingSlipNo() { return xdfgetShippingSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

    protected ConditionValue _shippingStatus;
    public ConditionValue xdfgetShippingStatus()
    { if (_shippingStatus == null) { _shippingStatus = nCV(); }
      return _shippingStatus; }
    protected ConditionValue xgetCValueShippingStatus() { return xdfgetShippingStatus(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingStatus_Asc() { regOBA("SHIPPING_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingStatus_Desc() { regOBD("SHIPPING_STATUS"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerId_Asc() { regOBA("SUPPLY_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerId_Desc() { regOBD("SUPPLY_CUSTOMER_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivCustomerId_Asc() { regOBA("DELIV_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerId_Desc() { regOBD("DELIV_CUSTOMER_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivCustomerCd_Asc() { regOBA("DELIV_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerCd_Desc() { regOBD("DELIV_CUSTOMER_CD"); return this; }

    protected ConditionValue _delivZipCd;
    public ConditionValue xdfgetDelivZipCd()
    { if (_delivZipCd == null) { _delivZipCd = nCV(); }
      return _delivZipCd; }
    protected ConditionValue xgetCValueDelivZipCd() { return xdfgetDelivZipCd(); }

    public Map<String, MZipCQ> getDelivZipCd_InScopeRelation_MZipForDeliv() { return xgetSQueMap("delivZipCd_InScopeRelation_MZipForDeliv"); }
    public String keepDelivZipCd_InScopeRelation_MZipForDeliv(MZipCQ sq) { return xkeepSQue("delivZipCd_InScopeRelation_MZipForDeliv", sq); }

    public Map<String, MZipCQ> getDelivZipCd_NotInScopeRelation_MZipForDeliv() { return xgetSQueMap("delivZipCd_NotInScopeRelation_MZipForDeliv"); }
    public String keepDelivZipCd_NotInScopeRelation_MZipForDeliv(MZipCQ sq) { return xkeepSQue("delivZipCd_NotInScopeRelation_MZipForDeliv", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD: {varchar(30), FK to M_ZIP}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {varchar(30), FK to M_ZIP}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivAddressSupply_Asc() { regOBA("DELIV_ADDRESS_SUPPLY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddressSupply_Desc() { regOBD("DELIV_ADDRESS_SUPPLY"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm_Asc() { regOBA("DELIV_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm_Desc() { regOBD("DELIV_CUSTOMER_NM"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _emergencyFlg;
    public ConditionValue xdfgetEmergencyFlg()
    { if (_emergencyFlg == null) { _emergencyFlg = nCV(); }
      return _emergencyFlg; }
    protected ConditionValue xgetCValueEmergencyFlg() { return xdfgetEmergencyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_EmergencyFlg_Asc() { regOBA("EMERGENCY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_EmergencyFlg_Desc() { regOBD("EMERGENCY_FLG"); return this; }

    protected ConditionValue _pickingWorkMessage;
    public ConditionValue xdfgetPickingWorkMessage()
    { if (_pickingWorkMessage == null) { _pickingWorkMessage = nCV(); }
      return _pickingWorkMessage; }
    protected ConditionValue xgetCValuePickingWorkMessage() { return xdfgetPickingWorkMessage(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingWorkMessage_Asc() { regOBA("PICKING_WORK_MESSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingWorkMessage_Desc() { regOBD("PICKING_WORK_MESSAGE"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _pickingBatchNo;
    public ConditionValue xdfgetPickingBatchNo()
    { if (_pickingBatchNo == null) { _pickingBatchNo = nCV(); }
      return _pickingBatchNo; }
    protected ConditionValue xgetCValuePickingBatchNo() { return xdfgetPickingBatchNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_BATCH_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingBatchNo_Asc() { regOBA("PICKING_BATCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_BATCH_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingBatchNo_Desc() { regOBD("PICKING_BATCH_NO"); return this; }

    protected ConditionValue _stockOutFlg;
    public ConditionValue xdfgetStockOutFlg()
    { if (_stockOutFlg == null) { _stockOutFlg = nCV(); }
      return _stockOutFlg; }
    protected ConditionValue xgetCValueStockOutFlg() { return xdfgetStockOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_StockOutFlg_Asc() { regOBA("STOCK_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_StockOutFlg_Desc() { regOBD("STOCK_OUT_FLG"); return this; }

    protected ConditionValue _allocInstHId;
    public ConditionValue xdfgetAllocInstHId()
    { if (_allocInstHId == null) { _allocInstHId = nCV(); }
      return _allocInstHId; }
    protected ConditionValue xgetCValueAllocInstHId() { return xdfgetAllocInstHId(); }

    public Map<String, TAllocInstHCQ> getAllocInstHId_InScopeRelation_TAllocInstH() { return xgetSQueMap("allocInstHId_InScopeRelation_TAllocInstH"); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq) { return xkeepSQue("allocInstHId_InScopeRelation_TAllocInstH", sq); }

    public Map<String, TAllocInstHCQ> getAllocInstHId_NotInScopeRelation_TAllocInstH() { return xgetSQueMap("allocInstHId_NotInScopeRelation_TAllocInstH"); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq) { return xkeepSQue("allocInstHId_NotInScopeRelation_TAllocInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

    protected ConditionValue _cod;
    public ConditionValue xdfgetCod()
    { if (_cod == null) { _cod = nCV(); }
      return _cod; }
    protected ConditionValue xgetCValueCod() { return xdfgetCod(); }

    /**
     * Add order-by as ascend. <br>
     * COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Cod_Asc() { regOBA("COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Cod_Desc() { regOBD("COD"); return this; }

    protected ConditionValue _codTax;
    public ConditionValue xdfgetCodTax()
    { if (_codTax == null) { _codTax = nCV(); }
      return _codTax; }
    protected ConditionValue xgetCValueCodTax() { return xdfgetCodTax(); }

    /**
     * Add order-by as ascend. <br>
     * COD_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CodTax_Asc() { regOBA("COD_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CodTax_Desc() { regOBD("COD_TAX"); return this; }

    protected ConditionValue _totalPrice;
    public ConditionValue xdfgetTotalPrice()
    { if (_totalPrice == null) { _totalPrice = nCV(); }
      return _totalPrice; }
    protected ConditionValue xgetCValueTotalPrice() { return xdfgetTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

    protected ConditionValue _totalTax;
    public ConditionValue xdfgetTotalTax()
    { if (_totalTax == null) { _totalTax = nCV(); }
      return _totalTax; }
    protected ConditionValue xgetCValueTotalTax() { return xdfgetTotalTax(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalTax_Asc() { regOBA("TOTAL_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalTax_Desc() { regOBD("TOTAL_TAX"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingInstHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingInstHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingInstHCQ bq = (TShippingInstHCQ)bqs;
        TShippingInstHCQ uq = (TShippingInstHCQ)uqs;
        if (bq.hasConditionQueryMDeliveryCourse()) {
            uq.queryMDeliveryCourse().reflectRelationOnUnionQuery(bq.queryMDeliveryCourse(), uq.queryMDeliveryCourse());
        }
        if (bq.hasConditionQueryMCustomerBySupplyCustomerId()) {
            uq.queryMCustomerBySupplyCustomerId().reflectRelationOnUnionQuery(bq.queryMCustomerBySupplyCustomerId(), uq.queryMCustomerBySupplyCustomerId());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCustomerByDelivCustomerId()) {
            uq.queryMCustomerByDelivCustomerId().reflectRelationOnUnionQuery(bq.queryMCustomerByDelivCustomerId(), uq.queryMCustomerByDelivCustomerId());
        }
        if (bq.hasConditionQueryTAllocInstH()) {
            uq.queryTAllocInstH().reflectRelationOnUnionQuery(bq.queryTAllocInstH(), uq.queryTAllocInstH());
        }
        if (bq.hasConditionQueryMZipForDeliv()) {
            uq.queryMZipForDeliv().reflectRelationOnUnionQuery(bq.queryMZipForDeliv(), uq.queryMZipForDeliv());
        }
        if (bq.hasConditionQueryBClassDtlByDelivTz()) {
            uq.queryBClassDtlByDelivTz().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelivTz(), uq.queryBClassDtlByDelivTz());
        }
        if (bq.hasConditionQueryBClassDtlByEmergencyFlg()) {
            uq.queryBClassDtlByEmergencyFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByEmergencyFlg(), uq.queryBClassDtlByEmergencyFlg());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByShippingStatus()) {
            uq.queryBClassDtlByShippingStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingStatus(), uq.queryBClassDtlByShippingStatus());
        }
        if (bq.hasConditionQueryBClassDtlByStockOutFlg()) {
            uq.queryBClassDtlByStockOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockOutFlg(), uq.queryBClassDtlByStockOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mDeliveryCourse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MDeliveryCourseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mDeliveryCourse", nrp);
    }
    protected void xsetupOuterJoinMDeliveryCourse() { xregOutJo("mDeliveryCourse"); }
    public boolean hasConditionQueryMDeliveryCourse() { return xhasQueRlMap("mDeliveryCourse"); }

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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mCustomerBySupplyCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mCustomerByDelivCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByDelivCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByDelivCustomerId() { xregOutJo("mCustomerByDelivCustomerId"); }
    public boolean hasConditionQueryMCustomerByDelivCustomerId() { return xhasQueRlMap("mCustomerByDelivCustomerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocInstHCQ queryTAllocInstH() {
        return xdfgetConditionQueryTAllocInstH();
    }
    public TAllocInstHCQ xdfgetConditionQueryTAllocInstH() {
        String prop = "tAllocInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocInstH()); xsetupOuterJoinTAllocInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocInstHCQ xcreateQueryTAllocInstH() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "tAllocInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstH", nrp);
    }
    protected void xsetupOuterJoinTAllocInstH() { xregOutJo("tAllocInstH"); }
    public boolean hasConditionQueryTAllocInstH() { return xhasQueRlMap("tAllocInstH"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZipCQ queryMZipForDeliv() {
        return xdfgetConditionQueryMZipForDeliv();
    }
    public MZipCQ xdfgetConditionQueryMZipForDeliv() {
        String prop = "mZipForDeliv";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZipForDeliv()); xsetupOuterJoinMZipForDeliv(); }
        return xgetQueRlMap(prop);
    }
    protected MZipCQ xcreateQueryMZipForDeliv() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "mZipForDeliv"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZipCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZipForDeliv", nrp);
    }
    protected void xsetupOuterJoinMZipForDeliv() { xregOutJo("mZipForDeliv"); }
    public boolean hasConditionQueryMZipForDeliv() { return xhasQueRlMap("mZipForDeliv"); }

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
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "bClassDtlByDelivTz"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelivTz", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelivTz() { xregOutJo("bClassDtlByDelivTz"); }
    public boolean hasConditionQueryBClassDtlByDelivTz() { return xhasQueRlMap("bClassDtlByDelivTz"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEmergencyFlg() {
        return xdfgetConditionQueryBClassDtlByEmergencyFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEmergencyFlg() {
        String prop = "bClassDtlByEmergencyFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEmergencyFlg()); xsetupOuterJoinBClassDtlByEmergencyFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEmergencyFlg() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "bClassDtlByEmergencyFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEmergencyFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEmergencyFlg() { xregOutJo("bClassDtlByEmergencyFlg"); }
    public boolean hasConditionQueryBClassDtlByEmergencyFlg() { return xhasQueRlMap("bClassDtlByEmergencyFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByErrorFlg() {
        return xdfgetConditionQueryBClassDtlByErrorFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByErrorFlg() {
        String prop = "bClassDtlByErrorFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByErrorFlg()); xsetupOuterJoinBClassDtlByErrorFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByErrorFlg() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInputType() {
        return xdfgetConditionQueryBClassDtlByInputType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInputType() {
        String prop = "bClassDtlByInputType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInputType()); xsetupOuterJoinBClassDtlByInputType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInputType() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInputType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInputType() { xregOutJo("bClassDtlByInputType"); }
    public boolean hasConditionQueryBClassDtlByInputType() { return xhasQueRlMap("bClassDtlByInputType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingStatus() {
        return xdfgetConditionQueryBClassDtlByShippingStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingStatus() {
        String prop = "bClassDtlByShippingStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingStatus()); xsetupOuterJoinBClassDtlByShippingStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingStatus() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "bClassDtlByShippingStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingStatus() { xregOutJo("bClassDtlByShippingStatus"); }
    public boolean hasConditionQueryBClassDtlByShippingStatus() { return xhasQueRlMap("bClassDtlByShippingStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockOutFlg() {
        return xdfgetConditionQueryBClassDtlByStockOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockOutFlg() {
        String prop = "bClassDtlByStockOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockOutFlg()); xsetupOuterJoinBClassDtlByStockOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockOutFlg() {
        String nrp = xresolveNRP("T_SHIPPING_INST_H", "bClassDtlByStockOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockOutFlg() { xregOutJo("bClassDtlByStockOutFlg"); }
    public boolean hasConditionQueryBClassDtlByStockOutFlg() { return xhasQueRlMap("bClassDtlByStockOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingInstHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingInstHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingInstHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingInstHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingInstHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingInstHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingInstHCQ> _myselfExistsMap;
    public Map<String, TShippingInstHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingInstHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingInstHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingInstHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingInstHCB.class.getName(); }
    protected String xCQ() { return TShippingInstHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
