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
 * The base condition-bean of T_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryBCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryBCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryBCB() {
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
        return "T_INVENTORY_B";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param inventoryBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TInventoryBCB acceptPK(Long inventoryBId) {
        assertObjectNotNull("inventoryBId", inventoryBId);
        BsTInventoryBCB cb = this;
        cb.query().setInventoryBId_Equal(inventoryBId);
        return (TInventoryBCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param inventoryBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long inventoryBId) {
        assertObjectNotNull("inventoryBId", inventoryBId);
        BsTInventoryBCB cb = this;
        cb.query().setInventoryBId_Equal(inventoryBId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_InventoryBId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_InventoryBId_Desc();
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
    public TInventoryBCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TInventoryBCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TInventoryBCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TInventoryBCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TInventoryBCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TInventoryBCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TInventoryBCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TInventoryBCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TInventoryBCB> unionCBLambda) {
        final TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TInventoryBCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TInventoryBCB> unionCBLambda) {
        final TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TInventoryBCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerByDepositId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMCustomerByDepositId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected TInventoryHNss _nssTInventoryH;
    public TInventoryHNss xdfgetNssTInventoryH() {
        if (_nssTInventoryH == null) { _nssTInventoryH = new TInventoryHNss(null); }
        return _nssTInventoryH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TInventoryH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTInventoryH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TInventoryHNss setupSelect_TInventoryH() {
        assertSetupSelectPurpose("tInventoryH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInventoryHId();
        }
        doSetupSelect(() -> query().queryTInventoryH());
        if (_nssTInventoryH == null || !_nssTInventoryH.hasConditionQuery())
        { _nssTInventoryH = new TInventoryHNss(query().queryTInventoryH()); }
        return _nssTInventoryH;
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MLocation()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMLocation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TLot()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTLot()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TMoveInstH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTMoveInstH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProduct()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShape()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMShape()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected TStockNss _nssTStock;
    public TStockNss xdfgetNssTStock() {
        if (_nssTStock == null) { _nssTStock = new TStockNss(null); }
        return _nssTStock;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStock()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTStock()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MStockTypeNss _nssMStockType;
    public MStockTypeNss xdfgetNssMStockType() {
        if (_nssMStockType == null) { _nssMStockType = new MStockTypeNss(null); }
        return _nssMStockType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MStockType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMStockType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStoreNo()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTStoreNo()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerBySupplierId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMCustomerBySupplierId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MWarehouse()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getMWarehouse()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByInputType;
    public BClassDtlNss xdfgetNssBClassDtlByInputType() {
        if (_nssBClassDtlByInputType == null) { _nssBClassDtlByInputType = new BClassDtlNss(null); }
        return _nssBClassDtlByInputType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInputType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getBClassDtlByInputType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInputType() {
        assertSetupSelectPurpose("bClassDtlByInputType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInputType();
        }
        doSetupSelect(() -> query().queryBClassDtlByInputType());
        if (_nssBClassDtlByInputType == null || !_nssBClassDtlByInputType.hasConditionQuery())
        { _nssBClassDtlByInputType = new BClassDtlNss(query().queryBClassDtlByInputType()); }
        return _nssBClassDtlByInputType;
    }

    protected BClassDtlNss _nssBClassDtlByStockAdjustFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStockAdjustFlg() {
        if (_nssBClassDtlByStockAdjustFlg == null) { _nssBClassDtlByStockAdjustFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStockAdjustFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockAdjustFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getBClassDtlByStockAdjustFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStockAdjustFlg() {
        assertSetupSelectPurpose("bClassDtlByStockAdjustFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockAdjustFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStockAdjustFlg());
        if (_nssBClassDtlByStockAdjustFlg == null || !_nssBClassDtlByStockAdjustFlg.hasConditionQuery())
        { _nssBClassDtlByStockAdjustFlg = new BClassDtlNss(query().queryBClassDtlByStockAdjustFlg()); }
        return _nssBClassDtlByStockAdjustFlg;
    }

    protected TInventoryRNss _nssTInventoryRAsOne;
    public TInventoryRNss xdfgetNssTInventoryRAsOne() {
        if (_nssTInventoryRAsOne == null) { _nssTInventoryRAsOne = new TInventoryRNss(null); }
        return _nssTInventoryRAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TInventoryRAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTInventoryRAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TInventoryRNss setupSelect_TInventoryRAsOne() {
        assertSetupSelectPurpose("tInventoryRAsOne");
        doSetupSelect(() -> query().queryTInventoryRAsOne());
        if (_nssTInventoryRAsOne == null || !_nssTInventoryRAsOne.hasConditionQuery())
        { _nssTInventoryRAsOne = new TInventoryRNss(query().queryTInventoryRAsOne()); }
        return _nssTInventoryRAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<TInventoryBCQ> {
        protected MCustomerCB.HpSpecification _mCustomerByDepositId;
        protected TInventoryHCB.HpSpecification _tInventoryH;
        protected MLocationCB.HpSpecification _mLocation;
        protected TLotCB.HpSpecification _tLot;
        protected TMoveInstHCB.HpSpecification _tMoveInstH;
        protected MProductCB.HpSpecification _mProduct;
        protected MShapeCB.HpSpecification _mShape;
        protected TStockCB.HpSpecification _tStock;
        protected MStockTypeCB.HpSpecification _mStockType;
        protected TStoreNoCB.HpSpecification _tStoreNo;
        protected MCustomerCB.HpSpecification _mCustomerBySupplierId;
        protected MWarehouseCB.HpSpecification _mWarehouse;
        protected BClassDtlCB.HpSpecification _bClassDtlByInputType;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockAdjustFlg;
        protected TInventoryRCB.HpSpecification _tInventoryRAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TInventoryBCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInventoryBId() { return doColumn("INVENTORY_B_ID"); }
        /**
         * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInventoryHId() { return doColumn("INVENTORY_H_ID"); }
        /**
         * STOCK_ID: {IX, bigint(19), FK to T_STOCK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockId() { return doColumn("STOCK_ID"); }
        /**
         * WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseId() { return doColumn("WAREHOUSE_ID"); }
        /**
         * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockTypeId() { return doColumn("STOCK_TYPE_ID"); }
        /**
         * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationId() { return doColumn("LOCATION_ID"); }
        /**
         * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositId() { return doColumn("DEPOSIT_ID"); }
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
         * STORE_LABEL_NO: {IX, varchar(30)}
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
         * UNIT_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitNum() { return doColumn("UNIT_NUM"); }
        /**
         * CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnChargeNum() { return doColumn("CHARGE_NUM"); }
        /**
         * ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocNum() { return doColumn("ALLOC_NUM"); }
        /**
         * MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveNum() { return doColumn("MOVE_NUM"); }
        /**
         * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInventoryNum() { return doColumn("INVENTORY_NUM"); }
        /**
         * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInputType() { return doColumn("INPUT_TYPE"); }
        /**
         * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockAdjustFlg() { return doColumn("STOCK_ADJUST_FLG"); }
        /**
         * MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveInstHId() { return doColumn("MOVE_INST_H_ID"); }
        /**
         * PRODUCT_CD: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * FIRMTRANSPORT_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFirmtransportCd() { return doColumn("FIRMTRANSPORT_CD"); }
        /**
         * MANUFACTURE_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnManufactureDt() { return doColumn("MANUFACTURE_DT"); }
        /**
         * MANUFACTURE_SYMBOL: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnManufactureSymbol() { return doColumn("MANUFACTURE_SYMBOL"); }
        /**
         * FCFLG: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFcflg() { return doColumn("FCFLG"); }
        /**
         * DIFFQTY_HENPIN: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDiffqtyHenpin() { return doColumn("DIFFQTY_HENPIN"); }
        /**
         * DIFFQTY_TAXREFOND: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDiffqtyTaxrefond() { return doColumn("DIFFQTY_TAXREFOND"); }
        /**
         * SUFFERER_QTY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSuffererQty() { return doColumn("SUFFERER_QTY"); }
        /**
         * MONTH_STATUSSU: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMonthStatussu() { return doColumn("MONTH_STATUSSU"); }
        /**
         * BLUK_RECIVED_QTY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBlukRecivedQty() { return doColumn("BLUK_RECIVED_QTY"); }
        /**
         * REFUNDITEM_QTY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRefunditemQty() { return doColumn("REFUNDITEM_QTY"); }
        /**
         * INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInventoryInputFlg() { return doColumn("INVENTORY_INPUT_FLG"); }
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
            columnInventoryBId(); // PK
            if (qyCall().qy().hasConditionQueryMCustomerByDepositId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnDepositId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTInventoryH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TInventoryHCQ) {
                columnInventoryHId(); // FK or one-to-one referrer
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
            if (qyCall().qy().hasConditionQueryTStock()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStockCQ) {
                columnStockId(); // FK or one-to-one referrer
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
            if (qyCall().qy().hasConditionQueryBClassDtlByInputType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInputType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStockAdjustFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStockAdjustFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_INVENTORY_B"; }
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
         * T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TInventoryHCB.HpSpecification specifyTInventoryH() {
            assertRelation("tInventoryH");
            if (_tInventoryH == null) {
                _tInventoryH = new TInventoryHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTInventoryH()
                                    , () -> _qyCall.qy().queryTInventoryH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tInventoryH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTInventoryH()
                      , () -> xsyncQyCall().qy().queryTInventoryH()));
                }
            }
            return _tInventoryH;
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
         * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInputType() {
            assertRelation("bClassDtlByInputType");
            if (_bClassDtlByInputType == null) {
                _bClassDtlByInputType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInputType()
                                    , () -> _qyCall.qy().queryBClassDtlByInputType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInputType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInputType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInputType()));
                }
            }
            return _bClassDtlByInputType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStockAdjustFlg() {
            assertRelation("bClassDtlByStockAdjustFlg");
            if (_bClassDtlByStockAdjustFlg == null) {
                _bClassDtlByStockAdjustFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStockAdjustFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStockAdjustFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStockAdjustFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStockAdjustFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStockAdjustFlg()));
                }
            }
            return _bClassDtlByStockAdjustFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TInventoryRCB.HpSpecification specifyTInventoryRAsOne() {
            assertRelation("tInventoryRAsOne");
            if (_tInventoryRAsOne == null) {
                _tInventoryRAsOne = new TInventoryRCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTInventoryRAsOne()
                                    , () -> _qyCall.qy().queryTInventoryRAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tInventoryRAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTInventoryRAsOne()
                      , () -> xsyncQyCall().qy().queryTInventoryRAsOne()));
                }
            }
            return _tInventoryRAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_INVENTORY_INP_HIST where ...) as FOO_MAX} <br>
         * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(histCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     histCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     histCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryInpHist.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryInpHistCB, TInventoryBCQ> derivedTInventoryInpHistList() {
            assertDerived("tInventoryInpHistList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryInpHistCB> sq, TInventoryBCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryInpHistList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, TInventoryBCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, TInventoryBCQ cq, String al, DerivedReferrerOption op)
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
    public TInventoryBCB dreamCruiseCB() {
        TInventoryBCB cb = new TInventoryBCB();
        cb.xsetupForDreamCruise((TInventoryBCB) this);
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
    public HpColQyOperand<TInventoryBCB> columnQuery(final SpecifyQuery<TInventoryBCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TInventoryBCB xcreateColumnQueryCB() {
        TInventoryBCB cb = new TInventoryBCB();
        cb.xsetupForColumnQuery((TInventoryBCB)this);
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
    public void orScopeQuery(OrQuery<TInventoryBCB> orCBLambda) {
        xorSQ((TInventoryBCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TInventoryBCB> andCBLambda) {
        xorSQAP((TInventoryBCB)this, andCBLambda);
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
        final TInventoryBCB cb;
        if (mainCB != null) {
            cb = (TInventoryBCB)mainCB;
        } else {
            cb = new TInventoryBCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TInventoryBCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TInventoryBCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
