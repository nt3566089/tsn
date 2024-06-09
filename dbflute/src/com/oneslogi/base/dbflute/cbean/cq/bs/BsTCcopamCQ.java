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
 * The base condition-query of T_CCOPAM.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCcopamCQ extends AbstractBsTCcopamCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCcopamCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCcopamCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CCOPAM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCcopamCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCcopamCIQ xcreateCIQ() {
        TCcopamCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCcopamCIQ xnewCIQ() {
        return new TCcopamCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CCOPAM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCcopamCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCcopamCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ccopamId;
    public ConditionValue xdfgetCcopamId()
    { if (_ccopamId == null) { _ccopamId = nCV(); }
      return _ccopamId; }
    protected ConditionValue xgetCValueCcopamId() { return xdfgetCcopamId(); }

    /**
     * Add order-by as ascend. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_CcopamId_Asc() { regOBA("CCOPAM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CCOPAM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_CcopamId_Desc() { regOBD("CCOPAM_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTCcopamCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _snno1;
    public ConditionValue xdfgetSnno1()
    { if (_snno1 == null) { _snno1 = nCV(); }
      return _snno1; }
    protected ConditionValue xgetCValueSnno1() { return xdfgetSnno1(); }

    /**
     * Add order-by as ascend. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snno1_Asc() { regOBA("SNNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNNO1: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snno1_Desc() { regOBD("SNNO1"); return this; }

    protected ConditionValue _snno2;
    public ConditionValue xdfgetSnno2()
    { if (_snno2 == null) { _snno2 = nCV(); }
      return _snno2; }
    protected ConditionValue xgetCValueSnno2() { return xdfgetSnno2(); }

    /**
     * Add order-by as ascend. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snno2_Asc() { regOBA("SNNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNNO2: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snno2_Desc() { regOBD("SNNO2"); return this; }

    protected ConditionValue _snno3;
    public ConditionValue xdfgetSnno3()
    { if (_snno3 == null) { _snno3 = nCV(); }
      return _snno3; }
    protected ConditionValue xgetCValueSnno3() { return xdfgetSnno3(); }

    /**
     * Add order-by as ascend. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snno3_Asc() { regOBA("SNNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNNO3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snno3_Desc() { regOBD("SNNO3"); return this; }

    protected ConditionValue _carno;
    public ConditionValue xdfgetCarno()
    { if (_carno == null) { _carno = nCV(); }
      return _carno; }
    protected ConditionValue xgetCValueCarno() { return xdfgetCarno(); }

    /**
     * Add order-by as ascend. <br>
     * CARNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Carno_Asc() { regOBA("CARNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Carno_Desc() { regOBD("CARNO"); return this; }

    protected ConditionValue _snymd;
    public ConditionValue xdfgetSnymd()
    { if (_snymd == null) { _snymd = nCV(); }
      return _snymd; }
    protected ConditionValue xgetCValueSnymd() { return xdfgetSnymd(); }

    /**
     * Add order-by as ascend. <br>
     * SNYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snymd_Asc() { regOBA("SNYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Snymd_Desc() { regOBD("SNYMD"); return this; }

    protected ConditionValue _arvymd;
    public ConditionValue xdfgetArvymd()
    { if (_arvymd == null) { _arvymd = nCV(); }
      return _arvymd; }
    protected ConditionValue xgetCValueArvymd() { return xdfgetArvymd(); }

    /**
     * Add order-by as ascend. <br>
     * ARVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Arvymd_Asc() { regOBA("ARVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Arvymd_Desc() { regOBD("ARVYMD"); return this; }

    protected ConditionValue _sfcd;
    public ConditionValue xdfgetSfcd()
    { if (_sfcd == null) { _sfcd = nCV(); }
      return _sfcd; }
    protected ConditionValue xgetCValueSfcd() { return xdfgetSfcd(); }

    /**
     * Add order-by as ascend. <br>
     * SFCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Sfcd_Asc() { regOBA("SFCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Sfcd_Desc() { regOBD("SFCD"); return this; }

    protected ConditionValue _stcd;
    public ConditionValue xdfgetStcd()
    { if (_stcd == null) { _stcd = nCV(); }
      return _stcd; }
    protected ConditionValue xgetCValueStcd() { return xdfgetStcd(); }

    /**
     * Add order-by as ascend. <br>
     * STCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Stcd_Asc() { regOBA("STCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Stcd_Desc() { regOBD("STCD"); return this; }

    protected ConditionValue _gnlpltqa;
    public ConditionValue xdfgetGnlpltqa()
    { if (_gnlpltqa == null) { _gnlpltqa = nCV(); }
      return _gnlpltqa; }
    protected ConditionValue xgetCValueGnlpltqa() { return xdfgetGnlpltqa(); }

    /**
     * Add order-by as ascend. <br>
     * GNLPLTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Gnlpltqa_Asc() { regOBA("GNLPLTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * GNLPLTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Gnlpltqa_Desc() { regOBD("GNLPLTQA"); return this; }

    protected ConditionValue _otpltqa;
    public ConditionValue xdfgetOtpltqa()
    { if (_otpltqa == null) { _otpltqa = nCV(); }
      return _otpltqa; }
    protected ConditionValue xgetCValueOtpltqa() { return xdfgetOtpltqa(); }

    /**
     * Add order-by as ascend. <br>
     * OTPLTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Otpltqa_Asc() { regOBA("OTPLTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTPLTQA: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Otpltqa_Desc() { regOBD("OTPLTQA"); return this; }

    protected ConditionValue _plncarknd;
    public ConditionValue xdfgetPlncarknd()
    { if (_plncarknd == null) { _plncarknd = nCV(); }
      return _plncarknd; }
    protected ConditionValue xgetCValuePlncarknd() { return xdfgetPlncarknd(); }

    /**
     * Add order-by as ascend. <br>
     * PLNCARKND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Plncarknd_Asc() { regOBA("PLNCARKND"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLNCARKND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Plncarknd_Desc() { regOBD("PLNCARKND"); return this; }

    protected ConditionValue _amcarknd;
    public ConditionValue xdfgetAmcarknd()
    { if (_amcarknd == null) { _amcarknd = nCV(); }
      return _amcarknd; }
    protected ConditionValue xgetCValueAmcarknd() { return xdfgetAmcarknd(); }

    /**
     * Add order-by as ascend. <br>
     * AMCARKND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Amcarknd_Asc() { regOBA("AMCARKND"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMCARKND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Amcarknd_Desc() { regOBD("AMCARKND"); return this; }

    protected ConditionValue _selno1;
    public ConditionValue xdfgetSelno1()
    { if (_selno1 == null) { _selno1 = nCV(); }
      return _selno1; }
    protected ConditionValue xgetCValueSelno1() { return xdfgetSelno1(); }

    /**
     * Add order-by as ascend. <br>
     * SELNO1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Selno1_Asc() { regOBA("SELNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELNO1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Selno1_Desc() { regOBD("SELNO1"); return this; }

    protected ConditionValue _selno2;
    public ConditionValue xdfgetSelno2()
    { if (_selno2 == null) { _selno2 = nCV(); }
      return _selno2; }
    protected ConditionValue xgetCValueSelno2() { return xdfgetSelno2(); }

    /**
     * Add order-by as ascend. <br>
     * SELNO2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Selno2_Asc() { regOBA("SELNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELNO2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Selno2_Desc() { regOBD("SELNO2"); return this; }

    protected ConditionValue _selno3;
    public ConditionValue xdfgetSelno3()
    { if (_selno3 == null) { _selno3 = nCV(); }
      return _selno3; }
    protected ConditionValue xgetCValueSelno3() { return xdfgetSelno3(); }

    /**
     * Add order-by as ascend. <br>
     * SELNO3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Selno3_Asc() { regOBA("SELNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELNO3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Selno3_Desc() { regOBD("SELNO3"); return this; }

    protected ConditionValue _trannm;
    public ConditionValue xdfgetTrannm()
    { if (_trannm == null) { _trannm = nCV(); }
      return _trannm; }
    protected ConditionValue xgetCValueTrannm() { return xdfgetTrannm(); }

    /**
     * Add order-by as ascend. <br>
     * TRANNM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Trannm_Asc() { regOBA("TRANNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANNM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Trannm_Desc() { regOBD("TRANNM"); return this; }

    protected ConditionValue _chgid;
    public ConditionValue xdfgetChgid()
    { if (_chgid == null) { _chgid = nCV(); }
      return _chgid; }
    protected ConditionValue xgetCValueChgid() { return xdfgetChgid(); }

    /**
     * Add order-by as ascend. <br>
     * CHGID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Chgid_Asc() { regOBA("CHGID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHGID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Chgid_Desc() { regOBD("CHGID"); return this; }

    protected ConditionValue _tdrelayid;
    public ConditionValue xdfgetTdrelayid()
    { if (_tdrelayid == null) { _tdrelayid = nCV(); }
      return _tdrelayid; }
    protected ConditionValue xgetCValueTdrelayid() { return xdfgetTdrelayid(); }

    /**
     * Add order-by as ascend. <br>
     * TDRELAYID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Tdrelayid_Asc() { regOBA("TDRELAYID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDRELAYID: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_Tdrelayid_Desc() { regOBD("TDRELAYID"); return this; }

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
    public BsTCcopamCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCcopamCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCcopamCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCcopamCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCcopamCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCcopamCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCcopamCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCcopamCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCcopamCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCcopamCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCcopamCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCcopamCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TCcopamCQ bq = (TCcopamCQ)bqs;
        TCcopamCQ uq = (TCcopamCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_CCOPAM", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_CCOPAM", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TCcopamCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCcopamCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCcopamCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCcopamCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCcopamCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCcopamCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCcopamCQ> _myselfExistsMap;
    public Map<String, TCcopamCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCcopamCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCcopamCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCcopamCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCcopamCB.class.getName(); }
    protected String xCQ() { return TCcopamCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
