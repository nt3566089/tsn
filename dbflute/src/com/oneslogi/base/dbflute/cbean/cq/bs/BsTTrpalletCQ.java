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
 * The base condition-query of T_TRPALLET.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpalletCQ extends AbstractBsTTrpalletCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpalletCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpalletCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPALLET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpalletCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpalletCIQ xcreateCIQ() {
        TTrpalletCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpalletCIQ xnewCIQ() {
        return new TTrpalletCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPALLET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpalletCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpalletCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trpalletId;
    public ConditionValue xdfgetTrpalletId()
    { if (_trpalletId == null) { _trpalletId = nCV(); }
      return _trpalletId; }
    protected ConditionValue xgetCValueTrpalletId() { return xdfgetTrpalletId(); }

    public Map<String, TPalletCQ> xdfgetTrpalletId_ExistsReferrer_TPalletList() { return xgetSQueMap("trpalletId_ExistsReferrer_TPalletList"); }
    public String keepTrpalletId_ExistsReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("trpalletId_ExistsReferrer_TPalletList", sq); }

    public Map<String, TPalletCQ> xdfgetTrpalletId_NotExistsReferrer_TPalletList() { return xgetSQueMap("trpalletId_NotExistsReferrer_TPalletList"); }
    public String keepTrpalletId_NotExistsReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("trpalletId_NotExistsReferrer_TPalletList", sq); }

    public Map<String, TPalletCQ> xdfgetTrpalletId_SpecifyDerivedReferrer_TPalletList() { return xgetSQueMap("trpalletId_SpecifyDerivedReferrer_TPalletList"); }
    public String keepTrpalletId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("trpalletId_SpecifyDerivedReferrer_TPalletList", sq); }

    public Map<String, TPalletCQ> xdfgetTrpalletId_QueryDerivedReferrer_TPalletList() { return xgetSQueMap("trpalletId_QueryDerivedReferrer_TPalletList"); }
    public String keepTrpalletId_QueryDerivedReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("trpalletId_QueryDerivedReferrer_TPalletList", sq); }
    public Map<String, Object> xdfgetTrpalletId_QueryDerivedReferrer_TPalletListParameter() { return xgetSQuePmMap("trpalletId_QueryDerivedReferrer_TPalletList"); }
    public String keepTrpalletId_QueryDerivedReferrer_TPalletListParameter(Object pm) { return xkeepSQuePm("trpalletId_QueryDerivedReferrer_TPalletList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_TrpalletId_Asc() { regOBA("TRPALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_TrpalletId_Desc() { regOBD("TRPALLET_ID"); return this; }

    protected ConditionValue _palletNo;
    public ConditionValue xdfgetPalletNo()
    { if (_palletNo == null) { _palletNo = nCV(); }
      return _palletNo; }
    protected ConditionValue xgetCValuePalletNo() { return xdfgetPalletNo(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_NO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_PalletNo_Asc() { regOBA("PALLET_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_NO: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_PalletNo_Desc() { regOBD("PALLET_NO"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsTTrpalletCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _rcvlineno;
    public ConditionValue xdfgetRcvlineno()
    { if (_rcvlineno == null) { _rcvlineno = nCV(); }
      return _rcvlineno; }
    protected ConditionValue xgetCValueRcvlineno() { return xdfgetRcvlineno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _printingdate;
    public ConditionValue xdfgetPrintingdate()
    { if (_printingdate == null) { _printingdate = nCV(); }
      return _printingdate; }
    protected ConditionValue xgetCValuePrintingdate() { return xdfgetPrintingdate(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Printingdate_Asc() { regOBA("PRINTINGDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Printingdate_Desc() { regOBD("PRINTINGDATE"); return this; }

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
    public BsTTrpalletCQ addOrderBy_Firmcarryno_Asc() { regOBA("FIRMCARRYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Firmcarryno_Desc() { regOBD("FIRMCARRYNO"); return this; }

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
    public BsTTrpalletCQ addOrderBy_Transportno_Asc() { regOBA("TRANSPORTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Transportno_Desc() { regOBD("TRANSPORTNO"); return this; }

    protected ConditionValue _sourcecd;
    public ConditionValue xdfgetSourcecd()
    { if (_sourcecd == null) { _sourcecd = nCV(); }
      return _sourcecd; }
    protected ConditionValue xgetCValueSourcecd() { return xdfgetSourcecd(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Sourcecd_Asc() { regOBA("SOURCECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Sourcecd_Desc() { regOBD("SOURCECD"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

    protected ConditionValue _receivecd;
    public ConditionValue xdfgetReceivecd()
    { if (_receivecd == null) { _receivecd = nCV(); }
      return _receivecd; }
    protected ConditionValue xgetCValueReceivecd() { return xdfgetReceivecd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receivecd_Asc() { regOBA("RECEIVECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receivecd_Desc() { regOBD("RECEIVECD"); return this; }

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
    public BsTTrpalletCQ addOrderBy_Rcvdate_Asc() { regOBA("RCVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Rcvdate_Desc() { regOBD("RCVDATE"); return this; }

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
    public BsTTrpalletCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
    public BsTTrpalletCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _manufactureDate;
    public ConditionValue xdfgetManufactureDate()
    { if (_manufactureDate == null) { _manufactureDate = nCV(); }
      return _manufactureDate; }
    protected ConditionValue xgetCValueManufactureDate() { return xdfgetManufactureDate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ManufactureDate_Asc() { regOBA("MANUFACTURE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ManufactureDate_Desc() { regOBD("MANUFACTURE_DATE"); return this; }

    protected ConditionValue _batarticlesign;
    public ConditionValue xdfgetBatarticlesign()
    { if (_batarticlesign == null) { _batarticlesign = nCV(); }
      return _batarticlesign; }
    protected ConditionValue xgetCValueBatarticlesign() { return xdfgetBatarticlesign(); }

    /**
     * Add order-by as ascend. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Batarticlesign_Asc() { regOBA("BATARTICLESIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATARTICLESIGN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Batarticlesign_Desc() { regOBD("BATARTICLESIGN"); return this; }

    protected ConditionValue _stockTypeCd;
    public ConditionValue xdfgetStockTypeCd()
    { if (_stockTypeCd == null) { _stockTypeCd = nCV(); }
      return _stockTypeCd; }
    protected ConditionValue xgetCValueStockTypeCd() { return xdfgetStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

    protected ConditionValue _receiveqtycase;
    public ConditionValue xdfgetReceiveqtycase()
    { if (_receiveqtycase == null) { _receiveqtycase = nCV(); }
      return _receiveqtycase; }
    protected ConditionValue xgetCValueReceiveqtycase() { return xdfgetReceiveqtycase(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receiveqtycase_Asc() { regOBA("RECEIVEQTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receiveqtycase_Desc() { regOBD("RECEIVEQTYCASE"); return this; }

    protected ConditionValue _receiveqtybowl;
    public ConditionValue xdfgetReceiveqtybowl()
    { if (_receiveqtybowl == null) { _receiveqtybowl = nCV(); }
      return _receiveqtybowl; }
    protected ConditionValue xgetCValueReceiveqtybowl() { return xdfgetReceiveqtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receiveqtybowl_Asc() { regOBA("RECEIVEQTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receiveqtybowl_Desc() { regOBD("RECEIVEQTYBOWL"); return this; }

    protected ConditionValue _receiveqty;
    public ConditionValue xdfgetReceiveqty()
    { if (_receiveqty == null) { _receiveqty = nCV(); }
      return _receiveqty; }
    protected ConditionValue xgetCValueReceiveqty() { return xdfgetReceiveqty(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receiveqty_Asc() { regOBA("RECEIVEQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Receiveqty_Desc() { regOBD("RECEIVEQTY"); return this; }

    protected ConditionValue _restqtycase;
    public ConditionValue xdfgetRestqtycase()
    { if (_restqtycase == null) { _restqtycase = nCV(); }
      return _restqtycase; }
    protected ConditionValue xgetCValueRestqtycase() { return xdfgetRestqtycase(); }

    /**
     * Add order-by as ascend. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Restqtycase_Asc() { regOBA("RESTQTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Restqtycase_Desc() { regOBD("RESTQTYCASE"); return this; }

    protected ConditionValue _restqtybowl;
    public ConditionValue xdfgetRestqtybowl()
    { if (_restqtybowl == null) { _restqtybowl = nCV(); }
      return _restqtybowl; }
    protected ConditionValue xgetCValueRestqtybowl() { return xdfgetRestqtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Restqtybowl_Asc() { regOBA("RESTQTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Restqtybowl_Desc() { regOBD("RESTQTYBOWL"); return this; }

    protected ConditionValue _restqty;
    public ConditionValue xdfgetRestqty()
    { if (_restqty == null) { _restqty = nCV(); }
      return _restqty; }
    protected ConditionValue xgetCValueRestqty() { return xdfgetRestqty(); }

    /**
     * Add order-by as ascend. <br>
     * RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Restqty_Asc() { regOBA("RESTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Restqty_Desc() { regOBD("RESTQTY"); return this; }

    protected ConditionValue _allocqty1;
    public ConditionValue xdfgetAllocqty1()
    { if (_allocqty1 == null) { _allocqty1 = nCV(); }
      return _allocqty1; }
    protected ConditionValue xgetCValueAllocqty1() { return xdfgetAllocqty1(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Allocqty1_Asc() { regOBA("ALLOCQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Allocqty1_Desc() { regOBD("ALLOCQTY1"); return this; }

    protected ConditionValue _fullpalletflg;
    public ConditionValue xdfgetFullpalletflg()
    { if (_fullpalletflg == null) { _fullpalletflg = nCV(); }
      return _fullpalletflg; }
    protected ConditionValue xgetCValueFullpalletflg() { return xdfgetFullpalletflg(); }

    /**
     * Add order-by as ascend. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Fullpalletflg_Asc() { regOBA("FULLPALLETFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Fullpalletflg_Desc() { regOBD("FULLPALLETFLG"); return this; }

    protected ConditionValue _palletsts;
    public ConditionValue xdfgetPalletsts()
    { if (_palletsts == null) { _palletsts = nCV(); }
      return _palletsts; }
    protected ConditionValue xgetCValuePalletsts() { return xdfgetPalletsts(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETSTS: {NotNull, varchar(30), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Palletsts_Asc() { regOBA("PALLETSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETSTS: {NotNull, varchar(30), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Palletsts_Desc() { regOBD("PALLETSTS"); return this; }

    protected ConditionValue _pluralproductionkbn;
    public ConditionValue xdfgetPluralproductionkbn()
    { if (_pluralproductionkbn == null) { _pluralproductionkbn = nCV(); }
      return _pluralproductionkbn; }
    protected ConditionValue xgetCValuePluralproductionkbn() { return xdfgetPluralproductionkbn(); }

    /**
     * Add order-by as ascend. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Pluralproductionkbn_Asc() { regOBA("PLURALPRODUCTIONKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Pluralproductionkbn_Desc() { regOBD("PLURALPRODUCTIONKBN"); return this; }

    protected ConditionValue _palletcuttingkbn;
    public ConditionValue xdfgetPalletcuttingkbn()
    { if (_palletcuttingkbn == null) { _palletcuttingkbn = nCV(); }
      return _palletcuttingkbn; }
    protected ConditionValue xgetCValuePalletcuttingkbn() { return xdfgetPalletcuttingkbn(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Palletcuttingkbn_Asc() { regOBA("PALLETCUTTINGKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Palletcuttingkbn_Desc() { regOBD("PALLETCUTTINGKBN"); return this; }

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
    public BsTTrpalletCQ addOrderBy_Rcvpalletno_Asc() { regOBA("RCVPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Rcvpalletno_Desc() { regOBD("RCVPALLETNO"); return this; }

    protected ConditionValue _palletaddflg;
    public ConditionValue xdfgetPalletaddflg()
    { if (_palletaddflg == null) { _palletaddflg = nCV(); }
      return _palletaddflg; }
    protected ConditionValue xgetCValuePalletaddflg() { return xdfgetPalletaddflg(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETADDFLG: {varchar(30), default=[(2)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Palletaddflg_Asc() { regOBA("PALLETADDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETADDFLG: {varchar(30), default=[(2)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Palletaddflg_Desc() { regOBD("PALLETADDFLG"); return this; }

    protected ConditionValue _acceptusercd;
    public ConditionValue xdfgetAcceptusercd()
    { if (_acceptusercd == null) { _acceptusercd = nCV(); }
      return _acceptusercd; }
    protected ConditionValue xgetCValueAcceptusercd() { return xdfgetAcceptusercd(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Acceptusercd_Asc() { regOBA("ACCEPTUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Acceptusercd_Desc() { regOBD("ACCEPTUSERCD"); return this; }

    protected ConditionValue _acceptdate;
    public ConditionValue xdfgetAcceptdate()
    { if (_acceptdate == null) { _acceptdate = nCV(); }
      return _acceptdate; }
    protected ConditionValue xgetCValueAcceptdate() { return xdfgetAcceptdate(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Acceptdate_Asc() { regOBA("ACCEPTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_Acceptdate_Desc() { regOBD("ACCEPTDATE"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

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
    public BsTTrpalletCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrpalletCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrpalletCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrpalletCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrpalletCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrpalletCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrpalletCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrpalletCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrpalletCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrpalletCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrpalletCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrpalletCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpalletCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpalletCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpalletCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpalletCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpalletCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpalletCQ> _myselfExistsMap;
    public Map<String, TTrpalletCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpalletCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpalletCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpalletCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpalletCB.class.getName(); }
    protected String xCQ() { return TTrpalletCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
