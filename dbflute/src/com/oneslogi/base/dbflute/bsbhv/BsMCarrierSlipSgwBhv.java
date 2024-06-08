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
 * The behavior of M_CARRIER_SLIP_SGW as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_SLIP_SGW_ID
 *
 * [column]
 *     CARRIER_SLIP_SGW_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_CUSTOMER_CD, WEB_API_REQUEST_URL, CUSTOMER_ID, LOGIN_PASSWORD, DEPT_CONSIGNOR_NM, CONSIGNOR_TEL_NO, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_NM1, SLIP_CLIENT_NM2, SLIP_SHAPE_CD, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, TRANSPORT_TYPE_SPEED, TRANSPORT_TYPE_ITEM, SETTLEMENT_TYPE, SEAL_TYPE1, SEAL_TYPE2, SEAL_TYPE3, COD_CLS, SEND_CD, API_OKURI_CODE, API_BINSYU_CODE, API_DAIBIKI_FLG, API_DAIBIKI_TYPE, API_WEIGHT_CD_1, API_WEIGHT_CD_2, API_EIDOME_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_SGW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CENTER_CLASS_DTL(ByApiBinsyuCode), B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer table]
 *     M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, mCenterClassDtlByApiBinsyuCode, mCenterClassDtlByApiDaibikiFlg, mCenterClassDtlByApiDaibikiType, mCenterClassDtlByApiEidomeFlg, mCenterClassDtlByApiWeightCd1, mCenterClassDtlByApiWeightCd2, bClassDtlByCharacterCd, bClassDtlByCodCls, bClassDtlByDelFlg, mCenterClassDtlBySealType1, mCenterClassDtlBySealType2, mCenterClassDtlBySealType3, bClassDtlBySettlementType, mCenterClassDtlBySlipShapeCd, mCenterClassDtlByTransportTypeItem, mCenterClassDtlByTransportTypeSpeed
 *
 * [referrer property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipSgwBhv extends AbstractBehaviorWritable<MCarrierSlipSgw, MCarrierSlipSgwCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCarrierSlipSgwDbm asDBMeta() { return MCarrierSlipSgwDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CARRIER_SLIP_SGW"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCarrierSlipSgwDbm getMyDBMeta() { return MCarrierSlipSgwDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCarrierSlipSgwCB newConditionBean() { return new MCarrierSlipSgwCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCarrierSlipSgw newMyEntity() { return new MCarrierSlipSgw(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCarrierSlipSgwCB newMyConditionBean() { return new MCarrierSlipSgwCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCarrierSlipSgwCB cb) {
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
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().setFoo...(value);
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCarrierSlipSgw != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCarrierSlipSgw.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipSgw selectEntity(MCarrierSlipSgwCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCarrierSlipSgw facadeSelectEntity(MCarrierSlipSgwCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipSgw> OptionalEntity<ENTITY> doSelectOptionalEntity(MCarrierSlipSgwCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().set...;
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCarrierSlipSgw.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipSgw selectEntityWithDeletedCheck(MCarrierSlipSgwCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param carrierSlipSgwId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipSgw selectByPKValue(Long carrierSlipSgwId) {
        return facadeSelectByPKValue(carrierSlipSgwId);
    }

    protected MCarrierSlipSgw facadeSelectByPKValue(Long carrierSlipSgwId) {
        return doSelectByPK(carrierSlipSgwId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipSgw> ENTITY doSelectByPK(Long carrierSlipSgwId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(carrierSlipSgwId), tp);
    }

    protected <ENTITY extends MCarrierSlipSgw> OptionalEntity<ENTITY> doSelectOptionalByPK(Long carrierSlipSgwId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(carrierSlipSgwId, tp), carrierSlipSgwId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param carrierSlipSgwId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipSgw selectByPKValueWithDeletedCheck(Long carrierSlipSgwId) {
        return doSelectByPKWithDeletedCheck(carrierSlipSgwId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipSgw> ENTITY doSelectByPKWithDeletedCheck(Long carrierSlipSgwId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(carrierSlipSgwId), tp);
    }

    protected MCarrierSlipSgwCB xprepareCBAsPK(Long carrierSlipSgwId) {
        assertObjectNotNull("carrierSlipSgwId", carrierSlipSgwId);
        return newConditionBean().acceptPK(carrierSlipSgwId);
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
    public OptionalEntity<MCarrierSlipSgw> selectByUniqueOf(Long centerId, String tagType) {
        return facadeSelectByUniqueOf(centerId, tagType);
    }

    protected OptionalEntity<MCarrierSlipSgw> facadeSelectByUniqueOf(Long centerId, String tagType) {
        return doSelectByUniqueOf(centerId, tagType, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipSgw> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String tagType, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, tagType), tp), centerId, tagType);
    }

    protected MCarrierSlipSgwCB xprepareCBAsUniqueOf(Long centerId, String tagType) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("tagType", tagType);
        return newConditionBean().acceptUniqueOf(centerId, tagType);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCarrierSlipSgw&gt; <span style="color: #553000">mCarrierSlipSgwList</span> = <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCarrierSlipSgw mCarrierSlipSgw : <span style="color: #553000">mCarrierSlipSgwList</span>) {
     *     ... = mCarrierSlipSgw.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCarrierSlipSgw> selectList(MCarrierSlipSgwCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCarrierSlipSgw&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCarrierSlipSgw mCarrierSlipSgw : <span style="color: #553000">page</span>) {
     *     ... = mCarrierSlipSgw.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCarrierSlipSgw> selectPage(MCarrierSlipSgwCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @param entityRowHandler The handler of entity row of MCarrierSlipSgw. (NotNull)
     */
    public void selectCursor(MCarrierSlipSgwCB cb, EntityRowHandler<MCarrierSlipSgw> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierSlipSgwCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierSlipSgwCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCarrierSlipSgwList The entity list of MCarrierSlipSgw. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCarrierSlipSgw> mCarrierSlipSgwList, ReferrerLoaderHandler<LoaderOfMCarrierSlipSgw> loaderLambda) {
        xassLRArg(mCarrierSlipSgwList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrierSlipSgw().ready(mCarrierSlipSgwList, _behaviorSelector));
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
     * @param mCarrierSlipSgw The entity of MCarrierSlipSgw. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCarrierSlipSgw mCarrierSlipSgw, ReferrerLoaderHandler<LoaderOfMCarrierSlipSgw> loaderLambda) {
        xassLRArg(mCarrierSlipSgw, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrierSlipSgw().ready(xnewLRAryLs(mCarrierSlipSgw), _behaviorSelector));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCarrierSlipSgwList</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCarrierSlipSgw mCarrierSlipSgw : <span style="color: #553000">mCarrierSlipSgwList</span>) {
     *     ... = mCarrierSlipSgw.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipSgwId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipSgwId_Asc();
     * </pre>
     * @param mCarrierSlipSgwList The entity list of MCarrierSlipSgw. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCarrierSlipSgw> mCarrierSlipSgwList, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCarrierSlipSgwList, refCBLambda);
        return doLoadMDeliveryCourseList(mCarrierSlipSgwList, new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCarrierSlipSgw</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipSgwId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipSgwId_Asc();
     * </pre>
     * @param mCarrierSlipSgw The entity of MCarrierSlipSgw. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCarrierSlipSgw mCarrierSlipSgw, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCarrierSlipSgw, refCBLambda);
        return doLoadMDeliveryCourseList(xnewLRLs(mCarrierSlipSgw), new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCarrierSlipSgw The entity of MCarrierSlipSgw. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCarrierSlipSgw mCarrierSlipSgw, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCarrierSlipSgw, loadReferrerOption);
        return loadMDeliveryCourseList(xnewLRLs(mCarrierSlipSgw), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCarrierSlipSgwList The entity list of MCarrierSlipSgw. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCarrierSlipSgw> mCarrierSlipSgwList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCarrierSlipSgwList, loadReferrerOption);
        if (mCarrierSlipSgwList.isEmpty()) { return (NestedReferrerListGateway<MDeliveryCourse>)EMPTY_NREF_LGWAY; }
        return doLoadMDeliveryCourseList(mCarrierSlipSgwList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDeliveryCourse> doLoadMDeliveryCourseList(List<MCarrierSlipSgw> mCarrierSlipSgwList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> option) {
        return helpLoadReferrerInternally(mCarrierSlipSgwList, option, "mDeliveryCourseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByApiBinsyuCode(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByApiBinsyuCode"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByApiDaibikiFlg(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByApiDaibikiFlg"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByApiDaibikiType(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByApiDaibikiType"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByApiEidomeFlg(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByApiEidomeFlg"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByApiWeightCd1(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByApiWeightCd1"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByApiWeightCd2(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByApiWeightCd2"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCharacterCd(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "bClassDtlByCharacterCd"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCodCls(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "bClassDtlByCodCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlBySealType1(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlBySealType1"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlBySealType2(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlBySealType2"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlBySealType3(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlBySealType3"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySettlementType(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "bClassDtlBySettlementType"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlBySlipShapeCd(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlBySlipShapeCd"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByTransportTypeItem(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByTransportTypeItem"); }

    /**
     * Pull out the list of foreign table 'MCenterClassDtl'.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClassDtl> pulloutMCenterClassDtlByTransportTypeSpeed(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpPulloutInternally(mCarrierSlipSgwList, "mCenterClassDtlByTransportTypeSpeed"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key carrierSlipSgwId.
     * @param mCarrierSlipSgwList The list of mCarrierSlipSgw. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCarrierSlipSgwIdList(List<MCarrierSlipSgw> mCarrierSlipSgwList)
    { return helpExtractListInternally(mCarrierSlipSgwList, "carrierSlipSgwId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrierSlipSgw.setFoo...(value);
     * mCarrierSlipSgw.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.set...;</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">insert</span>(mCarrierSlipSgw);
     * ... = mCarrierSlipSgw.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCarrierSlipSgw The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCarrierSlipSgw mCarrierSlipSgw) {
        doInsert(mCarrierSlipSgw, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipSgw.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipSgw.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">update</span>(mCarrierSlipSgw);
     * </pre>
     * @param mCarrierSlipSgw The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCarrierSlipSgw mCarrierSlipSgw) {
        doUpdate(mCarrierSlipSgw, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipSgw.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCarrierSlipSgw);
     * </pre>
     * @param mCarrierSlipSgw The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCarrierSlipSgw mCarrierSlipSgw) {
        doUpdateNonstrict(mCarrierSlipSgw, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrierSlipSgw The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCarrierSlipSgw mCarrierSlipSgw) {
        doInsertOrUpdate(mCarrierSlipSgw, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrierSlipSgw The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCarrierSlipSgw mCarrierSlipSgw) {
        doInsertOrUpdateNonstrict(mCarrierSlipSgw, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipSgw.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">delete</span>(mCarrierSlipSgw);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCarrierSlipSgw The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCarrierSlipSgw mCarrierSlipSgw) {
        doDelete(mCarrierSlipSgw, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCarrierSlipSgw);
     * </pre>
     * @param mCarrierSlipSgw The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCarrierSlipSgw mCarrierSlipSgw) {
        doDeleteNonstrict(mCarrierSlipSgw, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCarrierSlipSgw);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCarrierSlipSgw The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCarrierSlipSgw mCarrierSlipSgw) {
        doDeleteNonstrictIgnoreDeleted(mCarrierSlipSgw, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCarrierSlipSgw et, final DeleteOption<MCarrierSlipSgwCB> op) {
        assertObjectNotNull("mCarrierSlipSgw", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     *     mCarrierSlipSgw.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipSgw.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCarrierSlipSgwList.add(mCarrierSlipSgw);
     * }
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCarrierSlipSgwList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        return doBatchInsert(mCarrierSlipSgwList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     *     mCarrierSlipSgw.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipSgw.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrierSlipSgw.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrierSlipSgw.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierSlipSgwList.add(mCarrierSlipSgw);
     * }
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipSgwList);
     * </pre>
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        return doBatchUpdate(mCarrierSlipSgwList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCarrierSlipSgwBhv.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipSgwList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipSgwList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrierSlipSgw> mCarrierSlipSgwList, SpecifyQuery<MCarrierSlipSgwCB> colCBLambda) {
        return doBatchUpdate(mCarrierSlipSgwList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     *     mCarrierSlipSgw.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipSgw.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrierSlipSgw.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrierSlipSgw.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierSlipSgwList.add(mCarrierSlipSgw);
     * }
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipSgwList);
     * </pre>
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        return doBatchUpdateNonstrict(mCarrierSlipSgwList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierSlipSgwList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierSlipSgwList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrierSlipSgw> mCarrierSlipSgwList, SpecifyQuery<MCarrierSlipSgwCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCarrierSlipSgwList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        return doBatchDelete(mCarrierSlipSgwList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        return doBatchDeleteNonstrict(mCarrierSlipSgwList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCarrierSlipSgw, MCarrierSlipSgwCB&gt;() {
     *     public ConditionBean setup(MCarrierSlipSgw entity, MCarrierSlipSgwCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCarrierSlipSgw, MCarrierSlipSgwCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setPK...(value);</span>
     * mCarrierSlipSgw.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setVersionNo(value);</span>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCarrierSlipSgw, cb);
     * </pre>
     * @param mCarrierSlipSgw The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCarrierSlipSgw mCarrierSlipSgw, MCarrierSlipSgwCB cb) {
        return doQueryUpdate(mCarrierSlipSgw, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCarrierSlipSgw, cb);
     * </pre>
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCarrierSlipSgwCB cb) {
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
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrierSlipSgw.setFoo...(value);
     * mCarrierSlipSgw.setBar...(value);
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCarrierSlipSgw, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCarrierSlipSgw.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCarrierSlipSgw The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, InsertOption<MCarrierSlipSgwCB>> opLambda) {
        doInsert(mCarrierSlipSgw, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipSgw.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipSgw.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCarrierSlipSgw, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipSgw The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> opLambda) {
        doUpdate(mCarrierSlipSgw, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * mCarrierSlipSgw.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipSgw.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCarrierSlipSgw, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipSgw The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> opLambda) {
        doUpdateNonstrict(mCarrierSlipSgw, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCarrierSlipSgw The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, InsertOption<MCarrierSlipSgwCB>> insertOpLambda, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> updateOpLambda) {
        doInsertOrUpdate(mCarrierSlipSgw, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCarrierSlipSgw The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, InsertOption<MCarrierSlipSgwCB>> insertOpLambda, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCarrierSlipSgw, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCarrierSlipSgw The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, DeleteOption<MCarrierSlipSgwCB>> opLambda) {
        doDelete(mCarrierSlipSgw, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCarrierSlipSgw The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCarrierSlipSgw mCarrierSlipSgw, WritableOptionCall<MCarrierSlipSgwCB, DeleteOption<MCarrierSlipSgwCB>> opLambda) {
        doDeleteNonstrict(mCarrierSlipSgw, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCarrierSlipSgw> mCarrierSlipSgwList, WritableOptionCall<MCarrierSlipSgwCB, InsertOption<MCarrierSlipSgwCB>> opLambda) {
        return doBatchInsert(mCarrierSlipSgwList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCarrierSlipSgw> mCarrierSlipSgwList, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> opLambda) {
        return doBatchUpdate(mCarrierSlipSgwList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCarrierSlipSgw> mCarrierSlipSgwList, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> opLambda) {
        return doBatchUpdateNonstrict(mCarrierSlipSgwList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCarrierSlipSgw> mCarrierSlipSgwList, WritableOptionCall<MCarrierSlipSgwCB, DeleteOption<MCarrierSlipSgwCB>> opLambda) {
        return doBatchDelete(mCarrierSlipSgwList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCarrierSlipSgwList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCarrierSlipSgw> mCarrierSlipSgwList, WritableOptionCall<MCarrierSlipSgwCB, DeleteOption<MCarrierSlipSgwCB>> opLambda) {
        return doBatchDeleteNonstrict(mCarrierSlipSgwList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCarrierSlipSgw, MCarrierSlipSgwCB> manyArgLambda, WritableOptionCall<MCarrierSlipSgwCB, InsertOption<MCarrierSlipSgwCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrierSlipSgw mCarrierSlipSgw = <span style="color: #70226C">new</span> MCarrierSlipSgw();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setPK...(value);</span>
     * mCarrierSlipSgw.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipSgw.setVersionNo(value);</span>
     * MCarrierSlipSgwCB cb = <span style="color: #70226C">new</span> MCarrierSlipSgwCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCarrierSlipSgw, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipSgw The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCarrierSlipSgw mCarrierSlipSgw, MCarrierSlipSgwCB cb, WritableOptionCall<MCarrierSlipSgwCB, UpdateOption<MCarrierSlipSgwCB>> opLambda) {
        return doQueryUpdate(mCarrierSlipSgw, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCarrierSlipSgw. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCarrierSlipSgwCB cb, WritableOptionCall<MCarrierSlipSgwCB, DeleteOption<MCarrierSlipSgwCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCarrierSlipSgwBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCarrierSlipSgwBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierSlipSgwBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCarrierSlipSgwBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierSlipSgwBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCarrierSlipSgwBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCarrierSlipSgwBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCarrierSlipSgwBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCarrierSlipSgwBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCarrierSlipSgwBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCarrierSlipSgwBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCarrierSlipSgwBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCarrierSlipSgwBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCarrierSlipSgwBhv.outideSql().removeBlockComment().selectList()
     * mCarrierSlipSgwBhv.outideSql().removeLineComment().selectList()
     * mCarrierSlipSgwBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCarrierSlipSgwBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCarrierSlipSgwBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCarrierSlipSgw> typeOfSelectedEntity() { return MCarrierSlipSgw.class; }
    protected Class<MCarrierSlipSgw> typeOfHandlingEntity() { return MCarrierSlipSgw.class; }
    protected Class<MCarrierSlipSgwCB> typeOfHandlingConditionBean() { return MCarrierSlipSgwCB.class; }
}
