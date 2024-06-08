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
 * The base condition-query of W_CDRCATT_INST_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWCdrcattInstInputCQ extends AbstractBsWCdrcattInstInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WCdrcattInstInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWCdrcattInstInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_CDRCATT_INST_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WCdrcattInstInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WCdrcattInstInputCIQ xcreateCIQ() {
        WCdrcattInstInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WCdrcattInstInputCIQ xnewCIQ() {
        return new WCdrcattInstInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_CDRCATT_INST_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WCdrcattInstInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WCdrcattInstInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cdrcattInstInputId;
    public ConditionValue xdfgetCdrcattInstInputId()
    { if (_cdrcattInstInputId == null) { _cdrcattInstInputId = nCV(); }
      return _cdrcattInstInputId; }
    protected ConditionValue xgetCValueCdrcattInstInputId() { return xdfgetCdrcattInstInputId(); }

    /**
     * Add order-by as ascend. <br>
     * CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_CdrcattInstInputId_Asc() { regOBA("CDRCATT_INST_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_CdrcattInstInputId_Desc() { regOBD("CDRCATT_INST_INPUT_ID"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _companyCd;
    public ConditionValue xdfgetCompanyCd()
    { if (_companyCd == null) { _companyCd = nCV(); }
      return _companyCd; }
    protected ConditionValue xgetCValueCompanyCd() { return xdfgetCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_CompanyCd_Asc() { regOBA("COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_CompanyCd_Desc() { regOBD("COMPANY_CD"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _drccd;
    public ConditionValue xdfgetDrccd()
    { if (_drccd == null) { _drccd = nCV(); }
      return _drccd; }
    protected ConditionValue xgetCValueDrccd() { return xdfgetDrccd(); }

    /**
     * Add order-by as ascend. <br>
     * DRCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Drccd_Asc() { regOBA("DRCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DRCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Drccd_Desc() { regOBD("DRCCD"); return this; }

    protected ConditionValue _zzpstnid;
    public ConditionValue xdfgetZzpstnid()
    { if (_zzpstnid == null) { _zzpstnid = nCV(); }
      return _zzpstnid; }
    protected ConditionValue xgetCValueZzpstnid() { return xdfgetZzpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * ZZPSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Zzpstnid_Asc() { regOBA("ZZPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZPSTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Zzpstnid_Desc() { regOBD("ZZPSTNID"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Srlin_Asc() { regOBA("SRLIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Srlin_Desc() { regOBD("SRLIN"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Snmprtrnkad_Asc() { regOBA("SNMPRTRNKAD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNMPRTRNKAD: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Snmprtrnkad_Desc() { regOBD("SNMPRTRNKAD"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Srwkdy_Asc() { regOBA("SRWKDY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRWKDY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Srwkdy_Desc() { regOBD("SRWKDY"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Comt_Asc() { regOBA("COMT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Comt_Desc() { regOBD("COMT"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Sprprsid_Asc() { regOBA("SPRPRSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPRPRSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Sprprsid_Desc() { regOBD("SPRPRSID"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Oddvid_Asc() { regOBA("ODDVID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ODDVID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Oddvid_Desc() { regOBD("ODDVID"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Hdrdbxusid_Asc() { regOBA("HDRDBXUSID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HDRDBXUSID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Hdrdbxusid_Desc() { regOBD("HDRDBXUSID"); return this; }

    protected ConditionValue _ikeiincldflg;
    public ConditionValue xdfgetIkeiincldflg()
    { if (_ikeiincldflg == null) { _ikeiincldflg = nCV(); }
      return _ikeiincldflg; }
    protected ConditionValue xgetCValueIkeiincldflg() { return xdfgetIkeiincldflg(); }

    /**
     * Add order-by as ascend. <br>
     * IKEIINCLDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Ikeiincldflg_Asc() { regOBA("IKEIINCLDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IKEIINCLDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Ikeiincldflg_Desc() { regOBD("IKEIINCLDFLG"); return this; }

    protected ConditionValue _remoteisland;
    public ConditionValue xdfgetRemoteisland()
    { if (_remoteisland == null) { _remoteisland = nCV(); }
      return _remoteisland; }
    protected ConditionValue xgetCValueRemoteisland() { return xdfgetRemoteisland(); }

    /**
     * Add order-by as ascend. <br>
     * REMOTEISLAND: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Remoteisland_Asc() { regOBA("REMOTEISLAND"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMOTEISLAND: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Remoteisland_Desc() { regOBD("REMOTEISLAND"); return this; }

    protected ConditionValue _zzfrdateh;
    public ConditionValue xdfgetZzfrdateh()
    { if (_zzfrdateh == null) { _zzfrdateh = nCV(); }
      return _zzfrdateh; }
    protected ConditionValue xgetCValueZzfrdateh() { return xdfgetZzfrdateh(); }

    /**
     * Add order-by as ascend. <br>
     * ZZFRDATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Zzfrdateh_Asc() { regOBA("ZZFRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZFRDATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Zzfrdateh_Desc() { regOBD("ZZFRDATEH"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_Zztodateh_Asc() { regOBA("ZZTODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZTODATEH: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Zztodateh_Desc() { regOBD("ZZTODATEH"); return this; }

    protected ConditionValue _grtnid;
    public ConditionValue xdfgetGrtnid()
    { if (_grtnid == null) { _grtnid = nCV(); }
      return _grtnid; }
    protected ConditionValue xgetCValueGrtnid() { return xdfgetGrtnid(); }

    /**
     * Add order-by as ascend. <br>
     * GRTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Grtnid_Asc() { regOBA("GRTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GRTNID: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_Grtnid_Desc() { regOBD("GRTNID"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWCdrcattInstInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWCdrcattInstInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWCdrcattInstInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWCdrcattInstInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WCdrcattInstInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WCdrcattInstInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WCdrcattInstInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WCdrcattInstInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WCdrcattInstInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WCdrcattInstInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WCdrcattInstInputCQ> _myselfExistsMap;
    public Map<String, WCdrcattInstInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WCdrcattInstInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WCdrcattInstInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WCdrcattInstInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WCdrcattInstInputCB.class.getName(); }
    protected String xCQ() { return WCdrcattInstInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
