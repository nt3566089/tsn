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
 * The behavior of T_RECEIVE_PLAN_SPARE as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_RECEIVE_PLAN_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReceivePlanSpareBhv extends AbstractBehaviorWritable<TReceivePlanSpare, TReceivePlanSpareCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TReceivePlanSpareDbm asDBMeta() { return TReceivePlanSpareDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_RECEIVE_PLAN_SPARE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TReceivePlanSpareDbm getMyDBMeta() { return TReceivePlanSpareDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TReceivePlanSpareCB newConditionBean() { return new TReceivePlanSpareCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TReceivePlanSpare newMyEntity() { return new TReceivePlanSpare(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TReceivePlanSpareCB newMyConditionBean() { return new TReceivePlanSpareCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TReceivePlanSpareCB cb) {
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
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().setFoo...(value);
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tReceivePlanSpare != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tReceivePlanSpare.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanSpare selectEntity(TReceivePlanSpareCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TReceivePlanSpare facadeSelectEntity(TReceivePlanSpareCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanSpare> OptionalEntity<ENTITY> doSelectOptionalEntity(TReceivePlanSpareCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().set...;
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tReceivePlanSpare.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanSpare selectEntityWithDeletedCheck(TReceivePlanSpareCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param receivePlanBId : PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_B. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanSpare selectByPKValue(Long receivePlanBId) {
        return facadeSelectByPKValue(receivePlanBId);
    }

    protected TReceivePlanSpare facadeSelectByPKValue(Long receivePlanBId) {
        return doSelectByPK(receivePlanBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanSpare> ENTITY doSelectByPK(Long receivePlanBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(receivePlanBId), tp);
    }

    protected <ENTITY extends TReceivePlanSpare> OptionalEntity<ENTITY> doSelectOptionalByPK(Long receivePlanBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(receivePlanBId, tp), receivePlanBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param receivePlanBId : PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_B. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TReceivePlanSpare selectByPKValueWithDeletedCheck(Long receivePlanBId) {
        return doSelectByPKWithDeletedCheck(receivePlanBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TReceivePlanSpare> ENTITY doSelectByPKWithDeletedCheck(Long receivePlanBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(receivePlanBId), tp);
    }

    protected TReceivePlanSpareCB xprepareCBAsPK(Long receivePlanBId) {
        assertObjectNotNull("receivePlanBId", receivePlanBId);
        return newConditionBean().acceptPK(receivePlanBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TReceivePlanSpare&gt; <span style="color: #553000">tReceivePlanSpareList</span> = <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TReceivePlanSpare tReceivePlanSpare : <span style="color: #553000">tReceivePlanSpareList</span>) {
     *     ... = tReceivePlanSpare.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TReceivePlanSpare> selectList(TReceivePlanSpareCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TReceivePlanSpare&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TReceivePlanSpare tReceivePlanSpare : <span style="color: #553000">page</span>) {
     *     ... = tReceivePlanSpare.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TReceivePlanSpare> selectPage(TReceivePlanSpareCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().set...
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @param entityRowHandler The handler of entity row of TReceivePlanSpare. (NotNull)
     */
    public void selectCursor(TReceivePlanSpareCB cb, EntityRowHandler<TReceivePlanSpare> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TReceivePlanSpareCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TReceivePlanSpareCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tReceivePlanSpareList The entity list of TReceivePlanSpare. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TReceivePlanSpare> tReceivePlanSpareList, ReferrerLoaderHandler<LoaderOfTReceivePlanSpare> loaderLambda) {
        xassLRArg(tReceivePlanSpareList, loaderLambda);
        loaderLambda.handle(new LoaderOfTReceivePlanSpare().ready(tReceivePlanSpareList, _behaviorSelector));
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
     * @param tReceivePlanSpare The entity of TReceivePlanSpare. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TReceivePlanSpare tReceivePlanSpare, ReferrerLoaderHandler<LoaderOfTReceivePlanSpare> loaderLambda) {
        xassLRArg(tReceivePlanSpare, loaderLambda);
        loaderLambda.handle(new LoaderOfTReceivePlanSpare().ready(xnewLRAryLs(tReceivePlanSpare), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TReceivePlanB'.
     * @param tReceivePlanSpareList The list of tReceivePlanSpare. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanB> pulloutTReceivePlanB(List<TReceivePlanSpare> tReceivePlanSpareList)
    { return helpPulloutInternally(tReceivePlanSpareList, "tReceivePlanB"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key receivePlanBId.
     * @param tReceivePlanSpareList The list of tReceivePlanSpare. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReceivePlanBIdList(List<TReceivePlanSpare> tReceivePlanSpareList)
    { return helpExtractListInternally(tReceivePlanSpareList, "receivePlanBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tReceivePlanSpare.setFoo...(value);
     * tReceivePlanSpare.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.set...;</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">insert</span>(tReceivePlanSpare);
     * ... = tReceivePlanSpare.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tReceivePlanSpare The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TReceivePlanSpare tReceivePlanSpare) {
        doInsert(tReceivePlanSpare, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanSpare.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanSpare.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">update</span>(tReceivePlanSpare);
     * </pre>
     * @param tReceivePlanSpare The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TReceivePlanSpare tReceivePlanSpare) {
        doUpdate(tReceivePlanSpare, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanSpare.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tReceivePlanSpare);
     * </pre>
     * @param tReceivePlanSpare The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TReceivePlanSpare tReceivePlanSpare) {
        doUpdateNonstrict(tReceivePlanSpare, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tReceivePlanSpare The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TReceivePlanSpare tReceivePlanSpare) {
        doInsertOrUpdate(tReceivePlanSpare, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tReceivePlanSpare The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TReceivePlanSpare tReceivePlanSpare) {
        doInsertOrUpdateNonstrict(tReceivePlanSpare, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanSpare.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">delete</span>(tReceivePlanSpare);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tReceivePlanSpare The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TReceivePlanSpare tReceivePlanSpare) {
        doDelete(tReceivePlanSpare, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tReceivePlanSpare);
     * </pre>
     * @param tReceivePlanSpare The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TReceivePlanSpare tReceivePlanSpare) {
        doDeleteNonstrict(tReceivePlanSpare, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tReceivePlanSpare);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tReceivePlanSpare The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TReceivePlanSpare tReceivePlanSpare) {
        doDeleteNonstrictIgnoreDeleted(tReceivePlanSpare, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TReceivePlanSpare et, final DeleteOption<TReceivePlanSpareCB> op) {
        assertObjectNotNull("tReceivePlanSpare", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     *     tReceivePlanSpare.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanSpare.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tReceivePlanSpareList.add(tReceivePlanSpare);
     * }
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">batchInsert</span>(tReceivePlanSpareList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TReceivePlanSpare> tReceivePlanSpareList) {
        return doBatchInsert(tReceivePlanSpareList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     *     tReceivePlanSpare.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanSpare.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tReceivePlanSpare.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tReceivePlanSpare.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tReceivePlanSpareList.add(tReceivePlanSpare);
     * }
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanSpareList);
     * </pre>
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TReceivePlanSpare> tReceivePlanSpareList) {
        return doBatchUpdate(tReceivePlanSpareList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tReceivePlanSpareBhv.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanSpareList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanSpareList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TReceivePlanSpare> tReceivePlanSpareList, SpecifyQuery<TReceivePlanSpareCB> colCBLambda) {
        return doBatchUpdate(tReceivePlanSpareList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     *     tReceivePlanSpare.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tReceivePlanSpare.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tReceivePlanSpare.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tReceivePlanSpare.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tReceivePlanSpareList.add(tReceivePlanSpare);
     * }
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tReceivePlanSpareList);
     * </pre>
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TReceivePlanSpare> tReceivePlanSpareList) {
        return doBatchUpdateNonstrict(tReceivePlanSpareList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tReceivePlanSpareList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tReceivePlanSpareList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TReceivePlanSpare> tReceivePlanSpareList, SpecifyQuery<TReceivePlanSpareCB> colCBLambda) {
        return doBatchUpdateNonstrict(tReceivePlanSpareList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TReceivePlanSpare> tReceivePlanSpareList) {
        return doBatchDelete(tReceivePlanSpareList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TReceivePlanSpare> tReceivePlanSpareList) {
        return doBatchDeleteNonstrict(tReceivePlanSpareList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TReceivePlanSpare, TReceivePlanSpareCB&gt;() {
     *     public ConditionBean setup(TReceivePlanSpare entity, TReceivePlanSpareCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TReceivePlanSpare, TReceivePlanSpareCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setPK...(value);</span>
     * tReceivePlanSpare.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setVersionNo(value);</span>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tReceivePlanSpare, cb);
     * </pre>
     * @param tReceivePlanSpare The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TReceivePlanSpare tReceivePlanSpare, TReceivePlanSpareCB cb) {
        return doQueryUpdate(tReceivePlanSpare, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TReceivePlanSpareCB cb = new TReceivePlanSpareCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">queryDelete</span>(tReceivePlanSpare, cb);
     * </pre>
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TReceivePlanSpareCB cb) {
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
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tReceivePlanSpare.setFoo...(value);
     * tReceivePlanSpare.setBar...(value);
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tReceivePlanSpare, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tReceivePlanSpare.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tReceivePlanSpare The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, InsertOption<TReceivePlanSpareCB>> opLambda) {
        doInsert(tReceivePlanSpare, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanSpare.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tReceivePlanSpare.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tReceivePlanSpare, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanSpare The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> opLambda) {
        doUpdate(tReceivePlanSpare, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * tReceivePlanSpare.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tReceivePlanSpare.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setVersionNo(value);</span>
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tReceivePlanSpare, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanSpare The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> opLambda) {
        doUpdateNonstrict(tReceivePlanSpare, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tReceivePlanSpare The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, InsertOption<TReceivePlanSpareCB>> insertOpLambda, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> updateOpLambda) {
        doInsertOrUpdate(tReceivePlanSpare, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tReceivePlanSpare The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, InsertOption<TReceivePlanSpareCB>> insertOpLambda, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tReceivePlanSpare, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tReceivePlanSpare The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, DeleteOption<TReceivePlanSpareCB>> opLambda) {
        doDelete(tReceivePlanSpare, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tReceivePlanSpare The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TReceivePlanSpare tReceivePlanSpare, WritableOptionCall<TReceivePlanSpareCB, DeleteOption<TReceivePlanSpareCB>> opLambda) {
        doDeleteNonstrict(tReceivePlanSpare, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TReceivePlanSpare> tReceivePlanSpareList, WritableOptionCall<TReceivePlanSpareCB, InsertOption<TReceivePlanSpareCB>> opLambda) {
        return doBatchInsert(tReceivePlanSpareList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TReceivePlanSpare> tReceivePlanSpareList, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> opLambda) {
        return doBatchUpdate(tReceivePlanSpareList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TReceivePlanSpare> tReceivePlanSpareList, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> opLambda) {
        return doBatchUpdateNonstrict(tReceivePlanSpareList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TReceivePlanSpare> tReceivePlanSpareList, WritableOptionCall<TReceivePlanSpareCB, DeleteOption<TReceivePlanSpareCB>> opLambda) {
        return doBatchDelete(tReceivePlanSpareList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tReceivePlanSpareList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TReceivePlanSpare> tReceivePlanSpareList, WritableOptionCall<TReceivePlanSpareCB, DeleteOption<TReceivePlanSpareCB>> opLambda) {
        return doBatchDeleteNonstrict(tReceivePlanSpareList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TReceivePlanSpare, TReceivePlanSpareCB> manyArgLambda, WritableOptionCall<TReceivePlanSpareCB, InsertOption<TReceivePlanSpareCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TReceivePlanSpare tReceivePlanSpare = <span style="color: #70226C">new</span> TReceivePlanSpare();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setPK...(value);</span>
     * tReceivePlanSpare.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tReceivePlanSpare.setVersionNo(value);</span>
     * TReceivePlanSpareCB cb = <span style="color: #70226C">new</span> TReceivePlanSpareCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tReceivePlanSpareBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tReceivePlanSpare, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tReceivePlanSpare The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TReceivePlanSpare tReceivePlanSpare, TReceivePlanSpareCB cb, WritableOptionCall<TReceivePlanSpareCB, UpdateOption<TReceivePlanSpareCB>> opLambda) {
        return doQueryUpdate(tReceivePlanSpare, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TReceivePlanSpare. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TReceivePlanSpareCB cb, WritableOptionCall<TReceivePlanSpareCB, DeleteOption<TReceivePlanSpareCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tReceivePlanSpareBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tReceivePlanSpareBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tReceivePlanSpareBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tReceivePlanSpareBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tReceivePlanSpareBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tReceivePlanSpareBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tReceivePlanSpareBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tReceivePlanSpareBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tReceivePlanSpareBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tReceivePlanSpareBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tReceivePlanSpareBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tReceivePlanSpareBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tReceivePlanSpareBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tReceivePlanSpareBhv.outideSql().removeBlockComment().selectList()
     * tReceivePlanSpareBhv.outideSql().removeLineComment().selectList()
     * tReceivePlanSpareBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TReceivePlanSpareBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TReceivePlanSpareBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TReceivePlanSpare> typeOfSelectedEntity() { return TReceivePlanSpare.class; }
    protected Class<TReceivePlanSpare> typeOfHandlingEntity() { return TReceivePlanSpare.class; }
    protected Class<TReceivePlanSpareCB> typeOfHandlingConditionBean() { return TReceivePlanSpareCB.class; }
}
