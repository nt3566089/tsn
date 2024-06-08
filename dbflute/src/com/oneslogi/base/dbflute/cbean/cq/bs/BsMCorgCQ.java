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
 * The base condition-query of M_CORG.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCorgCQ extends AbstractBsMCorgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCorgCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCorgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CORG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCorgCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCorgCIQ xcreateCIQ() {
        MCorgCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCorgCIQ xnewCIQ() {
        return new MCorgCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CORG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCorgCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCorgCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _corgId;
    public ConditionValue xdfgetCorgId()
    { if (_corgId == null) { _corgId = nCV(); }
      return _corgId; }
    protected ConditionValue xgetCValueCorgId() { return xdfgetCorgId(); }

    /**
     * Add order-by as ascend. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_CorgId_Asc() { regOBA("CORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_CorgId_Desc() { regOBD("CORG_ID"); return this; }

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
    public BsMCorgCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _orgid;
    public ConditionValue xdfgetOrgid()
    { if (_orgid == null) { _orgid = nCV(); }
      return _orgid; }
    protected ConditionValue xgetCValueOrgid() { return xdfgetOrgid(); }

    /**
     * Add order-by as ascend. <br>
     * ORGID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgid_Asc() { regOBA("ORGID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgid_Desc() { regOBD("ORGID"); return this; }

    protected ConditionValue _orgnmkjf;
    public ConditionValue xdfgetOrgnmkjf()
    { if (_orgnmkjf == null) { _orgnmkjf = nCV(); }
      return _orgnmkjf; }
    protected ConditionValue xgetCValueOrgnmkjf() { return xdfgetOrgnmkjf(); }

    /**
     * Add order-by as ascend. <br>
     * ORGNMKJF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmkjf_Asc() { regOBA("ORGNMKJF"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGNMKJF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmkjf_Desc() { regOBD("ORGNMKJF"); return this; }

    protected ConditionValue _orgnmknf;
    public ConditionValue xdfgetOrgnmknf()
    { if (_orgnmknf == null) { _orgnmknf = nCV(); }
      return _orgnmknf; }
    protected ConditionValue xgetCValueOrgnmknf() { return xdfgetOrgnmknf(); }

    /**
     * Add order-by as ascend. <br>
     * ORGNMKNF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmknf_Asc() { regOBA("ORGNMKNF"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGNMKNF: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmknf_Desc() { regOBD("ORGNMKNF"); return this; }

    protected ConditionValue _orgnmkj;
    public ConditionValue xdfgetOrgnmkj()
    { if (_orgnmkj == null) { _orgnmkj = nCV(); }
      return _orgnmkj; }
    protected ConditionValue xgetCValueOrgnmkj() { return xdfgetOrgnmkj(); }

    /**
     * Add order-by as ascend. <br>
     * ORGNMKJ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmkj_Asc() { regOBA("ORGNMKJ"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGNMKJ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmkj_Desc() { regOBD("ORGNMKJ"); return this; }

    protected ConditionValue _orgnmkn;
    public ConditionValue xdfgetOrgnmkn()
    { if (_orgnmkn == null) { _orgnmkn = nCV(); }
      return _orgnmkn; }
    protected ConditionValue xgetCValueOrgnmkn() { return xdfgetOrgnmkn(); }

    /**
     * Add order-by as ascend. <br>
     * ORGNMKN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmkn_Asc() { regOBA("ORGNMKN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORGNMKN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Orgnmkn_Desc() { regOBD("ORGNMKN"); return this; }

    protected ConditionValue _uporgncd;
    public ConditionValue xdfgetUporgncd()
    { if (_uporgncd == null) { _uporgncd = nCV(); }
      return _uporgncd; }
    protected ConditionValue xgetCValueUporgncd() { return xdfgetUporgncd(); }

    /**
     * Add order-by as ascend. <br>
     * UPORGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Uporgncd_Asc() { regOBA("UPORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPORGNCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Uporgncd_Desc() { regOBD("UPORGNCD"); return this; }

    protected ConditionValue _zzbasecd;
    public ConditionValue xdfgetZzbasecd()
    { if (_zzbasecd == null) { _zzbasecd = nCV(); }
      return _zzbasecd; }
    protected ConditionValue xgetCValueZzbasecd() { return xdfgetZzbasecd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZBASECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzbasecd_Asc() { regOBA("ZZBASECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZBASECD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzbasecd_Desc() { regOBD("ZZBASECD"); return this; }

    protected ConditionValue _zzcomacd;
    public ConditionValue xdfgetZzcomacd()
    { if (_zzcomacd == null) { _zzcomacd = nCV(); }
      return _zzcomacd; }
    protected ConditionValue xgetCValueZzcomacd() { return xdfgetZzcomacd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZCOMACD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzcomacd_Asc() { regOBA("ZZCOMACD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZCOMACD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzcomacd_Desc() { regOBD("ZZCOMACD"); return this; }

    protected ConditionValue _zzwhmgid;
    public ConditionValue xdfgetZzwhmgid()
    { if (_zzwhmgid == null) { _zzwhmgid = nCV(); }
      return _zzwhmgid; }
    protected ConditionValue xgetCValueZzwhmgid() { return xdfgetZzwhmgid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZWHMGID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzwhmgid_Asc() { regOBA("ZZWHMGID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZWHMGID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzwhmgid_Desc() { regOBD("ZZWHMGID"); return this; }

    protected ConditionValue _otrnk;
    public ConditionValue xdfgetOtrnk()
    { if (_otrnk == null) { _otrnk = nCV(); }
      return _otrnk; }
    protected ConditionValue xgetCValueOtrnk() { return xdfgetOtrnk(); }

    /**
     * Add order-by as ascend. <br>
     * OTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Otrnk_Asc() { regOBA("OTRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Otrnk_Desc() { regOBD("OTRNK"); return this; }

    protected ConditionValue _rdvdid;
    public ConditionValue xdfgetRdvdid()
    { if (_rdvdid == null) { _rdvdid = nCV(); }
      return _rdvdid; }
    protected ConditionValue xgetCValueRdvdid() { return xdfgetRdvdid(); }

    /**
     * Add order-by as ascend. <br>
     * RDVDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Rdvdid_Asc() { regOBA("RDVDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RDVDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Rdvdid_Desc() { regOBD("RDVDID"); return this; }

    protected ConditionValue _zzablymd;
    public ConditionValue xdfgetZzablymd()
    { if (_zzablymd == null) { _zzablymd = nCV(); }
      return _zzablymd; }
    protected ConditionValue xgetCValueZzablymd() { return xdfgetZzablymd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZABLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzablymd_Asc() { regOBA("ZZABLYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZABLYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzablymd_Desc() { regOBD("ZZABLYMD"); return this; }

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
    public BsMCorgCQ addOrderBy_Zzfrdateh_Asc() { regOBA("ZZFRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZFRDATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zzfrdateh_Desc() { regOBD("ZZFRDATEH"); return this; }

    protected ConditionValue _zztodateh;
    public ConditionValue xdfgetZztodateh()
    { if (_zztodateh == null) { _zztodateh = nCV(); }
      return _zztodateh; }
    protected ConditionValue xgetCValueZztodateh() { return xdfgetZztodateh(); }

    /**
     * Add order-by as ascend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zztodateh_Asc() { regOBA("ZZTODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Zztodateh_Desc() { regOBD("ZZTODATEH"); return this; }

    protected ConditionValue _sasasid;
    public ConditionValue xdfgetSasasid()
    { if (_sasasid == null) { _sasasid = nCV(); }
      return _sasasid; }
    protected ConditionValue xgetCValueSasasid() { return xdfgetSasasid(); }

    /**
     * Add order-by as ascend. <br>
     * SASASID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Sasasid_Asc() { regOBA("SASASID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SASASID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Sasasid_Desc() { regOBD("SASASID"); return this; }

    protected ConditionValue _cmlrasid;
    public ConditionValue xdfgetCmlrasid()
    { if (_cmlrasid == null) { _cmlrasid = nCV(); }
      return _cmlrasid; }
    protected ConditionValue xgetCValueCmlrasid() { return xdfgetCmlrasid(); }

    /**
     * Add order-by as ascend. <br>
     * CMLRASID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Cmlrasid_Asc() { regOBA("CMLRASID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CMLRASID: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Cmlrasid_Desc() { regOBD("CMLRASID"); return this; }

    protected ConditionValue _anwhnm;
    public ConditionValue xdfgetAnwhnm()
    { if (_anwhnm == null) { _anwhnm = nCV(); }
      return _anwhnm; }
    protected ConditionValue xgetCValueAnwhnm() { return xdfgetAnwhnm(); }

    /**
     * Add order-by as ascend. <br>
     * ANWHNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Anwhnm_Asc() { regOBA("ANWHNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ANWHNM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Anwhnm_Desc() { regOBD("ANWHNM"); return this; }

    protected ConditionValue _odtscd;
    public ConditionValue xdfgetOdtscd()
    { if (_odtscd == null) { _odtscd = nCV(); }
      return _odtscd; }
    protected ConditionValue xgetCValueOdtscd() { return xdfgetOdtscd(); }

    /**
     * Add order-by as ascend. <br>
     * ODTSCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Odtscd_Asc() { regOBA("ODTSCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ODTSCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Odtscd_Desc() { regOBD("ODTSCD"); return this; }

    protected ConditionValue _lnarcd;
    public ConditionValue xdfgetLnarcd()
    { if (_lnarcd == null) { _lnarcd = nCV(); }
      return _lnarcd; }
    protected ConditionValue xgetCValueLnarcd() { return xdfgetLnarcd(); }

    /**
     * Add order-by as ascend. <br>
     * LNARCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Lnarcd_Asc() { regOBA("LNARCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LNARCD: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_Lnarcd_Desc() { regOBD("LNARCD"); return this; }

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
    public BsMCorgCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCorgCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCorgCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCorgCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCorgCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCorgCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCorgCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCorgCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCorgCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCorgCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCorgCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCorgCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCorgCQ bq = (MCorgCQ)bqs;
        MCorgCQ uq = (MCorgCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
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
        String nrp = xresolveNRP("M_CORG", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCorgCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCorgCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCorgCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCorgCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCorgCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCorgCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCorgCQ> _myselfExistsMap;
    public Map<String, MCorgCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCorgCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCorgCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCorgCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCorgCB.class.getName(); }
    protected String xCQ() { return MCorgCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
