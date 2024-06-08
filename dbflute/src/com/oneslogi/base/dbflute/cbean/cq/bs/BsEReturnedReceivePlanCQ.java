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
 * The base condition-query of E_RETURNED_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class BsEReturnedReceivePlanCQ extends AbstractBsEReturnedReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EReturnedReceivePlanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEReturnedReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_RETURNED_RECEIVE_PLAN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EReturnedReceivePlanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EReturnedReceivePlanCIQ xcreateCIQ() {
        EReturnedReceivePlanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EReturnedReceivePlanCIQ xnewCIQ() {
        return new EReturnedReceivePlanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_RETURNED_RECEIVE_PLAN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EReturnedReceivePlanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EReturnedReceivePlanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _returnedReceivePlanId;
    public ConditionValue xdfgetReturnedReceivePlanId()
    { if (_returnedReceivePlanId == null) { _returnedReceivePlanId = nCV(); }
      return _returnedReceivePlanId; }
    protected ConditionValue xgetCValueReturnedReceivePlanId() { return xdfgetReturnedReceivePlanId(); }

    /**
     * Add order-by as ascend. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReturnedReceivePlanId_Asc() { regOBA("RETURNED_RECEIVE_PLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReturnedReceivePlanId_Desc() { regOBD("RETURNED_RECEIVE_PLAN_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _headerFlg;
    public ConditionValue xdfgetHeaderFlg()
    { if (_headerFlg == null) { _headerFlg = nCV(); }
      return _headerFlg; }
    protected ConditionValue xgetCValueHeaderFlg() { return xdfgetHeaderFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HeaderFlg_Asc() { regOBA("HEADER_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HeaderFlg_Desc() { regOBD("HEADER_FLG"); return this; }

    protected ConditionValue _sortBsCd;
    public ConditionValue xdfgetSortBsCd()
    { if (_sortBsCd == null) { _sortBsCd = nCV(); }
      return _sortBsCd; }
    protected ConditionValue xgetCValueSortBsCd() { return xdfgetSortBsCd(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_BS_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SortBsCd_Asc() { regOBA("SORT_BS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_BS_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SortBsCd_Desc() { regOBD("SORT_BS_CD"); return this; }

    protected ConditionValue _delivayCenterCd;
    public ConditionValue xdfgetDelivayCenterCd()
    { if (_delivayCenterCd == null) { _delivayCenterCd = nCV(); }
      return _delivayCenterCd; }
    protected ConditionValue xgetCValueDelivayCenterCd() { return xdfgetDelivayCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DelivayCenterCd_Asc() { regOBA("DELIVAY_CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DelivayCenterCd_Desc() { regOBD("DELIVAY_CENTER_CD"); return this; }

    protected ConditionValue _orderGroup;
    public ConditionValue xdfgetOrderGroup()
    { if (_orderGroup == null) { _orderGroup = nCV(); }
      return _orderGroup; }
    protected ConditionValue xgetCValueOrderGroup() { return xdfgetOrderGroup(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_GROUP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_OrderGroup_Asc() { regOBA("ORDER_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_GROUP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_OrderGroup_Desc() { regOBD("ORDER_GROUP"); return this; }

    protected ConditionValue _saleDatetime;
    public ConditionValue xdfgetSaleDatetime()
    { if (_saleDatetime == null) { _saleDatetime = nCV(); }
      return _saleDatetime; }
    protected ConditionValue xgetCValueSaleDatetime() { return xdfgetSaleDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * SALE_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SaleDatetime_Asc() { regOBA("SALE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALE_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SaleDatetime_Desc() { regOBD("SALE_DATETIME"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _slipType;
    public ConditionValue xdfgetSlipType()
    { if (_slipType == null) { _slipType = nCV(); }
      return _slipType; }
    protected ConditionValue xgetCValueSlipType() { return xdfgetSlipType(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SlipType_Asc() { regOBA("SLIP_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SlipType_Desc() { regOBD("SLIP_TYPE"); return this; }

    protected ConditionValue _slipNo;
    public ConditionValue xdfgetSlipNo()
    { if (_slipNo == null) { _slipNo = nCV(); }
      return _slipNo; }
    protected ConditionValue xgetCValueSlipNo() { return xdfgetSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SlipNo_Asc() { regOBA("SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SlipNo_Desc() { regOBD("SLIP_NO"); return this; }

    protected ConditionValue _sequenceNo;
    public ConditionValue xdfgetSequenceNo()
    { if (_sequenceNo == null) { _sequenceNo = nCV(); }
      return _sequenceNo; }
    protected ConditionValue xgetCValueSequenceNo() { return xdfgetSequenceNo(); }

    /**
     * Add order-by as ascend. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SequenceNo_Asc() { regOBA("SEQUENCE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SequenceNo_Desc() { regOBD("SEQUENCE_NO"); return this; }

    protected ConditionValue _orderDate;
    public ConditionValue xdfgetOrderDate()
    { if (_orderDate == null) { _orderDate = nCV(); }
      return _orderDate; }
    protected ConditionValue xgetCValueOrderDate() { return xdfgetOrderDate(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_OrderDate_Asc() { regOBA("ORDER_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_OrderDate_Desc() { regOBD("ORDER_DATE"); return this; }

    protected ConditionValue _shipingDate;
    public ConditionValue xdfgetShipingDate()
    { if (_shipingDate == null) { _shipingDate = nCV(); }
      return _shipingDate; }
    protected ConditionValue xgetCValueShipingDate() { return xdfgetShipingDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPING_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ShipingDate_Asc() { regOBA("SHIPING_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPING_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ShipingDate_Desc() { regOBD("SHIPING_DATE"); return this; }

    protected ConditionValue _otorgcd;
    public ConditionValue xdfgetOtorgcd()
    { if (_otorgcd == null) { _otorgcd = nCV(); }
      return _otorgcd; }
    protected ConditionValue xgetCValueOtorgcd() { return xdfgetOtorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * OTORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Otorgcd_Asc() { regOBA("OTORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Otorgcd_Desc() { regOBD("OTORGCD"); return this; }

    protected ConditionValue _ordorgcd;
    public ConditionValue xdfgetOrdorgcd()
    { if (_ordorgcd == null) { _ordorgcd = nCV(); }
      return _ordorgcd; }
    protected ConditionValue xgetCValueOrdorgcd() { return xdfgetOrdorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Ordorgcd_Asc() { regOBA("ORDORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Ordorgcd_Desc() { regOBD("ORDORGCD"); return this; }

    protected ConditionValue _rlybscd;
    public ConditionValue xdfgetRlybscd()
    { if (_rlybscd == null) { _rlybscd = nCV(); }
      return _rlybscd; }
    protected ConditionValue xgetCValueRlybscd() { return xdfgetRlybscd(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Rlybscd_Asc() { regOBA("RLYBSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Rlybscd_Desc() { regOBD("RLYBSCD"); return this; }

    protected ConditionValue _directionCd;
    public ConditionValue xdfgetDirectionCd()
    { if (_directionCd == null) { _directionCd = nCV(); }
      return _directionCd; }
    protected ConditionValue xgetCValueDirectionCd() { return xdfgetDirectionCd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DirectionCd_Asc() { regOBA("DIRECTION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DirectionCd_Desc() { regOBD("DIRECTION_CD"); return this; }

    protected ConditionValue _pistonId;
    public ConditionValue xdfgetPistonId()
    { if (_pistonId == null) { _pistonId = nCV(); }
      return _pistonId; }
    protected ConditionValue xgetCValuePistonId() { return xdfgetPistonId(); }

    /**
     * Add order-by as ascend. <br>
     * PISTON_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_PistonId_Asc() { regOBA("PISTON_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTON_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_PistonId_Desc() { regOBD("PISTON_ID"); return this; }

    protected ConditionValue _delivalyRank;
    public ConditionValue xdfgetDelivalyRank()
    { if (_delivalyRank == null) { _delivalyRank = nCV(); }
      return _delivalyRank; }
    protected ConditionValue xgetCValueDelivalyRank() { return xdfgetDelivalyRank(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DelivalyRank_Asc() { regOBA("DELIVALY_RANK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DelivalyRank_Desc() { regOBD("DELIVALY_RANK"); return this; }

    protected ConditionValue _bulkDelivalyNo;
    public ConditionValue xdfgetBulkDelivalyNo()
    { if (_bulkDelivalyNo == null) { _bulkDelivalyNo = nCV(); }
      return _bulkDelivalyNo; }
    protected ConditionValue xgetCValueBulkDelivalyNo() { return xdfgetBulkDelivalyNo(); }

    /**
     * Add order-by as ascend. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_BulkDelivalyNo_Asc() { regOBA("BULK_DELIVALY_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_BulkDelivalyNo_Desc() { regOBD("BULK_DELIVALY_NO"); return this; }

    protected ConditionValue _divmtd;
    public ConditionValue xdfgetDivmtd()
    { if (_divmtd == null) { _divmtd = nCV(); }
      return _divmtd; }
    protected ConditionValue xgetCValueDivmtd() { return xdfgetDivmtd(); }

    /**
     * Add order-by as ascend. <br>
     * DIVMTD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Divmtd_Asc() { regOBA("DIVMTD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIVMTD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Divmtd_Desc() { regOBD("DIVMTD"); return this; }

    protected ConditionValue _zzhdvrid;
    public ConditionValue xdfgetZzhdvrid()
    { if (_zzhdvrid == null) { _zzhdvrid = nCV(); }
      return _zzhdvrid; }
    protected ConditionValue xgetCValueZzhdvrid() { return xdfgetZzhdvrid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZHDVRID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzhdvrid_Asc() { regOBA("ZZHDVRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZHDVRID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzhdvrid_Desc() { regOBD("ZZHDVRID"); return this; }

    protected ConditionValue _customerNm;
    public ConditionValue xdfgetCustomerNm()
    { if (_customerNm == null) { _customerNm = nCV(); }
      return _customerNm; }
    protected ConditionValue xgetCValueCustomerNm() { return xdfgetCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

    protected ConditionValue _headerPriceSale;
    public ConditionValue xdfgetHeaderPriceSale()
    { if (_headerPriceSale == null) { _headerPriceSale = nCV(); }
      return _headerPriceSale; }
    protected ConditionValue xgetCValueHeaderPriceSale() { return xdfgetHeaderPriceSale(); }

    /**
     * Add order-by as ascend. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HeaderPriceSale_Asc() { regOBA("HEADER_PRICE_SALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HeaderPriceSale_Desc() { regOBD("HEADER_PRICE_SALE"); return this; }

    protected ConditionValue _zregprcc;
    public ConditionValue xdfgetZregprcc()
    { if (_zregprcc == null) { _zregprcc = nCV(); }
      return _zregprcc; }
    protected ConditionValue xgetCValueZregprcc() { return xdfgetZregprcc(); }

    /**
     * Add order-by as ascend. <br>
     * ZREGPRCC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zregprcc_Asc() { regOBA("ZREGPRCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZREGPRCC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zregprcc_Desc() { regOBD("ZREGPRCC"); return this; }

    protected ConditionValue _tax;
    public ConditionValue xdfgetTax()
    { if (_tax == null) { _tax = nCV(); }
      return _tax; }
    protected ConditionValue xgetCValueTax() { return xdfgetTax(); }

    /**
     * Add order-by as ascend. <br>
     * TAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

    protected ConditionValue _zzgodfpc;
    public ConditionValue xdfgetZzgodfpc()
    { if (_zzgodfpc == null) { _zzgodfpc = nCV(); }
      return _zzgodfpc; }
    protected ConditionValue xgetCValueZzgodfpc() { return xdfgetZzgodfpc(); }

    /**
     * Add order-by as ascend. <br>
     * ZZGODFPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzgodfpc_Asc() { regOBA("ZZGODFPC"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZGODFPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzgodfpc_Desc() { regOBD("ZZGODFPC"); return this; }

    protected ConditionValue _zzgodspc;
    public ConditionValue xdfgetZzgodspc()
    { if (_zzgodspc == null) { _zzgodspc = nCV(); }
      return _zzgodspc; }
    protected ConditionValue xgetCValueZzgodspc() { return xdfgetZzgodspc(); }

    /**
     * Add order-by as ascend. <br>
     * ZZGODSPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzgodspc_Asc() { regOBA("ZZGODSPC"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZGODSPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzgodspc_Desc() { regOBD("ZZGODSPC"); return this; }

    protected ConditionValue _zzgodctx;
    public ConditionValue xdfgetZzgodctx()
    { if (_zzgodctx == null) { _zzgodctx = nCV(); }
      return _zzgodctx; }
    protected ConditionValue xgetCValueZzgodctx() { return xdfgetZzgodctx(); }

    /**
     * Add order-by as ascend. <br>
     * ZZGODCTX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzgodctx_Asc() { regOBA("ZZGODCTX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZGODCTX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Zzgodctx_Desc() { regOBD("ZZGODCTX"); return this; }

    protected ConditionValue _companyCd;
    public ConditionValue xdfgetCompanyCd()
    { if (_companyCd == null) { _companyCd = nCV(); }
      return _companyCd; }
    protected ConditionValue xgetCValueCompanyCd() { return xdfgetCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CompanyCd_Asc() { regOBA("COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CompanyCd_Desc() { regOBD("COMPANY_CD"); return this; }

    protected ConditionValue _saleType;
    public ConditionValue xdfgetSaleType()
    { if (_saleType == null) { _saleType = nCV(); }
      return _saleType; }
    protected ConditionValue xgetCValueSaleType() { return xdfgetSaleType(); }

    /**
     * Add order-by as ascend. <br>
     * SALE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SaleType_Asc() { regOBA("SALE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_SaleType_Desc() { regOBD("SALE_TYPE"); return this; }

    protected ConditionValue _hvrtReason;
    public ConditionValue xdfgetHvrtReason()
    { if (_hvrtReason == null) { _hvrtReason = nCV(); }
      return _hvrtReason; }
    protected ConditionValue xgetCValueHvrtReason() { return xdfgetHvrtReason(); }

    /**
     * Add order-by as ascend. <br>
     * HVRT_REASON: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HvrtReason_Asc() { regOBA("HVRT_REASON"); return this; }

    /**
     * Add order-by as descend. <br>
     * HVRT_REASON: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HvrtReason_Desc() { regOBD("HVRT_REASON"); return this; }

    protected ConditionValue _hvrtInoutDate;
    public ConditionValue xdfgetHvrtInoutDate()
    { if (_hvrtInoutDate == null) { _hvrtInoutDate = nCV(); }
      return _hvrtInoutDate; }
    protected ConditionValue xgetCValueHvrtInoutDate() { return xdfgetHvrtInoutDate(); }

    /**
     * Add order-by as ascend. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HvrtInoutDate_Asc() { regOBA("HVRT_INOUT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HvrtInoutDate_Desc() { regOBD("HVRT_INOUT_DATE"); return this; }

    protected ConditionValue _cngPrtSlipNo;
    public ConditionValue xdfgetCngPrtSlipNo()
    { if (_cngPrtSlipNo == null) { _cngPrtSlipNo = nCV(); }
      return _cngPrtSlipNo; }
    protected ConditionValue xgetCValueCngPrtSlipNo() { return xdfgetCngPrtSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CngPrtSlipNo_Asc() { regOBA("CNG_PRT_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_CngPrtSlipNo_Desc() { regOBD("CNG_PRT_SLIP_NO"); return this; }

    protected ConditionValue _processType;
    public ConditionValue xdfgetProcessType()
    { if (_processType == null) { _processType = nCV(); }
      return _processType; }
    protected ConditionValue xgetCValueProcessType() { return xdfgetProcessType(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ProcessType_Asc() { regOBA("PROCESS_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ProcessType_Desc() { regOBD("PROCESS_TYPE"); return this; }

    protected ConditionValue _eosOrdAftFlg;
    public ConditionValue xdfgetEosOrdAftFlg()
    { if (_eosOrdAftFlg == null) { _eosOrdAftFlg = nCV(); }
      return _eosOrdAftFlg; }
    protected ConditionValue xgetCValueEosOrdAftFlg() { return xdfgetEosOrdAftFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_EosOrdAftFlg_Asc() { regOBA("EOS_ORD_AFT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_EosOrdAftFlg_Desc() { regOBD("EOS_ORD_AFT_FLG"); return this; }

    protected ConditionValue _eosSlipNo;
    public ConditionValue xdfgetEosSlipNo()
    { if (_eosSlipNo == null) { _eosSlipNo = nCV(); }
      return _eosSlipNo; }
    protected ConditionValue xgetCValueEosSlipNo() { return xdfgetEosSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_EosSlipNo_Asc() { regOBA("EOS_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_EosSlipNo_Desc() { regOBD("EOS_SLIP_NO"); return this; }

    protected ConditionValue _hdrdBxType;
    public ConditionValue xdfgetHdrdBxType()
    { if (_hdrdBxType == null) { _hdrdBxType = nCV(); }
      return _hdrdBxType; }
    protected ConditionValue xgetCValueHdrdBxType() { return xdfgetHdrdBxType(); }

    /**
     * Add order-by as ascend. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HdrdBxType_Asc() { regOBA("HDRD_BX_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_HdrdBxType_Desc() { regOBD("HDRD_BX_TYPE"); return this; }

    protected ConditionValue _inotRfslType;
    public ConditionValue xdfgetInotRfslType()
    { if (_inotRfslType == null) { _inotRfslType = nCV(); }
      return _inotRfslType; }
    protected ConditionValue xgetCValueInotRfslType() { return xdfgetInotRfslType(); }

    /**
     * Add order-by as ascend. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_InotRfslType_Asc() { regOBA("INOT_RFSL_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_InotRfslType_Desc() { regOBD("INOT_RFSL_TYPE"); return this; }

    protected ConditionValue _bxMntRfslType;
    public ConditionValue xdfgetBxMntRfslType()
    { if (_bxMntRfslType == null) { _bxMntRfslType = nCV(); }
      return _bxMntRfslType; }
    protected ConditionValue xgetCValueBxMntRfslType() { return xdfgetBxMntRfslType(); }

    /**
     * Add order-by as ascend. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_BxMntRfslType_Asc() { regOBA("BX_MNT_RFSL_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_BxMntRfslType_Desc() { regOBD("BX_MNT_RFSL_TYPE"); return this; }

    protected ConditionValue _reportMerfeTiming;
    public ConditionValue xdfgetReportMerfeTiming()
    { if (_reportMerfeTiming == null) { _reportMerfeTiming = nCV(); }
      return _reportMerfeTiming; }
    protected ConditionValue xgetCValueReportMerfeTiming() { return xdfgetReportMerfeTiming(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReportMerfeTiming_Asc() { regOBA("REPORT_MERFE_TIMING"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReportMerfeTiming_Desc() { regOBD("REPORT_MERFE_TIMING"); return this; }

    protected ConditionValue _reportOutDatetime;
    public ConditionValue xdfgetReportOutDatetime()
    { if (_reportOutDatetime == null) { _reportOutDatetime = nCV(); }
      return _reportOutDatetime; }
    protected ConditionValue xgetCValueReportOutDatetime() { return xdfgetReportOutDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReportOutDatetime_Asc() { regOBA("REPORT_OUT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ReportOutDatetime_Desc() { regOBD("REPORT_OUT_DATETIME"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _kwmeng;
    public ConditionValue xdfgetKwmeng()
    { if (_kwmeng == null) { _kwmeng = nCV(); }
      return _kwmeng; }
    protected ConditionValue xgetCValueKwmeng() { return xdfgetKwmeng(); }

    /**
     * Add order-by as ascend. <br>
     * KWMENG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Kwmeng_Asc() { regOBA("KWMENG"); return this; }

    /**
     * Add order-by as descend. <br>
     * KWMENG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_Kwmeng_Desc() { regOBD("KWMENG"); return this; }

    protected ConditionValue _statusCd;
    public ConditionValue xdfgetStatusCd()
    { if (_statusCd == null) { _statusCd = nCV(); }
      return _statusCd; }
    protected ConditionValue xgetCValueStatusCd() { return xdfgetStatusCd(); }

    /**
     * Add order-by as ascend. <br>
     * STATUS_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_StatusCd_Asc() { regOBA("STATUS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATUS_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_StatusCd_Desc() { regOBD("STATUS_CD"); return this; }

    protected ConditionValue _stgVal;
    public ConditionValue xdfgetStgVal()
    { if (_stgVal == null) { _stgVal = nCV(); }
      return _stgVal; }
    protected ConditionValue xgetCValueStgVal() { return xdfgetStgVal(); }

    /**
     * Add order-by as ascend. <br>
     * STG_VAL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_StgVal_Asc() { regOBA("STG_VAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * STG_VAL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_StgVal_Desc() { regOBD("STG_VAL"); return this; }

    protected ConditionValue _detailPriceSale;
    public ConditionValue xdfgetDetailPriceSale()
    { if (_detailPriceSale == null) { _detailPriceSale = nCV(); }
      return _detailPriceSale; }
    protected ConditionValue xgetCValueDetailPriceSale() { return xdfgetDetailPriceSale(); }

    /**
     * Add order-by as ascend. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DetailPriceSale_Asc() { regOBA("DETAIL_PRICE_SALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DetailPriceSale_Desc() { regOBD("DETAIL_PRICE_SALE"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEReturnedReceivePlanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEReturnedReceivePlanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEReturnedReceivePlanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEReturnedReceivePlanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, EReturnedReceivePlanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EReturnedReceivePlanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EReturnedReceivePlanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EReturnedReceivePlanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EReturnedReceivePlanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EReturnedReceivePlanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EReturnedReceivePlanCQ> _myselfExistsMap;
    public Map<String, EReturnedReceivePlanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EReturnedReceivePlanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EReturnedReceivePlanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EReturnedReceivePlanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EReturnedReceivePlanCB.class.getName(); }
    protected String xCQ() { return EReturnedReceivePlanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
