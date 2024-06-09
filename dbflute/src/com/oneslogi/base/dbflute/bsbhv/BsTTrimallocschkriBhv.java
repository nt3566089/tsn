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
 * The behavior of T_TRIMALLOCSCHKRI as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIMALLOCSCH_ID
 *
 * [column]
 *     TRIMALLOCSCH_ID, TRIMALLOC_H_ID, TRSODETAIL_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_No, LOCATION_ID, LOCATION_CD, EXPECT_QTY, MANUFACTUREDATE, DESIGN_FLG, ALCIMEXP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSCH_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRIMALLOC_H, T_YTRSODETAIL
 *
 * [referrer table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign property]
 *     tTrimallocH, tYtrsodetail
 *
 * [referrer property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrimallocschkriBhv extends AbstractBehaviorWritable<TTrimallocschkri, TTrimallocschkriCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrimallocschkriDbm asDBMeta() { return TTrimallocschkriDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRIMALLOCSCHKRI"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrimallocschkriDbm getMyDBMeta() { return TTrimallocschkriDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrimallocschkriCB newConditionBean() { return new TTrimallocschkriCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrimallocschkri newMyEntity() { return new TTrimallocschkri(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrimallocschkriCB newMyConditionBean() { return new TTrimallocschkriCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrimallocschkriCB cb) {
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
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().setFoo...(value);
     * TTrimallocschkri tTrimallocschkri = <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrimallocschkri != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrimallocschkri.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocschkri selectEntity(TTrimallocschkriCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrimallocschkri facadeSelectEntity(TTrimallocschkriCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrimallocschkri> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrimallocschkriCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().set...;
     * TTrimallocschkri tTrimallocschkri = <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrimallocschkri.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocschkri selectEntityWithDeletedCheck(TTrimallocschkriCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trimallocschId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocschkri selectByPKValue(Long trimallocschId) {
        return facadeSelectByPKValue(trimallocschId);
    }

    protected TTrimallocschkri facadeSelectByPKValue(Long trimallocschId) {
        return doSelectByPK(trimallocschId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrimallocschkri> ENTITY doSelectByPK(Long trimallocschId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trimallocschId), tp);
    }

    protected <ENTITY extends TTrimallocschkri> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trimallocschId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trimallocschId, tp), trimallocschId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trimallocschId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocschkri selectByPKValueWithDeletedCheck(Long trimallocschId) {
        return doSelectByPKWithDeletedCheck(trimallocschId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrimallocschkri> ENTITY doSelectByPKWithDeletedCheck(Long trimallocschId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trimallocschId), tp);
    }

    protected TTrimallocschkriCB xprepareCBAsPK(Long trimallocschId) {
        assertObjectNotNull("trimallocschId", trimallocschId);
        return newConditionBean().acceptPK(trimallocschId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrimallocschkri&gt; <span style="color: #553000">tTrimallocschkriList</span> = <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrimallocschkri tTrimallocschkri : <span style="color: #553000">tTrimallocschkriList</span>) {
     *     ... = tTrimallocschkri.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrimallocschkri> selectList(TTrimallocschkriCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrimallocschkri&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrimallocschkri tTrimallocschkri : <span style="color: #553000">page</span>) {
     *     ... = tTrimallocschkri.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrimallocschkri> selectPage(TTrimallocschkriCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrimallocschkri. (NotNull)
     */
    public void selectCursor(TTrimallocschkriCB cb, EntityRowHandler<TTrimallocschkri> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrimallocschkriCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrimallocschkriCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrimallocschkriList The entity list of TTrimallocschkri. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrimallocschkri> tTrimallocschkriList, ReferrerLoaderHandler<LoaderOfTTrimallocschkri> loaderLambda) {
        xassLRArg(tTrimallocschkriList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrimallocschkri().ready(tTrimallocschkriList, _behaviorSelector));
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
     * @param tTrimallocschkri The entity of TTrimallocschkri. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrimallocschkri tTrimallocschkri, ReferrerLoaderHandler<LoaderOfTTrimallocschkri> loaderLambda) {
        xassLRArg(tTrimallocschkri, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrimallocschkri().ready(xnewLRAryLs(tTrimallocschkri), _behaviorSelector));
    }

    /**
     * Load referrer of TTrimallocadjustList by the set-upper of referrer. <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">loadTTrimallocadjustList</span>(<span style="color: #553000">tTrimallocschkriList</span>, <span style="color: #553000">trimallocadjustCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocadjustCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().set...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TTrimallocschkri tTrimallocschkri : <span style="color: #553000">tTrimallocschkriList</span>) {
     *     ... = tTrimallocschkri.<span style="color: #CC4747">getTTrimallocadjustList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocschId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocschId_Asc();
     * </pre>
     * @param tTrimallocschkriList The entity list of TTrimallocschkri. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(List<TTrimallocschkri> tTrimallocschkriList, ConditionBeanSetupper<TTrimallocadjustCB> refCBLambda) {
        xassLRArg(tTrimallocschkriList, refCBLambda);
        return doLoadTTrimallocadjustList(tTrimallocschkriList, new LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrimallocadjustList by the set-upper of referrer. <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">loadTTrimallocadjustList</span>(<span style="color: #553000">tTrimallocschkri</span>, <span style="color: #553000">trimallocadjustCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocadjustCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().set...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tTrimallocschkri</span>.<span style="color: #CC4747">getTTrimallocadjustList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocschId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocschId_Asc();
     * </pre>
     * @param tTrimallocschkri The entity of TTrimallocschkri. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(TTrimallocschkri tTrimallocschkri, ConditionBeanSetupper<TTrimallocadjustCB> refCBLambda) {
        xassLRArg(tTrimallocschkri, refCBLambda);
        return doLoadTTrimallocadjustList(xnewLRLs(tTrimallocschkri), new LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tTrimallocschkri The entity of TTrimallocschkri. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(TTrimallocschkri tTrimallocschkri, LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust> loadReferrerOption) {
        xassLRArg(tTrimallocschkri, loadReferrerOption);
        return loadTTrimallocadjustList(xnewLRLs(tTrimallocschkri), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tTrimallocschkriList The entity list of TTrimallocschkri. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(List<TTrimallocschkri> tTrimallocschkriList, LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust> loadReferrerOption) {
        xassLRArg(tTrimallocschkriList, loadReferrerOption);
        if (tTrimallocschkriList.isEmpty()) { return (NestedReferrerListGateway<TTrimallocadjust>)EMPTY_NREF_LGWAY; }
        return doLoadTTrimallocadjustList(tTrimallocschkriList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrimallocadjust> doLoadTTrimallocadjustList(List<TTrimallocschkri> tTrimallocschkriList, LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust> option) {
        return helpLoadReferrerInternally(tTrimallocschkriList, option, "tTrimallocadjustList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TTrimallocH'.
     * @param tTrimallocschkriList The list of tTrimallocschkri. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TTrimallocH> pulloutTTrimallocH(List<TTrimallocschkri> tTrimallocschkriList)
    { return helpPulloutInternally(tTrimallocschkriList, "tTrimallocH"); }

    /**
     * Pull out the list of foreign table 'TYtrsodetail'.
     * @param tTrimallocschkriList The list of tTrimallocschkri. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TYtrsodetail> pulloutTYtrsodetail(List<TTrimallocschkri> tTrimallocschkriList)
    { return helpPulloutInternally(tTrimallocschkriList, "tYtrsodetail"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trimallocschId.
     * @param tTrimallocschkriList The list of tTrimallocschkri. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrimallocschIdList(List<TTrimallocschkri> tTrimallocschkriList)
    { return helpExtractListInternally(tTrimallocschkriList, "trimallocschId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrimallocschkri.setFoo...(value);
     * tTrimallocschkri.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.set...;</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">insert</span>(tTrimallocschkri);
     * ... = tTrimallocschkri.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrimallocschkri The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrimallocschkri tTrimallocschkri) {
        doInsert(tTrimallocschkri, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocschkri.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrimallocschkri.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">update</span>(tTrimallocschkri);
     * </pre>
     * @param tTrimallocschkri The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrimallocschkri tTrimallocschkri) {
        doUpdate(tTrimallocschkri, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocschkri.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrimallocschkri);
     * </pre>
     * @param tTrimallocschkri The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrimallocschkri tTrimallocschkri) {
        doUpdateNonstrict(tTrimallocschkri, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrimallocschkri The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrimallocschkri tTrimallocschkri) {
        doInsertOrUpdate(tTrimallocschkri, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrimallocschkri The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrimallocschkri tTrimallocschkri) {
        doInsertOrUpdateNonstrict(tTrimallocschkri, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrimallocschkri.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">delete</span>(tTrimallocschkri);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrimallocschkri The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrimallocschkri tTrimallocschkri) {
        doDelete(tTrimallocschkri, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrimallocschkri);
     * </pre>
     * @param tTrimallocschkri The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrimallocschkri tTrimallocschkri) {
        doDeleteNonstrict(tTrimallocschkri, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrimallocschkri);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrimallocschkri The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrimallocschkri tTrimallocschkri) {
        doDeleteNonstrictIgnoreDeleted(tTrimallocschkri, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrimallocschkri et, final DeleteOption<TTrimallocschkriCB> op) {
        assertObjectNotNull("tTrimallocschkri", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     *     tTrimallocschkri.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrimallocschkri.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrimallocschkriList.add(tTrimallocschkri);
     * }
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrimallocschkriList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrimallocschkri> tTrimallocschkriList) {
        return doBatchInsert(tTrimallocschkriList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     *     tTrimallocschkri.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrimallocschkri.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrimallocschkri.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrimallocschkri.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrimallocschkriList.add(tTrimallocschkri);
     * }
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrimallocschkriList);
     * </pre>
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrimallocschkri> tTrimallocschkriList) {
        return doBatchUpdate(tTrimallocschkriList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrimallocschkriBhv.<span style="color: #CC4747">batchUpdate</span>(tTrimallocschkriList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrimallocschkriList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrimallocschkri> tTrimallocschkriList, SpecifyQuery<TTrimallocschkriCB> colCBLambda) {
        return doBatchUpdate(tTrimallocschkriList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     *     tTrimallocschkri.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrimallocschkri.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrimallocschkri.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrimallocschkri.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrimallocschkriList.add(tTrimallocschkri);
     * }
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrimallocschkriList);
     * </pre>
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrimallocschkri> tTrimallocschkriList) {
        return doBatchUpdateNonstrict(tTrimallocschkriList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrimallocschkriList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrimallocschkriList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrimallocschkri> tTrimallocschkriList, SpecifyQuery<TTrimallocschkriCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrimallocschkriList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrimallocschkri> tTrimallocschkriList) {
        return doBatchDelete(tTrimallocschkriList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrimallocschkri> tTrimallocschkriList) {
        return doBatchDeleteNonstrict(tTrimallocschkriList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrimallocschkri, TTrimallocschkriCB&gt;() {
     *     public ConditionBean setup(TTrimallocschkri entity, TTrimallocschkriCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrimallocschkri, TTrimallocschkriCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setPK...(value);</span>
     * tTrimallocschkri.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setVersionNo(value);</span>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrimallocschkri, cb);
     * </pre>
     * @param tTrimallocschkri The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrimallocschkri tTrimallocschkri, TTrimallocschkriCB cb) {
        return doQueryUpdate(tTrimallocschkri, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrimallocschkriCB cb = new TTrimallocschkriCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrimallocschkri, cb);
     * </pre>
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrimallocschkriCB cb) {
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
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrimallocschkri.setFoo...(value);
     * tTrimallocschkri.setBar...(value);
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrimallocschkri, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrimallocschkri.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrimallocschkri The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, InsertOption<TTrimallocschkriCB>> opLambda) {
        doInsert(tTrimallocschkri, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocschkri.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrimallocschkri.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrimallocschkri, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrimallocschkri The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> opLambda) {
        doUpdate(tTrimallocschkri, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * tTrimallocschkri.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocschkri.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrimallocschkri, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrimallocschkri The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> opLambda) {
        doUpdateNonstrict(tTrimallocschkri, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrimallocschkri The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, InsertOption<TTrimallocschkriCB>> insertOpLambda, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> updateOpLambda) {
        doInsertOrUpdate(tTrimallocschkri, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrimallocschkri The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, InsertOption<TTrimallocschkriCB>> insertOpLambda, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrimallocschkri, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrimallocschkri The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, DeleteOption<TTrimallocschkriCB>> opLambda) {
        doDelete(tTrimallocschkri, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrimallocschkri The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrimallocschkri tTrimallocschkri, WritableOptionCall<TTrimallocschkriCB, DeleteOption<TTrimallocschkriCB>> opLambda) {
        doDeleteNonstrict(tTrimallocschkri, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrimallocschkri> tTrimallocschkriList, WritableOptionCall<TTrimallocschkriCB, InsertOption<TTrimallocschkriCB>> opLambda) {
        return doBatchInsert(tTrimallocschkriList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrimallocschkri> tTrimallocschkriList, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> opLambda) {
        return doBatchUpdate(tTrimallocschkriList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrimallocschkri> tTrimallocschkriList, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrimallocschkriList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrimallocschkri> tTrimallocschkriList, WritableOptionCall<TTrimallocschkriCB, DeleteOption<TTrimallocschkriCB>> opLambda) {
        return doBatchDelete(tTrimallocschkriList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrimallocschkriList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrimallocschkri> tTrimallocschkriList, WritableOptionCall<TTrimallocschkriCB, DeleteOption<TTrimallocschkriCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrimallocschkriList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrimallocschkri, TTrimallocschkriCB> manyArgLambda, WritableOptionCall<TTrimallocschkriCB, InsertOption<TTrimallocschkriCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrimallocschkri tTrimallocschkri = <span style="color: #70226C">new</span> TTrimallocschkri();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setPK...(value);</span>
     * tTrimallocschkri.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocschkri.setVersionNo(value);</span>
     * TTrimallocschkriCB cb = <span style="color: #70226C">new</span> TTrimallocschkriCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrimallocschkriBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrimallocschkri, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrimallocschkri The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrimallocschkri tTrimallocschkri, TTrimallocschkriCB cb, WritableOptionCall<TTrimallocschkriCB, UpdateOption<TTrimallocschkriCB>> opLambda) {
        return doQueryUpdate(tTrimallocschkri, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrimallocschkri. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrimallocschkriCB cb, WritableOptionCall<TTrimallocschkriCB, DeleteOption<TTrimallocschkriCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrimallocschkriBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrimallocschkriBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrimallocschkriBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrimallocschkriBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrimallocschkriBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrimallocschkriBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrimallocschkriBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrimallocschkriBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrimallocschkriBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrimallocschkriBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrimallocschkriBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrimallocschkriBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrimallocschkriBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrimallocschkriBhv.outideSql().removeBlockComment().selectList()
     * tTrimallocschkriBhv.outideSql().removeLineComment().selectList()
     * tTrimallocschkriBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrimallocschkriBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrimallocschkriBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrimallocschkri> typeOfSelectedEntity() { return TTrimallocschkri.class; }
    protected Class<TTrimallocschkri> typeOfHandlingEntity() { return TTrimallocschkri.class; }
    protected Class<TTrimallocschkriCB> typeOfHandlingConditionBean() { return TTrimallocschkriCB.class; }
}
