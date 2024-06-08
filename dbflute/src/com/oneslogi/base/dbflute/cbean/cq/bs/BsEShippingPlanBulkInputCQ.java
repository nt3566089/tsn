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
 * The base condition-query of E_SHIPPING_PLAN_BULK_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShippingPlanBulkInputCQ extends AbstractBsEShippingPlanBulkInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShippingPlanBulkInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShippingPlanBulkInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SHIPPING_PLAN_BULK_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EShippingPlanBulkInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EShippingPlanBulkInputCIQ xcreateCIQ() {
        EShippingPlanBulkInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EShippingPlanBulkInputCIQ xnewCIQ() {
        return new EShippingPlanBulkInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SHIPPING_PLAN_BULK_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EShippingPlanBulkInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EShippingPlanBulkInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bondedShippingPlanBulkInputId;
    public ConditionValue xdfgetBondedShippingPlanBulkInputId()
    { if (_bondedShippingPlanBulkInputId == null) { _bondedShippingPlanBulkInputId = nCV(); }
      return _bondedShippingPlanBulkInputId; }
    protected ConditionValue xgetCValueBondedShippingPlanBulkInputId() { return xdfgetBondedShippingPlanBulkInputId(); }

    /**
     * Add order-by as ascend. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_BondedShippingPlanBulkInputId_Asc() { regOBA("BONDED_SHIPPING_PLAN_BULK_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_BondedShippingPlanBulkInputId_Desc() { regOBD("BONDED_SHIPPING_PLAN_BULK_INPUT_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _hedderFlg;
    public ConditionValue xdfgetHedderFlg()
    { if (_hedderFlg == null) { _hedderFlg = nCV(); }
      return _hedderFlg; }
    protected ConditionValue xgetCValueHedderFlg() { return xdfgetHedderFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_HedderFlg_Asc() { regOBA("HEDDER_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_HedderFlg_Desc() { regOBD("HEDDER_FLG"); return this; }

    protected ConditionValue _zzorgncd;
    public ConditionValue xdfgetZzorgncd()
    { if (_zzorgncd == null) { _zzorgncd = nCV(); }
      return _zzorgncd; }
    protected ConditionValue xgetCValueZzorgncd() { return xdfgetZzorgncd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _ordgr;
    public ConditionValue xdfgetOrdgr()
    { if (_ordgr == null) { _ordgr = nCV(); }
      return _ordgr; }
    protected ConditionValue xgetCValueOrdgr() { return xdfgetOrdgr(); }

    /**
     * Add order-by as ascend. <br>
     * ORDGR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Ordgr_Asc() { regOBA("ORDGR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDGR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Ordgr_Desc() { regOBD("ORDGR"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

    protected ConditionValue _sscd;
    public ConditionValue xdfgetSscd()
    { if (_sscd == null) { _sscd = nCV(); }
      return _sscd; }
    protected ConditionValue xgetCValueSscd() { return xdfgetSscd(); }

    /**
     * Add order-by as ascend. <br>
     * SSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Sscd_Asc() { regOBA("SSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Sscd_Desc() { regOBD("SSCD"); return this; }

    protected ConditionValue _slptyp;
    public ConditionValue xdfgetSlptyp()
    { if (_slptyp == null) { _slptyp = nCV(); }
      return _slptyp; }
    protected ConditionValue xgetCValueSlptyp() { return xdfgetSlptyp(); }

    /**
     * Add order-by as ascend. <br>
     * SLPTYP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slptyp_Asc() { regOBA("SLPTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPTYP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slptyp_Desc() { regOBD("SLPTYP"); return this; }

    protected ConditionValue _slpno;
    public ConditionValue xdfgetSlpno()
    { if (_slpno == null) { _slpno = nCV(); }
      return _slpno; }
    protected ConditionValue xgetCValueSlpno() { return xdfgetSlpno(); }

    /**
     * Add order-by as ascend. <br>
     * SLPNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slpno_Asc() { regOBA("SLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slpno_Desc() { regOBD("SLPNO"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _zzordymd;
    public ConditionValue xdfgetZzordymd()
    { if (_zzordymd == null) { _zzordymd = nCV(); }
      return _zzordymd; }
    protected ConditionValue xgetCValueZzordymd() { return xdfgetZzordymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORDYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzordymd_Asc() { regOBA("ZZORDYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORDYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzordymd_Desc() { regOBD("ZZORDYMD"); return this; }

    protected ConditionValue _zzwaymd1;
    public ConditionValue xdfgetZzwaymd1()
    { if (_zzwaymd1 == null) { _zzwaymd1 = nCV(); }
      return _zzwaymd1; }
    protected ConditionValue xgetCValueZzwaymd1() { return xdfgetZzwaymd1(); }

    /**
     * Add order-by as ascend. <br>
     * ZZWAYMD1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzwaymd1_Asc() { regOBA("ZZWAYMD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZWAYMD1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzwaymd1_Desc() { regOBD("ZZWAYMD1"); return this; }

    protected ConditionValue _otorgcd;
    public ConditionValue xdfgetOtorgcd()
    { if (_otorgcd == null) { _otorgcd = nCV(); }
      return _otorgcd; }
    protected ConditionValue xgetCValueOtorgcd() { return xdfgetOtorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * OTORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Otorgcd_Asc() { regOBA("OTORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Otorgcd_Desc() { regOBD("OTORGCD"); return this; }

    protected ConditionValue _ordorgcd;
    public ConditionValue xdfgetOrdorgcd()
    { if (_ordorgcd == null) { _ordorgcd = nCV(); }
      return _ordorgcd; }
    protected ConditionValue xgetCValueOrdorgcd() { return xdfgetOrdorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Ordorgcd_Asc() { regOBA("ORDORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDORGCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Ordorgcd_Desc() { regOBD("ORDORGCD"); return this; }

    protected ConditionValue _rlybscd;
    public ConditionValue xdfgetRlybscd()
    { if (_rlybscd == null) { _rlybscd = nCV(); }
      return _rlybscd; }
    protected ConditionValue xgetCValueRlybscd() { return xdfgetRlybscd(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Rlybscd_Asc() { regOBA("RLYBSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Rlybscd_Desc() { regOBD("RLYBSCD"); return this; }

    protected ConditionValue _ded;
    public ConditionValue xdfgetDed()
    { if (_ded == null) { _ded = nCV(); }
      return _ded; }
    protected ConditionValue xgetCValueDed() { return xdfgetDed(); }

    /**
     * Add order-by as ascend. <br>
     * DED: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _pstnid;
    public ConditionValue xdfgetPstnid()
    { if (_pstnid == null) { _pstnid = nCV(); }
      return _pstnid; }
    protected ConditionValue xgetCValuePstnid() { return xdfgetPstnid(); }

    /**
     * Add order-by as ascend. <br>
     * PSTNID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _dlvrnk;
    public ConditionValue xdfgetDlvrnk()
    { if (_dlvrnk == null) { _dlvrnk = nCV(); }
      return _dlvrnk; }
    protected ConditionValue xgetCValueDlvrnk() { return xdfgetDlvrnk(); }

    /**
     * Add order-by as ascend. <br>
     * DLVRNK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Dlvrnk_Asc() { regOBA("DLVRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVRNK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Dlvrnk_Desc() { regOBD("DLVRNK"); return this; }

    protected ConditionValue _lmpdlvno;
    public ConditionValue xdfgetLmpdlvno()
    { if (_lmpdlvno == null) { _lmpdlvno = nCV(); }
      return _lmpdlvno; }
    protected ConditionValue xgetCValueLmpdlvno() { return xdfgetLmpdlvno(); }

    /**
     * Add order-by as ascend. <br>
     * LMPDLVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Lmpdlvno_Asc() { regOBA("LMPDLVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LMPDLVNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Lmpdlvno_Desc() { regOBD("LMPDLVNO"); return this; }

    protected ConditionValue _divmtd;
    public ConditionValue xdfgetDivmtd()
    { if (_divmtd == null) { _divmtd = nCV(); }
      return _divmtd; }
    protected ConditionValue xgetCValueDivmtd() { return xdfgetDivmtd(); }

    /**
     * Add order-by as ascend. <br>
     * DIVMTD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Divmtd_Asc() { regOBA("DIVMTD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIVMTD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Divmtd_Desc() { regOBD("DIVMTD"); return this; }

    protected ConditionValue _hdvid;
    public ConditionValue xdfgetHdvid()
    { if (_hdvid == null) { _hdvid = nCV(); }
      return _hdvid; }
    protected ConditionValue xgetCValueHdvid() { return xdfgetHdvid(); }

    /**
     * Add order-by as ascend. <br>
     * HDVID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Hdvid_Asc() { regOBA("HDVID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDVID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Hdvid_Desc() { regOBD("HDVID"); return this; }

    protected ConditionValue _name1;
    public ConditionValue xdfgetName1()
    { if (_name1 == null) { _name1 = nCV(); }
      return _name1; }
    protected ConditionValue xgetCValueName1() { return xdfgetName1(); }

    /**
     * Add order-by as ascend. <br>
     * NAME1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Name1_Asc() { regOBA("NAME1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Name1_Desc() { regOBD("NAME1"); return this; }

    protected ConditionValue _zregprca;
    public ConditionValue xdfgetZregprca()
    { if (_zregprca == null) { _zregprca = nCV(); }
      return _zregprca; }
    protected ConditionValue xgetCValueZregprca() { return xdfgetZregprca(); }

    /**
     * Add order-by as ascend. <br>
     * ZREGPRCA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zregprca_Asc() { regOBA("ZREGPRCA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZREGPRCA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zregprca_Desc() { regOBD("ZREGPRCA"); return this; }

    protected ConditionValue _zregprcc;
    public ConditionValue xdfgetZregprcc()
    { if (_zregprcc == null) { _zregprcc = nCV(); }
      return _zregprcc; }
    protected ConditionValue xgetCValueZregprcc() { return xdfgetZregprcc(); }

    /**
     * Add order-by as ascend. <br>
     * ZREGPRCC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zregprcc_Asc() { regOBA("ZREGPRCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZREGPRCC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zregprcc_Desc() { regOBD("ZREGPRCC"); return this; }

    protected ConditionValue _zzsaltax;
    public ConditionValue xdfgetZzsaltax()
    { if (_zzsaltax == null) { _zzsaltax = nCV(); }
      return _zzsaltax; }
    protected ConditionValue xgetCValueZzsaltax() { return xdfgetZzsaltax(); }

    /**
     * Add order-by as ascend. <br>
     * ZZSALTAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzsaltax_Asc() { regOBA("ZZSALTAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZSALTAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzsaltax_Desc() { regOBD("ZZSALTAX"); return this; }

    protected ConditionValue _zzgodfpc;
    public ConditionValue xdfgetZzgodfpc()
    { if (_zzgodfpc == null) { _zzgodfpc = nCV(); }
      return _zzgodfpc; }
    protected ConditionValue xgetCValueZzgodfpc() { return xdfgetZzgodfpc(); }

    /**
     * Add order-by as ascend. <br>
     * ZZGODFPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzgodfpc_Asc() { regOBA("ZZGODFPC"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZGODFPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzgodfpc_Desc() { regOBD("ZZGODFPC"); return this; }

    protected ConditionValue _zzgodspc;
    public ConditionValue xdfgetZzgodspc()
    { if (_zzgodspc == null) { _zzgodspc = nCV(); }
      return _zzgodspc; }
    protected ConditionValue xgetCValueZzgodspc() { return xdfgetZzgodspc(); }

    /**
     * Add order-by as ascend. <br>
     * ZZGODSPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzgodspc_Asc() { regOBA("ZZGODSPC"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZGODSPC: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzgodspc_Desc() { regOBD("ZZGODSPC"); return this; }

    protected ConditionValue _zzgodctx;
    public ConditionValue xdfgetZzgodctx()
    { if (_zzgodctx == null) { _zzgodctx = nCV(); }
      return _zzgodctx; }
    protected ConditionValue xgetCValueZzgodctx() { return xdfgetZzgodctx(); }

    /**
     * Add order-by as ascend. <br>
     * ZZGODCTX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzgodctx_Asc() { regOBA("ZZGODCTX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZGODCTX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzgodctx_Desc() { regOBD("ZZGODCTX"); return this; }

    protected ConditionValue _logisticscd;
    public ConditionValue xdfgetLogisticscd()
    { if (_logisticscd == null) { _logisticscd = nCV(); }
      return _logisticscd; }
    protected ConditionValue xgetCValueLogisticscd() { return xdfgetLogisticscd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGISTICSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Logisticscd_Asc() { regOBA("LOGISTICSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGISTICSCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Logisticscd_Desc() { regOBD("LOGISTICSCD"); return this; }

    protected ConditionValue _slediv;
    public ConditionValue xdfgetSlediv()
    { if (_slediv == null) { _slediv = nCV(); }
      return _slediv; }
    protected ConditionValue xgetCValueSlediv() { return xdfgetSlediv(); }

    /**
     * Add order-by as ascend. <br>
     * SLEDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slediv_Asc() { regOBA("SLEDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLEDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slediv_Desc() { regOBD("SLEDIV"); return this; }

    protected ConditionValue _hvrtrsn;
    public ConditionValue xdfgetHvrtrsn()
    { if (_hvrtrsn == null) { _hvrtrsn = nCV(); }
      return _hvrtrsn; }
    protected ConditionValue xgetCValueHvrtrsn() { return xdfgetHvrtrsn(); }

    /**
     * Add order-by as ascend. <br>
     * HVRTRSN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Hvrtrsn_Asc() { regOBA("HVRTRSN"); return this; }

    /**
     * Add order-by as descend. <br>
     * HVRTRSN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Hvrtrsn_Desc() { regOBD("HVRTRSN"); return this; }

    protected ConditionValue _zzvbelnb;
    public ConditionValue xdfgetZzvbelnb()
    { if (_zzvbelnb == null) { _zzvbelnb = nCV(); }
      return _zzvbelnb; }
    protected ConditionValue xgetCValueZzvbelnb() { return xdfgetZzvbelnb(); }

    /**
     * Add order-by as ascend. <br>
     * ZZVBELNB: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzvbelnb_Asc() { regOBA("ZZVBELNB"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZVBELNB: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzvbelnb_Desc() { regOBD("ZZVBELNB"); return this; }

    protected ConditionValue _cngprtslpno;
    public ConditionValue xdfgetCngprtslpno()
    { if (_cngprtslpno == null) { _cngprtslpno = nCV(); }
      return _cngprtslpno; }
    protected ConditionValue xgetCValueCngprtslpno() { return xdfgetCngprtslpno(); }

    /**
     * Add order-by as ascend. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Cngprtslpno_Asc() { regOBA("CNGPRTSLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Cngprtslpno_Desc() { regOBD("CNGPRTSLPNO"); return this; }

    protected ConditionValue _trnsctndiv;
    public ConditionValue xdfgetTrnsctndiv()
    { if (_trnsctndiv == null) { _trnsctndiv = nCV(); }
      return _trnsctndiv; }
    protected ConditionValue xgetCValueTrnsctndiv() { return xdfgetTrnsctndiv(); }

    /**
     * Add order-by as ascend. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Trnsctndiv_Asc() { regOBA("TRNSCTNDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Trnsctndiv_Desc() { regOBD("TRNSCTNDIV"); return this; }

    protected ConditionValue _eosordaftflg;
    public ConditionValue xdfgetEosordaftflg()
    { if (_eosordaftflg == null) { _eosordaftflg = nCV(); }
      return _eosordaftflg; }
    protected ConditionValue xgetCValueEosordaftflg() { return xdfgetEosordaftflg(); }

    /**
     * Add order-by as ascend. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Eosordaftflg_Asc() { regOBA("EOSORDAFTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Eosordaftflg_Desc() { regOBD("EOSORDAFTFLG"); return this; }

    protected ConditionValue _eosslpno;
    public ConditionValue xdfgetEosslpno()
    { if (_eosslpno == null) { _eosslpno = nCV(); }
      return _eosslpno; }
    protected ConditionValue xgetCValueEosslpno() { return xdfgetEosslpno(); }

    /**
     * Add order-by as ascend. <br>
     * EOSSLPNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Eosslpno_Asc() { regOBA("EOSSLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EOSSLPNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Eosslpno_Desc() { regOBD("EOSSLPNO"); return this; }

    protected ConditionValue _hdrdbxdiv;
    public ConditionValue xdfgetHdrdbxdiv()
    { if (_hdrdbxdiv == null) { _hdrdbxdiv = nCV(); }
      return _hdrdbxdiv; }
    protected ConditionValue xgetCValueHdrdbxdiv() { return xdfgetHdrdbxdiv(); }

    /**
     * Add order-by as ascend. <br>
     * HDRDBXDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Hdrdbxdiv_Asc() { regOBA("HDRDBXDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRDBXDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Hdrdbxdiv_Desc() { regOBD("HDRDBXDIV"); return this; }

    protected ConditionValue _inotrfsldiv;
    public ConditionValue xdfgetInotrfsldiv()
    { if (_inotrfsldiv == null) { _inotrfsldiv = nCV(); }
      return _inotrfsldiv; }
    protected ConditionValue xgetCValueInotrfsldiv() { return xdfgetInotrfsldiv(); }

    /**
     * Add order-by as ascend. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Inotrfsldiv_Asc() { regOBA("INOTRFSLDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Inotrfsldiv_Desc() { regOBD("INOTRFSLDIV"); return this; }

    protected ConditionValue _bxmntrfsldiv;
    public ConditionValue xdfgetBxmntrfsldiv()
    { if (_bxmntrfsldiv == null) { _bxmntrfsldiv = nCV(); }
      return _bxmntrfsldiv; }
    protected ConditionValue xgetCValueBxmntrfsldiv() { return xdfgetBxmntrfsldiv(); }

    /**
     * Add order-by as ascend. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Bxmntrfsldiv_Asc() { regOBA("BXMNTRFSLDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Bxmntrfsldiv_Desc() { regOBD("BXMNTRFSLDIV"); return this; }

    protected ConditionValue _slpmrgtmg;
    public ConditionValue xdfgetSlpmrgtmg()
    { if (_slpmrgtmg == null) { _slpmrgtmg = nCV(); }
      return _slpmrgtmg; }
    protected ConditionValue xgetCValueSlpmrgtmg() { return xdfgetSlpmrgtmg(); }

    /**
     * Add order-by as ascend. <br>
     * SLPMRGTMG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slpmrgtmg_Asc() { regOBA("SLPMRGTMG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPMRGTMG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Slpmrgtmg_Desc() { regOBD("SLPMRGTMG"); return this; }

    protected ConditionValue _zzblotdt;
    public ConditionValue xdfgetZzblotdt()
    { if (_zzblotdt == null) { _zzblotdt = nCV(); }
      return _zzblotdt; }
    protected ConditionValue xgetCValueZzblotdt() { return xdfgetZzblotdt(); }

    /**
     * Add order-by as ascend. <br>
     * ZZBLOTDT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzblotdt_Asc() { regOBA("ZZBLOTDT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZBLOTDT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Zzblotdt_Desc() { regOBD("ZZBLOTDT"); return this; }

    protected ConditionValue _cggdid;
    public ConditionValue xdfgetCggdid()
    { if (_cggdid == null) { _cggdid = nCV(); }
      return _cggdid; }
    protected ConditionValue xgetCValueCggdid() { return xdfgetCggdid(); }

    /**
     * Add order-by as ascend. <br>
     * CGGDID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Cggdid_Asc() { regOBA("CGGDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGGDID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Cggdid_Desc() { regOBD("CGGDID"); return this; }

    protected ConditionValue _matnr;
    public ConditionValue xdfgetMatnr()
    { if (_matnr == null) { _matnr = nCV(); }
      return _matnr; }
    protected ConditionValue xgetCValueMatnr() { return xdfgetMatnr(); }

    /**
     * Add order-by as ascend. <br>
     * MATNR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Matnr_Asc() { regOBA("MATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * MATNR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Matnr_Desc() { regOBD("MATNR"); return this; }

    protected ConditionValue _kwmeng;
    public ConditionValue xdfgetKwmeng()
    { if (_kwmeng == null) { _kwmeng = nCV(); }
      return _kwmeng; }
    protected ConditionValue xgetCValueKwmeng() { return xdfgetKwmeng(); }

    /**
     * Add order-by as ascend. <br>
     * KWMENG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Kwmeng_Asc() { regOBA("KWMENG"); return this; }

    /**
     * Add order-by as descend. <br>
     * KWMENG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Kwmeng_Desc() { regOBD("KWMENG"); return this; }

    protected ConditionValue _mvgr1;
    public ConditionValue xdfgetMvgr1()
    { if (_mvgr1 == null) { _mvgr1 = nCV(); }
      return _mvgr1; }
    protected ConditionValue xgetCValueMvgr1() { return xdfgetMvgr1(); }

    /**
     * Add order-by as ascend. <br>
     * MVGR1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Mvgr1_Asc() { regOBA("MVGR1"); return this; }

    /**
     * Add order-by as descend. <br>
     * MVGR1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Mvgr1_Desc() { regOBD("MVGR1"); return this; }

    protected ConditionValue _mvgr4;
    public ConditionValue xdfgetMvgr4()
    { if (_mvgr4 == null) { _mvgr4 = nCV(); }
      return _mvgr4; }
    protected ConditionValue xgetCValueMvgr4() { return xdfgetMvgr4(); }

    /**
     * Add order-by as ascend. <br>
     * MVGR4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Mvgr4_Asc() { regOBA("MVGR4"); return this; }

    /**
     * Add order-by as descend. <br>
     * MVGR4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Mvgr4_Desc() { regOBD("MVGR4"); return this; }

    protected ConditionValue _kzwi3;
    public ConditionValue xdfgetKzwi3()
    { if (_kzwi3 == null) { _kzwi3 = nCV(); }
      return _kzwi3; }
    protected ConditionValue xgetCValueKzwi3() { return xdfgetKzwi3(); }

    /**
     * Add order-by as ascend. <br>
     * KZWI3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Kzwi3_Asc() { regOBA("KZWI3"); return this; }

    /**
     * Add order-by as descend. <br>
     * KZWI3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_Kzwi3_Desc() { regOBD("KZWI3"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEShippingPlanBulkInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingPlanBulkInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEShippingPlanBulkInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEShippingPlanBulkInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EShippingPlanBulkInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EShippingPlanBulkInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EShippingPlanBulkInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EShippingPlanBulkInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EShippingPlanBulkInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EShippingPlanBulkInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EShippingPlanBulkInputCQ> _myselfExistsMap;
    public Map<String, EShippingPlanBulkInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EShippingPlanBulkInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EShippingPlanBulkInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EShippingPlanBulkInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EShippingPlanBulkInputCB.class.getName(); }
    protected String xCQ() { return EShippingPlanBulkInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
