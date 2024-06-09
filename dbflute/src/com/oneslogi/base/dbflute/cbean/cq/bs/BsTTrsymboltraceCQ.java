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
 * The base condition-query of T_TRSYMBOLTRACE.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsymboltraceCQ extends AbstractBsTTrsymboltraceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsymboltraceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsymboltraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSYMBOLTRACE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsymboltraceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsymboltraceCIQ xcreateCIQ() {
        TTrsymboltraceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsymboltraceCIQ xnewCIQ() {
        return new TTrsymboltraceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSYMBOLTRACE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsymboltraceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsymboltraceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trsymboltraceId;
    public ConditionValue xdfgetTrsymboltraceId()
    { if (_trsymboltraceId == null) { _trsymboltraceId = nCV(); }
      return _trsymboltraceId; }
    protected ConditionValue xgetCValueTrsymboltraceId() { return xdfgetTrsymboltraceId(); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_TrsymboltraceId_Asc() { regOBA("TRSYMBOLTRACE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_TrsymboltraceId_Desc() { regOBD("TRSYMBOLTRACE_ID"); return this; }

    protected ConditionValue _symboltracekey;
    public ConditionValue xdfgetSymboltracekey()
    { if (_symboltracekey == null) { _symboltracekey = nCV(); }
      return _symboltracekey; }
    protected ConditionValue xgetCValueSymboltracekey() { return xdfgetSymboltracekey(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Symboltracekey_Asc() { regOBA("SYMBOLTRACEKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Symboltracekey_Desc() { regOBD("SYMBOLTRACEKEY"); return this; }

    protected ConditionValue _trsymbolId;
    public ConditionValue xdfgetTrsymbolId()
    { if (_trsymbolId == null) { _trsymbolId = nCV(); }
      return _trsymbolId; }
    protected ConditionValue xgetCValueTrsymbolId() { return xdfgetTrsymbolId(); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_TrsymbolId_Asc() { regOBA("TRSYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_TrsymbolId_Desc() { regOBD("TRSYMBOL_ID"); return this; }

    protected ConditionValue _createdatetime;
    public ConditionValue xdfgetCreatedatetime()
    { if (_createdatetime == null) { _createdatetime = nCV(); }
      return _createdatetime; }
    protected ConditionValue xgetCValueCreatedatetime() { return xdfgetCreatedatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Createdatetime_Asc() { regOBA("CREATEDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Createdatetime_Desc() { regOBD("CREATEDATETIME"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _tracetype;
    public ConditionValue xdfgetTracetype()
    { if (_tracetype == null) { _tracetype = nCV(); }
      return _tracetype; }
    protected ConditionValue xgetCValueTracetype() { return xdfgetTracetype(); }

    /**
     * Add order-by as ascend. <br>
     * TRACETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Tracetype_Asc() { regOBA("TRACETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Tracetype_Desc() { regOBD("TRACETYPE"); return this; }

    protected ConditionValue _initnum;
    public ConditionValue xdfgetInitnum()
    { if (_initnum == null) { _initnum = nCV(); }
      return _initnum; }
    protected ConditionValue xgetCValueInitnum() { return xdfgetInitnum(); }

    /**
     * Add order-by as ascend. <br>
     * INITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Initnum_Asc() { regOBA("INITNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Initnum_Desc() { regOBD("INITNUM"); return this; }

    protected ConditionValue _caseinnum;
    public ConditionValue xdfgetCaseinnum()
    { if (_caseinnum == null) { _caseinnum = nCV(); }
      return _caseinnum; }
    protected ConditionValue xgetCValueCaseinnum() { return xdfgetCaseinnum(); }

    /**
     * Add order-by as ascend. <br>
     * CASEINNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Caseinnum_Asc() { regOBA("CASEINNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEINNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Caseinnum_Desc() { regOBD("CASEINNUM"); return this; }

    protected ConditionValue _assortnum;
    public ConditionValue xdfgetAssortnum()
    { if (_assortnum == null) { _assortnum = nCV(); }
      return _assortnum; }
    protected ConditionValue xgetCValueAssortnum() { return xdfgetAssortnum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Assortnum_Asc() { regOBA("ASSORTNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORTNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Assortnum_Desc() { regOBD("ASSORTNUM"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Directionnum_Asc() { regOBA("DIRECTIONNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Directionnum_Desc() { regOBD("DIRECTIONNUM"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Customercd_Asc() { regOBA("CUSTOMERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Customercd_Desc() { regOBD("CUSTOMERCD"); return this; }

    protected ConditionValue _distwarehousecd;
    public ConditionValue xdfgetDistwarehousecd()
    { if (_distwarehousecd == null) { _distwarehousecd = nCV(); }
      return _distwarehousecd; }
    protected ConditionValue xgetCValueDistwarehousecd() { return xdfgetDistwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Distwarehousecd_Asc() { regOBA("DISTWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Distwarehousecd_Desc() { regOBD("DISTWAREHOUSECD"); return this; }

    protected ConditionValue _mixedflg;
    public ConditionValue xdfgetMixedflg()
    { if (_mixedflg == null) { _mixedflg = nCV(); }
      return _mixedflg; }
    protected ConditionValue xgetCValueMixedflg() { return xdfgetMixedflg(); }

    /**
     * Add order-by as ascend. <br>
     * MIXEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Mixedflg_Asc() { regOBA("MIXEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIXEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Mixedflg_Desc() { regOBD("MIXEDFLG"); return this; }

    protected ConditionValue _loccd;
    public ConditionValue xdfgetLoccd()
    { if (_loccd == null) { _loccd = nCV(); }
      return _loccd; }
    protected ConditionValue xgetCValueLoccd() { return xdfgetLoccd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _otherlot1;
    public ConditionValue xdfgetOtherlot1()
    { if (_otherlot1 == null) { _otherlot1 = nCV(); }
      return _otherlot1; }
    protected ConditionValue xgetCValueOtherlot1() { return xdfgetOtherlot1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

    protected ConditionValue _noshippingflg;
    public ConditionValue xdfgetNoshippingflg()
    { if (_noshippingflg == null) { _noshippingflg = nCV(); }
      return _noshippingflg; }
    protected ConditionValue xgetCValueNoshippingflg() { return xdfgetNoshippingflg(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

    protected ConditionValue _ifitemcd;
    public ConditionValue xdfgetIfitemcd()
    { if (_ifitemcd == null) { _ifitemcd = nCV(); }
      return _ifitemcd; }
    protected ConditionValue xgetCValueIfitemcd() { return xdfgetIfitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * IFITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Ifitemcd_Asc() { regOBA("IFITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Ifitemcd_Desc() { regOBD("IFITEMCD"); return this; }

    protected ConditionValue _sendflg;
    public ConditionValue xdfgetSendflg()
    { if (_sendflg == null) { _sendflg = nCV(); }
      return _sendflg; }
    protected ConditionValue xgetCValueSendflg() { return xdfgetSendflg(); }

    /**
     * Add order-by as ascend. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Sendflg_Asc() { regOBA("SENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Sendflg_Desc() { regOBD("SENDFLG"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

    protected ConditionValue _palletno;
    public ConditionValue xdfgetPalletno()
    { if (_palletno == null) { _palletno = nCV(); }
      return _palletno; }
    protected ConditionValue xgetCValuePalletno() { return xdfgetPalletno(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Palletno_Asc() { regOBA("PALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETNO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Palletno_Desc() { regOBD("PALLETNO"); return this; }

    protected ConditionValue _sokey;
    public ConditionValue xdfgetSokey()
    { if (_sokey == null) { _sokey = nCV(); }
      return _sokey; }
    protected ConditionValue xgetCValueSokey() { return xdfgetSokey(); }

    /**
     * Add order-by as ascend. <br>
     * SOKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Sokey_Asc() { regOBA("SOKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Sokey_Desc() { regOBD("SOKEY"); return this; }

    protected ConditionValue _fax1;
    public ConditionValue xdfgetFax1()
    { if (_fax1 == null) { _fax1 = nCV(); }
      return _fax1; }
    protected ConditionValue xgetCValueFax1() { return xdfgetFax1(); }

    /**
     * Add order-by as ascend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Fax1_Asc() { regOBA("FAX1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Fax1_Desc() { regOBD("FAX1"); return this; }

    protected ConditionValue _originalpono;
    public ConditionValue xdfgetOriginalpono()
    { if (_originalpono == null) { _originalpono = nCV(); }
      return _originalpono; }
    protected ConditionValue xgetCValueOriginalpono() { return xdfgetOriginalpono(); }

    /**
     * Add order-by as ascend. <br>
     * ORIGINALPONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Originalpono_Asc() { regOBA("ORIGINALPONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORIGINALPONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Originalpono_Desc() { regOBD("ORIGINALPONO"); return this; }

    protected ConditionValue _mosjtsendflg;
    public ConditionValue xdfgetMosjtsendflg()
    { if (_mosjtsendflg == null) { _mosjtsendflg = nCV(); }
      return _mosjtsendflg; }
    protected ConditionValue xgetCValueMosjtsendflg() { return xdfgetMosjtsendflg(); }

    /**
     * Add order-by as ascend. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Mosjtsendflg_Asc() { regOBA("MOSJTSENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Mosjtsendflg_Desc() { regOBD("MOSJTSENDFLG"); return this; }

    protected ConditionValue _shipdate;
    public ConditionValue xdfgetShipdate()
    { if (_shipdate == null) { _shipdate = nCV(); }
      return _shipdate; }
    protected ConditionValue xgetCValueShipdate() { return xdfgetShipdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Shipdate_Asc() { regOBA("SHIPDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Shipdate_Desc() { regOBD("SHIPDATE"); return this; }

    protected ConditionValue _delivname;
    public ConditionValue xdfgetDelivname()
    { if (_delivname == null) { _delivname = nCV(); }
      return _delivname; }
    protected ConditionValue xgetCValueDelivname() { return xdfgetDelivname(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Delivname_Asc() { regOBA("DELIVNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_Delivname_Desc() { regOBD("DELIVNAME"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsymboltraceCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsymboltraceCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsymboltraceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsymboltraceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrsymboltraceCQ bq = (TTrsymboltraceCQ)bqs;
        TTrsymboltraceCQ uq = (TTrsymboltraceCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_TRSYMBOLTRACE", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_TRSYMBOLTRACE", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrsymboltraceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsymboltraceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsymboltraceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsymboltraceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsymboltraceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsymboltraceCQ> _myselfExistsMap;
    public Map<String, TTrsymboltraceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsymboltraceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsymboltraceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsymboltraceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsymboltraceCB.class.getName(); }
    protected String xCQ() { return TTrsymboltraceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
