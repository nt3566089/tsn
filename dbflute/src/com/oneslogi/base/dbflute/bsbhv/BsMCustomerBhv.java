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
 * The behavior of M_CUSTOMER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, CLIENT_ID, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, ZIP_CD, TEL_NO, ADDRESS1, ADDRESS2, ADDRESS3, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ALLOC_ORDER, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, DELIV_CUSTOMER_ID, SHOW_PRIORITY, MARKET_TYPE, LOGISTICS_CD, FAX_NO, DELIVERY_TIME, COMMENTS, SPECIAL_AGENTS_CD2, SPECIAL_AGENTS_FLG, OtherColumn1, NAME, A_NAME, SS_NAME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_CLIENT, M_CUSTOMER, M_CLIENT_CENTER(ByClientId), B_CLASS_DTL(ByDelFlg), M_CARRIER_SLIP_CES(AsOne)
 *
 * [referrer table]
 *     M_CENTER_CUSTOMER, M_CLIENT, M_CLIENT_CENTER, M_CUSTOMER, M_LOCATION, M_USER_DEPOSIT, T_ALLOC_INST_B, T_ALLOC_INST_H, T_ALLOC_LOT, T_INVENTORY_B, T_INVENTORY_INST, T_KEEPING_LOT, T_LAST_LOT, T_MOVE_INST_B, T_RECEIVE_PLAN_H, T_SHIPPING_INST_B, T_SHIPPING_INST_H, T_STOCK, T_STORE_NO, T_STORE_RECORD_H, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, M_CARRIER_SLIP_CES
 *
 * [foreign property]
 *     mClient, mCustomerSelf, mClientCenterByClientId, bClassDtlByDelFlg, bClassDtlByDeliveryFlg, bClassDtlByDepositFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotReverseFlg, bClassDtlByOnetimeFlg, bClassDtlByShippingStopFlg, bClassDtlByVendorFlg, mCarrierSlipCesAsOne
 *
 * [referrer property]
 *     mCenterCustomerList, mClientList, mClientCenterList, mCustomerSelfList, mLocationList, mUserDepositList, tAllocInstBList, tAllocInstHByDelivCustomerIdList, tAllocInstHBySupplyCustomerIdList, tAllocLotList, tInventoryBByDepositIdList, tInventoryBBySupplierIdList, tInventoryInstList, tKeepingLotList, tLastLotList, tMoveInstBByDepositIdList, tMoveInstBBySupplierIdList, tReceivePlanHByPlanDepositIdList, tReceivePlanHByPlanSupplierIdList, tShippingInstBList, tShippingInstHByDelivCustomerIdList, tShippingInstHBySupplyCustomerIdList, tStockList, tStoreNoList, tStoreRecordHByDepositIdList, tStoreRecordHBySupplierIdList, wHtInventoryInputProdList, wHtReceiveNoPlanInspByDepositIdList, wHtReceiveNoPlanInspBySupplierIdList, wHtSerialReceiveInspList, wHtSerialShippingInspList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCustomerBhv extends AbstractBehaviorWritable<MCustomer, MCustomerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCustomerDbm asDBMeta() { return MCustomerDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CUSTOMER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCustomerDbm getMyDBMeta() { return MCustomerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCustomerCB newConditionBean() { return new MCustomerCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCustomer newMyEntity() { return new MCustomer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCustomerCB newMyConditionBean() { return new MCustomerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCustomerCB cb) {
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
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().setFoo...(value);
     * MCustomer mCustomer = <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCustomer != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCustomer.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCustomer selectEntity(MCustomerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCustomer facadeSelectEntity(MCustomerCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCustomer> OptionalEntity<ENTITY> doSelectOptionalEntity(MCustomerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().set...;
     * MCustomer mCustomer = <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCustomer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCustomer selectEntityWithDeletedCheck(MCustomerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param customerId : PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCustomer selectByPKValue(Long customerId) {
        return facadeSelectByPKValue(customerId);
    }

    protected MCustomer facadeSelectByPKValue(Long customerId) {
        return doSelectByPK(customerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCustomer> ENTITY doSelectByPK(Long customerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(customerId), tp);
    }

    protected <ENTITY extends MCustomer> OptionalEntity<ENTITY> doSelectOptionalByPK(Long customerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(customerId, tp), customerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param customerId : PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCustomer selectByPKValueWithDeletedCheck(Long customerId) {
        return doSelectByPKWithDeletedCheck(customerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCustomer> ENTITY doSelectByPKWithDeletedCheck(Long customerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(customerId), tp);
    }

    protected MCustomerCB xprepareCBAsPK(Long customerId) {
        assertObjectNotNull("customerId", customerId);
        return newConditionBean().acceptPK(customerId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param customerCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCustomer> selectByUniqueOf(Long clientId, String customerCd) {
        return facadeSelectByUniqueOf(clientId, customerCd);
    }

    protected OptionalEntity<MCustomer> facadeSelectByUniqueOf(Long clientId, String customerCd) {
        return doSelectByUniqueOf(clientId, customerCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCustomer> OptionalEntity<ENTITY> doSelectByUniqueOf(Long clientId, String customerCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(clientId, customerCd), tp), clientId, customerCd);
    }

    protected MCustomerCB xprepareCBAsUniqueOf(Long clientId, String customerCd) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("customerCd", customerCd);
        return newConditionBean().acceptUniqueOf(clientId, customerCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCustomer&gt; <span style="color: #553000">mCustomerList</span> = <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCustomer> selectList(MCustomerCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCustomer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">page</span>) {
     *     ... = mCustomer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCustomer> selectPage(MCustomerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @param entityRowHandler The handler of entity row of MCustomer. (NotNull)
     */
    public void selectCursor(MCustomerCB cb, EntityRowHandler<MCustomer> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCustomerCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCustomerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCustomer> mCustomerList, ReferrerLoaderHandler<LoaderOfMCustomer> loaderLambda) {
        xassLRArg(mCustomerList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCustomer().ready(mCustomerList, _behaviorSelector));
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
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCustomer mCustomer, ReferrerLoaderHandler<LoaderOfMCustomer> loaderLambda) {
        xassLRArg(mCustomer, loaderLambda);
        loaderLambda.handle(new LoaderOfMCustomer().ready(xnewLRAryLs(mCustomer), _behaviorSelector));
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by CUSTOMER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MCustomer> mCustomerList, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadMCenterCustomerList(mCustomerList, new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by CUSTOMER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MCustomer mCustomer, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadMCenterCustomerList(xnewLRLs(mCustomer), new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MCustomer mCustomer, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadMCenterCustomerList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MCustomer> mCustomerList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<MCenterCustomer>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterCustomerList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCustomer> doLoadMCenterCustomerList(List<MCustomer> mCustomerList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "mCenterCustomerList");
    }

    /**
     * Load referrer of MClientList by the set-upper of referrer. <br>
     * M_CLIENT by CUSTOMER_ID, named 'MClientList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMClientList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClient> loadMClientList(List<MCustomer> mCustomerList, ConditionBeanSetupper<MClientCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadMClientList(mCustomerList, new LoadReferrerOption<MClientCB, MClient>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientList by the set-upper of referrer. <br>
     * M_CLIENT by CUSTOMER_ID, named 'MClientList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMClientList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMClientList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClient> loadMClientList(MCustomer mCustomer, ConditionBeanSetupper<MClientCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadMClientList(xnewLRLs(mCustomer), new LoadReferrerOption<MClientCB, MClient>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClient> loadMClientList(MCustomer mCustomer, LoadReferrerOption<MClientCB, MClient> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadMClientList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClient> loadMClientList(List<MCustomer> mCustomerList, LoadReferrerOption<MClientCB, MClient> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<MClient>)EMPTY_NREF_LGWAY; }
        return doLoadMClientList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClient> doLoadMClientList(List<MCustomer> mCustomerList, LoadReferrerOption<MClientCB, MClient> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "mClientList");
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * M_CLIENT_CENTER by CUSTOMER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MCustomer> mCustomerList, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadMClientCenterList(mCustomerList, new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * M_CLIENT_CENTER by CUSTOMER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMClientCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MCustomer mCustomer, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadMClientCenterList(xnewLRLs(mCustomer), new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MCustomer mCustomer, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadMClientCenterList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MCustomer> mCustomerList, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<MClientCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMClientCenterList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCenter> doLoadMClientCenterList(List<MCustomer> mCustomerList, LoadReferrerOption<MClientCenterCB, MClientCenter> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "mClientCenterList");
    }

    /**
     * Load referrer of MCustomerSelfList by the set-upper of referrer. <br>
     * M_CUSTOMER by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMCustomerSelfList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMCustomerSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomer> loadMCustomerSelfList(List<MCustomer> mCustomerList, ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadMCustomerSelfList(mCustomerList, new LoadReferrerOption<MCustomerCB, MCustomer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCustomerSelfList by the set-upper of referrer. <br>
     * M_CUSTOMER by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMCustomerSelfList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMCustomerSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomer> loadMCustomerSelfList(MCustomer mCustomer, ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadMCustomerSelfList(xnewLRLs(mCustomer), new LoadReferrerOption<MCustomerCB, MCustomer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomer> loadMCustomerSelfList(MCustomer mCustomer, LoadReferrerOption<MCustomerCB, MCustomer> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadMCustomerSelfList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCustomer> loadMCustomerSelfList(List<MCustomer> mCustomerList, LoadReferrerOption<MCustomerCB, MCustomer> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<MCustomer>)EMPTY_NREF_LGWAY; }
        return doLoadMCustomerSelfList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCustomer> doLoadMCustomerSelfList(List<MCustomer> mCustomerList, LoadReferrerOption<MCustomerCB, MCustomer> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "mCustomerSelfList");
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishDepositId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishDepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MCustomer> mCustomerList, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadMLocationList(mCustomerList, new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMLocationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishDepositId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishDepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MCustomer mCustomer, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadMLocationList(xnewLRLs(mCustomer), new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MCustomer mCustomer, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadMLocationList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MCustomer> mCustomerList, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<MLocation>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocation> doLoadMLocationList(List<MCustomer> mCustomerList, LoadReferrerOption<MLocationCB, MLocation> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "mLocationList");
    }

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * M_USER_DEPOSIT by CUSTOMER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">depositCB</span>.setupSelect...
     *     <span style="color: #553000">depositCB</span>.query().set...
     *     <span style="color: #553000">depositCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMUserDepositList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(List<MCustomer> mCustomerList, ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadMUserDepositList(mCustomerList, new LoadReferrerOption<MUserDepositCB, MUserDeposit>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * M_USER_DEPOSIT by CUSTOMER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">depositCB</span>.setupSelect...
     *     <span style="color: #553000">depositCB</span>.query().set...
     *     <span style="color: #553000">depositCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMUserDepositList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(MCustomer mCustomer, ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadMUserDepositList(xnewLRLs(mCustomer), new LoadReferrerOption<MUserDepositCB, MUserDeposit>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(MCustomer mCustomer, LoadReferrerOption<MUserDepositCB, MUserDeposit> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadMUserDepositList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(List<MCustomer> mCustomerList, LoadReferrerOption<MUserDepositCB, MUserDeposit> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<MUserDeposit>)EMPTY_NREF_LGWAY; }
        return doLoadMUserDepositList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserDeposit> doLoadMUserDepositList(List<MCustomer> mCustomerList, LoadReferrerOption<MUserDepositCB, MUserDeposit> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "mUserDepositList");
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by DEPOSIT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTAllocInstBList(mCustomerList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by DEPOSIT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MCustomer mCustomer, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(mCustomer), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MCustomer mCustomer, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TAllocInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHByDelivCustomerIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocInstHByDelivCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTAllocInstHByDelivCustomerIdList(mCustomerList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHByDelivCustomerIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTAllocInstHByDelivCustomerIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(MCustomer mCustomer, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTAllocInstHByDelivCustomerIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(MCustomer mCustomer, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTAllocInstHByDelivCustomerIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHByDelivCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHByDelivCustomerIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHByDelivCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tAllocInstHByDelivCustomerIdList");
    }

    /**
     * Load referrer of TAllocInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHBySupplyCustomerIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocInstHBySupplyCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplyCustomerId_InScope(pkList);
     * cb.query().addOrderBy_SupplyCustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTAllocInstHBySupplyCustomerIdList(mCustomerList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocInstHBySupplyCustomerIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTAllocInstHBySupplyCustomerIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplyCustomerId_InScope(pkList);
     * cb.query().addOrderBy_SupplyCustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(MCustomer mCustomer, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTAllocInstHBySupplyCustomerIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(MCustomer mCustomer, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTAllocInstHBySupplyCustomerIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHBySupplyCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHBySupplyCustomerIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHBySupplyCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tAllocInstHBySupplyCustomerIdList");
    }

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * T_ALLOC_LOT by CUSTOMER_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTAllocLotList(mCustomerList, new LoadReferrerOption<TAllocLotCB, TAllocLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * T_ALLOC_LOT by CUSTOMER_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTAllocLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(MCustomer mCustomer, ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTAllocLotList(xnewLRLs(mCustomer), new LoadReferrerOption<TAllocLotCB, TAllocLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(MCustomer mCustomer, LoadReferrerOption<TAllocLotCB, TAllocLot> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTAllocLotList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocLotCB, TAllocLot> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TAllocLot>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocLotList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocLot> doLoadTAllocLotList(List<MCustomer> mCustomerList, LoadReferrerOption<TAllocLotCB, TAllocLot> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tAllocLotList");
    }

    /**
     * Load referrer of TInventoryBByDepositIdList by the set-upper of referrer. <br>
     * T_INVENTORY_B by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTInventoryBByDepositIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryBByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBByDepositIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTInventoryBByDepositIdList(mCustomerList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBByDepositIdList by the set-upper of referrer. <br>
     * T_INVENTORY_B by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTInventoryBByDepositIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTInventoryBByDepositIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBByDepositIdList(MCustomer mCustomer, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTInventoryBByDepositIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBByDepositIdList(MCustomer mCustomer, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTInventoryBByDepositIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBByDepositIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tInventoryBByDepositIdList");
    }

    /**
     * Load referrer of TInventoryBBySupplierIdList by the set-upper of referrer. <br>
     * T_INVENTORY_B by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTInventoryBBySupplierIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryBBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBBySupplierIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTInventoryBBySupplierIdList(mCustomerList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBBySupplierIdList by the set-upper of referrer. <br>
     * T_INVENTORY_B by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTInventoryBBySupplierIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTInventoryBBySupplierIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBBySupplierIdList(MCustomer mCustomer, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTInventoryBBySupplierIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBBySupplierIdList(MCustomer mCustomer, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTInventoryBBySupplierIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBBySupplierIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tInventoryBBySupplierIdList");
    }

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by DEPOSIT_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">instCB</span>.setupSelect...
     *     <span style="color: #553000">instCB</span>.query().set...
     *     <span style="color: #553000">instCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTInventoryInstList(mCustomerList, new LoadReferrerOption<TInventoryInstCB, TInventoryInst>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by DEPOSIT_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">instCB</span>.setupSelect...
     *     <span style="color: #553000">instCB</span>.query().set...
     *     <span style="color: #553000">instCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(MCustomer mCustomer, ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTInventoryInstList(xnewLRLs(mCustomer), new LoadReferrerOption<TInventoryInstCB, TInventoryInst>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(MCustomer mCustomer, LoadReferrerOption<TInventoryInstCB, TInventoryInst> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTInventoryInstList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(List<MCustomer> mCustomerList, LoadReferrerOption<TInventoryInstCB, TInventoryInst> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TInventoryInst>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryInstList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryInst> doLoadTInventoryInstList(List<MCustomer> mCustomerList, LoadReferrerOption<TInventoryInstCB, TInventoryInst> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tInventoryInstList");
    }

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * T_KEEPING_LOT by CUSTOMER_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTKeepingLotList(mCustomerList, new LoadReferrerOption<TKeepingLotCB, TKeepingLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * T_KEEPING_LOT by CUSTOMER_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(MCustomer mCustomer, ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTKeepingLotList(xnewLRLs(mCustomer), new LoadReferrerOption<TKeepingLotCB, TKeepingLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(MCustomer mCustomer, LoadReferrerOption<TKeepingLotCB, TKeepingLot> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTKeepingLotList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(List<MCustomer> mCustomerList, LoadReferrerOption<TKeepingLotCB, TKeepingLot> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TKeepingLot>)EMPTY_NREF_LGWAY; }
        return doLoadTKeepingLotList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TKeepingLot> doLoadTKeepingLotList(List<MCustomer> mCustomerList, LoadReferrerOption<TKeepingLotCB, TKeepingLot> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tKeepingLotList");
    }

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * T_LAST_LOT by CUSTOMER_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTLastLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTLastLotList(mCustomerList, new LoadReferrerOption<TLastLotCB, TLastLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * T_LAST_LOT by CUSTOMER_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTLastLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(MCustomer mCustomer, ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTLastLotList(xnewLRLs(mCustomer), new LoadReferrerOption<TLastLotCB, TLastLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(MCustomer mCustomer, LoadReferrerOption<TLastLotCB, TLastLot> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTLastLotList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(List<MCustomer> mCustomerList, LoadReferrerOption<TLastLotCB, TLastLot> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TLastLot>)EMPTY_NREF_LGWAY; }
        return doLoadTLastLotList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TLastLot> doLoadTLastLotList(List<MCustomer> mCustomerList, LoadReferrerOption<TLastLotCB, TLastLot> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tLastLotList");
    }

    /**
     * Load referrer of TMoveInstBByDepositIdList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTMoveInstBByDepositIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTMoveInstBByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBByDepositIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTMoveInstBByDepositIdList(mCustomerList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBByDepositIdList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTMoveInstBByDepositIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTMoveInstBByDepositIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBByDepositIdList(MCustomer mCustomer, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTMoveInstBByDepositIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBByDepositIdList(MCustomer mCustomer, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTMoveInstBByDepositIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBByDepositIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tMoveInstBByDepositIdList");
    }

    /**
     * Load referrer of TMoveInstBBySupplierIdList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTMoveInstBBySupplierIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTMoveInstBBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBBySupplierIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTMoveInstBBySupplierIdList(mCustomerList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBBySupplierIdList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTMoveInstBBySupplierIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTMoveInstBBySupplierIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBBySupplierIdList(MCustomer mCustomer, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTMoveInstBBySupplierIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBBySupplierIdList(MCustomer mCustomer, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTMoveInstBBySupplierIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBBySupplierIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tMoveInstBBySupplierIdList");
    }

    /**
     * Load referrer of TReceivePlanHByPlanDepositIdList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTReceivePlanHByPlanDepositIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTReceivePlanHByPlanDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanDepositId_InScope(pkList);
     * cb.query().addOrderBy_PlanDepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanDepositIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTReceivePlanHByPlanDepositIdList(mCustomerList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHByPlanDepositIdList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTReceivePlanHByPlanDepositIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTReceivePlanHByPlanDepositIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanDepositId_InScope(pkList);
     * cb.query().addOrderBy_PlanDepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanDepositIdList(MCustomer mCustomer, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTReceivePlanHByPlanDepositIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanDepositIdList(MCustomer mCustomer, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTReceivePlanHByPlanDepositIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHByPlanDepositIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHByPlanDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tReceivePlanHByPlanDepositIdList");
    }

    /**
     * Load referrer of TReceivePlanHByPlanSupplierIdList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTReceivePlanHByPlanSupplierIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTReceivePlanHByPlanSupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanSupplierId_InScope(pkList);
     * cb.query().addOrderBy_PlanSupplierId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanSupplierIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTReceivePlanHByPlanSupplierIdList(mCustomerList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHByPlanSupplierIdList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTReceivePlanHByPlanSupplierIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTReceivePlanHByPlanSupplierIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanSupplierId_InScope(pkList);
     * cb.query().addOrderBy_PlanSupplierId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanSupplierIdList(MCustomer mCustomer, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTReceivePlanHByPlanSupplierIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanSupplierIdList(MCustomer mCustomer, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTReceivePlanHByPlanSupplierIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHByPlanSupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHByPlanSupplierIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHByPlanSupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tReceivePlanHByPlanSupplierIdList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by DEPOSIT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTShippingInstBList(mCustomerList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by DEPOSIT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MCustomer mCustomer, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(mCustomer), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MCustomer mCustomer, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MCustomer> mCustomerList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<MCustomer> mCustomerList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TShippingInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTShippingInstHByDelivCustomerIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstHByDelivCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHByDelivCustomerIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTShippingInstHByDelivCustomerIdList(mCustomerList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTShippingInstHByDelivCustomerIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTShippingInstHByDelivCustomerIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHByDelivCustomerIdList(MCustomer mCustomer, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTShippingInstHByDelivCustomerIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHByDelivCustomerIdList(MCustomer mCustomer, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTShippingInstHByDelivCustomerIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHByDelivCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHByDelivCustomerIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHByDelivCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tShippingInstHByDelivCustomerIdList");
    }

    /**
     * Load referrer of TShippingInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTShippingInstHBySupplyCustomerIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstHBySupplyCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplyCustomerId_InScope(pkList);
     * cb.query().addOrderBy_SupplyCustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHBySupplyCustomerIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTShippingInstHBySupplyCustomerIdList(mCustomerList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTShippingInstHBySupplyCustomerIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTShippingInstHBySupplyCustomerIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplyCustomerId_InScope(pkList);
     * cb.query().addOrderBy_SupplyCustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHBySupplyCustomerIdList(MCustomer mCustomer, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTShippingInstHBySupplyCustomerIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHBySupplyCustomerIdList(MCustomer mCustomer, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTShippingInstHBySupplyCustomerIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHBySupplyCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHBySupplyCustomerIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHBySupplyCustomerIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tShippingInstHBySupplyCustomerIdList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by DEPOSIT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTStockList(mCustomerList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by DEPOSIT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MCustomer mCustomer, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTStockList(xnewLRLs(mCustomer), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MCustomer mCustomer, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTStockList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<MCustomer> mCustomerList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<MCustomer> mCustomerList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tStockList");
    }

    /**
     * Load referrer of TStoreNoList by the set-upper of referrer. <br>
     * T_STORE_NO by SUPPLIER_ID, named 'TStoreNoList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStoreNoList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStoreNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TStoreNoCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTStoreNoList(mCustomerList, new LoadReferrerOption<TStoreNoCB, TStoreNo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreNoList by the set-upper of referrer. <br>
     * T_STORE_NO by SUPPLIER_ID, named 'TStoreNoList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStoreNoList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTStoreNoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoList(MCustomer mCustomer, ConditionBeanSetupper<TStoreNoCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTStoreNoList(xnewLRLs(mCustomer), new LoadReferrerOption<TStoreNoCB, TStoreNo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoList(MCustomer mCustomer, LoadReferrerOption<TStoreNoCB, TStoreNo> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTStoreNoList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreNo> loadTStoreNoList(List<MCustomer> mCustomerList, LoadReferrerOption<TStoreNoCB, TStoreNo> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TStoreNo>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreNoList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreNo> doLoadTStoreNoList(List<MCustomer> mCustomerList, LoadReferrerOption<TStoreNoCB, TStoreNo> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tStoreNoList");
    }

    /**
     * Load referrer of TStoreRecordHByDepositIdList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStoreRecordHByDepositIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStoreRecordHByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHByDepositIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTStoreRecordHByDepositIdList(mCustomerList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHByDepositIdList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStoreRecordHByDepositIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTStoreRecordHByDepositIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHByDepositIdList(MCustomer mCustomer, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTStoreRecordHByDepositIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHByDepositIdList(MCustomer mCustomer, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTStoreRecordHByDepositIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHByDepositIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tStoreRecordHByDepositIdList");
    }

    /**
     * Load referrer of TStoreRecordHBySupplierIdList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStoreRecordHBySupplierIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStoreRecordHBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHBySupplierIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadTStoreRecordHBySupplierIdList(mCustomerList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHBySupplierIdList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadTStoreRecordHBySupplierIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getTStoreRecordHBySupplierIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHBySupplierIdList(MCustomer mCustomer, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadTStoreRecordHBySupplierIdList(xnewLRLs(mCustomer), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHBySupplierIdList(MCustomer mCustomer, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadTStoreRecordHBySupplierIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHBySupplierIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "tStoreRecordHBySupplierIdList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConsignmentClsId_InScope(pkList);
     * cb.query().addOrderBy_ConsignmentClsId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mCustomerList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConsignmentClsId_InScope(pkList);
     * cb.query().addOrderBy_ConsignmentClsId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MCustomer mCustomer, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mCustomer), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MCustomer mCustomer, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspByDepositIdList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspByDepositIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtReceiveNoPlanInspByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspByDepositIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspByDepositIdList(mCustomerList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspByDepositIdList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspByDepositIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspByDepositIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspByDepositIdList(MCustomer mCustomer, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadWHtReceiveNoPlanInspByDepositIdList(xnewLRLs(mCustomer), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspByDepositIdList(MCustomer mCustomer, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadWHtReceiveNoPlanInspByDepositIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspByDepositIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspByDepositIdList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "wHtReceiveNoPlanInspByDepositIdList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspBySupplierIdList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspBySupplierIdList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtReceiveNoPlanInspBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspBySupplierIdList(List<MCustomer> mCustomerList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspBySupplierIdList(mCustomerList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspBySupplierIdList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspBySupplierIdList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspBySupplierIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspBySupplierIdList(MCustomer mCustomer, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadWHtReceiveNoPlanInspBySupplierIdList(xnewLRLs(mCustomer), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspBySupplierIdList(MCustomer mCustomer, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadWHtReceiveNoPlanInspBySupplierIdList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspBySupplierIdList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspBySupplierIdList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "wHtReceiveNoPlanInspBySupplierIdList");
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_RECEIVE_INSP by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MCustomer> mCustomerList, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadWHtSerialReceiveInspList(mCustomerList, new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_RECEIVE_INSP by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MCustomer mCustomer, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadWHtSerialReceiveInspList(xnewLRLs(mCustomer), new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MCustomer mCustomer, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadWHtSerialReceiveInspList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialReceiveInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialReceiveInspList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialReceiveInsp> doLoadWHtSerialReceiveInspList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "wHtSerialReceiveInspList");
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_SHIPPING_INSP by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MCustomer> mCustomerList, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mCustomerList, refCBLambda);
        return doLoadWHtSerialShippingInspList(mCustomerList, new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_SHIPPING_INSP by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mCustomer</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MCustomer mCustomer, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mCustomer, refCBLambda);
        return doLoadWHtSerialShippingInspList(xnewLRLs(mCustomer), new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCustomer The entity of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MCustomer mCustomer, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mCustomer, loadReferrerOption);
        return loadWHtSerialShippingInspList(xnewLRLs(mCustomer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCustomerList The entity list of MCustomer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mCustomerList, loadReferrerOption);
        if (mCustomerList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialShippingInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialShippingInspList(mCustomerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialShippingInsp> doLoadWHtSerialShippingInspList(List<MCustomer> mCustomerList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> option) {
        return helpLoadReferrerInternally(mCustomerList, option, "wHtSerialShippingInspList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MClient'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerSelf(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "mCustomerSelf"); }

    /**
     * Pull out the list of foreign table 'MClientCenter'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClientCenter> pulloutMClientCenterByClientId(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "mClientCenterByClientId"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDeliveryFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByDeliveryFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDepositFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByDepositFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitDtReverseFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByLimitDtReverseFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLotReverseFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByLotReverseFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByOnetimeFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByOnetimeFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByShippingStopFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByShippingStopFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByVendorFlg(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "bClassDtlByVendorFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'MCarrierSlipCes'.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCarrierSlipCes> pulloutMCarrierSlipCesAsOne(List<MCustomer> mCustomerList)
    { return helpPulloutInternally(mCustomerList, "mCarrierSlipCesAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key customerId.
     * @param mCustomerList The list of mCustomer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCustomerIdList(List<MCustomer> mCustomerList)
    { return helpExtractListInternally(mCustomerList, "customerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCustomer.setFoo...(value);
     * mCustomer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCustomer.set...;</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">insert</span>(mCustomer);
     * ... = mCustomer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCustomer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCustomer mCustomer) {
        doInsert(mCustomer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCustomer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCustomer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCustomer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">update</span>(mCustomer);
     * </pre>
     * @param mCustomer The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCustomer mCustomer) {
        doUpdate(mCustomer, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCustomer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCustomer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCustomer);
     * </pre>
     * @param mCustomer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCustomer mCustomer) {
        doUpdateNonstrict(mCustomer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCustomer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCustomer mCustomer) {
        doInsertOrUpdate(mCustomer, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCustomer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCustomer mCustomer) {
        doInsertOrUpdateNonstrict(mCustomer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCustomer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">delete</span>(mCustomer);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCustomer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCustomer mCustomer) {
        doDelete(mCustomer, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCustomer);
     * </pre>
     * @param mCustomer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCustomer mCustomer) {
        doDeleteNonstrict(mCustomer, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCustomer);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCustomer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCustomer mCustomer) {
        doDeleteNonstrictIgnoreDeleted(mCustomer, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCustomer et, final DeleteOption<MCustomerCB> op) {
        assertObjectNotNull("mCustomer", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     *     mCustomer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCustomer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCustomerList.add(mCustomer);
     * }
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCustomerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCustomer> mCustomerList) {
        return doBatchInsert(mCustomerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     *     mCustomer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCustomer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCustomer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCustomer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCustomerList.add(mCustomer);
     * }
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCustomerList);
     * </pre>
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCustomer> mCustomerList) {
        return doBatchUpdate(mCustomerList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCustomerBhv.<span style="color: #CC4747">batchUpdate</span>(mCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCustomer> mCustomerList, SpecifyQuery<MCustomerCB> colCBLambda) {
        return doBatchUpdate(mCustomerList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     *     mCustomer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCustomer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCustomer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCustomer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCustomerList.add(mCustomer);
     * }
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCustomerList);
     * </pre>
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCustomer> mCustomerList) {
        return doBatchUpdateNonstrict(mCustomerList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCustomerList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCustomer> mCustomerList, SpecifyQuery<MCustomerCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCustomerList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCustomer> mCustomerList) {
        return doBatchDelete(mCustomerList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCustomer> mCustomerList) {
        return doBatchDeleteNonstrict(mCustomerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCustomer, MCustomerCB&gt;() {
     *     public ConditionBean setup(MCustomer entity, MCustomerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCustomer, MCustomerCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCustomer.setPK...(value);</span>
     * mCustomer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCustomer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCustomer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCustomer.setVersionNo(value);</span>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCustomer, cb);
     * </pre>
     * @param mCustomer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCustomer mCustomer, MCustomerCB cb) {
        return doQueryUpdate(mCustomer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCustomerCB cb = new MCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCustomer, cb);
     * </pre>
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCustomerCB cb) {
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
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCustomer.setFoo...(value);
     * mCustomer.setBar...(value);
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCustomer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCustomer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCustomer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCustomer mCustomer, WritableOptionCall<MCustomerCB, InsertOption<MCustomerCB>> opLambda) {
        doInsert(mCustomer, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCustomer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCustomer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCustomer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCustomer The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCustomer mCustomer, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> opLambda) {
        doUpdate(mCustomer, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * mCustomer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCustomer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCustomer.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCustomer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCustomer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCustomer mCustomer, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> opLambda) {
        doUpdateNonstrict(mCustomer, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCustomer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCustomer mCustomer, WritableOptionCall<MCustomerCB, InsertOption<MCustomerCB>> insertOpLambda, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> updateOpLambda) {
        doInsertOrUpdate(mCustomer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCustomer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCustomer mCustomer, WritableOptionCall<MCustomerCB, InsertOption<MCustomerCB>> insertOpLambda, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCustomer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCustomer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCustomer mCustomer, WritableOptionCall<MCustomerCB, DeleteOption<MCustomerCB>> opLambda) {
        doDelete(mCustomer, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCustomer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCustomer mCustomer, WritableOptionCall<MCustomerCB, DeleteOption<MCustomerCB>> opLambda) {
        doDeleteNonstrict(mCustomer, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCustomer> mCustomerList, WritableOptionCall<MCustomerCB, InsertOption<MCustomerCB>> opLambda) {
        return doBatchInsert(mCustomerList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCustomer> mCustomerList, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> opLambda) {
        return doBatchUpdate(mCustomerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCustomer> mCustomerList, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> opLambda) {
        return doBatchUpdateNonstrict(mCustomerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCustomer> mCustomerList, WritableOptionCall<MCustomerCB, DeleteOption<MCustomerCB>> opLambda) {
        return doBatchDelete(mCustomerList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCustomerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCustomer> mCustomerList, WritableOptionCall<MCustomerCB, DeleteOption<MCustomerCB>> opLambda) {
        return doBatchDeleteNonstrict(mCustomerList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCustomer, MCustomerCB> manyArgLambda, WritableOptionCall<MCustomerCB, InsertOption<MCustomerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCustomer mCustomer = <span style="color: #70226C">new</span> MCustomer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCustomer.setPK...(value);</span>
     * mCustomer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCustomer.setVersionNo(value);</span>
     * MCustomerCB cb = <span style="color: #70226C">new</span> MCustomerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCustomer, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCustomer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCustomer mCustomer, MCustomerCB cb, WritableOptionCall<MCustomerCB, UpdateOption<MCustomerCB>> opLambda) {
        return doQueryUpdate(mCustomer, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCustomer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCustomerCB cb, WritableOptionCall<MCustomerCB, DeleteOption<MCustomerCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCustomerBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCustomerBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCustomerBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCustomerBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCustomerBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCustomerBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCustomerBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCustomerBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCustomerBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCustomerBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCustomerBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCustomerBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCustomerBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCustomerBhv.outideSql().removeBlockComment().selectList()
     * mCustomerBhv.outideSql().removeLineComment().selectList()
     * mCustomerBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCustomerBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCustomerBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCustomer> typeOfSelectedEntity() { return MCustomer.class; }
    protected Class<MCustomer> typeOfHandlingEntity() { return MCustomer.class; }
    protected Class<MCustomerCB> typeOfHandlingConditionBean() { return MCustomerCB.class; }
}
