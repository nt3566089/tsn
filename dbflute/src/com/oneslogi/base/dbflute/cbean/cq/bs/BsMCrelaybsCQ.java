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
 * The base condition-query of M_CRELAYBS.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCrelaybsCQ extends AbstractBsMCrelaybsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCrelaybsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCrelaybsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CRELAYBS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCrelaybsCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCrelaybsCIQ xcreateCIQ() {
        MCrelaybsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCrelaybsCIQ xnewCIQ() {
        return new MCrelaybsCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CRELAYBS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCrelaybsCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCrelaybsCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _crelaybsId;
    public ConditionValue xdfgetCrelaybsId()
    { if (_crelaybsId == null) { _crelaybsId = nCV(); }
      return _crelaybsId; }
    protected ConditionValue xgetCValueCrelaybsId() { return xdfgetCrelaybsId(); }

    /**
     * Add order-by as ascend. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_CrelaybsId_Asc() { regOBA("CRELAYBS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CRELAYBS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_CrelaybsId_Desc() { regOBD("CRELAYBS_ID"); return this; }

    protected ConditionValue _rlybscd;
    public ConditionValue xdfgetRlybscd()
    { if (_rlybscd == null) { _rlybscd = nCV(); }
      return _rlybscd; }
    protected ConditionValue xgetCValueRlybscd() { return xdfgetRlybscd(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybscd_Asc() { regOBA("RLYBSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybscd_Desc() { regOBD("RLYBSCD"); return this; }

    protected ConditionValue _dlvdpcd;
    public ConditionValue xdfgetDlvdpcd()
    { if (_dlvdpcd == null) { _dlvdpcd = nCV(); }
      return _dlvdpcd; }
    protected ConditionValue xgetCValueDlvdpcd() { return xdfgetDlvdpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Dlvdpcd_Asc() { regOBA("DLVDPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVDPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Dlvdpcd_Desc() { regOBD("DLVDPCD"); return this; }

    protected ConditionValue _rlybsnm;
    public ConditionValue xdfgetRlybsnm()
    { if (_rlybsnm == null) { _rlybsnm = nCV(); }
      return _rlybsnm; }
    protected ConditionValue xgetCValueRlybsnm() { return xdfgetRlybsnm(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsnm_Asc() { regOBA("RLYBSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSNM: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsnm_Desc() { regOBD("RLYBSNM"); return this; }

    protected ConditionValue _rlybssnm;
    public ConditionValue xdfgetRlybssnm()
    { if (_rlybssnm == null) { _rlybssnm = nCV(); }
      return _rlybssnm; }
    protected ConditionValue xgetCValueRlybssnm() { return xdfgetRlybssnm(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybssnm_Asc() { regOBA("RLYBSSNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSSNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybssnm_Desc() { regOBD("RLYBSSNM"); return this; }

    protected ConditionValue _rlybsp;
    public ConditionValue xdfgetRlybsp()
    { if (_rlybsp == null) { _rlybsp = nCV(); }
      return _rlybsp; }
    protected ConditionValue xgetCValueRlybsp() { return xdfgetRlybsp(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsp_Asc() { regOBA("RLYBSP"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSP: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsp_Desc() { regOBD("RLYBSP"); return this; }

    protected ConditionValue _rlybsacd;
    public ConditionValue xdfgetRlybsacd()
    { if (_rlybsacd == null) { _rlybsacd = nCV(); }
      return _rlybsacd; }
    protected ConditionValue xgetCValueRlybsacd() { return xdfgetRlybsacd(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsacd_Asc() { regOBA("RLYBSACD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSACD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsacd_Desc() { regOBD("RLYBSACD"); return this; }

    protected ConditionValue _rlybsccd;
    public ConditionValue xdfgetRlybsccd()
    { if (_rlybsccd == null) { _rlybsccd = nCV(); }
      return _rlybsccd; }
    protected ConditionValue xgetCValueRlybsccd() { return xdfgetRlybsccd(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsccd_Asc() { regOBA("RLYBSCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsccd_Desc() { regOBD("RLYBSCCD"); return this; }

    protected ConditionValue _rlybsar;
    public ConditionValue xdfgetRlybsar()
    { if (_rlybsar == null) { _rlybsar = nCV(); }
      return _rlybsar; }
    protected ConditionValue xgetCValueRlybsar() { return xdfgetRlybsar(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsar_Asc() { regOBA("RLYBSAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSAR: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsar_Desc() { regOBD("RLYBSAR"); return this; }

    protected ConditionValue _rlybstl;
    public ConditionValue xdfgetRlybstl()
    { if (_rlybstl == null) { _rlybstl = nCV(); }
      return _rlybstl; }
    protected ConditionValue xgetCValueRlybstl() { return xdfgetRlybstl(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSTL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybstl_Asc() { regOBA("RLYBSTL"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSTL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybstl_Desc() { regOBD("RLYBSTL"); return this; }

    protected ConditionValue _rlybsfn;
    public ConditionValue xdfgetRlybsfn()
    { if (_rlybsfn == null) { _rlybsfn = nCV(); }
      return _rlybsfn; }
    protected ConditionValue xgetCValueRlybsfn() { return xdfgetRlybsfn(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSFN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsfn_Asc() { regOBA("RLYBSFN"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSFN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsfn_Desc() { regOBD("RLYBSFN"); return this; }

    protected ConditionValue _rlybsid;
    public ConditionValue xdfgetRlybsid()
    { if (_rlybsid == null) { _rlybsid = nCV(); }
      return _rlybsid; }
    protected ConditionValue xgetCValueRlybsid() { return xdfgetRlybsid(); }

    /**
     * Add order-by as ascend. <br>
     * RLYBSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsid_Asc() { regOBA("RLYBSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYBSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlybsid_Desc() { regOBD("RLYBSID"); return this; }

    protected ConditionValue _rlyshan;
    public ConditionValue xdfgetRlyshan()
    { if (_rlyshan == null) { _rlyshan = nCV(); }
      return _rlyshan; }
    protected ConditionValue xgetCValueRlyshan() { return xdfgetRlyshan(); }

    /**
     * Add order-by as ascend. <br>
     * RLYSHAN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlyshan_Asc() { regOBA("RLYSHAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * RLYSHAN: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rlyshan_Desc() { regOBD("RLYSHAN"); return this; }

    protected ConditionValue _delymd;
    public ConditionValue xdfgetDelymd()
    { if (_delymd == null) { _delymd = nCV(); }
      return _delymd; }
    protected ConditionValue xgetCValueDelymd() { return xdfgetDelymd(); }

    /**
     * Add order-by as ascend. <br>
     * DELYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Delymd_Asc() { regOBA("DELYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Delymd_Desc() { regOBD("DELYMD"); return this; }

    protected ConditionValue _chngyd;
    public ConditionValue xdfgetChngyd()
    { if (_chngyd == null) { _chngyd = nCV(); }
      return _chngyd; }
    protected ConditionValue xgetCValueChngyd() { return xdfgetChngyd(); }

    /**
     * Add order-by as ascend. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Chngyd_Asc() { regOBA("CHNGYD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHNGYD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Chngyd_Desc() { regOBD("CHNGYD"); return this; }

    protected ConditionValue _updtm;
    public ConditionValue xdfgetUpdtm()
    { if (_updtm == null) { _updtm = nCV(); }
      return _updtm; }
    protected ConditionValue xgetCValueUpdtm() { return xdfgetUpdtm(); }

    /**
     * Add order-by as ascend. <br>
     * UPDTM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Updtm_Asc() { regOBA("UPDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDTM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Updtm_Desc() { regOBD("UPDTM"); return this; }

    protected ConditionValue _zzfrdateh;
    public ConditionValue xdfgetZzfrdateh()
    { if (_zzfrdateh == null) { _zzfrdateh = nCV(); }
      return _zzfrdateh; }
    protected ConditionValue xgetCValueZzfrdateh() { return xdfgetZzfrdateh(); }

    /**
     * Add order-by as ascend. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Zzfrdateh_Asc() { regOBA("ZZFRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Zzfrdateh_Desc() { regOBD("ZZFRDATEH"); return this; }

    protected ConditionValue _zztodateh;
    public ConditionValue xdfgetZztodateh()
    { if (_zztodateh == null) { _zztodateh = nCV(); }
      return _zztodateh; }
    protected ConditionValue xgetCValueZztodateh() { return xdfgetZztodateh(); }

    /**
     * Add order-by as ascend. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Zztodateh_Asc() { regOBA("ZZTODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTODATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Zztodateh_Desc() { regOBD("ZZTODATEH"); return this; }

    protected ConditionValue _rcdupdps;
    public ConditionValue xdfgetRcdupdps()
    { if (_rcdupdps == null) { _rcdupdps = nCV(); }
      return _rcdupdps; }
    protected ConditionValue xgetCValueRcdupdps() { return xdfgetRcdupdps(); }

    /**
     * Add order-by as ascend. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rcdupdps_Asc() { regOBA("RCDUPDPS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCDUPDPS: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Rcdupdps_Desc() { regOBD("RCDUPDPS"); return this; }

    protected ConditionValue _updpocd;
    public ConditionValue xdfgetUpdpocd()
    { if (_updpocd == null) { _updpocd = nCV(); }
      return _updpocd; }
    protected ConditionValue xgetCValueUpdpocd() { return xdfgetUpdpocd(); }

    /**
     * Add order-by as ascend. <br>
     * UPDPOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Updpocd_Asc() { regOBA("UPDPOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDPOCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Updpocd_Desc() { regOBD("UPDPOCD"); return this; }

    protected ConditionValue _otcmpfg;
    public ConditionValue xdfgetOtcmpfg()
    { if (_otcmpfg == null) { _otcmpfg = nCV(); }
      return _otcmpfg; }
    protected ConditionValue xgetCValueOtcmpfg() { return xdfgetOtcmpfg(); }

    /**
     * Add order-by as ascend. <br>
     * OTCMPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Otcmpfg_Asc() { regOBA("OTCMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTCMPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Otcmpfg_Desc() { regOBD("OTCMPFG"); return this; }

    protected ConditionValue _tmcmpfg;
    public ConditionValue xdfgetTmcmpfg()
    { if (_tmcmpfg == null) { _tmcmpfg = nCV(); }
      return _tmcmpfg; }
    protected ConditionValue xgetCValueTmcmpfg() { return xdfgetTmcmpfg(); }

    /**
     * Add order-by as ascend. <br>
     * TMCMPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Tmcmpfg_Asc() { regOBA("TMCMPFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TMCMPFG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Tmcmpfg_Desc() { regOBD("TMCMPFG"); return this; }

    protected ConditionValue _stmid;
    public ConditionValue xdfgetStmid()
    { if (_stmid == null) { _stmid = nCV(); }
      return _stmid; }
    protected ConditionValue xgetCValueStmid() { return xdfgetStmid(); }

    /**
     * Add order-by as ascend. <br>
     * STMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Stmid_Asc() { regOBA("STMID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STMID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_Stmid_Desc() { regOBD("STMID"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCrelaybsCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCrelaybsCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCrelaybsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCrelaybsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MCrelaybsCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCrelaybsCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCrelaybsCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCrelaybsCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCrelaybsCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCrelaybsCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCrelaybsCQ> _myselfExistsMap;
    public Map<String, MCrelaybsCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCrelaybsCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCrelaybsCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCrelaybsCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCrelaybsCB.class.getName(); }
    protected String xCQ() { return MCrelaybsCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
