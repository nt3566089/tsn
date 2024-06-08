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
 * The base condition-query of T_TRSODETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsodetailCQ extends AbstractBsTTrsodetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsodetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsodetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSODETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsodetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsodetailCIQ xcreateCIQ() {
        TTrsodetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsodetailCIQ xnewCIQ() {
        return new TTrsodetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSODETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsodetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsodetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sodetailid;
    public ConditionValue xdfgetSodetailid()
    { if (_sodetailid == null) { _sodetailid = nCV(); }
      return _sodetailid; }
    protected ConditionValue xgetCValueSodetailid() { return xdfgetSodetailid(); }

    /**
     * Add order-by as ascend. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Sodetailid_Asc() { regOBA("SODETAILID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Sodetailid_Desc() { regOBD("SODETAILID"); return this; }

    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _solineno;
    public ConditionValue xdfgetSolineno()
    { if (_solineno == null) { _solineno = nCV(); }
      return _solineno; }
    protected ConditionValue xgetCValueSolineno() { return xdfgetSolineno(); }

    /**
     * Add order-by as ascend. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Solineno_Asc() { regOBA("SOLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Solineno_Desc() { regOBD("SOLINENO"); return this; }

    protected ConditionValue _orderlineno;
    public ConditionValue xdfgetOrderlineno()
    { if (_orderlineno == null) { _orderlineno = nCV(); }
      return _orderlineno; }
    protected ConditionValue xgetCValueOrderlineno() { return xdfgetOrderlineno(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Orderlineno_Asc() { regOBA("ORDERLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Orderlineno_Desc() { regOBD("ORDERLINENO"); return this; }

    protected ConditionValue _ownerorderlineno;
    public ConditionValue xdfgetOwnerorderlineno()
    { if (_ownerorderlineno == null) { _ownerorderlineno = nCV(); }
      return _ownerorderlineno; }
    protected ConditionValue xgetCValueOwnerorderlineno() { return xdfgetOwnerorderlineno(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Ownerorderlineno_Asc() { regOBA("OWNERORDERLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Ownerorderlineno_Desc() { regOBD("OWNERORDERLINENO"); return this; }

    protected ConditionValue _custorderlineno;
    public ConditionValue xdfgetCustorderlineno()
    { if (_custorderlineno == null) { _custorderlineno = nCV(); }
      return _custorderlineno; }
    protected ConditionValue xgetCValueCustorderlineno() { return xdfgetCustorderlineno(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Custorderlineno_Asc() { regOBA("CUSTORDERLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Custorderlineno_Desc() { regOBD("CUSTORDERLINENO"); return this; }

    protected ConditionValue _originalpolineno;
    public ConditionValue xdfgetOriginalpolineno()
    { if (_originalpolineno == null) { _originalpolineno = nCV(); }
      return _originalpolineno; }
    protected ConditionValue xgetCValueOriginalpolineno() { return xdfgetOriginalpolineno(); }

    /**
     * Add order-by as ascend. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Originalpolineno_Asc() { regOBA("ORIGINALPOLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Originalpolineno_Desc() { regOBD("ORIGINALPOLINENO"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Ifitemcd_Asc() { regOBA("IFITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Ifitemcd_Desc() { regOBD("IFITEMCD"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Lot5_Asc() { regOBA("LOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lot5_Desc() { regOBD("LOT5"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Otherlot2_Asc() { regOBA("OTHERLOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Otherlot2_Desc() { regOBD("OTHERLOT2"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Otherlot3_Asc() { regOBA("OTHERLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Otherlot3_Desc() { regOBD("OTHERLOT3"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_Otherlot4_Asc() { regOBA("OTHERLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Otherlot4_Desc() { regOBD("OTHERLOT4"); return this; }

    protected ConditionValue _otherlot5;
    public ConditionValue xdfgetOtherlot5()
    { if (_otherlot5 == null) { _otherlot5 = nCV(); }
      return _otherlot5; }
    protected ConditionValue xgetCValueOtherlot5() { return xdfgetOtherlot5(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT5: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Otherlot5_Asc() { regOBA("OTHERLOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT5: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Otherlot5_Desc() { regOBD("OTHERLOT5"); return this; }

    protected ConditionValue _damageflg;
    public ConditionValue xdfgetDamageflg()
    { if (_damageflg == null) { _damageflg = nCV(); }
      return _damageflg; }
    protected ConditionValue xgetCValueDamageflg() { return xdfgetDamageflg(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Damageflg_Asc() { regOBA("DAMAGEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Damageflg_Desc() { regOBD("DAMAGEFLG"); return this; }

    protected ConditionValue _noshippingflg;
    public ConditionValue xdfgetNoshippingflg()
    { if (_noshippingflg == null) { _noshippingflg = nCV(); }
      return _noshippingflg; }
    protected ConditionValue xgetCValueNoshippingflg() { return xdfgetNoshippingflg(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

    protected ConditionValue _foreigncargoflg;
    public ConditionValue xdfgetForeigncargoflg()
    { if (_foreigncargoflg == null) { _foreigncargoflg = nCV(); }
      return _foreigncargoflg; }
    protected ConditionValue xgetCValueForeigncargoflg() { return xdfgetForeigncargoflg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _customsreleaseflg;
    public ConditionValue xdfgetCustomsreleaseflg()
    { if (_customsreleaseflg == null) { _customsreleaseflg = nCV(); }
      return _customsreleaseflg; }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return xdfgetCustomsreleaseflg(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Customsreleaseflg_Asc() { regOBA("CUSTOMSRELEASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Customsreleaseflg_Desc() { regOBD("CUSTOMSRELEASEFLG"); return this; }

    protected ConditionValue _taxflg;
    public ConditionValue xdfgetTaxflg()
    { if (_taxflg == null) { _taxflg = nCV(); }
      return _taxflg; }
    protected ConditionValue xgetCValueTaxflg() { return xdfgetTaxflg(); }

    /**
     * Add order-by as ascend. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Taxflg_Asc() { regOBA("TAXFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Taxflg_Desc() { regOBD("TAXFLG"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _xdockqty1;
    public ConditionValue xdfgetXdockqty1()
    { if (_xdockqty1 == null) { _xdockqty1 = nCV(); }
      return _xdockqty1; }
    protected ConditionValue xgetCValueXdockqty1() { return xdfgetXdockqty1(); }

    /**
     * Add order-by as ascend. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Xdockqty1_Asc() { regOBA("XDOCKQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Xdockqty1_Desc() { regOBD("XDOCKQTY1"); return this; }

    protected ConditionValue _allocqty1;
    public ConditionValue xdfgetAllocqty1()
    { if (_allocqty1 == null) { _allocqty1 = nCV(); }
      return _allocqty1; }
    protected ConditionValue xgetCValueAllocqty1() { return xdfgetAllocqty1(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Allocqty1_Asc() { regOBA("ALLOCQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Allocqty1_Desc() { regOBD("ALLOCQTY1"); return this; }

    protected ConditionValue _pickedqty1;
    public ConditionValue xdfgetPickedqty1()
    { if (_pickedqty1 == null) { _pickedqty1 = nCV(); }
      return _pickedqty1; }
    protected ConditionValue xgetCValuePickedqty1() { return xdfgetPickedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Pickedqty1_Asc() { regOBA("PICKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Pickedqty1_Desc() { regOBD("PICKEDQTY1"); return this; }

    protected ConditionValue _sortedqty1;
    public ConditionValue xdfgetSortedqty1()
    { if (_sortedqty1 == null) { _sortedqty1 = nCV(); }
      return _sortedqty1; }
    protected ConditionValue xgetCValueSortedqty1() { return xdfgetSortedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Sortedqty1_Asc() { regOBA("SORTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Sortedqty1_Desc() { regOBD("SORTEDQTY1"); return this; }

    protected ConditionValue _inspectedqty1;
    public ConditionValue xdfgetInspectedqty1()
    { if (_inspectedqty1 == null) { _inspectedqty1 = nCV(); }
      return _inspectedqty1; }
    protected ConditionValue xgetCValueInspectedqty1() { return xdfgetInspectedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Inspectedqty1_Asc() { regOBA("INSPECTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Inspectedqty1_Desc() { regOBD("INSPECTEDQTY1"); return this; }

    protected ConditionValue _shippedqty1;
    public ConditionValue xdfgetShippedqty1()
    { if (_shippedqty1 == null) { _shippedqty1 = nCV(); }
      return _shippedqty1; }
    protected ConditionValue xgetCValueShippedqty1() { return xdfgetShippedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Shippedqty1_Asc() { regOBA("SHIPPEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Shippedqty1_Desc() { regOBD("SHIPPEDQTY1"); return this; }

    protected ConditionValue _adjustqty1;
    public ConditionValue xdfgetAdjustqty1()
    { if (_adjustqty1 == null) { _adjustqty1 = nCV(); }
      return _adjustqty1; }
    protected ConditionValue xgetCValueAdjustqty1() { return xdfgetAdjustqty1(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Adjustqty1_Asc() { regOBA("ADJUSTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Adjustqty1_Desc() { regOBD("ADJUSTQTY1"); return this; }

    protected ConditionValue _price1;
    public ConditionValue xdfgetPrice1()
    { if (_price1 == null) { _price1 = nCV(); }
      return _price1; }
    protected ConditionValue xgetCValuePrice1() { return xdfgetPrice1(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Price1_Asc() { regOBA("PRICE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Price1_Desc() { regOBD("PRICE1"); return this; }

    protected ConditionValue _price2;
    public ConditionValue xdfgetPrice2()
    { if (_price2 == null) { _price2 = nCV(); }
      return _price2; }
    protected ConditionValue xgetCValuePrice2() { return xdfgetPrice2(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Price2_Asc() { regOBA("PRICE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Price2_Desc() { regOBD("PRICE2"); return this; }

    protected ConditionValue _price3;
    public ConditionValue xdfgetPrice3()
    { if (_price3 == null) { _price3 = nCV(); }
      return _price3; }
    protected ConditionValue xgetCValuePrice3() { return xdfgetPrice3(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Price3_Asc() { regOBA("PRICE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Price3_Desc() { regOBD("PRICE3"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _lotreserveflg;
    public ConditionValue xdfgetLotreserveflg()
    { if (_lotreserveflg == null) { _lotreserveflg = nCV(); }
      return _lotreserveflg; }
    protected ConditionValue xgetCValueLotreserveflg() { return xdfgetLotreserveflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lotreserveflg_Asc() { regOBA("LOTRESERVEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Lotreserveflg_Desc() { regOBD("LOTRESERVEFLG"); return this; }

    protected ConditionValue _pickqtyerrorflg;
    public ConditionValue xdfgetPickqtyerrorflg()
    { if (_pickqtyerrorflg == null) { _pickqtyerrorflg = nCV(); }
      return _pickqtyerrorflg; }
    protected ConditionValue xgetCValuePickqtyerrorflg() { return xdfgetPickqtyerrorflg(); }

    /**
     * Add order-by as ascend. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Pickqtyerrorflg_Asc() { regOBA("PICKQTYERRORFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Pickqtyerrorflg_Desc() { regOBD("PICKQTYERRORFLG"); return this; }

    protected ConditionValue _logicflg1;
    public ConditionValue xdfgetLogicflg1()
    { if (_logicflg1 == null) { _logicflg1 = nCV(); }
      return _logicflg1; }
    protected ConditionValue xgetCValueLogicflg1() { return xdfgetLogicflg1(); }

    /**
     * Add order-by as ascend. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Logicflg1_Asc() { regOBA("LOGICFLG1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Logicflg1_Desc() { regOBD("LOGICFLG1"); return this; }

    protected ConditionValue _logicflg2;
    public ConditionValue xdfgetLogicflg2()
    { if (_logicflg2 == null) { _logicflg2 = nCV(); }
      return _logicflg2; }
    protected ConditionValue xgetCValueLogicflg2() { return xdfgetLogicflg2(); }

    /**
     * Add order-by as ascend. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Logicflg2_Asc() { regOBA("LOGICFLG2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Logicflg2_Desc() { regOBD("LOGICFLG2"); return this; }

    protected ConditionValue _logicflg3;
    public ConditionValue xdfgetLogicflg3()
    { if (_logicflg3 == null) { _logicflg3 = nCV(); }
      return _logicflg3; }
    protected ConditionValue xgetCValueLogicflg3() { return xdfgetLogicflg3(); }

    /**
     * Add order-by as ascend. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Logicflg3_Asc() { regOBA("LOGICFLG3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_Logicflg3_Desc() { regOBD("LOGICFLG3"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsodetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsodetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsodetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsodetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsodetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsodetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsodetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsodetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsodetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsodetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsodetailCQ> _myselfExistsMap;
    public Map<String, TTrsodetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsodetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsodetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsodetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsodetailCB.class.getName(); }
    protected String xCQ() { return TTrsodetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
