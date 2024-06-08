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
 * The base condition-query of T_TRSYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsymbolCQ extends AbstractBsTTrsymbolCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsymbolCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsymbolCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSYMBOL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsymbolCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsymbolCIQ xcreateCIQ() {
        TTrsymbolCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsymbolCIQ xnewCIQ() {
        return new TTrsymbolCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSYMBOL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsymbolCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsymbolCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trsymbolId;
    public ConditionValue xdfgetTrsymbolId()
    { if (_trsymbolId == null) { _trsymbolId = nCV(); }
      return _trsymbolId; }
    protected ConditionValue xgetCValueTrsymbolId() { return xdfgetTrsymbolId(); }

    public Map<String, TCenterSymbolCQ> xdfgetTrsymbolId_ExistsReferrer_TCenterSymbolList() { return xgetSQueMap("trsymbolId_ExistsReferrer_TCenterSymbolList"); }
    public String keepTrsymbolId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("trsymbolId_ExistsReferrer_TCenterSymbolList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetTrsymbolId_NotExistsReferrer_TCenterSymbolList() { return xgetSQueMap("trsymbolId_NotExistsReferrer_TCenterSymbolList"); }
    public String keepTrsymbolId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("trsymbolId_NotExistsReferrer_TCenterSymbolList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetTrsymbolId_SpecifyDerivedReferrer_TCenterSymbolList() { return xgetSQueMap("trsymbolId_SpecifyDerivedReferrer_TCenterSymbolList"); }
    public String keepTrsymbolId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("trsymbolId_SpecifyDerivedReferrer_TCenterSymbolList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetTrsymbolId_QueryDerivedReferrer_TCenterSymbolList() { return xgetSQueMap("trsymbolId_QueryDerivedReferrer_TCenterSymbolList"); }
    public String keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("trsymbolId_QueryDerivedReferrer_TCenterSymbolList", sq); }
    public Map<String, Object> xdfgetTrsymbolId_QueryDerivedReferrer_TCenterSymbolListParameter() { return xgetSQuePmMap("trsymbolId_QueryDerivedReferrer_TCenterSymbolList"); }
    public String keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolListParameter(Object pm) { return xkeepSQuePm("trsymbolId_QueryDerivedReferrer_TCenterSymbolList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_TrsymbolId_Asc() { regOBA("TRSYMBOL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_TrsymbolId_Desc() { regOBD("TRSYMBOL_ID"); return this; }

    protected ConditionValue _casecd;
    public ConditionValue xdfgetCasecd()
    { if (_casecd == null) { _casecd = nCV(); }
      return _casecd; }
    protected ConditionValue xgetCValueCasecd() { return xdfgetCasecd(); }

    /**
     * Add order-by as ascend. <br>
     * CASECD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casecd_Asc() { regOBA("CASECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casecd_Desc() { regOBD("CASECD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemcd;
    public ConditionValue xdfgetItemcd()
    { if (_itemcd == null) { _itemcd = nCV(); }
      return _itemcd; }
    protected ConditionValue xgetCValueItemcd() { return xdfgetItemcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

    protected ConditionValue _productCdCase;
    public ConditionValue xdfgetProductCdCase()
    { if (_productCdCase == null) { _productCdCase = nCV(); }
      return _productCdCase; }
    protected ConditionValue xgetCValueProductCdCase() { return xdfgetProductCdCase(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ProductCdCase_Asc() { regOBA("PRODUCT_CD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ProductCdCase_Desc() { regOBD("PRODUCT_CD_CASE"); return this; }

    protected ConditionValue _productCdIn;
    public ConditionValue xdfgetProductCdIn()
    { if (_productCdIn == null) { _productCdIn = nCV(); }
      return _productCdIn; }
    protected ConditionValue xgetCValueProductCdIn() { return xdfgetProductCdIn(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ProductCdIn_Asc() { regOBA("PRODUCT_CD_IN"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ProductCdIn_Desc() { regOBD("PRODUCT_CD_IN"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_DesigncdIn_Asc() { regOBA("DESIGNCD_IN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_DesigncdIn_Desc() { regOBD("DESIGNCD_IN"); return this; }

    protected ConditionValue _designcdCase;
    public ConditionValue xdfgetDesigncdCase()
    { if (_designcdCase == null) { _designcdCase = nCV(); }
      return _designcdCase; }
    protected ConditionValue xgetCValueDesigncdCase() { return xdfgetDesigncdCase(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_DesigncdCase_Asc() { regOBA("DESIGNCD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_DesigncdCase_Desc() { regOBD("DESIGNCD_CASE"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _symbollineno;
    public ConditionValue xdfgetSymbollineno()
    { if (_symbollineno == null) { _symbollineno = nCV(); }
      return _symbollineno; }
    protected ConditionValue xgetCValueSymbollineno() { return xdfgetSymbollineno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbollineno_Asc() { regOBA("SYMBOLLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbollineno_Desc() { regOBD("SYMBOLLINENO"); return this; }

    protected ConditionValue _ownercd;
    public ConditionValue xdfgetOwnercd()
    { if (_ownercd == null) { _ownercd = nCV(); }
      return _ownercd; }
    protected ConditionValue xgetCValueOwnercd() { return xdfgetOwnercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Ownercd_Asc() { regOBA("OWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Ownercd_Desc() { regOBD("OWNERCD"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _customsreleaseflg;
    public ConditionValue xdfgetCustomsreleaseflg()
    { if (_customsreleaseflg == null) { _customsreleaseflg = nCV(); }
      return _customsreleaseflg; }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return xdfgetCustomsreleaseflg(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Customsreleaseflg_Asc() { regOBA("CUSTOMSRELEASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Customsreleaseflg_Desc() { regOBD("CUSTOMSRELEASEFLG"); return this; }

    protected ConditionValue _damageflg;
    public ConditionValue xdfgetDamageflg()
    { if (_damageflg == null) { _damageflg = nCV(); }
      return _damageflg; }
    protected ConditionValue xgetCValueDamageflg() { return xdfgetDamageflg(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Damageflg_Asc() { regOBA("DAMAGEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Damageflg_Desc() { regOBD("DAMAGEFLG"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _sendrcvkey;
    public ConditionValue xdfgetSendrcvkey()
    { if (_sendrcvkey == null) { _sendrcvkey = nCV(); }
      return _sendrcvkey; }
    protected ConditionValue xgetCValueSendrcvkey() { return xdfgetSendrcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Sendrcvkey_Asc() { regOBA("SENDRCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Sendrcvkey_Desc() { regOBD("SENDRCVKEY"); return this; }

    protected ConditionValue _makercaseno;
    public ConditionValue xdfgetMakercaseno()
    { if (_makercaseno == null) { _makercaseno = nCV(); }
      return _makercaseno; }
    protected ConditionValue xgetCValueMakercaseno() { return xdfgetMakercaseno(); }

    /**
     * Add order-by as ascend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Makercaseno_Asc() { regOBA("MAKERCASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Makercaseno_Desc() { regOBD("MAKERCASENO"); return this; }

    protected ConditionValue _symbolsts;
    public ConditionValue xdfgetSymbolsts()
    { if (_symbolsts == null) { _symbolsts = nCV(); }
      return _symbolsts; }
    protected ConditionValue xgetCValueSymbolsts() { return xdfgetSymbolsts(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolsts_Asc() { regOBA("SYMBOLSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolsts_Desc() { regOBD("SYMBOLSTS"); return this; }

    protected ConditionValue _symboladdflg;
    public ConditionValue xdfgetSymboladdflg()
    { if (_symboladdflg == null) { _symboladdflg = nCV(); }
      return _symboladdflg; }
    protected ConditionValue xgetCValueSymboladdflg() { return xdfgetSymboladdflg(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symboladdflg_Asc() { regOBA("SYMBOLADDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symboladdflg_Desc() { regOBD("SYMBOLADDFLG"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _symbolsnddate;
    public ConditionValue xdfgetSymbolsnddate()
    { if (_symbolsnddate == null) { _symbolsnddate = nCV(); }
      return _symbolsnddate; }
    protected ConditionValue xgetCValueSymbolsnddate() { return xdfgetSymbolsnddate(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolsnddate_Asc() { regOBA("SYMBOLSNDDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolsnddate_Desc() { regOBD("SYMBOLSNDDATE"); return this; }

    protected ConditionValue _symbolpastdate;
    public ConditionValue xdfgetSymbolpastdate()
    { if (_symbolpastdate == null) { _symbolpastdate = nCV(); }
      return _symbolpastdate; }
    protected ConditionValue xgetCValueSymbolpastdate() { return xdfgetSymbolpastdate(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolpastdate_Asc() { regOBA("SYMBOLPASTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolpastdate_Desc() { regOBD("SYMBOLPASTDATE"); return this; }

    protected ConditionValue _symbolpalletondate;
    public ConditionValue xdfgetSymbolpalletondate()
    { if (_symbolpalletondate == null) { _symbolpalletondate = nCV(); }
      return _symbolpalletondate; }
    protected ConditionValue xgetCValueSymbolpalletondate() { return xdfgetSymbolpalletondate(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolpalletondate_Asc() { regOBA("SYMBOLPALLETONDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolpalletondate_Desc() { regOBD("SYMBOLPALLETONDATE"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _basePalletId;
    public ConditionValue xdfgetBasePalletId()
    { if (_basePalletId == null) { _basePalletId = nCV(); }
      return _basePalletId; }
    protected ConditionValue xgetCValueBasePalletId() { return xdfgetBasePalletId(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_BasePalletId_Asc() { regOBA("BASE_PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_BasePalletId_Desc() { regOBD("BASE_PALLET_ID"); return this; }

    protected ConditionValue _parentpalletupddate;
    public ConditionValue xdfgetParentpalletupddate()
    { if (_parentpalletupddate == null) { _parentpalletupddate = nCV(); }
      return _parentpalletupddate; }
    protected ConditionValue xgetCValueParentpalletupddate() { return xdfgetParentpalletupddate(); }

    /**
     * Add order-by as ascend. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Parentpalletupddate_Asc() { regOBA("PARENTPALLETUPDDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Parentpalletupddate_Desc() { regOBD("PARENTPALLETUPDDATE"); return this; }

    protected ConditionValue _printingdate;
    public ConditionValue xdfgetPrintingdate()
    { if (_printingdate == null) { _printingdate = nCV(); }
      return _printingdate; }
    protected ConditionValue xgetCValuePrintingdate() { return xdfgetPrintingdate(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTINGDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Printingdate_Asc() { regOBA("PRINTINGDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTINGDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Printingdate_Desc() { regOBD("PRINTINGDATE"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _restqty;
    public ConditionValue xdfgetRestqty()
    { if (_restqty == null) { _restqty = nCV(); }
      return _restqty; }
    protected ConditionValue xgetCValueRestqty() { return xdfgetRestqty(); }

    /**
     * Add order-by as ascend. <br>
     * RESTQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Restqty_Asc() { regOBA("RESTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Restqty_Desc() { regOBD("RESTQTY"); return this; }

    protected ConditionValue _receivedqty;
    public ConditionValue xdfgetReceivedqty()
    { if (_receivedqty == null) { _receivedqty = nCV(); }
      return _receivedqty; }
    protected ConditionValue xgetCValueReceivedqty() { return xdfgetReceivedqty(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Receivedqty_Asc() { regOBA("RECEIVEDQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Receivedqty_Desc() { regOBD("RECEIVEDQTY"); return this; }

    protected ConditionValue _distributioncd;
    public ConditionValue xdfgetDistributioncd()
    { if (_distributioncd == null) { _distributioncd = nCV(); }
      return _distributioncd; }
    protected ConditionValue xgetCValueDistributioncd() { return xdfgetDistributioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Distributioncd_Asc() { regOBA("DISTRIBUTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Distributioncd_Desc() { regOBD("DISTRIBUTIONCD"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Orderno_Asc() { regOBA("ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Orderno_Desc() { regOBD("ORDERNO"); return this; }

    protected ConditionValue _rcvPalletId;
    public ConditionValue xdfgetRcvPalletId()
    { if (_rcvPalletId == null) { _rcvPalletId = nCV(); }
      return _rcvPalletId; }
    protected ConditionValue xgetCValueRcvPalletId() { return xdfgetRcvPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_RcvPalletId_Asc() { regOBA("RCV_PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_RcvPalletId_Desc() { regOBD("RCV_PALLET_ID"); return this; }

    protected ConditionValue _symbolfactorycd;
    public ConditionValue xdfgetSymbolfactorycd()
    { if (_symbolfactorycd == null) { _symbolfactorycd = nCV(); }
      return _symbolfactorycd; }
    protected ConditionValue xgetCValueSymbolfactorycd() { return xdfgetSymbolfactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolfactorycd_Asc() { regOBA("SYMBOLFACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolfactorycd_Desc() { regOBD("SYMBOLFACTORYCD"); return this; }

    protected ConditionValue _symbolitemcd;
    public ConditionValue xdfgetSymbolitemcd()
    { if (_symbolitemcd == null) { _symbolitemcd = nCV(); }
      return _symbolitemcd; }
    protected ConditionValue xgetCValueSymbolitemcd() { return xdfgetSymbolitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolitemcd_Asc() { regOBA("SYMBOLITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolitemcd_Desc() { regOBD("SYMBOLITEMCD"); return this; }

    protected ConditionValue _symbolsku;
    public ConditionValue xdfgetSymbolsku()
    { if (_symbolsku == null) { _symbolsku = nCV(); }
      return _symbolsku; }
    protected ConditionValue xgetCValueSymbolsku() { return xdfgetSymbolsku(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLSKU: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolsku_Asc() { regOBA("SYMBOLSKU"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLSKU: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolsku_Desc() { regOBD("SYMBOLSKU"); return this; }

    protected ConditionValue _symbolreceivecd;
    public ConditionValue xdfgetSymbolreceivecd()
    { if (_symbolreceivecd == null) { _symbolreceivecd = nCV(); }
      return _symbolreceivecd; }
    protected ConditionValue xgetCValueSymbolreceivecd() { return xdfgetSymbolreceivecd(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolreceivecd_Asc() { regOBA("SYMBOLRECEIVECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolreceivecd_Desc() { regOBD("SYMBOLRECEIVECD"); return this; }

    protected ConditionValue _symbolproductmark;
    public ConditionValue xdfgetSymbolproductmark()
    { if (_symbolproductmark == null) { _symbolproductmark = nCV(); }
      return _symbolproductmark; }
    protected ConditionValue xgetCValueSymbolproductmark() { return xdfgetSymbolproductmark(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolproductmark_Asc() { regOBA("SYMBOLPRODUCTMARK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolproductmark_Desc() { regOBD("SYMBOLPRODUCTMARK"); return this; }

    protected ConditionValue _symbolorderno;
    public ConditionValue xdfgetSymbolorderno()
    { if (_symbolorderno == null) { _symbolorderno = nCV(); }
      return _symbolorderno; }
    protected ConditionValue xgetCValueSymbolorderno() { return xdfgetSymbolorderno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolorderno_Asc() { regOBA("SYMBOLORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolorderno_Desc() { regOBD("SYMBOLORDERNO"); return this; }

    protected ConditionValue _symbolprinterno;
    public ConditionValue xdfgetSymbolprinterno()
    { if (_symbolprinterno == null) { _symbolprinterno = nCV(); }
      return _symbolprinterno; }
    protected ConditionValue xgetCValueSymbolprinterno() { return xdfgetSymbolprinterno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolprinterno_Asc() { regOBA("SYMBOLPRINTERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolprinterno_Desc() { regOBD("SYMBOLPRINTERNO"); return this; }

    protected ConditionValue _symbolmakeno;
    public ConditionValue xdfgetSymbolmakeno()
    { if (_symbolmakeno == null) { _symbolmakeno = nCV(); }
      return _symbolmakeno; }
    protected ConditionValue xgetCValueSymbolmakeno() { return xdfgetSymbolmakeno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolmakeno_Asc() { regOBA("SYMBOLMAKENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolmakeno_Desc() { regOBD("SYMBOLMAKENO"); return this; }

    protected ConditionValue _symbollot4;
    public ConditionValue xdfgetSymbollot4()
    { if (_symbollot4 == null) { _symbollot4 = nCV(); }
      return _symbollot4; }
    protected ConditionValue xgetCValueSymbollot4() { return xdfgetSymbollot4(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbollot4_Asc() { regOBA("SYMBOLLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbollot4_Desc() { regOBD("SYMBOLLOT4"); return this; }

    protected ConditionValue _symbolmaketime;
    public ConditionValue xdfgetSymbolmaketime()
    { if (_symbolmaketime == null) { _symbolmaketime = nCV(); }
      return _symbolmaketime; }
    protected ConditionValue xgetCValueSymbolmaketime() { return xdfgetSymbolmaketime(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolmaketime_Asc() { regOBA("SYMBOLMAKETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolmaketime_Desc() { regOBD("SYMBOLMAKETIME"); return this; }

    protected ConditionValue _symbolcirculationid;
    public ConditionValue xdfgetSymbolcirculationid()
    { if (_symbolcirculationid == null) { _symbolcirculationid = nCV(); }
      return _symbolcirculationid; }
    protected ConditionValue xgetCValueSymbolcirculationid() { return xdfgetSymbolcirculationid(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolcirculationid_Asc() { regOBA("SYMBOLCIRCULATIONID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolcirculationid_Desc() { regOBD("SYMBOLCIRCULATIONID"); return this; }

    protected ConditionValue _symbolrcvkey;
    public ConditionValue xdfgetSymbolrcvkey()
    { if (_symbolrcvkey == null) { _symbolrcvkey = nCV(); }
      return _symbolrcvkey; }
    protected ConditionValue xgetCValueSymbolrcvkey() { return xdfgetSymbolrcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolrcvkey_Asc() { regOBA("SYMBOLRCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbolrcvkey_Desc() { regOBD("SYMBOLRCVKEY"); return this; }

    protected ConditionValue _symbollot3;
    public ConditionValue xdfgetSymbollot3()
    { if (_symbollot3 == null) { _symbollot3 = nCV(); }
      return _symbollot3; }
    protected ConditionValue xgetCValueSymbollot3() { return xdfgetSymbollot3(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbollot3_Asc() { regOBA("SYMBOLLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Symbollot3_Desc() { regOBD("SYMBOLLOT3"); return this; }

    protected ConditionValue _qrdata;
    public ConditionValue xdfgetQrdata()
    { if (_qrdata == null) { _qrdata = nCV(); }
      return _qrdata; }
    protected ConditionValue xgetCValueQrdata() { return xdfgetQrdata(); }

    /**
     * Add order-by as ascend. <br>
     * QRData: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Qrdata_Asc() { regOBA("QRData"); return this; }

    /**
     * Add order-by as descend. <br>
     * QRData: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Qrdata_Desc() { regOBD("QRData"); return this; }

    protected ConditionValue _trexamresultId;
    public ConditionValue xdfgetTrexamresultId()
    { if (_trexamresultId == null) { _trexamresultId = nCV(); }
      return _trexamresultId; }
    protected ConditionValue xgetCValueTrexamresultId() { return xdfgetTrexamresultId(); }

    /**
     * Add order-by as ascend. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_TrexamresultId_Asc() { regOBA("TREXAMRESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_TrexamresultId_Desc() { regOBD("TREXAMRESULT_ID"); return this; }

    protected ConditionValue _caseitfno;
    public ConditionValue xdfgetCaseitfno()
    { if (_caseitfno == null) { _caseitfno = nCV(); }
      return _caseitfno; }
    protected ConditionValue xgetCValueCaseitfno() { return xdfgetCaseitfno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEITFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Caseitfno_Asc() { regOBA("CASEITFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEITFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Caseitfno_Desc() { regOBD("CASEITFNO"); return this; }

    protected ConditionValue _casebarcodevaliant;
    public ConditionValue xdfgetCasebarcodevaliant()
    { if (_casebarcodevaliant == null) { _casebarcodevaliant = nCV(); }
      return _casebarcodevaliant; }
    protected ConditionValue xgetCValueCasebarcodevaliant() { return xdfgetCasebarcodevaliant(); }

    /**
     * Add order-by as ascend. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casebarcodevaliant_Asc() { regOBA("CASEBARCODEVALIANT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casebarcodevaliant_Desc() { regOBD("CASEBARCODEVALIANT"); return this; }

    protected ConditionValue _caselot4;
    public ConditionValue xdfgetCaselot4()
    { if (_caselot4 == null) { _caselot4 = nCV(); }
      return _caselot4; }
    protected ConditionValue xgetCValueCaselot4() { return xdfgetCaselot4(); }

    /**
     * Add order-by as ascend. <br>
     * CASELOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Caselot4_Asc() { regOBA("CASELOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASELOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Caselot4_Desc() { regOBD("CASELOT4"); return this; }

    protected ConditionValue _datetime;
    public ConditionValue xdfgetDatetime()
    { if (_datetime == null) { _datetime = nCV(); }
      return _datetime; }
    protected ConditionValue xgetCValueDatetime() { return xdfgetDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Datetime_Asc() { regOBA("DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Datetime_Desc() { regOBD("DATETIME"); return this; }

    protected ConditionValue _casecenterno;
    public ConditionValue xdfgetCasecenterno()
    { if (_casecenterno == null) { _casecenterno = nCV(); }
      return _casecenterno; }
    protected ConditionValue xgetCValueCasecenterno() { return xdfgetCasecenterno(); }

    /**
     * Add order-by as ascend. <br>
     * CASECENTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casecenterno_Asc() { regOBA("CASECENTERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECENTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casecenterno_Desc() { regOBD("CASECENTERNO"); return this; }

    protected ConditionValue _casepackno;
    public ConditionValue xdfgetCasepackno()
    { if (_casepackno == null) { _casepackno = nCV(); }
      return _casepackno; }
    protected ConditionValue xgetCValueCasepackno() { return xdfgetCasepackno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEPACKNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casepackno_Asc() { regOBA("CASEPACKNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEPACKNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casepackno_Desc() { regOBD("CASEPACKNO"); return this; }

    protected ConditionValue _casepacktime;
    public ConditionValue xdfgetCasepacktime()
    { if (_casepacktime == null) { _casepacktime = nCV(); }
      return _casepacktime; }
    protected ConditionValue xgetCValueCasepacktime() { return xdfgetCasepacktime(); }

    /**
     * Add order-by as ascend. <br>
     * CASEPACKTIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casepacktime_Asc() { regOBA("CASEPACKTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEPACKTIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casepacktime_Desc() { regOBD("CASEPACKTIME"); return this; }

    protected ConditionValue _casebarcode;
    public ConditionValue xdfgetCasebarcode()
    { if (_casebarcode == null) { _casebarcode = nCV(); }
      return _casebarcode; }
    protected ConditionValue xgetCValueCasebarcode() { return xdfgetCasebarcode(); }

    /**
     * Add order-by as ascend. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casebarcode_Asc() { regOBA("CASEBARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casebarcode_Desc() { regOBD("CASEBARCODE"); return this; }

    protected ConditionValue _mixedflg;
    public ConditionValue xdfgetMixedflg()
    { if (_mixedflg == null) { _mixedflg = nCV(); }
      return _mixedflg; }
    protected ConditionValue xgetCValueMixedflg() { return xdfgetMixedflg(); }

    /**
     * Add order-by as ascend. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Mixedflg_Asc() { regOBA("MIXEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Mixedflg_Desc() { regOBD("MIXEDFLG"); return this; }

    protected ConditionValue _shippedflg;
    public ConditionValue xdfgetShippedflg()
    { if (_shippedflg == null) { _shippedflg = nCV(); }
      return _shippedflg; }
    protected ConditionValue xgetCValueShippedflg() { return xdfgetShippedflg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Shippedflg_Asc() { regOBA("SHIPPEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Shippedflg_Desc() { regOBD("SHIPPEDFLG"); return this; }

    protected ConditionValue _casecreatetype;
    public ConditionValue xdfgetCasecreatetype()
    { if (_casecreatetype == null) { _casecreatetype = nCV(); }
      return _casecreatetype; }
    protected ConditionValue xgetCValueCasecreatetype() { return xdfgetCasecreatetype(); }

    /**
     * Add order-by as ascend. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casecreatetype_Asc() { regOBA("CASECREATETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Casecreatetype_Desc() { regOBD("CASECREATETYPE"); return this; }

    protected ConditionValue _createdatetime;
    public ConditionValue xdfgetCreatedatetime()
    { if (_createdatetime == null) { _createdatetime = nCV(); }
      return _createdatetime; }
    protected ConditionValue xgetCValueCreatedatetime() { return xdfgetCreatedatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Createdatetime_Asc() { regOBA("CREATEDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Createdatetime_Desc() { regOBD("CREATEDATETIME"); return this; }

    protected ConditionValue _initnum;
    public ConditionValue xdfgetInitnum()
    { if (_initnum == null) { _initnum = nCV(); }
      return _initnum; }
    protected ConditionValue xgetCValueInitnum() { return xdfgetInitnum(); }

    /**
     * Add order-by as ascend. <br>
     * InitNum: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Initnum_Asc() { regOBA("InitNum"); return this; }

    /**
     * Add order-by as descend. <br>
     * InitNum: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Initnum_Desc() { regOBD("InitNum"); return this; }

    protected ConditionValue _parentcasecd;
    public ConditionValue xdfgetParentcasecd()
    { if (_parentcasecd == null) { _parentcasecd = nCV(); }
      return _parentcasecd; }
    protected ConditionValue xgetCValueParentcasecd() { return xdfgetParentcasecd(); }

    /**
     * Add order-by as ascend. <br>
     * ParentCaseCd: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Parentcasecd_Asc() { regOBA("ParentCaseCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * ParentCaseCd: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Parentcasecd_Desc() { regOBD("ParentCaseCd"); return this; }

    protected ConditionValue _trPicklistId;
    public ConditionValue xdfgetTrPicklistId()
    { if (_trPicklistId == null) { _trPicklistId = nCV(); }
      return _trPicklistId; }
    protected ConditionValue xgetCValueTrPicklistId() { return xdfgetTrPicklistId(); }

    /**
     * Add order-by as ascend. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_TrPicklistId_Asc() { regOBA("TR_PICKLIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_TrPicklistId_Desc() { regOBD("TR_PICKLIST_ID"); return this; }

    protected ConditionValue _picklistgno;
    public ConditionValue xdfgetPicklistgno()
    { if (_picklistgno == null) { _picklistgno = nCV(); }
      return _picklistgno; }
    protected ConditionValue xgetCValuePicklistgno() { return xdfgetPicklistgno(); }

    /**
     * Add order-by as ascend. <br>
     * PicklistGNo: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Picklistgno_Asc() { regOBA("PicklistGNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * PicklistGNo: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Picklistgno_Desc() { regOBD("PicklistGNo"); return this; }

    protected ConditionValue _recombdatetime;
    public ConditionValue xdfgetRecombdatetime()
    { if (_recombdatetime == null) { _recombdatetime = nCV(); }
      return _recombdatetime; }
    protected ConditionValue xgetCValueRecombdatetime() { return xdfgetRecombdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Recombdatetime_Asc() { regOBA("RecombDatetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Recombdatetime_Desc() { regOBD("RecombDatetime"); return this; }

    protected ConditionValue _reprintedflg;
    public ConditionValue xdfgetReprintedflg()
    { if (_reprintedflg == null) { _reprintedflg = nCV(); }
      return _reprintedflg; }
    protected ConditionValue xgetCValueReprintedflg() { return xdfgetReprintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * ReprintedFlg: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Reprintedflg_Asc() { regOBA("ReprintedFlg"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReprintedFlg: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Reprintedflg_Desc() { regOBD("ReprintedFlg"); return this; }

    protected ConditionValue _tracests;
    public ConditionValue xdfgetTracests()
    { if (_tracests == null) { _tracests = nCV(); }
      return _tracests; }
    protected ConditionValue xgetCValueTracests() { return xdfgetTracests(); }

    /**
     * Add order-by as ascend. <br>
     * TraceSts: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Tracests_Asc() { regOBA("TraceSts"); return this; }

    /**
     * Add order-by as descend. <br>
     * TraceSts: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Tracests_Desc() { regOBD("TraceSts"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Batjproductionym_Asc() { regOBA("BATJPRODUCTIONYM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Batjproductionym_Desc() { regOBD("BATJPRODUCTIONYM"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Cometodate_Asc() { regOBA("COMETODATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMETODATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Cometodate_Desc() { regOBD("COMETODATE"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Rcvpalletno_Asc() { regOBA("RCVPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Rcvpalletno_Desc() { regOBD("RCVPALLETNO"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Taxpalletno_Asc() { regOBA("TAXPALLETNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXPALLETNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Taxpalletno_Desc() { regOBD("TAXPALLETNO"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_Shtypecd_Asc() { regOBA("SHTYPECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHTYPECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Shtypecd_Desc() { regOBD("SHTYPECD"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _restctn;
    public ConditionValue xdfgetRestctn()
    { if (_restctn == null) { _restctn = nCV(); }
      return _restctn; }
    protected ConditionValue xgetCValueRestctn() { return xdfgetRestctn(); }

    /**
     * Add order-by as ascend. <br>
     * RESTCTN: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Restctn_Asc() { regOBA("RESTCTN"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTCTN: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_Restctn_Desc() { regOBD("RESTCTN"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsymbolCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsymbolCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsymbolCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsymbolCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsymbolCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsymbolCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsymbolCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsymbolCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsymbolCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsymbolCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsymbolCQ> _myselfExistsMap;
    public Map<String, TTrsymbolCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsymbolCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsymbolCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsymbolCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsymbolCB.class.getName(); }
    protected String xCQ() { return TTrsymbolCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
