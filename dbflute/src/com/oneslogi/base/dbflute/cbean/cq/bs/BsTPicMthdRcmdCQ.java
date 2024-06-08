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
 * The base condition-query of T_PIC_MTHD_RCMD.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPicMthdRcmdCQ extends AbstractBsTPicMthdRcmdCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPicMthdRcmdCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPicMthdRcmdCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PIC_MTHD_RCMD) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPicMthdRcmdCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPicMthdRcmdCIQ xcreateCIQ() {
        TPicMthdRcmdCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPicMthdRcmdCIQ xnewCIQ() {
        return new TPicMthdRcmdCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PIC_MTHD_RCMD on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPicMthdRcmdCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPicMthdRcmdCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _picMthdRcmdId;
    public ConditionValue xdfgetPicMthdRcmdId()
    { if (_picMthdRcmdId == null) { _picMthdRcmdId = nCV(); }
      return _picMthdRcmdId; }
    protected ConditionValue xgetCValuePicMthdRcmdId() { return xdfgetPicMthdRcmdId(); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("picMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList"); }
    public String keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("picMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList", sq); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("picMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList"); }
    public String keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("picMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("picMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList"); }
    public String keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("picMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList", sq); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("picMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList"); }
    public String keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("picMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("picMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList"); }
    public String keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("picMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList", sq); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("picMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList"); }
    public String keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("picMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList", sq); }

    public Map<String, TPicMthdRcmdCartCQ> xdfgetPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList() { return xgetSQueMap("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList"); }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq) { return xkeepSQue("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList", sq); }
    public Map<String, Object> xdfgetPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter() { return xgetSQuePmMap("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList"); }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(Object pm) { return xkeepSQuePm("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList", pm); }

    public Map<String, TPicMthdRcmdDataCQ> xdfgetPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList() { return xgetSQueMap("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList"); }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq) { return xkeepSQue("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList", sq); }
    public Map<String, Object> xdfgetPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter() { return xgetSQuePmMap("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList"); }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(Object pm) { return xkeepSQuePm("picMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_PicMthdRcmdId_Asc() { regOBA("PIC_MTHD_RCMD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_PicMthdRcmdId_Desc() { regOBD("PIC_MTHD_RCMD_ID"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _pickingBatchNo;
    public ConditionValue xdfgetPickingBatchNo()
    { if (_pickingBatchNo == null) { _pickingBatchNo = nCV(); }
      return _pickingBatchNo; }
    protected ConditionValue xgetCValuePickingBatchNo() { return xdfgetPickingBatchNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_PickingBatchNo_Asc() { regOBA("PICKING_BATCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_PickingBatchNo_Desc() { regOBD("PICKING_BATCH_NO"); return this; }

    protected ConditionValue _rcmdPickingCls;
    public ConditionValue xdfgetRcmdPickingCls()
    { if (_rcmdPickingCls == null) { _rcmdPickingCls = nCV(); }
      return _rcmdPickingCls; }
    protected ConditionValue xgetCValueRcmdPickingCls() { return xdfgetRcmdPickingCls(); }

    /**
     * Add order-by as ascend. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_RcmdPickingCls_Asc() { regOBA("RCMD_PICKING_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_RcmdPickingCls_Desc() { regOBD("RCMD_PICKING_CLS"); return this; }

    protected ConditionValue _packingNum;
    public ConditionValue xdfgetPackingNum()
    { if (_packingNum == null) { _packingNum = nCV(); }
      return _packingNum; }
    protected ConditionValue xgetCValuePackingNum() { return xdfgetPackingNum(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_PackingNum_Asc() { regOBA("PACKING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_PackingNum_Desc() { regOBD("PACKING_NUM"); return this; }

    protected ConditionValue _workVolume;
    public ConditionValue xdfgetWorkVolume()
    { if (_workVolume == null) { _workVolume = nCV(); }
      return _workVolume; }
    protected ConditionValue xgetCValueWorkVolume() { return xdfgetWorkVolume(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_WorkVolume_Asc() { regOBA("WORK_VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_WorkVolume_Desc() { regOBD("WORK_VOLUME"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _deliveryCourseNm;
    public ConditionValue xdfgetDeliveryCourseNm()
    { if (_deliveryCourseNm == null) { _deliveryCourseNm = nCV(); }
      return _deliveryCourseNm; }
    protected ConditionValue xgetCValueDeliveryCourseNm() { return xdfgetDeliveryCourseNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_DeliveryCourseNm_Asc() { regOBA("DELIVERY_COURSE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_DeliveryCourseNm_Desc() { regOBD("DELIVERY_COURSE_NM"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierNm;
    public ConditionValue xdfgetCarrierNm()
    { if (_carrierNm == null) { _carrierNm = nCV(); }
      return _carrierNm; }
    protected ConditionValue xgetCValueCarrierNm() { return xdfgetCarrierNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_EmergencyFlg_Asc() { regOBA("EMERGENCY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_EmergencyFlg_Desc() { regOBD("EMERGENCY_FLG"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPicMthdRcmdCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPicMthdRcmdCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPicMthdRcmdCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPicMthdRcmdCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPicMthdRcmdCQ bq = (TPicMthdRcmdCQ)bqs;
        TPicMthdRcmdCQ uq = (TPicMthdRcmdCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryBClassDtlByRcmdPickingCls()) {
            uq.queryBClassDtlByRcmdPickingCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByRcmdPickingCls(), uq.queryBClassDtlByRcmdPickingCls());
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
        String nrp = xresolveNRP("T_PIC_MTHD_RCMD", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_PIC_MTHD_RCMD", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RCMD_PICKING_CLS, named 'BClassDtlByRcmdPickingCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByRcmdPickingCls() {
        return xdfgetConditionQueryBClassDtlByRcmdPickingCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByRcmdPickingCls() {
        String prop = "bClassDtlByRcmdPickingCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByRcmdPickingCls()); xsetupOuterJoinBClassDtlByRcmdPickingCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByRcmdPickingCls() {
        String nrp = xresolveNRP("T_PIC_MTHD_RCMD", "bClassDtlByRcmdPickingCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByRcmdPickingCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByRcmdPickingCls() { xregOutJo("bClassDtlByRcmdPickingCls"); }
    public boolean hasConditionQueryBClassDtlByRcmdPickingCls() { return xhasQueRlMap("bClassDtlByRcmdPickingCls"); }

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
        String nrp = xresolveNRP("T_PIC_MTHD_RCMD", "bClassDtlByEmergencyFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TPicMthdRcmdCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPicMthdRcmdCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPicMthdRcmdCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPicMthdRcmdCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPicMthdRcmdCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPicMthdRcmdCQ> _myselfExistsMap;
    public Map<String, TPicMthdRcmdCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPicMthdRcmdCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPicMthdRcmdCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPicMthdRcmdCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPicMthdRcmdCB.class.getName(); }
    protected String xCQ() { return TPicMthdRcmdCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
