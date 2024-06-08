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
 * The behavior of T_RECEIVE_PLAN_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_H, M_CUSTOMER, M_CLIENT, M_STOCK_TYPE, M_CENTER, M_PROCESS_TYPE, T_PICKING_H, B_CLASS_DTL(ByCenterTransitFlg), T_RECEIVE_PLAN_R(AsOne), T_TRRCV(AsOne)
 *
 * [referrer table]
 *     T_RECEIVE_PLAN_B, T_RECEIVE_PLAN_H, T_STORE_RECORD_H, T_RECEIVE_PLAN_R, T_TRRCV
 *
 * [foreign property]
 *     tReceivePlanHSelf, mCustomerByPlanDepositId, mClient, mStockType, mCenter, mProcessType, mCustomerByPlanSupplierId, tPickingH, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne, tTrrcvAsOne
 *
 * [referrer property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReceivePlanHBhv extends AbstractBehaviorWritable<TReceivePlanH, TReceivePlanHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 入荷ステータス毎の進捗表示 */
    public static final String PATH_selectSqlReceiveStatusProgress = "selectSqlReceiveStatusProgress";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TReceivePlanHDbm asDBMeta() { return TReceivePlanHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_RECEIVE_PLAN_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TReceivePlanHDbm getMyDBMeta() { return TReceivePlanHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TReceivePlanHCB newConditionBean() { return new TReceivePlanHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TReceivePlanH newMyEntity() { return new TReceivePlanH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TReceivePlanHCB newMyConditionBean() { return new TReceivePlanHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TReceivePlanHCB cb) {
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
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().setFoo...(value);
     * TReceivePlanH tReceivePlanH = <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tReceivePlanH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tReceivePlanH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanH selectEntity(TReceivePlanHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TReceivePlanH facadeSelectEntity(TReceivePlanHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanH> OptionalEntity<ENTITY> doSelectOptionalEntity(TReceivePlanHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().set...;
     * TReceivePlanH tReceivePlanH = <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tReceivePlanH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanH selectEntityWithDeletedCheck(TReceivePlanHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param receivePlanHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanH selectByPKValue(Long receivePlanHId) {
        return facadeSelectByPKValue(receivePlanHId);
    }

    protected TReceivePlanH facadeSelectByPKValue(Long receivePlanHId) {
        return doSelectByPK(receivePlanHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanH> ENTITY doSelectByPK(Long receivePlanHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(receivePlanHId), tp);
    }

    protected <ENTITY extends TReceivePlanH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long receivePlanHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(receivePlanHId, tp), receivePlanHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param receivePlanHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanH selectByPKValueWithDeletedCheck(Long receivePlanHId) {
        return doSelectByPKWithDeletedCheck(receivePlanHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanH> ENTITY doSelectByPKWithDeletedCheck(Long receivePlanHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(receivePlanHId), tp);
    }

    protected TReceivePlanHCB xprepareCBAsPK(Long receivePlanHId) {
        assertObjectNotNull("receivePlanHId", receivePlanHId);
        return newConditionBean().acceptPK(receivePlanHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TReceivePlanH&gt; <span style="color: #553000">tReceivePlanHList</span> = <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TReceivePlanH> selectList(TReceivePlanHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TReceivePlanH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TReceivePlanH tReceivePlanH : <span style="color: #553000">page</span>) {
     *     ... = tReceivePlanH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TReceivePlanH> selectPage(TReceivePlanHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @param entityRowHandler The handler of entity row of TReceivePlanH. (NotNull)
     */
    public void selectCursor(TReceivePlanHCB cb, EntityRowHandler<TReceivePlanH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TReceivePlanHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TReceivePlanHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TReceivePlanH> tReceivePlanHList, ReferrerLoaderHandler<LoaderOfTReceivePlanH> loaderLambda) {
        xassLRArg(tReceivePlanHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTReceivePlanH().ready(tReceivePlanHList, _behaviorSelector));
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
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TReceivePlanH tReceivePlanH, ReferrerLoaderHandler<LoaderOfTReceivePlanH> loaderLambda) {
        xassLRArg(tReceivePlanH, loaderLambda);
        loaderLambda.handle(new LoaderOfTReceivePlanH().ready(xnewLRAryLs(tReceivePlanH), _behaviorSelector));
    }

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(List<TReceivePlanH> tReceivePlanHList, ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        xassLRArg(tReceivePlanHList, refCBLambda);
        return doLoadTReceivePlanBList(tReceivePlanHList, new LoadReferrerOption<TReceivePlanBCB, TReceivePlanB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">tReceivePlanH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(TReceivePlanH tReceivePlanH, ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        xassLRArg(tReceivePlanH, refCBLambda);
        return doLoadTReceivePlanBList(xnewLRLs(tReceivePlanH), new LoadReferrerOption<TReceivePlanBCB, TReceivePlanB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(TReceivePlanH tReceivePlanH, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> loadReferrerOption) {
        xassLRArg(tReceivePlanH, loadReferrerOption);
        return loadTReceivePlanBList(xnewLRLs(tReceivePlanH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(List<TReceivePlanH> tReceivePlanHList, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> loadReferrerOption) {
        xassLRArg(tReceivePlanHList, loadReferrerOption);
        if (tReceivePlanHList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanB>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanBList(tReceivePlanHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanB> doLoadTReceivePlanBList(List<TReceivePlanH> tReceivePlanHList, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> option) {
        return helpLoadReferrerInternally(tReceivePlanHList, option, "tReceivePlanBList");
    }

    /**
     * Load referrer of TReceivePlanHSelfList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">loadTReceivePlanHSelfList</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTReceivePlanHSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_OldReceivePlanHId_Asc();
     * </pre>
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHSelfList(List<TReceivePlanH> tReceivePlanHList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(tReceivePlanHList, refCBLambda);
        return doLoadTReceivePlanHSelfList(tReceivePlanHList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHSelfList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">loadTReceivePlanHSelfList</span>(<span style="color: #553000">tReceivePlanH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTReceivePlanHSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_OldReceivePlanHId_Asc();
     * </pre>
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHSelfList(TReceivePlanH tReceivePlanH, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(tReceivePlanH, refCBLambda);
        return doLoadTReceivePlanHSelfList(xnewLRLs(tReceivePlanH), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHSelfList(TReceivePlanH tReceivePlanH, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(tReceivePlanH, loadReferrerOption);
        return loadTReceivePlanHSelfList(xnewLRLs(tReceivePlanH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHSelfList(List<TReceivePlanH> tReceivePlanHList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(tReceivePlanHList, loadReferrerOption);
        if (tReceivePlanHList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHSelfList(tReceivePlanHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHSelfList(List<TReceivePlanH> tReceivePlanHList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(tReceivePlanHList, option, "tReceivePlanHSelfList");
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<TReceivePlanH> tReceivePlanHList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(tReceivePlanHList, refCBLambda);
        return doLoadTStoreRecordHList(tReceivePlanHList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">tReceivePlanH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tReceivePlanH</span>.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(TReceivePlanH tReceivePlanH, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(tReceivePlanH, refCBLambda);
        return doLoadTStoreRecordHList(xnewLRLs(tReceivePlanH), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tReceivePlanH The entity of TReceivePlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(TReceivePlanH tReceivePlanH, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(tReceivePlanH, loadReferrerOption);
        return loadTStoreRecordHList(xnewLRLs(tReceivePlanH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tReceivePlanHList The entity list of TReceivePlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<TReceivePlanH> tReceivePlanHList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(tReceivePlanHList, loadReferrerOption);
        if (tReceivePlanHList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHList(tReceivePlanHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHList(List<TReceivePlanH> tReceivePlanHList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(tReceivePlanHList, option, "tStoreRecordHList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TReceivePlanH'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanH> pulloutTReceivePlanHSelf(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "tReceivePlanHSelf"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByPlanDepositId(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "mCustomerByPlanDepositId"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByPlanSupplierId(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "mCustomerByPlanSupplierId"); }

    /**
     * Pull out the list of foreign table 'TPickingH'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPickingH> pulloutTPickingH(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "tPickingH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCenterTransitFlg(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "bClassDtlByCenterTransitFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByErrorFlg(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "bClassDtlByErrorFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInputType(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "bClassDtlByInputType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByReceiveDeliveryStatus(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "bClassDtlByReceiveDeliveryStatus"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByReceiveStatus(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "bClassDtlByReceiveStatus"); }

    /**
     * Pull out the list of referrer-as-one table 'TReceivePlanR'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanR> pulloutTReceivePlanRAsOne(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "tReceivePlanRAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'TTrrcv'.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TTrrcv> pulloutTTrrcvAsOne(List<TReceivePlanH> tReceivePlanHList)
    { return helpPulloutInternally(tReceivePlanHList, "tTrrcvAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key receivePlanHId.
     * @param tReceivePlanHList The list of tReceivePlanH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReceivePlanHIdList(List<TReceivePlanH> tReceivePlanHList)
    { return helpExtractListInternally(tReceivePlanHList, "receivePlanHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tReceivePlanH.setFoo...(value);
     * tReceivePlanH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.set...;</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">insert</span>(tReceivePlanH);
     * ... = tReceivePlanH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tReceivePlanH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TReceivePlanH tReceivePlanH) {
        doInsert(tReceivePlanH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">update</span>(tReceivePlanH);
     * </pre>
     * @param tReceivePlanH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TReceivePlanH tReceivePlanH) {
        doUpdate(tReceivePlanH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tReceivePlanH);
     * </pre>
     * @param tReceivePlanH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TReceivePlanH tReceivePlanH) {
        doUpdateNonstrict(tReceivePlanH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tReceivePlanH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TReceivePlanH tReceivePlanH) {
        doInsertOrUpdate(tReceivePlanH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tReceivePlanH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TReceivePlanH tReceivePlanH) {
        doInsertOrUpdateNonstrict(tReceivePlanH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">delete</span>(tReceivePlanH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tReceivePlanH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TReceivePlanH tReceivePlanH) {
        doDelete(tReceivePlanH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tReceivePlanH);
     * </pre>
     * @param tReceivePlanH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TReceivePlanH tReceivePlanH) {
        doDeleteNonstrict(tReceivePlanH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tReceivePlanH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tReceivePlanH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TReceivePlanH tReceivePlanH) {
        doDeleteNonstrictIgnoreDeleted(tReceivePlanH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TReceivePlanH et, final DeleteOption<TReceivePlanHCB> op) {
        assertObjectNotNull("tReceivePlanH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     *     tReceivePlanH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tReceivePlanHList.add(tReceivePlanH);
     * }
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tReceivePlanHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TReceivePlanH> tReceivePlanHList) {
        return doBatchInsert(tReceivePlanHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     *     tReceivePlanH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tReceivePlanH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tReceivePlanH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tReceivePlanHList.add(tReceivePlanH);
     * }
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanHList);
     * </pre>
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TReceivePlanH> tReceivePlanHList) {
        return doBatchUpdate(tReceivePlanHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tReceivePlanHBhv.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TReceivePlanH> tReceivePlanHList, SpecifyQuery<TReceivePlanHCB> colCBLambda) {
        return doBatchUpdate(tReceivePlanHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     *     tReceivePlanH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tReceivePlanH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tReceivePlanH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tReceivePlanHList.add(tReceivePlanH);
     * }
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanHList);
     * </pre>
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TReceivePlanH> tReceivePlanHList) {
        return doBatchUpdateNonstrict(tReceivePlanHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tReceivePlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tReceivePlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TReceivePlanH> tReceivePlanHList, SpecifyQuery<TReceivePlanHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tReceivePlanHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TReceivePlanH> tReceivePlanHList) {
        return doBatchDelete(tReceivePlanHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TReceivePlanH> tReceivePlanHList) {
        return doBatchDeleteNonstrict(tReceivePlanHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TReceivePlanH, TReceivePlanHCB&gt;() {
     *     public ConditionBean setup(TReceivePlanH entity, TReceivePlanHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TReceivePlanH, TReceivePlanHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setPK...(value);</span>
     * tReceivePlanH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setVersionNo(value);</span>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tReceivePlanH, cb);
     * </pre>
     * @param tReceivePlanH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TReceivePlanH tReceivePlanH, TReceivePlanHCB cb) {
        return doQueryUpdate(tReceivePlanH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TReceivePlanHCB cb = new TReceivePlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tReceivePlanH, cb);
     * </pre>
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TReceivePlanHCB cb) {
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
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tReceivePlanH.setFoo...(value);
     * tReceivePlanH.setBar...(value);
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tReceivePlanH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tReceivePlanH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tReceivePlanH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, InsertOption<TReceivePlanHCB>> opLambda) {
        doInsert(tReceivePlanH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tReceivePlanH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> opLambda) {
        doUpdate(tReceivePlanH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * tReceivePlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tReceivePlanH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> opLambda) {
        doUpdateNonstrict(tReceivePlanH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tReceivePlanH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, InsertOption<TReceivePlanHCB>> insertOpLambda, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> updateOpLambda) {
        doInsertOrUpdate(tReceivePlanH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tReceivePlanH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, InsertOption<TReceivePlanHCB>> insertOpLambda, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tReceivePlanH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tReceivePlanH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, DeleteOption<TReceivePlanHCB>> opLambda) {
        doDelete(tReceivePlanH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tReceivePlanH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TReceivePlanH tReceivePlanH, WritableOptionCall<TReceivePlanHCB, DeleteOption<TReceivePlanHCB>> opLambda) {
        doDeleteNonstrict(tReceivePlanH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TReceivePlanH> tReceivePlanHList, WritableOptionCall<TReceivePlanHCB, InsertOption<TReceivePlanHCB>> opLambda) {
        return doBatchInsert(tReceivePlanHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TReceivePlanH> tReceivePlanHList, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> opLambda) {
        return doBatchUpdate(tReceivePlanHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TReceivePlanH> tReceivePlanHList, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> opLambda) {
        return doBatchUpdateNonstrict(tReceivePlanHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TReceivePlanH> tReceivePlanHList, WritableOptionCall<TReceivePlanHCB, DeleteOption<TReceivePlanHCB>> opLambda) {
        return doBatchDelete(tReceivePlanHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tReceivePlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TReceivePlanH> tReceivePlanHList, WritableOptionCall<TReceivePlanHCB, DeleteOption<TReceivePlanHCB>> opLambda) {
        return doBatchDeleteNonstrict(tReceivePlanHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TReceivePlanH, TReceivePlanHCB> manyArgLambda, WritableOptionCall<TReceivePlanHCB, InsertOption<TReceivePlanHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TReceivePlanH tReceivePlanH = <span style="color: #70226C">new</span> TReceivePlanH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setPK...(value);</span>
     * tReceivePlanH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanH.setVersionNo(value);</span>
     * TReceivePlanHCB cb = <span style="color: #70226C">new</span> TReceivePlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tReceivePlanH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TReceivePlanH tReceivePlanH, TReceivePlanHCB cb, WritableOptionCall<TReceivePlanHCB, UpdateOption<TReceivePlanHCB>> opLambda) {
        return doQueryUpdate(tReceivePlanH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TReceivePlanH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TReceivePlanHCB cb, WritableOptionCall<TReceivePlanHCB, DeleteOption<TReceivePlanHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tReceivePlanHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tReceivePlanHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tReceivePlanHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tReceivePlanHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tReceivePlanHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tReceivePlanHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tReceivePlanHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tReceivePlanHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tReceivePlanHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tReceivePlanHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tReceivePlanHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tReceivePlanHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tReceivePlanHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tReceivePlanHBhv.outideSql().removeBlockComment().selectList()
     * tReceivePlanHBhv.outideSql().removeLineComment().selectList()
     * tReceivePlanHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TReceivePlanHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TReceivePlanHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TReceivePlanH> typeOfSelectedEntity() { return TReceivePlanH.class; }
    protected Class<TReceivePlanH> typeOfHandlingEntity() { return TReceivePlanH.class; }
    protected Class<TReceivePlanHCB> typeOfHandlingConditionBean() { return TReceivePlanHCB.class; }
}
