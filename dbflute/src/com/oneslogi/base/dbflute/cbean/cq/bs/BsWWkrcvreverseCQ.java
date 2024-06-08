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
 * The base condition-query of W_WKRCVREVERSE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkrcvreverseCQ extends AbstractBsWWkrcvreverseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkrcvreverseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkrcvreverseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKRCVREVERSE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkrcvreverseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkrcvreverseCIQ xcreateCIQ() {
        WWkrcvreverseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkrcvreverseCIQ xnewCIQ() {
        return new WWkrcvreverseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKRCVREVERSE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkrcvreverseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkrcvreverseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _printkey;
    public ConditionValue xdfgetPrintkey()
    { if (_printkey == null) { _printkey = nCV(); }
      return _printkey; }
    protected ConditionValue xgetCValuePrintkey() { return xdfgetPrintkey(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Printkey_Asc() { regOBA("PRINTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Printkey_Desc() { regOBD("PRINTKEY"); return this; }

    protected ConditionValue _rcvreverseno;
    public ConditionValue xdfgetRcvreverseno()
    { if (_rcvreverseno == null) { _rcvreverseno = nCV(); }
      return _rcvreverseno; }
    protected ConditionValue xgetCValueRcvreverseno() { return xdfgetRcvreverseno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvreverseno_Asc() { regOBA("RCVREVERSENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvreverseno_Desc() { regOBD("RCVREVERSENO"); return this; }

    protected ConditionValue _rcvreverselineno;
    public ConditionValue xdfgetRcvreverselineno()
    { if (_rcvreverselineno == null) { _rcvreverselineno = nCV(); }
      return _rcvreverselineno; }
    protected ConditionValue xgetCValueRcvreverselineno() { return xdfgetRcvreverselineno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvreverselineno_Asc() { regOBA("RCVREVERSELINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvreverselineno_Desc() { regOBD("RCVREVERSELINENO"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _warehousename;
    public ConditionValue xdfgetWarehousename()
    { if (_warehousename == null) { _warehousename = nCV(); }
      return _warehousename; }
    protected ConditionValue xgetCValueWarehousename() { return xdfgetWarehousename(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Warehousename_Asc() { regOBA("WAREHOUSENAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Warehousename_Desc() { regOBD("WAREHOUSENAME"); return this; }

    protected ConditionValue _transportno;
    public ConditionValue xdfgetTransportno()
    { if (_transportno == null) { _transportno = nCV(); }
      return _transportno; }
    protected ConditionValue xgetCValueTransportno() { return xdfgetTransportno(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Transportno_Asc() { regOBA("TRANSPORTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Transportno_Desc() { regOBD("TRANSPORTNO"); return this; }

    protected ConditionValue _rcvschdate;
    public ConditionValue xdfgetRcvschdate()
    { if (_rcvschdate == null) { _rcvschdate = nCV(); }
      return _rcvschdate; }
    protected ConditionValue xgetCValueRcvschdate() { return xdfgetRcvschdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvschdate_Asc() { regOBA("RCVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvschdate_Desc() { regOBD("RCVSCHDATE"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _suppliername;
    public ConditionValue xdfgetSuppliername()
    { if (_suppliername == null) { _suppliername = nCV(); }
      return _suppliername; }
    protected ConditionValue xgetCValueSuppliername() { return xdfgetSuppliername(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Suppliername_Asc() { regOBA("SUPPLIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Suppliername_Desc() { regOBD("SUPPLIERNAME"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemname;
    public ConditionValue xdfgetItemname()
    { if (_itemname == null) { _itemname = nCV(); }
      return _itemname; }
    protected ConditionValue xgetCValueItemname() { return xdfgetItemname(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Itemname_Asc() { regOBA("ITEMNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Itemname_Desc() { regOBD("ITEMNAME"); return this; }

    protected ConditionValue _rcvlimitdate;
    public ConditionValue xdfgetRcvlimitdate()
    { if (_rcvlimitdate == null) { _rcvlimitdate = nCV(); }
      return _rcvlimitdate; }
    protected ConditionValue xgetCValueRcvlimitdate() { return xdfgetRcvlimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvlimitdate_Asc() { regOBA("RCVLIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvlimitdate_Desc() { regOBD("RCVLIMITDATE"); return this; }

    protected ConditionValue _rcvdesigncd;
    public ConditionValue xdfgetRcvdesigncd()
    { if (_rcvdesigncd == null) { _rcvdesigncd = nCV(); }
      return _rcvdesigncd; }
    protected ConditionValue xgetCValueRcvdesigncd() { return xdfgetRcvdesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvdesigncd_Asc() { regOBA("RCVDESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvdesigncd_Desc() { regOBD("RCVDESIGNCD"); return this; }

    protected ConditionValue _rcvqty;
    public ConditionValue xdfgetRcvqty()
    { if (_rcvqty == null) { _rcvqty = nCV(); }
      return _rcvqty; }
    protected ConditionValue xgetCValueRcvqty() { return xdfgetRcvqty(); }

    /**
     * Add order-by as ascend. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvqty_Asc() { regOBA("RCVQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Rcvqty_Desc() { regOBD("RCVQTY"); return this; }

    protected ConditionValue _workdatetime;
    public ConditionValue xdfgetWorkdatetime()
    { if (_workdatetime == null) { _workdatetime = nCV(); }
      return _workdatetime; }
    protected ConditionValue xgetCValueWorkdatetime() { return xdfgetWorkdatetime(); }

    /**
     * Add order-by as ascend. <br>
     * WORKDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Workdatetime_Asc() { regOBA("WORKDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKDATETIME: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Workdatetime_Desc() { regOBD("WORKDATETIME"); return this; }

    protected ConditionValue _loc;
    public ConditionValue xdfgetLoc()
    { if (_loc == null) { _loc = nCV(); }
      return _loc; }
    protected ConditionValue xgetCValueLoc() { return xdfgetLoc(); }

    /**
     * Add order-by as ascend. <br>
     * LOC: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Loc_Asc() { regOBA("LOC"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOC: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Loc_Desc() { regOBD("LOC"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _limitday;
    public ConditionValue xdfgetLimitday()
    { if (_limitday == null) { _limitday = nCV(); }
      return _limitday; }
    protected ConditionValue xgetCValueLimitday() { return xdfgetLimitday(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Limitday_Asc() { regOBA("LIMITDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Limitday_Desc() { regOBD("LIMITDAY"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_Designcd_Asc() { regOBA("DESIGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Designcd_Desc() { regOBD("DESIGNCD"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_Qtycase_Asc() { regOBA("QTYCASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Qtycase_Desc() { regOBD("QTYCASE"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_Qtybowl_Asc() { regOBA("QTYBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Qtybowl_Desc() { regOBD("QTYBOWL"); return this; }

    protected ConditionValue _flg;
    public ConditionValue xdfgetFlg()
    { if (_flg == null) { _flg = nCV(); }
      return _flg; }
    protected ConditionValue xgetCValueFlg() { return xdfgetFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Flg_Asc() { regOBA("FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Flg_Desc() { regOBD("FLG"); return this; }

    protected ConditionValue _insideOutsideKbn;
    public ConditionValue xdfgetInsideOutsideKbn()
    { if (_insideOutsideKbn == null) { _insideOutsideKbn = nCV(); }
      return _insideOutsideKbn; }
    protected ConditionValue xgetCValueInsideOutsideKbn() { return xdfgetInsideOutsideKbn(); }

    /**
     * Add order-by as ascend. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_InsideOutsideKbn_Asc() { regOBA("INSIDE_OUTSIDE_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_InsideOutsideKbn_Desc() { regOBD("INSIDE_OUTSIDE_KBN"); return this; }

    protected ConditionValue _itemOrderby;
    public ConditionValue xdfgetItemOrderby()
    { if (_itemOrderby == null) { _itemOrderby = nCV(); }
      return _itemOrderby; }
    protected ConditionValue xgetCValueItemOrderby() { return xdfgetItemOrderby(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_ItemOrderby_Asc() { regOBA("ITEM_ORDERBY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_ItemOrderby_Desc() { regOBD("ITEM_ORDERBY"); return this; }

    protected ConditionValue _printpageno;
    public ConditionValue xdfgetPrintpageno()
    { if (_printpageno == null) { _printpageno = nCV(); }
      return _printpageno; }
    protected ConditionValue xgetCValuePrintpageno() { return xdfgetPrintpageno(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTPAGENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Printpageno_Asc() { regOBA("PRINTPAGENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTPAGENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Printpageno_Desc() { regOBD("PRINTPAGENO"); return this; }

    protected ConditionValue _seqsortkey;
    public ConditionValue xdfgetSeqsortkey()
    { if (_seqsortkey == null) { _seqsortkey = nCV(); }
      return _seqsortkey; }
    protected ConditionValue xgetCValueSeqsortkey() { return xdfgetSeqsortkey(); }

    /**
     * Add order-by as ascend. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Seqsortkey_Asc() { regOBA("SEQSORTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_Seqsortkey_Desc() { regOBD("SEQSORTKEY"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkrcvreverseCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkrcvreverseCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkrcvreverseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkrcvreverseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWkrcvreverseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkrcvreverseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkrcvreverseCB.class.getName(); }
    protected String xCQ() { return WWkrcvreverseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
