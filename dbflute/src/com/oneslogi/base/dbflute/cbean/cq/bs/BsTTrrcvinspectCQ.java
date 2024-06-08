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
 * The base condition-query of T_TRRCVINSPECT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrrcvinspectCQ extends AbstractBsTTrrcvinspectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrrcvinspectCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvinspectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRRCVINSPECT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrrcvinspectCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrrcvinspectCIQ xcreateCIQ() {
        TTrrcvinspectCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrrcvinspectCIQ xnewCIQ() {
        return new TTrrcvinspectCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRRCVINSPECT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrrcvinspectCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrrcvinspectCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trrcvinspectId;
    public ConditionValue xdfgetTrrcvinspectId()
    { if (_trrcvinspectId == null) { _trrcvinspectId = nCV(); }
      return _trrcvinspectId; }
    protected ConditionValue xgetCValueTrrcvinspectId() { return xdfgetTrrcvinspectId(); }

    /**
     * Add order-by as ascend. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_TrrcvinspectId_Asc() { regOBA("TRRCVINSPECT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_TrrcvinspectId_Desc() { regOBD("TRRCVINSPECT_ID"); return this; }

    protected ConditionValue _acceptkey;
    public ConditionValue xdfgetAcceptkey()
    { if (_acceptkey == null) { _acceptkey = nCV(); }
      return _acceptkey; }
    protected ConditionValue xgetCValueAcceptkey() { return xdfgetAcceptkey(); }

    /**
     * Add order-by as ascend. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Acceptkey_Asc() { regOBA("ACCEPTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Acceptkey_Desc() { regOBD("ACCEPTKEY"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _inspectusercd;
    public ConditionValue xdfgetInspectusercd()
    { if (_inspectusercd == null) { _inspectusercd = nCV(); }
      return _inspectusercd; }
    protected ConditionValue xgetCValueInspectusercd() { return xdfgetInspectusercd(); }

    /**
     * Add order-by as ascend. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Inspectusercd_Asc() { regOBA("INSPECTUSERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Inspectusercd_Desc() { regOBD("INSPECTUSERCD"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Inspectedqty1_Asc() { regOBA("INSPECTEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Inspectedqty1_Desc() { regOBD("INSPECTEDQTY1"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Inspectedqty2_Asc() { regOBA("INSPECTEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Inspectedqty2_Desc() { regOBD("INSPECTEDQTY2"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Inspectedqty3_Asc() { regOBA("INSPECTEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Inspectedqty3_Desc() { regOBD("INSPECTEDQTY3"); return this; }

    protected ConditionValue _instructqty1;
    public ConditionValue xdfgetInstructqty1()
    { if (_instructqty1 == null) { _instructqty1 = nCV(); }
      return _instructqty1; }
    protected ConditionValue xgetCValueInstructqty1() { return xdfgetInstructqty1(); }

    /**
     * Add order-by as ascend. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Instructqty1_Asc() { regOBA("INSTRUCTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Instructqty1_Desc() { regOBD("INSTRUCTQTY1"); return this; }

    protected ConditionValue _instructqty2;
    public ConditionValue xdfgetInstructqty2()
    { if (_instructqty2 == null) { _instructqty2 = nCV(); }
      return _instructqty2; }
    protected ConditionValue xgetCValueInstructqty2() { return xdfgetInstructqty2(); }

    /**
     * Add order-by as ascend. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Instructqty2_Asc() { regOBA("INSTRUCTQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Instructqty2_Desc() { regOBD("INSTRUCTQTY2"); return this; }

    protected ConditionValue _instructqty3;
    public ConditionValue xdfgetInstructqty3()
    { if (_instructqty3 == null) { _instructqty3 = nCV(); }
      return _instructqty3; }
    protected ConditionValue xgetCValueInstructqty3() { return xdfgetInstructqty3(); }

    /**
     * Add order-by as ascend. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Instructqty3_Asc() { regOBA("INSTRUCTQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Instructqty3_Desc() { regOBD("INSTRUCTQTY3"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _ownercd;
    public ConditionValue xdfgetOwnercd()
    { if (_ownercd == null) { _ownercd = nCV(); }
      return _ownercd; }
    protected ConditionValue xgetCValueOwnercd() { return xdfgetOwnercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Ownercd_Asc() { regOBA("OWNERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Ownercd_Desc() { regOBD("OWNERCD"); return this; }

    protected ConditionValue _itemadmin;
    public ConditionValue xdfgetItemadmin()
    { if (_itemadmin == null) { _itemadmin = nCV(); }
      return _itemadmin; }
    protected ConditionValue xgetCValueItemadmin() { return xdfgetItemadmin(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Itemadmin_Asc() { regOBA("ITEMADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Itemadmin_Desc() { regOBD("ITEMADMIN"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Ifitemcd_Asc() { regOBA("IFITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Ifitemcd_Desc() { regOBD("IFITEMCD"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Lot5_Asc() { regOBA("LOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lot5_Desc() { regOBD("LOT5"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Otherlot2_Asc() { regOBA("OTHERLOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Otherlot2_Desc() { regOBD("OTHERLOT2"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Otherlot3_Asc() { regOBA("OTHERLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Otherlot3_Desc() { regOBD("OTHERLOT3"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Otherlot4_Asc() { regOBA("OTHERLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Otherlot4_Desc() { regOBD("OTHERLOT4"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Otherlot5_Asc() { regOBA("OTHERLOT5"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Otherlot5_Desc() { regOBD("OTHERLOT5"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Damageflg_Asc() { regOBA("DAMAGEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Damageflg_Desc() { regOBD("DAMAGEFLG"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Foreigncargoflg_Asc() { regOBA("FOREIGNCARGOFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Foreigncargoflg_Desc() { regOBD("FOREIGNCARGOFLG"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Customsreleaseflg_Asc() { regOBA("CUSTOMSRELEASEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Customsreleaseflg_Desc() { regOBD("CUSTOMSRELEASEFLG"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Taxflg_Asc() { regOBA("TAXFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Taxflg_Desc() { regOBD("TAXFLG"); return this; }

    protected ConditionValue _lotkey;
    public ConditionValue xdfgetLotkey()
    { if (_lotkey == null) { _lotkey = nCV(); }
      return _lotkey; }
    protected ConditionValue xgetCValueLotkey() { return xdfgetLotkey(); }

    /**
     * Add order-by as ascend. <br>
     * LOTKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lotkey_Asc() { regOBA("LOTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Lotkey_Desc() { regOBD("LOTKEY"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrrcvinspectCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvinspectCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrrcvinspectCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrrcvinspectCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrrcvinspectCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrrcvinspectCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrrcvinspectCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrrcvinspectCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrrcvinspectCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrrcvinspectCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrrcvinspectCQ> _myselfExistsMap;
    public Map<String, TTrrcvinspectCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrrcvinspectCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrrcvinspectCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrrcvinspectCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrrcvinspectCB.class.getName(); }
    protected String xCQ() { return TTrrcvinspectCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
