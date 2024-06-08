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
 * The base condition-bean of T_YAHOO_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTYahooOrderCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TYahooOrderCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTYahooOrderCB() {
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
        return "T_YAHOO_ORDER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param yahooOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TYahooOrderCB acceptPK(Long yahooOrderId) {
        assertObjectNotNull("yahooOrderId", yahooOrderId);
        BsTYahooOrderCB cb = this;
        cb.query().setYahooOrderId_Equal(yahooOrderId);
        return (TYahooOrderCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param yahooOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long yahooOrderId) {
        assertObjectNotNull("yahooOrderId", yahooOrderId);
        BsTYahooOrderCB cb = this;
        cb.query().setYahooOrderId_Equal(yahooOrderId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_YahooOrderId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_YahooOrderId_Desc();
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
    public TYahooOrderCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TYahooOrderCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TYahooOrderCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TYahooOrderCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TYahooOrderCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TYahooOrderCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TYahooOrderCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TYahooOrderCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TYahooOrderCB> unionCBLambda) {
        final TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TYahooOrderCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TYahooOrderCB> unionCBLambda) {
        final TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TYahooOrderCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * <span style="color: #0000C0">tYahooOrderBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TEcOrderB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tYahooOrder</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tYahooOrder</span>.<span style="color: #CC4747">getTEcOrderB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<TYahooOrderCQ> {
        protected TEcOrderBCB.HpSpecification _tEcOrderB;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TYahooOrderCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnYahooOrderId() { return doColumn("YAHOO_ORDER_ID"); }
        /**
         * ORDER_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderId() { return doColumn("ORDER_ID"); }
        /**
         * PARENT_ORDER_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnParentOrderId() { return doColumn("PARENT_ORDER_ID"); }
        /**
         * DEVICE_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeviceType() { return doColumn("DEVICE_TYPE"); }
        /**
         * IS_AFFILIATE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIsAffiliate() { return doColumn("IS_AFFILIATE"); }
        /**
         * FSP_LICENSE_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFspLicenseCode() { return doColumn("FSP_LICENSE_CODE"); }
        /**
         * FSP_LICENSE_NAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFspLicenseName() { return doColumn("FSP_LICENSE_NAME"); }
        /**
         * ORDER_TIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTime() { return doColumn("ORDER_TIME"); }
        /**
         * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTimeUnixEpoch() { return doColumn("ORDER_TIME_UNIX_EPOCH"); }
        /**
         * USE_POINT_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsePointType() { return doColumn("USE_POINT_TYPE"); }
        /**
         * ORDER_STATUS: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderStatus() { return doColumn("ORDER_STATUS"); }
        /**
         * STORE_STATUS: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreStatus() { return doColumn("STORE_STATUS"); }
        /**
         * REFERER: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReferer() { return doColumn("REFERER"); }
        /**
         * ENTRY_POINT: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEntryPoint() { return doColumn("ENTRY_POINT"); }
        /**
         * CLINK: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClink() { return doColumn("CLINK"); }
        /**
         * SUSPECT_MESSAGE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSuspectMessage() { return doColumn("SUSPECT_MESSAGE"); }
        /**
         * IS_ITEM_COUPON: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIsItemCoupon() { return doColumn("IS_ITEM_COUPON"); }
        /**
         * IS_SHIPPING_COUPON: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIsShippingCoupon() { return doColumn("IS_SHIPPING_COUPON"); }
        /**
         * SHIP_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipName() { return doColumn("SHIP_NAME"); }
        /**
         * SHIP_FIRST_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipFirstName() { return doColumn("SHIP_FIRST_NAME"); }
        /**
         * SHIP_LAST_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipLastName() { return doColumn("SHIP_LAST_NAME"); }
        /**
         * SHIP_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress1() { return doColumn("SHIP_ADDRESS1"); }
        /**
         * SHIP_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress2() { return doColumn("SHIP_ADDRESS2"); }
        /**
         * SHIP_CITY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipCity() { return doColumn("SHIP_CITY"); }
        /**
         * SHIP_PREFECTURE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPrefecture() { return doColumn("SHIP_PREFECTURE"); }
        /**
         * SHIP_ZIP_CODE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipZipCode() { return doColumn("SHIP_ZIP_CODE"); }
        /**
         * SHIP_NAME_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipNameKana() { return doColumn("SHIP_NAME_KANA"); }
        /**
         * SHIP_FIRST_NAME_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipFirstNameKana() { return doColumn("SHIP_FIRST_NAME_KANA"); }
        /**
         * SHIP_LAST_NAME_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipLastNameKana() { return doColumn("SHIP_LAST_NAME_KANA"); }
        /**
         * SHIP_ADDRESS1_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress1Kana() { return doColumn("SHIP_ADDRESS1_KANA"); }
        /**
         * SHIP_ADDRESS2_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipAddress2Kana() { return doColumn("SHIP_ADDRESS2_KANA"); }
        /**
         * SHIP_CITY_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipCityKana() { return doColumn("SHIP_CITY_KANA"); }
        /**
         * SHIP_PREFECTURE_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPrefectureKana() { return doColumn("SHIP_PREFECTURE_KANA"); }
        /**
         * SHIP_SECTION1_FIELD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipSection1Field() { return doColumn("SHIP_SECTION1_FIELD"); }
        /**
         * SHIP_SECTION1_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipSection1Value() { return doColumn("SHIP_SECTION1_VALUE"); }
        /**
         * SHIP_SECTION2_FIELD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipSection2Field() { return doColumn("SHIP_SECTION2_FIELD"); }
        /**
         * SHIP_SECTION2_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipSection2Value() { return doColumn("SHIP_SECTION2_VALUE"); }
        /**
         * SHIP_PHONE_NUMBER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipPhoneNumber() { return doColumn("SHIP_PHONE_NUMBER"); }
        /**
         * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipEmgPhoneNumber() { return doColumn("SHIP_EMG_PHONE_NUMBER"); }
        /**
         * SHIP_METHOD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipMethod() { return doColumn("SHIP_METHOD"); }
        /**
         * SHIP_METHOD_NAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipMethodName() { return doColumn("SHIP_METHOD_NAME"); }
        /**
         * SHIP_REQUEST_DATE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipRequestDate() { return doColumn("SHIP_REQUEST_DATE"); }
        /**
         * SHIP_REQUEST_TIME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipRequestTime() { return doColumn("SHIP_REQUEST_TIME"); }
        /**
         * SHIP_NOTES: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipNotes() { return doColumn("SHIP_NOTES"); }
        /**
         * ARRIVE_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnArriveType() { return doColumn("ARRIVE_TYPE"); }
        /**
         * SHIP_INVOICE_NUMBER1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipInvoiceNumber1() { return doColumn("SHIP_INVOICE_NUMBER1"); }
        /**
         * SHIP_INVOICE_NUMBER2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipInvoiceNumber2() { return doColumn("SHIP_INVOICE_NUMBER2"); }
        /**
         * SHIP_URL: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipUrl() { return doColumn("SHIP_URL"); }
        /**
         * SHIP_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipDate() { return doColumn("SHIP_DATE"); }
        /**
         * GIFT_WRAP_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapType() { return doColumn("GIFT_WRAP_TYPE"); }
        /**
         * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapPaperType() { return doColumn("GIFT_WRAP_PAPER_TYPE"); }
        /**
         * GIFT_WRAP_NAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapName() { return doColumn("GIFT_WRAP_NAME"); }
        /**
         * NEED_BILL_SLIP: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNeedBillSlip() { return doColumn("NEED_BILL_SLIP"); }
        /**
         * NEED_DETAILED_SLIP: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNeedDetailedSlip() { return doColumn("NEED_DETAILED_SLIP"); }
        /**
         * NEED_RECEIPT: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNeedReceipt() { return doColumn("NEED_RECEIPT"); }
        /**
         * OPTION1_FIELD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOption1Field() { return doColumn("OPTION1_FIELD"); }
        /**
         * OPTION1_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOption1Value() { return doColumn("OPTION1_VALUE"); }
        /**
         * OPTION2_FIELD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOption2Field() { return doColumn("OPTION2_FIELD"); }
        /**
         * OPTION2_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOption2Value() { return doColumn("OPTION2_VALUE"); }
        /**
         * GIFT_WRAP_MASSAGE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapMassage() { return doColumn("GIFT_WRAP_MASSAGE"); }
        /**
         * BILL_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillName() { return doColumn("BILL_NAME"); }
        /**
         * BILL_FIRST_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillFirstName() { return doColumn("BILL_FIRST_NAME"); }
        /**
         * BILL_LAST_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillLastName() { return doColumn("BILL_LAST_NAME"); }
        /**
         * BILL_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillAddress1() { return doColumn("BILL_ADDRESS1"); }
        /**
         * BILL_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillAddress2() { return doColumn("BILL_ADDRESS2"); }
        /**
         * BILL_CITY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillCity() { return doColumn("BILL_CITY"); }
        /**
         * BILL_PREFECTURE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillPrefecture() { return doColumn("BILL_PREFECTURE"); }
        /**
         * BILL_ZIP_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillZipCode() { return doColumn("BILL_ZIP_CODE"); }
        /**
         * BILL_NAME_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillNameKana() { return doColumn("BILL_NAME_KANA"); }
        /**
         * BILL_FIRST_NAME_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillFirstNameKana() { return doColumn("BILL_FIRST_NAME_KANA"); }
        /**
         * BILL_LAST_NAME_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillLastNameKana() { return doColumn("BILL_LAST_NAME_KANA"); }
        /**
         * BILL_ADDRESS1_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillAddress1Kana() { return doColumn("BILL_ADDRESS1_KANA"); }
        /**
         * BILL_ADDRESS2_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillAddress2Kana() { return doColumn("BILL_ADDRESS2_KANA"); }
        /**
         * BILL_CITY_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillCityKana() { return doColumn("BILL_CITY_KANA"); }
        /**
         * BILL_PREFECTURE_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillPrefectureKana() { return doColumn("BILL_PREFECTURE_KANA"); }
        /**
         * BILL_SECTION1_FIELD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillSection1Field() { return doColumn("BILL_SECTION1_FIELD"); }
        /**
         * BILL_SECTION1_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillSection1Value() { return doColumn("BILL_SECTION1_VALUE"); }
        /**
         * BILL_SECTION2_FIELD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillSection2Field() { return doColumn("BILL_SECTION2_FIELD"); }
        /**
         * BILL_SECTION2_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillSection2Value() { return doColumn("BILL_SECTION2_VALUE"); }
        /**
         * BILL_PHONE_NUMBER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillPhoneNumber() { return doColumn("BILL_PHONE_NUMBER"); }
        /**
         * BILL_EMG_PHONE_NUMBER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillEmgPhoneNumber() { return doColumn("BILL_EMG_PHONE_NUMBER"); }
        /**
         * BILL_MAIL_ADDRESS: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillMailAddress() { return doColumn("BILL_MAIL_ADDRESS"); }
        /**
         * PAY_MATHOD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayMathod() { return doColumn("PAY_MATHOD"); }
        /**
         * PAY_MATHOD_NAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayMathodName() { return doColumn("PAY_MATHOD_NAME"); }
        /**
         * PAY_KIND: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayKind() { return doColumn("PAY_KIND"); }
        /**
         * CARD_PAY_COUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardPayCount() { return doColumn("CARD_PAY_COUNT"); }
        /**
         * CARD_PAY_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardPayType() { return doColumn("CARD_PAY_TYPE"); }
        /**
         * SETTLE_STATUS: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSettleStatus() { return doColumn("SETTLE_STATUS"); }
        /**
         * SETTLE_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSettleId() { return doColumn("SETTLE_ID"); }
        /**
         * PAY_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayNo() { return doColumn("PAY_NO"); }
        /**
         * PAY_NO_ISSUE_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayNoIssueDate() { return doColumn("PAY_NO_ISSUE_DATE"); }
        /**
         * PAY_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayDate() { return doColumn("PAY_DATE"); }
        /**
         * BUYER_COMMENTS: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBuyerComments() { return doColumn("BUYER_COMMENTS"); }
        /**
         * AGE_CONFIRM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAgeConfirm() { return doColumn("AGE_CONFIRM"); }
        /**
         * QUANTITY_DETAIL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQuantityDetail() { return doColumn("QUANTITY_DETAIL"); }
        /**
         * SHIP_CHARGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipCharge() { return doColumn("SHIP_CHARGE"); }
        /**
         * PAY_CHARGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPayCharge() { return doColumn("PAY_CHARGE"); }
        /**
         * GIFT_WRAP_CHARGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftWrapCharge() { return doColumn("GIFT_WRAP_CHARGE"); }
        /**
         * DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDiscount() { return doColumn("DISCOUNT"); }
        /**
         * ADJUSTMENTS: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdjustments() { return doColumn("ADJUSTMENTS"); }
        /**
         * USE_POINT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsePoint() { return doColumn("USE_POINT"); }
        /**
         * GET_POINT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGetPoint() { return doColumn("GET_POINT"); }
        /**
         * TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotal() { return doColumn("TOTAL"); }
        /**
         * TOTAL_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalPrice() { return doColumn("TOTAL_PRICE"); }
        /**
         * SHIPPING_C_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingCDiscount() { return doColumn("SHIPPING_C_DISCOUNT"); }
        /**
         * ITEM_C_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemCDiscount() { return doColumn("ITEM_C_DISCOUNT"); }
        /**
         * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalMallCDiscount() { return doColumn("TOTAL_MALL_C_DISCOUNT"); }
        /**
         * GET_POINT_CRG_TO_STORE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGetPointCrgToStore() { return doColumn("GET_POINT_CRG_TO_STORE"); }
        /**
         * LINE_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLineId() { return doColumn("LINE_ID"); }
        /**
         * QUANTITY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQuantity() { return doColumn("QUANTITY"); }
        /**
         * ITEM_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemId() { return doColumn("ITEM_ID"); }
        /**
         * SUB_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSubCode() { return doColumn("SUB_CODE"); }
        /**
         * TITLE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTitle() { return doColumn("TITLE"); }
        /**
         * ITEM_OPTION_NAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemOptionName() { return doColumn("ITEM_OPTION_NAME"); }
        /**
         * ITEM_OPTION_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemOptionValue() { return doColumn("ITEM_OPTION_VALUE"); }
        /**
         * SUB_CODE_OPTION: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSubCodeOption() { return doColumn("SUB_CODE_OPTION"); }
        /**
         * INSCRIPTION_NAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInscriptionName() { return doColumn("INSCRIPTION_NAME"); }
        /**
         * INSCRIPTION_VALUE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInscriptionValue() { return doColumn("INSCRIPTION_VALUE"); }
        /**
         * UNIT_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitPrice() { return doColumn("UNIT_PRICE"); }
        /**
         * UNIT_GET_POINT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitGetPoint() { return doColumn("UNIT_GET_POINT"); }
        /**
         * LINE_SUB_TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLineSubTotal() { return doColumn("LINE_SUB_TOTAL"); }
        /**
         * LINE_GET_POINT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLineGetPoint() { return doColumn("LINE_GET_POINT"); }
        /**
         * POINT_FSP_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointFspCode() { return doColumn("POINT_FSP_CODE"); }
        /**
         * ITEM_CONDITION: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemCondition() { return doColumn("ITEM_CONDITION"); }
        /**
         * COUPON_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCouponId() { return doColumn("COUPON_ID"); }
        /**
         * COUPON_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCouponDiscount() { return doColumn("COUPON_DISCOUNT"); }
        /**
         * ORIGINAL_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOriginalPrice() { return doColumn("ORIGINAL_PRICE"); }
        /**
         * IS_GET_POINT_FIX: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIsGetPointFix() { return doColumn("IS_GET_POINT_FIX"); }
        /**
         * GET_POINT_FIX_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGetPointFixDate() { return doColumn("GET_POINT_FIX_DATE"); }
        /**
         * RELEASE_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReleaseDate() { return doColumn("RELEASE_DATE"); }
        /**
         * GET_POINT_TYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGetPointType() { return doColumn("GET_POINT_TYPE"); }
        /**
         * JAN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJan() { return doColumn("JAN"); }
        /**
         * PRODUCT_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * POINT_CHARGED_TO_STORE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointChargedToStore() { return doColumn("POINT_CHARGED_TO_STORE"); }
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
            columnYahooOrderId(); // PK
            if (qyCall().qy().hasConditionQueryTEcOrderB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TEcOrderBCQ) {
                columnEcOrderBId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_YAHOO_ORDER"; }
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
        public HpSDRFunction<TYahooOrderCB, TYahooOrderCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TYahooOrderCB> sq, TYahooOrderCQ cq, String al, DerivedReferrerOption op)
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
    public TYahooOrderCB dreamCruiseCB() {
        TYahooOrderCB cb = new TYahooOrderCB();
        cb.xsetupForDreamCruise((TYahooOrderCB) this);
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
    public HpColQyOperand<TYahooOrderCB> columnQuery(final SpecifyQuery<TYahooOrderCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TYahooOrderCB xcreateColumnQueryCB() {
        TYahooOrderCB cb = new TYahooOrderCB();
        cb.xsetupForColumnQuery((TYahooOrderCB)this);
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
    public void orScopeQuery(OrQuery<TYahooOrderCB> orCBLambda) {
        xorSQ((TYahooOrderCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TYahooOrderCB> andCBLambda) {
        xorSQAP((TYahooOrderCB)this, andCBLambda);
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
        final TYahooOrderCB cb;
        if (mainCB != null) {
            cb = (TYahooOrderCB)mainCB;
        } else {
            cb = new TYahooOrderCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TYahooOrderCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TYahooOrderCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
