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
 * The behavior of H_MOVE_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_H_ID
 *
 * [column]
 *     MOVE_INST_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, MOVE_INST_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_PROCESS_TYPE
 *
 * [referrer table]
 *     H_INVENTORY_B, H_MOVE_B
 *
 * [foreign property]
 *     mProcessType
 *
 * [referrer property]
 *     hInventoryBList, hMoveBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHMoveHBhv extends AbstractBehaviorWritable<HMoveH, HMoveHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public HMoveHDbm asDBMeta() { return HMoveHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "H_MOVE_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public HMoveHDbm getMyDBMeta() { return HMoveHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public HMoveHCB newConditionBean() { return new HMoveHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public HMoveH newMyEntity() { return new HMoveH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public HMoveHCB newMyConditionBean() { return new HMoveHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(HMoveHCB cb) {
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
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().setFoo...(value);
     * HMoveH hMoveH = <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (hMoveH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = hMoveH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HMoveH selectEntity(HMoveHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected HMoveH facadeSelectEntity(HMoveHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends HMoveH> OptionalEntity<ENTITY> doSelectOptionalEntity(HMoveHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().set...;
     * HMoveH hMoveH = <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = hMoveH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HMoveH selectEntityWithDeletedCheck(HMoveHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param moveInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HMoveH selectByPKValue(Long moveInstHId) {
        return facadeSelectByPKValue(moveInstHId);
    }

    protected HMoveH facadeSelectByPKValue(Long moveInstHId) {
        return doSelectByPK(moveInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends HMoveH> ENTITY doSelectByPK(Long moveInstHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(moveInstHId), tp);
    }

    protected <ENTITY extends HMoveH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long moveInstHId, Class<? extends ENTITY> tp) {
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
    public HMoveH selectByPKValueWithDeletedCheck(Long moveInstHId) {
        return doSelectByPKWithDeletedCheck(moveInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends HMoveH> ENTITY doSelectByPKWithDeletedCheck(Long moveInstHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(moveInstHId), tp);
    }

    protected HMoveHCB xprepareCBAsPK(Long moveInstHId) {
        assertObjectNotNull("moveInstHId", moveInstHId);
        return newConditionBean().acceptPK(moveInstHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;HMoveH&gt; <span style="color: #553000">hMoveHList</span> = <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (HMoveH hMoveH : <span style="color: #553000">hMoveHList</span>) {
     *     ... = hMoveH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<HMoveH> selectList(HMoveHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;HMoveH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (HMoveH hMoveH : <span style="color: #553000">page</span>) {
     *     ... = hMoveH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<HMoveH> selectPage(HMoveHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().set...
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @param entityRowHandler The handler of entity row of HMoveH. (NotNull)
     */
    public void selectCursor(HMoveHCB cb, EntityRowHandler<HMoveH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<HMoveHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<HMoveHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param hMoveHList The entity list of HMoveH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<HMoveH> hMoveHList, ReferrerLoaderHandler<LoaderOfHMoveH> loaderLambda) {
        xassLRArg(hMoveHList, loaderLambda);
        loaderLambda.handle(new LoaderOfHMoveH().ready(hMoveHList, _behaviorSelector));
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
     * @param hMoveH The entity of HMoveH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(HMoveH hMoveH, ReferrerLoaderHandler<LoaderOfHMoveH> loaderLambda) {
        xassLRArg(hMoveH, loaderLambda);
        loaderLambda.handle(new LoaderOfHMoveH().ready(xnewLRAryLs(hMoveH), _behaviorSelector));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by MOVE_INST_H_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">hMoveHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HMoveH hMoveH : <span style="color: #553000">hMoveHList</span>) {
     *     ... = hMoveH.<span style="color: #CC4747">getHInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param hMoveHList The entity list of HMoveH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<HMoveH> hMoveHList, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(hMoveHList, refCBLambda);
        return doLoadHInventoryBList(hMoveHList, new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by MOVE_INST_H_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">hMoveH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hMoveH</span>.<span style="color: #CC4747">getHInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param hMoveH The entity of HMoveH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(HMoveH hMoveH, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(hMoveH, refCBLambda);
        return doLoadHInventoryBList(xnewLRLs(hMoveH), new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hMoveH The entity of HMoveH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(HMoveH hMoveH, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(hMoveH, loadReferrerOption);
        return loadHInventoryBList(xnewLRLs(hMoveH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hMoveHList The entity list of HMoveH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<HMoveH> hMoveHList, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(hMoveHList, loadReferrerOption);
        if (hMoveHList.isEmpty()) { return (NestedReferrerListGateway<HInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadHInventoryBList(hMoveHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HInventoryB> doLoadHInventoryBList(List<HMoveH> hMoveHList, LoadReferrerOption<HInventoryBCB, HInventoryB> option) {
        return helpLoadReferrerInternally(hMoveHList, option, "hInventoryBList");
    }

    /**
     * Load referrer of HMoveBList by the set-upper of referrer. <br>
     * H_MOVE_B by MOVE_INST_H_ID, named 'HMoveBList'.
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">loadHMoveBList</span>(<span style="color: #553000">hMoveHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HMoveH hMoveH : <span style="color: #553000">hMoveHList</span>) {
     *     ... = hMoveH.<span style="color: #CC4747">getHMoveBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param hMoveHList The entity list of HMoveH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(List<HMoveH> hMoveHList, ConditionBeanSetupper<HMoveBCB> refCBLambda) {
        xassLRArg(hMoveHList, refCBLambda);
        return doLoadHMoveBList(hMoveHList, new LoadReferrerOption<HMoveBCB, HMoveB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HMoveBList by the set-upper of referrer. <br>
     * H_MOVE_B by MOVE_INST_H_ID, named 'HMoveBList'.
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">loadHMoveBList</span>(<span style="color: #553000">hMoveH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hMoveH</span>.<span style="color: #CC4747">getHMoveBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstHId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstHId_Asc();
     * </pre>
     * @param hMoveH The entity of HMoveH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(HMoveH hMoveH, ConditionBeanSetupper<HMoveBCB> refCBLambda) {
        xassLRArg(hMoveH, refCBLambda);
        return doLoadHMoveBList(xnewLRLs(hMoveH), new LoadReferrerOption<HMoveBCB, HMoveB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hMoveH The entity of HMoveH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(HMoveH hMoveH, LoadReferrerOption<HMoveBCB, HMoveB> loadReferrerOption) {
        xassLRArg(hMoveH, loadReferrerOption);
        return loadHMoveBList(xnewLRLs(hMoveH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hMoveHList The entity list of HMoveH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HMoveB> loadHMoveBList(List<HMoveH> hMoveHList, LoadReferrerOption<HMoveBCB, HMoveB> loadReferrerOption) {
        xassLRArg(hMoveHList, loadReferrerOption);
        if (hMoveHList.isEmpty()) { return (NestedReferrerListGateway<HMoveB>)EMPTY_NREF_LGWAY; }
        return doLoadHMoveBList(hMoveHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HMoveB> doLoadHMoveBList(List<HMoveH> hMoveHList, LoadReferrerOption<HMoveBCB, HMoveB> option) {
        return helpLoadReferrerInternally(hMoveHList, option, "hMoveBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param hMoveHList The list of hMoveH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<HMoveH> hMoveHList)
    { return helpPulloutInternally(hMoveHList, "mProcessType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key moveInstHId.
     * @param hMoveHList The list of hMoveH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMoveInstHIdList(List<HMoveH> hMoveHList)
    { return helpExtractListInternally(hMoveHList, "moveInstHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * hMoveH.setFoo...(value);
     * hMoveH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hMoveH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hMoveH.set...;</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">insert</span>(hMoveH);
     * ... = hMoveH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param hMoveH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(HMoveH hMoveH) {
        doInsert(hMoveH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hMoveH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hMoveH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hMoveH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hMoveH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">update</span>(hMoveH);
     * </pre>
     * @param hMoveH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(HMoveH hMoveH) {
        doUpdate(hMoveH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hMoveH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hMoveH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hMoveH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hMoveH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(hMoveH);
     * </pre>
     * @param hMoveH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(HMoveH hMoveH) {
        doUpdateNonstrict(hMoveH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param hMoveH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(HMoveH hMoveH) {
        doInsertOrUpdate(hMoveH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param hMoveH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(HMoveH hMoveH) {
        doInsertOrUpdateNonstrict(hMoveH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hMoveH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">delete</span>(hMoveH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param hMoveH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(HMoveH hMoveH) {
        doDelete(hMoveH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hMoveH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(hMoveH);
     * </pre>
     * @param hMoveH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(HMoveH hMoveH) {
        doDeleteNonstrict(hMoveH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hMoveH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(hMoveH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param hMoveH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(HMoveH hMoveH) {
        doDeleteNonstrictIgnoreDeleted(hMoveH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(HMoveH et, final DeleteOption<HMoveHCB> op) {
        assertObjectNotNull("hMoveH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     *     hMoveH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hMoveH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     hMoveHList.add(hMoveH);
     * }
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">batchInsert</span>(hMoveHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<HMoveH> hMoveHList) {
        return doBatchInsert(hMoveHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     *     hMoveH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hMoveH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         hMoveH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//hMoveH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     hMoveHList.add(hMoveH);
     * }
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hMoveHList);
     * </pre>
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<HMoveH> hMoveHList) {
        return doBatchUpdate(hMoveHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * hMoveHBhv.<span style="color: #CC4747">batchUpdate</span>(hMoveHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hMoveHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<HMoveH> hMoveHList, SpecifyQuery<HMoveHCB> colCBLambda) {
        return doBatchUpdate(hMoveHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     *     hMoveH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hMoveH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         hMoveH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//hMoveH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     hMoveHList.add(hMoveH);
     * }
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hMoveHList);
     * </pre>
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<HMoveH> hMoveHList) {
        return doBatchUpdateNonstrict(hMoveHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(hMoveHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(hMoveHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<HMoveH> hMoveHList, SpecifyQuery<HMoveHCB> colCBLambda) {
        return doBatchUpdateNonstrict(hMoveHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<HMoveH> hMoveHList) {
        return doBatchDelete(hMoveHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<HMoveH> hMoveHList) {
        return doBatchDeleteNonstrict(hMoveHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;HMoveH, HMoveHCB&gt;() {
     *     public ConditionBean setup(HMoveH entity, HMoveHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<HMoveH, HMoveHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//hMoveH.setPK...(value);</span>
     * hMoveH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hMoveH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hMoveH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hMoveH.setVersionNo(value);</span>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(hMoveH, cb);
     * </pre>
     * @param hMoveH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(HMoveH hMoveH, HMoveHCB cb) {
        return doQueryUpdate(hMoveH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * HMoveHCB cb = new HMoveHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">queryDelete</span>(hMoveH, cb);
     * </pre>
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(HMoveHCB cb) {
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
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * hMoveH.setFoo...(value);
     * hMoveH.setBar...(value);
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(hMoveH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = hMoveH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param hMoveH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(HMoveH hMoveH, WritableOptionCall<HMoveHCB, InsertOption<HMoveHCB>> opLambda) {
        doInsert(hMoveH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hMoveH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hMoveH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(hMoveH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param hMoveH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(HMoveH hMoveH, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> opLambda) {
        doUpdate(hMoveH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * hMoveH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hMoveH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hMoveH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(hMoveH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param hMoveH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(HMoveH hMoveH, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> opLambda) {
        doUpdateNonstrict(hMoveH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param hMoveH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(HMoveH hMoveH, WritableOptionCall<HMoveHCB, InsertOption<HMoveHCB>> insertOpLambda, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> updateOpLambda) {
        doInsertOrUpdate(hMoveH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param hMoveH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(HMoveH hMoveH, WritableOptionCall<HMoveHCB, InsertOption<HMoveHCB>> insertOpLambda, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(hMoveH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param hMoveH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(HMoveH hMoveH, WritableOptionCall<HMoveHCB, DeleteOption<HMoveHCB>> opLambda) {
        doDelete(hMoveH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param hMoveH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(HMoveH hMoveH, WritableOptionCall<HMoveHCB, DeleteOption<HMoveHCB>> opLambda) {
        doDeleteNonstrict(hMoveH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<HMoveH> hMoveHList, WritableOptionCall<HMoveHCB, InsertOption<HMoveHCB>> opLambda) {
        return doBatchInsert(hMoveHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<HMoveH> hMoveHList, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> opLambda) {
        return doBatchUpdate(hMoveHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<HMoveH> hMoveHList, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> opLambda) {
        return doBatchUpdateNonstrict(hMoveHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<HMoveH> hMoveHList, WritableOptionCall<HMoveHCB, DeleteOption<HMoveHCB>> opLambda) {
        return doBatchDelete(hMoveHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param hMoveHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<HMoveH> hMoveHList, WritableOptionCall<HMoveHCB, DeleteOption<HMoveHCB>> opLambda) {
        return doBatchDeleteNonstrict(hMoveHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<HMoveH, HMoveHCB> manyArgLambda, WritableOptionCall<HMoveHCB, InsertOption<HMoveHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * HMoveH hMoveH = <span style="color: #70226C">new</span> HMoveH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//hMoveH.setPK...(value);</span>
     * hMoveH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hMoveH.setVersionNo(value);</span>
     * HMoveHCB cb = <span style="color: #70226C">new</span> HMoveHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hMoveHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(hMoveH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param hMoveH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(HMoveH hMoveH, HMoveHCB cb, WritableOptionCall<HMoveHCB, UpdateOption<HMoveHCB>> opLambda) {
        return doQueryUpdate(hMoveH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of HMoveH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(HMoveHCB cb, WritableOptionCall<HMoveHCB, DeleteOption<HMoveHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * hMoveHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * hMoveHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * hMoveHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * hMoveHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * hMoveHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * hMoveHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * hMoveHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * hMoveHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * hMoveHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * hMoveHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * hMoveHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * hMoveHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * hMoveHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * hMoveHBhv.outideSql().removeBlockComment().selectList()
     * hMoveHBhv.outideSql().removeLineComment().selectList()
     * hMoveHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<HMoveHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<HMoveHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends HMoveH> typeOfSelectedEntity() { return HMoveH.class; }
    protected Class<HMoveH> typeOfHandlingEntity() { return HMoveH.class; }
    protected Class<HMoveHCB> typeOfHandlingConditionBean() { return HMoveHCB.class; }
}
