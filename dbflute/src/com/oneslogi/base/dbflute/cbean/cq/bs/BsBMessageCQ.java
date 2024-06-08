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
 * The base condition-query of B_MESSAGE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBMessageCQ extends AbstractBsBMessageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BMessageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBMessageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_MESSAGE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BMessageCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BMessageCIQ xcreateCIQ() {
        BMessageCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BMessageCIQ xnewCIQ() {
        return new BMessageCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_MESSAGE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BMessageCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BMessageCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _messageId;
    public ConditionValue xdfgetMessageId()
    { if (_messageId == null) { _messageId = nCV(); }
      return _messageId; }
    protected ConditionValue xgetCValueMessageId() { return xdfgetMessageId(); }

    public Map<String, MHtMessageCQ> xdfgetMessageId_ExistsReferrer_MHtMessageAsOne() { return xgetSQueMap("messageId_ExistsReferrer_MHtMessageAsOne"); }
    public String keepMessageId_ExistsReferrer_MHtMessageAsOne(MHtMessageCQ sq) { return xkeepSQue("messageId_ExistsReferrer_MHtMessageAsOne", sq); }

    public Map<String, MHtMessageCQ> xdfgetMessageId_NotExistsReferrer_MHtMessageAsOne() { return xgetSQueMap("messageId_NotExistsReferrer_MHtMessageAsOne"); }
    public String keepMessageId_NotExistsReferrer_MHtMessageAsOne(MHtMessageCQ sq) { return xkeepSQue("messageId_NotExistsReferrer_MHtMessageAsOne", sq); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageId_Asc() { regOBA("MESSAGE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageId_Desc() { regOBD("MESSAGE_ID"); return this; }

    protected ConditionValue _messageCd;
    public ConditionValue xdfgetMessageCd()
    { if (_messageCd == null) { _messageCd = nCV(); }
      return _messageCd; }
    protected ConditionValue xgetCValueMessageCd() { return xdfgetMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageCd_Asc() { regOBA("MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageCd_Desc() { regOBD("MESSAGE_CD"); return this; }

    protected ConditionValue _messageNm;
    public ConditionValue xdfgetMessageNm()
    { if (_messageNm == null) { _messageNm = nCV(); }
      return _messageNm; }
    protected ConditionValue xgetCValueMessageNm() { return xdfgetMessageNm(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageNm_Asc() { regOBA("MESSAGE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageNm_Desc() { regOBD("MESSAGE_NM"); return this; }

    protected ConditionValue _messageAbbr;
    public ConditionValue xdfgetMessageAbbr()
    { if (_messageAbbr == null) { _messageAbbr = nCV(); }
      return _messageAbbr; }
    protected ConditionValue xgetCValueMessageAbbr() { return xdfgetMessageAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageAbbr_Asc() { regOBA("MESSAGE_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageAbbr_Desc() { regOBD("MESSAGE_ABBR"); return this; }

    protected ConditionValue _messageType;
    public ConditionValue xdfgetMessageType()
    { if (_messageType == null) { _messageType = nCV(); }
      return _messageType; }
    protected ConditionValue xgetCValueMessageType() { return xdfgetMessageType(); }

    /**
     * Add order-by as ascend. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageType_Asc() { regOBA("MESSAGE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_MessageType_Desc() { regOBD("MESSAGE_TYPE"); return this; }

    protected ConditionValue _systemType;
    public ConditionValue xdfgetSystemType()
    { if (_systemType == null) { _systemType = nCV(); }
      return _systemType; }
    protected ConditionValue xgetCValueSystemType() { return xdfgetSystemType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_SystemType_Asc() { regOBA("SYSTEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_SystemType_Desc() { regOBD("SYSTEM_TYPE"); return this; }

    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> getCultureId_InScopeRelation_BCulture() { return xgetSQueMap("cultureId_InScopeRelation_BCulture"); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_InScopeRelation_BCulture", sq); }

    public Map<String, BCultureCQ> getCultureId_NotInScopeRelation_BCulture() { return xgetSQueMap("cultureId_NotInScopeRelation_BCulture"); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_NotInScopeRelation_BCulture", sq); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

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
    public BsBMessageCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBMessageCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBMessageCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBMessageCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBMessageCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBMessageCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBMessageCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBMessageCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBMessageCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBMessageCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBMessageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBMessageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BMessageCQ bq = (BMessageCQ)bqs;
        BMessageCQ uq = (BMessageCQ)uqs;
        if (bq.hasConditionQueryBCulture()) {
            uq.queryBCulture().reflectRelationOnUnionQuery(bq.queryBCulture(), uq.queryBCulture());
        }
        if (bq.hasConditionQueryBClassDtlByMessageType()) {
            uq.queryBClassDtlByMessageType().reflectRelationOnUnionQuery(bq.queryBClassDtlByMessageType(), uq.queryBClassDtlByMessageType());
        }
        if (bq.hasConditionQueryBClassDtlBySystemType()) {
            uq.queryBClassDtlBySystemType().reflectRelationOnUnionQuery(bq.queryBClassDtlBySystemType(), uq.queryBClassDtlBySystemType());
        }
        if (bq.hasConditionQueryMHtMessageAsOne()) {
            uq.queryMHtMessageAsOne().reflectRelationOnUnionQuery(bq.queryMHtMessageAsOne(), uq.queryMHtMessageAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCulture() {
        return xdfgetConditionQueryBCulture();
    }
    public BCultureCQ xdfgetConditionQueryBCulture() {
        String prop = "bCulture";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCulture()); xsetupOuterJoinBCulture(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCulture() {
        String nrp = xresolveNRP("B_MESSAGE", "bCulture"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCulture", nrp);
    }
    protected void xsetupOuterJoinBCulture() { xregOutJo("bCulture"); }
    public boolean hasConditionQueryBCulture() { return xhasQueRlMap("bCulture"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MESSAGE_TYPE, named 'BClassDtlByMessageType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMessageType() {
        return xdfgetConditionQueryBClassDtlByMessageType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMessageType() {
        String prop = "bClassDtlByMessageType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMessageType()); xsetupOuterJoinBClassDtlByMessageType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMessageType() {
        String nrp = xresolveNRP("B_MESSAGE", "bClassDtlByMessageType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMessageType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMessageType() { xregOutJo("bClassDtlByMessageType"); }
    public boolean hasConditionQueryBClassDtlByMessageType() { return xhasQueRlMap("bClassDtlByMessageType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySystemType() {
        return xdfgetConditionQueryBClassDtlBySystemType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySystemType() {
        String prop = "bClassDtlBySystemType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySystemType()); xsetupOuterJoinBClassDtlBySystemType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySystemType() {
        String nrp = xresolveNRP("B_MESSAGE", "bClassDtlBySystemType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySystemType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySystemType() { xregOutJo("bClassDtlBySystemType"); }
    public boolean hasConditionQueryBClassDtlBySystemType() { return xhasQueRlMap("bClassDtlBySystemType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MHtMessageCQ queryMHtMessageAsOne() { return xdfgetConditionQueryMHtMessageAsOne(); }
    public MHtMessageCQ xdfgetConditionQueryMHtMessageAsOne() {
        String prop = "mHtMessageAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMHtMessageAsOne()); xsetupOuterJoinMHtMessageAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MHtMessageCQ xcreateQueryMHtMessageAsOne() {
        String nrp = xresolveNRP("B_MESSAGE", "mHtMessageAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MHtMessageCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mHtMessageAsOne", nrp);
    }
    protected void xsetupOuterJoinMHtMessageAsOne() { xregOutJo("mHtMessageAsOne"); }
    public boolean hasConditionQueryMHtMessageAsOne() { return xhasQueRlMap("mHtMessageAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BMessageCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BMessageCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BMessageCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BMessageCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BMessageCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BMessageCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BMessageCQ> _myselfExistsMap;
    public Map<String, BMessageCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BMessageCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BMessageCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BMessageCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BMessageCB.class.getName(); }
    protected String xCQ() { return BMessageCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
