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
 * The base condition-bean of M_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public class BsMZipCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MZipCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMZipCB() {
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
        return "M_ZIP";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param zipId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MZipCB acceptPK(Long zipId) {
        assertObjectNotNull("zipId", zipId);
        BsMZipCB cb = this;
        cb.query().setZipId_Equal(zipId);
        return (MZipCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param zipId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long zipId) {
        assertObjectNotNull("zipId", zipId);
        BsMZipCB cb = this;
        cb.query().setZipId_Equal(zipId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param zipCd : UQ, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MZipCB acceptUniqueOf(String zipCd) {
        assertObjectNotNull("zipCd", zipCd);
        BsMZipCB cb = this;
        cb.query().setZipCd_Equal(zipCd);
        return (MZipCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ZipId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ZipId_Desc();
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
    public MZipCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MZipCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MZipCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MZipCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MZipCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MZipCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MZipCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MZipCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MZipCB> unionCBLambda) {
        final MZipCB cb = new MZipCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MZipCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MZipCB> unionCBLambda) {
        final MZipCB cb = new MZipCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MZipCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BClassDtlNss _nssBClassDtlByFlg6;
    public BClassDtlNss xdfgetNssBClassDtlByFlg6() {
        if (_nssBClassDtlByFlg6 == null) { _nssBClassDtlByFlg6 = new BClassDtlNss(null); }
        return _nssBClassDtlByFlg6;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFlg6()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByFlg6()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFlg6() {
        assertSetupSelectPurpose("bClassDtlByFlg6");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFlg6();
        }
        doSetupSelect(() -> query().queryBClassDtlByFlg6());
        if (_nssBClassDtlByFlg6 == null || !_nssBClassDtlByFlg6.hasConditionQuery())
        { _nssBClassDtlByFlg6 = new BClassDtlNss(query().queryBClassDtlByFlg6()); }
        return _nssBClassDtlByFlg6;
    }

    protected BClassDtlNss _nssBClassDtlByFlg5;
    public BClassDtlNss xdfgetNssBClassDtlByFlg5() {
        if (_nssBClassDtlByFlg5 == null) { _nssBClassDtlByFlg5 = new BClassDtlNss(null); }
        return _nssBClassDtlByFlg5;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFlg5()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByFlg5()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFlg5() {
        assertSetupSelectPurpose("bClassDtlByFlg5");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFlg5();
        }
        doSetupSelect(() -> query().queryBClassDtlByFlg5());
        if (_nssBClassDtlByFlg5 == null || !_nssBClassDtlByFlg5.hasConditionQuery())
        { _nssBClassDtlByFlg5 = new BClassDtlNss(query().queryBClassDtlByFlg5()); }
        return _nssBClassDtlByFlg5;
    }

    protected BClassDtlNss _nssBClassDtlByCompanyFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCompanyFlg() {
        if (_nssBClassDtlByCompanyFlg == null) { _nssBClassDtlByCompanyFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCompanyFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCompanyFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByCompanyFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCompanyFlg() {
        assertSetupSelectPurpose("bClassDtlByCompanyFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCompanyFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCompanyFlg());
        if (_nssBClassDtlByCompanyFlg == null || !_nssBClassDtlByCompanyFlg.hasConditionQuery())
        { _nssBClassDtlByCompanyFlg = new BClassDtlNss(query().queryBClassDtlByCompanyFlg()); }
        return _nssBClassDtlByCompanyFlg;
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
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByReasonType;
    public BClassDtlNss xdfgetNssBClassDtlByReasonType() {
        if (_nssBClassDtlByReasonType == null) { _nssBClassDtlByReasonType = new BClassDtlNss(null); }
        return _nssBClassDtlByReasonType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByReasonType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByReasonType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByReasonType() {
        assertSetupSelectPurpose("bClassDtlByReasonType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReasonType();
        }
        doSetupSelect(() -> query().queryBClassDtlByReasonType());
        if (_nssBClassDtlByReasonType == null || !_nssBClassDtlByReasonType.hasConditionQuery())
        { _nssBClassDtlByReasonType = new BClassDtlNss(query().queryBClassDtlByReasonType()); }
        return _nssBClassDtlByReasonType;
    }

    protected BClassDtlNss _nssBClassDtlByUpdCd;
    public BClassDtlNss xdfgetNssBClassDtlByUpdCd() {
        if (_nssBClassDtlByUpdCd == null) { _nssBClassDtlByUpdCd = new BClassDtlNss(null); }
        return _nssBClassDtlByUpdCd;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByUpdCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByUpdCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByUpdCd() {
        assertSetupSelectPurpose("bClassDtlByUpdCd");
        if (hasSpecifiedLocalColumn()) {
            specify().columnUpdCd();
        }
        doSetupSelect(() -> query().queryBClassDtlByUpdCd());
        if (_nssBClassDtlByUpdCd == null || !_nssBClassDtlByUpdCd.hasConditionQuery())
        { _nssBClassDtlByUpdCd = new BClassDtlNss(query().queryBClassDtlByUpdCd()); }
        return _nssBClassDtlByUpdCd;
    }

    protected BClassDtlNss _nssBClassDtlByUpdType;
    public BClassDtlNss xdfgetNssBClassDtlByUpdType() {
        if (_nssBClassDtlByUpdType == null) { _nssBClassDtlByUpdType = new BClassDtlNss(null); }
        return _nssBClassDtlByUpdType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByUpdType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByUpdType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByUpdType() {
        assertSetupSelectPurpose("bClassDtlByUpdType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnUpdType();
        }
        doSetupSelect(() -> query().queryBClassDtlByUpdType());
        if (_nssBClassDtlByUpdType == null || !_nssBClassDtlByUpdType.hasConditionQuery())
        { _nssBClassDtlByUpdType = new BClassDtlNss(query().queryBClassDtlByUpdType()); }
        return _nssBClassDtlByUpdType;
    }

    protected BClassDtlNss _nssBClassDtlByFlg1;
    public BClassDtlNss xdfgetNssBClassDtlByFlg1() {
        if (_nssBClassDtlByFlg1 == null) { _nssBClassDtlByFlg1 = new BClassDtlNss(null); }
        return _nssBClassDtlByFlg1;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFlg1()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByFlg1()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFlg1() {
        assertSetupSelectPurpose("bClassDtlByFlg1");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFlg1();
        }
        doSetupSelect(() -> query().queryBClassDtlByFlg1());
        if (_nssBClassDtlByFlg1 == null || !_nssBClassDtlByFlg1.hasConditionQuery())
        { _nssBClassDtlByFlg1 = new BClassDtlNss(query().queryBClassDtlByFlg1()); }
        return _nssBClassDtlByFlg1;
    }

    protected BClassDtlNss _nssBClassDtlByFlg2;
    public BClassDtlNss xdfgetNssBClassDtlByFlg2() {
        if (_nssBClassDtlByFlg2 == null) { _nssBClassDtlByFlg2 = new BClassDtlNss(null); }
        return _nssBClassDtlByFlg2;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFlg2()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByFlg2()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFlg2() {
        assertSetupSelectPurpose("bClassDtlByFlg2");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFlg2();
        }
        doSetupSelect(() -> query().queryBClassDtlByFlg2());
        if (_nssBClassDtlByFlg2 == null || !_nssBClassDtlByFlg2.hasConditionQuery())
        { _nssBClassDtlByFlg2 = new BClassDtlNss(query().queryBClassDtlByFlg2()); }
        return _nssBClassDtlByFlg2;
    }

    protected BClassDtlNss _nssBClassDtlByFlg3;
    public BClassDtlNss xdfgetNssBClassDtlByFlg3() {
        if (_nssBClassDtlByFlg3 == null) { _nssBClassDtlByFlg3 = new BClassDtlNss(null); }
        return _nssBClassDtlByFlg3;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFlg3()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByFlg3()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFlg3() {
        assertSetupSelectPurpose("bClassDtlByFlg3");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFlg3();
        }
        doSetupSelect(() -> query().queryBClassDtlByFlg3());
        if (_nssBClassDtlByFlg3 == null || !_nssBClassDtlByFlg3.hasConditionQuery())
        { _nssBClassDtlByFlg3 = new BClassDtlNss(query().queryBClassDtlByFlg3()); }
        return _nssBClassDtlByFlg3;
    }

    protected BClassDtlNss _nssBClassDtlByFlg4;
    public BClassDtlNss xdfgetNssBClassDtlByFlg4() {
        if (_nssBClassDtlByFlg4 == null) { _nssBClassDtlByFlg4 = new BClassDtlNss(null); }
        return _nssBClassDtlByFlg4;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFlg4()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mZip</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mZip</span>.<span style="color: #CC4747">getBClassDtlByFlg4()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFlg4() {
        assertSetupSelectPurpose("bClassDtlByFlg4");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFlg4();
        }
        doSetupSelect(() -> query().queryBClassDtlByFlg4());
        if (_nssBClassDtlByFlg4 == null || !_nssBClassDtlByFlg4.hasConditionQuery())
        { _nssBClassDtlByFlg4 = new BClassDtlNss(query().queryBClassDtlByFlg4()); }
        return _nssBClassDtlByFlg4;
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

    public static class HpSpecification extends HpAbstractSpecification<MZipCQ> {
        protected BClassDtlCB.HpSpecification _bClassDtlByFlg6;
        protected BClassDtlCB.HpSpecification _bClassDtlByFlg5;
        protected BClassDtlCB.HpSpecification _bClassDtlByCompanyFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByReasonType;
        protected BClassDtlCB.HpSpecification _bClassDtlByUpdCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByUpdType;
        protected BClassDtlCB.HpSpecification _bClassDtlByFlg1;
        protected BClassDtlCB.HpSpecification _bClassDtlByFlg2;
        protected BClassDtlCB.HpSpecification _bClassDtlByFlg3;
        protected BClassDtlCB.HpSpecification _bClassDtlByFlg4;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MZipCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZipId() { return doColumn("ZIP_ID"); }
        /**
         * PUBLIC_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPublicCd() { return doColumn("PUBLIC_CD"); }
        /**
         * ZIP_CD_5: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZipCd5() { return doColumn("ZIP_CD_5"); }
        /**
         * ZIP_CD: {UQ, NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZipCd() { return doColumn("ZIP_CD"); }
        /**
         * ADDRESS_KN1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddressKn1() { return doColumn("ADDRESS_KN1"); }
        /**
         * ADDRESS_KN2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddressKn2() { return doColumn("ADDRESS_KN2"); }
        /**
         * ADDRESS_KN3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddressKn3() { return doColumn("ADDRESS_KN3"); }
        /**
         * COMPANY_KN: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompanyKn() { return doColumn("COMPANY_KN"); }
        /**
         * ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress1() { return doColumn("ADDRESS1"); }
        /**
         * ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress2() { return doColumn("ADDRESS2"); }
        /**
         * ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress3() { return doColumn("ADDRESS3"); }
        /**
         * ADDRESS4: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress4() { return doColumn("ADDRESS4"); }
        /**
         * COMPANY_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompanyNm() { return doColumn("COMPANY_NM"); }
        /**
         * FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFlg1() { return doColumn("FLG1"); }
        /**
         * FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFlg2() { return doColumn("FLG2"); }
        /**
         * FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFlg3() { return doColumn("FLG3"); }
        /**
         * FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFlg4() { return doColumn("FLG4"); }
        /**
         * UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdType() { return doColumn("UPD_TYPE"); }
        /**
         * REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReasonType() { return doColumn("REASON_TYPE"); }
        /**
         * HANDLING_ADDRESS: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHandlingAddress() { return doColumn("HANDLING_ADDRESS"); }
        /**
         * FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFlg5() { return doColumn("FLG5"); }
        /**
         * FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFlg6() { return doColumn("FLG6"); }
        /**
         * UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdCd() { return doColumn("UPD_CD"); }
        /**
         * COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompanyFlg() { return doColumn("COMPANY_FLG"); }
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
            columnZipId(); // PK
            if (qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnZipCd(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFlg6()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFlg6(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFlg5()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFlg5(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCompanyFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCompanyFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByReasonType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnReasonType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByUpdCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnUpdCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByUpdType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnUpdType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFlg1()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFlg1(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFlg2()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFlg2(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFlg3()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFlg3(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFlg4()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFlg4(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_ZIP"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFlg6() {
            assertRelation("bClassDtlByFlg6");
            if (_bClassDtlByFlg6 == null) {
                _bClassDtlByFlg6 = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFlg6()
                                    , () -> _qyCall.qy().queryBClassDtlByFlg6())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFlg6.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFlg6()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFlg6()));
                }
            }
            return _bClassDtlByFlg6;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFlg5() {
            assertRelation("bClassDtlByFlg5");
            if (_bClassDtlByFlg5 == null) {
                _bClassDtlByFlg5 = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFlg5()
                                    , () -> _qyCall.qy().queryBClassDtlByFlg5())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFlg5.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFlg5()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFlg5()));
                }
            }
            return _bClassDtlByFlg5;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCompanyFlg() {
            assertRelation("bClassDtlByCompanyFlg");
            if (_bClassDtlByCompanyFlg == null) {
                _bClassDtlByCompanyFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCompanyFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCompanyFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCompanyFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCompanyFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCompanyFlg()));
                }
            }
            return _bClassDtlByCompanyFlg;
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
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByReasonType() {
            assertRelation("bClassDtlByReasonType");
            if (_bClassDtlByReasonType == null) {
                _bClassDtlByReasonType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByReasonType()
                                    , () -> _qyCall.qy().queryBClassDtlByReasonType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByReasonType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByReasonType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByReasonType()));
                }
            }
            return _bClassDtlByReasonType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByUpdCd() {
            assertRelation("bClassDtlByUpdCd");
            if (_bClassDtlByUpdCd == null) {
                _bClassDtlByUpdCd = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByUpdCd()
                                    , () -> _qyCall.qy().queryBClassDtlByUpdCd())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByUpdCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByUpdCd()
                      , () -> xsyncQyCall().qy().queryBClassDtlByUpdCd()));
                }
            }
            return _bClassDtlByUpdCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByUpdType() {
            assertRelation("bClassDtlByUpdType");
            if (_bClassDtlByUpdType == null) {
                _bClassDtlByUpdType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByUpdType()
                                    , () -> _qyCall.qy().queryBClassDtlByUpdType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByUpdType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByUpdType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByUpdType()));
                }
            }
            return _bClassDtlByUpdType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFlg1() {
            assertRelation("bClassDtlByFlg1");
            if (_bClassDtlByFlg1 == null) {
                _bClassDtlByFlg1 = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFlg1()
                                    , () -> _qyCall.qy().queryBClassDtlByFlg1())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFlg1.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFlg1()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFlg1()));
                }
            }
            return _bClassDtlByFlg1;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFlg2() {
            assertRelation("bClassDtlByFlg2");
            if (_bClassDtlByFlg2 == null) {
                _bClassDtlByFlg2 = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFlg2()
                                    , () -> _qyCall.qy().queryBClassDtlByFlg2())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFlg2.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFlg2()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFlg2()));
                }
            }
            return _bClassDtlByFlg2;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFlg3() {
            assertRelation("bClassDtlByFlg3");
            if (_bClassDtlByFlg3 == null) {
                _bClassDtlByFlg3 = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFlg3()
                                    , () -> _qyCall.qy().queryBClassDtlByFlg3())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFlg3.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFlg3()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFlg3()));
                }
            }
            return _bClassDtlByFlg3;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFlg4() {
            assertRelation("bClassDtlByFlg4");
            if (_bClassDtlByFlg4 == null) {
                _bClassDtlByFlg4 = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFlg4()
                                    , () -> _qyCall.qy().queryBClassDtlByFlg4())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFlg4.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFlg4()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFlg4()));
                }
            }
            return _bClassDtlByFlg4;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CARRIER_ZIP where ...) as FOO_MAX} <br>
         * M_CARRIER_ZIP by ZIP_ID, named 'MCarrierZipList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(zipCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     zipCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     zipCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCarrierZip.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCarrierZipCB, MZipCQ> derivedMCarrierZipList() {
            assertDerived("mCarrierZipList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierZipCB> sq, MZipCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCarrierZipList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SHIPPING_INST_H where ...) as FOO_MAX} <br>
         * T_SHIPPING_INST_H by DELIV_ZIP_CD, named 'TShippingInstHForDelivList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MZipCQ> derivedTShippingInstHForDelivList() {
            assertDerived("tShippingInstHForDelivList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MZipCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHForDelivList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MZipCB, MZipCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MZipCB> sq, MZipCQ cq, String al, DerivedReferrerOption op)
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
    public MZipCB dreamCruiseCB() {
        MZipCB cb = new MZipCB();
        cb.xsetupForDreamCruise((MZipCB) this);
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
    public HpColQyOperand<MZipCB> columnQuery(final SpecifyQuery<MZipCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MZipCB xcreateColumnQueryCB() {
        MZipCB cb = new MZipCB();
        cb.xsetupForColumnQuery((MZipCB)this);
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
    public void orScopeQuery(OrQuery<MZipCB> orCBLambda) {
        xorSQ((MZipCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MZipCB> andCBLambda) {
        xorSQAP((MZipCB)this, andCBLambda);
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
        final MZipCB cb;
        if (mainCB != null) {
            cb = (MZipCB)mainCB;
        } else {
            cb = new MZipCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MZipCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MZipCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
