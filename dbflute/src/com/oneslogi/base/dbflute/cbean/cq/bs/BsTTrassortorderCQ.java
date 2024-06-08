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
 * The base condition-query of T_TRASSORTORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrassortorderCQ extends AbstractBsTTrassortorderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrassortorderCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrassortorderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRASSORTORDER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrassortorderCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrassortorderCIQ xcreateCIQ() {
        TTrassortorderCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrassortorderCIQ xnewCIQ() {
        return new TTrassortorderCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRASSORTORDER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrassortorderCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrassortorderCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _directionorderkey;
    public ConditionValue xdfgetDirectionorderkey()
    { if (_directionorderkey == null) { _directionorderkey = nCV(); }
      return _directionorderkey; }
    protected ConditionValue xgetCValueDirectionorderkey() { return xdfgetDirectionorderkey(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directionorderkey_Asc() { regOBA("DIRECTIONORDERKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directionorderkey_Desc() { regOBD("DIRECTIONORDERKEY"); return this; }

    protected ConditionValue _directionordergno;
    public ConditionValue xdfgetDirectionordergno()
    { if (_directionordergno == null) { _directionordergno = nCV(); }
      return _directionordergno; }
    protected ConditionValue xgetCValueDirectionordergno() { return xdfgetDirectionordergno(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directionordergno_Asc() { regOBA("DIRECTIONORDERGNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directionordergno_Desc() { regOBD("DIRECTIONORDERGNO"); return this; }

    protected ConditionValue _actflg;
    public ConditionValue xdfgetActflg()
    { if (_actflg == null) { _actflg = nCV(); }
      return _actflg; }
    protected ConditionValue xgetCValueActflg() { return xdfgetActflg(); }

    /**
     * Add order-by as ascend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Actflg_Asc() { regOBA("ACTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Actflg_Desc() { regOBD("ACTFLG"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _rcvdate;
    public ConditionValue xdfgetRcvdate()
    { if (_rcvdate == null) { _rcvdate = nCV(); }
      return _rcvdate; }
    protected ConditionValue xgetCValueRcvdate() { return xdfgetRcvdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Rcvdate_Asc() { regOBA("RCVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Rcvdate_Desc() { regOBD("RCVDATE"); return this; }

    protected ConditionValue _shiporder;
    public ConditionValue xdfgetShiporder()
    { if (_shiporder == null) { _shiporder = nCV(); }
      return _shiporder; }
    protected ConditionValue xgetCValueShiporder() { return xdfgetShiporder(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Shiporder_Asc() { regOBA("SHIPORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Shiporder_Desc() { regOBD("SHIPORDER"); return this; }

    protected ConditionValue _rangestart;
    public ConditionValue xdfgetRangestart()
    { if (_rangestart == null) { _rangestart = nCV(); }
      return _rangestart; }
    protected ConditionValue xgetCValueRangestart() { return xdfgetRangestart(); }

    /**
     * Add order-by as ascend. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Rangestart_Asc() { regOBA("RANGESTART"); return this; }

    /**
     * Add order-by as descend. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Rangestart_Desc() { regOBD("RANGESTART"); return this; }

    protected ConditionValue _rangeend;
    public ConditionValue xdfgetRangeend()
    { if (_rangeend == null) { _rangeend = nCV(); }
      return _rangeend; }
    protected ConditionValue xgetCValueRangeend() { return xdfgetRangeend(); }

    /**
     * Add order-by as ascend. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Rangeend_Asc() { regOBA("RANGEEND"); return this; }

    /**
     * Add order-by as descend. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Rangeend_Desc() { regOBD("RANGEEND"); return this; }

    protected ConditionValue _dpwarehousecd;
    public ConditionValue xdfgetDpwarehousecd()
    { if (_dpwarehousecd == null) { _dpwarehousecd = nCV(); }
      return _dpwarehousecd; }
    protected ConditionValue xgetCValueDpwarehousecd() { return xdfgetDpwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Dpwarehousecd_Asc() { regOBA("DPWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Dpwarehousecd_Desc() { regOBD("DPWAREHOUSECD"); return this; }

    protected ConditionValue _deliverydate;
    public ConditionValue xdfgetDeliverydate()
    { if (_deliverydate == null) { _deliverydate = nCV(); }
      return _deliverydate; }
    protected ConditionValue xgetCValueDeliverydate() { return xdfgetDeliverydate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Deliverydate_Asc() { regOBA("DELIVERYDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Deliverydate_Desc() { regOBD("DELIVERYDATE"); return this; }

    protected ConditionValue _itemcd;
    public ConditionValue xdfgetItemcd()
    { if (_itemcd == null) { _itemcd = nCV(); }
      return _itemcd; }
    protected ConditionValue xgetCValueItemcd() { return xdfgetItemcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

    protected ConditionValue _linecd;
    public ConditionValue xdfgetLinecd()
    { if (_linecd == null) { _linecd = nCV(); }
      return _linecd; }
    protected ConditionValue xgetCValueLinecd() { return xdfgetLinecd(); }

    /**
     * Add order-by as ascend. <br>
     * LINECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Linecd_Asc() { regOBA("LINECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Linecd_Desc() { regOBD("LINECD"); return this; }

    protected ConditionValue _sotedunit;
    public ConditionValue xdfgetSotedunit()
    { if (_sotedunit == null) { _sotedunit = nCV(); }
      return _sotedunit; }
    protected ConditionValue xgetCValueSotedunit() { return xdfgetSotedunit(); }

    /**
     * Add order-by as ascend. <br>
     * SOTEDUNIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Sotedunit_Asc() { regOBA("SOTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDUNIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Sotedunit_Desc() { regOBD("SOTEDUNIT"); return this; }

    protected ConditionValue _assortedorder;
    public ConditionValue xdfgetAssortedorder()
    { if (_assortedorder == null) { _assortedorder = nCV(); }
      return _assortedorder; }
    protected ConditionValue xgetCValueAssortedorder() { return xdfgetAssortedorder(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Assortedorder_Asc() { regOBA("ASSORTEDORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Assortedorder_Desc() { regOBD("ASSORTEDORDER"); return this; }

    protected ConditionValue _deliveryseqno;
    public ConditionValue xdfgetDeliveryseqno()
    { if (_deliveryseqno == null) { _deliveryseqno = nCV(); }
      return _deliveryseqno; }
    protected ConditionValue xgetCValueDeliveryseqno() { return xdfgetDeliveryseqno(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Deliveryseqno_Asc() { regOBA("DELIVERYSEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Deliveryseqno_Desc() { regOBD("DELIVERYSEQNO"); return this; }

    protected ConditionValue _deliverybranchno;
    public ConditionValue xdfgetDeliverybranchno()
    { if (_deliverybranchno == null) { _deliverybranchno = nCV(); }
      return _deliverybranchno; }
    protected ConditionValue xgetCValueDeliverybranchno() { return xdfgetDeliverybranchno(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Deliverybranchno_Asc() { regOBA("DELIVERYBRANCHNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Deliverybranchno_Desc() { regOBD("DELIVERYBRANCHNO"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_Caseno_Asc() { regOBA("CASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Caseno_Desc() { regOBD("CASENO"); return this; }

    protected ConditionValue _caseserial;
    public ConditionValue xdfgetCaseserial()
    { if (_caseserial == null) { _caseserial = nCV(); }
      return _caseserial; }
    protected ConditionValue xgetCValueCaseserial() { return xdfgetCaseserial(); }

    /**
     * Add order-by as ascend. <br>
     * CASESERIAL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Caseserial_Asc() { regOBA("CASESERIAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASESERIAL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Caseserial_Desc() { regOBD("CASESERIAL"); return this; }

    protected ConditionValue _sotedloc;
    public ConditionValue xdfgetSotedloc()
    { if (_sotedloc == null) { _sotedloc = nCV(); }
      return _sotedloc; }
    protected ConditionValue xgetCValueSotedloc() { return xdfgetSotedloc(); }

    /**
     * Add order-by as ascend. <br>
     * SOTEDLOC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Sotedloc_Asc() { regOBA("SOTEDLOC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDLOC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Sotedloc_Desc() { regOBD("SOTEDLOC"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _directioncd;
    public ConditionValue xdfgetDirectioncd()
    { if (_directioncd == null) { _directioncd = nCV(); }
      return _directioncd; }
    protected ConditionValue xgetCValueDirectioncd() { return xdfgetDirectioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directioncd_Asc() { regOBA("DIRECTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directioncd_Desc() { regOBD("DIRECTIONCD"); return this; }

    protected ConditionValue _pistontype;
    public ConditionValue xdfgetPistontype()
    { if (_pistontype == null) { _pistontype = nCV(); }
      return _pistontype; }
    protected ConditionValue xgetCValuePistontype() { return xdfgetPistontype(); }

    /**
     * Add order-by as ascend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Pistontype_Asc() { regOBA("PISTONTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Pistontype_Desc() { regOBD("PISTONTYPE"); return this; }

    protected ConditionValue _customercd;
    public ConditionValue xdfgetCustomercd()
    { if (_customercd == null) { _customercd = nCV(); }
      return _customercd; }
    protected ConditionValue xgetCValueCustomercd() { return xdfgetCustomercd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Customercd_Asc() { regOBA("CUSTOMERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Customercd_Desc() { regOBD("CUSTOMERCD"); return this; }

    protected ConditionValue _directionnum;
    public ConditionValue xdfgetDirectionnum()
    { if (_directionnum == null) { _directionnum = nCV(); }
      return _directionnum; }
    protected ConditionValue xgetCValueDirectionnum() { return xdfgetDirectionnum(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directionnum_Asc() { regOBA("DIRECTIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Directionnum_Desc() { regOBD("DIRECTIONNUM"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrassortorderCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrassortorderCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrassortorderCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrassortorderCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrassortorderCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrassortorderCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrassortorderCB.class.getName(); }
    protected String xCQ() { return TTrassortorderCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
