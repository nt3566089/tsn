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
 * The behavior of T_RECEIVE_PLAN_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, LINE_NO, RECEIVE_STATUS, PLAN_CLIENT_ORDER_NO, PLAN_WAREHOUSE_ID, PLAN_WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_LOCATION_ID, PLAN_LOCATION_CD, PLAN_STORE_LABEL_NO, PLAN_NUM, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_LOCATION, M_WAREHOUSE, M_PRODUCT, T_RECEIVE_PLAN_H, B_CLASS_DTL(ByErrorFlg), T_RECEIVE_PLAN_SPARE(AsOne), T_TRRCVDETAIL(AsOne)
 *
 * [referrer table]
 *     T_STORE_RECORD_B, T_RECEIVE_PLAN_SPARE, T_TRRCVDETAIL
 *
 * [foreign property]
 *     mLocation, mWarehouse, mProduct, tReceivePlanH, bClassDtlByErrorFlg, bClassDtlByReceiveStatus, tReceivePlanSpareAsOne, tTrrcvdetailAsOne
 *
 * [referrer property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReceivePlanBBhv extends AbstractBehaviorWritable<TReceivePlanB, TReceivePlanBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 入荷データの明細リスト検索。 */
    public static final String PATH_selectSqlReceiveDataList = "selectSqlReceiveDataList";
    /** 入荷予定マスタデータ取得 */
    public static final String PATH_selectSqlReceivePlanBulkMasterData = "selectSqlReceivePlanBulkMasterData";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TReceivePlanBDbm asDBMeta() { return TReceivePlanBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_RECEIVE_PLAN_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TReceivePlanBDbm getMyDBMeta() { return TReceivePlanBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TReceivePlanBCB newConditionBean() { return new TReceivePlanBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TReceivePlanB newMyEntity() { return new TReceivePlanB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TReceivePlanBCB newMyConditionBean() { return new TReceivePlanBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TReceivePlanBCB cb) {
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
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().setFoo...(value);
     * TReceivePlanB tReceivePlanB = <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tReceivePlanB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tReceivePlanB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanB selectEntity(TReceivePlanBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TReceivePlanB facadeSelectEntity(TReceivePlanBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanB> OptionalEntity<ENTITY> doSelectOptionalEntity(TReceivePlanBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().set...;
     * TReceivePlanB tReceivePlanB = <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tReceivePlanB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanB selectEntityWithDeletedCheck(TReceivePlanBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param receivePlanBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanB selectByPKValue(Long receivePlanBId) {
        return facadeSelectByPKValue(receivePlanBId);
    }

    protected TReceivePlanB facadeSelectByPKValue(Long receivePlanBId) {
        return doSelectByPK(receivePlanBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanB> ENTITY doSelectByPK(Long receivePlanBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(receivePlanBId), tp);
    }

    protected <ENTITY extends TReceivePlanB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long receivePlanBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(receivePlanBId, tp), receivePlanBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param receivePlanBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanB selectByPKValueWithDeletedCheck(Long receivePlanBId) {
        return doSelectByPKWithDeletedCheck(receivePlanBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanB> ENTITY doSelectByPKWithDeletedCheck(Long receivePlanBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(receivePlanBId), tp);
    }

    protected TReceivePlanBCB xprepareCBAsPK(Long receivePlanBId) {
        assertObjectNotNull("receivePlanBId", receivePlanBId);
        return newConditionBean().acceptPK(receivePlanBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TReceivePlanB&gt; <span style="color: #553000">tReceivePlanBList</span> = <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TReceivePlanB tReceivePlanB : <span style="color: #553000">tReceivePlanBList</span>) {
     *     ... = tReceivePlanB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TReceivePlanB> selectList(TReceivePlanBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TReceivePlanB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TReceivePlanB tReceivePlanB : <span style="color: #553000">page</span>) {
     *     ... = tReceivePlanB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TReceivePlanB> selectPage(TReceivePlanBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @param entityRowHandler The handler of entity row of TReceivePlanB. (NotNull)
     */
    public void selectCursor(TReceivePlanBCB cb, EntityRowHandler<TReceivePlanB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TReceivePlanBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TReceivePlanBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tReceivePlanBList The entity list of TReceivePlanB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TReceivePlanB> tReceivePlanBList, ReferrerLoaderHandler<LoaderOfTReceivePlanB> loaderLambda) {
        xassLRArg(tReceivePlanBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTReceivePlanB().ready(tReceivePlanBList, _behaviorSelector));
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
     * @param tReceivePlanB The entity of TReceivePlanB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TReceivePlanB tReceivePlanB, ReferrerLoaderHandler<LoaderOfTReceivePlanB> loaderLambda) {
        xassLRArg(tReceivePlanB, loaderLambda);
        loaderLambda.handle(new LoaderOfTReceivePlanB().ready(xnewLRAryLs(tReceivePlanB), _behaviorSelector));
    }

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * T_STORE_RECORD_B by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">tReceivePlanBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TReceivePlanB tReceivePlanB : <span style="color: #553000">tReceivePlanBList</span>) {
     *     ... = tReceivePlanB.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanBId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanBId_Asc();
     * </pre>
     * @param tReceivePlanBList The entity list of TReceivePlanB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(List<TReceivePlanB> tReceivePlanBList, ConditionBeanSetupper<TStoreRecordBCB> refCBLambda) {
        xassLRArg(tReceivePlanBList, refCBLambda);
        return doLoadTStoreRecordBList(tReceivePlanBList, new LoadReferrerOption<TStoreRecordBCB, TStoreRecordB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * T_STORE_RECORD_B by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">tReceivePlanB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tReceivePlanB</span>.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanBId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanBId_Asc();
     * </pre>
     * @param tReceivePlanB The entity of TReceivePlanB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(TReceivePlanB tReceivePlanB, ConditionBeanSetupper<TStoreRecordBCB> refCBLambda) {
        xassLRArg(tReceivePlanB, refCBLambda);
        return doLoadTStoreRecordBList(xnewLRLs(tReceivePlanB), new LoadReferrerOption<TStoreRecordBCB, TStoreRecordB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tReceivePlanB The entity of TReceivePlanB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(TReceivePlanB tReceivePlanB, LoadReferrerOption<TStoreRecordBCB, TStoreRecordB> loadReferrerOption) {
        xassLRArg(tReceivePlanB, loadReferrerOption);
        return loadTStoreRecordBList(xnewLRLs(tReceivePlanB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tReceivePlanBList The entity list of TReceivePlanB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordB> loadTStoreRecordBList(List<TReceivePlanB> tReceivePlanBList, LoadReferrerOption<TStoreRecordBCB, TStoreRecordB> loadReferrerOption) {
        xassLRArg(tReceivePlanBList, loadReferrerOption);
        if (tReceivePlanBList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordB>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordBList(tReceivePlanBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordB> doLoadTStoreRecordBList(List<TReceivePlanB> tReceivePlanBList, LoadReferrerOption<TStoreRecordBCB, TStoreRecordB> option) {
        return helpLoadReferrerInternally(tReceivePlanBList, option, "tStoreRecordBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'TReceivePlanH'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanH> pulloutTReceivePlanH(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "tReceivePlanH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByErrorFlg(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "bClassDtlByErrorFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByReceiveStatus(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "bClassDtlByReceiveStatus"); }

    /**
     * Pull out the list of referrer-as-one table 'TReceivePlanSpare'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanSpare> pulloutTReceivePlanSpareAsOne(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "tReceivePlanSpareAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'TTrrcvdetail'.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TTrrcvdetail> pulloutTTrrcvdetailAsOne(List<TReceivePlanB> tReceivePlanBList)
    { return helpPulloutInternally(tReceivePlanBList, "tTrrcvdetailAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key receivePlanBId.
     * @param tReceivePlanBList The list of tReceivePlanB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReceivePlanBIdList(List<TReceivePlanB> tReceivePlanBList)
    { return helpExtractListInternally(tReceivePlanBList, "receivePlanBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tReceivePlanB.setFoo...(value);
     * tReceivePlanB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.set...;</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">insert</span>(tReceivePlanB);
     * ... = tReceivePlanB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tReceivePlanB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TReceivePlanB tReceivePlanB) {
        doInsert(tReceivePlanB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">update</span>(tReceivePlanB);
     * </pre>
     * @param tReceivePlanB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TReceivePlanB tReceivePlanB) {
        doUpdate(tReceivePlanB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tReceivePlanB);
     * </pre>
     * @param tReceivePlanB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TReceivePlanB tReceivePlanB) {
        doUpdateNonstrict(tReceivePlanB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tReceivePlanB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TReceivePlanB tReceivePlanB) {
        doInsertOrUpdate(tReceivePlanB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tReceivePlanB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TReceivePlanB tReceivePlanB) {
        doInsertOrUpdateNonstrict(tReceivePlanB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">delete</span>(tReceivePlanB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tReceivePlanB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TReceivePlanB tReceivePlanB) {
        doDelete(tReceivePlanB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tReceivePlanB);
     * </pre>
     * @param tReceivePlanB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TReceivePlanB tReceivePlanB) {
        doDeleteNonstrict(tReceivePlanB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tReceivePlanB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tReceivePlanB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TReceivePlanB tReceivePlanB) {
        doDeleteNonstrictIgnoreDeleted(tReceivePlanB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TReceivePlanB et, final DeleteOption<TReceivePlanBCB> op) {
        assertObjectNotNull("tReceivePlanB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     *     tReceivePlanB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tReceivePlanBList.add(tReceivePlanB);
     * }
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tReceivePlanBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TReceivePlanB> tReceivePlanBList) {
        return doBatchInsert(tReceivePlanBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     *     tReceivePlanB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tReceivePlanB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tReceivePlanB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tReceivePlanBList.add(tReceivePlanB);
     * }
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanBList);
     * </pre>
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TReceivePlanB> tReceivePlanBList) {
        return doBatchUpdate(tReceivePlanBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tReceivePlanBBhv.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TReceivePlanB> tReceivePlanBList, SpecifyQuery<TReceivePlanBCB> colCBLambda) {
        return doBatchUpdate(tReceivePlanBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     *     tReceivePlanB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tReceivePlanB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tReceivePlanB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tReceivePlanBList.add(tReceivePlanB);
     * }
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanBList);
     * </pre>
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TReceivePlanB> tReceivePlanBList) {
        return doBatchUpdateNonstrict(tReceivePlanBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tReceivePlanBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tReceivePlanBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TReceivePlanB> tReceivePlanBList, SpecifyQuery<TReceivePlanBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tReceivePlanBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TReceivePlanB> tReceivePlanBList) {
        return doBatchDelete(tReceivePlanBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TReceivePlanB> tReceivePlanBList) {
        return doBatchDeleteNonstrict(tReceivePlanBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TReceivePlanB, TReceivePlanBCB&gt;() {
     *     public ConditionBean setup(TReceivePlanB entity, TReceivePlanBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TReceivePlanB, TReceivePlanBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setPK...(value);</span>
     * tReceivePlanB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setVersionNo(value);</span>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tReceivePlanB, cb);
     * </pre>
     * @param tReceivePlanB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TReceivePlanB tReceivePlanB, TReceivePlanBCB cb) {
        return doQueryUpdate(tReceivePlanB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TReceivePlanBCB cb = new TReceivePlanBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tReceivePlanB, cb);
     * </pre>
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TReceivePlanBCB cb) {
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
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tReceivePlanB.setFoo...(value);
     * tReceivePlanB.setBar...(value);
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tReceivePlanB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tReceivePlanB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tReceivePlanB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, InsertOption<TReceivePlanBCB>> opLambda) {
        doInsert(tReceivePlanB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tReceivePlanB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> opLambda) {
        doUpdate(tReceivePlanB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * tReceivePlanB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tReceivePlanB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> opLambda) {
        doUpdateNonstrict(tReceivePlanB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tReceivePlanB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, InsertOption<TReceivePlanBCB>> insertOpLambda, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> updateOpLambda) {
        doInsertOrUpdate(tReceivePlanB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tReceivePlanB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, InsertOption<TReceivePlanBCB>> insertOpLambda, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tReceivePlanB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tReceivePlanB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, DeleteOption<TReceivePlanBCB>> opLambda) {
        doDelete(tReceivePlanB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tReceivePlanB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TReceivePlanB tReceivePlanB, WritableOptionCall<TReceivePlanBCB, DeleteOption<TReceivePlanBCB>> opLambda) {
        doDeleteNonstrict(tReceivePlanB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TReceivePlanB> tReceivePlanBList, WritableOptionCall<TReceivePlanBCB, InsertOption<TReceivePlanBCB>> opLambda) {
        return doBatchInsert(tReceivePlanBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TReceivePlanB> tReceivePlanBList, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> opLambda) {
        return doBatchUpdate(tReceivePlanBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TReceivePlanB> tReceivePlanBList, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> opLambda) {
        return doBatchUpdateNonstrict(tReceivePlanBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TReceivePlanB> tReceivePlanBList, WritableOptionCall<TReceivePlanBCB, DeleteOption<TReceivePlanBCB>> opLambda) {
        return doBatchDelete(tReceivePlanBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tReceivePlanBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TReceivePlanB> tReceivePlanBList, WritableOptionCall<TReceivePlanBCB, DeleteOption<TReceivePlanBCB>> opLambda) {
        return doBatchDeleteNonstrict(tReceivePlanBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TReceivePlanB, TReceivePlanBCB> manyArgLambda, WritableOptionCall<TReceivePlanBCB, InsertOption<TReceivePlanBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TReceivePlanB tReceivePlanB = <span style="color: #70226C">new</span> TReceivePlanB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setPK...(value);</span>
     * tReceivePlanB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanB.setVersionNo(value);</span>
     * TReceivePlanBCB cb = <span style="color: #70226C">new</span> TReceivePlanBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tReceivePlanB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TReceivePlanB tReceivePlanB, TReceivePlanBCB cb, WritableOptionCall<TReceivePlanBCB, UpdateOption<TReceivePlanBCB>> opLambda) {
        return doQueryUpdate(tReceivePlanB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TReceivePlanB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TReceivePlanBCB cb, WritableOptionCall<TReceivePlanBCB, DeleteOption<TReceivePlanBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tReceivePlanBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tReceivePlanBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tReceivePlanBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tReceivePlanBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tReceivePlanBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tReceivePlanBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tReceivePlanBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tReceivePlanBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tReceivePlanBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tReceivePlanBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tReceivePlanBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tReceivePlanBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tReceivePlanBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tReceivePlanBBhv.outideSql().removeBlockComment().selectList()
     * tReceivePlanBBhv.outideSql().removeLineComment().selectList()
     * tReceivePlanBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TReceivePlanBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TReceivePlanBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TReceivePlanB> typeOfSelectedEntity() { return TReceivePlanB.class; }
    protected Class<TReceivePlanB> typeOfHandlingEntity() { return TReceivePlanB.class; }
    protected Class<TReceivePlanBCB> typeOfHandlingConditionBean() { return TReceivePlanBCB.class; }
}
