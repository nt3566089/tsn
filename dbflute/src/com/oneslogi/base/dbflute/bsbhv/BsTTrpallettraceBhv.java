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
 * The behavior of T_TRPALLETTRACE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRPALLETTRACE_ID
 *
 * [column]
 *     TRPALLETTRACE_ID, PALLETTRACENO, PALLETTRACETYPE, PARENTPALLETNO, CHILDPALLETNO, PICKLISTKEY, PICKLISTGNO, CREATEDATETIME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLETTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrpallettraceBhv extends AbstractBehaviorWritable<TTrpallettrace, TTrpallettraceCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrpallettraceDbm asDBMeta() { return TTrpallettraceDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRPALLETTRACE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrpallettraceDbm getMyDBMeta() { return TTrpallettraceDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrpallettraceCB newConditionBean() { return new TTrpallettraceCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrpallettrace newMyEntity() { return new TTrpallettrace(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrpallettraceCB newMyConditionBean() { return new TTrpallettraceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrpallettraceCB cb) {
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
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().setFoo...(value);
     * TTrpallettrace tTrpallettrace = <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrpallettrace != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrpallettrace.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrpallettrace selectEntity(TTrpallettraceCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrpallettrace facadeSelectEntity(TTrpallettraceCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrpallettrace> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrpallettraceCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().set...;
     * TTrpallettrace tTrpallettrace = <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrpallettrace.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrpallettrace selectEntityWithDeletedCheck(TTrpallettraceCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trpallettraceId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrpallettrace selectByPKValue(Long trpallettraceId) {
        return facadeSelectByPKValue(trpallettraceId);
    }

    protected TTrpallettrace facadeSelectByPKValue(Long trpallettraceId) {
        return doSelectByPK(trpallettraceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrpallettrace> ENTITY doSelectByPK(Long trpallettraceId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trpallettraceId), tp);
    }

    protected <ENTITY extends TTrpallettrace> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trpallettraceId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trpallettraceId, tp), trpallettraceId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trpallettraceId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrpallettrace selectByPKValueWithDeletedCheck(Long trpallettraceId) {
        return doSelectByPKWithDeletedCheck(trpallettraceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrpallettrace> ENTITY doSelectByPKWithDeletedCheck(Long trpallettraceId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trpallettraceId), tp);
    }

    protected TTrpallettraceCB xprepareCBAsPK(Long trpallettraceId) {
        assertObjectNotNull("trpallettraceId", trpallettraceId);
        return newConditionBean().acceptPK(trpallettraceId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrpallettrace&gt; <span style="color: #553000">tTrpallettraceList</span> = <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrpallettrace tTrpallettrace : <span style="color: #553000">tTrpallettraceList</span>) {
     *     ... = tTrpallettrace.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrpallettrace> selectList(TTrpallettraceCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrpallettrace&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrpallettrace tTrpallettrace : <span style="color: #553000">page</span>) {
     *     ... = tTrpallettrace.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrpallettrace> selectPage(TTrpallettraceCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrpallettrace. (NotNull)
     */
    public void selectCursor(TTrpallettraceCB cb, EntityRowHandler<TTrpallettrace> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrpallettraceCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrpallettraceCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrpallettraceList The entity list of TTrpallettrace. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrpallettrace> tTrpallettraceList, ReferrerLoaderHandler<LoaderOfTTrpallettrace> loaderLambda) {
        xassLRArg(tTrpallettraceList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrpallettrace().ready(tTrpallettraceList, _behaviorSelector));
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
     * @param tTrpallettrace The entity of TTrpallettrace. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrpallettrace tTrpallettrace, ReferrerLoaderHandler<LoaderOfTTrpallettrace> loaderLambda) {
        xassLRArg(tTrpallettrace, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrpallettrace().ready(xnewLRAryLs(tTrpallettrace), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tTrpallettraceList The list of tTrpallettrace. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TTrpallettrace> tTrpallettraceList)
    { return helpPulloutInternally(tTrpallettraceList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tTrpallettraceList The list of tTrpallettrace. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TTrpallettrace> tTrpallettraceList)
    { return helpPulloutInternally(tTrpallettraceList, "mCenter"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trpallettraceId.
     * @param tTrpallettraceList The list of tTrpallettrace. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrpallettraceIdList(List<TTrpallettrace> tTrpallettraceList)
    { return helpExtractListInternally(tTrpallettraceList, "trpallettraceId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrpallettrace.setFoo...(value);
     * tTrpallettrace.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.set...;</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">insert</span>(tTrpallettrace);
     * ... = tTrpallettrace.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrpallettrace The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrpallettrace tTrpallettrace) {
        doInsert(tTrpallettrace, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrpallettrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrpallettrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">update</span>(tTrpallettrace);
     * </pre>
     * @param tTrpallettrace The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrpallettrace tTrpallettrace) {
        doUpdate(tTrpallettrace, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrpallettrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrpallettrace);
     * </pre>
     * @param tTrpallettrace The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrpallettrace tTrpallettrace) {
        doUpdateNonstrict(tTrpallettrace, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrpallettrace The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrpallettrace tTrpallettrace) {
        doInsertOrUpdate(tTrpallettrace, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrpallettrace The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrpallettrace tTrpallettrace) {
        doInsertOrUpdateNonstrict(tTrpallettrace, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrpallettrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">delete</span>(tTrpallettrace);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrpallettrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrpallettrace tTrpallettrace) {
        doDelete(tTrpallettrace, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrpallettrace);
     * </pre>
     * @param tTrpallettrace The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrpallettrace tTrpallettrace) {
        doDeleteNonstrict(tTrpallettrace, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrpallettrace);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrpallettrace The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrpallettrace tTrpallettrace) {
        doDeleteNonstrictIgnoreDeleted(tTrpallettrace, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrpallettrace et, final DeleteOption<TTrpallettraceCB> op) {
        assertObjectNotNull("tTrpallettrace", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     *     tTrpallettrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrpallettrace.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrpallettraceList.add(tTrpallettrace);
     * }
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrpallettraceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrpallettrace> tTrpallettraceList) {
        return doBatchInsert(tTrpallettraceList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     *     tTrpallettrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrpallettrace.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrpallettrace.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrpallettrace.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrpallettraceList.add(tTrpallettrace);
     * }
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrpallettraceList);
     * </pre>
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrpallettrace> tTrpallettraceList) {
        return doBatchUpdate(tTrpallettraceList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrpallettraceBhv.<span style="color: #CC4747">batchUpdate</span>(tTrpallettraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrpallettraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrpallettrace> tTrpallettraceList, SpecifyQuery<TTrpallettraceCB> colCBLambda) {
        return doBatchUpdate(tTrpallettraceList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     *     tTrpallettrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrpallettrace.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrpallettrace.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrpallettrace.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrpallettraceList.add(tTrpallettrace);
     * }
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrpallettraceList);
     * </pre>
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrpallettrace> tTrpallettraceList) {
        return doBatchUpdateNonstrict(tTrpallettraceList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrpallettraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrpallettraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrpallettrace> tTrpallettraceList, SpecifyQuery<TTrpallettraceCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrpallettraceList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrpallettrace> tTrpallettraceList) {
        return doBatchDelete(tTrpallettraceList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrpallettrace> tTrpallettraceList) {
        return doBatchDeleteNonstrict(tTrpallettraceList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrpallettrace, TTrpallettraceCB&gt;() {
     *     public ConditionBean setup(TTrpallettrace entity, TTrpallettraceCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrpallettrace, TTrpallettraceCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setPK...(value);</span>
     * tTrpallettrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setVersionNo(value);</span>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrpallettrace, cb);
     * </pre>
     * @param tTrpallettrace The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrpallettrace tTrpallettrace, TTrpallettraceCB cb) {
        return doQueryUpdate(tTrpallettrace, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrpallettraceCB cb = new TTrpallettraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrpallettrace, cb);
     * </pre>
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrpallettraceCB cb) {
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
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrpallettrace.setFoo...(value);
     * tTrpallettrace.setBar...(value);
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrpallettrace, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrpallettrace.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrpallettrace The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, InsertOption<TTrpallettraceCB>> opLambda) {
        doInsert(tTrpallettrace, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrpallettrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrpallettrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrpallettrace, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrpallettrace The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> opLambda) {
        doUpdate(tTrpallettrace, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * tTrpallettrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrpallettrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrpallettrace, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrpallettrace The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> opLambda) {
        doUpdateNonstrict(tTrpallettrace, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrpallettrace The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, InsertOption<TTrpallettraceCB>> insertOpLambda, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> updateOpLambda) {
        doInsertOrUpdate(tTrpallettrace, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrpallettrace The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, InsertOption<TTrpallettraceCB>> insertOpLambda, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrpallettrace, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrpallettrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, DeleteOption<TTrpallettraceCB>> opLambda) {
        doDelete(tTrpallettrace, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrpallettrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrpallettrace tTrpallettrace, WritableOptionCall<TTrpallettraceCB, DeleteOption<TTrpallettraceCB>> opLambda) {
        doDeleteNonstrict(tTrpallettrace, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrpallettrace> tTrpallettraceList, WritableOptionCall<TTrpallettraceCB, InsertOption<TTrpallettraceCB>> opLambda) {
        return doBatchInsert(tTrpallettraceList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrpallettrace> tTrpallettraceList, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> opLambda) {
        return doBatchUpdate(tTrpallettraceList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrpallettrace> tTrpallettraceList, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrpallettraceList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrpallettrace> tTrpallettraceList, WritableOptionCall<TTrpallettraceCB, DeleteOption<TTrpallettraceCB>> opLambda) {
        return doBatchDelete(tTrpallettraceList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrpallettraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrpallettrace> tTrpallettraceList, WritableOptionCall<TTrpallettraceCB, DeleteOption<TTrpallettraceCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrpallettraceList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrpallettrace, TTrpallettraceCB> manyArgLambda, WritableOptionCall<TTrpallettraceCB, InsertOption<TTrpallettraceCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrpallettrace tTrpallettrace = <span style="color: #70226C">new</span> TTrpallettrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setPK...(value);</span>
     * tTrpallettrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrpallettrace.setVersionNo(value);</span>
     * TTrpallettraceCB cb = <span style="color: #70226C">new</span> TTrpallettraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrpallettraceBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrpallettrace, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrpallettrace The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrpallettrace tTrpallettrace, TTrpallettraceCB cb, WritableOptionCall<TTrpallettraceCB, UpdateOption<TTrpallettraceCB>> opLambda) {
        return doQueryUpdate(tTrpallettrace, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrpallettrace. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrpallettraceCB cb, WritableOptionCall<TTrpallettraceCB, DeleteOption<TTrpallettraceCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrpallettraceBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrpallettraceBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrpallettraceBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrpallettraceBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrpallettraceBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrpallettraceBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrpallettraceBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrpallettraceBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrpallettraceBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrpallettraceBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrpallettraceBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrpallettraceBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrpallettraceBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrpallettraceBhv.outideSql().removeBlockComment().selectList()
     * tTrpallettraceBhv.outideSql().removeLineComment().selectList()
     * tTrpallettraceBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrpallettraceBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrpallettraceBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrpallettrace> typeOfSelectedEntity() { return TTrpallettrace.class; }
    protected Class<TTrpallettrace> typeOfHandlingEntity() { return TTrpallettrace.class; }
    protected Class<TTrpallettraceCB> typeOfHandlingConditionBean() { return TTrpallettraceCB.class; }
}
