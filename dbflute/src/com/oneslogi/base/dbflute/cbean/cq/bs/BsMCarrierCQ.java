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
 * The base condition-query of M_CARRIER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierCQ extends AbstractBsMCarrierCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CARRIER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierCIQ xcreateCIQ() {
        MCarrierCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierCIQ xnewCIQ() {
        return new MCarrierCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CARRIER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    public Map<String, MCarrierBoxCQ> xdfgetCarrierId_ExistsReferrer_MCarrierBoxList() { return xgetSQueMap("carrierId_ExistsReferrer_MCarrierBoxList"); }
    public String keepCarrierId_ExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("carrierId_ExistsReferrer_MCarrierBoxList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierId_ExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierId_ExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierId_ExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MCarrierBoxCQ> xdfgetCarrierId_NotExistsReferrer_MCarrierBoxList() { return xgetSQueMap("carrierId_NotExistsReferrer_MCarrierBoxList"); }
    public String keepCarrierId_NotExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("carrierId_NotExistsReferrer_MCarrierBoxList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierId_NotExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierId_NotExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierId_NotExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MCarrierBoxCQ> xdfgetCarrierId_SpecifyDerivedReferrer_MCarrierBoxList() { return xgetSQueMap("carrierId_SpecifyDerivedReferrer_MCarrierBoxList"); }
    public String keepCarrierId_SpecifyDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("carrierId_SpecifyDerivedReferrer_MCarrierBoxList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierId_SpecifyDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierId_SpecifyDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierId_SpecifyDerivedReferrer_MDeliveryCourseList", sq); }

    public Map<String, MCarrierBoxCQ> xdfgetCarrierId_QueryDerivedReferrer_MCarrierBoxList() { return xgetSQueMap("carrierId_QueryDerivedReferrer_MCarrierBoxList"); }
    public String keepCarrierId_QueryDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("carrierId_QueryDerivedReferrer_MCarrierBoxList", sq); }
    public Map<String, Object> xdfgetCarrierId_QueryDerivedReferrer_MCarrierBoxListParameter() { return xgetSQuePmMap("carrierId_QueryDerivedReferrer_MCarrierBoxList"); }
    public String keepCarrierId_QueryDerivedReferrer_MCarrierBoxListParameter(Object pm) { return xkeepSQuePm("carrierId_QueryDerivedReferrer_MCarrierBoxList", pm); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierId_QueryDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierId_QueryDerivedReferrer_MDeliveryCourseList", sq); }
    public Map<String, Object> xdfgetCarrierId_QueryDerivedReferrer_MDeliveryCourseListParameter() { return xgetSQuePmMap("carrierId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object pm) { return xkeepSQuePm("carrierId_QueryDerivedReferrer_MDeliveryCourseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _commonCarrierId;
    public ConditionValue xdfgetCommonCarrierId()
    { if (_commonCarrierId == null) { _commonCarrierId = nCV(); }
      return _commonCarrierId; }
    protected ConditionValue xgetCValueCommonCarrierId() { return xdfgetCommonCarrierId(); }

    public Map<String, MCommonCarrierCQ> getCommonCarrierId_InScopeRelation_MCommonCarrier() { return xgetSQueMap("commonCarrierId_InScopeRelation_MCommonCarrier"); }
    public String keepCommonCarrierId_InScopeRelation_MCommonCarrier(MCommonCarrierCQ sq) { return xkeepSQue("commonCarrierId_InScopeRelation_MCommonCarrier", sq); }

    public Map<String, MCommonCarrierCQ> getCommonCarrierId_NotInScopeRelation_MCommonCarrier() { return xgetSQueMap("commonCarrierId_NotInScopeRelation_MCommonCarrier"); }
    public String keepCommonCarrierId_NotInScopeRelation_MCommonCarrier(MCommonCarrierCQ sq) { return xkeepSQue("commonCarrierId_NotInScopeRelation_MCommonCarrier", sq); }

    /**
     * Add order-by as ascend. <br>
     * COMMON_CARRIER_ID: {IX, bigint(19), FK to M_COMMON_CARRIER}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CommonCarrierId_Asc() { regOBA("COMMON_CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMON_CARRIER_ID: {IX, bigint(19), FK to M_COMMON_CARRIER}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CommonCarrierId_Desc() { regOBD("COMMON_CARRIER_ID"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {+UQ, IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {+UQ, IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierNm;
    public ConditionValue xdfgetCarrierNm()
    { if (_carrierNm == null) { _carrierNm = nCV(); }
      return _carrierNm; }
    protected ConditionValue xgetCValueCarrierNm() { return xdfgetCarrierNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

    protected ConditionValue _carrierAbbr;
    public ConditionValue xdfgetCarrierAbbr()
    { if (_carrierAbbr == null) { _carrierAbbr = nCV(); }
      return _carrierAbbr; }
    protected ConditionValue xgetCValueCarrierAbbr() { return xdfgetCarrierAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierAbbr_Asc() { regOBA("CARRIER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_CarrierAbbr_Desc() { regOBD("CARRIER_ABBR"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCarrierCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCarrierCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCarrierCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCarrierCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCarrierCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCarrierCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCarrierCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCarrierCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCarrierCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCarrierCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierCQ bq = (MCarrierCQ)bqs;
        MCarrierCQ uq = (MCarrierCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCommonCarrier()) {
            uq.queryMCommonCarrier().reflectRelationOnUnionQuery(bq.queryMCommonCarrier(), uq.queryMCommonCarrier());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
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
        String nrp = xresolveNRP("M_CARRIER", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCommonCarrierCQ queryMCommonCarrier() {
        return xdfgetConditionQueryMCommonCarrier();
    }
    public MCommonCarrierCQ xdfgetConditionQueryMCommonCarrier() {
        String prop = "mCommonCarrier";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCommonCarrier()); xsetupOuterJoinMCommonCarrier(); }
        return xgetQueRlMap(prop);
    }
    protected MCommonCarrierCQ xcreateQueryMCommonCarrier() {
        String nrp = xresolveNRP("M_CARRIER", "mCommonCarrier"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCommonCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCommonCarrier", nrp);
    }
    protected void xsetupOuterJoinMCommonCarrier() { xregOutJo("mCommonCarrier"); }
    public boolean hasConditionQueryMCommonCarrier() { return xhasQueRlMap("mCommonCarrier"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_CARRIER", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierCQ> _myselfExistsMap;
    public Map<String, MCarrierCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierCB.class.getName(); }
    protected String xCQ() { return MCarrierCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
