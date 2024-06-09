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
 * The behavior of T_MOVE_INST_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_H_ID
 *
 * [column]
 *     MOVE_INST_H_ID, CLIENT_ID, CENTER_ID, INST_DT, MOVE_SLIP_NO, PROCESS_TYPE_ID, MOVE_INST_STATUS, INPUT_TYPE, MOVE_INST_COMMENT, SOURCE_BATCH_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_PROCESS_TYPE, B_CLASS_DTL(ByInputType), T_MOVE_INST_R(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_B, T_MOVE_INST_B, T_MOVE_RECORD_B, T_MOVE_INST_R
 *
 * [foreign property]
 *     mCenter, mClient, mProcessType, bClassDtlByInputType, bClassDtlByMoveInstStatus, tMoveInstRAsOne
 *
 * [referrer property]
 *     tInventoryBList, tMoveInstBList, tMoveRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTMoveInstHBhv extends AbstractBehaviorWritable<TMoveInstH, TMoveInstHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TMoveInstHDbm asDBMeta() { return TMoveInstHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_MOVE_INST_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TMoveInstHDbm getMyDBMeta() { return TMoveInstHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TMoveInstHCB newConditionBean() { return new TMoveInstHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TMoveInstH newMyEntity() { return new TMoveInstH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TMoveInstHCB newMyConditionBean() { return new TMoveInstHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TMoveInstHCB cb) {
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
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().setFoo...(value);
     * TMoveInstH tMoveInstH = <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tMoveInstH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tMoveInstH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstH selectEntity(TMoveInstHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TMoveInstH facadeSelectEntity(TMoveInstHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveInstH> OptionalEntity<ENTITY> doSelectOptionalEntity(TMoveInstHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().set...;
     * TMoveInstH tMoveInstH = <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tMoveInstH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstH selectEntityWithDeletedCheck(TMoveInstHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param moveInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstH selectByPKValue(Long moveInstHId) {
        return facadeSelectByPKValue(moveInstHId);
    }

    protected TMoveInstH facadeSelectByPKValue(Long moveInstHId) {
        return doSelectByPK(moveInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveInstH> ENTITY doSelectByPK(Long moveInstHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(moveInstHId), tp);
    }

    protected <ENTITY extends TMoveInstH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long moveInstHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(moveInstHId, tp), moveInstHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param moveInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstH selectByPKValueWithDeletedCheck(Long moveInstHId) {
        return doSelectByPKWithDeletedCheck(moveInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveInstH> ENTITY doSelectByPKWithDeletedCheck(Long moveInstHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(moveInstHId), tp);
    }

    protected TMoveInstHCB xprepareCBAsPK(Long moveInstHId) {
        assertObjectNotNull("moveInstHId", moveInstHId);
        return newConditionBean().acceptPK(moveInstHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TMoveInstH&gt; <span style="color: #553000">tMoveInstHList</span> = <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TMoveInstH> selectList(TMoveInstHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TMoveInstH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TMoveInstH tMoveInstH : <span style="color: #553000">page</span>) {
     *     ... = tMoveInstH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TMoveInstH> selectPage(TMoveInstHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @param entityRowHandler The handler of entity row of TMoveInstH. (NotNull)
     */
    public void selectCursor(TMoveInstHCB cb, EntityRowHandler<TMoveInstH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TMoveInstHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TMoveInstHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TMoveInstH> tMoveInstHList, ReferrerLoaderHandler<LoaderOfTMoveInstH> loaderLambda) {
        xassLRArg(tMoveInstHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTMoveInstH().ready(tMoveInstHList, _behaviorSelector));
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
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TMoveInstH tMoveInstH, ReferrerLoaderHandler<LoaderOfTMoveInstH> loaderLambda) {
        xassLRArg(tMoveInstH, loaderLambda);
        loaderLambda.handle(new LoaderOfTMoveInstH().ready(xnewLRAryLs(tMoveInstH), _behaviorSelector));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by MOVE_INST_H_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">tMoveInstHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<TMoveInstH> tMoveInstHList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(tMoveInstHList, refCBLambda);
        return doLoadTInventoryBList(tMoveInstHList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by MOVE_INST_H_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">tMoveInstH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tMoveInstH</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(TMoveInstH tMoveInstH, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(tMoveInstH, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(tMoveInstH), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(TMoveInstH tMoveInstH, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(tMoveInstH, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(tMoveInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<TMoveInstH> tMoveInstHList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(tMoveInstHList, loadReferrerOption);
        if (tMoveInstHList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(tMoveInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<TMoveInstH> tMoveInstHList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(tMoveInstHList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by MOVE_INST_H_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">tMoveInstHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<TMoveInstH> tMoveInstHList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(tMoveInstHList, refCBLambda);
        return doLoadTMoveInstBList(tMoveInstHList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by MOVE_INST_H_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">tMoveInstH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tMoveInstH</span>.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(TMoveInstH tMoveInstH, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(tMoveInstH, refCBLambda);
        return doLoadTMoveInstBList(xnewLRLs(tMoveInstH), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(TMoveInstH tMoveInstH, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(tMoveInstH, loadReferrerOption);
        return loadTMoveInstBList(xnewLRLs(tMoveInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<TMoveInstH> tMoveInstHList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(tMoveInstHList, loadReferrerOption);
        if (tMoveInstHList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBList(tMoveInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBList(List<TMoveInstH> tMoveInstHList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(tMoveInstHList, option, "tMoveInstBList");
    }

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * T_MOVE_RECORD_B by MOVE_INST_H_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">tMoveInstHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TMoveInstH tMoveInstH : <span style="color: #553000">tMoveInstHList</span>) {
     *     ... = tMoveInstH.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(List<TMoveInstH> tMoveInstHList, ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        xassLRArg(tMoveInstHList, refCBLambda);
        return doLoadTMoveRecordBList(tMoveInstHList, new LoadReferrerOption<TMoveRecordBCB, TMoveRecordB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * T_MOVE_RECORD_B by MOVE_INST_H_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">tMoveInstH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tMoveInstH</span>.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(TMoveInstH tMoveInstH, ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        xassLRArg(tMoveInstH, refCBLambda);
        return doLoadTMoveRecordBList(xnewLRLs(tMoveInstH), new LoadReferrerOption<TMoveRecordBCB, TMoveRecordB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tMoveInstH The entity of TMoveInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(TMoveInstH tMoveInstH, LoadReferrerOption<TMoveRecordBCB, TMoveRecordB> loadReferrerOption) {
        xassLRArg(tMoveInstH, loadReferrerOption);
        return loadTMoveRecordBList(xnewLRLs(tMoveInstH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tMoveInstHList The entity list of TMoveInstH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(List<TMoveInstH> tMoveInstHList, LoadReferrerOption<TMoveRecordBCB, TMoveRecordB> loadReferrerOption) {
        xassLRArg(tMoveInstHList, loadReferrerOption);
        if (tMoveInstHList.isEmpty()) { return (NestedReferrerListGateway<TMoveRecordB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveRecordBList(tMoveInstHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveRecordB> doLoadTMoveRecordBList(List<TMoveInstH> tMoveInstHList, LoadReferrerOption<TMoveRecordBCB, TMoveRecordB> option) {
        return helpLoadReferrerInternally(tMoveInstHList, option, "tMoveRecordBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TMoveInstH> tMoveInstHList)
    { return helpPulloutInternally(tMoveInstHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TMoveInstH> tMoveInstHList)
    { return helpPulloutInternally(tMoveInstHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<TMoveInstH> tMoveInstHList)
    { return helpPulloutInternally(tMoveInstHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInputType(List<TMoveInstH> tMoveInstHList)
    { return helpPulloutInternally(tMoveInstHList, "bClassDtlByInputType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMoveInstStatus(List<TMoveInstH> tMoveInstHList)
    { return helpPulloutInternally(tMoveInstHList, "bClassDtlByMoveInstStatus"); }

    /**
     * Pull out the list of referrer-as-one table 'TMoveInstR'.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TMoveInstR> pulloutTMoveInstRAsOne(List<TMoveInstH> tMoveInstHList)
    { return helpPulloutInternally(tMoveInstHList, "tMoveInstRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key moveInstHId.
     * @param tMoveInstHList The list of tMoveInstH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMoveInstHIdList(List<TMoveInstH> tMoveInstHList)
    { return helpExtractListInternally(tMoveInstHList, "moveInstHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tMoveInstH.setFoo...(value);
     * tMoveInstH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstH.set...;</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">insert</span>(tMoveInstH);
     * ... = tMoveInstH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tMoveInstH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TMoveInstH tMoveInstH) {
        doInsert(tMoveInstH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveInstH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">update</span>(tMoveInstH);
     * </pre>
     * @param tMoveInstH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TMoveInstH tMoveInstH) {
        doUpdate(tMoveInstH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tMoveInstH);
     * </pre>
     * @param tMoveInstH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TMoveInstH tMoveInstH) {
        doUpdateNonstrict(tMoveInstH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tMoveInstH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TMoveInstH tMoveInstH) {
        doInsertOrUpdate(tMoveInstH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tMoveInstH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TMoveInstH tMoveInstH) {
        doInsertOrUpdateNonstrict(tMoveInstH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveInstH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">delete</span>(tMoveInstH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tMoveInstH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TMoveInstH tMoveInstH) {
        doDelete(tMoveInstH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tMoveInstH);
     * </pre>
     * @param tMoveInstH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TMoveInstH tMoveInstH) {
        doDeleteNonstrict(tMoveInstH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tMoveInstH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tMoveInstH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TMoveInstH tMoveInstH) {
        doDeleteNonstrictIgnoreDeleted(tMoveInstH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TMoveInstH et, final DeleteOption<TMoveInstHCB> op) {
        assertObjectNotNull("tMoveInstH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     *     tMoveInstH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveInstH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tMoveInstHList.add(tMoveInstH);
     * }
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tMoveInstHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TMoveInstH> tMoveInstHList) {
        return doBatchInsert(tMoveInstHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     *     tMoveInstH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveInstH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tMoveInstH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tMoveInstH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tMoveInstHList.add(tMoveInstH);
     * }
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveInstHList);
     * </pre>
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TMoveInstH> tMoveInstHList) {
        return doBatchUpdate(tMoveInstHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tMoveInstHBhv.<span style="color: #CC4747">batchUpdate</span>(tMoveInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TMoveInstH> tMoveInstHList, SpecifyQuery<TMoveInstHCB> colCBLambda) {
        return doBatchUpdate(tMoveInstHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     *     tMoveInstH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveInstH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tMoveInstH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tMoveInstH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tMoveInstHList.add(tMoveInstH);
     * }
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveInstHList);
     * </pre>
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TMoveInstH> tMoveInstHList) {
        return doBatchUpdateNonstrict(tMoveInstHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tMoveInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tMoveInstHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TMoveInstH> tMoveInstHList, SpecifyQuery<TMoveInstHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tMoveInstHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TMoveInstH> tMoveInstHList) {
        return doBatchDelete(tMoveInstHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TMoveInstH> tMoveInstHList) {
        return doBatchDeleteNonstrict(tMoveInstHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TMoveInstH, TMoveInstHCB&gt;() {
     *     public ConditionBean setup(TMoveInstH entity, TMoveInstHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TMoveInstH, TMoveInstHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setPK...(value);</span>
     * tMoveInstH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setVersionNo(value);</span>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tMoveInstH, cb);
     * </pre>
     * @param tMoveInstH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TMoveInstH tMoveInstH, TMoveInstHCB cb) {
        return doQueryUpdate(tMoveInstH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TMoveInstHCB cb = new TMoveInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tMoveInstH, cb);
     * </pre>
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TMoveInstHCB cb) {
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
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tMoveInstH.setFoo...(value);
     * tMoveInstH.setBar...(value);
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tMoveInstH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tMoveInstH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tMoveInstH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, InsertOption<TMoveInstHCB>> opLambda) {
        doInsert(tMoveInstH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveInstH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tMoveInstH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveInstH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> opLambda) {
        doUpdate(tMoveInstH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * tMoveInstH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tMoveInstH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveInstH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> opLambda) {
        doUpdateNonstrict(tMoveInstH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tMoveInstH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, InsertOption<TMoveInstHCB>> insertOpLambda, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> updateOpLambda) {
        doInsertOrUpdate(tMoveInstH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tMoveInstH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, InsertOption<TMoveInstHCB>> insertOpLambda, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tMoveInstH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tMoveInstH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, DeleteOption<TMoveInstHCB>> opLambda) {
        doDelete(tMoveInstH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tMoveInstH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TMoveInstH tMoveInstH, WritableOptionCall<TMoveInstHCB, DeleteOption<TMoveInstHCB>> opLambda) {
        doDeleteNonstrict(tMoveInstH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TMoveInstH> tMoveInstHList, WritableOptionCall<TMoveInstHCB, InsertOption<TMoveInstHCB>> opLambda) {
        return doBatchInsert(tMoveInstHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TMoveInstH> tMoveInstHList, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> opLambda) {
        return doBatchUpdate(tMoveInstHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TMoveInstH> tMoveInstHList, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> opLambda) {
        return doBatchUpdateNonstrict(tMoveInstHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TMoveInstH> tMoveInstHList, WritableOptionCall<TMoveInstHCB, DeleteOption<TMoveInstHCB>> opLambda) {
        return doBatchDelete(tMoveInstHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tMoveInstHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TMoveInstH> tMoveInstHList, WritableOptionCall<TMoveInstHCB, DeleteOption<TMoveInstHCB>> opLambda) {
        return doBatchDeleteNonstrict(tMoveInstHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TMoveInstH, TMoveInstHCB> manyArgLambda, WritableOptionCall<TMoveInstHCB, InsertOption<TMoveInstHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TMoveInstH tMoveInstH = <span style="color: #70226C">new</span> TMoveInstH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setPK...(value);</span>
     * tMoveInstH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstH.setVersionNo(value);</span>
     * TMoveInstHCB cb = <span style="color: #70226C">new</span> TMoveInstHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveInstHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tMoveInstH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveInstH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TMoveInstH tMoveInstH, TMoveInstHCB cb, WritableOptionCall<TMoveInstHCB, UpdateOption<TMoveInstHCB>> opLambda) {
        return doQueryUpdate(tMoveInstH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TMoveInstH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TMoveInstHCB cb, WritableOptionCall<TMoveInstHCB, DeleteOption<TMoveInstHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tMoveInstHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tMoveInstHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tMoveInstHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tMoveInstHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tMoveInstHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tMoveInstHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tMoveInstHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tMoveInstHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tMoveInstHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tMoveInstHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tMoveInstHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tMoveInstHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tMoveInstHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tMoveInstHBhv.outideSql().removeBlockComment().selectList()
     * tMoveInstHBhv.outideSql().removeLineComment().selectList()
     * tMoveInstHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TMoveInstHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TMoveInstHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TMoveInstH> typeOfSelectedEntity() { return TMoveInstH.class; }
    protected Class<TMoveInstH> typeOfHandlingEntity() { return TMoveInstH.class; }
    protected Class<TMoveInstHCB> typeOfHandlingConditionBean() { return TMoveInstHCB.class; }
}
