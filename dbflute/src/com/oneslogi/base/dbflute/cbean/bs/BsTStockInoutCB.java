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
 * The base condition-bean of T_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStockInoutCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStockInoutCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockInoutCB() {
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
        return "T_STOCK_INOUT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param stockInoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TStockInoutCB acceptPK(Long stockInoutId) {
        assertObjectNotNull("stockInoutId", stockInoutId);
        BsTStockInoutCB cb = this;
        cb.query().setStockInoutId_Equal(stockInoutId);
        return (TStockInoutCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param stockInoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long stockInoutId) {
        assertObjectNotNull("stockInoutId", stockInoutId);
        BsTStockInoutCB cb = this;
        cb.query().setStockInoutId_Equal(stockInoutId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StockInoutId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StockInoutId_Desc();
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
    public TStockInoutCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TStockInoutCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TStockInoutCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TStockInoutCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TStockInoutCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TStockInoutCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TStockInoutCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TStockInoutCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TStockInoutCB> unionCBLambda) {
        final TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TStockInoutCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TStockInoutCB> unionCBLambda) {
        final TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TStockInoutCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TAllocInstBNss _nssTAllocInstB;
    public TAllocInstBNss xdfgetNssTAllocInstB() {
        if (_nssTAllocInstB == null) { _nssTAllocInstB = new TAllocInstBNss(null); }
        return _nssTAllocInstB;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TAllocInstB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getTAllocInstB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TAllocInstBNss setupSelect_TAllocInstB() {
        assertSetupSelectPurpose("tAllocInstB");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAllocInstBId();
        }
        doSetupSelect(() -> query().queryTAllocInstB());
        if (_nssTAllocInstB == null || !_nssTAllocInstB.hasConditionQuery())
        { _nssTAllocInstB = new TAllocInstBNss(query().queryTAllocInstB()); }
        return _nssTAllocInstB;
    }

    protected TStockInoutNss _nssTStockInoutByBfStockInoutIdSelf;
    public TStockInoutNss xdfgetNssTStockInoutByBfStockInoutIdSelf() {
        if (_nssTStockInoutByBfStockInoutIdSelf == null) { _nssTStockInoutByBfStockInoutIdSelf = new TStockInoutNss(null); }
        return _nssTStockInoutByBfStockInoutIdSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStockInoutByBfStockInoutIdSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getTStockInoutByBfStockInoutIdSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStockInoutNss setupSelect_TStockInoutByBfStockInoutIdSelf() {
        assertSetupSelectPurpose("tStockInoutByBfStockInoutIdSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnBfStockInoutId();
        }
        doSetupSelect(() -> query().queryTStockInoutByBfStockInoutIdSelf());
        if (_nssTStockInoutByBfStockInoutIdSelf == null || !_nssTStockInoutByBfStockInoutIdSelf.hasConditionQuery())
        { _nssTStockInoutByBfStockInoutIdSelf = new TStockInoutNss(query().queryTStockInoutByBfStockInoutIdSelf()); }
        return _nssTStockInoutByBfStockInoutIdSelf;
    }

    protected TStockInoutNss _nssTStockInoutByFsStockInoutIdSelf;
    public TStockInoutNss xdfgetNssTStockInoutByFsStockInoutIdSelf() {
        if (_nssTStockInoutByFsStockInoutIdSelf == null) { _nssTStockInoutByFsStockInoutIdSelf = new TStockInoutNss(null); }
        return _nssTStockInoutByFsStockInoutIdSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStockInoutByFsStockInoutIdSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getTStockInoutByFsStockInoutIdSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStockInoutNss setupSelect_TStockInoutByFsStockInoutIdSelf() {
        assertSetupSelectPurpose("tStockInoutByFsStockInoutIdSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFsStockInoutId();
        }
        doSetupSelect(() -> query().queryTStockInoutByFsStockInoutIdSelf());
        if (_nssTStockInoutByFsStockInoutIdSelf == null || !_nssTStockInoutByFsStockInoutIdSelf.hasConditionQuery())
        { _nssTStockInoutByFsStockInoutIdSelf = new TStockInoutNss(query().queryTStockInoutByFsStockInoutIdSelf()); }
        return _nssTStockInoutByFsStockInoutIdSelf;
    }

    protected TMoveRecordBNss _nssTMoveRecordB;
    public TMoveRecordBNss xdfgetNssTMoveRecordB() {
        if (_nssTMoveRecordB == null) { _nssTMoveRecordB = new TMoveRecordBNss(null); }
        return _nssTMoveRecordB;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TMoveRecordB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getTMoveRecordB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TMoveRecordBNss setupSelect_TMoveRecordB() {
        assertSetupSelectPurpose("tMoveRecordB");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMoveRecordBId();
        }
        doSetupSelect(() -> query().queryTMoveRecordB());
        if (_nssTMoveRecordB == null || !_nssTMoveRecordB.hasConditionQuery())
        { _nssTMoveRecordB = new TMoveRecordBNss(query().queryTMoveRecordB()); }
        return _nssTMoveRecordB;
    }

    protected MProcessTypeNss _nssMProcessType;
    public MProcessTypeNss xdfgetNssMProcessType() {
        if (_nssMProcessType == null) { _nssMProcessType = new MProcessTypeNss(null); }
        return _nssMProcessType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProcessType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getMProcessType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected TStockNss _nssTStock;
    public TStockNss xdfgetNssTStock() {
        if (_nssTStock == null) { _nssTStock = new TStockNss(null); }
        return _nssTStock;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStock()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getTStock()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStockNss setupSelect_TStock() {
        assertSetupSelectPurpose("tStock");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockId();
        }
        doSetupSelect(() -> query().queryTStock());
        if (_nssTStock == null || !_nssTStock.hasConditionQuery())
        { _nssTStock = new TStockNss(query().queryTStock()); }
        return _nssTStock;
    }

    protected TStoreRecordBNss _nssTStoreRecordB;
    public TStoreRecordBNss xdfgetNssTStoreRecordB() {
        if (_nssTStoreRecordB == null) { _nssTStoreRecordB = new TStoreRecordBNss(null); }
        return _nssTStoreRecordB;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStoreRecordB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getTStoreRecordB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStoreRecordBNss setupSelect_TStoreRecordB() {
        assertSetupSelectPurpose("tStoreRecordB");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreRecordBId();
        }
        doSetupSelect(() -> query().queryTStoreRecordB());
        if (_nssTStoreRecordB == null || !_nssTStoreRecordB.hasConditionQuery())
        { _nssTStoreRecordB = new TStoreRecordBNss(query().queryTStoreRecordB()); }
        return _nssTStoreRecordB;
    }

    protected BClassDtlNss _nssBClassDtlByCorrectType;
    public BClassDtlNss xdfgetNssBClassDtlByCorrectType() {
        if (_nssBClassDtlByCorrectType == null) { _nssBClassDtlByCorrectType = new BClassDtlNss(null); }
        return _nssBClassDtlByCorrectType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCorrectType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getBClassDtlByCorrectType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCorrectType() {
        assertSetupSelectPurpose("bClassDtlByCorrectType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCorrectType();
        }
        doSetupSelect(() -> query().queryBClassDtlByCorrectType());
        if (_nssBClassDtlByCorrectType == null || !_nssBClassDtlByCorrectType.hasConditionQuery())
        { _nssBClassDtlByCorrectType = new BClassDtlNss(query().queryBClassDtlByCorrectType()); }
        return _nssBClassDtlByCorrectType;
    }

    protected BClassDtlNss _nssBClassDtlByInoutType;
    public BClassDtlNss xdfgetNssBClassDtlByInoutType() {
        if (_nssBClassDtlByInoutType == null) { _nssBClassDtlByInoutType = new BClassDtlNss(null); }
        return _nssBClassDtlByInoutType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * <pre>
     * <span style="color: #0000C0">tStockInoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInoutType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStockInout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStockInout</span>.<span style="color: #CC4747">getBClassDtlByInoutType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInoutType() {
        assertSetupSelectPurpose("bClassDtlByInoutType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInoutType();
        }
        doSetupSelect(() -> query().queryBClassDtlByInoutType());
        if (_nssBClassDtlByInoutType == null || !_nssBClassDtlByInoutType.hasConditionQuery())
        { _nssBClassDtlByInoutType = new BClassDtlNss(query().queryBClassDtlByInoutType()); }
        return _nssBClassDtlByInoutType;
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

    public static class HpSpecification extends HpAbstractSpecification<TStockInoutCQ> {
        protected TAllocInstBCB.HpSpecification _tAllocInstB;
        protected TStockInoutCB.HpSpecification _tStockInoutByBfStockInoutIdSelf;
        protected TStockInoutCB.HpSpecification _tStockInoutByFsStockInoutIdSelf;
        protected TMoveRecordBCB.HpSpecification _tMoveRecordB;
        protected MProcessTypeCB.HpSpecification _mProcessType;
        protected TStockCB.HpSpecification _tStock;
        protected TStoreRecordBCB.HpSpecification _tStoreRecordB;
        protected BClassDtlCB.HpSpecification _bClassDtlByCorrectType;
        protected BClassDtlCB.HpSpecification _bClassDtlByInoutType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TStockInoutCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockInoutId() { return doColumn("STOCK_INOUT_ID"); }
        /**
         * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFsStockInoutId() { return doColumn("FS_STOCK_INOUT_ID"); }
        /**
         * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBfStockInoutId() { return doColumn("BF_STOCK_INOUT_ID"); }
        /**
         * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveRecordBId() { return doColumn("MOVE_RECORD_B_ID"); }
        /**
         * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordBId() { return doColumn("STORE_RECORD_B_ID"); }
        /**
         * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocInstBId() { return doColumn("ALLOC_INST_B_ID"); }
        /**
         * PROCESS_DT: {IX, NotNull, varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessDt() { return doColumn("PROCESS_DT"); }
        /**
         * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessTypeId() { return doColumn("PROCESS_TYPE_ID"); }
        /**
         * PROCESS_NO: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessNo() { return doColumn("PROCESS_NO"); }
        /**
         * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCorrectType() { return doColumn("CORRECT_TYPE"); }
        /**
         * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockId() { return doColumn("STOCK_ID"); }
        /**
         * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInoutType() { return doColumn("INOUT_TYPE"); }
        /**
         * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockInoutNum() { return doColumn("STOCK_INOUT_NUM"); }
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
            columnStockInoutId(); // PK
            if (qyCall().qy().hasConditionQueryTAllocInstB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TAllocInstBCQ) {
                columnAllocInstBId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTStockInoutByBfStockInoutIdSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStockInoutCQ) {
                columnBfStockInoutId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTStockInoutByFsStockInoutIdSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStockInoutCQ) {
                columnFsStockInoutId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTMoveRecordB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TMoveRecordBCQ) {
                columnMoveRecordBId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMProcessType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProcessTypeCQ) {
                columnProcessTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTStock()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStockCQ) {
                columnStockId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTStoreRecordB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStoreRecordBCQ) {
                columnStoreRecordBId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCorrectType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCorrectType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInoutType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInoutType(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_STOCK_INOUT"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TAllocInstBCB.HpSpecification specifyTAllocInstB() {
            assertRelation("tAllocInstB");
            if (_tAllocInstB == null) {
                _tAllocInstB = new TAllocInstBCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTAllocInstB()
                                    , () -> _qyCall.qy().queryTAllocInstB())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tAllocInstB.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTAllocInstB()
                      , () -> xsyncQyCall().qy().queryTAllocInstB()));
                }
            }
            return _tAllocInstB;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStockInoutCB.HpSpecification specifyTStockInoutByBfStockInoutIdSelf() {
            assertRelation("tStockInoutByBfStockInoutIdSelf");
            if (_tStockInoutByBfStockInoutIdSelf == null) {
                _tStockInoutByBfStockInoutIdSelf = new TStockInoutCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStockInoutByBfStockInoutIdSelf()
                                    , () -> _qyCall.qy().queryTStockInoutByBfStockInoutIdSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStockInoutByBfStockInoutIdSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStockInoutByBfStockInoutIdSelf()
                      , () -> xsyncQyCall().qy().queryTStockInoutByBfStockInoutIdSelf()));
                }
            }
            return _tStockInoutByBfStockInoutIdSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStockInoutCB.HpSpecification specifyTStockInoutByFsStockInoutIdSelf() {
            assertRelation("tStockInoutByFsStockInoutIdSelf");
            if (_tStockInoutByFsStockInoutIdSelf == null) {
                _tStockInoutByFsStockInoutIdSelf = new TStockInoutCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStockInoutByFsStockInoutIdSelf()
                                    , () -> _qyCall.qy().queryTStockInoutByFsStockInoutIdSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStockInoutByFsStockInoutIdSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStockInoutByFsStockInoutIdSelf()
                      , () -> xsyncQyCall().qy().queryTStockInoutByFsStockInoutIdSelf()));
                }
            }
            return _tStockInoutByFsStockInoutIdSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TMoveRecordBCB.HpSpecification specifyTMoveRecordB() {
            assertRelation("tMoveRecordB");
            if (_tMoveRecordB == null) {
                _tMoveRecordB = new TMoveRecordBCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTMoveRecordB()
                                    , () -> _qyCall.qy().queryTMoveRecordB())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tMoveRecordB.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTMoveRecordB()
                      , () -> xsyncQyCall().qy().queryTMoveRecordB()));
                }
            }
            return _tMoveRecordB;
        }
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
         * T_STOCK by my STOCK_ID, named 'TStock'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStockCB.HpSpecification specifyTStock() {
            assertRelation("tStock");
            if (_tStock == null) {
                _tStock = new TStockCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStock()
                                    , () -> _qyCall.qy().queryTStock())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStock.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStock()
                      , () -> xsyncQyCall().qy().queryTStock()));
                }
            }
            return _tStock;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStoreRecordBCB.HpSpecification specifyTStoreRecordB() {
            assertRelation("tStoreRecordB");
            if (_tStoreRecordB == null) {
                _tStoreRecordB = new TStoreRecordBCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStoreRecordB()
                                    , () -> _qyCall.qy().queryTStoreRecordB())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStoreRecordB.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStoreRecordB()
                      , () -> xsyncQyCall().qy().queryTStoreRecordB()));
                }
            }
            return _tStoreRecordB;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCorrectType() {
            assertRelation("bClassDtlByCorrectType");
            if (_bClassDtlByCorrectType == null) {
                _bClassDtlByCorrectType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCorrectType()
                                    , () -> _qyCall.qy().queryBClassDtlByCorrectType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCorrectType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCorrectType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCorrectType()));
                }
            }
            return _bClassDtlByCorrectType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInoutType() {
            assertRelation("bClassDtlByInoutType");
            if (_bClassDtlByInoutType == null) {
                _bClassDtlByInoutType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInoutType()
                                    , () -> _qyCall.qy().queryBClassDtlByInoutType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInoutType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInoutType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInoutType()));
                }
            }
            return _bClassDtlByInoutType;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STOCK_INOUT where ...) as FOO_MAX} <br>
         * T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inoutCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inoutCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStockInout.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockInoutCB, TStockInoutCQ> derivedTStockInoutByBfStockInoutIdSelfList() {
            assertDerived("tStockInoutByBfStockInoutIdSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockInoutCB> sq, TStockInoutCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockInoutByBfStockInoutIdSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STOCK_INOUT where ...) as FOO_MAX} <br>
         * T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inoutCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inoutCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStockInout.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockInoutCB, TStockInoutCQ> derivedTStockInoutByFsStockInoutIdSelfList() {
            assertDerived("tStockInoutByFsStockInoutIdSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockInoutCB> sq, TStockInoutCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockInoutByFsStockInoutIdSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TStockInoutCB, TStockInoutCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockInoutCB> sq, TStockInoutCQ cq, String al, DerivedReferrerOption op)
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
    public TStockInoutCB dreamCruiseCB() {
        TStockInoutCB cb = new TStockInoutCB();
        cb.xsetupForDreamCruise((TStockInoutCB) this);
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
    public HpColQyOperand<TStockInoutCB> columnQuery(final SpecifyQuery<TStockInoutCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TStockInoutCB xcreateColumnQueryCB() {
        TStockInoutCB cb = new TStockInoutCB();
        cb.xsetupForColumnQuery((TStockInoutCB)this);
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
    public void orScopeQuery(OrQuery<TStockInoutCB> orCBLambda) {
        xorSQ((TStockInoutCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TStockInoutCB> andCBLambda) {
        xorSQAP((TStockInoutCB)this, andCBLambda);
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
        final TStockInoutCB cb;
        if (mainCB != null) {
            cb = (TStockInoutCB)mainCB;
        } else {
            cb = new TStockInoutCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TStockInoutCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TStockInoutCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
