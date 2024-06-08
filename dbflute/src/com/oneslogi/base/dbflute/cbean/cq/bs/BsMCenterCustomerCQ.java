package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of M_CENTER_CUSTOMER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterCustomerCQ extends AbstractBsMCenterCustomerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterCustomerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterCustomerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CENTER_CUSTOMER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterCustomerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterCustomerCIQ xcreateCIQ() {
        MCenterCustomerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterCustomerCIQ xnewCIQ() {
        return new MCenterCustomerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CENTER_CUSTOMER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterCustomerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterCustomerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerCustomerId;
    public ConditionValue xdfgetCenterCustomerId()
    { if (_centerCustomerId == null) { _centerCustomerId = nCV(); }
      return _centerCustomerId; }
    protected ConditionValue xgetCValueCenterCustomerId() { return xdfgetCenterCustomerId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_CenterCustomerId_Asc() { regOBA("CENTER_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_CenterCustomerId_Desc() { regOBD("CENTER_CUSTOMER_ID"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    public Map<String, MCustomerCQ> getCustomerId_InScopeRelation_MCustomer() { return xgetSQueMap("customerId_InScopeRelation_MCustomer"); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getCustomerId_NotInScopeRelation_MCustomer() { return xgetSQueMap("customerId_NotInScopeRelation_MCustomer"); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

    protected ConditionValue _deliveryCourseId;
    public ConditionValue xdfgetDeliveryCourseId()
    { if (_deliveryCourseId == null) { _deliveryCourseId = nCV(); }
      return _deliveryCourseId; }
    protected ConditionValue xgetCValueDeliveryCourseId() { return xdfgetDeliveryCourseId(); }

    public Map<String, MDeliveryCourseCQ> getDeliveryCourseId_InScopeRelation_MDeliveryCourse() { return xgetSQueMap("deliveryCourseId_InScopeRelation_MDeliveryCourse"); }
    public String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq) { return xkeepSQue("deliveryCourseId_InScopeRelation_MDeliveryCourse", sq); }

    public Map<String, MDeliveryCourseCQ> getDeliveryCourseId_NotInScopeRelation_MDeliveryCourse() { return xgetSQueMap("deliveryCourseId_NotInScopeRelation_MDeliveryCourse"); }
    public String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq) { return xkeepSQue("deliveryCourseId_NotInScopeRelation_MDeliveryCourse", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

    protected ConditionValue _deliveryOrder;
    public ConditionValue xdfgetDeliveryOrder()
    { if (_deliveryOrder == null) { _deliveryOrder = nCV(); }
      return _deliveryOrder; }
    protected ConditionValue xgetCValueDeliveryOrder() { return xdfgetDeliveryOrder(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DeliveryOrder_Asc() { regOBA("DELIVERY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DeliveryOrder_Desc() { regOBD("DELIVERY_ORDER"); return this; }

    protected ConditionValue _deliveryReadTime;
    public ConditionValue xdfgetDeliveryReadTime()
    { if (_deliveryReadTime == null) { _deliveryReadTime = nCV(); }
      return _deliveryReadTime; }
    protected ConditionValue xgetCValueDeliveryReadTime() { return xdfgetDeliveryReadTime(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_READ_TIME: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DeliveryReadTime_Asc() { regOBA("DELIVERY_READ_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_READ_TIME: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DeliveryReadTime_Desc() { regOBD("DELIVERY_READ_TIME"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCenterCustomerCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterCustomerCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCenterCustomerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCenterCustomerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterCustomerCQ bq = (MCenterCustomerCQ)bqs;
        MCenterCustomerCQ uq = (MCenterCustomerCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMDeliveryCourse()) {
            uq.queryMDeliveryCourse().reflectRelationOnUnionQuery(bq.queryMDeliveryCourse(), uq.queryMDeliveryCourse());
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
        String nrp = xresolveNRP("M_CENTER_CUSTOMER", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("M_CENTER_CUSTOMER", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MDeliveryCourseCQ queryMDeliveryCourse() {
        return xdfgetConditionQueryMDeliveryCourse();
    }
    public MDeliveryCourseCQ xdfgetConditionQueryMDeliveryCourse() {
        String prop = "mDeliveryCourse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMDeliveryCourse()); xsetupOuterJoinMDeliveryCourse(); }
        return xgetQueRlMap(prop);
    }
    protected MDeliveryCourseCQ xcreateQueryMDeliveryCourse() {
        String nrp = xresolveNRP("M_CENTER_CUSTOMER", "mDeliveryCourse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MDeliveryCourseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mDeliveryCourse", nrp);
    }
    protected void xsetupOuterJoinMDeliveryCourse() { xregOutJo("mDeliveryCourse"); }
    public boolean hasConditionQueryMDeliveryCourse() { return xhasQueRlMap("mDeliveryCourse"); }

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
        String nrp = xresolveNRP("M_CENTER_CUSTOMER", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MCenterCustomerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterCustomerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterCustomerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterCustomerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterCustomerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterCustomerCQ> _myselfExistsMap;
    public Map<String, MCenterCustomerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterCustomerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterCustomerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterCustomerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br>
     * {exists (select ... from T_ALLOC_INST_H where ...)}
     * @param subQuery The sub-query of TAllocInstHByDelivCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHByDelivCustomerIdList(SubQuery<TAllocInstHCB> subQuery) {
        assertObjectNotNull("subQuery<TAllocInstHCB>", subQuery);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID", pp, "tAllocInstHByDelivCustomerIdList");
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePk_ExistsReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepTwoOrMorePk_ExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_TAllocInstHByDelivCustomerIdList", sq); }

    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br>
     * {exists (select ... from T_ALLOC_INST_H where ...)}
     * @param subQuery The sub-query of TAllocInstHBySupplyCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHBySupplyCustomerIdList(SubQuery<TAllocInstHCB> subQuery) {
        assertObjectNotNull("subQuery<TAllocInstHCB>", subQuery);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID", pp, "tAllocInstHBySupplyCustomerIdList");
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePk_ExistsReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepTwoOrMorePk_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_TAllocInstHBySupplyCustomerIdList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br>
     * {not exists (select ... from T_ALLOC_INST_H where ...)}
     * @param subQuery The sub-query of TAllocInstHByDelivCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHByDelivCustomerIdList(SubQuery<TAllocInstHCB> subQuery) {
        assertObjectNotNull("subQuery<TAllocInstHCB>", subQuery);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID", pp, "tAllocInstHByDelivCustomerIdList");
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePk_NotExistsReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_TAllocInstHByDelivCustomerIdList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br>
     * {not exists (select ... from T_ALLOC_INST_H where ...)}
     * @param subQuery The sub-query of TAllocInstHBySupplyCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHBySupplyCustomerIdList(SubQuery<TAllocInstHCB> subQuery) {
        assertObjectNotNull("subQuery<TAllocInstHCB>", subQuery);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID", pp, "tAllocInstHBySupplyCustomerIdList");
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePk_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList", sq); }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveTAllocInstHByDelivCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID", pp, "tAllocInstHByDelivCustomerIdList", al, op);
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePk_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList", sq); }

    public void xsderiveTAllocInstHBySupplyCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID", pp, "tAllocInstHBySupplyCustomerIdList", al, op);
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePk_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList", sq); }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHByDelivCustomerIdList()</span>.<span style="color: #CC4747">max</span>(new SubQuery&lt;TAllocInstHCB&gt;() {
     *     public void query(TAllocInstHCB subCB) {
     *         subCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHByDelivCustomerIdList() {
        return xcreateQDRFunctionTAllocInstHByDelivCustomerIdList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHByDelivCustomerIdList() {
        return xcQDRFunc(new HpQDRSetupper<TAllocInstHCB>() {
            public void setup(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveTAllocInstHByDelivCustomerIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveTAllocInstHByDelivCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(cb.query()); String prpp = keepTwoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID", sqpp, "tAllocInstHByDelivCustomerIdList", rd, vl, prpp, op);
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList() { return xgetSQueMap("twoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepTwoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList", sq); }
    public Map<String, Object> xdfgetTwoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter() { return xgetSQuePmMap("twoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList"); }
    public String keepTwoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(Object pm) { return xkeepSQuePm("twoOrMorePkByDelivCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList", pm); }

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHBySupplyCustomerIdList()</span>.<span style="color: #CC4747">max</span>(new SubQuery&lt;TAllocInstHCB&gt;() {
     *     public void query(TAllocInstHCB subCB) {
     *         subCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHBySupplyCustomerIdList() {
        return xcreateQDRFunctionTAllocInstHBySupplyCustomerIdList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHBySupplyCustomerIdList() {
        return xcQDRFunc(new HpQDRSetupper<TAllocInstHCB>() {
            public void setup(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveTAllocInstHBySupplyCustomerIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveTAllocInstHBySupplyCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(cb.query()); String prpp = keepTwoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID", "CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID", sqpp, "tAllocInstHBySupplyCustomerIdList", rd, vl, prpp, op);
    }
    public Map<String, TAllocInstHCQ> xdfgetTwoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList() { return xgetSQueMap("twoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepTwoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq) { return xkeepSQue("twoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList", sq); }
    public Map<String, Object> xdfgetTwoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter() { return xgetSQuePmMap("twoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList"); }
    public String keepTwoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(Object pm) { return xkeepSQuePm("twoOrMorePkBySupplyCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList", pm); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterCustomerCB.class.getName(); }
    protected String xCQ() { return MCenterCustomerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
