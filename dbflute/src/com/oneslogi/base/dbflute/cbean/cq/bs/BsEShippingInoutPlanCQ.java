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
 * The base condition-query of E_SHIPPING_INOUT_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShippingInoutPlanCQ extends AbstractBsEShippingInoutPlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShippingInoutPlanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShippingInoutPlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SHIPPING_INOUT_PLAN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EShippingInoutPlanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EShippingInoutPlanCIQ xcreateCIQ() {
        EShippingInoutPlanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EShippingInoutPlanCIQ xnewCIQ() {
        return new EShippingInoutPlanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SHIPPING_INOUT_PLAN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EShippingInoutPlanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EShippingInoutPlanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInoutPlanId;
    public ConditionValue xdfgetShippingInoutPlanId()
    { if (_shippingInoutPlanId == null) { _shippingInoutPlanId = nCV(); }
      return _shippingInoutPlanId; }
    protected ConditionValue xgetCValueShippingInoutPlanId() { return xdfgetShippingInoutPlanId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_ShippingInoutPlanId_Asc() { regOBA("SHIPPING_INOUT_PLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_ShippingInoutPlanId_Desc() { regOBD("SHIPPING_INOUT_PLAN_ID"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendLowCd;
    public ConditionValue xdfgetSendLowCd()
    { if (_sendLowCd == null) { _sendLowCd = nCV(); }
      return _sendLowCd; }
    protected ConditionValue xgetCValueSendLowCd() { return xdfgetSendLowCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_SendLowCd_Asc() { regOBA("SEND_LOW_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_SendLowCd_Desc() { regOBD("SEND_LOW_CD"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _sbwarehousecd;
    public ConditionValue xdfgetSbwarehousecd()
    { if (_sbwarehousecd == null) { _sbwarehousecd = nCV(); }
      return _sbwarehousecd; }
    protected ConditionValue xgetCValueSbwarehousecd() { return xdfgetSbwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Sbwarehousecd_Asc() { regOBA("SBWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Sbwarehousecd_Desc() { regOBD("SBWAREHOUSECD"); return this; }

    protected ConditionValue _supplierrcvno;
    public ConditionValue xdfgetSupplierrcvno()
    { if (_supplierrcvno == null) { _supplierrcvno = nCV(); }
      return _supplierrcvno; }
    protected ConditionValue xgetCValueSupplierrcvno() { return xdfgetSupplierrcvno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _examkbn;
    public ConditionValue xdfgetExamkbn()
    { if (_examkbn == null) { _examkbn = nCV(); }
      return _examkbn; }
    protected ConditionValue xgetCValueExamkbn() { return xdfgetExamkbn(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMKBN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Examkbn_Asc() { regOBA("EXAMKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMKBN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Examkbn_Desc() { regOBD("EXAMKBN"); return this; }

    protected ConditionValue _examdate;
    public ConditionValue xdfgetExamdate()
    { if (_examdate == null) { _examdate = nCV(); }
      return _examdate; }
    protected ConditionValue xgetCValueExamdate() { return xdfgetExamdate(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Examdate_Asc() { regOBA("EXAMDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Examdate_Desc() { regOBD("EXAMDATE"); return this; }

    protected ConditionValue _examend;
    public ConditionValue xdfgetExamend()
    { if (_examend == null) { _examend = nCV(); }
      return _examend; }
    protected ConditionValue xgetCValueExamend() { return xdfgetExamend(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMEND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Examend_Asc() { regOBA("EXAMEND"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMEND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Examend_Desc() { regOBD("EXAMEND"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _befzaikoinv;
    public ConditionValue xdfgetBefzaikoinv()
    { if (_befzaikoinv == null) { _befzaikoinv = nCV(); }
      return _befzaikoinv; }
    protected ConditionValue xgetCValueBefzaikoinv() { return xdfgetBefzaikoinv(); }

    /**
     * Add order-by as ascend. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Befzaikoinv_Asc() { regOBA("BEFZAIKOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Befzaikoinv_Desc() { regOBD("BEFZAIKOINV"); return this; }

    protected ConditionValue _beflot4;
    public ConditionValue xdfgetBeflot4()
    { if (_beflot4 == null) { _beflot4 = nCV(); }
      return _beflot4; }
    protected ConditionValue xgetCValueBeflot4() { return xdfgetBeflot4(); }

    /**
     * Add order-by as ascend. <br>
     * BEFLOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Beflot4_Asc() { regOBA("BEFLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEFLOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Beflot4_Desc() { regOBD("BEFLOT4"); return this; }

    protected ConditionValue _beflot3;
    public ConditionValue xdfgetBeflot3()
    { if (_beflot3 == null) { _beflot3 = nCV(); }
      return _beflot3; }
    protected ConditionValue xgetCValueBeflot3() { return xdfgetBeflot3(); }

    /**
     * Add order-by as ascend. <br>
     * BEFLOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Beflot3_Asc() { regOBA("BEFLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEFLOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Beflot3_Desc() { regOBD("BEFLOT3"); return this; }

    protected ConditionValue _aftzaikoinv;
    public ConditionValue xdfgetAftzaikoinv()
    { if (_aftzaikoinv == null) { _aftzaikoinv = nCV(); }
      return _aftzaikoinv; }
    protected ConditionValue xgetCValueAftzaikoinv() { return xdfgetAftzaikoinv(); }

    /**
     * Add order-by as ascend. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Aftzaikoinv_Asc() { regOBA("AFTZAIKOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Aftzaikoinv_Desc() { regOBD("AFTZAIKOINV"); return this; }

    protected ConditionValue _aftlot4;
    public ConditionValue xdfgetAftlot4()
    { if (_aftlot4 == null) { _aftlot4 = nCV(); }
      return _aftlot4; }
    protected ConditionValue xgetCValueAftlot4() { return xdfgetAftlot4(); }

    /**
     * Add order-by as ascend. <br>
     * AFTLOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Aftlot4_Asc() { regOBA("AFTLOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTLOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Aftlot4_Desc() { regOBD("AFTLOT4"); return this; }

    protected ConditionValue _aftlot3;
    public ConditionValue xdfgetAftlot3()
    { if (_aftlot3 == null) { _aftlot3 = nCV(); }
      return _aftlot3; }
    protected ConditionValue xgetCValueAftlot3() { return xdfgetAftlot3(); }

    /**
     * Add order-by as ascend. <br>
     * AFTLOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Aftlot3_Asc() { regOBA("AFTLOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTLOT3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Aftlot3_Desc() { regOBD("AFTLOT3"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEShippingInoutPlanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingInoutPlanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEShippingInoutPlanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEShippingInoutPlanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EShippingInoutPlanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EShippingInoutPlanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EShippingInoutPlanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EShippingInoutPlanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EShippingInoutPlanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EShippingInoutPlanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EShippingInoutPlanCQ> _myselfExistsMap;
    public Map<String, EShippingInoutPlanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EShippingInoutPlanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EShippingInoutPlanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EShippingInoutPlanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EShippingInoutPlanCB.class.getName(); }
    protected String xCQ() { return EShippingInoutPlanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
