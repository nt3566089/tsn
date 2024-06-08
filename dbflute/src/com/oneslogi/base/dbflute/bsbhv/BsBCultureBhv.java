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
 * The behavior of B_CULTURE as TABLE. <br>
 * <pre>
 * [primary key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, CULTURE_CD, DICT_ID, LANG_CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_CULTURE, V_DICT, B_CULTURE_ATTRIBUTE(AsOne)
 *
 * [referrer table]
 *     B_CULTURE, B_DICT_CULTURE, B_INFO, B_MESSAGE, B_USER, M_CENTER, B_CULTURE_ATTRIBUTE
 *
 * [foreign property]
 *     bDict, bCultureSelf, vDict, bCultureAttributeAsOne
 *
 * [referrer property]
 *     bCultureSelfList, bDictCultureList, bInfoList, bMessageList, bUserList, mCenterList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBCultureBhv extends AbstractBehaviorWritable<BCulture, BCultureCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BCultureDbm asDBMeta() { return BCultureDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_CULTURE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BCultureDbm getMyDBMeta() { return BCultureDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BCultureCB newConditionBean() { return new BCultureCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BCulture newMyEntity() { return new BCulture(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BCultureCB newMyConditionBean() { return new BCultureCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BCultureCB cb) {
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
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().setFoo...(value);
     * BCulture bCulture = <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bCulture != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bCulture.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCulture selectEntity(BCultureCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BCulture facadeSelectEntity(BCultureCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCulture> OptionalEntity<ENTITY> doSelectOptionalEntity(BCultureCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().set...;
     * BCulture bCulture = <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bCulture.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCulture selectEntityWithDeletedCheck(BCultureCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param cultureId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCulture selectByPKValue(Long cultureId) {
        return facadeSelectByPKValue(cultureId);
    }

    protected BCulture facadeSelectByPKValue(Long cultureId) {
        return doSelectByPK(cultureId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCulture> ENTITY doSelectByPK(Long cultureId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(cultureId), tp);
    }

    protected <ENTITY extends BCulture> OptionalEntity<ENTITY> doSelectOptionalByPK(Long cultureId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(cultureId, tp), cultureId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param cultureId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCulture selectByPKValueWithDeletedCheck(Long cultureId) {
        return doSelectByPKWithDeletedCheck(cultureId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCulture> ENTITY doSelectByPKWithDeletedCheck(Long cultureId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(cultureId), tp);
    }

    protected BCultureCB xprepareCBAsPK(Long cultureId) {
        assertObjectNotNull("cultureId", cultureId);
        return newConditionBean().acceptPK(cultureId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param cultureCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BCulture> selectByUniqueOf(String cultureCd) {
        return facadeSelectByUniqueOf(cultureCd);
    }

    protected OptionalEntity<BCulture> facadeSelectByUniqueOf(String cultureCd) {
        return doSelectByUniqueOf(cultureCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCulture> OptionalEntity<ENTITY> doSelectByUniqueOf(String cultureCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(cultureCd), tp), cultureCd);
    }

    protected BCultureCB xprepareCBAsUniqueOf(String cultureCd) {
        assertObjectNotNull("cultureCd", cultureCd);
        return newConditionBean().acceptUniqueOf(cultureCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BCulture&gt; <span style="color: #553000">bCultureList</span> = <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BCulture> selectList(BCultureCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BCulture&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">page</span>) {
     *     ... = bCulture.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BCulture> selectPage(BCultureCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().set...
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @param entityRowHandler The handler of entity row of BCulture. (NotNull)
     */
    public void selectCursor(BCultureCB cb, EntityRowHandler<BCulture> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BCultureCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BCultureCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BCulture> bCultureList, ReferrerLoaderHandler<LoaderOfBCulture> loaderLambda) {
        xassLRArg(bCultureList, loaderLambda);
        loaderLambda.handle(new LoaderOfBCulture().ready(bCultureList, _behaviorSelector));
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
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BCulture bCulture, ReferrerLoaderHandler<LoaderOfBCulture> loaderLambda) {
        xassLRArg(bCulture, loaderLambda);
        loaderLambda.handle(new LoaderOfBCulture().ready(xnewLRAryLs(bCulture), _behaviorSelector));
    }

    /**
     * Load referrer of BCultureSelfList by the set-upper of referrer. <br>
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBCultureSelfList</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBCultureSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLangCultureId_InScope(pkList);
     * cb.query().addOrderBy_LangCultureId_Asc();
     * </pre>
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCulture> loadBCultureSelfList(List<BCulture> bCultureList, ConditionBeanSetupper<BCultureCB> refCBLambda) {
        xassLRArg(bCultureList, refCBLambda);
        return doLoadBCultureSelfList(bCultureList, new LoadReferrerOption<BCultureCB, BCulture>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BCultureSelfList by the set-upper of referrer. <br>
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBCultureSelfList</span>(<span style="color: #553000">bCulture</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCulture</span>.<span style="color: #CC4747">getBCultureSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLangCultureId_InScope(pkList);
     * cb.query().addOrderBy_LangCultureId_Asc();
     * </pre>
     * @param bCulture The entity of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCulture> loadBCultureSelfList(BCulture bCulture, ConditionBeanSetupper<BCultureCB> refCBLambda) {
        xassLRArg(bCulture, refCBLambda);
        return doLoadBCultureSelfList(xnewLRLs(bCulture), new LoadReferrerOption<BCultureCB, BCulture>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCulture> loadBCultureSelfList(BCulture bCulture, LoadReferrerOption<BCultureCB, BCulture> loadReferrerOption) {
        xassLRArg(bCulture, loadReferrerOption);
        return loadBCultureSelfList(xnewLRLs(bCulture), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BCulture> loadBCultureSelfList(List<BCulture> bCultureList, LoadReferrerOption<BCultureCB, BCulture> loadReferrerOption) {
        xassLRArg(bCultureList, loadReferrerOption);
        if (bCultureList.isEmpty()) { return (NestedReferrerListGateway<BCulture>)EMPTY_NREF_LGWAY; }
        return doLoadBCultureSelfList(bCultureList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BCulture> doLoadBCultureSelfList(List<BCulture> bCultureList, LoadReferrerOption<BCultureCB, BCulture> option) {
        return helpLoadReferrerInternally(bCultureList, option, "bCultureSelfList");
    }

    /**
     * Load referrer of BDictCultureList by the set-upper of referrer. <br>
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBDictCultureList</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBDictCultureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(List<BCulture> bCultureList, ConditionBeanSetupper<BDictCultureCB> refCBLambda) {
        xassLRArg(bCultureList, refCBLambda);
        return doLoadBDictCultureList(bCultureList, new LoadReferrerOption<BDictCultureCB, BDictCulture>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BDictCultureList by the set-upper of referrer. <br>
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBDictCultureList</span>(<span style="color: #553000">bCulture</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCulture</span>.<span style="color: #CC4747">getBDictCultureList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCulture The entity of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(BCulture bCulture, ConditionBeanSetupper<BDictCultureCB> refCBLambda) {
        xassLRArg(bCulture, refCBLambda);
        return doLoadBDictCultureList(xnewLRLs(bCulture), new LoadReferrerOption<BDictCultureCB, BDictCulture>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(BCulture bCulture, LoadReferrerOption<BDictCultureCB, BDictCulture> loadReferrerOption) {
        xassLRArg(bCulture, loadReferrerOption);
        return loadBDictCultureList(xnewLRLs(bCulture), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(List<BCulture> bCultureList, LoadReferrerOption<BDictCultureCB, BDictCulture> loadReferrerOption) {
        xassLRArg(bCultureList, loadReferrerOption);
        if (bCultureList.isEmpty()) { return (NestedReferrerListGateway<BDictCulture>)EMPTY_NREF_LGWAY; }
        return doLoadBDictCultureList(bCultureList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BDictCulture> doLoadBDictCultureList(List<BCulture> bCultureList, LoadReferrerOption<BDictCultureCB, BDictCulture> option) {
        return helpLoadReferrerInternally(bCultureList, option, "bDictCultureList");
    }

    /**
     * Load referrer of BInfoList by the set-upper of referrer. <br>
     * B_INFO by CULTURE_ID, named 'BInfoList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBInfoList</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BInfo> loadBInfoList(List<BCulture> bCultureList, ConditionBeanSetupper<BInfoCB> refCBLambda) {
        xassLRArg(bCultureList, refCBLambda);
        return doLoadBInfoList(bCultureList, new LoadReferrerOption<BInfoCB, BInfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BInfoList by the set-upper of referrer. <br>
     * B_INFO by CULTURE_ID, named 'BInfoList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBInfoList</span>(<span style="color: #553000">bCulture</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCulture</span>.<span style="color: #CC4747">getBInfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCulture The entity of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BInfo> loadBInfoList(BCulture bCulture, ConditionBeanSetupper<BInfoCB> refCBLambda) {
        xassLRArg(bCulture, refCBLambda);
        return doLoadBInfoList(xnewLRLs(bCulture), new LoadReferrerOption<BInfoCB, BInfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BInfo> loadBInfoList(BCulture bCulture, LoadReferrerOption<BInfoCB, BInfo> loadReferrerOption) {
        xassLRArg(bCulture, loadReferrerOption);
        return loadBInfoList(xnewLRLs(bCulture), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BInfo> loadBInfoList(List<BCulture> bCultureList, LoadReferrerOption<BInfoCB, BInfo> loadReferrerOption) {
        xassLRArg(bCultureList, loadReferrerOption);
        if (bCultureList.isEmpty()) { return (NestedReferrerListGateway<BInfo>)EMPTY_NREF_LGWAY; }
        return doLoadBInfoList(bCultureList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BInfo> doLoadBInfoList(List<BCulture> bCultureList, LoadReferrerOption<BInfoCB, BInfo> option) {
        return helpLoadReferrerInternally(bCultureList, option, "bInfoList");
    }

    /**
     * Load referrer of BMessageList by the set-upper of referrer. <br>
     * B_MESSAGE by CULTURE_ID, named 'BMessageList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBMessageList</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMessage> loadBMessageList(List<BCulture> bCultureList, ConditionBeanSetupper<BMessageCB> refCBLambda) {
        xassLRArg(bCultureList, refCBLambda);
        return doLoadBMessageList(bCultureList, new LoadReferrerOption<BMessageCB, BMessage>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BMessageList by the set-upper of referrer. <br>
     * B_MESSAGE by CULTURE_ID, named 'BMessageList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBMessageList</span>(<span style="color: #553000">bCulture</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCulture</span>.<span style="color: #CC4747">getBMessageList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCulture The entity of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMessage> loadBMessageList(BCulture bCulture, ConditionBeanSetupper<BMessageCB> refCBLambda) {
        xassLRArg(bCulture, refCBLambda);
        return doLoadBMessageList(xnewLRLs(bCulture), new LoadReferrerOption<BMessageCB, BMessage>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMessage> loadBMessageList(BCulture bCulture, LoadReferrerOption<BMessageCB, BMessage> loadReferrerOption) {
        xassLRArg(bCulture, loadReferrerOption);
        return loadBMessageList(xnewLRLs(bCulture), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BMessage> loadBMessageList(List<BCulture> bCultureList, LoadReferrerOption<BMessageCB, BMessage> loadReferrerOption) {
        xassLRArg(bCultureList, loadReferrerOption);
        if (bCultureList.isEmpty()) { return (NestedReferrerListGateway<BMessage>)EMPTY_NREF_LGWAY; }
        return doLoadBMessageList(bCultureList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BMessage> doLoadBMessageList(List<BCulture> bCultureList, LoadReferrerOption<BMessageCB, BMessage> option) {
        return helpLoadReferrerInternally(bCultureList, option, "bMessageList");
    }

    /**
     * Load referrer of BUserList by the set-upper of referrer. <br>
     * B_USER by CULTURE_ID, named 'BUserList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBUserList</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BUser> loadBUserList(List<BCulture> bCultureList, ConditionBeanSetupper<BUserCB> refCBLambda) {
        xassLRArg(bCultureList, refCBLambda);
        return doLoadBUserList(bCultureList, new LoadReferrerOption<BUserCB, BUser>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BUserList by the set-upper of referrer. <br>
     * B_USER by CULTURE_ID, named 'BUserList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadBUserList</span>(<span style="color: #553000">bCulture</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCulture</span>.<span style="color: #CC4747">getBUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCulture The entity of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BUser> loadBUserList(BCulture bCulture, ConditionBeanSetupper<BUserCB> refCBLambda) {
        xassLRArg(bCulture, refCBLambda);
        return doLoadBUserList(xnewLRLs(bCulture), new LoadReferrerOption<BUserCB, BUser>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BUser> loadBUserList(BCulture bCulture, LoadReferrerOption<BUserCB, BUser> loadReferrerOption) {
        xassLRArg(bCulture, loadReferrerOption);
        return loadBUserList(xnewLRLs(bCulture), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BUser> loadBUserList(List<BCulture> bCultureList, LoadReferrerOption<BUserCB, BUser> loadReferrerOption) {
        xassLRArg(bCultureList, loadReferrerOption);
        if (bCultureList.isEmpty()) { return (NestedReferrerListGateway<BUser>)EMPTY_NREF_LGWAY; }
        return doLoadBUserList(bCultureList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BUser> doLoadBUserList(List<BCulture> bCultureList, LoadReferrerOption<BUserCB, BUser> option) {
        return helpLoadReferrerInternally(bCultureList, option, "bUserList");
    }

    /**
     * Load referrer of MCenterList by the set-upper of referrer. <br>
     * M_CENTER by CULTURE_ID, named 'MCenterList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadMCenterList</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getMCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenter> loadMCenterList(List<BCulture> bCultureList, ConditionBeanSetupper<MCenterCB> refCBLambda) {
        xassLRArg(bCultureList, refCBLambda);
        return doLoadMCenterList(bCultureList, new LoadReferrerOption<MCenterCB, MCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterList by the set-upper of referrer. <br>
     * M_CENTER by CULTURE_ID, named 'MCenterList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">loadMCenterList</span>(<span style="color: #553000">bCulture</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCulture</span>.<span style="color: #CC4747">getMCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param bCulture The entity of BCulture. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenter> loadMCenterList(BCulture bCulture, ConditionBeanSetupper<MCenterCB> refCBLambda) {
        xassLRArg(bCulture, refCBLambda);
        return doLoadMCenterList(xnewLRLs(bCulture), new LoadReferrerOption<MCenterCB, MCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCulture The entity of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenter> loadMCenterList(BCulture bCulture, LoadReferrerOption<MCenterCB, MCenter> loadReferrerOption) {
        xassLRArg(bCulture, loadReferrerOption);
        return loadMCenterList(xnewLRLs(bCulture), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bCultureList The entity list of BCulture. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenter> loadMCenterList(List<BCulture> bCultureList, LoadReferrerOption<MCenterCB, MCenter> loadReferrerOption) {
        xassLRArg(bCultureList, loadReferrerOption);
        if (bCultureList.isEmpty()) { return (NestedReferrerListGateway<MCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterList(bCultureList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenter> doLoadMCenterList(List<BCulture> bCultureList, LoadReferrerOption<MCenterCB, MCenter> option) {
        return helpLoadReferrerInternally(bCultureList, option, "mCenterList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bCultureList The list of bCulture. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BCulture> bCultureList)
    { return helpPulloutInternally(bCultureList, "bDict"); }

    /**
     * Pull out the list of foreign table 'BCulture'.
     * @param bCultureList The list of bCulture. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BCulture> pulloutBCultureSelf(List<BCulture> bCultureList)
    { return helpPulloutInternally(bCultureList, "bCultureSelf"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bCultureList The list of bCulture. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BCulture> bCultureList)
    { return helpPulloutInternally(bCultureList, "vDict"); }

    /**
     * Pull out the list of referrer-as-one table 'BCultureAttribute'.
     * @param bCultureList The list of bCulture. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BCultureAttribute> pulloutBCultureAttributeAsOne(List<BCulture> bCultureList)
    { return helpPulloutInternally(bCultureList, "bCultureAttributeAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key cultureId.
     * @param bCultureList The list of bCulture. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCultureIdList(List<BCulture> bCultureList)
    { return helpExtractListInternally(bCultureList, "cultureId"); }

    /**
     * Extract the value list of (single) unique key cultureCd.
     * @param bCultureList The list of bCulture. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractCultureCdList(List<BCulture> bCultureList)
    { return helpExtractListInternally(bCultureList, "cultureCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bCulture.setFoo...(value);
     * bCulture.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCulture.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCulture.set...;</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">insert</span>(bCulture);
     * ... = bCulture.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bCulture The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BCulture bCulture) {
        doInsert(bCulture, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCulture.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCulture.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCulture.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bCulture.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">update</span>(bCulture);
     * </pre>
     * @param bCulture The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BCulture bCulture) {
        doUpdate(bCulture, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCulture.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCulture.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCulture.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCulture.setVersionNo(value);</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bCulture);
     * </pre>
     * @param bCulture The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BCulture bCulture) {
        doUpdateNonstrict(bCulture, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bCulture The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BCulture bCulture) {
        doInsertOrUpdate(bCulture, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bCulture The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BCulture bCulture) {
        doInsertOrUpdateNonstrict(bCulture, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bCulture.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">delete</span>(bCulture);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bCulture The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BCulture bCulture) {
        doDelete(bCulture, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCulture.setVersionNo(value);</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bCulture);
     * </pre>
     * @param bCulture The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BCulture bCulture) {
        doDeleteNonstrict(bCulture, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCulture.setVersionNo(value);</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bCulture);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bCulture The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BCulture bCulture) {
        doDeleteNonstrictIgnoreDeleted(bCulture, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BCulture et, final DeleteOption<BCultureCB> op) {
        assertObjectNotNull("bCulture", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     *     bCulture.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bCulture.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bCultureList.add(bCulture);
     * }
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">batchInsert</span>(bCultureList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BCulture> bCultureList) {
        return doBatchInsert(bCultureList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     *     bCulture.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bCulture.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bCulture.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bCulture.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bCultureList.add(bCulture);
     * }
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bCultureList);
     * </pre>
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BCulture> bCultureList) {
        return doBatchUpdate(bCultureList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bCultureBhv.<span style="color: #CC4747">batchUpdate</span>(bCultureList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bCultureList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BCulture> bCultureList, SpecifyQuery<BCultureCB> colCBLambda) {
        return doBatchUpdate(bCultureList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     *     bCulture.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bCulture.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bCulture.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bCulture.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bCultureList.add(bCulture);
     * }
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bCultureList);
     * </pre>
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BCulture> bCultureList) {
        return doBatchUpdateNonstrict(bCultureList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bCultureList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bCultureList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BCulture> bCultureList, SpecifyQuery<BCultureCB> colCBLambda) {
        return doBatchUpdateNonstrict(bCultureList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BCulture> bCultureList) {
        return doBatchDelete(bCultureList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BCulture> bCultureList) {
        return doBatchDeleteNonstrict(bCultureList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BCulture, BCultureCB&gt;() {
     *     public ConditionBean setup(BCulture entity, BCultureCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BCulture, BCultureCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bCulture.setPK...(value);</span>
     * bCulture.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCulture.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCulture.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCulture.setVersionNo(value);</span>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bCulture, cb);
     * </pre>
     * @param bCulture The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BCulture bCulture, BCultureCB cb) {
        return doQueryUpdate(bCulture, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BCultureCB cb = new BCultureCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">queryDelete</span>(bCulture, cb);
     * </pre>
     * @param cb The condition-bean of BCulture. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BCultureCB cb) {
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
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bCulture.setFoo...(value);
     * bCulture.setBar...(value);
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bCulture, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bCulture.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bCulture The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BCulture bCulture, WritableOptionCall<BCultureCB, InsertOption<BCultureCB>> opLambda) {
        doInsert(bCulture, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCulture.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bCulture.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bCulture, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bCulture The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BCulture bCulture, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> opLambda) {
        doUpdate(bCulture, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * bCulture.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCulture.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCulture.setVersionNo(value);</span>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bCulture, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bCulture The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BCulture bCulture, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> opLambda) {
        doUpdateNonstrict(bCulture, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bCulture The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BCulture bCulture, WritableOptionCall<BCultureCB, InsertOption<BCultureCB>> insertOpLambda, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> updateOpLambda) {
        doInsertOrUpdate(bCulture, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bCulture The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BCulture bCulture, WritableOptionCall<BCultureCB, InsertOption<BCultureCB>> insertOpLambda, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bCulture, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bCulture The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BCulture bCulture, WritableOptionCall<BCultureCB, DeleteOption<BCultureCB>> opLambda) {
        doDelete(bCulture, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bCulture The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BCulture bCulture, WritableOptionCall<BCultureCB, DeleteOption<BCultureCB>> opLambda) {
        doDeleteNonstrict(bCulture, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BCulture> bCultureList, WritableOptionCall<BCultureCB, InsertOption<BCultureCB>> opLambda) {
        return doBatchInsert(bCultureList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BCulture> bCultureList, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> opLambda) {
        return doBatchUpdate(bCultureList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BCulture> bCultureList, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> opLambda) {
        return doBatchUpdateNonstrict(bCultureList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BCulture> bCultureList, WritableOptionCall<BCultureCB, DeleteOption<BCultureCB>> opLambda) {
        return doBatchDelete(bCultureList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bCultureList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BCulture> bCultureList, WritableOptionCall<BCultureCB, DeleteOption<BCultureCB>> opLambda) {
        return doBatchDeleteNonstrict(bCultureList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BCulture, BCultureCB> manyArgLambda, WritableOptionCall<BCultureCB, InsertOption<BCultureCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BCulture bCulture = <span style="color: #70226C">new</span> BCulture();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bCulture.setPK...(value);</span>
     * bCulture.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCulture.setVersionNo(value);</span>
     * BCultureCB cb = <span style="color: #70226C">new</span> BCultureCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bCulture, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bCulture The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BCulture. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BCulture bCulture, BCultureCB cb, WritableOptionCall<BCultureCB, UpdateOption<BCultureCB>> opLambda) {
        return doQueryUpdate(bCulture, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BCulture. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BCultureCB cb, WritableOptionCall<BCultureCB, DeleteOption<BCultureCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bCultureBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bCultureBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bCultureBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bCultureBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bCultureBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bCultureBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bCultureBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bCultureBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bCultureBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bCultureBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bCultureBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bCultureBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bCultureBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bCultureBhv.outideSql().removeBlockComment().selectList()
     * bCultureBhv.outideSql().removeLineComment().selectList()
     * bCultureBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BCultureBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BCultureBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BCulture> typeOfSelectedEntity() { return BCulture.class; }
    protected Class<BCulture> typeOfHandlingEntity() { return BCulture.class; }
    protected Class<BCultureCB> typeOfHandlingConditionBean() { return BCultureCB.class; }
}
