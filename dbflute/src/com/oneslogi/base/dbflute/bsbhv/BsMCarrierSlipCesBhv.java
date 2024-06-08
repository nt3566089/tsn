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
 * The behavior of M_CARRIER_SLIP_CES as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, B_CLASS_DTL(BySatDeliveryFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, bClassDtlBySatDeliveryFlg, bClassDtlByResidentialDeliveryFlg, bClassDtlByCodFlg, bClassDtlBySignatureRequiredFlg, bClassDtlBySignatureReleaseFlg, bClassDtlByCallBeforeDeliveryFlg, bClassDtlByFreezableProtectionFlg, bClassDtlByGuaranteedPlusFlg, bClassDtlByResidentialPickupFlg, bClassDtlByDoNotStackStackFlg, bClassDtlByLimitedAccessDeliveryFlg, bClassDtlByLimitedAccessPickupFlg, bClassDtlByOverSizedFlg, bClassDtlByPoisonFlg, bClassDtlByFoogFlg, bClassDtlByLiftgateDeliveryPrepaidFlg, bClassDtlByLiftgateDeliveryCollectFlg, bClassDtlByLiftgatePickupPrepaidFlg, bClassDtlByLiftgatePickupCollectFlg, bClassDtlByInsideDeliveryPrepaidFlg, bClassDtlByInsideDeliveryCollectFlg, bClassDtlByInsidePickupPrepaidFlg, bClassDtlByInsidePickupCollectFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipCesBhv extends AbstractBehaviorWritable<MCarrierSlipCes, MCarrierSlipCesCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCarrierSlipCesDbm asDBMeta() { return MCarrierSlipCesDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CARRIER_SLIP_CES"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCarrierSlipCesDbm getMyDBMeta() { return MCarrierSlipCesDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCarrierSlipCesCB newConditionBean() { return new MCarrierSlipCesCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCarrierSlipCes newMyEntity() { return new MCarrierSlipCes(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCarrierSlipCesCB newMyConditionBean() { return new MCarrierSlipCesCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCarrierSlipCesCB cb) {
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
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().setFoo...(value);
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCarrierSlipCes != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCarrierSlipCes.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipCes selectEntity(MCarrierSlipCesCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCarrierSlipCes facadeSelectEntity(MCarrierSlipCesCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipCes> OptionalEntity<ENTITY> doSelectOptionalEntity(MCarrierSlipCesCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().set...;
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCarrierSlipCes.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipCes selectEntityWithDeletedCheck(MCarrierSlipCesCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param customerId : PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipCes selectByPKValue(Long customerId) {
        return facadeSelectByPKValue(customerId);
    }

    protected MCarrierSlipCes facadeSelectByPKValue(Long customerId) {
        return doSelectByPK(customerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipCes> ENTITY doSelectByPK(Long customerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(customerId), tp);
    }

    protected <ENTITY extends MCarrierSlipCes> OptionalEntity<ENTITY> doSelectOptionalByPK(Long customerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(customerId, tp), customerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param customerId : PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCarrierSlipCes selectByPKValueWithDeletedCheck(Long customerId) {
        return doSelectByPKWithDeletedCheck(customerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCarrierSlipCes> ENTITY doSelectByPKWithDeletedCheck(Long customerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(customerId), tp);
    }

    protected MCarrierSlipCesCB xprepareCBAsPK(Long customerId) {
        assertObjectNotNull("customerId", customerId);
        return newConditionBean().acceptPK(customerId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCarrierSlipCes&gt; <span style="color: #553000">mCarrierSlipCesList</span> = <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCarrierSlipCes mCarrierSlipCes : <span style="color: #553000">mCarrierSlipCesList</span>) {
     *     ... = mCarrierSlipCes.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCarrierSlipCes> selectList(MCarrierSlipCesCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCarrierSlipCes&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCarrierSlipCes mCarrierSlipCes : <span style="color: #553000">page</span>) {
     *     ... = mCarrierSlipCes.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCarrierSlipCes> selectPage(MCarrierSlipCesCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @param entityRowHandler The handler of entity row of MCarrierSlipCes. (NotNull)
     */
    public void selectCursor(MCarrierSlipCesCB cb, EntityRowHandler<MCarrierSlipCes> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierSlipCesCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCarrierSlipCesCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCarrierSlipCesList The entity list of MCarrierSlipCes. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCarrierSlipCes> mCarrierSlipCesList, ReferrerLoaderHandler<LoaderOfMCarrierSlipCes> loaderLambda) {
        xassLRArg(mCarrierSlipCesList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrierSlipCes().ready(mCarrierSlipCesList, _behaviorSelector));
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
     * @param mCarrierSlipCes The entity of MCarrierSlipCes. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCarrierSlipCes mCarrierSlipCes, ReferrerLoaderHandler<LoaderOfMCarrierSlipCes> loaderLambda) {
        xassLRArg(mCarrierSlipCes, loaderLambda);
        loaderLambda.handle(new LoaderOfMCarrierSlipCes().ready(xnewLRAryLs(mCarrierSlipCes), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "mCustomer"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySatDeliveryFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlBySatDeliveryFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByResidentialDeliveryFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByResidentialDeliveryFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCodFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByCodFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySignatureRequiredFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlBySignatureRequiredFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySignatureReleaseFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlBySignatureReleaseFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCallBeforeDeliveryFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByCallBeforeDeliveryFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByFreezableProtectionFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByFreezableProtectionFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByGuaranteedPlusFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByGuaranteedPlusFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByResidentialPickupFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByResidentialPickupFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDoNotStackStackFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByDoNotStackStackFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitedAccessDeliveryFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByLimitedAccessDeliveryFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitedAccessPickupFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByLimitedAccessPickupFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByOverSizedFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByOverSizedFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPoisonFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByPoisonFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByFoogFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByFoogFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLiftgateDeliveryPrepaidFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByLiftgateDeliveryPrepaidFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLiftgateDeliveryCollectFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByLiftgateDeliveryCollectFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLiftgatePickupPrepaidFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByLiftgatePickupPrepaidFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLiftgatePickupCollectFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByLiftgatePickupCollectFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInsideDeliveryPrepaidFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByInsideDeliveryPrepaidFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInsideDeliveryCollectFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByInsideDeliveryCollectFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInsidePickupPrepaidFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByInsidePickupPrepaidFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInsidePickupCollectFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByInsidePickupCollectFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpPulloutInternally(mCarrierSlipCesList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key customerId.
     * @param mCarrierSlipCesList The list of mCarrierSlipCes. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCustomerIdList(List<MCarrierSlipCes> mCarrierSlipCesList)
    { return helpExtractListInternally(mCarrierSlipCesList, "customerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrierSlipCes.setFoo...(value);
     * mCarrierSlipCes.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.set...;</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">insert</span>(mCarrierSlipCes);
     * ... = mCarrierSlipCes.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCarrierSlipCes The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCarrierSlipCes mCarrierSlipCes) {
        doInsert(mCarrierSlipCes, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipCes.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipCes.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">update</span>(mCarrierSlipCes);
     * </pre>
     * @param mCarrierSlipCes The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCarrierSlipCes mCarrierSlipCes) {
        doUpdate(mCarrierSlipCes, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipCes.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCarrierSlipCes);
     * </pre>
     * @param mCarrierSlipCes The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCarrierSlipCes mCarrierSlipCes) {
        doUpdateNonstrict(mCarrierSlipCes, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrierSlipCes The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCarrierSlipCes mCarrierSlipCes) {
        doInsertOrUpdate(mCarrierSlipCes, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCarrierSlipCes The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCarrierSlipCes mCarrierSlipCes) {
        doInsertOrUpdateNonstrict(mCarrierSlipCes, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipCes.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">delete</span>(mCarrierSlipCes);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCarrierSlipCes The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCarrierSlipCes mCarrierSlipCes) {
        doDelete(mCarrierSlipCes, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCarrierSlipCes);
     * </pre>
     * @param mCarrierSlipCes The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCarrierSlipCes mCarrierSlipCes) {
        doDeleteNonstrict(mCarrierSlipCes, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCarrierSlipCes);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCarrierSlipCes The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCarrierSlipCes mCarrierSlipCes) {
        doDeleteNonstrictIgnoreDeleted(mCarrierSlipCes, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCarrierSlipCes et, final DeleteOption<MCarrierSlipCesCB> op) {
        assertObjectNotNull("mCarrierSlipCes", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     *     mCarrierSlipCes.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipCes.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCarrierSlipCesList.add(mCarrierSlipCes);
     * }
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCarrierSlipCesList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCarrierSlipCes> mCarrierSlipCesList) {
        return doBatchInsert(mCarrierSlipCesList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     *     mCarrierSlipCes.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipCes.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrierSlipCes.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrierSlipCes.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierSlipCesList.add(mCarrierSlipCes);
     * }
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipCesList);
     * </pre>
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrierSlipCes> mCarrierSlipCesList) {
        return doBatchUpdate(mCarrierSlipCesList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCarrierSlipCesBhv.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipCesList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipCesList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCarrierSlipCes> mCarrierSlipCesList, SpecifyQuery<MCarrierSlipCesCB> colCBLambda) {
        return doBatchUpdate(mCarrierSlipCesList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     *     mCarrierSlipCes.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCarrierSlipCes.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCarrierSlipCes.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCarrierSlipCes.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCarrierSlipCesList.add(mCarrierSlipCes);
     * }
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCarrierSlipCesList);
     * </pre>
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrierSlipCes> mCarrierSlipCesList) {
        return doBatchUpdateNonstrict(mCarrierSlipCesList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierSlipCesList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCarrierSlipCesList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCarrierSlipCes> mCarrierSlipCesList, SpecifyQuery<MCarrierSlipCesCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCarrierSlipCesList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCarrierSlipCes> mCarrierSlipCesList) {
        return doBatchDelete(mCarrierSlipCesList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCarrierSlipCes> mCarrierSlipCesList) {
        return doBatchDeleteNonstrict(mCarrierSlipCesList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCarrierSlipCes, MCarrierSlipCesCB&gt;() {
     *     public ConditionBean setup(MCarrierSlipCes entity, MCarrierSlipCesCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCarrierSlipCes, MCarrierSlipCesCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setPK...(value);</span>
     * mCarrierSlipCes.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setVersionNo(value);</span>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCarrierSlipCes, cb);
     * </pre>
     * @param mCarrierSlipCes The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCarrierSlipCes mCarrierSlipCes, MCarrierSlipCesCB cb) {
        return doQueryUpdate(mCarrierSlipCes, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCarrierSlipCesCB cb = new MCarrierSlipCesCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCarrierSlipCes, cb);
     * </pre>
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCarrierSlipCesCB cb) {
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
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCarrierSlipCes.setFoo...(value);
     * mCarrierSlipCes.setBar...(value);
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCarrierSlipCes, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCarrierSlipCes.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCarrierSlipCes The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, InsertOption<MCarrierSlipCesCB>> opLambda) {
        doInsert(mCarrierSlipCes, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipCes.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCarrierSlipCes.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCarrierSlipCes, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipCes The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> opLambda) {
        doUpdate(mCarrierSlipCes, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * mCarrierSlipCes.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCarrierSlipCes.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCarrierSlipCes, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipCes The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> opLambda) {
        doUpdateNonstrict(mCarrierSlipCes, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCarrierSlipCes The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, InsertOption<MCarrierSlipCesCB>> insertOpLambda, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> updateOpLambda) {
        doInsertOrUpdate(mCarrierSlipCes, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCarrierSlipCes The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, InsertOption<MCarrierSlipCesCB>> insertOpLambda, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCarrierSlipCes, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCarrierSlipCes The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, DeleteOption<MCarrierSlipCesCB>> opLambda) {
        doDelete(mCarrierSlipCes, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCarrierSlipCes The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCarrierSlipCes mCarrierSlipCes, WritableOptionCall<MCarrierSlipCesCB, DeleteOption<MCarrierSlipCesCB>> opLambda) {
        doDeleteNonstrict(mCarrierSlipCes, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCarrierSlipCes> mCarrierSlipCesList, WritableOptionCall<MCarrierSlipCesCB, InsertOption<MCarrierSlipCesCB>> opLambda) {
        return doBatchInsert(mCarrierSlipCesList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCarrierSlipCes> mCarrierSlipCesList, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> opLambda) {
        return doBatchUpdate(mCarrierSlipCesList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCarrierSlipCes> mCarrierSlipCesList, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> opLambda) {
        return doBatchUpdateNonstrict(mCarrierSlipCesList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCarrierSlipCes> mCarrierSlipCesList, WritableOptionCall<MCarrierSlipCesCB, DeleteOption<MCarrierSlipCesCB>> opLambda) {
        return doBatchDelete(mCarrierSlipCesList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCarrierSlipCesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCarrierSlipCes> mCarrierSlipCesList, WritableOptionCall<MCarrierSlipCesCB, DeleteOption<MCarrierSlipCesCB>> opLambda) {
        return doBatchDeleteNonstrict(mCarrierSlipCesList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCarrierSlipCes, MCarrierSlipCesCB> manyArgLambda, WritableOptionCall<MCarrierSlipCesCB, InsertOption<MCarrierSlipCesCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCarrierSlipCes mCarrierSlipCes = <span style="color: #70226C">new</span> MCarrierSlipCes();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setPK...(value);</span>
     * mCarrierSlipCes.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCarrierSlipCes.setVersionNo(value);</span>
     * MCarrierSlipCesCB cb = <span style="color: #70226C">new</span> MCarrierSlipCesCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCarrierSlipCesBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCarrierSlipCes, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCarrierSlipCes The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCarrierSlipCes mCarrierSlipCes, MCarrierSlipCesCB cb, WritableOptionCall<MCarrierSlipCesCB, UpdateOption<MCarrierSlipCesCB>> opLambda) {
        return doQueryUpdate(mCarrierSlipCes, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCarrierSlipCes. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCarrierSlipCesCB cb, WritableOptionCall<MCarrierSlipCesCB, DeleteOption<MCarrierSlipCesCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCarrierSlipCesBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCarrierSlipCesBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierSlipCesBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCarrierSlipCesBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCarrierSlipCesBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCarrierSlipCesBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCarrierSlipCesBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCarrierSlipCesBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCarrierSlipCesBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCarrierSlipCesBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCarrierSlipCesBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCarrierSlipCesBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCarrierSlipCesBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCarrierSlipCesBhv.outideSql().removeBlockComment().selectList()
     * mCarrierSlipCesBhv.outideSql().removeLineComment().selectList()
     * mCarrierSlipCesBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCarrierSlipCesBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCarrierSlipCesBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCarrierSlipCes> typeOfSelectedEntity() { return MCarrierSlipCes.class; }
    protected Class<MCarrierSlipCes> typeOfHandlingEntity() { return MCarrierSlipCes.class; }
    protected Class<MCarrierSlipCesCB> typeOfHandlingConditionBean() { return MCarrierSlipCesCB.class; }
}
