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
 * The behavior of T_TRMANUFACTUREDATEHISTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRMANUFACTUREDATEHISTORY_ID
 *
 * [column]
 *     TRMANUFACTUREDATEHISTORY_ID, CENTER_CD, OWNER_CD, INVENTORY_KBN, LINE_BLOCK, PRODUCT_CD, INVENTORY_KEY, INVENTORY_B_ID, INVENTORY_DATE, BF_MANUFACTURE_DATE, AF_MANUFACTURE_DATE, DESIGN_FLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRMANUFACTUREDATEHISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrmanufacturedatehistoryBhv extends AbstractBehaviorWritable<TTrmanufacturedatehistory, TTrmanufacturedatehistoryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrmanufacturedatehistoryDbm asDBMeta() { return TTrmanufacturedatehistoryDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRMANUFACTUREDATEHISTORY"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrmanufacturedatehistoryDbm getMyDBMeta() { return TTrmanufacturedatehistoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrmanufacturedatehistoryCB newConditionBean() { return new TTrmanufacturedatehistoryCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrmanufacturedatehistory newMyEntity() { return new TTrmanufacturedatehistory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrmanufacturedatehistoryCB newMyConditionBean() { return new TTrmanufacturedatehistoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrmanufacturedatehistoryCB cb) {
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
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().setFoo...(value);
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrmanufacturedatehistory != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrmanufacturedatehistory.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrmanufacturedatehistory selectEntity(TTrmanufacturedatehistoryCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrmanufacturedatehistory facadeSelectEntity(TTrmanufacturedatehistoryCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrmanufacturedatehistory> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrmanufacturedatehistoryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().set...;
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrmanufacturedatehistory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrmanufacturedatehistory selectEntityWithDeletedCheck(TTrmanufacturedatehistoryCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trmanufacturedatehistoryId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrmanufacturedatehistory selectByPKValue(Long trmanufacturedatehistoryId) {
        return facadeSelectByPKValue(trmanufacturedatehistoryId);
    }

    protected TTrmanufacturedatehistory facadeSelectByPKValue(Long trmanufacturedatehistoryId) {
        return doSelectByPK(trmanufacturedatehistoryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrmanufacturedatehistory> ENTITY doSelectByPK(Long trmanufacturedatehistoryId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trmanufacturedatehistoryId), tp);
    }

    protected <ENTITY extends TTrmanufacturedatehistory> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trmanufacturedatehistoryId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trmanufacturedatehistoryId, tp), trmanufacturedatehistoryId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trmanufacturedatehistoryId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrmanufacturedatehistory selectByPKValueWithDeletedCheck(Long trmanufacturedatehistoryId) {
        return doSelectByPKWithDeletedCheck(trmanufacturedatehistoryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrmanufacturedatehistory> ENTITY doSelectByPKWithDeletedCheck(Long trmanufacturedatehistoryId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trmanufacturedatehistoryId), tp);
    }

    protected TTrmanufacturedatehistoryCB xprepareCBAsPK(Long trmanufacturedatehistoryId) {
        assertObjectNotNull("trmanufacturedatehistoryId", trmanufacturedatehistoryId);
        return newConditionBean().acceptPK(trmanufacturedatehistoryId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrmanufacturedatehistory&gt; <span style="color: #553000">tTrmanufacturedatehistoryList</span> = <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrmanufacturedatehistory tTrmanufacturedatehistory : <span style="color: #553000">tTrmanufacturedatehistoryList</span>) {
     *     ... = tTrmanufacturedatehistory.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrmanufacturedatehistory> selectList(TTrmanufacturedatehistoryCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrmanufacturedatehistory&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrmanufacturedatehistory tTrmanufacturedatehistory : <span style="color: #553000">page</span>) {
     *     ... = tTrmanufacturedatehistory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrmanufacturedatehistory> selectPage(TTrmanufacturedatehistoryCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrmanufacturedatehistory. (NotNull)
     */
    public void selectCursor(TTrmanufacturedatehistoryCB cb, EntityRowHandler<TTrmanufacturedatehistory> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrmanufacturedatehistoryCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrmanufacturedatehistoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrmanufacturedatehistoryList The entity list of TTrmanufacturedatehistory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, ReferrerLoaderHandler<LoaderOfTTrmanufacturedatehistory> loaderLambda) {
        xassLRArg(tTrmanufacturedatehistoryList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrmanufacturedatehistory().ready(tTrmanufacturedatehistoryList, _behaviorSelector));
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
     * @param tTrmanufacturedatehistory The entity of TTrmanufacturedatehistory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrmanufacturedatehistory tTrmanufacturedatehistory, ReferrerLoaderHandler<LoaderOfTTrmanufacturedatehistory> loaderLambda) {
        xassLRArg(tTrmanufacturedatehistory, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrmanufacturedatehistory().ready(xnewLRAryLs(tTrmanufacturedatehistory), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tTrmanufacturedatehistoryList The list of tTrmanufacturedatehistory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList)
    { return helpPulloutInternally(tTrmanufacturedatehistoryList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tTrmanufacturedatehistoryList The list of tTrmanufacturedatehistory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList)
    { return helpPulloutInternally(tTrmanufacturedatehistoryList, "mClient"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trmanufacturedatehistoryId.
     * @param tTrmanufacturedatehistoryList The list of tTrmanufacturedatehistory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrmanufacturedatehistoryIdList(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList)
    { return helpExtractListInternally(tTrmanufacturedatehistoryList, "trmanufacturedatehistoryId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrmanufacturedatehistory.setFoo...(value);
     * tTrmanufacturedatehistory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.set...;</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">insert</span>(tTrmanufacturedatehistory);
     * ... = tTrmanufacturedatehistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrmanufacturedatehistory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doInsert(tTrmanufacturedatehistory, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrmanufacturedatehistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrmanufacturedatehistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">update</span>(tTrmanufacturedatehistory);
     * </pre>
     * @param tTrmanufacturedatehistory The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doUpdate(tTrmanufacturedatehistory, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrmanufacturedatehistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrmanufacturedatehistory);
     * </pre>
     * @param tTrmanufacturedatehistory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doUpdateNonstrict(tTrmanufacturedatehistory, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrmanufacturedatehistory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doInsertOrUpdate(tTrmanufacturedatehistory, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrmanufacturedatehistory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doInsertOrUpdateNonstrict(tTrmanufacturedatehistory, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrmanufacturedatehistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">delete</span>(tTrmanufacturedatehistory);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrmanufacturedatehistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doDelete(tTrmanufacturedatehistory, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrmanufacturedatehistory);
     * </pre>
     * @param tTrmanufacturedatehistory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doDeleteNonstrict(tTrmanufacturedatehistory, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrmanufacturedatehistory);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrmanufacturedatehistory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrmanufacturedatehistory tTrmanufacturedatehistory) {
        doDeleteNonstrictIgnoreDeleted(tTrmanufacturedatehistory, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrmanufacturedatehistory et, final DeleteOption<TTrmanufacturedatehistoryCB> op) {
        assertObjectNotNull("tTrmanufacturedatehistory", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     *     tTrmanufacturedatehistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrmanufacturedatehistory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrmanufacturedatehistoryList.add(tTrmanufacturedatehistory);
     * }
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrmanufacturedatehistoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        return doBatchInsert(tTrmanufacturedatehistoryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     *     tTrmanufacturedatehistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrmanufacturedatehistory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrmanufacturedatehistory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrmanufacturedatehistoryList.add(tTrmanufacturedatehistory);
     * }
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrmanufacturedatehistoryList);
     * </pre>
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        return doBatchUpdate(tTrmanufacturedatehistoryList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrmanufacturedatehistoryBhv.<span style="color: #CC4747">batchUpdate</span>(tTrmanufacturedatehistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrmanufacturedatehistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, SpecifyQuery<TTrmanufacturedatehistoryCB> colCBLambda) {
        return doBatchUpdate(tTrmanufacturedatehistoryList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     *     tTrmanufacturedatehistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrmanufacturedatehistory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrmanufacturedatehistory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrmanufacturedatehistoryList.add(tTrmanufacturedatehistory);
     * }
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrmanufacturedatehistoryList);
     * </pre>
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        return doBatchUpdateNonstrict(tTrmanufacturedatehistoryList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrmanufacturedatehistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrmanufacturedatehistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, SpecifyQuery<TTrmanufacturedatehistoryCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrmanufacturedatehistoryList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        return doBatchDelete(tTrmanufacturedatehistoryList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList) {
        return doBatchDeleteNonstrict(tTrmanufacturedatehistoryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrmanufacturedatehistory, TTrmanufacturedatehistoryCB&gt;() {
     *     public ConditionBean setup(TTrmanufacturedatehistory entity, TTrmanufacturedatehistoryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrmanufacturedatehistory, TTrmanufacturedatehistoryCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setPK...(value);</span>
     * tTrmanufacturedatehistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setVersionNo(value);</span>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrmanufacturedatehistory, cb);
     * </pre>
     * @param tTrmanufacturedatehistory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrmanufacturedatehistory tTrmanufacturedatehistory, TTrmanufacturedatehistoryCB cb) {
        return doQueryUpdate(tTrmanufacturedatehistory, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrmanufacturedatehistory, cb);
     * </pre>
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrmanufacturedatehistoryCB cb) {
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
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrmanufacturedatehistory.setFoo...(value);
     * tTrmanufacturedatehistory.setBar...(value);
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrmanufacturedatehistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrmanufacturedatehistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrmanufacturedatehistory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, InsertOption<TTrmanufacturedatehistoryCB>> opLambda) {
        doInsert(tTrmanufacturedatehistory, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrmanufacturedatehistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrmanufacturedatehistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrmanufacturedatehistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrmanufacturedatehistory The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> opLambda) {
        doUpdate(tTrmanufacturedatehistory, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * tTrmanufacturedatehistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrmanufacturedatehistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrmanufacturedatehistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrmanufacturedatehistory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> opLambda) {
        doUpdateNonstrict(tTrmanufacturedatehistory, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrmanufacturedatehistory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, InsertOption<TTrmanufacturedatehistoryCB>> insertOpLambda, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> updateOpLambda) {
        doInsertOrUpdate(tTrmanufacturedatehistory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrmanufacturedatehistory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, InsertOption<TTrmanufacturedatehistoryCB>> insertOpLambda, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrmanufacturedatehistory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrmanufacturedatehistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, DeleteOption<TTrmanufacturedatehistoryCB>> opLambda) {
        doDelete(tTrmanufacturedatehistory, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrmanufacturedatehistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrmanufacturedatehistory tTrmanufacturedatehistory, WritableOptionCall<TTrmanufacturedatehistoryCB, DeleteOption<TTrmanufacturedatehistoryCB>> opLambda) {
        doDeleteNonstrict(tTrmanufacturedatehistory, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, WritableOptionCall<TTrmanufacturedatehistoryCB, InsertOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doBatchInsert(tTrmanufacturedatehistoryList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doBatchUpdate(tTrmanufacturedatehistoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrmanufacturedatehistoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, WritableOptionCall<TTrmanufacturedatehistoryCB, DeleteOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doBatchDelete(tTrmanufacturedatehistoryList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrmanufacturedatehistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrmanufacturedatehistory> tTrmanufacturedatehistoryList, WritableOptionCall<TTrmanufacturedatehistoryCB, DeleteOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrmanufacturedatehistoryList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrmanufacturedatehistory, TTrmanufacturedatehistoryCB> manyArgLambda, WritableOptionCall<TTrmanufacturedatehistoryCB, InsertOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrmanufacturedatehistory tTrmanufacturedatehistory = <span style="color: #70226C">new</span> TTrmanufacturedatehistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setPK...(value);</span>
     * tTrmanufacturedatehistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrmanufacturedatehistory.setVersionNo(value);</span>
     * TTrmanufacturedatehistoryCB cb = <span style="color: #70226C">new</span> TTrmanufacturedatehistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrmanufacturedatehistoryBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrmanufacturedatehistory, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrmanufacturedatehistory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrmanufacturedatehistory tTrmanufacturedatehistory, TTrmanufacturedatehistoryCB cb, WritableOptionCall<TTrmanufacturedatehistoryCB, UpdateOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doQueryUpdate(tTrmanufacturedatehistory, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrmanufacturedatehistory. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrmanufacturedatehistoryCB cb, WritableOptionCall<TTrmanufacturedatehistoryCB, DeleteOption<TTrmanufacturedatehistoryCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrmanufacturedatehistoryBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrmanufacturedatehistoryBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrmanufacturedatehistoryBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrmanufacturedatehistoryBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrmanufacturedatehistoryBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrmanufacturedatehistoryBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrmanufacturedatehistoryBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrmanufacturedatehistoryBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrmanufacturedatehistoryBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrmanufacturedatehistoryBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrmanufacturedatehistoryBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrmanufacturedatehistoryBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrmanufacturedatehistoryBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrmanufacturedatehistoryBhv.outideSql().removeBlockComment().selectList()
     * tTrmanufacturedatehistoryBhv.outideSql().removeLineComment().selectList()
     * tTrmanufacturedatehistoryBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrmanufacturedatehistoryBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrmanufacturedatehistoryBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrmanufacturedatehistory> typeOfSelectedEntity() { return TTrmanufacturedatehistory.class; }
    protected Class<TTrmanufacturedatehistory> typeOfHandlingEntity() { return TTrmanufacturedatehistory.class; }
    protected Class<TTrmanufacturedatehistoryCB> typeOfHandlingConditionBean() { return TTrmanufacturedatehistoryCB.class; }
}
