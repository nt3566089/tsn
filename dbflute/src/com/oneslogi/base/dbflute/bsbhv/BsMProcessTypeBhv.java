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
 * The behavior of M_PROCESS_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PROCESS_TYPE_ID
 *
 * [column]
 *     PROCESS_TYPE_ID, PROCESS_TYPE_CD, DICT_ID, RECEIVE_FLG, SHIPPING_FLG, STOCK_ADJUST_FLG, DEFAULT_FLG, STOCK_TYPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PROCESS_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, M_STOCK_TYPE, V_DICT, B_CLASS_DTL(ByReceiveFlg)
 *
 * [referrer table]
 *     H_MOVE_H, H_RECEIVE_H, H_SHIPPING_H, H_STOCK_INOUT, T_ALLOC_INST_H, T_MOVE_INST_H, T_PACKING_H, T_PICKING_H, T_RECEIVE_PLAN_H, T_SHIPPING_INST_H, T_STOCK_INOUT, T_STORE_RECORD_H, W_HT_RECEIVE_NO_PLAN_INSP
 *
 * [foreign property]
 *     bDict, mStockType, vDict, bClassDtlByReceiveFlg, bClassDtlByShippingFlg, bClassDtlByStockAdjustFlg
 *
 * [referrer property]
 *     hMoveHList, hReceiveHList, hShippingHList, hStockInoutList, tAllocInstHList, tMoveInstHList, tPackingHList, tPickingHList, tReceivePlanHList, tShippingInstHList, tStockInoutList, tStoreRecordHList, wHtReceiveNoPlanInspList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMProcessTypeBhv extends AbstractBehaviorWritable<MProcessType, MProcessTypeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MProcessTypeDbm asDBMeta() { return MProcessTypeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_PROCESS_TYPE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MProcessTypeDbm getMyDBMeta() { return MProcessTypeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MProcessTypeCB newConditionBean() { return new MProcessTypeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MProcessType newMyEntity() { return new MProcessType(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MProcessTypeCB newMyConditionBean() { return new MProcessTypeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MProcessTypeCB cb) {
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
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().setFoo...(value);
     * MProcessType mProcessType = <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mProcessType != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mProcessType.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProcessType selectEntity(MProcessTypeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MProcessType facadeSelectEntity(MProcessTypeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProcessType> OptionalEntity<ENTITY> doSelectOptionalEntity(MProcessTypeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().set...;
     * MProcessType mProcessType = <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mProcessType.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProcessType selectEntityWithDeletedCheck(MProcessTypeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param processTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProcessType selectByPKValue(Long processTypeId) {
        return facadeSelectByPKValue(processTypeId);
    }

    protected MProcessType facadeSelectByPKValue(Long processTypeId) {
        return doSelectByPK(processTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProcessType> ENTITY doSelectByPK(Long processTypeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(processTypeId), tp);
    }

    protected <ENTITY extends MProcessType> OptionalEntity<ENTITY> doSelectOptionalByPK(Long processTypeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(processTypeId, tp), processTypeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param processTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProcessType selectByPKValueWithDeletedCheck(Long processTypeId) {
        return doSelectByPKWithDeletedCheck(processTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProcessType> ENTITY doSelectByPKWithDeletedCheck(Long processTypeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(processTypeId), tp);
    }

    protected MProcessTypeCB xprepareCBAsPK(Long processTypeId) {
        assertObjectNotNull("processTypeId", processTypeId);
        return newConditionBean().acceptPK(processTypeId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param processTypeCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MProcessType> selectByUniqueOf(String processTypeCd) {
        return facadeSelectByUniqueOf(processTypeCd);
    }

    protected OptionalEntity<MProcessType> facadeSelectByUniqueOf(String processTypeCd) {
        return doSelectByUniqueOf(processTypeCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProcessType> OptionalEntity<ENTITY> doSelectByUniqueOf(String processTypeCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(processTypeCd), tp), processTypeCd);
    }

    protected MProcessTypeCB xprepareCBAsUniqueOf(String processTypeCd) {
        assertObjectNotNull("processTypeCd", processTypeCd);
        return newConditionBean().acceptUniqueOf(processTypeCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MProcessType&gt; <span style="color: #553000">mProcessTypeList</span> = <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MProcessType> selectList(MProcessTypeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MProcessType&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">page</span>) {
     *     ... = mProcessType.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MProcessType> selectPage(MProcessTypeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().set...
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @param entityRowHandler The handler of entity row of MProcessType. (NotNull)
     */
    public void selectCursor(MProcessTypeCB cb, EntityRowHandler<MProcessType> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MProcessTypeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MProcessTypeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MProcessType> mProcessTypeList, ReferrerLoaderHandler<LoaderOfMProcessType> loaderLambda) {
        xassLRArg(mProcessTypeList, loaderLambda);
        loaderLambda.handle(new LoaderOfMProcessType().ready(mProcessTypeList, _behaviorSelector));
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
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MProcessType mProcessType, ReferrerLoaderHandler<LoaderOfMProcessType> loaderLambda) {
        xassLRArg(mProcessType, loaderLambda);
        loaderLambda.handle(new LoaderOfMProcessType().ready(xnewLRAryLs(mProcessType), _behaviorSelector));
    }

    /**
     * Load referrer of HMoveHList by the set-upper of referrer. <br>
     * H_MOVE_H by PROCESS_TYPE_ID, named 'HMoveHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHMoveHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getHMoveHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveH> loadHMoveHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<HMoveHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadHMoveHList(mProcessTypeList, new LoadReferrerOption<HMoveHCB, HMoveH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HMoveHList by the set-upper of referrer. <br>
     * H_MOVE_H by PROCESS_TYPE_ID, named 'HMoveHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHMoveHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getHMoveHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveH> loadHMoveHList(MProcessType mProcessType, ConditionBeanSetupper<HMoveHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadHMoveHList(xnewLRLs(mProcessType), new LoadReferrerOption<HMoveHCB, HMoveH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HMoveH> loadHMoveHList(MProcessType mProcessType, LoadReferrerOption<HMoveHCB, HMoveH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadHMoveHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HMoveH> loadHMoveHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HMoveHCB, HMoveH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<HMoveH>)EMPTY_NREF_LGWAY; }
        return doLoadHMoveHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HMoveH> doLoadHMoveHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HMoveHCB, HMoveH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "hMoveHList");
    }

    /**
     * Load referrer of HReceiveHList by the set-upper of referrer. <br>
     * H_RECEIVE_H by PROCESS_TYPE_ID, named 'HReceiveHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHReceiveHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getHReceiveHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HReceiveH> loadHReceiveHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<HReceiveHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadHReceiveHList(mProcessTypeList, new LoadReferrerOption<HReceiveHCB, HReceiveH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HReceiveHList by the set-upper of referrer. <br>
     * H_RECEIVE_H by PROCESS_TYPE_ID, named 'HReceiveHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHReceiveHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getHReceiveHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HReceiveH> loadHReceiveHList(MProcessType mProcessType, ConditionBeanSetupper<HReceiveHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadHReceiveHList(xnewLRLs(mProcessType), new LoadReferrerOption<HReceiveHCB, HReceiveH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HReceiveH> loadHReceiveHList(MProcessType mProcessType, LoadReferrerOption<HReceiveHCB, HReceiveH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadHReceiveHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HReceiveH> loadHReceiveHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HReceiveHCB, HReceiveH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<HReceiveH>)EMPTY_NREF_LGWAY; }
        return doLoadHReceiveHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HReceiveH> doLoadHReceiveHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HReceiveHCB, HReceiveH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "hReceiveHList");
    }

    /**
     * Load referrer of HShippingHList by the set-upper of referrer. <br>
     * H_SHIPPING_H by PROCESS_TYPE_ID, named 'HShippingHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHShippingHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getHShippingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingH> loadHShippingHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<HShippingHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadHShippingHList(mProcessTypeList, new LoadReferrerOption<HShippingHCB, HShippingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HShippingHList by the set-upper of referrer. <br>
     * H_SHIPPING_H by PROCESS_TYPE_ID, named 'HShippingHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHShippingHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getHShippingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingH> loadHShippingHList(MProcessType mProcessType, ConditionBeanSetupper<HShippingHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadHShippingHList(xnewLRLs(mProcessType), new LoadReferrerOption<HShippingHCB, HShippingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingH> loadHShippingHList(MProcessType mProcessType, LoadReferrerOption<HShippingHCB, HShippingH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadHShippingHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HShippingH> loadHShippingHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HShippingHCB, HShippingH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<HShippingH>)EMPTY_NREF_LGWAY; }
        return doLoadHShippingHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HShippingH> doLoadHShippingHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HShippingHCB, HShippingH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "hShippingHList");
    }

    /**
     * Load referrer of HStockInoutList by the set-upper of referrer. <br>
     * H_STOCK_INOUT by PROCESS_TYPE_ID, named 'HStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHStockInoutList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getHStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<HStockInoutCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadHStockInoutList(mProcessTypeList, new LoadReferrerOption<HStockInoutCB, HStockInout>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HStockInoutList by the set-upper of referrer. <br>
     * H_STOCK_INOUT by PROCESS_TYPE_ID, named 'HStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadHStockInoutList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getHStockInoutList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(MProcessType mProcessType, ConditionBeanSetupper<HStockInoutCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadHStockInoutList(xnewLRLs(mProcessType), new LoadReferrerOption<HStockInoutCB, HStockInout>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(MProcessType mProcessType, LoadReferrerOption<HStockInoutCB, HStockInout> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadHStockInoutList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HStockInout> loadHStockInoutList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HStockInoutCB, HStockInout> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<HStockInout>)EMPTY_NREF_LGWAY; }
        return doLoadHStockInoutList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HStockInout> doLoadHStockInoutList(List<MProcessType> mProcessTypeList, LoadReferrerOption<HStockInoutCB, HStockInout> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "hStockInoutList");
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by PROCESS_TYPE_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTAllocInstHList(mProcessTypeList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by PROCESS_TYPE_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MProcessType mProcessType, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTAllocInstHList(xnewLRLs(mProcessType), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MProcessType mProcessType, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTAllocInstHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tAllocInstHList");
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * T_MOVE_INST_H by PROCESS_TYPE_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTMoveInstHList(mProcessTypeList, new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * T_MOVE_INST_H by PROCESS_TYPE_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MProcessType mProcessType, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTMoveInstHList(xnewLRLs(mProcessType), new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MProcessType mProcessType, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTMoveInstHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstH> doLoadTMoveInstHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tMoveInstHList");
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by PROCESS_TYPE_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTPackingHList(mProcessTypeList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by PROCESS_TYPE_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MProcessType mProcessType, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(mProcessType), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MProcessType mProcessType, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tPackingHList");
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by PROCESS_TYPE_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTPickingHList(mProcessTypeList, new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by PROCESS_TYPE_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTPickingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MProcessType mProcessType, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTPickingHList(xnewLRLs(mProcessType), new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MProcessType mProcessType, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTPickingHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TPickingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingH> doLoadTPickingHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TPickingHCB, TPickingH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tPickingHList");
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PROCESS_TYPE_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTReceivePlanHList(mProcessTypeList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PROCESS_TYPE_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MProcessType mProcessType, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTReceivePlanHList(xnewLRLs(mProcessType), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MProcessType mProcessType, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTReceivePlanHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tReceivePlanHList");
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by PROCESS_TYPE_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTShippingInstHList(mProcessTypeList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by PROCESS_TYPE_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MProcessType mProcessType, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTShippingInstHList(xnewLRLs(mProcessType), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MProcessType mProcessType, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTShippingInstHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tShippingInstHList");
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by PROCESS_TYPE_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTStockInoutList(mProcessTypeList, new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * T_STOCK_INOUT by PROCESS_TYPE_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inoutCB</span>.setupSelect...
     *     <span style="color: #553000">inoutCB</span>.query().set...
     *     <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTStockInoutList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(MProcessType mProcessType, ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTStockInoutList(xnewLRLs(mProcessType), new LoadReferrerOption<TStockInoutCB, TStockInout>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(MProcessType mProcessType, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTStockInoutList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStockInout> loadTStockInoutList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TStockInoutCB, TStockInout> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TStockInout>)EMPTY_NREF_LGWAY; }
        return doLoadTStockInoutList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStockInout> doLoadTStockInoutList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TStockInoutCB, TStockInout> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tStockInoutList");
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by PROCESS_TYPE_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadTStoreRecordHList(mProcessTypeList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by PROCESS_TYPE_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MProcessType mProcessType, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadTStoreRecordHList(xnewLRLs(mProcessType), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MProcessType mProcessType, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadTStoreRecordHList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHList(List<MProcessType> mProcessTypeList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "tStoreRecordHList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mProcessTypeList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProcessType mProcessType : <span style="color: #553000">mProcessTypeList</span>) {
     *     ... = mProcessType.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MProcessType> mProcessTypeList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mProcessTypeList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mProcessTypeList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mProcessType</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProcessType</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProcessTypeId_InScope(pkList);
     * cb.query().addOrderBy_ProcessTypeId_Asc();
     * </pre>
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MProcessType mProcessType, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mProcessType, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mProcessType), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProcessType The entity of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MProcessType mProcessType, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mProcessType, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mProcessType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProcessTypeList The entity list of MProcessType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MProcessType> mProcessTypeList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mProcessTypeList, loadReferrerOption);
        if (mProcessTypeList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mProcessTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MProcessType> mProcessTypeList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mProcessTypeList, option, "wHtReceiveNoPlanInspList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<MProcessType> mProcessTypeList)
    { return helpPulloutInternally(mProcessTypeList, "bDict"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<MProcessType> mProcessTypeList)
    { return helpPulloutInternally(mProcessTypeList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<MProcessType> mProcessTypeList)
    { return helpPulloutInternally(mProcessTypeList, "vDict"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByReceiveFlg(List<MProcessType> mProcessTypeList)
    { return helpPulloutInternally(mProcessTypeList, "bClassDtlByReceiveFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByShippingFlg(List<MProcessType> mProcessTypeList)
    { return helpPulloutInternally(mProcessTypeList, "bClassDtlByShippingFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStockAdjustFlg(List<MProcessType> mProcessTypeList)
    { return helpPulloutInternally(mProcessTypeList, "bClassDtlByStockAdjustFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key processTypeId.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProcessTypeIdList(List<MProcessType> mProcessTypeList)
    { return helpExtractListInternally(mProcessTypeList, "processTypeId"); }

    /**
     * Extract the value list of (single) unique key processTypeCd.
     * @param mProcessTypeList The list of mProcessType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProcessTypeCdList(List<MProcessType> mProcessTypeList)
    { return helpExtractListInternally(mProcessTypeList, "processTypeCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mProcessType.setFoo...(value);
     * mProcessType.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProcessType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProcessType.set...;</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">insert</span>(mProcessType);
     * ... = mProcessType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mProcessType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MProcessType mProcessType) {
        doInsert(mProcessType, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProcessType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProcessType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProcessType.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mProcessType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">update</span>(mProcessType);
     * </pre>
     * @param mProcessType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MProcessType mProcessType) {
        doUpdate(mProcessType, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProcessType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProcessType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProcessType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProcessType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mProcessType);
     * </pre>
     * @param mProcessType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MProcessType mProcessType) {
        doUpdateNonstrict(mProcessType, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mProcessType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MProcessType mProcessType) {
        doInsertOrUpdate(mProcessType, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mProcessType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MProcessType mProcessType) {
        doInsertOrUpdateNonstrict(mProcessType, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mProcessType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">delete</span>(mProcessType);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mProcessType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MProcessType mProcessType) {
        doDelete(mProcessType, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProcessType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mProcessType);
     * </pre>
     * @param mProcessType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MProcessType mProcessType) {
        doDeleteNonstrict(mProcessType, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProcessType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mProcessType);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mProcessType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MProcessType mProcessType) {
        doDeleteNonstrictIgnoreDeleted(mProcessType, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MProcessType et, final DeleteOption<MProcessTypeCB> op) {
        assertObjectNotNull("mProcessType", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     *     mProcessType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mProcessType.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mProcessTypeList.add(mProcessType);
     * }
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">batchInsert</span>(mProcessTypeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MProcessType> mProcessTypeList) {
        return doBatchInsert(mProcessTypeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     *     mProcessType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mProcessType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mProcessType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mProcessType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mProcessTypeList.add(mProcessType);
     * }
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mProcessTypeList);
     * </pre>
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MProcessType> mProcessTypeList) {
        return doBatchUpdate(mProcessTypeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mProcessTypeBhv.<span style="color: #CC4747">batchUpdate</span>(mProcessTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mProcessTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MProcessType> mProcessTypeList, SpecifyQuery<MProcessTypeCB> colCBLambda) {
        return doBatchUpdate(mProcessTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     *     mProcessType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mProcessType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mProcessType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mProcessType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mProcessTypeList.add(mProcessType);
     * }
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mProcessTypeList);
     * </pre>
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MProcessType> mProcessTypeList) {
        return doBatchUpdateNonstrict(mProcessTypeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mProcessTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mProcessTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MProcessType> mProcessTypeList, SpecifyQuery<MProcessTypeCB> colCBLambda) {
        return doBatchUpdateNonstrict(mProcessTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MProcessType> mProcessTypeList) {
        return doBatchDelete(mProcessTypeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MProcessType> mProcessTypeList) {
        return doBatchDeleteNonstrict(mProcessTypeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MProcessType, MProcessTypeCB&gt;() {
     *     public ConditionBean setup(MProcessType entity, MProcessTypeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MProcessType, MProcessTypeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mProcessType.setPK...(value);</span>
     * mProcessType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProcessType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProcessType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProcessType.setVersionNo(value);</span>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mProcessType, cb);
     * </pre>
     * @param mProcessType The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MProcessType mProcessType, MProcessTypeCB cb) {
        return doQueryUpdate(mProcessType, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MProcessTypeCB cb = new MProcessTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">queryDelete</span>(mProcessType, cb);
     * </pre>
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MProcessTypeCB cb) {
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
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mProcessType.setFoo...(value);
     * mProcessType.setBar...(value);
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mProcessType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mProcessType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mProcessType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, InsertOption<MProcessTypeCB>> opLambda) {
        doInsert(mProcessType, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProcessType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mProcessType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mProcessType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mProcessType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> opLambda) {
        doUpdate(mProcessType, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * mProcessType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProcessType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProcessType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mProcessType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mProcessType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> opLambda) {
        doUpdateNonstrict(mProcessType, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mProcessType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, InsertOption<MProcessTypeCB>> insertOpLambda, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> updateOpLambda) {
        doInsertOrUpdate(mProcessType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mProcessType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, InsertOption<MProcessTypeCB>> insertOpLambda, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mProcessType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mProcessType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, DeleteOption<MProcessTypeCB>> opLambda) {
        doDelete(mProcessType, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mProcessType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MProcessType mProcessType, WritableOptionCall<MProcessTypeCB, DeleteOption<MProcessTypeCB>> opLambda) {
        doDeleteNonstrict(mProcessType, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MProcessType> mProcessTypeList, WritableOptionCall<MProcessTypeCB, InsertOption<MProcessTypeCB>> opLambda) {
        return doBatchInsert(mProcessTypeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MProcessType> mProcessTypeList, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> opLambda) {
        return doBatchUpdate(mProcessTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MProcessType> mProcessTypeList, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> opLambda) {
        return doBatchUpdateNonstrict(mProcessTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MProcessType> mProcessTypeList, WritableOptionCall<MProcessTypeCB, DeleteOption<MProcessTypeCB>> opLambda) {
        return doBatchDelete(mProcessTypeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mProcessTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MProcessType> mProcessTypeList, WritableOptionCall<MProcessTypeCB, DeleteOption<MProcessTypeCB>> opLambda) {
        return doBatchDeleteNonstrict(mProcessTypeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MProcessType, MProcessTypeCB> manyArgLambda, WritableOptionCall<MProcessTypeCB, InsertOption<MProcessTypeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MProcessType mProcessType = <span style="color: #70226C">new</span> MProcessType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mProcessType.setPK...(value);</span>
     * mProcessType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProcessType.setVersionNo(value);</span>
     * MProcessTypeCB cb = <span style="color: #70226C">new</span> MProcessTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mProcessTypeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mProcessType, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mProcessType The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MProcessType mProcessType, MProcessTypeCB cb, WritableOptionCall<MProcessTypeCB, UpdateOption<MProcessTypeCB>> opLambda) {
        return doQueryUpdate(mProcessType, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MProcessType. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MProcessTypeCB cb, WritableOptionCall<MProcessTypeCB, DeleteOption<MProcessTypeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mProcessTypeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mProcessTypeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mProcessTypeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mProcessTypeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mProcessTypeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mProcessTypeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mProcessTypeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mProcessTypeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mProcessTypeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mProcessTypeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mProcessTypeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mProcessTypeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mProcessTypeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mProcessTypeBhv.outideSql().removeBlockComment().selectList()
     * mProcessTypeBhv.outideSql().removeLineComment().selectList()
     * mProcessTypeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MProcessTypeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MProcessTypeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MProcessType> typeOfSelectedEntity() { return MProcessType.class; }
    protected Class<MProcessType> typeOfHandlingEntity() { return MProcessType.class; }
    protected Class<MProcessTypeCB> typeOfHandlingConditionBean() { return MProcessTypeCB.class; }
}
