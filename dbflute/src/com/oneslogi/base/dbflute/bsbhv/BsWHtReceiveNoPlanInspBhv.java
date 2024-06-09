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
 * The behavior of W_HT_RECEIVE_NO_PLAN_INSP as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_RECEIVE_NO_PLAN_INSP_ID
 *
 * [column]
 *     HT_RECEIVE_NO_PLAN_INSP_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, DEPOSIT_ID, DEPOSIT_NM, PROCESS_TYPE_ID, PROCESS_TYPE_NM, STOCK_TYPE_ID, STOCK_TYPE_NM, CLIENT_RECEIVE_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, PIECE_QTY_RCV, RCV_LOC_ID, RCV_LOC_CD, RCV_LOC_NM, HT_WORK_NO, STORE_NO, LOT_ID, LOT, LIMIT_DT, LABEL_SELECT, WORK_START_DT, WORK_END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_RECEIVE_NO_PLAN_INSP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_CUSTOMER, T_LOT, M_PROCESS_TYPE, M_PRODUCT, M_LOCATION, M_STOCK_TYPE, M_WAREHOUSE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient, mCustomerByDepositId, tLot, mProcessType, mProduct, mLocation, mStockType, mCustomerBySupplierId, mWarehouse
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWHtReceiveNoPlanInspBhv extends AbstractBehaviorWritable<WHtReceiveNoPlanInsp, WHtReceiveNoPlanInspCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WHtReceiveNoPlanInspDbm asDBMeta() { return WHtReceiveNoPlanInspDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "W_HT_RECEIVE_NO_PLAN_INSP"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WHtReceiveNoPlanInspDbm getMyDBMeta() { return WHtReceiveNoPlanInspDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WHtReceiveNoPlanInspCB newConditionBean() { return new WHtReceiveNoPlanInspCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WHtReceiveNoPlanInsp newMyEntity() { return new WHtReceiveNoPlanInsp(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WHtReceiveNoPlanInspCB newMyConditionBean() { return new WHtReceiveNoPlanInspCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WHtReceiveNoPlanInspCB cb) {
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
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().setFoo...(value);
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wHtReceiveNoPlanInsp != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wHtReceiveNoPlanInsp.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtReceiveNoPlanInsp selectEntity(WHtReceiveNoPlanInspCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WHtReceiveNoPlanInsp facadeSelectEntity(WHtReceiveNoPlanInspCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtReceiveNoPlanInsp> OptionalEntity<ENTITY> doSelectOptionalEntity(WHtReceiveNoPlanInspCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().set...;
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wHtReceiveNoPlanInsp.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtReceiveNoPlanInsp selectEntityWithDeletedCheck(WHtReceiveNoPlanInspCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param htReceiveNoPlanInspId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtReceiveNoPlanInsp selectByPKValue(Long htReceiveNoPlanInspId) {
        return facadeSelectByPKValue(htReceiveNoPlanInspId);
    }

    protected WHtReceiveNoPlanInsp facadeSelectByPKValue(Long htReceiveNoPlanInspId) {
        return doSelectByPK(htReceiveNoPlanInspId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtReceiveNoPlanInsp> ENTITY doSelectByPK(Long htReceiveNoPlanInspId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(htReceiveNoPlanInspId), tp);
    }

    protected <ENTITY extends WHtReceiveNoPlanInsp> OptionalEntity<ENTITY> doSelectOptionalByPK(Long htReceiveNoPlanInspId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(htReceiveNoPlanInspId, tp), htReceiveNoPlanInspId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param htReceiveNoPlanInspId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtReceiveNoPlanInsp selectByPKValueWithDeletedCheck(Long htReceiveNoPlanInspId) {
        return doSelectByPKWithDeletedCheck(htReceiveNoPlanInspId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtReceiveNoPlanInsp> ENTITY doSelectByPKWithDeletedCheck(Long htReceiveNoPlanInspId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(htReceiveNoPlanInspId), tp);
    }

    protected WHtReceiveNoPlanInspCB xprepareCBAsPK(Long htReceiveNoPlanInspId) {
        assertObjectNotNull("htReceiveNoPlanInspId", htReceiveNoPlanInspId);
        return newConditionBean().acceptPK(htReceiveNoPlanInspId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WHtReceiveNoPlanInsp&gt; <span style="color: #553000">wHtReceiveNoPlanInspList</span> = <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp : <span style="color: #553000">wHtReceiveNoPlanInspList</span>) {
     *     ... = wHtReceiveNoPlanInsp.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WHtReceiveNoPlanInsp> selectList(WHtReceiveNoPlanInspCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WHtReceiveNoPlanInsp&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp : <span style="color: #553000">page</span>) {
     *     ... = wHtReceiveNoPlanInsp.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WHtReceiveNoPlanInsp> selectPage(WHtReceiveNoPlanInspCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().set...
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @param entityRowHandler The handler of entity row of WHtReceiveNoPlanInsp. (NotNull)
     */
    public void selectCursor(WHtReceiveNoPlanInspCB cb, EntityRowHandler<WHtReceiveNoPlanInsp> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WHtReceiveNoPlanInspCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WHtReceiveNoPlanInspCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wHtReceiveNoPlanInspList The entity list of WHtReceiveNoPlanInsp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, ReferrerLoaderHandler<LoaderOfWHtReceiveNoPlanInsp> loaderLambda) {
        xassLRArg(wHtReceiveNoPlanInspList, loaderLambda);
        loaderLambda.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(wHtReceiveNoPlanInspList, _behaviorSelector));
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
     * @param wHtReceiveNoPlanInsp The entity of WHtReceiveNoPlanInsp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, ReferrerLoaderHandler<LoaderOfWHtReceiveNoPlanInsp> loaderLambda) {
        xassLRArg(wHtReceiveNoPlanInsp, loaderLambda);
        loaderLambda.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(xnewLRAryLs(wHtReceiveNoPlanInsp), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByDepositId(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mCustomerByDepositId"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "tLot"); }

    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerBySupplierId(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mCustomerBySupplierId"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpPulloutInternally(wHtReceiveNoPlanInspList, "mWarehouse"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key htReceiveNoPlanInspId.
     * @param wHtReceiveNoPlanInspList The list of wHtReceiveNoPlanInsp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractHtReceiveNoPlanInspIdList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList)
    { return helpExtractListInternally(wHtReceiveNoPlanInspList, "htReceiveNoPlanInspId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wHtReceiveNoPlanInsp.setFoo...(value);
     * wHtReceiveNoPlanInsp.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.set...;</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">insert</span>(wHtReceiveNoPlanInsp);
     * ... = wHtReceiveNoPlanInsp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wHtReceiveNoPlanInsp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doInsert(wHtReceiveNoPlanInsp, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtReceiveNoPlanInsp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wHtReceiveNoPlanInsp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">update</span>(wHtReceiveNoPlanInsp);
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doUpdate(wHtReceiveNoPlanInsp, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtReceiveNoPlanInsp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wHtReceiveNoPlanInsp);
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doUpdateNonstrict(wHtReceiveNoPlanInsp, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wHtReceiveNoPlanInsp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doInsertOrUpdate(wHtReceiveNoPlanInsp, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wHtReceiveNoPlanInsp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doInsertOrUpdateNonstrict(wHtReceiveNoPlanInsp, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wHtReceiveNoPlanInsp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">delete</span>(wHtReceiveNoPlanInsp);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doDelete(wHtReceiveNoPlanInsp, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wHtReceiveNoPlanInsp);
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doDeleteNonstrict(wHtReceiveNoPlanInsp, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wHtReceiveNoPlanInsp);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp) {
        doDeleteNonstrictIgnoreDeleted(wHtReceiveNoPlanInsp, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WHtReceiveNoPlanInsp et, final DeleteOption<WHtReceiveNoPlanInspCB> op) {
        assertObjectNotNull("wHtReceiveNoPlanInsp", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     *     wHtReceiveNoPlanInsp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wHtReceiveNoPlanInsp.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wHtReceiveNoPlanInspList.add(wHtReceiveNoPlanInsp);
     * }
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">batchInsert</span>(wHtReceiveNoPlanInspList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        return doBatchInsert(wHtReceiveNoPlanInspList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     *     wHtReceiveNoPlanInsp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wHtReceiveNoPlanInsp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wHtReceiveNoPlanInsp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wHtReceiveNoPlanInspList.add(wHtReceiveNoPlanInsp);
     * }
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wHtReceiveNoPlanInspList);
     * </pre>
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        return doBatchUpdate(wHtReceiveNoPlanInspList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wHtReceiveNoPlanInspBhv.<span style="color: #CC4747">batchUpdate</span>(wHtReceiveNoPlanInspList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wHtReceiveNoPlanInspList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, SpecifyQuery<WHtReceiveNoPlanInspCB> colCBLambda) {
        return doBatchUpdate(wHtReceiveNoPlanInspList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     *     wHtReceiveNoPlanInsp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wHtReceiveNoPlanInsp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wHtReceiveNoPlanInsp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wHtReceiveNoPlanInspList.add(wHtReceiveNoPlanInsp);
     * }
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wHtReceiveNoPlanInspList);
     * </pre>
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        return doBatchUpdateNonstrict(wHtReceiveNoPlanInspList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wHtReceiveNoPlanInspList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wHtReceiveNoPlanInspList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, SpecifyQuery<WHtReceiveNoPlanInspCB> colCBLambda) {
        return doBatchUpdateNonstrict(wHtReceiveNoPlanInspList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        return doBatchDelete(wHtReceiveNoPlanInspList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        return doBatchDeleteNonstrict(wHtReceiveNoPlanInspList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WHtReceiveNoPlanInsp, WHtReceiveNoPlanInspCB&gt;() {
     *     public ConditionBean setup(WHtReceiveNoPlanInsp entity, WHtReceiveNoPlanInspCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WHtReceiveNoPlanInsp, WHtReceiveNoPlanInspCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setPK...(value);</span>
     * wHtReceiveNoPlanInsp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setVersionNo(value);</span>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wHtReceiveNoPlanInsp, cb);
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WHtReceiveNoPlanInspCB cb) {
        return doQueryUpdate(wHtReceiveNoPlanInsp, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">queryDelete</span>(wHtReceiveNoPlanInsp, cb);
     * </pre>
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WHtReceiveNoPlanInspCB cb) {
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
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wHtReceiveNoPlanInsp.setFoo...(value);
     * wHtReceiveNoPlanInsp.setBar...(value);
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wHtReceiveNoPlanInsp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wHtReceiveNoPlanInsp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, InsertOption<WHtReceiveNoPlanInspCB>> opLambda) {
        doInsert(wHtReceiveNoPlanInsp, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtReceiveNoPlanInsp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wHtReceiveNoPlanInsp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wHtReceiveNoPlanInsp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> opLambda) {
        doUpdate(wHtReceiveNoPlanInsp, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * wHtReceiveNoPlanInsp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtReceiveNoPlanInsp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wHtReceiveNoPlanInsp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> opLambda) {
        doUpdateNonstrict(wHtReceiveNoPlanInsp, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wHtReceiveNoPlanInsp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, InsertOption<WHtReceiveNoPlanInspCB>> insertOpLambda, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> updateOpLambda) {
        doInsertOrUpdate(wHtReceiveNoPlanInsp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wHtReceiveNoPlanInsp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, InsertOption<WHtReceiveNoPlanInspCB>> insertOpLambda, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wHtReceiveNoPlanInsp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wHtReceiveNoPlanInsp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, DeleteOption<WHtReceiveNoPlanInspCB>> opLambda) {
        doDelete(wHtReceiveNoPlanInsp, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wHtReceiveNoPlanInsp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WritableOptionCall<WHtReceiveNoPlanInspCB, DeleteOption<WHtReceiveNoPlanInspCB>> opLambda) {
        doDeleteNonstrict(wHtReceiveNoPlanInsp, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, WritableOptionCall<WHtReceiveNoPlanInspCB, InsertOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doBatchInsert(wHtReceiveNoPlanInspList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doBatchUpdate(wHtReceiveNoPlanInspList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doBatchUpdateNonstrict(wHtReceiveNoPlanInspList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, WritableOptionCall<WHtReceiveNoPlanInspCB, DeleteOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doBatchDelete(wHtReceiveNoPlanInspList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wHtReceiveNoPlanInspList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList, WritableOptionCall<WHtReceiveNoPlanInspCB, DeleteOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doBatchDeleteNonstrict(wHtReceiveNoPlanInspList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WHtReceiveNoPlanInsp, WHtReceiveNoPlanInspCB> manyArgLambda, WritableOptionCall<WHtReceiveNoPlanInspCB, InsertOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp = <span style="color: #70226C">new</span> WHtReceiveNoPlanInsp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setPK...(value);</span>
     * wHtReceiveNoPlanInsp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtReceiveNoPlanInsp.setVersionNo(value);</span>
     * WHtReceiveNoPlanInspCB cb = <span style="color: #70226C">new</span> WHtReceiveNoPlanInspCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wHtReceiveNoPlanInspBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wHtReceiveNoPlanInsp, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wHtReceiveNoPlanInsp The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WHtReceiveNoPlanInsp wHtReceiveNoPlanInsp, WHtReceiveNoPlanInspCB cb, WritableOptionCall<WHtReceiveNoPlanInspCB, UpdateOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doQueryUpdate(wHtReceiveNoPlanInsp, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WHtReceiveNoPlanInsp. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WHtReceiveNoPlanInspCB cb, WritableOptionCall<WHtReceiveNoPlanInspCB, DeleteOption<WHtReceiveNoPlanInspCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wHtReceiveNoPlanInspBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wHtReceiveNoPlanInspBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wHtReceiveNoPlanInspBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wHtReceiveNoPlanInspBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wHtReceiveNoPlanInspBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wHtReceiveNoPlanInspBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wHtReceiveNoPlanInspBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wHtReceiveNoPlanInspBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wHtReceiveNoPlanInspBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wHtReceiveNoPlanInspBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wHtReceiveNoPlanInspBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wHtReceiveNoPlanInspBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wHtReceiveNoPlanInspBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wHtReceiveNoPlanInspBhv.outideSql().removeBlockComment().selectList()
     * wHtReceiveNoPlanInspBhv.outideSql().removeLineComment().selectList()
     * wHtReceiveNoPlanInspBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WHtReceiveNoPlanInspBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WHtReceiveNoPlanInspBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WHtReceiveNoPlanInsp> typeOfSelectedEntity() { return WHtReceiveNoPlanInsp.class; }
    protected Class<WHtReceiveNoPlanInsp> typeOfHandlingEntity() { return WHtReceiveNoPlanInsp.class; }
    protected Class<WHtReceiveNoPlanInspCB> typeOfHandlingConditionBean() { return WHtReceiveNoPlanInspCB.class; }
}
