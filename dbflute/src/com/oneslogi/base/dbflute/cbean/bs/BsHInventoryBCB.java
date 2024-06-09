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
 * The base condition-bean of H_INVENTORY_B.
 * @author DBFlute(AutoGenerator)
 */
public class BsHInventoryBCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected HInventoryBCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHInventoryBCB() {
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
        return "H_INVENTORY_B";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param inventoryBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public HInventoryBCB acceptPK(Long inventoryBId) {
        assertObjectNotNull("inventoryBId", inventoryBId);
        BsHInventoryBCB cb = this;
        cb.query().setInventoryBId_Equal(inventoryBId);
        return (HInventoryBCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param inventoryBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long inventoryBId) {
        assertObjectNotNull("inventoryBId", inventoryBId);
        BsHInventoryBCB cb = this;
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
    public HInventoryBCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public HInventoryBCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected HInventoryBCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected HInventoryBCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected HInventoryBCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        HInventoryBCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected HInventoryBCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new HInventoryBCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<HInventoryBCB> unionCBLambda) {
        final HInventoryBCB cb = new HInventoryBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final HInventoryBCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<HInventoryBCB> unionCBLambda) {
        final HInventoryBCB cb = new HInventoryBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final HInventoryBCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * H_INVENTORY_H by my INVENTORY_H_ID, named 'HInventoryH'.
     * <pre>
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_HInventoryH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getHInventoryH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_HInventoryH() {
        assertSetupSelectPurpose("hInventoryH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInventoryHId();
        }
        doSetupSelect(() -> query().queryHInventoryH());
    }

    protected HMoveHNss _nssHMoveH;
    public HMoveHNss xdfgetNssHMoveH() {
        if (_nssHMoveH == null) { _nssHMoveH = new HMoveHNss(null); }
        return _nssHMoveH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'.
     * <pre>
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_HMoveH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getHMoveH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public HMoveHNss setupSelect_HMoveH() {
        assertSetupSelectPurpose("hMoveH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMoveInstHId();
        }
        doSetupSelect(() -> query().queryHMoveH());
        if (_nssHMoveH == null || !_nssHMoveH.hasConditionQuery())
        { _nssHMoveH = new HMoveHNss(query().queryHMoveH()); }
        return _nssHMoveH;
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
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShape()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getMShape()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected HStockNss _nssHStock;
    public HStockNss xdfgetNssHStock() {
        if (_nssHStock == null) { _nssHStock = new HStockNss(null); }
        return _nssHStock;
    }
    /**
     * Set up relation columns to select clause. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * <pre>
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_HStock()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getHStock()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public HStockNss setupSelect_HStock() {
        assertSetupSelectPurpose("hStock");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockId();
        }
        doSetupSelect(() -> query().queryHStock());
        if (_nssHStock == null || !_nssHStock.hasConditionQuery())
        { _nssHStock = new HStockNss(query().queryHStock()); }
        return _nssHStock;
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
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MStockType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getMStockType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByInputType;
    public BClassDtlNss xdfgetNssBClassDtlByInputType() {
        if (_nssBClassDtlByInputType == null) { _nssBClassDtlByInputType = new BClassDtlNss(null); }
        return _nssBClassDtlByInputType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * <pre>
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInputType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getBClassDtlByInputType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">hInventoryBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockAdjustFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">hInventoryB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">hInventoryB</span>.<span style="color: #CC4747">getBClassDtlByStockAdjustFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<HInventoryBCQ> {
        protected HInventoryHCB.HpSpecification _hInventoryH;
        protected HMoveHCB.HpSpecification _hMoveH;
        protected MShapeCB.HpSpecification _mShape;
        protected HStockCB.HpSpecification _hStock;
        protected MStockTypeCB.HpSpecification _mStockType;
        protected BClassDtlCB.HpSpecification _bClassDtlByInputType;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockAdjustFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<HInventoryBCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInventoryBId() { return doColumn("INVENTORY_B_ID"); }
        /**
         * INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to H_INVENTORY_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInventoryHId() { return doColumn("INVENTORY_H_ID"); }
        /**
         * STOCK_ID: {IX, bigint(19), FK to H_STOCK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockId() { return doColumn("STOCK_ID"); }
        /**
         * WAREHOUSE_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseId() { return doColumn("WAREHOUSE_ID"); }
        /**
         * WAREHOUSE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseCd() { return doColumn("WAREHOUSE_CD"); }
        /**
         * WAREHOUSE_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseNm() { return doColumn("WAREHOUSE_NM"); }
        /**
         * PRODUCT_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * PRODUCT_CD: {IX, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * PRODUCT_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductNm() { return doColumn("PRODUCT_NM"); }
        /**
         * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockTypeId() { return doColumn("STOCK_TYPE_ID"); }
        /**
         * LOCATION_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationId() { return doColumn("LOCATION_ID"); }
        /**
         * LOCATION_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationCd() { return doColumn("LOCATION_CD"); }
        /**
         * LOCATION_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationNm() { return doColumn("LOCATION_NM"); }
        /**
         * DEPOSIT_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositId() { return doColumn("DEPOSIT_ID"); }
        /**
         * DEPOSIT_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositCd() { return doColumn("DEPOSIT_CD"); }
        /**
         * DEPOSIT_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositNm() { return doColumn("DEPOSIT_NM"); }
        /**
         * LOT_ID: {bigint(19)}
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
         * SHAPE_ID: {IX, bigint(19), FK to M_SHAPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeId() { return doColumn("SHAPE_ID"); }
        /**
         * STORE_NO_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreNoId() { return doColumn("STORE_NO_ID"); }
        /**
         * STORE_LABEL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLabelNo() { return doColumn("STORE_LABEL_NO"); }
        /**
         * SUPPLIER_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierId() { return doColumn("SUPPLIER_ID"); }
        /**
         * SUPPLIER_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierCd() { return doColumn("SUPPLIER_CD"); }
        /**
         * SUPPLIER_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierNm() { return doColumn("SUPPLIER_NM"); }
        /**
         * STORE_DT: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDt() { return doColumn("STORE_DT"); }
        /**
         * UNIT_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitNum() { return doColumn("UNIT_NUM"); }
        /**
         * CHARGE_NUM: {NotNull, decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnChargeNum() { return doColumn("CHARGE_NUM"); }
        /**
         * ALLOC_NUM: {NotNull, decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocNum() { return doColumn("ALLOC_NUM"); }
        /**
         * MOVE_NUM: {NotNull, decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveNum() { return doColumn("MOVE_NUM"); }
        /**
         * INVENTORY_NUM: {NotNull, decimal(16, 6)}
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
         * MOVE_INST_H_ID: {IX, bigint(19), FK to H_MOVE_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMoveInstHId() { return doColumn("MOVE_INST_H_ID"); }
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
            if (qyCall().qy().hasConditionQueryHInventoryH()
                    || qyCall().qy().xgetReferrerQuery() instanceof HInventoryHCQ) {
                columnInventoryHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryHMoveH()
                    || qyCall().qy().xgetReferrerQuery() instanceof HMoveHCQ) {
                columnMoveInstHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMShape()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeCQ) {
                columnShapeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryHStock()
                    || qyCall().qy().xgetReferrerQuery() instanceof HStockCQ) {
                columnStockId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMStockType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MStockTypeCQ) {
                columnStockTypeId(); // FK or one-to-one referrer
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
        protected String getTableDbName() { return "H_INVENTORY_B"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * H_INVENTORY_H by my INVENTORY_H_ID, named 'HInventoryH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public HInventoryHCB.HpSpecification specifyHInventoryH() {
            assertRelation("hInventoryH");
            if (_hInventoryH == null) {
                _hInventoryH = new HInventoryHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryHInventoryH()
                                    , () -> _qyCall.qy().queryHInventoryH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _hInventoryH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryHInventoryH()
                      , () -> xsyncQyCall().qy().queryHInventoryH()));
                }
            }
            return _hInventoryH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public HMoveHCB.HpSpecification specifyHMoveH() {
            assertRelation("hMoveH");
            if (_hMoveH == null) {
                _hMoveH = new HMoveHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryHMoveH()
                                    , () -> _qyCall.qy().queryHMoveH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _hMoveH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryHMoveH()
                      , () -> xsyncQyCall().qy().queryHMoveH()));
                }
            }
            return _hMoveH;
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
         * H_STOCK by my STOCK_ID, named 'HStock'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public HStockCB.HpSpecification specifyHStock() {
            assertRelation("hStock");
            if (_hStock == null) {
                _hStock = new HStockCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryHStock()
                                    , () -> _qyCall.qy().queryHStock())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _hStock.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryHStock()
                      , () -> xsyncQyCall().qy().queryHStock()));
                }
            }
            return _hStock;
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
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<HInventoryBCB, HInventoryBCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<HInventoryBCB> sq, HInventoryBCQ cq, String al, DerivedReferrerOption op)
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
    public HInventoryBCB dreamCruiseCB() {
        HInventoryBCB cb = new HInventoryBCB();
        cb.xsetupForDreamCruise((HInventoryBCB) this);
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
    public HpColQyOperand<HInventoryBCB> columnQuery(final SpecifyQuery<HInventoryBCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected HInventoryBCB xcreateColumnQueryCB() {
        HInventoryBCB cb = new HInventoryBCB();
        cb.xsetupForColumnQuery((HInventoryBCB)this);
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
    public void orScopeQuery(OrQuery<HInventoryBCB> orCBLambda) {
        xorSQ((HInventoryBCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<HInventoryBCB> andCBLambda) {
        xorSQAP((HInventoryBCB)this, andCBLambda);
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
        final HInventoryBCB cb;
        if (mainCB != null) {
            cb = (HInventoryBCB)mainCB;
        } else {
            cb = new HInventoryBCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return HInventoryBCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return HInventoryBCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
