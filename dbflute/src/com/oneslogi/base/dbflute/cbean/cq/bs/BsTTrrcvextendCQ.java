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
 * The base condition-query of T_TRRCVEXTEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrrcvextendCQ extends AbstractBsTTrrcvextendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrrcvextendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvextendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRRCVEXTEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrrcvextendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrrcvextendCIQ xcreateCIQ() {
        TTrrcvextendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrrcvextendCIQ xnewCIQ() {
        return new TTrrcvextendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRRCVEXTEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrrcvextendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrrcvextendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TTrrcvCQ> getReceivePlanHId_InScopeRelation_TTrrcv() { return xgetSQueMap("receivePlanHId_InScopeRelation_TTrrcv"); }
    public String keepReceivePlanHId_InScopeRelation_TTrrcv(TTrrcvCQ sq) { return xkeepSQue("receivePlanHId_InScopeRelation_TTrrcv", sq); }

    public Map<String, TTrrcvCQ> getReceivePlanHId_NotInScopeRelation_TTrrcv() { return xgetSQueMap("receivePlanHId_NotInScopeRelation_TTrrcv"); }
    public String keepReceivePlanHId_NotInScopeRelation_TTrrcv(TTrrcvCQ sq) { return xkeepSQue("receivePlanHId_NotInScopeRelation_TTrrcv", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _sbwarehousecd;
    public ConditionValue xdfgetSbwarehousecd()
    { if (_sbwarehousecd == null) { _sbwarehousecd = nCV(); }
      return _sbwarehousecd; }
    protected ConditionValue xgetCValueSbwarehousecd() { return xdfgetSbwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * SBWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Sbwarehousecd_Asc() { regOBA("SBWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SBWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Sbwarehousecd_Desc() { regOBD("SBWAREHOUSECD"); return this; }

    protected ConditionValue _iino;
    public ConditionValue xdfgetIino()
    { if (_iino == null) { _iino = nCV(); }
      return _iino; }
    protected ConditionValue xgetCValueIino() { return xdfgetIino(); }

    /**
     * Add order-by as ascend. <br>
     * IINO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Iino_Asc() { regOBA("IINO"); return this; }

    /**
     * Add order-by as descend. <br>
     * IINO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Iino_Desc() { regOBD("IINO"); return this; }

    protected ConditionValue _rcvschdate;
    public ConditionValue xdfgetRcvschdate()
    { if (_rcvschdate == null) { _rcvschdate = nCV(); }
      return _rcvschdate; }
    protected ConditionValue xgetCValueRcvschdate() { return xdfgetRcvschdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Rcvschdate_Asc() { regOBA("RCVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Rcvschdate_Desc() { regOBD("RCVSCHDATE"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _otherrefno1;
    public ConditionValue xdfgetOtherrefno1()
    { if (_otherrefno1 == null) { _otherrefno1 = nCV(); }
      return _otherrefno1; }
    protected ConditionValue xgetCValueOtherrefno1() { return xdfgetOtherrefno1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _fromfax;
    public ConditionValue xdfgetFromfax()
    { if (_fromfax == null) { _fromfax = nCV(); }
      return _fromfax; }
    protected ConditionValue xgetCValueFromfax() { return xdfgetFromfax(); }

    /**
     * Add order-by as ascend. <br>
     * FROMFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Fromfax_Asc() { regOBA("FROMFAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Fromfax_Desc() { regOBD("FROMFAX"); return this; }

    protected ConditionValue _carriersname;
    public ConditionValue xdfgetCarriersname()
    { if (_carriersname == null) { _carriersname = nCV(); }
      return _carriersname; }
    protected ConditionValue xgetCValueCarriersname() { return xdfgetCarriersname(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carriersname_Asc() { regOBA("CARRIERSNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carriersname_Desc() { regOBD("CARRIERSNAME"); return this; }

    protected ConditionValue _carrierwbno;
    public ConditionValue xdfgetCarrierwbno()
    { if (_carrierwbno == null) { _carrierwbno = nCV(); }
      return _carrierwbno; }
    protected ConditionValue xgetCValueCarrierwbno() { return xdfgetCarrierwbno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERWBNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

    protected ConditionValue _foreigncargoflg;
    public ConditionValue xdfgetForeigncargoflg()
    { if (_foreigncargoflg == null) { _foreigncargoflg = nCV(); }
      return _foreigncargoflg; }
    protected ConditionValue xgetCValueForeigncargoflg() { return xdfgetForeigncargoflg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _fromrefname;
    public ConditionValue xdfgetFromrefname()
    { if (_fromrefname == null) { _fromrefname = nCV(); }
      return _fromrefname; }
    protected ConditionValue xgetCValueFromrefname() { return xdfgetFromrefname(); }

    /**
     * Add order-by as ascend. <br>
     * FROMREFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Fromrefname_Asc() { regOBA("FROMREFNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMREFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Fromrefname_Desc() { regOBD("FROMREFNAME"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_Carriername_Asc() { regOBA("CARRIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Carriername_Desc() { regOBD("CARRIERNAME"); return this; }

    protected ConditionValue _custorderno;
    public ConditionValue xdfgetCustorderno()
    { if (_custorderno == null) { _custorderno = nCV(); }
      return _custorderno; }
    protected ConditionValue xgetCValueCustorderno() { return xdfgetCustorderno(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Custorderno_Asc() { regOBA("CUSTORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Custorderno_Desc() { regOBD("CUSTORDERNO"); return this; }

    protected ConditionValue _arrivalportdate;
    public ConditionValue xdfgetArrivalportdate()
    { if (_arrivalportdate == null) { _arrivalportdate = nCV(); }
      return _arrivalportdate; }
    protected ConditionValue xgetCValueArrivalportdate() { return xdfgetArrivalportdate(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Arrivalportdate_Asc() { regOBA("ARRIVALPORTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Arrivalportdate_Desc() { regOBD("ARRIVALPORTDATE"); return this; }

    protected ConditionValue _shipname;
    public ConditionValue xdfgetShipname()
    { if (_shipname == null) { _shipname = nCV(); }
      return _shipname; }
    protected ConditionValue xgetCValueShipname() { return xdfgetShipname(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Shipname_Asc() { regOBA("SHIPNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Shipname_Desc() { regOBD("SHIPNAME"); return this; }

    protected ConditionValue _batdelino;
    public ConditionValue xdfgetBatdelino()
    { if (_batdelino == null) { _batdelino = nCV(); }
      return _batdelino; }
    protected ConditionValue xgetCValueBatdelino() { return xdfgetBatdelino(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELINO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batdelino_Asc() { regOBA("BATDELINO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELINO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batdelino_Desc() { regOBD("BATDELINO"); return this; }

    protected ConditionValue _batdelidetailno;
    public ConditionValue xdfgetBatdelidetailno()
    { if (_batdelidetailno == null) { _batdelidetailno = nCV(); }
      return _batdelidetailno; }
    protected ConditionValue xgetCValueBatdelidetailno() { return xdfgetBatdelidetailno(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batdelidetailno_Asc() { regOBA("BATDELIDETAILNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELIDETAILNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batdelidetailno_Desc() { regOBD("BATDELIDETAILNO"); return this; }

    protected ConditionValue _batwarehousecd;
    public ConditionValue xdfgetBatwarehousecd()
    { if (_batwarehousecd == null) { _batwarehousecd = nCV(); }
      return _batwarehousecd; }
    protected ConditionValue xgetCValueBatwarehousecd() { return xdfgetBatwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batwarehousecd_Asc() { regOBA("BATWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batwarehousecd_Desc() { regOBD("BATWAREHOUSECD"); return this; }

    protected ConditionValue _batkeepwarehousecd;
    public ConditionValue xdfgetBatkeepwarehousecd()
    { if (_batkeepwarehousecd == null) { _batkeepwarehousecd = nCV(); }
      return _batkeepwarehousecd; }
    protected ConditionValue xgetCValueBatkeepwarehousecd() { return xdfgetBatkeepwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batkeepwarehousecd_Asc() { regOBA("BATKEEPWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batkeepwarehousecd_Desc() { regOBD("BATKEEPWAREHOUSECD"); return this; }

    protected ConditionValue _batpartnernorcv;
    public ConditionValue xdfgetBatpartnernorcv()
    { if (_batpartnernorcv == null) { _batpartnernorcv = nCV(); }
      return _batpartnernorcv; }
    protected ConditionValue xgetCValueBatpartnernorcv() { return xdfgetBatpartnernorcv(); }

    /**
     * Add order-by as ascend. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batpartnernorcv_Asc() { regOBA("BATPARTNERNORCV"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATPARTNERNORCV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batpartnernorcv_Desc() { regOBD("BATPARTNERNORCV"); return this; }

    protected ConditionValue _batpartnernosnd;
    public ConditionValue xdfgetBatpartnernosnd()
    { if (_batpartnernosnd == null) { _batpartnernosnd = nCV(); }
      return _batpartnernosnd; }
    protected ConditionValue xgetCValueBatpartnernosnd() { return xdfgetBatpartnernosnd(); }

    /**
     * Add order-by as ascend. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batpartnernosnd_Asc() { regOBA("BATPARTNERNOSND"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATPARTNERNOSND: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batpartnernosnd_Desc() { regOBD("BATPARTNERNOSND"); return this; }

    protected ConditionValue _batdelidetailnum;
    public ConditionValue xdfgetBatdelidetailnum()
    { if (_batdelidetailnum == null) { _batdelidetailnum = nCV(); }
      return _batdelidetailnum; }
    protected ConditionValue xgetCValueBatdelidetailnum() { return xdfgetBatdelidetailnum(); }

    /**
     * Add order-by as ascend. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batdelidetailnum_Asc() { regOBA("BATDELIDETAILNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATDELIDETAILNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batdelidetailnum_Desc() { regOBD("BATDELIDETAILNUM"); return this; }

    protected ConditionValue _batno;
    public ConditionValue xdfgetBatno()
    { if (_batno == null) { _batno = nCV(); }
      return _batno; }
    protected ConditionValue xgetCValueBatno() { return xdfgetBatno(); }

    /**
     * Add order-by as ascend. <br>
     * BATNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batno_Asc() { regOBA("BATNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_Batno_Desc() { regOBD("BATNO"); return this; }

    protected ConditionValue _vaExtdata1;
    public ConditionValue xdfgetVaExtdata1()
    { if (_vaExtdata1 == null) { _vaExtdata1 = nCV(); }
      return _vaExtdata1; }
    protected ConditionValue xgetCValueVaExtdata1() { return xdfgetVaExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

    protected ConditionValue _vaExtdata2;
    public ConditionValue xdfgetVaExtdata2()
    { if (_vaExtdata2 == null) { _vaExtdata2 = nCV(); }
      return _vaExtdata2; }
    protected ConditionValue xgetCValueVaExtdata2() { return xdfgetVaExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

    protected ConditionValue _vaExtdata3;
    public ConditionValue xdfgetVaExtdata3()
    { if (_vaExtdata3 == null) { _vaExtdata3 = nCV(); }
      return _vaExtdata3; }
    protected ConditionValue xgetCValueVaExtdata3() { return xdfgetVaExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

    protected ConditionValue _nvExtdata1;
    public ConditionValue xdfgetNvExtdata1()
    { if (_nvExtdata1 == null) { _nvExtdata1 = nCV(); }
      return _nvExtdata1; }
    protected ConditionValue xgetCValueNvExtdata1() { return xdfgetNvExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

    protected ConditionValue _nvExtdata2;
    public ConditionValue xdfgetNvExtdata2()
    { if (_nvExtdata2 == null) { _nvExtdata2 = nCV(); }
      return _nvExtdata2; }
    protected ConditionValue xgetCValueNvExtdata2() { return xdfgetNvExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

    protected ConditionValue _nvExtdata3;
    public ConditionValue xdfgetNvExtdata3()
    { if (_nvExtdata3 == null) { _nvExtdata3 = nCV(); }
      return _nvExtdata3; }
    protected ConditionValue xgetCValueNvExtdata3() { return xdfgetNvExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

    protected ConditionValue _nmExtdata1;
    public ConditionValue xdfgetNmExtdata1()
    { if (_nmExtdata1 == null) { _nmExtdata1 = nCV(); }
      return _nmExtdata1; }
    protected ConditionValue xgetCValueNmExtdata1() { return xdfgetNmExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

    protected ConditionValue _nmExtdata2;
    public ConditionValue xdfgetNmExtdata2()
    { if (_nmExtdata2 == null) { _nmExtdata2 = nCV(); }
      return _nmExtdata2; }
    protected ConditionValue xgetCValueNmExtdata2() { return xdfgetNmExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

    protected ConditionValue _nmExtdata3;
    public ConditionValue xdfgetNmExtdata3()
    { if (_nmExtdata3 == null) { _nmExtdata3 = nCV(); }
      return _nmExtdata3; }
    protected ConditionValue xgetCValueNmExtdata3() { return xdfgetNmExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

    protected ConditionValue _dtExtdata1;
    public ConditionValue xdfgetDtExtdata1()
    { if (_dtExtdata1 == null) { _dtExtdata1 = nCV(); }
      return _dtExtdata1; }
    protected ConditionValue xgetCValueDtExtdata1() { return xdfgetDtExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

    protected ConditionValue _dtExtdata2;
    public ConditionValue xdfgetDtExtdata2()
    { if (_dtExtdata2 == null) { _dtExtdata2 = nCV(); }
      return _dtExtdata2; }
    protected ConditionValue xgetCValueDtExtdata2() { return xdfgetDtExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

    protected ConditionValue _dtExtdata3;
    public ConditionValue xdfgetDtExtdata3()
    { if (_dtExtdata3 == null) { _dtExtdata3 = nCV(); }
      return _dtExtdata3; }
    protected ConditionValue xgetCValueDtExtdata3() { return xdfgetDtExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrrcvextendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvextendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrrcvextendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrrcvextendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrrcvextendCQ bq = (TTrrcvextendCQ)bqs;
        TTrrcvextendCQ uq = (TTrrcvextendCQ)uqs;
        if (bq.hasConditionQueryTTrrcv()) {
            uq.queryTTrrcv().reflectRelationOnUnionQuery(bq.queryTTrrcv(), uq.queryTTrrcv());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrrcvCQ queryTTrrcv() {
        return xdfgetConditionQueryTTrrcv();
    }
    public TTrrcvCQ xdfgetConditionQueryTTrrcv() {
        String prop = "tTrrcv";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrrcv()); xsetupOuterJoinTTrrcv(); }
        return xgetQueRlMap(prop);
    }
    protected TTrrcvCQ xcreateQueryTTrrcv() {
        String nrp = xresolveNRP("T_TRRCVEXTEND", "tTrrcv"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrrcvCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrrcv", nrp);
    }
    protected void xsetupOuterJoinTTrrcv() { xregOutJo("tTrrcv"); }
    public boolean hasConditionQueryTTrrcv() { return xhasQueRlMap("tTrrcv"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrrcvextendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrrcvextendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrrcvextendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrrcvextendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrrcvextendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrrcvextendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrrcvextendCQ> _myselfExistsMap;
    public Map<String, TTrrcvextendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrrcvextendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrrcvextendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrrcvextendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrrcvextendCB.class.getName(); }
    protected String xCQ() { return TTrrcvextendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
