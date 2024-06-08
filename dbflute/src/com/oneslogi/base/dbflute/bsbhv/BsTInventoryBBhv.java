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
 * The behavior of T_INVENTORY_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, PRODUCT_CD, FIRMTRANSPORT_CD, MANUFACTURE_DT, MANUFACTURE_SYMBOL, FCFLG, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, INVENTORY_INPUT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, T_INVENTORY_H, M_STOCK_TYPE, M_LOCATION, M_WAREHOUSE, T_STORE_NO, T_MOVE_INST_H, T_LOT, T_STOCK, M_SHAPE, M_PRODUCT, B_CLASS_DTL(ByInputType), T_INVENTORY_R(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_INP_HIST, T_INVENTORY_R
 *
 * [foreign property]
 *     mCustomerByDepositId, tInventoryH, mStockType, mLocation, mWarehouse, tStoreNo, mCustomerBySupplierId, tMoveInstH, tLot, tStock, mShape, mProduct, bClassDtlByInputType, bClassDtlByStockAdjustFlg, tInventoryRAsOne
 *
 * [referrer property]
 *     tInventoryInpHistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTInventoryBBhv extends AbstractBehaviorWritable<TInventoryB, TInventoryBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 棚卸ボディをリスト検索、棚卸ボディリストを取得する。 */
    public static final String PATH_selectSqlInventoryBInvCreate = "selectSqlInventoryBInvCreate";
    /** 棚卸ボディをリスト検索、棚卸ボディリストを取得する。 */
    public static final String PATH_selectSqlInventoryBInventoryCreateList = "selectSqlInventoryBInventoryCreateList";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TInventoryBDbm asDBMeta() { return TInventoryBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_INVENTORY_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TInventoryBDbm getMyDBMeta() { return TInventoryBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TInventoryBCB newConditionBean() { return new TInventoryBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TInventoryB newMyEntity() { return new TInventoryB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TInventoryBCB newMyConditionBean() { return new TInventoryBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TInventoryBCB cb) {
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
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().setFoo...(value);
     * TInventoryB tInventoryB = <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tInventoryB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tInventoryB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryB selectEntity(TInventoryBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TInventoryB facadeSelectEntity(TInventoryBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TInventoryB> OptionalEntity<ENTITY> doSelectOptionalEntity(TInventoryBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().set...;
     * TInventoryB tInventoryB = <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tInventoryB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryB selectEntityWithDeletedCheck(TInventoryBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param inventoryBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryB selectByPKValue(Long inventoryBId) {
        return facadeSelectByPKValue(inventoryBId);
    }

    protected TInventoryB facadeSelectByPKValue(Long inventoryBId) {
        return doSelectByPK(inventoryBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TInventoryB> ENTITY doSelectByPK(Long inventoryBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(inventoryBId), tp);
    }

    protected <ENTITY extends TInventoryB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long inventoryBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(inventoryBId, tp), inventoryBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param inventoryBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryB selectByPKValueWithDeletedCheck(Long inventoryBId) {
        return doSelectByPKWithDeletedCheck(inventoryBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TInventoryB> ENTITY doSelectByPKWithDeletedCheck(Long inventoryBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(inventoryBId), tp);
    }

    protected TInventoryBCB xprepareCBAsPK(Long inventoryBId) {
        assertObjectNotNull("inventoryBId", inventoryBId);
        return newConditionBean().acceptPK(inventoryBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TInventoryB&gt; <span style="color: #553000">tInventoryBList</span> = <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TInventoryB tInventoryB : <span style="color: #553000">tInventoryBList</span>) {
     *     ... = tInventoryB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TInventoryB> selectList(TInventoryBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TInventoryB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TInventoryB tInventoryB : <span style="color: #553000">page</span>) {
     *     ... = tInventoryB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TInventoryB> selectPage(TInventoryBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @param entityRowHandler The handler of entity row of TInventoryB. (NotNull)
     */
    public void selectCursor(TInventoryBCB cb, EntityRowHandler<TInventoryB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TInventoryBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TInventoryBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tInventoryBList The entity list of TInventoryB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TInventoryB> tInventoryBList, ReferrerLoaderHandler<LoaderOfTInventoryB> loaderLambda) {
        xassLRArg(tInventoryBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTInventoryB().ready(tInventoryBList, _behaviorSelector));
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
     * @param tInventoryB The entity of TInventoryB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TInventoryB tInventoryB, ReferrerLoaderHandler<LoaderOfTInventoryB> loaderLambda) {
        xassLRArg(tInventoryB, loaderLambda);
        loaderLambda.handle(new LoaderOfTInventoryB().ready(xnewLRAryLs(tInventoryB), _behaviorSelector));
    }

    /**
     * Load referrer of TInventoryInpHistList by the set-upper of referrer. <br>
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">loadTInventoryInpHistList</span>(<span style="color: #553000">tInventoryBList</span>, <span style="color: #553000">histCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">histCB</span>.setupSelect...
     *     <span style="color: #553000">histCB</span>.query().set...
     *     <span style="color: #553000">histCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TInventoryB tInventoryB : <span style="color: #553000">tInventoryBList</span>) {
     *     ... = tInventoryB.<span style="color: #CC4747">getTInventoryInpHistList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryBId_InScope(pkList);
     * cb.query().addOrderBy_InventoryBId_Asc();
     * </pre>
     * @param tInventoryBList The entity list of TInventoryB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInpHist> loadTInventoryInpHistList(List<TInventoryB> tInventoryBList, ConditionBeanSetupper<TInventoryInpHistCB> refCBLambda) {
        xassLRArg(tInventoryBList, refCBLambda);
        return doLoadTInventoryInpHistList(tInventoryBList, new LoadReferrerOption<TInventoryInpHistCB, TInventoryInpHist>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryInpHistList by the set-upper of referrer. <br>
     * T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">loadTInventoryInpHistList</span>(<span style="color: #553000">tInventoryB</span>, <span style="color: #553000">histCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">histCB</span>.setupSelect...
     *     <span style="color: #553000">histCB</span>.query().set...
     *     <span style="color: #553000">histCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tInventoryB</span>.<span style="color: #CC4747">getTInventoryInpHistList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryBId_InScope(pkList);
     * cb.query().addOrderBy_InventoryBId_Asc();
     * </pre>
     * @param tInventoryB The entity of TInventoryB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInpHist> loadTInventoryInpHistList(TInventoryB tInventoryB, ConditionBeanSetupper<TInventoryInpHistCB> refCBLambda) {
        xassLRArg(tInventoryB, refCBLambda);
        return doLoadTInventoryInpHistList(xnewLRLs(tInventoryB), new LoadReferrerOption<TInventoryInpHistCB, TInventoryInpHist>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tInventoryB The entity of TInventoryB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInpHist> loadTInventoryInpHistList(TInventoryB tInventoryB, LoadReferrerOption<TInventoryInpHistCB, TInventoryInpHist> loadReferrerOption) {
        xassLRArg(tInventoryB, loadReferrerOption);
        return loadTInventoryInpHistList(xnewLRLs(tInventoryB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tInventoryBList The entity list of TInventoryB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryInpHist> loadTInventoryInpHistList(List<TInventoryB> tInventoryBList, LoadReferrerOption<TInventoryInpHistCB, TInventoryInpHist> loadReferrerOption) {
        xassLRArg(tInventoryBList, loadReferrerOption);
        if (tInventoryBList.isEmpty()) { return (NestedReferrerListGateway<TInventoryInpHist>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryInpHistList(tInventoryBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryInpHist> doLoadTInventoryInpHistList(List<TInventoryB> tInventoryBList, LoadReferrerOption<TInventoryInpHistCB, TInventoryInpHist> option) {
        return helpLoadReferrerInternally(tInventoryBList, option, "tInventoryInpHistList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByDepositId(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mCustomerByDepositId"); }

    /**
     * Pull out the list of foreign table 'TInventoryH'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TInventoryH> pulloutTInventoryH(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "tInventoryH"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'TStoreNo'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNo> pulloutTStoreNo(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "tStoreNo"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerBySupplierId(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mCustomerBySupplierId"); }

    /**
     * Pull out the list of foreign table 'TMoveInstH'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TMoveInstH> pulloutTMoveInstH(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "tMoveInstH"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "tLot"); }

    /**
     * Pull out the list of foreign table 'TStock'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStock> pulloutTStock(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "tStock"); }

    /**
     * Pull out the list of foreign table 'MShape'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mShape"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInputType(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "bClassDtlByInputType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStockAdjustFlg(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "bClassDtlByStockAdjustFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'TInventoryR'.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TInventoryR> pulloutTInventoryRAsOne(List<TInventoryB> tInventoryBList)
    { return helpPulloutInternally(tInventoryBList, "tInventoryRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key inventoryBId.
     * @param tInventoryBList The list of tInventoryB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractInventoryBIdList(List<TInventoryB> tInventoryBList)
    { return helpExtractListInternally(tInventoryBList, "inventoryBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tInventoryB.setFoo...(value);
     * tInventoryB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryB.set...;</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">insert</span>(tInventoryB);
     * ... = tInventoryB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tInventoryB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TInventoryB tInventoryB) {
        doInsert(tInventoryB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tInventoryB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">update</span>(tInventoryB);
     * </pre>
     * @param tInventoryB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TInventoryB tInventoryB) {
        doUpdate(tInventoryB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tInventoryB);
     * </pre>
     * @param tInventoryB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TInventoryB tInventoryB) {
        doUpdateNonstrict(tInventoryB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tInventoryB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TInventoryB tInventoryB) {
        doInsertOrUpdate(tInventoryB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tInventoryB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TInventoryB tInventoryB) {
        doInsertOrUpdateNonstrict(tInventoryB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tInventoryB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">delete</span>(tInventoryB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tInventoryB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TInventoryB tInventoryB) {
        doDelete(tInventoryB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tInventoryB);
     * </pre>
     * @param tInventoryB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TInventoryB tInventoryB) {
        doDeleteNonstrict(tInventoryB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tInventoryB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tInventoryB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TInventoryB tInventoryB) {
        doDeleteNonstrictIgnoreDeleted(tInventoryB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TInventoryB et, final DeleteOption<TInventoryBCB> op) {
        assertObjectNotNull("tInventoryB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     *     tInventoryB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tInventoryB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tInventoryBList.add(tInventoryB);
     * }
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tInventoryBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TInventoryB> tInventoryBList) {
        return doBatchInsert(tInventoryBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     *     tInventoryB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tInventoryB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tInventoryB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tInventoryB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tInventoryBList.add(tInventoryB);
     * }
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tInventoryBList);
     * </pre>
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TInventoryB> tInventoryBList) {
        return doBatchUpdate(tInventoryBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tInventoryBBhv.<span style="color: #CC4747">batchUpdate</span>(tInventoryBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tInventoryBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TInventoryB> tInventoryBList, SpecifyQuery<TInventoryBCB> colCBLambda) {
        return doBatchUpdate(tInventoryBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     *     tInventoryB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tInventoryB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tInventoryB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tInventoryB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tInventoryBList.add(tInventoryB);
     * }
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tInventoryBList);
     * </pre>
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TInventoryB> tInventoryBList) {
        return doBatchUpdateNonstrict(tInventoryBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tInventoryBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tInventoryBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TInventoryB> tInventoryBList, SpecifyQuery<TInventoryBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tInventoryBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TInventoryB> tInventoryBList) {
        return doBatchDelete(tInventoryBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TInventoryB> tInventoryBList) {
        return doBatchDeleteNonstrict(tInventoryBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TInventoryB, TInventoryBCB&gt;() {
     *     public ConditionBean setup(TInventoryB entity, TInventoryBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TInventoryB, TInventoryBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tInventoryB.setPK...(value);</span>
     * tInventoryB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryB.setVersionNo(value);</span>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tInventoryB, cb);
     * </pre>
     * @param tInventoryB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TInventoryB tInventoryB, TInventoryBCB cb) {
        return doQueryUpdate(tInventoryB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TInventoryBCB cb = new TInventoryBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tInventoryB, cb);
     * </pre>
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TInventoryBCB cb) {
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
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tInventoryB.setFoo...(value);
     * tInventoryB.setBar...(value);
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tInventoryB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tInventoryB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tInventoryB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, InsertOption<TInventoryBCB>> opLambda) {
        doInsert(tInventoryB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tInventoryB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tInventoryB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tInventoryB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> opLambda) {
        doUpdate(tInventoryB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * tInventoryB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tInventoryB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tInventoryB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> opLambda) {
        doUpdateNonstrict(tInventoryB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tInventoryB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, InsertOption<TInventoryBCB>> insertOpLambda, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> updateOpLambda) {
        doInsertOrUpdate(tInventoryB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tInventoryB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, InsertOption<TInventoryBCB>> insertOpLambda, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tInventoryB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tInventoryB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, DeleteOption<TInventoryBCB>> opLambda) {
        doDelete(tInventoryB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tInventoryB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TInventoryB tInventoryB, WritableOptionCall<TInventoryBCB, DeleteOption<TInventoryBCB>> opLambda) {
        doDeleteNonstrict(tInventoryB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TInventoryB> tInventoryBList, WritableOptionCall<TInventoryBCB, InsertOption<TInventoryBCB>> opLambda) {
        return doBatchInsert(tInventoryBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TInventoryB> tInventoryBList, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> opLambda) {
        return doBatchUpdate(tInventoryBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TInventoryB> tInventoryBList, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> opLambda) {
        return doBatchUpdateNonstrict(tInventoryBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TInventoryB> tInventoryBList, WritableOptionCall<TInventoryBCB, DeleteOption<TInventoryBCB>> opLambda) {
        return doBatchDelete(tInventoryBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tInventoryBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TInventoryB> tInventoryBList, WritableOptionCall<TInventoryBCB, DeleteOption<TInventoryBCB>> opLambda) {
        return doBatchDeleteNonstrict(tInventoryBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TInventoryB, TInventoryBCB> manyArgLambda, WritableOptionCall<TInventoryBCB, InsertOption<TInventoryBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TInventoryB tInventoryB = <span style="color: #70226C">new</span> TInventoryB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tInventoryB.setPK...(value);</span>
     * tInventoryB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryB.setVersionNo(value);</span>
     * TInventoryBCB cb = <span style="color: #70226C">new</span> TInventoryBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tInventoryBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tInventoryB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tInventoryB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TInventoryB tInventoryB, TInventoryBCB cb, WritableOptionCall<TInventoryBCB, UpdateOption<TInventoryBCB>> opLambda) {
        return doQueryUpdate(tInventoryB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TInventoryB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TInventoryBCB cb, WritableOptionCall<TInventoryBCB, DeleteOption<TInventoryBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tInventoryBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tInventoryBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tInventoryBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tInventoryBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tInventoryBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tInventoryBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tInventoryBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tInventoryBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tInventoryBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tInventoryBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tInventoryBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tInventoryBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tInventoryBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tInventoryBBhv.outideSql().removeBlockComment().selectList()
     * tInventoryBBhv.outideSql().removeLineComment().selectList()
     * tInventoryBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TInventoryBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TInventoryBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TInventoryB> typeOfSelectedEntity() { return TInventoryB.class; }
    protected Class<TInventoryB> typeOfHandlingEntity() { return TInventoryB.class; }
    protected Class<TInventoryBCB> typeOfHandlingConditionBean() { return TInventoryBCB.class; }
}
