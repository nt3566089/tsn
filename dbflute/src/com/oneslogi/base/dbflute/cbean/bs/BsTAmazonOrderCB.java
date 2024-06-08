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
 * The base condition-bean of T_AMAZON_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTAmazonOrderCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAmazonOrderCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAmazonOrderCB() {
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
        return "T_AMAZON_ORDER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param amazonOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TAmazonOrderCB acceptPK(Long amazonOrderId) {
        assertObjectNotNull("amazonOrderId", amazonOrderId);
        BsTAmazonOrderCB cb = this;
        cb.query().setAmazonOrderId_Equal(amazonOrderId);
        return (TAmazonOrderCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param amazonOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long amazonOrderId) {
        assertObjectNotNull("amazonOrderId", amazonOrderId);
        BsTAmazonOrderCB cb = this;
        cb.query().setAmazonOrderId_Equal(amazonOrderId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_AmazonOrderId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_AmazonOrderId_Desc();
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
    public TAmazonOrderCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TAmazonOrderCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TAmazonOrderCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TAmazonOrderCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TAmazonOrderCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TAmazonOrderCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TAmazonOrderCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TAmazonOrderCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TAmazonOrderCB> unionCBLambda) {
        final TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TAmazonOrderCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TAmazonOrderCB> unionCBLambda) {
        final TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TAmazonOrderCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TEcOrderBNss _nssTEcOrderB;
    public TEcOrderBNss xdfgetNssTEcOrderB() {
        if (_nssTEcOrderB == null) { _nssTEcOrderB = new TEcOrderBNss(null); }
        return _nssTEcOrderB;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * <pre>
     * <span style="color: #0000C0">tAmazonOrderBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TEcOrderB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tAmazonOrder</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tAmazonOrder</span>.<span style="color: #CC4747">getTEcOrderB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TEcOrderBNss setupSelect_TEcOrderB() {
        assertSetupSelectPurpose("tEcOrderB");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEcOrderBId();
        }
        doSetupSelect(() -> query().queryTEcOrderB());
        if (_nssTEcOrderB == null || !_nssTEcOrderB.hasConditionQuery())
        { _nssTEcOrderB = new TEcOrderBNss(query().queryTEcOrderB()); }
        return _nssTEcOrderB;
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

    public static class HpSpecification extends HpAbstractSpecification<TAmazonOrderCQ> {
        protected TEcOrderBCB.HpSpecification _tEcOrderB;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TAmazonOrderCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAmazonOrderId() { return doColumn("AMAZON_ORDER_ID"); }
        /**
         * ORDER_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderId() { return doColumn("ORDER_ID"); }
        /**
         * ORDER_ITEM_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderItemId() { return doColumn("ORDER_ITEM_ID"); }
        /**
         * PURCHASE_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPurchaseDate() { return doColumn("PURCHASE_DATE"); }
        /**
         * PAYMENTS_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentsDate() { return doColumn("PAYMENTS_DATE"); }
        /**
         * BUYER_EMAIL: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBuyerEmail() { return doColumn("BUYER_EMAIL"); }
        /**
         * BUYER_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBuyerName() { return doColumn("BUYER_NAME"); }
        /**
         * BUYER_PHONE_NUMBER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBuyerPhoneNumber() { return doColumn("BUYER_PHONE_NUMBER"); }
        /**
         * SKU: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSku() { return doColumn("SKU"); }
        /**
         * PRODUCT_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductName() { return doColumn("PRODUCT_NAME"); }
        /**
         * QUANTITY_PURCHASED: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQuantityPurchased() { return doColumn("QUANTITY_PURCHASED"); }
        /**
         * CURRENCY: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCurrency() { return doColumn("CURRENCY"); }
        /**
         * ITEM_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemPrice() { return doColumn("ITEM_PRICE"); }
        /**
         * ITEM_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemTax() { return doColumn("ITEM_TAX"); }
        /**
         * SHIPPING_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingPrice() { return doColumn("SHIPPING_PRICE"); }
        /**
         * SHIPPING_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingTax() { return doColumn("SHIPPING_TAX"); }
        /**
         * GIFT_WRAP_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapPrice() { return doColumn("GIFT_WRAP_PRICE"); }
        /**
         * GIFT_WRAP_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapTax() { return doColumn("GIFT_WRAP_TAX"); }
        /**
         * SHIP_SERVICE_LEVEL: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipServiceLevel() { return doColumn("SHIP_SERVICE_LEVEL"); }
        /**
         * RECIPIENT_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRecipientName() { return doColumn("RECIPIENT_NAME"); }
        /**
         * SHIP_ADDRESS_1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress1() { return doColumn("SHIP_ADDRESS_1"); }
        /**
         * SHIP_ADDRESS_2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress2() { return doColumn("SHIP_ADDRESS_2"); }
        /**
         * SHIP_ADDRESS_3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress3() { return doColumn("SHIP_ADDRESS_3"); }
        /**
         * SHIP_CITY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipCity() { return doColumn("SHIP_CITY"); }
        /**
         * SHIP_STATE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipState() { return doColumn("SHIP_STATE"); }
        /**
         * SHIP_POSTAL_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPostalCode() { return doColumn("SHIP_POSTAL_CODE"); }
        /**
         * SHIP_COUNTRY: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipCountry() { return doColumn("SHIP_COUNTRY"); }
        /**
         * SHIP_PHONE_NUMBER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPhoneNumber() { return doColumn("SHIP_PHONE_NUMBER"); }
        /**
         * GIFT_WRAP_TYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapType() { return doColumn("GIFT_WRAP_TYPE"); }
        /**
         * GIFT_MASSAGE_TEXT: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftMassageText() { return doColumn("GIFT_MASSAGE_TEXT"); }
        /**
         * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemPromotionDiscount() { return doColumn("ITEM_PROMOTION_DISCOUNT"); }
        /**
         * ITEM_PROMOTION_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemPromotionId() { return doColumn("ITEM_PROMOTION_ID"); }
        /**
         * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPromotionDiscount() { return doColumn("SHIP_PROMOTION_DISCOUNT"); }
        /**
         * SHIP_PROMOTION_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPromotionId() { return doColumn("SHIP_PROMOTION_ID"); }
        /**
         * DELIVERY_START_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryStartDate() { return doColumn("DELIVERY_START_DATE"); }
        /**
         * DELIVERY_END_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryEndDate() { return doColumn("DELIVERY_END_DATE"); }
        /**
         * DELIVERY_TIME_ZONE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryTimeZone() { return doColumn("DELIVERY_TIME_ZONE"); }
        /**
         * DELIVERY_INSTRUCTIONS: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryInstructions() { return doColumn("DELIVERY_INSTRUCTIONS"); }
        /**
         * PAYMENT_METHOD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentMethod() { return doColumn("PAYMENT_METHOD"); }
        /**
         * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodCollectibleAmount() { return doColumn("COD_COLLECTIBLE_AMOUNT"); }
        /**
         * ALREADY_PAID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAlreadyPaid() { return doColumn("ALREADY_PAID"); }
        /**
         * PAYMENT_METHOD_FEE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentMethodFee() { return doColumn("PAYMENT_METHOD_FEE"); }
        /**
         * SCHEDULED_DELI_ST_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnScheduledDeliStDate() { return doColumn("SCHEDULED_DELI_ST_DATE"); }
        /**
         * SCHEDULED_DELI_ED_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnScheduledDeliEdDate() { return doColumn("SCHEDULED_DELI_ED_DATE"); }
        /**
         * PACKING_QTY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingQty() { return doColumn("PACKING_QTY"); }
        /**
         * SLIP_ITEM_NM1: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm1() { return doColumn("SLIP_ITEM_NM1"); }
        /**
         * SLIP_ITEM_NM2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm2() { return doColumn("SLIP_ITEM_NM2"); }
        /**
         * SLIP_ITEM_NM3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm3() { return doColumn("SLIP_ITEM_NM3"); }
        /**
         * SLIP_ITEM_NM4: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm4() { return doColumn("SLIP_ITEM_NM4"); }
        /**
         * SLIP_ITEM_NM5: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm5() { return doColumn("SLIP_ITEM_NM5"); }
        /**
         * SLIP_ITEM_CD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemCd1() { return doColumn("SLIP_ITEM_CD1"); }
        /**
         * SLIP_ITEM_CD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemCd2() { return doColumn("SLIP_ITEM_CD2"); }
        /**
         * FREIGHT_HANDLING1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightHandling1() { return doColumn("FREIGHT_HANDLING1"); }
        /**
         * FREIGHT_HANDLING2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightHandling2() { return doColumn("FREIGHT_HANDLING2"); }
        /**
         * ARTICLE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnArticle() { return doColumn("ARTICLE"); }
        /**
         * RECEIVE_ID: {IX, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveId() { return doColumn("RECEIVE_ID"); }
        /**
         * ROW_NO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRowNo() { return doColumn("ROW_NO"); }
        /**
         * ERROR_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorFlg() { return doColumn("ERROR_FLG"); }
        /**
         * IMPORT_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportFlg() { return doColumn("IMPORT_FLG"); }
        /**
         * IMPORT_TYPE_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportTypeId() { return doColumn("IMPORT_TYPE_ID"); }
        /**
         * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEcOrderBId() { return doColumn("EC_ORDER_B_ID"); }
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
            columnAmazonOrderId(); // PK
            if (qyCall().qy().hasConditionQueryTEcOrderB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TEcOrderBCQ) {
                columnEcOrderBId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_AMAZON_ORDER"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TEcOrderBCB.HpSpecification specifyTEcOrderB() {
            assertRelation("tEcOrderB");
            if (_tEcOrderB == null) {
                _tEcOrderB = new TEcOrderBCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTEcOrderB()
                                    , () -> _qyCall.qy().queryTEcOrderB())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tEcOrderB.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTEcOrderB()
                      , () -> xsyncQyCall().qy().queryTEcOrderB()));
                }
            }
            return _tEcOrderB;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TAmazonOrderCB, TAmazonOrderCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAmazonOrderCB> sq, TAmazonOrderCQ cq, String al, DerivedReferrerOption op)
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
    public TAmazonOrderCB dreamCruiseCB() {
        TAmazonOrderCB cb = new TAmazonOrderCB();
        cb.xsetupForDreamCruise((TAmazonOrderCB) this);
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
    public HpColQyOperand<TAmazonOrderCB> columnQuery(final SpecifyQuery<TAmazonOrderCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TAmazonOrderCB xcreateColumnQueryCB() {
        TAmazonOrderCB cb = new TAmazonOrderCB();
        cb.xsetupForColumnQuery((TAmazonOrderCB)this);
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
    public void orScopeQuery(OrQuery<TAmazonOrderCB> orCBLambda) {
        xorSQ((TAmazonOrderCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TAmazonOrderCB> andCBLambda) {
        xorSQAP((TAmazonOrderCB)this, andCBLambda);
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
        final TAmazonOrderCB cb;
        if (mainCB != null) {
            cb = (TAmazonOrderCB)mainCB;
        } else {
            cb = new TAmazonOrderCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TAmazonOrderCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TAmazonOrderCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
