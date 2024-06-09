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
 * The base condition-bean of T_MOVE_INST_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTMoveInstBCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMoveInstBCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMoveInstBCB() {
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
        return "T_MOVE_INST_B";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param moveInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TMoveInstBCB acceptPK(Long moveInstBId) {
        assertObjectNotNull("moveInstBId", moveInstBId);
        BsTMoveInstBCB cb = this;
        cb.query().setMoveInstBId_Equal(moveInstBId);
        return (TMoveInstBCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param moveInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long moveInstBId) {
        assertObjectNotNull("moveInstBId", moveInstBId);
        BsTMoveInstBCB cb = this;
        cb.query().setMoveInstBId_Equal(moveInstBId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MoveInstBId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MoveInstBId_Desc();
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
    public TMoveInstBCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TMoveInstBCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TMoveInstBCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TMoveInstBCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TMoveInstBCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TMoveInstBCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TMoveInstBCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TMoveInstBCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TMoveInstBCB> unionCBLambda) {
        final TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TMoveInstBCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TMoveInstBCB> unionCBLambda) {
        final TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TMoveInstBCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MCustomerNss _nssMCustomerByDepositId;
    public MCustomerNss xdfgetNssMCustomerByDepositId() {
        if (_nssMCustomerByDepositId == null) { _nssMCustomerByDepositId = new MCustomerNss(null); }
        return _nssMCustomerByDepositId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerByDepositId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMCustomerByDepositId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerByDepositId() {
        assertSetupSelectPurpose("mCustomerByDepositId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDepositId();
        }
        doSetupSelect(() -> query().queryMCustomerByDepositId());
        if (_nssMCustomerByDepositId == null || !_nssMCustomerByDepositId.hasConditionQuery())
        { _nssMCustomerByDepositId = new MCustomerNss(query().queryMCustomerByDepositId()); }
        return _nssMCustomerByDepositId;
    }

    protected MLocationNss _nssMLocation;
    public MLocationNss xdfgetNssMLocation() {
        if (_nssMLocation == null) { _nssMLocation = new MLocationNss(null); }
        return _nssMLocation;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MLocation()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMLocation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MLocationNss setupSelect_MLocation() {
        assertSetupSelectPurpose("mLocation");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLocationId();
        }
        doSetupSelect(() -> query().queryMLocation());
        if (_nssMLocation == null || !_nssMLocation.hasConditionQuery())
        { _nssMLocation = new MLocationNss(query().queryMLocation()); }
        return _nssMLocation;
    }

    protected TLotNss _nssTLot;
    public TLotNss xdfgetNssTLot() {
        if (_nssTLot == null) { _nssTLot = new TLotNss(null); }
        return _nssTLot;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_LOT by my LOT_ID, named 'TLot'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TLot()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getTLot()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TLotNss setupSelect_TLot() {
        assertSetupSelectPurpose("tLot");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLotId();
        }
        doSetupSelect(() -> query().queryTLot());
        if (_nssTLot == null || !_nssTLot.hasConditionQuery())
        { _nssTLot = new TLotNss(query().queryTLot()); }
        return _nssTLot;
    }

    protected TMoveInstHNss _nssTMoveInstH;
    public TMoveInstHNss xdfgetNssTMoveInstH() {
        if (_nssTMoveInstH == null) { _nssTMoveInstH = new TMoveInstHNss(null); }
        return _nssTMoveInstH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TMoveInstH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getTMoveInstH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TMoveInstHNss setupSelect_TMoveInstH() {
        assertSetupSelectPurpose("tMoveInstH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMoveInstHId();
        }
        doSetupSelect(() -> query().queryTMoveInstH());
        if (_nssTMoveInstH == null || !_nssTMoveInstH.hasConditionQuery())
        { _nssTMoveInstH = new TMoveInstHNss(query().queryTMoveInstH()); }
        return _nssTMoveInstH;
    }

    protected MProductNss _nssMProduct;
    public MProductNss xdfgetNssMProduct() {
        if (_nssMProduct == null) { _nssMProduct = new MProductNss(null); }
        return _nssMProduct;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProduct()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProductNss setupSelect_MProduct() {
        assertSetupSelectPurpose("mProduct");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductId();
        }
        doSetupSelect(() -> query().queryMProduct());
        if (_nssMProduct == null || !_nssMProduct.hasConditionQuery())
        { _nssMProduct = new MProductNss(query().queryMProduct()); }
        return _nssMProduct;
    }

    protected MShapeNss _nssMShape;
    public MShapeNss xdfgetNssMShape() {
        if (_nssMShape == null) { _nssMShape = new MShapeNss(null); }
        return _nssMShape;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShape()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMShape()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MShapeNss setupSelect_MShape() {
        assertSetupSelectPurpose("mShape");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShapeId();
        }
        doSetupSelect(() -> query().queryMShape());
        if (_nssMShape == null || !_nssMShape.hasConditionQuery())
        { _nssMShape = new MShapeNss(query().queryMShape()); }
        return _nssMShape;
    }

    protected MStockTypeNss _nssMStockType;
    public MStockTypeNss xdfgetNssMStockType() {
        if (_nssMStockType == null) { _nssMStockType = new MStockTypeNss(null); }
        return _nssMStockType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MStockType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMStockType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MStockTypeNss setupSelect_MStockType() {
        assertSetupSelectPurpose("mStockType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockTypeId();
        }
        doSetupSelect(() -> query().queryMStockType());
        if (_nssMStockType == null || !_nssMStockType.hasConditionQuery())
        { _nssMStockType = new MStockTypeNss(query().queryMStockType()); }
        return _nssMStockType;
    }

    protected TStoreNoNss _nssTStoreNo;
    public TStoreNoNss xdfgetNssTStoreNo() {
        if (_nssTStoreNo == null) { _nssTStoreNo = new TStoreNoNss(null); }
        return _nssTStoreNo;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStoreNo()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getTStoreNo()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStoreNoNss setupSelect_TStoreNo() {
        assertSetupSelectPurpose("tStoreNo");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreNoId();
        }
        doSetupSelect(() -> query().queryTStoreNo());
        if (_nssTStoreNo == null || !_nssTStoreNo.hasConditionQuery())
        { _nssTStoreNo = new TStoreNoNss(query().queryTStoreNo()); }
        return _nssTStoreNo;
    }

    protected MCustomerNss _nssMCustomerBySupplierId;
    public MCustomerNss xdfgetNssMCustomerBySupplierId() {
        if (_nssMCustomerBySupplierId == null) { _nssMCustomerBySupplierId = new MCustomerNss(null); }
        return _nssMCustomerBySupplierId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerBySupplierId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMCustomerBySupplierId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerBySupplierId() {
        assertSetupSelectPurpose("mCustomerBySupplierId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSupplierId();
        }
        doSetupSelect(() -> query().queryMCustomerBySupplierId());
        if (_nssMCustomerBySupplierId == null || !_nssMCustomerBySupplierId.hasConditionQuery())
        { _nssMCustomerBySupplierId = new MCustomerNss(query().queryMCustomerBySupplierId()); }
        return _nssMCustomerBySupplierId;
    }

    protected MWarehouseNss _nssMWarehouse;
    public MWarehouseNss xdfgetNssMWarehouse() {
        if (_nssMWarehouse == null) { _nssMWarehouse = new MWarehouseNss(null); }
        return _nssMWarehouse;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MWarehouse()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getMWarehouse()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MWarehouseNss setupSelect_MWarehouse() {
        assertSetupSelectPurpose("mWarehouse");
        if (hasSpecifiedLocalColumn()) {
            specify().columnWarehouseId();
        }
        doSetupSelect(() -> query().queryMWarehouse());
        if (_nssMWarehouse == null || !_nssMWarehouse.hasConditionQuery())
        { _nssMWarehouse = new MWarehouseNss(query().queryMWarehouse()); }
        return _nssMWarehouse;
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
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInoutType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getBClassDtlByInoutType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByMoveInstStatus;
    public BClassDtlNss xdfgetNssBClassDtlByMoveInstStatus() {
        if (_nssBClassDtlByMoveInstStatus == null) { _nssBClassDtlByMoveInstStatus = new BClassDtlNss(null); }
        return _nssBClassDtlByMoveInstStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByMoveInstStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getBClassDtlByMoveInstStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByMoveInstStatus() {
        assertSetupSelectPurpose("bClassDtlByMoveInstStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMoveInstStatus();
        }
        doSetupSelect(() -> query().queryBClassDtlByMoveInstStatus());
        if (_nssBClassDtlByMoveInstStatus == null || !_nssBClassDtlByMoveInstStatus.hasConditionQuery())
        { _nssBClassDtlByMoveInstStatus = new BClassDtlNss(query().queryBClassDtlByMoveInstStatus()); }
        return _nssBClassDtlByMoveInstStatus;
    }

    protected TMoveInstBSubNss _nssTMoveInstBSubAsOne;
    public TMoveInstBSubNss xdfgetNssTMoveInstBSubAsOne() {
        if (_nssTMoveInstBSubAsOne == null) { _nssTMoveInstBSubAsOne = new TMoveInstBSubNss(null); }
        return _nssTMoveInstBSubAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TMoveInstBSubAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tMoveInstB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getTMoveInstBSubAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TMoveInstBSubNss setupSelect_TMoveInstBSubAsOne() {
        assertSetupSelectPurpose("tMoveInstBSubAsOne");
        doSetupSelect(() -> query().queryTMoveInstBSubAsOne());
        if (_nssTMoveInstBSubAsOne == null || !_nssTMoveInstBSubAsOne.hasConditionQuery())
        { _nssTMoveInstBSubAsOne = new TMoveInstBSubNss(query().queryTMoveInstBSubAsOne()); }
        return _nssTMoveInstBSubAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<TMoveInstBCQ> {
        protected MCustomerCB.HpSpecification _mCustomerByDepositId;
        protected MLocationCB.HpSpecification _mLocation;
        protected TLotCB.HpSpecification _tLot;
        protected TMoveInstHCB.HpSpecification _tMoveInstH;
        protected MProductCB.HpSpecification _mProduct;
        protected MShapeCB.HpSpecification _mShape;
        protected MStockTypeCB.HpSpecification _mStockType;
        protected TStoreNoCB.HpSpecification _tStoreNo;
        protected MCustomerCB.HpSpecification _mCustomerBySupplierId;
        protected MWarehouseCB.HpSpecification _mWarehouse;
        protected BClassDtlCB.HpSpecification _bClassDtlByInoutType;
        protected BClassDtlCB.HpSpecification _bClassDtlByMoveInstStatus;
        protected TMoveInstBSubCB.HpSpecification _tMoveInstBSubAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TMoveInstBCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveInstBId() { return doColumn("MOVE_INST_B_ID"); }
        /**
         * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveInstHId() { return doColumn("MOVE_INST_H_ID"); }
        /**
         * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveInstStatus() { return doColumn("MOVE_INST_STATUS"); }
        /**
         * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInoutType() { return doColumn("INOUT_TYPE"); }
        /**
         * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseId() { return doColumn("WAREHOUSE_ID"); }
        /**
         * WAREHOUSE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseCd() { return doColumn("WAREHOUSE_CD"); }
        /**
         * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * PRODUCT_CD: {IX, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockTypeId() { return doColumn("STOCK_TYPE_ID"); }
        /**
         * STOCK_TYPE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockTypeCd() { return doColumn("STOCK_TYPE_CD"); }
        /**
         * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationId() { return doColumn("LOCATION_ID"); }
        /**
         * LOCATION_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationCd() { return doColumn("LOCATION_CD"); }
        /**
         * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositId() { return doColumn("DEPOSIT_ID"); }
        /**
         * DEPOSIT_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositCd() { return doColumn("DEPOSIT_CD"); }
        /**
         * LOT_ID: {IX, bigint(19), FK to T_LOT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotId() { return doColumn("LOT_ID"); }
        /**
         * LOT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot() { return doColumn("LOT"); }
        /**
         * LIMIT_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDt() { return doColumn("LIMIT_DT"); }
        /**
         * STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreNoId() { return doColumn("STORE_NO_ID"); }
        /**
         * STORE_LABEL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLabelNo() { return doColumn("STORE_LABEL_NO"); }
        /**
         * STORE_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDt() { return doColumn("STORE_DT"); }
        /**
         * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierId() { return doColumn("SUPPLIER_ID"); }
        /**
         * SUPPLIER_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierCd() { return doColumn("SUPPLIER_CD"); }
        /**
         * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeId() { return doColumn("SHAPE_ID"); }
        /**
         * SHAPE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeCd() { return doColumn("SHAPE_CD"); }
        /**
         * UNIT_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitNum() { return doColumn("UNIT_NUM"); }
        /**
         * INST_NUM: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInstNum() { return doColumn("INST_NUM"); }
        /**
         * LOT1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot1() { return doColumn("LOT1"); }
        /**
         * LOT2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot2() { return doColumn("LOT2"); }
        /**
         * LOT3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot3() { return doColumn("LOT3"); }
        /**
         * LOT4: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot4() { return doColumn("LOT4"); }
        /**
         * DAMAGEFLG: {NotNull, char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDamageflg() { return doColumn("DAMAGEFLG"); }
        /**
         * NOSHIPPINGFLG: {NotNull, char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoshippingflg() { return doColumn("NOSHIPPINGFLG"); }
        /**
         * FOREIGNCARGOFLG: {NotNull, char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnForeigncargoflg() { return doColumn("FOREIGNCARGOFLG"); }
        /**
         * CUSTOMSRELEASEFLG: {NotNull, char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomsreleaseflg() { return doColumn("CUSTOMSRELEASEFLG"); }
        /**
         * TAXFLG: {NotNull, char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTaxflg() { return doColumn("TAXFLG"); }
        /**
         * TRANCEPORT_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTranceportCd() { return doColumn("TRANCEPORT_CD"); }
        /**
         * SOURCE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSourceCd() { return doColumn("SOURCE_CD"); }
        /**
         * SOURCE_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSourceNm() { return doColumn("SOURCE_NM"); }
        /**
         * SCH_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSchDt() { return doColumn("SCH_DT"); }
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
            columnMoveInstBId(); // PK
            if (qyCall().qy().hasConditionQueryMCustomerByDepositId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnDepositId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMLocation()
                    || qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnLocationId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTLot()
                    || qyCall().qy().xgetReferrerQuery() instanceof TLotCQ) {
                columnLotId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTMoveInstH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TMoveInstHCQ) {
                columnMoveInstHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMShape()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeCQ) {
                columnShapeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMStockType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MStockTypeCQ) {
                columnStockTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTStoreNo()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStoreNoCQ) {
                columnStoreNoId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomerBySupplierId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnSupplierId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMWarehouse()
                    || qyCall().qy().xgetReferrerQuery() instanceof MWarehouseCQ) {
                columnWarehouseId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInoutType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInoutType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByMoveInstStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnMoveInstStatus(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_MOVE_INST_B"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerByDepositId() {
            assertRelation("mCustomerByDepositId");
            if (_mCustomerByDepositId == null) {
                _mCustomerByDepositId = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerByDepositId()
                                    , () -> _qyCall.qy().queryMCustomerByDepositId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerByDepositId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerByDepositId()
                      , () -> xsyncQyCall().qy().queryMCustomerByDepositId()));
                }
            }
            return _mCustomerByDepositId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_LOCATION by my LOCATION_ID, named 'MLocation'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MLocationCB.HpSpecification specifyMLocation() {
            assertRelation("mLocation");
            if (_mLocation == null) {
                _mLocation = new MLocationCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMLocation()
                                    , () -> _qyCall.qy().queryMLocation())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mLocation.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMLocation()
                      , () -> xsyncQyCall().qy().queryMLocation()));
                }
            }
            return _mLocation;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_LOT by my LOT_ID, named 'TLot'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TLotCB.HpSpecification specifyTLot() {
            assertRelation("tLot");
            if (_tLot == null) {
                _tLot = new TLotCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTLot()
                                    , () -> _qyCall.qy().queryTLot())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tLot.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTLot()
                      , () -> xsyncQyCall().qy().queryTLot()));
                }
            }
            return _tLot;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TMoveInstHCB.HpSpecification specifyTMoveInstH() {
            assertRelation("tMoveInstH");
            if (_tMoveInstH == null) {
                _tMoveInstH = new TMoveInstHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTMoveInstH()
                                    , () -> _qyCall.qy().queryTMoveInstH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tMoveInstH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTMoveInstH()
                      , () -> xsyncQyCall().qy().queryTMoveInstH()));
                }
            }
            return _tMoveInstH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProductCB.HpSpecification specifyMProduct() {
            assertRelation("mProduct");
            if (_mProduct == null) {
                _mProduct = new MProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProduct()
                                    , () -> _qyCall.qy().queryMProduct())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProduct.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProduct()
                      , () -> xsyncQyCall().qy().queryMProduct()));
                }
            }
            return _mProduct;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_SHAPE by my SHAPE_ID, named 'MShape'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MShapeCB.HpSpecification specifyMShape() {
            assertRelation("mShape");
            if (_mShape == null) {
                _mShape = new MShapeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMShape()
                                    , () -> _qyCall.qy().queryMShape())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mShape.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMShape()
                      , () -> xsyncQyCall().qy().queryMShape()));
                }
            }
            return _mShape;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MStockTypeCB.HpSpecification specifyMStockType() {
            assertRelation("mStockType");
            if (_mStockType == null) {
                _mStockType = new MStockTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMStockType()
                                    , () -> _qyCall.qy().queryMStockType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mStockType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMStockType()
                      , () -> xsyncQyCall().qy().queryMStockType()));
                }
            }
            return _mStockType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStoreNoCB.HpSpecification specifyTStoreNo() {
            assertRelation("tStoreNo");
            if (_tStoreNo == null) {
                _tStoreNo = new TStoreNoCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStoreNo()
                                    , () -> _qyCall.qy().queryTStoreNo())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStoreNo.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStoreNo()
                      , () -> xsyncQyCall().qy().queryTStoreNo()));
                }
            }
            return _tStoreNo;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerBySupplierId() {
            assertRelation("mCustomerBySupplierId");
            if (_mCustomerBySupplierId == null) {
                _mCustomerBySupplierId = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerBySupplierId()
                                    , () -> _qyCall.qy().queryMCustomerBySupplierId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerBySupplierId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerBySupplierId()
                      , () -> xsyncQyCall().qy().queryMCustomerBySupplierId()));
                }
            }
            return _mCustomerBySupplierId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MWarehouseCB.HpSpecification specifyMWarehouse() {
            assertRelation("mWarehouse");
            if (_mWarehouse == null) {
                _mWarehouse = new MWarehouseCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMWarehouse()
                                    , () -> _qyCall.qy().queryMWarehouse())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mWarehouse.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMWarehouse()
                      , () -> xsyncQyCall().qy().queryMWarehouse()));
                }
            }
            return _mWarehouse;
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
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByMoveInstStatus() {
            assertRelation("bClassDtlByMoveInstStatus");
            if (_bClassDtlByMoveInstStatus == null) {
                _bClassDtlByMoveInstStatus = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByMoveInstStatus()
                                    , () -> _qyCall.qy().queryBClassDtlByMoveInstStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByMoveInstStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByMoveInstStatus()
                      , () -> xsyncQyCall().qy().queryBClassDtlByMoveInstStatus()));
                }
            }
            return _bClassDtlByMoveInstStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TMoveInstBSubCB.HpSpecification specifyTMoveInstBSubAsOne() {
            assertRelation("tMoveInstBSubAsOne");
            if (_tMoveInstBSubAsOne == null) {
                _tMoveInstBSubAsOne = new TMoveInstBSubCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTMoveInstBSubAsOne()
                                    , () -> _qyCall.qy().queryTMoveInstBSubAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tMoveInstBSubAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTMoveInstBSubAsOne()
                      , () -> xsyncQyCall().qy().queryTMoveInstBSubAsOne()));
                }
            }
            return _tMoveInstBSubAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_MOVE_RECORD_B where ...) as FOO_MAX} <br>
         * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveRecordB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveRecordBCB, TMoveInstBCQ> derivedTMoveRecordBList() {
            assertDerived("tMoveRecordBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveRecordBCB> sq, TMoveInstBCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveRecordBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, TMoveInstBCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, TMoveInstBCQ cq, String al, DerivedReferrerOption op)
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
    public TMoveInstBCB dreamCruiseCB() {
        TMoveInstBCB cb = new TMoveInstBCB();
        cb.xsetupForDreamCruise((TMoveInstBCB) this);
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
    public HpColQyOperand<TMoveInstBCB> columnQuery(final SpecifyQuery<TMoveInstBCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TMoveInstBCB xcreateColumnQueryCB() {
        TMoveInstBCB cb = new TMoveInstBCB();
        cb.xsetupForColumnQuery((TMoveInstBCB)this);
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
    public void orScopeQuery(OrQuery<TMoveInstBCB> orCBLambda) {
        xorSQ((TMoveInstBCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TMoveInstBCB> andCBLambda) {
        xorSQAP((TMoveInstBCB)this, andCBLambda);
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
        final TMoveInstBCB cb;
        if (mainCB != null) {
            cb = (TMoveInstBCB)mainCB;
        } else {
            cb = new TMoveInstBCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TMoveInstBCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TMoveInstBCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
