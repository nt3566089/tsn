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
 * The behavior of H_STOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WAREHOUSE_ID, WAREHOUSE_CD, WAREHOUSE_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, STOCK_TYPE_ID, ZONE_ID, ZONE_CD, ZONE_NM, LOCATION_ID, LOCATION_CD, LOCATION_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, DEPOSIT_ABBR, LOT_ID, LOT, LIMIT_DT, SHAPE_ID, STORE_NO_ID, STORE_LABEL_NO, OLD_STORE_NUM_ID, OLD_STORE_LABEL_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, SUPPLIER_ABBR, STORE_DT, UNIT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_SHAPE, M_STOCK_TYPE
 *
 * [referrer table]
 *     H_INVENTORY_B, H_MOVE_B, H_PACKING_B, H_RECEIVE_B, H_STOCK_INOUT, H_STOCK_REPORT
 *
 * [foreign property]
 *     mShape, mStockType
 *
 * [referrer property]
 *     hInventoryBList, hMoveBList, hPackingBList, hReceiveBList, hStockInoutList, hStockReportList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHStockBhv extends AbstractBehaviorWritable<HStock, HStockCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public HStockDbm asDBMeta() { return HStockDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "H_STOCK"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public HStockDbm getMyDBMeta() { return HStockDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public HStockCB newConditionBean() { return new HStockCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public HStock newMyEntity() { return new HStock(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public HStockCB newMyConditionBean() { return new HStockCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(HStockCB cb) {
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
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().setFoo...(value);
     * HStock hStock = <span style="color: #0000C0">hStockBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (hStock != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = hStock.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HStock selectEntity(HStockCB cb) {
        return facadeSelectEntity(cb);
    }

    protected HStock facadeSelectEntity(HStockCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends HStock> OptionalEntity<ENTITY> doSelectOptionalEntity(HStockCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().set...;
     * HStock hStock = <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = hStock.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HStock selectEntityWithDeletedCheck(HStockCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param stockId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HStock selectByPKValue(Long stockId) {
        return facadeSelectByPKValue(stockId);
    }

    protected HStock facadeSelectByPKValue(Long stockId) {
        return doSelectByPK(stockId, typeOfSelectedEntity());
    }

    protected <ENTITY extends HStock> ENTITY doSelectByPK(Long stockId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(stockId), tp);
    }

    protected <ENTITY extends HStock> OptionalEntity<ENTITY> doSelectOptionalByPK(Long stockId, Class<? extends ENTITY> tp) {
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
    public HStock selectByPKValueWithDeletedCheck(Long stockId) {
        return doSelectByPKWithDeletedCheck(stockId, typeOfSelectedEntity());
    }

    protected <ENTITY extends HStock> ENTITY doSelectByPKWithDeletedCheck(Long stockId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(stockId), tp);
    }

    protected HStockCB xprepareCBAsPK(Long stockId) {
        assertObjectNotNull("stockId", stockId);
        return newConditionBean().acceptPK(stockId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;HStock&gt; <span style="color: #553000">hStockList</span> = <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.get...;
     * }
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<HStock> selectList(HStockCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;HStock&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">page</span>) {
     *     ... = hStock.get...();
     * }
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<HStock> selectPage(HStockCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().set...
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @param entityRowHandler The handler of entity row of HStock. (NotNull)
     */
    public void selectCursor(HStockCB cb, EntityRowHandler<HStock> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<HStockCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<HStockCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<HStock> hStockList, ReferrerLoaderHandler<LoaderOfHStock> loaderLambda) {
        xassLRArg(hStockList, loaderLambda);
        loaderLambda.handle(new LoaderOfHStock().ready(hStockList, _behaviorSelector));
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
     * @param hStock The entity of HStock. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(HStock hStock, ReferrerLoaderHandler<LoaderOfHStock> loaderLambda) {
        xassLRArg(hStock, loaderLambda);
        loaderLambda.handle(new LoaderOfHStock().ready(xnewLRAryLs(hStock), _behaviorSelector));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStockList The entity list of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<HStock> hStockList, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(hStockList, refCBLambda);
        return doLoadHInventoryBList(hStockList, new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">hStock</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hStock</span>.<span style="color: #CC4747">getHInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStock The entity of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(HStock hStock, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(hStock, refCBLambda);
        return doLoadHInventoryBList(xnewLRLs(hStock), new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hStock The entity of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(HStock hStock, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(hStock, loadReferrerOption);
        return loadHInventoryBList(xnewLRLs(hStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<HStock> hStockList, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(hStockList, loadReferrerOption);
        if (hStockList.isEmpty()) { return (NestedReferrerListGateway<HInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadHInventoryBList(hStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HInventoryB> doLoadHInventoryBList(List<HStock> hStockList, LoadReferrerOption<HInventoryBCB, HInventoryB> option) {
        return helpLoadReferrerInternally(hStockList, option, "hInventoryBList");
    }

    /**
     * Load referrer of HMoveBList by the set-upper of referrer. <br>
     * H_MOVE_B by STOCK_ID, named 'HMoveBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHMoveBList</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHMoveBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStockList The entity list of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(List<HStock> hStockList, ConditionBeanSetupper<HMoveBCB> refCBLambda) {
        xassLRArg(hStockList, refCBLambda);
        return doLoadHMoveBList(hStockList, new LoadReferrerOption<HMoveBCB, HMoveB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HMoveBList by the set-upper of referrer. <br>
     * H_MOVE_B by STOCK_ID, named 'HMoveBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHMoveBList</span>(<span style="color: #553000">hStock</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hStock</span>.<span style="color: #CC4747">getHMoveBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStock The entity of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(HStock hStock, ConditionBeanSetupper<HMoveBCB> refCBLambda) {
        xassLRArg(hStock, refCBLambda);
        return doLoadHMoveBList(xnewLRLs(hStock), new LoadReferrerOption<HMoveBCB, HMoveB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hStock The entity of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(HStock hStock, LoadReferrerOption<HMoveBCB, HMoveB> loadReferrerOption) {
        xassLRArg(hStock, loadReferrerOption);
        return loadHMoveBList(xnewLRLs(hStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(List<HStock> hStockList, LoadReferrerOption<HMoveBCB, HMoveB> loadReferrerOption) {
        xassLRArg(hStockList, loadReferrerOption);
        if (hStockList.isEmpty()) { return (NestedReferrerListGateway<HMoveB>)EMPTY_NREF_LGWAY; }
        return doLoadHMoveBList(hStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HMoveB> doLoadHMoveBList(List<HStock> hStockList, LoadReferrerOption<HMoveBCB, HMoveB> option) {
        return helpLoadReferrerInternally(hStockList, option, "hMoveBList");
    }

    /**
     * Load referrer of HPackingBList by the set-upper of referrer. <br>
     * H_PACKING_B by STOCK_ID, named 'HPackingBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHPackingBList</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStockList The entity list of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HPackingB> loadHPackingBList(List<HStock> hStockList, ConditionBeanSetupper<HPackingBCB> refCBLambda) {
        xassLRArg(hStockList, refCBLambda);
        return doLoadHPackingBList(hStockList, new LoadReferrerOption<HPackingBCB, HPackingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HPackingBList by the set-upper of referrer. <br>
     * H_PACKING_B by STOCK_ID, named 'HPackingBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHPackingBList</span>(<span style="color: #553000">hStock</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hStock</span>.<span style="color: #CC4747">getHPackingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStock The entity of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HPackingB> loadHPackingBList(HStock hStock, ConditionBeanSetupper<HPackingBCB> refCBLambda) {
        xassLRArg(hStock, refCBLambda);
        return doLoadHPackingBList(xnewLRLs(hStock), new LoadReferrerOption<HPackingBCB, HPackingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hStock The entity of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HPackingB> loadHPackingBList(HStock hStock, LoadReferrerOption<HPackingBCB, HPackingB> loadReferrerOption) {
        xassLRArg(hStock, loadReferrerOption);
        return loadHPackingBList(xnewLRLs(hStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HPackingB> loadHPackingBList(List<HStock> hStockList, LoadReferrerOption<HPackingBCB, HPackingB> loadReferrerOption) {
        xassLRArg(hStockList, loadReferrerOption);
        if (hStockList.isEmpty()) { return (NestedReferrerListGateway<HPackingB>)EMPTY_NREF_LGWAY; }
        return doLoadHPackingBList(hStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HPackingB> doLoadHPackingBList(List<HStock> hStockList, LoadReferrerOption<HPackingBCB, HPackingB> option) {
        return helpLoadReferrerInternally(hStockList, option, "hPackingBList");
    }

    /**
     * Load referrer of HReceiveBList by the set-upper of referrer. <br>
     * H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHReceiveBList</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHReceiveBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStockList The entity list of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HReceiveB> loadHReceiveBList(List<HStock> hStockList, ConditionBeanSetupper<HReceiveBCB> refCBLambda) {
        xassLRArg(hStockList, refCBLambda);
        return doLoadHReceiveBList(hStockList, new LoadReferrerOption<HReceiveBCB, HReceiveB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HReceiveBList by the set-upper of referrer. <br>
     * H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHReceiveBList</span>(<span style="color: #553000">hStock</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hStock</span>.<span style="color: #CC4747">getHReceiveBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStock The entity of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HReceiveB> loadHReceiveBList(HStock hStock, ConditionBeanSetupper<HReceiveBCB> refCBLambda) {
        xassLRArg(hStock, refCBLambda);
        return doLoadHReceiveBList(xnewLRLs(hStock), new LoadReferrerOption<HReceiveBCB, HReceiveB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hStock The entity of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HReceiveB> loadHReceiveBList(HStock hStock, LoadReferrerOption<HReceiveBCB, HReceiveB> loadReferrerOption) {
        xassLRArg(hStock, loadReferrerOption);
        return loadHReceiveBList(xnewLRLs(hStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HReceiveB> loadHReceiveBList(List<HStock> hStockList, LoadReferrerOption<HReceiveBCB, HReceiveB> loadReferrerOption) {
        xassLRArg(hStockList, loadReferrerOption);
        if (hStockList.isEmpty()) { return (NestedReferrerListGateway<HReceiveB>)EMPTY_NREF_LGWAY; }
        return doLoadHReceiveBList(hStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HReceiveB> doLoadHReceiveBList(List<HStock> hStockList, LoadReferrerOption<HReceiveBCB, HReceiveB> option) {
        return helpLoadReferrerInternally(hStockList, option, "hReceiveBList");
    }

    /**
     * Load referrer of HStockInoutList by the set-upper of referrer. <br>
     * H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHStockInoutList</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStockList The entity list of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(List<HStock> hStockList, ConditionBeanSetupper<HStockInoutCB> refCBLambda) {
        xassLRArg(hStockList, refCBLambda);
        return doLoadHStockInoutList(hStockList, new LoadReferrerOption<HStockInoutCB, HStockInout>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HStockInoutList by the set-upper of referrer. <br>
     * H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHStockInoutList</span>(<span style="color: #553000">hStock</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hStock</span>.<span style="color: #CC4747">getHStockInoutList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStock The entity of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(HStock hStock, ConditionBeanSetupper<HStockInoutCB> refCBLambda) {
        xassLRArg(hStock, refCBLambda);
        return doLoadHStockInoutList(xnewLRLs(hStock), new LoadReferrerOption<HStockInoutCB, HStockInout>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hStock The entity of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(HStock hStock, LoadReferrerOption<HStockInoutCB, HStockInout> loadReferrerOption) {
        xassLRArg(hStock, loadReferrerOption);
        return loadHStockInoutList(xnewLRLs(hStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(List<HStock> hStockList, LoadReferrerOption<HStockInoutCB, HStockInout> loadReferrerOption) {
        xassLRArg(hStockList, loadReferrerOption);
        if (hStockList.isEmpty()) { return (NestedReferrerListGateway<HStockInout>)EMPTY_NREF_LGWAY; }
        return doLoadHStockInoutList(hStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HStockInout> doLoadHStockInoutList(List<HStock> hStockList, LoadReferrerOption<HStockInoutCB, HStockInout> option) {
        return helpLoadReferrerInternally(hStockList, option, "hStockInoutList");
    }

    /**
     * Load referrer of HStockReportList by the set-upper of referrer. <br>
     * H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHStockReportList</span>(<span style="color: #553000">hStockList</span>, <span style="color: #553000">reportCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reportCB</span>.setupSelect...
     *     <span style="color: #553000">reportCB</span>.query().set...
     *     <span style="color: #553000">reportCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HStock hStock : <span style="color: #553000">hStockList</span>) {
     *     ... = hStock.<span style="color: #CC4747">getHStockReportList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStockList The entity list of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockReport> loadHStockReportList(List<HStock> hStockList, ConditionBeanSetupper<HStockReportCB> refCBLambda) {
        xassLRArg(hStockList, refCBLambda);
        return doLoadHStockReportList(hStockList, new LoadReferrerOption<HStockReportCB, HStockReport>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HStockReportList by the set-upper of referrer. <br>
     * H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'.
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">loadHStockReportList</span>(<span style="color: #553000">hStock</span>, <span style="color: #553000">reportCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reportCB</span>.setupSelect...
     *     <span style="color: #553000">reportCB</span>.query().set...
     *     <span style="color: #553000">reportCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hStock</span>.<span style="color: #CC4747">getHStockReportList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param hStock The entity of HStock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockReport> loadHStockReportList(HStock hStock, ConditionBeanSetupper<HStockReportCB> refCBLambda) {
        xassLRArg(hStock, refCBLambda);
        return doLoadHStockReportList(xnewLRLs(hStock), new LoadReferrerOption<HStockReportCB, HStockReport>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hStock The entity of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockReport> loadHStockReportList(HStock hStock, LoadReferrerOption<HStockReportCB, HStockReport> loadReferrerOption) {
        xassLRArg(hStock, loadReferrerOption);
        return loadHStockReportList(xnewLRLs(hStock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hStockList The entity list of HStock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HStockReport> loadHStockReportList(List<HStock> hStockList, LoadReferrerOption<HStockReportCB, HStockReport> loadReferrerOption) {
        xassLRArg(hStockList, loadReferrerOption);
        if (hStockList.isEmpty()) { return (NestedReferrerListGateway<HStockReport>)EMPTY_NREF_LGWAY; }
        return doLoadHStockReportList(hStockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HStockReport> doLoadHStockReportList(List<HStock> hStockList, LoadReferrerOption<HStockReportCB, HStockReport> option) {
        return helpLoadReferrerInternally(hStockList, option, "hStockReportList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShape'.
     * @param hStockList The list of hStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<HStock> hStockList)
    { return helpPulloutInternally(hStockList, "mShape"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param hStockList The list of hStock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<HStock> hStockList)
    { return helpPulloutInternally(hStockList, "mStockType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key stockId.
     * @param hStockList The list of hStock. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStockIdList(List<HStock> hStockList)
    { return helpExtractListInternally(hStockList, "stockId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * hStock.setFoo...(value);
     * hStock.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hStock.set...;</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">insert</span>(hStock);
     * ... = hStock.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param hStock The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(HStock hStock) {
        doInsert(hStock, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hStock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hStock.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hStock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">update</span>(hStock);
     * </pre>
     * @param hStock The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(HStock hStock) {
        doUpdate(hStock, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hStock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hStock.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(hStock);
     * </pre>
     * @param hStock The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(HStock hStock) {
        doUpdateNonstrict(hStock, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param hStock The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(HStock hStock) {
        doInsertOrUpdate(hStock, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param hStock The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(HStock hStock) {
        doInsertOrUpdateNonstrict(hStock, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hStock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">delete</span>(hStock);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param hStock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(HStock hStock) {
        doDelete(hStock, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(hStock);
     * </pre>
     * @param hStock The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(HStock hStock) {
        doDeleteNonstrict(hStock, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(hStock);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param hStock The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(HStock hStock) {
        doDeleteNonstrictIgnoreDeleted(hStock, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(HStock et, final DeleteOption<HStockCB> op) {
        assertObjectNotNull("hStock", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     HStock hStock = <span style="color: #70226C">new</span> HStock();
     *     hStock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hStock.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     hStockList.add(hStock);
     * }
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">batchInsert</span>(hStockList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<HStock> hStockList) {
        return doBatchInsert(hStockList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     HStock hStock = <span style="color: #70226C">new</span> HStock();
     *     hStock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hStock.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         hStock.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//hStock.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     hStockList.add(hStock);
     * }
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hStockList);
     * </pre>
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<HStock> hStockList) {
        return doBatchUpdate(hStockList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * hStockBhv.<span style="color: #CC4747">batchUpdate</span>(hStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<HStock> hStockList, SpecifyQuery<HStockCB> colCBLambda) {
        return doBatchUpdate(hStockList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     HStock hStock = <span style="color: #70226C">new</span> HStock();
     *     hStock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hStock.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         hStock.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//hStock.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     hStockList.add(hStock);
     * }
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hStockList);
     * </pre>
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<HStock> hStockList) {
        return doBatchUpdateNonstrict(hStockList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(hStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(hStockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<HStock> hStockList, SpecifyQuery<HStockCB> colCBLambda) {
        return doBatchUpdateNonstrict(hStockList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<HStock> hStockList) {
        return doBatchDelete(hStockList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<HStock> hStockList) {
        return doBatchDeleteNonstrict(hStockList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;HStock, HStockCB&gt;() {
     *     public ConditionBean setup(HStock entity, HStockCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<HStock, HStockCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//hStock.setPK...(value);</span>
     * hStock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hStock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hStock.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hStock.setVersionNo(value);</span>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">queryUpdate</span>(hStock, cb);
     * </pre>
     * @param hStock The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(HStock hStock, HStockCB cb) {
        return doQueryUpdate(hStock, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * HStockCB cb = new HStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">queryDelete</span>(hStock, cb);
     * </pre>
     * @param cb The condition-bean of HStock. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(HStockCB cb) {
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
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * hStock.setFoo...(value);
     * hStock.setBar...(value);
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">varyingInsert</span>(hStock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = hStock.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param hStock The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(HStock hStock, WritableOptionCall<HStockCB, InsertOption<HStockCB>> opLambda) {
        doInsert(hStock, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hStock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hStock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(hStock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param hStock The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(HStock hStock, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> opLambda) {
        doUpdate(hStock, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * hStock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hStock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hStock.setVersionNo(value);</span>
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(hStock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param hStock The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(HStock hStock, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> opLambda) {
        doUpdateNonstrict(hStock, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param hStock The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(HStock hStock, WritableOptionCall<HStockCB, InsertOption<HStockCB>> insertOpLambda, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> updateOpLambda) {
        doInsertOrUpdate(hStock, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param hStock The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(HStock hStock, WritableOptionCall<HStockCB, InsertOption<HStockCB>> insertOpLambda, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(hStock, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param hStock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(HStock hStock, WritableOptionCall<HStockCB, DeleteOption<HStockCB>> opLambda) {
        doDelete(hStock, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param hStock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(HStock hStock, WritableOptionCall<HStockCB, DeleteOption<HStockCB>> opLambda) {
        doDeleteNonstrict(hStock, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<HStock> hStockList, WritableOptionCall<HStockCB, InsertOption<HStockCB>> opLambda) {
        return doBatchInsert(hStockList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<HStock> hStockList, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> opLambda) {
        return doBatchUpdate(hStockList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<HStock> hStockList, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> opLambda) {
        return doBatchUpdateNonstrict(hStockList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<HStock> hStockList, WritableOptionCall<HStockCB, DeleteOption<HStockCB>> opLambda) {
        return doBatchDelete(hStockList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param hStockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<HStock> hStockList, WritableOptionCall<HStockCB, DeleteOption<HStockCB>> opLambda) {
        return doBatchDeleteNonstrict(hStockList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<HStock, HStockCB> manyArgLambda, WritableOptionCall<HStockCB, InsertOption<HStockCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * HStock hStock = <span style="color: #70226C">new</span> HStock();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//hStock.setPK...(value);</span>
     * hStock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hStock.setVersionNo(value);</span>
     * HStockCB cb = <span style="color: #70226C">new</span> HStockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hStockBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(hStock, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param hStock The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of HStock. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(HStock hStock, HStockCB cb, WritableOptionCall<HStockCB, UpdateOption<HStockCB>> opLambda) {
        return doQueryUpdate(hStock, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of HStock. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(HStockCB cb, WritableOptionCall<HStockCB, DeleteOption<HStockCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * hStockBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * hStockBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * hStockBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * hStockBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * hStockBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * hStockBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * hStockBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * hStockBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * hStockBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * hStockBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * hStockBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * hStockBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * hStockBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * hStockBhv.outideSql().removeBlockComment().selectList()
     * hStockBhv.outideSql().removeLineComment().selectList()
     * hStockBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<HStockBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<HStockBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends HStock> typeOfSelectedEntity() { return HStock.class; }
    protected Class<HStock> typeOfHandlingEntity() { return HStock.class; }
    protected Class<HStockCB> typeOfHandlingConditionBean() { return HStockCB.class; }
}
