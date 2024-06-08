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
 * The base condition-bean of T_TRTRACE.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrtraceCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrtraceCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrtraceCB() {
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
        return "T_TRTRACE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param trtraceId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TTrtraceCB acceptPK(Long trtraceId) {
        assertObjectNotNull("trtraceId", trtraceId);
        BsTTrtraceCB cb = this;
        cb.query().setTrtraceId_Equal(trtraceId);
        return (TTrtraceCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param trtraceId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long trtraceId) {
        assertObjectNotNull("trtraceId", trtraceId);
        BsTTrtraceCB cb = this;
        cb.query().setTrtraceId_Equal(trtraceId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TrtraceId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TrtraceId_Desc();
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
    public TTrtraceCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TTrtraceCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TTrtraceCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TTrtraceCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TTrtraceCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TTrtraceCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TTrtraceCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TTrtraceCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TTrtraceCB> unionCBLambda) {
        final TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TTrtraceCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TTrtraceCB> unionCBLambda) {
        final TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TTrtraceCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MCenterNss _nssMCenter;
    public MCenterNss xdfgetNssMCenter() {
        if (_nssMCenter == null) { _nssMCenter = new MCenterNss(null); }
        return _nssMCenter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * <pre>
     * <span style="color: #0000C0">tTrtraceBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tTrtrace</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tTrtrace</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tTrtraceBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tTrtrace</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tTrtrace</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<TTrtraceCQ> {
        protected MCenterCB.HpSpecification _mCenter;
        protected MClientCB.HpSpecification _mClient;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TTrtraceCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrtraceId() { return doColumn("TRTRACE_ID"); }
        /**
         * TRACEKEY: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTracekey() { return doColumn("TRACEKEY"); }
        /**
         * SNDRCVDATETIME: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSndrcvdatetime() { return doColumn("SNDRCVDATETIME"); }
        /**
         * WAREHOUSECD: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehousecd() { return doColumn("WAREHOUSECD"); }
        /**
         * FACTORYCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFactorycd() { return doColumn("FACTORYCD"); }
        /**
         * ITEMCD_CASE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemcdCase() { return doColumn("ITEMCD_CASE"); }
        /**
         * SKUCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSkucd() { return doColumn("SKUCD"); }
        /**
         * DESTINATIONCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationcd() { return doColumn("DESTINATIONCD"); }
        /**
         * MANUFACTURECD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnManufacturecd() { return doColumn("MANUFACTURECD"); }
        /**
         * ORDERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderno() { return doColumn("ORDERNO"); }
        /**
         * MACHINENO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMachineno() { return doColumn("MACHINENO"); }
        /**
         * CREATENO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreateno() { return doColumn("CREATENO"); }
        /**
         * LIMITDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitdate() { return doColumn("LIMITDATE"); }
        /**
         * DATETIME: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDatetime() { return doColumn("DATETIME"); }
        /**
         * DISTRIBUTIONCD: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDistributioncd() { return doColumn("DISTRIBUTIONCD"); }
        /**
         * TRANSPORTCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTransportcd() { return doColumn("TRANSPORTCD"); }
        /**
         * PALLETID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPalletid() { return doColumn("PALLETID"); }
        /**
         * INITNUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInitnum() { return doColumn("INITNUM"); }
        /**
         * CREATEDATETIME: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreatedatetime() { return doColumn("CREATEDATETIME"); }
        /**
         * ASSORTDATETIME: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortdatetime() { return doColumn("ASSORTDATETIME"); }
        /**
         * TRACETYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTracetype() { return doColumn("TRACETYPE"); }
        /**
         * LINEBLOCK: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLineblock() { return doColumn("LINEBLOCK"); }
        /**
         * ASSORTEDUNIT: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortedunit() { return doColumn("ASSORTEDUNIT"); }
        /**
         * ASSORTEDINDEX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortedindex() { return doColumn("ASSORTEDINDEX"); }
        /**
         * OPERATIONCODE: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOperationcode() { return doColumn("OPERATIONCODE"); }
        /**
         * CASEINNUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseinnum() { return doColumn("CASEINNUM"); }
        /**
         * ASSORTNUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortnum() { return doColumn("ASSORTNUM"); }
        /**
         * ASSORTDIFNUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortdifnum() { return doColumn("ASSORTDIFNUM"); }
        /**
         * DIRECTIONCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectioncd() { return doColumn("DIRECTIONCD"); }
        /**
         * PISTONTYPE: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPistontype() { return doColumn("PISTONTYPE"); }
        /**
         * CUSTOMERCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomercd() { return doColumn("CUSTOMERCD"); }
        /**
         * DIRECTIONNUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectionnum() { return doColumn("DIRECTIONNUM"); }
        /**
         * DISTWAREHOUSECD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDistwarehousecd() { return doColumn("DISTWAREHOUSECD"); }
        /**
         * RCVKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvkey() { return doColumn("RCVKEY"); }
        /**
         * PRODUCT_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * ITEMCD_IN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemcdIn() { return doColumn("ITEMCD_IN"); }
        /**
         * ITEMCD_WH: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemcdWh() { return doColumn("ITEMCD_WH"); }
        /**
         * DESIGNCD_CASE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDesigncdCase() { return doColumn("DESIGNCD_CASE"); }
        /**
         * DESIGNCD_IN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDesigncdIn() { return doColumn("DESIGNCD_IN"); }
        /**
         * DESIGNCD_WH: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDesigncdWh() { return doColumn("DESIGNCD_WH"); }
        /**
         * SOURCECASECD: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSourcecasecd() { return doColumn("SOURCECASECD"); }
        /**
         * SENDFLG: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendflg() { return doColumn("SENDFLG"); }
        /**
         * FROMFLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFromflg() { return doColumn("FROMFLG"); }
        /**
         * SUPPLIERRCVNO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierrcvno() { return doColumn("SUPPLIERRCVNO"); }
        /**
         * MIXEDFLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMixedflg() { return doColumn("MIXEDFLG"); }
        /**
         * SYMBOLPASTDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolpastdate() { return doColumn("SYMBOLPASTDATE"); }
        /**
         * LOT1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot1() { return doColumn("LOT1"); }
        /**
         * LOT2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot2() { return doColumn("LOT2"); }
        /**
         * LOT3: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot3() { return doColumn("LOT3"); }
        /**
         * LOT4: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot4() { return doColumn("LOT4"); }
        /**
         * OTHERLOT1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot1() { return doColumn("OTHERLOT1"); }
        /**
         * MAKERCASENO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMakercaseno() { return doColumn("MAKERCASENO"); }
        /**
         * LENDFLG: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLendflg() { return doColumn("LENDFLG"); }
        /**
         * CASEINNUMCALC: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseinnumcalc() { return doColumn("CASEINNUMCALC"); }
        /**
         * CASEITFNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseitfno() { return doColumn("CASEITFNO"); }
        /**
         * CASEBARCODEVALIANT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasebarcodevaliant() { return doColumn("CASEBARCODEVALIANT"); }
        /**
         * CASELOT4: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaselot4() { return doColumn("CASELOT4"); }
        /**
         * CASECENTERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasecenterno() { return doColumn("CASECENTERNO"); }
        /**
         * CASEPACKNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasepackno() { return doColumn("CASEPACKNO"); }
        /**
         * CASEPACKTIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasepacktime() { return doColumn("CASEPACKTIME"); }
        /**
         * CASEBARCODE: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasebarcode() { return doColumn("CASEBARCODE"); }
        /**
         * OTHERREFNO2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherrefno2() { return doColumn("OTHERREFNO2"); }
        /**
         * ORDERTYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrdertype() { return doColumn("ORDERTYPE"); }
        /**
         * LIMITDATENOW: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitdatenow() { return doColumn("LIMITDATENOW"); }
        /**
         * CASECREATETYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasecreatetype() { return doColumn("CASECREATETYPE"); }
        /**
         * RECEIVEDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivedate() { return doColumn("RECEIVEDATE"); }
        /**
         * ARRIVALPORTDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnArrivalportdate() { return doColumn("ARRIVALPORTDATE"); }
        /**
         * SHIPNAME: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipname() { return doColumn("SHIPNAME"); }
        /**
         * LOCGROUP: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocgroup() { return doColumn("LOCGROUP"); }
        /**
         * LOCCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLoccd() { return doColumn("LOCCD"); }
        /**
         * SHIPDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipdate() { return doColumn("SHIPDATE"); }
        /**
         * SHIPTOCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShiptocd() { return doColumn("SHIPTOCD"); }
        /**
         * EXAMSTS: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExamsts() { return doColumn("EXAMSTS"); }
        /**
         * TOKUHANCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTokuhancd() { return doColumn("TOKUHANCD"); }
        /**
         * SENDER_LOCATION: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSenderLocation() { return doColumn("SENDER_LOCATION"); }
        /**
         * RECEIVER_LOCATION: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiverLocation() { return doColumn("RECEIVER_LOCATION"); }
        /**
         * SHIPMENT_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipmentId() { return doColumn("SHIPMENT_ID"); }
        /**
         * SHIPMENT_DATE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipmentDate() { return doColumn("SHIPMENT_DATE"); }
        /**
         * NUMBER_OF_PALLETS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNumberOfPallets() { return doColumn("NUMBER_OF_PALLETS"); }
        /**
         * CARRIERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierno() { return doColumn("CARRIERNO"); }
        /**
         * TKHNORDERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTkhnorderno() { return doColumn("TKHNORDERNO"); }
        /**
         * SRCCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSrccd() { return doColumn("SRCCD"); }
        /**
         * BLNO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBlno() { return doColumn("BLNO"); }
        /**
         * INVOICENO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceno() { return doColumn("INVOICENO"); }
        /**
         * SSCC: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSscc() { return doColumn("SSCC"); }
        /**
         * CASENO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseno() { return doColumn("CASENO"); }
        /**
         * INV_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvNum() { return doColumn("INV_NUM"); }
        /**
         * SORT_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSortNum() { return doColumn("SORT_NUM"); }
        /**
         * ADOPT_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdoptNum() { return doColumn("ADOPT_NUM"); }
        /**
         * RESERVEAREA: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReservearea() { return doColumn("RESERVEAREA"); }
        /**
         * VA_EXTDATA1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVaExtdata1() { return doColumn("VA_EXTDATA1"); }
        /**
         * VA_EXTDATA2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVaExtdata2() { return doColumn("VA_EXTDATA2"); }
        /**
         * VA_EXTDATA3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVaExtdata3() { return doColumn("VA_EXTDATA3"); }
        /**
         * DT_EXTDATA2: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDtExtdata2() { return doColumn("DT_EXTDATA2"); }
        /**
         * PALLET_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPalletNo() { return doColumn("PALLET_NO"); }
        /**
         * PICK_LIST_KEY: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickListKey() { return doColumn("PICK_LIST_KEY"); }
        /**
         * FRONT_BACK_CASE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFrontBackCaseCd() { return doColumn("FRONT_BACK_CASE_CD"); }
        /**
         * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * TRANSPORT_PRIORITY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTransportPriority() { return doColumn("TRANSPORT_PRIORITY"); }
        /**
         * USE_TYPE: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseType() { return doColumn("USE_TYPE"); }
        /**
         * OUTPUT_ORDER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOutputOrder() { return doColumn("OUTPUT_ORDER"); }
        /**
         * FACTORY_ORDER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFactoryOrder() { return doColumn("FACTORY_ORDER"); }
        /**
         * WAREHOUSE_ORDER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseOrder() { return doColumn("WAREHOUSE_ORDER"); }
        /**
         * LINEBLOCK_ORDER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLineblockOrder() { return doColumn("LINEBLOCK_ORDER"); }
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
            columnTrtraceId(); // PK
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_TRTRACE"; }
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
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TTrtraceCB, TTrtraceCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrtraceCB> sq, TTrtraceCQ cq, String al, DerivedReferrerOption op)
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
    public TTrtraceCB dreamCruiseCB() {
        TTrtraceCB cb = new TTrtraceCB();
        cb.xsetupForDreamCruise((TTrtraceCB) this);
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
    public HpColQyOperand<TTrtraceCB> columnQuery(final SpecifyQuery<TTrtraceCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TTrtraceCB xcreateColumnQueryCB() {
        TTrtraceCB cb = new TTrtraceCB();
        cb.xsetupForColumnQuery((TTrtraceCB)this);
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
    public void orScopeQuery(OrQuery<TTrtraceCB> orCBLambda) {
        xorSQ((TTrtraceCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TTrtraceCB> andCBLambda) {
        xorSQAP((TTrtraceCB)this, andCBLambda);
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
        final TTrtraceCB cb;
        if (mainCB != null) {
            cb = (TTrtraceCB)mainCB;
        } else {
            cb = new TTrtraceCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TTrtraceCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TTrtraceCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
