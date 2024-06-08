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
 * The base condition-bean of T_RECEIVE_PLAN_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceivePlanHCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceivePlanHCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanHCB() {
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
        return "T_RECEIVE_PLAN_H";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param receivePlanHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TReceivePlanHCB acceptPK(Long receivePlanHId) {
        assertObjectNotNull("receivePlanHId", receivePlanHId);
        BsTReceivePlanHCB cb = this;
        cb.query().setReceivePlanHId_Equal(receivePlanHId);
        return (TReceivePlanHCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param receivePlanHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long receivePlanHId) {
        assertObjectNotNull("receivePlanHId", receivePlanHId);
        BsTReceivePlanHCB cb = this;
        cb.query().setReceivePlanHId_Equal(receivePlanHId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReceivePlanHId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReceivePlanHId_Desc();
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
    public TReceivePlanHCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TReceivePlanHCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TReceivePlanHCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TReceivePlanHCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TReceivePlanHCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TReceivePlanHCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TReceivePlanHCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TReceivePlanHCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TReceivePlanHCB> unionCBLambda) {
        final TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TReceivePlanHCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TReceivePlanHCB> unionCBLambda) {
        final TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TReceivePlanHCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TReceivePlanHNss _nssTReceivePlanHSelf;
    public TReceivePlanHNss xdfgetNssTReceivePlanHSelf() {
        if (_nssTReceivePlanHSelf == null) { _nssTReceivePlanHSelf = new TReceivePlanHNss(null); }
        return _nssTReceivePlanHSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_RECEIVE_PLAN_H by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TReceivePlanHSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTReceivePlanHSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TReceivePlanHNss setupSelect_TReceivePlanHSelf() {
        assertSetupSelectPurpose("tReceivePlanHSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOldReceivePlanHId();
        }
        doSetupSelect(() -> query().queryTReceivePlanHSelf());
        if (_nssTReceivePlanHSelf == null || !_nssTReceivePlanHSelf.hasConditionQuery())
        { _nssTReceivePlanHSelf = new TReceivePlanHNss(query().queryTReceivePlanHSelf()); }
        return _nssTReceivePlanHSelf;
    }

    protected MCustomerNss _nssMCustomerByPlanDepositId;
    public MCustomerNss xdfgetNssMCustomerByPlanDepositId() {
        if (_nssMCustomerByPlanDepositId == null) { _nssMCustomerByPlanDepositId = new MCustomerNss(null); }
        return _nssMCustomerByPlanDepositId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerByPlanDepositId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getMCustomerByPlanDepositId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerByPlanDepositId() {
        assertSetupSelectPurpose("mCustomerByPlanDepositId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPlanDepositId();
        }
        doSetupSelect(() -> query().queryMCustomerByPlanDepositId());
        if (_nssMCustomerByPlanDepositId == null || !_nssMCustomerByPlanDepositId.hasConditionQuery())
        { _nssMCustomerByPlanDepositId = new MCustomerNss(query().queryMCustomerByPlanDepositId()); }
        return _nssMCustomerByPlanDepositId;
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
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MStockTypeNss _nssMStockType;
    public MStockTypeNss xdfgetNssMStockType() {
        if (_nssMStockType == null) { _nssMStockType = new MStockTypeNss(null); }
        return _nssMStockType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MStockType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getMStockType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MStockTypeNss setupSelect_MStockType() {
        assertSetupSelectPurpose("mStockType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockTypeId();
        }
        doSetupSelect(() -> query().queryMStockType());
        if (_nssMStockType == null || !_nssMStockType.hasConditionQuery())
        { _nssMStockType = new MStockTypeNss(query().queryMStockType()); }
        return _nssMStockType;
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
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MProcessTypeNss _nssMProcessType;
    public MProcessTypeNss xdfgetNssMProcessType() {
        if (_nssMProcessType == null) { _nssMProcessType = new MProcessTypeNss(null); }
        return _nssMProcessType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProcessType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getMProcessType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MCustomerNss _nssMCustomerByPlanSupplierId;
    public MCustomerNss xdfgetNssMCustomerByPlanSupplierId() {
        if (_nssMCustomerByPlanSupplierId == null) { _nssMCustomerByPlanSupplierId = new MCustomerNss(null); }
        return _nssMCustomerByPlanSupplierId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerByPlanSupplierId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getMCustomerByPlanSupplierId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerByPlanSupplierId() {
        assertSetupSelectPurpose("mCustomerByPlanSupplierId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPlanSupplierId();
        }
        doSetupSelect(() -> query().queryMCustomerByPlanSupplierId());
        if (_nssMCustomerByPlanSupplierId == null || !_nssMCustomerByPlanSupplierId.hasConditionQuery())
        { _nssMCustomerByPlanSupplierId = new MCustomerNss(query().queryMCustomerByPlanSupplierId()); }
        return _nssMCustomerByPlanSupplierId;
    }

    protected TPickingHNss _nssTPickingH;
    public TPickingHNss xdfgetNssTPickingH() {
        if (_nssTPickingH == null) { _nssTPickingH = new TPickingHNss(null); }
        return _nssTPickingH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TPickingH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTPickingH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TPickingHNss setupSelect_TPickingH() {
        assertSetupSelectPurpose("tPickingH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPickingHId();
        }
        doSetupSelect(() -> query().queryTPickingH());
        if (_nssTPickingH == null || !_nssTPickingH.hasConditionQuery())
        { _nssTPickingH = new TPickingHNss(query().queryTPickingH()); }
        return _nssTPickingH;
    }

    protected BClassDtlNss _nssBClassDtlByCenterTransitFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCenterTransitFlg() {
        if (_nssBClassDtlByCenterTransitFlg == null) { _nssBClassDtlByCenterTransitFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCenterTransitFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCenterTransitFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getBClassDtlByCenterTransitFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCenterTransitFlg() {
        assertSetupSelectPurpose("bClassDtlByCenterTransitFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCenterTransitFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCenterTransitFlg());
        if (_nssBClassDtlByCenterTransitFlg == null || !_nssBClassDtlByCenterTransitFlg.hasConditionQuery())
        { _nssBClassDtlByCenterTransitFlg = new BClassDtlNss(query().queryBClassDtlByCenterTransitFlg()); }
        return _nssBClassDtlByCenterTransitFlg;
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
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByErrorFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getBClassDtlByErrorFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInputType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getBClassDtlByInputType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByReceiveDeliveryStatus;
    public BClassDtlNss xdfgetNssBClassDtlByReceiveDeliveryStatus() {
        if (_nssBClassDtlByReceiveDeliveryStatus == null) { _nssBClassDtlByReceiveDeliveryStatus = new BClassDtlNss(null); }
        return _nssBClassDtlByReceiveDeliveryStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByReceiveDeliveryStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getBClassDtlByReceiveDeliveryStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByReceiveDeliveryStatus() {
        assertSetupSelectPurpose("bClassDtlByReceiveDeliveryStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReceiveDeliveryStatus();
        }
        doSetupSelect(() -> query().queryBClassDtlByReceiveDeliveryStatus());
        if (_nssBClassDtlByReceiveDeliveryStatus == null || !_nssBClassDtlByReceiveDeliveryStatus.hasConditionQuery())
        { _nssBClassDtlByReceiveDeliveryStatus = new BClassDtlNss(query().queryBClassDtlByReceiveDeliveryStatus()); }
        return _nssBClassDtlByReceiveDeliveryStatus;
    }

    protected BClassDtlNss _nssBClassDtlByReceiveStatus;
    public BClassDtlNss xdfgetNssBClassDtlByReceiveStatus() {
        if (_nssBClassDtlByReceiveStatus == null) { _nssBClassDtlByReceiveStatus = new BClassDtlNss(null); }
        return _nssBClassDtlByReceiveStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByReceiveStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getBClassDtlByReceiveStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByReceiveStatus() {
        assertSetupSelectPurpose("bClassDtlByReceiveStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReceiveStatus();
        }
        doSetupSelect(() -> query().queryBClassDtlByReceiveStatus());
        if (_nssBClassDtlByReceiveStatus == null || !_nssBClassDtlByReceiveStatus.hasConditionQuery())
        { _nssBClassDtlByReceiveStatus = new BClassDtlNss(query().queryBClassDtlByReceiveStatus()); }
        return _nssBClassDtlByReceiveStatus;
    }

    protected TReceivePlanRNss _nssTReceivePlanRAsOne;
    public TReceivePlanRNss xdfgetNssTReceivePlanRAsOne() {
        if (_nssTReceivePlanRAsOne == null) { _nssTReceivePlanRAsOne = new TReceivePlanRNss(null); }
        return _nssTReceivePlanRAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_RECEIVE_PLAN_R by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TReceivePlanRAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTReceivePlanRAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TReceivePlanRNss setupSelect_TReceivePlanRAsOne() {
        assertSetupSelectPurpose("tReceivePlanRAsOne");
        doSetupSelect(() -> query().queryTReceivePlanRAsOne());
        if (_nssTReceivePlanRAsOne == null || !_nssTReceivePlanRAsOne.hasConditionQuery())
        { _nssTReceivePlanRAsOne = new TReceivePlanRNss(query().queryTReceivePlanRAsOne()); }
        return _nssTReceivePlanRAsOne;
    }

    protected TTrrcvNss _nssTTrrcvAsOne;
    public TTrrcvNss xdfgetNssTTrrcvAsOne() {
        if (_nssTTrrcvAsOne == null) { _nssTTrrcvAsOne = new TTrrcvNss(null); }
        return _nssTTrrcvAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_TRRCV by RECEIVE_PLAN_H_ID, named 'TTrrcvAsOne'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TTrrcvAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTTrrcvAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TTrrcvNss setupSelect_TTrrcvAsOne() {
        assertSetupSelectPurpose("tTrrcvAsOne");
        doSetupSelect(() -> query().queryTTrrcvAsOne());
        if (_nssTTrrcvAsOne == null || !_nssTTrrcvAsOne.hasConditionQuery())
        { _nssTTrrcvAsOne = new TTrrcvNss(query().queryTTrrcvAsOne()); }
        return _nssTTrrcvAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<TReceivePlanHCQ> {
        protected TReceivePlanHCB.HpSpecification _tReceivePlanHSelf;
        protected MCustomerCB.HpSpecification _mCustomerByPlanDepositId;
        protected MClientCB.HpSpecification _mClient;
        protected MStockTypeCB.HpSpecification _mStockType;
        protected MCenterCB.HpSpecification _mCenter;
        protected MProcessTypeCB.HpSpecification _mProcessType;
        protected MCustomerCB.HpSpecification _mCustomerByPlanSupplierId;
        protected TPickingHCB.HpSpecification _tPickingH;
        protected BClassDtlCB.HpSpecification _bClassDtlByCenterTransitFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByErrorFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInputType;
        protected BClassDtlCB.HpSpecification _bClassDtlByReceiveDeliveryStatus;
        protected BClassDtlCB.HpSpecification _bClassDtlByReceiveStatus;
        protected TReceivePlanRCB.HpSpecification _tReceivePlanRAsOne;
        protected TTrrcvCB.HpSpecification _tTrrcvAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TReceivePlanHCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanHId() { return doColumn("RECEIVE_PLAN_H_ID"); }
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
         * PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessTypeId() { return doColumn("PROCESS_TYPE_ID"); }
        /**
         * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockTypeId() { return doColumn("STOCK_TYPE_ID"); }
        /**
         * RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanDt() { return doColumn("RECEIVE_PLAN_DT"); }
        /**
         * PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlanClientReceiveNo() { return doColumn("PLAN_CLIENT_RECEIVE_NO"); }
        /**
         * RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveSlipNo() { return doColumn("RECEIVE_SLIP_NO"); }
        /**
         * PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlanSupplierId() { return doColumn("PLAN_SUPPLIER_ID"); }
        /**
         * PLAN_SUPPLIER_CD: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlanSupplierCd() { return doColumn("PLAN_SUPPLIER_CD"); }
        /**
         * PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlanDepositId() { return doColumn("PLAN_DEPOSIT_ID"); }
        /**
         * PLAN_DEPOSIT_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlanDepositCd() { return doColumn("PLAN_DEPOSIT_CD"); }
        /**
         * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveStatus() { return doColumn("RECEIVE_STATUS"); }
        /**
         * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInputType() { return doColumn("INPUT_TYPE"); }
        /**
         * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveDeliveryStatus() { return doColumn("RECEIVE_DELIVERY_STATUS"); }
        /**
         * OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOldReceivePlanHId() { return doColumn("OLD_RECEIVE_PLAN_H_ID"); }
        /**
         * ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorFlg() { return doColumn("ERROR_FLG"); }
        /**
         * ERROR_MESSAGE_CD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorMessageCd() { return doColumn("ERROR_MESSAGE_CD"); }
        /**
         * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterTransitFlg() { return doColumn("CENTER_TRANSIT_FLG"); }
        /**
         * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingHId() { return doColumn("PICKING_H_ID"); }
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
            columnReceivePlanHId(); // PK
            if (qyCall().qy().hasConditionQueryTReceivePlanHSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanHCQ) {
                columnOldReceivePlanHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomerByPlanDepositId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnPlanDepositId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMStockType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MStockTypeCQ) {
                columnStockTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMProcessType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnProcessTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomerByPlanSupplierId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnPlanSupplierId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTPickingH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TPickingHCQ) {
                columnPickingHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCenterTransitFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCenterTransitFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByErrorFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnErrorFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInputType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInputType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByReceiveDeliveryStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnReceiveDeliveryStatus(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByReceiveStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnReceiveStatus(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_RECEIVE_PLAN_H"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_RECEIVE_PLAN_H by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TReceivePlanHCB.HpSpecification specifyTReceivePlanHSelf() {
            assertRelation("tReceivePlanHSelf");
            if (_tReceivePlanHSelf == null) {
                _tReceivePlanHSelf = new TReceivePlanHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTReceivePlanHSelf()
                                    , () -> _qyCall.qy().queryTReceivePlanHSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tReceivePlanHSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTReceivePlanHSelf()
                      , () -> xsyncQyCall().qy().queryTReceivePlanHSelf()));
                }
            }
            return _tReceivePlanHSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CUSTOMER by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerByPlanDepositId() {
            assertRelation("mCustomerByPlanDepositId");
            if (_mCustomerByPlanDepositId == null) {
                _mCustomerByPlanDepositId = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerByPlanDepositId()
                                    , () -> _qyCall.qy().queryMCustomerByPlanDepositId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerByPlanDepositId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerByPlanDepositId()
                      , () -> xsyncQyCall().qy().queryMCustomerByPlanDepositId()));
                }
            }
            return _mCustomerByPlanDepositId;
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
         * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MStockTypeCB.HpSpecification specifyMStockType() {
            assertRelation("mStockType");
            if (_mStockType == null) {
                _mStockType = new MStockTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMStockType()
                                    , () -> _qyCall.qy().queryMStockType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mStockType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMStockType()
                      , () -> xsyncQyCall().qy().queryMStockType()));
                }
            }
            return _mStockType;
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
         * M_CUSTOMER by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerByPlanSupplierId() {
            assertRelation("mCustomerByPlanSupplierId");
            if (_mCustomerByPlanSupplierId == null) {
                _mCustomerByPlanSupplierId = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerByPlanSupplierId()
                                    , () -> _qyCall.qy().queryMCustomerByPlanSupplierId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerByPlanSupplierId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerByPlanSupplierId()
                      , () -> xsyncQyCall().qy().queryMCustomerByPlanSupplierId()));
                }
            }
            return _mCustomerByPlanSupplierId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TPickingHCB.HpSpecification specifyTPickingH() {
            assertRelation("tPickingH");
            if (_tPickingH == null) {
                _tPickingH = new TPickingHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTPickingH()
                                    , () -> _qyCall.qy().queryTPickingH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tPickingH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTPickingH()
                      , () -> xsyncQyCall().qy().queryTPickingH()));
                }
            }
            return _tPickingH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCenterTransitFlg() {
            assertRelation("bClassDtlByCenterTransitFlg");
            if (_bClassDtlByCenterTransitFlg == null) {
                _bClassDtlByCenterTransitFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCenterTransitFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCenterTransitFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCenterTransitFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCenterTransitFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCenterTransitFlg()));
                }
            }
            return _bClassDtlByCenterTransitFlg;
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
         * B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByReceiveDeliveryStatus() {
            assertRelation("bClassDtlByReceiveDeliveryStatus");
            if (_bClassDtlByReceiveDeliveryStatus == null) {
                _bClassDtlByReceiveDeliveryStatus = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByReceiveDeliveryStatus()
                                    , () -> _qyCall.qy().queryBClassDtlByReceiveDeliveryStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByReceiveDeliveryStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByReceiveDeliveryStatus()
                      , () -> xsyncQyCall().qy().queryBClassDtlByReceiveDeliveryStatus()));
                }
            }
            return _bClassDtlByReceiveDeliveryStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByReceiveStatus() {
            assertRelation("bClassDtlByReceiveStatus");
            if (_bClassDtlByReceiveStatus == null) {
                _bClassDtlByReceiveStatus = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByReceiveStatus()
                                    , () -> _qyCall.qy().queryBClassDtlByReceiveStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByReceiveStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByReceiveStatus()
                      , () -> xsyncQyCall().qy().queryBClassDtlByReceiveStatus()));
                }
            }
            return _bClassDtlByReceiveStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_RECEIVE_PLAN_R by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TReceivePlanRCB.HpSpecification specifyTReceivePlanRAsOne() {
            assertRelation("tReceivePlanRAsOne");
            if (_tReceivePlanRAsOne == null) {
                _tReceivePlanRAsOne = new TReceivePlanRCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTReceivePlanRAsOne()
                                    , () -> _qyCall.qy().queryTReceivePlanRAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tReceivePlanRAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTReceivePlanRAsOne()
                      , () -> xsyncQyCall().qy().queryTReceivePlanRAsOne()));
                }
            }
            return _tReceivePlanRAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_TRRCV by RECEIVE_PLAN_H_ID, named 'TTrrcvAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TTrrcvCB.HpSpecification specifyTTrrcvAsOne() {
            assertRelation("tTrrcvAsOne");
            if (_tTrrcvAsOne == null) {
                _tTrrcvAsOne = new TTrrcvCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTTrrcvAsOne()
                                    , () -> _qyCall.qy().queryTTrrcvAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tTrrcvAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTTrrcvAsOne()
                      , () -> xsyncQyCall().qy().queryTTrrcvAsOne()));
                }
            }
            return _tTrrcvAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_RECEIVE_PLAN_B where ...) as FOO_MAX} <br>
         * T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanBCB, TReceivePlanHCQ> derivedTReceivePlanBList() {
            assertDerived("tReceivePlanBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanBCB> sq, TReceivePlanHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_RECEIVE_PLAN_H where ...) as FOO_MAX} <br>
         * T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, TReceivePlanHCQ> derivedTReceivePlanHSelfList() {
            assertDerived("tReceivePlanHSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, TReceivePlanHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanHSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STORE_RECORD_H where ...) as FOO_MAX} <br>
         * T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreRecordH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreRecordHCB, TReceivePlanHCQ> derivedTStoreRecordHList() {
            assertDerived("tStoreRecordHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreRecordHCB> sq, TReceivePlanHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreRecordHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, TReceivePlanHCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, TReceivePlanHCQ cq, String al, DerivedReferrerOption op)
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
    public TReceivePlanHCB dreamCruiseCB() {
        TReceivePlanHCB cb = new TReceivePlanHCB();
        cb.xsetupForDreamCruise((TReceivePlanHCB) this);
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
    public HpColQyOperand<TReceivePlanHCB> columnQuery(final SpecifyQuery<TReceivePlanHCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TReceivePlanHCB xcreateColumnQueryCB() {
        TReceivePlanHCB cb = new TReceivePlanHCB();
        cb.xsetupForColumnQuery((TReceivePlanHCB)this);
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
    public void orScopeQuery(OrQuery<TReceivePlanHCB> orCBLambda) {
        xorSQ((TReceivePlanHCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TReceivePlanHCB> andCBLambda) {
        xorSQAP((TReceivePlanHCB)this, andCBLambda);
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
        final TReceivePlanHCB cb;
        if (mainCB != null) {
            cb = (TReceivePlanHCB)mainCB;
        } else {
            cb = new TReceivePlanHCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TReceivePlanHCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TReceivePlanHCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
