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
 * The behavior of B_SCREEN as TABLE. <br>
 * <pre>
 * [primary key]
 *     SCREEN_ID
 *
 * [column]
 *     SCREEN_ID, SCREEN_CD, DICT_ID, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SCREEN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, V_HT_DICT
 *
 * [referrer table]
 *     B_ITEM, B_MENU, B_SCREEN_ROLE, M_CENTER_SCREEN, M_CLIENT_SCREEN
 *
 * [foreign property]
 *     bDict, vDict, vHtDict
 *
 * [referrer property]
 *     bItemList, bMenuList, bScreenRoleList, mCenterScreenList, mClientScreenList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBScreenBhv extends AbstractBehaviorWritable<BScreen, BScreenCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BScreenDbm asDBMeta() { return BScreenDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_SCREEN"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BScreenDbm getMyDBMeta() { return BScreenDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BScreenCB newConditionBean() { return new BScreenCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BScreen newMyEntity() { return new BScreen(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BScreenCB newMyConditionBean() { return new BScreenCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BScreenCB cb) {
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
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().setFoo...(value);
     * BScreen bScreen = <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bScreen != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bScreen.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BScreen selectEntity(BScreenCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BScreen facadeSelectEntity(BScreenCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BScreen> OptionalEntity<ENTITY> doSelectOptionalEntity(BScreenCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().set...;
     * BScreen bScreen = <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bScreen.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BScreen selectEntityWithDeletedCheck(BScreenCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param screenId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BScreen selectByPKValue(Long screenId) {
        return facadeSelectByPKValue(screenId);
    }

    protected BScreen facadeSelectByPKValue(Long screenId) {
        return doSelectByPK(screenId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BScreen> ENTITY doSelectByPK(Long screenId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(screenId), tp);
    }

    protected <ENTITY extends BScreen> OptionalEntity<ENTITY> doSelectOptionalByPK(Long screenId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(screenId, tp), screenId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param screenId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BScreen selectByPKValueWithDeletedCheck(Long screenId) {
        return doSelectByPKWithDeletedCheck(screenId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BScreen> ENTITY doSelectByPKWithDeletedCheck(Long screenId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(screenId), tp);
    }

    protected BScreenCB xprepareCBAsPK(Long screenId) {
        assertObjectNotNull("screenId", screenId);
        return newConditionBean().acceptPK(screenId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param screenCd : UQ, NotNull, varchar(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BScreen> selectByUniqueOf(String screenCd) {
        return facadeSelectByUniqueOf(screenCd);
    }

    protected OptionalEntity<BScreen> facadeSelectByUniqueOf(String screenCd) {
        return doSelectByUniqueOf(screenCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BScreen> OptionalEntity<ENTITY> doSelectByUniqueOf(String screenCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(screenCd), tp), screenCd);
    }

    protected BScreenCB xprepareCBAsUniqueOf(String screenCd) {
        assertObjectNotNull("screenCd", screenCd);
        return newConditionBean().acceptUniqueOf(screenCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BScreen&gt; <span style="color: #553000">bScreenList</span> = <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BScreen> selectList(BScreenCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BScreen&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">page</span>) {
     *     ... = bScreen.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BScreen> selectPage(BScreenCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().set...
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @param entityRowHandler The handler of entity row of BScreen. (NotNull)
     */
    public void selectCursor(BScreenCB cb, EntityRowHandler<BScreen> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BScreenCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BScreenCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BScreen> bScreenList, ReferrerLoaderHandler<LoaderOfBScreen> loaderLambda) {
        xassLRArg(bScreenList, loaderLambda);
        loaderLambda.handle(new LoaderOfBScreen().ready(bScreenList, _behaviorSelector));
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
     * @param bScreen The entity of BScreen. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BScreen bScreen, ReferrerLoaderHandler<LoaderOfBScreen> loaderLambda) {
        xassLRArg(bScreen, loaderLambda);
        loaderLambda.handle(new LoaderOfBScreen().ready(xnewLRAryLs(bScreen), _behaviorSelector));
    }

    /**
     * Load referrer of BItemList by the set-upper of referrer. <br>
     * B_ITEM by SCREEN_ID, named 'BItemList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadBItemList</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getBItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItem> loadBItemList(List<BScreen> bScreenList, ConditionBeanSetupper<BItemCB> refCBLambda) {
        xassLRArg(bScreenList, refCBLambda);
        return doLoadBItemList(bScreenList, new LoadReferrerOption<BItemCB, BItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BItemList by the set-upper of referrer. <br>
     * B_ITEM by SCREEN_ID, named 'BItemList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadBItemList</span>(<span style="color: #553000">bScreen</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bScreen</span>.<span style="color: #CC4747">getBItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreen The entity of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItem> loadBItemList(BScreen bScreen, ConditionBeanSetupper<BItemCB> refCBLambda) {
        xassLRArg(bScreen, refCBLambda);
        return doLoadBItemList(xnewLRLs(bScreen), new LoadReferrerOption<BItemCB, BItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bScreen The entity of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItem> loadBItemList(BScreen bScreen, LoadReferrerOption<BItemCB, BItem> loadReferrerOption) {
        xassLRArg(bScreen, loadReferrerOption);
        return loadBItemList(xnewLRLs(bScreen), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BItem> loadBItemList(List<BScreen> bScreenList, LoadReferrerOption<BItemCB, BItem> loadReferrerOption) {
        xassLRArg(bScreenList, loadReferrerOption);
        if (bScreenList.isEmpty()) { return (NestedReferrerListGateway<BItem>)EMPTY_NREF_LGWAY; }
        return doLoadBItemList(bScreenList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BItem> doLoadBItemList(List<BScreen> bScreenList, LoadReferrerOption<BItemCB, BItem> option) {
        return helpLoadReferrerInternally(bScreenList, option, "bItemList");
    }

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by SCREEN_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">menuCB</span>.setupSelect...
     *     <span style="color: #553000">menuCB</span>.query().set...
     *     <span style="color: #553000">menuCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getBMenuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(List<BScreen> bScreenList, ConditionBeanSetupper<BMenuCB> refCBLambda) {
        xassLRArg(bScreenList, refCBLambda);
        return doLoadBMenuList(bScreenList, new LoadReferrerOption<BMenuCB, BMenu>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by SCREEN_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">bScreen</span>, <span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">menuCB</span>.setupSelect...
     *     <span style="color: #553000">menuCB</span>.query().set...
     *     <span style="color: #553000">menuCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bScreen</span>.<span style="color: #CC4747">getBMenuList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreen The entity of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(BScreen bScreen, ConditionBeanSetupper<BMenuCB> refCBLambda) {
        xassLRArg(bScreen, refCBLambda);
        return doLoadBMenuList(xnewLRLs(bScreen), new LoadReferrerOption<BMenuCB, BMenu>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bScreen The entity of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(BScreen bScreen, LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption) {
        xassLRArg(bScreen, loadReferrerOption);
        return loadBMenuList(xnewLRLs(bScreen), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BMenu> loadBMenuList(List<BScreen> bScreenList, LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption) {
        xassLRArg(bScreenList, loadReferrerOption);
        if (bScreenList.isEmpty()) { return (NestedReferrerListGateway<BMenu>)EMPTY_NREF_LGWAY; }
        return doLoadBMenuList(bScreenList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BMenu> doLoadBMenuList(List<BScreen> bScreenList, LoadReferrerOption<BMenuCB, BMenu> option) {
        return helpLoadReferrerInternally(bScreenList, option, "bMenuList");
    }

    /**
     * Load referrer of BScreenRoleList by the set-upper of referrer. <br>
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadBScreenRoleList</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getBScreenRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(List<BScreen> bScreenList, ConditionBeanSetupper<BScreenRoleCB> refCBLambda) {
        xassLRArg(bScreenList, refCBLambda);
        return doLoadBScreenRoleList(bScreenList, new LoadReferrerOption<BScreenRoleCB, BScreenRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BScreenRoleList by the set-upper of referrer. <br>
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadBScreenRoleList</span>(<span style="color: #553000">bScreen</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bScreen</span>.<span style="color: #CC4747">getBScreenRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreen The entity of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(BScreen bScreen, ConditionBeanSetupper<BScreenRoleCB> refCBLambda) {
        xassLRArg(bScreen, refCBLambda);
        return doLoadBScreenRoleList(xnewLRLs(bScreen), new LoadReferrerOption<BScreenRoleCB, BScreenRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bScreen The entity of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(BScreen bScreen, LoadReferrerOption<BScreenRoleCB, BScreenRole> loadReferrerOption) {
        xassLRArg(bScreen, loadReferrerOption);
        return loadBScreenRoleList(xnewLRLs(bScreen), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(List<BScreen> bScreenList, LoadReferrerOption<BScreenRoleCB, BScreenRole> loadReferrerOption) {
        xassLRArg(bScreenList, loadReferrerOption);
        if (bScreenList.isEmpty()) { return (NestedReferrerListGateway<BScreenRole>)EMPTY_NREF_LGWAY; }
        return doLoadBScreenRoleList(bScreenList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BScreenRole> doLoadBScreenRoleList(List<BScreen> bScreenList, LoadReferrerOption<BScreenRoleCB, BScreenRole> option) {
        return helpLoadReferrerInternally(bScreenList, option, "bScreenRoleList");
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<BScreen> bScreenList, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(bScreenList, refCBLambda);
        return doLoadMCenterScreenList(bScreenList, new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">bScreen</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bScreen</span>.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreen The entity of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(BScreen bScreen, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(bScreen, refCBLambda);
        return doLoadMCenterScreenList(xnewLRLs(bScreen), new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bScreen The entity of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(BScreen bScreen, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(bScreen, loadReferrerOption);
        return loadMCenterScreenList(xnewLRLs(bScreen), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<BScreen> bScreenList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(bScreenList, loadReferrerOption);
        if (bScreenList.isEmpty()) { return (NestedReferrerListGateway<MCenterScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterScreenList(bScreenList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterScreen> doLoadMCenterScreenList(List<BScreen> bScreenList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> option) {
        return helpLoadReferrerInternally(bScreenList, option, "mCenterScreenList");
    }

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">bScreenList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BScreen bScreen : <span style="color: #553000">bScreenList</span>) {
     *     ... = bScreen.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(List<BScreen> bScreenList, ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        xassLRArg(bScreenList, refCBLambda);
        return doLoadMClientScreenList(bScreenList, new LoadReferrerOption<MClientScreenCB, MClientScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">bScreen</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bScreen</span>.<span style="color: #CC4747">getMClientScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setScreenId_InScope(pkList);
     * cb.query().addOrderBy_ScreenId_Asc();
     * </pre>
     * @param bScreen The entity of BScreen. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(BScreen bScreen, ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        xassLRArg(bScreen, refCBLambda);
        return doLoadMClientScreenList(xnewLRLs(bScreen), new LoadReferrerOption<MClientScreenCB, MClientScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bScreen The entity of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(BScreen bScreen, LoadReferrerOption<MClientScreenCB, MClientScreen> loadReferrerOption) {
        xassLRArg(bScreen, loadReferrerOption);
        return loadMClientScreenList(xnewLRLs(bScreen), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bScreenList The entity list of BScreen. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(List<BScreen> bScreenList, LoadReferrerOption<MClientScreenCB, MClientScreen> loadReferrerOption) {
        xassLRArg(bScreenList, loadReferrerOption);
        if (bScreenList.isEmpty()) { return (NestedReferrerListGateway<MClientScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMClientScreenList(bScreenList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientScreen> doLoadMClientScreenList(List<BScreen> bScreenList, LoadReferrerOption<MClientScreenCB, MClientScreen> option) {
        return helpLoadReferrerInternally(bScreenList, option, "mClientScreenList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bScreenList The list of bScreen. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BScreen> bScreenList)
    { return helpPulloutInternally(bScreenList, "bDict"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bScreenList The list of bScreen. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BScreen> bScreenList)
    { return helpPulloutInternally(bScreenList, "vDict"); }

    /**
     * Pull out the list of foreign table 'VHtDict'.
     * @param bScreenList The list of bScreen. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VHtDict> pulloutVHtDict(List<BScreen> bScreenList)
    { return helpPulloutInternally(bScreenList, "vHtDict"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key screenId.
     * @param bScreenList The list of bScreen. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractScreenIdList(List<BScreen> bScreenList)
    { return helpExtractListInternally(bScreenList, "screenId"); }

    /**
     * Extract the value list of (single) unique key screenCd.
     * @param bScreenList The list of bScreen. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractScreenCdList(List<BScreen> bScreenList)
    { return helpExtractListInternally(bScreenList, "screenCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bScreen.setFoo...(value);
     * bScreen.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bScreen.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bScreen.set...;</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">insert</span>(bScreen);
     * ... = bScreen.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bScreen The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BScreen bScreen) {
        doInsert(bScreen, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bScreen.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bScreen.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bScreen.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bScreen.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">update</span>(bScreen);
     * </pre>
     * @param bScreen The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BScreen bScreen) {
        doUpdate(bScreen, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bScreen.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bScreen.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bScreen.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bScreen.setVersionNo(value);</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bScreen);
     * </pre>
     * @param bScreen The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BScreen bScreen) {
        doUpdateNonstrict(bScreen, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bScreen The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BScreen bScreen) {
        doInsertOrUpdate(bScreen, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bScreen The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BScreen bScreen) {
        doInsertOrUpdateNonstrict(bScreen, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bScreen.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">delete</span>(bScreen);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bScreen The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BScreen bScreen) {
        doDelete(bScreen, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bScreen.setVersionNo(value);</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bScreen);
     * </pre>
     * @param bScreen The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BScreen bScreen) {
        doDeleteNonstrict(bScreen, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bScreen.setVersionNo(value);</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bScreen);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bScreen The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BScreen bScreen) {
        doDeleteNonstrictIgnoreDeleted(bScreen, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BScreen et, final DeleteOption<BScreenCB> op) {
        assertObjectNotNull("bScreen", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     *     bScreen.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bScreen.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bScreenList.add(bScreen);
     * }
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">batchInsert</span>(bScreenList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BScreen> bScreenList) {
        return doBatchInsert(bScreenList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     *     bScreen.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bScreen.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bScreen.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bScreen.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bScreenList.add(bScreen);
     * }
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bScreenList);
     * </pre>
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BScreen> bScreenList) {
        return doBatchUpdate(bScreenList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bScreenBhv.<span style="color: #CC4747">batchUpdate</span>(bScreenList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bScreenList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BScreen> bScreenList, SpecifyQuery<BScreenCB> colCBLambda) {
        return doBatchUpdate(bScreenList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     *     bScreen.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bScreen.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bScreen.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bScreen.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bScreenList.add(bScreen);
     * }
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bScreenList);
     * </pre>
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BScreen> bScreenList) {
        return doBatchUpdateNonstrict(bScreenList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bScreenList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bScreenList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BScreen> bScreenList, SpecifyQuery<BScreenCB> colCBLambda) {
        return doBatchUpdateNonstrict(bScreenList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BScreen> bScreenList) {
        return doBatchDelete(bScreenList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BScreen> bScreenList) {
        return doBatchDeleteNonstrict(bScreenList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BScreen, BScreenCB&gt;() {
     *     public ConditionBean setup(BScreen entity, BScreenCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BScreen, BScreenCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bScreen.setPK...(value);</span>
     * bScreen.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bScreen.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bScreen.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bScreen.setVersionNo(value);</span>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bScreen, cb);
     * </pre>
     * @param bScreen The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BScreen bScreen, BScreenCB cb) {
        return doQueryUpdate(bScreen, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BScreenCB cb = new BScreenCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">queryDelete</span>(bScreen, cb);
     * </pre>
     * @param cb The condition-bean of BScreen. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BScreenCB cb) {
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
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bScreen.setFoo...(value);
     * bScreen.setBar...(value);
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bScreen, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bScreen.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bScreen The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BScreen bScreen, WritableOptionCall<BScreenCB, InsertOption<BScreenCB>> opLambda) {
        doInsert(bScreen, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bScreen.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bScreen.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bScreen, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bScreen The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BScreen bScreen, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> opLambda) {
        doUpdate(bScreen, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * bScreen.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bScreen.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bScreen.setVersionNo(value);</span>
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bScreen, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bScreen The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BScreen bScreen, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> opLambda) {
        doUpdateNonstrict(bScreen, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bScreen The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BScreen bScreen, WritableOptionCall<BScreenCB, InsertOption<BScreenCB>> insertOpLambda, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> updateOpLambda) {
        doInsertOrUpdate(bScreen, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bScreen The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BScreen bScreen, WritableOptionCall<BScreenCB, InsertOption<BScreenCB>> insertOpLambda, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bScreen, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bScreen The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BScreen bScreen, WritableOptionCall<BScreenCB, DeleteOption<BScreenCB>> opLambda) {
        doDelete(bScreen, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bScreen The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BScreen bScreen, WritableOptionCall<BScreenCB, DeleteOption<BScreenCB>> opLambda) {
        doDeleteNonstrict(bScreen, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BScreen> bScreenList, WritableOptionCall<BScreenCB, InsertOption<BScreenCB>> opLambda) {
        return doBatchInsert(bScreenList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BScreen> bScreenList, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> opLambda) {
        return doBatchUpdate(bScreenList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BScreen> bScreenList, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> opLambda) {
        return doBatchUpdateNonstrict(bScreenList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BScreen> bScreenList, WritableOptionCall<BScreenCB, DeleteOption<BScreenCB>> opLambda) {
        return doBatchDelete(bScreenList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bScreenList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BScreen> bScreenList, WritableOptionCall<BScreenCB, DeleteOption<BScreenCB>> opLambda) {
        return doBatchDeleteNonstrict(bScreenList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BScreen, BScreenCB> manyArgLambda, WritableOptionCall<BScreenCB, InsertOption<BScreenCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BScreen bScreen = <span style="color: #70226C">new</span> BScreen();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bScreen.setPK...(value);</span>
     * bScreen.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bScreen.setVersionNo(value);</span>
     * BScreenCB cb = <span style="color: #70226C">new</span> BScreenCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bScreenBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bScreen, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bScreen The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BScreen. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BScreen bScreen, BScreenCB cb, WritableOptionCall<BScreenCB, UpdateOption<BScreenCB>> opLambda) {
        return doQueryUpdate(bScreen, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BScreen. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BScreenCB cb, WritableOptionCall<BScreenCB, DeleteOption<BScreenCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bScreenBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bScreenBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bScreenBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bScreenBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bScreenBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bScreenBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bScreenBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bScreenBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bScreenBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bScreenBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bScreenBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bScreenBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bScreenBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bScreenBhv.outideSql().removeBlockComment().selectList()
     * bScreenBhv.outideSql().removeLineComment().selectList()
     * bScreenBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BScreenBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BScreenBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BScreen> typeOfSelectedEntity() { return BScreen.class; }
    protected Class<BScreen> typeOfHandlingEntity() { return BScreen.class; }
    protected Class<BScreenCB> typeOfHandlingConditionBean() { return BScreenCB.class; }
}
