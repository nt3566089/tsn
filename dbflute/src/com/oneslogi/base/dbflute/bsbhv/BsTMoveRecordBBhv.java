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
 * The behavior of T_MOVE_RECORD_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, MOVE_INST_B_ID, PROCESS_NO, LOCATION_ID, MOVE_DT, MOVE_NUM, STORE_NO_MERGE_FLG, ALL_SHIPPING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_MOVE_INST_B, T_MOVE_INST_H, M_LOCATION, B_CLASS_DTL(ByAllShippingFlg)
 *
 * [referrer table]
 *     T_STOCK_INOUT
 *
 * [foreign property]
 *     tMoveInstB, tMoveInstH, mLocation, bClassDtlByAllShippingFlg, bClassDtlByStoreNoMergeFlg
 *
 * [referrer property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTMoveRecordBBhv extends AbstractBehaviorWritable<TMoveRecordB, TMoveRecordBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TMoveRecordBDbm asDBMeta() { return TMoveRecordBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_MOVE_RECORD_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TMoveRecordBDbm getMyDBMeta() { return TMoveRecordBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TMoveRecordBCB newConditionBean() { return new TMoveRecordBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TMoveRecordB newMyEntity() { return new TMoveRecordB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TMoveRecordBCB newMyConditionBean() { return new TMoveRecordBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TMoveRecordBCB cb) {
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
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().setFoo...(value);
     * TMoveRecordB tMoveRecordB = <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tMoveRecordB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tMoveRecordB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveRecordB selectEntity(TMoveRecordBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TMoveRecordB facadeSelectEntity(TMoveRecordBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveRecordB> OptionalEntity<ENTITY> doSelectOptionalEntity(TMoveRecordBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().set...;
     * TMoveRecordB tMoveRecordB = <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tMoveRecordB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveRecordB selectEntityWithDeletedCheck(TMoveRecordBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param moveRecordBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveRecordB selectByPKValue(Long moveRecordBId) {
        return facadeSelectByPKValue(moveRecordBId);
    }

    protected TMoveRecordB facadeSelectByPKValue(Long moveRecordBId) {
        return doSelectByPK(moveRecordBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveRecordB> ENTITY doSelectByPK(Long moveRecordBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(moveRecordBId), tp);
    }

    protected <ENTITY extends TMoveRecordB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long moveRecordBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(moveRecordBId, tp), moveRecordBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param moveRecordBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveRecordB selectByPKValueWithDeletedCheck(Long moveRecordBId) {
        return doSelectByPKWithDeletedCheck(moveRecordBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveRecordB> ENTITY doSelectByPKWithDeletedCheck(Long moveRecordBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(moveRecordBId), tp);
    }

    protected TMoveRecordBCB xprepareCBAsPK(Long moveRecordBId) {
        assertObjectNotNull("moveRecordBId", moveRecordBId);
        return newConditionBean().acceptPK(moveRecordBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TMoveRecordB&gt; <span style="color: #553000">tMoveRecordBList</span> = <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TMoveRecordB tMoveRecordB : <span style="color: #553000">tMoveRecordBList</span>) {
     *     ... = tMoveRecordB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TMoveRecordB> selectList(TMoveRecordBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TMoveRecordB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TMoveRecordB tMoveRecordB : <span style="color: #553000">page</span>) {
     *     ... = tMoveRecordB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TMoveRecordB> selectPage(TMoveRecordBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @param entityRowHandler The handler of entity row of TMoveRecordB. (NotNull)
     */
    public void selectCursor(TMoveRecordBCB cb, EntityRowHandler<TMoveRecordB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TMoveRecordBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TMoveRecordBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tMoveRecordBList The entity list of TMoveRecordB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TMoveRecordB> tMoveRecordBList, ReferrerLoaderHandler<LoaderOfTMoveRecordB> loaderLambda) {
        xassLRArg(tMoveRecordBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTMoveRecordB().ready(tMoveRecordBList, _behaviorSelector));
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
     * @param tMoveRecordB The entity of TMoveRecordB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TMoveRecordB tMoveRecordB, ReferrerLoaderHandler<LoaderOfTMoveRecordB> loaderLambda) {
        xassLRArg(tMoveRecordB, loaderLambda);
        loaderLambda.handle(new LoaderOfTMoveRecordB().ready(xnewLRAryLs(tMoveRecordB), _behaviorSelector));
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">tMoveRecordBList</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TMoveRecordB tMoveRecordB : <span style="color: #553000">tMoveRecordBList</span>) {
     *     ... = tMoveRecordB.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveRecordBId_InScope(pkList);
     * cb.query().addOrderBy_MoveRecordBId_Asc();
     * </pre>
     * @param tMoveRecordBList The entity list of TMoveRecordB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<TMoveRecordB> tMoveRecordBList, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(tMoveRecordBList, refCBLambda);
        return doLoadTStockInoutList(tMoveRecordBList, new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">tMoveRecordB</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tMoveRecordB</span>.<span style="color: #CC4747">getTStockInoutList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveRecordBId_InScope(pkList);
     * cb.query().addOrderBy_MoveRecordBId_Asc();
     * </pre>
     * @param tMoveRecordB The entity of TMoveRecordB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(TMoveRecordB tMoveRecordB, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(tMoveRecordB, refCBLambda);
        return doLoadTStockInoutList(xnewLRLs(tMoveRecordB), new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tMoveRecordB The entity of TMoveRecordB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(TMoveRecordB tMoveRecordB, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(tMoveRecordB, loadReferrerOption);
        return loadTStockInoutList(xnewLRLs(tMoveRecordB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tMoveRecordBList The entity list of TMoveRecordB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<TMoveRecordB> tMoveRecordBList, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(tMoveRecordBList, loadReferrerOption);
        if (tMoveRecordBList.isEmpty()) { return (NestedReferrerListGateway<TStockInout>)EMPTY_NREF_LGWAY; }
        return doLoadTStockInoutList(tMoveRecordBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStockInout> doLoadTStockInoutList(List<TMoveRecordB> tMoveRecordBList, LoadReferrerOption<TStockInoutCB, TStockInout> option) {
        return helpLoadReferrerInternally(tMoveRecordBList, option, "tStockInoutList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TMoveInstB'.
     * @param tMoveRecordBList The list of tMoveRecordB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TMoveInstB> pulloutTMoveInstB(List<TMoveRecordB> tMoveRecordBList)
    { return helpPulloutInternally(tMoveRecordBList, "tMoveInstB"); }

    /**
     * Pull out the list of foreign table 'TMoveInstH'.
     * @param tMoveRecordBList The list of tMoveRecordB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TMoveInstH> pulloutTMoveInstH(List<TMoveRecordB> tMoveRecordBList)
    { return helpPulloutInternally(tMoveRecordBList, "tMoveInstH"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tMoveRecordBList The list of tMoveRecordB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TMoveRecordB> tMoveRecordBList)
    { return helpPulloutInternally(tMoveRecordBList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tMoveRecordBList The list of tMoveRecordB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAllShippingFlg(List<TMoveRecordB> tMoveRecordBList)
    { return helpPulloutInternally(tMoveRecordBList, "bClassDtlByAllShippingFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tMoveRecordBList The list of tMoveRecordB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStoreNoMergeFlg(List<TMoveRecordB> tMoveRecordBList)
    { return helpPulloutInternally(tMoveRecordBList, "bClassDtlByStoreNoMergeFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key moveRecordBId.
     * @param tMoveRecordBList The list of tMoveRecordB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMoveRecordBIdList(List<TMoveRecordB> tMoveRecordBList)
    { return helpExtractListInternally(tMoveRecordBList, "moveRecordBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tMoveRecordB.setFoo...(value);
     * tMoveRecordB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.set...;</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">insert</span>(tMoveRecordB);
     * ... = tMoveRecordB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tMoveRecordB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TMoveRecordB tMoveRecordB) {
        doInsert(tMoveRecordB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveRecordB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveRecordB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">update</span>(tMoveRecordB);
     * </pre>
     * @param tMoveRecordB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TMoveRecordB tMoveRecordB) {
        doUpdate(tMoveRecordB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveRecordB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tMoveRecordB);
     * </pre>
     * @param tMoveRecordB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TMoveRecordB tMoveRecordB) {
        doUpdateNonstrict(tMoveRecordB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tMoveRecordB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TMoveRecordB tMoveRecordB) {
        doInsertOrUpdate(tMoveRecordB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tMoveRecordB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TMoveRecordB tMoveRecordB) {
        doInsertOrUpdateNonstrict(tMoveRecordB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveRecordB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">delete</span>(tMoveRecordB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tMoveRecordB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TMoveRecordB tMoveRecordB) {
        doDelete(tMoveRecordB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tMoveRecordB);
     * </pre>
     * @param tMoveRecordB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TMoveRecordB tMoveRecordB) {
        doDeleteNonstrict(tMoveRecordB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tMoveRecordB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tMoveRecordB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TMoveRecordB tMoveRecordB) {
        doDeleteNonstrictIgnoreDeleted(tMoveRecordB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TMoveRecordB et, final DeleteOption<TMoveRecordBCB> op) {
        assertObjectNotNull("tMoveRecordB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     *     tMoveRecordB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveRecordB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tMoveRecordBList.add(tMoveRecordB);
     * }
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tMoveRecordBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TMoveRecordB> tMoveRecordBList) {
        return doBatchInsert(tMoveRecordBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     *     tMoveRecordB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveRecordB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tMoveRecordB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tMoveRecordB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tMoveRecordBList.add(tMoveRecordB);
     * }
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveRecordBList);
     * </pre>
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TMoveRecordB> tMoveRecordBList) {
        return doBatchUpdate(tMoveRecordBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tMoveRecordBBhv.<span style="color: #CC4747">batchUpdate</span>(tMoveRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TMoveRecordB> tMoveRecordBList, SpecifyQuery<TMoveRecordBCB> colCBLambda) {
        return doBatchUpdate(tMoveRecordBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     *     tMoveRecordB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveRecordB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tMoveRecordB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tMoveRecordB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tMoveRecordBList.add(tMoveRecordB);
     * }
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveRecordBList);
     * </pre>
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TMoveRecordB> tMoveRecordBList) {
        return doBatchUpdateNonstrict(tMoveRecordBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tMoveRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tMoveRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TMoveRecordB> tMoveRecordBList, SpecifyQuery<TMoveRecordBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tMoveRecordBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TMoveRecordB> tMoveRecordBList) {
        return doBatchDelete(tMoveRecordBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TMoveRecordB> tMoveRecordBList) {
        return doBatchDeleteNonstrict(tMoveRecordBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TMoveRecordB, TMoveRecordBCB&gt;() {
     *     public ConditionBean setup(TMoveRecordB entity, TMoveRecordBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TMoveRecordB, TMoveRecordBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setPK...(value);</span>
     * tMoveRecordB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setVersionNo(value);</span>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tMoveRecordB, cb);
     * </pre>
     * @param tMoveRecordB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TMoveRecordB tMoveRecordB, TMoveRecordBCB cb) {
        return doQueryUpdate(tMoveRecordB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TMoveRecordBCB cb = new TMoveRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tMoveRecordB, cb);
     * </pre>
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TMoveRecordBCB cb) {
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
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tMoveRecordB.setFoo...(value);
     * tMoveRecordB.setBar...(value);
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tMoveRecordB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tMoveRecordB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tMoveRecordB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, InsertOption<TMoveRecordBCB>> opLambda) {
        doInsert(tMoveRecordB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveRecordB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveRecordB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tMoveRecordB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveRecordB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> opLambda) {
        doUpdate(tMoveRecordB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * tMoveRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveRecordB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tMoveRecordB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveRecordB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> opLambda) {
        doUpdateNonstrict(tMoveRecordB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tMoveRecordB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, InsertOption<TMoveRecordBCB>> insertOpLambda, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> updateOpLambda) {
        doInsertOrUpdate(tMoveRecordB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tMoveRecordB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, InsertOption<TMoveRecordBCB>> insertOpLambda, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tMoveRecordB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tMoveRecordB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, DeleteOption<TMoveRecordBCB>> opLambda) {
        doDelete(tMoveRecordB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tMoveRecordB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TMoveRecordB tMoveRecordB, WritableOptionCall<TMoveRecordBCB, DeleteOption<TMoveRecordBCB>> opLambda) {
        doDeleteNonstrict(tMoveRecordB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TMoveRecordB> tMoveRecordBList, WritableOptionCall<TMoveRecordBCB, InsertOption<TMoveRecordBCB>> opLambda) {
        return doBatchInsert(tMoveRecordBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TMoveRecordB> tMoveRecordBList, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> opLambda) {
        return doBatchUpdate(tMoveRecordBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TMoveRecordB> tMoveRecordBList, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> opLambda) {
        return doBatchUpdateNonstrict(tMoveRecordBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TMoveRecordB> tMoveRecordBList, WritableOptionCall<TMoveRecordBCB, DeleteOption<TMoveRecordBCB>> opLambda) {
        return doBatchDelete(tMoveRecordBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tMoveRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TMoveRecordB> tMoveRecordBList, WritableOptionCall<TMoveRecordBCB, DeleteOption<TMoveRecordBCB>> opLambda) {
        return doBatchDeleteNonstrict(tMoveRecordBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TMoveRecordB, TMoveRecordBCB> manyArgLambda, WritableOptionCall<TMoveRecordBCB, InsertOption<TMoveRecordBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TMoveRecordB tMoveRecordB = <span style="color: #70226C">new</span> TMoveRecordB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setPK...(value);</span>
     * tMoveRecordB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveRecordB.setVersionNo(value);</span>
     * TMoveRecordBCB cb = <span style="color: #70226C">new</span> TMoveRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveRecordBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tMoveRecordB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveRecordB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TMoveRecordB tMoveRecordB, TMoveRecordBCB cb, WritableOptionCall<TMoveRecordBCB, UpdateOption<TMoveRecordBCB>> opLambda) {
        return doQueryUpdate(tMoveRecordB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TMoveRecordB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TMoveRecordBCB cb, WritableOptionCall<TMoveRecordBCB, DeleteOption<TMoveRecordBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tMoveRecordBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tMoveRecordBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tMoveRecordBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tMoveRecordBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tMoveRecordBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tMoveRecordBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tMoveRecordBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tMoveRecordBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tMoveRecordBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tMoveRecordBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tMoveRecordBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tMoveRecordBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tMoveRecordBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tMoveRecordBBhv.outideSql().removeBlockComment().selectList()
     * tMoveRecordBBhv.outideSql().removeLineComment().selectList()
     * tMoveRecordBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TMoveRecordBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TMoveRecordBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TMoveRecordB> typeOfSelectedEntity() { return TMoveRecordB.class; }
    protected Class<TMoveRecordB> typeOfHandlingEntity() { return TMoveRecordB.class; }
    protected Class<TMoveRecordBCB> typeOfHandlingConditionBean() { return TMoveRecordBCB.class; }
}
