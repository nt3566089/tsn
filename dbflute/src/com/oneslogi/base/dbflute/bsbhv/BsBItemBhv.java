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
 * The behavior of B_ITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     ITEM_ID
 *
 * [column]
 *     ITEM_ID, SCREEN_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, DISPLAY_REQUIRED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_SCREEN, B_DICT, V_DICT, V_HT_DICT, B_CLASS_DTL(ByItemType), B_ITEM_VALID(AsOne)
 *
 * [referrer table]
 *     B_COL, B_COL_EXT_BASE, B_COL_EXT_USER, B_ITEM_ROLE, M_CENTER_ITEM, M_CLIENT_ITEM, B_ITEM_VALID
 *
 * [foreign property]
 *     bScreen, bDict, vDict, vHtDict, bClassDtlByItemType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bClassDtlByDisplayRequired, bItemValidAsOne
 *
 * [referrer property]
 *     bColList, bColExtBaseList, bColExtUserList, bItemRoleList, mCenterItemList, mClientItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBItemBhv extends AbstractBehaviorWritable<BItem, BItemCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BItemDbm asDBMeta() { return BItemDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_ITEM"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BItemDbm getMyDBMeta() { return BItemDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BItemCB newConditionBean() { return new BItemCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BItem newMyEntity() { return new BItem(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BItemCB newMyConditionBean() { return new BItemCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BItemCB cb) {
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
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().setFoo...(value);
     * BItem bItem = <span style="color: #0000C0">bItemBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bItem != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bItem.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BItem selectEntity(BItemCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BItem facadeSelectEntity(BItemCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BItem> OptionalEntity<ENTITY> doSelectOptionalEntity(BItemCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().set...;
     * BItem bItem = <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bItem.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BItem selectEntityWithDeletedCheck(BItemCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param itemId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BItem selectByPKValue(Long itemId) {
        return facadeSelectByPKValue(itemId);
    }

    protected BItem facadeSelectByPKValue(Long itemId) {
        return doSelectByPK(itemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BItem> ENTITY doSelectByPK(Long itemId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(itemId), tp);
    }

    protected <ENTITY extends BItem> OptionalEntity<ENTITY> doSelectOptionalByPK(Long itemId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(itemId, tp), itemId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param itemId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BItem selectByPKValueWithDeletedCheck(Long itemId) {
        return doSelectByPKWithDeletedCheck(itemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BItem> ENTITY doSelectByPKWithDeletedCheck(Long itemId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(itemId), tp);
    }

    protected BItemCB xprepareCBAsPK(Long itemId) {
        assertObjectNotNull("itemId", itemId);
        return newConditionBean().acceptPK(itemId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param itemCd : UQ+, NotNull, varchar(100). (NotNull)
     * @param screenId : +UQ, IX, NotNull, bigint(19), FK to B_SCREEN. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BItem> selectByUniqueOf(String itemCd, Long screenId) {
        return facadeSelectByUniqueOf(itemCd, screenId);
    }

    protected OptionalEntity<BItem> facadeSelectByUniqueOf(String itemCd, Long screenId) {
        return doSelectByUniqueOf(itemCd, screenId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BItem> OptionalEntity<ENTITY> doSelectByUniqueOf(String itemCd, Long screenId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(itemCd, screenId), tp), itemCd, screenId);
    }

    protected BItemCB xprepareCBAsUniqueOf(String itemCd, Long screenId) {
        assertObjectNotNull("itemCd", itemCd);assertObjectNotNull("screenId", screenId);
        return newConditionBean().acceptUniqueOf(itemCd, screenId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BItem&gt; <span style="color: #553000">bItemList</span> = <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BItem> selectList(BItemCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BItem&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">page</span>) {
     *     ... = bItem.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BItem> selectPage(BItemCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().set...
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @param entityRowHandler The handler of entity row of BItem. (NotNull)
     */
    public void selectCursor(BItemCB cb, EntityRowHandler<BItem> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BItemCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BItemCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BItem> bItemList, ReferrerLoaderHandler<LoaderOfBItem> loaderLambda) {
        xassLRArg(bItemList, loaderLambda);
        loaderLambda.handle(new LoaderOfBItem().ready(bItemList, _behaviorSelector));
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
     * @param bItem The entity of BItem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BItem bItem, ReferrerLoaderHandler<LoaderOfBItem> loaderLambda) {
        xassLRArg(bItem, loaderLambda);
        loaderLambda.handle(new LoaderOfBItem().ready(xnewLRAryLs(bItem), _behaviorSelector));
    }

    /**
     * Load referrer of BColList by the set-upper of referrer. <br>
     * B_COL by ITEM_ID, named 'BColList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBColList</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItemList The entity list of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCol> loadBColList(List<BItem> bItemList, ConditionBeanSetupper<BColCB> refCBLambda) {
        xassLRArg(bItemList, refCBLambda);
        return doLoadBColList(bItemList, new LoadReferrerOption<BColCB, BCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BColList by the set-upper of referrer. <br>
     * B_COL by ITEM_ID, named 'BColList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBColList</span>(<span style="color: #553000">bItem</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bItem</span>.<span style="color: #CC4747">getBColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItem The entity of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCol> loadBColList(BItem bItem, ConditionBeanSetupper<BColCB> refCBLambda) {
        xassLRArg(bItem, refCBLambda);
        return doLoadBColList(xnewLRLs(bItem), new LoadReferrerOption<BColCB, BCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bItem The entity of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCol> loadBColList(BItem bItem, LoadReferrerOption<BColCB, BCol> loadReferrerOption) {
        xassLRArg(bItem, loadReferrerOption);
        return loadBColList(xnewLRLs(bItem), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BCol> loadBColList(List<BItem> bItemList, LoadReferrerOption<BColCB, BCol> loadReferrerOption) {
        xassLRArg(bItemList, loadReferrerOption);
        if (bItemList.isEmpty()) { return (NestedReferrerListGateway<BCol>)EMPTY_NREF_LGWAY; }
        return doLoadBColList(bItemList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BCol> doLoadBColList(List<BItem> bItemList, LoadReferrerOption<BColCB, BCol> option) {
        return helpLoadReferrerInternally(bItemList, option, "bColList");
    }

    /**
     * Load referrer of BColExtBaseList by the set-upper of referrer. <br>
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBColExtBaseList</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseCB</span>.setupSelect...
     *     <span style="color: #553000">baseCB</span>.query().set...
     *     <span style="color: #553000">baseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBColExtBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItemList The entity list of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColExtBase> loadBColExtBaseList(List<BItem> bItemList, ConditionBeanSetupper<BColExtBaseCB> refCBLambda) {
        xassLRArg(bItemList, refCBLambda);
        return doLoadBColExtBaseList(bItemList, new LoadReferrerOption<BColExtBaseCB, BColExtBase>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BColExtBaseList by the set-upper of referrer. <br>
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBColExtBaseList</span>(<span style="color: #553000">bItem</span>, <span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseCB</span>.setupSelect...
     *     <span style="color: #553000">baseCB</span>.query().set...
     *     <span style="color: #553000">baseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bItem</span>.<span style="color: #CC4747">getBColExtBaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItem The entity of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColExtBase> loadBColExtBaseList(BItem bItem, ConditionBeanSetupper<BColExtBaseCB> refCBLambda) {
        xassLRArg(bItem, refCBLambda);
        return doLoadBColExtBaseList(xnewLRLs(bItem), new LoadReferrerOption<BColExtBaseCB, BColExtBase>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bItem The entity of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColExtBase> loadBColExtBaseList(BItem bItem, LoadReferrerOption<BColExtBaseCB, BColExtBase> loadReferrerOption) {
        xassLRArg(bItem, loadReferrerOption);
        return loadBColExtBaseList(xnewLRLs(bItem), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BColExtBase> loadBColExtBaseList(List<BItem> bItemList, LoadReferrerOption<BColExtBaseCB, BColExtBase> loadReferrerOption) {
        xassLRArg(bItemList, loadReferrerOption);
        if (bItemList.isEmpty()) { return (NestedReferrerListGateway<BColExtBase>)EMPTY_NREF_LGWAY; }
        return doLoadBColExtBaseList(bItemList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BColExtBase> doLoadBColExtBaseList(List<BItem> bItemList, LoadReferrerOption<BColExtBaseCB, BColExtBase> option) {
        return helpLoadReferrerInternally(bItemList, option, "bColExtBaseList");
    }

    /**
     * Load referrer of BColExtUserList by the set-upper of referrer. <br>
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBColExtUserList</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBColExtUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItemList The entity list of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColExtUser> loadBColExtUserList(List<BItem> bItemList, ConditionBeanSetupper<BColExtUserCB> refCBLambda) {
        xassLRArg(bItemList, refCBLambda);
        return doLoadBColExtUserList(bItemList, new LoadReferrerOption<BColExtUserCB, BColExtUser>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BColExtUserList by the set-upper of referrer. <br>
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBColExtUserList</span>(<span style="color: #553000">bItem</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bItem</span>.<span style="color: #CC4747">getBColExtUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItem The entity of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColExtUser> loadBColExtUserList(BItem bItem, ConditionBeanSetupper<BColExtUserCB> refCBLambda) {
        xassLRArg(bItem, refCBLambda);
        return doLoadBColExtUserList(xnewLRLs(bItem), new LoadReferrerOption<BColExtUserCB, BColExtUser>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bItem The entity of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColExtUser> loadBColExtUserList(BItem bItem, LoadReferrerOption<BColExtUserCB, BColExtUser> loadReferrerOption) {
        xassLRArg(bItem, loadReferrerOption);
        return loadBColExtUserList(xnewLRLs(bItem), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BColExtUser> loadBColExtUserList(List<BItem> bItemList, LoadReferrerOption<BColExtUserCB, BColExtUser> loadReferrerOption) {
        xassLRArg(bItemList, loadReferrerOption);
        if (bItemList.isEmpty()) { return (NestedReferrerListGateway<BColExtUser>)EMPTY_NREF_LGWAY; }
        return doLoadBColExtUserList(bItemList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BColExtUser> doLoadBColExtUserList(List<BItem> bItemList, LoadReferrerOption<BColExtUserCB, BColExtUser> option) {
        return helpLoadReferrerInternally(bItemList, option, "bColExtUserList");
    }

    /**
     * Load referrer of BItemRoleList by the set-upper of referrer. <br>
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBItemRoleList</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBItemRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItemList The entity list of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(List<BItem> bItemList, ConditionBeanSetupper<BItemRoleCB> refCBLambda) {
        xassLRArg(bItemList, refCBLambda);
        return doLoadBItemRoleList(bItemList, new LoadReferrerOption<BItemRoleCB, BItemRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BItemRoleList by the set-upper of referrer. <br>
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadBItemRoleList</span>(<span style="color: #553000">bItem</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bItem</span>.<span style="color: #CC4747">getBItemRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItem The entity of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(BItem bItem, ConditionBeanSetupper<BItemRoleCB> refCBLambda) {
        xassLRArg(bItem, refCBLambda);
        return doLoadBItemRoleList(xnewLRLs(bItem), new LoadReferrerOption<BItemRoleCB, BItemRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bItem The entity of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(BItem bItem, LoadReferrerOption<BItemRoleCB, BItemRole> loadReferrerOption) {
        xassLRArg(bItem, loadReferrerOption);
        return loadBItemRoleList(xnewLRLs(bItem), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(List<BItem> bItemList, LoadReferrerOption<BItemRoleCB, BItemRole> loadReferrerOption) {
        xassLRArg(bItemList, loadReferrerOption);
        if (bItemList.isEmpty()) { return (NestedReferrerListGateway<BItemRole>)EMPTY_NREF_LGWAY; }
        return doLoadBItemRoleList(bItemList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BItemRole> doLoadBItemRoleList(List<BItem> bItemList, LoadReferrerOption<BItemRoleCB, BItemRole> option) {
        return helpLoadReferrerInternally(bItemList, option, "bItemRoleList");
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItemList The entity list of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<BItem> bItemList, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(bItemList, refCBLambda);
        return doLoadMCenterItemList(bItemList, new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">bItem</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bItem</span>.<span style="color: #CC4747">getMCenterItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItem The entity of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(BItem bItem, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(bItem, refCBLambda);
        return doLoadMCenterItemList(xnewLRLs(bItem), new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bItem The entity of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(BItem bItem, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(bItem, loadReferrerOption);
        return loadMCenterItemList(xnewLRLs(bItem), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<BItem> bItemList, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(bItemList, loadReferrerOption);
        if (bItemList.isEmpty()) { return (NestedReferrerListGateway<MCenterItem>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterItemList(bItemList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterItem> doLoadMCenterItemList(List<BItem> bItemList, LoadReferrerOption<MCenterItemCB, MCenterItem> option) {
        return helpLoadReferrerInternally(bItemList, option, "mCenterItemList");
    }

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItemList The entity list of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(List<BItem> bItemList, ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        xassLRArg(bItemList, refCBLambda);
        return doLoadMClientItemList(bItemList, new LoadReferrerOption<MClientItemCB, MClientItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">bItem</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bItem</span>.<span style="color: #CC4747">getMClientItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param bItem The entity of BItem. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(BItem bItem, ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        xassLRArg(bItem, refCBLambda);
        return doLoadMClientItemList(xnewLRLs(bItem), new LoadReferrerOption<MClientItemCB, MClientItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bItem The entity of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(BItem bItem, LoadReferrerOption<MClientItemCB, MClientItem> loadReferrerOption) {
        xassLRArg(bItem, loadReferrerOption);
        return loadMClientItemList(xnewLRLs(bItem), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bItemList The entity list of BItem. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(List<BItem> bItemList, LoadReferrerOption<MClientItemCB, MClientItem> loadReferrerOption) {
        xassLRArg(bItemList, loadReferrerOption);
        if (bItemList.isEmpty()) { return (NestedReferrerListGateway<MClientItem>)EMPTY_NREF_LGWAY; }
        return doLoadMClientItemList(bItemList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientItem> doLoadMClientItemList(List<BItem> bItemList, LoadReferrerOption<MClientItemCB, MClientItem> option) {
        return helpLoadReferrerInternally(bItemList, option, "mClientItemList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BScreen'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BScreen> pulloutBScreen(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bScreen"); }

    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bDict"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "vDict"); }

    /**
     * Pull out the list of foreign table 'VHtDict'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VHtDict> pulloutVHtDict(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "vHtDict"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByItemType(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bClassDtlByItemType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByVisible(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bClassDtlByVisible"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEditable(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bClassDtlByEditable"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByTextAlign(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bClassDtlByTextAlign"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByNecessary(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bClassDtlByNecessary"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDisplayRequired(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bClassDtlByDisplayRequired"); }

    /**
     * Pull out the list of referrer-as-one table 'BItemValid'.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BItemValid> pulloutBItemValidAsOne(List<BItem> bItemList)
    { return helpPulloutInternally(bItemList, "bItemValidAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key itemId.
     * @param bItemList The list of bItem. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractItemIdList(List<BItem> bItemList)
    { return helpExtractListInternally(bItemList, "itemId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bItem.setFoo...(value);
     * bItem.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bItem.set...;</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">insert</span>(bItem);
     * ... = bItem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bItem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BItem bItem) {
        doInsert(bItem, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bItem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bItem.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bItem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">update</span>(bItem);
     * </pre>
     * @param bItem The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BItem bItem) {
        doUpdate(bItem, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bItem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bItem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bItem);
     * </pre>
     * @param bItem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BItem bItem) {
        doUpdateNonstrict(bItem, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bItem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BItem bItem) {
        doInsertOrUpdate(bItem, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bItem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BItem bItem) {
        doInsertOrUpdateNonstrict(bItem, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bItem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">delete</span>(bItem);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bItem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BItem bItem) {
        doDelete(bItem, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bItem);
     * </pre>
     * @param bItem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BItem bItem) {
        doDeleteNonstrict(bItem, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bItem);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bItem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BItem bItem) {
        doDeleteNonstrictIgnoreDeleted(bItem, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BItem et, final DeleteOption<BItemCB> op) {
        assertObjectNotNull("bItem", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BItem bItem = <span style="color: #70226C">new</span> BItem();
     *     bItem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bItem.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bItemList.add(bItem);
     * }
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">batchInsert</span>(bItemList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BItem> bItemList) {
        return doBatchInsert(bItemList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BItem bItem = <span style="color: #70226C">new</span> BItem();
     *     bItem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bItem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bItem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bItem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bItemList.add(bItem);
     * }
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bItemList);
     * </pre>
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BItem> bItemList) {
        return doBatchUpdate(bItemList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bItemBhv.<span style="color: #CC4747">batchUpdate</span>(bItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BItem> bItemList, SpecifyQuery<BItemCB> colCBLambda) {
        return doBatchUpdate(bItemList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BItem bItem = <span style="color: #70226C">new</span> BItem();
     *     bItem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bItem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bItem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bItem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bItemList.add(bItem);
     * }
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bItemList);
     * </pre>
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BItem> bItemList) {
        return doBatchUpdateNonstrict(bItemList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bItemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BItem> bItemList, SpecifyQuery<BItemCB> colCBLambda) {
        return doBatchUpdateNonstrict(bItemList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BItem> bItemList) {
        return doBatchDelete(bItemList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BItem> bItemList) {
        return doBatchDeleteNonstrict(bItemList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BItem, BItemCB&gt;() {
     *     public ConditionBean setup(BItem entity, BItemCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BItem, BItemCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bItem.setPK...(value);</span>
     * bItem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bItem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bItem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bItem.setVersionNo(value);</span>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bItem, cb);
     * </pre>
     * @param bItem The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BItem bItem, BItemCB cb) {
        return doQueryUpdate(bItem, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BItemCB cb = new BItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">queryDelete</span>(bItem, cb);
     * </pre>
     * @param cb The condition-bean of BItem. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BItemCB cb) {
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
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bItem.setFoo...(value);
     * bItem.setBar...(value);
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bItem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bItem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bItem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BItem bItem, WritableOptionCall<BItemCB, InsertOption<BItemCB>> opLambda) {
        doInsert(bItem, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bItem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bItem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bItem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bItem The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BItem bItem, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> opLambda) {
        doUpdate(bItem, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * bItem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bItem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bItem.setVersionNo(value);</span>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bItem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bItem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BItem bItem, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> opLambda) {
        doUpdateNonstrict(bItem, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bItem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BItem bItem, WritableOptionCall<BItemCB, InsertOption<BItemCB>> insertOpLambda, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> updateOpLambda) {
        doInsertOrUpdate(bItem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bItem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BItem bItem, WritableOptionCall<BItemCB, InsertOption<BItemCB>> insertOpLambda, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bItem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bItem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BItem bItem, WritableOptionCall<BItemCB, DeleteOption<BItemCB>> opLambda) {
        doDelete(bItem, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bItem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BItem bItem, WritableOptionCall<BItemCB, DeleteOption<BItemCB>> opLambda) {
        doDeleteNonstrict(bItem, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BItem> bItemList, WritableOptionCall<BItemCB, InsertOption<BItemCB>> opLambda) {
        return doBatchInsert(bItemList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BItem> bItemList, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> opLambda) {
        return doBatchUpdate(bItemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BItem> bItemList, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> opLambda) {
        return doBatchUpdateNonstrict(bItemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BItem> bItemList, WritableOptionCall<BItemCB, DeleteOption<BItemCB>> opLambda) {
        return doBatchDelete(bItemList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bItemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BItem> bItemList, WritableOptionCall<BItemCB, DeleteOption<BItemCB>> opLambda) {
        return doBatchDeleteNonstrict(bItemList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BItem, BItemCB> manyArgLambda, WritableOptionCall<BItemCB, InsertOption<BItemCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BItem bItem = <span style="color: #70226C">new</span> BItem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bItem.setPK...(value);</span>
     * bItem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bItem.setVersionNo(value);</span>
     * BItemCB cb = <span style="color: #70226C">new</span> BItemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bItem, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bItem The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BItem. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BItem bItem, BItemCB cb, WritableOptionCall<BItemCB, UpdateOption<BItemCB>> opLambda) {
        return doQueryUpdate(bItem, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BItem. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BItemCB cb, WritableOptionCall<BItemCB, DeleteOption<BItemCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bItemBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bItemBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bItemBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bItemBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bItemBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bItemBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bItemBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bItemBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bItemBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bItemBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bItemBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bItemBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bItemBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bItemBhv.outideSql().removeBlockComment().selectList()
     * bItemBhv.outideSql().removeLineComment().selectList()
     * bItemBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BItemBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BItemBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BItem> typeOfSelectedEntity() { return BItem.class; }
    protected Class<BItem> typeOfHandlingEntity() { return BItem.class; }
    protected Class<BItemCB> typeOfHandlingConditionBean() { return BItemCB.class; }
}
