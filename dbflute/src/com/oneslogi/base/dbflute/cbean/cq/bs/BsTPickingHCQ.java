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
 * The base condition-query of T_PICKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPickingHCQ extends AbstractBsTPickingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPickingHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PICKING_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPickingHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPickingHCIQ xcreateCIQ() {
        TPickingHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPickingHCIQ xnewCIQ() {
        return new TPickingHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PICKING_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPickingHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPickingHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingHId;
    public ConditionValue xdfgetPickingHId()
    { if (_pickingHId == null) { _pickingHId = nCV(); }
      return _pickingHId; }
    protected ConditionValue xgetCValuePickingHId() { return xdfgetPickingHId(); }

    public Map<String, TPackingHCQ> xdfgetPickingHId_ExistsReferrer_TPackingHList() { return xgetSQueMap("pickingHId_ExistsReferrer_TPackingHList"); }
    public String keepPickingHId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("pickingHId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPickingBCQ> xdfgetPickingHId_ExistsReferrer_TPickingBList() { return xgetSQueMap("pickingHId_ExistsReferrer_TPickingBList"); }
    public String keepPickingHId_ExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("pickingHId_ExistsReferrer_TPickingBList", sq); }

    public Map<String, TPickingRCQ> xdfgetPickingHId_ExistsReferrer_TPickingRAsOne() { return xgetSQueMap("pickingHId_ExistsReferrer_TPickingRAsOne"); }
    public String keepPickingHId_ExistsReferrer_TPickingRAsOne(TPickingRCQ sq) { return xkeepSQue("pickingHId_ExistsReferrer_TPickingRAsOne", sq); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPickingHId_ExistsReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("pickingHId_ExistsReferrer_TPicMthdRcmdDataList"); }
    public String keepPickingHId_ExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("pickingHId_ExistsReferrer_TPicMthdRcmdDataList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetPickingHId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("pickingHId_ExistsReferrer_TReceivePlanHList"); }
    public String keepPickingHId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("pickingHId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetPickingHId_ExistsReferrer_WSglRowShipInspBList() { return xgetSQueMap("pickingHId_ExistsReferrer_WSglRowShipInspBList"); }
    public String keepPickingHId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("pickingHId_ExistsReferrer_WSglRowShipInspBList", sq); }

    public Map<String, TPackingHCQ> xdfgetPickingHId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("pickingHId_NotExistsReferrer_TPackingHList"); }
    public String keepPickingHId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("pickingHId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPickingBCQ> xdfgetPickingHId_NotExistsReferrer_TPickingBList() { return xgetSQueMap("pickingHId_NotExistsReferrer_TPickingBList"); }
    public String keepPickingHId_NotExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("pickingHId_NotExistsReferrer_TPickingBList", sq); }

    public Map<String, TPickingRCQ> xdfgetPickingHId_NotExistsReferrer_TPickingRAsOne() { return xgetSQueMap("pickingHId_NotExistsReferrer_TPickingRAsOne"); }
    public String keepPickingHId_NotExistsReferrer_TPickingRAsOne(TPickingRCQ sq) { return xkeepSQue("pickingHId_NotExistsReferrer_TPickingRAsOne", sq); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPickingHId_NotExistsReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("pickingHId_NotExistsReferrer_TPicMthdRcmdDataList"); }
    public String keepPickingHId_NotExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("pickingHId_NotExistsReferrer_TPicMthdRcmdDataList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetPickingHId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("pickingHId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepPickingHId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("pickingHId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetPickingHId_NotExistsReferrer_WSglRowShipInspBList() { return xgetSQueMap("pickingHId_NotExistsReferrer_WSglRowShipInspBList"); }
    public String keepPickingHId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("pickingHId_NotExistsReferrer_WSglRowShipInspBList", sq); }

    public Map<String, TPackingHCQ> xdfgetPickingHId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("pickingHId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepPickingHId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("pickingHId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPickingBCQ> xdfgetPickingHId_SpecifyDerivedReferrer_TPickingBList() { return xgetSQueMap("pickingHId_SpecifyDerivedReferrer_TPickingBList"); }
    public String keepPickingHId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("pickingHId_SpecifyDerivedReferrer_TPickingBList", sq); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("pickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList"); }
    public String keepPickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("pickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetPickingHId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("pickingHId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepPickingHId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("pickingHId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetPickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList() { return xgetSQueMap("pickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList"); }
    public String keepPickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("pickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList", sq); }

    public Map<String, TPackingHCQ> xdfgetPickingHId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("pickingHId_QueryDerivedReferrer_TPackingHList"); }
    public String keepPickingHId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("pickingHId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetPickingHId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("pickingHId_QueryDerivedReferrer_TPackingHList"); }
    public String keepPickingHId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("pickingHId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPickingBCQ> xdfgetPickingHId_QueryDerivedReferrer_TPickingBList() { return xgetSQueMap("pickingHId_QueryDerivedReferrer_TPickingBList"); }
    public String keepPickingHId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("pickingHId_QueryDerivedReferrer_TPickingBList", sq); }
    public Map<String, Object> xdfgetPickingHId_QueryDerivedReferrer_TPickingBListParameter() { return xgetSQuePmMap("pickingHId_QueryDerivedReferrer_TPickingBList"); }
    public String keepPickingHId_QueryDerivedReferrer_TPickingBListParameter(Object pm) { return xkeepSQuePm("pickingHId_QueryDerivedReferrer_TPickingBList", pm); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("pickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList"); }
    public String keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("pickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList", sq); }
    public Map<String, Object> xdfgetPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter() { return xgetSQuePmMap("pickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList"); }
    public String keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(Object pm) { return xkeepSQuePm("pickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetPickingHId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("pickingHId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepPickingHId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("pickingHId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetPickingHId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("pickingHId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepPickingHId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("pickingHId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, WSglRowShipInspBCQ> xdfgetPickingHId_QueryDerivedReferrer_WSglRowShipInspBList() { return xgetSQueMap("pickingHId_QueryDerivedReferrer_WSglRowShipInspBList"); }
    public String keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("pickingHId_QueryDerivedReferrer_WSglRowShipInspBList", sq); }
    public Map<String, Object> xdfgetPickingHId_QueryDerivedReferrer_WSglRowShipInspBListParameter() { return xgetSQuePmMap("pickingHId_QueryDerivedReferrer_WSglRowShipInspBList"); }
    public String keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object pm) { return xkeepSQuePm("pickingHId_QueryDerivedReferrer_WSglRowShipInspBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingHId_Asc() { regOBA("PICKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingHId_Desc() { regOBD("PICKING_H_ID"); return this; }

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
    public BsTPickingHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTPickingHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTPickingHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _pickingStatus;
    public ConditionValue xdfgetPickingStatus()
    { if (_pickingStatus == null) { _pickingStatus = nCV(); }
      return _pickingStatus; }
    protected ConditionValue xgetCValuePickingStatus() { return xdfgetPickingStatus(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingStatus_Asc() { regOBA("PICKING_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingStatus_Desc() { regOBD("PICKING_STATUS"); return this; }

    protected ConditionValue _delivUnitNo;
    public ConditionValue xdfgetDelivUnitNo()
    { if (_delivUnitNo == null) { _delivUnitNo = nCV(); }
      return _delivUnitNo; }
    protected ConditionValue xgetCValueDelivUnitNo() { return xdfgetDelivUnitNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_UNIT_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_DelivUnitNo_Asc() { regOBA("DELIV_UNIT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_UNIT_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_DelivUnitNo_Desc() { regOBD("DELIV_UNIT_NO"); return this; }

    protected ConditionValue _pickingWorkNo;
    public ConditionValue xdfgetPickingWorkNo()
    { if (_pickingWorkNo == null) { _pickingWorkNo = nCV(); }
      return _pickingWorkNo; }
    protected ConditionValue xgetCValuePickingWorkNo() { return xdfgetPickingWorkNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_WORK_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingWorkNo_Asc() { regOBA("PICKING_WORK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingWorkNo_Desc() { regOBD("PICKING_WORK_NO"); return this; }

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
    public BsTPickingHCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

    protected ConditionValue _forceFixedFlg;
    public ConditionValue xdfgetForceFixedFlg()
    { if (_forceFixedFlg == null) { _forceFixedFlg = nCV(); }
      return _forceFixedFlg; }
    protected ConditionValue xgetCValueForceFixedFlg() { return xdfgetForceFixedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ForceFixedFlg_Asc() { regOBA("FORCE_FIXED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ForceFixedFlg_Desc() { regOBD("FORCE_FIXED_FLG"); return this; }

    protected ConditionValue _pickingGroupNo;
    public ConditionValue xdfgetPickingGroupNo()
    { if (_pickingGroupNo == null) { _pickingGroupNo = nCV(); }
      return _pickingGroupNo; }
    protected ConditionValue xgetCValuePickingGroupNo() { return xdfgetPickingGroupNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_GROUP_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingGroupNo_Asc() { regOBA("PICKING_GROUP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_GROUP_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PickingGroupNo_Desc() { regOBD("PICKING_GROUP_NO"); return this; }

    protected ConditionValue _sglRowPicFlg;
    public ConditionValue xdfgetSglRowPicFlg()
    { if (_sglRowPicFlg == null) { _sglRowPicFlg = nCV(); }
      return _sglRowPicFlg; }
    protected ConditionValue xgetCValueSglRowPicFlg() { return xdfgetSglRowPicFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_SglRowPicFlg_Asc() { regOBA("SGL_ROW_PIC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_SglRowPicFlg_Desc() { regOBD("SGL_ROW_PIC_FLG"); return this; }

    protected ConditionValue _shippingFixedDt;
    public ConditionValue xdfgetShippingFixedDt()
    { if (_shippingFixedDt == null) { _shippingFixedDt = nCV(); }
      return _shippingFixedDt; }
    protected ConditionValue xgetCValueShippingFixedDt() { return xdfgetShippingFixedDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_FIXED_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ShippingFixedDt_Asc() { regOBA("SHIPPING_FIXED_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_FIXED_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ShippingFixedDt_Desc() { regOBD("SHIPPING_FIXED_DT"); return this; }

    protected ConditionValue _centerTransitFlg;
    public ConditionValue xdfgetCenterTransitFlg()
    { if (_centerTransitFlg == null) { _centerTransitFlg = nCV(); }
      return _centerTransitFlg; }
    protected ConditionValue xgetCValueCenterTransitFlg() { return xdfgetCenterTransitFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_CenterTransitFlg_Asc() { regOBA("CENTER_TRANSIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_CenterTransitFlg_Desc() { regOBD("CENTER_TRANSIT_FLG"); return this; }

    protected ConditionValue _packingCalCls;
    public ConditionValue xdfgetPackingCalCls()
    { if (_packingCalCls == null) { _packingCalCls = nCV(); }
      return _packingCalCls; }
    protected ConditionValue xgetCValuePackingCalCls() { return xdfgetPackingCalCls(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PackingCalCls_Asc() { regOBA("PACKING_CAL_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_PackingCalCls_Desc() { regOBD("PACKING_CAL_CLS"); return this; }

    protected ConditionValue _bolNo;
    public ConditionValue xdfgetBolNo()
    { if (_bolNo == null) { _bolNo = nCV(); }
      return _bolNo; }
    protected ConditionValue xgetCValueBolNo() { return xdfgetBolNo(); }

    /**
     * Add order-by as ascend. <br>
     * BOL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_BolNo_Asc() { regOBA("BOL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_BolNo_Desc() { regOBD("BOL_NO"); return this; }

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
    public BsTPickingHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPickingHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPickingHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPickingHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPickingHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPickingHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPickingHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPickingHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPickingHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPickingHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPickingHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPickingHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPickingHCQ bq = (TPickingHCQ)bqs;
        TPickingHCQ uq = (TPickingHCQ)uqs;
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryTAllocInstH()) {
            uq.queryTAllocInstH().reflectRelationOnUnionQuery(bq.queryTAllocInstH(), uq.queryTAllocInstH());
        }
        if (bq.hasConditionQueryBClassDtlByCenterTransitFlg()) {
            uq.queryBClassDtlByCenterTransitFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCenterTransitFlg(), uq.queryBClassDtlByCenterTransitFlg());
        }
        if (bq.hasConditionQueryBClassDtlByForceFixedFlg()) {
            uq.queryBClassDtlByForceFixedFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByForceFixedFlg(), uq.queryBClassDtlByForceFixedFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPackingCalCls()) {
            uq.queryBClassDtlByPackingCalCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingCalCls(), uq.queryBClassDtlByPackingCalCls());
        }
        if (bq.hasConditionQueryBClassDtlByPickingStatus()) {
            uq.queryBClassDtlByPickingStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByPickingStatus(), uq.queryBClassDtlByPickingStatus());
        }
        if (bq.hasConditionQueryBClassDtlBySglRowPicFlg()) {
            uq.queryBClassDtlBySglRowPicFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySglRowPicFlg(), uq.queryBClassDtlBySglRowPicFlg());
        }
        if (bq.hasConditionQueryTPickingRAsOne()) {
            uq.queryTPickingRAsOne().reflectRelationOnUnionQuery(bq.queryTPickingRAsOne(), uq.queryTPickingRAsOne());
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
        String nrp = xresolveNRP("T_PICKING_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_PICKING_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("T_PICKING_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

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
        String nrp = xresolveNRP("T_PICKING_H", "tAllocInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstH", nrp);
    }
    protected void xsetupOuterJoinTAllocInstH() { xregOutJo("tAllocInstH"); }
    public boolean hasConditionQueryTAllocInstH() { return xhasQueRlMap("tAllocInstH"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCenterTransitFlg() {
        return xdfgetConditionQueryBClassDtlByCenterTransitFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCenterTransitFlg() {
        String prop = "bClassDtlByCenterTransitFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCenterTransitFlg()); xsetupOuterJoinBClassDtlByCenterTransitFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCenterTransitFlg() {
        String nrp = xresolveNRP("T_PICKING_H", "bClassDtlByCenterTransitFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCenterTransitFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCenterTransitFlg() { xregOutJo("bClassDtlByCenterTransitFlg"); }
    public boolean hasConditionQueryBClassDtlByCenterTransitFlg() { return xhasQueRlMap("bClassDtlByCenterTransitFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByForceFixedFlg() {
        return xdfgetConditionQueryBClassDtlByForceFixedFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByForceFixedFlg() {
        String prop = "bClassDtlByForceFixedFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByForceFixedFlg()); xsetupOuterJoinBClassDtlByForceFixedFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByForceFixedFlg() {
        String nrp = xresolveNRP("T_PICKING_H", "bClassDtlByForceFixedFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByForceFixedFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByForceFixedFlg() { xregOutJo("bClassDtlByForceFixedFlg"); }
    public boolean hasConditionQueryBClassDtlByForceFixedFlg() { return xhasQueRlMap("bClassDtlByForceFixedFlg"); }

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
        String nrp = xresolveNRP("T_PICKING_H", "bClassDtlByPackingCalCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingCalCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingCalCls() { xregOutJo("bClassDtlByPackingCalCls"); }
    public boolean hasConditionQueryBClassDtlByPackingCalCls() { return xhasQueRlMap("bClassDtlByPackingCalCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPickingStatus() {
        return xdfgetConditionQueryBClassDtlByPickingStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPickingStatus() {
        String prop = "bClassDtlByPickingStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPickingStatus()); xsetupOuterJoinBClassDtlByPickingStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPickingStatus() {
        String nrp = xresolveNRP("T_PICKING_H", "bClassDtlByPickingStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPickingStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPickingStatus() { xregOutJo("bClassDtlByPickingStatus"); }
    public boolean hasConditionQueryBClassDtlByPickingStatus() { return xhasQueRlMap("bClassDtlByPickingStatus"); }

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
        String nrp = xresolveNRP("T_PICKING_H", "bClassDtlBySglRowPicFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySglRowPicFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySglRowPicFlg() { xregOutJo("bClassDtlBySglRowPicFlg"); }
    public boolean hasConditionQueryBClassDtlBySglRowPicFlg() { return xhasQueRlMap("bClassDtlBySglRowPicFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingRCQ queryTPickingRAsOne() { return xdfgetConditionQueryTPickingRAsOne(); }
    public TPickingRCQ xdfgetConditionQueryTPickingRAsOne() {
        String prop = "tPickingRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingRAsOne()); xsetupOuterJoinTPickingRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingRCQ xcreateQueryTPickingRAsOne() {
        String nrp = xresolveNRP("T_PICKING_H", "tPickingRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingRAsOne", nrp);
    }
    protected void xsetupOuterJoinTPickingRAsOne() { xregOutJo("tPickingRAsOne"); }
    public boolean hasConditionQueryTPickingRAsOne() { return xhasQueRlMap("tPickingRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPickingHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPickingHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPickingHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPickingHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPickingHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPickingHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPickingHCQ> _myselfExistsMap;
    public Map<String, TPickingHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPickingHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPickingHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPickingHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPickingHCB.class.getName(); }
    protected String xCQ() { return TPickingHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
