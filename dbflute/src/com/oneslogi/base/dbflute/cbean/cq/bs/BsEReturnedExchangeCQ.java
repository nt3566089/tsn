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
 * The base condition-query of E_RETURNED_EXCHANGE.
 * @author DBFlute(AutoGenerator)
 */
public class BsEReturnedExchangeCQ extends AbstractBsEReturnedExchangeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EReturnedExchangeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEReturnedExchangeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_RETURNED_EXCHANGE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EReturnedExchangeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EReturnedExchangeCIQ xcreateCIQ() {
        EReturnedExchangeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EReturnedExchangeCIQ xnewCIQ() {
        return new EReturnedExchangeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_RETURNED_EXCHANGE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EReturnedExchangeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EReturnedExchangeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _returnedExchangeId;
    public ConditionValue xdfgetReturnedExchangeId()
    { if (_returnedExchangeId == null) { _returnedExchangeId = nCV(); }
      return _returnedExchangeId; }
    protected ConditionValue xgetCValueReturnedExchangeId() { return xdfgetReturnedExchangeId(); }

    /**
     * Add order-by as ascend. <br>
     * RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_ReturnedExchangeId_Asc() { regOBA("RETURNED_EXCHANGE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_ReturnedExchangeId_Desc() { regOBD("RETURNED_EXCHANGE_ID"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _rcvtype;
    public ConditionValue xdfgetRcvtype()
    { if (_rcvtype == null) { _rcvtype = nCV(); }
      return _rcvtype; }
    protected ConditionValue xgetCValueRcvtype() { return xdfgetRcvtype(); }

    /**
     * Add order-by as ascend. <br>
     * RCVTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Rcvtype_Asc() { regOBA("RCVTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Rcvtype_Desc() { regOBD("RCVTYPE"); return this; }

    protected ConditionValue _syhnKbn;
    public ConditionValue xdfgetSyhnKbn()
    { if (_syhnKbn == null) { _syhnKbn = nCV(); }
      return _syhnKbn; }
    protected ConditionValue xgetCValueSyhnKbn() { return xdfgetSyhnKbn(); }

    /**
     * Add order-by as ascend. <br>
     * SYHN_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_SyhnKbn_Asc() { regOBA("SYHN_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYHN_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_SyhnKbn_Desc() { regOBD("SYHN_KBN"); return this; }

    protected ConditionValue _recordType;
    public ConditionValue xdfgetRecordType()
    { if (_recordType == null) { _recordType = nCV(); }
      return _recordType; }
    protected ConditionValue xgetCValueRecordType() { return xdfgetRecordType(); }

    /**
     * Add order-by as ascend. <br>
     * RECORD_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_RecordType_Asc() { regOBA("RECORD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECORD_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_RecordType_Desc() { regOBD("RECORD_TYPE"); return this; }

    protected ConditionValue _supplierrcvno;
    public ConditionValue xdfgetSupplierrcvno()
    { if (_supplierrcvno == null) { _supplierrcvno = nCV(); }
      return _supplierrcvno; }
    protected ConditionValue xgetCValueSupplierrcvno() { return xdfgetSupplierrcvno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _workType;
    public ConditionValue xdfgetWorkType()
    { if (_workType == null) { _workType = nCV(); }
      return _workType; }
    protected ConditionValue xgetCValueWorkType() { return xdfgetWorkType(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_WorkType_Asc() { regOBA("WORK_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_WorkType_Desc() { regOBD("WORK_TYPE"); return this; }

    protected ConditionValue _otherrefno1;
    public ConditionValue xdfgetOtherrefno1()
    { if (_otherrefno1 == null) { _otherrefno1 = nCV(); }
      return _otherrefno1; }
    protected ConditionValue xgetCValueOtherrefno1() { return xdfgetOtherrefno1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

    protected ConditionValue _otherrefno3;
    public ConditionValue xdfgetOtherrefno3()
    { if (_otherrefno3 == null) { _otherrefno3 = nCV(); }
      return _otherrefno3; }
    protected ConditionValue xgetCValueOtherrefno3() { return xdfgetOtherrefno3(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Otherrefno3_Asc() { regOBA("OTHERREFNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Otherrefno3_Desc() { regOBD("OTHERREFNO3"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _fromaddress2;
    public ConditionValue xdfgetFromaddress2()
    { if (_fromaddress2 == null) { _fromaddress2 = nCV(); }
      return _fromaddress2; }
    protected ConditionValue xgetCValueFromaddress2() { return xdfgetFromaddress2(); }

    /**
     * Add order-by as ascend. <br>
     * FROMADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Fromaddress2_Asc() { regOBA("FROMADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Fromaddress2_Desc() { regOBD("FROMADDRESS2"); return this; }

    protected ConditionValue _fromaddress1;
    public ConditionValue xdfgetFromaddress1()
    { if (_fromaddress1 == null) { _fromaddress1 = nCV(); }
      return _fromaddress1; }
    protected ConditionValue xgetCValueFromaddress1() { return xdfgetFromaddress1(); }

    /**
     * Add order-by as ascend. <br>
     * FROMADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Fromaddress1_Asc() { regOBA("FROMADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Fromaddress1_Desc() { regOBD("FROMADDRESS1"); return this; }

    protected ConditionValue _ifitemcd;
    public ConditionValue xdfgetIfitemcd()
    { if (_ifitemcd == null) { _ifitemcd = nCV(); }
      return _ifitemcd; }
    protected ConditionValue xgetCValueIfitemcd() { return xdfgetIfitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * IFITEMCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Ifitemcd_Asc() { regOBA("IFITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEMCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Ifitemcd_Desc() { regOBD("IFITEMCD"); return this; }

    protected ConditionValue _receivedqty1;
    public ConditionValue xdfgetReceivedqty1()
    { if (_receivedqty1 == null) { _receivedqty1 = nCV(); }
      return _receivedqty1; }
    protected ConditionValue xgetCValueReceivedqty1() { return xdfgetReceivedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Receivedqty1_Asc() { regOBA("RECEIVEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Receivedqty1_Desc() { regOBD("RECEIVEDQTY1"); return this; }

    protected ConditionValue _priceWholesale;
    public ConditionValue xdfgetPriceWholesale()
    { if (_priceWholesale == null) { _priceWholesale = nCV(); }
      return _priceWholesale; }
    protected ConditionValue xgetCValuePriceWholesale() { return xdfgetPriceWholesale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_WHOLESALE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_PriceWholesale_Asc() { regOBA("PRICE_WHOLESALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_WHOLESALE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_PriceWholesale_Desc() { regOBD("PRICE_WHOLESALE"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEReturnedExchangeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEReturnedExchangeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEReturnedExchangeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEReturnedExchangeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EReturnedExchangeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EReturnedExchangeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EReturnedExchangeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EReturnedExchangeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EReturnedExchangeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EReturnedExchangeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EReturnedExchangeCQ> _myselfExistsMap;
    public Map<String, EReturnedExchangeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EReturnedExchangeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EReturnedExchangeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EReturnedExchangeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EReturnedExchangeCB.class.getName(); }
    protected String xCQ() { return EReturnedExchangeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
