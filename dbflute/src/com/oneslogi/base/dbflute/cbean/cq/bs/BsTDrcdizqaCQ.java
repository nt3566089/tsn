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
 * The base condition-query of T_DRCDIZQA.
 * @author DBFlute(AutoGenerator)
 */
public class BsTDrcdizqaCQ extends AbstractBsTDrcdizqaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDrcdizqaCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDrcdizqaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_DRCDIZQA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TDrcdizqaCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TDrcdizqaCIQ xcreateCIQ() {
        TDrcdizqaCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TDrcdizqaCIQ xnewCIQ() {
        return new TDrcdizqaCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_DRCDIZQA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TDrcdizqaCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TDrcdizqaCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _houmenRemainingId;
    public ConditionValue xdfgetHoumenRemainingId()
    { if (_houmenRemainingId == null) { _houmenRemainingId = nCV(); }
      return _houmenRemainingId; }
    protected ConditionValue xgetCValueHoumenRemainingId() { return xdfgetHoumenRemainingId(); }

    /**
     * Add order-by as ascend. <br>
     * HOUMEN_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_HoumenRemainingId_Asc() { regOBA("HOUMEN_REMAINING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HOUMEN_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_HoumenRemainingId_Desc() { regOBD("HOUMEN_REMAINING_ID"); return this; }

    protected ConditionValue _zzorgncd;
    public ConditionValue xdfgetZzorgncd()
    { if (_zzorgncd == null) { _zzorgncd = nCV(); }
      return _zzorgncd; }
    protected ConditionValue xgetCValueZzorgncd() { return xdfgetZzorgncd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _linblk;
    public ConditionValue xdfgetLinblk()
    { if (_linblk == null) { _linblk = nCV(); }
      return _linblk; }
    protected ConditionValue xgetCValueLinblk() { return xdfgetLinblk(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

    protected ConditionValue _srrnk;
    public ConditionValue xdfgetSrrnk()
    { if (_srrnk == null) { _srrnk = nCV(); }
      return _srrnk; }
    protected ConditionValue xgetCValueSrrnk() { return xdfgetSrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRRNK: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

    protected ConditionValue _locid;
    public ConditionValue xdfgetLocid()
    { if (_locid == null) { _locid = nCV(); }
      return _locid; }
    protected ConditionValue xgetCValueLocid() { return xdfgetLocid(); }

    /**
     * Add order-by as ascend. <br>
     * LOCID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Locid_Asc() { regOBA("LOCID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Locid_Desc() { regOBD("LOCID"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_Zzmatnr_Asc() { regOBA("ZZMATNR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZMATNR: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zzmatnr_Desc() { regOBD("ZZMATNR"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _comt;
    public ConditionValue xdfgetComt()
    { if (_comt == null) { _comt = nCV(); }
      return _comt; }
    protected ConditionValue xgetCValueComt() { return xdfgetComt(); }

    /**
     * Add order-by as ascend. <br>
     * COMT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Comt_Asc() { regOBA("COMT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Comt_Desc() { regOBD("COMT"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _csroprtcnt;
    public ConditionValue xdfgetCsroprtcnt()
    { if (_csroprtcnt == null) { _csroprtcnt = nCV(); }
      return _csroprtcnt; }
    protected ConditionValue xgetCValueCsroprtcnt() { return xdfgetCsroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * CSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Csroprtcnt_Asc() { regOBA("CSROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSROPRTCNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Csroprtcnt_Desc() { regOBD("CSROPRTCNT"); return this; }

    protected ConditionValue _cinladdrcsrrnk;
    public ConditionValue xdfgetCinladdrcsrrnk()
    { if (_cinladdrcsrrnk == null) { _cinladdrcsrrnk = nCV(); }
      return _cinladdrcsrrnk; }
    protected ConditionValue xgetCValueCinladdrcsrrnk() { return xdfgetCinladdrcsrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Cinladdrcsrrnk_Asc() { regOBA("CINLADDRCSRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * CINLADDRCSRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Cinladdrcsrrnk_Desc() { regOBD("CINLADDRCSRRNK"); return this; }

    protected ConditionValue _zqacp;
    public ConditionValue xdfgetZqacp()
    { if (_zqacp == null) { _zqacp = nCV(); }
      return _zqacp; }
    protected ConditionValue xgetCValueZqacp() { return xdfgetZqacp(); }

    /**
     * Add order-by as ascend. <br>
     * ZQACP: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zqacp_Asc() { regOBA("ZQACP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZQACP: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zqacp_Desc() { regOBD("ZQACP"); return this; }

    protected ConditionValue _zqactqa;
    public ConditionValue xdfgetZqactqa()
    { if (_zqactqa == null) { _zqactqa = nCV(); }
      return _zqactqa; }
    protected ConditionValue xgetCValueZqactqa() { return xdfgetZqactqa(); }

    /**
     * Add order-by as ascend. <br>
     * ZQACTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zqactqa_Asc() { regOBA("ZQACTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZQACTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Zqactqa_Desc() { regOBD("ZQACTQA"); return this; }

    protected ConditionValue _ssqa;
    public ConditionValue xdfgetSsqa()
    { if (_ssqa == null) { _ssqa = nCV(); }
      return _ssqa; }
    protected ConditionValue xgetCValueSsqa() { return xdfgetSsqa(); }

    /**
     * Add order-by as ascend. <br>
     * SSQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Ssqa_Asc() { regOBA("SSQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Ssqa_Desc() { regOBD("SSQA"); return this; }

    protected ConditionValue _dscb;
    public ConditionValue xdfgetDscb()
    { if (_dscb == null) { _dscb = nCV(); }
      return _dscb; }
    protected ConditionValue xgetCValueDscb() { return xdfgetDscb(); }

    /**
     * Add order-by as ascend. <br>
     * DSCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Dscb_Asc() { regOBA("DSCB"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSCB: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Dscb_Desc() { regOBD("DSCB"); return this; }

    protected ConditionValue _dsct;
    public ConditionValue xdfgetDsct()
    { if (_dsct == null) { _dsct = nCV(); }
      return _dsct; }
    protected ConditionValue xgetCValueDsct() { return xdfgetDsct(); }

    /**
     * Add order-by as ascend. <br>
     * DSCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Dsct_Asc() { regOBA("DSCT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSCT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Dsct_Desc() { regOBD("DSCT"); return this; }

    protected ConditionValue _srlin;
    public ConditionValue xdfgetSrlin()
    { if (_srlin == null) { _srlin = nCV(); }
      return _srlin; }
    protected ConditionValue xgetCValueSrlin() { return xdfgetSrlin(); }

    /**
     * Add order-by as ascend. <br>
     * SRLIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Srlin_Asc() { regOBA("SRLIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLIN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Srlin_Desc() { regOBD("SRLIN"); return this; }

    protected ConditionValue _stockdate;
    public ConditionValue xdfgetStockdate()
    { if (_stockdate == null) { _stockdate = nCV(); }
      return _stockdate; }
    protected ConditionValue xgetCValueStockdate() { return xdfgetStockdate(); }

    /**
     * Add order-by as ascend. <br>
     * STOCKDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Stockdate_Asc() { regOBA("STOCKDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCKDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_Stockdate_Desc() { regOBD("STOCKDATE"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTDrcdizqaCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTDrcdizqaCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTDrcdizqaCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTDrcdizqaCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TDrcdizqaCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TDrcdizqaCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TDrcdizqaCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TDrcdizqaCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TDrcdizqaCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TDrcdizqaCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TDrcdizqaCQ> _myselfExistsMap;
    public Map<String, TDrcdizqaCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TDrcdizqaCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TDrcdizqaCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TDrcdizqaCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TDrcdizqaCB.class.getName(); }
    protected String xCQ() { return TDrcdizqaCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
