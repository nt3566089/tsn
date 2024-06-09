package com.oneslogi.base.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import com.oneslogi.base.dbflute.allcommon.DBFluteConfig;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant;
import com.oneslogi.base.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;
import com.oneslogi.base.dbflute.cbean.nss.*;

/**
 * The base condition-bean of M_DELIVERY_COURSE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMDeliveryCourseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MDeliveryCourseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMDeliveryCourseCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "M_DELIVERY_COURSE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param deliveryCourseId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MDeliveryCourseCB acceptPK(Long deliveryCourseId) {
        assertObjectNotNull("deliveryCourseId", deliveryCourseId);
        BsMDeliveryCourseCB cb = this;
        cb.query().setDeliveryCourseId_Equal(deliveryCourseId);
        return (MDeliveryCourseCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param deliveryCourseId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long deliveryCourseId) {
        assertObjectNotNull("deliveryCourseId", deliveryCourseId);
        BsMDeliveryCourseCB cb = this;
        cb.query().setDeliveryCourseId_Equal(deliveryCourseId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param deliveryCourseCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MDeliveryCourseCB acceptUniqueOf(Long centerId, String deliveryCourseCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("deliveryCourseCd", deliveryCourseCd);
        BsMDeliveryCourseCB cb = this;
        cb.query().setCenterId_Equal(centerId);cb.query().setDeliveryCourseCd_Equal(deliveryCourseCd);
        return (MDeliveryCourseCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_DeliveryCourseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_DeliveryCourseId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MDeliveryCourseCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MDeliveryCourseCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MDeliveryCourseCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MDeliveryCourseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MDeliveryCourseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MDeliveryCourseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MDeliveryCourseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MDeliveryCourseCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MDeliveryCourseCB> unionCBLambda) {
        final MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MDeliveryCourseCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MDeliveryCourseCB> unionCBLambda) {
        final MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MDeliveryCourseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MCarrierNss _nssMCarrier;
    public MCarrierNss xdfgetNssMCarrier() {
        if (_nssMCarrier == null) { _nssMCarrier = new MCarrierNss(null); }
        return _nssMCarrier;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrier()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCarrier()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierNss setupSelect_MCarrier() {
        assertSetupSelectPurpose("mCarrier");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierId();
        }
        doSetupSelect(() -> query().queryMCarrier());
        if (_nssMCarrier == null || !_nssMCarrier.hasConditionQuery())
        { _nssMCarrier = new MCarrierNss(query().queryMCarrier()); }
        return _nssMCarrier;
    }

    protected MCarrierSlipSgwNss _nssMCarrierSlipSgw;
    public MCarrierSlipSgwNss xdfgetNssMCarrierSlipSgw() {
        if (_nssMCarrierSlipSgw == null) { _nssMCarrierSlipSgw = new MCarrierSlipSgwNss(null); }
        return _nssMCarrierSlipSgw;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierSlipSgw()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCarrierSlipSgw()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierSlipSgwNss setupSelect_MCarrierSlipSgw() {
        assertSetupSelectPurpose("mCarrierSlipSgw");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierSlipSgwId();
        }
        doSetupSelect(() -> query().queryMCarrierSlipSgw());
        if (_nssMCarrierSlipSgw == null || !_nssMCarrierSlipSgw.hasConditionQuery())
        { _nssMCarrierSlipSgw = new MCarrierSlipSgwNss(query().queryMCarrierSlipSgw()); }
        return _nssMCarrierSlipSgw;
    }

    protected MCarrierSlipYmtNss _nssMCarrierSlipYmt;
    public MCarrierSlipYmtNss xdfgetNssMCarrierSlipYmt() {
        if (_nssMCarrierSlipYmt == null) { _nssMCarrierSlipYmt = new MCarrierSlipYmtNss(null); }
        return _nssMCarrierSlipYmt;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierSlipYmt()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCarrierSlipYmt()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierSlipYmtNss setupSelect_MCarrierSlipYmt() {
        assertSetupSelectPurpose("mCarrierSlipYmt");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierSlipYmtId();
        }
        doSetupSelect(() -> query().queryMCarrierSlipYmt());
        if (_nssMCarrierSlipYmt == null || !_nssMCarrierSlipYmt.hasConditionQuery())
        { _nssMCarrierSlipYmt = new MCarrierSlipYmtNss(query().queryMCarrierSlipYmt()); }
        return _nssMCarrierSlipYmt;
    }

    protected MCarrierSlipYupkNss _nssMCarrierSlipYupk;
    public MCarrierSlipYupkNss xdfgetNssMCarrierSlipYupk() {
        if (_nssMCarrierSlipYupk == null) { _nssMCarrierSlipYupk = new MCarrierSlipYupkNss(null); }
        return _nssMCarrierSlipYupk;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierSlipYupk()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCarrierSlipYupk()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierSlipYupkNss setupSelect_MCarrierSlipYupk() {
        assertSetupSelectPurpose("mCarrierSlipYupk");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierSlipYupkId();
        }
        doSetupSelect(() -> query().queryMCarrierSlipYupk());
        if (_nssMCarrierSlipYupk == null || !_nssMCarrierSlipYupk.hasConditionQuery())
        { _nssMCarrierSlipYupk = new MCarrierSlipYupkNss(query().queryMCarrierSlipYupk()); }
        return _nssMCarrierSlipYupk;
    }

    protected MCenterNss _nssMCenter;
    public MCenterNss xdfgetNssMCenter() {
        if (_nssMCenter == null) { _nssMCenter = new MCenterNss(null); }
        return _nssMCenter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterNss setupSelect_MCenter() {
        assertSetupSelectPurpose("mCenter");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCenterId();
        }
        doSetupSelect(() -> query().queryMCenter());
        if (_nssMCenter == null || !_nssMCenter.hasConditionQuery())
        { _nssMCenter = new MCenterNss(query().queryMCenter()); }
        return _nssMCenter;
    }

    protected BClassDtlNss _nssBClassDtlByDelFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDelFlg() {
        if (_nssBClassDtlByDelFlg == null) { _nssBClassDtlByDelFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDelFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDelFlg() {
        assertSetupSelectPurpose("bClassDtlByDelFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDelFlg());
        if (_nssBClassDtlByDelFlg == null || !_nssBClassDtlByDelFlg.hasConditionQuery())
        { _nssBClassDtlByDelFlg = new BClassDtlNss(query().queryBClassDtlByDelFlg()); }
        return _nssBClassDtlByDelFlg;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByTagDataType;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByTagDataType() {
        if (_nssMCenterClassDtlByTagDataType == null) { _nssMCenterClassDtlByTagDataType = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByTagDataType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByTagDataType(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCenterClassDtlByTagDataType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByTagDataType(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByTagDataType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTagDataType();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByTagDataType(centerId));
        if (_nssMCenterClassDtlByTagDataType == null || !_nssMCenterClassDtlByTagDataType.hasConditionQuery())
        { _nssMCenterClassDtlByTagDataType = new MCenterClassDtlNss(query().queryMCenterClassDtlByTagDataType(centerId)); }
        return _nssMCenterClassDtlByTagDataType;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByTagType;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByTagType() {
        if (_nssMCenterClassDtlByTagType == null) { _nssMCenterClassDtlByTagType = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByTagType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByTagType(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCenterClassDtlByTagType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByTagType(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByTagType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTagType();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByTagType(centerId));
        if (_nssMCenterClassDtlByTagType == null || !_nssMCenterClassDtlByTagType.hasConditionQuery())
        { _nssMCenterClassDtlByTagType = new MCenterClassDtlNss(query().queryMCenterClassDtlByTagType(centerId)); }
        return _nssMCenterClassDtlByTagType;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByTagTypeAfter;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByTagTypeAfter() {
        if (_nssMCenterClassDtlByTagTypeAfter == null) { _nssMCenterClassDtlByTagTypeAfter = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByTagTypeAfter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByTagTypeAfter(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCenterClassDtlByTagTypeAfter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByTagTypeAfter(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByTagTypeAfter");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTagTypeAfter();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByTagTypeAfter(centerId));
        if (_nssMCenterClassDtlByTagTypeAfter == null || !_nssMCenterClassDtlByTagTypeAfter.hasConditionQuery())
        { _nssMCenterClassDtlByTagTypeAfter = new MCenterClassDtlNss(query().queryMCenterClassDtlByTagTypeAfter(centerId)); }
        return _nssMCenterClassDtlByTagTypeAfter;
    }

    protected BClassDtlNss _nssBClassDtlByTrackingNumberingUnit;
    public BClassDtlNss xdfgetNssBClassDtlByTrackingNumberingUnit() {
        if (_nssBClassDtlByTrackingNumberingUnit == null) { _nssBClassDtlByTrackingNumberingUnit = new BClassDtlNss(null); }
        return _nssBClassDtlByTrackingNumberingUnit;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByTrackingNumberingUnit()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getBClassDtlByTrackingNumberingUnit()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByTrackingNumberingUnit() {
        assertSetupSelectPurpose("bClassDtlByTrackingNumberingUnit");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTrackingNumberingUnit();
        }
        doSetupSelect(() -> query().queryBClassDtlByTrackingNumberingUnit());
        if (_nssBClassDtlByTrackingNumberingUnit == null || !_nssBClassDtlByTrackingNumberingUnit.hasConditionQuery())
        { _nssBClassDtlByTrackingNumberingUnit = new BClassDtlNss(query().queryBClassDtlByTrackingNumberingUnit()); }
        return _nssBClassDtlByTrackingNumberingUnit;
    }

    protected BClassDtlNss _nssBClassDtlByPaymentTerm;
    public BClassDtlNss xdfgetNssBClassDtlByPaymentTerm() {
        if (_nssBClassDtlByPaymentTerm == null) { _nssBClassDtlByPaymentTerm = new BClassDtlNss(null); }
        return _nssBClassDtlByPaymentTerm;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPaymentTerm()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mDeliveryCourse</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getBClassDtlByPaymentTerm()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPaymentTerm() {
        assertSetupSelectPurpose("bClassDtlByPaymentTerm");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPaymentTerm();
        }
        doSetupSelect(() -> query().queryBClassDtlByPaymentTerm());
        if (_nssBClassDtlByPaymentTerm == null || !_nssBClassDtlByPaymentTerm.hasConditionQuery())
        { _nssBClassDtlByPaymentTerm = new BClassDtlNss(query().queryBClassDtlByPaymentTerm()); }
        return _nssBClassDtlByPaymentTerm;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MDeliveryCourseCQ> {
        protected MCarrierCB.HpSpecification _mCarrier;
        protected MCarrierSlipSgwCB.HpSpecification _mCarrierSlipSgw;
        protected MCarrierSlipYmtCB.HpSpecification _mCarrierSlipYmt;
        protected MCarrierSlipYupkCB.HpSpecification _mCarrierSlipYupk;
        protected MCenterCB.HpSpecification _mCenter;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByTagDataType;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByTagType;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByTagTypeAfter;
        protected BClassDtlCB.HpSpecification _bClassDtlByTrackingNumberingUnit;
        protected BClassDtlCB.HpSpecification _bClassDtlByPaymentTerm;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MDeliveryCourseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryCourseId() { return doColumn("DELIVERY_COURSE_ID"); }
        /**
         * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryCourseCd() { return doColumn("DELIVERY_COURSE_CD"); }
        /**
         * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryCourseNm() { return doColumn("DELIVERY_COURSE_NM"); }
        /**
         * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierId() { return doColumn("CARRIER_ID"); }
        /**
         * PICKING_TIME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingTime() { return doColumn("PICKING_TIME"); }
        /**
         * STOWAGE_TIME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStowageTime() { return doColumn("STOWAGE_TIME"); }
        /**
         * SHIPPING_TIME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingTime() { return doColumn("SHIPPING_TIME"); }
        /**
         * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierSlipYmtId() { return doColumn("CARRIER_SLIP_YMT_ID"); }
        /**
         * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierSlipSgwId() { return doColumn("CARRIER_SLIP_SGW_ID"); }
        /**
         * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierSlipYupkId() { return doColumn("CARRIER_SLIP_YUPK_ID"); }
        /**
         * TRACKING_NUMBERING_KEY: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrackingNumberingKey() { return doColumn("TRACKING_NUMBERING_KEY"); }
        /**
         * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrackingNumberingAfterKey() { return doColumn("TRACKING_NUMBERING_AFTER_KEY"); }
        /**
         * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrackingNumberingUnit() { return doColumn("TRACKING_NUMBERING_UNIT"); }
        /**
         * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTagType() { return doColumn("TAG_TYPE"); }
        /**
         * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTagTypeAfter() { return doColumn("TAG_TYPE_AFTER"); }
        /**
         * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTagDataType() { return doColumn("TAG_DATA_TYPE"); }
        /**
         * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentTerm() { return doColumn("PAYMENT_TERM"); }
        /**
         * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelFlg() { return doColumn("DEL_FLG"); }
        /**
         * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        /**
         * CONTROL_NO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnControlNo() { return doColumn("CONTROL_NO"); }
        /**
         * ADD_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddDt() { return doColumn("ADD_DT"); }
        /**
         * ADD_USER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddUser() { return doColumn("ADD_USER"); }
        /**
         * ADD_PROCESS: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddProcess() { return doColumn("ADD_PROCESS"); }
        /**
         * UPD_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdDt() { return doColumn("UPD_DT"); }
        /**
         * UPD_USER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdUser() { return doColumn("UPD_USER"); }
        /**
         * UPD_PROCESS: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdProcess() { return doColumn("UPD_PROCESS"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnDeliveryCourseId(); // PK
            if (qyCall().qy().hasConditionQueryMCarrier()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnCarrierId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierSlipSgw()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipSgwCQ) {
                columnCarrierSlipSgwId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierSlipYmt()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYmtCQ) {
                columnCarrierSlipYmtId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierSlipYupk()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnCarrierSlipYupkId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByTagDataType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnTagDataType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByTagType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnTagType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByTagTypeAfter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnTagTypeAfter(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByTrackingNumberingUnit()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnTrackingNumberingUnit(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPaymentTerm()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPaymentTerm(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_DELIVERY_COURSE"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierCB.HpSpecification specifyMCarrier() {
            assertRelation("mCarrier");
            if (_mCarrier == null) {
                _mCarrier = new MCarrierCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrier()
                                    , () -> _qyCall.qy().queryMCarrier())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrier.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrier()
                      , () -> xsyncQyCall().qy().queryMCarrier()));
                }
            }
            return _mCarrier;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierSlipSgwCB.HpSpecification specifyMCarrierSlipSgw() {
            assertRelation("mCarrierSlipSgw");
            if (_mCarrierSlipSgw == null) {
                _mCarrierSlipSgw = new MCarrierSlipSgwCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierSlipSgw()
                                    , () -> _qyCall.qy().queryMCarrierSlipSgw())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierSlipSgw.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierSlipSgw()
                      , () -> xsyncQyCall().qy().queryMCarrierSlipSgw()));
                }
            }
            return _mCarrierSlipSgw;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierSlipYmtCB.HpSpecification specifyMCarrierSlipYmt() {
            assertRelation("mCarrierSlipYmt");
            if (_mCarrierSlipYmt == null) {
                _mCarrierSlipYmt = new MCarrierSlipYmtCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierSlipYmt()
                                    , () -> _qyCall.qy().queryMCarrierSlipYmt())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierSlipYmt.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierSlipYmt()
                      , () -> xsyncQyCall().qy().queryMCarrierSlipYmt()));
                }
            }
            return _mCarrierSlipYmt;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierSlipYupkCB.HpSpecification specifyMCarrierSlipYupk() {
            assertRelation("mCarrierSlipYupk");
            if (_mCarrierSlipYupk == null) {
                _mCarrierSlipYupk = new MCarrierSlipYupkCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierSlipYupk()
                                    , () -> _qyCall.qy().queryMCarrierSlipYupk())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierSlipYupk.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierSlipYupk()
                      , () -> xsyncQyCall().qy().queryMCarrierSlipYupk()));
                }
            }
            return _mCarrierSlipYupk;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER by my CENTER_ID, named 'MCenter'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterCB.HpSpecification specifyMCenter() {
            assertRelation("mCenter");
            if (_mCenter == null) {
                _mCenter = new MCenterCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenter()
                                    , () -> _qyCall.qy().queryMCenter())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenter.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenter()
                      , () -> xsyncQyCall().qy().queryMCenter()));
                }
            }
            return _mCenter;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDelFlg() {
            assertRelation("bClassDtlByDelFlg");
            if (_bClassDtlByDelFlg == null) {
                _bClassDtlByDelFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDelFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDelFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDelFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDelFlg()));
                }
            }
            return _bClassDtlByDelFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTagDataType(final Long centerId) {
            assertRelation("mCenterClassDtlByTagDataType");
            if (_mCenterClassDtlByTagDataType == null) {
                _mCenterClassDtlByTagDataType = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTagDataType()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByTagDataType(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTagDataType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTagDataType()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByTagDataType(centerId)));
                }
            }
            return _mCenterClassDtlByTagDataType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTagDataType() {
            assertRelation("mCenterClassDtlByTagDataType");
            if (_mCenterClassDtlByTagDataType == null) {
                _mCenterClassDtlByTagDataType = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTagDataType()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByTagDataType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTagDataType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTagDataType()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByTagDataType()));
                }
            }
            return _mCenterClassDtlByTagDataType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTagType(final Long centerId) {
            assertRelation("mCenterClassDtlByTagType");
            if (_mCenterClassDtlByTagType == null) {
                _mCenterClassDtlByTagType = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTagType()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByTagType(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTagType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTagType()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByTagType(centerId)));
                }
            }
            return _mCenterClassDtlByTagType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTagType() {
            assertRelation("mCenterClassDtlByTagType");
            if (_mCenterClassDtlByTagType == null) {
                _mCenterClassDtlByTagType = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTagType()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByTagType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTagType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTagType()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByTagType()));
                }
            }
            return _mCenterClassDtlByTagType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTagTypeAfter(final Long centerId) {
            assertRelation("mCenterClassDtlByTagTypeAfter");
            if (_mCenterClassDtlByTagTypeAfter == null) {
                _mCenterClassDtlByTagTypeAfter = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTagTypeAfter()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByTagTypeAfter(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTagTypeAfter.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTagTypeAfter()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByTagTypeAfter(centerId)));
                }
            }
            return _mCenterClassDtlByTagTypeAfter;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTagTypeAfter() {
            assertRelation("mCenterClassDtlByTagTypeAfter");
            if (_mCenterClassDtlByTagTypeAfter == null) {
                _mCenterClassDtlByTagTypeAfter = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTagTypeAfter()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByTagTypeAfter())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTagTypeAfter.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTagTypeAfter()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByTagTypeAfter()));
                }
            }
            return _mCenterClassDtlByTagTypeAfter;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByTrackingNumberingUnit() {
            assertRelation("bClassDtlByTrackingNumberingUnit");
            if (_bClassDtlByTrackingNumberingUnit == null) {
                _bClassDtlByTrackingNumberingUnit = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByTrackingNumberingUnit()
                                    , () -> _qyCall.qy().queryBClassDtlByTrackingNumberingUnit())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByTrackingNumberingUnit.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByTrackingNumberingUnit()
                      , () -> xsyncQyCall().qy().queryBClassDtlByTrackingNumberingUnit()));
                }
            }
            return _bClassDtlByTrackingNumberingUnit;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPaymentTerm() {
            assertRelation("bClassDtlByPaymentTerm");
            if (_bClassDtlByPaymentTerm == null) {
                _bClassDtlByPaymentTerm = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPaymentTerm()
                                    , () -> _qyCall.qy().queryBClassDtlByPaymentTerm())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPaymentTerm.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPaymentTerm()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPaymentTerm()));
                }
            }
            return _bClassDtlByPaymentTerm;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_CUSTOMER where ...) as FOO_MAX} <br>
         * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     customerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     customerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterCustomer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterCustomerCB, MDeliveryCourseCQ> derivedMCenterCustomerList() {
            assertDerived("mCenterCustomerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterCustomerCB> sq, MDeliveryCourseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterCustomerList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_PARAM where ...) as FOO_MAX} <br>
         * M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     paramCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     paramCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MParam.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MParamCB, MDeliveryCourseCQ> derivedMParamList() {
            assertDerived("mParamList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MParamCB> sq, MDeliveryCourseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMParamList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_ALLOC_INST_H where ...) as FOO_MAX} <br>
         * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstHCB, MDeliveryCourseCQ> derivedTAllocInstHList() {
            assertDerived("tAllocInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstHCB> sq, MDeliveryCourseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SHIPPING_INST_H where ...) as FOO_MAX} <br>
         * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MDeliveryCourseCQ> derivedTShippingInstHList() {
            assertDerived("tShippingInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MDeliveryCourseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_LOADING where ...) as FOO_MAX} <br>
         * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loadingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loadingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtLoading.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtLoadingCB, MDeliveryCourseCQ> derivedWHtLoadingList() {
            assertDerived("wHtLoadingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtLoadingCB> sq, MDeliveryCourseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtLoadingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MDeliveryCourseCB, MDeliveryCourseCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDeliveryCourseCB> sq, MDeliveryCourseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MDeliveryCourseCB dreamCruiseCB() {
        MDeliveryCourseCB cb = new MDeliveryCourseCB();
        cb.xsetupForDreamCruise((MDeliveryCourseCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MDeliveryCourseCB> columnQuery(final SpecifyQuery<MDeliveryCourseCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MDeliveryCourseCB xcreateColumnQueryCB() {
        MDeliveryCourseCB cb = new MDeliveryCourseCB();
        cb.xsetupForColumnQuery((MDeliveryCourseCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MDeliveryCourseCB> orCBLambda) {
        xorSQ((MDeliveryCourseCB)this, orCBLambda);
    }

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MDeliveryCourseCB> andCBLambda) {
        xorSQAP((MDeliveryCourseCB)this, andCBLambda);
    }

    /**
     * Check invalid query when query is set. <br>
     * (it throws an exception if set query is invalid) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this. <br>
     *
     * <p>renamed to checkNullOrEmptyQuery() since 1.1,
     * but not deprecated because it might have many use.</p>
     *
     * #java8 compatible option
     */
    public void checkInvalidQuery() {
        checkNullOrEmptyQuery();
    }

    /**
     * Accept (no check) an invalid query when a query is set. <br>
     * (no condition if a set query is invalid) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use ignoreNullOrEmptyQuery()
     */
    public void acceptInvalidQuery() {
        getSqlClause().ignoreNullOrEmptyQuery();
    }

    /**
     * Allow to auto-detect joins that can be inner-join. <br>
     * <pre>
     * o You should call this before registrations of where clause.
     * o Union and SubQuery and other sub condition-bean inherit this.
     * o You should confirm your SQL on the log to be tuned by inner-join correctly.
     * </pre>
     * @deprecated use enableInnerJoinAutoDetect()
     */
    public void allowInnerJoinAutoDetect() {
        enableInnerJoinAutoDetect();
    }

    /**
     * Suppress auto-detecting inner-join. <br>
     * You should call this before registrations of where clause.
     * @deprecated use disableInnerJoinAutoDetect()
     */
    public void suppressInnerJoinAutoDetect() {
        disableInnerJoinAutoDetect();
    }

    /**
     * Allow an empty string for query. <br>
     * (you can use an empty string as condition) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use enableEmptyStringQuery()
     */
    public void allowEmptyStringQuery() {
        doEnableEmptyStringQuery();
    }

    /**
     * Enable checking record count before QueryUpdate (contains QueryDelete). (default is disabled) <br>
     * No query update if zero count. (basically for MySQL's deadlock by next-key lock)
     * @deprecated use enableQueryUpdateCountPreCheck()
     */
    public void enableCheckCountBeforeQueryUpdate() {
        enableQueryUpdateCountPreCheck();
    }

    /**
     * Disable checking record count before QueryUpdate (contains QueryDelete). (back to default) <br>
     * Executes query update even if zero count. (normal specification)
     * @deprecated use disableQueryUpdateCountPreCheck()
     */
    public void disableCheckCountBeforeQueryUpdate() {
        disableQueryUpdateCountPreCheck();
    }

    /**
     * Allow "that's bad timing" check.
     * @deprecated use enableThatsBadTiming()
     */
    public void allowThatsBadTiming() {
        enableThatsBadTiming();
    }

    /**
     * Suppress "that's bad timing" check.
     * @deprecated use disableThatsBadTiming()
     */
    public void suppressThatsBadTiming() {
        disableThatsBadTiming();
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MDeliveryCourseCB cb;
        if (mainCB != null) {
            cb = (MDeliveryCourseCB)mainCB;
        } else {
            cb = new MDeliveryCourseCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MDeliveryCourseCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MDeliveryCourseCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
