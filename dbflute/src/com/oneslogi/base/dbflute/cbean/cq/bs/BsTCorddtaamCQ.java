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
 * The base condition-query of T_CORDDTAAM.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCorddtaamCQ extends AbstractBsTCorddtaamCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCorddtaamCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCorddtaamCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CORDDTAAM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCorddtaamCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCorddtaamCIQ xcreateCIQ() {
        TCorddtaamCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCorddtaamCIQ xnewCIQ() {
        return new TCorddtaamCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CORDDTAAM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCorddtaamCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCorddtaamCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _orderRecordId;
    public ConditionValue xdfgetOrderRecordId()
    { if (_orderRecordId == null) { _orderRecordId = nCV(); }
      return _orderRecordId; }
    protected ConditionValue xgetCValueOrderRecordId() { return xdfgetOrderRecordId(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_OrderRecordId_Asc() { regOBA("ORDER_RECORD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_OrderRecordId_Desc() { regOBD("ORDER_RECORD_ID"); return this; }

    protected ConditionValue _orderHId;
    public ConditionValue xdfgetOrderHId()
    { if (_orderHId == null) { _orderHId = nCV(); }
      return _orderHId; }
    protected ConditionValue xgetCValueOrderHId() { return xdfgetOrderHId(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_H_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_OrderHId_Asc() { regOBA("ORDER_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_H_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_OrderHId_Desc() { regOBD("ORDER_H_ID"); return this; }

    protected ConditionValue _srwhcd;
    public ConditionValue xdfgetSrwhcd()
    { if (_srwhcd == null) { _srwhcd = nCV(); }
      return _srwhcd; }
    protected ConditionValue xgetCValueSrwhcd() { return xdfgetSrwhcd(); }

    /**
     * Add order-by as ascend. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srwhcd_Asc() { regOBA("SRWHCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srwhcd_Desc() { regOBD("SRWHCD"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _zzordymd;
    public ConditionValue xdfgetZzordymd()
    { if (_zzordymd == null) { _zzordymd = nCV(); }
      return _zzordymd; }
    protected ConditionValue xgetCValueZzordymd() { return xdfgetZzordymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Zzordymd_Asc() { regOBA("ZZORDYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Zzordymd_Desc() { regOBD("ZZORDYMD"); return this; }

    protected ConditionValue _ordgr;
    public ConditionValue xdfgetOrdgr()
    { if (_ordgr == null) { _ordgr = nCV(); }
      return _ordgr; }
    protected ConditionValue xgetCValueOrdgr() { return xdfgetOrdgr(); }

    /**
     * Add order-by as ascend. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ordgr_Asc() { regOBA("ORDGR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ordgr_Desc() { regOBD("ORDGR"); return this; }

    protected ConditionValue _dlvymd;
    public ConditionValue xdfgetDlvymd()
    { if (_dlvymd == null) { _dlvymd = nCV(); }
      return _dlvymd; }
    protected ConditionValue xgetCValueDlvymd() { return xdfgetDlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

    protected ConditionValue _ded;
    public ConditionValue xdfgetDed()
    { if (_ded == null) { _ded = nCV(); }
      return _ded; }
    protected ConditionValue xgetCValueDed() { return xdfgetDed(); }

    /**
     * Add order-by as ascend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _pstnid;
    public ConditionValue xdfgetPstnid()
    { if (_pstnid == null) { _pstnid = nCV(); }
      return _pstnid; }
    protected ConditionValue xgetCValuePstnid() { return xdfgetPstnid(); }

    /**
     * Add order-by as ascend. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _scddlvymd;
    public ConditionValue xdfgetScddlvymd()
    { if (_scddlvymd == null) { _scddlvymd = nCV(); }
      return _scddlvymd; }
    protected ConditionValue xgetCValueScddlvymd() { return xdfgetScddlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * SCDDLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Scddlvymd_Asc() { regOBA("SCDDLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCDDLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Scddlvymd_Desc() { regOBD("SCDDLVYMD"); return this; }

    protected ConditionValue _scdded;
    public ConditionValue xdfgetScdded()
    { if (_scdded == null) { _scdded = nCV(); }
      return _scdded; }
    protected ConditionValue xgetCValueScdded() { return xdfgetScdded(); }

    /**
     * Add order-by as ascend. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Scdded_Asc() { regOBA("SCDDED"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Scdded_Desc() { regOBD("SCDDED"); return this; }

    protected ConditionValue _scdpstnid;
    public ConditionValue xdfgetScdpstnid()
    { if (_scdpstnid == null) { _scdpstnid = nCV(); }
      return _scdpstnid; }
    protected ConditionValue xgetCValueScdpstnid() { return xdfgetScdpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * SCDPSTNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Scdpstnid_Asc() { regOBA("SCDPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCDPSTNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Scdpstnid_Desc() { regOBD("SCDPSTNID"); return this; }

    protected ConditionValue _hpynid;
    public ConditionValue xdfgetHpynid()
    { if (_hpynid == null) { _hpynid = nCV(); }
      return _hpynid; }
    protected ConditionValue xgetCValueHpynid() { return xdfgetHpynid(); }

    /**
     * Add order-by as ascend. <br>
     * HPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hpynid_Asc() { regOBA("HPYNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hpynid_Desc() { regOBD("HPYNID"); return this; }

    protected ConditionValue _ipynid;
    public ConditionValue xdfgetIpynid()
    { if (_ipynid == null) { _ipynid = nCV(); }
      return _ipynid; }
    protected ConditionValue xgetCValueIpynid() { return xdfgetIpynid(); }

    /**
     * Add order-by as ascend. <br>
     * IPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ipynid_Asc() { regOBA("IPYNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ipynid_Desc() { regOBD("IPYNID"); return this; }

    protected ConditionValue _srded;
    public ConditionValue xdfgetSrded()
    { if (_srded == null) { _srded = nCV(); }
      return _srded; }
    protected ConditionValue xgetCValueSrded() { return xdfgetSrded(); }

    /**
     * Add order-by as ascend. <br>
     * SRDED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srded_Asc() { regOBA("SRDED"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srded_Desc() { regOBD("SRDED"); return this; }

    protected ConditionValue _srpstnid;
    public ConditionValue xdfgetSrpstnid()
    { if (_srpstnid == null) { _srpstnid = nCV(); }
      return _srpstnid; }
    protected ConditionValue xgetCValueSrpstnid() { return xdfgetSrpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * SRPSTNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srpstnid_Asc() { regOBA("SRPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRPSTNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srpstnid_Desc() { regOBD("SRPSTNID"); return this; }

    protected ConditionValue _srymd;
    public ConditionValue xdfgetSrymd()
    { if (_srymd == null) { _srymd = nCV(); }
      return _srymd; }
    protected ConditionValue xgetCValueSrymd() { return xdfgetSrymd(); }

    /**
     * Add order-by as ascend. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srymd_Asc() { regOBA("SRYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srymd_Desc() { regOBD("SRYMD"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _srlincd;
    public ConditionValue xdfgetSrlincd()
    { if (_srlincd == null) { _srlincd = nCV(); }
      return _srlincd; }
    protected ConditionValue xgetCValueSrlincd() { return xdfgetSrlincd(); }

    /**
     * Add order-by as ascend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srlincd_Asc() { regOBA("SRLINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srlincd_Desc() { regOBD("SRLINCD"); return this; }

    protected ConditionValue _srrnk;
    public ConditionValue xdfgetSrrnk()
    { if (_srrnk == null) { _srrnk = nCV(); }
      return _srrnk; }
    protected ConditionValue xgetCValueSrrnk() { return xdfgetSrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Dlvsnm_Asc() { regOBA("DLVSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvsnm_Desc() { regOBD("DLVSNM"); return this; }

    protected ConditionValue _dlvdtlsnm;
    public ConditionValue xdfgetDlvdtlsnm()
    { if (_dlvdtlsnm == null) { _dlvdtlsnm = nCV(); }
      return _dlvdtlsnm; }
    protected ConditionValue xgetCValueDlvdtlsnm() { return xdfgetDlvdtlsnm(); }

    /**
     * Add order-by as ascend. <br>
     * DLVDTLSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvdtlsnm_Asc() { regOBA("DLVDTLSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVDTLSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvdtlsnm_Desc() { regOBD("DLVDTLSNM"); return this; }

    protected ConditionValue _sscd;
    public ConditionValue xdfgetSscd()
    { if (_sscd == null) { _sscd = nCV(); }
      return _sscd; }
    protected ConditionValue xgetCValueSscd() { return xdfgetSscd(); }

    /**
     * Add order-by as ascend. <br>
     * SSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Sscd_Asc() { regOBA("SSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Sscd_Desc() { regOBD("SSCD"); return this; }

    protected ConditionValue _ssnm;
    public ConditionValue xdfgetSsnm()
    { if (_ssnm == null) { _ssnm = nCV(); }
      return _ssnm; }
    protected ConditionValue xgetCValueSsnm() { return xdfgetSsnm(); }

    /**
     * Add order-by as ascend. <br>
     * SSNM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ssnm_Asc() { regOBA("SSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSNM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ssnm_Desc() { regOBD("SSNM"); return this; }

    protected ConditionValue _hdvid;
    public ConditionValue xdfgetHdvid()
    { if (_hdvid == null) { _hdvid = nCV(); }
      return _hdvid; }
    protected ConditionValue xgetCValueHdvid() { return xdfgetHdvid(); }

    /**
     * Add order-by as ascend. <br>
     * HDVID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hdvid_Asc() { regOBA("HDVID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDVID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hdvid_Desc() { regOBD("HDVID"); return this; }

    protected ConditionValue _dtlsnm;
    public ConditionValue xdfgetDtlsnm()
    { if (_dtlsnm == null) { _dtlsnm = nCV(); }
      return _dtlsnm; }
    protected ConditionValue xgetCValueDtlsnm() { return xdfgetDtlsnm(); }

    /**
     * Add order-by as ascend. <br>
     * DTLSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dtlsnm_Asc() { regOBA("DTLSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DTLSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dtlsnm_Desc() { regOBD("DTLSNM"); return this; }

    protected ConditionValue _zzmatnr;
    public ConditionValue xdfgetZzmatnr()
    { if (_zzmatnr == null) { _zzmatnr = nCV(); }
      return _zzmatnr; }
    protected ConditionValue xgetCValueZzmatnr() { return xdfgetZzmatnr(); }

    /**
     * Add order-by as ascend. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

    protected ConditionValue _slqacb;
    public ConditionValue xdfgetSlqacb()
    { if (_slqacb == null) { _slqacb = nCV(); }
      return _slqacb; }
    protected ConditionValue xgetCValueSlqacb() { return xdfgetSlqacb(); }

    /**
     * Add order-by as ascend. <br>
     * SLQACB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slqacb_Asc() { regOBA("SLQACB"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQACB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slqacb_Desc() { regOBD("SLQACB"); return this; }

    protected ConditionValue _slqact;
    public ConditionValue xdfgetSlqact()
    { if (_slqact == null) { _slqact = nCV(); }
      return _slqact; }
    protected ConditionValue xgetCValueSlqact() { return xdfgetSlqact(); }

    /**
     * Add order-by as ascend. <br>
     * SLQACT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slqact_Asc() { regOBA("SLQACT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQACT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slqact_Desc() { regOBD("SLQACT"); return this; }

    protected ConditionValue _slqanum;
    public ConditionValue xdfgetSlqanum()
    { if (_slqanum == null) { _slqanum = nCV(); }
      return _slqanum; }
    protected ConditionValue xgetCValueSlqanum() { return xdfgetSlqanum(); }

    /**
     * Add order-by as ascend. <br>
     * SLQANUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slqanum_Asc() { regOBA("SLQANUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQANUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slqanum_Desc() { regOBD("SLQANUM"); return this; }

    protected ConditionValue _linblk;
    public ConditionValue xdfgetLinblk()
    { if (_linblk == null) { _linblk = nCV(); }
      return _linblk; }
    protected ConditionValue xgetCValueLinblk() { return xdfgetLinblk(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

    protected ConditionValue _locno;
    public ConditionValue xdfgetLocno()
    { if (_locno == null) { _locno = nCV(); }
      return _locno; }
    protected ConditionValue xgetCValueLocno() { return xdfgetLocno(); }

    /**
     * Add order-by as ascend. <br>
     * LOCNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Locno_Asc() { regOBA("LOCNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Locno_Desc() { regOBD("LOCNO"); return this; }

    protected ConditionValue _locid;
    public ConditionValue xdfgetLocid()
    { if (_locid == null) { _locid = nCV(); }
      return _locid; }
    protected ConditionValue xgetCValueLocid() { return xdfgetLocid(); }

    /**
     * Add order-by as ascend. <br>
     * LOCID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Locid_Asc() { regOBA("LOCID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Locid_Desc() { regOBD("LOCID"); return this; }

    protected ConditionValue _dlvprtrnk;
    public ConditionValue xdfgetDlvprtrnk()
    { if (_dlvprtrnk == null) { _dlvprtrnk = nCV(); }
      return _dlvprtrnk; }
    protected ConditionValue xgetCValueDlvprtrnk() { return xdfgetDlvprtrnk(); }

    /**
     * Add order-by as ascend. <br>
     * DLVPRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvprtrnk_Asc() { regOBA("DLVPRTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVPRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvprtrnk_Desc() { regOBD("DLVPRTRNK"); return this; }

    protected ConditionValue _srdlvymd;
    public ConditionValue xdfgetSrdlvymd()
    { if (_srdlvymd == null) { _srdlvymd = nCV(); }
      return _srdlvymd; }
    protected ConditionValue xgetCValueSrdlvymd() { return xdfgetSrdlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * SRDLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvymd_Asc() { regOBA("SRDLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvymd_Desc() { regOBD("SRDLVYMD"); return this; }

    protected ConditionValue _srhpynid;
    public ConditionValue xdfgetSrhpynid()
    { if (_srhpynid == null) { _srhpynid = nCV(); }
      return _srhpynid; }
    protected ConditionValue xgetCValueSrhpynid() { return xdfgetSrhpynid(); }

    /**
     * Add order-by as ascend. <br>
     * SRHPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srhpynid_Asc() { regOBA("SRHPYNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRHPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srhpynid_Desc() { regOBD("SRHPYNID"); return this; }

    protected ConditionValue _sripynid;
    public ConditionValue xdfgetSripynid()
    { if (_sripynid == null) { _sripynid = nCV(); }
      return _sripynid; }
    protected ConditionValue xgetCValueSripynid() { return xdfgetSripynid(); }

    /**
     * Add order-by as ascend. <br>
     * SRIPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Sripynid_Asc() { regOBA("SRIPYNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRIPYNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Sripynid_Desc() { regOBD("SRIPYNID"); return this; }

    protected ConditionValue _srsrlincd;
    public ConditionValue xdfgetSrsrlincd()
    { if (_srsrlincd == null) { _srsrlincd = nCV(); }
      return _srsrlincd; }
    protected ConditionValue xgetCValueSrsrlincd() { return xdfgetSrsrlincd(); }

    /**
     * Add order-by as ascend. <br>
     * SRSRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srsrlincd_Asc() { regOBA("SRSRLINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRSRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srsrlincd_Desc() { regOBD("SRSRLINCD"); return this; }

    protected ConditionValue _srsrrnk;
    public ConditionValue xdfgetSrsrrnk()
    { if (_srsrrnk == null) { _srsrrnk = nCV(); }
      return _srsrrnk; }
    protected ConditionValue xgetCValueSrsrrnk() { return xdfgetSrsrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRSRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srsrrnk_Asc() { regOBA("SRSRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRSRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srsrrnk_Desc() { regOBD("SRSRRNK"); return this; }

    protected ConditionValue _srdlvsnm;
    public ConditionValue xdfgetSrdlvsnm()
    { if (_srdlvsnm == null) { _srdlvsnm = nCV(); }
      return _srdlvsnm; }
    protected ConditionValue xgetCValueSrdlvsnm() { return xdfgetSrdlvsnm(); }

    /**
     * Add order-by as ascend. <br>
     * SRDLVSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvsnm_Asc() { regOBA("SRDLVSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDLVSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvsnm_Desc() { regOBD("SRDLVSNM"); return this; }

    protected ConditionValue _srdlvdtlsnm;
    public ConditionValue xdfgetSrdlvdtlsnm()
    { if (_srdlvdtlsnm == null) { _srdlvdtlsnm = nCV(); }
      return _srdlvdtlsnm; }
    protected ConditionValue xgetCValueSrdlvdtlsnm() { return xdfgetSrdlvdtlsnm(); }

    /**
     * Add order-by as ascend. <br>
     * SRDLVDTLSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvdtlsnm_Asc() { regOBA("SRDLVDTLSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDLVDTLSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvdtlsnm_Desc() { regOBD("SRDLVDTLSNM"); return this; }

    protected ConditionValue _srdlvprtrnk;
    public ConditionValue xdfgetSrdlvprtrnk()
    { if (_srdlvprtrnk == null) { _srdlvprtrnk = nCV(); }
      return _srdlvprtrnk; }
    protected ConditionValue xgetCValueSrdlvprtrnk() { return xdfgetSrdlvprtrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvprtrnk_Asc() { regOBA("SRDLVPRTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Srdlvprtrnk_Desc() { regOBD("SRDLVPRTRNK"); return this; }

    protected ConditionValue _brtyp;
    public ConditionValue xdfgetBrtyp()
    { if (_brtyp == null) { _brtyp = nCV(); }
      return _brtyp; }
    protected ConditionValue xgetCValueBrtyp() { return xdfgetBrtyp(); }

    /**
     * Add order-by as ascend. <br>
     * BRTYP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Brtyp_Asc() { regOBA("BRTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRTYP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Brtyp_Desc() { regOBD("BRTYP"); return this; }

    protected ConditionValue _boxno;
    public ConditionValue xdfgetBoxno()
    { if (_boxno == null) { _boxno = nCV(); }
      return _boxno; }
    protected ConditionValue xgetCValueBoxno() { return xdfgetBoxno(); }

    /**
     * Add order-by as ascend. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxno_Asc() { regOBA("BOXNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxno_Desc() { regOBD("BOXNO"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Boxnocnsnm_Asc() { regOBA("BOXNOCNSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxnocnsnm_Desc() { regOBD("BOXNOCNSNM"); return this; }

    protected ConditionValue _boxtyp;
    public ConditionValue xdfgetBoxtyp()
    { if (_boxtyp == null) { _boxtyp = nCV(); }
      return _boxtyp; }
    protected ConditionValue xgetCValueBoxtyp() { return xdfgetBoxtyp(); }

    /**
     * Add order-by as ascend. <br>
     * BOXTYP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxtyp_Asc() { regOBA("BOXTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXTYP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxtyp_Desc() { regOBD("BOXTYP"); return this; }

    protected ConditionValue _mgboxdid;
    public ConditionValue xdfgetMgboxdid()
    { if (_mgboxdid == null) { _mgboxdid = nCV(); }
      return _mgboxdid; }
    protected ConditionValue xgetCValueMgboxdid() { return xdfgetMgboxdid(); }

    /**
     * Add order-by as ascend. <br>
     * MGBOXDID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Mgboxdid_Asc() { regOBA("MGBOXDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MGBOXDID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Mgboxdid_Desc() { regOBD("MGBOXDID"); return this; }

    protected ConditionValue _dmdid;
    public ConditionValue xdfgetDmdid()
    { if (_dmdid == null) { _dmdid = nCV(); }
      return _dmdid; }
    protected ConditionValue xgetCValueDmdid() { return xdfgetDmdid(); }

    /**
     * Add order-by as ascend. <br>
     * DMDID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dmdid_Asc() { regOBA("DMDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DMDID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dmdid_Desc() { regOBD("DMDID"); return this; }

    protected ConditionValue _ttboxqa;
    public ConditionValue xdfgetTtboxqa()
    { if (_ttboxqa == null) { _ttboxqa = nCV(); }
      return _ttboxqa; }
    protected ConditionValue xgetCValueTtboxqa() { return xdfgetTtboxqa(); }

    /**
     * Add order-by as ascend. <br>
     * TTBOXQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ttboxqa_Asc() { regOBA("TTBOXQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTBOXQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ttboxqa_Desc() { regOBD("TTBOXQA"); return this; }

    protected ConditionValue _boxctqata;
    public ConditionValue xdfgetBoxctqata()
    { if (_boxctqata == null) { _boxctqata = nCV(); }
      return _boxctqata; }
    protected ConditionValue xgetCValueBoxctqata() { return xdfgetBoxctqata(); }

    /**
     * Add order-by as ascend. <br>
     * BOXCTQATA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxctqata_Asc() { regOBA("BOXCTQATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXCTQATA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxctqata_Desc() { regOBD("BOXCTQATA"); return this; }

    protected ConditionValue _boxctqaapsrplc;
    public ConditionValue xdfgetBoxctqaapsrplc()
    { if (_boxctqaapsrplc == null) { _boxctqaapsrplc = nCV(); }
      return _boxctqaapsrplc; }
    protected ConditionValue xgetCValueBoxctqaapsrplc() { return xdfgetBoxctqaapsrplc(); }

    /**
     * Add order-by as ascend. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxctqaapsrplc_Asc() { regOBA("BOXCTQAAPSRPLC"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Boxctqaapsrplc_Desc() { regOBD("BOXCTQAAPSRPLC"); return this; }

    protected ConditionValue _ttsroprtcnt;
    public ConditionValue xdfgetTtsroprtcnt()
    { if (_ttsroprtcnt == null) { _ttsroprtcnt = nCV(); }
      return _ttsroprtcnt; }
    protected ConditionValue xgetCValueTtsroprtcnt() { return xdfgetTtsroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ttsroprtcnt_Asc() { regOBA("TTSROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ttsroprtcnt_Desc() { regOBD("TTSROPRTCNT"); return this; }

    protected ConditionValue _bxmtrid;
    public ConditionValue xdfgetBxmtrid()
    { if (_bxmtrid == null) { _bxmtrid = nCV(); }
      return _bxmtrid; }
    protected ConditionValue xgetCValueBxmtrid() { return xdfgetBxmtrid(); }

    /**
     * Add order-by as ascend. <br>
     * BXMTRID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Bxmtrid_Asc() { regOBA("BXMTRID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXMTRID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Bxmtrid_Desc() { regOBD("BXMTRID"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Spplymd_Asc() { regOBA("SPPLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPPLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Spplymd_Desc() { regOBD("SPPLYMD"); return this; }

    protected ConditionValue _slptyp;
    public ConditionValue xdfgetSlptyp()
    { if (_slptyp == null) { _slptyp = nCV(); }
      return _slptyp; }
    protected ConditionValue xgetCValueSlptyp() { return xdfgetSlptyp(); }

    /**
     * Add order-by as ascend. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slptyp_Asc() { regOBA("SLPTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slptyp_Desc() { regOBD("SLPTYP"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _otorgcd;
    public ConditionValue xdfgetOtorgcd()
    { if (_otorgcd == null) { _otorgcd = nCV(); }
      return _otorgcd; }
    protected ConditionValue xgetCValueOtorgcd() { return xdfgetOtorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * OTORGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Otorgcd_Asc() { regOBA("OTORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTORGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Otorgcd_Desc() { regOBD("OTORGCD"); return this; }

    protected ConditionValue _ordorgcd;
    public ConditionValue xdfgetOrdorgcd()
    { if (_ordorgcd == null) { _ordorgcd = nCV(); }
      return _ordorgcd; }
    protected ConditionValue xgetCValueOrdorgcd() { return xdfgetOrdorgcd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDORGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ordorgcd_Asc() { regOBA("ORDORGCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDORGCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ordorgcd_Desc() { regOBD("ORDORGCD"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Rlybscd_Asc() { regOBA("RLYBSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Rlybscd_Desc() { regOBD("RLYBSCD"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Dlvrnk_Asc() { regOBA("DLVRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVRNK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Dlvrnk_Desc() { regOBD("DLVRNK"); return this; }

    protected ConditionValue _lmpdlvno;
    public ConditionValue xdfgetLmpdlvno()
    { if (_lmpdlvno == null) { _lmpdlvno = nCV(); }
      return _lmpdlvno; }
    protected ConditionValue xgetCValueLmpdlvno() { return xdfgetLmpdlvno(); }

    /**
     * Add order-by as ascend. <br>
     * LMPDLVNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lmpdlvno_Asc() { regOBA("LMPDLVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LMPDLVNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lmpdlvno_Desc() { regOBD("LMPDLVNO"); return this; }

    protected ConditionValue _divmtd;
    public ConditionValue xdfgetDivmtd()
    { if (_divmtd == null) { _divmtd = nCV(); }
      return _divmtd; }
    protected ConditionValue xgetCValueDivmtd() { return xdfgetDivmtd(); }

    /**
     * Add order-by as ascend. <br>
     * DIVMTD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Divmtd_Asc() { regOBA("DIVMTD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIVMTD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Divmtd_Desc() { regOBD("DIVMTD"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Slediv_Asc() { regOBA("SLEDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLEDIV: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slediv_Desc() { regOBD("SLEDIV"); return this; }

    protected ConditionValue _hvrtrsn;
    public ConditionValue xdfgetHvrtrsn()
    { if (_hvrtrsn == null) { _hvrtrsn = nCV(); }
      return _hvrtrsn; }
    protected ConditionValue xgetCValueHvrtrsn() { return xdfgetHvrtrsn(); }

    /**
     * Add order-by as ascend. <br>
     * HVRTRSN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hvrtrsn_Asc() { regOBA("HVRTRSN"); return this; }

    /**
     * Add order-by as descend. <br>
     * HVRTRSN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hvrtrsn_Desc() { regOBD("HVRTRSN"); return this; }

    protected ConditionValue _hvrtinotymd;
    public ConditionValue xdfgetHvrtinotymd()
    { if (_hvrtinotymd == null) { _hvrtinotymd = nCV(); }
      return _hvrtinotymd; }
    protected ConditionValue xgetCValueHvrtinotymd() { return xdfgetHvrtinotymd(); }

    /**
     * Add order-by as ascend. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hvrtinotymd_Asc() { regOBA("HVRTINOTYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hvrtinotymd_Desc() { regOBD("HVRTINOTYMD"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Cngprtslpno_Asc() { regOBA("CNGPRTSLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Cngprtslpno_Desc() { regOBD("CNGPRTSLPNO"); return this; }

    protected ConditionValue _trnsctndiv;
    public ConditionValue xdfgetTrnsctndiv()
    { if (_trnsctndiv == null) { _trnsctndiv = nCV(); }
      return _trnsctndiv; }
    protected ConditionValue xgetCValueTrnsctndiv() { return xdfgetTrnsctndiv(); }

    /**
     * Add order-by as ascend. <br>
     * TRNSCTNDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Trnsctndiv_Asc() { regOBA("TRNSCTNDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRNSCTNDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Trnsctndiv_Desc() { regOBD("TRNSCTNDIV"); return this; }

    protected ConditionValue _eosordaftflg;
    public ConditionValue xdfgetEosordaftflg()
    { if (_eosordaftflg == null) { _eosordaftflg = nCV(); }
      return _eosordaftflg; }
    protected ConditionValue xgetCValueEosordaftflg() { return xdfgetEosordaftflg(); }

    /**
     * Add order-by as ascend. <br>
     * EOSORDAFTFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Eosordaftflg_Asc() { regOBA("EOSORDAFTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EOSORDAFTFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Eosordaftflg_Desc() { regOBD("EOSORDAFTFLG"); return this; }

    protected ConditionValue _eosslpno;
    public ConditionValue xdfgetEosslpno()
    { if (_eosslpno == null) { _eosslpno = nCV(); }
      return _eosslpno; }
    protected ConditionValue xgetCValueEosslpno() { return xdfgetEosslpno(); }

    /**
     * Add order-by as ascend. <br>
     * EOSSLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Eosslpno_Asc() { regOBA("EOSSLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EOSSLPNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Eosslpno_Desc() { regOBD("EOSSLPNO"); return this; }

    protected ConditionValue _hdrdbxdiv;
    public ConditionValue xdfgetHdrdbxdiv()
    { if (_hdrdbxdiv == null) { _hdrdbxdiv = nCV(); }
      return _hdrdbxdiv; }
    protected ConditionValue xgetCValueHdrdbxdiv() { return xdfgetHdrdbxdiv(); }

    /**
     * Add order-by as ascend. <br>
     * HDRDBXDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hdrdbxdiv_Asc() { regOBA("HDRDBXDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRDBXDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Hdrdbxdiv_Desc() { regOBD("HDRDBXDIV"); return this; }

    protected ConditionValue _inotrfsldiv;
    public ConditionValue xdfgetInotrfsldiv()
    { if (_inotrfsldiv == null) { _inotrfsldiv = nCV(); }
      return _inotrfsldiv; }
    protected ConditionValue xgetCValueInotrfsldiv() { return xdfgetInotrfsldiv(); }

    /**
     * Add order-by as ascend. <br>
     * INOTRFSLDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Inotrfsldiv_Asc() { regOBA("INOTRFSLDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOTRFSLDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Inotrfsldiv_Desc() { regOBD("INOTRFSLDIV"); return this; }

    protected ConditionValue _bxmntrfsldiv;
    public ConditionValue xdfgetBxmntrfsldiv()
    { if (_bxmntrfsldiv == null) { _bxmntrfsldiv = nCV(); }
      return _bxmntrfsldiv; }
    protected ConditionValue xgetCValueBxmntrfsldiv() { return xdfgetBxmntrfsldiv(); }

    /**
     * Add order-by as ascend. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Bxmntrfsldiv_Asc() { regOBA("BXMNTRFSLDIV"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Bxmntrfsldiv_Desc() { regOBD("BXMNTRFSLDIV"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Slpmrgtmg_Asc() { regOBA("SLPMRGTMG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPMRGTMG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slpmrgtmg_Desc() { regOBD("SLPMRGTMG"); return this; }

    protected ConditionValue _slpotymd;
    public ConditionValue xdfgetSlpotymd()
    { if (_slpotymd == null) { _slpotymd = nCV(); }
      return _slpotymd; }
    protected ConditionValue xgetCValueSlpotymd() { return xdfgetSlpotymd(); }

    /**
     * Add order-by as ascend. <br>
     * SLPOTYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slpotymd_Asc() { regOBA("SLPOTYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPOTYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slpotymd_Desc() { regOBD("SLPOTYMD"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_Cmpcd_Asc() { regOBA("CMPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CMPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Cmpcd_Desc() { regOBD("CMPCD"); return this; }

    protected ConditionValue _stscd;
    public ConditionValue xdfgetStscd()
    { if (_stscd == null) { _stscd = nCV(); }
      return _stscd; }
    protected ConditionValue xgetCValueStscd() { return xdfgetStscd(); }

    /**
     * Add order-by as ascend. <br>
     * STSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Stscd_Asc() { regOBA("STSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Stscd_Desc() { regOBD("STSCD"); return this; }

    protected ConditionValue _stgval;
    public ConditionValue xdfgetStgval()
    { if (_stgval == null) { _stgval = nCV(); }
      return _stgval; }
    protected ConditionValue xgetCValueStgval() { return xdfgetStgval(); }

    /**
     * Add order-by as ascend. <br>
     * STGVAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Stgval_Asc() { regOBA("STGVAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * STGVAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Stgval_Desc() { regOBD("STGVAL"); return this; }

    protected ConditionValue _slpno;
    public ConditionValue xdfgetSlpno()
    { if (_slpno == null) { _slpno = nCV(); }
      return _slpno; }
    protected ConditionValue xgetCValueSlpno() { return xdfgetSlpno(); }

    /**
     * Add order-by as ascend. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slpno_Asc() { regOBA("SLPNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Slpno_Desc() { regOBD("SLPNO"); return this; }

    protected ConditionValue _tttopdedrnk;
    public ConditionValue xdfgetTttopdedrnk()
    { if (_tttopdedrnk == null) { _tttopdedrnk = nCV(); }
      return _tttopdedrnk; }
    protected ConditionValue xgetCValueTttopdedrnk() { return xdfgetTttopdedrnk(); }

    /**
     * Add order-by as ascend. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Tttopdedrnk_Asc() { regOBA("TTTOPDEDRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Tttopdedrnk_Desc() { regOBD("TTTOPDEDRNK"); return this; }

    protected ConditionValue _cordrcvcnt;
    public ConditionValue xdfgetCordrcvcnt()
    { if (_cordrcvcnt == null) { _cordrcvcnt = nCV(); }
      return _cordrcvcnt; }
    protected ConditionValue xgetCValueCordrcvcnt() { return xdfgetCordrcvcnt(); }

    /**
     * Add order-by as ascend. <br>
     * CORDRCVCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Cordrcvcnt_Asc() { regOBA("CORDRCVCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORDRCVCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Cordrcvcnt_Desc() { regOBD("CORDRCVCNT"); return this; }

    protected ConditionValue _orddvfg;
    public ConditionValue xdfgetOrddvfg()
    { if (_orddvfg == null) { _orddvfg = nCV(); }
      return _orddvfg; }
    protected ConditionValue xgetCValueOrddvfg() { return xdfgetOrddvfg(); }

    /**
     * Add order-by as ascend. <br>
     * ORDDVFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Orddvfg_Asc() { regOBA("ORDDVFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDDVFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Orddvfg_Desc() { regOBD("ORDDVFG"); return this; }

    protected ConditionValue _lbcbqa;
    public ConditionValue xdfgetLbcbqa()
    { if (_lbcbqa == null) { _lbcbqa = nCV(); }
      return _lbcbqa; }
    protected ConditionValue xgetCValueLbcbqa() { return xdfgetLbcbqa(); }

    /**
     * Add order-by as ascend. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lbcbqa_Asc() { regOBA("LBCBQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lbcbqa_Desc() { regOBD("LBCBQA"); return this; }

    protected ConditionValue _drclstlbcbid;
    public ConditionValue xdfgetDrclstlbcbid()
    { if (_drclstlbcbid == null) { _drclstlbcbid = nCV(); }
      return _drclstlbcbid; }
    protected ConditionValue xgetCValueDrclstlbcbid() { return xdfgetDrclstlbcbid(); }

    /**
     * Add order-by as ascend. <br>
     * DRCLSTLBCBID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Drclstlbcbid_Asc() { regOBA("DRCLSTLBCBID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DRCLSTLBCBID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Drclstlbcbid_Desc() { regOBD("DRCLSTLBCBID"); return this; }

    protected ConditionValue _lbboxno;
    public ConditionValue xdfgetLbboxno()
    { if (_lbboxno == null) { _lbboxno = nCV(); }
      return _lbboxno; }
    protected ConditionValue xgetCValueLbboxno() { return xdfgetLbboxno(); }

    /**
     * Add order-by as ascend. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lbboxno_Asc() { regOBA("LBBOXNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lbboxno_Desc() { regOBD("LBBOXNO"); return this; }

    protected ConditionValue _lbttboxqa;
    public ConditionValue xdfgetLbttboxqa()
    { if (_lbttboxqa == null) { _lbttboxqa = nCV(); }
      return _lbttboxqa; }
    protected ConditionValue xgetCValueLbttboxqa() { return xdfgetLbttboxqa(); }

    /**
     * Add order-by as ascend. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lbttboxqa_Asc() { regOBA("LBTTBOXQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Lbttboxqa_Desc() { regOBD("LBTTBOXQA"); return this; }

    protected ConditionValue _ikeiincldflg;
    public ConditionValue xdfgetIkeiincldflg()
    { if (_ikeiincldflg == null) { _ikeiincldflg = nCV(); }
      return _ikeiincldflg; }
    protected ConditionValue xgetCValueIkeiincldflg() { return xdfgetIkeiincldflg(); }

    /**
     * Add order-by as ascend. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ikeiincldflg_Asc() { regOBA("IKEIINCLDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_Ikeiincldflg_Desc() { regOBD("IKEIINCLDFLG"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCorddtaamCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCorddtaamCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCorddtaamCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCorddtaamCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TCorddtaamCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCorddtaamCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCorddtaamCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCorddtaamCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCorddtaamCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCorddtaamCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCorddtaamCQ> _myselfExistsMap;
    public Map<String, TCorddtaamCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCorddtaamCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCorddtaamCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCorddtaamCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCorddtaamCB.class.getName(); }
    protected String xCQ() { return TCorddtaamCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
