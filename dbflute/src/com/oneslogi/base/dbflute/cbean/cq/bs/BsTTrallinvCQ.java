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
 * The base condition-query of T_TRALLINV.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrallinvCQ extends AbstractBsTTrallinvCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrallinvCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrallinvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRALLINV) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrallinvCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrallinvCIQ xcreateCIQ() {
        TTrallinvCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrallinvCIQ xnewCIQ() {
        return new TTrallinvCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRALLINV on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrallinvCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrallinvCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trallinvId;
    public ConditionValue xdfgetTrallinvId()
    { if (_trallinvId == null) { _trallinvId = nCV(); }
      return _trallinvId; }
    protected ConditionValue xgetCValueTrallinvId() { return xdfgetTrallinvId(); }

    /**
     * Add order-by as ascend. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_TrallinvId_Asc() { regOBA("TRALLINV_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_TrallinvId_Desc() { regOBD("TRALLINV_ID"); return this; }

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
    public BsTTrallinvCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrallinvCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _executedate;
    public ConditionValue xdfgetExecutedate()
    { if (_executedate == null) { _executedate = nCV(); }
      return _executedate; }
    protected ConditionValue xgetCValueExecutedate() { return xdfgetExecutedate(); }

    /**
     * Add order-by as ascend. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Executedate_Asc() { regOBA("EXECUTEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Executedate_Desc() { regOBD("EXECUTEDATE"); return this; }

    protected ConditionValue _inoutkbn;
    public ConditionValue xdfgetInoutkbn()
    { if (_inoutkbn == null) { _inoutkbn = nCV(); }
      return _inoutkbn; }
    protected ConditionValue xgetCValueInoutkbn() { return xdfgetInoutkbn(); }

    /**
     * Add order-by as ascend. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Inoutkbn_Asc() { regOBA("INOUTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Inoutkbn_Desc() { regOBD("INOUTKBN"); return this; }

    protected ConditionValue _sysinvtotalinv;
    public ConditionValue xdfgetSysinvtotalinv()
    { if (_sysinvtotalinv == null) { _sysinvtotalinv = nCV(); }
      return _sysinvtotalinv; }
    protected ConditionValue xgetCValueSysinvtotalinv() { return xdfgetSysinvtotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvtotalinv_Asc() { regOBA("SYSINVTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvtotalinv_Desc() { regOBD("SYSINVTOTALINV"); return this; }

    protected ConditionValue _sysinvkeeplocinv;
    public ConditionValue xdfgetSysinvkeeplocinv()
    { if (_sysinvkeeplocinv == null) { _sysinvkeeplocinv = nCV(); }
      return _sysinvkeeplocinv; }
    protected ConditionValue xgetCValueSysinvkeeplocinv() { return xdfgetSysinvkeeplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvkeeplocinv_Asc() { regOBA("SYSINVKEEPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvkeeplocinv_Desc() { regOBD("SYSINVKEEPLOCINV"); return this; }

    protected ConditionValue _sysinvreceivelocinv;
    public ConditionValue xdfgetSysinvreceivelocinv()
    { if (_sysinvreceivelocinv == null) { _sysinvreceivelocinv = nCV(); }
      return _sysinvreceivelocinv; }
    protected ConditionValue xgetCValueSysinvreceivelocinv() { return xdfgetSysinvreceivelocinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvreceivelocinv_Asc() { regOBA("SYSINVRECEIVELOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvreceivelocinv_Desc() { regOBD("SYSINVRECEIVELOCINV"); return this; }

    protected ConditionValue _sysinvdamageitem;
    public ConditionValue xdfgetSysinvdamageitem()
    { if (_sysinvdamageitem == null) { _sysinvdamageitem = nCV(); }
      return _sysinvdamageitem; }
    protected ConditionValue xgetCValueSysinvdamageitem() { return xdfgetSysinvdamageitem(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvdamageitem_Asc() { regOBA("SYSINVDAMAGEITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvdamageitem_Desc() { regOBD("SYSINVDAMAGEITEM"); return this; }

    protected ConditionValue _sysinvclssifylocinv;
    public ConditionValue xdfgetSysinvclssifylocinv()
    { if (_sysinvclssifylocinv == null) { _sysinvclssifylocinv = nCV(); }
      return _sysinvclssifylocinv; }
    protected ConditionValue xgetCValueSysinvclssifylocinv() { return xdfgetSysinvclssifylocinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvclssifylocinv_Asc() { regOBA("SYSINVCLSSIFYLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvclssifylocinv_Desc() { regOBD("SYSINVCLSSIFYLOCINV"); return this; }

    protected ConditionValue _sysinvtmplocinv;
    public ConditionValue xdfgetSysinvtmplocinv()
    { if (_sysinvtmplocinv == null) { _sysinvtmplocinv = nCV(); }
      return _sysinvtmplocinv; }
    protected ConditionValue xgetCValueSysinvtmplocinv() { return xdfgetSysinvtmplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvtmplocinv_Asc() { regOBA("SYSINVTMPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvtmplocinv_Desc() { regOBD("SYSINVTMPLOCINV"); return this; }

    protected ConditionValue _sysinvautoinv;
    public ConditionValue xdfgetSysinvautoinv()
    { if (_sysinvautoinv == null) { _sysinvautoinv = nCV(); }
      return _sysinvautoinv; }
    protected ConditionValue xgetCValueSysinvautoinv() { return xdfgetSysinvautoinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvautoinv_Asc() { regOBA("SYSINVAUTOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Sysinvautoinv_Desc() { regOBD("SYSINVAUTOINV"); return this; }

    protected ConditionValue _investtotalinv;
    public ConditionValue xdfgetInvesttotalinv()
    { if (_investtotalinv == null) { _investtotalinv = nCV(); }
      return _investtotalinv; }
    protected ConditionValue xgetCValueInvesttotalinv() { return xdfgetInvesttotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investtotalinv_Asc() { regOBA("INVESTTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investtotalinv_Desc() { regOBD("INVESTTOTALINV"); return this; }

    protected ConditionValue _investkeeplocinv;
    public ConditionValue xdfgetInvestkeeplocinv()
    { if (_investkeeplocinv == null) { _investkeeplocinv = nCV(); }
      return _investkeeplocinv; }
    protected ConditionValue xgetCValueInvestkeeplocinv() { return xdfgetInvestkeeplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investkeeplocinv_Asc() { regOBA("INVESTKEEPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investkeeplocinv_Desc() { regOBD("INVESTKEEPLOCINV"); return this; }

    protected ConditionValue _investreceivelocinv;
    public ConditionValue xdfgetInvestreceivelocinv()
    { if (_investreceivelocinv == null) { _investreceivelocinv = nCV(); }
      return _investreceivelocinv; }
    protected ConditionValue xgetCValueInvestreceivelocinv() { return xdfgetInvestreceivelocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investreceivelocinv_Asc() { regOBA("INVESTRECEIVELOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investreceivelocinv_Desc() { regOBD("INVESTRECEIVELOCINV"); return this; }

    protected ConditionValue _investdamageitem;
    public ConditionValue xdfgetInvestdamageitem()
    { if (_investdamageitem == null) { _investdamageitem = nCV(); }
      return _investdamageitem; }
    protected ConditionValue xgetCValueInvestdamageitem() { return xdfgetInvestdamageitem(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investdamageitem_Asc() { regOBA("INVESTDAMAGEITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investdamageitem_Desc() { regOBD("INVESTDAMAGEITEM"); return this; }

    protected ConditionValue _investclssifylocinv;
    public ConditionValue xdfgetInvestclssifylocinv()
    { if (_investclssifylocinv == null) { _investclssifylocinv = nCV(); }
      return _investclssifylocinv; }
    protected ConditionValue xgetCValueInvestclssifylocinv() { return xdfgetInvestclssifylocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investclssifylocinv_Asc() { regOBA("INVESTCLSSIFYLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investclssifylocinv_Desc() { regOBD("INVESTCLSSIFYLOCINV"); return this; }

    protected ConditionValue _investtmplocinv;
    public ConditionValue xdfgetInvesttmplocinv()
    { if (_investtmplocinv == null) { _investtmplocinv = nCV(); }
      return _investtmplocinv; }
    protected ConditionValue xgetCValueInvesttmplocinv() { return xdfgetInvesttmplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investtmplocinv_Asc() { regOBA("INVESTTMPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investtmplocinv_Desc() { regOBD("INVESTTMPLOCINV"); return this; }

    protected ConditionValue _investautoinv;
    public ConditionValue xdfgetInvestautoinv()
    { if (_investautoinv == null) { _investautoinv = nCV(); }
      return _investautoinv; }
    protected ConditionValue xgetCValueInvestautoinv() { return xdfgetInvestautoinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investautoinv_Asc() { regOBA("INVESTAUTOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Investautoinv_Desc() { regOBD("INVESTAUTOINV"); return this; }

    protected ConditionValue _ydaytlequlytotalinv;
    public ConditionValue xdfgetYdaytlequlytotalinv()
    { if (_ydaytlequlytotalinv == null) { _ydaytlequlytotalinv = nCV(); }
      return _ydaytlequlytotalinv; }
    protected ConditionValue xgetCValueYdaytlequlytotalinv() { return xdfgetYdaytlequlytotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlytotalinv_Asc() { regOBA("YDAYTLEQULYTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlytotalinv_Desc() { regOBD("YDAYTLEQULYTOTALINV"); return this; }

    protected ConditionValue _ydaytlequlykeeplocinv;
    public ConditionValue xdfgetYdaytlequlykeeplocinv()
    { if (_ydaytlequlykeeplocinv == null) { _ydaytlequlykeeplocinv = nCV(); }
      return _ydaytlequlykeeplocinv; }
    protected ConditionValue xgetCValueYdaytlequlykeeplocinv() { return xdfgetYdaytlequlykeeplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlykeeplocinv_Asc() { regOBA("YDAYTLEQULYKEEPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlykeeplocinv_Desc() { regOBD("YDAYTLEQULYKEEPLOCINV"); return this; }

    protected ConditionValue _ydaytlequlyreceivelocinv;
    public ConditionValue xdfgetYdaytlequlyreceivelocinv()
    { if (_ydaytlequlyreceivelocinv == null) { _ydaytlequlyreceivelocinv = nCV(); }
      return _ydaytlequlyreceivelocinv; }
    protected ConditionValue xgetCValueYdaytlequlyreceivelocinv() { return xdfgetYdaytlequlyreceivelocinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlyreceivelocinv_Asc() { regOBA("YDAYTLEQULYRECEIVELOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlyreceivelocinv_Desc() { regOBD("YDAYTLEQULYRECEIVELOCINV"); return this; }

    protected ConditionValue _ydaytlequlydamageitem;
    public ConditionValue xdfgetYdaytlequlydamageitem()
    { if (_ydaytlequlydamageitem == null) { _ydaytlequlydamageitem = nCV(); }
      return _ydaytlequlydamageitem; }
    protected ConditionValue xgetCValueYdaytlequlydamageitem() { return xdfgetYdaytlequlydamageitem(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlydamageitem_Asc() { regOBA("YDAYTLEQULYDAMAGEITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlydamageitem_Desc() { regOBD("YDAYTLEQULYDAMAGEITEM"); return this; }

    protected ConditionValue _ydaytlequlyclssifylocinv;
    public ConditionValue xdfgetYdaytlequlyclssifylocinv()
    { if (_ydaytlequlyclssifylocinv == null) { _ydaytlequlyclssifylocinv = nCV(); }
      return _ydaytlequlyclssifylocinv; }
    protected ConditionValue xgetCValueYdaytlequlyclssifylocinv() { return xdfgetYdaytlequlyclssifylocinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlyclssifylocinv_Asc() { regOBA("YDAYTLEQULYCLSSIFYLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlyclssifylocinv_Desc() { regOBD("YDAYTLEQULYCLSSIFYLOCINV"); return this; }

    protected ConditionValue _ydaytlequlytmplocinv;
    public ConditionValue xdfgetYdaytlequlytmplocinv()
    { if (_ydaytlequlytmplocinv == null) { _ydaytlequlytmplocinv = nCV(); }
      return _ydaytlequlytmplocinv; }
    protected ConditionValue xgetCValueYdaytlequlytmplocinv() { return xdfgetYdaytlequlytmplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlytmplocinv_Asc() { regOBA("YDAYTLEQULYTMPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlytmplocinv_Desc() { regOBD("YDAYTLEQULYTMPLOCINV"); return this; }

    protected ConditionValue _ydaytlequlyautoinv;
    public ConditionValue xdfgetYdaytlequlyautoinv()
    { if (_ydaytlequlyautoinv == null) { _ydaytlequlyautoinv = nCV(); }
      return _ydaytlequlyautoinv; }
    protected ConditionValue xgetCValueYdaytlequlyautoinv() { return xdfgetYdaytlequlyautoinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlyautoinv_Asc() { regOBA("YDAYTLEQULYAUTOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Ydaytlequlyautoinv_Desc() { regOBD("YDAYTLEQULYAUTOINV"); return this; }

    protected ConditionValue _tdayeqytotalinv;
    public ConditionValue xdfgetTdayeqytotalinv()
    { if (_tdayeqytotalinv == null) { _tdayeqytotalinv = nCV(); }
      return _tdayeqytotalinv; }
    protected ConditionValue xgetCValueTdayeqytotalinv() { return xdfgetTdayeqytotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqytotalinv_Asc() { regOBA("TDAYEQYTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqytotalinv_Desc() { regOBD("TDAYEQYTOTALINV"); return this; }

    protected ConditionValue _tdayeqykeeplocinv;
    public ConditionValue xdfgetTdayeqykeeplocinv()
    { if (_tdayeqykeeplocinv == null) { _tdayeqykeeplocinv = nCV(); }
      return _tdayeqykeeplocinv; }
    protected ConditionValue xgetCValueTdayeqykeeplocinv() { return xdfgetTdayeqykeeplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqykeeplocinv_Asc() { regOBA("TDAYEQYKEEPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqykeeplocinv_Desc() { regOBD("TDAYEQYKEEPLOCINV"); return this; }

    protected ConditionValue _tdayeqyreceivelocinv;
    public ConditionValue xdfgetTdayeqyreceivelocinv()
    { if (_tdayeqyreceivelocinv == null) { _tdayeqyreceivelocinv = nCV(); }
      return _tdayeqyreceivelocinv; }
    protected ConditionValue xgetCValueTdayeqyreceivelocinv() { return xdfgetTdayeqyreceivelocinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqyreceivelocinv_Asc() { regOBA("TDAYEQYRECEIVELOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqyreceivelocinv_Desc() { regOBD("TDAYEQYRECEIVELOCINV"); return this; }

    protected ConditionValue _tdayeqydamageitem;
    public ConditionValue xdfgetTdayeqydamageitem()
    { if (_tdayeqydamageitem == null) { _tdayeqydamageitem = nCV(); }
      return _tdayeqydamageitem; }
    protected ConditionValue xgetCValueTdayeqydamageitem() { return xdfgetTdayeqydamageitem(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqydamageitem_Asc() { regOBA("TDAYEQYDAMAGEITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqydamageitem_Desc() { regOBD("TDAYEQYDAMAGEITEM"); return this; }

    protected ConditionValue _tdayeqyclssifylocinv;
    public ConditionValue xdfgetTdayeqyclssifylocinv()
    { if (_tdayeqyclssifylocinv == null) { _tdayeqyclssifylocinv = nCV(); }
      return _tdayeqyclssifylocinv; }
    protected ConditionValue xgetCValueTdayeqyclssifylocinv() { return xdfgetTdayeqyclssifylocinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqyclssifylocinv_Asc() { regOBA("TDAYEQYCLSSIFYLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqyclssifylocinv_Desc() { regOBD("TDAYEQYCLSSIFYLOCINV"); return this; }

    protected ConditionValue _tdayeqytmplocinv;
    public ConditionValue xdfgetTdayeqytmplocinv()
    { if (_tdayeqytmplocinv == null) { _tdayeqytmplocinv = nCV(); }
      return _tdayeqytmplocinv; }
    protected ConditionValue xgetCValueTdayeqytmplocinv() { return xdfgetTdayeqytmplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqytmplocinv_Asc() { regOBA("TDAYEQYTMPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqytmplocinv_Desc() { regOBD("TDAYEQYTMPLOCINV"); return this; }

    protected ConditionValue _tdayeqyautoinv;
    public ConditionValue xdfgetTdayeqyautoinv()
    { if (_tdayeqyautoinv == null) { _tdayeqyautoinv = nCV(); }
      return _tdayeqyautoinv; }
    protected ConditionValue xgetCValueTdayeqyautoinv() { return xdfgetTdayeqyautoinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqyautoinv_Asc() { regOBA("TDAYEQYAUTOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Tdayeqyautoinv_Desc() { regOBD("TDAYEQYAUTOINV"); return this; }

    protected ConditionValue _capitemflg;
    public ConditionValue xdfgetCapitemflg()
    { if (_capitemflg == null) { _capitemflg = nCV(); }
      return _capitemflg; }
    protected ConditionValue xgetCValueCapitemflg() { return xdfgetCapitemflg(); }

    /**
     * Add order-by as ascend. <br>
     * CAPITEMFLG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Capitemflg_Asc() { regOBA("CAPITEMFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CAPITEMFLG: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_Capitemflg_Desc() { regOBD("CAPITEMFLG"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTTrallinvCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrallinvCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrallinvCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrallinvCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrallinvCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrallinvCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrallinvCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrallinvCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrallinvCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrallinvCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrallinvCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrallinvCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrallinvCQ bq = (TTrallinvCQ)bqs;
        TTrallinvCQ uq = (TTrallinvCQ)uqs;
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
        String nrp = xresolveNRP("T_TRALLINV", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("T_TRALLINV", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TTrallinvCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrallinvCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrallinvCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrallinvCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrallinvCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrallinvCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrallinvCQ> _myselfExistsMap;
    public Map<String, TTrallinvCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrallinvCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrallinvCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrallinvCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrallinvCB.class.getName(); }
    protected String xCQ() { return TTrallinvCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
