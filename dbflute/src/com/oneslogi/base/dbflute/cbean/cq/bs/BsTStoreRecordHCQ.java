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
 * The base condition-query of T_STORE_RECORD_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStoreRecordHCQ extends AbstractBsTStoreRecordHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStoreRecordHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreRecordHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_STORE_RECORD_H) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStoreRecordHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStoreRecordHCIQ xcreateCIQ() {
        TStoreRecordHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStoreRecordHCIQ xnewCIQ() {
        return new TStoreRecordHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_STORE_RECORD_H on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStoreRecordHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStoreRecordHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _storeRecordHId;
    public ConditionValue xdfgetStoreRecordHId()
    { if (_storeRecordHId == null) { _storeRecordHId = nCV(); }
      return _storeRecordHId; }
    protected ConditionValue xgetCValueStoreRecordHId() { return xdfgetStoreRecordHId(); }

    public Map<String, TStoreRecordBCQ> xdfgetStoreRecordHId_ExistsReferrer_TStoreRecordBList() { return xgetSQueMap("storeRecordHId_ExistsReferrer_TStoreRecordBList"); }
    public String keepStoreRecordHId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("storeRecordHId_ExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, TStoreRecordRCQ> xdfgetStoreRecordHId_ExistsReferrer_TStoreRecordRAsOne() { return xgetSQueMap("storeRecordHId_ExistsReferrer_TStoreRecordRAsOne"); }
    public String keepStoreRecordHId_ExistsReferrer_TStoreRecordRAsOne(TStoreRecordRCQ sq) { return xkeepSQue("storeRecordHId_ExistsReferrer_TStoreRecordRAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetStoreRecordHId_NotExistsReferrer_TStoreRecordBList() { return xgetSQueMap("storeRecordHId_NotExistsReferrer_TStoreRecordBList"); }
    public String keepStoreRecordHId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("storeRecordHId_NotExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, TStoreRecordRCQ> xdfgetStoreRecordHId_NotExistsReferrer_TStoreRecordRAsOne() { return xgetSQueMap("storeRecordHId_NotExistsReferrer_TStoreRecordRAsOne"); }
    public String keepStoreRecordHId_NotExistsReferrer_TStoreRecordRAsOne(TStoreRecordRCQ sq) { return xkeepSQue("storeRecordHId_NotExistsReferrer_TStoreRecordRAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetStoreRecordHId_SpecifyDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("storeRecordHId_SpecifyDerivedReferrer_TStoreRecordBList"); }
    public String keepStoreRecordHId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("storeRecordHId_SpecifyDerivedReferrer_TStoreRecordBList", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetStoreRecordHId_QueryDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("storeRecordHId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepStoreRecordHId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("storeRecordHId_QueryDerivedReferrer_TStoreRecordBList", sq); }
    public Map<String, Object> xdfgetStoreRecordHId_QueryDerivedReferrer_TStoreRecordBListParameter() { return xgetSQuePmMap("storeRecordHId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepStoreRecordHId_QueryDerivedReferrer_TStoreRecordBListParameter(Object pm) { return xkeepSQuePm("storeRecordHId_QueryDerivedReferrer_TStoreRecordBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_StoreRecordHId_Asc() { regOBA("STORE_RECORD_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_StoreRecordHId_Desc() { regOBD("STORE_RECORD_H_ID"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_InScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_InScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_InScopeRelation_TReceivePlanH", sq); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_NotInScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_NotInScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_NotInScopeRelation_TReceivePlanH", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_ClientReceiveNo_Asc() { regOBA("CLIENT_RECEIVE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_RECEIVE_NO: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_ClientReceiveNo_Desc() { regOBD("CLIENT_RECEIVE_NO"); return this; }

    protected ConditionValue _supplierId;
    public ConditionValue xdfgetSupplierId()
    { if (_supplierId == null) { _supplierId = nCV(); }
      return _supplierId; }
    protected ConditionValue xgetCValueSupplierId() { return xdfgetSupplierId(); }

    public Map<String, MCustomerCQ> getSupplierId_InScopeRelation_MCustomerBySupplierId() { return xgetSQueMap("supplierId_InScopeRelation_MCustomerBySupplierId"); }
    public String keepSupplierId_InScopeRelation_MCustomerBySupplierId(MCustomerCQ sq) { return xkeepSQue("supplierId_InScopeRelation_MCustomerBySupplierId", sq); }

    public Map<String, MCustomerCQ> getSupplierId_NotInScopeRelation_MCustomerBySupplierId() { return xgetSQueMap("supplierId_NotInScopeRelation_MCustomerBySupplierId"); }
    public String keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(MCustomerCQ sq) { return xkeepSQue("supplierId_NotInScopeRelation_MCustomerBySupplierId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_SupplierId_Asc() { regOBA("SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_SupplierId_Desc() { regOBD("SUPPLIER_ID"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    public Map<String, MCustomerCQ> getDepositId_InScopeRelation_MCustomerByDepositId() { return xgetSQueMap("depositId_InScopeRelation_MCustomerByDepositId"); }
    public String keepDepositId_InScopeRelation_MCustomerByDepositId(MCustomerCQ sq) { return xkeepSQue("depositId_InScopeRelation_MCustomerByDepositId", sq); }

    public Map<String, MCustomerCQ> getDepositId_NotInScopeRelation_MCustomerByDepositId() { return xgetSQueMap("depositId_NotInScopeRelation_MCustomerByDepositId"); }
    public String keepDepositId_NotInScopeRelation_MCustomerByDepositId(MCustomerCQ sq) { return xkeepSQue("depositId_NotInScopeRelation_MCustomerByDepositId", sq); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _storeRecordHComment;
    public ConditionValue xdfgetStoreRecordHComment()
    { if (_storeRecordHComment == null) { _storeRecordHComment = nCV(); }
      return _storeRecordHComment; }
    protected ConditionValue xgetCValueStoreRecordHComment() { return xdfgetStoreRecordHComment(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_RECORD_H_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_StoreRecordHComment_Asc() { regOBA("STORE_RECORD_H_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_RECORD_H_COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_StoreRecordHComment_Desc() { regOBD("STORE_RECORD_H_COMMENT"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStoreRecordHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTStoreRecordHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStoreRecordHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStoreRecordHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStoreRecordHCQ bq = (TStoreRecordHCQ)bqs;
        TStoreRecordHCQ uq = (TStoreRecordHCQ)uqs;
        if (bq.hasConditionQueryMCustomerByDepositId()) {
            uq.queryMCustomerByDepositId().reflectRelationOnUnionQuery(bq.queryMCustomerByDepositId(), uq.queryMCustomerByDepositId());
        }
        if (bq.hasConditionQueryTReceivePlanH()) {
            uq.queryTReceivePlanH().reflectRelationOnUnionQuery(bq.queryTReceivePlanH(), uq.queryTReceivePlanH());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCustomerBySupplierId()) {
            uq.queryMCustomerBySupplierId().reflectRelationOnUnionQuery(bq.queryMCustomerBySupplierId(), uq.queryMCustomerBySupplierId());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryTStoreRecordRAsOne()) {
            uq.queryTStoreRecordRAsOne().reflectRelationOnUnionQuery(bq.queryTStoreRecordRAsOne(), uq.queryTStoreRecordRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerByDepositId() {
        return xdfgetConditionQueryMCustomerByDepositId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerByDepositId() {
        String prop = "mCustomerByDepositId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerByDepositId()); xsetupOuterJoinMCustomerByDepositId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerByDepositId() {
        String nrp = xresolveNRP("T_STORE_RECORD_H", "mCustomerByDepositId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByDepositId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByDepositId() { xregOutJo("mCustomerByDepositId"); }
    public boolean hasConditionQueryMCustomerByDepositId() { return xhasQueRlMap("mCustomerByDepositId"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanHCQ queryTReceivePlanH() {
        return xdfgetConditionQueryTReceivePlanH();
    }
    public TReceivePlanHCQ xdfgetConditionQueryTReceivePlanH() {
        String prop = "tReceivePlanH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanH()); xsetupOuterJoinTReceivePlanH(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanHCQ xcreateQueryTReceivePlanH() {
        String nrp = xresolveNRP("T_STORE_RECORD_H", "tReceivePlanH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanH", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanH() { xregOutJo("tReceivePlanH"); }
    public boolean hasConditionQueryTReceivePlanH() { return xhasQueRlMap("tReceivePlanH"); }

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
        String nrp = xresolveNRP("T_STORE_RECORD_H", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerBySupplierId() {
        return xdfgetConditionQueryMCustomerBySupplierId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerBySupplierId() {
        String prop = "mCustomerBySupplierId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerBySupplierId()); xsetupOuterJoinMCustomerBySupplierId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerBySupplierId() {
        String nrp = xresolveNRP("T_STORE_RECORD_H", "mCustomerBySupplierId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerBySupplierId", nrp);
    }
    protected void xsetupOuterJoinMCustomerBySupplierId() { xregOutJo("mCustomerBySupplierId"); }
    public boolean hasConditionQueryMCustomerBySupplierId() { return xhasQueRlMap("mCustomerBySupplierId"); }

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
        String nrp = xresolveNRP("T_STORE_RECORD_H", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("T_STORE_RECORD_H", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

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
        String nrp = xresolveNRP("T_STORE_RECORD_H", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_STORE_RECORD_R by STORE_RECORD_H_ID, named 'TStoreRecordRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreRecordRCQ queryTStoreRecordRAsOne() { return xdfgetConditionQueryTStoreRecordRAsOne(); }
    public TStoreRecordRCQ xdfgetConditionQueryTStoreRecordRAsOne() {
        String prop = "tStoreRecordRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreRecordRAsOne()); xsetupOuterJoinTStoreRecordRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreRecordRCQ xcreateQueryTStoreRecordRAsOne() {
        String nrp = xresolveNRP("T_STORE_RECORD_H", "tStoreRecordRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreRecordRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreRecordRAsOne", nrp);
    }
    protected void xsetupOuterJoinTStoreRecordRAsOne() { xregOutJo("tStoreRecordRAsOne"); }
    public boolean hasConditionQueryTStoreRecordRAsOne() { return xhasQueRlMap("tStoreRecordRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStoreRecordHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStoreRecordHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStoreRecordHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStoreRecordHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStoreRecordHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStoreRecordHCQ> _myselfExistsMap;
    public Map<String, TStoreRecordHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStoreRecordHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStoreRecordHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStoreRecordHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStoreRecordHCB.class.getName(); }
    protected String xCQ() { return TStoreRecordHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
