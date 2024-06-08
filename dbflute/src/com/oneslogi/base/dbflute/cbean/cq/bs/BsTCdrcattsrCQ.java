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
 * The base condition-query of T_CDRCATTSR.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCdrcattsrCQ extends AbstractBsTCdrcattsrCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCdrcattsrCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCdrcattsrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CDRCATTSR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCdrcattsrCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCdrcattsrCIQ xcreateCIQ() {
        TCdrcattsrCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCdrcattsrCIQ xnewCIQ() {
        return new TCdrcattsrCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CDRCATTSR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCdrcattsrCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCdrcattsrCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _houmenSortId;
    public ConditionValue xdfgetHoumenSortId()
    { if (_houmenSortId == null) { _houmenSortId = nCV(); }
      return _houmenSortId; }
    protected ConditionValue xgetCValueHoumenSortId() { return xdfgetHoumenSortId(); }

    /**
     * Add order-by as ascend. <br>
     * HOUMEN_SORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_HoumenSortId_Asc() { regOBA("HOUMEN_SORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HOUMEN_SORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_HoumenSortId_Desc() { regOBD("HOUMEN_SORT_ID"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

    protected ConditionValue _drccd;
    public ConditionValue xdfgetDrccd()
    { if (_drccd == null) { _drccd = nCV(); }
      return _drccd; }
    protected ConditionValue xgetCValueDrccd() { return xdfgetDrccd(); }

    /**
     * Add order-by as ascend. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Drccd_Asc() { regOBA("DRCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DRCCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Drccd_Desc() { regOBD("DRCCD"); return this; }

    protected ConditionValue _zzpstnid;
    public ConditionValue xdfgetZzpstnid()
    { if (_zzpstnid == null) { _zzpstnid = nCV(); }
      return _zzpstnid; }
    protected ConditionValue xgetCValueZzpstnid() { return xdfgetZzpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Zzpstnid_Asc() { regOBA("ZZPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZPSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Zzpstnid_Desc() { regOBD("ZZPSTNID"); return this; }

    protected ConditionValue _srlin;
    public ConditionValue xdfgetSrlin()
    { if (_srlin == null) { _srlin = nCV(); }
      return _srlin; }
    protected ConditionValue xgetCValueSrlin() { return xdfgetSrlin(); }

    /**
     * Add order-by as ascend. <br>
     * SRLIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Srlin_Asc() { regOBA("SRLIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Srlin_Desc() { regOBD("SRLIN"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

    protected ConditionValue _snmprtrnkad;
    public ConditionValue xdfgetSnmprtrnkad()
    { if (_snmprtrnkad == null) { _snmprtrnkad = nCV(); }
      return _snmprtrnkad; }
    protected ConditionValue xgetCValueSnmprtrnkad() { return xdfgetSnmprtrnkad(); }

    /**
     * Add order-by as ascend. <br>
     * SNMPRTRNKAD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Snmprtrnkad_Asc() { regOBA("SNMPRTRNKAD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNMPRTRNKAD: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Snmprtrnkad_Desc() { regOBD("SNMPRTRNKAD"); return this; }

    protected ConditionValue _srwkdy;
    public ConditionValue xdfgetSrwkdy()
    { if (_srwkdy == null) { _srwkdy = nCV(); }
      return _srwkdy; }
    protected ConditionValue xgetCValueSrwkdy() { return xdfgetSrwkdy(); }

    /**
     * Add order-by as ascend. <br>
     * SRWKDY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Srwkdy_Asc() { regOBA("SRWKDY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRWKDY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Srwkdy_Desc() { regOBD("SRWKDY"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Comt_Asc() { regOBA("COMT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Comt_Desc() { regOBD("COMT"); return this; }

    protected ConditionValue _sprprsid;
    public ConditionValue xdfgetSprprsid()
    { if (_sprprsid == null) { _sprprsid = nCV(); }
      return _sprprsid; }
    protected ConditionValue xgetCValueSprprsid() { return xdfgetSprprsid(); }

    /**
     * Add order-by as ascend. <br>
     * SPRPRSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Sprprsid_Asc() { regOBA("SPRPRSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRPRSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Sprprsid_Desc() { regOBD("SPRPRSID"); return this; }

    protected ConditionValue _oddvid;
    public ConditionValue xdfgetOddvid()
    { if (_oddvid == null) { _oddvid = nCV(); }
      return _oddvid; }
    protected ConditionValue xgetCValueOddvid() { return xdfgetOddvid(); }

    /**
     * Add order-by as ascend. <br>
     * ODDVID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Oddvid_Asc() { regOBA("ODDVID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ODDVID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Oddvid_Desc() { regOBD("ODDVID"); return this; }

    protected ConditionValue _hdrdbxusid;
    public ConditionValue xdfgetHdrdbxusid()
    { if (_hdrdbxusid == null) { _hdrdbxusid = nCV(); }
      return _hdrdbxusid; }
    protected ConditionValue xgetCValueHdrdbxusid() { return xdfgetHdrdbxusid(); }

    /**
     * Add order-by as ascend. <br>
     * HDRDBXUSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Hdrdbxusid_Asc() { regOBA("HDRDBXUSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRDBXUSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Hdrdbxusid_Desc() { regOBD("HDRDBXUSID"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _ioid;
    public ConditionValue xdfgetIoid()
    { if (_ioid == null) { _ioid = nCV(); }
      return _ioid; }
    protected ConditionValue xgetCValueIoid() { return xdfgetIoid(); }

    /**
     * Add order-by as ascend. <br>
     * IOID: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Ioid_Asc() { regOBA("IOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IOID: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Ioid_Desc() { regOBD("IOID"); return this; }

    protected ConditionValue _wrkmfg;
    public ConditionValue xdfgetWrkmfg()
    { if (_wrkmfg == null) { _wrkmfg = nCV(); }
      return _wrkmfg; }
    protected ConditionValue xgetCValueWrkmfg() { return xdfgetWrkmfg(); }

    /**
     * Add order-by as ascend. <br>
     * WRKMFG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Wrkmfg_Asc() { regOBA("WRKMFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRKMFG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Wrkmfg_Desc() { regOBD("WRKMFG"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_Ikeiincldflg_Asc() { regOBA("IKEIINCLDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_Ikeiincldflg_Desc() { regOBD("IKEIINCLDFLG"); return this; }

    protected ConditionValue _sortDate;
    public ConditionValue xdfgetSortDate()
    { if (_sortDate == null) { _sortDate = nCV(); }
      return _sortDate; }
    protected ConditionValue xgetCValueSortDate() { return xdfgetSortDate(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_SortDate_Asc() { regOBA("SORT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_SortDate_Desc() { regOBD("SORT_DATE"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCdrcattsrCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCdrcattsrCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCdrcattsrCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCdrcattsrCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TCdrcattsrCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCdrcattsrCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCdrcattsrCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCdrcattsrCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCdrcattsrCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCdrcattsrCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCdrcattsrCQ> _myselfExistsMap;
    public Map<String, TCdrcattsrCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCdrcattsrCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCdrcattsrCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCdrcattsrCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCdrcattsrCB.class.getName(); }
    protected String xCQ() { return TCdrcattsrCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
