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
 * The base condition-query of E_CCOPAM_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsECcopamSendCQ extends AbstractBsECcopamSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ECcopamSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsECcopamSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_CCOPAM_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ECcopamSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ECcopamSendCIQ xcreateCIQ() {
        ECcopamSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ECcopamSendCIQ xnewCIQ() {
        return new ECcopamSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_CCOPAM_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ECcopamSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ECcopamSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ccopamSendId;
    public ConditionValue xdfgetCcopamSendId()
    { if (_ccopamSendId == null) { _ccopamSendId = nCV(); }
      return _ccopamSendId; }
    protected ConditionValue xgetCValueCcopamSendId() { return xdfgetCcopamSendId(); }

    /**
     * Add order-by as ascend. <br>
     * CCOPAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_CcopamSendId_Asc() { regOBA("CCOPAM_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CCOPAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_CcopamSendId_Desc() { regOBD("CCOPAM_SEND_ID"); return this; }

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
    public BsECcopamSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _ccopamId;
    public ConditionValue xdfgetCcopamId()
    { if (_ccopamId == null) { _ccopamId = nCV(); }
      return _ccopamId; }
    protected ConditionValue xgetCValueCcopamId() { return xdfgetCcopamId(); }

    /**
     * Add order-by as ascend. <br>
     * CCOPAM_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_CcopamId_Asc() { regOBA("CCOPAM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CCOPAM_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_CcopamId_Desc() { regOBD("CCOPAM_ID"); return this; }

    protected ConditionValue _snno1;
    public ConditionValue xdfgetSnno1()
    { if (_snno1 == null) { _snno1 = nCV(); }
      return _snno1; }
    protected ConditionValue xgetCValueSnno1() { return xdfgetSnno1(); }

    /**
     * Add order-by as ascend. <br>
     * SNNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snno1_Asc() { regOBA("SNNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snno1_Desc() { regOBD("SNNO1"); return this; }

    protected ConditionValue _snno2;
    public ConditionValue xdfgetSnno2()
    { if (_snno2 == null) { _snno2 = nCV(); }
      return _snno2; }
    protected ConditionValue xgetCValueSnno2() { return xdfgetSnno2(); }

    /**
     * Add order-by as ascend. <br>
     * SNNO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snno2_Asc() { regOBA("SNNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNNO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snno2_Desc() { regOBD("SNNO2"); return this; }

    protected ConditionValue _snno3;
    public ConditionValue xdfgetSnno3()
    { if (_snno3 == null) { _snno3 = nCV(); }
      return _snno3; }
    protected ConditionValue xgetCValueSnno3() { return xdfgetSnno3(); }

    /**
     * Add order-by as ascend. <br>
     * SNNO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snno3_Asc() { regOBA("SNNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNNO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snno3_Desc() { regOBD("SNNO3"); return this; }

    protected ConditionValue _carno;
    public ConditionValue xdfgetCarno()
    { if (_carno == null) { _carno = nCV(); }
      return _carno; }
    protected ConditionValue xgetCValueCarno() { return xdfgetCarno(); }

    /**
     * Add order-by as ascend. <br>
     * CARNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Carno_Asc() { regOBA("CARNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Carno_Desc() { regOBD("CARNO"); return this; }

    protected ConditionValue _snymd;
    public ConditionValue xdfgetSnymd()
    { if (_snymd == null) { _snymd = nCV(); }
      return _snymd; }
    protected ConditionValue xgetCValueSnymd() { return xdfgetSnymd(); }

    /**
     * Add order-by as ascend. <br>
     * SNYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snymd_Asc() { regOBA("SNYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Snymd_Desc() { regOBD("SNYMD"); return this; }

    protected ConditionValue _arvymd;
    public ConditionValue xdfgetArvymd()
    { if (_arvymd == null) { _arvymd = nCV(); }
      return _arvymd; }
    protected ConditionValue xgetCValueArvymd() { return xdfgetArvymd(); }

    /**
     * Add order-by as ascend. <br>
     * ARVYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Arvymd_Asc() { regOBA("ARVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARVYMD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Arvymd_Desc() { regOBD("ARVYMD"); return this; }

    protected ConditionValue _sfcd;
    public ConditionValue xdfgetSfcd()
    { if (_sfcd == null) { _sfcd = nCV(); }
      return _sfcd; }
    protected ConditionValue xgetCValueSfcd() { return xdfgetSfcd(); }

    /**
     * Add order-by as ascend. <br>
     * SFCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Sfcd_Asc() { regOBA("SFCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SFCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Sfcd_Desc() { regOBD("SFCD"); return this; }

    protected ConditionValue _stcd;
    public ConditionValue xdfgetStcd()
    { if (_stcd == null) { _stcd = nCV(); }
      return _stcd; }
    protected ConditionValue xgetCValueStcd() { return xdfgetStcd(); }

    /**
     * Add order-by as ascend. <br>
     * STCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Stcd_Asc() { regOBA("STCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Stcd_Desc() { regOBD("STCD"); return this; }

    protected ConditionValue _gnlpltqa;
    public ConditionValue xdfgetGnlpltqa()
    { if (_gnlpltqa == null) { _gnlpltqa = nCV(); }
      return _gnlpltqa; }
    protected ConditionValue xgetCValueGnlpltqa() { return xdfgetGnlpltqa(); }

    /**
     * Add order-by as ascend. <br>
     * GNLPLTQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Gnlpltqa_Asc() { regOBA("GNLPLTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * GNLPLTQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Gnlpltqa_Desc() { regOBD("GNLPLTQA"); return this; }

    protected ConditionValue _otpltqa;
    public ConditionValue xdfgetOtpltqa()
    { if (_otpltqa == null) { _otpltqa = nCV(); }
      return _otpltqa; }
    protected ConditionValue xgetCValueOtpltqa() { return xdfgetOtpltqa(); }

    /**
     * Add order-by as ascend. <br>
     * OTPLTQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Otpltqa_Asc() { regOBA("OTPLTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTPLTQA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Otpltqa_Desc() { regOBD("OTPLTQA"); return this; }

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
    public BsECcopamSendCQ addOrderBy_Plncarknd_Asc() { regOBA("PLNCARKND"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLNCARKND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Plncarknd_Desc() { regOBD("PLNCARKND"); return this; }

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
    public BsECcopamSendCQ addOrderBy_Amcarknd_Asc() { regOBA("AMCARKND"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMCARKND: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Amcarknd_Desc() { regOBD("AMCARKND"); return this; }

    protected ConditionValue _selno1;
    public ConditionValue xdfgetSelno1()
    { if (_selno1 == null) { _selno1 = nCV(); }
      return _selno1; }
    protected ConditionValue xgetCValueSelno1() { return xdfgetSelno1(); }

    /**
     * Add order-by as ascend. <br>
     * SELNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Selno1_Asc() { regOBA("SELNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Selno1_Desc() { regOBD("SELNO1"); return this; }

    protected ConditionValue _selno2;
    public ConditionValue xdfgetSelno2()
    { if (_selno2 == null) { _selno2 = nCV(); }
      return _selno2; }
    protected ConditionValue xgetCValueSelno2() { return xdfgetSelno2(); }

    /**
     * Add order-by as ascend. <br>
     * SELNO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Selno2_Asc() { regOBA("SELNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELNO2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Selno2_Desc() { regOBD("SELNO2"); return this; }

    protected ConditionValue _selno3;
    public ConditionValue xdfgetSelno3()
    { if (_selno3 == null) { _selno3 = nCV(); }
      return _selno3; }
    protected ConditionValue xgetCValueSelno3() { return xdfgetSelno3(); }

    /**
     * Add order-by as ascend. <br>
     * SELNO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Selno3_Asc() { regOBA("SELNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELNO3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Selno3_Desc() { regOBD("SELNO3"); return this; }

    protected ConditionValue _trannm;
    public ConditionValue xdfgetTrannm()
    { if (_trannm == null) { _trannm = nCV(); }
      return _trannm; }
    protected ConditionValue xgetCValueTrannm() { return xdfgetTrannm(); }

    /**
     * Add order-by as ascend. <br>
     * TRANNM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Trannm_Asc() { regOBA("TRANNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANNM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Trannm_Desc() { regOBD("TRANNM"); return this; }

    protected ConditionValue _tdrelayid;
    public ConditionValue xdfgetTdrelayid()
    { if (_tdrelayid == null) { _tdrelayid = nCV(); }
      return _tdrelayid; }
    protected ConditionValue xgetCValueTdrelayid() { return xdfgetTdrelayid(); }

    /**
     * Add order-by as ascend. <br>
     * TDRELAYID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Tdrelayid_Asc() { regOBA("TDRELAYID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDRELAYID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_Tdrelayid_Desc() { regOBD("TDRELAYID"); return this; }

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
    public BsECcopamSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsECcopamSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsECcopamSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsECcopamSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsECcopamSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsECcopamSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsECcopamSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsECcopamSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsECcopamSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECcopamSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsECcopamSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsECcopamSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ECcopamSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ECcopamSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ECcopamSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ECcopamSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ECcopamSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ECcopamSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ECcopamSendCQ> _myselfExistsMap;
    public Map<String, ECcopamSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ECcopamSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ECcopamSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ECcopamSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ECcopamSendCB.class.getName(); }
    protected String xCQ() { return ECcopamSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
