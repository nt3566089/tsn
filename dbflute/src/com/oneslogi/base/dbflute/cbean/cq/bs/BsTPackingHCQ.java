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
 * The base condition-query of T_PACKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPackingHCQ extends AbstractBsTPackingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPackingHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PACKING_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPackingHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPackingHCIQ xcreateCIQ() {
        TPackingHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPackingHCIQ xnewCIQ() {
        return new TPackingHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PACKING_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPackingHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPackingHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _packingHId;
    public ConditionValue xdfgetPackingHId()
    { if (_packingHId == null) { _packingHId = nCV(); }
      return _packingHId; }
    protected ConditionValue xgetCValuePackingHId() { return xdfgetPackingHId(); }

    public Map<String, TPackingBCQ> xdfgetPackingHId_ExistsReferrer_TPackingBList() { return xgetSQueMap("packingHId_ExistsReferrer_TPackingBList"); }
    public String keepPackingHId_ExistsReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("packingHId_ExistsReferrer_TPackingBList", sq); }

    public Map<String, TPackingRCQ> xdfgetPackingHId_ExistsReferrer_TPackingRAsOne() { return xgetSQueMap("packingHId_ExistsReferrer_TPackingRAsOne"); }
    public String keepPackingHId_ExistsReferrer_TPackingRAsOne(TPackingRCQ sq) { return xkeepSQue("packingHId_ExistsReferrer_TPackingRAsOne", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPackingHId_ExistsReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("packingHId_ExistsReferrer_TPicMthdRcmdCartList"); }
    public String keepPackingHId_ExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("packingHId_ExistsReferrer_TPicMthdRcmdCartList", sq); }

    public Map<String, TPackingBCQ> xdfgetPackingHId_NotExistsReferrer_TPackingBList() { return xgetSQueMap("packingHId_NotExistsReferrer_TPackingBList"); }
    public String keepPackingHId_NotExistsReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("packingHId_NotExistsReferrer_TPackingBList", sq); }

    public Map<String, TPackingRCQ> xdfgetPackingHId_NotExistsReferrer_TPackingRAsOne() { return xgetSQueMap("packingHId_NotExistsReferrer_TPackingRAsOne"); }
    public String keepPackingHId_NotExistsReferrer_TPackingRAsOne(TPackingRCQ sq) { return xkeepSQue("packingHId_NotExistsReferrer_TPackingRAsOne", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPackingHId_NotExistsReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("packingHId_NotExistsReferrer_TPicMthdRcmdCartList"); }
    public String keepPackingHId_NotExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("packingHId_NotExistsReferrer_TPicMthdRcmdCartList", sq); }

    public Map<String, TPackingBCQ> xdfgetPackingHId_SpecifyDerivedReferrer_TPackingBList() { return xgetSQueMap("packingHId_SpecifyDerivedReferrer_TPackingBList"); }
    public String keepPackingHId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("packingHId_SpecifyDerivedReferrer_TPackingBList", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPackingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("packingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList"); }
    public String keepPackingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("packingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList", sq); }

    public Map<String, TPackingBCQ> xdfgetPackingHId_QueryDerivedReferrer_TPackingBList() { return xgetSQueMap("packingHId_QueryDerivedReferrer_TPackingBList"); }
    public String keepPackingHId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq) { return xkeepSQue("packingHId_QueryDerivedReferrer_TPackingBList", sq); }
    public Map<String, Object> xdfgetPackingHId_QueryDerivedReferrer_TPackingBListParameter() { return xgetSQuePmMap("packingHId_QueryDerivedReferrer_TPackingBList"); }
    public String keepPackingHId_QueryDerivedReferrer_TPackingBListParameter(Object pm) { return xkeepSQuePm("packingHId_QueryDerivedReferrer_TPackingBList", pm); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("packingHId_QueryDerivedReferrer_TPicMthdRcmdCartList"); }
    public String keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("packingHId_QueryDerivedReferrer_TPicMthdRcmdCartList", sq); }
    public Map<String, Object> xdfgetPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter() { return xgetSQuePmMap("packingHId_QueryDerivedReferrer_TPicMthdRcmdCartList"); }
    public String keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(Object pm) { return xkeepSQuePm("packingHId_QueryDerivedReferrer_TPicMthdRcmdCartList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_PackingHId_Asc() { regOBA("PACKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_PackingHId_Desc() { regOBD("PACKING_H_ID"); return this; }

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
    public BsTPackingHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTPackingHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTPackingHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _packingStatus;
    public ConditionValue xdfgetPackingStatus()
    { if (_packingStatus == null) { _packingStatus = nCV(); }
      return _packingStatus; }
    protected ConditionValue xgetCValuePackingStatus() { return xdfgetPackingStatus(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_PackingStatus_Asc() { regOBA("PACKING_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_PackingStatus_Desc() { regOBD("PACKING_STATUS"); return this; }

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
    public BsTPackingHCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

    protected ConditionValue _pickingHId;
    public ConditionValue xdfgetPickingHId()
    { if (_pickingHId == null) { _pickingHId = nCV(); }
      return _pickingHId; }
    protected ConditionValue xgetCValuePickingHId() { return xdfgetPickingHId(); }

    public Map<String, TPickingHCQ> getPickingHId_InScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_InScopeRelation_TPickingH"); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_InScopeRelation_TPickingH", sq); }

    public Map<String, TPickingHCQ> getPickingHId_NotInScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_NotInScopeRelation_TPickingH"); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_NotInScopeRelation_TPickingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_PickingHId_Asc() { regOBA("PICKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_PickingHId_Desc() { regOBD("PICKING_H_ID"); return this; }

    protected ConditionValue _shippingPackingNo;
    public ConditionValue xdfgetShippingPackingNo()
    { if (_shippingPackingNo == null) { _shippingPackingNo = nCV(); }
      return _shippingPackingNo; }
    protected ConditionValue xgetCValueShippingPackingNo() { return xdfgetShippingPackingNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_ShippingPackingNo_Asc() { regOBA("SHIPPING_PACKING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_ShippingPackingNo_Desc() { regOBD("SHIPPING_PACKING_NO"); return this; }

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
    public BsTPackingHCQ addOrderBy_CarrierTraceNum_Asc() { regOBA("CARRIER_TRACE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_CarrierTraceNum_Desc() { regOBD("CARRIER_TRACE_NUM"); return this; }

    protected ConditionValue _boxId;
    public ConditionValue xdfgetBoxId()
    { if (_boxId == null) { _boxId = nCV(); }
      return _boxId; }
    protected ConditionValue xgetCValueBoxId() { return xdfgetBoxId(); }

    public Map<String, MBoxCQ> getBoxId_InScopeRelation_MBox() { return xgetSQueMap("boxId_InScopeRelation_MBox"); }
    public String keepBoxId_InScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("boxId_InScopeRelation_MBox", sq); }

    public Map<String, MBoxCQ> getBoxId_NotInScopeRelation_MBox() { return xgetSQueMap("boxId_NotInScopeRelation_MBox"); }
    public String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("boxId_NotInScopeRelation_MBox", sq); }

    /**
     * Add order-by as ascend. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_BoxId_Asc() { regOBA("BOX_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_BoxId_Desc() { regOBD("BOX_ID"); return this; }

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
    public BsTPackingHCQ addOrderBy_GrossWeight_Asc() { regOBA("GROSS_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_GrossWeight_Desc() { regOBD("GROSS_WEIGHT"); return this; }

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
    public BsTPackingHCQ addOrderBy_TotalVolume_Asc() { regOBA("TOTAL_VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_TotalVolume_Desc() { regOBD("TOTAL_VOLUME"); return this; }

    protected ConditionValue _mixedFlg;
    public ConditionValue xdfgetMixedFlg()
    { if (_mixedFlg == null) { _mixedFlg = nCV(); }
      return _mixedFlg; }
    protected ConditionValue xgetCValueMixedFlg() { return xdfgetMixedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_MixedFlg_Asc() { regOBA("MIXED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_MixedFlg_Desc() { regOBD("MIXED_FLG"); return this; }

    protected ConditionValue _multiPicFlg;
    public ConditionValue xdfgetMultiPicFlg()
    { if (_multiPicFlg == null) { _multiPicFlg = nCV(); }
      return _multiPicFlg; }
    protected ConditionValue xgetCValueMultiPicFlg() { return xdfgetMultiPicFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_MultiPicFlg_Asc() { regOBA("MULTI_PIC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_MultiPicFlg_Desc() { regOBD("MULTI_PIC_FLG"); return this; }

    protected ConditionValue _cartNo;
    public ConditionValue xdfgetCartNo()
    { if (_cartNo == null) { _cartNo = nCV(); }
      return _cartNo; }
    protected ConditionValue xgetCValueCartNo() { return xdfgetCartNo(); }

    /**
     * Add order-by as ascend. <br>
     * CART_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_CartNo_Asc() { regOBA("CART_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CART_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_CartNo_Desc() { regOBD("CART_NO"); return this; }

    protected ConditionValue _bucketColNo;
    public ConditionValue xdfgetBucketColNo()
    { if (_bucketColNo == null) { _bucketColNo = nCV(); }
      return _bucketColNo; }
    protected ConditionValue xgetCValueBucketColNo() { return xdfgetBucketColNo(); }

    /**
     * Add order-by as ascend. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_BucketColNo_Asc() { regOBA("BUCKET_COL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_BucketColNo_Desc() { regOBD("BUCKET_COL_NO"); return this; }

    protected ConditionValue _bucketRowNo;
    public ConditionValue xdfgetBucketRowNo()
    { if (_bucketRowNo == null) { _bucketRowNo = nCV(); }
      return _bucketRowNo; }
    protected ConditionValue xgetCValueBucketRowNo() { return xdfgetBucketRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_BucketRowNo_Asc() { regOBA("BUCKET_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_BucketRowNo_Desc() { regOBD("BUCKET_ROW_NO"); return this; }

    protected ConditionValue _seedingNo;
    public ConditionValue xdfgetSeedingNo()
    { if (_seedingNo == null) { _seedingNo = nCV(); }
      return _seedingNo; }
    protected ConditionValue xgetCValueSeedingNo() { return xdfgetSeedingNo(); }

    /**
     * Add order-by as ascend. <br>
     * SEEDING_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_SeedingNo_Asc() { regOBA("SEEDING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEEDING_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_SeedingNo_Desc() { regOBD("SEEDING_NO"); return this; }

    protected ConditionValue _loadingFlg;
    public ConditionValue xdfgetLoadingFlg()
    { if (_loadingFlg == null) { _loadingFlg = nCV(); }
      return _loadingFlg; }
    protected ConditionValue xgetCValueLoadingFlg() { return xdfgetLoadingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_LoadingFlg_Asc() { regOBA("LOADING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_LoadingFlg_Desc() { regOBD("LOADING_FLG"); return this; }

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
    public BsTPackingHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPackingHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPackingHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPackingHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPackingHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPackingHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPackingHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    public Map<String, BUserCQ> getUpdUser_InScopeRelation_BUserByUpdUser() { return xgetSQueMap("updUser_InScopeRelation_BUserByUpdUser"); }
    public String keepUpdUser_InScopeRelation_BUserByUpdUser(BUserCQ sq) { return xkeepSQue("updUser_InScopeRelation_BUserByUpdUser", sq); }

    public Map<String, BUserCQ> getUpdUser_NotInScopeRelation_BUserByUpdUser() { return xgetSQueMap("updUser_NotInScopeRelation_BUserByUpdUser"); }
    public String keepUpdUser_NotInScopeRelation_BUserByUpdUser(BUserCQ sq) { return xkeepSQue("updUser_NotInScopeRelation_BUserByUpdUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255), FK to B_USER}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPackingHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPackingHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPackingHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPackingHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPackingHCQ bq = (TPackingHCQ)bqs;
        TPackingHCQ uq = (TPackingHCQ)uqs;
        if (bq.hasConditionQueryTPickingH()) {
            uq.queryTPickingH().reflectRelationOnUnionQuery(bq.queryTPickingH(), uq.queryTPickingH());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMBox()) {
            uq.queryMBox().reflectRelationOnUnionQuery(bq.queryMBox(), uq.queryMBox());
        }
        if (bq.hasConditionQueryTAllocInstH()) {
            uq.queryTAllocInstH().reflectRelationOnUnionQuery(bq.queryTAllocInstH(), uq.queryTAllocInstH());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryBUserByUpdUser()) {
            uq.queryBUserByUpdUser().reflectRelationOnUnionQuery(bq.queryBUserByUpdUser(), uq.queryBUserByUpdUser());
        }
        if (bq.hasConditionQueryBClassDtlByLoadingFlg()) {
            uq.queryBClassDtlByLoadingFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLoadingFlg(), uq.queryBClassDtlByLoadingFlg());
        }
        if (bq.hasConditionQueryBClassDtlByMixedFlg()) {
            uq.queryBClassDtlByMixedFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByMixedFlg(), uq.queryBClassDtlByMixedFlg());
        }
        if (bq.hasConditionQueryBClassDtlByMultiPicFlg()) {
            uq.queryBClassDtlByMultiPicFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByMultiPicFlg(), uq.queryBClassDtlByMultiPicFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPackingStatus()) {
            uq.queryBClassDtlByPackingStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingStatus(), uq.queryBClassDtlByPackingStatus());
        }
        if (bq.hasConditionQueryTPackingRAsOne()) {
            uq.queryTPackingRAsOne().reflectRelationOnUnionQuery(bq.queryTPackingRAsOne(), uq.queryTPackingRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
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
        String nrp = xresolveNRP("T_PACKING_H", "tPickingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingH", nrp);
    }
    protected void xsetupOuterJoinTPickingH() { xregOutJo("tPickingH"); }
    public boolean hasConditionQueryTPickingH() { return xhasQueRlMap("tPickingH"); }

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
        String nrp = xresolveNRP("T_PACKING_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_BOX by my BOX_ID, named 'MBox'.
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
        String nrp = xresolveNRP("T_PACKING_H", "mBox"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MBoxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mBox", nrp);
    }
    protected void xsetupOuterJoinMBox() { xregOutJo("mBox"); }
    public boolean hasConditionQueryMBox() { return xhasQueRlMap("mBox"); }

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
        String nrp = xresolveNRP("T_PACKING_H", "tAllocInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstH", nrp);
    }
    protected void xsetupOuterJoinTAllocInstH() { xregOutJo("tAllocInstH"); }
    public boolean hasConditionQueryTAllocInstH() { return xhasQueRlMap("tAllocInstH"); }

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
        String nrp = xresolveNRP("T_PACKING_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

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
        String nrp = xresolveNRP("T_PACKING_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_USER by my UPD_USER, named 'BUserByUpdUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByUpdUser() {
        return xdfgetConditionQueryBUserByUpdUser();
    }
    public BUserCQ xdfgetConditionQueryBUserByUpdUser() {
        String prop = "bUserByUpdUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByUpdUser()); xsetupOuterJoinBUserByUpdUser(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByUpdUser() {
        String nrp = xresolveNRP("T_PACKING_H", "bUserByUpdUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByUpdUser", nrp);
    }
    protected void xsetupOuterJoinBUserByUpdUser() { xregOutJo("bUserByUpdUser"); }
    public boolean hasConditionQueryBUserByUpdUser() { return xhasQueRlMap("bUserByUpdUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOADING_FLG, named 'BClassDtlByLoadingFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLoadingFlg() {
        return xdfgetConditionQueryBClassDtlByLoadingFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLoadingFlg() {
        String prop = "bClassDtlByLoadingFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLoadingFlg()); xsetupOuterJoinBClassDtlByLoadingFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLoadingFlg() {
        String nrp = xresolveNRP("T_PACKING_H", "bClassDtlByLoadingFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLoadingFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLoadingFlg() { xregOutJo("bClassDtlByLoadingFlg"); }
    public boolean hasConditionQueryBClassDtlByLoadingFlg() { return xhasQueRlMap("bClassDtlByLoadingFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MIXED_FLG, named 'BClassDtlByMixedFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMixedFlg() {
        return xdfgetConditionQueryBClassDtlByMixedFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMixedFlg() {
        String prop = "bClassDtlByMixedFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMixedFlg()); xsetupOuterJoinBClassDtlByMixedFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMixedFlg() {
        String nrp = xresolveNRP("T_PACKING_H", "bClassDtlByMixedFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMixedFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMixedFlg() { xregOutJo("bClassDtlByMixedFlg"); }
    public boolean hasConditionQueryBClassDtlByMixedFlg() { return xhasQueRlMap("bClassDtlByMixedFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MULTI_PIC_FLG, named 'BClassDtlByMultiPicFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMultiPicFlg() {
        return xdfgetConditionQueryBClassDtlByMultiPicFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMultiPicFlg() {
        String prop = "bClassDtlByMultiPicFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMultiPicFlg()); xsetupOuterJoinBClassDtlByMultiPicFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMultiPicFlg() {
        String nrp = xresolveNRP("T_PACKING_H", "bClassDtlByMultiPicFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMultiPicFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMultiPicFlg() { xregOutJo("bClassDtlByMultiPicFlg"); }
    public boolean hasConditionQueryBClassDtlByMultiPicFlg() { return xhasQueRlMap("bClassDtlByMultiPicFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PACKING_STATUS, named 'BClassDtlByPackingStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPackingStatus() {
        return xdfgetConditionQueryBClassDtlByPackingStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPackingStatus() {
        String prop = "bClassDtlByPackingStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPackingStatus()); xsetupOuterJoinBClassDtlByPackingStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPackingStatus() {
        String nrp = xresolveNRP("T_PACKING_H", "bClassDtlByPackingStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingStatus() { xregOutJo("bClassDtlByPackingStatus"); }
    public boolean hasConditionQueryBClassDtlByPackingStatus() { return xhasQueRlMap("bClassDtlByPackingStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPackingRCQ queryTPackingRAsOne() { return xdfgetConditionQueryTPackingRAsOne(); }
    public TPackingRCQ xdfgetConditionQueryTPackingRAsOne() {
        String prop = "tPackingRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPackingRAsOne()); xsetupOuterJoinTPackingRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TPackingRCQ xcreateQueryTPackingRAsOne() {
        String nrp = xresolveNRP("T_PACKING_H", "tPackingRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPackingRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPackingRAsOne", nrp);
    }
    protected void xsetupOuterJoinTPackingRAsOne() { xregOutJo("tPackingRAsOne"); }
    public boolean hasConditionQueryTPackingRAsOne() { return xhasQueRlMap("tPackingRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPackingHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPackingHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPackingHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPackingHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPackingHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPackingHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPackingHCQ> _myselfExistsMap;
    public Map<String, TPackingHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPackingHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPackingHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPackingHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPackingHCB.class.getName(); }
    protected String xCQ() { return TPackingHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
