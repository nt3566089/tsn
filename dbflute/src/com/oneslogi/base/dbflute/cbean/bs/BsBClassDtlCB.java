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
 * The base condition-bean of B_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBClassDtlCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BClassDtlCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBClassDtlCB() {
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
        return "B_CLASS_DTL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param classDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public BClassDtlCB acceptPK(Long classDtlId) {
        assertObjectNotNull("classDtlId", classDtlId);
        BsBClassDtlCB cb = this;
        cb.query().setClassDtlId_Equal(classDtlId);
        return (BClassDtlCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param classDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long classDtlId) {
        assertObjectNotNull("classDtlId", classDtlId);
        BsBClassDtlCB cb = this;
        cb.query().setClassDtlId_Equal(classDtlId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param classId : UQ+, IX, NotNull, bigint(19), FK to B_CLASS. (NotNull)
     * @param classDtlCd : +UQ, NotNull, varchar(100). (NotNull)
     * @return this. (NotNull)
     */
    public BClassDtlCB acceptUniqueOf(Long classId, String classDtlCd) {
        assertObjectNotNull("classId", classId);assertObjectNotNull("classDtlCd", classDtlCd);
        BsBClassDtlCB cb = this;
        cb.query().setClassId_Equal(classId);cb.query().setClassDtlCd_Equal(classDtlCd);
        return (BClassDtlCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ClassDtlId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ClassDtlId_Desc();
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
    public BClassDtlCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public BClassDtlCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected BClassDtlCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected BClassDtlCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected BClassDtlCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        BClassDtlCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected BClassDtlCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new BClassDtlCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<BClassDtlCB> unionCBLambda) {
        final BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final BClassDtlCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<BClassDtlCB> unionCBLambda) {
        final BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final BClassDtlCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BClassNss _nssBClass;
    public BClassNss xdfgetNssBClass() {
        if (_nssBClass == null) { _nssBClass = new BClassNss(null); }
        return _nssBClass;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClass()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bClassDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bClassDtl</span>.<span style="color: #CC4747">getBClass()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassNss setupSelect_BClass() {
        assertSetupSelectPurpose("bClass");
        if (hasSpecifiedLocalColumn()) {
            specify().columnClassId();
        }
        doSetupSelect(() -> query().queryBClass());
        if (_nssBClass == null || !_nssBClass.hasConditionQuery())
        { _nssBClass = new BClassNss(query().queryBClass()); }
        return _nssBClass;
    }

    /**
     * Set up relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_VDict(cultureId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bClassDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bClassDtl</span>.<span style="color: #CC4747">getVDict()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void setupSelect_VDict(final Long cultureId) {
        assertSetupSelectPurpose("vDict");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDictId();
        }
        doSetupSelect(() -> query().queryVDict(cultureId));
    }

    protected BClassDtlSubNss _nssBClassDtlSubAsOne;
    public BClassDtlSubNss xdfgetNssBClassDtlSubAsOne() {
        if (_nssBClassDtlSubAsOne == null) { _nssBClassDtlSubAsOne = new BClassDtlSubNss(null); }
        return _nssBClassDtlSubAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlSubAsOne(cultureId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bClassDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bClassDtl</span>.<span style="color: #CC4747">getBClassDtlSubAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlSubNss setupSelect_BClassDtlSubAsOne() {
        assertSetupSelectPurpose("bClassDtlSubAsOne");
        doSetupSelect(() -> query().queryBClassDtlSubAsOne());
        if (_nssBClassDtlSubAsOne == null || !_nssBClassDtlSubAsOne.hasConditionQuery())
        { _nssBClassDtlSubAsOne = new BClassDtlSubNss(query().queryBClassDtlSubAsOne()); }
        return _nssBClassDtlSubAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<BClassDtlCQ> {
        protected BClassCB.HpSpecification _bClass;
        protected BDictCB.HpSpecification _bDict;
        protected VDictCB.HpSpecification _vDict;
        protected BClassDtlSubCB.HpSpecification _bClassDtlSubAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<BClassDtlCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClassDtlId() { return doColumn("CLASS_DTL_ID"); }
        /**
         * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClassId() { return doColumn("CLASS_ID"); }
        /**
         * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClassDtlCd() { return doColumn("CLASS_DTL_CD"); }
        /**
         * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDictId() { return doColumn("DICT_ID"); }
        /**
         * VIEW_ORDER: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnViewOrder() { return doColumn("VIEW_ORDER"); }
        /**
         * DEFAULT_FLG: {NotNull, char(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDefaultFlg() { return doColumn("DEFAULT_FLG"); }
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
            columnClassDtlId(); // PK
            if (qyCall().qy().xgetReferrerQuery() instanceof BDictCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BLogCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BLogDtlCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BLogDtlCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BSystemLogCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BSystemLogCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BMessageCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BMessageCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BClassCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BScreenRoleCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemRoleCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BItemRoleCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColRoleCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BColRoleCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BNumberingCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BRoleGrpCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BUserAuthCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BUserAuthCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrinterCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrinterAttributeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintRequestCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintRequestCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintRequestCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintRequestCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PLayoutPrintSettingCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintServiceCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintRequestHistCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintRequestHistCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PReportLayoutCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PPrintQueueCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof PReportLayoutCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof BMenuCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HInventoryBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HInventoryBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HMoveBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HReceiveBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HReceiveHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HShippingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HShippingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HStockInoutCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof HStockInoutCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MBoxCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MBoxGrpCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipSgwCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipSgwCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipSgwCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipSgwCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYmtCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYmtCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYmtCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYmtCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYmtCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipYupkCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCenterClassCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCenterCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MClientCenterCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MClientCenterCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCommonCarrierCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MDataInputTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MDeliveryCourseCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MDeliveryCourseCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MNumberingCenterCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MImportTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MImportTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MImportTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MNumberingCenterCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MProductShapeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MSetParentCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MShapeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpDtlCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpDtlCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpDtlCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MStockTypeCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MWarehouseCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MWarehouseCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MWebHtInfoCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZipCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MZoneCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TAllocInstBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TAllocInstBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TAllocInstBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TAllocInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TEcOrderRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TInventoryBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TInventoryBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TInventoryInpHistCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TInventoryInstCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TInventoryRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveInstBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveInstBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveInstRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveRecordBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TMoveRecordBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPackingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TStockInoutCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TStockInoutCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TStoreNoRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TStoreRecordBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TStoreRecordBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TStoreRecordRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPicMthdRcmdCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPicMthdRcmdCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TWorkLogCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TWorkLogCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof TPickingRCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof WSglRowShipInspBCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCommonCarrierCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MDeliveryCourseCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MParamCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().xgetReferrerQuery() instanceof MCarrierSlipCesCQ) {
                columnClassDtlCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().hasConditionQueryBClass()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassCQ) {
                columnClassId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVDict()
                    || qyCall().qy().xgetReferrerQuery() instanceof VDictCQ) {
                columnDictId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "B_CLASS_DTL"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS by my CLASS_ID, named 'BClass'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassCB.HpSpecification specifyBClass() {
            assertRelation("bClass");
            if (_bClass == null) {
                _bClass = new BClassCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClass()
                                    , () -> _qyCall.qy().queryBClass())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClass.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClass()
                      , () -> xsyncQyCall().qy().queryBClass()));
                }
            }
            return _bClass;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * V_DICT by my DICT_ID, named 'VDict'.
         * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VDictCB.HpSpecification specifyVDict(final Long cultureId) {
            assertRelation("vDict");
            if (_vDict == null) {
                _vDict = new VDictCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVDict()
                                    , () -> _qyCall.qy().queryVDict(cultureId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vDict.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVDict()
                      , () -> xsyncQyCall().qy().queryVDict(cultureId)));
                }
            }
            return _vDict;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * V_DICT by my DICT_ID, named 'VDict'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VDictCB.HpSpecification specifyVDict() {
            assertRelation("vDict");
            if (_vDict == null) {
                _vDict = new VDictCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVDict()
                                    , () -> _qyCall.qy().xdfgetConditionQueryVDict())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vDict.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVDict()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryVDict()));
                }
            }
            return _vDict;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlSubCB.HpSpecification specifyBClassDtlSubAsOne() {
            assertRelation("bClassDtlSubAsOne");
            if (_bClassDtlSubAsOne == null) {
                _bClassDtlSubAsOne = new BClassDtlSubCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlSubAsOne()
                                    , () -> _qyCall.qy().queryBClassDtlSubAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlSubAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlSubAsOne()
                      , () -> xsyncQyCall().qy().queryBClassDtlSubAsOne()));
                }
            }
            return _bClassDtlSubAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from B_CLASS_GRP_DTL where ...) as FOO_MAX} <br>
         * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     dtlCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     dtlCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, BClassGrpDtl.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<BClassGrpDtlCB, BClassDtlCQ> derivedBClassGrpDtlList() {
            assertDerived("bClassGrpDtlList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<BClassGrpDtlCB> sq, BClassDtlCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveBClassGrpDtlList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<BClassDtlCB, BClassDtlCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<BClassDtlCB> sq, BClassDtlCQ cq, String al, DerivedReferrerOption op)
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
    public BClassDtlCB dreamCruiseCB() {
        BClassDtlCB cb = new BClassDtlCB();
        cb.xsetupForDreamCruise((BClassDtlCB) this);
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
    public HpColQyOperand<BClassDtlCB> columnQuery(final SpecifyQuery<BClassDtlCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected BClassDtlCB xcreateColumnQueryCB() {
        BClassDtlCB cb = new BClassDtlCB();
        cb.xsetupForColumnQuery((BClassDtlCB)this);
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
    public void orScopeQuery(OrQuery<BClassDtlCB> orCBLambda) {
        xorSQ((BClassDtlCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<BClassDtlCB> andCBLambda) {
        xorSQAP((BClassDtlCB)this, andCBLambda);
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
        final BClassDtlCB cb;
        if (mainCB != null) {
            cb = (BClassDtlCB)mainCB;
        } else {
            cb = new BClassDtlCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return BClassDtlCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return BClassDtlCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
