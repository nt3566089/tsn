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
 * The base condition-query of E_ORDER_SPLIT_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsEOrderSplitDataCQ extends AbstractBsEOrderSplitDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EOrderSplitDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEOrderSplitDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_ORDER_SPLIT_DATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EOrderSplitDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EOrderSplitDataCIQ xcreateCIQ() {
        EOrderSplitDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EOrderSplitDataCIQ xnewCIQ() {
        return new EOrderSplitDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_ORDER_SPLIT_DATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EOrderSplitDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EOrderSplitDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _orderSplitDataId;
    public ConditionValue xdfgetOrderSplitDataId()
    { if (_orderSplitDataId == null) { _orderSplitDataId = nCV(); }
      return _orderSplitDataId; }
    protected ConditionValue xgetCValueOrderSplitDataId() { return xdfgetOrderSplitDataId(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_OrderSplitDataId_Asc() { regOBA("ORDER_SPLIT_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_OrderSplitDataId_Desc() { regOBD("ORDER_SPLIT_DATA_ID"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _recFlg;
    public ConditionValue xdfgetRecFlg()
    { if (_recFlg == null) { _recFlg = nCV(); }
      return _recFlg; }
    protected ConditionValue xgetCValueRecFlg() { return xdfgetRecFlg(); }

    /**
     * Add order-by as ascend. <br>
     * REC_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_RecFlg_Asc() { regOBA("REC_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REC_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_RecFlg_Desc() { regOBD("REC_FLG"); return this; }

    protected ConditionValue _srwhcd;
    public ConditionValue xdfgetSrwhcd()
    { if (_srwhcd == null) { _srwhcd = nCV(); }
      return _srwhcd; }
    protected ConditionValue xgetCValueSrwhcd() { return xdfgetSrwhcd(); }

    /**
     * Add order-by as ascend. <br>
     * SRWHCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Srwhcd_Asc() { regOBA("SRWHCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRWHCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Srwhcd_Desc() { regOBD("SRWHCD"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _ded;
    public ConditionValue xdfgetDed()
    { if (_ded == null) { _ded = nCV(); }
      return _ded; }
    protected ConditionValue xgetCValueDed() { return xdfgetDed(); }

    /**
     * Add order-by as ascend. <br>
     * DED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _pstnid;
    public ConditionValue xdfgetPstnid()
    { if (_pstnid == null) { _pstnid = nCV(); }
      return _pstnid; }
    protected ConditionValue xgetCValuePstnid() { return xdfgetPstnid(); }

    /**
     * Add order-by as ascend. <br>
     * PSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _dlvrnk;
    public ConditionValue xdfgetDlvrnk()
    { if (_dlvrnk == null) { _dlvrnk = nCV(); }
      return _dlvrnk; }
    protected ConditionValue xgetCValueDlvrnk() { return xdfgetDlvrnk(); }

    /**
     * Add order-by as ascend. <br>
     * DLVRNK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dlvrnk_Asc() { regOBA("DLVRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVRNK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dlvrnk_Desc() { regOBD("DLVRNK"); return this; }

    protected ConditionValue _dlvsnm;
    public ConditionValue xdfgetDlvsnm()
    { if (_dlvsnm == null) { _dlvsnm = nCV(); }
      return _dlvsnm; }
    protected ConditionValue xgetCValueDlvsnm() { return xdfgetDlvsnm(); }

    /**
     * Add order-by as ascend. <br>
     * DLVSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dlvsnm_Asc() { regOBA("DLVSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dlvsnm_Desc() { regOBD("DLVSNM"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _sscd;
    public ConditionValue xdfgetSscd()
    { if (_sscd == null) { _sscd = nCV(); }
      return _sscd; }
    protected ConditionValue xgetCValueSscd() { return xdfgetSscd(); }

    /**
     * Add order-by as ascend. <br>
     * SSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Sscd_Asc() { regOBA("SSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Sscd_Desc() { regOBD("SSCD"); return this; }

    protected ConditionValue _dlvymd;
    public ConditionValue xdfgetDlvymd()
    { if (_dlvymd == null) { _dlvymd = nCV(); }
      return _dlvymd; }
    protected ConditionValue xgetCValueDlvymd() { return xdfgetDlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * DLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

    protected ConditionValue _zzordymd;
    public ConditionValue xdfgetZzordymd()
    { if (_zzordymd == null) { _zzordymd = nCV(); }
      return _zzordymd; }
    protected ConditionValue xgetCValueZzordymd() { return xdfgetZzordymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORDYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Zzordymd_Asc() { regOBA("ZZORDYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORDYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Zzordymd_Desc() { regOBD("ZZORDYMD"); return this; }

    protected ConditionValue _slpmrgtmg;
    public ConditionValue xdfgetSlpmrgtmg()
    { if (_slpmrgtmg == null) { _slpmrgtmg = nCV(); }
      return _slpmrgtmg; }
    protected ConditionValue xgetCValueSlpmrgtmg() { return xdfgetSlpmrgtmg(); }

    /**
     * Add order-by as ascend. <br>
     * SLPMRGTMG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slpmrgtmg_Asc() { regOBA("SLPMRGTMG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPMRGTMG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slpmrgtmg_Desc() { regOBD("SLPMRGTMG"); return this; }

    protected ConditionValue _ordgr;
    public ConditionValue xdfgetOrdgr()
    { if (_ordgr == null) { _ordgr = nCV(); }
      return _ordgr; }
    protected ConditionValue xgetCValueOrdgr() { return xdfgetOrdgr(); }

    /**
     * Add order-by as ascend. <br>
     * ORDGR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Ordgr_Asc() { regOBA("ORDGR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDGR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Ordgr_Desc() { regOBD("ORDGR"); return this; }

    protected ConditionValue _s;
    public ConditionValue xdfgetS()
    { if (_s == null) { _s = nCV(); }
      return _s; }
    protected ConditionValue xgetCValueS() { return xdfgetS(); }

    /**
     * Add order-by as ascend. <br>
     * S: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_S_Asc() { regOBA("S"); return this; }

    /**
     * Add order-by as descend. <br>
     * S: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_S_Desc() { regOBD("S"); return this; }

    protected ConditionValue _h;
    public ConditionValue xdfgetH()
    { if (_h == null) { _h = nCV(); }
      return _h; }
    protected ConditionValue xgetCValueH() { return xdfgetH(); }

    /**
     * Add order-by as ascend. <br>
     * H: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_H_Asc() { regOBA("H"); return this; }

    /**
     * Add order-by as descend. <br>
     * H: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_H_Desc() { regOBD("H"); return this; }

    protected ConditionValue _m;
    public ConditionValue xdfgetM()
    { if (_m == null) { _m = nCV(); }
      return _m; }
    protected ConditionValue xgetCValueM() { return xdfgetM(); }

    /**
     * Add order-by as ascend. <br>
     * M: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_M_Asc() { regOBA("M"); return this; }

    /**
     * Add order-by as descend. <br>
     * M: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_M_Desc() { regOBD("M"); return this; }

    protected ConditionValue _srymd;
    public ConditionValue xdfgetSrymd()
    { if (_srymd == null) { _srymd = nCV(); }
      return _srymd; }
    protected ConditionValue xgetCValueSrymd() { return xdfgetSrymd(); }

    /**
     * Add order-by as ascend. <br>
     * SRYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Srymd_Asc() { regOBA("SRYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Srymd_Desc() { regOBD("SRYMD"); return this; }

    protected ConditionValue _rlybscd;
    public ConditionValue xdfgetRlybscd()
    { if (_rlybscd == null) { _rlybscd = nCV(); }
      return _rlybscd; }
    protected ConditionValue xgetCValueRlybscd() { return xdfgetRlybscd(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Rlybscd_Asc() { regOBA("RLYBSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Rlybscd_Desc() { regOBD("RLYBSCD"); return this; }

    protected ConditionValue _keepareah1;
    public ConditionValue xdfgetKeepareah1()
    { if (_keepareah1 == null) { _keepareah1 = nCV(); }
      return _keepareah1; }
    protected ConditionValue xgetCValueKeepareah1() { return xdfgetKeepareah1(); }

    /**
     * Add order-by as ascend. <br>
     * KEEPAREAH1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Keepareah1_Asc() { regOBA("KEEPAREAH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * KEEPAREAH1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Keepareah1_Desc() { regOBD("KEEPAREAH1"); return this; }

    protected ConditionValue _slptyp;
    public ConditionValue xdfgetSlptyp()
    { if (_slptyp == null) { _slptyp = nCV(); }
      return _slptyp; }
    protected ConditionValue xgetCValueSlptyp() { return xdfgetSlptyp(); }

    /**
     * Add order-by as ascend. <br>
     * SLPTYP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slptyp_Asc() { regOBA("SLPTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPTYP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slptyp_Desc() { regOBD("SLPTYP"); return this; }

    protected ConditionValue _cmpcd;
    public ConditionValue xdfgetCmpcd()
    { if (_cmpcd == null) { _cmpcd = nCV(); }
      return _cmpcd; }
    protected ConditionValue xgetCValueCmpcd() { return xdfgetCmpcd(); }

    /**
     * Add order-by as ascend. <br>
     * CMPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Cmpcd_Asc() { regOBA("CMPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CMPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Cmpcd_Desc() { regOBD("CMPCD"); return this; }

    protected ConditionValue _slpno;
    public ConditionValue xdfgetSlpno()
    { if (_slpno == null) { _slpno = nCV(); }
      return _slpno; }
    protected ConditionValue xgetCValueSlpno() { return xdfgetSlpno(); }

    /**
     * Add order-by as ascend. <br>
     * SLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slpno_Asc() { regOBA("SLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slpno_Desc() { regOBD("SLPNO"); return this; }

    protected ConditionValue _slediv;
    public ConditionValue xdfgetSlediv()
    { if (_slediv == null) { _slediv = nCV(); }
      return _slediv; }
    protected ConditionValue xgetCValueSlediv() { return xdfgetSlediv(); }

    /**
     * Add order-by as ascend. <br>
     * SLEDIV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slediv_Asc() { regOBA("SLEDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLEDIV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Slediv_Desc() { regOBD("SLEDIV"); return this; }

    protected ConditionValue _cngprtslpno;
    public ConditionValue xdfgetCngprtslpno()
    { if (_cngprtslpno == null) { _cngprtslpno = nCV(); }
      return _cngprtslpno; }
    protected ConditionValue xgetCValueCngprtslpno() { return xdfgetCngprtslpno(); }

    /**
     * Add order-by as ascend. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Cngprtslpno_Asc() { regOBA("CNGPRTSLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Cngprtslpno_Desc() { regOBD("CNGPRTSLPNO"); return this; }

    protected ConditionValue _spplymd;
    public ConditionValue xdfgetSpplymd()
    { if (_spplymd == null) { _spplymd = nCV(); }
      return _spplymd; }
    protected ConditionValue xgetCValueSpplymd() { return xdfgetSpplymd(); }

    /**
     * Add order-by as ascend. <br>
     * SPPLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Spplymd_Asc() { regOBA("SPPLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPPLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Spplymd_Desc() { regOBD("SPPLYMD"); return this; }

    protected ConditionValue _cggdid;
    public ConditionValue xdfgetCggdid()
    { if (_cggdid == null) { _cggdid = nCV(); }
      return _cggdid; }
    protected ConditionValue xgetCValueCggdid() { return xdfgetCggdid(); }

    /**
     * Add order-by as ascend. <br>
     * CGGDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Cggdid_Asc() { regOBA("CGGDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGGDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Cggdid_Desc() { regOBD("CGGDID"); return this; }

    protected ConditionValue _keepareah2;
    public ConditionValue xdfgetKeepareah2()
    { if (_keepareah2 == null) { _keepareah2 = nCV(); }
      return _keepareah2; }
    protected ConditionValue xgetCValueKeepareah2() { return xdfgetKeepareah2(); }

    /**
     * Add order-by as ascend. <br>
     * KEEPAREAH2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Keepareah2_Asc() { regOBA("KEEPAREAH2"); return this; }

    /**
     * Add order-by as descend. <br>
     * KEEPAREAH2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Keepareah2_Desc() { regOBD("KEEPAREAH2"); return this; }

    protected ConditionValue _zzmatnr;
    public ConditionValue xdfgetZzmatnr()
    { if (_zzmatnr == null) { _zzmatnr = nCV(); }
      return _zzmatnr; }
    protected ConditionValue xgetCValueZzmatnr() { return xdfgetZzmatnr(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

    protected ConditionValue _boxno;
    public ConditionValue xdfgetBoxno()
    { if (_boxno == null) { _boxno = nCV(); }
      return _boxno; }
    protected ConditionValue xgetCValueBoxno() { return xdfgetBoxno(); }

    /**
     * Add order-by as ascend. <br>
     * BOXNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxno_Asc() { regOBA("BOXNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxno_Desc() { regOBD("BOXNO"); return this; }

    protected ConditionValue _boxtype;
    public ConditionValue xdfgetBoxtype()
    { if (_boxtype == null) { _boxtype = nCV(); }
      return _boxtype; }
    protected ConditionValue xgetCValueBoxtype() { return xdfgetBoxtype(); }

    /**
     * Add order-by as ascend. <br>
     * BOXTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxtype_Asc() { regOBA("BOXTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxtype_Desc() { regOBD("BOXTYPE"); return this; }

    protected ConditionValue _zzmatnrtotal;
    public ConditionValue xdfgetZzmatnrtotal()
    { if (_zzmatnrtotal == null) { _zzmatnrtotal = nCV(); }
      return _zzmatnrtotal; }
    protected ConditionValue xgetCValueZzmatnrtotal() { return xdfgetZzmatnrtotal(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Zzmatnrtotal_Asc() { regOBA("ZZMATNRTOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Zzmatnrtotal_Desc() { regOBD("ZZMATNRTOTAL"); return this; }

    protected ConditionValue _boxnocnsnm;
    public ConditionValue xdfgetBoxnocnsnm()
    { if (_boxnocnsnm == null) { _boxnocnsnm = nCV(); }
      return _boxnocnsnm; }
    protected ConditionValue xgetCValueBoxnocnsnm() { return xdfgetBoxnocnsnm(); }

    /**
     * Add order-by as ascend. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxnocnsnm_Asc() { regOBA("BOXNOCNSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxnocnsnm_Desc() { regOBD("BOXNOCNSNM"); return this; }

    protected ConditionValue _bxoszl;
    public ConditionValue xdfgetBxoszl()
    { if (_bxoszl == null) { _bxoszl = nCV(); }
      return _bxoszl; }
    protected ConditionValue xgetCValueBxoszl() { return xdfgetBxoszl(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Bxoszl_Asc() { regOBA("BXOSZL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Bxoszl_Desc() { regOBD("BXOSZL"); return this; }

    protected ConditionValue _bxoszh;
    public ConditionValue xdfgetBxoszh()
    { if (_bxoszh == null) { _bxoszh = nCV(); }
      return _bxoszh; }
    protected ConditionValue xgetCValueBxoszh() { return xdfgetBxoszh(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Bxoszh_Asc() { regOBA("BXOSZH"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Bxoszh_Desc() { regOBD("BXOSZH"); return this; }

    protected ConditionValue _bxoszw;
    public ConditionValue xdfgetBxoszw()
    { if (_bxoszw == null) { _bxoszw = nCV(); }
      return _bxoszw; }
    protected ConditionValue xgetCValueBxoszw() { return xdfgetBxoszw(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Bxoszw_Asc() { regOBA("BXOSZW"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Bxoszw_Desc() { regOBD("BXOSZW"); return this; }

    protected ConditionValue _boxtotalweigh;
    public ConditionValue xdfgetBoxtotalweigh()
    { if (_boxtotalweigh == null) { _boxtotalweigh = nCV(); }
      return _boxtotalweigh; }
    protected ConditionValue xgetCValueBoxtotalweigh() { return xdfgetBoxtotalweigh(); }

    /**
     * Add order-by as ascend. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxtotalweigh_Asc() { regOBA("BOXTOTALWEIGH"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxtotalweigh_Desc() { regOBD("BOXTOTALWEIGH"); return this; }

    protected ConditionValue _weightype;
    public ConditionValue xdfgetWeightype()
    { if (_weightype == null) { _weightype = nCV(); }
      return _weightype; }
    protected ConditionValue xgetCValueWeightype() { return xdfgetWeightype(); }

    /**
     * Add order-by as ascend. <br>
     * WEIGHTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Weightype_Asc() { regOBA("WEIGHTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WEIGHTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Weightype_Desc() { regOBD("WEIGHTYPE"); return this; }

    protected ConditionValue _boxtotalnumber;
    public ConditionValue xdfgetBoxtotalnumber()
    { if (_boxtotalnumber == null) { _boxtotalnumber = nCV(); }
      return _boxtotalnumber; }
    protected ConditionValue xgetCValueBoxtotalnumber() { return xdfgetBoxtotalnumber(); }

    /**
     * Add order-by as ascend. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxtotalnumber_Asc() { regOBA("BOXTOTALNUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Boxtotalnumber_Desc() { regOBD("BOXTOTALNUMBER"); return this; }

    protected ConditionValue _keepaream1;
    public ConditionValue xdfgetKeepaream1()
    { if (_keepaream1 == null) { _keepaream1 = nCV(); }
      return _keepaream1; }
    protected ConditionValue xgetCValueKeepaream1() { return xdfgetKeepaream1(); }

    /**
     * Add order-by as ascend. <br>
     * KEEPAREAM1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Keepaream1_Asc() { regOBA("KEEPAREAM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * KEEPAREAM1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_Keepaream1_Desc() { regOBD("KEEPAREAM1"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEOrderSplitDataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEOrderSplitDataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEOrderSplitDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEOrderSplitDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EOrderSplitDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EOrderSplitDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EOrderSplitDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EOrderSplitDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EOrderSplitDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EOrderSplitDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EOrderSplitDataCQ> _myselfExistsMap;
    public Map<String, EOrderSplitDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EOrderSplitDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EOrderSplitDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EOrderSplitDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EOrderSplitDataCB.class.getName(); }
    protected String xCQ() { return EOrderSplitDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
