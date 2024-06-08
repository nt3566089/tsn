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
 * The behavior of T_YTRSODETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSODETAIL_ID
 *
 * [column]
 *     TRSODETAIL_ID, TRSO_ID, PRODUCT_ID, SO_LINE_NO, PRODUCT_CD, IFITEM_CD, LOCATION_ID, LOCATION_CD, DAMAGE_FLG, NO_SHIPPING_FLG, EXPECT_QTY, ALLOC_QTY, PICKED_QTY, SORTED_QTY, INSPECTED_QTY, SHIPPED_QTY, ADJUST_QTY, LOC_FLG, STD_DIF_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSODETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_YTRSO, M_PRODUCT
 *
 * [referrer table]
 *     T_TRIMALLOCSCHKRI, T_TRPICKDETAIL
 *
 * [foreign property]
 *     tYtrso, mProduct
 *
 * [referrer property]
 *     tTrimallocschkriList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTYtrsodetailBhv extends AbstractBehaviorWritable<TYtrsodetail, TYtrsodetailCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TYtrsodetailDbm asDBMeta() { return TYtrsodetailDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_YTRSODETAIL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TYtrsodetailDbm getMyDBMeta() { return TYtrsodetailDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TYtrsodetailCB newConditionBean() { return new TYtrsodetailCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TYtrsodetail newMyEntity() { return new TYtrsodetail(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TYtrsodetailCB newMyConditionBean() { return new TYtrsodetailCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TYtrsodetailCB cb) {
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
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().setFoo...(value);
     * TYtrsodetail tYtrsodetail = <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tYtrsodetail != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tYtrsodetail.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYtrsodetail selectEntity(TYtrsodetailCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TYtrsodetail facadeSelectEntity(TYtrsodetailCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TYtrsodetail> OptionalEntity<ENTITY> doSelectOptionalEntity(TYtrsodetailCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().set...;
     * TYtrsodetail tYtrsodetail = <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tYtrsodetail.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYtrsodetail selectEntityWithDeletedCheck(TYtrsodetailCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trsodetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYtrsodetail selectByPKValue(Long trsodetailId) {
        return facadeSelectByPKValue(trsodetailId);
    }

    protected TYtrsodetail facadeSelectByPKValue(Long trsodetailId) {
        return doSelectByPK(trsodetailId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TYtrsodetail> ENTITY doSelectByPK(Long trsodetailId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trsodetailId), tp);
    }

    protected <ENTITY extends TYtrsodetail> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trsodetailId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trsodetailId, tp), trsodetailId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trsodetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYtrsodetail selectByPKValueWithDeletedCheck(Long trsodetailId) {
        return doSelectByPKWithDeletedCheck(trsodetailId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TYtrsodetail> ENTITY doSelectByPKWithDeletedCheck(Long trsodetailId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trsodetailId), tp);
    }

    protected TYtrsodetailCB xprepareCBAsPK(Long trsodetailId) {
        assertObjectNotNull("trsodetailId", trsodetailId);
        return newConditionBean().acceptPK(trsodetailId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TYtrsodetail&gt; <span style="color: #553000">tYtrsodetailList</span> = <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TYtrsodetail tYtrsodetail : <span style="color: #553000">tYtrsodetailList</span>) {
     *     ... = tYtrsodetail.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TYtrsodetail> selectList(TYtrsodetailCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TYtrsodetail&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TYtrsodetail tYtrsodetail : <span style="color: #553000">page</span>) {
     *     ... = tYtrsodetail.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TYtrsodetail> selectPage(TYtrsodetailCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().set...
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @param entityRowHandler The handler of entity row of TYtrsodetail. (NotNull)
     */
    public void selectCursor(TYtrsodetailCB cb, EntityRowHandler<TYtrsodetail> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TYtrsodetailCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TYtrsodetailCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tYtrsodetailList The entity list of TYtrsodetail. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TYtrsodetail> tYtrsodetailList, ReferrerLoaderHandler<LoaderOfTYtrsodetail> loaderLambda) {
        xassLRArg(tYtrsodetailList, loaderLambda);
        loaderLambda.handle(new LoaderOfTYtrsodetail().ready(tYtrsodetailList, _behaviorSelector));
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
     * @param tYtrsodetail The entity of TYtrsodetail. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TYtrsodetail tYtrsodetail, ReferrerLoaderHandler<LoaderOfTYtrsodetail> loaderLambda) {
        xassLRArg(tYtrsodetail, loaderLambda);
        loaderLambda.handle(new LoaderOfTYtrsodetail().ready(xnewLRAryLs(tYtrsodetail), _behaviorSelector));
    }

    /**
     * Load referrer of TTrimallocschkriList by the set-upper of referrer. <br>
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">loadTTrimallocschkriList</span>(<span style="color: #553000">tYtrsodetailList</span>, <span style="color: #553000">trimallocschkriCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocschkriCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocschkriCB</span>.query().set...
     *     <span style="color: #553000">trimallocschkriCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TYtrsodetail tYtrsodetail : <span style="color: #553000">tYtrsodetailList</span>) {
     *     ... = tYtrsodetail.<span style="color: #CC4747">getTTrimallocschkriList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsodetailId_InScope(pkList);
     * cb.query().addOrderBy_TrsodetailId_Asc();
     * </pre>
     * @param tYtrsodetailList The entity list of TYtrsodetail. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocschkri> loadTTrimallocschkriList(List<TYtrsodetail> tYtrsodetailList, ConditionBeanSetupper<TTrimallocschkriCB> refCBLambda) {
        xassLRArg(tYtrsodetailList, refCBLambda);
        return doLoadTTrimallocschkriList(tYtrsodetailList, new LoadReferrerOption<TTrimallocschkriCB, TTrimallocschkri>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrimallocschkriList by the set-upper of referrer. <br>
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">loadTTrimallocschkriList</span>(<span style="color: #553000">tYtrsodetail</span>, <span style="color: #553000">trimallocschkriCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trimallocschkriCB</span>.setupSelect...
     *     <span style="color: #553000">trimallocschkriCB</span>.query().set...
     *     <span style="color: #553000">trimallocschkriCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tYtrsodetail</span>.<span style="color: #CC4747">getTTrimallocschkriList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsodetailId_InScope(pkList);
     * cb.query().addOrderBy_TrsodetailId_Asc();
     * </pre>
     * @param tYtrsodetail The entity of TYtrsodetail. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocschkri> loadTTrimallocschkriList(TYtrsodetail tYtrsodetail, ConditionBeanSetupper<TTrimallocschkriCB> refCBLambda) {
        xassLRArg(tYtrsodetail, refCBLambda);
        return doLoadTTrimallocschkriList(xnewLRLs(tYtrsodetail), new LoadReferrerOption<TTrimallocschkriCB, TTrimallocschkri>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tYtrsodetail The entity of TYtrsodetail. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrimallocschkri> loadTTrimallocschkriList(TYtrsodetail tYtrsodetail, LoadReferrerOption<TTrimallocschkriCB, TTrimallocschkri> loadReferrerOption) {
        xassLRArg(tYtrsodetail, loadReferrerOption);
        return loadTTrimallocschkriList(xnewLRLs(tYtrsodetail), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tYtrsodetailList The entity list of TYtrsodetail. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrimallocschkri> loadTTrimallocschkriList(List<TYtrsodetail> tYtrsodetailList, LoadReferrerOption<TTrimallocschkriCB, TTrimallocschkri> loadReferrerOption) {
        xassLRArg(tYtrsodetailList, loadReferrerOption);
        if (tYtrsodetailList.isEmpty()) { return (NestedReferrerListGateway<TTrimallocschkri>)EMPTY_NREF_LGWAY; }
        return doLoadTTrimallocschkriList(tYtrsodetailList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrimallocschkri> doLoadTTrimallocschkriList(List<TYtrsodetail> tYtrsodetailList, LoadReferrerOption<TTrimallocschkriCB, TTrimallocschkri> option) {
        return helpLoadReferrerInternally(tYtrsodetailList, option, "tTrimallocschkriList");
    }

    /**
     * Load referrer of TTrpickdetailList by the set-upper of referrer. <br>
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">loadTTrpickdetailList</span>(<span style="color: #553000">tYtrsodetailList</span>, <span style="color: #553000">trpickdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpickdetailCB</span>.setupSelect...
     *     <span style="color: #553000">trpickdetailCB</span>.query().set...
     *     <span style="color: #553000">trpickdetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TYtrsodetail tYtrsodetail : <span style="color: #553000">tYtrsodetailList</span>) {
     *     ... = tYtrsodetail.<span style="color: #CC4747">getTTrpickdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsodetailId_InScope(pkList);
     * cb.query().addOrderBy_TrsodetailId_Asc();
     * </pre>
     * @param tYtrsodetailList The entity list of TYtrsodetail. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(List<TYtrsodetail> tYtrsodetailList, ConditionBeanSetupper<TTrpickdetailCB> refCBLambda) {
        xassLRArg(tYtrsodetailList, refCBLambda);
        return doLoadTTrpickdetailList(tYtrsodetailList, new LoadReferrerOption<TTrpickdetailCB, TTrpickdetail>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrpickdetailList by the set-upper of referrer. <br>
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'.
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">loadTTrpickdetailList</span>(<span style="color: #553000">tYtrsodetail</span>, <span style="color: #553000">trpickdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpickdetailCB</span>.setupSelect...
     *     <span style="color: #553000">trpickdetailCB</span>.query().set...
     *     <span style="color: #553000">trpickdetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tYtrsodetail</span>.<span style="color: #CC4747">getTTrpickdetailList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsodetailId_InScope(pkList);
     * cb.query().addOrderBy_TrsodetailId_Asc();
     * </pre>
     * @param tYtrsodetail The entity of TYtrsodetail. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(TYtrsodetail tYtrsodetail, ConditionBeanSetupper<TTrpickdetailCB> refCBLambda) {
        xassLRArg(tYtrsodetail, refCBLambda);
        return doLoadTTrpickdetailList(xnewLRLs(tYtrsodetail), new LoadReferrerOption<TTrpickdetailCB, TTrpickdetail>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tYtrsodetail The entity of TYtrsodetail. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(TYtrsodetail tYtrsodetail, LoadReferrerOption<TTrpickdetailCB, TTrpickdetail> loadReferrerOption) {
        xassLRArg(tYtrsodetail, loadReferrerOption);
        return loadTTrpickdetailList(xnewLRLs(tYtrsodetail), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tYtrsodetailList The entity list of TYtrsodetail. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrpickdetail> loadTTrpickdetailList(List<TYtrsodetail> tYtrsodetailList, LoadReferrerOption<TTrpickdetailCB, TTrpickdetail> loadReferrerOption) {
        xassLRArg(tYtrsodetailList, loadReferrerOption);
        if (tYtrsodetailList.isEmpty()) { return (NestedReferrerListGateway<TTrpickdetail>)EMPTY_NREF_LGWAY; }
        return doLoadTTrpickdetailList(tYtrsodetailList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrpickdetail> doLoadTTrpickdetailList(List<TYtrsodetail> tYtrsodetailList, LoadReferrerOption<TTrpickdetailCB, TTrpickdetail> option) {
        return helpLoadReferrerInternally(tYtrsodetailList, option, "tTrpickdetailList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TYtrso'.
     * @param tYtrsodetailList The list of tYtrsodetail. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TYtrso> pulloutTYtrso(List<TYtrsodetail> tYtrsodetailList)
    { return helpPulloutInternally(tYtrsodetailList, "tYtrso"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tYtrsodetailList The list of tYtrsodetail. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TYtrsodetail> tYtrsodetailList)
    { return helpPulloutInternally(tYtrsodetailList, "mProduct"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trsodetailId.
     * @param tYtrsodetailList The list of tYtrsodetail. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrsodetailIdList(List<TYtrsodetail> tYtrsodetailList)
    { return helpExtractListInternally(tYtrsodetailList, "trsodetailId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tYtrsodetail.setFoo...(value);
     * tYtrsodetail.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.set...;</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">insert</span>(tYtrsodetail);
     * ... = tYtrsodetail.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tYtrsodetail The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TYtrsodetail tYtrsodetail) {
        doInsert(tYtrsodetail, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYtrsodetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tYtrsodetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">update</span>(tYtrsodetail);
     * </pre>
     * @param tYtrsodetail The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TYtrsodetail tYtrsodetail) {
        doUpdate(tYtrsodetail, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYtrsodetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tYtrsodetail);
     * </pre>
     * @param tYtrsodetail The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TYtrsodetail tYtrsodetail) {
        doUpdateNonstrict(tYtrsodetail, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tYtrsodetail The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TYtrsodetail tYtrsodetail) {
        doInsertOrUpdate(tYtrsodetail, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tYtrsodetail The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TYtrsodetail tYtrsodetail) {
        doInsertOrUpdateNonstrict(tYtrsodetail, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tYtrsodetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">delete</span>(tYtrsodetail);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tYtrsodetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TYtrsodetail tYtrsodetail) {
        doDelete(tYtrsodetail, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tYtrsodetail);
     * </pre>
     * @param tYtrsodetail The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TYtrsodetail tYtrsodetail) {
        doDeleteNonstrict(tYtrsodetail, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tYtrsodetail);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tYtrsodetail The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TYtrsodetail tYtrsodetail) {
        doDeleteNonstrictIgnoreDeleted(tYtrsodetail, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TYtrsodetail et, final DeleteOption<TYtrsodetailCB> op) {
        assertObjectNotNull("tYtrsodetail", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     *     tYtrsodetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tYtrsodetail.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tYtrsodetailList.add(tYtrsodetail);
     * }
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">batchInsert</span>(tYtrsodetailList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TYtrsodetail> tYtrsodetailList) {
        return doBatchInsert(tYtrsodetailList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     *     tYtrsodetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tYtrsodetail.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tYtrsodetail.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tYtrsodetail.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tYtrsodetailList.add(tYtrsodetail);
     * }
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tYtrsodetailList);
     * </pre>
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TYtrsodetail> tYtrsodetailList) {
        return doBatchUpdate(tYtrsodetailList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tYtrsodetailBhv.<span style="color: #CC4747">batchUpdate</span>(tYtrsodetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tYtrsodetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TYtrsodetail> tYtrsodetailList, SpecifyQuery<TYtrsodetailCB> colCBLambda) {
        return doBatchUpdate(tYtrsodetailList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     *     tYtrsodetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tYtrsodetail.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tYtrsodetail.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tYtrsodetail.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tYtrsodetailList.add(tYtrsodetail);
     * }
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tYtrsodetailList);
     * </pre>
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TYtrsodetail> tYtrsodetailList) {
        return doBatchUpdateNonstrict(tYtrsodetailList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tYtrsodetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tYtrsodetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TYtrsodetail> tYtrsodetailList, SpecifyQuery<TYtrsodetailCB> colCBLambda) {
        return doBatchUpdateNonstrict(tYtrsodetailList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TYtrsodetail> tYtrsodetailList) {
        return doBatchDelete(tYtrsodetailList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TYtrsodetail> tYtrsodetailList) {
        return doBatchDeleteNonstrict(tYtrsodetailList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TYtrsodetail, TYtrsodetailCB&gt;() {
     *     public ConditionBean setup(TYtrsodetail entity, TYtrsodetailCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TYtrsodetail, TYtrsodetailCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setPK...(value);</span>
     * tYtrsodetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setVersionNo(value);</span>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tYtrsodetail, cb);
     * </pre>
     * @param tYtrsodetail The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TYtrsodetail tYtrsodetail, TYtrsodetailCB cb) {
        return doQueryUpdate(tYtrsodetail, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TYtrsodetailCB cb = new TYtrsodetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">queryDelete</span>(tYtrsodetail, cb);
     * </pre>
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TYtrsodetailCB cb) {
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
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tYtrsodetail.setFoo...(value);
     * tYtrsodetail.setBar...(value);
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tYtrsodetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tYtrsodetail.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tYtrsodetail The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, InsertOption<TYtrsodetailCB>> opLambda) {
        doInsert(tYtrsodetail, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYtrsodetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tYtrsodetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tYtrsodetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tYtrsodetail The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> opLambda) {
        doUpdate(tYtrsodetail, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * tYtrsodetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYtrsodetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tYtrsodetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tYtrsodetail The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> opLambda) {
        doUpdateNonstrict(tYtrsodetail, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tYtrsodetail The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, InsertOption<TYtrsodetailCB>> insertOpLambda, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> updateOpLambda) {
        doInsertOrUpdate(tYtrsodetail, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tYtrsodetail The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, InsertOption<TYtrsodetailCB>> insertOpLambda, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tYtrsodetail, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tYtrsodetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, DeleteOption<TYtrsodetailCB>> opLambda) {
        doDelete(tYtrsodetail, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tYtrsodetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TYtrsodetail tYtrsodetail, WritableOptionCall<TYtrsodetailCB, DeleteOption<TYtrsodetailCB>> opLambda) {
        doDeleteNonstrict(tYtrsodetail, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TYtrsodetail> tYtrsodetailList, WritableOptionCall<TYtrsodetailCB, InsertOption<TYtrsodetailCB>> opLambda) {
        return doBatchInsert(tYtrsodetailList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TYtrsodetail> tYtrsodetailList, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> opLambda) {
        return doBatchUpdate(tYtrsodetailList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TYtrsodetail> tYtrsodetailList, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> opLambda) {
        return doBatchUpdateNonstrict(tYtrsodetailList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TYtrsodetail> tYtrsodetailList, WritableOptionCall<TYtrsodetailCB, DeleteOption<TYtrsodetailCB>> opLambda) {
        return doBatchDelete(tYtrsodetailList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tYtrsodetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TYtrsodetail> tYtrsodetailList, WritableOptionCall<TYtrsodetailCB, DeleteOption<TYtrsodetailCB>> opLambda) {
        return doBatchDeleteNonstrict(tYtrsodetailList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TYtrsodetail, TYtrsodetailCB> manyArgLambda, WritableOptionCall<TYtrsodetailCB, InsertOption<TYtrsodetailCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TYtrsodetail tYtrsodetail = <span style="color: #70226C">new</span> TYtrsodetail();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setPK...(value);</span>
     * tYtrsodetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYtrsodetail.setVersionNo(value);</span>
     * TYtrsodetailCB cb = <span style="color: #70226C">new</span> TYtrsodetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tYtrsodetailBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tYtrsodetail, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tYtrsodetail The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TYtrsodetail tYtrsodetail, TYtrsodetailCB cb, WritableOptionCall<TYtrsodetailCB, UpdateOption<TYtrsodetailCB>> opLambda) {
        return doQueryUpdate(tYtrsodetail, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TYtrsodetail. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TYtrsodetailCB cb, WritableOptionCall<TYtrsodetailCB, DeleteOption<TYtrsodetailCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tYtrsodetailBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tYtrsodetailBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tYtrsodetailBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tYtrsodetailBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tYtrsodetailBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tYtrsodetailBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tYtrsodetailBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tYtrsodetailBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tYtrsodetailBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tYtrsodetailBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tYtrsodetailBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tYtrsodetailBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tYtrsodetailBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tYtrsodetailBhv.outideSql().removeBlockComment().selectList()
     * tYtrsodetailBhv.outideSql().removeLineComment().selectList()
     * tYtrsodetailBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TYtrsodetailBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TYtrsodetailBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TYtrsodetail> typeOfSelectedEntity() { return TYtrsodetail.class; }
    protected Class<TYtrsodetail> typeOfHandlingEntity() { return TYtrsodetail.class; }
    protected Class<TYtrsodetailCB> typeOfHandlingConditionBean() { return TYtrsodetailCB.class; }
}
