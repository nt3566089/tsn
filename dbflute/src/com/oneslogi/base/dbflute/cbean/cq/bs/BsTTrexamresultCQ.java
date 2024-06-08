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
 * The base condition-query of T_TREXAMRESULT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrexamresultCQ extends AbstractBsTTrexamresultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrexamresultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrexamresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TREXAMRESULT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrexamresultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrexamresultCIQ xcreateCIQ() {
        TTrexamresultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrexamresultCIQ xnewCIQ() {
        return new TTrexamresultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TREXAMRESULT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrexamresultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrexamresultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trexamresultId;
    public ConditionValue xdfgetTrexamresultId()
    { if (_trexamresultId == null) { _trexamresultId = nCV(); }
      return _trexamresultId; }
    protected ConditionValue xgetCValueTrexamresultId() { return xdfgetTrexamresultId(); }

    /**
     * Add order-by as ascend. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_TrexamresultId_Asc() { regOBA("TREXAMRESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_TrexamresultId_Desc() { regOBD("TREXAMRESULT_ID"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _lot5;
    public ConditionValue xdfgetLot5()
    { if (_lot5 == null) { _lot5 = nCV(); }
      return _lot5; }
    protected ConditionValue xgetCValueLot5() { return xdfgetLot5(); }

    /**
     * Add order-by as ascend. <br>
     * LOT5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Lot5_Asc() { regOBA("LOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Lot5_Desc() { regOBD("LOT5"); return this; }

    protected ConditionValue _otherlot2;
    public ConditionValue xdfgetOtherlot2()
    { if (_otherlot2 == null) { _otherlot2 = nCV(); }
      return _otherlot2; }
    protected ConditionValue xgetCValueOtherlot2() { return xdfgetOtherlot2(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot2_Asc() { regOBA("OTHERLOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot2_Desc() { regOBD("OTHERLOT2"); return this; }

    protected ConditionValue _otherlot3;
    public ConditionValue xdfgetOtherlot3()
    { if (_otherlot3 == null) { _otherlot3 = nCV(); }
      return _otherlot3; }
    protected ConditionValue xgetCValueOtherlot3() { return xdfgetOtherlot3(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot3_Asc() { regOBA("OTHERLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot3_Desc() { regOBD("OTHERLOT3"); return this; }

    protected ConditionValue _otherlot4;
    public ConditionValue xdfgetOtherlot4()
    { if (_otherlot4 == null) { _otherlot4 = nCV(); }
      return _otherlot4; }
    protected ConditionValue xgetCValueOtherlot4() { return xdfgetOtherlot4(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot4_Asc() { regOBA("OTHERLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot4_Desc() { regOBD("OTHERLOT4"); return this; }

    protected ConditionValue _otherlot5;
    public ConditionValue xdfgetOtherlot5()
    { if (_otherlot5 == null) { _otherlot5 = nCV(); }
      return _otherlot5; }
    protected ConditionValue xgetCValueOtherlot5() { return xdfgetOtherlot5(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot5_Asc() { regOBA("OTHERLOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Otherlot5_Desc() { regOBD("OTHERLOT5"); return this; }

    protected ConditionValue _damageflg;
    public ConditionValue xdfgetDamageflg()
    { if (_damageflg == null) { _damageflg = nCV(); }
      return _damageflg; }
    protected ConditionValue xgetCValueDamageflg() { return xdfgetDamageflg(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Damageflg_Asc() { regOBA("DAMAGEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Damageflg_Desc() { regOBD("DAMAGEFLG"); return this; }

    protected ConditionValue _noshippingflg;
    public ConditionValue xdfgetNoshippingflg()
    { if (_noshippingflg == null) { _noshippingflg = nCV(); }
      return _noshippingflg; }
    protected ConditionValue xgetCValueNoshippingflg() { return xdfgetNoshippingflg(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

    protected ConditionValue _foreigncargoflg;
    public ConditionValue xdfgetForeigncargoflg()
    { if (_foreigncargoflg == null) { _foreigncargoflg = nCV(); }
      return _foreigncargoflg; }
    protected ConditionValue xgetCValueForeigncargoflg() { return xdfgetForeigncargoflg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _customsreleaseflg;
    public ConditionValue xdfgetCustomsreleaseflg()
    { if (_customsreleaseflg == null) { _customsreleaseflg = nCV(); }
      return _customsreleaseflg; }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return xdfgetCustomsreleaseflg(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Customsreleaseflg_Asc() { regOBA("CUSTOMSRELEASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Customsreleaseflg_Desc() { regOBD("CUSTOMSRELEASEFLG"); return this; }

    protected ConditionValue _taxflg;
    public ConditionValue xdfgetTaxflg()
    { if (_taxflg == null) { _taxflg = nCV(); }
      return _taxflg; }
    protected ConditionValue xgetCValueTaxflg() { return xdfgetTaxflg(); }

    /**
     * Add order-by as ascend. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Taxflg_Asc() { regOBA("TAXFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Taxflg_Desc() { regOBD("TAXFLG"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _examsts;
    public ConditionValue xdfgetExamsts()
    { if (_examsts == null) { _examsts = nCV(); }
      return _examsts; }
    protected ConditionValue xgetCValueExamsts() { return xdfgetExamsts(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Examsts_Asc() { regOBA("EXAMSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Examsts_Desc() { regOBD("EXAMSTS"); return this; }

    protected ConditionValue _examendsts;
    public ConditionValue xdfgetExamendsts()
    { if (_examendsts == null) { _examendsts = nCV(); }
      return _examendsts; }
    protected ConditionValue xgetCValueExamendsts() { return xdfgetExamendsts(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Examendsts_Asc() { regOBA("EXAMENDSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Examendsts_Desc() { regOBD("EXAMENDSTS"); return this; }

    protected ConditionValue _addflg;
    public ConditionValue xdfgetAddflg()
    { if (_addflg == null) { _addflg = nCV(); }
      return _addflg; }
    protected ConditionValue xgetCValueAddflg() { return xdfgetAddflg(); }

    /**
     * Add order-by as ascend. <br>
     * ADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Addflg_Asc() { regOBA("ADDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Addflg_Desc() { regOBD("ADDFLG"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _sendflg;
    public ConditionValue xdfgetSendflg()
    { if (_sendflg == null) { _sendflg = nCV(); }
      return _sendflg; }
    protected ConditionValue xgetCValueSendflg() { return xdfgetSendflg(); }

    /**
     * Add order-by as ascend. <br>
     * SENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Sendflg_Asc() { regOBA("SENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Sendflg_Desc() { regOBD("SENDFLG"); return this; }

    protected ConditionValue _examqty;
    public ConditionValue xdfgetExamqty()
    { if (_examqty == null) { _examqty = nCV(); }
      return _examqty; }
    protected ConditionValue xgetCValueExamqty() { return xdfgetExamqty(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Examqty_Asc() { regOBA("EXAMQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Examqty_Desc() { regOBD("EXAMQTY"); return this; }

    protected ConditionValue _res40qty;
    public ConditionValue xdfgetRes40qty()
    { if (_res40qty == null) { _res40qty = nCV(); }
      return _res40qty; }
    protected ConditionValue xgetCValueRes40qty() { return xdfgetRes40qty(); }

    /**
     * Add order-by as ascend. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Res40qty_Asc() { regOBA("RES40QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Res40qty_Desc() { regOBD("RES40QTY"); return this; }

    protected ConditionValue _inferiorqty;
    public ConditionValue xdfgetInferiorqty()
    { if (_inferiorqty == null) { _inferiorqty = nCV(); }
      return _inferiorqty; }
    protected ConditionValue xgetCValueInferiorqty() { return xdfgetInferiorqty(); }

    /**
     * Add order-by as ascend. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Inferiorqty_Asc() { regOBA("INFERIORQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Inferiorqty_Desc() { regOBD("INFERIORQTY"); return this; }

    protected ConditionValue _notexamqty;
    public ConditionValue xdfgetNotexamqty()
    { if (_notexamqty == null) { _notexamqty = nCV(); }
      return _notexamqty; }
    protected ConditionValue xgetCValueNotexamqty() { return xdfgetNotexamqty(); }

    /**
     * Add order-by as ascend. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Notexamqty_Asc() { regOBA("NOTEXAMQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Notexamqty_Desc() { regOBD("NOTEXAMQTY"); return this; }

    protected ConditionValue _firstexamsendflg;
    public ConditionValue xdfgetFirstexamsendflg()
    { if (_firstexamsendflg == null) { _firstexamsendflg = nCV(); }
      return _firstexamsendflg; }
    protected ConditionValue xgetCValueFirstexamsendflg() { return xdfgetFirstexamsendflg(); }

    /**
     * Add order-by as ascend. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Firstexamsendflg_Asc() { regOBA("FIRSTEXAMSENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Firstexamsendflg_Desc() { regOBD("FIRSTEXAMSENDFLG"); return this; }

    protected ConditionValue _qualityexamflg;
    public ConditionValue xdfgetQualityexamflg()
    { if (_qualityexamflg == null) { _qualityexamflg = nCV(); }
      return _qualityexamflg; }
    protected ConditionValue xgetCValueQualityexamflg() { return xdfgetQualityexamflg(); }

    /**
     * Add order-by as ascend. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Qualityexamflg_Asc() { regOBA("QUALITYEXAMFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_Qualityexamflg_Desc() { regOBD("QUALITYEXAMFLG"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrexamresultCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrexamresultCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrexamresultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrexamresultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrexamresultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrexamresultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrexamresultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrexamresultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrexamresultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrexamresultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrexamresultCQ> _myselfExistsMap;
    public Map<String, TTrexamresultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrexamresultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrexamresultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrexamresultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrexamresultCB.class.getName(); }
    protected String xCQ() { return TTrexamresultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
