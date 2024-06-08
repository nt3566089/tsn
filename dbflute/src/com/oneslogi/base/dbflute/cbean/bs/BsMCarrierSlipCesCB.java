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
 * The base condition-bean of M_CARRIER_SLIP_CES.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipCesCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipCesCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipCesCB() {
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
        return "M_CARRIER_SLIP_CES";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param customerId : PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER. (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipCesCB acceptPK(Long customerId) {
        assertObjectNotNull("customerId", customerId);
        BsMCarrierSlipCesCB cb = this;
        cb.query().setCustomerId_Equal(customerId);
        return (MCarrierSlipCesCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param customerId : PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER. (NotNull)
     */
    public void acceptPrimaryKey(Long customerId) {
        assertObjectNotNull("customerId", customerId);
        BsMCarrierSlipCesCB cb = this;
        cb.query().setCustomerId_Equal(customerId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CustomerId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CustomerId_Desc();
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
    public MCarrierSlipCesCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCarrierSlipCesCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCarrierSlipCesCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCarrierSlipCesCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCarrierSlipCesCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCarrierSlipCesCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCarrierSlipCesCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCarrierSlipCesCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MCarrierSlipCesCB> unionCBLambda) {
        final MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipCesCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MCarrierSlipCesCB> unionCBLambda) {
        final MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipCesCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MCustomerNss _nssMCustomer;
    public MCustomerNss xdfgetNssMCustomer() {
        if (_nssMCustomer == null) { _nssMCustomer = new MCustomerNss(null); }
        return _nssMCustomer;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getMCustomer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomer() {
        assertSetupSelectPurpose("mCustomer");
        doSetupSelect(() -> query().queryMCustomer());
        if (_nssMCustomer == null || !_nssMCustomer.hasConditionQuery())
        { _nssMCustomer = new MCustomerNss(query().queryMCustomer()); }
        return _nssMCustomer;
    }

    protected BClassDtlNss _nssBClassDtlBySatDeliveryFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySatDeliveryFlg() {
        if (_nssBClassDtlBySatDeliveryFlg == null) { _nssBClassDtlBySatDeliveryFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySatDeliveryFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySatDeliveryFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlBySatDeliveryFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySatDeliveryFlg() {
        assertSetupSelectPurpose("bClassDtlBySatDeliveryFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSatDeliveryFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySatDeliveryFlg());
        if (_nssBClassDtlBySatDeliveryFlg == null || !_nssBClassDtlBySatDeliveryFlg.hasConditionQuery())
        { _nssBClassDtlBySatDeliveryFlg = new BClassDtlNss(query().queryBClassDtlBySatDeliveryFlg()); }
        return _nssBClassDtlBySatDeliveryFlg;
    }

    protected BClassDtlNss _nssBClassDtlByResidentialDeliveryFlg;
    public BClassDtlNss xdfgetNssBClassDtlByResidentialDeliveryFlg() {
        if (_nssBClassDtlByResidentialDeliveryFlg == null) { _nssBClassDtlByResidentialDeliveryFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByResidentialDeliveryFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByResidentialDeliveryFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByResidentialDeliveryFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByResidentialDeliveryFlg() {
        assertSetupSelectPurpose("bClassDtlByResidentialDeliveryFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnResidentialDeliveryFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByResidentialDeliveryFlg());
        if (_nssBClassDtlByResidentialDeliveryFlg == null || !_nssBClassDtlByResidentialDeliveryFlg.hasConditionQuery())
        { _nssBClassDtlByResidentialDeliveryFlg = new BClassDtlNss(query().queryBClassDtlByResidentialDeliveryFlg()); }
        return _nssBClassDtlByResidentialDeliveryFlg;
    }

    protected BClassDtlNss _nssBClassDtlByCodFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCodFlg() {
        if (_nssBClassDtlByCodFlg == null) { _nssBClassDtlByCodFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCodFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCodFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByCodFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCodFlg() {
        assertSetupSelectPurpose("bClassDtlByCodFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCodFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCodFlg());
        if (_nssBClassDtlByCodFlg == null || !_nssBClassDtlByCodFlg.hasConditionQuery())
        { _nssBClassDtlByCodFlg = new BClassDtlNss(query().queryBClassDtlByCodFlg()); }
        return _nssBClassDtlByCodFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySignatureRequiredFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySignatureRequiredFlg() {
        if (_nssBClassDtlBySignatureRequiredFlg == null) { _nssBClassDtlBySignatureRequiredFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySignatureRequiredFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySignatureRequiredFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlBySignatureRequiredFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySignatureRequiredFlg() {
        assertSetupSelectPurpose("bClassDtlBySignatureRequiredFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSignatureRequiredFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySignatureRequiredFlg());
        if (_nssBClassDtlBySignatureRequiredFlg == null || !_nssBClassDtlBySignatureRequiredFlg.hasConditionQuery())
        { _nssBClassDtlBySignatureRequiredFlg = new BClassDtlNss(query().queryBClassDtlBySignatureRequiredFlg()); }
        return _nssBClassDtlBySignatureRequiredFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySignatureReleaseFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySignatureReleaseFlg() {
        if (_nssBClassDtlBySignatureReleaseFlg == null) { _nssBClassDtlBySignatureReleaseFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySignatureReleaseFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySignatureReleaseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlBySignatureReleaseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySignatureReleaseFlg() {
        assertSetupSelectPurpose("bClassDtlBySignatureReleaseFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSignatureReleaseFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySignatureReleaseFlg());
        if (_nssBClassDtlBySignatureReleaseFlg == null || !_nssBClassDtlBySignatureReleaseFlg.hasConditionQuery())
        { _nssBClassDtlBySignatureReleaseFlg = new BClassDtlNss(query().queryBClassDtlBySignatureReleaseFlg()); }
        return _nssBClassDtlBySignatureReleaseFlg;
    }

    protected BClassDtlNss _nssBClassDtlByCallBeforeDeliveryFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCallBeforeDeliveryFlg() {
        if (_nssBClassDtlByCallBeforeDeliveryFlg == null) { _nssBClassDtlByCallBeforeDeliveryFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCallBeforeDeliveryFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCallBeforeDeliveryFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByCallBeforeDeliveryFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCallBeforeDeliveryFlg() {
        assertSetupSelectPurpose("bClassDtlByCallBeforeDeliveryFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCallBeforeDeliveryFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCallBeforeDeliveryFlg());
        if (_nssBClassDtlByCallBeforeDeliveryFlg == null || !_nssBClassDtlByCallBeforeDeliveryFlg.hasConditionQuery())
        { _nssBClassDtlByCallBeforeDeliveryFlg = new BClassDtlNss(query().queryBClassDtlByCallBeforeDeliveryFlg()); }
        return _nssBClassDtlByCallBeforeDeliveryFlg;
    }

    protected BClassDtlNss _nssBClassDtlByFreezableProtectionFlg;
    public BClassDtlNss xdfgetNssBClassDtlByFreezableProtectionFlg() {
        if (_nssBClassDtlByFreezableProtectionFlg == null) { _nssBClassDtlByFreezableProtectionFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByFreezableProtectionFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFreezableProtectionFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByFreezableProtectionFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFreezableProtectionFlg() {
        assertSetupSelectPurpose("bClassDtlByFreezableProtectionFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFreezableProtectionFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByFreezableProtectionFlg());
        if (_nssBClassDtlByFreezableProtectionFlg == null || !_nssBClassDtlByFreezableProtectionFlg.hasConditionQuery())
        { _nssBClassDtlByFreezableProtectionFlg = new BClassDtlNss(query().queryBClassDtlByFreezableProtectionFlg()); }
        return _nssBClassDtlByFreezableProtectionFlg;
    }

    protected BClassDtlNss _nssBClassDtlByGuaranteedPlusFlg;
    public BClassDtlNss xdfgetNssBClassDtlByGuaranteedPlusFlg() {
        if (_nssBClassDtlByGuaranteedPlusFlg == null) { _nssBClassDtlByGuaranteedPlusFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByGuaranteedPlusFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByGuaranteedPlusFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByGuaranteedPlusFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByGuaranteedPlusFlg() {
        assertSetupSelectPurpose("bClassDtlByGuaranteedPlusFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnGuaranteedPlusFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByGuaranteedPlusFlg());
        if (_nssBClassDtlByGuaranteedPlusFlg == null || !_nssBClassDtlByGuaranteedPlusFlg.hasConditionQuery())
        { _nssBClassDtlByGuaranteedPlusFlg = new BClassDtlNss(query().queryBClassDtlByGuaranteedPlusFlg()); }
        return _nssBClassDtlByGuaranteedPlusFlg;
    }

    protected BClassDtlNss _nssBClassDtlByResidentialPickupFlg;
    public BClassDtlNss xdfgetNssBClassDtlByResidentialPickupFlg() {
        if (_nssBClassDtlByResidentialPickupFlg == null) { _nssBClassDtlByResidentialPickupFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByResidentialPickupFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByResidentialPickupFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByResidentialPickupFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByResidentialPickupFlg() {
        assertSetupSelectPurpose("bClassDtlByResidentialPickupFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnResidentialPickupFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByResidentialPickupFlg());
        if (_nssBClassDtlByResidentialPickupFlg == null || !_nssBClassDtlByResidentialPickupFlg.hasConditionQuery())
        { _nssBClassDtlByResidentialPickupFlg = new BClassDtlNss(query().queryBClassDtlByResidentialPickupFlg()); }
        return _nssBClassDtlByResidentialPickupFlg;
    }

    protected BClassDtlNss _nssBClassDtlByDoNotStackStackFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDoNotStackStackFlg() {
        if (_nssBClassDtlByDoNotStackStackFlg == null) { _nssBClassDtlByDoNotStackStackFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDoNotStackStackFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDoNotStackStackFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByDoNotStackStackFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDoNotStackStackFlg() {
        assertSetupSelectPurpose("bClassDtlByDoNotStackStackFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDoNotStackStackFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDoNotStackStackFlg());
        if (_nssBClassDtlByDoNotStackStackFlg == null || !_nssBClassDtlByDoNotStackStackFlg.hasConditionQuery())
        { _nssBClassDtlByDoNotStackStackFlg = new BClassDtlNss(query().queryBClassDtlByDoNotStackStackFlg()); }
        return _nssBClassDtlByDoNotStackStackFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLimitedAccessDeliveryFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLimitedAccessDeliveryFlg() {
        if (_nssBClassDtlByLimitedAccessDeliveryFlg == null) { _nssBClassDtlByLimitedAccessDeliveryFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLimitedAccessDeliveryFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitedAccessDeliveryFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByLimitedAccessDeliveryFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLimitedAccessDeliveryFlg() {
        assertSetupSelectPurpose("bClassDtlByLimitedAccessDeliveryFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLimitedAccessDeliveryFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLimitedAccessDeliveryFlg());
        if (_nssBClassDtlByLimitedAccessDeliveryFlg == null || !_nssBClassDtlByLimitedAccessDeliveryFlg.hasConditionQuery())
        { _nssBClassDtlByLimitedAccessDeliveryFlg = new BClassDtlNss(query().queryBClassDtlByLimitedAccessDeliveryFlg()); }
        return _nssBClassDtlByLimitedAccessDeliveryFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLimitedAccessPickupFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLimitedAccessPickupFlg() {
        if (_nssBClassDtlByLimitedAccessPickupFlg == null) { _nssBClassDtlByLimitedAccessPickupFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLimitedAccessPickupFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitedAccessPickupFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByLimitedAccessPickupFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLimitedAccessPickupFlg() {
        assertSetupSelectPurpose("bClassDtlByLimitedAccessPickupFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLimitedAccessPickupFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLimitedAccessPickupFlg());
        if (_nssBClassDtlByLimitedAccessPickupFlg == null || !_nssBClassDtlByLimitedAccessPickupFlg.hasConditionQuery())
        { _nssBClassDtlByLimitedAccessPickupFlg = new BClassDtlNss(query().queryBClassDtlByLimitedAccessPickupFlg()); }
        return _nssBClassDtlByLimitedAccessPickupFlg;
    }

    protected BClassDtlNss _nssBClassDtlByOverSizedFlg;
    public BClassDtlNss xdfgetNssBClassDtlByOverSizedFlg() {
        if (_nssBClassDtlByOverSizedFlg == null) { _nssBClassDtlByOverSizedFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByOverSizedFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByOverSizedFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByOverSizedFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByOverSizedFlg() {
        assertSetupSelectPurpose("bClassDtlByOverSizedFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOverSizedFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByOverSizedFlg());
        if (_nssBClassDtlByOverSizedFlg == null || !_nssBClassDtlByOverSizedFlg.hasConditionQuery())
        { _nssBClassDtlByOverSizedFlg = new BClassDtlNss(query().queryBClassDtlByOverSizedFlg()); }
        return _nssBClassDtlByOverSizedFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPoisonFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPoisonFlg() {
        if (_nssBClassDtlByPoisonFlg == null) { _nssBClassDtlByPoisonFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPoisonFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPoisonFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByPoisonFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPoisonFlg() {
        assertSetupSelectPurpose("bClassDtlByPoisonFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPoisonFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPoisonFlg());
        if (_nssBClassDtlByPoisonFlg == null || !_nssBClassDtlByPoisonFlg.hasConditionQuery())
        { _nssBClassDtlByPoisonFlg = new BClassDtlNss(query().queryBClassDtlByPoisonFlg()); }
        return _nssBClassDtlByPoisonFlg;
    }

    protected BClassDtlNss _nssBClassDtlByFoogFlg;
    public BClassDtlNss xdfgetNssBClassDtlByFoogFlg() {
        if (_nssBClassDtlByFoogFlg == null) { _nssBClassDtlByFoogFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByFoogFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFoogFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByFoogFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFoogFlg() {
        assertSetupSelectPurpose("bClassDtlByFoogFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFoogFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByFoogFlg());
        if (_nssBClassDtlByFoogFlg == null || !_nssBClassDtlByFoogFlg.hasConditionQuery())
        { _nssBClassDtlByFoogFlg = new BClassDtlNss(query().queryBClassDtlByFoogFlg()); }
        return _nssBClassDtlByFoogFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLiftgateDeliveryPrepaidFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLiftgateDeliveryPrepaidFlg() {
        if (_nssBClassDtlByLiftgateDeliveryPrepaidFlg == null) { _nssBClassDtlByLiftgateDeliveryPrepaidFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLiftgateDeliveryPrepaidFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLiftgateDeliveryPrepaidFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByLiftgateDeliveryPrepaidFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLiftgateDeliveryPrepaidFlg() {
        assertSetupSelectPurpose("bClassDtlByLiftgateDeliveryPrepaidFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLiftgateDeliveryPrepaidFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLiftgateDeliveryPrepaidFlg());
        if (_nssBClassDtlByLiftgateDeliveryPrepaidFlg == null || !_nssBClassDtlByLiftgateDeliveryPrepaidFlg.hasConditionQuery())
        { _nssBClassDtlByLiftgateDeliveryPrepaidFlg = new BClassDtlNss(query().queryBClassDtlByLiftgateDeliveryPrepaidFlg()); }
        return _nssBClassDtlByLiftgateDeliveryPrepaidFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLiftgateDeliveryCollectFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLiftgateDeliveryCollectFlg() {
        if (_nssBClassDtlByLiftgateDeliveryCollectFlg == null) { _nssBClassDtlByLiftgateDeliveryCollectFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLiftgateDeliveryCollectFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLiftgateDeliveryCollectFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByLiftgateDeliveryCollectFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLiftgateDeliveryCollectFlg() {
        assertSetupSelectPurpose("bClassDtlByLiftgateDeliveryCollectFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLiftgateDeliveryCollectFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLiftgateDeliveryCollectFlg());
        if (_nssBClassDtlByLiftgateDeliveryCollectFlg == null || !_nssBClassDtlByLiftgateDeliveryCollectFlg.hasConditionQuery())
        { _nssBClassDtlByLiftgateDeliveryCollectFlg = new BClassDtlNss(query().queryBClassDtlByLiftgateDeliveryCollectFlg()); }
        return _nssBClassDtlByLiftgateDeliveryCollectFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLiftgatePickupPrepaidFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLiftgatePickupPrepaidFlg() {
        if (_nssBClassDtlByLiftgatePickupPrepaidFlg == null) { _nssBClassDtlByLiftgatePickupPrepaidFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLiftgatePickupPrepaidFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLiftgatePickupPrepaidFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByLiftgatePickupPrepaidFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLiftgatePickupPrepaidFlg() {
        assertSetupSelectPurpose("bClassDtlByLiftgatePickupPrepaidFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLiftgatePickupPrepaidFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLiftgatePickupPrepaidFlg());
        if (_nssBClassDtlByLiftgatePickupPrepaidFlg == null || !_nssBClassDtlByLiftgatePickupPrepaidFlg.hasConditionQuery())
        { _nssBClassDtlByLiftgatePickupPrepaidFlg = new BClassDtlNss(query().queryBClassDtlByLiftgatePickupPrepaidFlg()); }
        return _nssBClassDtlByLiftgatePickupPrepaidFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLiftgatePickupCollectFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLiftgatePickupCollectFlg() {
        if (_nssBClassDtlByLiftgatePickupCollectFlg == null) { _nssBClassDtlByLiftgatePickupCollectFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLiftgatePickupCollectFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLiftgatePickupCollectFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByLiftgatePickupCollectFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLiftgatePickupCollectFlg() {
        assertSetupSelectPurpose("bClassDtlByLiftgatePickupCollectFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLiftgatePickupCollectFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLiftgatePickupCollectFlg());
        if (_nssBClassDtlByLiftgatePickupCollectFlg == null || !_nssBClassDtlByLiftgatePickupCollectFlg.hasConditionQuery())
        { _nssBClassDtlByLiftgatePickupCollectFlg = new BClassDtlNss(query().queryBClassDtlByLiftgatePickupCollectFlg()); }
        return _nssBClassDtlByLiftgatePickupCollectFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInsideDeliveryPrepaidFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInsideDeliveryPrepaidFlg() {
        if (_nssBClassDtlByInsideDeliveryPrepaidFlg == null) { _nssBClassDtlByInsideDeliveryPrepaidFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInsideDeliveryPrepaidFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInsideDeliveryPrepaidFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByInsideDeliveryPrepaidFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInsideDeliveryPrepaidFlg() {
        assertSetupSelectPurpose("bClassDtlByInsideDeliveryPrepaidFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInsideDeliveryPrepaidFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInsideDeliveryPrepaidFlg());
        if (_nssBClassDtlByInsideDeliveryPrepaidFlg == null || !_nssBClassDtlByInsideDeliveryPrepaidFlg.hasConditionQuery())
        { _nssBClassDtlByInsideDeliveryPrepaidFlg = new BClassDtlNss(query().queryBClassDtlByInsideDeliveryPrepaidFlg()); }
        return _nssBClassDtlByInsideDeliveryPrepaidFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInsideDeliveryCollectFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInsideDeliveryCollectFlg() {
        if (_nssBClassDtlByInsideDeliveryCollectFlg == null) { _nssBClassDtlByInsideDeliveryCollectFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInsideDeliveryCollectFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInsideDeliveryCollectFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByInsideDeliveryCollectFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInsideDeliveryCollectFlg() {
        assertSetupSelectPurpose("bClassDtlByInsideDeliveryCollectFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInsideDeliveryCollectFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInsideDeliveryCollectFlg());
        if (_nssBClassDtlByInsideDeliveryCollectFlg == null || !_nssBClassDtlByInsideDeliveryCollectFlg.hasConditionQuery())
        { _nssBClassDtlByInsideDeliveryCollectFlg = new BClassDtlNss(query().queryBClassDtlByInsideDeliveryCollectFlg()); }
        return _nssBClassDtlByInsideDeliveryCollectFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInsidePickupPrepaidFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInsidePickupPrepaidFlg() {
        if (_nssBClassDtlByInsidePickupPrepaidFlg == null) { _nssBClassDtlByInsidePickupPrepaidFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInsidePickupPrepaidFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInsidePickupPrepaidFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByInsidePickupPrepaidFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInsidePickupPrepaidFlg() {
        assertSetupSelectPurpose("bClassDtlByInsidePickupPrepaidFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInsidePickupPrepaidFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInsidePickupPrepaidFlg());
        if (_nssBClassDtlByInsidePickupPrepaidFlg == null || !_nssBClassDtlByInsidePickupPrepaidFlg.hasConditionQuery())
        { _nssBClassDtlByInsidePickupPrepaidFlg = new BClassDtlNss(query().queryBClassDtlByInsidePickupPrepaidFlg()); }
        return _nssBClassDtlByInsidePickupPrepaidFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInsidePickupCollectFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInsidePickupCollectFlg() {
        if (_nssBClassDtlByInsidePickupCollectFlg == null) { _nssBClassDtlByInsidePickupCollectFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInsidePickupCollectFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInsidePickupCollectFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByInsidePickupCollectFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInsidePickupCollectFlg() {
        assertSetupSelectPurpose("bClassDtlByInsidePickupCollectFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInsidePickupCollectFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInsidePickupCollectFlg());
        if (_nssBClassDtlByInsidePickupCollectFlg == null || !_nssBClassDtlByInsidePickupCollectFlg.hasConditionQuery())
        { _nssBClassDtlByInsidePickupCollectFlg = new BClassDtlNss(query().queryBClassDtlByInsidePickupCollectFlg()); }
        return _nssBClassDtlByInsidePickupCollectFlg;
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
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipCes</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipCes</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<MCarrierSlipCesCQ> {
        protected MCustomerCB.HpSpecification _mCustomer;
        protected BClassDtlCB.HpSpecification _bClassDtlBySatDeliveryFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByResidentialDeliveryFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByCodFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySignatureRequiredFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySignatureReleaseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByCallBeforeDeliveryFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByFreezableProtectionFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByGuaranteedPlusFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByResidentialPickupFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDoNotStackStackFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitedAccessDeliveryFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitedAccessPickupFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByOverSizedFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPoisonFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByFoogFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLiftgateDeliveryPrepaidFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLiftgateDeliveryCollectFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLiftgatePickupPrepaidFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLiftgatePickupCollectFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInsideDeliveryPrepaidFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInsideDeliveryCollectFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInsidePickupPrepaidFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInsidePickupCollectFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCarrierSlipCesCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerId() { return doColumn("CUSTOMER_ID"); }
        /**
         * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCollectAccountNoBillTo() { return doColumn("COLLECT_ACCOUNT_NO_BILL_TO"); }
        /**
         * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCollectZipCdBillTo() { return doColumn("COLLECT_ZIP_CD_BILL_TO"); }
        /**
         * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCollectCountryCdBillTo() { return doColumn("COLLECT_COUNTRY_CD_BILL_TO"); }
        /**
         * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentTermCdTaxesTo() { return doColumn("PAYMENT_TERM_CD_TAXES_TO"); }
        /**
         * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCollectAccountNoTaxesTo() { return doColumn("COLLECT_ACCOUNT_NO_TAXES_TO"); }
        /**
         * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCollectZipCdTaxesTo() { return doColumn("COLLECT_ZIP_CD_TAXES_TO"); }
        /**
         * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCollectCountryCdTaxesTo() { return doColumn("COLLECT_COUNTRY_CD_TAXES_TO"); }
        /**
         * COD_PAYMENT_TERM_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodPaymentTermCd() { return doColumn("COD_PAYMENT_TERM_CD"); }
        /**
         * COD_AMOUNT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodAmount() { return doColumn("COD_AMOUNT"); }
        /**
         * COD_FEE_PAYER: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodFeePayer() { return doColumn("COD_FEE_PAYER"); }
        /**
         * TERMS_OF_SALES: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTermsOfSales() { return doColumn("TERMS_OF_SALES"); }
        /**
         * BROKER_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrokerName() { return doColumn("BROKER_NAME"); }
        /**
         * BROKER_PHONE_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrokerPhoneNo() { return doColumn("BROKER_PHONE_NO"); }
        /**
         * BROKER_FAX_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrokerFaxNo() { return doColumn("BROKER_FAX_NO"); }
        /**
         * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSatDeliveryFlg() { return doColumn("SAT_DELIVERY_FLG"); }
        /**
         * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnResidentialDeliveryFlg() { return doColumn("RESIDENTIAL_DELIVERY_FLG"); }
        /**
         * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodFlg() { return doColumn("COD_FLG"); }
        /**
         * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSignatureRequiredFlg() { return doColumn("SIGNATURE_REQUIRED_FLG"); }
        /**
         * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSignatureReleaseFlg() { return doColumn("SIGNATURE_RELEASE_FLG"); }
        /**
         * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCallBeforeDeliveryFlg() { return doColumn("CALL_BEFORE_DELIVERY_FLG"); }
        /**
         * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreezableProtectionFlg() { return doColumn("FREEZABLE_PROTECTION_FLG"); }
        /**
         * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGuaranteedPlusFlg() { return doColumn("GUARANTEED_PLUS_FLG"); }
        /**
         * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnResidentialPickupFlg() { return doColumn("RESIDENTIAL_PICKUP_FLG"); }
        /**
         * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDoNotStackStackFlg() { return doColumn("DO_NOT_STACK_STACK_FLG"); }
        /**
         * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitedAccessDeliveryFlg() { return doColumn("LIMITED_ACCESS_DELIVERY_FLG"); }
        /**
         * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitedAccessPickupFlg() { return doColumn("LIMITED_ACCESS_PICKUP_FLG"); }
        /**
         * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOverSizedFlg() { return doColumn("OVER_SIZED_FLG"); }
        /**
         * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPoisonFlg() { return doColumn("POISON_FLG"); }
        /**
         * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFoogFlg() { return doColumn("FOOG_FLG"); }
        /**
         * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiftgateDeliveryPrepaidFlg() { return doColumn("LIFTGATE_DELIVERY_PREPAID_FLG"); }
        /**
         * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiftgateDeliveryCollectFlg() { return doColumn("LIFTGATE_DELIVERY_COLLECT_FLG"); }
        /**
         * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiftgatePickupPrepaidFlg() { return doColumn("LIFTGATE_PICKUP_PREPAID_FLG"); }
        /**
         * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiftgatePickupCollectFlg() { return doColumn("LIFTGATE_PICKUP_COLLECT_FLG"); }
        /**
         * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInsideDeliveryPrepaidFlg() { return doColumn("INSIDE_DELIVERY_PREPAID_FLG"); }
        /**
         * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInsideDeliveryCollectFlg() { return doColumn("INSIDE_DELIVERY_COLLECT_FLG"); }
        /**
         * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInsidePickupPrepaidFlg() { return doColumn("INSIDE_PICKUP_PREPAID_FLG"); }
        /**
         * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInsidePickupCollectFlg() { return doColumn("INSIDE_PICKUP_COLLECT_FLG"); }
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
            columnCustomerId(); // PK
            if (qyCall().qy().hasConditionQueryBClassDtlBySatDeliveryFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSatDeliveryFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByResidentialDeliveryFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnResidentialDeliveryFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCodFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCodFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySignatureRequiredFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSignatureRequiredFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySignatureReleaseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSignatureReleaseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCallBeforeDeliveryFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCallBeforeDeliveryFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFreezableProtectionFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFreezableProtectionFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByGuaranteedPlusFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnGuaranteedPlusFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByResidentialPickupFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnResidentialPickupFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDoNotStackStackFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDoNotStackStackFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitedAccessDeliveryFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitedAccessDeliveryFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitedAccessPickupFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitedAccessPickupFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByOverSizedFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnOverSizedFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPoisonFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPoisonFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFoogFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFoogFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLiftgateDeliveryPrepaidFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLiftgateDeliveryCollectFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLiftgateDeliveryCollectFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLiftgatePickupPrepaidFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLiftgatePickupPrepaidFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLiftgatePickupCollectFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLiftgatePickupCollectFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInsideDeliveryPrepaidFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInsideDeliveryPrepaidFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInsideDeliveryCollectFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInsideDeliveryCollectFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInsidePickupPrepaidFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInsidePickupPrepaidFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInsidePickupCollectFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInsidePickupCollectFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_CARRIER_SLIP_CES"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomer() {
            assertRelation("mCustomer");
            if (_mCustomer == null) {
                _mCustomer = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomer()
                                    , () -> _qyCall.qy().queryMCustomer())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomer.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomer()
                      , () -> xsyncQyCall().qy().queryMCustomer()));
                }
            }
            return _mCustomer;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySatDeliveryFlg() {
            assertRelation("bClassDtlBySatDeliveryFlg");
            if (_bClassDtlBySatDeliveryFlg == null) {
                _bClassDtlBySatDeliveryFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySatDeliveryFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySatDeliveryFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySatDeliveryFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySatDeliveryFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySatDeliveryFlg()));
                }
            }
            return _bClassDtlBySatDeliveryFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByResidentialDeliveryFlg() {
            assertRelation("bClassDtlByResidentialDeliveryFlg");
            if (_bClassDtlByResidentialDeliveryFlg == null) {
                _bClassDtlByResidentialDeliveryFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByResidentialDeliveryFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByResidentialDeliveryFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByResidentialDeliveryFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByResidentialDeliveryFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByResidentialDeliveryFlg()));
                }
            }
            return _bClassDtlByResidentialDeliveryFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCodFlg() {
            assertRelation("bClassDtlByCodFlg");
            if (_bClassDtlByCodFlg == null) {
                _bClassDtlByCodFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCodFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCodFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCodFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCodFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCodFlg()));
                }
            }
            return _bClassDtlByCodFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySignatureRequiredFlg() {
            assertRelation("bClassDtlBySignatureRequiredFlg");
            if (_bClassDtlBySignatureRequiredFlg == null) {
                _bClassDtlBySignatureRequiredFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySignatureRequiredFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySignatureRequiredFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySignatureRequiredFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySignatureRequiredFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySignatureRequiredFlg()));
                }
            }
            return _bClassDtlBySignatureRequiredFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySignatureReleaseFlg() {
            assertRelation("bClassDtlBySignatureReleaseFlg");
            if (_bClassDtlBySignatureReleaseFlg == null) {
                _bClassDtlBySignatureReleaseFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySignatureReleaseFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySignatureReleaseFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySignatureReleaseFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySignatureReleaseFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySignatureReleaseFlg()));
                }
            }
            return _bClassDtlBySignatureReleaseFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCallBeforeDeliveryFlg() {
            assertRelation("bClassDtlByCallBeforeDeliveryFlg");
            if (_bClassDtlByCallBeforeDeliveryFlg == null) {
                _bClassDtlByCallBeforeDeliveryFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCallBeforeDeliveryFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCallBeforeDeliveryFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCallBeforeDeliveryFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCallBeforeDeliveryFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCallBeforeDeliveryFlg()));
                }
            }
            return _bClassDtlByCallBeforeDeliveryFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFreezableProtectionFlg() {
            assertRelation("bClassDtlByFreezableProtectionFlg");
            if (_bClassDtlByFreezableProtectionFlg == null) {
                _bClassDtlByFreezableProtectionFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFreezableProtectionFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByFreezableProtectionFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFreezableProtectionFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFreezableProtectionFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFreezableProtectionFlg()));
                }
            }
            return _bClassDtlByFreezableProtectionFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByGuaranteedPlusFlg() {
            assertRelation("bClassDtlByGuaranteedPlusFlg");
            if (_bClassDtlByGuaranteedPlusFlg == null) {
                _bClassDtlByGuaranteedPlusFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByGuaranteedPlusFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByGuaranteedPlusFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByGuaranteedPlusFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByGuaranteedPlusFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByGuaranteedPlusFlg()));
                }
            }
            return _bClassDtlByGuaranteedPlusFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByResidentialPickupFlg() {
            assertRelation("bClassDtlByResidentialPickupFlg");
            if (_bClassDtlByResidentialPickupFlg == null) {
                _bClassDtlByResidentialPickupFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByResidentialPickupFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByResidentialPickupFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByResidentialPickupFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByResidentialPickupFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByResidentialPickupFlg()));
                }
            }
            return _bClassDtlByResidentialPickupFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDoNotStackStackFlg() {
            assertRelation("bClassDtlByDoNotStackStackFlg");
            if (_bClassDtlByDoNotStackStackFlg == null) {
                _bClassDtlByDoNotStackStackFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDoNotStackStackFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDoNotStackStackFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDoNotStackStackFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDoNotStackStackFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDoNotStackStackFlg()));
                }
            }
            return _bClassDtlByDoNotStackStackFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLimitedAccessDeliveryFlg() {
            assertRelation("bClassDtlByLimitedAccessDeliveryFlg");
            if (_bClassDtlByLimitedAccessDeliveryFlg == null) {
                _bClassDtlByLimitedAccessDeliveryFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLimitedAccessDeliveryFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLimitedAccessDeliveryFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLimitedAccessDeliveryFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLimitedAccessDeliveryFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLimitedAccessDeliveryFlg()));
                }
            }
            return _bClassDtlByLimitedAccessDeliveryFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLimitedAccessPickupFlg() {
            assertRelation("bClassDtlByLimitedAccessPickupFlg");
            if (_bClassDtlByLimitedAccessPickupFlg == null) {
                _bClassDtlByLimitedAccessPickupFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLimitedAccessPickupFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLimitedAccessPickupFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLimitedAccessPickupFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLimitedAccessPickupFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLimitedAccessPickupFlg()));
                }
            }
            return _bClassDtlByLimitedAccessPickupFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByOverSizedFlg() {
            assertRelation("bClassDtlByOverSizedFlg");
            if (_bClassDtlByOverSizedFlg == null) {
                _bClassDtlByOverSizedFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByOverSizedFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByOverSizedFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByOverSizedFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByOverSizedFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByOverSizedFlg()));
                }
            }
            return _bClassDtlByOverSizedFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPoisonFlg() {
            assertRelation("bClassDtlByPoisonFlg");
            if (_bClassDtlByPoisonFlg == null) {
                _bClassDtlByPoisonFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPoisonFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPoisonFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPoisonFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPoisonFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPoisonFlg()));
                }
            }
            return _bClassDtlByPoisonFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFoogFlg() {
            assertRelation("bClassDtlByFoogFlg");
            if (_bClassDtlByFoogFlg == null) {
                _bClassDtlByFoogFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFoogFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByFoogFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFoogFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFoogFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFoogFlg()));
                }
            }
            return _bClassDtlByFoogFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLiftgateDeliveryPrepaidFlg() {
            assertRelation("bClassDtlByLiftgateDeliveryPrepaidFlg");
            if (_bClassDtlByLiftgateDeliveryPrepaidFlg == null) {
                _bClassDtlByLiftgateDeliveryPrepaidFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLiftgateDeliveryPrepaidFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLiftgateDeliveryPrepaidFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLiftgateDeliveryPrepaidFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLiftgateDeliveryPrepaidFlg()));
                }
            }
            return _bClassDtlByLiftgateDeliveryPrepaidFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLiftgateDeliveryCollectFlg() {
            assertRelation("bClassDtlByLiftgateDeliveryCollectFlg");
            if (_bClassDtlByLiftgateDeliveryCollectFlg == null) {
                _bClassDtlByLiftgateDeliveryCollectFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLiftgateDeliveryCollectFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLiftgateDeliveryCollectFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLiftgateDeliveryCollectFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLiftgateDeliveryCollectFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLiftgateDeliveryCollectFlg()));
                }
            }
            return _bClassDtlByLiftgateDeliveryCollectFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLiftgatePickupPrepaidFlg() {
            assertRelation("bClassDtlByLiftgatePickupPrepaidFlg");
            if (_bClassDtlByLiftgatePickupPrepaidFlg == null) {
                _bClassDtlByLiftgatePickupPrepaidFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLiftgatePickupPrepaidFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLiftgatePickupPrepaidFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLiftgatePickupPrepaidFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLiftgatePickupPrepaidFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLiftgatePickupPrepaidFlg()));
                }
            }
            return _bClassDtlByLiftgatePickupPrepaidFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLiftgatePickupCollectFlg() {
            assertRelation("bClassDtlByLiftgatePickupCollectFlg");
            if (_bClassDtlByLiftgatePickupCollectFlg == null) {
                _bClassDtlByLiftgatePickupCollectFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLiftgatePickupCollectFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLiftgatePickupCollectFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLiftgatePickupCollectFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLiftgatePickupCollectFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLiftgatePickupCollectFlg()));
                }
            }
            return _bClassDtlByLiftgatePickupCollectFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInsideDeliveryPrepaidFlg() {
            assertRelation("bClassDtlByInsideDeliveryPrepaidFlg");
            if (_bClassDtlByInsideDeliveryPrepaidFlg == null) {
                _bClassDtlByInsideDeliveryPrepaidFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInsideDeliveryPrepaidFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInsideDeliveryPrepaidFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInsideDeliveryPrepaidFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInsideDeliveryPrepaidFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInsideDeliveryPrepaidFlg()));
                }
            }
            return _bClassDtlByInsideDeliveryPrepaidFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInsideDeliveryCollectFlg() {
            assertRelation("bClassDtlByInsideDeliveryCollectFlg");
            if (_bClassDtlByInsideDeliveryCollectFlg == null) {
                _bClassDtlByInsideDeliveryCollectFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInsideDeliveryCollectFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInsideDeliveryCollectFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInsideDeliveryCollectFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInsideDeliveryCollectFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInsideDeliveryCollectFlg()));
                }
            }
            return _bClassDtlByInsideDeliveryCollectFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInsidePickupPrepaidFlg() {
            assertRelation("bClassDtlByInsidePickupPrepaidFlg");
            if (_bClassDtlByInsidePickupPrepaidFlg == null) {
                _bClassDtlByInsidePickupPrepaidFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInsidePickupPrepaidFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInsidePickupPrepaidFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInsidePickupPrepaidFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInsidePickupPrepaidFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInsidePickupPrepaidFlg()));
                }
            }
            return _bClassDtlByInsidePickupPrepaidFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInsidePickupCollectFlg() {
            assertRelation("bClassDtlByInsidePickupCollectFlg");
            if (_bClassDtlByInsidePickupCollectFlg == null) {
                _bClassDtlByInsidePickupCollectFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInsidePickupCollectFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInsidePickupCollectFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInsidePickupCollectFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInsidePickupCollectFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInsidePickupCollectFlg()));
                }
            }
            return _bClassDtlByInsidePickupCollectFlg;
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
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipCesCB, MCarrierSlipCesCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipCesCB> sq, MCarrierSlipCesCQ cq, String al, DerivedReferrerOption op)
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
    public MCarrierSlipCesCB dreamCruiseCB() {
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB();
        cb.xsetupForDreamCruise((MCarrierSlipCesCB) this);
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
    public HpColQyOperand<MCarrierSlipCesCB> columnQuery(final SpecifyQuery<MCarrierSlipCesCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCarrierSlipCesCB xcreateColumnQueryCB() {
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB();
        cb.xsetupForColumnQuery((MCarrierSlipCesCB)this);
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
    public void orScopeQuery(OrQuery<MCarrierSlipCesCB> orCBLambda) {
        xorSQ((MCarrierSlipCesCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MCarrierSlipCesCB> andCBLambda) {
        xorSQAP((MCarrierSlipCesCB)this, andCBLambda);
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
        final MCarrierSlipCesCB cb;
        if (mainCB != null) {
            cb = (MCarrierSlipCesCB)mainCB;
        } else {
            cb = new MCarrierSlipCesCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCarrierSlipCesCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCarrierSlipCesCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
