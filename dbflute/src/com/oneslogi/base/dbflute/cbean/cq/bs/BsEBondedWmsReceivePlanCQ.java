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
 * The base condition-query of E_BONDED_WMS_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class BsEBondedWmsReceivePlanCQ extends AbstractBsEBondedWmsReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EBondedWmsReceivePlanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEBondedWmsReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_BONDED_WMS_RECEIVE_PLAN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EBondedWmsReceivePlanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EBondedWmsReceivePlanCIQ xcreateCIQ() {
        EBondedWmsReceivePlanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EBondedWmsReceivePlanCIQ xnewCIQ() {
        return new EBondedWmsReceivePlanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_BONDED_WMS_RECEIVE_PLAN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EBondedWmsReceivePlanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EBondedWmsReceivePlanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bondedWmsReceivePlanId;
    public ConditionValue xdfgetBondedWmsReceivePlanId()
    { if (_bondedWmsReceivePlanId == null) { _bondedWmsReceivePlanId = nCV(); }
      return _bondedWmsReceivePlanId; }
    protected ConditionValue xgetCValueBondedWmsReceivePlanId() { return xdfgetBondedWmsReceivePlanId(); }

    /**
     * Add order-by as ascend. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_BondedWmsReceivePlanId_Asc() { regOBA("BONDED_WMS_RECEIVE_PLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_BondedWmsReceivePlanId_Desc() { regOBD("BONDED_WMS_RECEIVE_PLAN_ID"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Sbwarehousecd_Asc() { regOBA("SBWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Sbwarehousecd_Desc() { regOBD("SBWAREHOUSECD"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _rcvschdate;
    public ConditionValue xdfgetRcvschdate()
    { if (_rcvschdate == null) { _rcvschdate = nCV(); }
      return _rcvschdate; }
    protected ConditionValue xgetCValueRcvschdate() { return xdfgetRcvschdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVSCHDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Rcvschdate_Asc() { regOBA("RCVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVSCHDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Rcvschdate_Desc() { regOBD("RCVSCHDATE"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _fromfax;
    public ConditionValue xdfgetFromfax()
    { if (_fromfax == null) { _fromfax = nCV(); }
      return _fromfax; }
    protected ConditionValue xgetCValueFromfax() { return xdfgetFromfax(); }

    /**
     * Add order-by as ascend. <br>
     * FROMFAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Fromfax_Asc() { regOBA("FROMFAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMFAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Fromfax_Desc() { regOBD("FROMFAX"); return this; }

    protected ConditionValue _batjmfym;
    public ConditionValue xdfgetBatjmfym()
    { if (_batjmfym == null) { _batjmfym = nCV(); }
      return _batjmfym; }
    protected ConditionValue xgetCValueBatjmfym() { return xdfgetBatjmfym(); }

    /**
     * Add order-by as ascend. <br>
     * BATJMFYM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batjmfym_Asc() { regOBA("BATJMFYM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATJMFYM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batjmfym_Desc() { regOBD("BATJMFYM"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carriersname_Asc() { regOBA("CARRIERSNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carriersname_Desc() { regOBD("CARRIERSNAME"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _blNo;
    public ConditionValue xdfgetBlNo()
    { if (_blNo == null) { _blNo = nCV(); }
      return _blNo; }
    protected ConditionValue xgetCValueBlNo() { return xdfgetBlNo(); }

    /**
     * Add order-by as ascend. <br>
     * BL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_BlNo_Asc() { regOBA("BL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_BlNo_Desc() { regOBD("BL_NO"); return this; }

    protected ConditionValue _carriername;
    public ConditionValue xdfgetCarriername()
    { if (_carriername == null) { _carriername = nCV(); }
      return _carriername; }
    protected ConditionValue xgetCValueCarriername() { return xdfgetCarriername(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carriername_Asc() { regOBA("CARRIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Carriername_Desc() { regOBD("CARRIERNAME"); return this; }

    protected ConditionValue _fromemail;
    public ConditionValue xdfgetFromemail()
    { if (_fromemail == null) { _fromemail = nCV(); }
      return _fromemail; }
    protected ConditionValue xgetCValueFromemail() { return xdfgetFromemail(); }

    /**
     * Add order-by as ascend. <br>
     * FROMEMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Fromemail_Asc() { regOBA("FROMEMAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMEMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Fromemail_Desc() { regOBD("FROMEMAIL"); return this; }

    protected ConditionValue _arrivalportdate;
    public ConditionValue xdfgetArrivalportdate()
    { if (_arrivalportdate == null) { _arrivalportdate = nCV(); }
      return _arrivalportdate; }
    protected ConditionValue xgetCValueArrivalportdate() { return xdfgetArrivalportdate(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Arrivalportdate_Asc() { regOBA("ARRIVALPORTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Arrivalportdate_Desc() { regOBD("ARRIVALPORTDATE"); return this; }

    protected ConditionValue _shipname;
    public ConditionValue xdfgetShipname()
    { if (_shipname == null) { _shipname = nCV(); }
      return _shipname; }
    protected ConditionValue xgetCValueShipname() { return xdfgetShipname(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Shipname_Asc() { regOBA("SHIPNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Shipname_Desc() { regOBD("SHIPNAME"); return this; }

    protected ConditionValue _batdelino;
    public ConditionValue xdfgetBatdelino()
    { if (_batdelino == null) { _batdelino = nCV(); }
      return _batdelino; }
    protected ConditionValue xgetCValueBatdelino() { return xdfgetBatdelino(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELINO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batdelino_Asc() { regOBA("BATDELINO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELINO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batdelino_Desc() { regOBD("BATDELINO"); return this; }

    protected ConditionValue _batdelidetailno;
    public ConditionValue xdfgetBatdelidetailno()
    { if (_batdelidetailno == null) { _batdelidetailno = nCV(); }
      return _batdelidetailno; }
    protected ConditionValue xgetCValueBatdelidetailno() { return xdfgetBatdelidetailno(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batdelidetailno_Asc() { regOBA("BATDELIDETAILNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batdelidetailno_Desc() { regOBD("BATDELIDETAILNO"); return this; }

    protected ConditionValue _batwarehousecd;
    public ConditionValue xdfgetBatwarehousecd()
    { if (_batwarehousecd == null) { _batwarehousecd = nCV(); }
      return _batwarehousecd; }
    protected ConditionValue xgetCValueBatwarehousecd() { return xdfgetBatwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batwarehousecd_Asc() { regOBA("BATWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batwarehousecd_Desc() { regOBD("BATWAREHOUSECD"); return this; }

    protected ConditionValue _batkeepwarehousecd;
    public ConditionValue xdfgetBatkeepwarehousecd()
    { if (_batkeepwarehousecd == null) { _batkeepwarehousecd = nCV(); }
      return _batkeepwarehousecd; }
    protected ConditionValue xgetCValueBatkeepwarehousecd() { return xdfgetBatkeepwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batkeepwarehousecd_Asc() { regOBA("BATKEEPWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batkeepwarehousecd_Desc() { regOBD("BATKEEPWAREHOUSECD"); return this; }

    protected ConditionValue _batpartnernorcv;
    public ConditionValue xdfgetBatpartnernorcv()
    { if (_batpartnernorcv == null) { _batpartnernorcv = nCV(); }
      return _batpartnernorcv; }
    protected ConditionValue xgetCValueBatpartnernorcv() { return xdfgetBatpartnernorcv(); }

    /**
     * Add order-by as ascend. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batpartnernorcv_Asc() { regOBA("BATPARTNERNORCV"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batpartnernorcv_Desc() { regOBD("BATPARTNERNORCV"); return this; }

    protected ConditionValue _batpartnernosnd;
    public ConditionValue xdfgetBatpartnernosnd()
    { if (_batpartnernosnd == null) { _batpartnernosnd = nCV(); }
      return _batpartnernosnd; }
    protected ConditionValue xgetCValueBatpartnernosnd() { return xdfgetBatpartnernosnd(); }

    /**
     * Add order-by as ascend. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batpartnernosnd_Asc() { regOBA("BATPARTNERNOSND"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batpartnernosnd_Desc() { regOBD("BATPARTNERNOSND"); return this; }

    protected ConditionValue _batdelidetailnum;
    public ConditionValue xdfgetBatdelidetailnum()
    { if (_batdelidetailnum == null) { _batdelidetailnum = nCV(); }
      return _batdelidetailnum; }
    protected ConditionValue xgetCValueBatdelidetailnum() { return xdfgetBatdelidetailnum(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batdelidetailnum_Asc() { regOBA("BATDELIDETAILNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_Batdelidetailnum_Desc() { regOBD("BATDELIDETAILNUM"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedWmsReceivePlanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEBondedWmsReceivePlanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEBondedWmsReceivePlanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EBondedWmsReceivePlanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EBondedWmsReceivePlanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EBondedWmsReceivePlanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EBondedWmsReceivePlanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EBondedWmsReceivePlanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EBondedWmsReceivePlanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EBondedWmsReceivePlanCQ> _myselfExistsMap;
    public Map<String, EBondedWmsReceivePlanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EBondedWmsReceivePlanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EBondedWmsReceivePlanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EBondedWmsReceivePlanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EBondedWmsReceivePlanCB.class.getName(); }
    protected String xCQ() { return EBondedWmsReceivePlanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
