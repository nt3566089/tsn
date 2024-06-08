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
 * The behavior of W_CARRIER_ZIP_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_ZIP_INPUT_ID
 *
 * [column]
 *     CARRIER_ZIP_INPUT_ID, ZIP_CD, ARRIVAL_STORE_CD, ARRIVAL_STORE_NM, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ZIP_INPUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWCarrierZipInputBhv extends AbstractBehaviorWritable<WCarrierZipInput, WCarrierZipInputCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WCarrierZipInputDbm asDBMeta() { return WCarrierZipInputDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "W_CARRIER_ZIP_INPUT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WCarrierZipInputDbm getMyDBMeta() { return WCarrierZipInputDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WCarrierZipInputCB newConditionBean() { return new WCarrierZipInputCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WCarrierZipInput newMyEntity() { return new WCarrierZipInput(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WCarrierZipInputCB newMyConditionBean() { return new WCarrierZipInputCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WCarrierZipInputCB cb) {
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
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().setFoo...(value);
     * WCarrierZipInput wCarrierZipInput = <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wCarrierZipInput != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wCarrierZipInput.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WCarrierZipInput selectEntity(WCarrierZipInputCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WCarrierZipInput facadeSelectEntity(WCarrierZipInputCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WCarrierZipInput> OptionalEntity<ENTITY> doSelectOptionalEntity(WCarrierZipInputCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().set...;
     * WCarrierZipInput wCarrierZipInput = <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wCarrierZipInput.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WCarrierZipInput selectEntityWithDeletedCheck(WCarrierZipInputCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param carrierZipInputId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WCarrierZipInput selectByPKValue(Long carrierZipInputId) {
        return facadeSelectByPKValue(carrierZipInputId);
    }

    protected WCarrierZipInput facadeSelectByPKValue(Long carrierZipInputId) {
        return doSelectByPK(carrierZipInputId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WCarrierZipInput> ENTITY doSelectByPK(Long carrierZipInputId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(carrierZipInputId), tp);
    }

    protected <ENTITY extends WCarrierZipInput> OptionalEntity<ENTITY> doSelectOptionalByPK(Long carrierZipInputId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(carrierZipInputId, tp), carrierZipInputId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param carrierZipInputId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WCarrierZipInput selectByPKValueWithDeletedCheck(Long carrierZipInputId) {
        return doSelectByPKWithDeletedCheck(carrierZipInputId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WCarrierZipInput> ENTITY doSelectByPKWithDeletedCheck(Long carrierZipInputId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(carrierZipInputId), tp);
    }

    protected WCarrierZipInputCB xprepareCBAsPK(Long carrierZipInputId) {
        assertObjectNotNull("carrierZipInputId", carrierZipInputId);
        return newConditionBean().acceptPK(carrierZipInputId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WCarrierZipInput&gt; <span style="color: #553000">wCarrierZipInputList</span> = <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WCarrierZipInput wCarrierZipInput : <span style="color: #553000">wCarrierZipInputList</span>) {
     *     ... = wCarrierZipInput.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WCarrierZipInput> selectList(WCarrierZipInputCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WCarrierZipInput&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WCarrierZipInput wCarrierZipInput : <span style="color: #553000">page</span>) {
     *     ... = wCarrierZipInput.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WCarrierZipInput> selectPage(WCarrierZipInputCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().set...
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @param entityRowHandler The handler of entity row of WCarrierZipInput. (NotNull)
     */
    public void selectCursor(WCarrierZipInputCB cb, EntityRowHandler<WCarrierZipInput> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WCarrierZipInputCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WCarrierZipInputCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wCarrierZipInputList The entity list of WCarrierZipInput. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WCarrierZipInput> wCarrierZipInputList, ReferrerLoaderHandler<LoaderOfWCarrierZipInput> loaderLambda) {
        xassLRArg(wCarrierZipInputList, loaderLambda);
        loaderLambda.handle(new LoaderOfWCarrierZipInput().ready(wCarrierZipInputList, _behaviorSelector));
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
     * @param wCarrierZipInput The entity of WCarrierZipInput. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WCarrierZipInput wCarrierZipInput, ReferrerLoaderHandler<LoaderOfWCarrierZipInput> loaderLambda) {
        xassLRArg(wCarrierZipInput, loaderLambda);
        loaderLambda.handle(new LoaderOfWCarrierZipInput().ready(xnewLRAryLs(wCarrierZipInput), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key carrierZipInputId.
     * @param wCarrierZipInputList The list of wCarrierZipInput. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCarrierZipInputIdList(List<WCarrierZipInput> wCarrierZipInputList)
    { return helpExtractListInternally(wCarrierZipInputList, "carrierZipInputId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wCarrierZipInput.setFoo...(value);
     * wCarrierZipInput.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.set...;</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">insert</span>(wCarrierZipInput);
     * ... = wCarrierZipInput.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wCarrierZipInput The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WCarrierZipInput wCarrierZipInput) {
        doInsert(wCarrierZipInput, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wCarrierZipInput.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wCarrierZipInput.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">update</span>(wCarrierZipInput);
     * </pre>
     * @param wCarrierZipInput The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WCarrierZipInput wCarrierZipInput) {
        doUpdate(wCarrierZipInput, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wCarrierZipInput.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setVersionNo(value);</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wCarrierZipInput);
     * </pre>
     * @param wCarrierZipInput The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WCarrierZipInput wCarrierZipInput) {
        doUpdateNonstrict(wCarrierZipInput, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wCarrierZipInput The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WCarrierZipInput wCarrierZipInput) {
        doInsertOrUpdate(wCarrierZipInput, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wCarrierZipInput The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WCarrierZipInput wCarrierZipInput) {
        doInsertOrUpdateNonstrict(wCarrierZipInput, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wCarrierZipInput.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">delete</span>(wCarrierZipInput);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wCarrierZipInput The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WCarrierZipInput wCarrierZipInput) {
        doDelete(wCarrierZipInput, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setVersionNo(value);</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wCarrierZipInput);
     * </pre>
     * @param wCarrierZipInput The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WCarrierZipInput wCarrierZipInput) {
        doDeleteNonstrict(wCarrierZipInput, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setVersionNo(value);</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wCarrierZipInput);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wCarrierZipInput The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WCarrierZipInput wCarrierZipInput) {
        doDeleteNonstrictIgnoreDeleted(wCarrierZipInput, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WCarrierZipInput et, final DeleteOption<WCarrierZipInputCB> op) {
        assertObjectNotNull("wCarrierZipInput", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     *     wCarrierZipInput.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wCarrierZipInput.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wCarrierZipInputList.add(wCarrierZipInput);
     * }
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">batchInsert</span>(wCarrierZipInputList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WCarrierZipInput> wCarrierZipInputList) {
        return doBatchInsert(wCarrierZipInputList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     *     wCarrierZipInput.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wCarrierZipInput.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wCarrierZipInput.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wCarrierZipInput.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wCarrierZipInputList.add(wCarrierZipInput);
     * }
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wCarrierZipInputList);
     * </pre>
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WCarrierZipInput> wCarrierZipInputList) {
        return doBatchUpdate(wCarrierZipInputList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wCarrierZipInputBhv.<span style="color: #CC4747">batchUpdate</span>(wCarrierZipInputList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wCarrierZipInputList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WCarrierZipInput> wCarrierZipInputList, SpecifyQuery<WCarrierZipInputCB> colCBLambda) {
        return doBatchUpdate(wCarrierZipInputList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     *     wCarrierZipInput.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wCarrierZipInput.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wCarrierZipInput.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wCarrierZipInput.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wCarrierZipInputList.add(wCarrierZipInput);
     * }
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wCarrierZipInputList);
     * </pre>
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WCarrierZipInput> wCarrierZipInputList) {
        return doBatchUpdateNonstrict(wCarrierZipInputList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wCarrierZipInputList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wCarrierZipInputList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WCarrierZipInput> wCarrierZipInputList, SpecifyQuery<WCarrierZipInputCB> colCBLambda) {
        return doBatchUpdateNonstrict(wCarrierZipInputList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WCarrierZipInput> wCarrierZipInputList) {
        return doBatchDelete(wCarrierZipInputList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WCarrierZipInput> wCarrierZipInputList) {
        return doBatchDeleteNonstrict(wCarrierZipInputList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WCarrierZipInput, WCarrierZipInputCB&gt;() {
     *     public ConditionBean setup(WCarrierZipInput entity, WCarrierZipInputCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WCarrierZipInput, WCarrierZipInputCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setPK...(value);</span>
     * wCarrierZipInput.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setVersionNo(value);</span>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wCarrierZipInput, cb);
     * </pre>
     * @param wCarrierZipInput The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WCarrierZipInput wCarrierZipInput, WCarrierZipInputCB cb) {
        return doQueryUpdate(wCarrierZipInput, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WCarrierZipInputCB cb = new WCarrierZipInputCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">queryDelete</span>(wCarrierZipInput, cb);
     * </pre>
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WCarrierZipInputCB cb) {
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
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wCarrierZipInput.setFoo...(value);
     * wCarrierZipInput.setBar...(value);
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wCarrierZipInput, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wCarrierZipInput.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wCarrierZipInput The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, InsertOption<WCarrierZipInputCB>> opLambda) {
        doInsert(wCarrierZipInput, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wCarrierZipInput.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wCarrierZipInput.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wCarrierZipInput, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wCarrierZipInput The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> opLambda) {
        doUpdate(wCarrierZipInput, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * wCarrierZipInput.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wCarrierZipInput.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setVersionNo(value);</span>
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wCarrierZipInput, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wCarrierZipInput The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> opLambda) {
        doUpdateNonstrict(wCarrierZipInput, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wCarrierZipInput The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, InsertOption<WCarrierZipInputCB>> insertOpLambda, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> updateOpLambda) {
        doInsertOrUpdate(wCarrierZipInput, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wCarrierZipInput The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, InsertOption<WCarrierZipInputCB>> insertOpLambda, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wCarrierZipInput, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wCarrierZipInput The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, DeleteOption<WCarrierZipInputCB>> opLambda) {
        doDelete(wCarrierZipInput, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wCarrierZipInput The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WCarrierZipInput wCarrierZipInput, WritableOptionCall<WCarrierZipInputCB, DeleteOption<WCarrierZipInputCB>> opLambda) {
        doDeleteNonstrict(wCarrierZipInput, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WCarrierZipInput> wCarrierZipInputList, WritableOptionCall<WCarrierZipInputCB, InsertOption<WCarrierZipInputCB>> opLambda) {
        return doBatchInsert(wCarrierZipInputList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WCarrierZipInput> wCarrierZipInputList, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> opLambda) {
        return doBatchUpdate(wCarrierZipInputList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WCarrierZipInput> wCarrierZipInputList, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> opLambda) {
        return doBatchUpdateNonstrict(wCarrierZipInputList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WCarrierZipInput> wCarrierZipInputList, WritableOptionCall<WCarrierZipInputCB, DeleteOption<WCarrierZipInputCB>> opLambda) {
        return doBatchDelete(wCarrierZipInputList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wCarrierZipInputList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WCarrierZipInput> wCarrierZipInputList, WritableOptionCall<WCarrierZipInputCB, DeleteOption<WCarrierZipInputCB>> opLambda) {
        return doBatchDeleteNonstrict(wCarrierZipInputList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WCarrierZipInput, WCarrierZipInputCB> manyArgLambda, WritableOptionCall<WCarrierZipInputCB, InsertOption<WCarrierZipInputCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WCarrierZipInput wCarrierZipInput = <span style="color: #70226C">new</span> WCarrierZipInput();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setPK...(value);</span>
     * wCarrierZipInput.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wCarrierZipInput.setVersionNo(value);</span>
     * WCarrierZipInputCB cb = <span style="color: #70226C">new</span> WCarrierZipInputCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wCarrierZipInputBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wCarrierZipInput, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wCarrierZipInput The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WCarrierZipInput wCarrierZipInput, WCarrierZipInputCB cb, WritableOptionCall<WCarrierZipInputCB, UpdateOption<WCarrierZipInputCB>> opLambda) {
        return doQueryUpdate(wCarrierZipInput, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WCarrierZipInput. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WCarrierZipInputCB cb, WritableOptionCall<WCarrierZipInputCB, DeleteOption<WCarrierZipInputCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wCarrierZipInputBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wCarrierZipInputBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wCarrierZipInputBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wCarrierZipInputBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wCarrierZipInputBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wCarrierZipInputBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wCarrierZipInputBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wCarrierZipInputBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wCarrierZipInputBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wCarrierZipInputBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wCarrierZipInputBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wCarrierZipInputBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wCarrierZipInputBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wCarrierZipInputBhv.outideSql().removeBlockComment().selectList()
     * wCarrierZipInputBhv.outideSql().removeLineComment().selectList()
     * wCarrierZipInputBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WCarrierZipInputBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WCarrierZipInputBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WCarrierZipInput> typeOfSelectedEntity() { return WCarrierZipInput.class; }
    protected Class<WCarrierZipInput> typeOfHandlingEntity() { return WCarrierZipInput.class; }
    protected Class<WCarrierZipInputCB> typeOfHandlingConditionBean() { return WCarrierZipInputCB.class; }
}
