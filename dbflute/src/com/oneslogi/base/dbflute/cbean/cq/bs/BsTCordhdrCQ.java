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
 * The base condition-query of T_CORDHDR.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCordhdrCQ extends AbstractBsTCordhdrCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCordhdrCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCordhdrCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CORDHDR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCordhdrCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCordhdrCIQ xcreateCIQ() {
        TCordhdrCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCordhdrCIQ xnewCIQ() {
        return new TCordhdrCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CORDHDR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCordhdrCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCordhdrCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _orderHId;
    public ConditionValue xdfgetOrderHId()
    { if (_orderHId == null) { _orderHId = nCV(); }
      return _orderHId; }
    protected ConditionValue xgetCValueOrderHId() { return xdfgetOrderHId(); }

    public Map<String, TCorddtaecCQ> xdfgetOrderHId_ExistsReferrer_TCorddtaecList() { return xgetSQueMap("orderHId_ExistsReferrer_TCorddtaecList"); }
    public String keepOrderHId_ExistsReferrer_TCorddtaecList(TCorddtaecCQ sq) { return xkeepSQue("orderHId_ExistsReferrer_TCorddtaecList", sq); }

    public Map<String, TCorddtasrCQ> xdfgetOrderHId_ExistsReferrer_TCorddtasrList() { return xgetSQueMap("orderHId_ExistsReferrer_TCorddtasrList"); }
    public String keepOrderHId_ExistsReferrer_TCorddtasrList(TCorddtasrCQ sq) { return xkeepSQue("orderHId_ExistsReferrer_TCorddtasrList", sq); }

    public Map<String, TCorddtaecCQ> xdfgetOrderHId_NotExistsReferrer_TCorddtaecList() { return xgetSQueMap("orderHId_NotExistsReferrer_TCorddtaecList"); }
    public String keepOrderHId_NotExistsReferrer_TCorddtaecList(TCorddtaecCQ sq) { return xkeepSQue("orderHId_NotExistsReferrer_TCorddtaecList", sq); }

    public Map<String, TCorddtasrCQ> xdfgetOrderHId_NotExistsReferrer_TCorddtasrList() { return xgetSQueMap("orderHId_NotExistsReferrer_TCorddtasrList"); }
    public String keepOrderHId_NotExistsReferrer_TCorddtasrList(TCorddtasrCQ sq) { return xkeepSQue("orderHId_NotExistsReferrer_TCorddtasrList", sq); }

    public Map<String, TCorddtaecCQ> xdfgetOrderHId_SpecifyDerivedReferrer_TCorddtaecList() { return xgetSQueMap("orderHId_SpecifyDerivedReferrer_TCorddtaecList"); }
    public String keepOrderHId_SpecifyDerivedReferrer_TCorddtaecList(TCorddtaecCQ sq) { return xkeepSQue("orderHId_SpecifyDerivedReferrer_TCorddtaecList", sq); }

    public Map<String, TCorddtasrCQ> xdfgetOrderHId_SpecifyDerivedReferrer_TCorddtasrList() { return xgetSQueMap("orderHId_SpecifyDerivedReferrer_TCorddtasrList"); }
    public String keepOrderHId_SpecifyDerivedReferrer_TCorddtasrList(TCorddtasrCQ sq) { return xkeepSQue("orderHId_SpecifyDerivedReferrer_TCorddtasrList", sq); }

    public Map<String, TCorddtaecCQ> xdfgetOrderHId_QueryDerivedReferrer_TCorddtaecList() { return xgetSQueMap("orderHId_QueryDerivedReferrer_TCorddtaecList"); }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtaecList(TCorddtaecCQ sq) { return xkeepSQue("orderHId_QueryDerivedReferrer_TCorddtaecList", sq); }
    public Map<String, Object> xdfgetOrderHId_QueryDerivedReferrer_TCorddtaecListParameter() { return xgetSQuePmMap("orderHId_QueryDerivedReferrer_TCorddtaecList"); }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtaecListParameter(Object pm) { return xkeepSQuePm("orderHId_QueryDerivedReferrer_TCorddtaecList", pm); }

    public Map<String, TCorddtasrCQ> xdfgetOrderHId_QueryDerivedReferrer_TCorddtasrList() { return xgetSQueMap("orderHId_QueryDerivedReferrer_TCorddtasrList"); }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtasrList(TCorddtasrCQ sq) { return xkeepSQue("orderHId_QueryDerivedReferrer_TCorddtasrList", sq); }
    public Map<String, Object> xdfgetOrderHId_QueryDerivedReferrer_TCorddtasrListParameter() { return xgetSQuePmMap("orderHId_QueryDerivedReferrer_TCorddtasrList"); }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtasrListParameter(Object pm) { return xkeepSQuePm("orderHId_QueryDerivedReferrer_TCorddtasrList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_OrderHId_Asc() { regOBA("ORDER_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_OrderHId_Desc() { regOBD("ORDER_H_ID"); return this; }

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
    public BsTCordhdrCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTCordhdrCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Zzordymd_Asc() { regOBA("ZZORDYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Zzordymd_Desc() { regOBD("ZZORDYMD"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Ordgr_Asc() { regOBA("ORDGR"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Ordgr_Desc() { regOBD("ORDGR"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _scddlvymd;
    public ConditionValue xdfgetScddlvymd()
    { if (_scddlvymd == null) { _scddlvymd = nCV(); }
      return _scddlvymd; }
    protected ConditionValue xgetCValueScddlvymd() { return xdfgetScddlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Scddlvymd_Asc() { regOBA("SCDDLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Scddlvymd_Desc() { regOBD("SCDDLVYMD"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Scdded_Asc() { regOBA("SCDDED"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Scdded_Desc() { regOBD("SCDDED"); return this; }

    protected ConditionValue _scdpstnid;
    public ConditionValue xdfgetScdpstnid()
    { if (_scdpstnid == null) { _scdpstnid = nCV(); }
      return _scdpstnid; }
    protected ConditionValue xgetCValueScdpstnid() { return xdfgetScdpstnid(); }

    /**
     * Add order-by as ascend. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Scdpstnid_Asc() { regOBA("SCDPSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCDPSTNID: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Scdpstnid_Desc() { regOBD("SCDPSTNID"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Ioid_Asc() { regOBA("IOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IOID: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Ioid_Desc() { regOBD("IOID"); return this; }

    protected ConditionValue _ctqa;
    public ConditionValue xdfgetCtqa()
    { if (_ctqa == null) { _ctqa = nCV(); }
      return _ctqa; }
    protected ConditionValue xgetCValueCtqa() { return xdfgetCtqa(); }

    /**
     * Add order-by as ascend. <br>
     * CTQA: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Ctqa_Asc() { regOBA("CTQA"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTQA: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Ctqa_Desc() { regOBD("CTQA"); return this; }

    protected ConditionValue _sta;
    public ConditionValue xdfgetSta()
    { if (_sta == null) { _sta = nCV(); }
      return _sta; }
    protected ConditionValue xgetCValueSta() { return xdfgetSta(); }

    /**
     * Add order-by as ascend. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Sta_Asc() { regOBA("STA"); return this; }

    /**
     * Add order-by as descend. <br>
     * STA: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Sta_Desc() { regOBD("STA"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Wrkmfg_Asc() { regOBA("WRKMFG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WRKMFG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Wrkmfg_Desc() { regOBD("WRKMFG"); return this; }

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
    public BsTCordhdrCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _cordrcvcnt;
    public ConditionValue xdfgetCordrcvcnt()
    { if (_cordrcvcnt == null) { _cordrcvcnt = nCV(); }
      return _cordrcvcnt; }
    protected ConditionValue xgetCValueCordrcvcnt() { return xdfgetCordrcvcnt(); }

    /**
     * Add order-by as ascend. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Cordrcvcnt_Asc() { regOBA("CORDRCVCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Cordrcvcnt_Desc() { regOBD("CORDRCVCNT"); return this; }

    protected ConditionValue _completeFlg;
    public ConditionValue xdfgetCompleteFlg()
    { if (_completeFlg == null) { _completeFlg = nCV(); }
      return _completeFlg; }
    protected ConditionValue xgetCValueCompleteFlg() { return xdfgetCompleteFlg(); }

    /**
     * Add order-by as ascend. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_CompleteFlg_Asc() { regOBA("COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPLETE_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_CompleteFlg_Desc() { regOBD("COMPLETE_FLG"); return this; }

    protected ConditionValue _rcvFlg;
    public ConditionValue xdfgetRcvFlg()
    { if (_rcvFlg == null) { _rcvFlg = nCV(); }
      return _rcvFlg; }
    protected ConditionValue xgetCValueRcvFlg() { return xdfgetRcvFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_RcvFlg_Asc() { regOBA("RCV_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_RcvFlg_Desc() { regOBD("RCV_FLG"); return this; }

    protected ConditionValue _skipKbn;
    public ConditionValue xdfgetSkipKbn()
    { if (_skipKbn == null) { _skipKbn = nCV(); }
      return _skipKbn; }
    protected ConditionValue xgetCValueSkipKbn() { return xdfgetSkipKbn(); }

    /**
     * Add order-by as ascend. <br>
     * SKIP_KBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_SkipKbn_Asc() { regOBA("SKIP_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKIP_KBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_SkipKbn_Desc() { regOBD("SKIP_KBN"); return this; }

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
    public BsTCordhdrCQ addOrderBy_SortDate_Asc() { regOBA("SORT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_SortDate_Desc() { regOBD("SORT_DATE"); return this; }

    protected ConditionValue _comment;
    public ConditionValue xdfgetComment()
    { if (_comment == null) { _comment = nCV(); }
      return _comment; }
    protected ConditionValue xgetCValueComment() { return xdfgetComment(); }

    /**
     * Add order-by as ascend. <br>
     * COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Comment_Asc() { regOBA("COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMENT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_Comment_Desc() { regOBD("COMMENT"); return this; }

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
    public BsTCordhdrCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCordhdrCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCordhdrCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCordhdrCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCordhdrCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCordhdrCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCordhdrCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCordhdrCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCordhdrCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCordhdrCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCordhdrCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCordhdrCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TCordhdrCQ bq = (TCordhdrCQ)bqs;
        TCordhdrCQ uq = (TCordhdrCQ)uqs;
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
        String nrp = xresolveNRP("T_CORDHDR", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_CORDHDR", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TCordhdrCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCordhdrCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCordhdrCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCordhdrCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCordhdrCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCordhdrCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCordhdrCQ> _myselfExistsMap;
    public Map<String, TCordhdrCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCordhdrCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCordhdrCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCordhdrCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCordhdrCB.class.getName(); }
    protected String xCQ() { return TCordhdrCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
