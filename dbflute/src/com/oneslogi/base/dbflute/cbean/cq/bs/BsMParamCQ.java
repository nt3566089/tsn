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
 * The base condition-query of M_PARAM.
 * @author DBFlute(AutoGenerator)
 */
public class BsMParamCQ extends AbstractBsMParamCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MParamCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMParamCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_PARAM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MParamCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MParamCIQ xcreateCIQ() {
        MParamCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MParamCIQ xnewCIQ() {
        return new MParamCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_PARAM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MParamCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MParamCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clientCenterId;
    public ConditionValue xdfgetClientCenterId()
    { if (_clientCenterId == null) { _clientCenterId = nCV(); }
      return _clientCenterId; }
    protected ConditionValue xgetCValueClientCenterId() { return xdfgetClientCenterId(); }

    public Map<String, MClientCenterCQ> getClientCenterId_InScopeRelation_MClientCenter() { return xgetSQueMap("clientCenterId_InScopeRelation_MClientCenter"); }
    public String keepClientCenterId_InScopeRelation_MClientCenter(MClientCenterCQ sq) { return xkeepSQue("clientCenterId_InScopeRelation_MClientCenter", sq); }

    public Map<String, MClientCenterCQ> getClientCenterId_NotInScopeRelation_MClientCenter() { return xgetSQueMap("clientCenterId_NotInScopeRelation_MClientCenter"); }
    public String keepClientCenterId_NotInScopeRelation_MClientCenter(MClientCenterCQ sq) { return xkeepSQue("clientCenterId_NotInScopeRelation_MClientCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ClientCenterId_Asc() { regOBA("CLIENT_CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ClientCenterId_Desc() { regOBD("CLIENT_CENTER_ID"); return this; }

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
    public BsMParamCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

    protected ConditionValue _storeDtFlg;
    public ConditionValue xdfgetStoreDtFlg()
    { if (_storeDtFlg == null) { _storeDtFlg = nCV(); }
      return _storeDtFlg; }
    protected ConditionValue xgetCValueStoreDtFlg() { return xdfgetStoreDtFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StoreDtFlg_Asc() { regOBA("STORE_DT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StoreDtFlg_Desc() { regOBD("STORE_DT_FLG"); return this; }

    protected ConditionValue _storeNoFlg;
    public ConditionValue xdfgetStoreNoFlg()
    { if (_storeNoFlg == null) { _storeNoFlg = nCV(); }
      return _storeNoFlg; }
    protected ConditionValue xgetCValueStoreNoFlg() { return xdfgetStoreNoFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StoreNoFlg_Asc() { regOBA("STORE_NO_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StoreNoFlg_Desc() { regOBD("STORE_NO_FLG"); return this; }

    protected ConditionValue _mergeCls;
    public ConditionValue xdfgetMergeCls()
    { if (_mergeCls == null) { _mergeCls = nCV(); }
      return _mergeCls; }
    protected ConditionValue xgetCValueMergeCls() { return xdfgetMergeCls(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_MergeCls_Asc() { regOBA("MERGE_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_MergeCls_Desc() { regOBD("MERGE_CLS"); return this; }

    protected ConditionValue _tKeepingDays;
    public ConditionValue xdfgetTKeepingDays()
    { if (_tKeepingDays == null) { _tKeepingDays = nCV(); }
      return _tKeepingDays; }
    protected ConditionValue xgetCValueTKeepingDays() { return xdfgetTKeepingDays(); }

    /**
     * Add order-by as ascend. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_TKeepingDays_Asc() { regOBA("T_KEEPING_DAYS"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_TKeepingDays_Desc() { regOBD("T_KEEPING_DAYS"); return this; }

    protected ConditionValue _hKeepingDays;
    public ConditionValue xdfgetHKeepingDays()
    { if (_hKeepingDays == null) { _hKeepingDays = nCV(); }
      return _hKeepingDays; }
    protected ConditionValue xgetCValueHKeepingDays() { return xdfgetHKeepingDays(); }

    /**
     * Add order-by as ascend. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HKeepingDays_Asc() { regOBA("H_KEEPING_DAYS"); return this; }

    /**
     * Add order-by as descend. <br>
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HKeepingDays_Desc() { regOBD("H_KEEPING_DAYS"); return this; }

    protected ConditionValue _dKeepingDays;
    public ConditionValue xdfgetDKeepingDays()
    { if (_dKeepingDays == null) { _dKeepingDays = nCV(); }
      return _dKeepingDays; }
    protected ConditionValue xgetCValueDKeepingDays() { return xdfgetDKeepingDays(); }

    /**
     * Add order-by as ascend. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DKeepingDays_Asc() { regOBA("D_KEEPING_DAYS"); return this; }

    /**
     * Add order-by as descend. <br>
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DKeepingDays_Desc() { regOBD("D_KEEPING_DAYS"); return this; }

    protected ConditionValue _overStoreNumFlg;
    public ConditionValue xdfgetOverStoreNumFlg()
    { if (_overStoreNumFlg == null) { _overStoreNumFlg = nCV(); }
      return _overStoreNumFlg; }
    protected ConditionValue xgetCValueOverStoreNumFlg() { return xdfgetOverStoreNumFlg(); }

    /**
     * Add order-by as ascend. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_OverStoreNumFlg_Asc() { regOBA("OVER_STORE_NUM_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_OverStoreNumFlg_Desc() { regOBD("OVER_STORE_NUM_FLG"); return this; }

    protected ConditionValue _pastStoreDtFlg;
    public ConditionValue xdfgetPastStoreDtFlg()
    { if (_pastStoreDtFlg == null) { _pastStoreDtFlg = nCV(); }
      return _pastStoreDtFlg; }
    protected ConditionValue xgetCValuePastStoreDtFlg() { return xdfgetPastStoreDtFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PastStoreDtFlg_Asc() { regOBA("PAST_STORE_DT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PastStoreDtFlg_Desc() { regOBD("PAST_STORE_DT_FLG"); return this; }

    protected ConditionValue _useHtShipFlg;
    public ConditionValue xdfgetUseHtShipFlg()
    { if (_useHtShipFlg == null) { _useHtShipFlg = nCV(); }
      return _useHtShipFlg; }
    protected ConditionValue xgetCValueUseHtShipFlg() { return xdfgetUseHtShipFlg(); }

    /**
     * Add order-by as ascend. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_UseHtShipFlg_Asc() { regOBA("USE_HT_SHIP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_UseHtShipFlg_Desc() { regOBD("USE_HT_SHIP_FLG"); return this; }

    protected ConditionValue _allocSortKey;
    public ConditionValue xdfgetAllocSortKey()
    { if (_allocSortKey == null) { _allocSortKey = nCV(); }
      return _allocSortKey; }
    protected ConditionValue xgetCValueAllocSortKey() { return xdfgetAllocSortKey(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AllocSortKey_Asc() { regOBA("ALLOC_SORT_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_SORT_KEY: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AllocSortKey_Desc() { regOBD("ALLOC_SORT_KEY"); return this; }

    protected ConditionValue _rgReplenishUnitCls;
    public ConditionValue xdfgetRgReplenishUnitCls()
    { if (_rgReplenishUnitCls == null) { _rgReplenishUnitCls = nCV(); }
      return _rgReplenishUnitCls; }
    protected ConditionValue xgetCValueRgReplenishUnitCls() { return xdfgetRgReplenishUnitCls(); }

    /**
     * Add order-by as ascend. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_RgReplenishUnitCls_Asc() { regOBA("RG_REPLENISH_UNIT_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_RgReplenishUnitCls_Desc() { regOBD("RG_REPLENISH_UNIT_CLS"); return this; }

    protected ConditionValue _emReplenishUnitCls;
    public ConditionValue xdfgetEmReplenishUnitCls()
    { if (_emReplenishUnitCls == null) { _emReplenishUnitCls = nCV(); }
      return _emReplenishUnitCls; }
    protected ConditionValue xgetCValueEmReplenishUnitCls() { return xdfgetEmReplenishUnitCls(); }

    /**
     * Add order-by as ascend. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_EmReplenishUnitCls_Asc() { regOBA("EM_REPLENISH_UNIT_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_EmReplenishUnitCls_Desc() { regOBD("EM_REPLENISH_UNIT_CLS"); return this; }

    protected ConditionValue _emReplenishZoneId;
    public ConditionValue xdfgetEmReplenishZoneId()
    { if (_emReplenishZoneId == null) { _emReplenishZoneId = nCV(); }
      return _emReplenishZoneId; }
    protected ConditionValue xgetCValueEmReplenishZoneId() { return xdfgetEmReplenishZoneId(); }

    public Map<String, MZoneCQ> getEmReplenishZoneId_InScopeRelation_MZone() { return xgetSQueMap("emReplenishZoneId_InScopeRelation_MZone"); }
    public String keepEmReplenishZoneId_InScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("emReplenishZoneId_InScopeRelation_MZone", sq); }

    public Map<String, MZoneCQ> getEmReplenishZoneId_NotInScopeRelation_MZone() { return xgetSQueMap("emReplenishZoneId_NotInScopeRelation_MZone"); }
    public String keepEmReplenishZoneId_NotInScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("emReplenishZoneId_NotInScopeRelation_MZone", sq); }

    /**
     * Add order-by as ascend. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_EmReplenishZoneId_Asc() { regOBA("EM_REPLENISH_ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_EmReplenishZoneId_Desc() { regOBD("EM_REPLENISH_ZONE_ID"); return this; }

    protected ConditionValue _emReplenishAllocCls;
    public ConditionValue xdfgetEmReplenishAllocCls()
    { if (_emReplenishAllocCls == null) { _emReplenishAllocCls = nCV(); }
      return _emReplenishAllocCls; }
    protected ConditionValue xgetCValueEmReplenishAllocCls() { return xdfgetEmReplenishAllocCls(); }

    /**
     * Add order-by as ascend. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_EmReplenishAllocCls_Asc() { regOBA("EM_REPLENISH_ALLOC_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_EmReplenishAllocCls_Desc() { regOBD("EM_REPLENISH_ALLOC_CLS"); return this; }

    protected ConditionValue _packingCalCls;
    public ConditionValue xdfgetPackingCalCls()
    { if (_packingCalCls == null) { _packingCalCls = nCV(); }
      return _packingCalCls; }
    protected ConditionValue xgetCValuePackingCalCls() { return xdfgetPackingCalCls(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingCalCls_Asc() { regOBA("PACKING_CAL_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingCalCls_Desc() { regOBD("PACKING_CAL_CLS"); return this; }

    protected ConditionValue _packingProcessCls;
    public ConditionValue xdfgetPackingProcessCls()
    { if (_packingProcessCls == null) { _packingProcessCls = nCV(); }
      return _packingProcessCls; }
    protected ConditionValue xgetCValuePackingProcessCls() { return xdfgetPackingProcessCls(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingProcessCls_Asc() { regOBA("PACKING_PROCESS_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingProcessCls_Desc() { regOBD("PACKING_PROCESS_CLS"); return this; }

    protected ConditionValue _productPartPacking;
    public ConditionValue xdfgetProductPartPacking()
    { if (_productPartPacking == null) { _productPartPacking = nCV(); }
      return _productPartPacking; }
    protected ConditionValue xgetCValueProductPartPacking() { return xdfgetProductPartPacking(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductPartPacking_Asc() { regOBA("PRODUCT_PART_PACKING"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductPartPacking_Desc() { regOBD("PRODUCT_PART_PACKING"); return this; }

    protected ConditionValue _decimalProductPacking;
    public ConditionValue xdfgetDecimalProductPacking()
    { if (_decimalProductPacking == null) { _decimalProductPacking = nCV(); }
      return _decimalProductPacking; }
    protected ConditionValue xgetCValueDecimalProductPacking() { return xdfgetDecimalProductPacking(); }

    /**
     * Add order-by as ascend. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DecimalProductPacking_Asc() { regOBA("DECIMAL_PRODUCT_PACKING"); return this; }

    /**
     * Add order-by as descend. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DecimalProductPacking_Desc() { regOBD("DECIMAL_PRODUCT_PACKING"); return this; }

    protected ConditionValue _packingBoxGroupId;
    public ConditionValue xdfgetPackingBoxGroupId()
    { if (_packingBoxGroupId == null) { _packingBoxGroupId = nCV(); }
      return _packingBoxGroupId; }
    protected ConditionValue xgetCValuePackingBoxGroupId() { return xdfgetPackingBoxGroupId(); }

    public Map<String, MBoxGrpCQ> getPackingBoxGroupId_InScopeRelation_MBoxGrp() { return xgetSQueMap("packingBoxGroupId_InScopeRelation_MBoxGrp"); }
    public String keepPackingBoxGroupId_InScopeRelation_MBoxGrp(MBoxGrpCQ sq) { return xkeepSQue("packingBoxGroupId_InScopeRelation_MBoxGrp", sq); }

    public Map<String, MBoxGrpCQ> getPackingBoxGroupId_NotInScopeRelation_MBoxGrp() { return xgetSQueMap("packingBoxGroupId_NotInScopeRelation_MBoxGrp"); }
    public String keepPackingBoxGroupId_NotInScopeRelation_MBoxGrp(MBoxGrpCQ sq) { return xkeepSQue("packingBoxGroupId_NotInScopeRelation_MBoxGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingBoxGroupId_Asc() { regOBA("PACKING_BOX_GROUP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingBoxGroupId_Desc() { regOBD("PACKING_BOX_GROUP_ID"); return this; }

    protected ConditionValue _totalPicFlg;
    public ConditionValue xdfgetTotalPicFlg()
    { if (_totalPicFlg == null) { _totalPicFlg = nCV(); }
      return _totalPicFlg; }
    protected ConditionValue xgetCValueTotalPicFlg() { return xdfgetTotalPicFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_TotalPicFlg_Asc() { regOBA("TOTAL_PIC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_TotalPicFlg_Desc() { regOBD("TOTAL_PIC_FLG"); return this; }

    protected ConditionValue _multiPicCls;
    public ConditionValue xdfgetMultiPicCls()
    { if (_multiPicCls == null) { _multiPicCls = nCV(); }
      return _multiPicCls; }
    protected ConditionValue xgetCValueMultiPicCls() { return xdfgetMultiPicCls(); }

    /**
     * Add order-by as ascend. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_MultiPicCls_Asc() { regOBA("MULTI_PIC_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_MultiPicCls_Desc() { regOBD("MULTI_PIC_CLS"); return this; }

    protected ConditionValue _backetColNum;
    public ConditionValue xdfgetBacketColNum()
    { if (_backetColNum == null) { _backetColNum = nCV(); }
      return _backetColNum; }
    protected ConditionValue xgetCValueBacketColNum() { return xdfgetBacketColNum(); }

    /**
     * Add order-by as ascend. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_BacketColNum_Asc() { regOBA("BACKET_COL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_BacketColNum_Desc() { regOBD("BACKET_COL_NUM"); return this; }

    protected ConditionValue _backetRowNum;
    public ConditionValue xdfgetBacketRowNum()
    { if (_backetRowNum == null) { _backetRowNum = nCV(); }
      return _backetRowNum; }
    protected ConditionValue xgetCValueBacketRowNum() { return xdfgetBacketRowNum(); }

    /**
     * Add order-by as ascend. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_BacketRowNum_Asc() { regOBA("BACKET_ROW_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_BacketRowNum_Desc() { regOBD("BACKET_ROW_NUM"); return this; }

    protected ConditionValue _casePicFlg;
    public ConditionValue xdfgetCasePicFlg()
    { if (_casePicFlg == null) { _casePicFlg = nCV(); }
      return _casePicFlg; }
    protected ConditionValue xgetCValueCasePicFlg() { return xdfgetCasePicFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_CasePicFlg_Asc() { regOBA("CASE_PIC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_CasePicFlg_Desc() { regOBD("CASE_PIC_FLG"); return this; }

    protected ConditionValue _sglRowPicFlg;
    public ConditionValue xdfgetSglRowPicFlg()
    { if (_sglRowPicFlg == null) { _sglRowPicFlg = nCV(); }
      return _sglRowPicFlg; }
    protected ConditionValue xgetCValueSglRowPicFlg() { return xdfgetSglRowPicFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_SglRowPicFlg_Asc() { regOBA("SGL_ROW_PIC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_SglRowPicFlg_Desc() { regOBD("SGL_ROW_PIC_FLG"); return this; }

    protected ConditionValue _sglRowPicMaxInstNum;
    public ConditionValue xdfgetSglRowPicMaxInstNum()
    { if (_sglRowPicMaxInstNum == null) { _sglRowPicMaxInstNum = nCV(); }
      return _sglRowPicMaxInstNum; }
    protected ConditionValue xgetCValueSglRowPicMaxInstNum() { return xdfgetSglRowPicMaxInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_SglRowPicMaxInstNum_Asc() { regOBA("SGL_ROW_PIC_MAX_INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_SglRowPicMaxInstNum_Desc() { regOBD("SGL_ROW_PIC_MAX_INST_NUM"); return this; }

    protected ConditionValue _picMthdRcmdFlg;
    public ConditionValue xdfgetPicMthdRcmdFlg()
    { if (_picMthdRcmdFlg == null) { _picMthdRcmdFlg = nCV(); }
      return _picMthdRcmdFlg; }
    protected ConditionValue xgetCValuePicMthdRcmdFlg() { return xdfgetPicMthdRcmdFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdFlg_Asc() { regOBA("PIC_MTHD_RCMD_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdFlg_Desc() { regOBD("PIC_MTHD_RCMD_FLG"); return this; }

    protected ConditionValue _picMthdRcmdBreakKey;
    public ConditionValue xdfgetPicMthdRcmdBreakKey()
    { if (_picMthdRcmdBreakKey == null) { _picMthdRcmdBreakKey = nCV(); }
      return _picMthdRcmdBreakKey; }
    protected ConditionValue xgetCValuePicMthdRcmdBreakKey() { return xdfgetPicMthdRcmdBreakKey(); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdBreakKey_Asc() { regOBA("PIC_MTHD_RCMD_BREAK_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdBreakKey_Desc() { regOBD("PIC_MTHD_RCMD_BREAK_KEY"); return this; }

    protected ConditionValue _picMthdRcmdApiKey;
    public ConditionValue xdfgetPicMthdRcmdApiKey()
    { if (_picMthdRcmdApiKey == null) { _picMthdRcmdApiKey = nCV(); }
      return _picMthdRcmdApiKey; }
    protected ConditionValue xgetCValuePicMthdRcmdApiKey() { return xdfgetPicMthdRcmdApiKey(); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdApiKey_Asc() { regOBA("PIC_MTHD_RCMD_API_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdApiKey_Desc() { regOBD("PIC_MTHD_RCMD_API_KEY"); return this; }

    protected ConditionValue _picMthdRcmdMltPlOut;
    public ConditionValue xdfgetPicMthdRcmdMltPlOut()
    { if (_picMthdRcmdMltPlOut == null) { _picMthdRcmdMltPlOut = nCV(); }
      return _picMthdRcmdMltPlOut; }
    protected ConditionValue xgetCValuePicMthdRcmdMltPlOut() { return xdfgetPicMthdRcmdMltPlOut(); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdMltPlOut_Asc() { regOBA("PIC_MTHD_RCMD_MLT_PL_OUT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdMltPlOut_Desc() { regOBD("PIC_MTHD_RCMD_MLT_PL_OUT"); return this; }

    protected ConditionValue _picMthdRcmdSplSlOut;
    public ConditionValue xdfgetPicMthdRcmdSplSlOut()
    { if (_picMthdRcmdSplSlOut == null) { _picMthdRcmdSplSlOut = nCV(); }
      return _picMthdRcmdSplSlOut; }
    protected ConditionValue xgetCValuePicMthdRcmdSplSlOut() { return xdfgetPicMthdRcmdSplSlOut(); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdSplSlOut_Asc() { regOBA("PIC_MTHD_RCMD_SPL_SL_OUT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PicMthdRcmdSplSlOut_Desc() { regOBD("PIC_MTHD_RCMD_SPL_SL_OUT"); return this; }

    protected ConditionValue _productLabelOutUnit;
    public ConditionValue xdfgetProductLabelOutUnit()
    { if (_productLabelOutUnit == null) { _productLabelOutUnit = nCV(); }
      return _productLabelOutUnit; }
    protected ConditionValue xgetCValueProductLabelOutUnit() { return xdfgetProductLabelOutUnit(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelOutUnit_Asc() { regOBA("PRODUCT_LABEL_OUT_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelOutUnit_Desc() { regOBD("PRODUCT_LABEL_OUT_UNIT"); return this; }

    protected ConditionValue _resultAfterProductLabel;
    public ConditionValue xdfgetResultAfterProductLabel()
    { if (_resultAfterProductLabel == null) { _resultAfterProductLabel = nCV(); }
      return _resultAfterProductLabel; }
    protected ConditionValue xgetCValueResultAfterProductLabel() { return xdfgetResultAfterProductLabel(); }

    /**
     * Add order-by as ascend. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ResultAfterProductLabel_Asc() { regOBA("RESULT_AFTER_PRODUCT_LABEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ResultAfterProductLabel_Desc() { regOBD("RESULT_AFTER_PRODUCT_LABEL"); return this; }

    protected ConditionValue _resultAfterProductTarget;
    public ConditionValue xdfgetResultAfterProductTarget()
    { if (_resultAfterProductTarget == null) { _resultAfterProductTarget = nCV(); }
      return _resultAfterProductTarget; }
    protected ConditionValue xgetCValueResultAfterProductTarget() { return xdfgetResultAfterProductTarget(); }

    /**
     * Add order-by as ascend. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ResultAfterProductTarget_Asc() { regOBA("RESULT_AFTER_PRODUCT_TARGET"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ResultAfterProductTarget_Desc() { regOBD("RESULT_AFTER_PRODUCT_TARGET"); return this; }

    protected ConditionValue _productLabelJanBarcode;
    public ConditionValue xdfgetProductLabelJanBarcode()
    { if (_productLabelJanBarcode == null) { _productLabelJanBarcode = nCV(); }
      return _productLabelJanBarcode; }
    protected ConditionValue xgetCValueProductLabelJanBarcode() { return xdfgetProductLabelJanBarcode(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelJanBarcode_Asc() { regOBA("PRODUCT_LABEL_JAN_BARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelJanBarcode_Desc() { regOBD("PRODUCT_LABEL_JAN_BARCODE"); return this; }

    protected ConditionValue _productLabelProdBarcode;
    public ConditionValue xdfgetProductLabelProdBarcode()
    { if (_productLabelProdBarcode == null) { _productLabelProdBarcode = nCV(); }
      return _productLabelProdBarcode; }
    protected ConditionValue xgetCValueProductLabelProdBarcode() { return xdfgetProductLabelProdBarcode(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelProdBarcode_Asc() { regOBA("PRODUCT_LABEL_PROD_BARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelProdBarcode_Desc() { regOBD("PRODUCT_LABEL_PROD_BARCODE"); return this; }

    protected ConditionValue _productLabelJanStartbit;
    public ConditionValue xdfgetProductLabelJanStartbit()
    { if (_productLabelJanStartbit == null) { _productLabelJanStartbit = nCV(); }
      return _productLabelJanStartbit; }
    protected ConditionValue xgetCValueProductLabelJanStartbit() { return xdfgetProductLabelJanStartbit(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelJanStartbit_Asc() { regOBA("PRODUCT_LABEL_JAN_STARTBIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelJanStartbit_Desc() { regOBD("PRODUCT_LABEL_JAN_STARTBIT"); return this; }

    protected ConditionValue _productLabelJanEndbit;
    public ConditionValue xdfgetProductLabelJanEndbit()
    { if (_productLabelJanEndbit == null) { _productLabelJanEndbit = nCV(); }
      return _productLabelJanEndbit; }
    protected ConditionValue xgetCValueProductLabelJanEndbit() { return xdfgetProductLabelJanEndbit(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelJanEndbit_Asc() { regOBA("PRODUCT_LABEL_JAN_ENDBIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelJanEndbit_Desc() { regOBD("PRODUCT_LABEL_JAN_ENDBIT"); return this; }

    protected ConditionValue _productLabelProdStartbit;
    public ConditionValue xdfgetProductLabelProdStartbit()
    { if (_productLabelProdStartbit == null) { _productLabelProdStartbit = nCV(); }
      return _productLabelProdStartbit; }
    protected ConditionValue xgetCValueProductLabelProdStartbit() { return xdfgetProductLabelProdStartbit(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelProdStartbit_Asc() { regOBA("PRODUCT_LABEL_PROD_STARTBIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelProdStartbit_Desc() { regOBD("PRODUCT_LABEL_PROD_STARTBIT"); return this; }

    protected ConditionValue _productLabelProdEndbit;
    public ConditionValue xdfgetProductLabelProdEndbit()
    { if (_productLabelProdEndbit == null) { _productLabelProdEndbit = nCV(); }
      return _productLabelProdEndbit; }
    protected ConditionValue xgetCValueProductLabelProdEndbit() { return xdfgetProductLabelProdEndbit(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelProdEndbit_Asc() { regOBA("PRODUCT_LABEL_PROD_ENDBIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ProductLabelProdEndbit_Desc() { regOBD("PRODUCT_LABEL_PROD_ENDBIT"); return this; }

    protected ConditionValue _boxSelectSkip;
    public ConditionValue xdfgetBoxSelectSkip()
    { if (_boxSelectSkip == null) { _boxSelectSkip = nCV(); }
      return _boxSelectSkip; }
    protected ConditionValue xgetCValueBoxSelectSkip() { return xdfgetBoxSelectSkip(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_BoxSelectSkip_Asc() { regOBA("BOX_SELECT_SKIP"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_BoxSelectSkip_Desc() { regOBD("BOX_SELECT_SKIP"); return this; }

    protected ConditionValue _defaultBoxId;
    public ConditionValue xdfgetDefaultBoxId()
    { if (_defaultBoxId == null) { _defaultBoxId = nCV(); }
      return _defaultBoxId; }
    protected ConditionValue xgetCValueDefaultBoxId() { return xdfgetDefaultBoxId(); }

    public Map<String, MBoxCQ> getDefaultBoxId_InScopeRelation_MBox() { return xgetSQueMap("defaultBoxId_InScopeRelation_MBox"); }
    public String keepDefaultBoxId_InScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("defaultBoxId_InScopeRelation_MBox", sq); }

    public Map<String, MBoxCQ> getDefaultBoxId_NotInScopeRelation_MBox() { return xgetSQueMap("defaultBoxId_NotInScopeRelation_MBox"); }
    public String keepDefaultBoxId_NotInScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("defaultBoxId_NotInScopeRelation_MBox", sq); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DefaultBoxId_Asc() { regOBA("DEFAULT_BOX_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DefaultBoxId_Desc() { regOBD("DEFAULT_BOX_ID"); return this; }

    protected ConditionValue _errorSoundPlayFlg;
    public ConditionValue xdfgetErrorSoundPlayFlg()
    { if (_errorSoundPlayFlg == null) { _errorSoundPlayFlg = nCV(); }
      return _errorSoundPlayFlg; }
    protected ConditionValue xgetCValueErrorSoundPlayFlg() { return xdfgetErrorSoundPlayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ErrorSoundPlayFlg_Asc() { regOBA("ERROR_SOUND_PLAY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ErrorSoundPlayFlg_Desc() { regOBD("ERROR_SOUND_PLAY_FLG"); return this; }

    protected ConditionValue _warnSoundPlayFlg;
    public ConditionValue xdfgetWarnSoundPlayFlg()
    { if (_warnSoundPlayFlg == null) { _warnSoundPlayFlg = nCV(); }
      return _warnSoundPlayFlg; }
    protected ConditionValue xgetCValueWarnSoundPlayFlg() { return xdfgetWarnSoundPlayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_WarnSoundPlayFlg_Asc() { regOBA("WARN_SOUND_PLAY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_WarnSoundPlayFlg_Desc() { regOBD("WARN_SOUND_PLAY_FLG"); return this; }

    protected ConditionValue _inspSoundPlayFlg;
    public ConditionValue xdfgetInspSoundPlayFlg()
    { if (_inspSoundPlayFlg == null) { _inspSoundPlayFlg = nCV(); }
      return _inspSoundPlayFlg; }
    protected ConditionValue xgetCValueInspSoundPlayFlg() { return xdfgetInspSoundPlayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_InspSoundPlayFlg_Asc() { regOBA("INSP_SOUND_PLAY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_InspSoundPlayFlg_Desc() { regOBD("INSP_SOUND_PLAY_FLG"); return this; }

    protected ConditionValue _inspCompSoundPlayFlg;
    public ConditionValue xdfgetInspCompSoundPlayFlg()
    { if (_inspCompSoundPlayFlg == null) { _inspCompSoundPlayFlg = nCV(); }
      return _inspCompSoundPlayFlg; }
    protected ConditionValue xgetCValueInspCompSoundPlayFlg() { return xdfgetInspCompSoundPlayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_InspCompSoundPlayFlg_Asc() { regOBA("INSP_COMP_SOUND_PLAY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_InspCompSoundPlayFlg_Desc() { regOBD("INSP_COMP_SOUND_PLAY_FLG"); return this; }

    protected ConditionValue _afterTagOutFlg;
    public ConditionValue xdfgetAfterTagOutFlg()
    { if (_afterTagOutFlg == null) { _afterTagOutFlg = nCV(); }
      return _afterTagOutFlg; }
    protected ConditionValue xgetCValueAfterTagOutFlg() { return xdfgetAfterTagOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AfterTagOutFlg_Asc() { regOBA("AFTER_TAG_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AfterTagOutFlg_Desc() { regOBD("AFTER_TAG_OUT_FLG"); return this; }

    protected ConditionValue _tagDeliveryOutFlg;
    public ConditionValue xdfgetTagDeliveryOutFlg()
    { if (_tagDeliveryOutFlg == null) { _tagDeliveryOutFlg = nCV(); }
      return _tagDeliveryOutFlg; }
    protected ConditionValue xgetCValueTagDeliveryOutFlg() { return xdfgetTagDeliveryOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_TagDeliveryOutFlg_Asc() { regOBA("TAG_DELIVERY_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_TagDeliveryOutFlg_Desc() { regOBD("TAG_DELIVERY_OUT_FLG"); return this; }

    protected ConditionValue _afterDelivSlipOutFlg;
    public ConditionValue xdfgetAfterDelivSlipOutFlg()
    { if (_afterDelivSlipOutFlg == null) { _afterDelivSlipOutFlg = nCV(); }
      return _afterDelivSlipOutFlg; }
    protected ConditionValue xgetCValueAfterDelivSlipOutFlg() { return xdfgetAfterDelivSlipOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AfterDelivSlipOutFlg_Asc() { regOBA("AFTER_DELIV_SLIP_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AfterDelivSlipOutFlg_Desc() { regOBD("AFTER_DELIV_SLIP_OUT_FLG"); return this; }

    protected ConditionValue _afterDelivSlipOutTgt;
    public ConditionValue xdfgetAfterDelivSlipOutTgt()
    { if (_afterDelivSlipOutTgt == null) { _afterDelivSlipOutTgt = nCV(); }
      return _afterDelivSlipOutTgt; }
    protected ConditionValue xgetCValueAfterDelivSlipOutTgt() { return xdfgetAfterDelivSlipOutTgt(); }

    /**
     * Add order-by as ascend. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AfterDelivSlipOutTgt_Asc() { regOBA("AFTER_DELIV_SLIP_OUT_TGT"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AfterDelivSlipOutTgt_Desc() { regOBD("AFTER_DELIV_SLIP_OUT_TGT"); return this; }

    protected ConditionValue _sglRowInspAfterOutCls;
    public ConditionValue xdfgetSglRowInspAfterOutCls()
    { if (_sglRowInspAfterOutCls == null) { _sglRowInspAfterOutCls = nCV(); }
      return _sglRowInspAfterOutCls; }
    protected ConditionValue xgetCValueSglRowInspAfterOutCls() { return xdfgetSglRowInspAfterOutCls(); }

    /**
     * Add order-by as ascend. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_SglRowInspAfterOutCls_Asc() { regOBA("SGL_ROW_INSP_AFTER_OUT_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_SglRowInspAfterOutCls_Desc() { regOBD("SGL_ROW_INSP_AFTER_OUT_CLS"); return this; }

    protected ConditionValue _htCharReadFlg;
    public ConditionValue xdfgetHtCharReadFlg()
    { if (_htCharReadFlg == null) { _htCharReadFlg = nCV(); }
      return _htCharReadFlg; }
    protected ConditionValue xgetCValueHtCharReadFlg() { return xdfgetHtCharReadFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HtCharReadFlg_Asc() { regOBA("HT_CHAR_READ_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HtCharReadFlg_Desc() { regOBD("HT_CHAR_READ_FLG"); return this; }

    protected ConditionValue _htLotInputType;
    public ConditionValue xdfgetHtLotInputType()
    { if (_htLotInputType == null) { _htLotInputType = nCV(); }
      return _htLotInputType; }
    protected ConditionValue xgetCValueHtLotInputType() { return xdfgetHtLotInputType(); }

    /**
     * Add order-by as ascend. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HtLotInputType_Asc() { regOBA("HT_LOT_INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HtLotInputType_Desc() { regOBD("HT_LOT_INPUT_TYPE"); return this; }

    protected ConditionValue _htSerialInputType;
    public ConditionValue xdfgetHtSerialInputType()
    { if (_htSerialInputType == null) { _htSerialInputType = nCV(); }
      return _htSerialInputType; }
    protected ConditionValue xgetCValueHtSerialInputType() { return xdfgetHtSerialInputType(); }

    /**
     * Add order-by as ascend. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HtSerialInputType_Asc() { regOBA("HT_SERIAL_INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_HtSerialInputType_Desc() { regOBD("HT_SERIAL_INPUT_TYPE"); return this; }

    protected ConditionValue _inspectionLabelOutFlg;
    public ConditionValue xdfgetInspectionLabelOutFlg()
    { if (_inspectionLabelOutFlg == null) { _inspectionLabelOutFlg = nCV(); }
      return _inspectionLabelOutFlg; }
    protected ConditionValue xgetCValueInspectionLabelOutFlg() { return xdfgetInspectionLabelOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_InspectionLabelOutFlg_Asc() { regOBA("INSPECTION_LABEL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_InspectionLabelOutFlg_Desc() { regOBD("INSPECTION_LABEL_OUT_FLG"); return this; }

    protected ConditionValue _autoShipInstFlg;
    public ConditionValue xdfgetAutoShipInstFlg()
    { if (_autoShipInstFlg == null) { _autoShipInstFlg = nCV(); }
      return _autoShipInstFlg; }
    protected ConditionValue xgetCValueAutoShipInstFlg() { return xdfgetAutoShipInstFlg(); }

    /**
     * Add order-by as ascend. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoShipInstFlg_Asc() { regOBA("AUTO_SHIP_INST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoShipInstFlg_Desc() { regOBD("AUTO_SHIP_INST_FLG"); return this; }

    protected ConditionValue _stockOutAutoInstFlg;
    public ConditionValue xdfgetStockOutAutoInstFlg()
    { if (_stockOutAutoInstFlg == null) { _stockOutAutoInstFlg = nCV(); }
      return _stockOutAutoInstFlg; }
    protected ConditionValue xgetCValueStockOutAutoInstFlg() { return xdfgetStockOutAutoInstFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutAutoInstFlg_Asc() { regOBA("STOCK_OUT_AUTO_INST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutAutoInstFlg_Desc() { regOBD("STOCK_OUT_AUTO_INST_FLG"); return this; }

    protected ConditionValue _autoEmgSetFlg;
    public ConditionValue xdfgetAutoEmgSetFlg()
    { if (_autoEmgSetFlg == null) { _autoEmgSetFlg = nCV(); }
      return _autoEmgSetFlg; }
    protected ConditionValue xgetCValueAutoEmgSetFlg() { return xdfgetAutoEmgSetFlg(); }

    /**
     * Add order-by as ascend. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoEmgSetFlg_Asc() { regOBA("AUTO_EMG_SET_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoEmgSetFlg_Desc() { regOBD("AUTO_EMG_SET_FLG"); return this; }

    protected ConditionValue _autoEmgSetTgt;
    public ConditionValue xdfgetAutoEmgSetTgt()
    { if (_autoEmgSetTgt == null) { _autoEmgSetTgt = nCV(); }
      return _autoEmgSetTgt; }
    protected ConditionValue xgetCValueAutoEmgSetTgt() { return xdfgetAutoEmgSetTgt(); }

    /**
     * Add order-by as ascend. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoEmgSetTgt_Asc() { regOBA("AUTO_EMG_SET_TGT"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoEmgSetTgt_Desc() { regOBD("AUTO_EMG_SET_TGT"); return this; }

    protected ConditionValue _autoEmgSetMinute;
    public ConditionValue xdfgetAutoEmgSetMinute()
    { if (_autoEmgSetMinute == null) { _autoEmgSetMinute = nCV(); }
      return _autoEmgSetMinute; }
    protected ConditionValue xgetCValueAutoEmgSetMinute() { return xdfgetAutoEmgSetMinute(); }

    /**
     * Add order-by as ascend. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoEmgSetMinute_Asc() { regOBA("AUTO_EMG_SET_MINUTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AutoEmgSetMinute_Desc() { regOBD("AUTO_EMG_SET_MINUTE"); return this; }

    protected ConditionValue _stockOutInstCxlFlg;
    public ConditionValue xdfgetStockOutInstCxlFlg()
    { if (_stockOutInstCxlFlg == null) { _stockOutInstCxlFlg = nCV(); }
      return _stockOutInstCxlFlg; }
    protected ConditionValue xgetCValueStockOutInstCxlFlg() { return xdfgetStockOutInstCxlFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutInstCxlFlg_Asc() { regOBA("STOCK_OUT_INST_CXL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutInstCxlFlg_Desc() { regOBD("STOCK_OUT_INST_CXL_FLG"); return this; }

    protected ConditionValue _stockOutAllocCls;
    public ConditionValue xdfgetStockOutAllocCls()
    { if (_stockOutAllocCls == null) { _stockOutAllocCls = nCV(); }
      return _stockOutAllocCls; }
    protected ConditionValue xgetCValueStockOutAllocCls() { return xdfgetStockOutAllocCls(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutAllocCls_Asc() { regOBA("STOCK_OUT_ALLOC_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutAllocCls_Desc() { regOBD("STOCK_OUT_ALLOC_CLS"); return this; }

    protected ConditionValue _stockOutInstSplitFlg;
    public ConditionValue xdfgetStockOutInstSplitFlg()
    { if (_stockOutInstSplitFlg == null) { _stockOutInstSplitFlg = nCV(); }
      return _stockOutInstSplitFlg; }
    protected ConditionValue xgetCValueStockOutInstSplitFlg() { return xdfgetStockOutInstSplitFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutInstSplitFlg_Asc() { regOBA("STOCK_OUT_INST_SPLIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_StockOutInstSplitFlg_Desc() { regOBD("STOCK_OUT_INST_SPLIT_FLG"); return this; }

    protected ConditionValue _cesIntegrationFlg;
    public ConditionValue xdfgetCesIntegrationFlg()
    { if (_cesIntegrationFlg == null) { _cesIntegrationFlg = nCV(); }
      return _cesIntegrationFlg; }
    protected ConditionValue xgetCValueCesIntegrationFlg() { return xdfgetCesIntegrationFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_CesIntegrationFlg_Asc() { regOBA("CES_INTEGRATION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_CesIntegrationFlg_Desc() { regOBD("CES_INTEGRATION_FLG"); return this; }

    protected ConditionValue _packingSlipAutoOutputFlg;
    public ConditionValue xdfgetPackingSlipAutoOutputFlg()
    { if (_packingSlipAutoOutputFlg == null) { _packingSlipAutoOutputFlg = nCV(); }
      return _packingSlipAutoOutputFlg; }
    protected ConditionValue xgetCValuePackingSlipAutoOutputFlg() { return xdfgetPackingSlipAutoOutputFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingSlipAutoOutputFlg_Asc() { regOBA("PACKING_SLIP_AUTO_OUTPUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_PackingSlipAutoOutputFlg_Desc() { regOBD("PACKING_SLIP_AUTO_OUTPUT_FLG"); return this; }

    protected ConditionValue _centerKbn;
    public ConditionValue xdfgetCenterKbn()
    { if (_centerKbn == null) { _centerKbn = nCV(); }
      return _centerKbn; }
    protected ConditionValue xgetCValueCenterKbn() { return xdfgetCenterKbn(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_CenterKbn_Asc() { regOBA("CENTER_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_CenterKbn_Desc() { regOBD("CENTER_KBN"); return this; }

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
    public BsMParamCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMParamCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMParamCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMParamCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMParamCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMParamCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMParamCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMParamCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMParamCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMParamCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMParamCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMParamCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MParamCQ bq = (MParamCQ)bqs;
        MParamCQ uq = (MParamCQ)uqs;
        if (bq.hasConditionQueryMClientCenter()) {
            uq.queryMClientCenter().reflectRelationOnUnionQuery(bq.queryMClientCenter(), uq.queryMClientCenter());
        }
        if (bq.hasConditionQueryMBox()) {
            uq.queryMBox().reflectRelationOnUnionQuery(bq.queryMBox(), uq.queryMBox());
        }
        if (bq.hasConditionQueryMDeliveryCourse()) {
            uq.queryMDeliveryCourse().reflectRelationOnUnionQuery(bq.queryMDeliveryCourse(), uq.queryMDeliveryCourse());
        }
        if (bq.hasConditionQueryMZone()) {
            uq.queryMZone().reflectRelationOnUnionQuery(bq.queryMZone(), uq.queryMZone());
        }
        if (bq.hasConditionQueryMBoxGrp()) {
            uq.queryMBoxGrp().reflectRelationOnUnionQuery(bq.queryMBoxGrp(), uq.queryMBoxGrp());
        }
        if (bq.hasConditionQueryBClassDtlByAfterTagOutFlg()) {
            uq.queryBClassDtlByAfterTagOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAfterTagOutFlg(), uq.queryBClassDtlByAfterTagOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByAfterDelivSlipOutFlg()) {
            uq.queryBClassDtlByAfterDelivSlipOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAfterDelivSlipOutFlg(), uq.queryBClassDtlByAfterDelivSlipOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByAfterDelivSlipOutTgt()) {
            uq.queryBClassDtlByAfterDelivSlipOutTgt().reflectRelationOnUnionQuery(bq.queryBClassDtlByAfterDelivSlipOutTgt(), uq.queryBClassDtlByAfterDelivSlipOutTgt());
        }
        if (bq.hasConditionQueryBClassDtlBySglRowInspAfterOutCls()) {
            uq.queryBClassDtlBySglRowInspAfterOutCls().reflectRelationOnUnionQuery(bq.queryBClassDtlBySglRowInspAfterOutCls(), uq.queryBClassDtlBySglRowInspAfterOutCls());
        }
        if (bq.hasConditionQueryBClassDtlByBoxSelectSkip()) {
            uq.queryBClassDtlByBoxSelectSkip().reflectRelationOnUnionQuery(bq.queryBClassDtlByBoxSelectSkip(), uq.queryBClassDtlByBoxSelectSkip());
        }
        if (bq.hasConditionQueryBClassDtlByCasePicFlg()) {
            uq.queryBClassDtlByCasePicFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCasePicFlg(), uq.queryBClassDtlByCasePicFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByHtCharReadFlg()) {
            uq.queryBClassDtlByHtCharReadFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByHtCharReadFlg(), uq.queryBClassDtlByHtCharReadFlg());
        }
        if (bq.hasConditionQueryBClassDtlByMergeCls()) {
            uq.queryBClassDtlByMergeCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByMergeCls(), uq.queryBClassDtlByMergeCls());
        }
        if (bq.hasConditionQueryBClassDtlByMultiPicCls()) {
            uq.queryBClassDtlByMultiPicCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByMultiPicCls(), uq.queryBClassDtlByMultiPicCls());
        }
        if (bq.hasConditionQueryBClassDtlByOverStoreNumFlg()) {
            uq.queryBClassDtlByOverStoreNumFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByOverStoreNumFlg(), uq.queryBClassDtlByOverStoreNumFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPackingCalCls()) {
            uq.queryBClassDtlByPackingCalCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingCalCls(), uq.queryBClassDtlByPackingCalCls());
        }
        if (bq.hasConditionQueryBClassDtlByPackingProcessCls()) {
            uq.queryBClassDtlByPackingProcessCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingProcessCls(), uq.queryBClassDtlByPackingProcessCls());
        }
        if (bq.hasConditionQueryBClassDtlByPastStoreDtFlg()) {
            uq.queryBClassDtlByPastStoreDtFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPastStoreDtFlg(), uq.queryBClassDtlByPastStoreDtFlg());
        }
        if (bq.hasConditionQueryBClassDtlByProductLabelJanBarcode()) {
            uq.queryBClassDtlByProductLabelJanBarcode().reflectRelationOnUnionQuery(bq.queryBClassDtlByProductLabelJanBarcode(), uq.queryBClassDtlByProductLabelJanBarcode());
        }
        if (bq.hasConditionQueryBClassDtlByProductLabelOutUnit()) {
            uq.queryBClassDtlByProductLabelOutUnit().reflectRelationOnUnionQuery(bq.queryBClassDtlByProductLabelOutUnit(), uq.queryBClassDtlByProductLabelOutUnit());
        }
        if (bq.hasConditionQueryBClassDtlByProductLabelProdBarcode()) {
            uq.queryBClassDtlByProductLabelProdBarcode().reflectRelationOnUnionQuery(bq.queryBClassDtlByProductLabelProdBarcode(), uq.queryBClassDtlByProductLabelProdBarcode());
        }
        if (bq.hasConditionQueryBClassDtlByProductPartPacking()) {
            uq.queryBClassDtlByProductPartPacking().reflectRelationOnUnionQuery(bq.queryBClassDtlByProductPartPacking(), uq.queryBClassDtlByProductPartPacking());
        }
        if (bq.hasConditionQueryBClassDtlByDecimalProductPacking()) {
            uq.queryBClassDtlByDecimalProductPacking().reflectRelationOnUnionQuery(bq.queryBClassDtlByDecimalProductPacking(), uq.queryBClassDtlByDecimalProductPacking());
        }
        if (bq.hasConditionQueryBClassDtlByEmReplenishAllocCls()) {
            uq.queryBClassDtlByEmReplenishAllocCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByEmReplenishAllocCls(), uq.queryBClassDtlByEmReplenishAllocCls());
        }
        if (bq.hasConditionQueryBClassDtlByRgReplenishUnitCls()) {
            uq.queryBClassDtlByRgReplenishUnitCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByRgReplenishUnitCls(), uq.queryBClassDtlByRgReplenishUnitCls());
        }
        if (bq.hasConditionQueryBClassDtlByEmReplenishUnitCls()) {
            uq.queryBClassDtlByEmReplenishUnitCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByEmReplenishUnitCls(), uq.queryBClassDtlByEmReplenishUnitCls());
        }
        if (bq.hasConditionQueryBClassDtlByResultAfterProductLabel()) {
            uq.queryBClassDtlByResultAfterProductLabel().reflectRelationOnUnionQuery(bq.queryBClassDtlByResultAfterProductLabel(), uq.queryBClassDtlByResultAfterProductLabel());
        }
        if (bq.hasConditionQueryBClassDtlByResultAfterProductTarget()) {
            uq.queryBClassDtlByResultAfterProductTarget().reflectRelationOnUnionQuery(bq.queryBClassDtlByResultAfterProductTarget(), uq.queryBClassDtlByResultAfterProductTarget());
        }
        if (bq.hasConditionQueryBClassDtlByStoreDtFlg()) {
            uq.queryBClassDtlByStoreDtFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStoreDtFlg(), uq.queryBClassDtlByStoreDtFlg());
        }
        if (bq.hasConditionQueryBClassDtlByStoreNoFlg()) {
            uq.queryBClassDtlByStoreNoFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStoreNoFlg(), uq.queryBClassDtlByStoreNoFlg());
        }
        if (bq.hasConditionQueryBClassDtlByTagDeliveryOutFlg()) {
            uq.queryBClassDtlByTagDeliveryOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByTagDeliveryOutFlg(), uq.queryBClassDtlByTagDeliveryOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByUseHtShipFlg()) {
            uq.queryBClassDtlByUseHtShipFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByUseHtShipFlg(), uq.queryBClassDtlByUseHtShipFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInspectionLabelOutFlg()) {
            uq.queryBClassDtlByInspectionLabelOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInspectionLabelOutFlg(), uq.queryBClassDtlByInspectionLabelOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySglRowPicFlg()) {
            uq.queryBClassDtlBySglRowPicFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySglRowPicFlg(), uq.queryBClassDtlBySglRowPicFlg());
        }
        if (bq.hasConditionQueryBClassDtlByTotalPicFlg()) {
            uq.queryBClassDtlByTotalPicFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByTotalPicFlg(), uq.queryBClassDtlByTotalPicFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPicMthdRcmdFlg()) {
            uq.queryBClassDtlByPicMthdRcmdFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPicMthdRcmdFlg(), uq.queryBClassDtlByPicMthdRcmdFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPicMthdRcmdBreakKey()) {
            uq.queryBClassDtlByPicMthdRcmdBreakKey().reflectRelationOnUnionQuery(bq.queryBClassDtlByPicMthdRcmdBreakKey(), uq.queryBClassDtlByPicMthdRcmdBreakKey());
        }
        if (bq.hasConditionQueryBClassDtlByAutoShipInstFlg()) {
            uq.queryBClassDtlByAutoShipInstFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAutoShipInstFlg(), uq.queryBClassDtlByAutoShipInstFlg());
        }
        if (bq.hasConditionQueryBClassDtlByStockOutAutoInstFlg()) {
            uq.queryBClassDtlByStockOutAutoInstFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockOutAutoInstFlg(), uq.queryBClassDtlByStockOutAutoInstFlg());
        }
        if (bq.hasConditionQueryBClassDtlByAutoEmgSetFlg()) {
            uq.queryBClassDtlByAutoEmgSetFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAutoEmgSetFlg(), uq.queryBClassDtlByAutoEmgSetFlg());
        }
        if (bq.hasConditionQueryBClassDtlByAutoEmgSetTgt()) {
            uq.queryBClassDtlByAutoEmgSetTgt().reflectRelationOnUnionQuery(bq.queryBClassDtlByAutoEmgSetTgt(), uq.queryBClassDtlByAutoEmgSetTgt());
        }
        if (bq.hasConditionQueryBClassDtlByStockOutAllocCls()) {
            uq.queryBClassDtlByStockOutAllocCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockOutAllocCls(), uq.queryBClassDtlByStockOutAllocCls());
        }
        if (bq.hasConditionQueryBClassDtlByStockOutInstCxlFlg()) {
            uq.queryBClassDtlByStockOutInstCxlFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockOutInstCxlFlg(), uq.queryBClassDtlByStockOutInstCxlFlg());
        }
        if (bq.hasConditionQueryBClassDtlByStockOutInstSplitFlg()) {
            uq.queryBClassDtlByStockOutInstSplitFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockOutInstSplitFlg(), uq.queryBClassDtlByStockOutInstSplitFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPicMthdRcmdMltPlOut()) {
            uq.queryBClassDtlByPicMthdRcmdMltPlOut().reflectRelationOnUnionQuery(bq.queryBClassDtlByPicMthdRcmdMltPlOut(), uq.queryBClassDtlByPicMthdRcmdMltPlOut());
        }
        if (bq.hasConditionQueryBClassDtlByPicMthdRcmdSplSlOut()) {
            uq.queryBClassDtlByPicMthdRcmdSplSlOut().reflectRelationOnUnionQuery(bq.queryBClassDtlByPicMthdRcmdSplSlOut(), uq.queryBClassDtlByPicMthdRcmdSplSlOut());
        }
        if (bq.hasConditionQueryBClassDtlByErrorSoundPlayFlg()) {
            uq.queryBClassDtlByErrorSoundPlayFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorSoundPlayFlg(), uq.queryBClassDtlByErrorSoundPlayFlg());
        }
        if (bq.hasConditionQueryBClassDtlByWarnSoundPlayFlg()) {
            uq.queryBClassDtlByWarnSoundPlayFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByWarnSoundPlayFlg(), uq.queryBClassDtlByWarnSoundPlayFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInspSoundPlayFlg()) {
            uq.queryBClassDtlByInspSoundPlayFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInspSoundPlayFlg(), uq.queryBClassDtlByInspSoundPlayFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInspCompSoundPlayFlg()) {
            uq.queryBClassDtlByInspCompSoundPlayFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInspCompSoundPlayFlg(), uq.queryBClassDtlByInspCompSoundPlayFlg());
        }
        if (bq.hasConditionQueryBClassDtlByCesIntegrationFlg()) {
            uq.queryBClassDtlByCesIntegrationFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCesIntegrationFlg(), uq.queryBClassDtlByCesIntegrationFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPackingSlipAutoOutputFlg()) {
            uq.queryBClassDtlByPackingSlipAutoOutputFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingSlipAutoOutputFlg(), uq.queryBClassDtlByPackingSlipAutoOutputFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCenterCQ queryMClientCenter() {
        return xdfgetConditionQueryMClientCenter();
    }
    public MClientCenterCQ xdfgetConditionQueryMClientCenter() {
        String prop = "mClientCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClientCenter()); xsetupOuterJoinMClientCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCenterCQ xcreateQueryMClientCenter() {
        String nrp = xresolveNRP("M_PARAM", "mClientCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClientCenter", nrp);
    }
    protected void xsetupOuterJoinMClientCenter() { xregOutJo("mClientCenter"); }
    public boolean hasConditionQueryMClientCenter() { return xhasQueRlMap("mClientCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * @return The instance of condition-query. (NotNull)
     */
    public MBoxCQ queryMBox() {
        return xdfgetConditionQueryMBox();
    }
    public MBoxCQ xdfgetConditionQueryMBox() {
        String prop = "mBox";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMBox()); xsetupOuterJoinMBox(); }
        return xgetQueRlMap(prop);
    }
    protected MBoxCQ xcreateQueryMBox() {
        String nrp = xresolveNRP("M_PARAM", "mBox"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MBoxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mBox", nrp);
    }
    protected void xsetupOuterJoinMBox() { xregOutJo("mBox"); }
    public boolean hasConditionQueryMBox() { return xhasQueRlMap("mBox"); }

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
        String nrp = xresolveNRP("M_PARAM", "mDeliveryCourse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MDeliveryCourseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mDeliveryCourse", nrp);
    }
    protected void xsetupOuterJoinMDeliveryCourse() { xregOutJo("mDeliveryCourse"); }
    public boolean hasConditionQueryMDeliveryCourse() { return xhasQueRlMap("mDeliveryCourse"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZoneCQ queryMZone() {
        return xdfgetConditionQueryMZone();
    }
    public MZoneCQ xdfgetConditionQueryMZone() {
        String prop = "mZone";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZone()); xsetupOuterJoinMZone(); }
        return xgetQueRlMap(prop);
    }
    protected MZoneCQ xcreateQueryMZone() {
        String nrp = xresolveNRP("M_PARAM", "mZone"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZoneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZone", nrp);
    }
    protected void xsetupOuterJoinMZone() { xregOutJo("mZone"); }
    public boolean hasConditionQueryMZone() { return xhasQueRlMap("mZone"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public MBoxGrpCQ queryMBoxGrp() {
        return xdfgetConditionQueryMBoxGrp();
    }
    public MBoxGrpCQ xdfgetConditionQueryMBoxGrp() {
        String prop = "mBoxGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMBoxGrp()); xsetupOuterJoinMBoxGrp(); }
        return xgetQueRlMap(prop);
    }
    protected MBoxGrpCQ xcreateQueryMBoxGrp() {
        String nrp = xresolveNRP("M_PARAM", "mBoxGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MBoxGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mBoxGrp", nrp);
    }
    protected void xsetupOuterJoinMBoxGrp() { xregOutJo("mBoxGrp"); }
    public boolean hasConditionQueryMBoxGrp() { return xhasQueRlMap("mBoxGrp"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAfterTagOutFlg() {
        return xdfgetConditionQueryBClassDtlByAfterTagOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAfterTagOutFlg() {
        String prop = "bClassDtlByAfterTagOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAfterTagOutFlg()); xsetupOuterJoinBClassDtlByAfterTagOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAfterTagOutFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByAfterTagOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAfterTagOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAfterTagOutFlg() { xregOutJo("bClassDtlByAfterTagOutFlg"); }
    public boolean hasConditionQueryBClassDtlByAfterTagOutFlg() { return xhasQueRlMap("bClassDtlByAfterTagOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAfterDelivSlipOutFlg() {
        return xdfgetConditionQueryBClassDtlByAfterDelivSlipOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAfterDelivSlipOutFlg() {
        String prop = "bClassDtlByAfterDelivSlipOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAfterDelivSlipOutFlg()); xsetupOuterJoinBClassDtlByAfterDelivSlipOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAfterDelivSlipOutFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByAfterDelivSlipOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAfterDelivSlipOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAfterDelivSlipOutFlg() { xregOutJo("bClassDtlByAfterDelivSlipOutFlg"); }
    public boolean hasConditionQueryBClassDtlByAfterDelivSlipOutFlg() { return xhasQueRlMap("bClassDtlByAfterDelivSlipOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAfterDelivSlipOutTgt() {
        return xdfgetConditionQueryBClassDtlByAfterDelivSlipOutTgt();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAfterDelivSlipOutTgt() {
        String prop = "bClassDtlByAfterDelivSlipOutTgt";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAfterDelivSlipOutTgt()); xsetupOuterJoinBClassDtlByAfterDelivSlipOutTgt(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAfterDelivSlipOutTgt() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByAfterDelivSlipOutTgt"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAfterDelivSlipOutTgt", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAfterDelivSlipOutTgt() { xregOutJo("bClassDtlByAfterDelivSlipOutTgt"); }
    public boolean hasConditionQueryBClassDtlByAfterDelivSlipOutTgt() { return xhasQueRlMap("bClassDtlByAfterDelivSlipOutTgt"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySglRowInspAfterOutCls() {
        return xdfgetConditionQueryBClassDtlBySglRowInspAfterOutCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySglRowInspAfterOutCls() {
        String prop = "bClassDtlBySglRowInspAfterOutCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySglRowInspAfterOutCls()); xsetupOuterJoinBClassDtlBySglRowInspAfterOutCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySglRowInspAfterOutCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlBySglRowInspAfterOutCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySglRowInspAfterOutCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySglRowInspAfterOutCls() { xregOutJo("bClassDtlBySglRowInspAfterOutCls"); }
    public boolean hasConditionQueryBClassDtlBySglRowInspAfterOutCls() { return xhasQueRlMap("bClassDtlBySglRowInspAfterOutCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByBoxSelectSkip() {
        return xdfgetConditionQueryBClassDtlByBoxSelectSkip();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByBoxSelectSkip() {
        String prop = "bClassDtlByBoxSelectSkip";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByBoxSelectSkip()); xsetupOuterJoinBClassDtlByBoxSelectSkip(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByBoxSelectSkip() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByBoxSelectSkip"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByBoxSelectSkip", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByBoxSelectSkip() { xregOutJo("bClassDtlByBoxSelectSkip"); }
    public boolean hasConditionQueryBClassDtlByBoxSelectSkip() { return xhasQueRlMap("bClassDtlByBoxSelectSkip"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCasePicFlg() {
        return xdfgetConditionQueryBClassDtlByCasePicFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCasePicFlg() {
        String prop = "bClassDtlByCasePicFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCasePicFlg()); xsetupOuterJoinBClassDtlByCasePicFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCasePicFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByCasePicFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCasePicFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCasePicFlg() { xregOutJo("bClassDtlByCasePicFlg"); }
    public boolean hasConditionQueryBClassDtlByCasePicFlg() { return xhasQueRlMap("bClassDtlByCasePicFlg"); }

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
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByHtCharReadFlg() {
        return xdfgetConditionQueryBClassDtlByHtCharReadFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByHtCharReadFlg() {
        String prop = "bClassDtlByHtCharReadFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByHtCharReadFlg()); xsetupOuterJoinBClassDtlByHtCharReadFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByHtCharReadFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByHtCharReadFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByHtCharReadFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByHtCharReadFlg() { xregOutJo("bClassDtlByHtCharReadFlg"); }
    public boolean hasConditionQueryBClassDtlByHtCharReadFlg() { return xhasQueRlMap("bClassDtlByHtCharReadFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMergeCls() {
        return xdfgetConditionQueryBClassDtlByMergeCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMergeCls() {
        String prop = "bClassDtlByMergeCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMergeCls()); xsetupOuterJoinBClassDtlByMergeCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMergeCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByMergeCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMergeCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMergeCls() { xregOutJo("bClassDtlByMergeCls"); }
    public boolean hasConditionQueryBClassDtlByMergeCls() { return xhasQueRlMap("bClassDtlByMergeCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMultiPicCls() {
        return xdfgetConditionQueryBClassDtlByMultiPicCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMultiPicCls() {
        String prop = "bClassDtlByMultiPicCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMultiPicCls()); xsetupOuterJoinBClassDtlByMultiPicCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMultiPicCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByMultiPicCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMultiPicCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMultiPicCls() { xregOutJo("bClassDtlByMultiPicCls"); }
    public boolean hasConditionQueryBClassDtlByMultiPicCls() { return xhasQueRlMap("bClassDtlByMultiPicCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByOverStoreNumFlg() {
        return xdfgetConditionQueryBClassDtlByOverStoreNumFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByOverStoreNumFlg() {
        String prop = "bClassDtlByOverStoreNumFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByOverStoreNumFlg()); xsetupOuterJoinBClassDtlByOverStoreNumFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByOverStoreNumFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByOverStoreNumFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByOverStoreNumFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByOverStoreNumFlg() { xregOutJo("bClassDtlByOverStoreNumFlg"); }
    public boolean hasConditionQueryBClassDtlByOverStoreNumFlg() { return xhasQueRlMap("bClassDtlByOverStoreNumFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPackingCalCls() {
        return xdfgetConditionQueryBClassDtlByPackingCalCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPackingCalCls() {
        String prop = "bClassDtlByPackingCalCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPackingCalCls()); xsetupOuterJoinBClassDtlByPackingCalCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPackingCalCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPackingCalCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingCalCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingCalCls() { xregOutJo("bClassDtlByPackingCalCls"); }
    public boolean hasConditionQueryBClassDtlByPackingCalCls() { return xhasQueRlMap("bClassDtlByPackingCalCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPackingProcessCls() {
        return xdfgetConditionQueryBClassDtlByPackingProcessCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPackingProcessCls() {
        String prop = "bClassDtlByPackingProcessCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPackingProcessCls()); xsetupOuterJoinBClassDtlByPackingProcessCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPackingProcessCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPackingProcessCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingProcessCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingProcessCls() { xregOutJo("bClassDtlByPackingProcessCls"); }
    public boolean hasConditionQueryBClassDtlByPackingProcessCls() { return xhasQueRlMap("bClassDtlByPackingProcessCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPastStoreDtFlg() {
        return xdfgetConditionQueryBClassDtlByPastStoreDtFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPastStoreDtFlg() {
        String prop = "bClassDtlByPastStoreDtFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPastStoreDtFlg()); xsetupOuterJoinBClassDtlByPastStoreDtFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPastStoreDtFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPastStoreDtFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPastStoreDtFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPastStoreDtFlg() { xregOutJo("bClassDtlByPastStoreDtFlg"); }
    public boolean hasConditionQueryBClassDtlByPastStoreDtFlg() { return xhasQueRlMap("bClassDtlByPastStoreDtFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByProductLabelJanBarcode() {
        return xdfgetConditionQueryBClassDtlByProductLabelJanBarcode();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByProductLabelJanBarcode() {
        String prop = "bClassDtlByProductLabelJanBarcode";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByProductLabelJanBarcode()); xsetupOuterJoinBClassDtlByProductLabelJanBarcode(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByProductLabelJanBarcode() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByProductLabelJanBarcode"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByProductLabelJanBarcode", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByProductLabelJanBarcode() { xregOutJo("bClassDtlByProductLabelJanBarcode"); }
    public boolean hasConditionQueryBClassDtlByProductLabelJanBarcode() { return xhasQueRlMap("bClassDtlByProductLabelJanBarcode"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByProductLabelOutUnit() {
        return xdfgetConditionQueryBClassDtlByProductLabelOutUnit();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByProductLabelOutUnit() {
        String prop = "bClassDtlByProductLabelOutUnit";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByProductLabelOutUnit()); xsetupOuterJoinBClassDtlByProductLabelOutUnit(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByProductLabelOutUnit() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByProductLabelOutUnit"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByProductLabelOutUnit", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByProductLabelOutUnit() { xregOutJo("bClassDtlByProductLabelOutUnit"); }
    public boolean hasConditionQueryBClassDtlByProductLabelOutUnit() { return xhasQueRlMap("bClassDtlByProductLabelOutUnit"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByProductLabelProdBarcode() {
        return xdfgetConditionQueryBClassDtlByProductLabelProdBarcode();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByProductLabelProdBarcode() {
        String prop = "bClassDtlByProductLabelProdBarcode";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByProductLabelProdBarcode()); xsetupOuterJoinBClassDtlByProductLabelProdBarcode(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByProductLabelProdBarcode() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByProductLabelProdBarcode"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByProductLabelProdBarcode", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByProductLabelProdBarcode() { xregOutJo("bClassDtlByProductLabelProdBarcode"); }
    public boolean hasConditionQueryBClassDtlByProductLabelProdBarcode() { return xhasQueRlMap("bClassDtlByProductLabelProdBarcode"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByProductPartPacking() {
        return xdfgetConditionQueryBClassDtlByProductPartPacking();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByProductPartPacking() {
        String prop = "bClassDtlByProductPartPacking";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByProductPartPacking()); xsetupOuterJoinBClassDtlByProductPartPacking(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByProductPartPacking() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByProductPartPacking"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByProductPartPacking", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByProductPartPacking() { xregOutJo("bClassDtlByProductPartPacking"); }
    public boolean hasConditionQueryBClassDtlByProductPartPacking() { return xhasQueRlMap("bClassDtlByProductPartPacking"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDecimalProductPacking() {
        return xdfgetConditionQueryBClassDtlByDecimalProductPacking();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDecimalProductPacking() {
        String prop = "bClassDtlByDecimalProductPacking";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDecimalProductPacking()); xsetupOuterJoinBClassDtlByDecimalProductPacking(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDecimalProductPacking() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByDecimalProductPacking"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDecimalProductPacking", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDecimalProductPacking() { xregOutJo("bClassDtlByDecimalProductPacking"); }
    public boolean hasConditionQueryBClassDtlByDecimalProductPacking() { return xhasQueRlMap("bClassDtlByDecimalProductPacking"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEmReplenishAllocCls() {
        return xdfgetConditionQueryBClassDtlByEmReplenishAllocCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEmReplenishAllocCls() {
        String prop = "bClassDtlByEmReplenishAllocCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEmReplenishAllocCls()); xsetupOuterJoinBClassDtlByEmReplenishAllocCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEmReplenishAllocCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByEmReplenishAllocCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEmReplenishAllocCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEmReplenishAllocCls() { xregOutJo("bClassDtlByEmReplenishAllocCls"); }
    public boolean hasConditionQueryBClassDtlByEmReplenishAllocCls() { return xhasQueRlMap("bClassDtlByEmReplenishAllocCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByRgReplenishUnitCls() {
        return xdfgetConditionQueryBClassDtlByRgReplenishUnitCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByRgReplenishUnitCls() {
        String prop = "bClassDtlByRgReplenishUnitCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByRgReplenishUnitCls()); xsetupOuterJoinBClassDtlByRgReplenishUnitCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByRgReplenishUnitCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByRgReplenishUnitCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByRgReplenishUnitCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByRgReplenishUnitCls() { xregOutJo("bClassDtlByRgReplenishUnitCls"); }
    public boolean hasConditionQueryBClassDtlByRgReplenishUnitCls() { return xhasQueRlMap("bClassDtlByRgReplenishUnitCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEmReplenishUnitCls() {
        return xdfgetConditionQueryBClassDtlByEmReplenishUnitCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEmReplenishUnitCls() {
        String prop = "bClassDtlByEmReplenishUnitCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEmReplenishUnitCls()); xsetupOuterJoinBClassDtlByEmReplenishUnitCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEmReplenishUnitCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByEmReplenishUnitCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEmReplenishUnitCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEmReplenishUnitCls() { xregOutJo("bClassDtlByEmReplenishUnitCls"); }
    public boolean hasConditionQueryBClassDtlByEmReplenishUnitCls() { return xhasQueRlMap("bClassDtlByEmReplenishUnitCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByResultAfterProductLabel() {
        return xdfgetConditionQueryBClassDtlByResultAfterProductLabel();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByResultAfterProductLabel() {
        String prop = "bClassDtlByResultAfterProductLabel";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByResultAfterProductLabel()); xsetupOuterJoinBClassDtlByResultAfterProductLabel(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByResultAfterProductLabel() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByResultAfterProductLabel"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByResultAfterProductLabel", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByResultAfterProductLabel() { xregOutJo("bClassDtlByResultAfterProductLabel"); }
    public boolean hasConditionQueryBClassDtlByResultAfterProductLabel() { return xhasQueRlMap("bClassDtlByResultAfterProductLabel"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByResultAfterProductTarget() {
        return xdfgetConditionQueryBClassDtlByResultAfterProductTarget();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByResultAfterProductTarget() {
        String prop = "bClassDtlByResultAfterProductTarget";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByResultAfterProductTarget()); xsetupOuterJoinBClassDtlByResultAfterProductTarget(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByResultAfterProductTarget() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByResultAfterProductTarget"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByResultAfterProductTarget", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByResultAfterProductTarget() { xregOutJo("bClassDtlByResultAfterProductTarget"); }
    public boolean hasConditionQueryBClassDtlByResultAfterProductTarget() { return xhasQueRlMap("bClassDtlByResultAfterProductTarget"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStoreDtFlg() {
        return xdfgetConditionQueryBClassDtlByStoreDtFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStoreDtFlg() {
        String prop = "bClassDtlByStoreDtFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStoreDtFlg()); xsetupOuterJoinBClassDtlByStoreDtFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStoreDtFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByStoreDtFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStoreDtFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStoreDtFlg() { xregOutJo("bClassDtlByStoreDtFlg"); }
    public boolean hasConditionQueryBClassDtlByStoreDtFlg() { return xhasQueRlMap("bClassDtlByStoreDtFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStoreNoFlg() {
        return xdfgetConditionQueryBClassDtlByStoreNoFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStoreNoFlg() {
        String prop = "bClassDtlByStoreNoFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStoreNoFlg()); xsetupOuterJoinBClassDtlByStoreNoFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStoreNoFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByStoreNoFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStoreNoFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStoreNoFlg() { xregOutJo("bClassDtlByStoreNoFlg"); }
    public boolean hasConditionQueryBClassDtlByStoreNoFlg() { return xhasQueRlMap("bClassDtlByStoreNoFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTagDeliveryOutFlg() {
        return xdfgetConditionQueryBClassDtlByTagDeliveryOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTagDeliveryOutFlg() {
        String prop = "bClassDtlByTagDeliveryOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTagDeliveryOutFlg()); xsetupOuterJoinBClassDtlByTagDeliveryOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTagDeliveryOutFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByTagDeliveryOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTagDeliveryOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTagDeliveryOutFlg() { xregOutJo("bClassDtlByTagDeliveryOutFlg"); }
    public boolean hasConditionQueryBClassDtlByTagDeliveryOutFlg() { return xhasQueRlMap("bClassDtlByTagDeliveryOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByUseHtShipFlg() {
        return xdfgetConditionQueryBClassDtlByUseHtShipFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByUseHtShipFlg() {
        String prop = "bClassDtlByUseHtShipFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByUseHtShipFlg()); xsetupOuterJoinBClassDtlByUseHtShipFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByUseHtShipFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByUseHtShipFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByUseHtShipFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByUseHtShipFlg() { xregOutJo("bClassDtlByUseHtShipFlg"); }
    public boolean hasConditionQueryBClassDtlByUseHtShipFlg() { return xhasQueRlMap("bClassDtlByUseHtShipFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInspectionLabelOutFlg() {
        return xdfgetConditionQueryBClassDtlByInspectionLabelOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInspectionLabelOutFlg() {
        String prop = "bClassDtlByInspectionLabelOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInspectionLabelOutFlg()); xsetupOuterJoinBClassDtlByInspectionLabelOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInspectionLabelOutFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByInspectionLabelOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInspectionLabelOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInspectionLabelOutFlg() { xregOutJo("bClassDtlByInspectionLabelOutFlg"); }
    public boolean hasConditionQueryBClassDtlByInspectionLabelOutFlg() { return xhasQueRlMap("bClassDtlByInspectionLabelOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySglRowPicFlg() {
        return xdfgetConditionQueryBClassDtlBySglRowPicFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySglRowPicFlg() {
        String prop = "bClassDtlBySglRowPicFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySglRowPicFlg()); xsetupOuterJoinBClassDtlBySglRowPicFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySglRowPicFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlBySglRowPicFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySglRowPicFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySglRowPicFlg() { xregOutJo("bClassDtlBySglRowPicFlg"); }
    public boolean hasConditionQueryBClassDtlBySglRowPicFlg() { return xhasQueRlMap("bClassDtlBySglRowPicFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTotalPicFlg() {
        return xdfgetConditionQueryBClassDtlByTotalPicFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTotalPicFlg() {
        String prop = "bClassDtlByTotalPicFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTotalPicFlg()); xsetupOuterJoinBClassDtlByTotalPicFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTotalPicFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByTotalPicFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTotalPicFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTotalPicFlg() { xregOutJo("bClassDtlByTotalPicFlg"); }
    public boolean hasConditionQueryBClassDtlByTotalPicFlg() { return xhasQueRlMap("bClassDtlByTotalPicFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPicMthdRcmdFlg() {
        return xdfgetConditionQueryBClassDtlByPicMthdRcmdFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPicMthdRcmdFlg() {
        String prop = "bClassDtlByPicMthdRcmdFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPicMthdRcmdFlg()); xsetupOuterJoinBClassDtlByPicMthdRcmdFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPicMthdRcmdFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPicMthdRcmdFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPicMthdRcmdFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPicMthdRcmdFlg() { xregOutJo("bClassDtlByPicMthdRcmdFlg"); }
    public boolean hasConditionQueryBClassDtlByPicMthdRcmdFlg() { return xhasQueRlMap("bClassDtlByPicMthdRcmdFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPicMthdRcmdBreakKey() {
        return xdfgetConditionQueryBClassDtlByPicMthdRcmdBreakKey();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPicMthdRcmdBreakKey() {
        String prop = "bClassDtlByPicMthdRcmdBreakKey";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPicMthdRcmdBreakKey()); xsetupOuterJoinBClassDtlByPicMthdRcmdBreakKey(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPicMthdRcmdBreakKey() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPicMthdRcmdBreakKey"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPicMthdRcmdBreakKey", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPicMthdRcmdBreakKey() { xregOutJo("bClassDtlByPicMthdRcmdBreakKey"); }
    public boolean hasConditionQueryBClassDtlByPicMthdRcmdBreakKey() { return xhasQueRlMap("bClassDtlByPicMthdRcmdBreakKey"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAutoShipInstFlg() {
        return xdfgetConditionQueryBClassDtlByAutoShipInstFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAutoShipInstFlg() {
        String prop = "bClassDtlByAutoShipInstFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAutoShipInstFlg()); xsetupOuterJoinBClassDtlByAutoShipInstFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAutoShipInstFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByAutoShipInstFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAutoShipInstFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAutoShipInstFlg() { xregOutJo("bClassDtlByAutoShipInstFlg"); }
    public boolean hasConditionQueryBClassDtlByAutoShipInstFlg() { return xhasQueRlMap("bClassDtlByAutoShipInstFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockOutAutoInstFlg() {
        return xdfgetConditionQueryBClassDtlByStockOutAutoInstFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockOutAutoInstFlg() {
        String prop = "bClassDtlByStockOutAutoInstFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockOutAutoInstFlg()); xsetupOuterJoinBClassDtlByStockOutAutoInstFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockOutAutoInstFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByStockOutAutoInstFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockOutAutoInstFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockOutAutoInstFlg() { xregOutJo("bClassDtlByStockOutAutoInstFlg"); }
    public boolean hasConditionQueryBClassDtlByStockOutAutoInstFlg() { return xhasQueRlMap("bClassDtlByStockOutAutoInstFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAutoEmgSetFlg() {
        return xdfgetConditionQueryBClassDtlByAutoEmgSetFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAutoEmgSetFlg() {
        String prop = "bClassDtlByAutoEmgSetFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAutoEmgSetFlg()); xsetupOuterJoinBClassDtlByAutoEmgSetFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAutoEmgSetFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByAutoEmgSetFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAutoEmgSetFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAutoEmgSetFlg() { xregOutJo("bClassDtlByAutoEmgSetFlg"); }
    public boolean hasConditionQueryBClassDtlByAutoEmgSetFlg() { return xhasQueRlMap("bClassDtlByAutoEmgSetFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAutoEmgSetTgt() {
        return xdfgetConditionQueryBClassDtlByAutoEmgSetTgt();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAutoEmgSetTgt() {
        String prop = "bClassDtlByAutoEmgSetTgt";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAutoEmgSetTgt()); xsetupOuterJoinBClassDtlByAutoEmgSetTgt(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAutoEmgSetTgt() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByAutoEmgSetTgt"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAutoEmgSetTgt", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAutoEmgSetTgt() { xregOutJo("bClassDtlByAutoEmgSetTgt"); }
    public boolean hasConditionQueryBClassDtlByAutoEmgSetTgt() { return xhasQueRlMap("bClassDtlByAutoEmgSetTgt"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockOutAllocCls() {
        return xdfgetConditionQueryBClassDtlByStockOutAllocCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockOutAllocCls() {
        String prop = "bClassDtlByStockOutAllocCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockOutAllocCls()); xsetupOuterJoinBClassDtlByStockOutAllocCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockOutAllocCls() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByStockOutAllocCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockOutAllocCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockOutAllocCls() { xregOutJo("bClassDtlByStockOutAllocCls"); }
    public boolean hasConditionQueryBClassDtlByStockOutAllocCls() { return xhasQueRlMap("bClassDtlByStockOutAllocCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockOutInstCxlFlg() {
        return xdfgetConditionQueryBClassDtlByStockOutInstCxlFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockOutInstCxlFlg() {
        String prop = "bClassDtlByStockOutInstCxlFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockOutInstCxlFlg()); xsetupOuterJoinBClassDtlByStockOutInstCxlFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockOutInstCxlFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByStockOutInstCxlFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockOutInstCxlFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockOutInstCxlFlg() { xregOutJo("bClassDtlByStockOutInstCxlFlg"); }
    public boolean hasConditionQueryBClassDtlByStockOutInstCxlFlg() { return xhasQueRlMap("bClassDtlByStockOutInstCxlFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockOutInstSplitFlg() {
        return xdfgetConditionQueryBClassDtlByStockOutInstSplitFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockOutInstSplitFlg() {
        String prop = "bClassDtlByStockOutInstSplitFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockOutInstSplitFlg()); xsetupOuterJoinBClassDtlByStockOutInstSplitFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockOutInstSplitFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByStockOutInstSplitFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockOutInstSplitFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockOutInstSplitFlg() { xregOutJo("bClassDtlByStockOutInstSplitFlg"); }
    public boolean hasConditionQueryBClassDtlByStockOutInstSplitFlg() { return xhasQueRlMap("bClassDtlByStockOutInstSplitFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPicMthdRcmdMltPlOut() {
        return xdfgetConditionQueryBClassDtlByPicMthdRcmdMltPlOut();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPicMthdRcmdMltPlOut() {
        String prop = "bClassDtlByPicMthdRcmdMltPlOut";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPicMthdRcmdMltPlOut()); xsetupOuterJoinBClassDtlByPicMthdRcmdMltPlOut(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPicMthdRcmdMltPlOut() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPicMthdRcmdMltPlOut"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPicMthdRcmdMltPlOut", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPicMthdRcmdMltPlOut() { xregOutJo("bClassDtlByPicMthdRcmdMltPlOut"); }
    public boolean hasConditionQueryBClassDtlByPicMthdRcmdMltPlOut() { return xhasQueRlMap("bClassDtlByPicMthdRcmdMltPlOut"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPicMthdRcmdSplSlOut() {
        return xdfgetConditionQueryBClassDtlByPicMthdRcmdSplSlOut();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPicMthdRcmdSplSlOut() {
        String prop = "bClassDtlByPicMthdRcmdSplSlOut";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPicMthdRcmdSplSlOut()); xsetupOuterJoinBClassDtlByPicMthdRcmdSplSlOut(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPicMthdRcmdSplSlOut() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPicMthdRcmdSplSlOut"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPicMthdRcmdSplSlOut", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPicMthdRcmdSplSlOut() { xregOutJo("bClassDtlByPicMthdRcmdSplSlOut"); }
    public boolean hasConditionQueryBClassDtlByPicMthdRcmdSplSlOut() { return xhasQueRlMap("bClassDtlByPicMthdRcmdSplSlOut"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByErrorSoundPlayFlg() {
        return xdfgetConditionQueryBClassDtlByErrorSoundPlayFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByErrorSoundPlayFlg() {
        String prop = "bClassDtlByErrorSoundPlayFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByErrorSoundPlayFlg()); xsetupOuterJoinBClassDtlByErrorSoundPlayFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByErrorSoundPlayFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByErrorSoundPlayFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorSoundPlayFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorSoundPlayFlg() { xregOutJo("bClassDtlByErrorSoundPlayFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorSoundPlayFlg() { return xhasQueRlMap("bClassDtlByErrorSoundPlayFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByWarnSoundPlayFlg() {
        return xdfgetConditionQueryBClassDtlByWarnSoundPlayFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByWarnSoundPlayFlg() {
        String prop = "bClassDtlByWarnSoundPlayFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByWarnSoundPlayFlg()); xsetupOuterJoinBClassDtlByWarnSoundPlayFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByWarnSoundPlayFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByWarnSoundPlayFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByWarnSoundPlayFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByWarnSoundPlayFlg() { xregOutJo("bClassDtlByWarnSoundPlayFlg"); }
    public boolean hasConditionQueryBClassDtlByWarnSoundPlayFlg() { return xhasQueRlMap("bClassDtlByWarnSoundPlayFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInspSoundPlayFlg() {
        return xdfgetConditionQueryBClassDtlByInspSoundPlayFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInspSoundPlayFlg() {
        String prop = "bClassDtlByInspSoundPlayFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInspSoundPlayFlg()); xsetupOuterJoinBClassDtlByInspSoundPlayFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInspSoundPlayFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByInspSoundPlayFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInspSoundPlayFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInspSoundPlayFlg() { xregOutJo("bClassDtlByInspSoundPlayFlg"); }
    public boolean hasConditionQueryBClassDtlByInspSoundPlayFlg() { return xhasQueRlMap("bClassDtlByInspSoundPlayFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInspCompSoundPlayFlg() {
        return xdfgetConditionQueryBClassDtlByInspCompSoundPlayFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInspCompSoundPlayFlg() {
        String prop = "bClassDtlByInspCompSoundPlayFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInspCompSoundPlayFlg()); xsetupOuterJoinBClassDtlByInspCompSoundPlayFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInspCompSoundPlayFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByInspCompSoundPlayFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInspCompSoundPlayFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInspCompSoundPlayFlg() { xregOutJo("bClassDtlByInspCompSoundPlayFlg"); }
    public boolean hasConditionQueryBClassDtlByInspCompSoundPlayFlg() { return xhasQueRlMap("bClassDtlByInspCompSoundPlayFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCesIntegrationFlg() {
        return xdfgetConditionQueryBClassDtlByCesIntegrationFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCesIntegrationFlg() {
        String prop = "bClassDtlByCesIntegrationFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCesIntegrationFlg()); xsetupOuterJoinBClassDtlByCesIntegrationFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCesIntegrationFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByCesIntegrationFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCesIntegrationFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCesIntegrationFlg() { xregOutJo("bClassDtlByCesIntegrationFlg"); }
    public boolean hasConditionQueryBClassDtlByCesIntegrationFlg() { return xhasQueRlMap("bClassDtlByCesIntegrationFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPackingSlipAutoOutputFlg() {
        return xdfgetConditionQueryBClassDtlByPackingSlipAutoOutputFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPackingSlipAutoOutputFlg() {
        String prop = "bClassDtlByPackingSlipAutoOutputFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPackingSlipAutoOutputFlg()); xsetupOuterJoinBClassDtlByPackingSlipAutoOutputFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPackingSlipAutoOutputFlg() {
        String nrp = xresolveNRP("M_PARAM", "bClassDtlByPackingSlipAutoOutputFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingSlipAutoOutputFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingSlipAutoOutputFlg() { xregOutJo("bClassDtlByPackingSlipAutoOutputFlg"); }
    public boolean hasConditionQueryBClassDtlByPackingSlipAutoOutputFlg() { return xhasQueRlMap("bClassDtlByPackingSlipAutoOutputFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MParamCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MParamCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MParamCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MParamCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MParamCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MParamCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MParamCQ> _myselfExistsMap;
    public Map<String, MParamCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MParamCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MParamCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MParamCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MParamCB.class.getName(); }
    protected String xCQ() { return MParamCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
