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
 * The base condition-query of T_TRLEAVERESULT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrleaveresultCQ extends AbstractBsTTrleaveresultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrleaveresultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrleaveresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRLEAVERESULT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrleaveresultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrleaveresultCIQ xcreateCIQ() {
        TTrleaveresultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrleaveresultCIQ xnewCIQ() {
        return new TTrleaveresultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRLEAVERESULT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrleaveresultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrleaveresultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trleaveresultId;
    public ConditionValue xdfgetTrleaveresultId()
    { if (_trleaveresultId == null) { _trleaveresultId = nCV(); }
      return _trleaveresultId; }
    protected ConditionValue xgetCValueTrleaveresultId() { return xdfgetTrleaveresultId(); }

    /**
     * Add order-by as ascend. <br>
     * TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_TrleaveresultId_Asc() { regOBA("TRLEAVERESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_TrleaveresultId_Desc() { regOBD("TRLEAVERESULT_ID"); return this; }

    protected ConditionValue _leaveresultkey;
    public ConditionValue xdfgetLeaveresultkey()
    { if (_leaveresultkey == null) { _leaveresultkey = nCV(); }
      return _leaveresultkey; }
    protected ConditionValue xgetCValueLeaveresultkey() { return xdfgetLeaveresultkey(); }

    /**
     * Add order-by as ascend. <br>
     * LEAVERESULTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Leaveresultkey_Asc() { regOBA("LEAVERESULTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LEAVERESULTKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Leaveresultkey_Desc() { regOBD("LEAVERESULTKEY"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Taxpalletno_Asc() { regOBA("TAXPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Taxpalletno_Desc() { regOBD("TAXPALLETNO"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Machineno_Asc() { regOBA("MACHINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Machineno_Desc() { regOBD("MACHINENO"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

    protected ConditionValue _caseflg;
    public ConditionValue xdfgetCaseflg()
    { if (_caseflg == null) { _caseflg = nCV(); }
      return _caseflg; }
    protected ConditionValue xgetCValueCaseflg() { return xdfgetCaseflg(); }

    /**
     * Add order-by as ascend. <br>
     * CASEFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Caseflg_Asc() { regOBA("CASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Caseflg_Desc() { regOBD("CASEFLG"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Firmcarryno_Asc() { regOBA("FIRMCARRYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Firmcarryno_Desc() { regOBD("FIRMCARRYNO"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

    protected ConditionValue _batjmfym;
    public ConditionValue xdfgetBatjmfym()
    { if (_batjmfym == null) { _batjmfym = nCV(); }
      return _batjmfym; }
    protected ConditionValue xgetCValueBatjmfym() { return xdfgetBatjmfym(); }

    /**
     * Add order-by as ascend. <br>
     * BATJMFYM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Batjmfym_Asc() { regOBA("BATJMFYM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATJMFYM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Batjmfym_Desc() { regOBD("BATJMFYM"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _lastitemcd;
    public ConditionValue xdfgetLastitemcd()
    { if (_lastitemcd == null) { _lastitemcd = nCV(); }
      return _lastitemcd; }
    protected ConditionValue xgetCValueLastitemcd() { return xdfgetLastitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * LASTITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Lastitemcd_Asc() { regOBA("LASTITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LASTITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Lastitemcd_Desc() { regOBD("LASTITEMCD"); return this; }

    protected ConditionValue _lastdesigncd;
    public ConditionValue xdfgetLastdesigncd()
    { if (_lastdesigncd == null) { _lastdesigncd = nCV(); }
      return _lastdesigncd; }
    protected ConditionValue xgetCValueLastdesigncd() { return xdfgetLastdesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * LASTDESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Lastdesigncd_Asc() { regOBA("LASTDESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LASTDESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Lastdesigncd_Desc() { regOBD("LASTDESIGNCD"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

    protected ConditionValue _carryoutdate;
    public ConditionValue xdfgetCarryoutdate()
    { if (_carryoutdate == null) { _carryoutdate = nCV(); }
      return _carryoutdate; }
    protected ConditionValue xgetCValueCarryoutdate() { return xdfgetCarryoutdate(); }

    /**
     * Add order-by as ascend. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Carryoutdate_Asc() { regOBA("CARRYOUTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Carryoutdate_Desc() { regOBD("CARRYOUTDATE"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

    protected ConditionValue _rcvdate;
    public ConditionValue xdfgetRcvdate()
    { if (_rcvdate == null) { _rcvdate = nCV(); }
      return _rcvdate; }
    protected ConditionValue xgetCValueRcvdate() { return xdfgetRcvdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Rcvdate_Asc() { regOBA("RCVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Rcvdate_Desc() { regOBD("RCVDATE"); return this; }

    protected ConditionValue _shtypecd;
    public ConditionValue xdfgetShtypecd()
    { if (_shtypecd == null) { _shtypecd = nCV(); }
      return _shtypecd; }
    protected ConditionValue xgetCValueShtypecd() { return xdfgetShtypecd(); }

    /**
     * Add order-by as ascend. <br>
     * SHTYPECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Shtypecd_Asc() { regOBA("SHTYPECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHTYPECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Shtypecd_Desc() { regOBD("SHTYPECD"); return this; }

    protected ConditionValue _tplqty;
    public ConditionValue xdfgetTplqty()
    { if (_tplqty == null) { _tplqty = nCV(); }
      return _tplqty; }
    protected ConditionValue xgetCValueTplqty() { return xdfgetTplqty(); }

    /**
     * Add order-by as ascend. <br>
     * TPLQTY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Tplqty_Asc() { regOBA("TPLQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TPLQTY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Tplqty_Desc() { regOBD("TPLQTY"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_Rcvpalletno_Asc() { regOBA("RCVPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Rcvpalletno_Desc() { regOBD("RCVPALLETNO"); return this; }

    protected ConditionValue _caseqty;
    public ConditionValue xdfgetCaseqty()
    { if (_caseqty == null) { _caseqty = nCV(); }
      return _caseqty; }
    protected ConditionValue xgetCValueCaseqty() { return xdfgetCaseqty(); }

    /**
     * Add order-by as ascend. <br>
     * CASEQTY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Caseqty_Asc() { regOBA("CASEQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEQTY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_Caseqty_Desc() { regOBD("CASEQTY"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_EXTDATA1"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_EXTDATA2"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_EXTDATA3"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_EXTDATA1"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_EXTDATA2"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_EXTDATA3"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_EXTDATA1"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_EXTDATA2"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_EXTDATA3"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_EXTDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_EXTDATA1"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_EXTDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_EXTDATA2"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_EXTDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_EXTDATA3"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrleaveresultCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrleaveresultCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrleaveresultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrleaveresultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrleaveresultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrleaveresultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrleaveresultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrleaveresultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrleaveresultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrleaveresultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrleaveresultCQ> _myselfExistsMap;
    public Map<String, TTrleaveresultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrleaveresultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrleaveresultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrleaveresultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrleaveresultCB.class.getName(); }
    protected String xCQ() { return TTrleaveresultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
