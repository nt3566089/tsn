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
 * The base condition-bean of T_RAKUTEN_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTRakutenOrderCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRakutenOrderCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRakutenOrderCB() {
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
        return "T_RAKUTEN_ORDER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param rakutenOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TRakutenOrderCB acceptPK(Long rakutenOrderId) {
        assertObjectNotNull("rakutenOrderId", rakutenOrderId);
        BsTRakutenOrderCB cb = this;
        cb.query().setRakutenOrderId_Equal(rakutenOrderId);
        return (TRakutenOrderCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param rakutenOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long rakutenOrderId) {
        assertObjectNotNull("rakutenOrderId", rakutenOrderId);
        BsTRakutenOrderCB cb = this;
        cb.query().setRakutenOrderId_Equal(rakutenOrderId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_RakutenOrderId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_RakutenOrderId_Desc();
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
    public TRakutenOrderCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TRakutenOrderCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TRakutenOrderCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TRakutenOrderCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TRakutenOrderCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TRakutenOrderCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TRakutenOrderCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TRakutenOrderCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TRakutenOrderCB> unionCBLambda) {
        final TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TRakutenOrderCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TRakutenOrderCB> unionCBLambda) {
        final TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TRakutenOrderCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * <span style="color: #0000C0">tRakutenOrderBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TEcOrderB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tRakutenOrder</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tRakutenOrder</span>.<span style="color: #CC4747">getTEcOrderB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<TRakutenOrderCQ> {
        protected TEcOrderBCB.HpSpecification _tEcOrderB;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TRakutenOrderCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRakutenOrderId() { return doColumn("RAKUTEN_ORDER_ID"); }
        /**
         * ORDER_NO: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderNo() { return doColumn("ORDER_NO"); }
        /**
         * ORDER_STATUS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderStatus() { return doColumn("ORDER_STATUS"); }
        /**
         * CARD_STATUS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardStatus() { return doColumn("CARD_STATUS"); }
        /**
         * PAYMENT_DT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentDt() { return doColumn("PAYMENT_DT"); }
        /**
         * SHIPPING_DT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingDt() { return doColumn("SHIPPING_DT"); }
        /**
         * DELIV_TZ: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTz() { return doColumn("DELIV_TZ"); }
        /**
         * DELIV_DT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivDt() { return doColumn("DELIV_DT"); }
        /**
         * PERSON_IN_CHARGE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPersonInCharge() { return doColumn("PERSON_IN_CHARGE"); }
        /**
         * SINGLE_MEMO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSingleMemo() { return doColumn("SINGLE_MEMO"); }
        /**
         * MAIL_INPUT: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMailInput() { return doColumn("MAIL_INPUT"); }
        /**
         * FIRST_PAYMENT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFirstPayment() { return doColumn("FIRST_PAYMENT"); }
        /**
         * TERMINAL: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTerminal() { return doColumn("TERMINAL"); }
        /**
         * MAIL_CARRIER_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMailCarrierCd() { return doColumn("MAIL_CARRIER_CD"); }
        /**
         * GIFT_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftFlg() { return doColumn("GIFT_FLG"); }
        /**
         * RAKUTEN_ORDER_COMMENT: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRakutenOrderComment() { return doColumn("RAKUTEN_ORDER_COMMENT"); }
        /**
         * ORDER_DATETIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderDatetime() { return doColumn("ORDER_DATETIME"); }
        /**
         * MULTI_DELIV_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMultiDelivFlg() { return doColumn("MULTI_DELIV_FLG"); }
        /**
         * ALERT_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAlertFlg() { return doColumn("ALERT_FLG"); }
        /**
         * MEMBER_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberFlg() { return doColumn("MEMBER_FLG"); }
        /**
         * TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotal() { return doColumn("TOTAL"); }
        /**
         * TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTax() { return doColumn("TAX"); }
        /**
         * CARRIAGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarriage() { return doColumn("CARRIAGE"); }
        /**
         * COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCod() { return doColumn("COD"); }
        /**
         * AMOUNT_BILLED: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAmountBilled() { return doColumn("AMOUNT_BILLED"); }
        /**
         * TOTAL_AMOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalAmount() { return doColumn("TOTAL_AMOUNT"); }
        /**
         * COMBINE_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineId() { return doColumn("COMBINE_ID"); }
        /**
         * COMBINE_STATUS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineStatus() { return doColumn("COMBINE_STATUS"); }
        /**
         * COMBINE_TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineTotal() { return doColumn("COMBINE_TOTAL"); }
        /**
         * COMBINE_CARRIAGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineCarriage() { return doColumn("COMBINE_CARRIAGE"); }
        /**
         * COMBINE_COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineCod() { return doColumn("COMBINE_COD"); }
        /**
         * COMBINE_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineTax() { return doColumn("COMBINE_TAX"); }
        /**
         * COMBINE_BILLED: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineBilled() { return doColumn("COMBINE_BILLED"); }
        /**
         * COMBINE_AMOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineAmount() { return doColumn("COMBINE_AMOUNT"); }
        /**
         * COMBINE_BANK_FEE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineBankFee() { return doColumn("COMBINE_BANK_FEE"); }
        /**
         * COMBINE_POINT_USE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombinePointUse() { return doColumn("COMBINE_POINT_USE"); }
        /**
         * MAIL_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMailFlg() { return doColumn("MAIL_FLG"); }
        /**
         * ORDER_DT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderDt() { return doColumn("ORDER_DT"); }
        /**
         * ORDER_TIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTime() { return doColumn("ORDER_TIME"); }
        /**
         * MOBILE_PAYMENT_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMobilePaymentNo() { return doColumn("MOBILE_PAYMENT_NO"); }
        /**
         * HISTORY_MOD_FLG: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHistoryModFlg() { return doColumn("HISTORY_MOD_FLG"); }
        /**
         * HISTORY_ICON_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHistoryIconFlg() { return doColumn("HISTORY_ICON_FLG"); }
        /**
         * HISTORY_MAIL_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHistoryMailFlg() { return doColumn("HISTORY_MAIL_FLG"); }
        /**
         * DELIV_MATCH_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivMatchFlg() { return doColumn("DELIV_MATCH_FLG"); }
        /**
         * POINT_USE_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointUseFlg() { return doColumn("POINT_USE_FLG"); }
        /**
         * ORDER_ZIP_CD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderZipCd1() { return doColumn("ORDER_ZIP_CD1"); }
        /**
         * ORDER_ZIP_CD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderZipCd2() { return doColumn("ORDER_ZIP_CD2"); }
        /**
         * ORDER_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderAddress1() { return doColumn("ORDER_ADDRESS1"); }
        /**
         * ORDER_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderAddress2() { return doColumn("ORDER_ADDRESS2"); }
        /**
         * ORDER_ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderAddress3() { return doColumn("ORDER_ADDRESS3"); }
        /**
         * ORDER_CUSTOMER_NM1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderCustomerNm1() { return doColumn("ORDER_CUSTOMER_NM1"); }
        /**
         * ORDER_CUSTOMER_NM2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderCustomerNm2() { return doColumn("ORDER_CUSTOMER_NM2"); }
        /**
         * ORDER_CUSTOMER_KN1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderCustomerKn1() { return doColumn("ORDER_CUSTOMER_KN1"); }
        /**
         * ORDER_CUSTOMER_KN2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderCustomerKn2() { return doColumn("ORDER_CUSTOMER_KN2"); }
        /**
         * ORDER_TEL_NO1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTelNo1() { return doColumn("ORDER_TEL_NO1"); }
        /**
         * ORDER_TEL_NO2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTelNo2() { return doColumn("ORDER_TEL_NO2"); }
        /**
         * ORDER_TEL_NO3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTelNo3() { return doColumn("ORDER_TEL_NO3"); }
        /**
         * MAIL_ADDRESS: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMailAddress() { return doColumn("MAIL_ADDRESS"); }
        /**
         * ORDER_SEX: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderSex() { return doColumn("ORDER_SEX"); }
        /**
         * ORDER_BIRTHDAY: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderBirthday() { return doColumn("ORDER_BIRTHDAY"); }
        /**
         * PAYMENT_METHOD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentMethod() { return doColumn("PAYMENT_METHOD"); }
        /**
         * CARD_TYPE: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardType() { return doColumn("CARD_TYPE"); }
        /**
         * CARD_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardNo() { return doColumn("CARD_NO"); }
        /**
         * CARD_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardNm() { return doColumn("CARD_NM"); }
        /**
         * CARD_AVAILABLE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardAvailable() { return doColumn("CARD_AVAILABLE"); }
        /**
         * CARD_INST: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardInst() { return doColumn("CARD_INST"); }
        /**
         * CARD_INST_COMMENT: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardInstComment() { return doColumn("CARD_INST_COMMENT"); }
        /**
         * DELIV_METHOD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivMethod() { return doColumn("DELIV_METHOD"); }
        /**
         * DELIV_TYPE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivType() { return doColumn("DELIV_TYPE"); }
        /**
         * POINT_USE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointUse() { return doColumn("POINT_USE"); }
        /**
         * POINT_CONDITION: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointCondition() { return doColumn("POINT_CONDITION"); }
        /**
         * POINT_STATUS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointStatus() { return doColumn("POINT_STATUS"); }
        /**
         * BANK_STATUS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBankStatus() { return doColumn("BANK_STATUS"); }
        /**
         * BANK_FEE_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBankFeeFlg() { return doColumn("BANK_FEE_FLG"); }
        /**
         * BANK_FEE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBankFee() { return doColumn("BANK_FEE"); }
        /**
         * WRAPPING_TITLE_P: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingTitleP() { return doColumn("WRAPPING_TITLE_P"); }
        /**
         * WRAPPING_NM_P: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingNmP() { return doColumn("WRAPPING_NM_P"); }
        /**
         * WRAPPING_FEE_P: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingFeeP() { return doColumn("WRAPPING_FEE_P"); }
        /**
         * WRAPPING_TAX_P: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingTaxP() { return doColumn("WRAPPING_TAX_P"); }
        /**
         * WRAPPING_TITLE_R: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingTitleR() { return doColumn("WRAPPING_TITLE_R"); }
        /**
         * WRAPPING_NM_R: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingNmR() { return doColumn("WRAPPING_NM_R"); }
        /**
         * WRAPPING_FEE_R: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingFeeR() { return doColumn("WRAPPING_FEE_R"); }
        /**
         * WRAPPING_TAX_R: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingTaxR() { return doColumn("WRAPPING_TAX_R"); }
        /**
         * DELIV_CARRIAGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCarriage() { return doColumn("DELIV_CARRIAGE"); }
        /**
         * DELIV_COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCod() { return doColumn("DELIV_COD"); }
        /**
         * DELIV_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTax() { return doColumn("DELIV_TAX"); }
        /**
         * CARRIER_TRACE_NUM: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierTraceNum() { return doColumn("CARRIER_TRACE_NUM"); }
        /**
         * DELIV_TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTotal() { return doColumn("DELIV_TOTAL"); }
        /**
         * NOSHI: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoshi() { return doColumn("NOSHI"); }
        /**
         * DELIV_ZIP_CD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivZipCd1() { return doColumn("DELIV_ZIP_CD1"); }
        /**
         * DELIV_ZIP_CD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivZipCd2() { return doColumn("DELIV_ZIP_CD2"); }
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
         * DELIV_CUSTOMER_NM1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerNm1() { return doColumn("DELIV_CUSTOMER_NM1"); }
        /**
         * DELIV_CUSTOMER_NM2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerNm2() { return doColumn("DELIV_CUSTOMER_NM2"); }
        /**
         * DELIV_CUSTOMER_KN1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerKn1() { return doColumn("DELIV_CUSTOMER_KN1"); }
        /**
         * DELIV_CUSTOMER_KN2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerKn2() { return doColumn("DELIV_CUSTOMER_KN2"); }
        /**
         * DELIV_TEL_NO1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTelNo1() { return doColumn("DELIV_TEL_NO1"); }
        /**
         * DELIV_TEL_NO2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTelNo2() { return doColumn("DELIV_TEL_NO2"); }
        /**
         * DELIV_TEL_NO3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTelNo3() { return doColumn("DELIV_TEL_NO3"); }
        /**
         * PRODUCT_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * PRODUCT_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductNm() { return doColumn("PRODUCT_NM"); }
        /**
         * PRODUCT_NO: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductNo() { return doColumn("PRODUCT_NO"); }
        /**
         * PRODUCT_URL: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductUrl() { return doColumn("PRODUCT_URL"); }
        /**
         * UNIT_PRICE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitPrice() { return doColumn("UNIT_PRICE"); }
        /**
         * ORDER_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderNum() { return doColumn("ORDER_NUM"); }
        /**
         * PRODUCT_CARRIAGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCarriage() { return doColumn("PRODUCT_CARRIAGE"); }
        /**
         * PRODUCT_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductTax() { return doColumn("PRODUCT_TAX"); }
        /**
         * PRODUCT_COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCod() { return doColumn("PRODUCT_COD"); }
        /**
         * ITEM_CHOICE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemChoice() { return doColumn("ITEM_CHOICE"); }
        /**
         * POINT_SCALE: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointScale() { return doColumn("POINT_SCALE"); }
        /**
         * POINT_TYPE: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointType() { return doColumn("POINT_TYPE"); }
        /**
         * RECORD_NUMBER: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRecordNumber() { return doColumn("RECORD_NUMBER"); }
        /**
         * DELIVERY_INFO: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryInfo() { return doColumn("DELIVERY_INFO"); }
        /**
         * STOCK_TYPE: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockType() { return doColumn("STOCK_TYPE"); }
        /**
         * WRAPPING_TYPE_P: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingTypeP() { return doColumn("WRAPPING_TYPE_P"); }
        /**
         * WRAPPING_TYPE_R: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWrappingTypeR() { return doColumn("WRAPPING_TYPE_R"); }
        /**
         * TOMORROW_FLG: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTomorrowFlg() { return doColumn("TOMORROW_FLG"); }
        /**
         * COUPON_USE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCouponUse() { return doColumn("COUPON_USE"); }
        /**
         * SHOP_COUPON_USE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShopCouponUse() { return doColumn("SHOP_COUPON_USE"); }
        /**
         * RAKUTEN_COUPON_USE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRakutenCouponUse() { return doColumn("RAKUTEN_COUPON_USE"); }
        /**
         * COMBINE_COUPON_USE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCombineCouponUse() { return doColumn("COMBINE_COUPON_USE"); }
        /**
         * DELIV_COMPANY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCompany() { return doColumn("DELIV_COMPANY"); }
        /**
         * PHAMACE_FLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPhamaceFlg() { return doColumn("PHAMACE_FLG"); }
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
            columnRakutenOrderId(); // PK
            if (qyCall().qy().hasConditionQueryTEcOrderB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TEcOrderBCQ) {
                columnEcOrderBId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_RAKUTEN_ORDER"; }
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
        public HpSDRFunction<TRakutenOrderCB, TRakutenOrderCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TRakutenOrderCB> sq, TRakutenOrderCQ cq, String al, DerivedReferrerOption op)
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
    public TRakutenOrderCB dreamCruiseCB() {
        TRakutenOrderCB cb = new TRakutenOrderCB();
        cb.xsetupForDreamCruise((TRakutenOrderCB) this);
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
    public HpColQyOperand<TRakutenOrderCB> columnQuery(final SpecifyQuery<TRakutenOrderCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TRakutenOrderCB xcreateColumnQueryCB() {
        TRakutenOrderCB cb = new TRakutenOrderCB();
        cb.xsetupForColumnQuery((TRakutenOrderCB)this);
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
    public void orScopeQuery(OrQuery<TRakutenOrderCB> orCBLambda) {
        xorSQ((TRakutenOrderCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TRakutenOrderCB> andCBLambda) {
        xorSQAP((TRakutenOrderCB)this, andCBLambda);
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
        final TRakutenOrderCB cb;
        if (mainCB != null) {
            cb = (TRakutenOrderCB)mainCB;
        } else {
            cb = new TRakutenOrderCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TRakutenOrderCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TRakutenOrderCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
