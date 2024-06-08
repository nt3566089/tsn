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
 * The behavior of M_CARRIER_SLIP_YUPK as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [column]
 *     CARRIER_SLIP_YUPK_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, POST_TYPE, COOL_TYPE, COD_TYPE, CARRIER_TYPE, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_NM1, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_MAIL, NO_UPSIDE_DOWN_CLS, NO_STOCK_CLS, SLIP_PRODUCT_SIZE_CLS, SLIP_PRODUCT_NO, SLIP_ITEM_NM, SHIP_RESERVE_DATA_MARK, DELI_CERT_PRE_YEARS, SEND_NM, PRODUCT_TYPE_CODE, POST_BIZ_CARD_CUSTOMER_NO, SHIPPING_COMPANY_CODE, SHIPMENT_CODE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer table]
 *     M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCodType, bClassDtlByCoolType, bClassDtlByDelFlg, bClassDtlByNoStockCls, bClassDtlByNoUpsideDownCls, bClassDtlByPostType
 *
 * [referrer property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipYupkBhv extends AbstractBehaviorWritable<MCarrierSlipYupk, MCarrierSlipYupkCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCarrierSlipYupkDbm asDBMeta() { return MCarrierSlipYupkDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CARRIER_SLIP_YUPK"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCarrierSlipYupkDbm getMyDBMeta() { return MCarrierSlipYupkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCarrierSlipYupkCB newConditionBean() { return new MCarrierSlipYupkCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCarrierSlipYupk newMyEntity() { return new MCarrierSlipYupk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCarrierSlipYupkCB newMyConditionBean() { return new MCarrierSlipYupkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCarrierSlipYupkCB cb) {
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
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().setFoo...(value);
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCarrierSlipYupk != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCarrierSlipYupk.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipYupk selectEntity(MCarrierSlipYupkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCarrierSlipYupk facadeSelectEntity(MCarrierSlipYupkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipYupk> OptionalEntity<ENTITY> doSelectOptionalEntity(MCarrierSlipYupkCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().set...;
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCarrierSlipYupk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipYupk selectEntityWithDeletedCheck(MCarrierSlipYupkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param carrierSlipYupkId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipYupk selectByPKValue(Long carrierSlipYupkId) {
        return facadeSelectByPKValue(carrierSlipYupkId);
    }

    protected MCarrierSlipYupk facadeSelectByPKValue(Long carrierSlipYupkId) {
        return doSelectByPK(carrierSlipYupkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipYupk> ENTITY doSelectByPK(Long carrierSlipYupkId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(carrierSlipYupkId), tp);
    }

    protected <ENTITY extends MCarrierSlipYupk> OptionalEntity<ENTITY> doSelectOptionalByPK(Long carrierSlipYupkId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(carrierSlipYupkId, tp), carrierSlipYupkId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param carrierSlipYupkId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipYupk selectByPKValueWithDeletedCheck(Long carrierSlipYupkId) {
        return doSelectByPKWithDeletedCheck(carrierSlipYupkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipYupk> ENTITY doSelectByPKWithDeletedCheck(Long carrierSlipYupkId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(carrierSlipYupkId), tp);
    }

    protected MCarrierSlipYupkCB xprepareCBAsPK(Long carrierSlipYupkId) {
        assertObjectNotNull("carrierSlipYupkId", carrierSlipYupkId);
        return newConditionBean().acceptPK(carrierSlipYupkId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param tagType : +UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCarrierSlipYupk> selectByUniqueOf(Long centerId, String tagType) {
        return facadeSelectByUniqueOf(centerId, tagType);
    }

    protected OptionalEntity<MCarrierSlipYupk> facadeSelectByUniqueOf(Long centerId, String tagType) {
        return doSelectByUniqueOf(centerId, tagType, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipYupk> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String tagType, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, tagType), tp), centerId, tagType);
    }

    protected MCarrierSlipYupkCB xprepareCBAsUniqueOf(Long centerId, String tagType) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("tagType", tagType);
        return newConditionBean().acceptUniqueOf(centerId, tagType);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCarrierSlipYupk&gt; <span style="color: #553000">mCarrierSlipYupkList</span> = <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCarrierSlipYupk mCarrierSlipYupk : <span style="color: #553000">mCarrierSlipYupkList</span>) {
     *     ... = mCarrierSlipYupk.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCarrierSlipYupk> selectList(MCarrierSlipYupkCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCarrierSlipYupk&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCarrierSlipYupk mCarrierSlipYupk : <span style="color: #553000">page</span>) {
     *     ... = mCarrierSlipYupk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCarrierSlipYupk> selectPage(MCarrierSlipYupkCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @param entityRowHandler The handler of entity row of MCarrierSlipYupk. (NotNull)
     */
    public void selectCursor(MCarrierSlipYupkCB cb, EntityRowHandler<MCarrierSlipYupk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierSlipYupkCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierSlipYupkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCarrierSlipYupkList The entity list of MCarrierSlipYupk. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCarrierSlipYupk> mCarrierSlipYupkList, ReferrerLoaderHandler<LoaderOfMCarrierSlipYupk> loaderLambda) {
        xassLRArg(mCarrierSlipYupkList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrierSlipYupk().ready(mCarrierSlipYupkList, _behaviorSelector));
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
     * @param mCarrierSlipYupk The entity of MCarrierSlipYupk. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCarrierSlipYupk mCarrierSlipYupk, ReferrerLoaderHandler<LoaderOfMCarrierSlipYupk> loaderLambda) {
        xassLRArg(mCarrierSlipYupk, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrierSlipYupk().ready(xnewLRAryLs(mCarrierSlipYupk), _behaviorSelector));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCarrierSlipYupkList</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCarrierSlipYupk mCarrierSlipYupk : <span style="color: #553000">mCarrierSlipYupkList</span>) {
     *     ... = mCarrierSlipYupk.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipYupkId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipYupkId_Asc();
     * </pre>
     * @param mCarrierSlipYupkList The entity list of MCarrierSlipYupk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCarrierSlipYupk> mCarrierSlipYupkList, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCarrierSlipYupkList, refCBLambda);
        return doLoadMDeliveryCourseList(mCarrierSlipYupkList, new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCarrierSlipYupk</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipYupkId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipYupkId_Asc();
     * </pre>
     * @param mCarrierSlipYupk The entity of MCarrierSlipYupk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCarrierSlipYupk mCarrierSlipYupk, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCarrierSlipYupk, refCBLambda);
        return doLoadMDeliveryCourseList(xnewLRLs(mCarrierSlipYupk), new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCarrierSlipYupk The entity of MCarrierSlipYupk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCarrierSlipYupk mCarrierSlipYupk, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCarrierSlipYupk, loadReferrerOption);
        return loadMDeliveryCourseList(xnewLRLs(mCarrierSlipYupk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCarrierSlipYupkList The entity list of MCarrierSlipYupk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCarrierSlipYupk> mCarrierSlipYupkList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCarrierSlipYupkList, loadReferrerOption);
        if (mCarrierSlipYupkList.isEmpty()) { return (NestedReferrerListGateway<MDeliveryCourse>)EMPTY_NREF_LGWAY; }
        return doLoadMDeliveryCourseList(mCarrierSlipYupkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDeliveryCourse> doLoadMDeliveryCourseList(List<MCarrierSlipYupk> mCarrierSlipYupkList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> option) {
        return helpLoadReferrerInternally(mCarrierSlipYupkList, option, "mDeliveryCourseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCharacterCd(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByCharacterCd"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCodType(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByCodType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCoolType(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByCoolType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByNoStockCls(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByNoStockCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByNoUpsideDownCls(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByNoUpsideDownCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPostType(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpPulloutInternally(mCarrierSlipYupkList, "bClassDtlByPostType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key carrierSlipYupkId.
     * @param mCarrierSlipYupkList The list of mCarrierSlipYupk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCarrierSlipYupkIdList(List<MCarrierSlipYupk> mCarrierSlipYupkList)
    { return helpExtractListInternally(mCarrierSlipYupkList, "carrierSlipYupkId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrierSlipYupk.setFoo...(value);
     * mCarrierSlipYupk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.set...;</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">insert</span>(mCarrierSlipYupk);
     * ... = mCarrierSlipYupk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCarrierSlipYupk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCarrierSlipYupk mCarrierSlipYupk) {
        doInsert(mCarrierSlipYupk, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipYupk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipYupk.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">update</span>(mCarrierSlipYupk);
     * </pre>
     * @param mCarrierSlipYupk The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCarrierSlipYupk mCarrierSlipYupk) {
        doUpdate(mCarrierSlipYupk, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipYupk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCarrierSlipYupk);
     * </pre>
     * @param mCarrierSlipYupk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCarrierSlipYupk mCarrierSlipYupk) {
        doUpdateNonstrict(mCarrierSlipYupk, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrierSlipYupk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCarrierSlipYupk mCarrierSlipYupk) {
        doInsertOrUpdate(mCarrierSlipYupk, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrierSlipYupk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCarrierSlipYupk mCarrierSlipYupk) {
        doInsertOrUpdateNonstrict(mCarrierSlipYupk, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipYupk.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">delete</span>(mCarrierSlipYupk);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCarrierSlipYupk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCarrierSlipYupk mCarrierSlipYupk) {
        doDelete(mCarrierSlipYupk, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCarrierSlipYupk);
     * </pre>
     * @param mCarrierSlipYupk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCarrierSlipYupk mCarrierSlipYupk) {
        doDeleteNonstrict(mCarrierSlipYupk, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCarrierSlipYupk);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCarrierSlipYupk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCarrierSlipYupk mCarrierSlipYupk) {
        doDeleteNonstrictIgnoreDeleted(mCarrierSlipYupk, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCarrierSlipYupk et, final DeleteOption<MCarrierSlipYupkCB> op) {
        assertObjectNotNull("mCarrierSlipYupk", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     *     mCarrierSlipYupk.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipYupk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCarrierSlipYupkList.add(mCarrierSlipYupk);
     * }
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCarrierSlipYupkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        return doBatchInsert(mCarrierSlipYupkList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     *     mCarrierSlipYupk.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipYupk.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrierSlipYupk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrierSlipYupk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierSlipYupkList.add(mCarrierSlipYupk);
     * }
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipYupkList);
     * </pre>
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        return doBatchUpdate(mCarrierSlipYupkList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCarrierSlipYupkBhv.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipYupkList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipYupkList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrierSlipYupk> mCarrierSlipYupkList, SpecifyQuery<MCarrierSlipYupkCB> colCBLambda) {
        return doBatchUpdate(mCarrierSlipYupkList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     *     mCarrierSlipYupk.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipYupk.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrierSlipYupk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrierSlipYupk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierSlipYupkList.add(mCarrierSlipYupk);
     * }
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipYupkList);
     * </pre>
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        return doBatchUpdateNonstrict(mCarrierSlipYupkList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierSlipYupkList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierSlipYupkList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrierSlipYupk> mCarrierSlipYupkList, SpecifyQuery<MCarrierSlipYupkCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCarrierSlipYupkList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        return doBatchDelete(mCarrierSlipYupkList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        return doBatchDeleteNonstrict(mCarrierSlipYupkList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCarrierSlipYupk, MCarrierSlipYupkCB&gt;() {
     *     public ConditionBean setup(MCarrierSlipYupk entity, MCarrierSlipYupkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCarrierSlipYupk, MCarrierSlipYupkCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setPK...(value);</span>
     * mCarrierSlipYupk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setVersionNo(value);</span>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCarrierSlipYupk, cb);
     * </pre>
     * @param mCarrierSlipYupk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCarrierSlipYupk mCarrierSlipYupk, MCarrierSlipYupkCB cb) {
        return doQueryUpdate(mCarrierSlipYupk, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCarrierSlipYupk, cb);
     * </pre>
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCarrierSlipYupkCB cb) {
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
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrierSlipYupk.setFoo...(value);
     * mCarrierSlipYupk.setBar...(value);
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCarrierSlipYupk, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCarrierSlipYupk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCarrierSlipYupk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, InsertOption<MCarrierSlipYupkCB>> opLambda) {
        doInsert(mCarrierSlipYupk, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipYupk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipYupk.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCarrierSlipYupk, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipYupk The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> opLambda) {
        doUpdate(mCarrierSlipYupk, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * mCarrierSlipYupk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipYupk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCarrierSlipYupk, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipYupk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> opLambda) {
        doUpdateNonstrict(mCarrierSlipYupk, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCarrierSlipYupk The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, InsertOption<MCarrierSlipYupkCB>> insertOpLambda, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> updateOpLambda) {
        doInsertOrUpdate(mCarrierSlipYupk, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCarrierSlipYupk The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, InsertOption<MCarrierSlipYupkCB>> insertOpLambda, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCarrierSlipYupk, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCarrierSlipYupk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, DeleteOption<MCarrierSlipYupkCB>> opLambda) {
        doDelete(mCarrierSlipYupk, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCarrierSlipYupk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCarrierSlipYupk mCarrierSlipYupk, WritableOptionCall<MCarrierSlipYupkCB, DeleteOption<MCarrierSlipYupkCB>> opLambda) {
        doDeleteNonstrict(mCarrierSlipYupk, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCarrierSlipYupk> mCarrierSlipYupkList, WritableOptionCall<MCarrierSlipYupkCB, InsertOption<MCarrierSlipYupkCB>> opLambda) {
        return doBatchInsert(mCarrierSlipYupkList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCarrierSlipYupk> mCarrierSlipYupkList, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> opLambda) {
        return doBatchUpdate(mCarrierSlipYupkList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCarrierSlipYupk> mCarrierSlipYupkList, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> opLambda) {
        return doBatchUpdateNonstrict(mCarrierSlipYupkList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCarrierSlipYupk> mCarrierSlipYupkList, WritableOptionCall<MCarrierSlipYupkCB, DeleteOption<MCarrierSlipYupkCB>> opLambda) {
        return doBatchDelete(mCarrierSlipYupkList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCarrierSlipYupkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCarrierSlipYupk> mCarrierSlipYupkList, WritableOptionCall<MCarrierSlipYupkCB, DeleteOption<MCarrierSlipYupkCB>> opLambda) {
        return doBatchDeleteNonstrict(mCarrierSlipYupkList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCarrierSlipYupk, MCarrierSlipYupkCB> manyArgLambda, WritableOptionCall<MCarrierSlipYupkCB, InsertOption<MCarrierSlipYupkCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrierSlipYupk mCarrierSlipYupk = <span style="color: #70226C">new</span> MCarrierSlipYupk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setPK...(value);</span>
     * mCarrierSlipYupk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipYupk.setVersionNo(value);</span>
     * MCarrierSlipYupkCB cb = <span style="color: #70226C">new</span> MCarrierSlipYupkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCarrierSlipYupk, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipYupk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCarrierSlipYupk mCarrierSlipYupk, MCarrierSlipYupkCB cb, WritableOptionCall<MCarrierSlipYupkCB, UpdateOption<MCarrierSlipYupkCB>> opLambda) {
        return doQueryUpdate(mCarrierSlipYupk, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCarrierSlipYupk. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCarrierSlipYupkCB cb, WritableOptionCall<MCarrierSlipYupkCB, DeleteOption<MCarrierSlipYupkCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCarrierSlipYupkBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCarrierSlipYupkBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierSlipYupkBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCarrierSlipYupkBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierSlipYupkBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCarrierSlipYupkBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCarrierSlipYupkBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCarrierSlipYupkBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCarrierSlipYupkBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCarrierSlipYupkBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCarrierSlipYupkBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCarrierSlipYupkBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCarrierSlipYupkBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCarrierSlipYupkBhv.outideSql().removeBlockComment().selectList()
     * mCarrierSlipYupkBhv.outideSql().removeLineComment().selectList()
     * mCarrierSlipYupkBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCarrierSlipYupkBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCarrierSlipYupkBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCarrierSlipYupk> typeOfSelectedEntity() { return MCarrierSlipYupk.class; }
    protected Class<MCarrierSlipYupk> typeOfHandlingEntity() { return MCarrierSlipYupk.class; }
    protected Class<MCarrierSlipYupkCB> typeOfHandlingConditionBean() { return MCarrierSlipYupkCB.class; }
}
