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
 * The behavior of M_CENTER_CUSTOMER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CUSTOMER_ID
 *
 * [column]
 *     CENTER_CUSTOMER_ID, CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID, DELIVERY_ORDER, DELIVERY_READ_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CUSTOMER, M_DELIVERY_COURSE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     T_ALLOC_INST_H
 *
 * [foreign property]
 *     mCenter, mCustomer, mDeliveryCourse, bClassDtlByDelFlg
 *
 * [referrer property]
 *     tAllocInstHByDelivCustomerIdList, tAllocInstHBySupplyCustomerIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterCustomerBhv extends AbstractBehaviorWritable<MCenterCustomer, MCenterCustomerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCenterCustomerDbm asDBMeta() { return MCenterCustomerDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CENTER_CUSTOMER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCenterCustomerDbm getMyDBMeta() { return MCenterCustomerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCenterCustomerCB newConditionBean() { return new MCenterCustomerCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCenterCustomer newMyEntity() { return new MCenterCustomer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCenterCustomerCB newMyConditionBean() { return new MCenterCustomerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCenterCustomerCB cb) {
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
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().setFoo...(value);
     * MCenterCustomer mCenterCustomer = <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCenterCustomer != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCenterCustomer.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterCustomer selectEntity(MCenterCustomerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCenterCustomer facadeSelectEntity(MCenterCustomerCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterCustomer> OptionalEntity<ENTITY> doSelectOptionalEntity(MCenterCustomerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().set...;
     * MCenterCustomer mCenterCustomer = <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCenterCustomer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterCustomer selectEntityWithDeletedCheck(MCenterCustomerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param centerCustomerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterCustomer selectByPKValue(Long centerCustomerId) {
        return facadeSelectByPKValue(centerCustomerId);
    }

    protected MCenterCustomer facadeSelectByPKValue(Long centerCustomerId) {
        return doSelectByPK(centerCustomerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterCustomer> ENTITY doSelectByPK(Long centerCustomerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(centerCustomerId), tp);
    }

    protected <ENTITY extends MCenterCustomer> OptionalEntity<ENTITY> doSelectOptionalByPK(Long centerCustomerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(centerCustomerId, tp), centerCustomerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param centerCustomerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterCustomer selectByPKValueWithDeletedCheck(Long centerCustomerId) {
        return doSelectByPKWithDeletedCheck(centerCustomerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterCustomer> ENTITY doSelectByPKWithDeletedCheck(Long centerCustomerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(centerCustomerId), tp);
    }

    protected MCenterCustomerCB xprepareCBAsPK(Long centerCustomerId) {
        assertObjectNotNull("centerCustomerId", centerCustomerId);
        return newConditionBean().acceptPK(centerCustomerId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param customerId : +UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER. (NotNull)
     * @param deliveryCourseId : +UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCenterCustomer> selectByUniqueOf(Long centerId, Long customerId, Long deliveryCourseId) {
        return facadeSelectByUniqueOf(centerId, customerId, deliveryCourseId);
    }

    protected OptionalEntity<MCenterCustomer> facadeSelectByUniqueOf(Long centerId, Long customerId, Long deliveryCourseId) {
        return doSelectByUniqueOf(centerId, customerId, deliveryCourseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterCustomer> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, Long customerId, Long deliveryCourseId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, customerId, deliveryCourseId), tp), centerId, customerId, deliveryCourseId);
    }

    protected MCenterCustomerCB xprepareCBAsUniqueOf(Long centerId, Long customerId, Long deliveryCourseId) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("customerId", customerId);assertObjectNotNull("deliveryCourseId", deliveryCourseId);
        return newConditionBean().acceptUniqueOf(centerId, customerId, deliveryCourseId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCenterCustomer&gt; <span style="color: #553000">mCenterCustomerList</span> = <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCenterCustomer mCenterCustomer : <span style="color: #553000">mCenterCustomerList</span>) {
     *     ... = mCenterCustomer.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCenterCustomer> selectList(MCenterCustomerCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCenterCustomer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCenterCustomer mCenterCustomer : <span style="color: #553000">page</span>) {
     *     ... = mCenterCustomer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCenterCustomer> selectPage(MCenterCustomerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @param entityRowHandler The handler of entity row of MCenterCustomer. (NotNull)
     */
    public void selectCursor(MCenterCustomerCB cb, EntityRowHandler<MCenterCustomer> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterCustomerCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterCustomerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCenterCustomerList The entity list of MCenterCustomer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCenterCustomer> mCenterCustomerList, ReferrerLoaderHandler<LoaderOfMCenterCustomer> loaderLambda) {
        xassLRArg(mCenterCustomerList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenterCustomer().ready(mCenterCustomerList, _behaviorSelector));
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
     * @param mCenterCustomer The entity of MCenterCustomer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCenterCustomer mCenterCustomer, ReferrerLoaderHandler<LoaderOfMCenterCustomer> loaderLambda) {
        xassLRArg(mCenterCustomer, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenterCustomer().ready(xnewLRAryLs(mCenterCustomer), _behaviorSelector));
    }

    /**
     * Load referrer of TAllocInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHByDelivCustomerIdList</span>(<span style="color: #553000">mCenterCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenterCustomer mCenterCustomer : <span style="color: #553000">mCenterCustomerList</span>) {
     *     ... = mCenterCustomer.<span style="color: #CC4747">getTAllocInstHByDelivCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param mCenterCustomerList The entity list of MCenterCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(List<MCenterCustomer> mCenterCustomerList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenterCustomerList, refCBLambda);
        return doLoadTAllocInstHByDelivCustomerIdList(mCenterCustomerList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHByDelivCustomerIdList</span>(<span style="color: #553000">mCenterCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenterCustomer</span>.<span style="color: #CC4747">getTAllocInstHByDelivCustomerIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param mCenterCustomer The entity of MCenterCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(MCenterCustomer mCenterCustomer, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenterCustomer, refCBLambda);
        return doLoadTAllocInstHByDelivCustomerIdList(xnewLRLs(mCenterCustomer), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenterCustomer The entity of MCenterCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(MCenterCustomer mCenterCustomer, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenterCustomer, loadReferrerOption);
        return loadTAllocInstHByDelivCustomerIdList(xnewLRLs(mCenterCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterCustomerList The entity list of MCenterCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(List<MCenterCustomer> mCenterCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenterCustomerList, loadReferrerOption);
        if (mCenterCustomerList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHByDelivCustomerIdList(mCenterCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHByDelivCustomerIdList(List<MCenterCustomer> mCenterCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mCenterCustomerList, option, "tAllocInstHByDelivCustomerIdList");
    }

    /**
     * Load referrer of TAllocInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHBySupplyCustomerIdList</span>(<span style="color: #553000">mCenterCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenterCustomer mCenterCustomer : <span style="color: #553000">mCenterCustomerList</span>) {
     *     ... = mCenterCustomer.<span style="color: #CC4747">getTAllocInstHBySupplyCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param mCenterCustomerList The entity list of MCenterCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(List<MCenterCustomer> mCenterCustomerList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenterCustomerList, refCBLambda);
        return doLoadTAllocInstHBySupplyCustomerIdList(mCenterCustomerList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHBySupplyCustomerIdList</span>(<span style="color: #553000">mCenterCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenterCustomer</span>.<span style="color: #CC4747">getTAllocInstHBySupplyCustomerIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param mCenterCustomer The entity of MCenterCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(MCenterCustomer mCenterCustomer, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenterCustomer, refCBLambda);
        return doLoadTAllocInstHBySupplyCustomerIdList(xnewLRLs(mCenterCustomer), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenterCustomer The entity of MCenterCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(MCenterCustomer mCenterCustomer, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenterCustomer, loadReferrerOption);
        return loadTAllocInstHBySupplyCustomerIdList(xnewLRLs(mCenterCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterCustomerList The entity list of MCenterCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(List<MCenterCustomer> mCenterCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenterCustomerList, loadReferrerOption);
        if (mCenterCustomerList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHBySupplyCustomerIdList(mCenterCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHBySupplyCustomerIdList(List<MCenterCustomer> mCenterCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mCenterCustomerList, option, "tAllocInstHBySupplyCustomerIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mCenterCustomerList The list of mCenterCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MCenterCustomer> mCenterCustomerList)
    { return helpPulloutInternally(mCenterCustomerList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param mCenterCustomerList The list of mCenterCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<MCenterCustomer> mCenterCustomerList)
    { return helpPulloutInternally(mCenterCustomerList, "mCustomer"); }

    /**
     * Pull out the list of foreign table 'MDeliveryCourse'.
     * @param mCenterCustomerList The list of mCenterCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MDeliveryCourse> pulloutMDeliveryCourse(List<MCenterCustomer> mCenterCustomerList)
    { return helpPulloutInternally(mCenterCustomerList, "mDeliveryCourse"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCenterCustomerList The list of mCenterCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCenterCustomer> mCenterCustomerList)
    { return helpPulloutInternally(mCenterCustomerList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key centerCustomerId.
     * @param mCenterCustomerList The list of mCenterCustomer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCenterCustomerIdList(List<MCenterCustomer> mCenterCustomerList)
    { return helpExtractListInternally(mCenterCustomerList, "centerCustomerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenterCustomer.setFoo...(value);
     * mCenterCustomer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.set...;</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">insert</span>(mCenterCustomer);
     * ... = mCenterCustomer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCenterCustomer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCenterCustomer mCenterCustomer) {
        doInsert(mCenterCustomer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterCustomer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterCustomer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">update</span>(mCenterCustomer);
     * </pre>
     * @param mCenterCustomer The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCenterCustomer mCenterCustomer) {
        doUpdate(mCenterCustomer, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterCustomer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCenterCustomer);
     * </pre>
     * @param mCenterCustomer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCenterCustomer mCenterCustomer) {
        doUpdateNonstrict(mCenterCustomer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenterCustomer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCenterCustomer mCenterCustomer) {
        doInsertOrUpdate(mCenterCustomer, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenterCustomer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCenterCustomer mCenterCustomer) {
        doInsertOrUpdateNonstrict(mCenterCustomer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterCustomer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">delete</span>(mCenterCustomer);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCenterCustomer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCenterCustomer mCenterCustomer) {
        doDelete(mCenterCustomer, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCenterCustomer);
     * </pre>
     * @param mCenterCustomer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCenterCustomer mCenterCustomer) {
        doDeleteNonstrict(mCenterCustomer, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCenterCustomer);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCenterCustomer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCenterCustomer mCenterCustomer) {
        doDeleteNonstrictIgnoreDeleted(mCenterCustomer, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCenterCustomer et, final DeleteOption<MCenterCustomerCB> op) {
        assertObjectNotNull("mCenterCustomer", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     *     mCenterCustomer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterCustomer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCenterCustomerList.add(mCenterCustomer);
     * }
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCenterCustomerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCenterCustomer> mCenterCustomerList) {
        return doBatchInsert(mCenterCustomerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     *     mCenterCustomer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterCustomer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenterCustomer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenterCustomer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterCustomerList.add(mCenterCustomer);
     * }
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterCustomerList);
     * </pre>
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenterCustomer> mCenterCustomerList) {
        return doBatchUpdate(mCenterCustomerList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCenterCustomerBhv.<span style="color: #CC4747">batchUpdate</span>(mCenterCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenterCustomer> mCenterCustomerList, SpecifyQuery<MCenterCustomerCB> colCBLambda) {
        return doBatchUpdate(mCenterCustomerList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     *     mCenterCustomer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterCustomer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenterCustomer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenterCustomer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterCustomerList.add(mCenterCustomer);
     * }
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterCustomerList);
     * </pre>
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenterCustomer> mCenterCustomerList) {
        return doBatchUpdateNonstrict(mCenterCustomerList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenterCustomer> mCenterCustomerList, SpecifyQuery<MCenterCustomerCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCenterCustomerList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCenterCustomer> mCenterCustomerList) {
        return doBatchDelete(mCenterCustomerList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCenterCustomer> mCenterCustomerList) {
        return doBatchDeleteNonstrict(mCenterCustomerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCenterCustomer, MCenterCustomerCB&gt;() {
     *     public ConditionBean setup(MCenterCustomer entity, MCenterCustomerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCenterCustomer, MCenterCustomerCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setPK...(value);</span>
     * mCenterCustomer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setVersionNo(value);</span>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCenterCustomer, cb);
     * </pre>
     * @param mCenterCustomer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCenterCustomer mCenterCustomer, MCenterCustomerCB cb) {
        return doQueryUpdate(mCenterCustomer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCenterCustomerCB cb = new MCenterCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCenterCustomer, cb);
     * </pre>
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCenterCustomerCB cb) {
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
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenterCustomer.setFoo...(value);
     * mCenterCustomer.setBar...(value);
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCenterCustomer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCenterCustomer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCenterCustomer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, InsertOption<MCenterCustomerCB>> opLambda) {
        doInsert(mCenterCustomer, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterCustomer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterCustomer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCenterCustomer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterCustomer The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> opLambda) {
        doUpdate(mCenterCustomer, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * mCenterCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterCustomer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCenterCustomer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterCustomer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> opLambda) {
        doUpdateNonstrict(mCenterCustomer, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCenterCustomer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, InsertOption<MCenterCustomerCB>> insertOpLambda, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> updateOpLambda) {
        doInsertOrUpdate(mCenterCustomer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCenterCustomer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, InsertOption<MCenterCustomerCB>> insertOpLambda, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCenterCustomer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCenterCustomer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, DeleteOption<MCenterCustomerCB>> opLambda) {
        doDelete(mCenterCustomer, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCenterCustomer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCenterCustomer mCenterCustomer, WritableOptionCall<MCenterCustomerCB, DeleteOption<MCenterCustomerCB>> opLambda) {
        doDeleteNonstrict(mCenterCustomer, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCenterCustomer> mCenterCustomerList, WritableOptionCall<MCenterCustomerCB, InsertOption<MCenterCustomerCB>> opLambda) {
        return doBatchInsert(mCenterCustomerList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCenterCustomer> mCenterCustomerList, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> opLambda) {
        return doBatchUpdate(mCenterCustomerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCenterCustomer> mCenterCustomerList, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> opLambda) {
        return doBatchUpdateNonstrict(mCenterCustomerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCenterCustomer> mCenterCustomerList, WritableOptionCall<MCenterCustomerCB, DeleteOption<MCenterCustomerCB>> opLambda) {
        return doBatchDelete(mCenterCustomerList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCenterCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCenterCustomer> mCenterCustomerList, WritableOptionCall<MCenterCustomerCB, DeleteOption<MCenterCustomerCB>> opLambda) {
        return doBatchDeleteNonstrict(mCenterCustomerList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCenterCustomer, MCenterCustomerCB> manyArgLambda, WritableOptionCall<MCenterCustomerCB, InsertOption<MCenterCustomerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenterCustomer mCenterCustomer = <span style="color: #70226C">new</span> MCenterCustomer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setPK...(value);</span>
     * mCenterCustomer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterCustomer.setVersionNo(value);</span>
     * MCenterCustomerCB cb = <span style="color: #70226C">new</span> MCenterCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterCustomerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCenterCustomer, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterCustomer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCenterCustomer mCenterCustomer, MCenterCustomerCB cb, WritableOptionCall<MCenterCustomerCB, UpdateOption<MCenterCustomerCB>> opLambda) {
        return doQueryUpdate(mCenterCustomer, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCenterCustomer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCenterCustomerCB cb, WritableOptionCall<MCenterCustomerCB, DeleteOption<MCenterCustomerCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCenterCustomerBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCenterCustomerBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterCustomerBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCenterCustomerBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterCustomerBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCenterCustomerBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCenterCustomerBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCenterCustomerBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCenterCustomerBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCenterCustomerBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCenterCustomerBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCenterCustomerBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCenterCustomerBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCenterCustomerBhv.outideSql().removeBlockComment().selectList()
     * mCenterCustomerBhv.outideSql().removeLineComment().selectList()
     * mCenterCustomerBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCenterCustomerBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCenterCustomerBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCenterCustomer> typeOfSelectedEntity() { return MCenterCustomer.class; }
    protected Class<MCenterCustomer> typeOfHandlingEntity() { return MCenterCustomer.class; }
    protected Class<MCenterCustomerCB> typeOfHandlingConditionBean() { return MCenterCustomerCB.class; }
}
