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
 * The base condition-query of E_MH_SHIPPING.
 * @author DBFlute(AutoGenerator)
 */
public class BsEMhShippingCQ extends AbstractBsEMhShippingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EMhShippingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEMhShippingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_MH_SHIPPING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EMhShippingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EMhShippingCIQ xcreateCIQ() {
        EMhShippingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EMhShippingCIQ xnewCIQ() {
        return new EMhShippingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_MH_SHIPPING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EMhShippingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EMhShippingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _mhShippingId;
    public ConditionValue xdfgetMhShippingId()
    { if (_mhShippingId == null) { _mhShippingId = nCV(); }
      return _mhShippingId; }
    protected ConditionValue xgetCValueMhShippingId() { return xdfgetMhShippingId(); }

    /**
     * Add order-by as ascend. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_MhShippingId_Asc() { regOBA("MH_SHIPPING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_MhShippingId_Desc() { regOBD("MH_SHIPPING_ID"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Srded_Asc() { regOBA("SRDED"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRDED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Srded_Desc() { regOBD("SRDED"); return this; }

    protected ConditionValue _srpstnid;
    public ConditionValue xdfgetSrpstnid()
    { if (_srpstnid == null) { _srpstnid = nCV(); }
      return _srpstnid; }
    protected ConditionValue xgetCValueSrpstnid() { return xdfgetSrpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * SRPSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Srpstnid_Asc() { regOBA("SRPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRPSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Srpstnid_Desc() { regOBD("SRPSTNID"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Srlincd_Asc() { regOBA("SRLINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Srlincd_Desc() { regOBD("SRLINCD"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Sscd_Asc() { regOBA("SSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Sscd_Desc() { regOBD("SSCD"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Ssnm_Asc() { regOBA("SSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSNM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Ssnm_Desc() { regOBD("SSNM"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Slqacb_Asc() { regOBA("SLQACB"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQACB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Slqacb_Desc() { regOBD("SLQACB"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Slqact_Asc() { regOBA("SLQACT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQACT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Slqact_Desc() { regOBD("SLQACT"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

    protected ConditionValue _locno;
    public ConditionValue xdfgetLocno()
    { if (_locno == null) { _locno = nCV(); }
      return _locno; }
    protected ConditionValue xgetCValueLocno() { return xdfgetLocno(); }

    /**
     * Add order-by as ascend. <br>
     * LOCNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Locno_Asc() { regOBA("LOCNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Locno_Desc() { regOBD("LOCNO"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Locid_Asc() { regOBA("LOCID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Locid_Desc() { regOBD("LOCID"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Dlvprtrnk_Asc() { regOBA("DLVPRTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVPRTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dlvprtrnk_Desc() { regOBD("DLVPRTRNK"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Dlvsnm_Asc() { regOBA("DLVSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVSNM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dlvsnm_Desc() { regOBD("DLVSNM"); return this; }

    protected ConditionValue _dlvdtlsnm;
    public ConditionValue xdfgetDlvdtlsnm()
    { if (_dlvdtlsnm == null) { _dlvdtlsnm = nCV(); }
      return _dlvdtlsnm; }
    protected ConditionValue xgetCValueDlvdtlsnm() { return xdfgetDlvdtlsnm(); }

    /**
     * Add order-by as ascend. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dlvdtlsnm_Asc() { regOBA("DLVDTLSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVDTLSNM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dlvdtlsnm_Desc() { regOBD("DLVDTLSNM"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Ttsroprtcnt_Asc() { regOBA("TTSROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Ttsroprtcnt_Desc() { regOBD("TTSROPRTCNT"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Tttopdedrnk_Asc() { regOBA("TTTOPDEDRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Tttopdedrnk_Desc() { regOBD("TTTOPDEDRNK"); return this; }

    protected ConditionValue _brtyp;
    public ConditionValue xdfgetBrtyp()
    { if (_brtyp == null) { _brtyp = nCV(); }
      return _brtyp; }
    protected ConditionValue xgetCValueBrtyp() { return xdfgetBrtyp(); }

    /**
     * Add order-by as ascend. <br>
     * BRTYP: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Brtyp_Asc() { regOBA("BRTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRTYP: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Brtyp_Desc() { regOBD("BRTYP"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Boxno_Asc() { regOBA("BOXNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Boxno_Desc() { regOBD("BOXNO"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Boxnocnsnm_Asc() { regOBA("BOXNOCNSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Boxnocnsnm_Desc() { regOBD("BOXNOCNSNM"); return this; }

    protected ConditionValue _boxtyp;
    public ConditionValue xdfgetBoxtyp()
    { if (_boxtyp == null) { _boxtyp = nCV(); }
      return _boxtyp; }
    protected ConditionValue xgetCValueBoxtyp() { return xdfgetBoxtyp(); }

    /**
     * Add order-by as ascend. <br>
     * BOXTYP: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Boxtyp_Asc() { regOBA("BOXTYP"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXTYP: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Boxtyp_Desc() { regOBD("BOXTYP"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Mgboxdid_Asc() { regOBA("MGBOXDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MGBOXDID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Mgboxdid_Desc() { regOBD("MGBOXDID"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Dmdid_Asc() { regOBA("DMDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DMDID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Dmdid_Desc() { regOBD("DMDID"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Ttboxqa_Asc() { regOBA("TTBOXQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTBOXQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Ttboxqa_Desc() { regOBD("TTBOXQA"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Boxctqata_Asc() { regOBA("BOXCTQATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXCTQATA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Boxctqata_Desc() { regOBD("BOXCTQATA"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Boxctqaapsrplc_Asc() { regOBA("BOXCTQAAPSRPLC"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Boxctqaapsrplc_Desc() { regOBD("BOXCTQAAPSRPLC"); return this; }

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
    public BsEMhShippingCQ addOrderBy_Drclstlbcbid_Asc() { regOBA("DRCLSTLBCBID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DRCLSTLBCBID: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Drclstlbcbid_Desc() { regOBD("DRCLSTLBCBID"); return this; }

    protected ConditionValue _lbboxno;
    public ConditionValue xdfgetLbboxno()
    { if (_lbboxno == null) { _lbboxno = nCV(); }
      return _lbboxno; }
    protected ConditionValue xgetCValueLbboxno() { return xdfgetLbboxno(); }

    /**
     * Add order-by as ascend. <br>
     * LBBOXNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Lbboxno_Asc() { regOBA("LBBOXNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBBOXNO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Lbboxno_Desc() { regOBD("LBBOXNO"); return this; }

    protected ConditionValue _lbttboxqa;
    public ConditionValue xdfgetLbttboxqa()
    { if (_lbttboxqa == null) { _lbttboxqa = nCV(); }
      return _lbttboxqa; }
    protected ConditionValue xgetCValueLbttboxqa() { return xdfgetLbttboxqa(); }

    /**
     * Add order-by as ascend. <br>
     * LBTTBOXQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Lbttboxqa_Asc() { regOBA("LBTTBOXQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * LBTTBOXQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_Lbttboxqa_Desc() { regOBD("LBTTBOXQA"); return this; }

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
    public BsEMhShippingCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

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
    public BsEMhShippingCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

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
    public BsEMhShippingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEMhShippingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEMhShippingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEMhShippingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEMhShippingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEMhShippingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEMhShippingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEMhShippingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEMhShippingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEMhShippingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEMhShippingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEMhShippingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EMhShippingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EMhShippingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EMhShippingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EMhShippingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EMhShippingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EMhShippingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EMhShippingCQ> _myselfExistsMap;
    public Map<String, EMhShippingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EMhShippingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EMhShippingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EMhShippingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EMhShippingCB.class.getName(); }
    protected String xCQ() { return EMhShippingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
