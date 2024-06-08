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
 * The behavior of M_CARRIER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_ID
 *
 * [column]
 *     CARRIER_ID, CENTER_ID, COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_COMMON_CARRIER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_CARRIER_BOX, M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, mCommonCarrier, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mCarrierBoxList, mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierBhv extends AbstractBehaviorWritable<MCarrier, MCarrierCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCarrierDbm asDBMeta() { return MCarrierDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CARRIER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCarrierDbm getMyDBMeta() { return MCarrierDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCarrierCB newConditionBean() { return new MCarrierCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCarrier newMyEntity() { return new MCarrier(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCarrierCB newMyConditionBean() { return new MCarrierCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCarrierCB cb) {
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
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().setFoo...(value);
     * MCarrier mCarrier = <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCarrier != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCarrier.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrier selectEntity(MCarrierCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCarrier facadeSelectEntity(MCarrierCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrier> OptionalEntity<ENTITY> doSelectOptionalEntity(MCarrierCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().set...;
     * MCarrier mCarrier = <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCarrier.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrier selectEntityWithDeletedCheck(MCarrierCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param carrierId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrier selectByPKValue(Long carrierId) {
        return facadeSelectByPKValue(carrierId);
    }

    protected MCarrier facadeSelectByPKValue(Long carrierId) {
        return doSelectByPK(carrierId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrier> ENTITY doSelectByPK(Long carrierId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(carrierId), tp);
    }

    protected <ENTITY extends MCarrier> OptionalEntity<ENTITY> doSelectOptionalByPK(Long carrierId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(carrierId, tp), carrierId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param carrierId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrier selectByPKValueWithDeletedCheck(Long carrierId) {
        return doSelectByPKWithDeletedCheck(carrierId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrier> ENTITY doSelectByPKWithDeletedCheck(Long carrierId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(carrierId), tp);
    }

    protected MCarrierCB xprepareCBAsPK(Long carrierId) {
        assertObjectNotNull("carrierId", carrierId);
        return newConditionBean().acceptPK(carrierId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param carrierCd : +UQ, IX, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCarrier> selectByUniqueOf(Long centerId, String carrierCd) {
        return facadeSelectByUniqueOf(centerId, carrierCd);
    }

    protected OptionalEntity<MCarrier> facadeSelectByUniqueOf(Long centerId, String carrierCd) {
        return doSelectByUniqueOf(centerId, carrierCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrier> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String carrierCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, carrierCd), tp), centerId, carrierCd);
    }

    protected MCarrierCB xprepareCBAsUniqueOf(Long centerId, String carrierCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("carrierCd", carrierCd);
        return newConditionBean().acceptUniqueOf(centerId, carrierCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCarrier&gt; <span style="color: #553000">mCarrierList</span> = <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCarrier> selectList(MCarrierCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCarrier&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCarrier mCarrier : <span style="color: #553000">page</span>) {
     *     ... = mCarrier.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCarrier> selectPage(MCarrierCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @param entityRowHandler The handler of entity row of MCarrier. (NotNull)
     */
    public void selectCursor(MCarrierCB cb, EntityRowHandler<MCarrier> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCarrierList The entity list of MCarrier. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCarrier> mCarrierList, ReferrerLoaderHandler<LoaderOfMCarrier> loaderLambda) {
        xassLRArg(mCarrierList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrier().ready(mCarrierList, _behaviorSelector));
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
     * @param mCarrier The entity of MCarrier. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCarrier mCarrier, ReferrerLoaderHandler<LoaderOfMCarrier> loaderLambda) {
        xassLRArg(mCarrier, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrier().ready(xnewLRAryLs(mCarrier), _behaviorSelector));
    }

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * M_CARRIER_BOX by CARRIER_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param mCarrierList The entity list of MCarrier. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(List<MCarrier> mCarrierList, ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        xassLRArg(mCarrierList, refCBLambda);
        return doLoadMCarrierBoxList(mCarrierList, new LoadReferrerOption<MCarrierBoxCB, MCarrierBox>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * M_CARRIER_BOX by CARRIER_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">mCarrier</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCarrier</span>.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param mCarrier The entity of MCarrier. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(MCarrier mCarrier, ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        xassLRArg(mCarrier, refCBLambda);
        return doLoadMCarrierBoxList(xnewLRLs(mCarrier), new LoadReferrerOption<MCarrierBoxCB, MCarrierBox>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCarrier The entity of MCarrier. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(MCarrier mCarrier, LoadReferrerOption<MCarrierBoxCB, MCarrierBox> loadReferrerOption) {
        xassLRArg(mCarrier, loadReferrerOption);
        return loadMCarrierBoxList(xnewLRLs(mCarrier), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCarrierList The entity list of MCarrier. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(List<MCarrier> mCarrierList, LoadReferrerOption<MCarrierBoxCB, MCarrierBox> loadReferrerOption) {
        xassLRArg(mCarrierList, loadReferrerOption);
        if (mCarrierList.isEmpty()) { return (NestedReferrerListGateway<MCarrierBox>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierBoxList(mCarrierList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierBox> doLoadMCarrierBoxList(List<MCarrier> mCarrierList, LoadReferrerOption<MCarrierBoxCB, MCarrierBox> option) {
        return helpLoadReferrerInternally(mCarrierList, option, "mCarrierBoxList");
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param mCarrierList The entity list of MCarrier. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCarrier> mCarrierList, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCarrierList, refCBLambda);
        return doLoadMDeliveryCourseList(mCarrierList, new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCarrier</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCarrier</span>.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param mCarrier The entity of MCarrier. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCarrier mCarrier, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCarrier, refCBLambda);
        return doLoadMDeliveryCourseList(xnewLRLs(mCarrier), new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCarrier The entity of MCarrier. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCarrier mCarrier, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCarrier, loadReferrerOption);
        return loadMDeliveryCourseList(xnewLRLs(mCarrier), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCarrierList The entity list of MCarrier. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCarrier> mCarrierList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCarrierList, loadReferrerOption);
        if (mCarrierList.isEmpty()) { return (NestedReferrerListGateway<MDeliveryCourse>)EMPTY_NREF_LGWAY; }
        return doLoadMDeliveryCourseList(mCarrierList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDeliveryCourse> doLoadMDeliveryCourseList(List<MCarrier> mCarrierList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> option) {
        return helpLoadReferrerInternally(mCarrierList, option, "mDeliveryCourseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mCarrierList The list of mCarrier. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MCarrier> mCarrierList)
    { return helpPulloutInternally(mCarrierList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MCommonCarrier'.
     * @param mCarrierList The list of mCarrier. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCommonCarrier> pulloutMCommonCarrier(List<MCarrier> mCarrierList)
    { return helpPulloutInternally(mCarrierList, "mCommonCarrier"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierList The list of mCarrier. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCarrier> mCarrierList)
    { return helpPulloutInternally(mCarrierList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key carrierId.
     * @param mCarrierList The list of mCarrier. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCarrierIdList(List<MCarrier> mCarrierList)
    { return helpExtractListInternally(mCarrierList, "carrierId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrier.setFoo...(value);
     * mCarrier.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrier.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrier.set...;</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">insert</span>(mCarrier);
     * ... = mCarrier.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCarrier The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCarrier mCarrier) {
        doInsert(mCarrier, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrier.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrier.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrier.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrier.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">update</span>(mCarrier);
     * </pre>
     * @param mCarrier The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCarrier mCarrier) {
        doUpdate(mCarrier, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrier.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrier.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrier.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrier.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCarrier);
     * </pre>
     * @param mCarrier The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCarrier mCarrier) {
        doUpdateNonstrict(mCarrier, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrier The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCarrier mCarrier) {
        doInsertOrUpdate(mCarrier, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrier The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCarrier mCarrier) {
        doInsertOrUpdateNonstrict(mCarrier, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrier.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">delete</span>(mCarrier);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCarrier The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCarrier mCarrier) {
        doDelete(mCarrier, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrier.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCarrier);
     * </pre>
     * @param mCarrier The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCarrier mCarrier) {
        doDeleteNonstrict(mCarrier, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrier.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCarrier);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCarrier The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCarrier mCarrier) {
        doDeleteNonstrictIgnoreDeleted(mCarrier, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCarrier et, final DeleteOption<MCarrierCB> op) {
        assertObjectNotNull("mCarrier", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     *     mCarrier.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrier.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCarrierList.add(mCarrier);
     * }
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCarrierList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCarrier> mCarrierList) {
        return doBatchInsert(mCarrierList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     *     mCarrier.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrier.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrier.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrier.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierList.add(mCarrier);
     * }
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierList);
     * </pre>
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrier> mCarrierList) {
        return doBatchUpdate(mCarrierList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCarrierBhv.<span style="color: #CC4747">batchUpdate</span>(mCarrierList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrier> mCarrierList, SpecifyQuery<MCarrierCB> colCBLambda) {
        return doBatchUpdate(mCarrierList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     *     mCarrier.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrier.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrier.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrier.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierList.add(mCarrier);
     * }
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierList);
     * </pre>
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrier> mCarrierList) {
        return doBatchUpdateNonstrict(mCarrierList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrier> mCarrierList, SpecifyQuery<MCarrierCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCarrierList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCarrier> mCarrierList) {
        return doBatchDelete(mCarrierList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCarrier> mCarrierList) {
        return doBatchDeleteNonstrict(mCarrierList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCarrier, MCarrierCB&gt;() {
     *     public ConditionBean setup(MCarrier entity, MCarrierCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCarrier, MCarrierCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrier.setPK...(value);</span>
     * mCarrier.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrier.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrier.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrier.setVersionNo(value);</span>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCarrier, cb);
     * </pre>
     * @param mCarrier The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCarrier mCarrier, MCarrierCB cb) {
        return doQueryUpdate(mCarrier, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCarrierCB cb = new MCarrierCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCarrier, cb);
     * </pre>
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCarrierCB cb) {
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
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrier.setFoo...(value);
     * mCarrier.setBar...(value);
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCarrier, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCarrier.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCarrier The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCarrier mCarrier, WritableOptionCall<MCarrierCB, InsertOption<MCarrierCB>> opLambda) {
        doInsert(mCarrier, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrier.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrier.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCarrier, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrier The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCarrier mCarrier, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> opLambda) {
        doUpdate(mCarrier, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * mCarrier.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrier.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrier.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCarrier, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrier The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCarrier mCarrier, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> opLambda) {
        doUpdateNonstrict(mCarrier, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCarrier The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCarrier mCarrier, WritableOptionCall<MCarrierCB, InsertOption<MCarrierCB>> insertOpLambda, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> updateOpLambda) {
        doInsertOrUpdate(mCarrier, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCarrier The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCarrier mCarrier, WritableOptionCall<MCarrierCB, InsertOption<MCarrierCB>> insertOpLambda, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCarrier, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCarrier The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCarrier mCarrier, WritableOptionCall<MCarrierCB, DeleteOption<MCarrierCB>> opLambda) {
        doDelete(mCarrier, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCarrier The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCarrier mCarrier, WritableOptionCall<MCarrierCB, DeleteOption<MCarrierCB>> opLambda) {
        doDeleteNonstrict(mCarrier, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCarrier> mCarrierList, WritableOptionCall<MCarrierCB, InsertOption<MCarrierCB>> opLambda) {
        return doBatchInsert(mCarrierList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCarrier> mCarrierList, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> opLambda) {
        return doBatchUpdate(mCarrierList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCarrier> mCarrierList, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> opLambda) {
        return doBatchUpdateNonstrict(mCarrierList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCarrier> mCarrierList, WritableOptionCall<MCarrierCB, DeleteOption<MCarrierCB>> opLambda) {
        return doBatchDelete(mCarrierList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCarrierList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCarrier> mCarrierList, WritableOptionCall<MCarrierCB, DeleteOption<MCarrierCB>> opLambda) {
        return doBatchDeleteNonstrict(mCarrierList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCarrier, MCarrierCB> manyArgLambda, WritableOptionCall<MCarrierCB, InsertOption<MCarrierCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrier mCarrier = <span style="color: #70226C">new</span> MCarrier();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrier.setPK...(value);</span>
     * mCarrier.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrier.setVersionNo(value);</span>
     * MCarrierCB cb = <span style="color: #70226C">new</span> MCarrierCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCarrier, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrier The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCarrier mCarrier, MCarrierCB cb, WritableOptionCall<MCarrierCB, UpdateOption<MCarrierCB>> opLambda) {
        return doQueryUpdate(mCarrier, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCarrier. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCarrierCB cb, WritableOptionCall<MCarrierCB, DeleteOption<MCarrierCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCarrierBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCarrierBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCarrierBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCarrierBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCarrierBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCarrierBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCarrierBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCarrierBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCarrierBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCarrierBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCarrierBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCarrierBhv.outideSql().removeBlockComment().selectList()
     * mCarrierBhv.outideSql().removeLineComment().selectList()
     * mCarrierBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCarrierBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCarrierBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCarrier> typeOfSelectedEntity() { return MCarrier.class; }
    protected Class<MCarrier> typeOfHandlingEntity() { return MCarrier.class; }
    protected Class<MCarrierCB> typeOfHandlingConditionBean() { return MCarrierCB.class; }
}
