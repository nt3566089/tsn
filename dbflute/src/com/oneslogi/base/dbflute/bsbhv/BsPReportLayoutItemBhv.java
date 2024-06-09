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
 * The behavior of P_REPORT_LAYOUT_ITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPORT_LAYOUT_ITEM_ID
 *
 * [column]
 *     REPORT_LAYOUT_ITEM_ID, REPORT_LAYOUT_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, ITEM_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, P_REPORT_LAYOUT, V_DICT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bDict, pReportLayout, vDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPReportLayoutItemBhv extends AbstractBehaviorWritable<PReportLayoutItem, PReportLayoutItemCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PReportLayoutItemDbm asDBMeta() { return PReportLayoutItemDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_REPORT_LAYOUT_ITEM"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PReportLayoutItemDbm getMyDBMeta() { return PReportLayoutItemDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PReportLayoutItemCB newConditionBean() { return new PReportLayoutItemCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PReportLayoutItem newMyEntity() { return new PReportLayoutItem(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PReportLayoutItemCB newMyConditionBean() { return new PReportLayoutItemCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PReportLayoutItemCB cb) {
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
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().setFoo...(value);
     * PReportLayoutItem pReportLayoutItem = <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pReportLayoutItem != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pReportLayoutItem.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayoutItem selectEntity(PReportLayoutItemCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PReportLayoutItem facadeSelectEntity(PReportLayoutItemCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayoutItem> OptionalEntity<ENTITY> doSelectOptionalEntity(PReportLayoutItemCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().set...;
     * PReportLayoutItem pReportLayoutItem = <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pReportLayoutItem.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayoutItem selectEntityWithDeletedCheck(PReportLayoutItemCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param reportLayoutItemId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayoutItem selectByPKValue(Long reportLayoutItemId) {
        return facadeSelectByPKValue(reportLayoutItemId);
    }

    protected PReportLayoutItem facadeSelectByPKValue(Long reportLayoutItemId) {
        return doSelectByPK(reportLayoutItemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayoutItem> ENTITY doSelectByPK(Long reportLayoutItemId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(reportLayoutItemId), tp);
    }

    protected <ENTITY extends PReportLayoutItem> OptionalEntity<ENTITY> doSelectOptionalByPK(Long reportLayoutItemId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(reportLayoutItemId, tp), reportLayoutItemId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param reportLayoutItemId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayoutItem selectByPKValueWithDeletedCheck(Long reportLayoutItemId) {
        return doSelectByPKWithDeletedCheck(reportLayoutItemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayoutItem> ENTITY doSelectByPKWithDeletedCheck(Long reportLayoutItemId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(reportLayoutItemId), tp);
    }

    protected PReportLayoutItemCB xprepareCBAsPK(Long reportLayoutItemId) {
        assertObjectNotNull("reportLayoutItemId", reportLayoutItemId);
        return newConditionBean().acceptPK(reportLayoutItemId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param reportLayoutId : UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     * @param itemCd : +UQ, NotNull, varchar(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PReportLayoutItem> selectByUniqueOf(Long reportLayoutId, String itemCd) {
        return facadeSelectByUniqueOf(reportLayoutId, itemCd);
    }

    protected OptionalEntity<PReportLayoutItem> facadeSelectByUniqueOf(Long reportLayoutId, String itemCd) {
        return doSelectByUniqueOf(reportLayoutId, itemCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayoutItem> OptionalEntity<ENTITY> doSelectByUniqueOf(Long reportLayoutId, String itemCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(reportLayoutId, itemCd), tp), reportLayoutId, itemCd);
    }

    protected PReportLayoutItemCB xprepareCBAsUniqueOf(Long reportLayoutId, String itemCd) {
        assertObjectNotNull("reportLayoutId", reportLayoutId);assertObjectNotNull("itemCd", itemCd);
        return newConditionBean().acceptUniqueOf(reportLayoutId, itemCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PReportLayoutItem&gt; <span style="color: #553000">pReportLayoutItemList</span> = <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PReportLayoutItem pReportLayoutItem : <span style="color: #553000">pReportLayoutItemList</span>) {
     *     ... = pReportLayoutItem.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PReportLayoutItem> selectList(PReportLayoutItemCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PReportLayoutItem&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PReportLayoutItem pReportLayoutItem : <span style="color: #553000">page</span>) {
     *     ... = pReportLayoutItem.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PReportLayoutItem> selectPage(PReportLayoutItemCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().set...
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @param entityRowHandler The handler of entity row of PReportLayoutItem. (NotNull)
     */
    public void selectCursor(PReportLayoutItemCB cb, EntityRowHandler<PReportLayoutItem> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PReportLayoutItemCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PReportLayoutItemCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pReportLayoutItemList The entity list of PReportLayoutItem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PReportLayoutItem> pReportLayoutItemList, ReferrerLoaderHandler<LoaderOfPReportLayoutItem> loaderLambda) {
        xassLRArg(pReportLayoutItemList, loaderLambda);
        loaderLambda.handle(new LoaderOfPReportLayoutItem().ready(pReportLayoutItemList, _behaviorSelector));
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
     * @param pReportLayoutItem The entity of PReportLayoutItem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PReportLayoutItem pReportLayoutItem, ReferrerLoaderHandler<LoaderOfPReportLayoutItem> loaderLambda) {
        xassLRArg(pReportLayoutItem, loaderLambda);
        loaderLambda.handle(new LoaderOfPReportLayoutItem().ready(xnewLRAryLs(pReportLayoutItem), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param pReportLayoutItemList The list of pReportLayoutItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<PReportLayoutItem> pReportLayoutItemList)
    { return helpPulloutInternally(pReportLayoutItemList, "bDict"); }

    /**
     * Pull out the list of foreign table 'PReportLayout'.
     * @param pReportLayoutItemList The list of pReportLayoutItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PReportLayout> pulloutPReportLayout(List<PReportLayoutItem> pReportLayoutItemList)
    { return helpPulloutInternally(pReportLayoutItemList, "pReportLayout"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param pReportLayoutItemList The list of pReportLayoutItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<PReportLayoutItem> pReportLayoutItemList)
    { return helpPulloutInternally(pReportLayoutItemList, "vDict"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key reportLayoutItemId.
     * @param pReportLayoutItemList The list of pReportLayoutItem. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReportLayoutItemIdList(List<PReportLayoutItem> pReportLayoutItemList)
    { return helpExtractListInternally(pReportLayoutItemList, "reportLayoutItemId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pReportLayoutItem.setFoo...(value);
     * pReportLayoutItem.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.set...;</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">insert</span>(pReportLayoutItem);
     * ... = pReportLayoutItem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pReportLayoutItem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PReportLayoutItem pReportLayoutItem) {
        doInsert(pReportLayoutItem, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayoutItem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pReportLayoutItem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">update</span>(pReportLayoutItem);
     * </pre>
     * @param pReportLayoutItem The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PReportLayoutItem pReportLayoutItem) {
        doUpdate(pReportLayoutItem, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayoutItem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pReportLayoutItem);
     * </pre>
     * @param pReportLayoutItem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PReportLayoutItem pReportLayoutItem) {
        doUpdateNonstrict(pReportLayoutItem, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pReportLayoutItem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PReportLayoutItem pReportLayoutItem) {
        doInsertOrUpdate(pReportLayoutItem, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pReportLayoutItem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PReportLayoutItem pReportLayoutItem) {
        doInsertOrUpdateNonstrict(pReportLayoutItem, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pReportLayoutItem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">delete</span>(pReportLayoutItem);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pReportLayoutItem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PReportLayoutItem pReportLayoutItem) {
        doDelete(pReportLayoutItem, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pReportLayoutItem);
     * </pre>
     * @param pReportLayoutItem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PReportLayoutItem pReportLayoutItem) {
        doDeleteNonstrict(pReportLayoutItem, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pReportLayoutItem);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pReportLayoutItem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PReportLayoutItem pReportLayoutItem) {
        doDeleteNonstrictIgnoreDeleted(pReportLayoutItem, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PReportLayoutItem et, final DeleteOption<PReportLayoutItemCB> op) {
        assertObjectNotNull("pReportLayoutItem", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     *     pReportLayoutItem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pReportLayoutItem.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pReportLayoutItemList.add(pReportLayoutItem);
     * }
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">batchInsert</span>(pReportLayoutItemList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PReportLayoutItem> pReportLayoutItemList) {
        return doBatchInsert(pReportLayoutItemList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     *     pReportLayoutItem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pReportLayoutItem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pReportLayoutItem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pReportLayoutItem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pReportLayoutItemList.add(pReportLayoutItem);
     * }
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutItemList);
     * </pre>
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PReportLayoutItem> pReportLayoutItemList) {
        return doBatchUpdate(pReportLayoutItemList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pReportLayoutItemBhv.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PReportLayoutItem> pReportLayoutItemList, SpecifyQuery<PReportLayoutItemCB> colCBLambda) {
        return doBatchUpdate(pReportLayoutItemList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     *     pReportLayoutItem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pReportLayoutItem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pReportLayoutItem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pReportLayoutItem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pReportLayoutItemList.add(pReportLayoutItem);
     * }
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutItemList);
     * </pre>
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PReportLayoutItem> pReportLayoutItemList) {
        return doBatchUpdateNonstrict(pReportLayoutItemList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pReportLayoutItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pReportLayoutItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PReportLayoutItem> pReportLayoutItemList, SpecifyQuery<PReportLayoutItemCB> colCBLambda) {
        return doBatchUpdateNonstrict(pReportLayoutItemList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PReportLayoutItem> pReportLayoutItemList) {
        return doBatchDelete(pReportLayoutItemList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PReportLayoutItem> pReportLayoutItemList) {
        return doBatchDeleteNonstrict(pReportLayoutItemList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PReportLayoutItem, PReportLayoutItemCB&gt;() {
     *     public ConditionBean setup(PReportLayoutItem entity, PReportLayoutItemCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PReportLayoutItem, PReportLayoutItemCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setPK...(value);</span>
     * pReportLayoutItem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setVersionNo(value);</span>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pReportLayoutItem, cb);
     * </pre>
     * @param pReportLayoutItem The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PReportLayoutItem pReportLayoutItem, PReportLayoutItemCB cb) {
        return doQueryUpdate(pReportLayoutItem, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PReportLayoutItemCB cb = new PReportLayoutItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">queryDelete</span>(pReportLayoutItem, cb);
     * </pre>
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PReportLayoutItemCB cb) {
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
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pReportLayoutItem.setFoo...(value);
     * pReportLayoutItem.setBar...(value);
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pReportLayoutItem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pReportLayoutItem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pReportLayoutItem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, InsertOption<PReportLayoutItemCB>> opLambda) {
        doInsert(pReportLayoutItem, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayoutItem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pReportLayoutItem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pReportLayoutItem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pReportLayoutItem The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> opLambda) {
        doUpdate(pReportLayoutItem, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * pReportLayoutItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayoutItem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pReportLayoutItem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pReportLayoutItem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> opLambda) {
        doUpdateNonstrict(pReportLayoutItem, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pReportLayoutItem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, InsertOption<PReportLayoutItemCB>> insertOpLambda, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> updateOpLambda) {
        doInsertOrUpdate(pReportLayoutItem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pReportLayoutItem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, InsertOption<PReportLayoutItemCB>> insertOpLambda, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pReportLayoutItem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pReportLayoutItem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, DeleteOption<PReportLayoutItemCB>> opLambda) {
        doDelete(pReportLayoutItem, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pReportLayoutItem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PReportLayoutItem pReportLayoutItem, WritableOptionCall<PReportLayoutItemCB, DeleteOption<PReportLayoutItemCB>> opLambda) {
        doDeleteNonstrict(pReportLayoutItem, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PReportLayoutItem> pReportLayoutItemList, WritableOptionCall<PReportLayoutItemCB, InsertOption<PReportLayoutItemCB>> opLambda) {
        return doBatchInsert(pReportLayoutItemList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PReportLayoutItem> pReportLayoutItemList, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> opLambda) {
        return doBatchUpdate(pReportLayoutItemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PReportLayoutItem> pReportLayoutItemList, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> opLambda) {
        return doBatchUpdateNonstrict(pReportLayoutItemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PReportLayoutItem> pReportLayoutItemList, WritableOptionCall<PReportLayoutItemCB, DeleteOption<PReportLayoutItemCB>> opLambda) {
        return doBatchDelete(pReportLayoutItemList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pReportLayoutItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PReportLayoutItem> pReportLayoutItemList, WritableOptionCall<PReportLayoutItemCB, DeleteOption<PReportLayoutItemCB>> opLambda) {
        return doBatchDeleteNonstrict(pReportLayoutItemList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PReportLayoutItem, PReportLayoutItemCB> manyArgLambda, WritableOptionCall<PReportLayoutItemCB, InsertOption<PReportLayoutItemCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PReportLayoutItem pReportLayoutItem = <span style="color: #70226C">new</span> PReportLayoutItem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setPK...(value);</span>
     * pReportLayoutItem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayoutItem.setVersionNo(value);</span>
     * PReportLayoutItemCB cb = <span style="color: #70226C">new</span> PReportLayoutItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pReportLayoutItemBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pReportLayoutItem, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pReportLayoutItem The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PReportLayoutItem pReportLayoutItem, PReportLayoutItemCB cb, WritableOptionCall<PReportLayoutItemCB, UpdateOption<PReportLayoutItemCB>> opLambda) {
        return doQueryUpdate(pReportLayoutItem, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PReportLayoutItem. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PReportLayoutItemCB cb, WritableOptionCall<PReportLayoutItemCB, DeleteOption<PReportLayoutItemCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pReportLayoutItemBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pReportLayoutItemBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pReportLayoutItemBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pReportLayoutItemBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pReportLayoutItemBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pReportLayoutItemBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pReportLayoutItemBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pReportLayoutItemBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pReportLayoutItemBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pReportLayoutItemBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pReportLayoutItemBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pReportLayoutItemBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pReportLayoutItemBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pReportLayoutItemBhv.outideSql().removeBlockComment().selectList()
     * pReportLayoutItemBhv.outideSql().removeLineComment().selectList()
     * pReportLayoutItemBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PReportLayoutItemBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PReportLayoutItemBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PReportLayoutItem> typeOfSelectedEntity() { return PReportLayoutItem.class; }
    protected Class<PReportLayoutItem> typeOfHandlingEntity() { return PReportLayoutItem.class; }
    protected Class<PReportLayoutItemCB> typeOfHandlingConditionBean() { return PReportLayoutItemCB.class; }
}
