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
 * The base condition-bean of H_RECEIVE_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsHReceiveBCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HReceiveBCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHReceiveBCB() {
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
        return "H_RECEIVE_B";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param storeRecordBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public HReceiveBCB acceptPK(Long storeRecordBId) {
        assertObjectNotNull("storeRecordBId", storeRecordBId);
        BsHReceiveBCB cb = this;
        cb.query().setStoreRecordBId_Equal(storeRecordBId);
        return (HReceiveBCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param storeRecordBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long storeRecordBId) {
        assertObjectNotNull("storeRecordBId", storeRecordBId);
        BsHReceiveBCB cb = this;
        cb.query().setStoreRecordBId_Equal(storeRecordBId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StoreRecordBId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StoreRecordBId_Desc();
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
    public HReceiveBCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public HReceiveBCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected HReceiveBCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected HReceiveBCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected HReceiveBCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        HReceiveBCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected HReceiveBCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new HReceiveBCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<HReceiveBCB> unionCBLambda) {
        final HReceiveBCB cb = new HReceiveBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final HReceiveBCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<HReceiveBCB> unionCBLambda) {
        final HReceiveBCB cb = new HReceiveBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final HReceiveBCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected HStockNss _nssHStock;
    public HStockNss xdfgetNssHStock() {
        if (_nssHStock == null) { _nssHStock = new HStockNss(null); }
        return _nssHStock;
    }
    /**
     * Set up relation columns to select clause. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * <pre>
     * <span style="color: #0000C0">hReceiveBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_HStock()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hReceiveB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hReceiveB</span>.<span style="color: #CC4747">getHStock()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public HStockNss setupSelect_HStock() {
        assertSetupSelectPurpose("hStock");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockId();
        }
        doSetupSelect(() -> query().queryHStock());
        if (_nssHStock == null || !_nssHStock.hasConditionQuery())
        { _nssHStock = new HStockNss(query().queryHStock()); }
        return _nssHStock;
    }

    protected HReceiveHNss _nssHReceiveH;
    public HReceiveHNss xdfgetNssHReceiveH() {
        if (_nssHReceiveH == null) { _nssHReceiveH = new HReceiveHNss(null); }
        return _nssHReceiveH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * <pre>
     * <span style="color: #0000C0">hReceiveBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_HReceiveH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hReceiveB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hReceiveB</span>.<span style="color: #CC4747">getHReceiveH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public HReceiveHNss setupSelect_HReceiveH() {
        assertSetupSelectPurpose("hReceiveH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreRecordHId();
        }
        doSetupSelect(() -> query().queryHReceiveH());
        if (_nssHReceiveH == null || !_nssHReceiveH.hasConditionQuery())
        { _nssHReceiveH = new HReceiveHNss(query().queryHReceiveH()); }
        return _nssHReceiveH;
    }

    protected BClassDtlNss _nssBClassDtlByStoreFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStoreFlg() {
        if (_nssBClassDtlByStoreFlg == null) { _nssBClassDtlByStoreFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStoreFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * <pre>
     * <span style="color: #0000C0">hReceiveBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStoreFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hReceiveB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hReceiveB</span>.<span style="color: #CC4747">getBClassDtlByStoreFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStoreFlg() {
        assertSetupSelectPurpose("bClassDtlByStoreFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStoreFlg());
        if (_nssBClassDtlByStoreFlg == null || !_nssBClassDtlByStoreFlg.hasConditionQuery())
        { _nssBClassDtlByStoreFlg = new BClassDtlNss(query().queryBClassDtlByStoreFlg()); }
        return _nssBClassDtlByStoreFlg;
    }

    protected HReceiveSpareNss _nssHReceiveSpareAsOne;
    public HReceiveSpareNss xdfgetNssHReceiveSpareAsOne() {
        if (_nssHReceiveSpareAsOne == null) { _nssHReceiveSpareAsOne = new HReceiveSpareNss(null); }
        return _nssHReceiveSpareAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * <pre>
     * <span style="color: #0000C0">hReceiveBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_HReceiveSpareAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hReceiveB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hReceiveB</span>.<span style="color: #CC4747">getHReceiveSpareAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public HReceiveSpareNss setupSelect_HReceiveSpareAsOne() {
        assertSetupSelectPurpose("hReceiveSpareAsOne");
        doSetupSelect(() -> query().queryHReceiveSpareAsOne());
        if (_nssHReceiveSpareAsOne == null || !_nssHReceiveSpareAsOne.hasConditionQuery())
        { _nssHReceiveSpareAsOne = new HReceiveSpareNss(query().queryHReceiveSpareAsOne()); }
        return _nssHReceiveSpareAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<HReceiveBCQ> {
        protected HStockCB.HpSpecification _hStock;
        protected HReceiveHCB.HpSpecification _hReceiveH;
        protected BClassDtlCB.HpSpecification _bClassDtlByStoreFlg;
        protected HReceiveSpareCB.HpSpecification _hReceiveSpareAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<HReceiveBCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordBId() { return doColumn("STORE_RECORD_B_ID"); }
        /**
         * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordHId() { return doColumn("STORE_RECORD_H_ID"); }
        /**
         * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockId() { return doColumn("STOCK_ID"); }
        /**
         * PLAN_NUM: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlanNum() { return doColumn("PLAN_NUM"); }
        /**
         * PROCESS_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessNo() { return doColumn("PROCESS_NO"); }
        /**
         * STORE_DT: {IX, varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDt() { return doColumn("STORE_DT"); }
        /**
         * STORE_NUM: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreNum() { return doColumn("STORE_NUM"); }
        /**
         * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreFlg() { return doColumn("STORE_FLG"); }
        /**
         * STORE_LOCATION_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLocationId() { return doColumn("STORE_LOCATION_ID"); }
        /**
         * STORE_LOCATION_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLocationCd() { return doColumn("STORE_LOCATION_CD"); }
        /**
         * STORE_LOCATION_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLocationNm() { return doColumn("STORE_LOCATION_NM"); }
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
            columnStoreRecordBId(); // PK
            if (qyCall().qy().hasConditionQueryHStock()
                    || qyCall().qy().xgetReferrerQuery() instanceof HStockCQ) {
                columnStockId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryHReceiveH()
                    || qyCall().qy().xgetReferrerQuery() instanceof HReceiveHCQ) {
                columnStoreRecordHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStoreFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStoreFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "H_RECEIVE_B"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * H_STOCK by my STOCK_ID, named 'HStock'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public HStockCB.HpSpecification specifyHStock() {
            assertRelation("hStock");
            if (_hStock == null) {
                _hStock = new HStockCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryHStock()
                                    , () -> _qyCall.qy().queryHStock())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _hStock.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryHStock()
                      , () -> xsyncQyCall().qy().queryHStock()));
                }
            }
            return _hStock;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public HReceiveHCB.HpSpecification specifyHReceiveH() {
            assertRelation("hReceiveH");
            if (_hReceiveH == null) {
                _hReceiveH = new HReceiveHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryHReceiveH()
                                    , () -> _qyCall.qy().queryHReceiveH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _hReceiveH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryHReceiveH()
                      , () -> xsyncQyCall().qy().queryHReceiveH()));
                }
            }
            return _hReceiveH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStoreFlg() {
            assertRelation("bClassDtlByStoreFlg");
            if (_bClassDtlByStoreFlg == null) {
                _bClassDtlByStoreFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStoreFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStoreFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStoreFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStoreFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStoreFlg()));
                }
            }
            return _bClassDtlByStoreFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public HReceiveSpareCB.HpSpecification specifyHReceiveSpareAsOne() {
            assertRelation("hReceiveSpareAsOne");
            if (_hReceiveSpareAsOne == null) {
                _hReceiveSpareAsOne = new HReceiveSpareCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryHReceiveSpareAsOne()
                                    , () -> _qyCall.qy().queryHReceiveSpareAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _hReceiveSpareAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryHReceiveSpareAsOne()
                      , () -> xsyncQyCall().qy().queryHReceiveSpareAsOne()));
                }
            }
            return _hReceiveSpareAsOne;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<HReceiveBCB, HReceiveBCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<HReceiveBCB> sq, HReceiveBCQ cq, String al, DerivedReferrerOption op)
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
    public HReceiveBCB dreamCruiseCB() {
        HReceiveBCB cb = new HReceiveBCB();
        cb.xsetupForDreamCruise((HReceiveBCB) this);
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
    public HpColQyOperand<HReceiveBCB> columnQuery(final SpecifyQuery<HReceiveBCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected HReceiveBCB xcreateColumnQueryCB() {
        HReceiveBCB cb = new HReceiveBCB();
        cb.xsetupForColumnQuery((HReceiveBCB)this);
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
    public void orScopeQuery(OrQuery<HReceiveBCB> orCBLambda) {
        xorSQ((HReceiveBCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<HReceiveBCB> andCBLambda) {
        xorSQAP((HReceiveBCB)this, andCBLambda);
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
        final HReceiveBCB cb;
        if (mainCB != null) {
            cb = (HReceiveBCB)mainCB;
        } else {
            cb = new HReceiveBCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return HReceiveBCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return HReceiveBCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
