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
 * The base condition-query of T_TRFLEXIBILITYPRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrflexibilityproductCQ extends AbstractBsTTrflexibilityproductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrflexibilityproductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrflexibilityproductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRFLEXIBILITYPRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrflexibilityproductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrflexibilityproductCIQ xcreateCIQ() {
        TTrflexibilityproductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrflexibilityproductCIQ xnewCIQ() {
        return new TTrflexibilityproductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRFLEXIBILITYPRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrflexibilityproductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrflexibilityproductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trflexibilityproductId;
    public ConditionValue xdfgetTrflexibilityproductId()
    { if (_trflexibilityproductId == null) { _trflexibilityproductId = nCV(); }
      return _trflexibilityproductId; }
    protected ConditionValue xgetCValueTrflexibilityproductId() { return xdfgetTrflexibilityproductId(); }

    /**
     * Add order-by as ascend. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_TrflexibilityproductId_Asc() { regOBA("TRFLEXIBILITYPRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_TrflexibilityproductId_Desc() { regOBD("TRFLEXIBILITYPRODUCT_ID"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _shipcd;
    public ConditionValue xdfgetShipcd()
    { if (_shipcd == null) { _shipcd = nCV(); }
      return _shipcd; }
    protected ConditionValue xgetCValueShipcd() { return xdfgetShipcd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

    protected ConditionValue _flexibityno;
    public ConditionValue xdfgetFlexibityno()
    { if (_flexibityno == null) { _flexibityno = nCV(); }
      return _flexibityno; }
    protected ConditionValue xgetCValueFlexibityno() { return xdfgetFlexibityno(); }

    /**
     * Add order-by as ascend. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Flexibityno_Asc() { regOBA("FLEXIBITYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Flexibityno_Desc() { regOBD("FLEXIBITYNO"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _rcvdate;
    public ConditionValue xdfgetRcvdate()
    { if (_rcvdate == null) { _rcvdate = nCV(); }
      return _rcvdate; }
    protected ConditionValue xgetCValueRcvdate() { return xdfgetRcvdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvdate_Asc() { regOBA("RCVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvdate_Desc() { regOBD("RCVDATE"); return this; }

    protected ConditionValue _ownercd;
    public ConditionValue xdfgetOwnercd()
    { if (_ownercd == null) { _ownercd = nCV(); }
      return _ownercd; }
    protected ConditionValue xgetCValueOwnercd() { return xdfgetOwnercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Ownercd_Asc() { regOBA("OWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Ownercd_Desc() { regOBD("OWNERCD"); return this; }

    protected ConditionValue _instractdatetime;
    public ConditionValue xdfgetInstractdatetime()
    { if (_instractdatetime == null) { _instractdatetime = nCV(); }
      return _instractdatetime; }
    protected ConditionValue xgetCValueInstractdatetime() { return xdfgetInstractdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Instractdatetime_Asc() { regOBA("INSTRACTDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Instractdatetime_Desc() { regOBD("INSTRACTDATETIME"); return this; }

    protected ConditionValue _rcvmakeflg;
    public ConditionValue xdfgetRcvmakeflg()
    { if (_rcvmakeflg == null) { _rcvmakeflg = nCV(); }
      return _rcvmakeflg; }
    protected ConditionValue xgetCValueRcvmakeflg() { return xdfgetRcvmakeflg(); }

    /**
     * Add order-by as ascend. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvmakeflg_Asc() { regOBA("RCVMAKEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvmakeflg_Desc() { regOBD("RCVMAKEFLG"); return this; }

    protected ConditionValue _reflineno;
    public ConditionValue xdfgetReflineno()
    { if (_reflineno == null) { _reflineno = nCV(); }
      return _reflineno; }
    protected ConditionValue xgetCValueReflineno() { return xdfgetReflineno(); }

    /**
     * Add order-by as ascend. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Reflineno_Asc() { regOBA("REFLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Reflineno_Desc() { regOBD("REFLINENO"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _manufacturedate;
    public ConditionValue xdfgetManufacturedate()
    { if (_manufacturedate == null) { _manufacturedate = nCV(); }
      return _manufacturedate; }
    protected ConditionValue xgetCValueManufacturedate() { return xdfgetManufacturedate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Manufacturedate_Asc() { regOBA("MANUFACTUREDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Manufacturedate_Desc() { regOBD("MANUFACTUREDATE"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _qtycase;
    public ConditionValue xdfgetQtycase()
    { if (_qtycase == null) { _qtycase = nCV(); }
      return _qtycase; }
    protected ConditionValue xgetCValueQtycase() { return xdfgetQtycase(); }

    /**
     * Add order-by as ascend. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Qtycase_Asc() { regOBA("QTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Qtycase_Desc() { regOBD("QTYCASE"); return this; }

    protected ConditionValue _qtybowl;
    public ConditionValue xdfgetQtybowl()
    { if (_qtybowl == null) { _qtybowl = nCV(); }
      return _qtybowl; }
    protected ConditionValue xgetCValueQtybowl() { return xdfgetQtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Qtybowl_Asc() { regOBA("QTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Qtybowl_Desc() { regOBD("QTYBOWL"); return this; }

    protected ConditionValue _caseinfoflg;
    public ConditionValue xdfgetCaseinfoflg()
    { if (_caseinfoflg == null) { _caseinfoflg = nCV(); }
      return _caseinfoflg; }
    protected ConditionValue xgetCValueCaseinfoflg() { return xdfgetCaseinfoflg(); }

    /**
     * Add order-by as ascend. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Caseinfoflg_Asc() { regOBA("CASEINFOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Caseinfoflg_Desc() { regOBD("CASEINFOFLG"); return this; }

    protected ConditionValue _factorycd;
    public ConditionValue xdfgetFactorycd()
    { if (_factorycd == null) { _factorycd = nCV(); }
      return _factorycd; }
    protected ConditionValue xgetCValueFactorycd() { return xdfgetFactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

    protected ConditionValue _itemcdCase;
    public ConditionValue xdfgetItemcdCase()
    { if (_itemcdCase == null) { _itemcdCase = nCV(); }
      return _itemcdCase; }
    protected ConditionValue xgetCValueItemcdCase() { return xdfgetItemcdCase(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ItemcdCase_Asc() { regOBA("ITEMCD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ItemcdCase_Desc() { regOBD("ITEMCD_CASE"); return this; }

    protected ConditionValue _skucd;
    public ConditionValue xdfgetSkucd()
    { if (_skucd == null) { _skucd = nCV(); }
      return _skucd; }
    protected ConditionValue xgetCValueSkucd() { return xdfgetSkucd(); }

    /**
     * Add order-by as ascend. <br>
     * SKUCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Skucd_Asc() { regOBA("SKUCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKUCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Skucd_Desc() { regOBD("SKUCD"); return this; }

    protected ConditionValue _destinationcd;
    public ConditionValue xdfgetDestinationcd()
    { if (_destinationcd == null) { _destinationcd = nCV(); }
      return _destinationcd; }
    protected ConditionValue xgetCValueDestinationcd() { return xdfgetDestinationcd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Destinationcd_Asc() { regOBA("DESTINATIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Destinationcd_Desc() { regOBD("DESTINATIONCD"); return this; }

    protected ConditionValue _manufacturecd;
    public ConditionValue xdfgetManufacturecd()
    { if (_manufacturecd == null) { _manufacturecd = nCV(); }
      return _manufacturecd; }
    protected ConditionValue xgetCValueManufacturecd() { return xdfgetManufacturecd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _orderno;
    public ConditionValue xdfgetOrderno()
    { if (_orderno == null) { _orderno = nCV(); }
      return _orderno; }
    protected ConditionValue xgetCValueOrderno() { return xdfgetOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Orderno_Asc() { regOBA("ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Orderno_Desc() { regOBD("ORDERNO"); return this; }

    protected ConditionValue _machineno;
    public ConditionValue xdfgetMachineno()
    { if (_machineno == null) { _machineno = nCV(); }
      return _machineno; }
    protected ConditionValue xgetCValueMachineno() { return xdfgetMachineno(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Machineno_Asc() { regOBA("MACHINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Machineno_Desc() { regOBD("MACHINENO"); return this; }

    protected ConditionValue _createno;
    public ConditionValue xdfgetCreateno()
    { if (_createno == null) { _createno = nCV(); }
      return _createno; }
    protected ConditionValue xgetCValueCreateno() { return xdfgetCreateno(); }

    /**
     * Add order-by as ascend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

    protected ConditionValue _limitdate;
    public ConditionValue xdfgetLimitdate()
    { if (_limitdate == null) { _limitdate = nCV(); }
      return _limitdate; }
    protected ConditionValue xgetCValueLimitdate() { return xdfgetLimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _datetime;
    public ConditionValue xdfgetDatetime()
    { if (_datetime == null) { _datetime = nCV(); }
      return _datetime; }
    protected ConditionValue xgetCValueDatetime() { return xdfgetDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Datetime_Asc() { regOBA("DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Datetime_Desc() { regOBD("DATETIME"); return this; }

    protected ConditionValue _distributioncd;
    public ConditionValue xdfgetDistributioncd()
    { if (_distributioncd == null) { _distributioncd = nCV(); }
      return _distributioncd; }
    protected ConditionValue xgetCValueDistributioncd() { return xdfgetDistributioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Distributioncd_Asc() { regOBA("DISTRIBUTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Distributioncd_Desc() { regOBD("DISTRIBUTIONCD"); return this; }

    protected ConditionValue _operationnum;
    public ConditionValue xdfgetOperationnum()
    { if (_operationnum == null) { _operationnum = nCV(); }
      return _operationnum; }
    protected ConditionValue xgetCValueOperationnum() { return xdfgetOperationnum(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Operationnum_Asc() { regOBA("OPERATIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Operationnum_Desc() { regOBD("OPERATIONNUM"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

    protected ConditionValue _firmcarryno;
    public ConditionValue xdfgetFirmcarryno()
    { if (_firmcarryno == null) { _firmcarryno = nCV(); }
      return _firmcarryno; }
    protected ConditionValue xgetCValueFirmcarryno() { return xdfgetFirmcarryno(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Firmcarryno_Asc() { regOBA("FIRMCARRYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Firmcarryno_Desc() { regOBD("FIRMCARRYNO"); return this; }

    protected ConditionValue _batjproductionym;
    public ConditionValue xdfgetBatjproductionym()
    { if (_batjproductionym == null) { _batjproductionym = nCV(); }
      return _batjproductionym; }
    protected ConditionValue xgetCValueBatjproductionym() { return xdfgetBatjproductionym(); }

    /**
     * Add order-by as ascend. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Batjproductionym_Asc() { regOBA("BATJPRODUCTIONYM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Batjproductionym_Desc() { regOBD("BATJPRODUCTIONYM"); return this; }

    protected ConditionValue _cometodate;
    public ConditionValue xdfgetCometodate()
    { if (_cometodate == null) { _cometodate = nCV(); }
      return _cometodate; }
    protected ConditionValue xgetCValueCometodate() { return xdfgetCometodate(); }

    /**
     * Add order-by as ascend. <br>
     * COMETODATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Cometodate_Asc() { regOBA("COMETODATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMETODATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Cometodate_Desc() { regOBD("COMETODATE"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _cardboardno;
    public ConditionValue xdfgetCardboardno()
    { if (_cardboardno == null) { _cardboardno = nCV(); }
      return _cardboardno; }
    protected ConditionValue xgetCValueCardboardno() { return xdfgetCardboardno(); }

    /**
     * Add order-by as ascend. <br>
     * CARDBOARDNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Cardboardno_Asc() { regOBA("CARDBOARDNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARDBOARDNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Cardboardno_Desc() { regOBD("CARDBOARDNO"); return this; }

    protected ConditionValue _rcvpalletno;
    public ConditionValue xdfgetRcvpalletno()
    { if (_rcvpalletno == null) { _rcvpalletno = nCV(); }
      return _rcvpalletno; }
    protected ConditionValue xgetCValueRcvpalletno() { return xdfgetRcvpalletno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvpalletno_Asc() { regOBA("RCVPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Rcvpalletno_Desc() { regOBD("RCVPALLETNO"); return this; }

    protected ConditionValue _taxpalletno;
    public ConditionValue xdfgetTaxpalletno()
    { if (_taxpalletno == null) { _taxpalletno = nCV(); }
      return _taxpalletno; }
    protected ConditionValue xgetCValueTaxpalletno() { return xdfgetTaxpalletno(); }

    /**
     * Add order-by as ascend. <br>
     * TAXPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Taxpalletno_Asc() { regOBA("TAXPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_Taxpalletno_Desc() { regOBD("TAXPALLETNO"); return this; }

    protected ConditionValue _itemcdIn;
    public ConditionValue xdfgetItemcdIn()
    { if (_itemcdIn == null) { _itemcdIn = nCV(); }
      return _itemcdIn; }
    protected ConditionValue xgetCValueItemcdIn() { return xdfgetItemcdIn(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ItemcdIn_Asc() { regOBA("ITEMCD_IN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ItemcdIn_Desc() { regOBD("ITEMCD_IN"); return this; }

    protected ConditionValue _itemcdWh;
    public ConditionValue xdfgetItemcdWh()
    { if (_itemcdWh == null) { _itemcdWh = nCV(); }
      return _itemcdWh; }
    protected ConditionValue xgetCValueItemcdWh() { return xdfgetItemcdWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ItemcdWh_Asc() { regOBA("ITEMCD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ItemcdWh_Desc() { regOBD("ITEMCD_WH"); return this; }

    protected ConditionValue _designcdIn;
    public ConditionValue xdfgetDesigncdIn()
    { if (_designcdIn == null) { _designcdIn = nCV(); }
      return _designcdIn; }
    protected ConditionValue xgetCValueDesigncdIn() { return xdfgetDesigncdIn(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DesigncdIn_Asc() { regOBA("DESIGNCD_IN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DesigncdIn_Desc() { regOBD("DESIGNCD_IN"); return this; }

    protected ConditionValue _designcdWh;
    public ConditionValue xdfgetDesigncdWh()
    { if (_designcdWh == null) { _designcdWh = nCV(); }
      return _designcdWh; }
    protected ConditionValue xgetCValueDesigncdWh() { return xdfgetDesigncdWh(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DesigncdWh_Asc() { regOBA("DESIGNCD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DesigncdWh_Desc() { regOBD("DESIGNCD_WH"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrflexibilityproductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrflexibilityproductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrflexibilityproductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrflexibilityproductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrflexibilityproductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrflexibilityproductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrflexibilityproductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrflexibilityproductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrflexibilityproductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrflexibilityproductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrflexibilityproductCQ> _myselfExistsMap;
    public Map<String, TTrflexibilityproductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrflexibilityproductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrflexibilityproductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrflexibilityproductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrflexibilityproductCB.class.getName(); }
    protected String xCQ() { return TTrflexibilityproductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
