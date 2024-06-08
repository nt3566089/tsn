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
 * The base condition-bean of B_LOG_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBLogDtlCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BLogDtlCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBLogDtlCB() {
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
        return "B_LOG_DTL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param logDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public BLogDtlCB acceptPK(Long logDtlId) {
        assertObjectNotNull("logDtlId", logDtlId);
        BsBLogDtlCB cb = this;
        cb.query().setLogDtlId_Equal(logDtlId);
        return (BLogDtlCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param logDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long logDtlId) {
        assertObjectNotNull("logDtlId", logDtlId);
        BsBLogDtlCB cb = this;
        cb.query().setLogDtlId_Equal(logDtlId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LogDtlId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LogDtlId_Desc();
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
    public BLogDtlCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public BLogDtlCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected BLogDtlCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected BLogDtlCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected BLogDtlCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        BLogDtlCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected BLogDtlCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new BLogDtlCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<BLogDtlCB> unionCBLambda) {
        final BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final BLogDtlCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<BLogDtlCB> unionCBLambda) {
        final BLogDtlCB cb = new BLogDtlCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final BLogDtlCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BLogNss _nssBLog;
    public BLogNss xdfgetNssBLog() {
        if (_nssBLog == null) { _nssBLog = new BLogNss(null); }
        return _nssBLog;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_LOG by my LOG_ID, named 'BLog'.
     * <pre>
     * <span style="color: #0000C0">bLogDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BLog()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bLogDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bLogDtl</span>.<span style="color: #CC4747">getBLog()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BLogNss setupSelect_BLog() {
        assertSetupSelectPurpose("bLog");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLogId();
        }
        doSetupSelect(() -> query().queryBLog());
        if (_nssBLog == null || !_nssBLog.hasConditionQuery())
        { _nssBLog = new BLogNss(query().queryBLog()); }
        return _nssBLog;
    }

    protected BClassDtlNss _nssBClassDtlByLogDtlType;
    public BClassDtlNss xdfgetNssBClassDtlByLogDtlType() {
        if (_nssBClassDtlByLogDtlType == null) { _nssBClassDtlByLogDtlType = new BClassDtlNss(null); }
        return _nssBClassDtlByLogDtlType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'.
     * <pre>
     * <span style="color: #0000C0">bLogDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLogDtlType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bLogDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bLogDtl</span>.<span style="color: #CC4747">getBClassDtlByLogDtlType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLogDtlType() {
        assertSetupSelectPurpose("bClassDtlByLogDtlType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLogDtlType();
        }
        doSetupSelect(() -> query().queryBClassDtlByLogDtlType());
        if (_nssBClassDtlByLogDtlType == null || !_nssBClassDtlByLogDtlType.hasConditionQuery())
        { _nssBClassDtlByLogDtlType = new BClassDtlNss(query().queryBClassDtlByLogDtlType()); }
        return _nssBClassDtlByLogDtlType;
    }

    protected BClassDtlNss _nssBClassDtlByLogDtlStatus;
    public BClassDtlNss xdfgetNssBClassDtlByLogDtlStatus() {
        if (_nssBClassDtlByLogDtlStatus == null) { _nssBClassDtlByLogDtlStatus = new BClassDtlNss(null); }
        return _nssBClassDtlByLogDtlStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'.
     * <pre>
     * <span style="color: #0000C0">bLogDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLogDtlStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bLogDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bLogDtl</span>.<span style="color: #CC4747">getBClassDtlByLogDtlStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLogDtlStatus() {
        assertSetupSelectPurpose("bClassDtlByLogDtlStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLogDtlStatus();
        }
        doSetupSelect(() -> query().queryBClassDtlByLogDtlStatus());
        if (_nssBClassDtlByLogDtlStatus == null || !_nssBClassDtlByLogDtlStatus.hasConditionQuery())
        { _nssBClassDtlByLogDtlStatus = new BClassDtlNss(query().queryBClassDtlByLogDtlStatus()); }
        return _nssBClassDtlByLogDtlStatus;
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

    public static class HpSpecification extends HpAbstractSpecification<BLogDtlCQ> {
        protected BLogCB.HpSpecification _bLog;
        protected BClassDtlCB.HpSpecification _bClassDtlByLogDtlType;
        protected BClassDtlCB.HpSpecification _bClassDtlByLogDtlStatus;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<BLogDtlCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogDtlId() { return doColumn("LOG_DTL_ID"); }
        /**
         * LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogId() { return doColumn("LOG_ID"); }
        /**
         * LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogDtlType() { return doColumn("LOG_DTL_TYPE"); }
        /**
         * LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogDtlStatus() { return doColumn("LOG_DTL_STATUS"); }
        /**
         * LOG_DTL_SECTION_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogDtlSectionId() { return doColumn("LOG_DTL_SECTION_ID"); }
        /**
         * LOG_DTL_SECTION_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogDtlSectionNm() { return doColumn("LOG_DTL_SECTION_NM"); }
        /**
         * PROCESS_INFO: {NotNull, varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessInfo() { return doColumn("PROCESS_INFO"); }
        /**
         * PROCESS_DT: {NotNull, datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessDt() { return doColumn("PROCESS_DT"); }
        /**
         * MESSAGE_REPLACE_STRING1: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageReplaceString1() { return doColumn("MESSAGE_REPLACE_STRING1"); }
        /**
         * MESSAGE_REPLACE_STRING2: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageReplaceString2() { return doColumn("MESSAGE_REPLACE_STRING2"); }
        /**
         * MESSAGE_REPLACE_STRING3: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageReplaceString3() { return doColumn("MESSAGE_REPLACE_STRING3"); }
        /**
         * MESSAGE_REPLACE_STRING4: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageReplaceString4() { return doColumn("MESSAGE_REPLACE_STRING4"); }
        /**
         * MESSAGE_REPLACE_STRING5: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageReplaceString5() { return doColumn("MESSAGE_REPLACE_STRING5"); }
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
            columnLogDtlId(); // PK
            if (qyCall().qy().hasConditionQueryBLog()
                    || qyCall().qy().xgetReferrerQuery() instanceof BLogCQ) {
                columnLogId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLogDtlType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLogDtlType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLogDtlStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLogDtlStatus(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "B_LOG_DTL"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_LOG by my LOG_ID, named 'BLog'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BLogCB.HpSpecification specifyBLog() {
            assertRelation("bLog");
            if (_bLog == null) {
                _bLog = new BLogCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBLog()
                                    , () -> _qyCall.qy().queryBLog())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bLog.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBLog()
                      , () -> xsyncQyCall().qy().queryBLog()));
                }
            }
            return _bLog;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LOG_DTL_TYPE, named 'BClassDtlByLogDtlType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLogDtlType() {
            assertRelation("bClassDtlByLogDtlType");
            if (_bClassDtlByLogDtlType == null) {
                _bClassDtlByLogDtlType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLogDtlType()
                                    , () -> _qyCall.qy().queryBClassDtlByLogDtlType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLogDtlType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLogDtlType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLogDtlType()));
                }
            }
            return _bClassDtlByLogDtlType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LOG_DTL_STATUS, named 'BClassDtlByLogDtlStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLogDtlStatus() {
            assertRelation("bClassDtlByLogDtlStatus");
            if (_bClassDtlByLogDtlStatus == null) {
                _bClassDtlByLogDtlStatus = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLogDtlStatus()
                                    , () -> _qyCall.qy().queryBClassDtlByLogDtlStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLogDtlStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLogDtlStatus()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLogDtlStatus()));
                }
            }
            return _bClassDtlByLogDtlStatus;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<BLogDtlCB, BLogDtlCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<BLogDtlCB> sq, BLogDtlCQ cq, String al, DerivedReferrerOption op)
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
    public BLogDtlCB dreamCruiseCB() {
        BLogDtlCB cb = new BLogDtlCB();
        cb.xsetupForDreamCruise((BLogDtlCB) this);
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
    public HpColQyOperand<BLogDtlCB> columnQuery(final SpecifyQuery<BLogDtlCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected BLogDtlCB xcreateColumnQueryCB() {
        BLogDtlCB cb = new BLogDtlCB();
        cb.xsetupForColumnQuery((BLogDtlCB)this);
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
    public void orScopeQuery(OrQuery<BLogDtlCB> orCBLambda) {
        xorSQ((BLogDtlCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<BLogDtlCB> andCBLambda) {
        xorSQAP((BLogDtlCB)this, andCBLambda);
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
        final BLogDtlCB cb;
        if (mainCB != null) {
            cb = (BLogDtlCB)mainCB;
        } else {
            cb = new BLogDtlCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return BLogDtlCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return BLogDtlCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
