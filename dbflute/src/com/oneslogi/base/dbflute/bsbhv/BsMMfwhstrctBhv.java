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
 * The behavior of M_MFWHSTRCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFWHSTRCT_ID
 *
 * [column]
 *     MFWHSTRCT_ID, CENTER_ID, STRCTCD, LINEUSEFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFWHSTRCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMMfwhstrctBhv extends AbstractBehaviorWritable<MMfwhstrct, MMfwhstrctCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MMfwhstrctDbm asDBMeta() { return MMfwhstrctDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_MFWHSTRCT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MMfwhstrctDbm getMyDBMeta() { return MMfwhstrctDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MMfwhstrctCB newConditionBean() { return new MMfwhstrctCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MMfwhstrct newMyEntity() { return new MMfwhstrct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MMfwhstrctCB newMyConditionBean() { return new MMfwhstrctCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MMfwhstrctCB cb) {
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
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().setFoo...(value);
     * MMfwhstrct mMfwhstrct = <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mMfwhstrct != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mMfwhstrct.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhstrct selectEntity(MMfwhstrctCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MMfwhstrct facadeSelectEntity(MMfwhstrctCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MMfwhstrct> OptionalEntity<ENTITY> doSelectOptionalEntity(MMfwhstrctCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().set...;
     * MMfwhstrct mMfwhstrct = <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mMfwhstrct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhstrct selectEntityWithDeletedCheck(MMfwhstrctCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param mfwhstrctId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhstrct selectByPKValue(Long mfwhstrctId) {
        return facadeSelectByPKValue(mfwhstrctId);
    }

    protected MMfwhstrct facadeSelectByPKValue(Long mfwhstrctId) {
        return doSelectByPK(mfwhstrctId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MMfwhstrct> ENTITY doSelectByPK(Long mfwhstrctId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(mfwhstrctId), tp);
    }

    protected <ENTITY extends MMfwhstrct> OptionalEntity<ENTITY> doSelectOptionalByPK(Long mfwhstrctId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(mfwhstrctId, tp), mfwhstrctId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param mfwhstrctId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhstrct selectByPKValueWithDeletedCheck(Long mfwhstrctId) {
        return doSelectByPKWithDeletedCheck(mfwhstrctId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MMfwhstrct> ENTITY doSelectByPKWithDeletedCheck(Long mfwhstrctId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(mfwhstrctId), tp);
    }

    protected MMfwhstrctCB xprepareCBAsPK(Long mfwhstrctId) {
        assertObjectNotNull("mfwhstrctId", mfwhstrctId);
        return newConditionBean().acceptPK(mfwhstrctId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MMfwhstrct&gt; <span style="color: #553000">mMfwhstrctList</span> = <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MMfwhstrct mMfwhstrct : <span style="color: #553000">mMfwhstrctList</span>) {
     *     ... = mMfwhstrct.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MMfwhstrct> selectList(MMfwhstrctCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MMfwhstrct&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MMfwhstrct mMfwhstrct : <span style="color: #553000">page</span>) {
     *     ... = mMfwhstrct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MMfwhstrct> selectPage(MMfwhstrctCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().set...
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @param entityRowHandler The handler of entity row of MMfwhstrct. (NotNull)
     */
    public void selectCursor(MMfwhstrctCB cb, EntityRowHandler<MMfwhstrct> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MMfwhstrctCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MMfwhstrctCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mMfwhstrctList The entity list of MMfwhstrct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MMfwhstrct> mMfwhstrctList, ReferrerLoaderHandler<LoaderOfMMfwhstrct> loaderLambda) {
        xassLRArg(mMfwhstrctList, loaderLambda);
        loaderLambda.handle(new LoaderOfMMfwhstrct().ready(mMfwhstrctList, _behaviorSelector));
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
     * @param mMfwhstrct The entity of MMfwhstrct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MMfwhstrct mMfwhstrct, ReferrerLoaderHandler<LoaderOfMMfwhstrct> loaderLambda) {
        xassLRArg(mMfwhstrct, loaderLambda);
        loaderLambda.handle(new LoaderOfMMfwhstrct().ready(xnewLRAryLs(mMfwhstrct), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mMfwhstrctList The list of mMfwhstrct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MMfwhstrct> mMfwhstrctList)
    { return helpPulloutInternally(mMfwhstrctList, "mCenter"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key mfwhstrctId.
     * @param mMfwhstrctList The list of mMfwhstrct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMfwhstrctIdList(List<MMfwhstrct> mMfwhstrctList)
    { return helpExtractListInternally(mMfwhstrctList, "mfwhstrctId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mMfwhstrct.setFoo...(value);
     * mMfwhstrct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.set...;</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">insert</span>(mMfwhstrct);
     * ... = mMfwhstrct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mMfwhstrct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MMfwhstrct mMfwhstrct) {
        doInsert(mMfwhstrct, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhstrct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mMfwhstrct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">update</span>(mMfwhstrct);
     * </pre>
     * @param mMfwhstrct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MMfwhstrct mMfwhstrct) {
        doUpdate(mMfwhstrct, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhstrct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mMfwhstrct);
     * </pre>
     * @param mMfwhstrct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MMfwhstrct mMfwhstrct) {
        doUpdateNonstrict(mMfwhstrct, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mMfwhstrct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MMfwhstrct mMfwhstrct) {
        doInsertOrUpdate(mMfwhstrct, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mMfwhstrct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MMfwhstrct mMfwhstrct) {
        doInsertOrUpdateNonstrict(mMfwhstrct, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mMfwhstrct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">delete</span>(mMfwhstrct);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mMfwhstrct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MMfwhstrct mMfwhstrct) {
        doDelete(mMfwhstrct, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mMfwhstrct);
     * </pre>
     * @param mMfwhstrct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MMfwhstrct mMfwhstrct) {
        doDeleteNonstrict(mMfwhstrct, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mMfwhstrct);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mMfwhstrct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MMfwhstrct mMfwhstrct) {
        doDeleteNonstrictIgnoreDeleted(mMfwhstrct, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MMfwhstrct et, final DeleteOption<MMfwhstrctCB> op) {
        assertObjectNotNull("mMfwhstrct", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     *     mMfwhstrct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mMfwhstrct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mMfwhstrctList.add(mMfwhstrct);
     * }
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">batchInsert</span>(mMfwhstrctList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MMfwhstrct> mMfwhstrctList) {
        return doBatchInsert(mMfwhstrctList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     *     mMfwhstrct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mMfwhstrct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mMfwhstrct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mMfwhstrct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mMfwhstrctList.add(mMfwhstrct);
     * }
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mMfwhstrctList);
     * </pre>
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MMfwhstrct> mMfwhstrctList) {
        return doBatchUpdate(mMfwhstrctList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mMfwhstrctBhv.<span style="color: #CC4747">batchUpdate</span>(mMfwhstrctList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mMfwhstrctList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MMfwhstrct> mMfwhstrctList, SpecifyQuery<MMfwhstrctCB> colCBLambda) {
        return doBatchUpdate(mMfwhstrctList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     *     mMfwhstrct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mMfwhstrct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mMfwhstrct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mMfwhstrct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mMfwhstrctList.add(mMfwhstrct);
     * }
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mMfwhstrctList);
     * </pre>
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MMfwhstrct> mMfwhstrctList) {
        return doBatchUpdateNonstrict(mMfwhstrctList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mMfwhstrctList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mMfwhstrctList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MMfwhstrct> mMfwhstrctList, SpecifyQuery<MMfwhstrctCB> colCBLambda) {
        return doBatchUpdateNonstrict(mMfwhstrctList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MMfwhstrct> mMfwhstrctList) {
        return doBatchDelete(mMfwhstrctList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MMfwhstrct> mMfwhstrctList) {
        return doBatchDeleteNonstrict(mMfwhstrctList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MMfwhstrct, MMfwhstrctCB&gt;() {
     *     public ConditionBean setup(MMfwhstrct entity, MMfwhstrctCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MMfwhstrct, MMfwhstrctCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setPK...(value);</span>
     * mMfwhstrct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setVersionNo(value);</span>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mMfwhstrct, cb);
     * </pre>
     * @param mMfwhstrct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MMfwhstrct mMfwhstrct, MMfwhstrctCB cb) {
        return doQueryUpdate(mMfwhstrct, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MMfwhstrctCB cb = new MMfwhstrctCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">queryDelete</span>(mMfwhstrct, cb);
     * </pre>
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MMfwhstrctCB cb) {
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
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mMfwhstrct.setFoo...(value);
     * mMfwhstrct.setBar...(value);
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mMfwhstrct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mMfwhstrct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mMfwhstrct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, InsertOption<MMfwhstrctCB>> opLambda) {
        doInsert(mMfwhstrct, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhstrct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mMfwhstrct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mMfwhstrct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mMfwhstrct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> opLambda) {
        doUpdate(mMfwhstrct, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * mMfwhstrct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhstrct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mMfwhstrct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mMfwhstrct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> opLambda) {
        doUpdateNonstrict(mMfwhstrct, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mMfwhstrct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, InsertOption<MMfwhstrctCB>> insertOpLambda, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> updateOpLambda) {
        doInsertOrUpdate(mMfwhstrct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mMfwhstrct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, InsertOption<MMfwhstrctCB>> insertOpLambda, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mMfwhstrct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mMfwhstrct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, DeleteOption<MMfwhstrctCB>> opLambda) {
        doDelete(mMfwhstrct, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mMfwhstrct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MMfwhstrct mMfwhstrct, WritableOptionCall<MMfwhstrctCB, DeleteOption<MMfwhstrctCB>> opLambda) {
        doDeleteNonstrict(mMfwhstrct, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MMfwhstrct> mMfwhstrctList, WritableOptionCall<MMfwhstrctCB, InsertOption<MMfwhstrctCB>> opLambda) {
        return doBatchInsert(mMfwhstrctList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MMfwhstrct> mMfwhstrctList, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> opLambda) {
        return doBatchUpdate(mMfwhstrctList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MMfwhstrct> mMfwhstrctList, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> opLambda) {
        return doBatchUpdateNonstrict(mMfwhstrctList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MMfwhstrct> mMfwhstrctList, WritableOptionCall<MMfwhstrctCB, DeleteOption<MMfwhstrctCB>> opLambda) {
        return doBatchDelete(mMfwhstrctList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mMfwhstrctList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MMfwhstrct> mMfwhstrctList, WritableOptionCall<MMfwhstrctCB, DeleteOption<MMfwhstrctCB>> opLambda) {
        return doBatchDeleteNonstrict(mMfwhstrctList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MMfwhstrct, MMfwhstrctCB> manyArgLambda, WritableOptionCall<MMfwhstrctCB, InsertOption<MMfwhstrctCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MMfwhstrct mMfwhstrct = <span style="color: #70226C">new</span> MMfwhstrct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setPK...(value);</span>
     * mMfwhstrct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhstrct.setVersionNo(value);</span>
     * MMfwhstrctCB cb = <span style="color: #70226C">new</span> MMfwhstrctCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mMfwhstrctBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mMfwhstrct, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mMfwhstrct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MMfwhstrct mMfwhstrct, MMfwhstrctCB cb, WritableOptionCall<MMfwhstrctCB, UpdateOption<MMfwhstrctCB>> opLambda) {
        return doQueryUpdate(mMfwhstrct, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MMfwhstrct. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MMfwhstrctCB cb, WritableOptionCall<MMfwhstrctCB, DeleteOption<MMfwhstrctCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mMfwhstrctBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mMfwhstrctBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mMfwhstrctBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mMfwhstrctBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mMfwhstrctBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mMfwhstrctBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mMfwhstrctBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mMfwhstrctBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mMfwhstrctBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mMfwhstrctBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mMfwhstrctBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mMfwhstrctBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mMfwhstrctBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mMfwhstrctBhv.outideSql().removeBlockComment().selectList()
     * mMfwhstrctBhv.outideSql().removeLineComment().selectList()
     * mMfwhstrctBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MMfwhstrctBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MMfwhstrctBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MMfwhstrct> typeOfSelectedEntity() { return MMfwhstrct.class; }
    protected Class<MMfwhstrct> typeOfHandlingEntity() { return MMfwhstrct.class; }
    protected Class<MMfwhstrctCB> typeOfHandlingConditionBean() { return MMfwhstrctCB.class; }
}
