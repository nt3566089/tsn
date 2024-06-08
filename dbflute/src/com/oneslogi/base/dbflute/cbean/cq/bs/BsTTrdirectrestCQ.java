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
 * The base condition-query of T_TRDIRECTREST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrdirectrestCQ extends AbstractBsTTrdirectrestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrdirectrestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrdirectrestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRDIRECTREST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrdirectrestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrdirectrestCIQ xcreateCIQ() {
        TTrdirectrestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrdirectrestCIQ xnewCIQ() {
        return new TTrdirectrestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRDIRECTREST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrdirectrestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrdirectrestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _stockdate;
    public ConditionValue xdfgetStockdate()
    { if (_stockdate == null) { _stockdate = nCV(); }
      return _stockdate; }
    protected ConditionValue xgetCValueStockdate() { return xdfgetStockdate(); }

    /**
     * Add order-by as ascend. <br>
     * STOCKDATE: {PK, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Stockdate_Asc() { regOBA("STOCKDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCKDATE: {PK, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Stockdate_Desc() { regOBD("STOCKDATE"); return this; }

    protected ConditionValue _recno;
    public ConditionValue xdfgetRecno()
    { if (_recno == null) { _recno = nCV(); }
      return _recno; }
    protected ConditionValue xgetCValueRecno() { return xdfgetRecno(); }

    /**
     * Add order-by as ascend. <br>
     * RECNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Recno_Asc() { regOBA("RECNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Recno_Desc() { regOBD("RECNO"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_Sotedunit_Asc() { regOBA("SOTEDUNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDUNIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Sotedunit_Desc() { regOBD("SOTEDUNIT"); return this; }

    protected ConditionValue _zone;
    public ConditionValue xdfgetZone()
    { if (_zone == null) { _zone = nCV(); }
      return _zone; }
    protected ConditionValue xgetCValueZone() { return xdfgetZone(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Zone_Asc() { regOBA("ZONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Zone_Desc() { regOBD("ZONE"); return this; }

    protected ConditionValue _assortedorder;
    public ConditionValue xdfgetAssortedorder()
    { if (_assortedorder == null) { _assortedorder = nCV(); }
      return _assortedorder; }
    protected ConditionValue xgetCValueAssortedorder() { return xdfgetAssortedorder(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTEDORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Assortedorder_Asc() { regOBA("ASSORTEDORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTEDORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Assortedorder_Desc() { regOBD("ASSORTEDORDER"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_Sotedloc_Asc() { regOBA("SOTEDLOC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTEDLOC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Sotedloc_Desc() { regOBD("SOTEDLOC"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _deliverydate;
    public ConditionValue xdfgetDeliverydate()
    { if (_deliverydate == null) { _deliverydate = nCV(); }
      return _deliverydate; }
    protected ConditionValue xgetCValueDeliverydate() { return xdfgetDeliverydate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Deliverydate_Asc() { regOBA("DELIVERYDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Deliverydate_Desc() { regOBD("DELIVERYDATE"); return this; }

    protected ConditionValue _dpwarehousecd;
    public ConditionValue xdfgetDpwarehousecd()
    { if (_dpwarehousecd == null) { _dpwarehousecd = nCV(); }
      return _dpwarehousecd; }
    protected ConditionValue xgetCValueDpwarehousecd() { return xdfgetDpwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * DPWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Dpwarehousecd_Asc() { regOBA("DPWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Dpwarehousecd_Desc() { regOBD("DPWAREHOUSECD"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_Directioncd_Asc() { regOBA("DIRECTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Directioncd_Desc() { regOBD("DIRECTIONCD"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_Pistontype_Asc() { regOBA("PISTONTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTONTYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Pistontype_Desc() { regOBD("PISTONTYPE"); return this; }

    protected ConditionValue _comt;
    public ConditionValue xdfgetComt()
    { if (_comt == null) { _comt = nCV(); }
      return _comt; }
    protected ConditionValue xgetCValueComt() { return xdfgetComt(); }

    /**
     * Add order-by as ascend. <br>
     * COMT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Comt_Asc() { regOBA("COMT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Comt_Desc() { regOBD("COMT"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _csroprtcnt;
    public ConditionValue xdfgetCsroprtcnt()
    { if (_csroprtcnt == null) { _csroprtcnt = nCV(); }
      return _csroprtcnt; }
    protected ConditionValue xgetCValueCsroprtcnt() { return xdfgetCsroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * CSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Csroprtcnt_Asc() { regOBA("CSROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Csroprtcnt_Desc() { regOBD("CSROPRTCNT"); return this; }

    protected ConditionValue _cuttopdirassord;
    public ConditionValue xdfgetCuttopdirassord()
    { if (_cuttopdirassord == null) { _cuttopdirassord = nCV(); }
      return _cuttopdirassord; }
    protected ConditionValue xgetCValueCuttopdirassord() { return xdfgetCuttopdirassord(); }

    /**
     * Add order-by as ascend. <br>
     * CUTTOPDIRASSORD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Cuttopdirassord_Asc() { regOBA("CUTTOPDIRASSORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUTTOPDIRASSORD: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Cuttopdirassord_Desc() { regOBD("CUTTOPDIRASSORD"); return this; }

    protected ConditionValue _stockcasesu;
    public ConditionValue xdfgetStockcasesu()
    { if (_stockcasesu == null) { _stockcasesu = nCV(); }
      return _stockcasesu; }
    protected ConditionValue xgetCValueStockcasesu() { return xdfgetStockcasesu(); }

    /**
     * Add order-by as ascend. <br>
     * STOCKCASESU: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Stockcasesu_Asc() { regOBA("STOCKCASESU"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCKCASESU: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Stockcasesu_Desc() { regOBD("STOCKCASESU"); return this; }

    protected ConditionValue _stockcartonsu;
    public ConditionValue xdfgetStockcartonsu()
    { if (_stockcartonsu == null) { _stockcartonsu = nCV(); }
      return _stockcartonsu; }
    protected ConditionValue xgetCValueStockcartonsu() { return xdfgetStockcartonsu(); }

    /**
     * Add order-by as ascend. <br>
     * STOCKCARTONSU: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Stockcartonsu_Asc() { regOBA("STOCKCARTONSU"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCKCARTONSU: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Stockcartonsu_Desc() { regOBD("STOCKCARTONSU"); return this; }

    protected ConditionValue _sellshopcnt;
    public ConditionValue xdfgetSellshopcnt()
    { if (_sellshopcnt == null) { _sellshopcnt = nCV(); }
      return _sellshopcnt; }
    protected ConditionValue xgetCValueSellshopcnt() { return xdfgetSellshopcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SELLSHOPCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Sellshopcnt_Asc() { regOBA("SELLSHOPCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELLSHOPCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Sellshopcnt_Desc() { regOBD("SELLSHOPCNT"); return this; }

    protected ConditionValue _linecd;
    public ConditionValue xdfgetLinecd()
    { if (_linecd == null) { _linecd = nCV(); }
      return _linecd; }
    protected ConditionValue xgetCValueLinecd() { return xdfgetLinecd(); }

    /**
     * Add order-by as ascend. <br>
     * LINECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Linecd_Asc() { regOBA("LINECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_Linecd_Desc() { regOBD("LINECD"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrdirectrestCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrdirectrestCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrdirectrestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrdirectrestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrdirectrestCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrdirectrestCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrdirectrestCB.class.getName(); }
    protected String xCQ() { return TTrdirectrestCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
