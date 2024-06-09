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
 * The base condition-bean of T_SHIPPING_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstHCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstHCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHCB() {
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
        return "T_SHIPPING_INST_H";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param shippingInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TShippingInstHCB acceptPK(Long shippingInstHId) {
        assertObjectNotNull("shippingInstHId", shippingInstHId);
        BsTShippingInstHCB cb = this;
        cb.query().setShippingInstHId_Equal(shippingInstHId);
        return (TShippingInstHCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param shippingInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long shippingInstHId) {
        assertObjectNotNull("shippingInstHId", shippingInstHId);
        BsTShippingInstHCB cb = this;
        cb.query().setShippingInstHId_Equal(shippingInstHId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ShippingInstHId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ShippingInstHId_Desc();
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
    public TShippingInstHCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TShippingInstHCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TShippingInstHCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TShippingInstHCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TShippingInstHCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TShippingInstHCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TShippingInstHCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TShippingInstHCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TShippingInstHCB> unionCBLambda) {
        final TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TShippingInstHCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TShippingInstHCB> unionCBLambda) {
        final TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TShippingInstHCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TAllocInstHNss _nssTAllocInstH;
    public TAllocInstHNss xdfgetNssTAllocInstH() {
        if (_nssTAllocInstH == null) { _nssTAllocInstH = new TAllocInstHNss(null); }
        return _nssTAllocInstH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TAllocInstH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getTAllocInstH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TAllocInstHNss setupSelect_TAllocInstH() {
        assertSetupSelectPurpose("tAllocInstH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAllocInstHId();
        }
        doSetupSelect(() -> query().queryTAllocInstH());
        if (_nssTAllocInstH == null || !_nssTAllocInstH.hasConditionQuery())
        { _nssTAllocInstH = new TAllocInstHNss(query().queryTAllocInstH()); }
        return _nssTAllocInstH;
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
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MClientNss _nssMClient;
    public MClientNss xdfgetNssMClient() {
        if (_nssMClient == null) { _nssMClient = new MClientNss(null); }
        return _nssMClient;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MClientNss setupSelect_MClient() {
        assertSetupSelectPurpose("mClient");
        if (hasSpecifiedLocalColumn()) {
            specify().columnClientId();
        }
        doSetupSelect(() -> query().queryMClient());
        if (_nssMClient == null || !_nssMClient.hasConditionQuery())
        { _nssMClient = new MClientNss(query().queryMClient()); }
        return _nssMClient;
    }

    protected MDeliveryCourseNss _nssMDeliveryCourse;
    public MDeliveryCourseNss xdfgetNssMDeliveryCourse() {
        if (_nssMDeliveryCourse == null) { _nssMDeliveryCourse = new MDeliveryCourseNss(null); }
        return _nssMDeliveryCourse;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MDeliveryCourse()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMDeliveryCourse()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MDeliveryCourseNss setupSelect_MDeliveryCourse() {
        assertSetupSelectPurpose("mDeliveryCourse");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDeliveryCourseId();
        }
        doSetupSelect(() -> query().queryMDeliveryCourse());
        if (_nssMDeliveryCourse == null || !_nssMDeliveryCourse.hasConditionQuery())
        { _nssMDeliveryCourse = new MDeliveryCourseNss(query().queryMDeliveryCourse()); }
        return _nssMDeliveryCourse;
    }

    protected MCustomerNss _nssMCustomerByDelivCustomerId;
    public MCustomerNss xdfgetNssMCustomerByDelivCustomerId() {
        if (_nssMCustomerByDelivCustomerId == null) { _nssMCustomerByDelivCustomerId = new MCustomerNss(null); }
        return _nssMCustomerByDelivCustomerId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerByDelivCustomerId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMCustomerByDelivCustomerId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerByDelivCustomerId() {
        assertSetupSelectPurpose("mCustomerByDelivCustomerId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelivCustomerId();
        }
        doSetupSelect(() -> query().queryMCustomerByDelivCustomerId());
        if (_nssMCustomerByDelivCustomerId == null || !_nssMCustomerByDelivCustomerId.hasConditionQuery())
        { _nssMCustomerByDelivCustomerId = new MCustomerNss(query().queryMCustomerByDelivCustomerId()); }
        return _nssMCustomerByDelivCustomerId;
    }

    protected MProcessTypeNss _nssMProcessType;
    public MProcessTypeNss xdfgetNssMProcessType() {
        if (_nssMProcessType == null) { _nssMProcessType = new MProcessTypeNss(null); }
        return _nssMProcessType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProcessType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMProcessType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProcessTypeNss setupSelect_MProcessType() {
        assertSetupSelectPurpose("mProcessType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProcessTypeId();
        }
        doSetupSelect(() -> query().queryMProcessType());
        if (_nssMProcessType == null || !_nssMProcessType.hasConditionQuery())
        { _nssMProcessType = new MProcessTypeNss(query().queryMProcessType()); }
        return _nssMProcessType;
    }

    protected MCustomerNss _nssMCustomerBySupplyCustomerId;
    public MCustomerNss xdfgetNssMCustomerBySupplyCustomerId() {
        if (_nssMCustomerBySupplyCustomerId == null) { _nssMCustomerBySupplyCustomerId = new MCustomerNss(null); }
        return _nssMCustomerBySupplyCustomerId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerBySupplyCustomerId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMCustomerBySupplyCustomerId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerBySupplyCustomerId() {
        assertSetupSelectPurpose("mCustomerBySupplyCustomerId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSupplyCustomerId();
        }
        doSetupSelect(() -> query().queryMCustomerBySupplyCustomerId());
        if (_nssMCustomerBySupplyCustomerId == null || !_nssMCustomerBySupplyCustomerId.hasConditionQuery())
        { _nssMCustomerBySupplyCustomerId = new MCustomerNss(query().queryMCustomerBySupplyCustomerId()); }
        return _nssMCustomerBySupplyCustomerId;
    }

    protected MZipNss _nssMZipForDeliv;
    public MZipNss xdfgetNssMZipForDeliv() {
        if (_nssMZipForDeliv == null) { _nssMZipForDeliv = new MZipNss(null); }
        return _nssMZipForDeliv;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MZipForDeliv()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getMZipForDeliv()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MZipNss setupSelect_MZipForDeliv() {
        assertSetupSelectPurpose("mZipForDeliv");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelivZipCd();
        }
        doSetupSelect(() -> query().queryMZipForDeliv());
        if (_nssMZipForDeliv == null || !_nssMZipForDeliv.hasConditionQuery())
        { _nssMZipForDeliv = new MZipNss(query().queryMZipForDeliv()); }
        return _nssMZipForDeliv;
    }

    protected BClassDtlNss _nssBClassDtlByDelivTz;
    public BClassDtlNss xdfgetNssBClassDtlByDelivTz() {
        if (_nssBClassDtlByDelivTz == null) { _nssBClassDtlByDelivTz = new BClassDtlNss(null); }
        return _nssBClassDtlByDelivTz;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelivTz()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getBClassDtlByDelivTz()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDelivTz() {
        assertSetupSelectPurpose("bClassDtlByDelivTz");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelivTz();
        }
        doSetupSelect(() -> query().queryBClassDtlByDelivTz());
        if (_nssBClassDtlByDelivTz == null || !_nssBClassDtlByDelivTz.hasConditionQuery())
        { _nssBClassDtlByDelivTz = new BClassDtlNss(query().queryBClassDtlByDelivTz()); }
        return _nssBClassDtlByDelivTz;
    }

    protected BClassDtlNss _nssBClassDtlByEmergencyFlg;
    public BClassDtlNss xdfgetNssBClassDtlByEmergencyFlg() {
        if (_nssBClassDtlByEmergencyFlg == null) { _nssBClassDtlByEmergencyFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByEmergencyFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByEmergencyFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getBClassDtlByEmergencyFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByEmergencyFlg() {
        assertSetupSelectPurpose("bClassDtlByEmergencyFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEmergencyFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByEmergencyFlg());
        if (_nssBClassDtlByEmergencyFlg == null || !_nssBClassDtlByEmergencyFlg.hasConditionQuery())
        { _nssBClassDtlByEmergencyFlg = new BClassDtlNss(query().queryBClassDtlByEmergencyFlg()); }
        return _nssBClassDtlByEmergencyFlg;
    }

    protected BClassDtlNss _nssBClassDtlByErrorFlg;
    public BClassDtlNss xdfgetNssBClassDtlByErrorFlg() {
        if (_nssBClassDtlByErrorFlg == null) { _nssBClassDtlByErrorFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByErrorFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByErrorFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getBClassDtlByErrorFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByErrorFlg() {
        assertSetupSelectPurpose("bClassDtlByErrorFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnErrorFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByErrorFlg());
        if (_nssBClassDtlByErrorFlg == null || !_nssBClassDtlByErrorFlg.hasConditionQuery())
        { _nssBClassDtlByErrorFlg = new BClassDtlNss(query().queryBClassDtlByErrorFlg()); }
        return _nssBClassDtlByErrorFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInputType;
    public BClassDtlNss xdfgetNssBClassDtlByInputType() {
        if (_nssBClassDtlByInputType == null) { _nssBClassDtlByInputType = new BClassDtlNss(null); }
        return _nssBClassDtlByInputType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInputType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getBClassDtlByInputType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInputType() {
        assertSetupSelectPurpose("bClassDtlByInputType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInputType();
        }
        doSetupSelect(() -> query().queryBClassDtlByInputType());
        if (_nssBClassDtlByInputType == null || !_nssBClassDtlByInputType.hasConditionQuery())
        { _nssBClassDtlByInputType = new BClassDtlNss(query().queryBClassDtlByInputType()); }
        return _nssBClassDtlByInputType;
    }

    protected BClassDtlNss _nssBClassDtlByShippingStatus;
    public BClassDtlNss xdfgetNssBClassDtlByShippingStatus() {
        if (_nssBClassDtlByShippingStatus == null) { _nssBClassDtlByShippingStatus = new BClassDtlNss(null); }
        return _nssBClassDtlByShippingStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByShippingStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getBClassDtlByShippingStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByShippingStatus() {
        assertSetupSelectPurpose("bClassDtlByShippingStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShippingStatus();
        }
        doSetupSelect(() -> query().queryBClassDtlByShippingStatus());
        if (_nssBClassDtlByShippingStatus == null || !_nssBClassDtlByShippingStatus.hasConditionQuery())
        { _nssBClassDtlByShippingStatus = new BClassDtlNss(query().queryBClassDtlByShippingStatus()); }
        return _nssBClassDtlByShippingStatus;
    }

    protected BClassDtlNss _nssBClassDtlByStockOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStockOutFlg() {
        if (_nssBClassDtlByStockOutFlg == null) { _nssBClassDtlByStockOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStockOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tShippingInstH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tShippingInstH</span>.<span style="color: #CC4747">getBClassDtlByStockOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStockOutFlg() {
        assertSetupSelectPurpose("bClassDtlByStockOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStockOutFlg());
        if (_nssBClassDtlByStockOutFlg == null || !_nssBClassDtlByStockOutFlg.hasConditionQuery())
        { _nssBClassDtlByStockOutFlg = new BClassDtlNss(query().queryBClassDtlByStockOutFlg()); }
        return _nssBClassDtlByStockOutFlg;
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

    public static class HpSpecification extends HpAbstractSpecification<TShippingInstHCQ> {
        protected TAllocInstHCB.HpSpecification _tAllocInstH;
        protected MCenterCB.HpSpecification _mCenter;
        protected MClientCB.HpSpecification _mClient;
        protected MDeliveryCourseCB.HpSpecification _mDeliveryCourse;
        protected MCustomerCB.HpSpecification _mCustomerByDelivCustomerId;
        protected MProcessTypeCB.HpSpecification _mProcessType;
        protected MCustomerCB.HpSpecification _mCustomerBySupplyCustomerId;
        protected MZipCB.HpSpecification _mZipForDeliv;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelivTz;
        protected BClassDtlCB.HpSpecification _bClassDtlByEmergencyFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByErrorFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInputType;
        protected BClassDtlCB.HpSpecification _bClassDtlByShippingStatus;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockOutFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TShippingInstHCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingInstHId() { return doColumn("SHIPPING_INST_H_ID"); }
        /**
         * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessTypeId() { return doColumn("PROCESS_TYPE_ID"); }
        /**
         * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInputType() { return doColumn("INPUT_TYPE"); }
        /**
         * SHIPPING_DT: {IX, NotNull, varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingDt() { return doColumn("SHIPPING_DT"); }
        /**
         * WORK_DT: {IX, varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWorkDt() { return doColumn("WORK_DT"); }
        /**
         * DELIV_PLAN_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivPlanDt() { return doColumn("DELIV_PLAN_DT"); }
        /**
         * DELIV_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivDt() { return doColumn("DELIV_DT"); }
        /**
         * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTz() { return doColumn("DELIV_TZ"); }
        /**
         * CLIENT_SHIPPING_NO: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientShippingNo() { return doColumn("CLIENT_SHIPPING_NO"); }
        /**
         * SHIPPING_SLIP_NO: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingSlipNo() { return doColumn("SHIPPING_SLIP_NO"); }
        /**
         * SHIPPING_STATUS: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=ShippingStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingStatus() { return doColumn("SHIPPING_STATUS"); }
        /**
         * SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplyCustomerId() { return doColumn("SUPPLY_CUSTOMER_ID"); }
        /**
         * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplyCustomerCd() { return doColumn("SUPPLY_CUSTOMER_CD"); }
        /**
         * SUPPLY_CUSTOMER_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplyCustomerNm() { return doColumn("SUPPLY_CUSTOMER_NM"); }
        /**
         * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerId() { return doColumn("DELIV_CUSTOMER_ID"); }
        /**
         * DELIV_CUSTOMER_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerCd() { return doColumn("DELIV_CUSTOMER_CD"); }
        /**
         * DELIV_ZIP_CD: {varchar(30), FK to M_ZIP}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivZipCd() { return doColumn("DELIV_ZIP_CD"); }
        /**
         * DELIV_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddress1() { return doColumn("DELIV_ADDRESS1"); }
        /**
         * DELIV_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddress2() { return doColumn("DELIV_ADDRESS2"); }
        /**
         * DELIV_ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddress3() { return doColumn("DELIV_ADDRESS3"); }
        /**
         * DELIV_ADDRESS_SUPPLY: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddressSupply() { return doColumn("DELIV_ADDRESS_SUPPLY"); }
        /**
         * DELIV_CUSTOMER_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerNm() { return doColumn("DELIV_CUSTOMER_NM"); }
        /**
         * DELIV_TEL_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTelNo() { return doColumn("DELIV_TEL_NO"); }
        /**
         * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryCourseId() { return doColumn("DELIVERY_COURSE_ID"); }
        /**
         * DELIVERY_COURSE_CD: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryCourseCd() { return doColumn("DELIVERY_COURSE_CD"); }
        /**
         * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmergencyFlg() { return doColumn("EMERGENCY_FLG"); }
        /**
         * PICKING_WORK_MESSAGE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingWorkMessage() { return doColumn("PICKING_WORK_MESSAGE"); }
        /**
         * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorFlg() { return doColumn("ERROR_FLG"); }
        /**
         * ERROR_MESSAGE_CD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorMessageCd() { return doColumn("ERROR_MESSAGE_CD"); }
        /**
         * PICKING_BATCH_NO: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingBatchNo() { return doColumn("PICKING_BATCH_NO"); }
        /**
         * STOCK_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockOutFlg() { return doColumn("STOCK_OUT_FLG"); }
        /**
         * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocInstHId() { return doColumn("ALLOC_INST_H_ID"); }
        /**
         * COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCod() { return doColumn("COD"); }
        /**
         * COD_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodTax() { return doColumn("COD_TAX"); }
        /**
         * TOTAL_PRICE: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalPrice() { return doColumn("TOTAL_PRICE"); }
        /**
         * TOTAL_TAX: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalTax() { return doColumn("TOTAL_TAX"); }
        /**
         * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
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
            columnShippingInstHId(); // PK
            if (qyCall().qy().hasConditionQueryTAllocInstH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TAllocInstHCQ) {
                columnAllocInstHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMDeliveryCourse()
                    || qyCall().qy().xgetReferrerQuery() instanceof MDeliveryCourseCQ) {
                columnDeliveryCourseId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomerByDelivCustomerId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnDelivCustomerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMProcessType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnProcessTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomerBySupplyCustomerId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnSupplyCustomerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMZipForDeliv()
                    || qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnDelivZipCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelivTz()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelivTz(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByEmergencyFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnEmergencyFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByErrorFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnErrorFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInputType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInputType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByShippingStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnShippingStatus(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStockOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStockOutFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_SHIPPING_INST_H"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TAllocInstHCB.HpSpecification specifyTAllocInstH() {
            assertRelation("tAllocInstH");
            if (_tAllocInstH == null) {
                _tAllocInstH = new TAllocInstHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTAllocInstH()
                                    , () -> _qyCall.qy().queryTAllocInstH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tAllocInstH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTAllocInstH()
                      , () -> xsyncQyCall().qy().queryTAllocInstH()));
                }
            }
            return _tAllocInstH;
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
         * M_CLIENT by my CLIENT_ID, named 'MClient'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MClientCB.HpSpecification specifyMClient() {
            assertRelation("mClient");
            if (_mClient == null) {
                _mClient = new MClientCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMClient()
                                    , () -> _qyCall.qy().queryMClient())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mClient.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMClient()
                      , () -> xsyncQyCall().qy().queryMClient()));
                }
            }
            return _mClient;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MDeliveryCourseCB.HpSpecification specifyMDeliveryCourse() {
            assertRelation("mDeliveryCourse");
            if (_mDeliveryCourse == null) {
                _mDeliveryCourse = new MDeliveryCourseCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMDeliveryCourse()
                                    , () -> _qyCall.qy().queryMDeliveryCourse())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mDeliveryCourse.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMDeliveryCourse()
                      , () -> xsyncQyCall().qy().queryMDeliveryCourse()));
                }
            }
            return _mDeliveryCourse;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerByDelivCustomerId() {
            assertRelation("mCustomerByDelivCustomerId");
            if (_mCustomerByDelivCustomerId == null) {
                _mCustomerByDelivCustomerId = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerByDelivCustomerId()
                                    , () -> _qyCall.qy().queryMCustomerByDelivCustomerId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerByDelivCustomerId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerByDelivCustomerId()
                      , () -> xsyncQyCall().qy().queryMCustomerByDelivCustomerId()));
                }
            }
            return _mCustomerByDelivCustomerId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProcessTypeCB.HpSpecification specifyMProcessType() {
            assertRelation("mProcessType");
            if (_mProcessType == null) {
                _mProcessType = new MProcessTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProcessType()
                                    , () -> _qyCall.qy().queryMProcessType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProcessType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProcessType()
                      , () -> xsyncQyCall().qy().queryMProcessType()));
                }
            }
            return _mProcessType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerBySupplyCustomerId() {
            assertRelation("mCustomerBySupplyCustomerId");
            if (_mCustomerBySupplyCustomerId == null) {
                _mCustomerBySupplyCustomerId = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerBySupplyCustomerId()
                                    , () -> _qyCall.qy().queryMCustomerBySupplyCustomerId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerBySupplyCustomerId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerBySupplyCustomerId()
                      , () -> xsyncQyCall().qy().queryMCustomerBySupplyCustomerId()));
                }
            }
            return _mCustomerBySupplyCustomerId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MZipCB.HpSpecification specifyMZipForDeliv() {
            assertRelation("mZipForDeliv");
            if (_mZipForDeliv == null) {
                _mZipForDeliv = new MZipCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMZipForDeliv()
                                    , () -> _qyCall.qy().queryMZipForDeliv())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mZipForDeliv.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMZipForDeliv()
                      , () -> xsyncQyCall().qy().queryMZipForDeliv()));
                }
            }
            return _mZipForDeliv;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDelivTz() {
            assertRelation("bClassDtlByDelivTz");
            if (_bClassDtlByDelivTz == null) {
                _bClassDtlByDelivTz = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDelivTz()
                                    , () -> _qyCall.qy().queryBClassDtlByDelivTz())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDelivTz.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDelivTz()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDelivTz()));
                }
            }
            return _bClassDtlByDelivTz;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByEmergencyFlg() {
            assertRelation("bClassDtlByEmergencyFlg");
            if (_bClassDtlByEmergencyFlg == null) {
                _bClassDtlByEmergencyFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByEmergencyFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByEmergencyFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByEmergencyFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByEmergencyFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByEmergencyFlg()));
                }
            }
            return _bClassDtlByEmergencyFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByErrorFlg() {
            assertRelation("bClassDtlByErrorFlg");
            if (_bClassDtlByErrorFlg == null) {
                _bClassDtlByErrorFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByErrorFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByErrorFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByErrorFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByErrorFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByErrorFlg()));
                }
            }
            return _bClassDtlByErrorFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInputType() {
            assertRelation("bClassDtlByInputType");
            if (_bClassDtlByInputType == null) {
                _bClassDtlByInputType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInputType()
                                    , () -> _qyCall.qy().queryBClassDtlByInputType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInputType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInputType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInputType()));
                }
            }
            return _bClassDtlByInputType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByShippingStatus() {
            assertRelation("bClassDtlByShippingStatus");
            if (_bClassDtlByShippingStatus == null) {
                _bClassDtlByShippingStatus = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByShippingStatus()
                                    , () -> _qyCall.qy().queryBClassDtlByShippingStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByShippingStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByShippingStatus()
                      , () -> xsyncQyCall().qy().queryBClassDtlByShippingStatus()));
                }
            }
            return _bClassDtlByShippingStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStockOutFlg() {
            assertRelation("bClassDtlByStockOutFlg");
            if (_bClassDtlByStockOutFlg == null) {
                _bClassDtlByStockOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStockOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStockOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStockOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStockOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStockOutFlg()));
                }
            }
            return _bClassDtlByStockOutFlg;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_EC_ORDER_H where ...) as FOO_MAX} <br>
         * T_EC_ORDER_H by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TEcOrderH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TEcOrderHCB, TShippingInstHCQ> derivedTEcOrderHList() {
            assertDerived("tEcOrderHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TEcOrderHCB> sq, TShippingInstHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTEcOrderHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SHIPPING_INST_B where ...) as FOO_MAX} <br>
         * T_SHIPPING_INST_B by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstBCB, TShippingInstHCQ> derivedTShippingInstBList() {
            assertDerived("tShippingInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstBCB> sq, TShippingInstHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, TShippingInstHCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, TShippingInstHCQ cq, String al, DerivedReferrerOption op)
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
    public TShippingInstHCB dreamCruiseCB() {
        TShippingInstHCB cb = new TShippingInstHCB();
        cb.xsetupForDreamCruise((TShippingInstHCB) this);
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
    public HpColQyOperand<TShippingInstHCB> columnQuery(final SpecifyQuery<TShippingInstHCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TShippingInstHCB xcreateColumnQueryCB() {
        TShippingInstHCB cb = new TShippingInstHCB();
        cb.xsetupForColumnQuery((TShippingInstHCB)this);
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
    public void orScopeQuery(OrQuery<TShippingInstHCB> orCBLambda) {
        xorSQ((TShippingInstHCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TShippingInstHCB> andCBLambda) {
        xorSQAP((TShippingInstHCB)this, andCBLambda);
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
        final TShippingInstHCB cb;
        if (mainCB != null) {
            cb = (TShippingInstHCB)mainCB;
        } else {
            cb = new TShippingInstHCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TShippingInstHCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TShippingInstHCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
