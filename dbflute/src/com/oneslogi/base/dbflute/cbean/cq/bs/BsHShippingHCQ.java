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
 * The base condition-query of H_SHIPPING_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsHShippingHCQ extends AbstractBsHShippingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HShippingHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHShippingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_SHIPPING_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HShippingHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HShippingHCIQ xcreateCIQ() {
        HShippingHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HShippingHCIQ xnewCIQ() {
        return new HShippingHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_SHIPPING_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HShippingHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HShippingHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, HPackingHCQ> xdfgetShippingInstHId_ExistsReferrer_HPackingHList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_HPackingHList"); }
    public String keepShippingInstHId_ExistsReferrer_HPackingHList(HPackingHCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_HPackingHList", sq); }

    public Map<String, HShippingBCQ> xdfgetShippingInstHId_ExistsReferrer_HShippingBList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_HShippingBList"); }
    public String keepShippingInstHId_ExistsReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_HShippingBList", sq); }

    public Map<String, HPackingHCQ> xdfgetShippingInstHId_NotExistsReferrer_HPackingHList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_HPackingHList"); }
    public String keepShippingInstHId_NotExistsReferrer_HPackingHList(HPackingHCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_HPackingHList", sq); }

    public Map<String, HShippingBCQ> xdfgetShippingInstHId_NotExistsReferrer_HShippingBList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_HShippingBList"); }
    public String keepShippingInstHId_NotExistsReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_HShippingBList", sq); }

    public Map<String, HPackingHCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_HPackingHList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_HPackingHList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_HPackingHList(HPackingHCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_HPackingHList", sq); }

    public Map<String, HShippingBCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_HShippingBList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_HShippingBList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_HShippingBList", sq); }

    public Map<String, HPackingHCQ> xdfgetShippingInstHId_QueryDerivedReferrer_HPackingHList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_HPackingHList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_HPackingHList(HPackingHCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_HPackingHList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_HPackingHListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_HPackingHList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_HPackingHListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_HPackingHList", pm); }

    public Map<String, HShippingBCQ> xdfgetShippingInstHId_QueryDerivedReferrer_HShippingBList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_HShippingBList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_HShippingBList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_HShippingBListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_HShippingBList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_HShippingBListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_HShippingBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

    protected ConditionValue _histDt;
    public ConditionValue xdfgetHistDt()
    { if (_histDt == null) { _histDt = nCV(); }
      return _histDt; }
    protected ConditionValue xgetCValueHistDt() { return xdfgetHistDt(); }

    /**
     * Add order-by as ascend. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_HistDt_Asc() { regOBA("HIST_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_HistDt_Desc() { regOBD("HIST_DT"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _clientNm;
    public ConditionValue xdfgetClientNm()
    { if (_clientNm == null) { _clientNm = nCV(); }
      return _clientNm; }
    protected ConditionValue xgetCValueClientNm() { return xdfgetClientNm(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientNm_Asc() { regOBA("CLIENT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientNm_Desc() { regOBD("CLIENT_NM"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _centerNm;
    public ConditionValue xdfgetCenterNm()
    { if (_centerNm == null) { _centerNm = nCV(); }
      return _centerNm; }
    protected ConditionValue xgetCValueCenterNm() { return xdfgetCenterNm(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CenterNm_Asc() { regOBA("CENTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CenterNm_Desc() { regOBD("CENTER_NM"); return this; }

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
    public BsHShippingHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivPlanDt_Asc() { regOBA("DELIV_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivPlanDt_Desc() { regOBD("DELIV_PLAN_DT"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

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
    public BsHShippingHCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

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
    public BsHShippingHCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

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
    public BsHShippingHCQ addOrderBy_ClientShippingNo_Asc() { regOBA("CLIENT_SHIPPING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ClientShippingNo_Desc() { regOBD("CLIENT_SHIPPING_NO"); return this; }

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
    public BsHShippingHCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

    protected ConditionValue _supplyCustomerId;
    public ConditionValue xdfgetSupplyCustomerId()
    { if (_supplyCustomerId == null) { _supplyCustomerId = nCV(); }
      return _supplyCustomerId; }
    protected ConditionValue xgetCValueSupplyCustomerId() { return xdfgetSupplyCustomerId(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_SupplyCustomerId_Asc() { regOBA("SUPPLY_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_SupplyCustomerId_Desc() { regOBD("SUPPLY_CUSTOMER_ID"); return this; }

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
    public BsHShippingHCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

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
    public BsHShippingHCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivCustomerId;
    public ConditionValue xdfgetDelivCustomerId()
    { if (_delivCustomerId == null) { _delivCustomerId = nCV(); }
      return _delivCustomerId; }
    protected ConditionValue xgetCValueDelivCustomerId() { return xdfgetDelivCustomerId(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivCustomerId_Asc() { regOBA("DELIV_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivCustomerId_Desc() { regOBD("DELIV_CUSTOMER_ID"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivCustomerCd_Asc() { regOBA("DELIV_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivCustomerCd_Desc() { regOBD("DELIV_CUSTOMER_CD"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivAddressSupply_Asc() { regOBA("DELIV_ADDRESS_SUPPLY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivAddressSupply_Desc() { regOBD("DELIV_ADDRESS_SUPPLY"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivCustomerNm_Asc() { regOBA("DELIV_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivCustomerNm_Desc() { regOBD("DELIV_CUSTOMER_NM"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

    protected ConditionValue _deliveryCourseId;
    public ConditionValue xdfgetDeliveryCourseId()
    { if (_deliveryCourseId == null) { _deliveryCourseId = nCV(); }
      return _deliveryCourseId; }
    protected ConditionValue xgetCValueDeliveryCourseId() { return xdfgetDeliveryCourseId(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _deliveryCourseNm;
    public ConditionValue xdfgetDeliveryCourseNm()
    { if (_deliveryCourseNm == null) { _deliveryCourseNm = nCV(); }
      return _deliveryCourseNm; }
    protected ConditionValue xgetCValueDeliveryCourseNm() { return xdfgetDeliveryCourseNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DeliveryCourseNm_Asc() { regOBA("DELIVERY_COURSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DeliveryCourseNm_Desc() { regOBD("DELIVERY_COURSE_NM"); return this; }

    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierNm;
    public ConditionValue xdfgetCarrierNm()
    { if (_carrierNm == null) { _carrierNm = nCV(); }
      return _carrierNm; }
    protected ConditionValue xgetCValueCarrierNm() { return xdfgetCarrierNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

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
    public BsHShippingHCQ addOrderBy_EmergencyFlg_Asc() { regOBA("EMERGENCY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_EmergencyFlg_Desc() { regOBD("EMERGENCY_FLG"); return this; }

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
    public BsHShippingHCQ addOrderBy_PickingWorkMessage_Asc() { regOBA("PICKING_WORK_MESSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_PickingWorkMessage_Desc() { regOBD("PICKING_WORK_MESSAGE"); return this; }

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
    public BsHShippingHCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

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
    public BsHShippingHCQ addOrderBy_TotalTax_Asc() { regOBA("TOTAL_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_TotalTax_Desc() { regOBD("TOTAL_TAX"); return this; }

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
    public BsHShippingHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHShippingHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHShippingHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHShippingHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHShippingHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHShippingHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHShippingHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHShippingHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHShippingHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHShippingHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHShippingHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHShippingHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HShippingHCQ bq = (HShippingHCQ)bqs;
        HShippingHCQ uq = (HShippingHCQ)uqs;
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryBClassDtlByDelivTz()) {
            uq.queryBClassDtlByDelivTz().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelivTz(), uq.queryBClassDtlByDelivTz());
        }
        if (bq.hasConditionQueryBClassDtlByEmergencyFlg()) {
            uq.queryBClassDtlByEmergencyFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByEmergencyFlg(), uq.queryBClassDtlByEmergencyFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("H_SHIPPING_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

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
        String nrp = xresolveNRP("H_SHIPPING_H", "bClassDtlByDelivTz"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("H_SHIPPING_H", "bClassDtlByEmergencyFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEmergencyFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEmergencyFlg() { xregOutJo("bClassDtlByEmergencyFlg"); }
    public boolean hasConditionQueryBClassDtlByEmergencyFlg() { return xhasQueRlMap("bClassDtlByEmergencyFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HShippingHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HShippingHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HShippingHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HShippingHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HShippingHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HShippingHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HShippingHCQ> _myselfExistsMap;
    public Map<String, HShippingHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HShippingHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HShippingHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HShippingHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HShippingHCB.class.getName(); }
    protected String xCQ() { return HShippingHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
