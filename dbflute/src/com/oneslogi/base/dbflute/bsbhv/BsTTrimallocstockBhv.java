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
 * The behavior of T_TRIMALLOCSTOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRIMALLOCSTOCK_ID
 *
 * [column]
 *     TRIMALLOCSTOCK_ID, TRIMALLOC_H_ID, STOCK_ID, ALLOC_IMP_KEY, ALC_IMP_STKG_NO, LOCATION_CD, DESIGN_FLG, MANUFACTUREDATE, MONTH_FLG, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSTOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STOCK
 *
 * [referrer table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign property]
 *     tStock
 *
 * [referrer property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrimallocstockBhv extends AbstractBehaviorWritable<TTrimallocstock, TTrimallocstockCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrimallocstockDbm asDBMeta() { return TTrimallocstockDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRIMALLOCSTOCK"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrimallocstockDbm getMyDBMeta() { return TTrimallocstockDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrimallocstockCB newConditionBean() { return new TTrimallocstockCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrimallocstock newMyEntity() { return new TTrimallocstock(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrimallocstockCB newMyConditionBean() { return new TTrimallocstockCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrimallocstockCB cb) {
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
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().setFoo...(value);
     * TTrimallocstock tTrimallocstock = <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrimallocstock != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrimallocstock.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocstock selectEntity(TTrimallocstockCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrimallocstock facadeSelectEntity(TTrimallocstockCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrimallocstock> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrimallocstockCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().set...;
     * TTrimallocstock tTrimallocstock = <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrimallocstock.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocstock selectEntityWithDeletedCheck(TTrimallocstockCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trimallocstockId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocstock selectByPKValue(Long trimallocstockId) {
        return facadeSelectByPKValue(trimallocstockId);
    }

    protected TTrimallocstock facadeSelectByPKValue(Long trimallocstockId) {
        return doSelectByPK(trimallocstockId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrimallocstock> ENTITY doSelectByPK(Long trimallocstockId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trimallocstockId), tp);
    }

    protected <ENTITY extends TTrimallocstock> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trimallocstockId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trimallocstockId, tp), trimallocstockId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trimallocstockId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrimallocstock selectByPKValueWithDeletedCheck(Long trimallocstockId) {
        return doSelectByPKWithDeletedCheck(trimallocstockId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrimallocstock> ENTITY doSelectByPKWithDeletedCheck(Long trimallocstockId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trimallocstockId), tp);
    }

    protected TTrimallocstockCB xprepareCBAsPK(Long trimallocstockId) {
        assertObjectNotNull("trimallocstockId", trimallocstockId);
        return newConditionBean().acceptPK(trimallocstockId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrimallocstock&gt; <span style="color: #553000">tTrimallocstockList</span> = <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrimallocstock tTrimallocstock : <span style="color: #553000">tTrimallocstockList</span>) {
     *     ... = tTrimallocstock.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrimallocstock> selectList(TTrimallocstockCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrimallocstock&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrimallocstock tTrimallocstock : <span style="color: #553000">page</span>) {
     *     ... = tTrimallocstock.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrimallocstock> selectPage(TTrimallocstockCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrimallocstock. (NotNull)
     */
    public void selectCursor(TTrimallocstockCB cb, EntityRowHandler<TTrimallocstock> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrimallocstockCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrimallocstockCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrimallocstockList The entity list of TTrimallocstock. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrimallocstock> tTrimallocstockList, ReferrerLoaderHandler<LoaderOfTTrimallocstock> loaderLambda) {
        xassLRArg(tTrimallocstockList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrimallocstock().ready(tTrimallocstockList, _behaviorSelector));
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
     * @param tTrimallocstock The entity of TTrimallocstock. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrimallocstock tTrimallocstock, ReferrerLoaderHandler<LoaderOfTTrimallocstock> loaderLambda) {
        xassLRArg(tTrimallocstock, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrimallocstock().ready(xnewLRAryLs(tTrimallocstock), _behaviorSelector));
    }

    /**
     * Load referrer of TTrimallocadjustList by the set-upper of referrer. <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">loadTTrimallocadjustList</span>(<span style="color: #553000">tTrimallocstockList</span>, <span style="color: #553000">trimallocadjustCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocadjustCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().set...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TTrimallocstock tTrimallocstock : <span style="color: #553000">tTrimallocstockList</span>) {
     *     ... = tTrimallocstock.<span style="color: #CC4747">getTTrimallocadjustList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocstockId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocstockId_Asc();
     * </pre>
     * @param tTrimallocstockList The entity list of TTrimallocstock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(List<TTrimallocstock> tTrimallocstockList, ConditionBeanSetupper<TTrimallocadjustCB> refCBLambda) {
        xassLRArg(tTrimallocstockList, refCBLambda);
        return doLoadTTrimallocadjustList(tTrimallocstockList, new LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrimallocadjustList by the set-upper of referrer. <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSTOCK_ID, named 'TTrimallocadjustList'.
     * <pre>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">loadTTrimallocadjustList</span>(<span style="color: #553000">tTrimallocstock</span>, <span style="color: #553000">trimallocadjustCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocadjustCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().set...
     *     <span style="color: #553000">trimallocadjustCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tTrimallocstock</span>.<span style="color: #CC4747">getTTrimallocadjustList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrimallocstockId_InScope(pkList);
     * cb.query().addOrderBy_TrimallocstockId_Asc();
     * </pre>
     * @param tTrimallocstock The entity of TTrimallocstock. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(TTrimallocstock tTrimallocstock, ConditionBeanSetupper<TTrimallocadjustCB> refCBLambda) {
        xassLRArg(tTrimallocstock, refCBLambda);
        return doLoadTTrimallocadjustList(xnewLRLs(tTrimallocstock), new LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tTrimallocstock The entity of TTrimallocstock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(TTrimallocstock tTrimallocstock, LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust> loadReferrerOption) {
        xassLRArg(tTrimallocstock, loadReferrerOption);
        return loadTTrimallocadjustList(xnewLRLs(tTrimallocstock), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tTrimallocstockList The entity list of TTrimallocstock. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrimallocadjust> loadTTrimallocadjustList(List<TTrimallocstock> tTrimallocstockList, LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust> loadReferrerOption) {
        xassLRArg(tTrimallocstockList, loadReferrerOption);
        if (tTrimallocstockList.isEmpty()) { return (NestedReferrerListGateway<TTrimallocadjust>)EMPTY_NREF_LGWAY; }
        return doLoadTTrimallocadjustList(tTrimallocstockList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrimallocadjust> doLoadTTrimallocadjustList(List<TTrimallocstock> tTrimallocstockList, LoadReferrerOption<TTrimallocadjustCB, TTrimallocadjust> option) {
        return helpLoadReferrerInternally(tTrimallocstockList, option, "tTrimallocadjustList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TStock'.
     * @param tTrimallocstockList The list of tTrimallocstock. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStock> pulloutTStock(List<TTrimallocstock> tTrimallocstockList)
    { return helpPulloutInternally(tTrimallocstockList, "tStock"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trimallocstockId.
     * @param tTrimallocstockList The list of tTrimallocstock. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrimallocstockIdList(List<TTrimallocstock> tTrimallocstockList)
    { return helpExtractListInternally(tTrimallocstockList, "trimallocstockId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrimallocstock.setFoo...(value);
     * tTrimallocstock.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.set...;</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">insert</span>(tTrimallocstock);
     * ... = tTrimallocstock.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrimallocstock The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrimallocstock tTrimallocstock) {
        doInsert(tTrimallocstock, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocstock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrimallocstock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">update</span>(tTrimallocstock);
     * </pre>
     * @param tTrimallocstock The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrimallocstock tTrimallocstock) {
        doUpdate(tTrimallocstock, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocstock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrimallocstock);
     * </pre>
     * @param tTrimallocstock The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrimallocstock tTrimallocstock) {
        doUpdateNonstrict(tTrimallocstock, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrimallocstock The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrimallocstock tTrimallocstock) {
        doInsertOrUpdate(tTrimallocstock, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrimallocstock The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrimallocstock tTrimallocstock) {
        doInsertOrUpdateNonstrict(tTrimallocstock, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrimallocstock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">delete</span>(tTrimallocstock);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrimallocstock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrimallocstock tTrimallocstock) {
        doDelete(tTrimallocstock, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrimallocstock);
     * </pre>
     * @param tTrimallocstock The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrimallocstock tTrimallocstock) {
        doDeleteNonstrict(tTrimallocstock, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrimallocstock);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrimallocstock The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrimallocstock tTrimallocstock) {
        doDeleteNonstrictIgnoreDeleted(tTrimallocstock, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrimallocstock et, final DeleteOption<TTrimallocstockCB> op) {
        assertObjectNotNull("tTrimallocstock", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     *     tTrimallocstock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrimallocstock.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrimallocstockList.add(tTrimallocstock);
     * }
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrimallocstockList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrimallocstock> tTrimallocstockList) {
        return doBatchInsert(tTrimallocstockList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     *     tTrimallocstock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrimallocstock.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrimallocstock.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrimallocstock.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrimallocstockList.add(tTrimallocstock);
     * }
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrimallocstockList);
     * </pre>
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrimallocstock> tTrimallocstockList) {
        return doBatchUpdate(tTrimallocstockList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrimallocstockBhv.<span style="color: #CC4747">batchUpdate</span>(tTrimallocstockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrimallocstockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrimallocstock> tTrimallocstockList, SpecifyQuery<TTrimallocstockCB> colCBLambda) {
        return doBatchUpdate(tTrimallocstockList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     *     tTrimallocstock.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrimallocstock.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrimallocstock.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrimallocstock.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrimallocstockList.add(tTrimallocstock);
     * }
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrimallocstockList);
     * </pre>
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrimallocstock> tTrimallocstockList) {
        return doBatchUpdateNonstrict(tTrimallocstockList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrimallocstockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrimallocstockList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrimallocstock> tTrimallocstockList, SpecifyQuery<TTrimallocstockCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrimallocstockList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrimallocstock> tTrimallocstockList) {
        return doBatchDelete(tTrimallocstockList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrimallocstock> tTrimallocstockList) {
        return doBatchDeleteNonstrict(tTrimallocstockList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrimallocstock, TTrimallocstockCB&gt;() {
     *     public ConditionBean setup(TTrimallocstock entity, TTrimallocstockCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrimallocstock, TTrimallocstockCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setPK...(value);</span>
     * tTrimallocstock.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setVersionNo(value);</span>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrimallocstock, cb);
     * </pre>
     * @param tTrimallocstock The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrimallocstock tTrimallocstock, TTrimallocstockCB cb) {
        return doQueryUpdate(tTrimallocstock, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrimallocstockCB cb = new TTrimallocstockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrimallocstock, cb);
     * </pre>
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrimallocstockCB cb) {
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
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrimallocstock.setFoo...(value);
     * tTrimallocstock.setBar...(value);
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrimallocstock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrimallocstock.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrimallocstock The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, InsertOption<TTrimallocstockCB>> opLambda) {
        doInsert(tTrimallocstock, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocstock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrimallocstock.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrimallocstock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrimallocstock The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> opLambda) {
        doUpdate(tTrimallocstock, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * tTrimallocstock.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrimallocstock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrimallocstock, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrimallocstock The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> opLambda) {
        doUpdateNonstrict(tTrimallocstock, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrimallocstock The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, InsertOption<TTrimallocstockCB>> insertOpLambda, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> updateOpLambda) {
        doInsertOrUpdate(tTrimallocstock, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrimallocstock The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, InsertOption<TTrimallocstockCB>> insertOpLambda, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrimallocstock, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrimallocstock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, DeleteOption<TTrimallocstockCB>> opLambda) {
        doDelete(tTrimallocstock, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrimallocstock The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrimallocstock tTrimallocstock, WritableOptionCall<TTrimallocstockCB, DeleteOption<TTrimallocstockCB>> opLambda) {
        doDeleteNonstrict(tTrimallocstock, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrimallocstock> tTrimallocstockList, WritableOptionCall<TTrimallocstockCB, InsertOption<TTrimallocstockCB>> opLambda) {
        return doBatchInsert(tTrimallocstockList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrimallocstock> tTrimallocstockList, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> opLambda) {
        return doBatchUpdate(tTrimallocstockList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrimallocstock> tTrimallocstockList, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrimallocstockList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrimallocstock> tTrimallocstockList, WritableOptionCall<TTrimallocstockCB, DeleteOption<TTrimallocstockCB>> opLambda) {
        return doBatchDelete(tTrimallocstockList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrimallocstockList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrimallocstock> tTrimallocstockList, WritableOptionCall<TTrimallocstockCB, DeleteOption<TTrimallocstockCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrimallocstockList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrimallocstock, TTrimallocstockCB> manyArgLambda, WritableOptionCall<TTrimallocstockCB, InsertOption<TTrimallocstockCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrimallocstock tTrimallocstock = <span style="color: #70226C">new</span> TTrimallocstock();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setPK...(value);</span>
     * tTrimallocstock.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrimallocstock.setVersionNo(value);</span>
     * TTrimallocstockCB cb = <span style="color: #70226C">new</span> TTrimallocstockCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrimallocstockBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrimallocstock, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrimallocstock The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrimallocstock tTrimallocstock, TTrimallocstockCB cb, WritableOptionCall<TTrimallocstockCB, UpdateOption<TTrimallocstockCB>> opLambda) {
        return doQueryUpdate(tTrimallocstock, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrimallocstock. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrimallocstockCB cb, WritableOptionCall<TTrimallocstockCB, DeleteOption<TTrimallocstockCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrimallocstockBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrimallocstockBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrimallocstockBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrimallocstockBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrimallocstockBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrimallocstockBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrimallocstockBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrimallocstockBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrimallocstockBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrimallocstockBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrimallocstockBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrimallocstockBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrimallocstockBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrimallocstockBhv.outideSql().removeBlockComment().selectList()
     * tTrimallocstockBhv.outideSql().removeLineComment().selectList()
     * tTrimallocstockBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrimallocstockBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrimallocstockBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrimallocstock> typeOfSelectedEntity() { return TTrimallocstock.class; }
    protected Class<TTrimallocstock> typeOfHandlingEntity() { return TTrimallocstock.class; }
    protected Class<TTrimallocstockCB> typeOfHandlingConditionBean() { return TTrimallocstockCB.class; }
}
