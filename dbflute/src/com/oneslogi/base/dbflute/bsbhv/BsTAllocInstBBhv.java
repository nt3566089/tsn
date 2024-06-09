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
 * The behavior of T_ALLOC_INST_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     ALLOC_INST_B_ID
 *
 * [column]
 *     ALLOC_INST_B_ID, ALLOC_INST_H_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, LIMIT_DT_REVERSE_FLG, SHIPPING_LIMIT_DT, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, UNIT_NUM, INST_NUM, PROCESS_NO, ALLOC_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_H, M_CUSTOMER, M_LOCATION, T_LOT, M_PRODUCT, M_SHAPE, M_STOCK_TYPE, T_STORE_NO, M_WAREHOUSE, B_CLASS_DTL(ByLimitDtManagFlg), T_ALLOC_LOT(AsOne)
 *
 * [referrer table]
 *     T_PACKING_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK_INOUT, T_ALLOC_LOT
 *
 * [foreign property]
 *     tAllocInstH, mCustomer, mLocation, tLot, mProduct, mShape, mStockType, tStoreNo, mWarehouse, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, tAllocLotAsOne
 *
 * [referrer property]
 *     tPackingBList, tPickingBList, tShippingInstBList, tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTAllocInstBBhv extends AbstractBehaviorWritable<TAllocInstB, TAllocInstBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TAllocInstBDbm asDBMeta() { return TAllocInstBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_ALLOC_INST_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TAllocInstBDbm getMyDBMeta() { return TAllocInstBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TAllocInstBCB newConditionBean() { return new TAllocInstBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TAllocInstB newMyEntity() { return new TAllocInstB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TAllocInstBCB newMyConditionBean() { return new TAllocInstBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TAllocInstBCB cb) {
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
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().setFoo...(value);
     * TAllocInstB tAllocInstB = <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tAllocInstB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tAllocInstB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstB selectEntity(TAllocInstBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TAllocInstB facadeSelectEntity(TAllocInstBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TAllocInstB> OptionalEntity<ENTITY> doSelectOptionalEntity(TAllocInstBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().set...;
     * TAllocInstB tAllocInstB = <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tAllocInstB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstB selectEntityWithDeletedCheck(TAllocInstBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param allocInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstB selectByPKValue(Long allocInstBId) {
        return facadeSelectByPKValue(allocInstBId);
    }

    protected TAllocInstB facadeSelectByPKValue(Long allocInstBId) {
        return doSelectByPK(allocInstBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TAllocInstB> ENTITY doSelectByPK(Long allocInstBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(allocInstBId), tp);
    }

    protected <ENTITY extends TAllocInstB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long allocInstBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(allocInstBId, tp), allocInstBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param allocInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstB selectByPKValueWithDeletedCheck(Long allocInstBId) {
        return doSelectByPKWithDeletedCheck(allocInstBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TAllocInstB> ENTITY doSelectByPKWithDeletedCheck(Long allocInstBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(allocInstBId), tp);
    }

    protected TAllocInstBCB xprepareCBAsPK(Long allocInstBId) {
        assertObjectNotNull("allocInstBId", allocInstBId);
        return newConditionBean().acceptPK(allocInstBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TAllocInstB&gt; <span style="color: #553000">tAllocInstBList</span> = <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TAllocInstB> selectList(TAllocInstBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TAllocInstB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TAllocInstB tAllocInstB : <span style="color: #553000">page</span>) {
     *     ... = tAllocInstB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TAllocInstB> selectPage(TAllocInstBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @param entityRowHandler The handler of entity row of TAllocInstB. (NotNull)
     */
    public void selectCursor(TAllocInstBCB cb, EntityRowHandler<TAllocInstB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TAllocInstBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TAllocInstBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TAllocInstB> tAllocInstBList, ReferrerLoaderHandler<LoaderOfTAllocInstB> loaderLambda) {
        xassLRArg(tAllocInstBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTAllocInstB().ready(tAllocInstBList, _behaviorSelector));
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
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TAllocInstB tAllocInstB, ReferrerLoaderHandler<LoaderOfTAllocInstB> loaderLambda) {
        xassLRArg(tAllocInstB, loaderLambda);
        loaderLambda.handle(new LoaderOfTAllocInstB().ready(xnewLRAryLs(tAllocInstB), _behaviorSelector));
    }

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(List<TAllocInstB> tAllocInstBList, ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        xassLRArg(tAllocInstBList, refCBLambda);
        return doLoadTPackingBList(tAllocInstBList, new LoadReferrerOption<TPackingBCB, TPackingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by ALLOC_INST_B_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">tAllocInstB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstB</span>.<span style="color: #CC4747">getTPackingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(TAllocInstB tAllocInstB, ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        xassLRArg(tAllocInstB, refCBLambda);
        return doLoadTPackingBList(xnewLRLs(tAllocInstB), new LoadReferrerOption<TPackingBCB, TPackingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(TAllocInstB tAllocInstB, LoadReferrerOption<TPackingBCB, TPackingB> loadReferrerOption) {
        xassLRArg(tAllocInstB, loadReferrerOption);
        return loadTPackingBList(xnewLRLs(tAllocInstB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TPackingBCB, TPackingB> loadReferrerOption) {
        xassLRArg(tAllocInstBList, loadReferrerOption);
        if (tAllocInstBList.isEmpty()) { return (NestedReferrerListGateway<TPackingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingBList(tAllocInstBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingB> doLoadTPackingBList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TPackingBCB, TPackingB> option) {
        return helpLoadReferrerInternally(tAllocInstBList, option, "tPackingBList");
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TAllocInstB> tAllocInstBList, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tAllocInstBList, refCBLambda);
        return doLoadTPickingBList(tAllocInstBList, new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by ALLOC_INST_B_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tAllocInstB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstB</span>.<span style="color: #CC4747">getTPickingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TAllocInstB tAllocInstB, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tAllocInstB, refCBLambda);
        return doLoadTPickingBList(xnewLRLs(tAllocInstB), new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TAllocInstB tAllocInstB, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tAllocInstB, loadReferrerOption);
        return loadTPickingBList(xnewLRLs(tAllocInstB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tAllocInstBList, loadReferrerOption);
        if (tAllocInstBList.isEmpty()) { return (NestedReferrerListGateway<TPickingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingBList(tAllocInstBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingB> doLoadTPickingBList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TPickingBCB, TPickingB> option) {
        return helpLoadReferrerInternally(tAllocInstBList, option, "tPickingBList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<TAllocInstB> tAllocInstBList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(tAllocInstBList, refCBLambda);
        return doLoadTShippingInstBList(tAllocInstBList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by ALLOC_INST_B_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">tAllocInstB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstB</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(TAllocInstB tAllocInstB, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(tAllocInstB, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(tAllocInstB), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(TAllocInstB tAllocInstB, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(tAllocInstB, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(tAllocInstB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(tAllocInstBList, loadReferrerOption);
        if (tAllocInstBList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(tAllocInstBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(tAllocInstBList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">tAllocInstBList</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstB tAllocInstB : <span style="color: #553000">tAllocInstBList</span>) {
     *     ... = tAllocInstB.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<TAllocInstB> tAllocInstBList, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(tAllocInstBList, refCBLambda);
        return doLoadTStockInoutList(tAllocInstBList, new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by ALLOC_INST_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">tAllocInstB</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstB</span>.<span style="color: #CC4747">getTStockInoutList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstBId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstBId_Asc();
     * </pre>
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(TAllocInstB tAllocInstB, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(tAllocInstB, refCBLambda);
        return doLoadTStockInoutList(xnewLRLs(tAllocInstB), new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstB The entity of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(TAllocInstB tAllocInstB, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(tAllocInstB, loadReferrerOption);
        return loadTStockInoutList(xnewLRLs(tAllocInstB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstBList The entity list of TAllocInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(tAllocInstBList, loadReferrerOption);
        if (tAllocInstBList.isEmpty()) { return (NestedReferrerListGateway<TStockInout>)EMPTY_NREF_LGWAY; }
        return doLoadTStockInoutList(tAllocInstBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStockInout> doLoadTStockInoutList(List<TAllocInstB> tAllocInstBList, LoadReferrerOption<TStockInoutCB, TStockInout> option) {
        return helpLoadReferrerInternally(tAllocInstBList, option, "tStockInoutList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TAllocInstH'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TAllocInstH> pulloutTAllocInstH(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "tAllocInstH"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "mCustomer"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "tLot"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MShape'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "mShape"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'TStoreNo'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNo> pulloutTStoreNo(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "tStoreNo"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitDtManagFlg(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "bClassDtlByLimitDtManagFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitDtReverseFlg(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "bClassDtlByLimitDtReverseFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLotManagFlg(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "bClassDtlByLotManagFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'TAllocLot'.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TAllocLot> pulloutTAllocLotAsOne(List<TAllocInstB> tAllocInstBList)
    { return helpPulloutInternally(tAllocInstBList, "tAllocLotAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key allocInstBId.
     * @param tAllocInstBList The list of tAllocInstB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractAllocInstBIdList(List<TAllocInstB> tAllocInstBList)
    { return helpExtractListInternally(tAllocInstBList, "allocInstBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tAllocInstB.setFoo...(value);
     * tAllocInstB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstB.set...;</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">insert</span>(tAllocInstB);
     * ... = tAllocInstB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tAllocInstB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TAllocInstB tAllocInstB) {
        doInsert(tAllocInstB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tAllocInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">update</span>(tAllocInstB);
     * </pre>
     * @param tAllocInstB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TAllocInstB tAllocInstB) {
        doUpdate(tAllocInstB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tAllocInstB);
     * </pre>
     * @param tAllocInstB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TAllocInstB tAllocInstB) {
        doUpdateNonstrict(tAllocInstB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tAllocInstB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TAllocInstB tAllocInstB) {
        doInsertOrUpdate(tAllocInstB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tAllocInstB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TAllocInstB tAllocInstB) {
        doInsertOrUpdateNonstrict(tAllocInstB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tAllocInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">delete</span>(tAllocInstB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tAllocInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TAllocInstB tAllocInstB) {
        doDelete(tAllocInstB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tAllocInstB);
     * </pre>
     * @param tAllocInstB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TAllocInstB tAllocInstB) {
        doDeleteNonstrict(tAllocInstB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tAllocInstB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tAllocInstB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TAllocInstB tAllocInstB) {
        doDeleteNonstrictIgnoreDeleted(tAllocInstB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TAllocInstB et, final DeleteOption<TAllocInstBCB> op) {
        assertObjectNotNull("tAllocInstB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     *     tAllocInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tAllocInstB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tAllocInstBList.add(tAllocInstB);
     * }
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tAllocInstBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TAllocInstB> tAllocInstBList) {
        return doBatchInsert(tAllocInstBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     *     tAllocInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tAllocInstB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tAllocInstB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tAllocInstB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tAllocInstBList.add(tAllocInstB);
     * }
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tAllocInstBList);
     * </pre>
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TAllocInstB> tAllocInstBList) {
        return doBatchUpdate(tAllocInstBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tAllocInstBBhv.<span style="color: #CC4747">batchUpdate</span>(tAllocInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tAllocInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TAllocInstB> tAllocInstBList, SpecifyQuery<TAllocInstBCB> colCBLambda) {
        return doBatchUpdate(tAllocInstBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     *     tAllocInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tAllocInstB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tAllocInstB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tAllocInstB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tAllocInstBList.add(tAllocInstB);
     * }
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tAllocInstBList);
     * </pre>
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TAllocInstB> tAllocInstBList) {
        return doBatchUpdateNonstrict(tAllocInstBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tAllocInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tAllocInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TAllocInstB> tAllocInstBList, SpecifyQuery<TAllocInstBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tAllocInstBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TAllocInstB> tAllocInstBList) {
        return doBatchDelete(tAllocInstBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TAllocInstB> tAllocInstBList) {
        return doBatchDeleteNonstrict(tAllocInstBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TAllocInstB, TAllocInstBCB&gt;() {
     *     public ConditionBean setup(TAllocInstB entity, TAllocInstBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TAllocInstB, TAllocInstBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setPK...(value);</span>
     * tAllocInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setVersionNo(value);</span>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tAllocInstB, cb);
     * </pre>
     * @param tAllocInstB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TAllocInstB tAllocInstB, TAllocInstBCB cb) {
        return doQueryUpdate(tAllocInstB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TAllocInstBCB cb = new TAllocInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tAllocInstB, cb);
     * </pre>
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TAllocInstBCB cb) {
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
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tAllocInstB.setFoo...(value);
     * tAllocInstB.setBar...(value);
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tAllocInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tAllocInstB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tAllocInstB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, InsertOption<TAllocInstBCB>> opLambda) {
        doInsert(tAllocInstB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tAllocInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tAllocInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tAllocInstB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> opLambda) {
        doUpdate(tAllocInstB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * tAllocInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tAllocInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tAllocInstB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> opLambda) {
        doUpdateNonstrict(tAllocInstB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tAllocInstB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, InsertOption<TAllocInstBCB>> insertOpLambda, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> updateOpLambda) {
        doInsertOrUpdate(tAllocInstB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tAllocInstB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, InsertOption<TAllocInstBCB>> insertOpLambda, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tAllocInstB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tAllocInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, DeleteOption<TAllocInstBCB>> opLambda) {
        doDelete(tAllocInstB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tAllocInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TAllocInstB tAllocInstB, WritableOptionCall<TAllocInstBCB, DeleteOption<TAllocInstBCB>> opLambda) {
        doDeleteNonstrict(tAllocInstB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TAllocInstB> tAllocInstBList, WritableOptionCall<TAllocInstBCB, InsertOption<TAllocInstBCB>> opLambda) {
        return doBatchInsert(tAllocInstBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TAllocInstB> tAllocInstBList, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> opLambda) {
        return doBatchUpdate(tAllocInstBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TAllocInstB> tAllocInstBList, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> opLambda) {
        return doBatchUpdateNonstrict(tAllocInstBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TAllocInstB> tAllocInstBList, WritableOptionCall<TAllocInstBCB, DeleteOption<TAllocInstBCB>> opLambda) {
        return doBatchDelete(tAllocInstBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tAllocInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TAllocInstB> tAllocInstBList, WritableOptionCall<TAllocInstBCB, DeleteOption<TAllocInstBCB>> opLambda) {
        return doBatchDeleteNonstrict(tAllocInstBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TAllocInstB, TAllocInstBCB> manyArgLambda, WritableOptionCall<TAllocInstBCB, InsertOption<TAllocInstBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TAllocInstB tAllocInstB = <span style="color: #70226C">new</span> TAllocInstB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setPK...(value);</span>
     * tAllocInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstB.setVersionNo(value);</span>
     * TAllocInstBCB cb = <span style="color: #70226C">new</span> TAllocInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tAllocInstBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tAllocInstB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tAllocInstB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TAllocInstB tAllocInstB, TAllocInstBCB cb, WritableOptionCall<TAllocInstBCB, UpdateOption<TAllocInstBCB>> opLambda) {
        return doQueryUpdate(tAllocInstB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TAllocInstB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TAllocInstBCB cb, WritableOptionCall<TAllocInstBCB, DeleteOption<TAllocInstBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tAllocInstBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tAllocInstBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tAllocInstBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tAllocInstBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tAllocInstBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tAllocInstBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tAllocInstBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tAllocInstBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tAllocInstBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tAllocInstBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tAllocInstBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tAllocInstBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tAllocInstBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tAllocInstBBhv.outideSql().removeBlockComment().selectList()
     * tAllocInstBBhv.outideSql().removeLineComment().selectList()
     * tAllocInstBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TAllocInstBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TAllocInstBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TAllocInstB> typeOfSelectedEntity() { return TAllocInstB.class; }
    protected Class<TAllocInstB> typeOfHandlingEntity() { return TAllocInstB.class; }
    protected Class<TAllocInstBCB> typeOfHandlingConditionBean() { return TAllocInstBCB.class; }
}
