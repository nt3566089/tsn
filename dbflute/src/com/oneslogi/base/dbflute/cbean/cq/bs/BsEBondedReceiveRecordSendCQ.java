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
 * The base condition-query of E_BONDED_RECEIVE_RECORD_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsEBondedReceiveRecordSendCQ extends AbstractBsEBondedReceiveRecordSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EBondedReceiveRecordSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEBondedReceiveRecordSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_BONDED_RECEIVE_RECORD_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EBondedReceiveRecordSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EBondedReceiveRecordSendCIQ xcreateCIQ() {
        EBondedReceiveRecordSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EBondedReceiveRecordSendCIQ xnewCIQ() {
        return new EBondedReceiveRecordSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_BONDED_RECEIVE_RECORD_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EBondedReceiveRecordSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EBondedReceiveRecordSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bondedReceiveRecordSendId;
    public ConditionValue xdfgetBondedReceiveRecordSendId()
    { if (_bondedReceiveRecordSendId == null) { _bondedReceiveRecordSendId = nCV(); }
      return _bondedReceiveRecordSendId; }
    protected ConditionValue xgetCValueBondedReceiveRecordSendId() { return xdfgetBondedReceiveRecordSendId(); }

    /**
     * Add order-by as ascend. <br>
     * BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_BondedReceiveRecordSendId_Asc() { regOBA("BONDED_RECEIVE_RECORD_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_BondedReceiveRecordSendId_Desc() { regOBD("BONDED_RECEIVE_RECORD_SEND_ID"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _fromsub;
    public ConditionValue xdfgetFromsub()
    { if (_fromsub == null) { _fromsub = nCV(); }
      return _fromsub; }
    protected ConditionValue xgetCValueFromsub() { return xdfgetFromsub(); }

    /**
     * Add order-by as ascend. <br>
     * FROMSUB: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Fromsub_Asc() { regOBA("FROMSUB"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMSUB: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Fromsub_Desc() { regOBD("FROMSUB"); return this; }

    protected ConditionValue _sbwarehousecd;
    public ConditionValue xdfgetSbwarehousecd()
    { if (_sbwarehousecd == null) { _sbwarehousecd = nCV(); }
      return _sbwarehousecd; }
    protected ConditionValue xgetCValueSbwarehousecd() { return xdfgetSbwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Sbwarehousecd_Asc() { regOBA("SBWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Sbwarehousecd_Desc() { regOBD("SBWAREHOUSECD"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

    protected ConditionValue _receivePlanDt;
    public ConditionValue xdfgetReceivePlanDt()
    { if (_receivePlanDt == null) { _receivePlanDt = nCV(); }
      return _receivePlanDt; }
    protected ConditionValue xgetCValueReceivePlanDt() { return xdfgetReceivePlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_ReceivePlanDt_Asc() { regOBA("RECEIVE_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_ReceivePlanDt_Desc() { regOBD("RECEIVE_PLAN_DT"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _receivedqty1Sum;
    public ConditionValue xdfgetReceivedqty1Sum()
    { if (_receivedqty1Sum == null) { _receivedqty1Sum = nCV(); }
      return _receivedqty1Sum; }
    protected ConditionValue xgetCValueReceivedqty1Sum() { return xdfgetReceivedqty1Sum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY1_SUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedqty1Sum_Asc() { regOBA("RECEIVEDQTY1_SUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY1_SUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedqty1Sum_Desc() { regOBD("RECEIVEDQTY1_SUM"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _carriersname;
    public ConditionValue xdfgetCarriersname()
    { if (_carriersname == null) { _carriersname = nCV(); }
      return _carriersname; }
    protected ConditionValue xgetCValueCarriersname() { return xdfgetCarriersname(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Carriersname_Asc() { regOBA("CARRIERSNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Carriersname_Desc() { regOBD("CARRIERSNAME"); return this; }

    protected ConditionValue _carrierwbno;
    public ConditionValue xdfgetCarrierwbno()
    { if (_carrierwbno == null) { _carrierwbno = nCV(); }
      return _carrierwbno; }
    protected ConditionValue xgetCValueCarrierwbno() { return xdfgetCarrierwbno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERWBNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

    protected ConditionValue _foreigncargoflg;
    public ConditionValue xdfgetForeigncargoflg()
    { if (_foreigncargoflg == null) { _foreigncargoflg = nCV(); }
      return _foreigncargoflg; }
    protected ConditionValue xgetCValueForeigncargoflg() { return xdfgetForeigncargoflg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _otherlot1;
    public ConditionValue xdfgetOtherlot1()
    { if (_otherlot1 == null) { _otherlot1 = nCV(); }
      return _otherlot1; }
    protected ConditionValue xgetCValueOtherlot1() { return xdfgetOtherlot1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_RecordType_Asc() { regOBA("RECORD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECORD_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_RecordType_Desc() { regOBD("RECORD_TYPE"); return this; }

    protected ConditionValue _domRefno;
    public ConditionValue xdfgetDomRefno()
    { if (_domRefno == null) { _domRefno = nCV(); }
      return _domRefno; }
    protected ConditionValue xgetCValueDomRefno() { return xdfgetDomRefno(); }

    /**
     * Add order-by as ascend. <br>
     * DOM_REFNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_DomRefno_Asc() { regOBA("DOM_REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DOM_REFNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_DomRefno_Desc() { regOBD("DOM_REFNO"); return this; }

    protected ConditionValue _jttsflg;
    public ConditionValue xdfgetJttsflg()
    { if (_jttsflg == null) { _jttsflg = nCV(); }
      return _jttsflg; }
    protected ConditionValue xgetCValueJttsflg() { return xdfgetJttsflg(); }

    /**
     * Add order-by as ascend. <br>
     * JTTSFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Jttsflg_Asc() { regOBA("JTTSFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * JTTSFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Jttsflg_Desc() { regOBD("JTTSFLG"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _transportType;
    public ConditionValue xdfgetTransportType()
    { if (_transportType == null) { _transportType = nCV(); }
      return _transportType; }
    protected ConditionValue xgetCValueTransportType() { return xdfgetTransportType(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_TransportType_Asc() { regOBA("TRANSPORT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_TransportType_Desc() { regOBD("TRANSPORT_TYPE"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _receivedatetime;
    public ConditionValue xdfgetReceivedatetime()
    { if (_receivedatetime == null) { _receivedatetime = nCV(); }
      return _receivedatetime; }
    protected ConditionValue xgetCValueReceivedatetime() { return xdfgetReceivedatetime(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedatetime_Asc() { regOBA("RECEIVEDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedatetime_Desc() { regOBD("RECEIVEDATETIME"); return this; }

    protected ConditionValue _lotno;
    public ConditionValue xdfgetLotno()
    { if (_lotno == null) { _lotno = nCV(); }
      return _lotno; }
    protected ConditionValue xgetCValueLotno() { return xdfgetLotno(); }

    /**
     * Add order-by as ascend. <br>
     * LOTNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lotno_Asc() { regOBA("LOTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Lotno_Desc() { regOBD("LOTNO"); return this; }

    protected ConditionValue _receivedqty2Sum;
    public ConditionValue xdfgetReceivedqty2Sum()
    { if (_receivedqty2Sum == null) { _receivedqty2Sum = nCV(); }
      return _receivedqty2Sum; }
    protected ConditionValue xgetCValueReceivedqty2Sum() { return xdfgetReceivedqty2Sum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY2_SUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedqty2Sum_Asc() { regOBA("RECEIVEDQTY2_SUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY2_SUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_Receivedqty2Sum_Desc() { regOBD("RECEIVEDQTY2_SUM"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedReceiveRecordSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEBondedReceiveRecordSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEBondedReceiveRecordSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EBondedReceiveRecordSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EBondedReceiveRecordSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EBondedReceiveRecordSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EBondedReceiveRecordSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EBondedReceiveRecordSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EBondedReceiveRecordSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EBondedReceiveRecordSendCQ> _myselfExistsMap;
    public Map<String, EBondedReceiveRecordSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EBondedReceiveRecordSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EBondedReceiveRecordSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EBondedReceiveRecordSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EBondedReceiveRecordSendCB.class.getName(); }
    protected String xCQ() { return EBondedReceiveRecordSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
