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
 * The base condition-query of E_TRIFITEMDATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsETrifitemdataCQ extends AbstractBsETrifitemdataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETrifitemdataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETrifitemdataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_TRIFITEMDATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ETrifitemdataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ETrifitemdataCIQ xcreateCIQ() {
        ETrifitemdataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ETrifitemdataCIQ xnewCIQ() {
        return new ETrifitemdataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_TRIFITEMDATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ETrifitemdataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ETrifitemdataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ifdatakey;
    public ConditionValue xdfgetIfdatakey()
    { if (_ifdatakey == null) { _ifdatakey = nCV(); }
      return _ifdatakey; }
    protected ConditionValue xgetCValueIfdatakey() { return xdfgetIfdatakey(); }

    /**
     * Add order-by as ascend. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Ifdatakey_Asc() { regOBA("IFDATAKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Ifdatakey_Desc() { regOBD("IFDATAKEY"); return this; }

    protected ConditionValue _segname;
    public ConditionValue xdfgetSegname()
    { if (_segname == null) { _segname = nCV(); }
      return _segname; }
    protected ConditionValue xgetCValueSegname() { return xdfgetSegname(); }

    /**
     * Add order-by as ascend. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Segname_Asc() { regOBA("SEGNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Segname_Desc() { regOBD("SEGNAME"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

    protected ConditionValue _itemadmin;
    public ConditionValue xdfgetItemadmin()
    { if (_itemadmin == null) { _itemadmin = nCV(); }
      return _itemadmin; }
    protected ConditionValue xgetCValueItemadmin() { return xdfgetItemadmin(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itemadmin_Asc() { regOBA("ITEMADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itemadmin_Desc() { regOBD("ITEMADMIN"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemgroup;
    public ConditionValue xdfgetItemgroup()
    { if (_itemgroup == null) { _itemgroup = nCV(); }
      return _itemgroup; }
    protected ConditionValue xgetCValueItemgroup() { return xdfgetItemgroup(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMGROUP: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itemgroup_Asc() { regOBA("ITEMGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMGROUP: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itemgroup_Desc() { regOBD("ITEMGROUP"); return this; }

    protected ConditionValue _invtype;
    public ConditionValue xdfgetInvtype()
    { if (_invtype == null) { _invtype = nCV(); }
      return _invtype; }
    protected ConditionValue xgetCValueInvtype() { return xdfgetInvtype(); }

    /**
     * Add order-by as ascend. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Invtype_Asc() { regOBA("INVTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Invtype_Desc() { regOBD("INVTYPE"); return this; }

    protected ConditionValue _setitemflg;
    public ConditionValue xdfgetSetitemflg()
    { if (_setitemflg == null) { _setitemflg = nCV(); }
      return _setitemflg; }
    protected ConditionValue xgetCValueSetitemflg() { return xdfgetSetitemflg(); }

    /**
     * Add order-by as ascend. <br>
     * SETITEMFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Setitemflg_Asc() { regOBA("SETITEMFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SETITEMFLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Setitemflg_Desc() { regOBD("SETITEMFLG"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _sname;
    public ConditionValue xdfgetSname()
    { if (_sname == null) { _sname = nCV(); }
      return _sname; }
    protected ConditionValue xgetCValueSname() { return xdfgetSname(); }

    /**
     * Add order-by as ascend. <br>
     * SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Sname_Asc() { regOBA("SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Sname_Desc() { regOBD("SNAME"); return this; }

    protected ConditionValue _aname;
    public ConditionValue xdfgetAname()
    { if (_aname == null) { _aname = nCV(); }
      return _aname; }
    protected ConditionValue xgetCValueAname() { return xdfgetAname(); }

    /**
     * Add order-by as ascend. <br>
     * ANAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Aname_Asc() { regOBA("ANAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ANAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Aname_Desc() { regOBD("ANAME"); return this; }

    protected ConditionValue _owneritemcd;
    public ConditionValue xdfgetOwneritemcd()
    { if (_owneritemcd == null) { _owneritemcd = nCV(); }
      return _owneritemcd; }
    protected ConditionValue xgetCValueOwneritemcd() { return xdfgetOwneritemcd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Owneritemcd_Asc() { regOBA("OWNERITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Owneritemcd_Desc() { regOBD("OWNERITEMCD"); return this; }

    protected ConditionValue _supplieritemcd;
    public ConditionValue xdfgetSupplieritemcd()
    { if (_supplieritemcd == null) { _supplieritemcd = nCV(); }
      return _supplieritemcd; }
    protected ConditionValue xgetCValueSupplieritemcd() { return xdfgetSupplieritemcd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Supplieritemcd_Asc() { regOBA("SUPPLIERITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Supplieritemcd_Desc() { regOBD("SUPPLIERITEMCD"); return this; }

    protected ConditionValue _positemcd;
    public ConditionValue xdfgetPositemcd()
    { if (_positemcd == null) { _positemcd = nCV(); }
      return _positemcd; }
    protected ConditionValue xgetCValuePositemcd() { return xdfgetPositemcd(); }

    /**
     * Add order-by as ascend. <br>
     * POSITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Positemcd_Asc() { regOBA("POSITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * POSITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Positemcd_Desc() { regOBD("POSITEMCD"); return this; }

    protected ConditionValue _itfcd;
    public ConditionValue xdfgetItfcd()
    { if (_itfcd == null) { _itfcd = nCV(); }
      return _itfcd; }
    protected ConditionValue xgetCValueItfcd() { return xdfgetItfcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITFCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itfcd_Asc() { regOBA("ITFCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITFCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itfcd_Desc() { regOBD("ITFCD"); return this; }

    protected ConditionValue _manuitemcd;
    public ConditionValue xdfgetManuitemcd()
    { if (_manuitemcd == null) { _manuitemcd = nCV(); }
      return _manuitemcd; }
    protected ConditionValue xgetCValueManuitemcd() { return xdfgetManuitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Manuitemcd_Asc() { regOBA("MANUITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUITEMCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Manuitemcd_Desc() { regOBD("MANUITEMCD"); return this; }

    protected ConditionValue _priceBuy;
    public ConditionValue xdfgetPriceBuy()
    { if (_priceBuy == null) { _priceBuy = nCV(); }
      return _priceBuy; }
    protected ConditionValue xgetCValuePriceBuy() { return xdfgetPriceBuy(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_BUY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceBuy_Asc() { regOBA("PRICE_BUY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_BUY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceBuy_Desc() { regOBD("PRICE_BUY"); return this; }

    protected ConditionValue _priceWholesale;
    public ConditionValue xdfgetPriceWholesale()
    { if (_priceWholesale == null) { _priceWholesale = nCV(); }
      return _priceWholesale; }
    protected ConditionValue xgetCValuePriceWholesale() { return xdfgetPriceWholesale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_WHOLESALE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceWholesale_Asc() { regOBA("PRICE_WHOLESALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_WHOLESALE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceWholesale_Desc() { regOBD("PRICE_WHOLESALE"); return this; }

    protected ConditionValue _priceSale;
    public ConditionValue xdfgetPriceSale()
    { if (_priceSale == null) { _priceSale = nCV(); }
      return _priceSale; }
    protected ConditionValue xgetCValuePriceSale() { return xdfgetPriceSale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_SALE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceSale_Asc() { regOBA("PRICE_SALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_SALE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceSale_Desc() { regOBD("PRICE_SALE"); return this; }

    protected ConditionValue _abctype;
    public ConditionValue xdfgetAbctype()
    { if (_abctype == null) { _abctype = nCV(); }
      return _abctype; }
    protected ConditionValue xgetCValueAbctype() { return xdfgetAbctype(); }

    /**
     * Add order-by as ascend. <br>
     * ABCTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Abctype_Asc() { regOBA("ABCTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABCTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Abctype_Desc() { regOBD("ABCTYPE"); return this; }

    protected ConditionValue _qty1type;
    public ConditionValue xdfgetQty1type()
    { if (_qty1type == null) { _qty1type = nCV(); }
      return _qty1type; }
    protected ConditionValue xgetCValueQty1type() { return xdfgetQty1type(); }

    /**
     * Add order-by as ascend. <br>
     * QTY1TYPE: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Qty1type_Asc() { regOBA("QTY1TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY1TYPE: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Qty1type_Desc() { regOBD("QTY1TYPE"); return this; }

    protected ConditionValue _unit1;
    public ConditionValue xdfgetUnit1()
    { if (_unit1 == null) { _unit1 = nCV(); }
      return _unit1; }
    protected ConditionValue xgetCValueUnit1() { return xdfgetUnit1(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit1_Asc() { regOBA("UNIT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit1_Desc() { regOBD("UNIT1"); return this; }

    protected ConditionValue _unit1style;
    public ConditionValue xdfgetUnit1style()
    { if (_unit1style == null) { _unit1style = nCV(); }
      return _unit1style; }
    protected ConditionValue xgetCValueUnit1style() { return xdfgetUnit1style(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT1STYLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit1style_Asc() { regOBA("UNIT1STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT1STYLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit1style_Desc() { regOBD("UNIT1STYLE"); return this; }

    protected ConditionValue _length1;
    public ConditionValue xdfgetLength1()
    { if (_length1 == null) { _length1 = nCV(); }
      return _length1; }
    protected ConditionValue xgetCValueLength1() { return xdfgetLength1(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Length1_Asc() { regOBA("LENGTH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Length1_Desc() { regOBD("LENGTH1"); return this; }

    protected ConditionValue _width1;
    public ConditionValue xdfgetWidth1()
    { if (_width1 == null) { _width1 = nCV(); }
      return _width1; }
    protected ConditionValue xgetCValueWidth1() { return xdfgetWidth1(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Width1_Asc() { regOBA("WIDTH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Width1_Desc() { regOBD("WIDTH1"); return this; }

    protected ConditionValue _height1;
    public ConditionValue xdfgetHeight1()
    { if (_height1 == null) { _height1 = nCV(); }
      return _height1; }
    protected ConditionValue xgetCValueHeight1() { return xdfgetHeight1(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Height1_Asc() { regOBA("HEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Height1_Desc() { regOBD("HEIGHT1"); return this; }

    protected ConditionValue _grossweight1;
    public ConditionValue xdfgetGrossweight1()
    { if (_grossweight1 == null) { _grossweight1 = nCV(); }
      return _grossweight1; }
    protected ConditionValue xgetCValueGrossweight1() { return xdfgetGrossweight1(); }

    /**
     * Add order-by as ascend. <br>
     * GROSSWEIGHT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Grossweight1_Asc() { regOBA("GROSSWEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSSWEIGHT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Grossweight1_Desc() { regOBD("GROSSWEIGHT1"); return this; }

    protected ConditionValue _netweight1;
    public ConditionValue xdfgetNetweight1()
    { if (_netweight1 == null) { _netweight1 = nCV(); }
      return _netweight1; }
    protected ConditionValue xgetCValueNetweight1() { return xdfgetNetweight1(); }

    /**
     * Add order-by as ascend. <br>
     * NETWEIGHT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Netweight1_Asc() { regOBA("NETWEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NETWEIGHT1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Netweight1_Desc() { regOBD("NETWEIGHT1"); return this; }

    protected ConditionValue _cube1;
    public ConditionValue xdfgetCube1()
    { if (_cube1 == null) { _cube1 = nCV(); }
      return _cube1; }
    protected ConditionValue xgetCValueCube1() { return xdfgetCube1(); }

    /**
     * Add order-by as ascend. <br>
     * CUBE1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Cube1_Asc() { regOBA("CUBE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUBE1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Cube1_Desc() { regOBD("CUBE1"); return this; }

    protected ConditionValue _liter1;
    public ConditionValue xdfgetLiter1()
    { if (_liter1 == null) { _liter1 = nCV(); }
      return _liter1; }
    protected ConditionValue xgetCValueLiter1() { return xdfgetLiter1(); }

    /**
     * Add order-by as ascend. <br>
     * LITER1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Liter1_Asc() { regOBA("LITER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LITER1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Liter1_Desc() { regOBD("LITER1"); return this; }

    protected ConditionValue _unit2;
    public ConditionValue xdfgetUnit2()
    { if (_unit2 == null) { _unit2 = nCV(); }
      return _unit2; }
    protected ConditionValue xgetCValueUnit2() { return xdfgetUnit2(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit2_Asc() { regOBA("UNIT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit2_Desc() { regOBD("UNIT2"); return this; }

    protected ConditionValue _unit2style;
    public ConditionValue xdfgetUnit2style()
    { if (_unit2style == null) { _unit2style = nCV(); }
      return _unit2style; }
    protected ConditionValue xgetCValueUnit2style() { return xdfgetUnit2style(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT2STYLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit2style_Asc() { regOBA("UNIT2STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT2STYLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit2style_Desc() { regOBD("UNIT2STYLE"); return this; }

    protected ConditionValue _length2;
    public ConditionValue xdfgetLength2()
    { if (_length2 == null) { _length2 = nCV(); }
      return _length2; }
    protected ConditionValue xgetCValueLength2() { return xdfgetLength2(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Length2_Asc() { regOBA("LENGTH2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Length2_Desc() { regOBD("LENGTH2"); return this; }

    protected ConditionValue _width2;
    public ConditionValue xdfgetWidth2()
    { if (_width2 == null) { _width2 = nCV(); }
      return _width2; }
    protected ConditionValue xgetCValueWidth2() { return xdfgetWidth2(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Width2_Asc() { regOBA("WIDTH2"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Width2_Desc() { regOBD("WIDTH2"); return this; }

    protected ConditionValue _height2;
    public ConditionValue xdfgetHeight2()
    { if (_height2 == null) { _height2 = nCV(); }
      return _height2; }
    protected ConditionValue xgetCValueHeight2() { return xdfgetHeight2(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Height2_Asc() { regOBA("HEIGHT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Height2_Desc() { regOBD("HEIGHT2"); return this; }

    protected ConditionValue _grossweight2;
    public ConditionValue xdfgetGrossweight2()
    { if (_grossweight2 == null) { _grossweight2 = nCV(); }
      return _grossweight2; }
    protected ConditionValue xgetCValueGrossweight2() { return xdfgetGrossweight2(); }

    /**
     * Add order-by as ascend. <br>
     * GROSSWEIGHT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Grossweight2_Asc() { regOBA("GROSSWEIGHT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSSWEIGHT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Grossweight2_Desc() { regOBD("GROSSWEIGHT2"); return this; }

    protected ConditionValue _netweight2;
    public ConditionValue xdfgetNetweight2()
    { if (_netweight2 == null) { _netweight2 = nCV(); }
      return _netweight2; }
    protected ConditionValue xgetCValueNetweight2() { return xdfgetNetweight2(); }

    /**
     * Add order-by as ascend. <br>
     * NETWEIGHT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Netweight2_Asc() { regOBA("NETWEIGHT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NETWEIGHT2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Netweight2_Desc() { regOBD("NETWEIGHT2"); return this; }

    protected ConditionValue _cube2;
    public ConditionValue xdfgetCube2()
    { if (_cube2 == null) { _cube2 = nCV(); }
      return _cube2; }
    protected ConditionValue xgetCValueCube2() { return xdfgetCube2(); }

    /**
     * Add order-by as ascend. <br>
     * CUBE2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Cube2_Asc() { regOBA("CUBE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUBE2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Cube2_Desc() { regOBD("CUBE2"); return this; }

    protected ConditionValue _liter2;
    public ConditionValue xdfgetLiter2()
    { if (_liter2 == null) { _liter2 = nCV(); }
      return _liter2; }
    protected ConditionValue xgetCValueLiter2() { return xdfgetLiter2(); }

    /**
     * Add order-by as ascend. <br>
     * LITER2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Liter2_Asc() { regOBA("LITER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LITER2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Liter2_Desc() { regOBD("LITER2"); return this; }

    protected ConditionValue _unit3;
    public ConditionValue xdfgetUnit3()
    { if (_unit3 == null) { _unit3 = nCV(); }
      return _unit3; }
    protected ConditionValue xgetCValueUnit3() { return xdfgetUnit3(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit3_Asc() { regOBA("UNIT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit3_Desc() { regOBD("UNIT3"); return this; }

    protected ConditionValue _unit3style;
    public ConditionValue xdfgetUnit3style()
    { if (_unit3style == null) { _unit3style = nCV(); }
      return _unit3style; }
    protected ConditionValue xgetCValueUnit3style() { return xdfgetUnit3style(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT3STYLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit3style_Asc() { regOBA("UNIT3STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT3STYLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Unit3style_Desc() { regOBD("UNIT3STYLE"); return this; }

    protected ConditionValue _length3;
    public ConditionValue xdfgetLength3()
    { if (_length3 == null) { _length3 = nCV(); }
      return _length3; }
    protected ConditionValue xgetCValueLength3() { return xdfgetLength3(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Length3_Asc() { regOBA("LENGTH3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Length3_Desc() { regOBD("LENGTH3"); return this; }

    protected ConditionValue _width3;
    public ConditionValue xdfgetWidth3()
    { if (_width3 == null) { _width3 = nCV(); }
      return _width3; }
    protected ConditionValue xgetCValueWidth3() { return xdfgetWidth3(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Width3_Asc() { regOBA("WIDTH3"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Width3_Desc() { regOBD("WIDTH3"); return this; }

    protected ConditionValue _height3;
    public ConditionValue xdfgetHeight3()
    { if (_height3 == null) { _height3 = nCV(); }
      return _height3; }
    protected ConditionValue xgetCValueHeight3() { return xdfgetHeight3(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Height3_Asc() { regOBA("HEIGHT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Height3_Desc() { regOBD("HEIGHT3"); return this; }

    protected ConditionValue _grossweight3;
    public ConditionValue xdfgetGrossweight3()
    { if (_grossweight3 == null) { _grossweight3 = nCV(); }
      return _grossweight3; }
    protected ConditionValue xgetCValueGrossweight3() { return xdfgetGrossweight3(); }

    /**
     * Add order-by as ascend. <br>
     * GROSSWEIGHT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Grossweight3_Asc() { regOBA("GROSSWEIGHT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSSWEIGHT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Grossweight3_Desc() { regOBD("GROSSWEIGHT3"); return this; }

    protected ConditionValue _netweight3;
    public ConditionValue xdfgetNetweight3()
    { if (_netweight3 == null) { _netweight3 = nCV(); }
      return _netweight3; }
    protected ConditionValue xgetCValueNetweight3() { return xdfgetNetweight3(); }

    /**
     * Add order-by as ascend. <br>
     * NETWEIGHT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Netweight3_Asc() { regOBA("NETWEIGHT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NETWEIGHT3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Netweight3_Desc() { regOBD("NETWEIGHT3"); return this; }

    protected ConditionValue _cube3;
    public ConditionValue xdfgetCube3()
    { if (_cube3 == null) { _cube3 = nCV(); }
      return _cube3; }
    protected ConditionValue xgetCValueCube3() { return xdfgetCube3(); }

    /**
     * Add order-by as ascend. <br>
     * CUBE3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Cube3_Asc() { regOBA("CUBE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUBE3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Cube3_Desc() { regOBD("CUBE3"); return this; }

    protected ConditionValue _liter3;
    public ConditionValue xdfgetLiter3()
    { if (_liter3 == null) { _liter3 = nCV(); }
      return _liter3; }
    protected ConditionValue xgetCValueLiter3() { return xdfgetLiter3(); }

    /**
     * Add order-by as ascend. <br>
     * LITER3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Liter3_Asc() { regOBA("LITER3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LITER3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Liter3_Desc() { regOBD("LITER3"); return this; }

    protected ConditionValue _pQty;
    public ConditionValue xdfgetPQty()
    { if (_pQty == null) { _pQty = nCV(); }
      return _pQty; }
    protected ConditionValue xgetCValuePQty() { return xdfgetPQty(); }

    /**
     * Add order-by as ascend. <br>
     * P_QTY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PQty_Asc() { regOBA("P_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_QTY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PQty_Desc() { regOBD("P_QTY"); return this; }

    protected ConditionValue _pHeight;
    public ConditionValue xdfgetPHeight()
    { if (_pHeight == null) { _pHeight = nCV(); }
      return _pHeight; }
    protected ConditionValue xgetCValuePHeight() { return xdfgetPHeight(); }

    /**
     * Add order-by as ascend. <br>
     * P_HEIGHT: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PHeight_Asc() { regOBA("P_HEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_HEIGHT: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PHeight_Desc() { regOBD("P_HEIGHT"); return this; }

    protected ConditionValue _pOdd;
    public ConditionValue xdfgetPOdd()
    { if (_pOdd == null) { _pOdd = nCV(); }
      return _pOdd; }
    protected ConditionValue xgetCValuePOdd() { return xdfgetPOdd(); }

    /**
     * Add order-by as ascend. <br>
     * P_ODD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_POdd_Asc() { regOBA("P_ODD"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_ODD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_POdd_Desc() { regOBD("P_ODD"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _fUser1;
    public ConditionValue xdfgetFUser1()
    { if (_fUser1 == null) { _fUser1 = nCV(); }
      return _fUser1; }
    protected ConditionValue xgetCValueFUser1() { return xdfgetFUser1(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser1_Asc() { regOBA("F_USER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser1_Desc() { regOBD("F_USER1"); return this; }

    protected ConditionValue _fUser2;
    public ConditionValue xdfgetFUser2()
    { if (_fUser2 == null) { _fUser2 = nCV(); }
      return _fUser2; }
    protected ConditionValue xgetCValueFUser2() { return xdfgetFUser2(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser2_Asc() { regOBA("F_USER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser2_Desc() { regOBD("F_USER2"); return this; }

    protected ConditionValue _fUser3;
    public ConditionValue xdfgetFUser3()
    { if (_fUser3 == null) { _fUser3 = nCV(); }
      return _fUser3; }
    protected ConditionValue xgetCValueFUser3() { return xdfgetFUser3(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser3_Asc() { regOBA("F_USER3"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser3_Desc() { regOBD("F_USER3"); return this; }

    protected ConditionValue _fUser4;
    public ConditionValue xdfgetFUser4()
    { if (_fUser4 == null) { _fUser4 = nCV(); }
      return _fUser4; }
    protected ConditionValue xgetCValueFUser4() { return xdfgetFUser4(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser4_Asc() { regOBA("F_USER4"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser4_Desc() { regOBD("F_USER4"); return this; }

    protected ConditionValue _fUser5;
    public ConditionValue xdfgetFUser5()
    { if (_fUser5 == null) { _fUser5 = nCV(); }
      return _fUser5; }
    protected ConditionValue xgetCValueFUser5() { return xdfgetFUser5(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER5: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser5_Asc() { regOBA("F_USER5"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER5: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_FUser5_Desc() { regOBD("F_USER5"); return this; }

    protected ConditionValue _priceInsurance;
    public ConditionValue xdfgetPriceInsurance()
    { if (_priceInsurance == null) { _priceInsurance = nCV(); }
      return _priceInsurance; }
    protected ConditionValue xgetCValuePriceInsurance() { return xdfgetPriceInsurance(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_INSURANCE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceInsurance_Asc() { regOBA("PRICE_INSURANCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_INSURANCE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_PriceInsurance_Desc() { regOBD("PRICE_INSURANCE"); return this; }

    protected ConditionValue _limitday;
    public ConditionValue xdfgetLimitday()
    { if (_limitday == null) { _limitday = nCV(); }
      return _limitday; }
    protected ConditionValue xgetCValueLimitday() { return xdfgetLimitday(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDAY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Limitday_Asc() { regOBA("LIMITDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDAY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Limitday_Desc() { regOBD("LIMITDAY"); return this; }

    protected ConditionValue _useruse1;
    public ConditionValue xdfgetUseruse1()
    { if (_useruse1 == null) { _useruse1 = nCV(); }
      return _useruse1; }
    protected ConditionValue xgetCValueUseruse1() { return xdfgetUseruse1(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE1: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse1_Asc() { regOBA("USERUSE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE1: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse1_Desc() { regOBD("USERUSE1"); return this; }

    protected ConditionValue _useruse2;
    public ConditionValue xdfgetUseruse2()
    { if (_useruse2 == null) { _useruse2 = nCV(); }
      return _useruse2; }
    protected ConditionValue xgetCValueUseruse2() { return xdfgetUseruse2(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE2: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse2_Asc() { regOBA("USERUSE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE2: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse2_Desc() { regOBD("USERUSE2"); return this; }

    protected ConditionValue _useruse3;
    public ConditionValue xdfgetUseruse3()
    { if (_useruse3 == null) { _useruse3 = nCV(); }
      return _useruse3; }
    protected ConditionValue xgetCValueUseruse3() { return xdfgetUseruse3(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse3_Asc() { regOBA("USERUSE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse3_Desc() { regOBD("USERUSE3"); return this; }

    protected ConditionValue _useruse4;
    public ConditionValue xdfgetUseruse4()
    { if (_useruse4 == null) { _useruse4 = nCV(); }
      return _useruse4; }
    protected ConditionValue xgetCValueUseruse4() { return xdfgetUseruse4(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE4: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse4_Asc() { regOBA("USERUSE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE4: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse4_Desc() { regOBD("USERUSE4"); return this; }

    protected ConditionValue _useruse5;
    public ConditionValue xdfgetUseruse5()
    { if (_useruse5 == null) { _useruse5 = nCV(); }
      return _useruse5; }
    protected ConditionValue xgetCValueUseruse5() { return xdfgetUseruse5(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE5: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse5_Asc() { regOBA("USERUSE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE5: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Useruse5_Desc() { regOBD("USERUSE5"); return this; }

    protected ConditionValue _pricelevel;
    public ConditionValue xdfgetPricelevel()
    { if (_pricelevel == null) { _pricelevel = nCV(); }
      return _pricelevel; }
    protected ConditionValue xgetCValuePricelevel() { return xdfgetPricelevel(); }

    /**
     * Add order-by as ascend. <br>
     * PRICELEVEL: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Pricelevel_Asc() { regOBA("PRICELEVEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICELEVEL: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Pricelevel_Desc() { regOBD("PRICELEVEL"); return this; }

    protected ConditionValue _itemcatalogurl;
    public ConditionValue xdfgetItemcatalogurl()
    { if (_itemcatalogurl == null) { _itemcatalogurl = nCV(); }
      return _itemcatalogurl; }
    protected ConditionValue xgetCValueItemcatalogurl() { return xdfgetItemcatalogurl(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCATALOGURL: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itemcatalogurl_Asc() { regOBA("ITEMCATALOGURL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCATALOGURL: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Itemcatalogurl_Desc() { regOBD("ITEMCATALOGURL"); return this; }

    protected ConditionValue _usernum1;
    public ConditionValue xdfgetUsernum1()
    { if (_usernum1 == null) { _usernum1 = nCV(); }
      return _usernum1; }
    protected ConditionValue xgetCValueUsernum1() { return xdfgetUsernum1(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum1_Asc() { regOBA("USERNUM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum1_Desc() { regOBD("USERNUM1"); return this; }

    protected ConditionValue _usernum2;
    public ConditionValue xdfgetUsernum2()
    { if (_usernum2 == null) { _usernum2 = nCV(); }
      return _usernum2; }
    protected ConditionValue xgetCValueUsernum2() { return xdfgetUsernum2(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum2_Asc() { regOBA("USERNUM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum2_Desc() { regOBD("USERNUM2"); return this; }

    protected ConditionValue _usernum3;
    public ConditionValue xdfgetUsernum3()
    { if (_usernum3 == null) { _usernum3 = nCV(); }
      return _usernum3; }
    protected ConditionValue xgetCValueUsernum3() { return xdfgetUsernum3(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum3_Asc() { regOBA("USERNUM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum3_Desc() { regOBD("USERNUM3"); return this; }

    protected ConditionValue _usernum4;
    public ConditionValue xdfgetUsernum4()
    { if (_usernum4 == null) { _usernum4 = nCV(); }
      return _usernum4; }
    protected ConditionValue xgetCValueUsernum4() { return xdfgetUsernum4(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum4_Asc() { regOBA("USERNUM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum4_Desc() { regOBD("USERNUM4"); return this; }

    protected ConditionValue _usernum5;
    public ConditionValue xdfgetUsernum5()
    { if (_usernum5 == null) { _usernum5 = nCV(); }
      return _usernum5; }
    protected ConditionValue xgetCValueUsernum5() { return xdfgetUsernum5(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM5: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum5_Asc() { regOBA("USERNUM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM5: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Usernum5_Desc() { regOBD("USERNUM5"); return this; }

    protected ConditionValue _userdate1;
    public ConditionValue xdfgetUserdate1()
    { if (_userdate1 == null) { _userdate1 = nCV(); }
      return _userdate1; }
    protected ConditionValue xgetCValueUserdate1() { return xdfgetUserdate1(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate1_Asc() { regOBA("USERDATE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate1_Desc() { regOBD("USERDATE1"); return this; }

    protected ConditionValue _userdate2;
    public ConditionValue xdfgetUserdate2()
    { if (_userdate2 == null) { _userdate2 = nCV(); }
      return _userdate2; }
    protected ConditionValue xgetCValueUserdate2() { return xdfgetUserdate2(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate2_Asc() { regOBA("USERDATE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate2_Desc() { regOBD("USERDATE2"); return this; }

    protected ConditionValue _userdate3;
    public ConditionValue xdfgetUserdate3()
    { if (_userdate3 == null) { _userdate3 = nCV(); }
      return _userdate3; }
    protected ConditionValue xgetCValueUserdate3() { return xdfgetUserdate3(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate3_Asc() { regOBA("USERDATE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate3_Desc() { regOBD("USERDATE3"); return this; }

    protected ConditionValue _userdate4;
    public ConditionValue xdfgetUserdate4()
    { if (_userdate4 == null) { _userdate4 = nCV(); }
      return _userdate4; }
    protected ConditionValue xgetCValueUserdate4() { return xdfgetUserdate4(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate4_Asc() { regOBA("USERDATE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate4_Desc() { regOBD("USERDATE4"); return this; }

    protected ConditionValue _userdate5;
    public ConditionValue xdfgetUserdate5()
    { if (_userdate5 == null) { _userdate5 = nCV(); }
      return _userdate5; }
    protected ConditionValue xgetCValueUserdate5() { return xdfgetUserdate5(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE5: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate5_Asc() { regOBA("USERDATE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE5: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_Userdate5_Desc() { regOBD("USERDATE5"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsETrifitemdataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifitemdataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsETrifitemdataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsETrifitemdataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ETrifitemdataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ETrifitemdataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ETrifitemdataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ETrifitemdataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ETrifitemdataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ETrifitemdataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ETrifitemdataCQ> _myselfExistsMap;
    public Map<String, ETrifitemdataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ETrifitemdataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ETrifitemdataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ETrifitemdataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ETrifitemdataCB.class.getName(); }
    protected String xCQ() { return ETrifitemdataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
