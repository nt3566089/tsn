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
 * The base condition-query of H_RECEIVE_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsHReceiveHCQ extends AbstractBsHReceiveHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HReceiveHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHReceiveHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from H_RECEIVE_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public HReceiveHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected HReceiveHCIQ xcreateCIQ() {
        HReceiveHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected HReceiveHCIQ xnewCIQ() {
        return new HReceiveHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join H_RECEIVE_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public HReceiveHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        HReceiveHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _storeRecordHId;
    public ConditionValue xdfgetStoreRecordHId()
    { if (_storeRecordHId == null) { _storeRecordHId = nCV(); }
      return _storeRecordHId; }
    protected ConditionValue xgetCValueStoreRecordHId() { return xdfgetStoreRecordHId(); }

    public Map<String, HReceiveBCQ> xdfgetStoreRecordHId_ExistsReferrer_HReceiveBList() { return xgetSQueMap("storeRecordHId_ExistsReferrer_HReceiveBList"); }
    public String keepStoreRecordHId_ExistsReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("storeRecordHId_ExistsReferrer_HReceiveBList", sq); }

    public Map<String, HReceiveBCQ> xdfgetStoreRecordHId_NotExistsReferrer_HReceiveBList() { return xgetSQueMap("storeRecordHId_NotExistsReferrer_HReceiveBList"); }
    public String keepStoreRecordHId_NotExistsReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("storeRecordHId_NotExistsReferrer_HReceiveBList", sq); }

    public Map<String, HReceiveBCQ> xdfgetStoreRecordHId_SpecifyDerivedReferrer_HReceiveBList() { return xgetSQueMap("storeRecordHId_SpecifyDerivedReferrer_HReceiveBList"); }
    public String keepStoreRecordHId_SpecifyDerivedReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("storeRecordHId_SpecifyDerivedReferrer_HReceiveBList", sq); }

    public Map<String, HReceiveBCQ> xdfgetStoreRecordHId_QueryDerivedReferrer_HReceiveBList() { return xgetSQueMap("storeRecordHId_QueryDerivedReferrer_HReceiveBList"); }
    public String keepStoreRecordHId_QueryDerivedReferrer_HReceiveBList(HReceiveBCQ sq) { return xkeepSQue("storeRecordHId_QueryDerivedReferrer_HReceiveBList", sq); }
    public Map<String, Object> xdfgetStoreRecordHId_QueryDerivedReferrer_HReceiveBListParameter() { return xgetSQuePmMap("storeRecordHId_QueryDerivedReferrer_HReceiveBList"); }
    public String keepStoreRecordHId_QueryDerivedReferrer_HReceiveBListParameter(Object pm) { return xkeepSQuePm("storeRecordHId_QueryDerivedReferrer_HReceiveBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_StoreRecordHId_Asc() { regOBA("STORE_RECORD_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_StoreRecordHId_Desc() { regOBD("STORE_RECORD_H_ID"); return this; }

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
    public BsHReceiveHCQ addOrderBy_HistDt_Asc() { regOBA("HIST_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_HistDt_Desc() { regOBD("HIST_DT"); return this; }

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
    public BsHReceiveHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsHReceiveHCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsHReceiveHCQ addOrderBy_ClientNm_Asc() { regOBA("CLIENT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ClientNm_Desc() { regOBD("CLIENT_NM"); return this; }

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
    public BsHReceiveHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsHReceiveHCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

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
    public BsHReceiveHCQ addOrderBy_CenterNm_Asc() { regOBA("CENTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_CenterNm_Desc() { regOBD("CENTER_NM"); return this; }

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
    public BsHReceiveHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _receivePlanDt;
    public ConditionValue xdfgetReceivePlanDt()
    { if (_receivePlanDt == null) { _receivePlanDt = nCV(); }
      return _receivePlanDt; }
    protected ConditionValue xgetCValueReceivePlanDt() { return xdfgetReceivePlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ReceivePlanDt_Asc() { regOBA("RECEIVE_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_DT: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ReceivePlanDt_Desc() { regOBD("RECEIVE_PLAN_DT"); return this; }

    protected ConditionValue _clientReceiveNo;
    public ConditionValue xdfgetClientReceiveNo()
    { if (_clientReceiveNo == null) { _clientReceiveNo = nCV(); }
      return _clientReceiveNo; }
    protected ConditionValue xgetCValueClientReceiveNo() { return xdfgetClientReceiveNo(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_RECEIVE_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ClientReceiveNo_Asc() { regOBA("CLIENT_RECEIVE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_RECEIVE_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ClientReceiveNo_Desc() { regOBD("CLIENT_RECEIVE_NO"); return this; }

    protected ConditionValue _receiveSlipNo;
    public ConditionValue xdfgetReceiveSlipNo()
    { if (_receiveSlipNo == null) { _receiveSlipNo = nCV(); }
      return _receiveSlipNo; }
    protected ConditionValue xgetCValueReceiveSlipNo() { return xdfgetReceiveSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_SLIP_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ReceiveSlipNo_Asc() { regOBA("RECEIVE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_SLIP_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ReceiveSlipNo_Desc() { regOBD("RECEIVE_SLIP_NO"); return this; }

    protected ConditionValue _supplierId;
    public ConditionValue xdfgetSupplierId()
    { if (_supplierId == null) { _supplierId = nCV(); }
      return _supplierId; }
    protected ConditionValue xgetCValueSupplierId() { return xdfgetSupplierId(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

    protected ConditionValue _supplierCd;
    public ConditionValue xdfgetSupplierCd()
    { if (_supplierCd == null) { _supplierCd = nCV(); }
      return _supplierCd; }
    protected ConditionValue xgetCValueSupplierCd() { return xdfgetSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

    protected ConditionValue _supplierNm;
    public ConditionValue xdfgetSupplierNm()
    { if (_supplierNm == null) { _supplierNm = nCV(); }
      return _supplierNm; }
    protected ConditionValue xgetCValueSupplierNm() { return xdfgetSupplierNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_SupplierNm_Asc() { regOBA("SUPPLIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_SupplierNm_Desc() { regOBD("SUPPLIER_NM"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _depositCd;
    public ConditionValue xdfgetDepositCd()
    { if (_depositCd == null) { _depositCd = nCV(); }
      return _depositCd; }
    protected ConditionValue xgetCValueDepositCd() { return xdfgetDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

    protected ConditionValue _depositNm;
    public ConditionValue xdfgetDepositNm()
    { if (_depositNm == null) { _depositNm = nCV(); }
      return _depositNm; }
    protected ConditionValue xgetCValueDepositNm() { return xdfgetDepositNm(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DepositNm_Asc() { regOBA("DEPOSIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DepositNm_Desc() { regOBD("DEPOSIT_NM"); return this; }

    protected ConditionValue _receiveDeliveryStatus;
    public ConditionValue xdfgetReceiveDeliveryStatus()
    { if (_receiveDeliveryStatus == null) { _receiveDeliveryStatus = nCV(); }
      return _receiveDeliveryStatus; }
    protected ConditionValue xgetCValueReceiveDeliveryStatus() { return xdfgetReceiveDeliveryStatus(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ReceiveDeliveryStatus_Asc() { regOBA("RECEIVE_DELIVERY_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ReceiveDeliveryStatus_Desc() { regOBD("RECEIVE_DELIVERY_STATUS"); return this; }

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
    public BsHReceiveHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsHReceiveHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsHReceiveHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsHReceiveHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsHReceiveHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsHReceiveHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsHReceiveHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsHReceiveHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsHReceiveHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsHReceiveHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsHReceiveHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsHReceiveHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        HReceiveHCQ bq = (HReceiveHCQ)bqs;
        HReceiveHCQ uq = (HReceiveHCQ)uqs;
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveDeliveryStatus()) {
            uq.queryBClassDtlByReceiveDeliveryStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveDeliveryStatus(), uq.queryBClassDtlByReceiveDeliveryStatus());
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
        String nrp = xresolveNRP("H_RECEIVE_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveDeliveryStatus() {
        return xdfgetConditionQueryBClassDtlByReceiveDeliveryStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveDeliveryStatus() {
        String prop = "bClassDtlByReceiveDeliveryStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveDeliveryStatus()); xsetupOuterJoinBClassDtlByReceiveDeliveryStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveDeliveryStatus() {
        String nrp = xresolveNRP("H_RECEIVE_H", "bClassDtlByReceiveDeliveryStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveDeliveryStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveDeliveryStatus() { xregOutJo("bClassDtlByReceiveDeliveryStatus"); }
    public boolean hasConditionQueryBClassDtlByReceiveDeliveryStatus() { return xhasQueRlMap("bClassDtlByReceiveDeliveryStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, HReceiveHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(HReceiveHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, HReceiveHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(HReceiveHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, HReceiveHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(HReceiveHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, HReceiveHCQ> _myselfExistsMap;
    public Map<String, HReceiveHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(HReceiveHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, HReceiveHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(HReceiveHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return HReceiveHCB.class.getName(); }
    protected String xCQ() { return HReceiveHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
