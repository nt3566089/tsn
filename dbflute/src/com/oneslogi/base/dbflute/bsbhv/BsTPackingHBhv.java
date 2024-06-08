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
 * The behavior of T_PACKING_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PACKING_STATUS, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, BOX_ID, GROSS_WEIGHT, TOTAL_VOLUME, MIXED_FLG, MULTI_PIC_FLG, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO, SEEDING_NO, LOADING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_PICKING_H, M_CENTER, M_BOX, T_ALLOC_INST_H, M_CLIENT, M_PROCESS_TYPE, B_USER(ByUpdUser), B_CLASS_DTL(ByLoadingFlg), T_PACKING_R(AsOne)
 *
 * [referrer table]
 *     T_PACKING_B, T_PIC_MTHD_RCMD_CART, T_PACKING_R
 *
 * [foreign property]
 *     tPickingH, mCenter, mBox, tAllocInstH, mClient, mProcessType, bUserByUpdUser, bClassDtlByLoadingFlg, bClassDtlByMixedFlg, bClassDtlByMultiPicFlg, bClassDtlByPackingStatus, tPackingRAsOne
 *
 * [referrer property]
 *     tPackingBList, tPicMthdRcmdCartList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPackingHBhv extends AbstractBehaviorWritable<TPackingH, TPackingHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TPackingHDbm asDBMeta() { return TPackingHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_PACKING_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TPackingHDbm getMyDBMeta() { return TPackingHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TPackingHCB newConditionBean() { return new TPackingHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TPackingH newMyEntity() { return new TPackingH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TPackingHCB newMyConditionBean() { return new TPackingHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TPackingHCB cb) {
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
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().setFoo...(value);
     * TPackingH tPackingH = <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tPackingH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tPackingH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPackingH selectEntity(TPackingHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TPackingH facadeSelectEntity(TPackingHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPackingH> OptionalEntity<ENTITY> doSelectOptionalEntity(TPackingHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().set...;
     * TPackingH tPackingH = <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tPackingH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPackingH selectEntityWithDeletedCheck(TPackingHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param packingHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPackingH selectByPKValue(Long packingHId) {
        return facadeSelectByPKValue(packingHId);
    }

    protected TPackingH facadeSelectByPKValue(Long packingHId) {
        return doSelectByPK(packingHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPackingH> ENTITY doSelectByPK(Long packingHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(packingHId), tp);
    }

    protected <ENTITY extends TPackingH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long packingHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(packingHId, tp), packingHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param packingHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPackingH selectByPKValueWithDeletedCheck(Long packingHId) {
        return doSelectByPKWithDeletedCheck(packingHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPackingH> ENTITY doSelectByPKWithDeletedCheck(Long packingHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(packingHId), tp);
    }

    protected TPackingHCB xprepareCBAsPK(Long packingHId) {
        assertObjectNotNull("packingHId", packingHId);
        return newConditionBean().acceptPK(packingHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TPackingH&gt; <span style="color: #553000">tPackingHList</span> = <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TPackingH tPackingH : <span style="color: #553000">tPackingHList</span>) {
     *     ... = tPackingH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TPackingH> selectList(TPackingHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TPackingH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TPackingH tPackingH : <span style="color: #553000">page</span>) {
     *     ... = tPackingH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TPackingH> selectPage(TPackingHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @param entityRowHandler The handler of entity row of TPackingH. (NotNull)
     */
    public void selectCursor(TPackingHCB cb, EntityRowHandler<TPackingH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TPackingHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TPackingHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tPackingHList The entity list of TPackingH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TPackingH> tPackingHList, ReferrerLoaderHandler<LoaderOfTPackingH> loaderLambda) {
        xassLRArg(tPackingHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTPackingH().ready(tPackingHList, _behaviorSelector));
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
     * @param tPackingH The entity of TPackingH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TPackingH tPackingH, ReferrerLoaderHandler<LoaderOfTPackingH> loaderLambda) {
        xassLRArg(tPackingH, loaderLambda);
        loaderLambda.handle(new LoaderOfTPackingH().ready(xnewLRAryLs(tPackingH), _behaviorSelector));
    }

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">tPackingHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPackingH tPackingH : <span style="color: #553000">tPackingHList</span>) {
     *     ... = tPackingH.<span style="color: #CC4747">getTPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param tPackingHList The entity list of TPackingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(List<TPackingH> tPackingHList, ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        xassLRArg(tPackingHList, refCBLambda);
        return doLoadTPackingBList(tPackingHList, new LoadReferrerOption<TPackingBCB, TPackingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">tPackingH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPackingH</span>.<span style="color: #CC4747">getTPackingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param tPackingH The entity of TPackingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(TPackingH tPackingH, ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        xassLRArg(tPackingH, refCBLambda);
        return doLoadTPackingBList(xnewLRLs(tPackingH), new LoadReferrerOption<TPackingBCB, TPackingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPackingH The entity of TPackingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(TPackingH tPackingH, LoadReferrerOption<TPackingBCB, TPackingB> loadReferrerOption) {
        xassLRArg(tPackingH, loadReferrerOption);
        return loadTPackingBList(xnewLRLs(tPackingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPackingHList The entity list of TPackingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingB> loadTPackingBList(List<TPackingH> tPackingHList, LoadReferrerOption<TPackingBCB, TPackingB> loadReferrerOption) {
        xassLRArg(tPackingHList, loadReferrerOption);
        if (tPackingHList.isEmpty()) { return (NestedReferrerListGateway<TPackingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingBList(tPackingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingB> doLoadTPackingBList(List<TPackingH> tPackingHList, LoadReferrerOption<TPackingBCB, TPackingB> option) {
        return helpLoadReferrerInternally(tPackingHList, option, "tPackingBList");
    }

    /**
     * Load referrer of TPicMthdRcmdCartList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'.
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdCartList</span>(<span style="color: #553000">tPackingHList</span>, <span style="color: #553000">cartCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cartCB</span>.setupSelect...
     *     <span style="color: #553000">cartCB</span>.query().set...
     *     <span style="color: #553000">cartCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPackingH tPackingH : <span style="color: #553000">tPackingHList</span>) {
     *     ... = tPackingH.<span style="color: #CC4747">getTPicMthdRcmdCartList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param tPackingHList The entity list of TPackingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(List<TPackingH> tPackingHList, ConditionBeanSetupper<TPicMthdRcmdCartCB> refCBLambda) {
        xassLRArg(tPackingHList, refCBLambda);
        return doLoadTPicMthdRcmdCartList(tPackingHList, new LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdCartList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'.
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdCartList</span>(<span style="color: #553000">tPackingH</span>, <span style="color: #553000">cartCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cartCB</span>.setupSelect...
     *     <span style="color: #553000">cartCB</span>.query().set...
     *     <span style="color: #553000">cartCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPackingH</span>.<span style="color: #CC4747">getTPicMthdRcmdCartList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param tPackingH The entity of TPackingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(TPackingH tPackingH, ConditionBeanSetupper<TPicMthdRcmdCartCB> refCBLambda) {
        xassLRArg(tPackingH, refCBLambda);
        return doLoadTPicMthdRcmdCartList(xnewLRLs(tPackingH), new LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPackingH The entity of TPackingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(TPackingH tPackingH, LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart> loadReferrerOption) {
        xassLRArg(tPackingH, loadReferrerOption);
        return loadTPicMthdRcmdCartList(xnewLRLs(tPackingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPackingHList The entity list of TPackingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(List<TPackingH> tPackingHList, LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart> loadReferrerOption) {
        xassLRArg(tPackingHList, loadReferrerOption);
        if (tPackingHList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmdCart>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdCartList(tPackingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmdCart> doLoadTPicMthdRcmdCartList(List<TPackingH> tPackingHList, LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart> option) {
        return helpLoadReferrerInternally(tPackingHList, option, "tPicMthdRcmdCartList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TPickingH'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPickingH> pulloutTPickingH(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "tPickingH"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MBox'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MBox> pulloutMBox(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "mBox"); }

    /**
     * Pull out the list of foreign table 'TAllocInstH'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TAllocInstH> pulloutTAllocInstH(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "tAllocInstH"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUserByUpdUser(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "bUserByUpdUser"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLoadingFlg(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "bClassDtlByLoadingFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMixedFlg(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "bClassDtlByMixedFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMultiPicFlg(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "bClassDtlByMultiPicFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPackingStatus(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "bClassDtlByPackingStatus"); }

    /**
     * Pull out the list of referrer-as-one table 'TPackingR'.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPackingR> pulloutTPackingRAsOne(List<TPackingH> tPackingHList)
    { return helpPulloutInternally(tPackingHList, "tPackingRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key packingHId.
     * @param tPackingHList The list of tPackingH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPackingHIdList(List<TPackingH> tPackingHList)
    { return helpExtractListInternally(tPackingHList, "packingHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tPackingH.setFoo...(value);
     * tPackingH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPackingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPackingH.set...;</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">insert</span>(tPackingH);
     * ... = tPackingH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tPackingH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TPackingH tPackingH) {
        doInsert(tPackingH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPackingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPackingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPackingH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPackingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">update</span>(tPackingH);
     * </pre>
     * @param tPackingH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TPackingH tPackingH) {
        doUpdate(tPackingH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPackingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPackingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPackingH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPackingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tPackingH);
     * </pre>
     * @param tPackingH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TPackingH tPackingH) {
        doUpdateNonstrict(tPackingH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tPackingH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TPackingH tPackingH) {
        doInsertOrUpdate(tPackingH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tPackingH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TPackingH tPackingH) {
        doInsertOrUpdateNonstrict(tPackingH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPackingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">delete</span>(tPackingH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tPackingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TPackingH tPackingH) {
        doDelete(tPackingH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPackingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tPackingH);
     * </pre>
     * @param tPackingH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TPackingH tPackingH) {
        doDeleteNonstrict(tPackingH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPackingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tPackingH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tPackingH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TPackingH tPackingH) {
        doDeleteNonstrictIgnoreDeleted(tPackingH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TPackingH et, final DeleteOption<TPackingHCB> op) {
        assertObjectNotNull("tPackingH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     *     tPackingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPackingH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tPackingHList.add(tPackingH);
     * }
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tPackingHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TPackingH> tPackingHList) {
        return doBatchInsert(tPackingHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     *     tPackingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPackingH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tPackingH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tPackingH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tPackingHList.add(tPackingH);
     * }
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPackingHList);
     * </pre>
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TPackingH> tPackingHList) {
        return doBatchUpdate(tPackingHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tPackingHBhv.<span style="color: #CC4747">batchUpdate</span>(tPackingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPackingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TPackingH> tPackingHList, SpecifyQuery<TPackingHCB> colCBLambda) {
        return doBatchUpdate(tPackingHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     *     tPackingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPackingH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tPackingH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tPackingH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tPackingHList.add(tPackingH);
     * }
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPackingHList);
     * </pre>
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TPackingH> tPackingHList) {
        return doBatchUpdateNonstrict(tPackingHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tPackingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tPackingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TPackingH> tPackingHList, SpecifyQuery<TPackingHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tPackingHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TPackingH> tPackingHList) {
        return doBatchDelete(tPackingHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TPackingH> tPackingHList) {
        return doBatchDeleteNonstrict(tPackingHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TPackingH, TPackingHCB&gt;() {
     *     public ConditionBean setup(TPackingH entity, TPackingHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TPackingH, TPackingHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tPackingH.setPK...(value);</span>
     * tPackingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPackingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPackingH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPackingH.setVersionNo(value);</span>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tPackingH, cb);
     * </pre>
     * @param tPackingH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TPackingH tPackingH, TPackingHCB cb) {
        return doQueryUpdate(tPackingH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TPackingHCB cb = new TPackingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tPackingH, cb);
     * </pre>
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TPackingHCB cb) {
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
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tPackingH.setFoo...(value);
     * tPackingH.setBar...(value);
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tPackingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tPackingH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tPackingH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TPackingH tPackingH, WritableOptionCall<TPackingHCB, InsertOption<TPackingHCB>> opLambda) {
        doInsert(tPackingH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPackingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPackingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tPackingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tPackingH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TPackingH tPackingH, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> opLambda) {
        doUpdate(tPackingH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * tPackingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPackingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPackingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tPackingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tPackingH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TPackingH tPackingH, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> opLambda) {
        doUpdateNonstrict(tPackingH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tPackingH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TPackingH tPackingH, WritableOptionCall<TPackingHCB, InsertOption<TPackingHCB>> insertOpLambda, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> updateOpLambda) {
        doInsertOrUpdate(tPackingH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tPackingH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TPackingH tPackingH, WritableOptionCall<TPackingHCB, InsertOption<TPackingHCB>> insertOpLambda, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tPackingH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tPackingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TPackingH tPackingH, WritableOptionCall<TPackingHCB, DeleteOption<TPackingHCB>> opLambda) {
        doDelete(tPackingH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tPackingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TPackingH tPackingH, WritableOptionCall<TPackingHCB, DeleteOption<TPackingHCB>> opLambda) {
        doDeleteNonstrict(tPackingH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TPackingH> tPackingHList, WritableOptionCall<TPackingHCB, InsertOption<TPackingHCB>> opLambda) {
        return doBatchInsert(tPackingHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TPackingH> tPackingHList, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> opLambda) {
        return doBatchUpdate(tPackingHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TPackingH> tPackingHList, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> opLambda) {
        return doBatchUpdateNonstrict(tPackingHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TPackingH> tPackingHList, WritableOptionCall<TPackingHCB, DeleteOption<TPackingHCB>> opLambda) {
        return doBatchDelete(tPackingHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tPackingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TPackingH> tPackingHList, WritableOptionCall<TPackingHCB, DeleteOption<TPackingHCB>> opLambda) {
        return doBatchDeleteNonstrict(tPackingHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TPackingH, TPackingHCB> manyArgLambda, WritableOptionCall<TPackingHCB, InsertOption<TPackingHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TPackingH tPackingH = <span style="color: #70226C">new</span> TPackingH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tPackingH.setPK...(value);</span>
     * tPackingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPackingH.setVersionNo(value);</span>
     * TPackingHCB cb = <span style="color: #70226C">new</span> TPackingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tPackingH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tPackingH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TPackingH tPackingH, TPackingHCB cb, WritableOptionCall<TPackingHCB, UpdateOption<TPackingHCB>> opLambda) {
        return doQueryUpdate(tPackingH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TPackingH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TPackingHCB cb, WritableOptionCall<TPackingHCB, DeleteOption<TPackingHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tPackingHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tPackingHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tPackingHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tPackingHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tPackingHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tPackingHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tPackingHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tPackingHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tPackingHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tPackingHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tPackingHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tPackingHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tPackingHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tPackingHBhv.outideSql().removeBlockComment().selectList()
     * tPackingHBhv.outideSql().removeLineComment().selectList()
     * tPackingHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TPackingHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TPackingHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TPackingH> typeOfSelectedEntity() { return TPackingH.class; }
    protected Class<TPackingH> typeOfHandlingEntity() { return TPackingH.class; }
    protected Class<TPackingHCB> typeOfHandlingConditionBean() { return TPackingHCB.class; }
}
