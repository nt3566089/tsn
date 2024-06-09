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
 * The base condition-bean of T_PICKING_R.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPickingRCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPickingRCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingRCB() {
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
        return "T_PICKING_R";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param pickingHId : PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H. (NotNull)
     * @return this. (NotNull)
     */
    public TPickingRCB acceptPK(Long pickingHId) {
        assertObjectNotNull("pickingHId", pickingHId);
        BsTPickingRCB cb = this;
        cb.query().setPickingHId_Equal(pickingHId);
        return (TPickingRCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param pickingHId : PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H. (NotNull)
     */
    public void acceptPrimaryKey(Long pickingHId) {
        assertObjectNotNull("pickingHId", pickingHId);
        BsTPickingRCB cb = this;
        cb.query().setPickingHId_Equal(pickingHId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_PickingHId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_PickingHId_Desc();
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
    public TPickingRCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TPickingRCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TPickingRCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TPickingRCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TPickingRCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TPickingRCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TPickingRCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TPickingRCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TPickingRCB> unionCBLambda) {
        final TPickingRCB cb = new TPickingRCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TPickingRCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TPickingRCB> unionCBLambda) {
        final TPickingRCB cb = new TPickingRCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TPickingRCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BUserNss _nssBUserByCaseOutUserId;
    public BUserNss xdfgetNssBUserByCaseOutUserId() {
        if (_nssBUserByCaseOutUserId == null) { _nssBUserByCaseOutUserId = new BUserNss(null); }
        return _nssBUserByCaseOutUserId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BUserByCaseOutUserId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBUserByCaseOutUserId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BUserNss setupSelect_BUserByCaseOutUserId() {
        assertSetupSelectPurpose("bUserByCaseOutUserId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCaseOutUserId();
        }
        doSetupSelect(() -> query().queryBUserByCaseOutUserId());
        if (_nssBUserByCaseOutUserId == null || !_nssBUserByCaseOutUserId.hasConditionQuery())
        { _nssBUserByCaseOutUserId = new BUserNss(query().queryBUserByCaseOutUserId()); }
        return _nssBUserByCaseOutUserId;
    }

    protected BUserNss _nssBUserByPackingOutUserId;
    public BUserNss xdfgetNssBUserByPackingOutUserId() {
        if (_nssBUserByPackingOutUserId == null) { _nssBUserByPackingOutUserId = new BUserNss(null); }
        return _nssBUserByPackingOutUserId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BUserByPackingOutUserId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBUserByPackingOutUserId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BUserNss setupSelect_BUserByPackingOutUserId() {
        assertSetupSelectPurpose("bUserByPackingOutUserId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingOutUserId();
        }
        doSetupSelect(() -> query().queryBUserByPackingOutUserId());
        if (_nssBUserByPackingOutUserId == null || !_nssBUserByPackingOutUserId.hasConditionQuery())
        { _nssBUserByPackingOutUserId = new BUserNss(query().queryBUserByPackingOutUserId()); }
        return _nssBUserByPackingOutUserId;
    }

    protected TPickingHNss _nssTPickingH;
    public TPickingHNss xdfgetNssTPickingH() {
        if (_nssTPickingH == null) { _nssTPickingH = new TPickingHNss(null); }
        return _nssTPickingH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TPickingH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getTPickingH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TPickingHNss setupSelect_TPickingH() {
        assertSetupSelectPurpose("tPickingH");
        doSetupSelect(() -> query().queryTPickingH());
        if (_nssTPickingH == null || !_nssTPickingH.hasConditionQuery())
        { _nssTPickingH = new TPickingHNss(query().queryTPickingH()); }
        return _nssTPickingH;
    }

    protected BUserNss _nssBUserByPl1OutUserId;
    public BUserNss xdfgetNssBUserByPl1OutUserId() {
        if (_nssBUserByPl1OutUserId == null) { _nssBUserByPl1OutUserId = new BUserNss(null); }
        return _nssBUserByPl1OutUserId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BUserByPl1OutUserId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBUserByPl1OutUserId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BUserNss setupSelect_BUserByPl1OutUserId() {
        assertSetupSelectPurpose("bUserByPl1OutUserId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPl1OutUserId();
        }
        doSetupSelect(() -> query().queryBUserByPl1OutUserId());
        if (_nssBUserByPl1OutUserId == null || !_nssBUserByPl1OutUserId.hasConditionQuery())
        { _nssBUserByPl1OutUserId = new BUserNss(query().queryBUserByPl1OutUserId()); }
        return _nssBUserByPl1OutUserId;
    }

    protected BUserNss _nssBUserByPl2OutUserId;
    public BUserNss xdfgetNssBUserByPl2OutUserId() {
        if (_nssBUserByPl2OutUserId == null) { _nssBUserByPl2OutUserId = new BUserNss(null); }
        return _nssBUserByPl2OutUserId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BUserByPl2OutUserId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBUserByPl2OutUserId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BUserNss setupSelect_BUserByPl2OutUserId() {
        assertSetupSelectPurpose("bUserByPl2OutUserId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPl2OutUserId();
        }
        doSetupSelect(() -> query().queryBUserByPl2OutUserId());
        if (_nssBUserByPl2OutUserId == null || !_nssBUserByPl2OutUserId.hasConditionQuery())
        { _nssBUserByPl2OutUserId = new BUserNss(query().queryBUserByPl2OutUserId()); }
        return _nssBUserByPl2OutUserId;
    }

    protected BUserNss _nssBUserByShippingRecordOutUserId;
    public BUserNss xdfgetNssBUserByShippingRecordOutUserId() {
        if (_nssBUserByShippingRecordOutUserId == null) { _nssBUserByShippingRecordOutUserId = new BUserNss(null); }
        return _nssBUserByShippingRecordOutUserId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BUserByShippingRecordOutUserId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBUserByShippingRecordOutUserId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BUserNss setupSelect_BUserByShippingRecordOutUserId() {
        assertSetupSelectPurpose("bUserByShippingRecordOutUserId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShippingRecordOutUserId();
        }
        doSetupSelect(() -> query().queryBUserByShippingRecordOutUserId());
        if (_nssBUserByShippingRecordOutUserId == null || !_nssBUserByShippingRecordOutUserId.hasConditionQuery())
        { _nssBUserByShippingRecordOutUserId = new BUserNss(query().queryBUserByShippingRecordOutUserId()); }
        return _nssBUserByShippingRecordOutUserId;
    }

    protected BUserNss _nssBUserBySlipOutUserId;
    public BUserNss xdfgetNssBUserBySlipOutUserId() {
        if (_nssBUserBySlipOutUserId == null) { _nssBUserBySlipOutUserId = new BUserNss(null); }
        return _nssBUserBySlipOutUserId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BUserBySlipOutUserId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBUserBySlipOutUserId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BUserNss setupSelect_BUserBySlipOutUserId() {
        assertSetupSelectPurpose("bUserBySlipOutUserId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSlipOutUserId();
        }
        doSetupSelect(() -> query().queryBUserBySlipOutUserId());
        if (_nssBUserBySlipOutUserId == null || !_nssBUserBySlipOutUserId.hasConditionQuery())
        { _nssBUserBySlipOutUserId = new BUserNss(query().queryBUserBySlipOutUserId()); }
        return _nssBUserBySlipOutUserId;
    }

    protected BClassDtlNss _nssBClassDtlByInvoiceCreateFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInvoiceCreateFlg() {
        if (_nssBClassDtlByInvoiceCreateFlg == null) { _nssBClassDtlByInvoiceCreateFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInvoiceCreateFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInvoiceCreateFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByInvoiceCreateFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInvoiceCreateFlg() {
        assertSetupSelectPurpose("bClassDtlByInvoiceCreateFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInvoiceCreateFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInvoiceCreateFlg());
        if (_nssBClassDtlByInvoiceCreateFlg == null || !_nssBClassDtlByInvoiceCreateFlg.hasConditionQuery())
        { _nssBClassDtlByInvoiceCreateFlg = new BClassDtlNss(query().queryBClassDtlByInvoiceCreateFlg()); }
        return _nssBClassDtlByInvoiceCreateFlg;
    }

    protected BClassDtlNss _nssBClassDtlByOplOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByOplOutFlg() {
        if (_nssBClassDtlByOplOutFlg == null) { _nssBClassDtlByOplOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByOplOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByOplOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByOplOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByOplOutFlg() {
        assertSetupSelectPurpose("bClassDtlByOplOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOplOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByOplOutFlg());
        if (_nssBClassDtlByOplOutFlg == null || !_nssBClassDtlByOplOutFlg.hasConditionQuery())
        { _nssBClassDtlByOplOutFlg = new BClassDtlNss(query().queryBClassDtlByOplOutFlg()); }
        return _nssBClassDtlByOplOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByTplOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByTplOutFlg() {
        if (_nssBClassDtlByTplOutFlg == null) { _nssBClassDtlByTplOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByTplOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByTplOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByTplOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByTplOutFlg() {
        assertSetupSelectPurpose("bClassDtlByTplOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTplOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByTplOutFlg());
        if (_nssBClassDtlByTplOutFlg == null || !_nssBClassDtlByTplOutFlg.hasConditionQuery())
        { _nssBClassDtlByTplOutFlg = new BClassDtlNss(query().queryBClassDtlByTplOutFlg()); }
        return _nssBClassDtlByTplOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByCaseOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCaseOutFlg() {
        if (_nssBClassDtlByCaseOutFlg == null) { _nssBClassDtlByCaseOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCaseOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCaseOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByCaseOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCaseOutFlg() {
        assertSetupSelectPurpose("bClassDtlByCaseOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCaseOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCaseOutFlg());
        if (_nssBClassDtlByCaseOutFlg == null || !_nssBClassDtlByCaseOutFlg.hasConditionQuery())
        { _nssBClassDtlByCaseOutFlg = new BClassDtlNss(query().queryBClassDtlByCaseOutFlg()); }
        return _nssBClassDtlByCaseOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByMltOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByMltOutFlg() {
        if (_nssBClassDtlByMltOutFlg == null) { _nssBClassDtlByMltOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByMltOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByMltOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByMltOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByMltOutFlg() {
        assertSetupSelectPurpose("bClassDtlByMltOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMltOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByMltOutFlg());
        if (_nssBClassDtlByMltOutFlg == null || !_nssBClassDtlByMltOutFlg.hasConditionQuery())
        { _nssBClassDtlByMltOutFlg = new BClassDtlNss(query().queryBClassDtlByMltOutFlg()); }
        return _nssBClassDtlByMltOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySplOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySplOutFlg() {
        if (_nssBClassDtlBySplOutFlg == null) { _nssBClassDtlBySplOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySplOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySplOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlBySplOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySplOutFlg() {
        assertSetupSelectPurpose("bClassDtlBySplOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSplOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySplOutFlg());
        if (_nssBClassDtlBySplOutFlg == null || !_nssBClassDtlBySplOutFlg.hasConditionQuery())
        { _nssBClassDtlBySplOutFlg = new BClassDtlNss(query().queryBClassDtlBySplOutFlg()); }
        return _nssBClassDtlBySplOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPlOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPlOutFlg() {
        if (_nssBClassDtlByPlOutFlg == null) { _nssBClassDtlByPlOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPlOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPlOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByPlOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPlOutFlg() {
        assertSetupSelectPurpose("bClassDtlByPlOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPlOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPlOutFlg());
        if (_nssBClassDtlByPlOutFlg == null || !_nssBClassDtlByPlOutFlg.hasConditionQuery())
        { _nssBClassDtlByPlOutFlg = new BClassDtlNss(query().queryBClassDtlByPlOutFlg()); }
        return _nssBClassDtlByPlOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySlOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySlOutFlg() {
        if (_nssBClassDtlBySlOutFlg == null) { _nssBClassDtlBySlOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySlOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySlOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlBySlOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySlOutFlg() {
        assertSetupSelectPurpose("bClassDtlBySlOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSlOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySlOutFlg());
        if (_nssBClassDtlBySlOutFlg == null || !_nssBClassDtlBySlOutFlg.hasConditionQuery())
        { _nssBClassDtlBySlOutFlg = new BClassDtlNss(query().queryBClassDtlBySlOutFlg()); }
        return _nssBClassDtlBySlOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPl1OutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPl1OutFlg() {
        if (_nssBClassDtlByPl1OutFlg == null) { _nssBClassDtlByPl1OutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPl1OutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPl1OutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByPl1OutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPl1OutFlg() {
        assertSetupSelectPurpose("bClassDtlByPl1OutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPl1OutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPl1OutFlg());
        if (_nssBClassDtlByPl1OutFlg == null || !_nssBClassDtlByPl1OutFlg.hasConditionQuery())
        { _nssBClassDtlByPl1OutFlg = new BClassDtlNss(query().queryBClassDtlByPl1OutFlg()); }
        return _nssBClassDtlByPl1OutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPl2OutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPl2OutFlg() {
        if (_nssBClassDtlByPl2OutFlg == null) { _nssBClassDtlByPl2OutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPl2OutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPl2OutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByPl2OutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPl2OutFlg() {
        assertSetupSelectPurpose("bClassDtlByPl2OutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPl2OutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPl2OutFlg());
        if (_nssBClassDtlByPl2OutFlg == null || !_nssBClassDtlByPl2OutFlg.hasConditionQuery())
        { _nssBClassDtlByPl2OutFlg = new BClassDtlNss(query().queryBClassDtlByPl2OutFlg()); }
        return _nssBClassDtlByPl2OutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPackingOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPackingOutFlg() {
        if (_nssBClassDtlByPackingOutFlg == null) { _nssBClassDtlByPackingOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPackingOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPackingOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByPackingOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPackingOutFlg() {
        assertSetupSelectPurpose("bClassDtlByPackingOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPackingOutFlg());
        if (_nssBClassDtlByPackingOutFlg == null || !_nssBClassDtlByPackingOutFlg.hasConditionQuery())
        { _nssBClassDtlByPackingOutFlg = new BClassDtlNss(query().queryBClassDtlByPackingOutFlg()); }
        return _nssBClassDtlByPackingOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySlipOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySlipOutFlg() {
        if (_nssBClassDtlBySlipOutFlg == null) { _nssBClassDtlBySlipOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySlipOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySlipOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlBySlipOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySlipOutFlg() {
        assertSetupSelectPurpose("bClassDtlBySlipOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSlipOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySlipOutFlg());
        if (_nssBClassDtlBySlipOutFlg == null || !_nssBClassDtlBySlipOutFlg.hasConditionQuery())
        { _nssBClassDtlBySlipOutFlg = new BClassDtlNss(query().queryBClassDtlBySlipOutFlg()); }
        return _nssBClassDtlBySlipOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByShippingRecordOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByShippingRecordOutFlg() {
        if (_nssBClassDtlByShippingRecordOutFlg == null) { _nssBClassDtlByShippingRecordOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByShippingRecordOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByShippingRecordOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByShippingRecordOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByShippingRecordOutFlg() {
        assertSetupSelectPurpose("bClassDtlByShippingRecordOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShippingRecordOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByShippingRecordOutFlg());
        if (_nssBClassDtlByShippingRecordOutFlg == null || !_nssBClassDtlByShippingRecordOutFlg.hasConditionQuery())
        { _nssBClassDtlByShippingRecordOutFlg = new BClassDtlNss(query().queryBClassDtlByShippingRecordOutFlg()); }
        return _nssBClassDtlByShippingRecordOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByBolOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByBolOutFlg() {
        if (_nssBClassDtlByBolOutFlg == null) { _nssBClassDtlByBolOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByBolOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingRBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByBolOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingR</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingR</span>.<span style="color: #CC4747">getBClassDtlByBolOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByBolOutFlg() {
        assertSetupSelectPurpose("bClassDtlByBolOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnBolOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByBolOutFlg());
        if (_nssBClassDtlByBolOutFlg == null || !_nssBClassDtlByBolOutFlg.hasConditionQuery())
        { _nssBClassDtlByBolOutFlg = new BClassDtlNss(query().queryBClassDtlByBolOutFlg()); }
        return _nssBClassDtlByBolOutFlg;
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

    public static class HpSpecification extends HpAbstractSpecification<TPickingRCQ> {
        protected BUserCB.HpSpecification _bUserByCaseOutUserId;
        protected BUserCB.HpSpecification _bUserByPackingOutUserId;
        protected TPickingHCB.HpSpecification _tPickingH;
        protected BUserCB.HpSpecification _bUserByPl1OutUserId;
        protected BUserCB.HpSpecification _bUserByPl2OutUserId;
        protected BUserCB.HpSpecification _bUserByShippingRecordOutUserId;
        protected BUserCB.HpSpecification _bUserBySlipOutUserId;
        protected BClassDtlCB.HpSpecification _bClassDtlByInvoiceCreateFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByOplOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByTplOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByCaseOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByMltOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySplOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPlOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySlOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPl1OutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPl2OutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPackingOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySlipOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByShippingRecordOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByBolOutFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TPickingRCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingHId() { return doColumn("PICKING_H_ID"); }
        /**
         * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOplOutFlg() { return doColumn("OPL_OUT_FLG"); }
        /**
         * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTplOutFlg() { return doColumn("TPL_OUT_FLG"); }
        /**
         * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMltOutFlg() { return doColumn("MLT_OUT_FLG"); }
        /**
         * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSplOutFlg() { return doColumn("SPL_OUT_FLG"); }
        /**
         * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPl1OutFlg() { return doColumn("PL1_OUT_FLG"); }
        /**
         * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPl1OutUserId() { return doColumn("PL1_OUT_USER_ID"); }
        /**
         * PL1_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPl1OutDt() { return doColumn("PL1_OUT_DT"); }
        /**
         * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPlOutFlg() { return doColumn("PL_OUT_FLG"); }
        /**
         * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlOutFlg() { return doColumn("SL_OUT_FLG"); }
        /**
         * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPl2OutFlg() { return doColumn("PL2_OUT_FLG"); }
        /**
         * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPl2OutUserId() { return doColumn("PL2_OUT_USER_ID"); }
        /**
         * PL2_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPl2OutDt() { return doColumn("PL2_OUT_DT"); }
        /**
         * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseOutFlg() { return doColumn("CASE_OUT_FLG"); }
        /**
         * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseOutUserId() { return doColumn("CASE_OUT_USER_ID"); }
        /**
         * CASE_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseOutDt() { return doColumn("CASE_OUT_DT"); }
        /**
         * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingOutFlg() { return doColumn("PACKING_OUT_FLG"); }
        /**
         * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingOutUserId() { return doColumn("PACKING_OUT_USER_ID"); }
        /**
         * PACKING_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingOutDt() { return doColumn("PACKING_OUT_DT"); }
        /**
         * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipOutFlg() { return doColumn("SLIP_OUT_FLG"); }
        /**
         * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipOutUserId() { return doColumn("SLIP_OUT_USER_ID"); }
        /**
         * SLIP_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipOutDt() { return doColumn("SLIP_OUT_DT"); }
        /**
         * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceCreateFlg() { return doColumn("INVOICE_CREATE_FLG"); }
        /**
         * INVOICE_CREATE_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceCreateDt() { return doColumn("INVOICE_CREATE_DT"); }
        /**
         * INVOICE_ISSUE_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceIssueNum() { return doColumn("INVOICE_ISSUE_NUM"); }
        /**
         * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingRecordOutFlg() { return doColumn("SHIPPING_RECORD_OUT_FLG"); }
        /**
         * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingRecordOutUserId() { return doColumn("SHIPPING_RECORD_OUT_USER_ID"); }
        /**
         * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingRecordOutDt() { return doColumn("SHIPPING_RECORD_OUT_DT"); }
        /**
         * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBolOutFlg() { return doColumn("BOL_OUT_FLG"); }
        /**
         * BOL_OUT_USER_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBolOutUserId() { return doColumn("BOL_OUT_USER_ID"); }
        /**
         * BOL_OUT_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBolOutDt() { return doColumn("BOL_OUT_DT"); }
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
            columnPickingHId(); // PK
            if (qyCall().qy().hasConditionQueryBUserByCaseOutUserId()
                    || qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnCaseOutUserId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBUserByPackingOutUserId()
                    || qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnPackingOutUserId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBUserByPl1OutUserId()
                    || qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnPl1OutUserId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBUserByPl2OutUserId()
                    || qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnPl2OutUserId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBUserByShippingRecordOutUserId()
                    || qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnShippingRecordOutUserId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBUserBySlipOutUserId()
                    || qyCall().qy().xgetReferrerQuery() instanceof BUserCQ) {
                columnSlipOutUserId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInvoiceCreateFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInvoiceCreateFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByOplOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnOplOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByTplOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnTplOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCaseOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCaseOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByMltOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnMltOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySplOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSplOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPlOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPlOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySlOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSlOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPl1OutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPl1OutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPl2OutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPl2OutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPackingOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPackingOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySlipOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSlipOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByShippingRecordOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnShippingRecordOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByBolOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnBolOutFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_PICKING_R"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BUserCB.HpSpecification specifyBUserByCaseOutUserId() {
            assertRelation("bUserByCaseOutUserId");
            if (_bUserByCaseOutUserId == null) {
                _bUserByCaseOutUserId = new BUserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBUserByCaseOutUserId()
                                    , () -> _qyCall.qy().queryBUserByCaseOutUserId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bUserByCaseOutUserId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBUserByCaseOutUserId()
                      , () -> xsyncQyCall().qy().queryBUserByCaseOutUserId()));
                }
            }
            return _bUserByCaseOutUserId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BUserCB.HpSpecification specifyBUserByPackingOutUserId() {
            assertRelation("bUserByPackingOutUserId");
            if (_bUserByPackingOutUserId == null) {
                _bUserByPackingOutUserId = new BUserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBUserByPackingOutUserId()
                                    , () -> _qyCall.qy().queryBUserByPackingOutUserId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bUserByPackingOutUserId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBUserByPackingOutUserId()
                      , () -> xsyncQyCall().qy().queryBUserByPackingOutUserId()));
                }
            }
            return _bUserByPackingOutUserId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TPickingHCB.HpSpecification specifyTPickingH() {
            assertRelation("tPickingH");
            if (_tPickingH == null) {
                _tPickingH = new TPickingHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTPickingH()
                                    , () -> _qyCall.qy().queryTPickingH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tPickingH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTPickingH()
                      , () -> xsyncQyCall().qy().queryTPickingH()));
                }
            }
            return _tPickingH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BUserCB.HpSpecification specifyBUserByPl1OutUserId() {
            assertRelation("bUserByPl1OutUserId");
            if (_bUserByPl1OutUserId == null) {
                _bUserByPl1OutUserId = new BUserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBUserByPl1OutUserId()
                                    , () -> _qyCall.qy().queryBUserByPl1OutUserId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bUserByPl1OutUserId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBUserByPl1OutUserId()
                      , () -> xsyncQyCall().qy().queryBUserByPl1OutUserId()));
                }
            }
            return _bUserByPl1OutUserId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BUserCB.HpSpecification specifyBUserByPl2OutUserId() {
            assertRelation("bUserByPl2OutUserId");
            if (_bUserByPl2OutUserId == null) {
                _bUserByPl2OutUserId = new BUserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBUserByPl2OutUserId()
                                    , () -> _qyCall.qy().queryBUserByPl2OutUserId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bUserByPl2OutUserId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBUserByPl2OutUserId()
                      , () -> xsyncQyCall().qy().queryBUserByPl2OutUserId()));
                }
            }
            return _bUserByPl2OutUserId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BUserCB.HpSpecification specifyBUserByShippingRecordOutUserId() {
            assertRelation("bUserByShippingRecordOutUserId");
            if (_bUserByShippingRecordOutUserId == null) {
                _bUserByShippingRecordOutUserId = new BUserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBUserByShippingRecordOutUserId()
                                    , () -> _qyCall.qy().queryBUserByShippingRecordOutUserId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bUserByShippingRecordOutUserId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBUserByShippingRecordOutUserId()
                      , () -> xsyncQyCall().qy().queryBUserByShippingRecordOutUserId()));
                }
            }
            return _bUserByShippingRecordOutUserId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BUserCB.HpSpecification specifyBUserBySlipOutUserId() {
            assertRelation("bUserBySlipOutUserId");
            if (_bUserBySlipOutUserId == null) {
                _bUserBySlipOutUserId = new BUserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBUserBySlipOutUserId()
                                    , () -> _qyCall.qy().queryBUserBySlipOutUserId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bUserBySlipOutUserId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBUserBySlipOutUserId()
                      , () -> xsyncQyCall().qy().queryBUserBySlipOutUserId()));
                }
            }
            return _bUserBySlipOutUserId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInvoiceCreateFlg() {
            assertRelation("bClassDtlByInvoiceCreateFlg");
            if (_bClassDtlByInvoiceCreateFlg == null) {
                _bClassDtlByInvoiceCreateFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInvoiceCreateFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInvoiceCreateFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInvoiceCreateFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInvoiceCreateFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInvoiceCreateFlg()));
                }
            }
            return _bClassDtlByInvoiceCreateFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByOplOutFlg() {
            assertRelation("bClassDtlByOplOutFlg");
            if (_bClassDtlByOplOutFlg == null) {
                _bClassDtlByOplOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByOplOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByOplOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByOplOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByOplOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByOplOutFlg()));
                }
            }
            return _bClassDtlByOplOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByTplOutFlg() {
            assertRelation("bClassDtlByTplOutFlg");
            if (_bClassDtlByTplOutFlg == null) {
                _bClassDtlByTplOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByTplOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByTplOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByTplOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByTplOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByTplOutFlg()));
                }
            }
            return _bClassDtlByTplOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCaseOutFlg() {
            assertRelation("bClassDtlByCaseOutFlg");
            if (_bClassDtlByCaseOutFlg == null) {
                _bClassDtlByCaseOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCaseOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCaseOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCaseOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCaseOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCaseOutFlg()));
                }
            }
            return _bClassDtlByCaseOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByMltOutFlg() {
            assertRelation("bClassDtlByMltOutFlg");
            if (_bClassDtlByMltOutFlg == null) {
                _bClassDtlByMltOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByMltOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByMltOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByMltOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByMltOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByMltOutFlg()));
                }
            }
            return _bClassDtlByMltOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySplOutFlg() {
            assertRelation("bClassDtlBySplOutFlg");
            if (_bClassDtlBySplOutFlg == null) {
                _bClassDtlBySplOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySplOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySplOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySplOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySplOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySplOutFlg()));
                }
            }
            return _bClassDtlBySplOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPlOutFlg() {
            assertRelation("bClassDtlByPlOutFlg");
            if (_bClassDtlByPlOutFlg == null) {
                _bClassDtlByPlOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPlOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPlOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPlOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPlOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPlOutFlg()));
                }
            }
            return _bClassDtlByPlOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySlOutFlg() {
            assertRelation("bClassDtlBySlOutFlg");
            if (_bClassDtlBySlOutFlg == null) {
                _bClassDtlBySlOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySlOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySlOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySlOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySlOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySlOutFlg()));
                }
            }
            return _bClassDtlBySlOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPl1OutFlg() {
            assertRelation("bClassDtlByPl1OutFlg");
            if (_bClassDtlByPl1OutFlg == null) {
                _bClassDtlByPl1OutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPl1OutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPl1OutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPl1OutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPl1OutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPl1OutFlg()));
                }
            }
            return _bClassDtlByPl1OutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPl2OutFlg() {
            assertRelation("bClassDtlByPl2OutFlg");
            if (_bClassDtlByPl2OutFlg == null) {
                _bClassDtlByPl2OutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPl2OutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPl2OutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPl2OutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPl2OutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPl2OutFlg()));
                }
            }
            return _bClassDtlByPl2OutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPackingOutFlg() {
            assertRelation("bClassDtlByPackingOutFlg");
            if (_bClassDtlByPackingOutFlg == null) {
                _bClassDtlByPackingOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPackingOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPackingOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPackingOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPackingOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPackingOutFlg()));
                }
            }
            return _bClassDtlByPackingOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySlipOutFlg() {
            assertRelation("bClassDtlBySlipOutFlg");
            if (_bClassDtlBySlipOutFlg == null) {
                _bClassDtlBySlipOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySlipOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySlipOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySlipOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySlipOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySlipOutFlg()));
                }
            }
            return _bClassDtlBySlipOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByShippingRecordOutFlg() {
            assertRelation("bClassDtlByShippingRecordOutFlg");
            if (_bClassDtlByShippingRecordOutFlg == null) {
                _bClassDtlByShippingRecordOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByShippingRecordOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByShippingRecordOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByShippingRecordOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByShippingRecordOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByShippingRecordOutFlg()));
                }
            }
            return _bClassDtlByShippingRecordOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByBolOutFlg() {
            assertRelation("bClassDtlByBolOutFlg");
            if (_bClassDtlByBolOutFlg == null) {
                _bClassDtlByBolOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByBolOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByBolOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByBolOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByBolOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByBolOutFlg()));
                }
            }
            return _bClassDtlByBolOutFlg;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TPickingRCB, TPickingRCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPickingRCB> sq, TPickingRCQ cq, String al, DerivedReferrerOption op)
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
    public TPickingRCB dreamCruiseCB() {
        TPickingRCB cb = new TPickingRCB();
        cb.xsetupForDreamCruise((TPickingRCB) this);
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
    public HpColQyOperand<TPickingRCB> columnQuery(final SpecifyQuery<TPickingRCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TPickingRCB xcreateColumnQueryCB() {
        TPickingRCB cb = new TPickingRCB();
        cb.xsetupForColumnQuery((TPickingRCB)this);
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
    public void orScopeQuery(OrQuery<TPickingRCB> orCBLambda) {
        xorSQ((TPickingRCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TPickingRCB> andCBLambda) {
        xorSQAP((TPickingRCB)this, andCBLambda);
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
        final TPickingRCB cb;
        if (mainCB != null) {
            cb = (TPickingRCB)mainCB;
        } else {
            cb = new TPickingRCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TPickingRCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TPickingRCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
