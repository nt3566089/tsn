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
 * The base condition-query of E_TRIFTRNODR.
 * @author DBFlute(AutoGenerator)
 */
public class BsETriftrnodrCQ extends AbstractBsETriftrnodrCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETriftrnodrCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETriftrnodrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_TRIFTRNODR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ETriftrnodrCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ETriftrnodrCIQ xcreateCIQ() {
        ETriftrnodrCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ETriftrnodrCIQ xnewCIQ() {
        return new ETriftrnodrCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_TRIFTRNODR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ETriftrnodrCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ETriftrnodrCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsETriftrnodrCQ addOrderBy_Ifdatakey_Asc() { regOBA("IFDATAKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Ifdatakey_Desc() { regOBD("IFDATAKEY"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_Segname_Asc() { regOBA("SEGNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Segname_Desc() { regOBD("SEGNAME"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

    protected ConditionValue _nexuspkey;
    public ConditionValue xdfgetNexuspkey()
    { if (_nexuspkey == null) { _nexuspkey = nCV(); }
      return _nexuspkey; }
    protected ConditionValue xgetCValueNexuspkey() { return xdfgetNexuspkey(); }

    /**
     * Add order-by as ascend. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Nexuspkey_Asc() { regOBA("NEXUSPKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Nexuspkey_Desc() { regOBD("NEXUSPKEY"); return this; }

    protected ConditionValue _orderno;
    public ConditionValue xdfgetOrderno()
    { if (_orderno == null) { _orderno = nCV(); }
      return _orderno; }
    protected ConditionValue xgetCValueOrderno() { return xdfgetOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Orderno_Asc() { regOBA("ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Orderno_Desc() { regOBD("ORDERNO"); return this; }

    protected ConditionValue _ordertype;
    public ConditionValue xdfgetOrdertype()
    { if (_ordertype == null) { _ordertype = nCV(); }
      return _ordertype; }
    protected ConditionValue xgetCValueOrdertype() { return xdfgetOrdertype(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Ordertype_Asc() { regOBA("ORDERTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Ordertype_Desc() { regOBD("ORDERTYPE"); return this; }

    protected ConditionValue _custorderno;
    public ConditionValue xdfgetCustorderno()
    { if (_custorderno == null) { _custorderno = nCV(); }
      return _custorderno; }
    protected ConditionValue xgetCValueCustorderno() { return xdfgetCustorderno(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Custorderno_Asc() { regOBA("CUSTORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Custorderno_Desc() { regOBD("CUSTORDERNO"); return this; }

    protected ConditionValue _trantype;
    public ConditionValue xdfgetTrantype()
    { if (_trantype == null) { _trantype = nCV(); }
      return _trantype; }
    protected ConditionValue xgetCValueTrantype() { return xdfgetTrantype(); }

    /**
     * Add order-by as ascend. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Trantype_Asc() { regOBA("TRANTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Trantype_Desc() { regOBD("TRANTYPE"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

    protected ConditionValue _transdetailtype;
    public ConditionValue xdfgetTransdetailtype()
    { if (_transdetailtype == null) { _transdetailtype = nCV(); }
      return _transdetailtype; }
    protected ConditionValue xgetCValueTransdetailtype() { return xdfgetTransdetailtype(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Transdetailtype_Asc() { regOBA("TRANSDETAILTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Transdetailtype_Desc() { regOBD("TRANSDETAILTYPE"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Schdate_Asc() { regOBA("SCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHDATE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Schdate_Desc() { regOBD("SCHDATE"); return this; }

    protected ConditionValue _schtime;
    public ConditionValue xdfgetSchtime()
    { if (_schtime == null) { _schtime = nCV(); }
      return _schtime; }
    protected ConditionValue xgetCValueSchtime() { return xdfgetSchtime(); }

    /**
     * Add order-by as ascend. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Schtime_Asc() { regOBA("SCHTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHTIME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Schtime_Desc() { regOBD("SCHTIME"); return this; }

    protected ConditionValue _actualdate;
    public ConditionValue xdfgetActualdate()
    { if (_actualdate == null) { _actualdate = nCV(); }
      return _actualdate; }
    protected ConditionValue xgetCValueActualdate() { return xdfgetActualdate(); }

    /**
     * Add order-by as ascend. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Actualdate_Asc() { regOBA("ACTUALDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTUALDATE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Actualdate_Desc() { regOBD("ACTUALDATE"); return this; }

    protected ConditionValue _actualtime;
    public ConditionValue xdfgetActualtime()
    { if (_actualtime == null) { _actualtime = nCV(); }
      return _actualtime; }
    protected ConditionValue xgetCValueActualtime() { return xdfgetActualtime(); }

    /**
     * Add order-by as ascend. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Actualtime_Asc() { regOBA("ACTUALTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTUALTIME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Actualtime_Desc() { regOBD("ACTUALTIME"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _fromcompanycd;
    public ConditionValue xdfgetFromcompanycd()
    { if (_fromcompanycd == null) { _fromcompanycd = nCV(); }
      return _fromcompanycd; }
    protected ConditionValue xgetCValueFromcompanycd() { return xdfgetFromcompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Fromcompanycd_Asc() { regOBA("FROMCOMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Fromcompanycd_Desc() { regOBD("FROMCOMPANYCD"); return this; }

    protected ConditionValue _fromownercd;
    public ConditionValue xdfgetFromownercd()
    { if (_fromownercd == null) { _fromownercd = nCV(); }
      return _fromownercd; }
    protected ConditionValue xgetCValueFromownercd() { return xdfgetFromownercd(); }

    /**
     * Add order-by as ascend. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Fromownercd_Asc() { regOBA("FROMOWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Fromownercd_Desc() { regOBD("FROMOWNERCD"); return this; }

    protected ConditionValue _tocompanycd;
    public ConditionValue xdfgetTocompanycd()
    { if (_tocompanycd == null) { _tocompanycd = nCV(); }
      return _tocompanycd; }
    protected ConditionValue xgetCValueTocompanycd() { return xdfgetTocompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Tocompanycd_Asc() { regOBA("TOCOMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Tocompanycd_Desc() { regOBD("TOCOMPANYCD"); return this; }

    protected ConditionValue _toownercd;
    public ConditionValue xdfgetToownercd()
    { if (_toownercd == null) { _toownercd = nCV(); }
      return _toownercd; }
    protected ConditionValue xgetCValueToownercd() { return xdfgetToownercd(); }

    /**
     * Add order-by as ascend. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Toownercd_Asc() { regOBA("TOOWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOOWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Toownercd_Desc() { regOBD("TOOWNERCD"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {NotNull, varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _otherrefno1;
    public ConditionValue xdfgetOtherrefno1()
    { if (_otherrefno1 == null) { _otherrefno1 = nCV(); }
      return _otherrefno1; }
    protected ConditionValue xgetCValueOtherrefno1() { return xdfgetOtherrefno1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

    protected ConditionValue _otherrefno2;
    public ConditionValue xdfgetOtherrefno2()
    { if (_otherrefno2 == null) { _otherrefno2 = nCV(); }
      return _otherrefno2; }
    protected ConditionValue xgetCValueOtherrefno2() { return xdfgetOtherrefno2(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Otherrefno2_Asc() { regOBA("OTHERREFNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Otherrefno2_Desc() { regOBD("OTHERREFNO2"); return this; }

    protected ConditionValue _otherrefno3;
    public ConditionValue xdfgetOtherrefno3()
    { if (_otherrefno3 == null) { _otherrefno3 = nCV(); }
      return _otherrefno3; }
    protected ConditionValue xgetCValueOtherrefno3() { return xdfgetOtherrefno3(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Otherrefno3_Asc() { regOBA("OTHERREFNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Otherrefno3_Desc() { regOBD("OTHERREFNO3"); return this; }

    protected ConditionValue _priority;
    public ConditionValue xdfgetPriority()
    { if (_priority == null) { _priority = nCV(); }
      return _priority; }
    protected ConditionValue xgetCValuePriority() { return xdfgetPriority(); }

    /**
     * Add order-by as ascend. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Priority_Asc() { regOBA("PRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRIORITY: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_Priority_Desc() { regOBD("PRIORITY"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsETriftrnodrCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETriftrnodrCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsETriftrnodrCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsETriftrnodrCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ETriftrnodrCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ETriftrnodrCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ETriftrnodrCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ETriftrnodrCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ETriftrnodrCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ETriftrnodrCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ETriftrnodrCQ> _myselfExistsMap;
    public Map<String, ETriftrnodrCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ETriftrnodrCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ETriftrnodrCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ETriftrnodrCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ETriftrnodrCB.class.getName(); }
    protected String xCQ() { return ETriftrnodrCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
