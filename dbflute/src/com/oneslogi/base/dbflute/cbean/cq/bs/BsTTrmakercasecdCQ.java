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
 * The base condition-query of T_TRMAKERCASECD.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrmakercasecdCQ extends AbstractBsTTrmakercasecdCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrmakercasecdCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrmakercasecdCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRMAKERCASECD) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrmakercasecdCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrmakercasecdCIQ xcreateCIQ() {
        TTrmakercasecdCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrmakercasecdCIQ xnewCIQ() {
        return new TTrmakercasecdCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRMAKERCASECD on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrmakercasecdCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrmakercasecdCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trmakercasecdId;
    public ConditionValue xdfgetTrmakercasecdId()
    { if (_trmakercasecdId == null) { _trmakercasecdId = nCV(); }
      return _trmakercasecdId; }
    protected ConditionValue xgetCValueTrmakercasecdId() { return xdfgetTrmakercasecdId(); }

    /**
     * Add order-by as ascend. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_TrmakercasecdId_Asc() { regOBA("TRMAKERCASECD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_TrmakercasecdId_Desc() { regOBD("TRMAKERCASECD_ID"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _senderLocation;
    public ConditionValue xdfgetSenderLocation()
    { if (_senderLocation == null) { _senderLocation = nCV(); }
      return _senderLocation; }
    protected ConditionValue xgetCValueSenderLocation() { return xdfgetSenderLocation(); }

    /**
     * Add order-by as ascend. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_SenderLocation_Asc() { regOBA("SENDER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_SenderLocation_Desc() { regOBD("SENDER_LOCATION"); return this; }

    protected ConditionValue _receiverLocation;
    public ConditionValue xdfgetReceiverLocation()
    { if (_receiverLocation == null) { _receiverLocation = nCV(); }
      return _receiverLocation; }
    protected ConditionValue xgetCValueReceiverLocation() { return xdfgetReceiverLocation(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ReceiverLocation_Asc() { regOBA("RECEIVER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ReceiverLocation_Desc() { regOBD("RECEIVER_LOCATION"); return this; }

    protected ConditionValue _shipmentId;
    public ConditionValue xdfgetShipmentId()
    { if (_shipmentId == null) { _shipmentId = nCV(); }
      return _shipmentId; }
    protected ConditionValue xgetCValueShipmentId() { return xdfgetShipmentId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ShipmentId_Asc() { regOBA("SHIPMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ShipmentId_Desc() { regOBD("SHIPMENT_ID"); return this; }

    protected ConditionValue _shipmentDate;
    public ConditionValue xdfgetShipmentDate()
    { if (_shipmentDate == null) { _shipmentDate = nCV(); }
      return _shipmentDate; }
    protected ConditionValue xgetCValueShipmentDate() { return xdfgetShipmentDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ShipmentDate_Asc() { regOBA("SHIPMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ShipmentDate_Desc() { regOBD("SHIPMENT_DATE"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _carrierwbno;
    public ConditionValue xdfgetCarrierwbno()
    { if (_carrierwbno == null) { _carrierwbno = nCV(); }
      return _carrierwbno; }
    protected ConditionValue xgetCValueCarrierwbno() { return xdfgetCarrierwbno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERWBNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

    protected ConditionValue _numberOfPallets;
    public ConditionValue xdfgetNumberOfPallets()
    { if (_numberOfPallets == null) { _numberOfPallets = nCV(); }
      return _numberOfPallets; }
    protected ConditionValue xgetCValueNumberOfPallets() { return xdfgetNumberOfPallets(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_NumberOfPallets_Asc() { regOBA("NUMBER_OF_PALLETS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_NumberOfPallets_Desc() { regOBD("NUMBER_OF_PALLETS"); return this; }

    protected ConditionValue _sscc;
    public ConditionValue xdfgetSscc()
    { if (_sscc == null) { _sscc = nCV(); }
      return _sscc; }
    protected ConditionValue xgetCValueSscc() { return xdfgetSscc(); }

    /**
     * Add order-by as ascend. <br>
     * SSCC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Sscc_Asc() { regOBA("SSCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Sscc_Desc() { regOBD("SSCC"); return this; }

    protected ConditionValue _caseno;
    public ConditionValue xdfgetCaseno()
    { if (_caseno == null) { _caseno = nCV(); }
      return _caseno; }
    protected ConditionValue xgetCValueCaseno() { return xdfgetCaseno(); }

    /**
     * Add order-by as ascend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Caseno_Asc() { regOBA("CASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Caseno_Desc() { regOBD("CASENO"); return this; }

    protected ConditionValue _makercaseno;
    public ConditionValue xdfgetMakercaseno()
    { if (_makercaseno == null) { _makercaseno = nCV(); }
      return _makercaseno; }
    protected ConditionValue xgetCValueMakercaseno() { return xdfgetMakercaseno(); }

    /**
     * Add order-by as ascend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Makercaseno_Asc() { regOBA("MAKERCASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Makercaseno_Desc() { regOBD("MAKERCASENO"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _resultflg;
    public ConditionValue xdfgetResultflg()
    { if (_resultflg == null) { _resultflg = nCV(); }
      return _resultflg; }
    protected ConditionValue xgetCValueResultflg() { return xdfgetResultflg(); }

    /**
     * Add order-by as ascend. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Resultflg_Asc() { regOBA("RESULTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESULTFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Resultflg_Desc() { regOBD("RESULTFLG"); return this; }

    protected ConditionValue _receivedflg;
    public ConditionValue xdfgetReceivedflg()
    { if (_receivedflg == null) { _receivedflg = nCV(); }
      return _receivedflg; }
    protected ConditionValue xgetCValueReceivedflg() { return xdfgetReceivedflg(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Receivedflg_Asc() { regOBA("RECEIVEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Receivedflg_Desc() { regOBD("RECEIVEDFLG"); return this; }

    protected ConditionValue _ifreceivedflg;
    public ConditionValue xdfgetIfreceivedflg()
    { if (_ifreceivedflg == null) { _ifreceivedflg = nCV(); }
      return _ifreceivedflg; }
    protected ConditionValue xgetCValueIfreceivedflg() { return xdfgetIfreceivedflg(); }

    /**
     * Add order-by as ascend. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Ifreceivedflg_Asc() { regOBA("IFRECEIVEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Ifreceivedflg_Desc() { regOBD("IFRECEIVEDFLG"); return this; }

    protected ConditionValue _symbolno;
    public ConditionValue xdfgetSymbolno()
    { if (_symbolno == null) { _symbolno = nCV(); }
      return _symbolno; }
    protected ConditionValue xgetCValueSymbolno() { return xdfgetSymbolno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Symbolno_Asc() { regOBA("SYMBOLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_Symbolno_Desc() { regOBD("SYMBOLNO"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrmakercasecdCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrmakercasecdCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrmakercasecdCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrmakercasecdCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrmakercasecdCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrmakercasecdCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrmakercasecdCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrmakercasecdCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrmakercasecdCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrmakercasecdCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrmakercasecdCQ> _myselfExistsMap;
    public Map<String, TTrmakercasecdCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrmakercasecdCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrmakercasecdCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrmakercasecdCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrmakercasecdCB.class.getName(); }
    protected String xCQ() { return TTrmakercasecdCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
