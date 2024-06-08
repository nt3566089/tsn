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
 * The base condition-query of T_TRRCVPLAN.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrrcvplanCQ extends AbstractBsTTrrcvplanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrrcvplanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvplanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRRCVPLAN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrrcvplanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrrcvplanCIQ xcreateCIQ() {
        TTrrcvplanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrrcvplanCIQ xnewCIQ() {
        return new TTrrcvplanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRRCVPLAN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrrcvplanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrrcvplanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trrcvplanId;
    public ConditionValue xdfgetTrrcvplanId()
    { if (_trrcvplanId == null) { _trrcvplanId = nCV(); }
      return _trrcvplanId; }
    protected ConditionValue xgetCValueTrrcvplanId() { return xdfgetTrrcvplanId(); }

    /**
     * Add order-by as ascend. <br>
     * TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_TrrcvplanId_Asc() { regOBA("TRRCVPLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_TrrcvplanId_Desc() { regOBD("TRRCVPLAN_ID"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_Rcvlineno_Asc() { regOBA("RCVLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Rcvlineno_Desc() { regOBD("RCVLINENO"); return this; }

    protected ConditionValue _rcvplansts;
    public ConditionValue xdfgetRcvplansts()
    { if (_rcvplansts == null) { _rcvplansts = nCV(); }
      return _rcvplansts; }
    protected ConditionValue xgetCValueRcvplansts() { return xdfgetRcvplansts(); }

    /**
     * Add order-by as ascend. <br>
     * RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Rcvplansts_Asc() { regOBA("RCVPLANSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Rcvplansts_Desc() { regOBD("RCVPLANSTS"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _toloccd;
    public ConditionValue xdfgetToloccd()
    { if (_toloccd == null) { _toloccd = nCV(); }
      return _toloccd; }
    protected ConditionValue xgetCValueToloccd() { return xdfgetToloccd(); }

    /**
     * Add order-by as ascend. <br>
     * TOLOCCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Toloccd_Asc() { regOBA("TOLOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOLOCCD: {IX+, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Toloccd_Desc() { regOBD("TOLOCCD"); return this; }

    protected ConditionValue _trrcvqty1;
    public ConditionValue xdfgetTrrcvqty1()
    { if (_trrcvqty1 == null) { _trrcvqty1 = nCV(); }
      return _trrcvqty1; }
    protected ConditionValue xgetCValueTrrcvqty1() { return xdfgetTrrcvqty1(); }

    /**
     * Add order-by as ascend. <br>
     * TRRCVQTY1: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Trrcvqty1_Asc() { regOBA("TRRCVQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRRCVQTY1: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Trrcvqty1_Desc() { regOBD("TRRCVQTY1"); return this; }

    protected ConditionValue _rcvinno;
    public ConditionValue xdfgetRcvinno()
    { if (_rcvinno == null) { _rcvinno = nCV(); }
      return _rcvinno; }
    protected ConditionValue xgetCValueRcvinno() { return xdfgetRcvinno(); }

    /**
     * Add order-by as ascend. <br>
     * RCVINNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Rcvinno_Asc() { regOBA("RCVINNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVINNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Rcvinno_Desc() { regOBD("RCVINNO"); return this; }

    protected ConditionValue _printedflg;
    public ConditionValue xdfgetPrintedflg()
    { if (_printedflg == null) { _printedflg = nCV(); }
      return _printedflg; }
    protected ConditionValue xgetCValuePrintedflg() { return xdfgetPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Printedflg_Asc() { regOBA("PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Printedflg_Desc() { regOBD("PRINTEDFLG"); return this; }

    protected ConditionValue _loadqty1;
    public ConditionValue xdfgetLoadqty1()
    { if (_loadqty1 == null) { _loadqty1 = nCV(); }
      return _loadqty1; }
    protected ConditionValue xgetCValueLoadqty1() { return xdfgetLoadqty1(); }

    /**
     * Add order-by as ascend. <br>
     * LOADQTY1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Loadqty1_Asc() { regOBA("LOADQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOADQTY1: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Loadqty1_Desc() { regOBD("LOADQTY1"); return this; }

    protected ConditionValue _receivedqty1;
    public ConditionValue xdfgetReceivedqty1()
    { if (_receivedqty1 == null) { _receivedqty1 = nCV(); }
      return _receivedqty1; }
    protected ConditionValue xgetCValueReceivedqty1() { return xdfgetReceivedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDQTY1: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Receivedqty1_Asc() { regOBA("RECEIVEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDQTY1: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_Receivedqty1_Desc() { regOBD("RECEIVEDQTY1"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrrcvplanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrrcvplanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrrcvplanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrrcvplanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrrcvplanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrrcvplanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrrcvplanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrrcvplanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrrcvplanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrrcvplanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrrcvplanCQ> _myselfExistsMap;
    public Map<String, TTrrcvplanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrrcvplanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrrcvplanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrrcvplanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrrcvplanCB.class.getName(); }
    protected String xCQ() { return TTrrcvplanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
