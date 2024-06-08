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
 * The base condition-query of W_WKRECEIVEPLAN.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkreceiveplanCQ extends AbstractBsWWkreceiveplanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkreceiveplanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkreceiveplanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKRECEIVEPLAN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkreceiveplanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkreceiveplanCIQ xcreateCIQ() {
        WWkreceiveplanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkreceiveplanCIQ xnewCIQ() {
        return new WWkreceiveplanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKRECEIVEPLAN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkreceiveplanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkreceiveplanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _wWkreceiveplanId;
    public ConditionValue xdfgetWWkreceiveplanId()
    { if (_wWkreceiveplanId == null) { _wWkreceiveplanId = nCV(); }
      return _wWkreceiveplanId; }
    protected ConditionValue xgetCValueWWkreceiveplanId() { return xdfgetWWkreceiveplanId(); }

    /**
     * Add order-by as ascend. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_WWkreceiveplanId_Asc() { regOBA("W_WKRECEIVEPLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_WWkreceiveplanId_Desc() { regOBD("W_WKRECEIVEPLAN_ID"); return this; }

    protected ConditionValue _printkey;
    public ConditionValue xdfgetPrintkey()
    { if (_printkey == null) { _printkey = nCV(); }
      return _printkey; }
    protected ConditionValue xgetCValuePrintkey() { return xdfgetPrintkey(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Printkey_Asc() { regOBA("PRINTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Printkey_Desc() { regOBD("PRINTKEY"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _rcvlineno;
    public ConditionValue xdfgetRcvlineno()
    { if (_rcvlineno == null) { _rcvlineno = nCV(); }
      return _rcvlineno; }
    protected ConditionValue xgetCValueRcvlineno() { return xdfgetRcvlineno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _warehouseSname;
    public ConditionValue xdfgetWarehouseSname()
    { if (_warehouseSname == null) { _warehouseSname = nCV(); }
      return _warehouseSname; }
    protected ConditionValue xgetCValueWarehouseSname() { return xdfgetWarehouseSname(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_WarehouseSname_Asc() { regOBA("WAREHOUSE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_WarehouseSname_Desc() { regOBD("WAREHOUSE_SNAME"); return this; }

    protected ConditionValue _slotlocname;
    public ConditionValue xdfgetSlotlocname()
    { if (_slotlocname == null) { _slotlocname = nCV(); }
      return _slotlocname; }
    protected ConditionValue xgetCValueSlotlocname() { return xdfgetSlotlocname(); }

    /**
     * Add order-by as ascend. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Slotlocname_Asc() { regOBA("SLOTLOCNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Slotlocname_Desc() { regOBD("SLOTLOCNAME"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_Rcvschdate_Asc() { regOBA("RCVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvschdate_Desc() { regOBD("RCVSCHDATE"); return this; }

    protected ConditionValue _receiveLot4;
    public ConditionValue xdfgetReceiveLot4()
    { if (_receiveLot4 == null) { _receiveLot4 = nCV(); }
      return _receiveLot4; }
    protected ConditionValue xgetCValueReceiveLot4() { return xdfgetReceiveLot4(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ReceiveLot4_Asc() { regOBA("RECEIVE_LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ReceiveLot4_Desc() { regOBD("RECEIVE_LOT4"); return this; }

    protected ConditionValue _receiveLot3;
    public ConditionValue xdfgetReceiveLot3()
    { if (_receiveLot3 == null) { _receiveLot3 = nCV(); }
      return _receiveLot3; }
    protected ConditionValue xgetCValueReceiveLot3() { return xdfgetReceiveLot3(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ReceiveLot3_Asc() { regOBA("RECEIVE_LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ReceiveLot3_Desc() { regOBD("RECEIVE_LOT3"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _caseqtyCapacity;
    public ConditionValue xdfgetCaseqtyCapacity()
    { if (_caseqtyCapacity == null) { _caseqtyCapacity = nCV(); }
      return _caseqtyCapacity; }
    protected ConditionValue xgetCValueCaseqtyCapacity() { return xdfgetCaseqtyCapacity(); }

    /**
     * Add order-by as ascend. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_CaseqtyCapacity_Asc() { regOBA("CASEQTY_CAPACITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEQTY_CAPACITY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_CaseqtyCapacity_Desc() { regOBD("CASEQTY_CAPACITY"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_Fromfax_Asc() { regOBA("FROMFAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMFAX: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Fromfax_Desc() { regOBD("FROMFAX"); return this; }

    protected ConditionValue _fromphone;
    public ConditionValue xdfgetFromphone()
    { if (_fromphone == null) { _fromphone = nCV(); }
      return _fromphone; }
    protected ConditionValue xgetCValueFromphone() { return xdfgetFromphone(); }

    /**
     * Add order-by as ascend. <br>
     * FROMPHONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Fromphone_Asc() { regOBA("FROMPHONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMPHONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Fromphone_Desc() { regOBD("FROMPHONE"); return this; }

    protected ConditionValue _supplierrcvno;
    public ConditionValue xdfgetSupplierrcvno()
    { if (_supplierrcvno == null) { _supplierrcvno = nCV(); }
      return _supplierrcvno; }
    protected ConditionValue xgetCValueSupplierrcvno() { return xdfgetSupplierrcvno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemname;
    public ConditionValue xdfgetItemname()
    { if (_itemname == null) { _itemname = nCV(); }
      return _itemname; }
    protected ConditionValue xgetCValueItemname() { return xdfgetItemname(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Itemname_Asc() { regOBA("ITEMNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Itemname_Desc() { regOBD("ITEMNAME"); return this; }

    protected ConditionValue _zone;
    public ConditionValue xdfgetZone()
    { if (_zone == null) { _zone = nCV(); }
      return _zone; }
    protected ConditionValue xgetCValueZone() { return xdfgetZone(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Zone_Asc() { regOBA("ZONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Zone_Desc() { regOBD("ZONE"); return this; }

    protected ConditionValue _expectqty;
    public ConditionValue xdfgetExpectqty()
    { if (_expectqty == null) { _expectqty = nCV(); }
      return _expectqty; }
    protected ConditionValue xgetCValueExpectqty() { return xdfgetExpectqty(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Expectqty_Asc() { regOBA("EXPECTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Expectqty_Desc() { regOBD("EXPECTQTY"); return this; }

    protected ConditionValue _rcvpal;
    public ConditionValue xdfgetRcvpal()
    { if (_rcvpal == null) { _rcvpal = nCV(); }
      return _rcvpal; }
    protected ConditionValue xgetCValueRcvpal() { return xdfgetRcvpal(); }

    /**
     * Add order-by as ascend. <br>
     * RCVPAL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvpal_Asc() { regOBA("RCVPAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVPAL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvpal_Desc() { regOBD("RCVPAL"); return this; }

    protected ConditionValue _rcvcase;
    public ConditionValue xdfgetRcvcase()
    { if (_rcvcase == null) { _rcvcase = nCV(); }
      return _rcvcase; }
    protected ConditionValue xgetCValueRcvcase() { return xdfgetRcvcase(); }

    /**
     * Add order-by as ascend. <br>
     * RCVCASE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvcase_Asc() { regOBA("RCVCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVCASE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Rcvcase_Desc() { regOBD("RCVCASE"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _qtycase;
    public ConditionValue xdfgetQtycase()
    { if (_qtycase == null) { _qtycase = nCV(); }
      return _qtycase; }
    protected ConditionValue xgetCValueQtycase() { return xdfgetQtycase(); }

    /**
     * Add order-by as ascend. <br>
     * QTYCASE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Qtycase_Asc() { regOBA("QTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYCASE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Qtycase_Desc() { regOBD("QTYCASE"); return this; }

    protected ConditionValue _qtybowl;
    public ConditionValue xdfgetQtybowl()
    { if (_qtybowl == null) { _qtybowl = nCV(); }
      return _qtybowl; }
    protected ConditionValue xgetCValueQtybowl() { return xdfgetQtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Qtybowl_Asc() { regOBA("QTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYBOWL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Qtybowl_Desc() { regOBD("QTYBOWL"); return this; }

    protected ConditionValue _qtypal;
    public ConditionValue xdfgetQtypal()
    { if (_qtypal == null) { _qtypal = nCV(); }
      return _qtypal; }
    protected ConditionValue xgetCValueQtypal() { return xdfgetQtypal(); }

    /**
     * Add order-by as ascend. <br>
     * QTYPAL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Qtypal_Asc() { regOBA("QTYPAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYPAL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Qtypal_Desc() { regOBD("QTYPAL"); return this; }

    protected ConditionValue _inoutkbn;
    public ConditionValue xdfgetInoutkbn()
    { if (_inoutkbn == null) { _inoutkbn = nCV(); }
      return _inoutkbn; }
    protected ConditionValue xgetCValueInoutkbn() { return xdfgetInoutkbn(); }

    /**
     * Add order-by as ascend. <br>
     * INOUTKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Inoutkbn_Asc() { regOBA("INOUTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUTKBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Inoutkbn_Desc() { regOBD("INOUTKBN"); return this; }

    protected ConditionValue _itemOrderby;
    public ConditionValue xdfgetItemOrderby()
    { if (_itemOrderby == null) { _itemOrderby = nCV(); }
      return _itemOrderby; }
    protected ConditionValue xgetCValueItemOrderby() { return xdfgetItemOrderby(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ItemOrderby_Asc() { regOBA("ITEM_ORDERBY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ItemOrderby_Desc() { regOBD("ITEM_ORDERBY"); return this; }

    protected ConditionValue _printpageno;
    public ConditionValue xdfgetPrintpageno()
    { if (_printpageno == null) { _printpageno = nCV(); }
      return _printpageno; }
    protected ConditionValue xgetCValuePrintpageno() { return xdfgetPrintpageno(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTPAGENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Printpageno_Asc() { regOBA("PRINTPAGENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTPAGENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Printpageno_Desc() { regOBD("PRINTPAGENO"); return this; }

    protected ConditionValue _seqsortkey;
    public ConditionValue xdfgetSeqsortkey()
    { if (_seqsortkey == null) { _seqsortkey = nCV(); }
      return _seqsortkey; }
    protected ConditionValue xgetCValueSeqsortkey() { return xdfgetSeqsortkey(); }

    /**
     * Add order-by as ascend. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Seqsortkey_Asc() { regOBA("SEQSORTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_Seqsortkey_Desc() { regOBD("SEQSORTKEY"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkreceiveplanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkreceiveplanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkreceiveplanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkreceiveplanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWkreceiveplanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkreceiveplanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WWkreceiveplanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WWkreceiveplanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WWkreceiveplanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WWkreceiveplanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WWkreceiveplanCQ> _myselfExistsMap;
    public Map<String, WWkreceiveplanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WWkreceiveplanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WWkreceiveplanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WWkreceiveplanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkreceiveplanCB.class.getName(); }
    protected String xCQ() { return WWkreceiveplanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
