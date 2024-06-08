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
 * The base condition-bean of T_PICKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPickingHCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPickingHCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingHCB() {
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
        return "T_PICKING_H";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param pickingHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TPickingHCB acceptPK(Long pickingHId) {
        assertObjectNotNull("pickingHId", pickingHId);
        BsTPickingHCB cb = this;
        cb.query().setPickingHId_Equal(pickingHId);
        return (TPickingHCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param pickingHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long pickingHId) {
        assertObjectNotNull("pickingHId", pickingHId);
        BsTPickingHCB cb = this;
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
    public TPickingHCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TPickingHCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TPickingHCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TPickingHCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TPickingHCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TPickingHCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TPickingHCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TPickingHCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TPickingHCB> unionCBLambda) {
        final TPickingHCB cb = new TPickingHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TPickingHCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TPickingHCB> unionCBLambda) {
        final TPickingHCB cb = new TPickingHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TPickingHCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MProcessTypeNss _nssMProcessType;
    public MProcessTypeNss xdfgetNssMProcessType() {
        if (_nssMProcessType == null) { _nssMProcessType = new MProcessTypeNss(null); }
        return _nssMProcessType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProcessType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getMProcessType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProcessTypeNss setupSelect_MProcessType() {
        assertSetupSelectPurpose("mProcessType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProcessTypeId();
        }
        doSetupSelect(() -> query().queryMProcessType());
        if (_nssMProcessType == null || !_nssMProcessType.hasConditionQuery())
        { _nssMProcessType = new MProcessTypeNss(query().queryMProcessType()); }
        return _nssMProcessType;
    }

    protected MCenterNss _nssMCenter;
    public MCenterNss xdfgetNssMCenter() {
        if (_nssMCenter == null) { _nssMCenter = new MCenterNss(null); }
        return _nssMCenter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected TAllocInstHNss _nssTAllocInstH;
    public TAllocInstHNss xdfgetNssTAllocInstH() {
        if (_nssTAllocInstH == null) { _nssTAllocInstH = new TAllocInstHNss(null); }
        return _nssTAllocInstH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TAllocInstH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getTAllocInstH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TAllocInstHNss setupSelect_TAllocInstH() {
        assertSetupSelectPurpose("tAllocInstH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAllocInstHId();
        }
        doSetupSelect(() -> query().queryTAllocInstH());
        if (_nssTAllocInstH == null || !_nssTAllocInstH.hasConditionQuery())
        { _nssTAllocInstH = new TAllocInstHNss(query().queryTAllocInstH()); }
        return _nssTAllocInstH;
    }

    protected BClassDtlNss _nssBClassDtlByCenterTransitFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCenterTransitFlg() {
        if (_nssBClassDtlByCenterTransitFlg == null) { _nssBClassDtlByCenterTransitFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCenterTransitFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCenterTransitFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getBClassDtlByCenterTransitFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCenterTransitFlg() {
        assertSetupSelectPurpose("bClassDtlByCenterTransitFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCenterTransitFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCenterTransitFlg());
        if (_nssBClassDtlByCenterTransitFlg == null || !_nssBClassDtlByCenterTransitFlg.hasConditionQuery())
        { _nssBClassDtlByCenterTransitFlg = new BClassDtlNss(query().queryBClassDtlByCenterTransitFlg()); }
        return _nssBClassDtlByCenterTransitFlg;
    }

    protected BClassDtlNss _nssBClassDtlByForceFixedFlg;
    public BClassDtlNss xdfgetNssBClassDtlByForceFixedFlg() {
        if (_nssBClassDtlByForceFixedFlg == null) { _nssBClassDtlByForceFixedFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByForceFixedFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByForceFixedFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getBClassDtlByForceFixedFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByForceFixedFlg() {
        assertSetupSelectPurpose("bClassDtlByForceFixedFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnForceFixedFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByForceFixedFlg());
        if (_nssBClassDtlByForceFixedFlg == null || !_nssBClassDtlByForceFixedFlg.hasConditionQuery())
        { _nssBClassDtlByForceFixedFlg = new BClassDtlNss(query().queryBClassDtlByForceFixedFlg()); }
        return _nssBClassDtlByForceFixedFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPackingCalCls;
    public BClassDtlNss xdfgetNssBClassDtlByPackingCalCls() {
        if (_nssBClassDtlByPackingCalCls == null) { _nssBClassDtlByPackingCalCls = new BClassDtlNss(null); }
        return _nssBClassDtlByPackingCalCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPackingCalCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getBClassDtlByPackingCalCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPackingCalCls() {
        assertSetupSelectPurpose("bClassDtlByPackingCalCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingCalCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByPackingCalCls());
        if (_nssBClassDtlByPackingCalCls == null || !_nssBClassDtlByPackingCalCls.hasConditionQuery())
        { _nssBClassDtlByPackingCalCls = new BClassDtlNss(query().queryBClassDtlByPackingCalCls()); }
        return _nssBClassDtlByPackingCalCls;
    }

    protected BClassDtlNss _nssBClassDtlByPickingStatus;
    public BClassDtlNss xdfgetNssBClassDtlByPickingStatus() {
        if (_nssBClassDtlByPickingStatus == null) { _nssBClassDtlByPickingStatus = new BClassDtlNss(null); }
        return _nssBClassDtlByPickingStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPickingStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getBClassDtlByPickingStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPickingStatus() {
        assertSetupSelectPurpose("bClassDtlByPickingStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPickingStatus();
        }
        doSetupSelect(() -> query().queryBClassDtlByPickingStatus());
        if (_nssBClassDtlByPickingStatus == null || !_nssBClassDtlByPickingStatus.hasConditionQuery())
        { _nssBClassDtlByPickingStatus = new BClassDtlNss(query().queryBClassDtlByPickingStatus()); }
        return _nssBClassDtlByPickingStatus;
    }

    protected BClassDtlNss _nssBClassDtlBySglRowPicFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySglRowPicFlg() {
        if (_nssBClassDtlBySglRowPicFlg == null) { _nssBClassDtlBySglRowPicFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySglRowPicFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySglRowPicFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getBClassDtlBySglRowPicFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySglRowPicFlg() {
        assertSetupSelectPurpose("bClassDtlBySglRowPicFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSglRowPicFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySglRowPicFlg());
        if (_nssBClassDtlBySglRowPicFlg == null || !_nssBClassDtlBySglRowPicFlg.hasConditionQuery())
        { _nssBClassDtlBySglRowPicFlg = new BClassDtlNss(query().queryBClassDtlBySglRowPicFlg()); }
        return _nssBClassDtlBySglRowPicFlg;
    }

    protected TPickingRNss _nssTPickingRAsOne;
    public TPickingRNss xdfgetNssTPickingRAsOne() {
        if (_nssTPickingRAsOne == null) { _nssTPickingRAsOne = new TPickingRNss(null); }
        return _nssTPickingRAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TPickingRAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tPickingH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getTPickingRAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TPickingRNss setupSelect_TPickingRAsOne() {
        assertSetupSelectPurpose("tPickingRAsOne");
        doSetupSelect(() -> query().queryTPickingRAsOne());
        if (_nssTPickingRAsOne == null || !_nssTPickingRAsOne.hasConditionQuery())
        { _nssTPickingRAsOne = new TPickingRNss(query().queryTPickingRAsOne()); }
        return _nssTPickingRAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<TPickingHCQ> {
        protected MProcessTypeCB.HpSpecification _mProcessType;
        protected MCenterCB.HpSpecification _mCenter;
        protected MClientCB.HpSpecification _mClient;
        protected TAllocInstHCB.HpSpecification _tAllocInstH;
        protected BClassDtlCB.HpSpecification _bClassDtlByCenterTransitFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByForceFixedFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPackingCalCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByPickingStatus;
        protected BClassDtlCB.HpSpecification _bClassDtlBySglRowPicFlg;
        protected TPickingRCB.HpSpecification _tPickingRAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TPickingHCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingHId() { return doColumn("PICKING_H_ID"); }
        /**
         * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessTypeId() { return doColumn("PROCESS_TYPE_ID"); }
        /**
         * PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingStatus() { return doColumn("PICKING_STATUS"); }
        /**
         * DELIV_UNIT_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivUnitNo() { return doColumn("DELIV_UNIT_NO"); }
        /**
         * PICKING_WORK_NO: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingWorkNo() { return doColumn("PICKING_WORK_NO"); }
        /**
         * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocInstHId() { return doColumn("ALLOC_INST_H_ID"); }
        /**
         * FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnForceFixedFlg() { return doColumn("FORCE_FIXED_FLG"); }
        /**
         * PICKING_GROUP_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPickingGroupNo() { return doColumn("PICKING_GROUP_NO"); }
        /**
         * SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSglRowPicFlg() { return doColumn("SGL_ROW_PIC_FLG"); }
        /**
         * SHIPPING_FIXED_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingFixedDt() { return doColumn("SHIPPING_FIXED_DT"); }
        /**
         * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterTransitFlg() { return doColumn("CENTER_TRANSIT_FLG"); }
        /**
         * PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingCalCls() { return doColumn("PACKING_CAL_CLS"); }
        /**
         * BOL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBolNo() { return doColumn("BOL_NO"); }
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
            if (qyCall().qy().hasConditionQueryMProcessType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnProcessTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTAllocInstH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TAllocInstHCQ) {
                columnAllocInstHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCenterTransitFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCenterTransitFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByForceFixedFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnForceFixedFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPackingCalCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPackingCalCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPickingStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPickingStatus(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySglRowPicFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSglRowPicFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_PICKING_H"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProcessTypeCB.HpSpecification specifyMProcessType() {
            assertRelation("mProcessType");
            if (_mProcessType == null) {
                _mProcessType = new MProcessTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProcessType()
                                    , () -> _qyCall.qy().queryMProcessType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProcessType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProcessType()
                      , () -> xsyncQyCall().qy().queryMProcessType()));
                }
            }
            return _mProcessType;
        }
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
         * Prepare to specify functions about relation table. <br>
         * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TAllocInstHCB.HpSpecification specifyTAllocInstH() {
            assertRelation("tAllocInstH");
            if (_tAllocInstH == null) {
                _tAllocInstH = new TAllocInstHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTAllocInstH()
                                    , () -> _qyCall.qy().queryTAllocInstH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tAllocInstH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTAllocInstH()
                      , () -> xsyncQyCall().qy().queryTAllocInstH()));
                }
            }
            return _tAllocInstH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCenterTransitFlg() {
            assertRelation("bClassDtlByCenterTransitFlg");
            if (_bClassDtlByCenterTransitFlg == null) {
                _bClassDtlByCenterTransitFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCenterTransitFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCenterTransitFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCenterTransitFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCenterTransitFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCenterTransitFlg()));
                }
            }
            return _bClassDtlByCenterTransitFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByForceFixedFlg() {
            assertRelation("bClassDtlByForceFixedFlg");
            if (_bClassDtlByForceFixedFlg == null) {
                _bClassDtlByForceFixedFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByForceFixedFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByForceFixedFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByForceFixedFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByForceFixedFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByForceFixedFlg()));
                }
            }
            return _bClassDtlByForceFixedFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPackingCalCls() {
            assertRelation("bClassDtlByPackingCalCls");
            if (_bClassDtlByPackingCalCls == null) {
                _bClassDtlByPackingCalCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPackingCalCls()
                                    , () -> _qyCall.qy().queryBClassDtlByPackingCalCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPackingCalCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPackingCalCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPackingCalCls()));
                }
            }
            return _bClassDtlByPackingCalCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPickingStatus() {
            assertRelation("bClassDtlByPickingStatus");
            if (_bClassDtlByPickingStatus == null) {
                _bClassDtlByPickingStatus = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPickingStatus()
                                    , () -> _qyCall.qy().queryBClassDtlByPickingStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPickingStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPickingStatus()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPickingStatus()));
                }
            }
            return _bClassDtlByPickingStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySglRowPicFlg() {
            assertRelation("bClassDtlBySglRowPicFlg");
            if (_bClassDtlBySglRowPicFlg == null) {
                _bClassDtlBySglRowPicFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySglRowPicFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySglRowPicFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySglRowPicFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySglRowPicFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySglRowPicFlg()));
                }
            }
            return _bClassDtlBySglRowPicFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TPickingRCB.HpSpecification specifyTPickingRAsOne() {
            assertRelation("tPickingRAsOne");
            if (_tPickingRAsOne == null) {
                _tPickingRAsOne = new TPickingRCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTPickingRAsOne()
                                    , () -> _qyCall.qy().queryTPickingRAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tPickingRAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTPickingRAsOne()
                      , () -> xsyncQyCall().qy().queryTPickingRAsOne()));
                }
            }
            return _tPickingRAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PACKING_H where ...) as FOO_MAX} <br>
         * T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPackingH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPackingHCB, TPickingHCQ> derivedTPackingHList() {
            assertDerived("tPackingHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPackingHCB> sq, TPickingHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPackingHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PICKING_B where ...) as FOO_MAX} <br>
         * T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPickingB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPickingBCB, TPickingHCQ> derivedTPickingBList() {
            assertDerived("tPickingBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPickingBCB> sq, TPickingHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPickingBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PIC_MTHD_RCMD_DATA where ...) as FOO_MAX} <br>
         * T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     dataCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     dataCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPicMthdRcmdData.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPicMthdRcmdDataCB, TPickingHCQ> derivedTPicMthdRcmdDataList() {
            assertDerived("tPicMthdRcmdDataList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPicMthdRcmdDataCB> sq, TPickingHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPicMthdRcmdDataList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_RECEIVE_PLAN_H where ...) as FOO_MAX} <br>
         * T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, TPickingHCQ> derivedTReceivePlanHList() {
            assertDerived("tReceivePlanHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, TPickingHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SGL_ROW_SHIP_INSP_B where ...) as FOO_MAX} <br>
         * W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WSglRowShipInspB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WSglRowShipInspBCB, TPickingHCQ> derivedWSglRowShipInspBList() {
            assertDerived("wSglRowShipInspBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WSglRowShipInspBCB> sq, TPickingHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWSglRowShipInspBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TPickingHCB, TPickingHCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPickingHCB> sq, TPickingHCQ cq, String al, DerivedReferrerOption op)
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
    public TPickingHCB dreamCruiseCB() {
        TPickingHCB cb = new TPickingHCB();
        cb.xsetupForDreamCruise((TPickingHCB) this);
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
    public HpColQyOperand<TPickingHCB> columnQuery(final SpecifyQuery<TPickingHCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TPickingHCB xcreateColumnQueryCB() {
        TPickingHCB cb = new TPickingHCB();
        cb.xsetupForColumnQuery((TPickingHCB)this);
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
    public void orScopeQuery(OrQuery<TPickingHCB> orCBLambda) {
        xorSQ((TPickingHCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TPickingHCB> andCBLambda) {
        xorSQAP((TPickingHCB)this, andCBLambda);
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
        final TPickingHCB cb;
        if (mainCB != null) {
            cb = (TPickingHCB)mainCB;
        } else {
            cb = new TPickingHCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TPickingHCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TPickingHCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
