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
 * The base condition-query of M_DELIVERY_COURSE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMDeliveryCourseCQ extends AbstractBsMDeliveryCourseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MDeliveryCourseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMDeliveryCourseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_DELIVERY_COURSE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MDeliveryCourseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MDeliveryCourseCIQ xcreateCIQ() {
        MDeliveryCourseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MDeliveryCourseCIQ xnewCIQ() {
        return new MDeliveryCourseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_DELIVERY_COURSE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MDeliveryCourseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MDeliveryCourseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _deliveryCourseId;
    public ConditionValue xdfgetDeliveryCourseId()
    { if (_deliveryCourseId == null) { _deliveryCourseId = nCV(); }
      return _deliveryCourseId; }
    protected ConditionValue xgetCValueDeliveryCourseId() { return xdfgetDeliveryCourseId(); }

    public Map<String, MCenterCustomerCQ> xdfgetDeliveryCourseId_ExistsReferrer_MCenterCustomerList() { return xgetSQueMap("deliveryCourseId_ExistsReferrer_MCenterCustomerList"); }
    public String keepDeliveryCourseId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("deliveryCourseId_ExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MParamCQ> xdfgetDeliveryCourseId_ExistsReferrer_MParamList() { return xgetSQueMap("deliveryCourseId_ExistsReferrer_MParamList"); }
    public String keepDeliveryCourseId_ExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("deliveryCourseId_ExistsReferrer_MParamList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetDeliveryCourseId_ExistsReferrer_TAllocInstHList() { return xgetSQueMap("deliveryCourseId_ExistsReferrer_TAllocInstHList"); }
    public String keepDeliveryCourseId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("deliveryCourseId_ExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetDeliveryCourseId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("deliveryCourseId_ExistsReferrer_TShippingInstHList"); }
    public String keepDeliveryCourseId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("deliveryCourseId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetDeliveryCourseId_ExistsReferrer_WHtLoadingList() { return xgetSQueMap("deliveryCourseId_ExistsReferrer_WHtLoadingList"); }
    public String keepDeliveryCourseId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("deliveryCourseId_ExistsReferrer_WHtLoadingList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetDeliveryCourseId_NotExistsReferrer_MCenterCustomerList() { return xgetSQueMap("deliveryCourseId_NotExistsReferrer_MCenterCustomerList"); }
    public String keepDeliveryCourseId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("deliveryCourseId_NotExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MParamCQ> xdfgetDeliveryCourseId_NotExistsReferrer_MParamList() { return xgetSQueMap("deliveryCourseId_NotExistsReferrer_MParamList"); }
    public String keepDeliveryCourseId_NotExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("deliveryCourseId_NotExistsReferrer_MParamList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetDeliveryCourseId_NotExistsReferrer_TAllocInstHList() { return xgetSQueMap("deliveryCourseId_NotExistsReferrer_TAllocInstHList"); }
    public String keepDeliveryCourseId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("deliveryCourseId_NotExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetDeliveryCourseId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("deliveryCourseId_NotExistsReferrer_TShippingInstHList"); }
    public String keepDeliveryCourseId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("deliveryCourseId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetDeliveryCourseId_NotExistsReferrer_WHtLoadingList() { return xgetSQueMap("deliveryCourseId_NotExistsReferrer_WHtLoadingList"); }
    public String keepDeliveryCourseId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("deliveryCourseId_NotExistsReferrer_WHtLoadingList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetDeliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("deliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList"); }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("deliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList", sq); }

    public Map<String, MParamCQ> xdfgetDeliveryCourseId_SpecifyDerivedReferrer_MParamList() { return xgetSQueMap("deliveryCourseId_SpecifyDerivedReferrer_MParamList"); }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("deliveryCourseId_SpecifyDerivedReferrer_MParamList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetDeliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList() { return xgetSQueMap("deliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList"); }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("deliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetDeliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("deliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("deliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetDeliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList() { return xgetSQueMap("deliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList"); }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("deliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("deliveryCourseId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("deliveryCourseId_QueryDerivedReferrer_MCenterCustomerList", sq); }
    public Map<String, Object> xdfgetDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerListParameter() { return xgetSQuePmMap("deliveryCourseId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerListParameter(Object pm) { return xkeepSQuePm("deliveryCourseId_QueryDerivedReferrer_MCenterCustomerList", pm); }

    public Map<String, MParamCQ> xdfgetDeliveryCourseId_QueryDerivedReferrer_MParamList() { return xgetSQueMap("deliveryCourseId_QueryDerivedReferrer_MParamList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("deliveryCourseId_QueryDerivedReferrer_MParamList", sq); }
    public Map<String, Object> xdfgetDeliveryCourseId_QueryDerivedReferrer_MParamListParameter() { return xgetSQuePmMap("deliveryCourseId_QueryDerivedReferrer_MParamList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MParamListParameter(Object pm) { return xkeepSQuePm("deliveryCourseId_QueryDerivedReferrer_MParamList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetDeliveryCourseId_QueryDerivedReferrer_TAllocInstHList() { return xgetSQueMap("deliveryCourseId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("deliveryCourseId_QueryDerivedReferrer_TAllocInstHList", sq); }
    public Map<String, Object> xdfgetDeliveryCourseId_QueryDerivedReferrer_TAllocInstHListParameter() { return xgetSQuePmMap("deliveryCourseId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHListParameter(Object pm) { return xkeepSQuePm("deliveryCourseId_QueryDerivedReferrer_TAllocInstHList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetDeliveryCourseId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("deliveryCourseId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("deliveryCourseId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetDeliveryCourseId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("deliveryCourseId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("deliveryCourseId_QueryDerivedReferrer_TShippingInstHList", pm); }

    public Map<String, WHtLoadingCQ> xdfgetDeliveryCourseId_QueryDerivedReferrer_WHtLoadingList() { return xgetSQueMap("deliveryCourseId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("deliveryCourseId_QueryDerivedReferrer_WHtLoadingList", sq); }
    public Map<String, Object> xdfgetDeliveryCourseId_QueryDerivedReferrer_WHtLoadingListParameter() { return xgetSQuePmMap("deliveryCourseId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingListParameter(Object pm) { return xkeepSQuePm("deliveryCourseId_QueryDerivedReferrer_WHtLoadingList", pm); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _deliveryCourseNm;
    public ConditionValue xdfgetDeliveryCourseNm()
    { if (_deliveryCourseNm == null) { _deliveryCourseNm = nCV(); }
      return _deliveryCourseNm; }
    protected ConditionValue xgetCValueDeliveryCourseNm() { return xdfgetDeliveryCourseNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DeliveryCourseNm_Asc() { regOBA("DELIVERY_COURSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DeliveryCourseNm_Desc() { regOBD("DELIVERY_COURSE_NM"); return this; }

    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    public Map<String, MCarrierCQ> getCarrierId_InScopeRelation_MCarrier() { return xgetSQueMap("carrierId_InScopeRelation_MCarrier"); }
    public String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq) { return xkeepSQue("carrierId_InScopeRelation_MCarrier", sq); }

    public Map<String, MCarrierCQ> getCarrierId_NotInScopeRelation_MCarrier() { return xgetSQueMap("carrierId_NotInScopeRelation_MCarrier"); }
    public String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq) { return xkeepSQue("carrierId_NotInScopeRelation_MCarrier", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

    protected ConditionValue _pickingTime;
    public ConditionValue xdfgetPickingTime()
    { if (_pickingTime == null) { _pickingTime = nCV(); }
      return _pickingTime; }
    protected ConditionValue xgetCValuePickingTime() { return xdfgetPickingTime(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_PickingTime_Asc() { regOBA("PICKING_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_PickingTime_Desc() { regOBD("PICKING_TIME"); return this; }

    protected ConditionValue _stowageTime;
    public ConditionValue xdfgetStowageTime()
    { if (_stowageTime == null) { _stowageTime = nCV(); }
      return _stowageTime; }
    protected ConditionValue xgetCValueStowageTime() { return xdfgetStowageTime(); }

    /**
     * Add order-by as ascend. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_StowageTime_Asc() { regOBA("STOWAGE_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_StowageTime_Desc() { regOBD("STOWAGE_TIME"); return this; }

    protected ConditionValue _shippingTime;
    public ConditionValue xdfgetShippingTime()
    { if (_shippingTime == null) { _shippingTime = nCV(); }
      return _shippingTime; }
    protected ConditionValue xgetCValueShippingTime() { return xdfgetShippingTime(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_ShippingTime_Asc() { regOBA("SHIPPING_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_ShippingTime_Desc() { regOBD("SHIPPING_TIME"); return this; }

    protected ConditionValue _carrierSlipYmtId;
    public ConditionValue xdfgetCarrierSlipYmtId()
    { if (_carrierSlipYmtId == null) { _carrierSlipYmtId = nCV(); }
      return _carrierSlipYmtId; }
    protected ConditionValue xgetCValueCarrierSlipYmtId() { return xdfgetCarrierSlipYmtId(); }

    public Map<String, MCarrierSlipYmtCQ> getCarrierSlipYmtId_InScopeRelation_MCarrierSlipYmt() { return xgetSQueMap("carrierSlipYmtId_InScopeRelation_MCarrierSlipYmt"); }
    public String keepCarrierSlipYmtId_InScopeRelation_MCarrierSlipYmt(MCarrierSlipYmtCQ sq) { return xkeepSQue("carrierSlipYmtId_InScopeRelation_MCarrierSlipYmt", sq); }

    public Map<String, MCarrierSlipYmtCQ> getCarrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt() { return xgetSQueMap("carrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt"); }
    public String keepCarrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt(MCarrierSlipYmtCQ sq) { return xkeepSQue("carrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierSlipYmtId_Asc() { regOBA("CARRIER_SLIP_YMT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierSlipYmtId_Desc() { regOBD("CARRIER_SLIP_YMT_ID"); return this; }

    protected ConditionValue _carrierSlipSgwId;
    public ConditionValue xdfgetCarrierSlipSgwId()
    { if (_carrierSlipSgwId == null) { _carrierSlipSgwId = nCV(); }
      return _carrierSlipSgwId; }
    protected ConditionValue xgetCValueCarrierSlipSgwId() { return xdfgetCarrierSlipSgwId(); }

    public Map<String, MCarrierSlipSgwCQ> getCarrierSlipSgwId_InScopeRelation_MCarrierSlipSgw() { return xgetSQueMap("carrierSlipSgwId_InScopeRelation_MCarrierSlipSgw"); }
    public String keepCarrierSlipSgwId_InScopeRelation_MCarrierSlipSgw(MCarrierSlipSgwCQ sq) { return xkeepSQue("carrierSlipSgwId_InScopeRelation_MCarrierSlipSgw", sq); }

    public Map<String, MCarrierSlipSgwCQ> getCarrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw() { return xgetSQueMap("carrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw"); }
    public String keepCarrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw(MCarrierSlipSgwCQ sq) { return xkeepSQue("carrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierSlipSgwId_Asc() { regOBA("CARRIER_SLIP_SGW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierSlipSgwId_Desc() { regOBD("CARRIER_SLIP_SGW_ID"); return this; }

    protected ConditionValue _carrierSlipYupkId;
    public ConditionValue xdfgetCarrierSlipYupkId()
    { if (_carrierSlipYupkId == null) { _carrierSlipYupkId = nCV(); }
      return _carrierSlipYupkId; }
    protected ConditionValue xgetCValueCarrierSlipYupkId() { return xdfgetCarrierSlipYupkId(); }

    public Map<String, MCarrierSlipYupkCQ> getCarrierSlipYupkId_InScopeRelation_MCarrierSlipYupk() { return xgetSQueMap("carrierSlipYupkId_InScopeRelation_MCarrierSlipYupk"); }
    public String keepCarrierSlipYupkId_InScopeRelation_MCarrierSlipYupk(MCarrierSlipYupkCQ sq) { return xkeepSQue("carrierSlipYupkId_InScopeRelation_MCarrierSlipYupk", sq); }

    public Map<String, MCarrierSlipYupkCQ> getCarrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk() { return xgetSQueMap("carrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk"); }
    public String keepCarrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk(MCarrierSlipYupkCQ sq) { return xkeepSQue("carrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierSlipYupkId_Asc() { regOBA("CARRIER_SLIP_YUPK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_CarrierSlipYupkId_Desc() { regOBD("CARRIER_SLIP_YUPK_ID"); return this; }

    protected ConditionValue _trackingNumberingKey;
    public ConditionValue xdfgetTrackingNumberingKey()
    { if (_trackingNumberingKey == null) { _trackingNumberingKey = nCV(); }
      return _trackingNumberingKey; }
    protected ConditionValue xgetCValueTrackingNumberingKey() { return xdfgetTrackingNumberingKey(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TrackingNumberingKey_Asc() { regOBA("TRACKING_NUMBERING_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TrackingNumberingKey_Desc() { regOBD("TRACKING_NUMBERING_KEY"); return this; }

    protected ConditionValue _trackingNumberingAfterKey;
    public ConditionValue xdfgetTrackingNumberingAfterKey()
    { if (_trackingNumberingAfterKey == null) { _trackingNumberingAfterKey = nCV(); }
      return _trackingNumberingAfterKey; }
    protected ConditionValue xgetCValueTrackingNumberingAfterKey() { return xdfgetTrackingNumberingAfterKey(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TrackingNumberingAfterKey_Asc() { regOBA("TRACKING_NUMBERING_AFTER_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TrackingNumberingAfterKey_Desc() { regOBD("TRACKING_NUMBERING_AFTER_KEY"); return this; }

    protected ConditionValue _trackingNumberingUnit;
    public ConditionValue xdfgetTrackingNumberingUnit()
    { if (_trackingNumberingUnit == null) { _trackingNumberingUnit = nCV(); }
      return _trackingNumberingUnit; }
    protected ConditionValue xgetCValueTrackingNumberingUnit() { return xdfgetTrackingNumberingUnit(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TrackingNumberingUnit_Asc() { regOBA("TRACKING_NUMBERING_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TrackingNumberingUnit_Desc() { regOBD("TRACKING_NUMBERING_UNIT"); return this; }

    protected ConditionValue _tagType;
    public ConditionValue xdfgetTagType()
    { if (_tagType == null) { _tagType = nCV(); }
      return _tagType; }
    protected ConditionValue xgetCValueTagType() { return xdfgetTagType(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TagType_Asc() { regOBA("TAG_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TagType_Desc() { regOBD("TAG_TYPE"); return this; }

    protected ConditionValue _tagTypeAfter;
    public ConditionValue xdfgetTagTypeAfter()
    { if (_tagTypeAfter == null) { _tagTypeAfter = nCV(); }
      return _tagTypeAfter; }
    protected ConditionValue xgetCValueTagTypeAfter() { return xdfgetTagTypeAfter(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TagTypeAfter_Asc() { regOBA("TAG_TYPE_AFTER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TagTypeAfter_Desc() { regOBD("TAG_TYPE_AFTER"); return this; }

    protected ConditionValue _tagDataType;
    public ConditionValue xdfgetTagDataType()
    { if (_tagDataType == null) { _tagDataType = nCV(); }
      return _tagDataType; }
    protected ConditionValue xgetCValueTagDataType() { return xdfgetTagDataType(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TagDataType_Asc() { regOBA("TAG_DATA_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_TagDataType_Desc() { regOBD("TAG_DATA_TYPE"); return this; }

    protected ConditionValue _paymentTerm;
    public ConditionValue xdfgetPaymentTerm()
    { if (_paymentTerm == null) { _paymentTerm = nCV(); }
      return _paymentTerm; }
    protected ConditionValue xgetCValuePaymentTerm() { return xdfgetPaymentTerm(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_PaymentTerm_Asc() { regOBA("PAYMENT_TERM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_PaymentTerm_Desc() { regOBD("PAYMENT_TERM"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMDeliveryCourseCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMDeliveryCourseCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMDeliveryCourseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMDeliveryCourseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MDeliveryCourseCQ bq = (MDeliveryCourseCQ)bqs;
        MDeliveryCourseCQ uq = (MDeliveryCourseCQ)uqs;
        if (bq.hasConditionQueryMCarrierSlipYupk()) {
            uq.queryMCarrierSlipYupk().reflectRelationOnUnionQuery(bq.queryMCarrierSlipYupk(), uq.queryMCarrierSlipYupk());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCarrier()) {
            uq.queryMCarrier().reflectRelationOnUnionQuery(bq.queryMCarrier(), uq.queryMCarrier());
        }
        if (bq.hasConditionQueryMCarrierSlipSgw()) {
            uq.queryMCarrierSlipSgw().reflectRelationOnUnionQuery(bq.queryMCarrierSlipSgw(), uq.queryMCarrierSlipSgw());
        }
        if (bq.hasConditionQueryMCarrierSlipYmt()) {
            uq.queryMCarrierSlipYmt().reflectRelationOnUnionQuery(bq.queryMCarrierSlipYmt(), uq.queryMCarrierSlipYmt());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryMCenterClassDtlByTagDataType()) {
            uq.xsetParameterMapMCenterClassDtlByTagDataType(bq.xdfgetParameterMapMCenterClassDtlByTagDataType());
            uq.xdfgetConditionQueryMCenterClassDtlByTagDataType().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByTagDataType(), uq.xdfgetConditionQueryMCenterClassDtlByTagDataType());
        }
        if (bq.hasConditionQueryMCenterClassDtlByTagType()) {
            uq.xsetParameterMapMCenterClassDtlByTagType(bq.xdfgetParameterMapMCenterClassDtlByTagType());
            uq.xdfgetConditionQueryMCenterClassDtlByTagType().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByTagType(), uq.xdfgetConditionQueryMCenterClassDtlByTagType());
        }
        if (bq.hasConditionQueryMCenterClassDtlByTagTypeAfter()) {
            uq.xsetParameterMapMCenterClassDtlByTagTypeAfter(bq.xdfgetParameterMapMCenterClassDtlByTagTypeAfter());
            uq.xdfgetConditionQueryMCenterClassDtlByTagTypeAfter().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByTagTypeAfter(), uq.xdfgetConditionQueryMCenterClassDtlByTagTypeAfter());
        }
        if (bq.hasConditionQueryBClassDtlByTrackingNumberingUnit()) {
            uq.queryBClassDtlByTrackingNumberingUnit().reflectRelationOnUnionQuery(bq.queryBClassDtlByTrackingNumberingUnit(), uq.queryBClassDtlByTrackingNumberingUnit());
        }
        if (bq.hasConditionQueryBClassDtlByPaymentTerm()) {
            uq.queryBClassDtlByPaymentTerm().reflectRelationOnUnionQuery(bq.queryBClassDtlByPaymentTerm(), uq.queryBClassDtlByPaymentTerm());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierSlipYupkCQ queryMCarrierSlipYupk() {
        return xdfgetConditionQueryMCarrierSlipYupk();
    }
    public MCarrierSlipYupkCQ xdfgetConditionQueryMCarrierSlipYupk() {
        String prop = "mCarrierSlipYupk";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierSlipYupk()); xsetupOuterJoinMCarrierSlipYupk(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierSlipYupkCQ xcreateQueryMCarrierSlipYupk() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCarrierSlipYupk"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierSlipYupkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierSlipYupk", nrp);
    }
    protected void xsetupOuterJoinMCarrierSlipYupk() { xregOutJo("mCarrierSlipYupk"); }
    public boolean hasConditionQueryMCarrierSlipYupk() { return xhasQueRlMap("mCarrierSlipYupk"); }

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
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrier() {
        return xdfgetConditionQueryMCarrier();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrier() {
        String prop = "mCarrier";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrier()); xsetupOuterJoinMCarrier(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrier() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCarrier"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrier", nrp);
    }
    protected void xsetupOuterJoinMCarrier() { xregOutJo("mCarrier"); }
    public boolean hasConditionQueryMCarrier() { return xhasQueRlMap("mCarrier"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierSlipSgwCQ queryMCarrierSlipSgw() {
        return xdfgetConditionQueryMCarrierSlipSgw();
    }
    public MCarrierSlipSgwCQ xdfgetConditionQueryMCarrierSlipSgw() {
        String prop = "mCarrierSlipSgw";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierSlipSgw()); xsetupOuterJoinMCarrierSlipSgw(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierSlipSgwCQ xcreateQueryMCarrierSlipSgw() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCarrierSlipSgw"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierSlipSgwCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierSlipSgw", nrp);
    }
    protected void xsetupOuterJoinMCarrierSlipSgw() { xregOutJo("mCarrierSlipSgw"); }
    public boolean hasConditionQueryMCarrierSlipSgw() { return xhasQueRlMap("mCarrierSlipSgw"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierSlipYmtCQ queryMCarrierSlipYmt() {
        return xdfgetConditionQueryMCarrierSlipYmt();
    }
    public MCarrierSlipYmtCQ xdfgetConditionQueryMCarrierSlipYmt() {
        String prop = "mCarrierSlipYmt";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierSlipYmt()); xsetupOuterJoinMCarrierSlipYmt(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierSlipYmtCQ xcreateQueryMCarrierSlipYmt() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCarrierSlipYmt"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierSlipYmtCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierSlipYmt", nrp);
    }
    protected void xsetupOuterJoinMCarrierSlipYmt() { xregOutJo("mCarrierSlipYmt"); }
    public boolean hasConditionQueryMCarrierSlipYmt() { return xhasQueRlMap("mCarrierSlipYmt"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByTagDataType(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByTagDataType();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByTagDataType", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByTagDataType();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByTagDataType() {
        String prop = "mCenterClassDtlByTagDataType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByTagDataType()); xsetupOuterJoinMCenterClassDtlByTagDataType(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByTagDataType;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByTagDataType()
    { if (_parameterMapMCenterClassDtlByTagDataType == null) { _parameterMapMCenterClassDtlByTagDataType = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByTagDataType; }
    public void xsetParameterMapMCenterClassDtlByTagDataType(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByTagDataType = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByTagDataType() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCenterClassDtlByTagDataType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByTagDataType", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByTagDataType() { xregOutJo("mCenterClassDtlByTagDataType"); }
    public boolean hasConditionQueryMCenterClassDtlByTagDataType() { return xhasQueRlMap("mCenterClassDtlByTagDataType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByTagType(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByTagType();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByTagType", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByTagType();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByTagType() {
        String prop = "mCenterClassDtlByTagType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByTagType()); xsetupOuterJoinMCenterClassDtlByTagType(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByTagType;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByTagType()
    { if (_parameterMapMCenterClassDtlByTagType == null) { _parameterMapMCenterClassDtlByTagType = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByTagType; }
    public void xsetParameterMapMCenterClassDtlByTagType(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByTagType = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByTagType() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCenterClassDtlByTagType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByTagType", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByTagType() { xregOutJo("mCenterClassDtlByTagType"); }
    public boolean hasConditionQueryMCenterClassDtlByTagType() { return xhasQueRlMap("mCenterClassDtlByTagType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByTagTypeAfter(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByTagTypeAfter();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByTagTypeAfter", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByTagTypeAfter();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByTagTypeAfter() {
        String prop = "mCenterClassDtlByTagTypeAfter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByTagTypeAfter()); xsetupOuterJoinMCenterClassDtlByTagTypeAfter(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByTagTypeAfter;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByTagTypeAfter()
    { if (_parameterMapMCenterClassDtlByTagTypeAfter == null) { _parameterMapMCenterClassDtlByTagTypeAfter = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByTagTypeAfter; }
    public void xsetParameterMapMCenterClassDtlByTagTypeAfter(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByTagTypeAfter = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByTagTypeAfter() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "mCenterClassDtlByTagTypeAfter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByTagTypeAfter", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByTagTypeAfter() { xregOutJo("mCenterClassDtlByTagTypeAfter"); }
    public boolean hasConditionQueryMCenterClassDtlByTagTypeAfter() { return xhasQueRlMap("mCenterClassDtlByTagTypeAfter"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTrackingNumberingUnit() {
        return xdfgetConditionQueryBClassDtlByTrackingNumberingUnit();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTrackingNumberingUnit() {
        String prop = "bClassDtlByTrackingNumberingUnit";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTrackingNumberingUnit()); xsetupOuterJoinBClassDtlByTrackingNumberingUnit(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTrackingNumberingUnit() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "bClassDtlByTrackingNumberingUnit"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTrackingNumberingUnit", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTrackingNumberingUnit() { xregOutJo("bClassDtlByTrackingNumberingUnit"); }
    public boolean hasConditionQueryBClassDtlByTrackingNumberingUnit() { return xhasQueRlMap("bClassDtlByTrackingNumberingUnit"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPaymentTerm() {
        return xdfgetConditionQueryBClassDtlByPaymentTerm();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPaymentTerm() {
        String prop = "bClassDtlByPaymentTerm";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPaymentTerm()); xsetupOuterJoinBClassDtlByPaymentTerm(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPaymentTerm() {
        String nrp = xresolveNRP("M_DELIVERY_COURSE", "bClassDtlByPaymentTerm"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPaymentTerm", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPaymentTerm() { xregOutJo("bClassDtlByPaymentTerm"); }
    public boolean hasConditionQueryBClassDtlByPaymentTerm() { return xhasQueRlMap("bClassDtlByPaymentTerm"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("mCenterClassDtlByTagDataType".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByTagDataType; }
        if ("mCenterClassDtlByTagType".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByTagType; }
        if ("mCenterClassDtlByTagTypeAfter".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByTagTypeAfter; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MDeliveryCourseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MDeliveryCourseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MDeliveryCourseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MDeliveryCourseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MDeliveryCourseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MDeliveryCourseCQ> _myselfExistsMap;
    public Map<String, MDeliveryCourseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MDeliveryCourseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MDeliveryCourseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MDeliveryCourseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MDeliveryCourseCB.class.getName(); }
    protected String xCQ() { return MDeliveryCourseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
