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
 * The base condition-query of T_TRFLEXIBILITYINSTRUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrflexibilityinstructCQ extends AbstractBsTTrflexibilityinstructCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrflexibilityinstructCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrflexibilityinstructCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRFLEXIBILITYINSTRUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrflexibilityinstructCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrflexibilityinstructCIQ xcreateCIQ() {
        TTrflexibilityinstructCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrflexibilityinstructCIQ xnewCIQ() {
        return new TTrflexibilityinstructCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRFLEXIBILITYINSTRUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrflexibilityinstructCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrflexibilityinstructCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _flexinstructno;
    public ConditionValue xdfgetFlexinstructno()
    { if (_flexinstructno == null) { _flexinstructno = nCV(); }
      return _flexinstructno; }
    protected ConditionValue xgetCValueFlexinstructno() { return xdfgetFlexinstructno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXINSTRUCTNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinstructno_Asc() { regOBA("FLEXINSTRUCTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXINSTRUCTNO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinstructno_Desc() { regOBD("FLEXINSTRUCTNO"); return this; }

    protected ConditionValue _flexinslineno;
    public ConditionValue xdfgetFlexinslineno()
    { if (_flexinslineno == null) { _flexinslineno = nCV(); }
      return _flexinslineno; }
    protected ConditionValue xgetCValueFlexinslineno() { return xdfgetFlexinslineno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXINSLINENO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinslineno_Asc() { regOBA("FLEXINSLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXINSLINENO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinslineno_Desc() { regOBD("FLEXINSLINENO"); return this; }

    protected ConditionValue _flexinsno;
    public ConditionValue xdfgetFlexinsno()
    { if (_flexinsno == null) { _flexinsno = nCV(); }
      return _flexinsno; }
    protected ConditionValue xgetCValueFlexinsno() { return xdfgetFlexinsno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXINSNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinsno_Asc() { regOBA("FLEXINSNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXINSNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinsno_Desc() { regOBD("FLEXINSNO"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _rcvdate;
    public ConditionValue xdfgetRcvdate()
    { if (_rcvdate == null) { _rcvdate = nCV(); }
      return _rcvdate; }
    protected ConditionValue xgetCValueRcvdate() { return xdfgetRcvdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVDATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Rcvdate_Asc() { regOBA("RCVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Rcvdate_Desc() { regOBD("RCVDATE"); return this; }

    protected ConditionValue _shipcd;
    public ConditionValue xdfgetShipcd()
    { if (_shipcd == null) { _shipcd = nCV(); }
      return _shipcd; }
    protected ConditionValue xgetCValueShipcd() { return xdfgetShipcd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _manufacturedate;
    public ConditionValue xdfgetManufacturedate()
    { if (_manufacturedate == null) { _manufacturedate = nCV(); }
      return _manufacturedate; }
    protected ConditionValue xgetCValueManufacturedate() { return xdfgetManufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTUREDATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Manufacturedate_Asc() { regOBA("MANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUREDATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Manufacturedate_Desc() { regOBD("MANUFACTUREDATE"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _flexupduser;
    public ConditionValue xdfgetFlexupduser()
    { if (_flexupduser == null) { _flexupduser = nCV(); }
      return _flexupduser; }
    protected ConditionValue xgetCValueFlexupduser() { return xdfgetFlexupduser(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXUPDUSER: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexupduser_Asc() { regOBA("FLEXUPDUSER"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXUPDUSER: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexupduser_Desc() { regOBD("FLEXUPDUSER"); return this; }

    protected ConditionValue _flexinstructsts;
    public ConditionValue xdfgetFlexinstructsts()
    { if (_flexinstructsts == null) { _flexinstructsts = nCV(); }
      return _flexinstructsts; }
    protected ConditionValue xgetCValueFlexinstructsts() { return xdfgetFlexinstructsts(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXINSTRUCTSTS: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinstructsts_Asc() { regOBA("FLEXINSTRUCTSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXINSTRUCTSTS: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexinstructsts_Desc() { regOBD("FLEXINSTRUCTSTS"); return this; }

    protected ConditionValue _flexibityno;
    public ConditionValue xdfgetFlexibityno()
    { if (_flexibityno == null) { _flexibityno = nCV(); }
      return _flexibityno; }
    protected ConditionValue xgetCValueFlexibityno() { return xdfgetFlexibityno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBITYNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexibityno_Asc() { regOBA("FLEXIBITYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBITYNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Flexibityno_Desc() { regOBD("FLEXIBITYNO"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrflexibilityinstructCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityinstructCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrflexibilityinstructCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrflexibilityinstructCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrflexibilityinstructCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrflexibilityinstructCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrflexibilityinstructCB.class.getName(); }
    protected String xCQ() { return TTrflexibilityinstructCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
