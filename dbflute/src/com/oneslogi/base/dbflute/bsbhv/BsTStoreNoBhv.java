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
 * The behavior of T_STORE_NO as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_NO_ID
 *
 * [column]
 *     STORE_NO_ID, STORE_LABEL_NO, OLD_STORE_NUM_ID, SUPPLIER_ID, STORE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_NO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STORE_NO, M_CUSTOMER, T_STORE_NO_R(AsOne)
 *
 * [referrer table]
 *     T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_SHIPPING_INST_B, T_STOCK, T_STORE_NO, T_STORE_NO_R
 *
 * [foreign property]
 *     tStoreNoSelf, mCustomer, tStoreNoRAsOne
 *
 * [referrer property]
 *     tAllocInstBList, tInventoryBList, tMoveInstBList, tShippingInstBList, tStockList, tStoreNoSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStoreNoBhv extends AbstractBehaviorWritable<TStoreNo, TStoreNoCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TStoreNoDbm asDBMeta() { return TStoreNoDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_STORE_NO"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TStoreNoDbm getMyDBMeta() { return TStoreNoDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TStoreNoCB newConditionBean() { return new TStoreNoCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TStoreNo newMyEntity() { return new TStoreNo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TStoreNoCB newMyConditionBean() { return new TStoreNoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TStoreNoCB cb) {
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
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().setFoo...(value);
     * TStoreNo tStoreNo = <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tStoreNo != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tStoreNo.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreNo selectEntity(TStoreNoCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TStoreNo facadeSelectEntity(TStoreNoCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreNo> OptionalEntity<ENTITY> doSelectOptionalEntity(TStoreNoCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().set...;
     * TStoreNo tStoreNo = <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tStoreNo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreNo selectEntityWithDeletedCheck(TStoreNoCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param storeNoId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreNo selectByPKValue(Long storeNoId) {
        return facadeSelectByPKValue(storeNoId);
    }

    protected TStoreNo facadeSelectByPKValue(Long storeNoId) {
        return doSelectByPK(storeNoId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreNo> ENTITY doSelectByPK(Long storeNoId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(storeNoId), tp);
    }

    protected <ENTITY extends TStoreNo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long storeNoId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(storeNoId, tp), storeNoId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param storeNoId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreNo selectByPKValueWithDeletedCheck(Long storeNoId) {
        return doSelectByPKWithDeletedCheck(storeNoId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreNo> ENTITY doSelectByPKWithDeletedCheck(Long storeNoId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(storeNoId), tp);
    }

    protected TStoreNoCB xprepareCBAsPK(Long storeNoId) {
        assertObjectNotNull("storeNoId", storeNoId);
        return newConditionBean().acceptPK(storeNoId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param storeLabelNo : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<TStoreNo> selectByUniqueOf(String storeLabelNo) {
        return facadeSelectByUniqueOf(storeLabelNo);
    }

    protected OptionalEntity<TStoreNo> facadeSelectByUniqueOf(String storeLabelNo) {
        return doSelectByUniqueOf(storeLabelNo, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreNo> OptionalEntity<ENTITY> doSelectByUniqueOf(String storeLabelNo, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(storeLabelNo), tp), storeLabelNo);
    }

    protected TStoreNoCB xprepareCBAsUniqueOf(String storeLabelNo) {
        assertObjectNotNull("storeLabelNo", storeLabelNo);
        return newConditionBean().acceptUniqueOf(storeLabelNo);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TStoreNo&gt; <span style="color: #553000">tStoreNoList</span> = <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TStoreNo> selectList(TStoreNoCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TStoreNo&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">page</span>) {
     *     ... = tStoreNo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TStoreNo> selectPage(TStoreNoCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().set...
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @param entityRowHandler The handler of entity row of TStoreNo. (NotNull)
     */
    public void selectCursor(TStoreNoCB cb, EntityRowHandler<TStoreNo> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStoreNoCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStoreNoCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TStoreNo> tStoreNoList, ReferrerLoaderHandler<LoaderOfTStoreNo> loaderLambda) {
        xassLRArg(tStoreNoList, loaderLambda);
        loaderLambda.handle(new LoaderOfTStoreNo().ready(tStoreNoList, _behaviorSelector));
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
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TStoreNo tStoreNo, ReferrerLoaderHandler<LoaderOfTStoreNo> loaderLambda) {
        xassLRArg(tStoreNo, loaderLambda);
        loaderLambda.handle(new LoaderOfTStoreNo().ready(xnewLRAryLs(tStoreNo), _behaviorSelector));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by STORE_NO_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<TStoreNo> tStoreNoList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(tStoreNoList, refCBLambda);
        return doLoadTAllocInstBList(tStoreNoList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by STORE_NO_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">tStoreNo</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(TStoreNo tStoreNo, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(tStoreNo, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(tStoreNo), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(TStoreNo tStoreNo, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(tStoreNo, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(tStoreNo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(tStoreNoList, loadReferrerOption);
        if (tStoreNoList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(tStoreNoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(tStoreNoList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STORE_NO_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<TStoreNo> tStoreNoList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(tStoreNoList, refCBLambda);
        return doLoadTInventoryBList(tStoreNoList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STORE_NO_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">tStoreNo</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(TStoreNo tStoreNo, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(tStoreNo, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(tStoreNo), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(TStoreNo tStoreNo, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(tStoreNo, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(tStoreNo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(tStoreNoList, loadReferrerOption);
        if (tStoreNoList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(tStoreNoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(tStoreNoList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by STORE_NO_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<TStoreNo> tStoreNoList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(tStoreNoList, refCBLambda);
        return doLoadTMoveInstBList(tStoreNoList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by STORE_NO_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">tStoreNo</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(TStoreNo tStoreNo, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(tStoreNo, refCBLambda);
        return doLoadTMoveInstBList(xnewLRLs(tStoreNo), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(TStoreNo tStoreNo, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(tStoreNo, loadReferrerOption);
        return loadTMoveInstBList(xnewLRLs(tStoreNo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(tStoreNoList, loadReferrerOption);
        if (tStoreNoList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBList(tStoreNoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(tStoreNoList, option, "tMoveInstBList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by STORE_NO_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<TStoreNo> tStoreNoList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(tStoreNoList, refCBLambda);
        return doLoadTShippingInstBList(tStoreNoList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by STORE_NO_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">tStoreNo</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(TStoreNo tStoreNo, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(tStoreNo, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(tStoreNo), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(TStoreNo tStoreNo, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(tStoreNo, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(tStoreNo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(tStoreNoList, loadReferrerOption);
        if (tStoreNoList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(tStoreNoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(tStoreNoList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by STORE_NO_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<TStoreNo> tStoreNoList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(tStoreNoList, refCBLambda);
        return doLoadTStockList(tStoreNoList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by STORE_NO_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">tStoreNo</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreNoId_InScope(pkList);
     * cb.query().addOrderBy_StoreNoId_Asc();
     * </pre>
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(TStoreNo tStoreNo, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(tStoreNo, refCBLambda);
        return doLoadTStockList(xnewLRLs(tStoreNo), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(TStoreNo tStoreNo, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(tStoreNo, loadReferrerOption);
        return loadTStockList(xnewLRLs(tStoreNo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(tStoreNoList, loadReferrerOption);
        if (tStoreNoList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(tStoreNoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(tStoreNoList, option, "tStockList");
    }

    /**
     * Load referrer of TStoreNoSelfList by the set-upper of referrer. <br>
     * T_STORE_NO by OLD_STORE_NUM_ID, named 'TStoreNoSelfList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTStoreNoSelfList</span>(<span style="color: #553000">tStoreNoList</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreNo tStoreNo : <span style="color: #553000">tStoreNoList</span>) {
     *     ... = tStoreNo.<span style="color: #CC4747">getTStoreNoSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldStoreNumId_InScope(pkList);
     * cb.query().addOrderBy_OldStoreNumId_Asc();
     * </pre>
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoSelfList(List<TStoreNo> tStoreNoList, ConditionBeanSetupper<TStoreNoCB> refCBLambda) {
        xassLRArg(tStoreNoList, refCBLambda);
        return doLoadTStoreNoSelfList(tStoreNoList, new LoadReferrerOption<TStoreNoCB, TStoreNo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreNoSelfList by the set-upper of referrer. <br>
     * T_STORE_NO by OLD_STORE_NUM_ID, named 'TStoreNoSelfList'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">loadTStoreNoSelfList</span>(<span style="color: #553000">tStoreNo</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTStoreNoSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldStoreNumId_InScope(pkList);
     * cb.query().addOrderBy_OldStoreNumId_Asc();
     * </pre>
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoSelfList(TStoreNo tStoreNo, ConditionBeanSetupper<TStoreNoCB> refCBLambda) {
        xassLRArg(tStoreNo, refCBLambda);
        return doLoadTStoreNoSelfList(xnewLRLs(tStoreNo), new LoadReferrerOption<TStoreNoCB, TStoreNo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreNo The entity of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoSelfList(TStoreNo tStoreNo, LoadReferrerOption<TStoreNoCB, TStoreNo> loadReferrerOption) {
        xassLRArg(tStoreNo, loadReferrerOption);
        return loadTStoreNoSelfList(xnewLRLs(tStoreNo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreNoList The entity list of TStoreNo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoSelfList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TStoreNoCB, TStoreNo> loadReferrerOption) {
        xassLRArg(tStoreNoList, loadReferrerOption);
        if (tStoreNoList.isEmpty()) { return (NestedReferrerListGateway<TStoreNo>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreNoSelfList(tStoreNoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreNo> doLoadTStoreNoSelfList(List<TStoreNo> tStoreNoList, LoadReferrerOption<TStoreNoCB, TStoreNo> option) {
        return helpLoadReferrerInternally(tStoreNoList, option, "tStoreNoSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TStoreNo'.
     * @param tStoreNoList The list of tStoreNo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNo> pulloutTStoreNoSelf(List<TStoreNo> tStoreNoList)
    { return helpPulloutInternally(tStoreNoList, "tStoreNoSelf"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tStoreNoList The list of tStoreNo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<TStoreNo> tStoreNoList)
    { return helpPulloutInternally(tStoreNoList, "mCustomer"); }

    /**
     * Pull out the list of referrer-as-one table 'TStoreNoR'.
     * @param tStoreNoList The list of tStoreNo. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNoR> pulloutTStoreNoRAsOne(List<TStoreNo> tStoreNoList)
    { return helpPulloutInternally(tStoreNoList, "tStoreNoRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key storeNoId.
     * @param tStoreNoList The list of tStoreNo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStoreNoIdList(List<TStoreNo> tStoreNoList)
    { return helpExtractListInternally(tStoreNoList, "storeNoId"); }

    /**
     * Extract the value list of (single) unique key storeLabelNo.
     * @param tStoreNoList The list of tStoreNo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractStoreLabelNoList(List<TStoreNo> tStoreNoList)
    { return helpExtractListInternally(tStoreNoList, "storeLabelNo"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStoreNo.setFoo...(value);
     * tStoreNo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreNo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreNo.set...;</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">insert</span>(tStoreNo);
     * ... = tStoreNo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tStoreNo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TStoreNo tStoreNo) {
        doInsert(tStoreNo, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreNo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreNo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreNo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreNo.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">update</span>(tStoreNo);
     * </pre>
     * @param tStoreNo The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TStoreNo tStoreNo) {
        doUpdate(tStoreNo, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreNo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreNo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreNo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreNo.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tStoreNo);
     * </pre>
     * @param tStoreNo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TStoreNo tStoreNo) {
        doUpdateNonstrict(tStoreNo, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStoreNo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TStoreNo tStoreNo) {
        doInsertOrUpdate(tStoreNo, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStoreNo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TStoreNo tStoreNo) {
        doInsertOrUpdateNonstrict(tStoreNo, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreNo.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">delete</span>(tStoreNo);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tStoreNo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TStoreNo tStoreNo) {
        doDelete(tStoreNo, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreNo.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tStoreNo);
     * </pre>
     * @param tStoreNo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TStoreNo tStoreNo) {
        doDeleteNonstrict(tStoreNo, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreNo.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tStoreNo);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tStoreNo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TStoreNo tStoreNo) {
        doDeleteNonstrictIgnoreDeleted(tStoreNo, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TStoreNo et, final DeleteOption<TStoreNoCB> op) {
        assertObjectNotNull("tStoreNo", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     *     tStoreNo.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreNo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tStoreNoList.add(tStoreNo);
     * }
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">batchInsert</span>(tStoreNoList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TStoreNo> tStoreNoList) {
        return doBatchInsert(tStoreNoList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     *     tStoreNo.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreNo.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStoreNo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStoreNo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStoreNoList.add(tStoreNo);
     * }
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreNoList);
     * </pre>
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStoreNo> tStoreNoList) {
        return doBatchUpdate(tStoreNoList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tStoreNoBhv.<span style="color: #CC4747">batchUpdate</span>(tStoreNoList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreNoList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStoreNo> tStoreNoList, SpecifyQuery<TStoreNoCB> colCBLambda) {
        return doBatchUpdate(tStoreNoList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     *     tStoreNo.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreNo.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStoreNo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStoreNo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStoreNoList.add(tStoreNo);
     * }
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreNoList);
     * </pre>
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStoreNo> tStoreNoList) {
        return doBatchUpdateNonstrict(tStoreNoList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStoreNoList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStoreNoList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStoreNo> tStoreNoList, SpecifyQuery<TStoreNoCB> colCBLambda) {
        return doBatchUpdateNonstrict(tStoreNoList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TStoreNo> tStoreNoList) {
        return doBatchDelete(tStoreNoList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TStoreNo> tStoreNoList) {
        return doBatchDeleteNonstrict(tStoreNoList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TStoreNo, TStoreNoCB&gt;() {
     *     public ConditionBean setup(TStoreNo entity, TStoreNoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TStoreNo, TStoreNoCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStoreNo.setPK...(value);</span>
     * tStoreNo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreNo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreNo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreNo.setVersionNo(value);</span>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tStoreNo, cb);
     * </pre>
     * @param tStoreNo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TStoreNo tStoreNo, TStoreNoCB cb) {
        return doQueryUpdate(tStoreNo, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TStoreNoCB cb = new TStoreNoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">queryDelete</span>(tStoreNo, cb);
     * </pre>
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TStoreNoCB cb) {
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
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStoreNo.setFoo...(value);
     * tStoreNo.setBar...(value);
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tStoreNo, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tStoreNo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tStoreNo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, InsertOption<TStoreNoCB>> opLambda) {
        doInsert(tStoreNo, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreNo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreNo.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tStoreNo, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreNo The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> opLambda) {
        doUpdate(tStoreNo, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * tStoreNo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreNo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreNo.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tStoreNo, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreNo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> opLambda) {
        doUpdateNonstrict(tStoreNo, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tStoreNo The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, InsertOption<TStoreNoCB>> insertOpLambda, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> updateOpLambda) {
        doInsertOrUpdate(tStoreNo, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tStoreNo The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, InsertOption<TStoreNoCB>> insertOpLambda, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tStoreNo, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tStoreNo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, DeleteOption<TStoreNoCB>> opLambda) {
        doDelete(tStoreNo, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tStoreNo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TStoreNo tStoreNo, WritableOptionCall<TStoreNoCB, DeleteOption<TStoreNoCB>> opLambda) {
        doDeleteNonstrict(tStoreNo, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TStoreNo> tStoreNoList, WritableOptionCall<TStoreNoCB, InsertOption<TStoreNoCB>> opLambda) {
        return doBatchInsert(tStoreNoList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TStoreNo> tStoreNoList, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> opLambda) {
        return doBatchUpdate(tStoreNoList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TStoreNo> tStoreNoList, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> opLambda) {
        return doBatchUpdateNonstrict(tStoreNoList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TStoreNo> tStoreNoList, WritableOptionCall<TStoreNoCB, DeleteOption<TStoreNoCB>> opLambda) {
        return doBatchDelete(tStoreNoList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tStoreNoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TStoreNo> tStoreNoList, WritableOptionCall<TStoreNoCB, DeleteOption<TStoreNoCB>> opLambda) {
        return doBatchDeleteNonstrict(tStoreNoList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TStoreNo, TStoreNoCB> manyArgLambda, WritableOptionCall<TStoreNoCB, InsertOption<TStoreNoCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStoreNo tStoreNo = <span style="color: #70226C">new</span> TStoreNo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStoreNo.setPK...(value);</span>
     * tStoreNo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreNo.setVersionNo(value);</span>
     * TStoreNoCB cb = <span style="color: #70226C">new</span> TStoreNoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreNoBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tStoreNo, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreNo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TStoreNo tStoreNo, TStoreNoCB cb, WritableOptionCall<TStoreNoCB, UpdateOption<TStoreNoCB>> opLambda) {
        return doQueryUpdate(tStoreNo, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TStoreNo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TStoreNoCB cb, WritableOptionCall<TStoreNoCB, DeleteOption<TStoreNoCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tStoreNoBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tStoreNoBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStoreNoBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tStoreNoBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStoreNoBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tStoreNoBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tStoreNoBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tStoreNoBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tStoreNoBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tStoreNoBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tStoreNoBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tStoreNoBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tStoreNoBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tStoreNoBhv.outideSql().removeBlockComment().selectList()
     * tStoreNoBhv.outideSql().removeLineComment().selectList()
     * tStoreNoBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TStoreNoBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TStoreNoBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TStoreNo> typeOfSelectedEntity() { return TStoreNo.class; }
    protected Class<TStoreNo> typeOfHandlingEntity() { return TStoreNo.class; }
    protected Class<TStoreNoCB> typeOfHandlingConditionBean() { return TStoreNoCB.class; }
}
