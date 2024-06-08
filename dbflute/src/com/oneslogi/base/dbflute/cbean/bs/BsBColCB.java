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
 * The base condition-bean of B_COL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBColCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BColCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBColCB() {
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
        return "B_COL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param colId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public BColCB acceptPK(Long colId) {
        assertObjectNotNull("colId", colId);
        BsBColCB cb = this;
        cb.query().setColId_Equal(colId);
        return (BColCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param colId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long colId) {
        assertObjectNotNull("colId", colId);
        BsBColCB cb = this;
        cb.query().setColId_Equal(colId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param itemId : UQ+, IX, NotNull, bigint(19), FK to B_ITEM. (NotNull)
     * @param colCd : +UQ, varchar(100). (NotNull)
     * @return this. (NotNull)
     */
    public BColCB acceptUniqueOf(Long itemId, String colCd) {
        assertObjectNotNull("itemId", itemId);assertObjectNotNull("colCd", colCd);
        BsBColCB cb = this;
        cb.query().setItemId_Equal(itemId);cb.query().setColCd_Equal(colCd);
        return (BColCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ColId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ColId_Desc();
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
    public BColCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public BColCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected BColCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected BColCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected BColCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        BColCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected BColCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new BColCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<BColCB> unionCBLambda) {
        final BColCB cb = new BColCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final BColCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<BColCB> unionCBLambda) {
        final BColCB cb = new BColCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final BColCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BDictNss _nssBDict;
    public BDictNss xdfgetNssBDict() {
        if (_nssBDict == null) { _nssBDict = new BDictNss(null); }
        return _nssBDict;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_DICT by my DICT_ID, named 'BDict'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BDict()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBDict()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BDictNss setupSelect_BDict() {
        assertSetupSelectPurpose("bDict");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDictId();
        }
        doSetupSelect(() -> query().queryBDict());
        if (_nssBDict == null || !_nssBDict.hasConditionQuery())
        { _nssBDict = new BDictNss(query().queryBDict()); }
        return _nssBDict;
    }

    protected BItemNss _nssBItem;
    public BItemNss xdfgetNssBItem() {
        if (_nssBItem == null) { _nssBItem = new BItemNss(null); }
        return _nssBItem;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BItem()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBItem()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BItemNss setupSelect_BItem() {
        assertSetupSelectPurpose("bItem");
        if (hasSpecifiedLocalColumn()) {
            specify().columnItemId();
        }
        doSetupSelect(() -> query().queryBItem());
        if (_nssBItem == null || !_nssBItem.hasConditionQuery())
        { _nssBItem = new BItemNss(query().queryBItem()); }
        return _nssBItem;
    }

    /**
     * Set up relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_VDict(cultureId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getVDict()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    /**
     * Set up relation columns to select clause. <br>
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_VHtDict(cultureId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getVHtDict()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void setupSelect_VHtDict(final Long cultureId) {
        assertSetupSelectPurpose("vHtDict");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDictId();
        }
        doSetupSelect(() -> query().queryVHtDict(cultureId));
    }

    protected BClassDtlNss _nssBClassDtlByColType;
    public BClassDtlNss xdfgetNssBClassDtlByColType() {
        if (_nssBClassDtlByColType == null) { _nssBClassDtlByColType = new BClassDtlNss(null); }
        return _nssBClassDtlByColType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByColType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBClassDtlByColType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByColType() {
        assertSetupSelectPurpose("bClassDtlByColType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnColType();
        }
        doSetupSelect(() -> query().queryBClassDtlByColType());
        if (_nssBClassDtlByColType == null || !_nssBClassDtlByColType.hasConditionQuery())
        { _nssBClassDtlByColType = new BClassDtlNss(query().queryBClassDtlByColType()); }
        return _nssBClassDtlByColType;
    }

    protected BClassDtlNss _nssBClassDtlByVisible;
    public BClassDtlNss xdfgetNssBClassDtlByVisible() {
        if (_nssBClassDtlByVisible == null) { _nssBClassDtlByVisible = new BClassDtlNss(null); }
        return _nssBClassDtlByVisible;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByVisible()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBClassDtlByVisible()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByVisible() {
        assertSetupSelectPurpose("bClassDtlByVisible");
        if (hasSpecifiedLocalColumn()) {
            specify().columnVisible();
        }
        doSetupSelect(() -> query().queryBClassDtlByVisible());
        if (_nssBClassDtlByVisible == null || !_nssBClassDtlByVisible.hasConditionQuery())
        { _nssBClassDtlByVisible = new BClassDtlNss(query().queryBClassDtlByVisible()); }
        return _nssBClassDtlByVisible;
    }

    protected BClassDtlNss _nssBClassDtlByEditable;
    public BClassDtlNss xdfgetNssBClassDtlByEditable() {
        if (_nssBClassDtlByEditable == null) { _nssBClassDtlByEditable = new BClassDtlNss(null); }
        return _nssBClassDtlByEditable;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByEditable()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBClassDtlByEditable()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByEditable() {
        assertSetupSelectPurpose("bClassDtlByEditable");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEditable();
        }
        doSetupSelect(() -> query().queryBClassDtlByEditable());
        if (_nssBClassDtlByEditable == null || !_nssBClassDtlByEditable.hasConditionQuery())
        { _nssBClassDtlByEditable = new BClassDtlNss(query().queryBClassDtlByEditable()); }
        return _nssBClassDtlByEditable;
    }

    protected BClassDtlNss _nssBClassDtlByTextAlign;
    public BClassDtlNss xdfgetNssBClassDtlByTextAlign() {
        if (_nssBClassDtlByTextAlign == null) { _nssBClassDtlByTextAlign = new BClassDtlNss(null); }
        return _nssBClassDtlByTextAlign;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByTextAlign()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBClassDtlByTextAlign()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByTextAlign() {
        assertSetupSelectPurpose("bClassDtlByTextAlign");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTextAlign();
        }
        doSetupSelect(() -> query().queryBClassDtlByTextAlign());
        if (_nssBClassDtlByTextAlign == null || !_nssBClassDtlByTextAlign.hasConditionQuery())
        { _nssBClassDtlByTextAlign = new BClassDtlNss(query().queryBClassDtlByTextAlign()); }
        return _nssBClassDtlByTextAlign;
    }

    protected BClassDtlNss _nssBClassDtlByNecessary;
    public BClassDtlNss xdfgetNssBClassDtlByNecessary() {
        if (_nssBClassDtlByNecessary == null) { _nssBClassDtlByNecessary = new BClassDtlNss(null); }
        return _nssBClassDtlByNecessary;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByNecessary()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBClassDtlByNecessary()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByNecessary() {
        assertSetupSelectPurpose("bClassDtlByNecessary");
        if (hasSpecifiedLocalColumn()) {
            specify().columnNecessary();
        }
        doSetupSelect(() -> query().queryBClassDtlByNecessary());
        if (_nssBClassDtlByNecessary == null || !_nssBClassDtlByNecessary.hasConditionQuery())
        { _nssBClassDtlByNecessary = new BClassDtlNss(query().queryBClassDtlByNecessary()); }
        return _nssBClassDtlByNecessary;
    }

    protected BColValidNss _nssBColValidAsOne;
    public BColValidNss xdfgetNssBColValidAsOne() {
        if (_nssBColValidAsOne == null) { _nssBColValidAsOne = new BColValidNss(null); }
        return _nssBColValidAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BColValidAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">bCol</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBColValidAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BColValidNss setupSelect_BColValidAsOne() {
        assertSetupSelectPurpose("bColValidAsOne");
        doSetupSelect(() -> query().queryBColValidAsOne());
        if (_nssBColValidAsOne == null || !_nssBColValidAsOne.hasConditionQuery())
        { _nssBColValidAsOne = new BColValidNss(query().queryBColValidAsOne()); }
        return _nssBColValidAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<BColCQ> {
        protected BDictCB.HpSpecification _bDict;
        protected BItemCB.HpSpecification _bItem;
        protected VDictCB.HpSpecification _vDict;
        protected VHtDictCB.HpSpecification _vHtDict;
        protected BClassDtlCB.HpSpecification _bClassDtlByColType;
        protected BClassDtlCB.HpSpecification _bClassDtlByVisible;
        protected BClassDtlCB.HpSpecification _bClassDtlByEditable;
        protected BClassDtlCB.HpSpecification _bClassDtlByTextAlign;
        protected BClassDtlCB.HpSpecification _bClassDtlByNecessary;
        protected BColValidCB.HpSpecification _bColValidAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<BColCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * COL_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnColId() { return doColumn("COL_ID"); }
        /**
         * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemId() { return doColumn("ITEM_ID"); }
        /**
         * COL_CD: {+UQ, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnColCd() { return doColumn("COL_CD"); }
        /**
         * DICT_ID: {IX, bigint(19), FK to B_DICT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDictId() { return doColumn("DICT_ID"); }
        /**
         * COL_ORDER: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnColOrder() { return doColumn("COL_ORDER"); }
        /**
         * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnColType() { return doColumn("COL_TYPE"); }
        /**
         * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVisible() { return doColumn("VISIBLE"); }
        /**
         * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEditable() { return doColumn("EDITABLE"); }
        /**
         * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTextAlign() { return doColumn("TEXT_ALIGN"); }
        /**
         * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNecessary() { return doColumn("NECESSARY"); }
        /**
         * COL_WIDTH: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnColWidth() { return doColumn("COL_WIDTH"); }
        /**
         * IN_COL_INDEX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInColIndex() { return doColumn("IN_COL_INDEX"); }
        /**
         * IN_COL_DEFAULT_VALUE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInColDefaultValue() { return doColumn("IN_COL_DEFAULT_VALUE"); }
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
            columnColId(); // PK
            if (qyCall().qy().hasConditionQueryBDict()
                    || qyCall().qy().xgetReferrerQuery() instanceof BDictCQ) {
                columnDictId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBItem()
                    || qyCall().qy().xgetReferrerQuery() instanceof BItemCQ) {
                columnItemId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVDict()
                    || qyCall().qy().xgetReferrerQuery() instanceof VDictCQ) {
                columnDictId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVHtDict()
                    || qyCall().qy().xgetReferrerQuery() instanceof VHtDictCQ) {
                columnDictId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByColType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnColType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByVisible()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnVisible(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByEditable()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnEditable(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByTextAlign()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnTextAlign(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByNecessary()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnNecessary(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "B_COL"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_DICT by my DICT_ID, named 'BDict'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BDictCB.HpSpecification specifyBDict() {
            assertRelation("bDict");
            if (_bDict == null) {
                _bDict = new BDictCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBDict()
                                    , () -> _qyCall.qy().queryBDict())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bDict.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBDict()
                      , () -> xsyncQyCall().qy().queryBDict()));
                }
            }
            return _bDict;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_ITEM by my ITEM_ID, named 'BItem'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BItemCB.HpSpecification specifyBItem() {
            assertRelation("bItem");
            if (_bItem == null) {
                _bItem = new BItemCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBItem()
                                    , () -> _qyCall.qy().queryBItem())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bItem.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBItem()
                      , () -> xsyncQyCall().qy().queryBItem()));
                }
            }
            return _bItem;
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
         * V_HT_DICT by my DICT_ID, named 'VHtDict'.
         * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VHtDictCB.HpSpecification specifyVHtDict(final Long cultureId) {
            assertRelation("vHtDict");
            if (_vHtDict == null) {
                _vHtDict = new VHtDictCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVHtDict()
                                    , () -> _qyCall.qy().queryVHtDict(cultureId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vHtDict.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVHtDict()
                      , () -> xsyncQyCall().qy().queryVHtDict(cultureId)));
                }
            }
            return _vHtDict;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * V_HT_DICT by my DICT_ID, named 'VHtDict'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VHtDictCB.HpSpecification specifyVHtDict() {
            assertRelation("vHtDict");
            if (_vHtDict == null) {
                _vHtDict = new VHtDictCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVHtDict()
                                    , () -> _qyCall.qy().xdfgetConditionQueryVHtDict())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vHtDict.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVHtDict()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryVHtDict()));
                }
            }
            return _vHtDict;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByColType() {
            assertRelation("bClassDtlByColType");
            if (_bClassDtlByColType == null) {
                _bClassDtlByColType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByColType()
                                    , () -> _qyCall.qy().queryBClassDtlByColType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByColType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByColType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByColType()));
                }
            }
            return _bClassDtlByColType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByVisible() {
            assertRelation("bClassDtlByVisible");
            if (_bClassDtlByVisible == null) {
                _bClassDtlByVisible = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByVisible()
                                    , () -> _qyCall.qy().queryBClassDtlByVisible())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByVisible.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByVisible()
                      , () -> xsyncQyCall().qy().queryBClassDtlByVisible()));
                }
            }
            return _bClassDtlByVisible;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByEditable() {
            assertRelation("bClassDtlByEditable");
            if (_bClassDtlByEditable == null) {
                _bClassDtlByEditable = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByEditable()
                                    , () -> _qyCall.qy().queryBClassDtlByEditable())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByEditable.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByEditable()
                      , () -> xsyncQyCall().qy().queryBClassDtlByEditable()));
                }
            }
            return _bClassDtlByEditable;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByTextAlign() {
            assertRelation("bClassDtlByTextAlign");
            if (_bClassDtlByTextAlign == null) {
                _bClassDtlByTextAlign = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByTextAlign()
                                    , () -> _qyCall.qy().queryBClassDtlByTextAlign())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByTextAlign.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByTextAlign()
                      , () -> xsyncQyCall().qy().queryBClassDtlByTextAlign()));
                }
            }
            return _bClassDtlByTextAlign;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByNecessary() {
            assertRelation("bClassDtlByNecessary");
            if (_bClassDtlByNecessary == null) {
                _bClassDtlByNecessary = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByNecessary()
                                    , () -> _qyCall.qy().queryBClassDtlByNecessary())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByNecessary.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByNecessary()
                      , () -> xsyncQyCall().qy().queryBClassDtlByNecessary()));
                }
            }
            return _bClassDtlByNecessary;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BColValidCB.HpSpecification specifyBColValidAsOne() {
            assertRelation("bColValidAsOne");
            if (_bColValidAsOne == null) {
                _bColValidAsOne = new BColValidCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBColValidAsOne()
                                    , () -> _qyCall.qy().queryBColValidAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bColValidAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBColValidAsOne()
                      , () -> xsyncQyCall().qy().queryBColValidAsOne()));
                }
            }
            return _bColValidAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from B_COL_ROLE where ...) as FOO_MAX} <br>
         * B_COL_ROLE by COL_ID, named 'BColRoleList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     roleCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     roleCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, BColRole.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<BColRoleCB, BColCQ> derivedBColRoleList() {
            assertDerived("bColRoleList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<BColRoleCB> sq, BColCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveBColRoleList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_COL where ...) as FOO_MAX} <br>
         * M_CENTER_COL by COL_ID, named 'MCenterColList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     colCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     colCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterCol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterColCB, BColCQ> derivedMCenterColList() {
            assertDerived("mCenterColList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterColCB> sq, BColCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterColList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIENT_COL where ...) as FOO_MAX} <br>
         * M_CLIENT_COL by COL_ID, named 'MClientColList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     colCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     colCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientCol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientColCB, BColCQ> derivedMClientColList() {
            assertDerived("mClientColList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientColCB> sq, BColCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientColList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<BColCB, BColCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<BColCB> sq, BColCQ cq, String al, DerivedReferrerOption op)
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
    public BColCB dreamCruiseCB() {
        BColCB cb = new BColCB();
        cb.xsetupForDreamCruise((BColCB) this);
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
    public HpColQyOperand<BColCB> columnQuery(final SpecifyQuery<BColCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected BColCB xcreateColumnQueryCB() {
        BColCB cb = new BColCB();
        cb.xsetupForColumnQuery((BColCB)this);
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
    public void orScopeQuery(OrQuery<BColCB> orCBLambda) {
        xorSQ((BColCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<BColCB> andCBLambda) {
        xorSQAP((BColCB)this, andCBLambda);
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
        final BColCB cb;
        if (mainCB != null) {
            cb = (BColCB)mainCB;
        } else {
            cb = new BColCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return BColCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return BColCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
