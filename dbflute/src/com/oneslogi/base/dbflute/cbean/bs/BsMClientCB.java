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
 * The base condition-bean of M_CLIENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMClientCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MClientCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMClientCB() {
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
        return "M_CLIENT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param clientId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MClientCB acceptPK(Long clientId) {
        assertObjectNotNull("clientId", clientId);
        BsMClientCB cb = this;
        cb.query().setClientId_Equal(clientId);
        return (MClientCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param clientId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long clientId) {
        assertObjectNotNull("clientId", clientId);
        BsMClientCB cb = this;
        cb.query().setClientId_Equal(clientId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param clientCd : UQ, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MClientCB acceptUniqueOf(String clientCd) {
        assertObjectNotNull("clientCd", clientCd);
        BsMClientCB cb = this;
        cb.query().setClientCd_Equal(clientCd);
        return (MClientCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ClientId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ClientId_Desc();
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
    public MClientCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MClientCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MClientCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MClientCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MClientCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MClientCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MClientCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MClientCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MClientCB> unionCBLambda) {
        final MClientCB cb = new MClientCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MClientCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MClientCB> unionCBLambda) {
        final MClientCB cb = new MClientCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MClientCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MShapeGrpNss _nssMShapeGrp;
    public MShapeGrpNss xdfgetNssMShapeGrp() {
        if (_nssMShapeGrp == null) { _nssMShapeGrp = new MShapeGrpNss(null); }
        return _nssMShapeGrp;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShapeGrp()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mClient</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMShapeGrp()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MShapeGrpNss setupSelect_MShapeGrp() {
        assertSetupSelectPurpose("mShapeGrp");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShapeGrpId();
        }
        doSetupSelect(() -> query().queryMShapeGrp());
        if (_nssMShapeGrp == null || !_nssMShapeGrp.hasConditionQuery())
        { _nssMShapeGrp = new MShapeGrpNss(query().queryMShapeGrp()); }
        return _nssMShapeGrp;
    }

    protected MCustomerNss _nssMCustomer;
    public MCustomerNss xdfgetNssMCustomer() {
        if (_nssMCustomer == null) { _nssMCustomer = new MCustomerNss(null); }
        return _nssMCustomer;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mClient</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMCustomer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomer() {
        assertSetupSelectPurpose("mCustomer");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCustomerId();
        }
        doSetupSelect(() -> query().queryMCustomer());
        if (_nssMCustomer == null || !_nssMCustomer.hasConditionQuery())
        { _nssMCustomer = new MCustomerNss(query().queryMCustomer()); }
        return _nssMCustomer;
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
     * <span style="color: #0000C0">mClientBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mClient</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<MClientCQ> {
        protected MShapeGrpCB.HpSpecification _mShapeGrp;
        protected MCustomerCB.HpSpecification _mCustomer;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MClientCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * CLIENT_CD: {UQ, NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientCd() { return doColumn("CLIENT_CD"); }
        /**
         * CLIENT_NM: {NotNull, varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientNm() { return doColumn("CLIENT_NM"); }
        /**
         * CLIENT_ABBR: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientAbbr() { return doColumn("CLIENT_ABBR"); }
        /**
         * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerId() { return doColumn("CUSTOMER_ID"); }
        /**
         * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeGrpId() { return doColumn("SHAPE_GRP_ID"); }
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
            columnClientId(); // PK
            if (qyCall().qy().hasConditionQueryMShapeGrp()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpCQ) {
                columnShapeGrpId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomer()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnCustomerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_CLIENT"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MShapeGrpCB.HpSpecification specifyMShapeGrp() {
            assertRelation("mShapeGrp");
            if (_mShapeGrp == null) {
                _mShapeGrp = new MShapeGrpCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMShapeGrp()
                                    , () -> _qyCall.qy().queryMShapeGrp())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mShapeGrp.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMShapeGrp()
                      , () -> xsyncQyCall().qy().queryMShapeGrp()));
                }
            }
            return _mShapeGrp;
        }
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
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CBRCTG where ...) as FOO_MAX} <br>
         * M_CBRCTG by CLIENT_ID, named 'MCbrctgList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cbrctgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cbrctgCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cbrctgCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCbrctg.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCbrctgCB, MClientCQ> derivedMCbrctgList() {
            assertDerived("mCbrctgList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCbrctgCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCbrctgList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CDRCATT where ...) as FOO_MAX} <br>
         * M_CDRCATT by CLIENT_ID, named 'MCdrcattList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cdrcattCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cdrcattCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cdrcattCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCdrcatt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCdrcattCB, MClientCQ> derivedMCdrcattList() {
            assertDerived("mCdrcattList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCdrcattCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCdrcattList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIENT_CENTER where ...) as FOO_MAX} <br>
         * M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     centerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     centerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientCenter.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientCenterCB, MClientCQ> derivedMClientCenterList() {
            assertDerived("mClientCenterList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientCenterCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientCenterList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIENT_COL where ...) as FOO_MAX} <br>
         * M_CLIENT_COL by CLIENT_ID, named 'MClientColList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     colCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     colCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientCol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientColCB, MClientCQ> derivedMClientColList() {
            assertDerived("mClientColList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientColCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientColList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIENT_ITEM where ...) as FOO_MAX} <br>
         * M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     itemCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     itemCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientItem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientItemCB, MClientCQ> derivedMClientItemList() {
            assertDerived("mClientItemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientItemCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientItemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIENT_SCREEN where ...) as FOO_MAX} <br>
         * M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     screenCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     screenCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientScreen.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientScreenCB, MClientCQ> derivedMClientScreenList() {
            assertDerived("mClientScreenList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientScreenCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientScreenList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CUSTOMER where ...) as FOO_MAX} <br>
         * M_CUSTOMER by CLIENT_ID, named 'MCustomerList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     customerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     customerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCustomer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCustomerCB, MClientCQ> derivedMCustomerList() {
            assertDerived("mCustomerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCustomerCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCustomerList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_IMPORT_TYPE where ...) as FOO_MAX} <br>
         * M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     typeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     typeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MImportType.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MImportTypeCB, MClientCQ> derivedMImportTypeList() {
            assertDerived("mImportTypeList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MImportTypeCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMImportTypeList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFINVOPERATION where ...) as FOO_MAX} <br>
         * M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfinvoperationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfinvoperationCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfinvoperationCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfinvoperation.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfinvoperationCB, MClientCQ> derivedMMfinvoperationList() {
            assertDerived("mMfinvoperationList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfinvoperationCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfinvoperationList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFMONTHCHG where ...) as FOO_MAX} <br>
         * M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfmonthchgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfmonthchgCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfmonthchgCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfmonthchg.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfmonthchgCB, MClientCQ> derivedMMfmonthchgList() {
            assertDerived("mMfmonthchgList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfmonthchgCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfmonthchgList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFPICKCTL where ...) as FOO_MAX} <br>
         * M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfpickctlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfpickctlCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfpickctlCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfpickctl.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfpickctlCB, MClientCQ> derivedMMfpickctlList() {
            assertDerived("mMfpickctlList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfpickctlCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfpickctlList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFRCVDESIGN where ...) as FOO_MAX} <br>
         * M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfrcvdesignCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfrcvdesignCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfrcvdesignCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfrcvdesign.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfrcvdesignCB, MClientCQ> derivedMMfrcvdesignList() {
            assertDerived("mMfrcvdesignList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfrcvdesignCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfrcvdesignList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFRCVITEM where ...) as FOO_MAX} <br>
         * M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfrcvitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfrcvitemCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfrcvitemCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfrcvitem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfrcvitemCB, MClientCQ> derivedMMfrcvitemList() {
            assertDerived("mMfrcvitemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfrcvitemCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfrcvitemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFWHxITEM where ...) as FOO_MAX} <br>
         * M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     entityCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     entityCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfwhxitem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfwhxitemCB, MClientCQ> derivedMMfwhxitemList() {
            assertDerived("mMfwhxitemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfwhxitemCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfwhxitemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_PRODUCT where ...) as FOO_MAX} <br>
         * M_PRODUCT by CLIENT_ID, named 'MProductList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     productCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     productCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MProduct.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MProductCB, MClientCQ> derivedMProductList() {
            assertDerived("mProductList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MProductCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMProductList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_SHAPE_GRP where ...) as FOO_MAX} <br>
         * M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     grpCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     grpCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MShapeGrp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MShapeGrpCB, MClientCQ> derivedMShapeGrpList() {
            assertDerived("mShapeGrpList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MShapeGrpCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMShapeGrpList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_USER_CLIENT where ...) as FOO_MAX} <br>
         * M_USER_CLIENT by CLIENT_ID, named 'MUserClientList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     clientCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     clientCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MUserClient.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MUserClientCB, MClientCQ> derivedMUserClientList() {
            assertDerived("mUserClientList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MUserClientCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMUserClientList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_USER_LOGIN where ...) as FOO_MAX} <br>
         * M_USER_LOGIN by CLIENT_ID, named 'MUserLoginList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loginCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loginCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MUserLogin.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MUserLoginCB, MClientCQ> derivedMUserLoginList() {
            assertDerived("mUserLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MUserLoginCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMUserLoginList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_WEB_HT_INFO where ...) as FOO_MAX} <br>
         * M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     infoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     infoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MWebHtInfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MWebHtInfoCB, MClientCQ> derivedMWebHtInfoList() {
            assertDerived("mWebHtInfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MWebHtInfoCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMWebHtInfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_ALLOC_INST_H where ...) as FOO_MAX} <br>
         * T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstHCB, MClientCQ> derivedTAllocInstHList() {
            assertDerived("tAllocInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CCOPAM where ...) as FOO_MAX} <br>
         * T_CCOPAM by CLIENT_ID, named 'TCcopamList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ccopamCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ccopamCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ccopamCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCcopam.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCcopamCB, MClientCQ> derivedTCcopamList() {
            assertDerived("tCcopamList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCcopamCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCcopamList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CENTER_SYMBOL where ...) as FOO_MAX} <br>
         * T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     symbolCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     symbolCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCenterSymbol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCenterSymbolCB, MClientCQ> derivedTCenterSymbolList() {
            assertDerived("tCenterSymbolList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCenterSymbolCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCenterSymbolList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CORDHDR where ...) as FOO_MAX} <br>
         * T_CORDHDR by CLIENT_ID, named 'TCordhdrList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cordhdrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cordhdrCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cordhdrCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCordhdr.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCordhdrCB, MClientCQ> derivedTCordhdrList() {
            assertDerived("tCordhdrList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCordhdrCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCordhdrList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_EC_ORDER_H where ...) as FOO_MAX} <br>
         * T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TEcOrderH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TEcOrderHCB, MClientCQ> derivedTEcOrderHList() {
            assertDerived("tEcOrderHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TEcOrderHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTEcOrderHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_INVENTORY_H where ...) as FOO_MAX} <br>
         * T_INVENTORY_H by CLIENT_ID, named 'TInventoryHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryHCB, MClientCQ> derivedTInventoryHList() {
            assertDerived("tInventoryHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_MFLASTSHIPLOT where ...) as FOO_MAX} <br>
         * T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mflastshiplotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mflastshiplotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mflastshiplotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMflastshiplot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMflastshiplotCB, MClientCQ> derivedTMflastshiplotList() {
            assertDerived("tMflastshiplotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMflastshiplotCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMflastshiplotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_MOVE_INST_H where ...) as FOO_MAX} <br>
         * T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstHCB, MClientCQ> derivedTMoveInstHList() {
            assertDerived("tMoveInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PACKING_H where ...) as FOO_MAX} <br>
         * T_PACKING_H by CLIENT_ID, named 'TPackingHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPackingH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPackingHCB, MClientCQ> derivedTPackingHList() {
            assertDerived("tPackingHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPackingHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPackingHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PALLET where ...) as FOO_MAX} <br>
         * T_PALLET by CLIENT_ID, named 'TPalletList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     palletCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     palletCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPallet.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPalletCB, MClientCQ> derivedTPalletList() {
            assertDerived("tPalletList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPalletCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPalletList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PICKING_H where ...) as FOO_MAX} <br>
         * T_PICKING_H by CLIENT_ID, named 'TPickingHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPickingH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPickingHCB, MClientCQ> derivedTPickingHList() {
            assertDerived("tPickingHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPickingHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPickingHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PIC_MTHD_RCMD where ...) as FOO_MAX} <br>
         * T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     rcmdCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     rcmdCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPicMthdRcmd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPicMthdRcmdCB, MClientCQ> derivedTPicMthdRcmdList() {
            assertDerived("tPicMthdRcmdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPicMthdRcmdCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPicMthdRcmdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_RECEIVE_PLAN_H where ...) as FOO_MAX} <br>
         * T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, MClientCQ> derivedTReceivePlanHList() {
            assertDerived("tReceivePlanHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SERIAL_NO where ...) as FOO_MAX} <br>
         * T_SERIAL_NO by CLIENT_ID, named 'TSerialNoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     noCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     noCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TSerialNo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TSerialNoCB, MClientCQ> derivedTSerialNoList() {
            assertDerived("tSerialNoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TSerialNoCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTSerialNoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SHIPPING_INST_H where ...) as FOO_MAX} <br>
         * T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MClientCQ> derivedTShippingInstHList() {
            assertDerived("tShippingInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SPLINFO where ...) as FOO_MAX} <br>
         * T_SPLINFO by CLIENT_ID, named 'TSplinfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(splinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     splinfoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     splinfoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TSplinfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TSplinfoCB, MClientCQ> derivedTSplinfoList() {
            assertDerived("tSplinfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TSplinfoCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTSplinfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STOCK where ...) as FOO_MAX} <br>
         * T_STOCK by CLIENT_ID, named 'TStockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     stockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     stockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockCB, MClientCQ> derivedTStockList() {
            assertDerived("tStockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STORE_RECORD_H where ...) as FOO_MAX} <br>
         * T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreRecordH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreRecordHCB, MClientCQ> derivedTStoreRecordHList() {
            assertDerived("tStoreRecordHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreRecordHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreRecordHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRALLINV where ...) as FOO_MAX} <br>
         * T_TRALLINV by CLIENT_ID, named 'TTrallinvList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trallinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trallinvCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trallinvCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrallinv.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrallinvCB, MClientCQ> derivedTTrallinvList() {
            assertDerived("tTrallinvList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrallinvCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrallinvList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRALLINVHISTORY where ...) as FOO_MAX} <br>
         * T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trallinvhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trallinvhistoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trallinvhistoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrallinvhistory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrallinvhistoryCB, MClientCQ> derivedTTrallinvhistoryList() {
            assertDerived("tTrallinvhistoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrallinvhistoryCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrallinvhistoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRCASEINVENTORY where ...) as FOO_MAX} <br>
         * T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trcaseinventoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trcaseinventoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trcaseinventoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrcaseinventory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrcaseinventoryCB, MClientCQ> derivedTTrcaseinventoryList() {
            assertDerived("tTrcaseinventoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrcaseinventoryCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrcaseinventoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRCASENUM where ...) as FOO_MAX} <br>
         * T_TRCASENUM by CLIENT_ID, named 'TTrcasenumList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trcasenumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trcasenumCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trcasenumCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrcasenum.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrcasenumCB, MClientCQ> derivedTTrcasenumList() {
            assertDerived("tTrcasenumList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrcasenumCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrcasenumList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRCASESTOCK where ...) as FOO_MAX} <br>
         * T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trcasestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trcasestockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trcasestockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrcasestock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrcasestockCB, MClientCQ> derivedTTrcasestockList() {
            assertDerived("tTrcasestockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrcasestockCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrcasestockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRHANBAIINV where ...) as FOO_MAX} <br>
         * T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trhanbaiinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trhanbaiinvCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trhanbaiinvCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrhanbaiinv.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrhanbaiinvCB, MClientCQ> derivedTTrhanbaiinvList() {
            assertDerived("tTrhanbaiinvList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrhanbaiinvCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrhanbaiinvList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVCHECKINFO where ...) as FOO_MAX} <br>
         * T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvcheckinfoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvcheckinfoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvcheckinfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvcheckinfoCB, MClientCQ> derivedTTrinvcheckinfoList() {
            assertDerived("tTrinvcheckinfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvcheckinfoCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvcheckinfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVCORRECT where ...) as FOO_MAX} <br>
         * T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvcorrectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvcorrectCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvcorrectCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvcorrect.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvcorrectCB, MClientCQ> derivedTTrinvcorrectList() {
            assertDerived("tTrinvcorrectList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvcorrectCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvcorrectList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVREANSWER where ...) as FOO_MAX} <br>
         * T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvreanswerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvreanswerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvreanswerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvreanswer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvreanswerCB, MClientCQ> derivedTTrinvreanswerList() {
            assertDerived("tTrinvreanswerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvreanswerCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvreanswerList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVREQUEST where ...) as FOO_MAX} <br>
         * T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvrequestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvrequestCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvrequestCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvrequest.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvrequestCB, MClientCQ> derivedTTrinvrequestList() {
            assertDerived("tTrinvrequestList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvrequestCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvrequestList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRITEMCONVRESULT where ...) as FOO_MAX} <br>
         * T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(tritemconvresultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     tritemconvresultCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     tritemconvresultCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTritemconvresult.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTritemconvresultCB, MClientCQ> derivedTTritemconvresultList() {
            assertDerived("tTritemconvresultList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTritemconvresultCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTritemconvresultList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRJUKYUINV where ...) as FOO_MAX} <br>
         * T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trjukyuinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trjukyuinvCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trjukyuinvCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrjukyuinv.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrjukyuinvCB, MClientCQ> derivedTTrjukyuinvList() {
            assertDerived("tTrjukyuinvList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrjukyuinvCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrjukyuinvList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRMANUFACTUREDATE where ...) as FOO_MAX} <br>
         * T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trmanufacturedateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trmanufacturedateCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trmanufacturedateCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrmanufacturedate.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrmanufacturedateCB, MClientCQ> derivedTTrmanufacturedateList() {
            assertDerived("tTrmanufacturedateList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrmanufacturedateCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrmanufacturedateList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRMANUFACTUREDATEDETAIL where ...) as FOO_MAX} <br>
         * T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trmanufacturedatedetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trmanufacturedatedetailCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trmanufacturedatedetailCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrmanufacturedatedetail.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrmanufacturedatedetailCB, MClientCQ> derivedTTrmanufacturedatedetailList() {
            assertDerived("tTrmanufacturedatedetailList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrmanufacturedatedetailCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrmanufacturedatedetailList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRMANUFACTUREDATEHISTORY where ...) as FOO_MAX} <br>
         * T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trmanufacturedatehistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trmanufacturedatehistoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trmanufacturedatehistoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrmanufacturedatehistory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrmanufacturedatehistoryCB, MClientCQ> derivedTTrmanufacturedatehistoryList() {
            assertDerived("tTrmanufacturedatehistoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrmanufacturedatehistoryCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrmanufacturedatehistoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRPALLETTRACE where ...) as FOO_MAX} <br>
         * T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trpallettraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trpallettraceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trpallettraceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrpallettrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrpallettraceCB, MClientCQ> derivedTTrpallettraceList() {
            assertDerived("tTrpallettraceList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrpallettraceCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrpallettraceList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRREVERSESTOCK where ...) as FOO_MAX} <br>
         * T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trreversestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trreversestockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trreversestockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrreversestock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrreversestockCB, MClientCQ> derivedTTrreversestockList() {
            assertDerived("tTrreversestockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrreversestockCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrreversestockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRSTOCKDIFFHISTORY where ...) as FOO_MAX} <br>
         * T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trstockdiffhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trstockdiffhistoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trstockdiffhistoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrstockdiffhistory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrstockdiffhistoryCB, MClientCQ> derivedTTrstockdiffhistoryList() {
            assertDerived("tTrstockdiffhistoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrstockdiffhistoryCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrstockdiffhistoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRSYMBOLTRACE where ...) as FOO_MAX} <br>
         * T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trsymboltraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trsymboltraceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trsymboltraceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrsymboltrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrsymboltraceCB, MClientCQ> derivedTTrsymboltraceList() {
            assertDerived("tTrsymboltraceList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrsymboltraceCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrsymboltraceList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRSYMBOLTRACEEXTEND where ...) as FOO_MAX} <br>
         * T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trsymboltraceextendCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trsymboltraceextendCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trsymboltraceextendCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrsymboltraceextend.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrsymboltraceextendCB, MClientCQ> derivedTTrsymboltraceextendList() {
            assertDerived("tTrsymboltraceextendList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrsymboltraceextendCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrsymboltraceextendList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRTRACE where ...) as FOO_MAX} <br>
         * T_TRTRACE by CLIENT_ID, named 'TTrtraceList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trtraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trtraceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trtraceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrtrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrtraceCB, MClientCQ> derivedTTrtraceList() {
            assertDerived("tTrtraceList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrtraceCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrtraceList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_YTRSO where ...) as FOO_MAX} <br>
         * T_YTRSO by CLIENT_ID, named 'TYtrsoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ytrsoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ytrsoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ytrsoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TYtrso.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TYtrsoCB, MClientCQ> derivedTYtrsoList() {
            assertDerived("tYtrsoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TYtrsoCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTYtrsoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_INVENTORY_INPUT_PROD where ...) as FOO_MAX} <br>
         * W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     prodCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     prodCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtInventoryInputProd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtInventoryInputProdCB, MClientCQ> derivedWHtInventoryInputProdList() {
            assertDerived("wHtInventoryInputProdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtInventoryInputProdCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtInventoryInputProdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_LOADING where ...) as FOO_MAX} <br>
         * W_HT_LOADING by CLIENT_ID, named 'WHtLoadingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loadingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loadingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtLoading.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtLoadingCB, MClientCQ> derivedWHtLoadingList() {
            assertDerived("wHtLoadingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtLoadingCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtLoadingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_INSPECTION where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspectionCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspectionCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveInspection.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveInspectionCB, MClientCQ> derivedWHtReceiveInspectionList() {
            assertDerived("wHtReceiveInspectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveInspectionCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveInspectionList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_NO_PLAN_INSP where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveNoPlanInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveNoPlanInspCB, MClientCQ> derivedWHtReceiveNoPlanInspList() {
            assertDerived("wHtReceiveNoPlanInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveNoPlanInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_STORE where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     storeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     storeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveStore.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveStoreCB, MClientCQ> derivedWHtReceiveStoreList() {
            assertDerived("wHtReceiveStoreList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveStoreCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveStoreList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SERIAL_RECEIVE_INSP where ...) as FOO_MAX} <br>
         * W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtSerialReceiveInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtSerialReceiveInspCB, MClientCQ> derivedWHtSerialReceiveInspList() {
            assertDerived("wHtSerialReceiveInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtSerialReceiveInspCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtSerialReceiveInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SERIAL_SHIPPING_INSP where ...) as FOO_MAX} <br>
         * W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtSerialShippingInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtSerialShippingInspCB, MClientCQ> derivedWHtSerialShippingInspList() {
            assertDerived("wHtSerialShippingInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtSerialShippingInspCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtSerialShippingInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SHIPPING where ...) as FOO_MAX} <br>
         * W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shippingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shippingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShipping.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingCB, MClientCQ> derivedWHtShippingList() {
            assertDerived("wHtShippingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SHIPPING_PICKING where ...) as FOO_MAX} <br>
         * W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShippingPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingPickingCB, MClientCQ> derivedWHtShippingPickingList() {
            assertDerived("wHtShippingPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingPickingCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SGL_ROW_SHIP_INSP_H where ...) as FOO_MAX} <br>
         * W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WSglRowShipInspH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WSglRowShipInspHCB, MClientCQ> derivedWSglRowShipInspHList() {
            assertDerived("wSglRowShipInspHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WSglRowShipInspHCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWSglRowShipInspHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SHIPPING_INTERRUPT where ...) as FOO_MAX} <br>
         * W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     interruptCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     interruptCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WShippingInterrupt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WShippingInterruptCB, MClientCQ> derivedWShippingInterruptList() {
            assertDerived("wShippingInterruptList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WShippingInterruptCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWShippingInterruptList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MClientCB, MClientCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientCB> sq, MClientCQ cq, String al, DerivedReferrerOption op)
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
    public MClientCB dreamCruiseCB() {
        MClientCB cb = new MClientCB();
        cb.xsetupForDreamCruise((MClientCB) this);
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
    public HpColQyOperand<MClientCB> columnQuery(final SpecifyQuery<MClientCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MClientCB xcreateColumnQueryCB() {
        MClientCB cb = new MClientCB();
        cb.xsetupForColumnQuery((MClientCB)this);
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
    public void orScopeQuery(OrQuery<MClientCB> orCBLambda) {
        xorSQ((MClientCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MClientCB> andCBLambda) {
        xorSQAP((MClientCB)this, andCBLambda);
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
        final MClientCB cb;
        if (mainCB != null) {
            cb = (MClientCB)mainCB;
        } else {
            cb = new MClientCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MClientCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MClientCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
