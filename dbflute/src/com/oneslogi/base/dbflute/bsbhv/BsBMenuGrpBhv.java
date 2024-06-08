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
 * The behavior of B_MENU_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     MENU_GRP_ID
 *
 * [column]
 *     MENU_GRP_ID, MENU_GRP_CD, DICT_ID, PARENT_MENU_GRP_ID, VIEW_ORDER, VISIBLE_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_MENU_GRP, V_DICT, V_HT_DICT
 *
 * [referrer table]
 *     B_MENU, B_MENU_GRP
 *
 * [foreign property]
 *     bDict, bMenuGrpSelf, vDict, vHtDict
 *
 * [referrer property]
 *     bMenuList, bMenuGrpSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBMenuGrpBhv extends AbstractBehaviorWritable<BMenuGrp, BMenuGrpCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BMenuGrpDbm asDBMeta() { return BMenuGrpDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_MENU_GRP"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BMenuGrpDbm getMyDBMeta() { return BMenuGrpDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BMenuGrpCB newConditionBean() { return new BMenuGrpCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BMenuGrp newMyEntity() { return new BMenuGrp(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BMenuGrpCB newMyConditionBean() { return new BMenuGrpCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BMenuGrpCB cb) {
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
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().setFoo...(value);
     * BMenuGrp bMenuGrp = <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bMenuGrp != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bMenuGrp.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BMenuGrp selectEntity(BMenuGrpCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BMenuGrp facadeSelectEntity(BMenuGrpCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BMenuGrp> OptionalEntity<ENTITY> doSelectOptionalEntity(BMenuGrpCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().set...;
     * BMenuGrp bMenuGrp = <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bMenuGrp.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BMenuGrp selectEntityWithDeletedCheck(BMenuGrpCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param menuGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BMenuGrp selectByPKValue(Long menuGrpId) {
        return facadeSelectByPKValue(menuGrpId);
    }

    protected BMenuGrp facadeSelectByPKValue(Long menuGrpId) {
        return doSelectByPK(menuGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BMenuGrp> ENTITY doSelectByPK(Long menuGrpId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(menuGrpId), tp);
    }

    protected <ENTITY extends BMenuGrp> OptionalEntity<ENTITY> doSelectOptionalByPK(Long menuGrpId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(menuGrpId, tp), menuGrpId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param menuGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BMenuGrp selectByPKValueWithDeletedCheck(Long menuGrpId) {
        return doSelectByPKWithDeletedCheck(menuGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BMenuGrp> ENTITY doSelectByPKWithDeletedCheck(Long menuGrpId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(menuGrpId), tp);
    }

    protected BMenuGrpCB xprepareCBAsPK(Long menuGrpId) {
        assertObjectNotNull("menuGrpId", menuGrpId);
        return newConditionBean().acceptPK(menuGrpId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param menuGrpCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BMenuGrp> selectByUniqueOf(String menuGrpCd) {
        return facadeSelectByUniqueOf(menuGrpCd);
    }

    protected OptionalEntity<BMenuGrp> facadeSelectByUniqueOf(String menuGrpCd) {
        return doSelectByUniqueOf(menuGrpCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BMenuGrp> OptionalEntity<ENTITY> doSelectByUniqueOf(String menuGrpCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(menuGrpCd), tp), menuGrpCd);
    }

    protected BMenuGrpCB xprepareCBAsUniqueOf(String menuGrpCd) {
        assertObjectNotNull("menuGrpCd", menuGrpCd);
        return newConditionBean().acceptUniqueOf(menuGrpCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BMenuGrp&gt; <span style="color: #553000">bMenuGrpList</span> = <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BMenuGrp bMenuGrp : <span style="color: #553000">bMenuGrpList</span>) {
     *     ... = bMenuGrp.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BMenuGrp> selectList(BMenuGrpCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BMenuGrp&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BMenuGrp bMenuGrp : <span style="color: #553000">page</span>) {
     *     ... = bMenuGrp.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BMenuGrp> selectPage(BMenuGrpCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().set...
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @param entityRowHandler The handler of entity row of BMenuGrp. (NotNull)
     */
    public void selectCursor(BMenuGrpCB cb, EntityRowHandler<BMenuGrp> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BMenuGrpCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BMenuGrpCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bMenuGrpList The entity list of BMenuGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BMenuGrp> bMenuGrpList, ReferrerLoaderHandler<LoaderOfBMenuGrp> loaderLambda) {
        xassLRArg(bMenuGrpList, loaderLambda);
        loaderLambda.handle(new LoaderOfBMenuGrp().ready(bMenuGrpList, _behaviorSelector));
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
     * @param bMenuGrp The entity of BMenuGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BMenuGrp bMenuGrp, ReferrerLoaderHandler<LoaderOfBMenuGrp> loaderLambda) {
        xassLRArg(bMenuGrp, loaderLambda);
        loaderLambda.handle(new LoaderOfBMenuGrp().ready(xnewLRAryLs(bMenuGrp), _behaviorSelector));
    }

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by MENU_GRP_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">bMenuGrpList</span>, <span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">menuCB</span>.setupSelect...
     *     <span style="color: #553000">menuCB</span>.query().set...
     *     <span style="color: #553000">menuCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BMenuGrp bMenuGrp : <span style="color: #553000">bMenuGrpList</span>) {
     *     ... = bMenuGrp.<span style="color: #CC4747">getBMenuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMenuGrpId_InScope(pkList);
     * cb.query().addOrderBy_MenuGrpId_Asc();
     * </pre>
     * @param bMenuGrpList The entity list of BMenuGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(List<BMenuGrp> bMenuGrpList, ConditionBeanSetupper<BMenuCB> refCBLambda) {
        xassLRArg(bMenuGrpList, refCBLambda);
        return doLoadBMenuList(bMenuGrpList, new LoadReferrerOption<BMenuCB, BMenu>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by MENU_GRP_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">bMenuGrp</span>, <span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">menuCB</span>.setupSelect...
     *     <span style="color: #553000">menuCB</span>.query().set...
     *     <span style="color: #553000">menuCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bMenuGrp</span>.<span style="color: #CC4747">getBMenuList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMenuGrpId_InScope(pkList);
     * cb.query().addOrderBy_MenuGrpId_Asc();
     * </pre>
     * @param bMenuGrp The entity of BMenuGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(BMenuGrp bMenuGrp, ConditionBeanSetupper<BMenuCB> refCBLambda) {
        xassLRArg(bMenuGrp, refCBLambda);
        return doLoadBMenuList(xnewLRLs(bMenuGrp), new LoadReferrerOption<BMenuCB, BMenu>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bMenuGrp The entity of BMenuGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(BMenuGrp bMenuGrp, LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption) {
        xassLRArg(bMenuGrp, loadReferrerOption);
        return loadBMenuList(xnewLRLs(bMenuGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bMenuGrpList The entity list of BMenuGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BMenu> loadBMenuList(List<BMenuGrp> bMenuGrpList, LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption) {
        xassLRArg(bMenuGrpList, loadReferrerOption);
        if (bMenuGrpList.isEmpty()) { return (NestedReferrerListGateway<BMenu>)EMPTY_NREF_LGWAY; }
        return doLoadBMenuList(bMenuGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BMenu> doLoadBMenuList(List<BMenuGrp> bMenuGrpList, LoadReferrerOption<BMenuCB, BMenu> option) {
        return helpLoadReferrerInternally(bMenuGrpList, option, "bMenuList");
    }

    /**
     * Load referrer of BMenuGrpSelfList by the set-upper of referrer. <br>
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfList'.
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">loadBMenuGrpSelfList</span>(<span style="color: #553000">bMenuGrpList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BMenuGrp bMenuGrp : <span style="color: #553000">bMenuGrpList</span>) {
     *     ... = bMenuGrp.<span style="color: #CC4747">getBMenuGrpSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentMenuGrpId_InScope(pkList);
     * cb.query().addOrderBy_ParentMenuGrpId_Asc();
     * </pre>
     * @param bMenuGrpList The entity list of BMenuGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpSelfList(List<BMenuGrp> bMenuGrpList, ConditionBeanSetupper<BMenuGrpCB> refCBLambda) {
        xassLRArg(bMenuGrpList, refCBLambda);
        return doLoadBMenuGrpSelfList(bMenuGrpList, new LoadReferrerOption<BMenuGrpCB, BMenuGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BMenuGrpSelfList by the set-upper of referrer. <br>
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfList'.
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">loadBMenuGrpSelfList</span>(<span style="color: #553000">bMenuGrp</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bMenuGrp</span>.<span style="color: #CC4747">getBMenuGrpSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentMenuGrpId_InScope(pkList);
     * cb.query().addOrderBy_ParentMenuGrpId_Asc();
     * </pre>
     * @param bMenuGrp The entity of BMenuGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpSelfList(BMenuGrp bMenuGrp, ConditionBeanSetupper<BMenuGrpCB> refCBLambda) {
        xassLRArg(bMenuGrp, refCBLambda);
        return doLoadBMenuGrpSelfList(xnewLRLs(bMenuGrp), new LoadReferrerOption<BMenuGrpCB, BMenuGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bMenuGrp The entity of BMenuGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpSelfList(BMenuGrp bMenuGrp, LoadReferrerOption<BMenuGrpCB, BMenuGrp> loadReferrerOption) {
        xassLRArg(bMenuGrp, loadReferrerOption);
        return loadBMenuGrpSelfList(xnewLRLs(bMenuGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bMenuGrpList The entity list of BMenuGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpSelfList(List<BMenuGrp> bMenuGrpList, LoadReferrerOption<BMenuGrpCB, BMenuGrp> loadReferrerOption) {
        xassLRArg(bMenuGrpList, loadReferrerOption);
        if (bMenuGrpList.isEmpty()) { return (NestedReferrerListGateway<BMenuGrp>)EMPTY_NREF_LGWAY; }
        return doLoadBMenuGrpSelfList(bMenuGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BMenuGrp> doLoadBMenuGrpSelfList(List<BMenuGrp> bMenuGrpList, LoadReferrerOption<BMenuGrpCB, BMenuGrp> option) {
        return helpLoadReferrerInternally(bMenuGrpList, option, "bMenuGrpSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bMenuGrpList The list of bMenuGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BMenuGrp> bMenuGrpList)
    { return helpPulloutInternally(bMenuGrpList, "bDict"); }

    /**
     * Pull out the list of foreign table 'BMenuGrp'.
     * @param bMenuGrpList The list of bMenuGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BMenuGrp> pulloutBMenuGrpSelf(List<BMenuGrp> bMenuGrpList)
    { return helpPulloutInternally(bMenuGrpList, "bMenuGrpSelf"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bMenuGrpList The list of bMenuGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BMenuGrp> bMenuGrpList)
    { return helpPulloutInternally(bMenuGrpList, "vDict"); }

    /**
     * Pull out the list of foreign table 'VHtDict'.
     * @param bMenuGrpList The list of bMenuGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VHtDict> pulloutVHtDict(List<BMenuGrp> bMenuGrpList)
    { return helpPulloutInternally(bMenuGrpList, "vHtDict"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key menuGrpId.
     * @param bMenuGrpList The list of bMenuGrp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMenuGrpIdList(List<BMenuGrp> bMenuGrpList)
    { return helpExtractListInternally(bMenuGrpList, "menuGrpId"); }

    /**
     * Extract the value list of (single) unique key menuGrpCd.
     * @param bMenuGrpList The list of bMenuGrp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMenuGrpCdList(List<BMenuGrp> bMenuGrpList)
    { return helpExtractListInternally(bMenuGrpList, "menuGrpCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bMenuGrp.setFoo...(value);
     * bMenuGrp.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bMenuGrp.set...;</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">insert</span>(bMenuGrp);
     * ... = bMenuGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bMenuGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BMenuGrp bMenuGrp) {
        doInsert(bMenuGrp, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bMenuGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bMenuGrp.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bMenuGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">update</span>(bMenuGrp);
     * </pre>
     * @param bMenuGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BMenuGrp bMenuGrp) {
        doUpdate(bMenuGrp, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bMenuGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bMenuGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bMenuGrp);
     * </pre>
     * @param bMenuGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BMenuGrp bMenuGrp) {
        doUpdateNonstrict(bMenuGrp, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bMenuGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BMenuGrp bMenuGrp) {
        doInsertOrUpdate(bMenuGrp, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bMenuGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BMenuGrp bMenuGrp) {
        doInsertOrUpdateNonstrict(bMenuGrp, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bMenuGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">delete</span>(bMenuGrp);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bMenuGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BMenuGrp bMenuGrp) {
        doDelete(bMenuGrp, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bMenuGrp);
     * </pre>
     * @param bMenuGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BMenuGrp bMenuGrp) {
        doDeleteNonstrict(bMenuGrp, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bMenuGrp);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bMenuGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BMenuGrp bMenuGrp) {
        doDeleteNonstrictIgnoreDeleted(bMenuGrp, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BMenuGrp et, final DeleteOption<BMenuGrpCB> op) {
        assertObjectNotNull("bMenuGrp", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     *     bMenuGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bMenuGrp.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bMenuGrpList.add(bMenuGrp);
     * }
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">batchInsert</span>(bMenuGrpList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BMenuGrp> bMenuGrpList) {
        return doBatchInsert(bMenuGrpList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     *     bMenuGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bMenuGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bMenuGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bMenuGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bMenuGrpList.add(bMenuGrp);
     * }
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bMenuGrpList);
     * </pre>
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BMenuGrp> bMenuGrpList) {
        return doBatchUpdate(bMenuGrpList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bMenuGrpBhv.<span style="color: #CC4747">batchUpdate</span>(bMenuGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bMenuGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BMenuGrp> bMenuGrpList, SpecifyQuery<BMenuGrpCB> colCBLambda) {
        return doBatchUpdate(bMenuGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     *     bMenuGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bMenuGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bMenuGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bMenuGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bMenuGrpList.add(bMenuGrp);
     * }
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bMenuGrpList);
     * </pre>
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BMenuGrp> bMenuGrpList) {
        return doBatchUpdateNonstrict(bMenuGrpList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bMenuGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bMenuGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BMenuGrp> bMenuGrpList, SpecifyQuery<BMenuGrpCB> colCBLambda) {
        return doBatchUpdateNonstrict(bMenuGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BMenuGrp> bMenuGrpList) {
        return doBatchDelete(bMenuGrpList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BMenuGrp> bMenuGrpList) {
        return doBatchDeleteNonstrict(bMenuGrpList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BMenuGrp, BMenuGrpCB&gt;() {
     *     public ConditionBean setup(BMenuGrp entity, BMenuGrpCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BMenuGrp, BMenuGrpCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setPK...(value);</span>
     * bMenuGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bMenuGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setVersionNo(value);</span>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bMenuGrp, cb);
     * </pre>
     * @param bMenuGrp The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BMenuGrp bMenuGrp, BMenuGrpCB cb) {
        return doQueryUpdate(bMenuGrp, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BMenuGrpCB cb = new BMenuGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">queryDelete</span>(bMenuGrp, cb);
     * </pre>
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BMenuGrpCB cb) {
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
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bMenuGrp.setFoo...(value);
     * bMenuGrp.setBar...(value);
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bMenuGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bMenuGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bMenuGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, InsertOption<BMenuGrpCB>> opLambda) {
        doInsert(bMenuGrp, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bMenuGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bMenuGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bMenuGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bMenuGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> opLambda) {
        doUpdate(bMenuGrp, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * bMenuGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bMenuGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bMenuGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bMenuGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> opLambda) {
        doUpdateNonstrict(bMenuGrp, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bMenuGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, InsertOption<BMenuGrpCB>> insertOpLambda, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> updateOpLambda) {
        doInsertOrUpdate(bMenuGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bMenuGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, InsertOption<BMenuGrpCB>> insertOpLambda, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bMenuGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bMenuGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, DeleteOption<BMenuGrpCB>> opLambda) {
        doDelete(bMenuGrp, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bMenuGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BMenuGrp bMenuGrp, WritableOptionCall<BMenuGrpCB, DeleteOption<BMenuGrpCB>> opLambda) {
        doDeleteNonstrict(bMenuGrp, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BMenuGrp> bMenuGrpList, WritableOptionCall<BMenuGrpCB, InsertOption<BMenuGrpCB>> opLambda) {
        return doBatchInsert(bMenuGrpList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BMenuGrp> bMenuGrpList, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> opLambda) {
        return doBatchUpdate(bMenuGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BMenuGrp> bMenuGrpList, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> opLambda) {
        return doBatchUpdateNonstrict(bMenuGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BMenuGrp> bMenuGrpList, WritableOptionCall<BMenuGrpCB, DeleteOption<BMenuGrpCB>> opLambda) {
        return doBatchDelete(bMenuGrpList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bMenuGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BMenuGrp> bMenuGrpList, WritableOptionCall<BMenuGrpCB, DeleteOption<BMenuGrpCB>> opLambda) {
        return doBatchDeleteNonstrict(bMenuGrpList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BMenuGrp, BMenuGrpCB> manyArgLambda, WritableOptionCall<BMenuGrpCB, InsertOption<BMenuGrpCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BMenuGrp bMenuGrp = <span style="color: #70226C">new</span> BMenuGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setPK...(value);</span>
     * bMenuGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bMenuGrp.setVersionNo(value);</span>
     * BMenuGrpCB cb = <span style="color: #70226C">new</span> BMenuGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bMenuGrpBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bMenuGrp, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bMenuGrp The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BMenuGrp bMenuGrp, BMenuGrpCB cb, WritableOptionCall<BMenuGrpCB, UpdateOption<BMenuGrpCB>> opLambda) {
        return doQueryUpdate(bMenuGrp, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BMenuGrp. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BMenuGrpCB cb, WritableOptionCall<BMenuGrpCB, DeleteOption<BMenuGrpCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bMenuGrpBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bMenuGrpBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bMenuGrpBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bMenuGrpBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bMenuGrpBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bMenuGrpBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bMenuGrpBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bMenuGrpBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bMenuGrpBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bMenuGrpBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bMenuGrpBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bMenuGrpBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bMenuGrpBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bMenuGrpBhv.outideSql().removeBlockComment().selectList()
     * bMenuGrpBhv.outideSql().removeLineComment().selectList()
     * bMenuGrpBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BMenuGrpBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BMenuGrpBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BMenuGrp> typeOfSelectedEntity() { return BMenuGrp.class; }
    protected Class<BMenuGrp> typeOfHandlingEntity() { return BMenuGrp.class; }
    protected Class<BMenuGrpCB> typeOfHandlingConditionBean() { return BMenuGrpCB.class; }
}
