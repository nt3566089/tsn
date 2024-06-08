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
 * The behavior of T_ALLOC_INST_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     ALLOC_INST_H_ID
 *
 * [column]
 *     ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, M_PROCESS_TYPE, M_CENTER, M_DELIVERY_COURSE, M_CLIENT, T_PICKING_H, M_CENTER_CUSTOMER(ByDelivCustomerId), B_CLASS_DTL(ByDelivTz)
 *
 * [referrer table]
 *     T_ALLOC_INST_B, T_PACKING_H, T_PICKING_H, T_SHIPPING_INST_H
 *
 * [foreign property]
 *     mCustomerBySupplyCustomerId, mProcessType, mCenter, mCustomerByDelivCustomerId, mDeliveryCourse, mClient, tPickingH, mCenterCustomerByDelivCustomerId, mCenterCustomerBySupplyCustomerId, bClassDtlByDelivTz
 *
 * [referrer property]
 *     tAllocInstBList, tPackingHList, tPickingHList, tShippingInstHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTAllocInstHBhv extends AbstractBehaviorWritable<TAllocInstH, TAllocInstHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TAllocInstHDbm asDBMeta() { return TAllocInstHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_ALLOC_INST_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TAllocInstHDbm getMyDBMeta() { return TAllocInstHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TAllocInstHCB newConditionBean() { return new TAllocInstHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TAllocInstH newMyEntity() { return new TAllocInstH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TAllocInstHCB newMyConditionBean() { return new TAllocInstHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TAllocInstHCB cb) {
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
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().setFoo...(value);
     * TAllocInstH tAllocInstH = <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tAllocInstH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tAllocInstH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstH selectEntity(TAllocInstHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TAllocInstH facadeSelectEntity(TAllocInstHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TAllocInstH> OptionalEntity<ENTITY> doSelectOptionalEntity(TAllocInstHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().set...;
     * TAllocInstH tAllocInstH = <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tAllocInstH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstH selectEntityWithDeletedCheck(TAllocInstHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param allocInstHId : PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstH selectByPKValue(Long allocInstHId) {
        return facadeSelectByPKValue(allocInstHId);
    }

    protected TAllocInstH facadeSelectByPKValue(Long allocInstHId) {
        return doSelectByPK(allocInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TAllocInstH> ENTITY doSelectByPK(Long allocInstHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(allocInstHId), tp);
    }

    protected <ENTITY extends TAllocInstH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long allocInstHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(allocInstHId, tp), allocInstHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param allocInstHId : PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TAllocInstH selectByPKValueWithDeletedCheck(Long allocInstHId) {
        return doSelectByPKWithDeletedCheck(allocInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TAllocInstH> ENTITY doSelectByPKWithDeletedCheck(Long allocInstHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(allocInstHId), tp);
    }

    protected TAllocInstHCB xprepareCBAsPK(Long allocInstHId) {
        assertObjectNotNull("allocInstHId", allocInstHId);
        return newConditionBean().acceptPK(allocInstHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TAllocInstH&gt; <span style="color: #553000">tAllocInstHList</span> = <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TAllocInstH> selectList(TAllocInstHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TAllocInstH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TAllocInstH tAllocInstH : <span style="color: #553000">page</span>) {
     *     ... = tAllocInstH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TAllocInstH> selectPage(TAllocInstHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @param entityRowHandler The handler of entity row of TAllocInstH. (NotNull)
     */
    public void selectCursor(TAllocInstHCB cb, EntityRowHandler<TAllocInstH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TAllocInstHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TAllocInstHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TAllocInstH> tAllocInstHList, ReferrerLoaderHandler<LoaderOfTAllocInstH> loaderLambda) {
        xassLRArg(tAllocInstHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTAllocInstH().ready(tAllocInstHList, _behaviorSelector));
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
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TAllocInstH tAllocInstH, ReferrerLoaderHandler<LoaderOfTAllocInstH> loaderLambda) {
        xassLRArg(tAllocInstH, loaderLambda);
        loaderLambda.handle(new LoaderOfTAllocInstH().ready(xnewLRAryLs(tAllocInstH), _behaviorSelector));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by ALLOC_INST_H_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<TAllocInstH> tAllocInstHList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(tAllocInstHList, refCBLambda);
        return doLoadTAllocInstBList(tAllocInstHList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by ALLOC_INST_H_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">tAllocInstH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstH</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(TAllocInstH tAllocInstH, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(tAllocInstH, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(tAllocInstH), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(TAllocInstH tAllocInstH, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(tAllocInstH, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(tAllocInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(tAllocInstHList, loadReferrerOption);
        if (tAllocInstHList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(tAllocInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(tAllocInstHList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by ALLOC_INST_H_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<TAllocInstH> tAllocInstHList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(tAllocInstHList, refCBLambda);
        return doLoadTPackingHList(tAllocInstHList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by ALLOC_INST_H_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">tAllocInstH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstH</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(TAllocInstH tAllocInstH, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(tAllocInstH, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(tAllocInstH), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(TAllocInstH tAllocInstH, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(tAllocInstH, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(tAllocInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(tAllocInstHList, loadReferrerOption);
        if (tAllocInstHList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(tAllocInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(tAllocInstHList, option, "tPackingHList");
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by ALLOC_INST_H_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<TAllocInstH> tAllocInstHList, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(tAllocInstHList, refCBLambda);
        return doLoadTPickingHList(tAllocInstHList, new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by ALLOC_INST_H_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">tAllocInstH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstH</span>.<span style="color: #CC4747">getTPickingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(TAllocInstH tAllocInstH, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(tAllocInstH, refCBLambda);
        return doLoadTPickingHList(xnewLRLs(tAllocInstH), new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(TAllocInstH tAllocInstH, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(tAllocInstH, loadReferrerOption);
        return loadTPickingHList(xnewLRLs(tAllocInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(tAllocInstHList, loadReferrerOption);
        if (tAllocInstHList.isEmpty()) { return (NestedReferrerListGateway<TPickingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingHList(tAllocInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingH> doLoadTPickingHList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TPickingHCB, TPickingH> option) {
        return helpLoadReferrerInternally(tAllocInstHList, option, "tPickingHList");
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by ALLOC_INST_H_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">tAllocInstHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TAllocInstH tAllocInstH : <span style="color: #553000">tAllocInstHList</span>) {
     *     ... = tAllocInstH.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<TAllocInstH> tAllocInstHList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(tAllocInstHList, refCBLambda);
        return doLoadTShippingInstHList(tAllocInstHList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by ALLOC_INST_H_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">tAllocInstH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tAllocInstH</span>.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAllocInstHId_InScope(pkList);
     * cb.query().addOrderBy_AllocInstHId_Asc();
     * </pre>
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(TAllocInstH tAllocInstH, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(tAllocInstH, refCBLambda);
        return doLoadTShippingInstHList(xnewLRLs(tAllocInstH), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tAllocInstH The entity of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(TAllocInstH tAllocInstH, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(tAllocInstH, loadReferrerOption);
        return loadTShippingInstHList(xnewLRLs(tAllocInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tAllocInstHList The entity list of TAllocInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(tAllocInstHList, loadReferrerOption);
        if (tAllocInstHList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHList(tAllocInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHList(List<TAllocInstH> tAllocInstHList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(tAllocInstHList, option, "tShippingInstHList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerBySupplyCustomerId(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mCustomerBySupplyCustomerId"); }

    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByDelivCustomerId(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mCustomerByDelivCustomerId"); }

    /**
     * Pull out the list of foreign table 'MDeliveryCourse'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MDeliveryCourse> pulloutMDeliveryCourse(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mDeliveryCourse"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'TPickingH'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPickingH> pulloutTPickingH(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "tPickingH"); }

    /**
     * Pull out the list of foreign table 'MCenterCustomer'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterCustomer> pulloutMCenterCustomerByDelivCustomerId(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mCenterCustomerByDelivCustomerId"); }

    /**
     * Pull out the list of foreign table 'MCenterCustomer'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterCustomer> pulloutMCenterCustomerBySupplyCustomerId(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "mCenterCustomerBySupplyCustomerId"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelivTz(List<TAllocInstH> tAllocInstHList)
    { return helpPulloutInternally(tAllocInstHList, "bClassDtlByDelivTz"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key allocInstHId.
     * @param tAllocInstHList The list of tAllocInstH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractAllocInstHIdList(List<TAllocInstH> tAllocInstHList)
    { return helpExtractListInternally(tAllocInstHList, "allocInstHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tAllocInstH.setFoo...(value);
     * tAllocInstH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstH.set...;</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">insert</span>(tAllocInstH);
     * ... = tAllocInstH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tAllocInstH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TAllocInstH tAllocInstH) {
        doInsert(tAllocInstH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tAllocInstH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">update</span>(tAllocInstH);
     * </pre>
     * @param tAllocInstH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TAllocInstH tAllocInstH) {
        doUpdate(tAllocInstH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tAllocInstH);
     * </pre>
     * @param tAllocInstH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TAllocInstH tAllocInstH) {
        doUpdateNonstrict(tAllocInstH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tAllocInstH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TAllocInstH tAllocInstH) {
        doInsertOrUpdate(tAllocInstH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tAllocInstH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TAllocInstH tAllocInstH) {
        doInsertOrUpdateNonstrict(tAllocInstH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tAllocInstH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">delete</span>(tAllocInstH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tAllocInstH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TAllocInstH tAllocInstH) {
        doDelete(tAllocInstH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tAllocInstH);
     * </pre>
     * @param tAllocInstH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TAllocInstH tAllocInstH) {
        doDeleteNonstrict(tAllocInstH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tAllocInstH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tAllocInstH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TAllocInstH tAllocInstH) {
        doDeleteNonstrictIgnoreDeleted(tAllocInstH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TAllocInstH et, final DeleteOption<TAllocInstHCB> op) {
        assertObjectNotNull("tAllocInstH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     *     tAllocInstH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tAllocInstH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tAllocInstHList.add(tAllocInstH);
     * }
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tAllocInstHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TAllocInstH> tAllocInstHList) {
        return doBatchInsert(tAllocInstHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     *     tAllocInstH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tAllocInstH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tAllocInstH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tAllocInstH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tAllocInstHList.add(tAllocInstH);
     * }
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tAllocInstHList);
     * </pre>
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TAllocInstH> tAllocInstHList) {
        return doBatchUpdate(tAllocInstHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tAllocInstHBhv.<span style="color: #CC4747">batchUpdate</span>(tAllocInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tAllocInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TAllocInstH> tAllocInstHList, SpecifyQuery<TAllocInstHCB> colCBLambda) {
        return doBatchUpdate(tAllocInstHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     *     tAllocInstH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tAllocInstH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tAllocInstH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tAllocInstH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tAllocInstHList.add(tAllocInstH);
     * }
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tAllocInstHList);
     * </pre>
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TAllocInstH> tAllocInstHList) {
        return doBatchUpdateNonstrict(tAllocInstHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tAllocInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tAllocInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TAllocInstH> tAllocInstHList, SpecifyQuery<TAllocInstHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tAllocInstHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TAllocInstH> tAllocInstHList) {
        return doBatchDelete(tAllocInstHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TAllocInstH> tAllocInstHList) {
        return doBatchDeleteNonstrict(tAllocInstHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TAllocInstH, TAllocInstHCB&gt;() {
     *     public ConditionBean setup(TAllocInstH entity, TAllocInstHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TAllocInstH, TAllocInstHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setPK...(value);</span>
     * tAllocInstH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tAllocInstH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setVersionNo(value);</span>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tAllocInstH, cb);
     * </pre>
     * @param tAllocInstH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TAllocInstH tAllocInstH, TAllocInstHCB cb) {
        return doQueryUpdate(tAllocInstH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TAllocInstHCB cb = new TAllocInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tAllocInstH, cb);
     * </pre>
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TAllocInstHCB cb) {
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
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tAllocInstH.setFoo...(value);
     * tAllocInstH.setBar...(value);
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tAllocInstH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tAllocInstH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tAllocInstH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, InsertOption<TAllocInstHCB>> opLambda) {
        doInsert(tAllocInstH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tAllocInstH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tAllocInstH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tAllocInstH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> opLambda) {
        doUpdate(tAllocInstH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * tAllocInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tAllocInstH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tAllocInstH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tAllocInstH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> opLambda) {
        doUpdateNonstrict(tAllocInstH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tAllocInstH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, InsertOption<TAllocInstHCB>> insertOpLambda, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> updateOpLambda) {
        doInsertOrUpdate(tAllocInstH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tAllocInstH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, InsertOption<TAllocInstHCB>> insertOpLambda, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tAllocInstH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tAllocInstH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, DeleteOption<TAllocInstHCB>> opLambda) {
        doDelete(tAllocInstH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tAllocInstH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TAllocInstH tAllocInstH, WritableOptionCall<TAllocInstHCB, DeleteOption<TAllocInstHCB>> opLambda) {
        doDeleteNonstrict(tAllocInstH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TAllocInstH> tAllocInstHList, WritableOptionCall<TAllocInstHCB, InsertOption<TAllocInstHCB>> opLambda) {
        return doBatchInsert(tAllocInstHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TAllocInstH> tAllocInstHList, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> opLambda) {
        return doBatchUpdate(tAllocInstHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TAllocInstH> tAllocInstHList, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> opLambda) {
        return doBatchUpdateNonstrict(tAllocInstHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TAllocInstH> tAllocInstHList, WritableOptionCall<TAllocInstHCB, DeleteOption<TAllocInstHCB>> opLambda) {
        return doBatchDelete(tAllocInstHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tAllocInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TAllocInstH> tAllocInstHList, WritableOptionCall<TAllocInstHCB, DeleteOption<TAllocInstHCB>> opLambda) {
        return doBatchDeleteNonstrict(tAllocInstHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TAllocInstH, TAllocInstHCB> manyArgLambda, WritableOptionCall<TAllocInstHCB, InsertOption<TAllocInstHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TAllocInstH tAllocInstH = <span style="color: #70226C">new</span> TAllocInstH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setPK...(value);</span>
     * tAllocInstH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tAllocInstH.setVersionNo(value);</span>
     * TAllocInstHCB cb = <span style="color: #70226C">new</span> TAllocInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tAllocInstHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tAllocInstH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tAllocInstH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TAllocInstH tAllocInstH, TAllocInstHCB cb, WritableOptionCall<TAllocInstHCB, UpdateOption<TAllocInstHCB>> opLambda) {
        return doQueryUpdate(tAllocInstH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TAllocInstH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TAllocInstHCB cb, WritableOptionCall<TAllocInstHCB, DeleteOption<TAllocInstHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tAllocInstHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tAllocInstHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tAllocInstHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tAllocInstHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tAllocInstHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tAllocInstHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tAllocInstHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tAllocInstHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tAllocInstHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tAllocInstHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tAllocInstHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tAllocInstHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tAllocInstHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tAllocInstHBhv.outideSql().removeBlockComment().selectList()
     * tAllocInstHBhv.outideSql().removeLineComment().selectList()
     * tAllocInstHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TAllocInstHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TAllocInstHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TAllocInstH> typeOfSelectedEntity() { return TAllocInstH.class; }
    protected Class<TAllocInstH> typeOfHandlingEntity() { return TAllocInstH.class; }
    protected Class<TAllocInstHCB> typeOfHandlingConditionBean() { return TAllocInstHCB.class; }
}
