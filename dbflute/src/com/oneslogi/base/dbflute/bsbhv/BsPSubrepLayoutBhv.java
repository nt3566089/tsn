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
 * The behavior of P_SUBREP_LAYOUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SUBREP_LAYOUT_ID
 *
 * [column]
 *     SUBREP_LAYOUT_ID, REPORT_LAYOUT_ID, SUBREP_LAYOUT_DATA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SUBREP_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT_LAYOUT
 *
 * [referrer table]
 *     P_SUBREP_LAYOUT_ITEM
 *
 * [foreign property]
 *     pReportLayout
 *
 * [referrer property]
 *     pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPSubrepLayoutBhv extends AbstractBehaviorWritable<PSubrepLayout, PSubrepLayoutCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PSubrepLayoutDbm asDBMeta() { return PSubrepLayoutDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_SUBREP_LAYOUT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PSubrepLayoutDbm getMyDBMeta() { return PSubrepLayoutDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PSubrepLayoutCB newConditionBean() { return new PSubrepLayoutCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PSubrepLayout newMyEntity() { return new PSubrepLayout(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PSubrepLayoutCB newMyConditionBean() { return new PSubrepLayoutCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PSubrepLayoutCB cb) {
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
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().setFoo...(value);
     * PSubrepLayout pSubrepLayout = <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pSubrepLayout != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pSubrepLayout.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PSubrepLayout selectEntity(PSubrepLayoutCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PSubrepLayout facadeSelectEntity(PSubrepLayoutCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PSubrepLayout> OptionalEntity<ENTITY> doSelectOptionalEntity(PSubrepLayoutCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().set...;
     * PSubrepLayout pSubrepLayout = <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pSubrepLayout.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PSubrepLayout selectEntityWithDeletedCheck(PSubrepLayoutCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param subrepLayoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PSubrepLayout selectByPKValue(Long subrepLayoutId) {
        return facadeSelectByPKValue(subrepLayoutId);
    }

    protected PSubrepLayout facadeSelectByPKValue(Long subrepLayoutId) {
        return doSelectByPK(subrepLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PSubrepLayout> ENTITY doSelectByPK(Long subrepLayoutId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(subrepLayoutId), tp);
    }

    protected <ENTITY extends PSubrepLayout> OptionalEntity<ENTITY> doSelectOptionalByPK(Long subrepLayoutId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(subrepLayoutId, tp), subrepLayoutId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param subrepLayoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PSubrepLayout selectByPKValueWithDeletedCheck(Long subrepLayoutId) {
        return doSelectByPKWithDeletedCheck(subrepLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PSubrepLayout> ENTITY doSelectByPKWithDeletedCheck(Long subrepLayoutId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(subrepLayoutId), tp);
    }

    protected PSubrepLayoutCB xprepareCBAsPK(Long subrepLayoutId) {
        assertObjectNotNull("subrepLayoutId", subrepLayoutId);
        return newConditionBean().acceptPK(subrepLayoutId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param reportLayoutId : UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PSubrepLayout> selectByUniqueOf(Long reportLayoutId) {
        return facadeSelectByUniqueOf(reportLayoutId);
    }

    protected OptionalEntity<PSubrepLayout> facadeSelectByUniqueOf(Long reportLayoutId) {
        return doSelectByUniqueOf(reportLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PSubrepLayout> OptionalEntity<ENTITY> doSelectByUniqueOf(Long reportLayoutId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(reportLayoutId), tp), reportLayoutId);
    }

    protected PSubrepLayoutCB xprepareCBAsUniqueOf(Long reportLayoutId) {
        assertObjectNotNull("reportLayoutId", reportLayoutId);
        return newConditionBean().acceptUniqueOf(reportLayoutId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PSubrepLayout&gt; <span style="color: #553000">pSubrepLayoutList</span> = <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PSubrepLayout pSubrepLayout : <span style="color: #553000">pSubrepLayoutList</span>) {
     *     ... = pSubrepLayout.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PSubrepLayout> selectList(PSubrepLayoutCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PSubrepLayout&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PSubrepLayout pSubrepLayout : <span style="color: #553000">page</span>) {
     *     ... = pSubrepLayout.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PSubrepLayout> selectPage(PSubrepLayoutCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().set...
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @param entityRowHandler The handler of entity row of PSubrepLayout. (NotNull)
     */
    public void selectCursor(PSubrepLayoutCB cb, EntityRowHandler<PSubrepLayout> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PSubrepLayoutCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PSubrepLayoutCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pSubrepLayoutList The entity list of PSubrepLayout. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PSubrepLayout> pSubrepLayoutList, ReferrerLoaderHandler<LoaderOfPSubrepLayout> loaderLambda) {
        xassLRArg(pSubrepLayoutList, loaderLambda);
        loaderLambda.handle(new LoaderOfPSubrepLayout().ready(pSubrepLayoutList, _behaviorSelector));
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
     * @param pSubrepLayout The entity of PSubrepLayout. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PSubrepLayout pSubrepLayout, ReferrerLoaderHandler<LoaderOfPSubrepLayout> loaderLambda) {
        xassLRArg(pSubrepLayout, loaderLambda);
        loaderLambda.handle(new LoaderOfPSubrepLayout().ready(xnewLRAryLs(pSubrepLayout), _behaviorSelector));
    }

    /**
     * Load referrer of PSubrepLayoutItemList by the set-upper of referrer. <br>
     * P_SUBREP_LAYOUT_ITEM by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">loadPSubrepLayoutItemList</span>(<span style="color: #553000">pSubrepLayoutList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PSubrepLayout pSubrepLayout : <span style="color: #553000">pSubrepLayoutList</span>) {
     *     ... = pSubrepLayout.<span style="color: #CC4747">getPSubrepLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSubrepLayoutId_InScope(pkList);
     * cb.query().addOrderBy_SubrepLayoutId_Asc();
     * </pre>
     * @param pSubrepLayoutList The entity list of PSubrepLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(List<PSubrepLayout> pSubrepLayoutList, ConditionBeanSetupper<PSubrepLayoutItemCB> refCBLambda) {
        xassLRArg(pSubrepLayoutList, refCBLambda);
        return doLoadPSubrepLayoutItemList(pSubrepLayoutList, new LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PSubrepLayoutItemList by the set-upper of referrer. <br>
     * P_SUBREP_LAYOUT_ITEM by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">loadPSubrepLayoutItemList</span>(<span style="color: #553000">pSubrepLayout</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pSubrepLayout</span>.<span style="color: #CC4747">getPSubrepLayoutItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSubrepLayoutId_InScope(pkList);
     * cb.query().addOrderBy_SubrepLayoutId_Asc();
     * </pre>
     * @param pSubrepLayout The entity of PSubrepLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(PSubrepLayout pSubrepLayout, ConditionBeanSetupper<PSubrepLayoutItemCB> refCBLambda) {
        xassLRArg(pSubrepLayout, refCBLambda);
        return doLoadPSubrepLayoutItemList(xnewLRLs(pSubrepLayout), new LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pSubrepLayout The entity of PSubrepLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(PSubrepLayout pSubrepLayout, LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem> loadReferrerOption) {
        xassLRArg(pSubrepLayout, loadReferrerOption);
        return loadPSubrepLayoutItemList(xnewLRLs(pSubrepLayout), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pSubrepLayoutList The entity list of PSubrepLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(List<PSubrepLayout> pSubrepLayoutList, LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem> loadReferrerOption) {
        xassLRArg(pSubrepLayoutList, loadReferrerOption);
        if (pSubrepLayoutList.isEmpty()) { return (NestedReferrerListGateway<PSubrepLayoutItem>)EMPTY_NREF_LGWAY; }
        return doLoadPSubrepLayoutItemList(pSubrepLayoutList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PSubrepLayoutItem> doLoadPSubrepLayoutItemList(List<PSubrepLayout> pSubrepLayoutList, LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem> option) {
        return helpLoadReferrerInternally(pSubrepLayoutList, option, "pSubrepLayoutItemList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PReportLayout'.
     * @param pSubrepLayoutList The list of pSubrepLayout. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PReportLayout> pulloutPReportLayout(List<PSubrepLayout> pSubrepLayoutList)
    { return helpPulloutInternally(pSubrepLayoutList, "pReportLayout"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key subrepLayoutId.
     * @param pSubrepLayoutList The list of pSubrepLayout. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSubrepLayoutIdList(List<PSubrepLayout> pSubrepLayoutList)
    { return helpExtractListInternally(pSubrepLayoutList, "subrepLayoutId"); }

    /**
     * Extract the value list of (single) unique key reportLayoutId.
     * @param pSubrepLayoutList The list of pSubrepLayout. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReportLayoutIdList(List<PSubrepLayout> pSubrepLayoutList)
    { return helpExtractListInternally(pSubrepLayoutList, "reportLayoutId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pSubrepLayout.setFoo...(value);
     * pSubrepLayout.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.set...;</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">insert</span>(pSubrepLayout);
     * ... = pSubrepLayout.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pSubrepLayout The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PSubrepLayout pSubrepLayout) {
        doInsert(pSubrepLayout, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pSubrepLayout.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pSubrepLayout.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">update</span>(pSubrepLayout);
     * </pre>
     * @param pSubrepLayout The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PSubrepLayout pSubrepLayout) {
        doUpdate(pSubrepLayout, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pSubrepLayout.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pSubrepLayout);
     * </pre>
     * @param pSubrepLayout The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PSubrepLayout pSubrepLayout) {
        doUpdateNonstrict(pSubrepLayout, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pSubrepLayout The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PSubrepLayout pSubrepLayout) {
        doInsertOrUpdate(pSubrepLayout, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pSubrepLayout The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PSubrepLayout pSubrepLayout) {
        doInsertOrUpdateNonstrict(pSubrepLayout, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pSubrepLayout.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">delete</span>(pSubrepLayout);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pSubrepLayout The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PSubrepLayout pSubrepLayout) {
        doDelete(pSubrepLayout, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pSubrepLayout);
     * </pre>
     * @param pSubrepLayout The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PSubrepLayout pSubrepLayout) {
        doDeleteNonstrict(pSubrepLayout, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pSubrepLayout);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pSubrepLayout The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PSubrepLayout pSubrepLayout) {
        doDeleteNonstrictIgnoreDeleted(pSubrepLayout, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PSubrepLayout et, final DeleteOption<PSubrepLayoutCB> op) {
        assertObjectNotNull("pSubrepLayout", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     *     pSubrepLayout.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pSubrepLayout.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pSubrepLayoutList.add(pSubrepLayout);
     * }
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">batchInsert</span>(pSubrepLayoutList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PSubrepLayout> pSubrepLayoutList) {
        return doBatchInsert(pSubrepLayoutList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     *     pSubrepLayout.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pSubrepLayout.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pSubrepLayout.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pSubrepLayout.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pSubrepLayoutList.add(pSubrepLayout);
     * }
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pSubrepLayoutList);
     * </pre>
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PSubrepLayout> pSubrepLayoutList) {
        return doBatchUpdate(pSubrepLayoutList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pSubrepLayoutBhv.<span style="color: #CC4747">batchUpdate</span>(pSubrepLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pSubrepLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PSubrepLayout> pSubrepLayoutList, SpecifyQuery<PSubrepLayoutCB> colCBLambda) {
        return doBatchUpdate(pSubrepLayoutList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     *     pSubrepLayout.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pSubrepLayout.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pSubrepLayout.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pSubrepLayout.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pSubrepLayoutList.add(pSubrepLayout);
     * }
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pSubrepLayoutList);
     * </pre>
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PSubrepLayout> pSubrepLayoutList) {
        return doBatchUpdateNonstrict(pSubrepLayoutList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pSubrepLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pSubrepLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PSubrepLayout> pSubrepLayoutList, SpecifyQuery<PSubrepLayoutCB> colCBLambda) {
        return doBatchUpdateNonstrict(pSubrepLayoutList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PSubrepLayout> pSubrepLayoutList) {
        return doBatchDelete(pSubrepLayoutList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PSubrepLayout> pSubrepLayoutList) {
        return doBatchDeleteNonstrict(pSubrepLayoutList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PSubrepLayout, PSubrepLayoutCB&gt;() {
     *     public ConditionBean setup(PSubrepLayout entity, PSubrepLayoutCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PSubrepLayout, PSubrepLayoutCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setPK...(value);</span>
     * pSubrepLayout.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setVersionNo(value);</span>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pSubrepLayout, cb);
     * </pre>
     * @param pSubrepLayout The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PSubrepLayout pSubrepLayout, PSubrepLayoutCB cb) {
        return doQueryUpdate(pSubrepLayout, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PSubrepLayoutCB cb = new PSubrepLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">queryDelete</span>(pSubrepLayout, cb);
     * </pre>
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PSubrepLayoutCB cb) {
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
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pSubrepLayout.setFoo...(value);
     * pSubrepLayout.setBar...(value);
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pSubrepLayout, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pSubrepLayout.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pSubrepLayout The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, InsertOption<PSubrepLayoutCB>> opLambda) {
        doInsert(pSubrepLayout, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pSubrepLayout.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pSubrepLayout.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pSubrepLayout, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pSubrepLayout The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> opLambda) {
        doUpdate(pSubrepLayout, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * pSubrepLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pSubrepLayout.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pSubrepLayout, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pSubrepLayout The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> opLambda) {
        doUpdateNonstrict(pSubrepLayout, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pSubrepLayout The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, InsertOption<PSubrepLayoutCB>> insertOpLambda, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> updateOpLambda) {
        doInsertOrUpdate(pSubrepLayout, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pSubrepLayout The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, InsertOption<PSubrepLayoutCB>> insertOpLambda, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pSubrepLayout, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pSubrepLayout The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, DeleteOption<PSubrepLayoutCB>> opLambda) {
        doDelete(pSubrepLayout, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pSubrepLayout The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PSubrepLayout pSubrepLayout, WritableOptionCall<PSubrepLayoutCB, DeleteOption<PSubrepLayoutCB>> opLambda) {
        doDeleteNonstrict(pSubrepLayout, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PSubrepLayout> pSubrepLayoutList, WritableOptionCall<PSubrepLayoutCB, InsertOption<PSubrepLayoutCB>> opLambda) {
        return doBatchInsert(pSubrepLayoutList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PSubrepLayout> pSubrepLayoutList, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> opLambda) {
        return doBatchUpdate(pSubrepLayoutList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PSubrepLayout> pSubrepLayoutList, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> opLambda) {
        return doBatchUpdateNonstrict(pSubrepLayoutList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PSubrepLayout> pSubrepLayoutList, WritableOptionCall<PSubrepLayoutCB, DeleteOption<PSubrepLayoutCB>> opLambda) {
        return doBatchDelete(pSubrepLayoutList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pSubrepLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PSubrepLayout> pSubrepLayoutList, WritableOptionCall<PSubrepLayoutCB, DeleteOption<PSubrepLayoutCB>> opLambda) {
        return doBatchDeleteNonstrict(pSubrepLayoutList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PSubrepLayout, PSubrepLayoutCB> manyArgLambda, WritableOptionCall<PSubrepLayoutCB, InsertOption<PSubrepLayoutCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PSubrepLayout pSubrepLayout = <span style="color: #70226C">new</span> PSubrepLayout();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setPK...(value);</span>
     * pSubrepLayout.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pSubrepLayout.setVersionNo(value);</span>
     * PSubrepLayoutCB cb = <span style="color: #70226C">new</span> PSubrepLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pSubrepLayoutBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pSubrepLayout, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pSubrepLayout The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PSubrepLayout pSubrepLayout, PSubrepLayoutCB cb, WritableOptionCall<PSubrepLayoutCB, UpdateOption<PSubrepLayoutCB>> opLambda) {
        return doQueryUpdate(pSubrepLayout, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PSubrepLayout. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PSubrepLayoutCB cb, WritableOptionCall<PSubrepLayoutCB, DeleteOption<PSubrepLayoutCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pSubrepLayoutBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pSubrepLayoutBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pSubrepLayoutBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pSubrepLayoutBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pSubrepLayoutBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pSubrepLayoutBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pSubrepLayoutBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pSubrepLayoutBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pSubrepLayoutBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pSubrepLayoutBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pSubrepLayoutBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pSubrepLayoutBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pSubrepLayoutBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pSubrepLayoutBhv.outideSql().removeBlockComment().selectList()
     * pSubrepLayoutBhv.outideSql().removeLineComment().selectList()
     * pSubrepLayoutBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PSubrepLayoutBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PSubrepLayoutBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PSubrepLayout> typeOfSelectedEntity() { return PSubrepLayout.class; }
    protected Class<PSubrepLayout> typeOfHandlingEntity() { return PSubrepLayout.class; }
    protected Class<PSubrepLayoutCB> typeOfHandlingConditionBean() { return PSubrepLayoutCB.class; }
}
