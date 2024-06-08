package com.oneslogi.base.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.bsbhv.loader.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.bsentity.dbmeta.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The behavior of T_STOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, SHAPE_ID, STORE_NO_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, COMPANYCD, LOGICFLG1, LOGICFLG2, LOGICFLG3, TAGCD, QTY2AVG, QTY3AVG, QTY1INSTRUCTED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_SHAPE, T_LOT, M_STOCK_TYPE, M_CLIENT, M_PRODUCT, M_WAREHOUSE, M_CUSTOMER, T_STORE_NO, M_LOCATION, T_STOCK_REPORT(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_B, T_PALLET, T_PICKING_B, T_STOCK_INOUT, T_TRIMALLOCSTOCK, T_TRPICKDETAIL, T_STOCK_REPORT
 *
 * [foreign property]
 *     mShape, tLot, mStockType, mClient, mProduct, mWarehouse, mCustomer, tStoreNo, mLocation, tStockReportAsOne
 *
 * [referrer property]
 *     tInventoryBList, tPalletList, tPickingBList, tStockInoutList, tTrimallocstockList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStockBhv extends AbstractBehaviorWritable<TStock, TStockCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** ロケーションマスタ受信一覧を取得します。 */
    public static final String PATH_selectSqlgetStockHozeiList = "selectSqlgetStockHozeiList";
    /** ロケーションマスタ受信一覧を取得します。 */
    public static final String PATH_selectSqlgetStockList = "selectSqlgetStockList";
    /** ロケーションマスタ受信一覧を取得します。 */
    public static final String PATH_selectSqlgetStockListAssort = "selectSqlgetStockListAssort";
    /** ロケーションマスタ受信一覧を取得します。 */
    public static final String PATH_selectSqlgetStockListWithInv = "selectSqlgetStockListWithInv";
    /** ロケーションマスタ受信一覧を取得します。 */
    public static final String PATH_selectSqlgetStockwarehoseList = "selectSqlgetStockwarehoseList";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TStockDbm asDBMeta() { return TStockDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_STOCK"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TStockDbm getMyDBMeta() { return TStockDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TStockCB newConditionBean() { return new TStockCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TStock newMyEntity() { return new TStock(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TStockCB newMyConditionBean() { return new TStockCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TStockCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().setFoo...(value);
     * TStock tStock = <span style="color: #0000C0">tStockBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tStock != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tStock.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStock selectEntity(TStockCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TStock facadeSelectEntity(TStockCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStock> OptionalEntity<ENTITY> doSelectOptionalEntity(TStockCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().set...;
     * TStock tStock = <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tStock.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStock selectEntityWithDeletedCheck(TStockCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param stockId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStock selectByPKValue(Long stockId) {
        return facadeSelectByPKValue(stockId);
    }

    protected TStock facadeSelectByPKValue(Long stockId) {
        return doSelectByPK(stockId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStock> ENTITY doSelectByPK(Long stockId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(stockId), tp);
    }

    protected <ENTITY extends TStock> OptionalEntity<ENTITY> doSelectOptionalByPK(Long stockId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(stockId, tp), stockId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stockId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStock selectByPKValueWithDeletedCheck(Long stockId) {
        return doSelectByPKWithDeletedCheck(stockId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStock> ENTITY doSelectByPKWithDeletedCheck(Long stockId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(stockId), tp);
    }

    protected TStockCB xprepareCBAsPK(Long stockId) {
        assertObjectNotNull("stockId", stockId);
        return newConditionBean().acceptPK(stockId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param storeNoId : UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO. (NotNull)
     * @param locationId : +UQ, IX+, NotNull, bigint(19), FK to M_LOCATION. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<TStock> selectByUniqueOf(Long storeNoId, Long locationId) {
        return facadeSelectByUniqueOf(storeNoId, locationId);
    }

    protected OptionalEntity<TStock> facadeSelectByUniqueOf(Long storeNoId, Long locationId) {
        return doSelectByUniqueOf(storeNoId, locationId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStock> OptionalEntity<ENTITY> doSelectByUniqueOf(Long storeNoId, Long locationId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(storeNoId, locationId), tp), storeNoId, locationId);
    }

    protected TStockCB xprepareCBAsUniqueOf(Long storeNoId, Long locationId) {
        assertObjectNotNull("storeNoId", storeNoId);assertObjectNotNull("locationId", locationId);
        return newConditionBean().acceptUniqueOf(storeNoId, locationId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TStock&gt; <span style="color: #553000">tStockList</span> = <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TStock> selectList(TStockCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TStock&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">page</span>) {
     *     ... = tStock.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TStock> selectPage(TStockCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().set...
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @param entityRowHandler The handler of entity row of TStock. (NotNull)
     */
    public void selectCursor(TStockCB cb, EntityRowHandler<TStock> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStockCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStockCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TStock> tStockList, ReferrerLoaderHandler<LoaderOfTStock> loaderLambda) {
        xassLRArg(tStockList, loaderLambda);
        loaderLambda.handle(new LoaderOfTStock().ready(tStockList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param tStock The entity of TStock. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TStock tStock, ReferrerLoaderHandler<LoaderOfTStock> loaderLambda) {
        xassLRArg(tStock, loaderLambda);
        loaderLambda.handle(new LoaderOfTStock().ready(xnewLRAryLs(tStock), _behaviorSelector));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStockList The entity list of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<TStock> tStockList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(tStockList, refCBLambda);
        return doLoadTInventoryBList(tStockList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">tStock</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStock</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStock The entity of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(TStock tStock, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(tStock, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(tStock), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStock The entity of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(TStock tStock, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(tStock, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(tStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<TStock> tStockList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(tStockList, loadReferrerOption);
        if (tStockList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(tStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<TStock> tStockList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(tStockList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by STOCK_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">palletCB</span>.setupSelect...
     *     <span style="color: #553000">palletCB</span>.query().set...
     *     <span style="color: #553000">palletCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTPalletList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStockList The entity list of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPallet> loadTPalletList(List<TStock> tStockList, ConditionBeanSetupper<TPalletCB> refCBLambda) {
        xassLRArg(tStockList, refCBLambda);
        return doLoadTPalletList(tStockList, new LoadReferrerOption<TPalletCB, TPallet>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by STOCK_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">tStock</span>, <span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">palletCB</span>.setupSelect...
     *     <span style="color: #553000">palletCB</span>.query().set...
     *     <span style="color: #553000">palletCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStock</span>.<span style="color: #CC4747">getTPalletList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStock The entity of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPallet> loadTPalletList(TStock tStock, ConditionBeanSetupper<TPalletCB> refCBLambda) {
        xassLRArg(tStock, refCBLambda);
        return doLoadTPalletList(xnewLRLs(tStock), new LoadReferrerOption<TPalletCB, TPallet>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStock The entity of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPallet> loadTPalletList(TStock tStock, LoadReferrerOption<TPalletCB, TPallet> loadReferrerOption) {
        xassLRArg(tStock, loadReferrerOption);
        return loadTPalletList(xnewLRLs(tStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPallet> loadTPalletList(List<TStock> tStockList, LoadReferrerOption<TPalletCB, TPallet> loadReferrerOption) {
        xassLRArg(tStockList, loadReferrerOption);
        if (tStockList.isEmpty()) { return (NestedReferrerListGateway<TPallet>)EMPTY_NREF_LGWAY; }
        return doLoadTPalletList(tStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPallet> doLoadTPalletList(List<TStock> tStockList, LoadReferrerOption<TPalletCB, TPallet> option) {
        return helpLoadReferrerInternally(tStockList, option, "tPalletList");
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by STOCK_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStockList The entity list of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TStock> tStockList, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tStockList, refCBLambda);
        return doLoadTPickingBList(tStockList, new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by STOCK_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tStock</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStock</span>.<span style="color: #CC4747">getTPickingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStock The entity of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TStock tStock, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tStock, refCBLambda);
        return doLoadTPickingBList(xnewLRLs(tStock), new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStock The entity of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TStock tStock, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tStock, loadReferrerOption);
        return loadTPickingBList(xnewLRLs(tStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TStock> tStockList, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tStockList, loadReferrerOption);
        if (tStockList.isEmpty()) { return (NestedReferrerListGateway<TPickingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingBList(tStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingB> doLoadTPickingBList(List<TStock> tStockList, LoadReferrerOption<TPickingBCB, TPickingB> option) {
        return helpLoadReferrerInternally(tStockList, option, "tPickingBList");
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStockList The entity list of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<TStock> tStockList, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(tStockList, refCBLambda);
        return doLoadTStockInoutList(tStockList, new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">tStock</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStock</span>.<span style="color: #CC4747">getTStockInoutList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStock The entity of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(TStock tStock, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(tStock, refCBLambda);
        return doLoadTStockInoutList(xnewLRLs(tStock), new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStock The entity of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(TStock tStock, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(tStock, loadReferrerOption);
        return loadTStockInoutList(xnewLRLs(tStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<TStock> tStockList, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(tStockList, loadReferrerOption);
        if (tStockList.isEmpty()) { return (NestedReferrerListGateway<TStockInout>)EMPTY_NREF_LGWAY; }
        return doLoadTStockInoutList(tStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStockInout> doLoadTStockInoutList(List<TStock> tStockList, LoadReferrerOption<TStockInoutCB, TStockInout> option) {
        return helpLoadReferrerInternally(tStockList, option, "tStockInoutList");
    }

    /**
     * Load referrer of TTrimallocstockList by the set-upper of referrer. <br>
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTTrimallocstockList</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">trimallocstockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocstockCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocstockCB</span>.query().set...
     *     <span style="color: #553000">trimallocstockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTTrimallocstockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStockList The entity list of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocstock> loadTTrimallocstockList(List<TStock> tStockList, ConditionBeanSetupper<TTrimallocstockCB> refCBLambda) {
        xassLRArg(tStockList, refCBLambda);
        return doLoadTTrimallocstockList(tStockList, new LoadReferrerOption<TTrimallocstockCB, TTrimallocstock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrimallocstockList by the set-upper of referrer. <br>
     * T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTTrimallocstockList</span>(<span style="color: #553000">tStock</span>, <span style="color: #553000">trimallocstockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocstockCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocstockCB</span>.query().set...
     *     <span style="color: #553000">trimallocstockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStock</span>.<span style="color: #CC4747">getTTrimallocstockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStock The entity of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocstock> loadTTrimallocstockList(TStock tStock, ConditionBeanSetupper<TTrimallocstockCB> refCBLambda) {
        xassLRArg(tStock, refCBLambda);
        return doLoadTTrimallocstockList(xnewLRLs(tStock), new LoadReferrerOption<TTrimallocstockCB, TTrimallocstock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStock The entity of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocstock> loadTTrimallocstockList(TStock tStock, LoadReferrerOption<TTrimallocstockCB, TTrimallocstock> loadReferrerOption) {
        xassLRArg(tStock, loadReferrerOption);
        return loadTTrimallocstockList(xnewLRLs(tStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrimallocstock> loadTTrimallocstockList(List<TStock> tStockList, LoadReferrerOption<TTrimallocstockCB, TTrimallocstock> loadReferrerOption) {
        xassLRArg(tStockList, loadReferrerOption);
        if (tStockList.isEmpty()) { return (NestedReferrerListGateway<TTrimallocstock>)EMPTY_NREF_LGWAY; }
        return doLoadTTrimallocstockList(tStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrimallocstock> doLoadTTrimallocstockList(List<TStock> tStockList, LoadReferrerOption<TTrimallocstockCB, TTrimallocstock> option) {
        return helpLoadReferrerInternally(tStockList, option, "tTrimallocstockList");
    }

    /**
     * Load referrer of TTrpickdetailList by the set-upper of referrer. <br>
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTTrpickdetailList</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">trpickdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpickdetailCB</span>.setupSelect...
     *     <span style="color: #553000">trpickdetailCB</span>.query().set...
     *     <span style="color: #553000">trpickdetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTTrpickdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStockList The entity list of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(List<TStock> tStockList, ConditionBeanSetupper<TTrpickdetailCB> refCBLambda) {
        xassLRArg(tStockList, refCBLambda);
        return doLoadTTrpickdetailList(tStockList, new LoadReferrerOption<TTrpickdetailCB, TTrpickdetail>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrpickdetailList by the set-upper of referrer. <br>
     * T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">loadTTrpickdetailList</span>(<span style="color: #553000">tStock</span>, <span style="color: #553000">trpickdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpickdetailCB</span>.setupSelect...
     *     <span style="color: #553000">trpickdetailCB</span>.query().set...
     *     <span style="color: #553000">trpickdetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStock</span>.<span style="color: #CC4747">getTTrpickdetailList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param tStock The entity of TStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(TStock tStock, ConditionBeanSetupper<TTrpickdetailCB> refCBLambda) {
        xassLRArg(tStock, refCBLambda);
        return doLoadTTrpickdetailList(xnewLRLs(tStock), new LoadReferrerOption<TTrpickdetailCB, TTrpickdetail>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStock The entity of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(TStock tStock, LoadReferrerOption<TTrpickdetailCB, TTrpickdetail> loadReferrerOption) {
        xassLRArg(tStock, loadReferrerOption);
        return loadTTrpickdetailList(xnewLRLs(tStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStockList The entity list of TStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(List<TStock> tStockList, LoadReferrerOption<TTrpickdetailCB, TTrpickdetail> loadReferrerOption) {
        xassLRArg(tStockList, loadReferrerOption);
        if (tStockList.isEmpty()) { return (NestedReferrerListGateway<TTrpickdetail>)EMPTY_NREF_LGWAY; }
        return doLoadTTrpickdetailList(tStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrpickdetail> doLoadTTrpickdetailList(List<TStock> tStockList, LoadReferrerOption<TTrpickdetailCB, TTrpickdetail> option) {
        return helpLoadReferrerInternally(tStockList, option, "tTrpickdetailList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShape'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mShape"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "tLot"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mCustomer"); }

    /**
     * Pull out the list of foreign table 'TStoreNo'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNo> pulloutTStoreNo(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "tStoreNo"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "mLocation"); }

    /**
     * Pull out the list of referrer-as-one table 'TStockReport'.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStockReport> pulloutTStockReportAsOne(List<TStock> tStockList)
    { return helpPulloutInternally(tStockList, "tStockReportAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key stockId.
     * @param tStockList The list of tStock. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStockIdList(List<TStock> tStockList)
    { return helpExtractListInternally(tStockList, "stockId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStock.setFoo...(value);
     * tStock.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStock.set...;</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">insert</span>(tStock);
     * ... = tStock.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tStock The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TStock tStock) {
        doInsert(tStock, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStock.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">update</span>(tStock);
     * </pre>
     * @param tStock The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TStock tStock) {
        doUpdate(tStock, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStock.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tStock);
     * </pre>
     * @param tStock The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TStock tStock) {
        doUpdateNonstrict(tStock, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStock The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TStock tStock) {
        doInsertOrUpdate(tStock, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStock The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TStock tStock) {
        doInsertOrUpdateNonstrict(tStock, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">delete</span>(tStock);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tStock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TStock tStock) {
        doDelete(tStock, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tStock);
     * </pre>
     * @param tStock The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TStock tStock) {
        doDeleteNonstrict(tStock, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tStock);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tStock The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TStock tStock) {
        doDeleteNonstrictIgnoreDeleted(tStock, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TStock et, final DeleteOption<TStockCB> op) {
        assertObjectNotNull("tStock", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TStock tStock = <span style="color: #70226C">new</span> TStock();
     *     tStock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStock.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tStockList.add(tStock);
     * }
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">batchInsert</span>(tStockList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TStock> tStockList) {
        return doBatchInsert(tStockList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TStock tStock = <span style="color: #70226C">new</span> TStock();
     *     tStock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStock.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStock.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStock.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStockList.add(tStock);
     * }
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStockList);
     * </pre>
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStock> tStockList) {
        return doBatchUpdate(tStockList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tStockBhv.<span style="color: #CC4747">batchUpdate</span>(tStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStock> tStockList, SpecifyQuery<TStockCB> colCBLambda) {
        return doBatchUpdate(tStockList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TStock tStock = <span style="color: #70226C">new</span> TStock();
     *     tStock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStock.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStock.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStock.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStockList.add(tStock);
     * }
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStockList);
     * </pre>
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStock> tStockList) {
        return doBatchUpdateNonstrict(tStockList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStock> tStockList, SpecifyQuery<TStockCB> colCBLambda) {
        return doBatchUpdateNonstrict(tStockList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TStock> tStockList) {
        return doBatchDelete(tStockList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TStock> tStockList) {
        return doBatchDeleteNonstrict(tStockList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TStock, TStockCB&gt;() {
     *     public ConditionBean setup(TStock entity, TStockCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<TStock, TStockCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStock.setPK...(value);</span>
     * tStock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStock.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStock.setVersionNo(value);</span>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tStock, cb);
     * </pre>
     * @param tStock The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TStock tStock, TStockCB cb) {
        return doQueryUpdate(tStock, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TStockCB cb = new TStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">queryDelete</span>(tStock, cb);
     * </pre>
     * @param cb The condition-bean of TStock. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TStockCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStock.setFoo...(value);
     * tStock.setBar...(value);
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tStock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tStock.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tStock The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TStock tStock, WritableOptionCall<TStockCB, InsertOption<TStockCB>> opLambda) {
        doInsert(tStock, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tStock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStock The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TStock tStock, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> opLambda) {
        doUpdate(tStock, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * tStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tStock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStock The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TStock tStock, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> opLambda) {
        doUpdateNonstrict(tStock, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tStock The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TStock tStock, WritableOptionCall<TStockCB, InsertOption<TStockCB>> insertOpLambda, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> updateOpLambda) {
        doInsertOrUpdate(tStock, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tStock The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TStock tStock, WritableOptionCall<TStockCB, InsertOption<TStockCB>> insertOpLambda, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tStock, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tStock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TStock tStock, WritableOptionCall<TStockCB, DeleteOption<TStockCB>> opLambda) {
        doDelete(tStock, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tStock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TStock tStock, WritableOptionCall<TStockCB, DeleteOption<TStockCB>> opLambda) {
        doDeleteNonstrict(tStock, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TStock> tStockList, WritableOptionCall<TStockCB, InsertOption<TStockCB>> opLambda) {
        return doBatchInsert(tStockList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TStock> tStockList, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> opLambda) {
        return doBatchUpdate(tStockList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TStock> tStockList, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> opLambda) {
        return doBatchUpdateNonstrict(tStockList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TStock> tStockList, WritableOptionCall<TStockCB, DeleteOption<TStockCB>> opLambda) {
        return doBatchDelete(tStockList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TStock> tStockList, WritableOptionCall<TStockCB, DeleteOption<TStockCB>> opLambda) {
        return doBatchDeleteNonstrict(tStockList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<TStock, TStockCB> manyArgLambda, WritableOptionCall<TStockCB, InsertOption<TStockCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStock tStock = <span style="color: #70226C">new</span> TStock();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStock.setPK...(value);</span>
     * tStock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStock.setVersionNo(value);</span>
     * TStockCB cb = <span style="color: #70226C">new</span> TStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tStock, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tStock The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TStock. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TStock tStock, TStockCB cb, WritableOptionCall<TStockCB, UpdateOption<TStockCB>> opLambda) {
        return doQueryUpdate(tStock, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TStock. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TStockCB cb, WritableOptionCall<TStockCB, DeleteOption<TStockCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tStockBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tStockBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStockBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tStockBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStockBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tStockBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tStockBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tStockBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tStockBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tStockBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tStockBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tStockBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tStockBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tStockBhv.outideSql().removeBlockComment().selectList()
     * tStockBhv.outideSql().removeLineComment().selectList()
     * tStockBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TStockBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TStockBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends TStock> typeOfSelectedEntity() { return TStock.class; }
    protected Class<TStock> typeOfHandlingEntity() { return TStock.class; }
    protected Class<TStockCB> typeOfHandlingConditionBean() { return TStockCB.class; }
}
