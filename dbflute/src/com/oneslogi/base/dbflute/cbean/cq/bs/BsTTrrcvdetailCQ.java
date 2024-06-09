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
 * The base condition-query of T_TRRCVDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrrcvdetailCQ extends AbstractBsTTrrcvdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrrcvdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRRCVDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrrcvdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrrcvdetailCIQ xcreateCIQ() {
        TTrrcvdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrrcvdetailCIQ xnewCIQ() {
        return new TTrrcvdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRRCVDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrrcvdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrrcvdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    public Map<String, TReceivePlanBCQ> getReceivePlanBId_InScopeRelation_TReceivePlanB() { return xgetSQueMap("receivePlanBId_InScopeRelation_TReceivePlanB"); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanBId_InScopeRelation_TReceivePlanB", sq); }

    public Map<String, TReceivePlanBCQ> getReceivePlanBId_NotInScopeRelation_TReceivePlanB() { return xgetSQueMap("receivePlanBId_NotInScopeRelation_TReceivePlanB"); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanBId_NotInScopeRelation_TReceivePlanB", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {PK, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {PK, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TTrrcvCQ> getReceivePlanHId_InScopeRelation_TTrrcv() { return xgetSQueMap("receivePlanHId_InScopeRelation_TTrrcv"); }
    public String keepReceivePlanHId_InScopeRelation_TTrrcv(TTrrcvCQ sq) { return xkeepSQue("receivePlanHId_InScopeRelation_TTrrcv", sq); }

    public Map<String, TTrrcvCQ> getReceivePlanHId_NotInScopeRelation_TTrrcv() { return xgetSQueMap("receivePlanHId_NotInScopeRelation_TTrrcv"); }
    public String keepReceivePlanHId_NotInScopeRelation_TTrrcv(TTrrcvCQ sq) { return xkeepSQue("receivePlanHId_NotInScopeRelation_TTrrcv", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {NotNull, bigint(19), FK to T_TRRCV}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {NotNull, bigint(19), FK to T_TRRCV}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _rcvlineno;
    public ConditionValue xdfgetRcvlineno()
    { if (_rcvlineno == null) { _rcvlineno = nCV(); }
      return _rcvlineno; }
    protected ConditionValue xgetCValueRcvlineno() { return xdfgetRcvlineno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _supplierrcvlineno;
    public ConditionValue xdfgetSupplierrcvlineno()
    { if (_supplierrcvlineno == null) { _supplierrcvlineno = nCV(); }
      return _supplierrcvlineno; }
    protected ConditionValue xgetCValueSupplierrcvlineno() { return xdfgetSupplierrcvlineno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Supplierrcvlineno_Asc() { regOBA("SUPPLIERRCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Supplierrcvlineno_Desc() { regOBD("SUPPLIERRCVLINENO"); return this; }

    protected ConditionValue _xdocflg;
    public ConditionValue xdfgetXdocflg()
    { if (_xdocflg == null) { _xdocflg = nCV(); }
      return _xdocflg; }
    protected ConditionValue xgetCValueXdocflg() { return xdfgetXdocflg(); }

    /**
     * Add order-by as ascend. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Xdocflg_Asc() { regOBA("XDOCFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Xdocflg_Desc() { regOBD("XDOCFLG"); return this; }

    protected ConditionValue _pokey;
    public ConditionValue xdfgetPokey()
    { if (_pokey == null) { _pokey = nCV(); }
      return _pokey; }
    protected ConditionValue xgetCValuePokey() { return xdfgetPokey(); }

    /**
     * Add order-by as ascend. <br>
     * POKEY: {IX+, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Pokey_Asc() { regOBA("POKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * POKEY: {IX+, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Pokey_Desc() { regOBD("POKEY"); return this; }

    protected ConditionValue _polineno;
    public ConditionValue xdfgetPolineno()
    { if (_polineno == null) { _polineno = nCV(); }
      return _polineno; }
    protected ConditionValue xgetCValuePolineno() { return xdfgetPolineno(); }

    /**
     * Add order-by as ascend. <br>
     * POLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Polineno_Asc() { regOBA("POLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * POLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Polineno_Desc() { regOBD("POLINENO"); return this; }

    protected ConditionValue _potype;
    public ConditionValue xdfgetPotype()
    { if (_potype == null) { _potype = nCV(); }
      return _potype; }
    protected ConditionValue xgetCValuePotype() { return xdfgetPotype(); }

    /**
     * Add order-by as ascend. <br>
     * POTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Potype_Asc() { regOBA("POTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Potype_Desc() { regOBD("POTYPE"); return this; }

    protected ConditionValue _ownerpolineno;
    public ConditionValue xdfgetOwnerpolineno()
    { if (_ownerpolineno == null) { _ownerpolineno = nCV(); }
      return _ownerpolineno; }
    protected ConditionValue xgetCValueOwnerpolineno() { return xdfgetOwnerpolineno(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownerpolineno_Asc() { regOBA("OWNERPOLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERPOLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownerpolineno_Desc() { regOBD("OWNERPOLINENO"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Originalpono_Asc() { regOBA("ORIGINALPONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORIGINALPONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Originalpono_Desc() { regOBD("ORIGINALPONO"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Originalpolineno_Asc() { regOBA("ORIGINALPOLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORIGINALPOLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Originalpolineno_Desc() { regOBD("ORIGINALPOLINENO"); return this; }

    protected ConditionValue _podate;
    public ConditionValue xdfgetPodate()
    { if (_podate == null) { _podate = nCV(); }
      return _podate; }
    protected ConditionValue xgetCValuePodate() { return xdfgetPodate(); }

    /**
     * Add order-by as ascend. <br>
     * PODATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Podate_Asc() { regOBA("PODATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PODATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Podate_Desc() { regOBD("PODATE"); return this; }

    protected ConditionValue _ownercd;
    public ConditionValue xdfgetOwnercd()
    { if (_ownercd == null) { _ownercd = nCV(); }
      return _ownercd; }
    protected ConditionValue xgetCValueOwnercd() { return xdfgetOwnercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownercd_Asc() { regOBA("OWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownercd_Desc() { regOBD("OWNERCD"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Itemadmin_Asc() { regOBA("ITEMADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Itemadmin_Desc() { regOBD("ITEMADMIN"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Ifitemcd_Asc() { regOBA("IFITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ifitemcd_Desc() { regOBD("IFITEMCD"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Lot5_Asc() { regOBA("LOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Lot5_Desc() { regOBD("LOT5"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Otherlot2_Asc() { regOBA("OTHERLOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Otherlot2_Desc() { regOBD("OTHERLOT2"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Otherlot3_Asc() { regOBA("OTHERLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Otherlot3_Desc() { regOBD("OTHERLOT3"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Otherlot4_Asc() { regOBA("OTHERLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Otherlot4_Desc() { regOBD("OTHERLOT4"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Otherlot5_Asc() { regOBA("OTHERLOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Otherlot5_Desc() { regOBD("OTHERLOT5"); return this; }

    protected ConditionValue _damageflg;
    public ConditionValue xdfgetDamageflg()
    { if (_damageflg == null) { _damageflg = nCV(); }
      return _damageflg; }
    protected ConditionValue xgetCValueDamageflg() { return xdfgetDamageflg(); }

    /**
     * Add order-by as ascend. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Damageflg_Asc() { regOBA("DAMAGEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Damageflg_Desc() { regOBD("DAMAGEFLG"); return this; }

    protected ConditionValue _noshippingflg;
    public ConditionValue xdfgetNoshippingflg()
    { if (_noshippingflg == null) { _noshippingflg = nCV(); }
      return _noshippingflg; }
    protected ConditionValue xgetCValueNoshippingflg() { return xdfgetNoshippingflg(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

    protected ConditionValue _foreigncargoflg;
    public ConditionValue xdfgetForeigncargoflg()
    { if (_foreigncargoflg == null) { _foreigncargoflg = nCV(); }
      return _foreigncargoflg; }
    protected ConditionValue xgetCValueForeigncargoflg() { return xdfgetForeigncargoflg(); }

    /**
     * Add order-by as ascend. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

    protected ConditionValue _customsreleaseflg;
    public ConditionValue xdfgetCustomsreleaseflg()
    { if (_customsreleaseflg == null) { _customsreleaseflg = nCV(); }
      return _customsreleaseflg; }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return xdfgetCustomsreleaseflg(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Customsreleaseflg_Asc() { regOBA("CUSTOMSRELEASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Customsreleaseflg_Desc() { regOBD("CUSTOMSRELEASEFLG"); return this; }

    protected ConditionValue _taxflg;
    public ConditionValue xdfgetTaxflg()
    { if (_taxflg == null) { _taxflg = nCV(); }
      return _taxflg; }
    protected ConditionValue xgetCValueTaxflg() { return xdfgetTaxflg(); }

    /**
     * Add order-by as ascend. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Taxflg_Asc() { regOBA("TAXFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Taxflg_Desc() { regOBD("TAXFLG"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _expectqty2;
    public ConditionValue xdfgetExpectqty2()
    { if (_expectqty2 == null) { _expectqty2 = nCV(); }
      return _expectqty2; }
    protected ConditionValue xgetCValueExpectqty2() { return xdfgetExpectqty2(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Expectqty2_Asc() { regOBA("EXPECTQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Expectqty2_Desc() { regOBD("EXPECTQTY2"); return this; }

    protected ConditionValue _expectqty3;
    public ConditionValue xdfgetExpectqty3()
    { if (_expectqty3 == null) { _expectqty3 = nCV(); }
      return _expectqty3; }
    protected ConditionValue xgetCValueExpectqty3() { return xdfgetExpectqty3(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Expectqty3_Asc() { regOBA("EXPECTQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Expectqty3_Desc() { regOBD("EXPECTQTY3"); return this; }

    protected ConditionValue _receivedqty1;
    public ConditionValue xdfgetReceivedqty1()
    { if (_receivedqty1 == null) { _receivedqty1 = nCV(); }
      return _receivedqty1; }
    protected ConditionValue xgetCValueReceivedqty1() { return xdfgetReceivedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Receivedqty1_Asc() { regOBA("RECEIVEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Receivedqty1_Desc() { regOBD("RECEIVEDQTY1"); return this; }

    protected ConditionValue _receivedqty2;
    public ConditionValue xdfgetReceivedqty2()
    { if (_receivedqty2 == null) { _receivedqty2 = nCV(); }
      return _receivedqty2; }
    protected ConditionValue xgetCValueReceivedqty2() { return xdfgetReceivedqty2(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Receivedqty2_Asc() { regOBA("RECEIVEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Receivedqty2_Desc() { regOBD("RECEIVEDQTY2"); return this; }

    protected ConditionValue _receivedqty3;
    public ConditionValue xdfgetReceivedqty3()
    { if (_receivedqty3 == null) { _receivedqty3 = nCV(); }
      return _receivedqty3; }
    protected ConditionValue xgetCValueReceivedqty3() { return xdfgetReceivedqty3(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Receivedqty3_Asc() { regOBA("RECEIVEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Receivedqty3_Desc() { regOBD("RECEIVEDQTY3"); return this; }

    protected ConditionValue _adjustqty1;
    public ConditionValue xdfgetAdjustqty1()
    { if (_adjustqty1 == null) { _adjustqty1 = nCV(); }
      return _adjustqty1; }
    protected ConditionValue xgetCValueAdjustqty1() { return xdfgetAdjustqty1(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Adjustqty1_Asc() { regOBA("ADJUSTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Adjustqty1_Desc() { regOBD("ADJUSTQTY1"); return this; }

    protected ConditionValue _adjustqty2;
    public ConditionValue xdfgetAdjustqty2()
    { if (_adjustqty2 == null) { _adjustqty2 = nCV(); }
      return _adjustqty2; }
    protected ConditionValue xgetCValueAdjustqty2() { return xdfgetAdjustqty2(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Adjustqty2_Asc() { regOBA("ADJUSTQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Adjustqty2_Desc() { regOBD("ADJUSTQTY2"); return this; }

    protected ConditionValue _adjustqty3;
    public ConditionValue xdfgetAdjustqty3()
    { if (_adjustqty3 == null) { _adjustqty3 = nCV(); }
      return _adjustqty3; }
    protected ConditionValue xgetCValueAdjustqty3() { return xdfgetAdjustqty3(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Adjustqty3_Asc() { regOBA("ADJUSTQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Adjustqty3_Desc() { regOBD("ADJUSTQTY3"); return this; }

    protected ConditionValue _rcvtagqty1;
    public ConditionValue xdfgetRcvtagqty1()
    { if (_rcvtagqty1 == null) { _rcvtagqty1 = nCV(); }
      return _rcvtagqty1; }
    protected ConditionValue xgetCValueRcvtagqty1() { return xdfgetRcvtagqty1(); }

    /**
     * Add order-by as ascend. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Rcvtagqty1_Asc() { regOBA("RCVTAGQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Rcvtagqty1_Desc() { regOBD("RCVTAGQTY1"); return this; }

    protected ConditionValue _xdocfreeqty1;
    public ConditionValue xdfgetXdocfreeqty1()
    { if (_xdocfreeqty1 == null) { _xdocfreeqty1 = nCV(); }
      return _xdocfreeqty1; }
    protected ConditionValue xgetCValueXdocfreeqty1() { return xdfgetXdocfreeqty1(); }

    /**
     * Add order-by as ascend. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Xdocfreeqty1_Asc() { regOBA("XDOCFREEQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Xdocfreeqty1_Desc() { regOBD("XDOCFREEQTY1"); return this; }

    protected ConditionValue _inspectedqty1;
    public ConditionValue xdfgetInspectedqty1()
    { if (_inspectedqty1 == null) { _inspectedqty1 = nCV(); }
      return _inspectedqty1; }
    protected ConditionValue xgetCValueInspectedqty1() { return xdfgetInspectedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Inspectedqty1_Asc() { regOBA("INSPECTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Inspectedqty1_Desc() { regOBD("INSPECTEDQTY1"); return this; }

    protected ConditionValue _inspectedqty2;
    public ConditionValue xdfgetInspectedqty2()
    { if (_inspectedqty2 == null) { _inspectedqty2 = nCV(); }
      return _inspectedqty2; }
    protected ConditionValue xgetCValueInspectedqty2() { return xdfgetInspectedqty2(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Inspectedqty2_Asc() { regOBA("INSPECTEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Inspectedqty2_Desc() { regOBD("INSPECTEDQTY2"); return this; }

    protected ConditionValue _inspectedqty3;
    public ConditionValue xdfgetInspectedqty3()
    { if (_inspectedqty3 == null) { _inspectedqty3 = nCV(); }
      return _inspectedqty3; }
    protected ConditionValue xgetCValueInspectedqty3() { return xdfgetInspectedqty3(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Inspectedqty3_Asc() { regOBA("INSPECTEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Inspectedqty3_Desc() { regOBD("INSPECTEDQTY3"); return this; }

    protected ConditionValue _priceBuy;
    public ConditionValue xdfgetPriceBuy()
    { if (_priceBuy == null) { _priceBuy = nCV(); }
      return _priceBuy; }
    protected ConditionValue xgetCValuePriceBuy() { return xdfgetPriceBuy(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_PriceBuy_Asc() { regOBA("PRICE_BUY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_PriceBuy_Desc() { regOBD("PRICE_BUY"); return this; }

    protected ConditionValue _priceWholesale;
    public ConditionValue xdfgetPriceWholesale()
    { if (_priceWholesale == null) { _priceWholesale = nCV(); }
      return _priceWholesale; }
    protected ConditionValue xgetCValuePriceWholesale() { return xdfgetPriceWholesale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_PriceWholesale_Asc() { regOBA("PRICE_WHOLESALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_PriceWholesale_Desc() { regOBD("PRICE_WHOLESALE"); return this; }

    protected ConditionValue _priceSale;
    public ConditionValue xdfgetPriceSale()
    { if (_priceSale == null) { _priceSale = nCV(); }
      return _priceSale; }
    protected ConditionValue xgetCValuePriceSale() { return xdfgetPriceSale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_PriceSale_Asc() { regOBA("PRICE_SALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_PriceSale_Desc() { regOBD("PRICE_SALE"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _icdate;
    public ConditionValue xdfgetIcdate()
    { if (_icdate == null) { _icdate = nCV(); }
      return _icdate; }
    protected ConditionValue xgetCValueIcdate() { return xdfgetIcdate(); }

    /**
     * Add order-by as ascend. <br>
     * ICDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Icdate_Asc() { regOBA("ICDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ICDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Icdate_Desc() { regOBD("ICDATE"); return this; }

    protected ConditionValue _orderkey;
    public ConditionValue xdfgetOrderkey()
    { if (_orderkey == null) { _orderkey = nCV(); }
      return _orderkey; }
    protected ConditionValue xgetCValueOrderkey() { return xdfgetOrderkey(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERKEY: {IX+, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Orderkey_Asc() { regOBA("ORDERKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERKEY: {IX+, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Orderkey_Desc() { regOBD("ORDERKEY"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Orderlineno_Asc() { regOBA("ORDERLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Orderlineno_Desc() { regOBD("ORDERLINENO"); return this; }

    protected ConditionValue _ownerorderno;
    public ConditionValue xdfgetOwnerorderno()
    { if (_ownerorderno == null) { _ownerorderno = nCV(); }
      return _ownerorderno; }
    protected ConditionValue xgetCValueOwnerorderno() { return xdfgetOwnerorderno(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownerorderno_Asc() { regOBA("OWNERORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownerorderno_Desc() { regOBD("OWNERORDERNO"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Ownerorderlineno_Asc() { regOBA("OWNERORDERLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ownerorderlineno_Desc() { regOBD("OWNERORDERLINENO"); return this; }

    protected ConditionValue _custorderno;
    public ConditionValue xdfgetCustorderno()
    { if (_custorderno == null) { _custorderno = nCV(); }
      return _custorderno; }
    protected ConditionValue xgetCValueCustorderno() { return xdfgetCustorderno(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Custorderno_Asc() { regOBA("CUSTORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Custorderno_Desc() { regOBD("CUSTORDERNO"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_Custorderlineno_Asc() { regOBA("CUSTORDERLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Custorderlineno_Desc() { regOBD("CUSTORDERLINENO"); return this; }

    protected ConditionValue _ordertype;
    public ConditionValue xdfgetOrdertype()
    { if (_ordertype == null) { _ordertype = nCV(); }
      return _ordertype; }
    protected ConditionValue xgetCValueOrdertype() { return xdfgetOrdertype(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ordertype_Asc() { regOBA("ORDERTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Ordertype_Desc() { regOBD("ORDERTYPE"); return this; }

    protected ConditionValue _rcvqtyerrorflg;
    public ConditionValue xdfgetRcvqtyerrorflg()
    { if (_rcvqtyerrorflg == null) { _rcvqtyerrorflg = nCV(); }
      return _rcvqtyerrorflg; }
    protected ConditionValue xgetCValueRcvqtyerrorflg() { return xdfgetRcvqtyerrorflg(); }

    /**
     * Add order-by as ascend. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Rcvqtyerrorflg_Asc() { regOBA("RCVQTYERRORFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Rcvqtyerrorflg_Desc() { regOBD("RCVQTYERRORFLG"); return this; }

    protected ConditionValue _logicflg1;
    public ConditionValue xdfgetLogicflg1()
    { if (_logicflg1 == null) { _logicflg1 = nCV(); }
      return _logicflg1; }
    protected ConditionValue xgetCValueLogicflg1() { return xdfgetLogicflg1(); }

    /**
     * Add order-by as ascend. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Logicflg1_Asc() { regOBA("LOGICFLG1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Logicflg1_Desc() { regOBD("LOGICFLG1"); return this; }

    protected ConditionValue _logicflg2;
    public ConditionValue xdfgetLogicflg2()
    { if (_logicflg2 == null) { _logicflg2 = nCV(); }
      return _logicflg2; }
    protected ConditionValue xgetCValueLogicflg2() { return xdfgetLogicflg2(); }

    /**
     * Add order-by as ascend. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Logicflg2_Asc() { regOBA("LOGICFLG2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Logicflg2_Desc() { regOBD("LOGICFLG2"); return this; }

    protected ConditionValue _logicflg3;
    public ConditionValue xdfgetLogicflg3()
    { if (_logicflg3 == null) { _logicflg3 = nCV(); }
      return _logicflg3; }
    protected ConditionValue xgetCValueLogicflg3() { return xdfgetLogicflg3(); }

    /**
     * Add order-by as ascend. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Logicflg3_Asc() { regOBA("LOGICFLG3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Logicflg3_Desc() { regOBD("LOGICFLG3"); return this; }

    protected ConditionValue _movelineno;
    public ConditionValue xdfgetMovelineno()
    { if (_movelineno == null) { _movelineno = nCV(); }
      return _movelineno; }
    protected ConditionValue xgetCValueMovelineno() { return xdfgetMovelineno(); }

    /**
     * Add order-by as ascend. <br>
     * MOVELINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Movelineno_Asc() { regOBA("MOVELINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVELINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Movelineno_Desc() { regOBD("MOVELINENO"); return this; }

    protected ConditionValue _assylineno;
    public ConditionValue xdfgetAssylineno()
    { if (_assylineno == null) { _assylineno = nCV(); }
      return _assylineno; }
    protected ConditionValue xgetCValueAssylineno() { return xdfgetAssylineno(); }

    /**
     * Add order-by as ascend. <br>
     * ASSYLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Assylineno_Asc() { regOBA("ASSYLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSYLINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Assylineno_Desc() { regOBD("ASSYLINENO"); return this; }

    protected ConditionValue _producelineno;
    public ConditionValue xdfgetProducelineno()
    { if (_producelineno == null) { _producelineno = nCV(); }
      return _producelineno; }
    protected ConditionValue xgetCValueProducelineno() { return xdfgetProducelineno(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCELINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Producelineno_Asc() { regOBA("PRODUCELINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCELINENO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Producelineno_Desc() { regOBD("PRODUCELINENO"); return this; }

    protected ConditionValue _checklastlotflg;
    public ConditionValue xdfgetChecklastlotflg()
    { if (_checklastlotflg == null) { _checklastlotflg = nCV(); }
      return _checklastlotflg; }
    protected ConditionValue xgetCValueChecklastlotflg() { return xdfgetChecklastlotflg(); }

    /**
     * Add order-by as ascend. <br>
     * CHECKLASTLOTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Checklastlotflg_Asc() { regOBA("CHECKLASTLOTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHECKLASTLOTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_Checklastlotflg_Desc() { regOBD("CHECKLASTLOTFLG"); return this; }

    protected ConditionValue _trpalletId;
    public ConditionValue xdfgetTrpalletId()
    { if (_trpalletId == null) { _trpalletId = nCV(); }
      return _trpalletId; }
    protected ConditionValue xgetCValueTrpalletId() { return xdfgetTrpalletId(); }

    /**
     * Add order-by as ascend. <br>
     * TRPALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_TrpalletId_Asc() { regOBA("TRPALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_TrpalletId_Desc() { regOBD("TRPALLET_ID"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrrcvdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrrcvdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrrcvdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrrcvdetailCQ bq = (TTrrcvdetailCQ)bqs;
        TTrrcvdetailCQ uq = (TTrrcvdetailCQ)uqs;
        if (bq.hasConditionQueryTReceivePlanB()) {
            uq.queryTReceivePlanB().reflectRelationOnUnionQuery(bq.queryTReceivePlanB(), uq.queryTReceivePlanB());
        }
        if (bq.hasConditionQueryTTrrcv()) {
            uq.queryTTrrcv().reflectRelationOnUnionQuery(bq.queryTTrrcv(), uq.queryTTrrcv());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_RECEIVE_PLAN_B by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanBCQ queryTReceivePlanB() {
        return xdfgetConditionQueryTReceivePlanB();
    }
    public TReceivePlanBCQ xdfgetConditionQueryTReceivePlanB() {
        String prop = "tReceivePlanB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanB()); xsetupOuterJoinTReceivePlanB(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanBCQ xcreateQueryTReceivePlanB() {
        String nrp = xresolveNRP("T_TRRCVDETAIL", "tReceivePlanB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanB", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanB() { xregOutJo("tReceivePlanB"); }
    public boolean hasConditionQueryTReceivePlanB() { return xhasQueRlMap("tReceivePlanB"); }

    /**
     * Get the condition-query for relation table. <br>
     * T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'.
     * @return The instance of condition-query. (NotNull)
     */
    public TTrrcvCQ queryTTrrcv() {
        return xdfgetConditionQueryTTrrcv();
    }
    public TTrrcvCQ xdfgetConditionQueryTTrrcv() {
        String prop = "tTrrcv";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTTrrcv()); xsetupOuterJoinTTrrcv(); }
        return xgetQueRlMap(prop);
    }
    protected TTrrcvCQ xcreateQueryTTrrcv() {
        String nrp = xresolveNRP("T_TRRCVDETAIL", "tTrrcv"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TTrrcvCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tTrrcv", nrp);
    }
    protected void xsetupOuterJoinTTrrcv() { xregOutJo("tTrrcv"); }
    public boolean hasConditionQueryTTrrcv() { return xhasQueRlMap("tTrrcv"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrrcvdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrrcvdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrrcvdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrrcvdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrrcvdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrrcvdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrrcvdetailCQ> _myselfExistsMap;
    public Map<String, TTrrcvdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrrcvdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrrcvdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrrcvdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrrcvdetailCB.class.getName(); }
    protected String xCQ() { return TTrrcvdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
