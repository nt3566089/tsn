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
 * The base condition-query of W_WKPALLET.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkpalletCQ extends AbstractBsWWkpalletCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkpalletCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkpalletCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKPALLET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkpalletCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkpalletCIQ xcreateCIQ() {
        WWkpalletCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkpalletCIQ xnewCIQ() {
        return new WWkpalletCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKPALLET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkpalletCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkpalletCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _wkpalletId;
    public ConditionValue xdfgetWkpalletId()
    { if (_wkpalletId == null) { _wkpalletId = nCV(); }
      return _wkpalletId; }
    protected ConditionValue xgetCValueWkpalletId() { return xdfgetWkpalletId(); }

    /**
     * Add order-by as ascend. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_WkpalletId_Asc() { regOBA("WKPALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_WkpalletId_Desc() { regOBD("WKPALLET_ID"); return this; }

    protected ConditionValue _palletno;
    public ConditionValue xdfgetPalletno()
    { if (_palletno == null) { _palletno = nCV(); }
      return _palletno; }
    protected ConditionValue xgetCValuePalletno() { return xdfgetPalletno(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Palletno_Asc() { regOBA("PALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Palletno_Desc() { regOBD("PALLETNO"); return this; }

    protected ConditionValue _printkey;
    public ConditionValue xdfgetPrintkey()
    { if (_printkey == null) { _printkey = nCV(); }
      return _printkey; }
    protected ConditionValue xgetCValuePrintkey() { return xdfgetPrintkey(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Printkey_Asc() { regOBA("PRINTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Printkey_Desc() { regOBD("PRINTKEY"); return this; }

    protected ConditionValue _lotkey;
    public ConditionValue xdfgetLotkey()
    { if (_lotkey == null) { _lotkey = nCV(); }
      return _lotkey; }
    protected ConditionValue xgetCValueLotkey() { return xdfgetLotkey(); }

    /**
     * Add order-by as ascend. <br>
     * LotKey: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lotkey_Asc() { regOBA("LotKey"); return this; }

    /**
     * Add order-by as descend. <br>
     * LotKey: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lotkey_Desc() { regOBD("LotKey"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RcvKey: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvkey_Asc() { regOBA("RcvKey"); return this; }

    /**
     * Add order-by as descend. <br>
     * RcvKey: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvkey_Desc() { regOBD("RcvKey"); return this; }

    protected ConditionValue _rcvlineno;
    public ConditionValue xdfgetRcvlineno()
    { if (_rcvlineno == null) { _rcvlineno = nCV(); }
      return _rcvlineno; }
    protected ConditionValue xgetCValueRcvlineno() { return xdfgetRcvlineno(); }

    /**
     * Add order-by as ascend. <br>
     * RcvLineNo: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvlineno_Asc() { regOBA("RcvLineNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * RcvLineNo: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvlineno_Desc() { regOBD("RcvLineNo"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _printingdate;
    public ConditionValue xdfgetPrintingdate()
    { if (_printingdate == null) { _printingdate = nCV(); }
      return _printingdate; }
    protected ConditionValue xgetCValuePrintingdate() { return xdfgetPrintingdate(); }

    /**
     * Add order-by as ascend. <br>
     * PrintingDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Printingdate_Asc() { regOBA("PrintingDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * PrintingDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Printingdate_Desc() { regOBD("PrintingDate"); return this; }

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
    public BsWWkpalletCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _transportno;
    public ConditionValue xdfgetTransportno()
    { if (_transportno == null) { _transportno = nCV(); }
      return _transportno; }
    protected ConditionValue xgetCValueTransportno() { return xdfgetTransportno(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Transportno_Asc() { regOBA("TRANSPORTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Transportno_Desc() { regOBD("TRANSPORTNO"); return this; }

    protected ConditionValue _sourcecd;
    public ConditionValue xdfgetSourcecd()
    { if (_sourcecd == null) { _sourcecd = nCV(); }
      return _sourcecd; }
    protected ConditionValue xgetCValueSourcecd() { return xdfgetSourcecd(); }

    /**
     * Add order-by as ascend. <br>
     * SourceCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Sourcecd_Asc() { regOBA("SourceCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * SourceCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Sourcecd_Desc() { regOBD("SourceCd"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SchDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Schdate_Asc() { regOBA("SchDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * SchDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Schdate_Desc() { regOBD("SchDate"); return this; }

    protected ConditionValue _receivecd;
    public ConditionValue xdfgetReceivecd()
    { if (_receivecd == null) { _receivecd = nCV(); }
      return _receivecd; }
    protected ConditionValue xgetCValueReceivecd() { return xdfgetReceivecd(); }

    /**
     * Add order-by as ascend. <br>
     * ReceiveCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receivecd_Asc() { regOBA("ReceiveCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReceiveCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receivecd_Desc() { regOBD("ReceiveCd"); return this; }

    protected ConditionValue _rcvdate;
    public ConditionValue xdfgetRcvdate()
    { if (_rcvdate == null) { _rcvdate = nCV(); }
      return _rcvdate; }
    protected ConditionValue xgetCValueRcvdate() { return xdfgetRcvdate(); }

    /**
     * Add order-by as ascend. <br>
     * RcvDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvdate_Asc() { regOBA("RcvDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * RcvDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvdate_Desc() { regOBD("RcvDate"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * ReceiveDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receivedate_Asc() { regOBA("ReceiveDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReceiveDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receivedate_Desc() { regOBD("ReceiveDate"); return this; }

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
    public BsWWkpalletCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

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
    public BsWWkpalletCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsWWkpalletCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsWWkpalletCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _receiveqtycase;
    public ConditionValue xdfgetReceiveqtycase()
    { if (_receiveqtycase == null) { _receiveqtycase = nCV(); }
      return _receiveqtycase; }
    protected ConditionValue xgetCValueReceiveqtycase() { return xdfgetReceiveqtycase(); }

    /**
     * Add order-by as ascend. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receiveqtycase_Asc() { regOBA("ReceiveQtyCase"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReceiveQtyCase: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receiveqtycase_Desc() { regOBD("ReceiveQtyCase"); return this; }

    protected ConditionValue _receiveqtybowl;
    public ConditionValue xdfgetReceiveqtybowl()
    { if (_receiveqtybowl == null) { _receiveqtybowl = nCV(); }
      return _receiveqtybowl; }
    protected ConditionValue xgetCValueReceiveqtybowl() { return xdfgetReceiveqtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receiveqtybowl_Asc() { regOBA("ReceiveQtyBowl"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receiveqtybowl_Desc() { regOBD("ReceiveQtyBowl"); return this; }

    protected ConditionValue _receiveqty;
    public ConditionValue xdfgetReceiveqty()
    { if (_receiveqty == null) { _receiveqty = nCV(); }
      return _receiveqty; }
    protected ConditionValue xgetCValueReceiveqty() { return xdfgetReceiveqty(); }

    /**
     * Add order-by as ascend. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receiveqty_Asc() { regOBA("ReceiveQty"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReceiveQty: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Receiveqty_Desc() { regOBD("ReceiveQty"); return this; }

    protected ConditionValue _restqtycase;
    public ConditionValue xdfgetRestqtycase()
    { if (_restqtycase == null) { _restqtycase = nCV(); }
      return _restqtycase; }
    protected ConditionValue xgetCValueRestqtycase() { return xdfgetRestqtycase(); }

    /**
     * Add order-by as ascend. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Restqtycase_Asc() { regOBA("RestQtyCase"); return this; }

    /**
     * Add order-by as descend. <br>
     * RestQtyCase: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Restqtycase_Desc() { regOBD("RestQtyCase"); return this; }

    protected ConditionValue _restqtybowl;
    public ConditionValue xdfgetRestqtybowl()
    { if (_restqtybowl == null) { _restqtybowl = nCV(); }
      return _restqtybowl; }
    protected ConditionValue xgetCValueRestqtybowl() { return xdfgetRestqtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Restqtybowl_Asc() { regOBA("RestQtyBowl"); return this; }

    /**
     * Add order-by as descend. <br>
     * RestQtyBowl: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Restqtybowl_Desc() { regOBD("RestQtyBowl"); return this; }

    protected ConditionValue _restqty;
    public ConditionValue xdfgetRestqty()
    { if (_restqty == null) { _restqty = nCV(); }
      return _restqty; }
    protected ConditionValue xgetCValueRestqty() { return xdfgetRestqty(); }

    /**
     * Add order-by as ascend. <br>
     * RestQty: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Restqty_Asc() { regOBA("RestQty"); return this; }

    /**
     * Add order-by as descend. <br>
     * RestQty: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Restqty_Desc() { regOBD("RestQty"); return this; }

    protected ConditionValue _palletsts;
    public ConditionValue xdfgetPalletsts()
    { if (_palletsts == null) { _palletsts = nCV(); }
      return _palletsts; }
    protected ConditionValue xgetCValuePalletsts() { return xdfgetPalletsts(); }

    /**
     * Add order-by as ascend. <br>
     * PalletSts: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Palletsts_Asc() { regOBA("PalletSts"); return this; }

    /**
     * Add order-by as descend. <br>
     * PalletSts: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Palletsts_Desc() { regOBD("PalletSts"); return this; }

    protected ConditionValue _pluralproductionkbn;
    public ConditionValue xdfgetPluralproductionkbn()
    { if (_pluralproductionkbn == null) { _pluralproductionkbn = nCV(); }
      return _pluralproductionkbn; }
    protected ConditionValue xgetCValuePluralproductionkbn() { return xdfgetPluralproductionkbn(); }

    /**
     * Add order-by as ascend. <br>
     * PluralproductionKBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Pluralproductionkbn_Asc() { regOBA("PluralproductionKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * PluralproductionKBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Pluralproductionkbn_Desc() { regOBD("PluralproductionKBN"); return this; }

    protected ConditionValue _rtnrcvkbn;
    public ConditionValue xdfgetRtnrcvkbn()
    { if (_rtnrcvkbn == null) { _rtnrcvkbn = nCV(); }
      return _rtnrcvkbn; }
    protected ConditionValue xgetCValueRtnrcvkbn() { return xdfgetRtnrcvkbn(); }

    /**
     * Add order-by as ascend. <br>
     * RtnRcvKbn: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rtnrcvkbn_Asc() { regOBA("RtnRcvKbn"); return this; }

    /**
     * Add order-by as descend. <br>
     * RtnRcvKbn: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rtnrcvkbn_Desc() { regOBD("RtnRcvKbn"); return this; }

    protected ConditionValue _shtypecd;
    public ConditionValue xdfgetShtypecd()
    { if (_shtypecd == null) { _shtypecd = nCV(); }
      return _shtypecd; }
    protected ConditionValue xgetCValueShtypecd() { return xdfgetShtypecd(); }

    /**
     * Add order-by as ascend. <br>
     * ShTypeCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Shtypecd_Asc() { regOBA("ShTypeCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShTypeCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Shtypecd_Desc() { regOBD("ShTypeCd"); return this; }

    protected ConditionValue _palletcuttingkbn;
    public ConditionValue xdfgetPalletcuttingkbn()
    { if (_palletcuttingkbn == null) { _palletcuttingkbn = nCV(); }
      return _palletcuttingkbn; }
    protected ConditionValue xgetCValuePalletcuttingkbn() { return xdfgetPalletcuttingkbn(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETCUTTINGKBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Palletcuttingkbn_Asc() { regOBA("PALLETCUTTINGKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETCUTTINGKBN: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Palletcuttingkbn_Desc() { regOBD("PALLETCUTTINGKBN"); return this; }

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
    public BsWWkpalletCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _rcvpalletno;
    public ConditionValue xdfgetRcvpalletno()
    { if (_rcvpalletno == null) { _rcvpalletno = nCV(); }
      return _rcvpalletno; }
    protected ConditionValue xgetCValueRcvpalletno() { return xdfgetRcvpalletno(); }

    /**
     * Add order-by as ascend. <br>
     * RcvPalletNo: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvpalletno_Asc() { regOBA("RcvPalletNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * RcvPalletNo: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Rcvpalletno_Desc() { regOBD("RcvPalletNo"); return this; }

    protected ConditionValue _imagename1;
    public ConditionValue xdfgetImagename1()
    { if (_imagename1 == null) { _imagename1 = nCV(); }
      return _imagename1; }
    protected ConditionValue xgetCValueImagename1() { return xdfgetImagename1(); }

    /**
     * Add order-by as ascend. <br>
     * IMAGENAME1: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Imagename1_Asc() { regOBA("IMAGENAME1"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMAGENAME1: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Imagename1_Desc() { regOBD("IMAGENAME1"); return this; }

    protected ConditionValue _imagename2;
    public ConditionValue xdfgetImagename2()
    { if (_imagename2 == null) { _imagename2 = nCV(); }
      return _imagename2; }
    protected ConditionValue xgetCValueImagename2() { return xdfgetImagename2(); }

    /**
     * Add order-by as ascend. <br>
     * IMAGENAME2: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Imagename2_Asc() { regOBA("IMAGENAME2"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMAGENAME2: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Imagename2_Desc() { regOBD("IMAGENAME2"); return this; }

    protected ConditionValue _imagename3;
    public ConditionValue xdfgetImagename3()
    { if (_imagename3 == null) { _imagename3 = nCV(); }
      return _imagename3; }
    protected ConditionValue xgetCValueImagename3() { return xdfgetImagename3(); }

    /**
     * Add order-by as ascend. <br>
     * IMAGENAME3: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Imagename3_Asc() { regOBA("IMAGENAME3"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMAGENAME3: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Imagename3_Desc() { regOBD("IMAGENAME3"); return this; }

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
    public BsWWkpalletCQ addOrderBy_WarehouseSname_Asc() { regOBA("WAREHOUSE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_WarehouseSname_Desc() { regOBD("WAREHOUSE_SNAME"); return this; }

    protected ConditionValue _itemSname;
    public ConditionValue xdfgetItemSname()
    { if (_itemSname == null) { _itemSname = nCV(); }
      return _itemSname; }
    protected ConditionValue xgetCValueItemSname() { return xdfgetItemSname(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_ItemSname_Asc() { regOBA("ITEM_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_ItemSname_Desc() { regOBD("ITEM_SNAME"); return this; }

    protected ConditionValue _foreigncargocd;
    public ConditionValue xdfgetForeigncargocd()
    { if (_foreigncargocd == null) { _foreigncargocd = nCV(); }
      return _foreigncargocd; }
    protected ConditionValue xgetCValueForeigncargocd() { return xdfgetForeigncargocd(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Foreigncargocd_Asc() { regOBA("FOREIGNCARGOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Foreigncargocd_Desc() { regOBD("FOREIGNCARGOCD"); return this; }

    protected ConditionValue _carrierseq;
    public ConditionValue xdfgetCarrierseq()
    { if (_carrierseq == null) { _carrierseq = nCV(); }
      return _carrierseq; }
    protected ConditionValue xgetCValueCarrierseq() { return xdfgetCarrierseq(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSEQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Carrierseq_Asc() { regOBA("CARRIERSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSEQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Carrierseq_Desc() { regOBD("CARRIERSEQ"); return this; }

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
    public BsWWkpalletCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

    protected ConditionValue _usernum3;
    public ConditionValue xdfgetUsernum3()
    { if (_usernum3 == null) { _usernum3 = nCV(); }
      return _usernum3; }
    protected ConditionValue xgetCValueUsernum3() { return xdfgetUsernum3(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Usernum3_Asc() { regOBA("USERNUM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Usernum3_Desc() { regOBD("USERNUM3"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _acceptusercd;
    public ConditionValue xdfgetAcceptusercd()
    { if (_acceptusercd == null) { _acceptusercd = nCV(); }
      return _acceptusercd; }
    protected ConditionValue xgetCValueAcceptusercd() { return xdfgetAcceptusercd(); }

    /**
     * Add order-by as ascend. <br>
     * AcceptUserCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Acceptusercd_Asc() { regOBA("AcceptUserCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * AcceptUserCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Acceptusercd_Desc() { regOBD("AcceptUserCd"); return this; }

    protected ConditionValue _acceptdate;
    public ConditionValue xdfgetAcceptdate()
    { if (_acceptdate == null) { _acceptdate = nCV(); }
      return _acceptdate; }
    protected ConditionValue xgetCValueAcceptdate() { return xdfgetAcceptdate(); }

    /**
     * Add order-by as ascend. <br>
     * AcceptDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Acceptdate_Asc() { regOBA("AcceptDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * AcceptDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_Acceptdate_Desc() { regOBD("AcceptDate"); return this; }

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
    public BsWWkpalletCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkpalletCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkpalletCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkpalletCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkpalletCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkpalletCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkpalletCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkpalletCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkpalletCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkpalletCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkpalletCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkpalletCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWkpalletCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkpalletCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WWkpalletCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WWkpalletCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WWkpalletCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WWkpalletCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WWkpalletCQ> _myselfExistsMap;
    public Map<String, WWkpalletCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WWkpalletCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WWkpalletCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WWkpalletCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkpalletCB.class.getName(); }
    protected String xCQ() { return WWkpalletCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
