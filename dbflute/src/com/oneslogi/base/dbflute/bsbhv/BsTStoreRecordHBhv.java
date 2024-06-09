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
 * The behavior of T_STORE_RECORD_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, CLIENT_RECEIVE_NO, SUPPLIER_ID, DEPOSIT_ID, STORE_RECORD_H_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_CUSTOMER, M_PROCESS_TYPE, T_RECEIVE_PLAN_H, M_STOCK_TYPE, T_STORE_RECORD_R(AsOne)
 *
 * [referrer table]
 *     T_STORE_RECORD_B, T_STORE_RECORD_R
 *
 * [foreign property]
 *     mCenter, mClient, mCustomerByDepositId, mProcessType, tReceivePlanH, mStockType, mCustomerBySupplierId, tStoreRecordRAsOne
 *
 * [referrer property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStoreRecordHBhv extends AbstractBehaviorWritable<TStoreRecordH, TStoreRecordHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TStoreRecordHDbm asDBMeta() { return TStoreRecordHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_STORE_RECORD_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TStoreRecordHDbm getMyDBMeta() { return TStoreRecordHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TStoreRecordHCB newConditionBean() { return new TStoreRecordHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TStoreRecordH newMyEntity() { return new TStoreRecordH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TStoreRecordHCB newMyConditionBean() { return new TStoreRecordHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TStoreRecordHCB cb) {
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
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().setFoo...(value);
     * TStoreRecordH tStoreRecordH = <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tStoreRecordH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tStoreRecordH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordH selectEntity(TStoreRecordHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TStoreRecordH facadeSelectEntity(TStoreRecordHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreRecordH> OptionalEntity<ENTITY> doSelectOptionalEntity(TStoreRecordHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().set...;
     * TStoreRecordH tStoreRecordH = <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tStoreRecordH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordH selectEntityWithDeletedCheck(TStoreRecordHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param storeRecordHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordH selectByPKValue(Long storeRecordHId) {
        return facadeSelectByPKValue(storeRecordHId);
    }

    protected TStoreRecordH facadeSelectByPKValue(Long storeRecordHId) {
        return doSelectByPK(storeRecordHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreRecordH> ENTITY doSelectByPK(Long storeRecordHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(storeRecordHId), tp);
    }

    protected <ENTITY extends TStoreRecordH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long storeRecordHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(storeRecordHId, tp), storeRecordHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param storeRecordHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordH selectByPKValueWithDeletedCheck(Long storeRecordHId) {
        return doSelectByPKWithDeletedCheck(storeRecordHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreRecordH> ENTITY doSelectByPKWithDeletedCheck(Long storeRecordHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(storeRecordHId), tp);
    }

    protected TStoreRecordHCB xprepareCBAsPK(Long storeRecordHId) {
        assertObjectNotNull("storeRecordHId", storeRecordHId);
        return newConditionBean().acceptPK(storeRecordHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TStoreRecordH&gt; <span style="color: #553000">tStoreRecordHList</span> = <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TStoreRecordH tStoreRecordH : <span style="color: #553000">tStoreRecordHList</span>) {
     *     ... = tStoreRecordH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TStoreRecordH> selectList(TStoreRecordHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TStoreRecordH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TStoreRecordH tStoreRecordH : <span style="color: #553000">page</span>) {
     *     ... = tStoreRecordH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TStoreRecordH> selectPage(TStoreRecordHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @param entityRowHandler The handler of entity row of TStoreRecordH. (NotNull)
     */
    public void selectCursor(TStoreRecordHCB cb, EntityRowHandler<TStoreRecordH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStoreRecordHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStoreRecordHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tStoreRecordHList The entity list of TStoreRecordH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TStoreRecordH> tStoreRecordHList, ReferrerLoaderHandler<LoaderOfTStoreRecordH> loaderLambda) {
        xassLRArg(tStoreRecordHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTStoreRecordH().ready(tStoreRecordHList, _behaviorSelector));
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
     * @param tStoreRecordH The entity of TStoreRecordH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TStoreRecordH tStoreRecordH, ReferrerLoaderHandler<LoaderOfTStoreRecordH> loaderLambda) {
        xassLRArg(tStoreRecordH, loaderLambda);
        loaderLambda.handle(new LoaderOfTStoreRecordH().ready(xnewLRAryLs(tStoreRecordH), _behaviorSelector));
    }

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * T_STORE_RECORD_B by STORE_RECORD_H_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">tStoreRecordHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TStoreRecordH tStoreRecordH : <span style="color: #553000">tStoreRecordHList</span>) {
     *     ... = tStoreRecordH.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreRecordHId_InScope(pkList);
     * cb.query().addOrderBy_StoreRecordHId_Asc();
     * </pre>
     * @param tStoreRecordHList The entity list of TStoreRecordH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(List<TStoreRecordH> tStoreRecordHList, ConditionBeanSetupper<TStoreRecordBCB> refCBLambda) {
        xassLRArg(tStoreRecordHList, refCBLambda);
        return doLoadTStoreRecordBList(tStoreRecordHList, new LoadReferrerOption<TStoreRecordBCB, TStoreRecordB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * T_STORE_RECORD_B by STORE_RECORD_H_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">tStoreRecordH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tStoreRecordH</span>.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreRecordHId_InScope(pkList);
     * cb.query().addOrderBy_StoreRecordHId_Asc();
     * </pre>
     * @param tStoreRecordH The entity of TStoreRecordH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(TStoreRecordH tStoreRecordH, ConditionBeanSetupper<TStoreRecordBCB> refCBLambda) {
        xassLRArg(tStoreRecordH, refCBLambda);
        return doLoadTStoreRecordBList(xnewLRLs(tStoreRecordH), new LoadReferrerOption<TStoreRecordBCB, TStoreRecordB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tStoreRecordH The entity of TStoreRecordH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(TStoreRecordH tStoreRecordH, LoadReferrerOption<TStoreRecordBCB, TStoreRecordB> loadReferrerOption) {
        xassLRArg(tStoreRecordH, loadReferrerOption);
        return loadTStoreRecordBList(xnewLRLs(tStoreRecordH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tStoreRecordHList The entity list of TStoreRecordH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(List<TStoreRecordH> tStoreRecordHList, LoadReferrerOption<TStoreRecordBCB, TStoreRecordB> loadReferrerOption) {
        xassLRArg(tStoreRecordHList, loadReferrerOption);
        if (tStoreRecordHList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordB>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordBList(tStoreRecordHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordB> doLoadTStoreRecordBList(List<TStoreRecordH> tStoreRecordHList, LoadReferrerOption<TStoreRecordBCB, TStoreRecordB> option) {
        return helpLoadReferrerInternally(tStoreRecordHList, option, "tStoreRecordBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByDepositId(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "mCustomerByDepositId"); }

    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'TReceivePlanH'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanH> pulloutTReceivePlanH(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "tReceivePlanH"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerBySupplierId(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "mCustomerBySupplierId"); }

    /**
     * Pull out the list of referrer-as-one table 'TStoreRecordR'.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreRecordR> pulloutTStoreRecordRAsOne(List<TStoreRecordH> tStoreRecordHList)
    { return helpPulloutInternally(tStoreRecordHList, "tStoreRecordRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key storeRecordHId.
     * @param tStoreRecordHList The list of tStoreRecordH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStoreRecordHIdList(List<TStoreRecordH> tStoreRecordHList)
    { return helpExtractListInternally(tStoreRecordHList, "storeRecordHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStoreRecordH.setFoo...(value);
     * tStoreRecordH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.set...;</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">insert</span>(tStoreRecordH);
     * ... = tStoreRecordH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tStoreRecordH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TStoreRecordH tStoreRecordH) {
        doInsert(tStoreRecordH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreRecordH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">update</span>(tStoreRecordH);
     * </pre>
     * @param tStoreRecordH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TStoreRecordH tStoreRecordH) {
        doUpdate(tStoreRecordH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tStoreRecordH);
     * </pre>
     * @param tStoreRecordH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TStoreRecordH tStoreRecordH) {
        doUpdateNonstrict(tStoreRecordH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStoreRecordH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TStoreRecordH tStoreRecordH) {
        doInsertOrUpdate(tStoreRecordH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStoreRecordH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TStoreRecordH tStoreRecordH) {
        doInsertOrUpdateNonstrict(tStoreRecordH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreRecordH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">delete</span>(tStoreRecordH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tStoreRecordH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TStoreRecordH tStoreRecordH) {
        doDelete(tStoreRecordH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tStoreRecordH);
     * </pre>
     * @param tStoreRecordH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TStoreRecordH tStoreRecordH) {
        doDeleteNonstrict(tStoreRecordH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tStoreRecordH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tStoreRecordH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TStoreRecordH tStoreRecordH) {
        doDeleteNonstrictIgnoreDeleted(tStoreRecordH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TStoreRecordH et, final DeleteOption<TStoreRecordHCB> op) {
        assertObjectNotNull("tStoreRecordH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     *     tStoreRecordH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreRecordH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tStoreRecordHList.add(tStoreRecordH);
     * }
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tStoreRecordHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TStoreRecordH> tStoreRecordHList) {
        return doBatchInsert(tStoreRecordHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     *     tStoreRecordH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreRecordH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStoreRecordH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStoreRecordH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStoreRecordHList.add(tStoreRecordH);
     * }
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordHList);
     * </pre>
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStoreRecordH> tStoreRecordHList) {
        return doBatchUpdate(tStoreRecordHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tStoreRecordHBhv.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStoreRecordH> tStoreRecordHList, SpecifyQuery<TStoreRecordHCB> colCBLambda) {
        return doBatchUpdate(tStoreRecordHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     *     tStoreRecordH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreRecordH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStoreRecordH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStoreRecordH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStoreRecordHList.add(tStoreRecordH);
     * }
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordHList);
     * </pre>
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStoreRecordH> tStoreRecordHList) {
        return doBatchUpdateNonstrict(tStoreRecordHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStoreRecordHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStoreRecordHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStoreRecordH> tStoreRecordHList, SpecifyQuery<TStoreRecordHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tStoreRecordHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TStoreRecordH> tStoreRecordHList) {
        return doBatchDelete(tStoreRecordHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TStoreRecordH> tStoreRecordHList) {
        return doBatchDeleteNonstrict(tStoreRecordHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TStoreRecordH, TStoreRecordHCB&gt;() {
     *     public ConditionBean setup(TStoreRecordH entity, TStoreRecordHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TStoreRecordH, TStoreRecordHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setPK...(value);</span>
     * tStoreRecordH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setVersionNo(value);</span>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tStoreRecordH, cb);
     * </pre>
     * @param tStoreRecordH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TStoreRecordH tStoreRecordH, TStoreRecordHCB cb) {
        return doQueryUpdate(tStoreRecordH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TStoreRecordHCB cb = new TStoreRecordHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tStoreRecordH, cb);
     * </pre>
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TStoreRecordHCB cb) {
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
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStoreRecordH.setFoo...(value);
     * tStoreRecordH.setBar...(value);
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tStoreRecordH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tStoreRecordH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tStoreRecordH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, InsertOption<TStoreRecordHCB>> opLambda) {
        doInsert(tStoreRecordH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreRecordH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tStoreRecordH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreRecordH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> opLambda) {
        doUpdate(tStoreRecordH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * tStoreRecordH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tStoreRecordH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreRecordH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> opLambda) {
        doUpdateNonstrict(tStoreRecordH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tStoreRecordH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, InsertOption<TStoreRecordHCB>> insertOpLambda, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> updateOpLambda) {
        doInsertOrUpdate(tStoreRecordH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tStoreRecordH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, InsertOption<TStoreRecordHCB>> insertOpLambda, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tStoreRecordH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tStoreRecordH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, DeleteOption<TStoreRecordHCB>> opLambda) {
        doDelete(tStoreRecordH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tStoreRecordH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TStoreRecordH tStoreRecordH, WritableOptionCall<TStoreRecordHCB, DeleteOption<TStoreRecordHCB>> opLambda) {
        doDeleteNonstrict(tStoreRecordH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TStoreRecordH> tStoreRecordHList, WritableOptionCall<TStoreRecordHCB, InsertOption<TStoreRecordHCB>> opLambda) {
        return doBatchInsert(tStoreRecordHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TStoreRecordH> tStoreRecordHList, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> opLambda) {
        return doBatchUpdate(tStoreRecordHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TStoreRecordH> tStoreRecordHList, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> opLambda) {
        return doBatchUpdateNonstrict(tStoreRecordHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TStoreRecordH> tStoreRecordHList, WritableOptionCall<TStoreRecordHCB, DeleteOption<TStoreRecordHCB>> opLambda) {
        return doBatchDelete(tStoreRecordHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tStoreRecordHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TStoreRecordH> tStoreRecordHList, WritableOptionCall<TStoreRecordHCB, DeleteOption<TStoreRecordHCB>> opLambda) {
        return doBatchDeleteNonstrict(tStoreRecordHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TStoreRecordH, TStoreRecordHCB> manyArgLambda, WritableOptionCall<TStoreRecordHCB, InsertOption<TStoreRecordHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStoreRecordH tStoreRecordH = <span style="color: #70226C">new</span> TStoreRecordH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setPK...(value);</span>
     * tStoreRecordH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordH.setVersionNo(value);</span>
     * TStoreRecordHCB cb = <span style="color: #70226C">new</span> TStoreRecordHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreRecordHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tStoreRecordH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreRecordH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TStoreRecordH tStoreRecordH, TStoreRecordHCB cb, WritableOptionCall<TStoreRecordHCB, UpdateOption<TStoreRecordHCB>> opLambda) {
        return doQueryUpdate(tStoreRecordH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TStoreRecordH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TStoreRecordHCB cb, WritableOptionCall<TStoreRecordHCB, DeleteOption<TStoreRecordHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tStoreRecordHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tStoreRecordHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStoreRecordHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tStoreRecordHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStoreRecordHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tStoreRecordHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tStoreRecordHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tStoreRecordHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tStoreRecordHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tStoreRecordHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tStoreRecordHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tStoreRecordHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tStoreRecordHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tStoreRecordHBhv.outideSql().removeBlockComment().selectList()
     * tStoreRecordHBhv.outideSql().removeLineComment().selectList()
     * tStoreRecordHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TStoreRecordHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TStoreRecordHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TStoreRecordH> typeOfSelectedEntity() { return TStoreRecordH.class; }
    protected Class<TStoreRecordH> typeOfHandlingEntity() { return TStoreRecordH.class; }
    protected Class<TStoreRecordHCB> typeOfHandlingConditionBean() { return TStoreRecordHCB.class; }
}
