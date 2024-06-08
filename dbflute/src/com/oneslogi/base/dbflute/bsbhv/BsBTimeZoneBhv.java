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
 * The behavior of B_TIME_ZONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TIME_ZONE_ID
 *
 * [column]
 *     TIME_ZONE_ID, TIME_ZONE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TIME_ZONE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     B_SYSTEM, M_CENTER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bSystemList, mCenterList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBTimeZoneBhv extends AbstractBehaviorWritable<BTimeZone, BTimeZoneCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BTimeZoneDbm asDBMeta() { return BTimeZoneDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_TIME_ZONE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BTimeZoneDbm getMyDBMeta() { return BTimeZoneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BTimeZoneCB newConditionBean() { return new BTimeZoneCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BTimeZone newMyEntity() { return new BTimeZone(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BTimeZoneCB newMyConditionBean() { return new BTimeZoneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BTimeZoneCB cb) {
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
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().setFoo...(value);
     * BTimeZone bTimeZone = <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bTimeZone != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bTimeZone.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BTimeZone selectEntity(BTimeZoneCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BTimeZone facadeSelectEntity(BTimeZoneCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BTimeZone> OptionalEntity<ENTITY> doSelectOptionalEntity(BTimeZoneCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().set...;
     * BTimeZone bTimeZone = <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bTimeZone.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BTimeZone selectEntityWithDeletedCheck(BTimeZoneCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param timeZoneId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BTimeZone selectByPKValue(Long timeZoneId) {
        return facadeSelectByPKValue(timeZoneId);
    }

    protected BTimeZone facadeSelectByPKValue(Long timeZoneId) {
        return doSelectByPK(timeZoneId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BTimeZone> ENTITY doSelectByPK(Long timeZoneId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(timeZoneId), tp);
    }

    protected <ENTITY extends BTimeZone> OptionalEntity<ENTITY> doSelectOptionalByPK(Long timeZoneId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(timeZoneId, tp), timeZoneId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param timeZoneId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BTimeZone selectByPKValueWithDeletedCheck(Long timeZoneId) {
        return doSelectByPKWithDeletedCheck(timeZoneId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BTimeZone> ENTITY doSelectByPKWithDeletedCheck(Long timeZoneId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(timeZoneId), tp);
    }

    protected BTimeZoneCB xprepareCBAsPK(Long timeZoneId) {
        assertObjectNotNull("timeZoneId", timeZoneId);
        return newConditionBean().acceptPK(timeZoneId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param timeZoneCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BTimeZone> selectByUniqueOf(String timeZoneCd) {
        return facadeSelectByUniqueOf(timeZoneCd);
    }

    protected OptionalEntity<BTimeZone> facadeSelectByUniqueOf(String timeZoneCd) {
        return doSelectByUniqueOf(timeZoneCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BTimeZone> OptionalEntity<ENTITY> doSelectByUniqueOf(String timeZoneCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(timeZoneCd), tp), timeZoneCd);
    }

    protected BTimeZoneCB xprepareCBAsUniqueOf(String timeZoneCd) {
        assertObjectNotNull("timeZoneCd", timeZoneCd);
        return newConditionBean().acceptUniqueOf(timeZoneCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BTimeZone&gt; <span style="color: #553000">bTimeZoneList</span> = <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BTimeZone bTimeZone : <span style="color: #553000">bTimeZoneList</span>) {
     *     ... = bTimeZone.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BTimeZone> selectList(BTimeZoneCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BTimeZone&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BTimeZone bTimeZone : <span style="color: #553000">page</span>) {
     *     ... = bTimeZone.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BTimeZone> selectPage(BTimeZoneCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().set...
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @param entityRowHandler The handler of entity row of BTimeZone. (NotNull)
     */
    public void selectCursor(BTimeZoneCB cb, EntityRowHandler<BTimeZone> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BTimeZoneCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BTimeZoneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bTimeZoneList The entity list of BTimeZone. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BTimeZone> bTimeZoneList, ReferrerLoaderHandler<LoaderOfBTimeZone> loaderLambda) {
        xassLRArg(bTimeZoneList, loaderLambda);
        loaderLambda.handle(new LoaderOfBTimeZone().ready(bTimeZoneList, _behaviorSelector));
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
     * @param bTimeZone The entity of BTimeZone. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BTimeZone bTimeZone, ReferrerLoaderHandler<LoaderOfBTimeZone> loaderLambda) {
        xassLRArg(bTimeZone, loaderLambda);
        loaderLambda.handle(new LoaderOfBTimeZone().ready(xnewLRAryLs(bTimeZone), _behaviorSelector));
    }

    /**
     * Load referrer of BSystemList by the set-upper of referrer. <br>
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemList'.
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">loadBSystemList</span>(<span style="color: #553000">bTimeZoneList</span>, <span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemCB</span>.setupSelect...
     *     <span style="color: #553000">systemCB</span>.query().set...
     *     <span style="color: #553000">systemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BTimeZone bTimeZone : <span style="color: #553000">bTimeZoneList</span>) {
     *     ... = bTimeZone.<span style="color: #CC4747">getBSystemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTimeZoneId_InScope(pkList);
     * cb.query().addOrderBy_TimeZoneId_Asc();
     * </pre>
     * @param bTimeZoneList The entity list of BTimeZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BSystem> loadBSystemList(List<BTimeZone> bTimeZoneList, ConditionBeanSetupper<BSystemCB> refCBLambda) {
        xassLRArg(bTimeZoneList, refCBLambda);
        return doLoadBSystemList(bTimeZoneList, new LoadReferrerOption<BSystemCB, BSystem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BSystemList by the set-upper of referrer. <br>
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemList'.
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">loadBSystemList</span>(<span style="color: #553000">bTimeZone</span>, <span style="color: #553000">systemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">systemCB</span>.setupSelect...
     *     <span style="color: #553000">systemCB</span>.query().set...
     *     <span style="color: #553000">systemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bTimeZone</span>.<span style="color: #CC4747">getBSystemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTimeZoneId_InScope(pkList);
     * cb.query().addOrderBy_TimeZoneId_Asc();
     * </pre>
     * @param bTimeZone The entity of BTimeZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BSystem> loadBSystemList(BTimeZone bTimeZone, ConditionBeanSetupper<BSystemCB> refCBLambda) {
        xassLRArg(bTimeZone, refCBLambda);
        return doLoadBSystemList(xnewLRLs(bTimeZone), new LoadReferrerOption<BSystemCB, BSystem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bTimeZone The entity of BTimeZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BSystem> loadBSystemList(BTimeZone bTimeZone, LoadReferrerOption<BSystemCB, BSystem> loadReferrerOption) {
        xassLRArg(bTimeZone, loadReferrerOption);
        return loadBSystemList(xnewLRLs(bTimeZone), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bTimeZoneList The entity list of BTimeZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BSystem> loadBSystemList(List<BTimeZone> bTimeZoneList, LoadReferrerOption<BSystemCB, BSystem> loadReferrerOption) {
        xassLRArg(bTimeZoneList, loadReferrerOption);
        if (bTimeZoneList.isEmpty()) { return (NestedReferrerListGateway<BSystem>)EMPTY_NREF_LGWAY; }
        return doLoadBSystemList(bTimeZoneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BSystem> doLoadBSystemList(List<BTimeZone> bTimeZoneList, LoadReferrerOption<BSystemCB, BSystem> option) {
        return helpLoadReferrerInternally(bTimeZoneList, option, "bSystemList");
    }

    /**
     * Load referrer of MCenterList by the set-upper of referrer. <br>
     * M_CENTER by TIME_ZONE_ID, named 'MCenterList'.
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">loadMCenterList</span>(<span style="color: #553000">bTimeZoneList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BTimeZone bTimeZone : <span style="color: #553000">bTimeZoneList</span>) {
     *     ... = bTimeZone.<span style="color: #CC4747">getMCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTimeZoneId_InScope(pkList);
     * cb.query().addOrderBy_TimeZoneId_Asc();
     * </pre>
     * @param bTimeZoneList The entity list of BTimeZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenter> loadMCenterList(List<BTimeZone> bTimeZoneList, ConditionBeanSetupper<MCenterCB> refCBLambda) {
        xassLRArg(bTimeZoneList, refCBLambda);
        return doLoadMCenterList(bTimeZoneList, new LoadReferrerOption<MCenterCB, MCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterList by the set-upper of referrer. <br>
     * M_CENTER by TIME_ZONE_ID, named 'MCenterList'.
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">loadMCenterList</span>(<span style="color: #553000">bTimeZone</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bTimeZone</span>.<span style="color: #CC4747">getMCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTimeZoneId_InScope(pkList);
     * cb.query().addOrderBy_TimeZoneId_Asc();
     * </pre>
     * @param bTimeZone The entity of BTimeZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenter> loadMCenterList(BTimeZone bTimeZone, ConditionBeanSetupper<MCenterCB> refCBLambda) {
        xassLRArg(bTimeZone, refCBLambda);
        return doLoadMCenterList(xnewLRLs(bTimeZone), new LoadReferrerOption<MCenterCB, MCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bTimeZone The entity of BTimeZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenter> loadMCenterList(BTimeZone bTimeZone, LoadReferrerOption<MCenterCB, MCenter> loadReferrerOption) {
        xassLRArg(bTimeZone, loadReferrerOption);
        return loadMCenterList(xnewLRLs(bTimeZone), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bTimeZoneList The entity list of BTimeZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenter> loadMCenterList(List<BTimeZone> bTimeZoneList, LoadReferrerOption<MCenterCB, MCenter> loadReferrerOption) {
        xassLRArg(bTimeZoneList, loadReferrerOption);
        if (bTimeZoneList.isEmpty()) { return (NestedReferrerListGateway<MCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterList(bTimeZoneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenter> doLoadMCenterList(List<BTimeZone> bTimeZoneList, LoadReferrerOption<MCenterCB, MCenter> option) {
        return helpLoadReferrerInternally(bTimeZoneList, option, "mCenterList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key timeZoneId.
     * @param bTimeZoneList The list of bTimeZone. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTimeZoneIdList(List<BTimeZone> bTimeZoneList)
    { return helpExtractListInternally(bTimeZoneList, "timeZoneId"); }

    /**
     * Extract the value list of (single) unique key timeZoneCd.
     * @param bTimeZoneList The list of bTimeZone. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractTimeZoneCdList(List<BTimeZone> bTimeZoneList)
    { return helpExtractListInternally(bTimeZoneList, "timeZoneCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bTimeZone.setFoo...(value);
     * bTimeZone.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bTimeZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bTimeZone.set...;</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">insert</span>(bTimeZone);
     * ... = bTimeZone.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bTimeZone The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BTimeZone bTimeZone) {
        doInsert(bTimeZone, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bTimeZone.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bTimeZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bTimeZone.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bTimeZone.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">update</span>(bTimeZone);
     * </pre>
     * @param bTimeZone The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BTimeZone bTimeZone) {
        doUpdate(bTimeZone, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bTimeZone.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bTimeZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bTimeZone.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bTimeZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bTimeZone);
     * </pre>
     * @param bTimeZone The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BTimeZone bTimeZone) {
        doUpdateNonstrict(bTimeZone, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bTimeZone The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BTimeZone bTimeZone) {
        doInsertOrUpdate(bTimeZone, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bTimeZone The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BTimeZone bTimeZone) {
        doInsertOrUpdateNonstrict(bTimeZone, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bTimeZone.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">delete</span>(bTimeZone);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bTimeZone The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BTimeZone bTimeZone) {
        doDelete(bTimeZone, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bTimeZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bTimeZone);
     * </pre>
     * @param bTimeZone The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BTimeZone bTimeZone) {
        doDeleteNonstrict(bTimeZone, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bTimeZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bTimeZone);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bTimeZone The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BTimeZone bTimeZone) {
        doDeleteNonstrictIgnoreDeleted(bTimeZone, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BTimeZone et, final DeleteOption<BTimeZoneCB> op) {
        assertObjectNotNull("bTimeZone", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     *     bTimeZone.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bTimeZone.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bTimeZoneList.add(bTimeZone);
     * }
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">batchInsert</span>(bTimeZoneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BTimeZone> bTimeZoneList) {
        return doBatchInsert(bTimeZoneList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     *     bTimeZone.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bTimeZone.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bTimeZone.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bTimeZone.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bTimeZoneList.add(bTimeZone);
     * }
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bTimeZoneList);
     * </pre>
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BTimeZone> bTimeZoneList) {
        return doBatchUpdate(bTimeZoneList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bTimeZoneBhv.<span style="color: #CC4747">batchUpdate</span>(bTimeZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bTimeZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BTimeZone> bTimeZoneList, SpecifyQuery<BTimeZoneCB> colCBLambda) {
        return doBatchUpdate(bTimeZoneList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     *     bTimeZone.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bTimeZone.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bTimeZone.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bTimeZone.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bTimeZoneList.add(bTimeZone);
     * }
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bTimeZoneList);
     * </pre>
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BTimeZone> bTimeZoneList) {
        return doBatchUpdateNonstrict(bTimeZoneList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bTimeZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bTimeZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BTimeZone> bTimeZoneList, SpecifyQuery<BTimeZoneCB> colCBLambda) {
        return doBatchUpdateNonstrict(bTimeZoneList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BTimeZone> bTimeZoneList) {
        return doBatchDelete(bTimeZoneList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BTimeZone> bTimeZoneList) {
        return doBatchDeleteNonstrict(bTimeZoneList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BTimeZone, BTimeZoneCB&gt;() {
     *     public ConditionBean setup(BTimeZone entity, BTimeZoneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BTimeZone, BTimeZoneCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bTimeZone.setPK...(value);</span>
     * bTimeZone.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bTimeZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bTimeZone.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bTimeZone.setVersionNo(value);</span>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bTimeZone, cb);
     * </pre>
     * @param bTimeZone The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BTimeZone bTimeZone, BTimeZoneCB cb) {
        return doQueryUpdate(bTimeZone, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BTimeZoneCB cb = new BTimeZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">queryDelete</span>(bTimeZone, cb);
     * </pre>
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BTimeZoneCB cb) {
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
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bTimeZone.setFoo...(value);
     * bTimeZone.setBar...(value);
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bTimeZone, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bTimeZone.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bTimeZone The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, InsertOption<BTimeZoneCB>> opLambda) {
        doInsert(bTimeZone, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bTimeZone.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bTimeZone.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bTimeZone, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bTimeZone The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> opLambda) {
        doUpdate(bTimeZone, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * bTimeZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bTimeZone.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bTimeZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bTimeZone, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bTimeZone The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> opLambda) {
        doUpdateNonstrict(bTimeZone, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bTimeZone The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, InsertOption<BTimeZoneCB>> insertOpLambda, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> updateOpLambda) {
        doInsertOrUpdate(bTimeZone, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bTimeZone The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, InsertOption<BTimeZoneCB>> insertOpLambda, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bTimeZone, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bTimeZone The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, DeleteOption<BTimeZoneCB>> opLambda) {
        doDelete(bTimeZone, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bTimeZone The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BTimeZone bTimeZone, WritableOptionCall<BTimeZoneCB, DeleteOption<BTimeZoneCB>> opLambda) {
        doDeleteNonstrict(bTimeZone, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BTimeZone> bTimeZoneList, WritableOptionCall<BTimeZoneCB, InsertOption<BTimeZoneCB>> opLambda) {
        return doBatchInsert(bTimeZoneList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BTimeZone> bTimeZoneList, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> opLambda) {
        return doBatchUpdate(bTimeZoneList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BTimeZone> bTimeZoneList, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> opLambda) {
        return doBatchUpdateNonstrict(bTimeZoneList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BTimeZone> bTimeZoneList, WritableOptionCall<BTimeZoneCB, DeleteOption<BTimeZoneCB>> opLambda) {
        return doBatchDelete(bTimeZoneList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bTimeZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BTimeZone> bTimeZoneList, WritableOptionCall<BTimeZoneCB, DeleteOption<BTimeZoneCB>> opLambda) {
        return doBatchDeleteNonstrict(bTimeZoneList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BTimeZone, BTimeZoneCB> manyArgLambda, WritableOptionCall<BTimeZoneCB, InsertOption<BTimeZoneCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BTimeZone bTimeZone = <span style="color: #70226C">new</span> BTimeZone();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bTimeZone.setPK...(value);</span>
     * bTimeZone.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bTimeZone.setVersionNo(value);</span>
     * BTimeZoneCB cb = <span style="color: #70226C">new</span> BTimeZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bTimeZoneBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bTimeZone, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bTimeZone The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BTimeZone bTimeZone, BTimeZoneCB cb, WritableOptionCall<BTimeZoneCB, UpdateOption<BTimeZoneCB>> opLambda) {
        return doQueryUpdate(bTimeZone, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BTimeZone. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BTimeZoneCB cb, WritableOptionCall<BTimeZoneCB, DeleteOption<BTimeZoneCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bTimeZoneBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bTimeZoneBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bTimeZoneBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bTimeZoneBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bTimeZoneBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bTimeZoneBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bTimeZoneBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bTimeZoneBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bTimeZoneBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bTimeZoneBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bTimeZoneBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bTimeZoneBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bTimeZoneBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bTimeZoneBhv.outideSql().removeBlockComment().selectList()
     * bTimeZoneBhv.outideSql().removeLineComment().selectList()
     * bTimeZoneBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BTimeZoneBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BTimeZoneBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BTimeZone> typeOfSelectedEntity() { return BTimeZone.class; }
    protected Class<BTimeZone> typeOfHandlingEntity() { return BTimeZone.class; }
    protected Class<BTimeZoneCB> typeOfHandlingConditionBean() { return BTimeZoneCB.class; }
}
