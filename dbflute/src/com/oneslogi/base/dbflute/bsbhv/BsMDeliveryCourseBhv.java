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
 * The behavior of M_DELIVERY_COURSE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DELIVERY_COURSE_ID
 *
 * [column]
 *     DELIVERY_COURSE_ID, CENTER_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, CARRIER_SLIP_YMT_ID, CARRIER_SLIP_SGW_ID, CARRIER_SLIP_YUPK_ID, TRACKING_NUMBERING_KEY, TRACKING_NUMBERING_AFTER_KEY, TRACKING_NUMBERING_UNIT, TAG_TYPE, TAG_TYPE_AFTER, TAG_DATA_TYPE, PAYMENT_TERM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIVERY_COURSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CENTER, B_CLASS_DTL(ByDelFlg), M_CENTER_CLASS_DTL(ByTagDataType)
 *
 * [referrer table]
 *     M_CENTER_CUSTOMER, M_PARAM, T_ALLOC_INST_H, T_SHIPPING_INST_H, W_HT_LOADING
 *
 * [foreign property]
 *     mCarrier, mCarrierSlipSgw, mCarrierSlipYmt, mCarrierSlipYupk, mCenter, bClassDtlByDelFlg, mCenterClassDtlByTagDataType, mCenterClassDtlByTagType, mCenterClassDtlByTagTypeAfter, bClassDtlByTrackingNumberingUnit, bClassDtlByPaymentTerm
 *
 * [referrer property]
 *     mCenterCustomerList, mParamList, tAllocInstHList, tShippingInstHList, wHtLoadingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMDeliveryCourseBhv extends AbstractBehaviorWritable<MDeliveryCourse, MDeliveryCourseCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MDeliveryCourseDbm asDBMeta() { return MDeliveryCourseDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_DELIVERY_COURSE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MDeliveryCourseDbm getMyDBMeta() { return MDeliveryCourseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MDeliveryCourseCB newConditionBean() { return new MDeliveryCourseCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MDeliveryCourse newMyEntity() { return new MDeliveryCourse(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MDeliveryCourseCB newMyConditionBean() { return new MDeliveryCourseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MDeliveryCourseCB cb) {
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
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().setFoo...(value);
     * MDeliveryCourse mDeliveryCourse = <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mDeliveryCourse != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mDeliveryCourse.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDeliveryCourse selectEntity(MDeliveryCourseCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MDeliveryCourse facadeSelectEntity(MDeliveryCourseCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDeliveryCourse> OptionalEntity<ENTITY> doSelectOptionalEntity(MDeliveryCourseCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().set...;
     * MDeliveryCourse mDeliveryCourse = <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mDeliveryCourse.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDeliveryCourse selectEntityWithDeletedCheck(MDeliveryCourseCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param deliveryCourseId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDeliveryCourse selectByPKValue(Long deliveryCourseId) {
        return facadeSelectByPKValue(deliveryCourseId);
    }

    protected MDeliveryCourse facadeSelectByPKValue(Long deliveryCourseId) {
        return doSelectByPK(deliveryCourseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDeliveryCourse> ENTITY doSelectByPK(Long deliveryCourseId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(deliveryCourseId), tp);
    }

    protected <ENTITY extends MDeliveryCourse> OptionalEntity<ENTITY> doSelectOptionalByPK(Long deliveryCourseId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(deliveryCourseId, tp), deliveryCourseId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param deliveryCourseId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDeliveryCourse selectByPKValueWithDeletedCheck(Long deliveryCourseId) {
        return doSelectByPKWithDeletedCheck(deliveryCourseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDeliveryCourse> ENTITY doSelectByPKWithDeletedCheck(Long deliveryCourseId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(deliveryCourseId), tp);
    }

    protected MDeliveryCourseCB xprepareCBAsPK(Long deliveryCourseId) {
        assertObjectNotNull("deliveryCourseId", deliveryCourseId);
        return newConditionBean().acceptPK(deliveryCourseId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param deliveryCourseCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MDeliveryCourse> selectByUniqueOf(Long centerId, String deliveryCourseCd) {
        return facadeSelectByUniqueOf(centerId, deliveryCourseCd);
    }

    protected OptionalEntity<MDeliveryCourse> facadeSelectByUniqueOf(Long centerId, String deliveryCourseCd) {
        return doSelectByUniqueOf(centerId, deliveryCourseCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDeliveryCourse> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String deliveryCourseCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, deliveryCourseCd), tp), centerId, deliveryCourseCd);
    }

    protected MDeliveryCourseCB xprepareCBAsUniqueOf(Long centerId, String deliveryCourseCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("deliveryCourseCd", deliveryCourseCd);
        return newConditionBean().acceptUniqueOf(centerId, deliveryCourseCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MDeliveryCourse&gt; <span style="color: #553000">mDeliveryCourseList</span> = <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MDeliveryCourse> selectList(MDeliveryCourseCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MDeliveryCourse&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">page</span>) {
     *     ... = mDeliveryCourse.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MDeliveryCourse> selectPage(MDeliveryCourseCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().set...
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @param entityRowHandler The handler of entity row of MDeliveryCourse. (NotNull)
     */
    public void selectCursor(MDeliveryCourseCB cb, EntityRowHandler<MDeliveryCourse> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MDeliveryCourseCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MDeliveryCourseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MDeliveryCourse> mDeliveryCourseList, ReferrerLoaderHandler<LoaderOfMDeliveryCourse> loaderLambda) {
        xassLRArg(mDeliveryCourseList, loaderLambda);
        loaderLambda.handle(new LoaderOfMDeliveryCourse().ready(mDeliveryCourseList, _behaviorSelector));
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
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MDeliveryCourse mDeliveryCourse, ReferrerLoaderHandler<LoaderOfMDeliveryCourse> loaderLambda) {
        xassLRArg(mDeliveryCourse, loaderLambda);
        loaderLambda.handle(new LoaderOfMDeliveryCourse().ready(xnewLRAryLs(mDeliveryCourse), _behaviorSelector));
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MDeliveryCourse> mDeliveryCourseList, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mDeliveryCourseList, refCBLambda);
        return doLoadMCenterCustomerList(mDeliveryCourseList, new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mDeliveryCourse</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MDeliveryCourse mDeliveryCourse, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mDeliveryCourse, refCBLambda);
        return doLoadMCenterCustomerList(xnewLRLs(mDeliveryCourse), new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MDeliveryCourse mDeliveryCourse, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mDeliveryCourse, loadReferrerOption);
        return loadMCenterCustomerList(xnewLRLs(mDeliveryCourse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mDeliveryCourseList, loadReferrerOption);
        if (mDeliveryCourseList.isEmpty()) { return (NestedReferrerListGateway<MCenterCustomer>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterCustomerList(mDeliveryCourseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCustomer> doLoadMCenterCustomerList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> option) {
        return helpLoadReferrerInternally(mDeliveryCourseList, option, "mCenterCustomerList");
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(List<MDeliveryCourse> mDeliveryCourseList, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mDeliveryCourseList, refCBLambda);
        return doLoadMParamList(mDeliveryCourseList, new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mDeliveryCourse</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getMParamList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MDeliveryCourse mDeliveryCourse, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mDeliveryCourse, refCBLambda);
        return doLoadMParamList(xnewLRLs(mDeliveryCourse), new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MDeliveryCourse mDeliveryCourse, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mDeliveryCourse, loadReferrerOption);
        return loadMParamList(xnewLRLs(mDeliveryCourse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MParam> loadMParamList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mDeliveryCourseList, loadReferrerOption);
        if (mDeliveryCourseList.isEmpty()) { return (NestedReferrerListGateway<MParam>)EMPTY_NREF_LGWAY; }
        return doLoadMParamList(mDeliveryCourseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MParam> doLoadMParamList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<MParamCB, MParam> option) {
        return helpLoadReferrerInternally(mDeliveryCourseList, option, "mParamList");
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MDeliveryCourse> mDeliveryCourseList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mDeliveryCourseList, refCBLambda);
        return doLoadTAllocInstHList(mDeliveryCourseList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mDeliveryCourse</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MDeliveryCourse mDeliveryCourse, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mDeliveryCourse, refCBLambda);
        return doLoadTAllocInstHList(xnewLRLs(mDeliveryCourse), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MDeliveryCourse mDeliveryCourse, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mDeliveryCourse, loadReferrerOption);
        return loadTAllocInstHList(xnewLRLs(mDeliveryCourse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mDeliveryCourseList, loadReferrerOption);
        if (mDeliveryCourseList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHList(mDeliveryCourseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mDeliveryCourseList, option, "tAllocInstHList");
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MDeliveryCourse> mDeliveryCourseList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mDeliveryCourseList, refCBLambda);
        return doLoadTShippingInstHList(mDeliveryCourseList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mDeliveryCourse</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MDeliveryCourse mDeliveryCourse, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mDeliveryCourse, refCBLambda);
        return doLoadTShippingInstHList(xnewLRLs(mDeliveryCourse), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MDeliveryCourse mDeliveryCourse, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mDeliveryCourse, loadReferrerOption);
        return loadTShippingInstHList(xnewLRLs(mDeliveryCourse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mDeliveryCourseList, loadReferrerOption);
        if (mDeliveryCourseList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHList(mDeliveryCourseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mDeliveryCourseList, option, "tShippingInstHList");
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MDeliveryCourse> mDeliveryCourseList, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mDeliveryCourseList, refCBLambda);
        return doLoadWHtLoadingList(mDeliveryCourseList, new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mDeliveryCourse</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mDeliveryCourse</span>.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MDeliveryCourse mDeliveryCourse, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mDeliveryCourse, refCBLambda);
        return doLoadWHtLoadingList(xnewLRLs(mDeliveryCourse), new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mDeliveryCourse The entity of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MDeliveryCourse mDeliveryCourse, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mDeliveryCourse, loadReferrerOption);
        return loadWHtLoadingList(xnewLRLs(mDeliveryCourse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mDeliveryCourseList The entity list of MDeliveryCourse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mDeliveryCourseList, loadReferrerOption);
        if (mDeliveryCourseList.isEmpty()) { return (NestedReferrerListGateway<WHtLoading>)EMPTY_NREF_LGWAY; }
        return doLoadWHtLoadingList(mDeliveryCourseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtLoading> doLoadWHtLoadingList(List<MDeliveryCourse> mDeliveryCourseList, LoadReferrerOption<WHtLoadingCB, WHtLoading> option) {
        return helpLoadReferrerInternally(mDeliveryCourseList, option, "wHtLoadingList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCarrier'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCarrier> pulloutMCarrier(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCarrier"); }

    /**
     * Pull out the list of foreign table 'MCarrierSlipSgw'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCarrierSlipSgw> pulloutMCarrierSlipSgw(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCarrierSlipSgw"); }

    /**
     * Pull out the list of foreign table 'MCarrierSlipYmt'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCarrierSlipYmt> pulloutMCarrierSlipYmt(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCarrierSlipYmt"); }

    /**
     * Pull out the list of foreign table 'MCarrierSlipYupk'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCarrierSlipYupk> pulloutMCarrierSlipYupk(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCarrierSlipYupk"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByTagDataType(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCenterClassDtlByTagDataType"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByTagType(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCenterClassDtlByTagType"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByTagTypeAfter(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "mCenterClassDtlByTagTypeAfter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByTrackingNumberingUnit(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "bClassDtlByTrackingNumberingUnit"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPaymentTerm(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpPulloutInternally(mDeliveryCourseList, "bClassDtlByPaymentTerm"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key deliveryCourseId.
     * @param mDeliveryCourseList The list of mDeliveryCourse. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDeliveryCourseIdList(List<MDeliveryCourse> mDeliveryCourseList)
    { return helpExtractListInternally(mDeliveryCourseList, "deliveryCourseId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mDeliveryCourse.setFoo...(value);
     * mDeliveryCourse.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.set...;</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">insert</span>(mDeliveryCourse);
     * ... = mDeliveryCourse.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mDeliveryCourse The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MDeliveryCourse mDeliveryCourse) {
        doInsert(mDeliveryCourse, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDeliveryCourse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mDeliveryCourse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">update</span>(mDeliveryCourse);
     * </pre>
     * @param mDeliveryCourse The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MDeliveryCourse mDeliveryCourse) {
        doUpdate(mDeliveryCourse, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDeliveryCourse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mDeliveryCourse);
     * </pre>
     * @param mDeliveryCourse The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MDeliveryCourse mDeliveryCourse) {
        doUpdateNonstrict(mDeliveryCourse, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mDeliveryCourse The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MDeliveryCourse mDeliveryCourse) {
        doInsertOrUpdate(mDeliveryCourse, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mDeliveryCourse The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MDeliveryCourse mDeliveryCourse) {
        doInsertOrUpdateNonstrict(mDeliveryCourse, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mDeliveryCourse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">delete</span>(mDeliveryCourse);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mDeliveryCourse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MDeliveryCourse mDeliveryCourse) {
        doDelete(mDeliveryCourse, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mDeliveryCourse);
     * </pre>
     * @param mDeliveryCourse The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MDeliveryCourse mDeliveryCourse) {
        doDeleteNonstrict(mDeliveryCourse, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mDeliveryCourse);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mDeliveryCourse The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MDeliveryCourse mDeliveryCourse) {
        doDeleteNonstrictIgnoreDeleted(mDeliveryCourse, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MDeliveryCourse et, final DeleteOption<MDeliveryCourseCB> op) {
        assertObjectNotNull("mDeliveryCourse", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     *     mDeliveryCourse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mDeliveryCourse.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mDeliveryCourseList.add(mDeliveryCourse);
     * }
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">batchInsert</span>(mDeliveryCourseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MDeliveryCourse> mDeliveryCourseList) {
        return doBatchInsert(mDeliveryCourseList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     *     mDeliveryCourse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mDeliveryCourse.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mDeliveryCourse.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mDeliveryCourse.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mDeliveryCourseList.add(mDeliveryCourse);
     * }
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mDeliveryCourseList);
     * </pre>
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MDeliveryCourse> mDeliveryCourseList) {
        return doBatchUpdate(mDeliveryCourseList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mDeliveryCourseBhv.<span style="color: #CC4747">batchUpdate</span>(mDeliveryCourseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mDeliveryCourseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MDeliveryCourse> mDeliveryCourseList, SpecifyQuery<MDeliveryCourseCB> colCBLambda) {
        return doBatchUpdate(mDeliveryCourseList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     *     mDeliveryCourse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mDeliveryCourse.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mDeliveryCourse.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mDeliveryCourse.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mDeliveryCourseList.add(mDeliveryCourse);
     * }
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mDeliveryCourseList);
     * </pre>
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MDeliveryCourse> mDeliveryCourseList) {
        return doBatchUpdateNonstrict(mDeliveryCourseList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mDeliveryCourseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mDeliveryCourseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MDeliveryCourse> mDeliveryCourseList, SpecifyQuery<MDeliveryCourseCB> colCBLambda) {
        return doBatchUpdateNonstrict(mDeliveryCourseList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MDeliveryCourse> mDeliveryCourseList) {
        return doBatchDelete(mDeliveryCourseList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MDeliveryCourse> mDeliveryCourseList) {
        return doBatchDeleteNonstrict(mDeliveryCourseList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MDeliveryCourse, MDeliveryCourseCB&gt;() {
     *     public ConditionBean setup(MDeliveryCourse entity, MDeliveryCourseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MDeliveryCourse, MDeliveryCourseCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setPK...(value);</span>
     * mDeliveryCourse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setVersionNo(value);</span>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mDeliveryCourse, cb);
     * </pre>
     * @param mDeliveryCourse The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MDeliveryCourse mDeliveryCourse, MDeliveryCourseCB cb) {
        return doQueryUpdate(mDeliveryCourse, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MDeliveryCourseCB cb = new MDeliveryCourseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">queryDelete</span>(mDeliveryCourse, cb);
     * </pre>
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MDeliveryCourseCB cb) {
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
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mDeliveryCourse.setFoo...(value);
     * mDeliveryCourse.setBar...(value);
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mDeliveryCourse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mDeliveryCourse.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mDeliveryCourse The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, InsertOption<MDeliveryCourseCB>> opLambda) {
        doInsert(mDeliveryCourse, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDeliveryCourse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mDeliveryCourse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mDeliveryCourse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mDeliveryCourse The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> opLambda) {
        doUpdate(mDeliveryCourse, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * mDeliveryCourse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDeliveryCourse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mDeliveryCourse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mDeliveryCourse The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> opLambda) {
        doUpdateNonstrict(mDeliveryCourse, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mDeliveryCourse The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, InsertOption<MDeliveryCourseCB>> insertOpLambda, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> updateOpLambda) {
        doInsertOrUpdate(mDeliveryCourse, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mDeliveryCourse The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, InsertOption<MDeliveryCourseCB>> insertOpLambda, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mDeliveryCourse, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mDeliveryCourse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, DeleteOption<MDeliveryCourseCB>> opLambda) {
        doDelete(mDeliveryCourse, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mDeliveryCourse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MDeliveryCourse mDeliveryCourse, WritableOptionCall<MDeliveryCourseCB, DeleteOption<MDeliveryCourseCB>> opLambda) {
        doDeleteNonstrict(mDeliveryCourse, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MDeliveryCourse> mDeliveryCourseList, WritableOptionCall<MDeliveryCourseCB, InsertOption<MDeliveryCourseCB>> opLambda) {
        return doBatchInsert(mDeliveryCourseList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MDeliveryCourse> mDeliveryCourseList, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> opLambda) {
        return doBatchUpdate(mDeliveryCourseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MDeliveryCourse> mDeliveryCourseList, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> opLambda) {
        return doBatchUpdateNonstrict(mDeliveryCourseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MDeliveryCourse> mDeliveryCourseList, WritableOptionCall<MDeliveryCourseCB, DeleteOption<MDeliveryCourseCB>> opLambda) {
        return doBatchDelete(mDeliveryCourseList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mDeliveryCourseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MDeliveryCourse> mDeliveryCourseList, WritableOptionCall<MDeliveryCourseCB, DeleteOption<MDeliveryCourseCB>> opLambda) {
        return doBatchDeleteNonstrict(mDeliveryCourseList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MDeliveryCourse, MDeliveryCourseCB> manyArgLambda, WritableOptionCall<MDeliveryCourseCB, InsertOption<MDeliveryCourseCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MDeliveryCourse mDeliveryCourse = <span style="color: #70226C">new</span> MDeliveryCourse();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setPK...(value);</span>
     * mDeliveryCourse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDeliveryCourse.setVersionNo(value);</span>
     * MDeliveryCourseCB cb = <span style="color: #70226C">new</span> MDeliveryCourseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mDeliveryCourse, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mDeliveryCourse The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MDeliveryCourse mDeliveryCourse, MDeliveryCourseCB cb, WritableOptionCall<MDeliveryCourseCB, UpdateOption<MDeliveryCourseCB>> opLambda) {
        return doQueryUpdate(mDeliveryCourse, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MDeliveryCourse. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MDeliveryCourseCB cb, WritableOptionCall<MDeliveryCourseCB, DeleteOption<MDeliveryCourseCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mDeliveryCourseBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mDeliveryCourseBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mDeliveryCourseBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mDeliveryCourseBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mDeliveryCourseBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mDeliveryCourseBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mDeliveryCourseBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mDeliveryCourseBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mDeliveryCourseBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mDeliveryCourseBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mDeliveryCourseBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mDeliveryCourseBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mDeliveryCourseBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mDeliveryCourseBhv.outideSql().removeBlockComment().selectList()
     * mDeliveryCourseBhv.outideSql().removeLineComment().selectList()
     * mDeliveryCourseBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MDeliveryCourseBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MDeliveryCourseBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MDeliveryCourse> typeOfSelectedEntity() { return MDeliveryCourse.class; }
    protected Class<MDeliveryCourse> typeOfHandlingEntity() { return MDeliveryCourse.class; }
    protected Class<MDeliveryCourseCB> typeOfHandlingConditionBean() { return MDeliveryCourseCB.class; }
}
