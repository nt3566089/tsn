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
 * The behavior of T_BTRPICKDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_INST_DETAIL_ID
 *
 * [column]
 *     PICKING_INST_DETAIL_ID, PICKING_INST_ID, PICKBATCHLINENO, SOID, SODETAILID, STS, PRODUCT_ID, IF_PRODUCT_ID, LOT_ID, LOCATION_ID, LOCGROUP, LOCTYPE, PICKTYPE, ALLOCTYPE, TAGCD, ACTUALTAGCD, FROM_LOCATION_ID, FROMTAGCD, TO_LOCATION_ID, TOTAGCD, EXPECTQTY1, PICKEDQTY1, PALLETTYPE, SORTEDQTY1, SHIPPEDQTY1, RCVKEY, RCVLINENO, PICKUSERCD, LOTRESERVEFLG, LABELPRINTEDFLG, ALLOCSTYLETYPE, FULLPALLETKEY, PICKINGUNIT, WORKALLOCATEID, WORKALLOCATENAME, ALERTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_DETAIL_ID
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
public abstract class BsTBtrpickdetailBhv extends AbstractBehaviorWritable<TBtrpickdetail, TBtrpickdetailCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TBtrpickdetailDbm asDBMeta() { return TBtrpickdetailDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_BTRPICKDETAIL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TBtrpickdetailDbm getMyDBMeta() { return TBtrpickdetailDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TBtrpickdetailCB newConditionBean() { return new TBtrpickdetailCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TBtrpickdetail newMyEntity() { return new TBtrpickdetail(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TBtrpickdetailCB newMyConditionBean() { return new TBtrpickdetailCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TBtrpickdetailCB cb) {
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
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().setFoo...(value);
     * TBtrpickdetail tBtrpickdetail = <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tBtrpickdetail != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tBtrpickdetail.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TBtrpickdetail selectEntity(TBtrpickdetailCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TBtrpickdetail facadeSelectEntity(TBtrpickdetailCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TBtrpickdetail> OptionalEntity<ENTITY> doSelectOptionalEntity(TBtrpickdetailCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().set...;
     * TBtrpickdetail tBtrpickdetail = <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tBtrpickdetail.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TBtrpickdetail selectEntityWithDeletedCheck(TBtrpickdetailCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param pickingInstDetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TBtrpickdetail selectByPKValue(Long pickingInstDetailId) {
        return facadeSelectByPKValue(pickingInstDetailId);
    }

    protected TBtrpickdetail facadeSelectByPKValue(Long pickingInstDetailId) {
        return doSelectByPK(pickingInstDetailId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TBtrpickdetail> ENTITY doSelectByPK(Long pickingInstDetailId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(pickingInstDetailId), tp);
    }

    protected <ENTITY extends TBtrpickdetail> OptionalEntity<ENTITY> doSelectOptionalByPK(Long pickingInstDetailId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(pickingInstDetailId, tp), pickingInstDetailId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param pickingInstDetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TBtrpickdetail selectByPKValueWithDeletedCheck(Long pickingInstDetailId) {
        return doSelectByPKWithDeletedCheck(pickingInstDetailId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TBtrpickdetail> ENTITY doSelectByPKWithDeletedCheck(Long pickingInstDetailId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(pickingInstDetailId), tp);
    }

    protected TBtrpickdetailCB xprepareCBAsPK(Long pickingInstDetailId) {
        assertObjectNotNull("pickingInstDetailId", pickingInstDetailId);
        return newConditionBean().acceptPK(pickingInstDetailId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TBtrpickdetail&gt; <span style="color: #553000">tBtrpickdetailList</span> = <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TBtrpickdetail tBtrpickdetail : <span style="color: #553000">tBtrpickdetailList</span>) {
     *     ... = tBtrpickdetail.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TBtrpickdetail> selectList(TBtrpickdetailCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TBtrpickdetail&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TBtrpickdetail tBtrpickdetail : <span style="color: #553000">page</span>) {
     *     ... = tBtrpickdetail.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TBtrpickdetail> selectPage(TBtrpickdetailCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().set...
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @param entityRowHandler The handler of entity row of TBtrpickdetail. (NotNull)
     */
    public void selectCursor(TBtrpickdetailCB cb, EntityRowHandler<TBtrpickdetail> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TBtrpickdetailCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TBtrpickdetailCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tBtrpickdetailList The entity list of TBtrpickdetail. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TBtrpickdetail> tBtrpickdetailList, ReferrerLoaderHandler<LoaderOfTBtrpickdetail> loaderLambda) {
        xassLRArg(tBtrpickdetailList, loaderLambda);
        loaderLambda.handle(new LoaderOfTBtrpickdetail().ready(tBtrpickdetailList, _behaviorSelector));
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
     * @param tBtrpickdetail The entity of TBtrpickdetail. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TBtrpickdetail tBtrpickdetail, ReferrerLoaderHandler<LoaderOfTBtrpickdetail> loaderLambda) {
        xassLRArg(tBtrpickdetail, loaderLambda);
        loaderLambda.handle(new LoaderOfTBtrpickdetail().ready(xnewLRAryLs(tBtrpickdetail), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key pickingInstDetailId.
     * @param tBtrpickdetailList The list of tBtrpickdetail. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPickingInstDetailIdList(List<TBtrpickdetail> tBtrpickdetailList)
    { return helpExtractListInternally(tBtrpickdetailList, "pickingInstDetailId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tBtrpickdetail.setFoo...(value);
     * tBtrpickdetail.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.set...;</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">insert</span>(tBtrpickdetail);
     * ... = tBtrpickdetail.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tBtrpickdetail The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TBtrpickdetail tBtrpickdetail) {
        doInsert(tBtrpickdetail, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tBtrpickdetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tBtrpickdetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">update</span>(tBtrpickdetail);
     * </pre>
     * @param tBtrpickdetail The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TBtrpickdetail tBtrpickdetail) {
        doUpdate(tBtrpickdetail, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tBtrpickdetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tBtrpickdetail);
     * </pre>
     * @param tBtrpickdetail The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TBtrpickdetail tBtrpickdetail) {
        doUpdateNonstrict(tBtrpickdetail, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tBtrpickdetail The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TBtrpickdetail tBtrpickdetail) {
        doInsertOrUpdate(tBtrpickdetail, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tBtrpickdetail The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TBtrpickdetail tBtrpickdetail) {
        doInsertOrUpdateNonstrict(tBtrpickdetail, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tBtrpickdetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">delete</span>(tBtrpickdetail);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tBtrpickdetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TBtrpickdetail tBtrpickdetail) {
        doDelete(tBtrpickdetail, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tBtrpickdetail);
     * </pre>
     * @param tBtrpickdetail The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TBtrpickdetail tBtrpickdetail) {
        doDeleteNonstrict(tBtrpickdetail, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tBtrpickdetail);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tBtrpickdetail The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TBtrpickdetail tBtrpickdetail) {
        doDeleteNonstrictIgnoreDeleted(tBtrpickdetail, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TBtrpickdetail et, final DeleteOption<TBtrpickdetailCB> op) {
        assertObjectNotNull("tBtrpickdetail", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     *     tBtrpickdetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tBtrpickdetail.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tBtrpickdetailList.add(tBtrpickdetail);
     * }
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">batchInsert</span>(tBtrpickdetailList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TBtrpickdetail> tBtrpickdetailList) {
        return doBatchInsert(tBtrpickdetailList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     *     tBtrpickdetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tBtrpickdetail.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tBtrpickdetail.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tBtrpickdetail.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tBtrpickdetailList.add(tBtrpickdetail);
     * }
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tBtrpickdetailList);
     * </pre>
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TBtrpickdetail> tBtrpickdetailList) {
        return doBatchUpdate(tBtrpickdetailList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tBtrpickdetailBhv.<span style="color: #CC4747">batchUpdate</span>(tBtrpickdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tBtrpickdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TBtrpickdetail> tBtrpickdetailList, SpecifyQuery<TBtrpickdetailCB> colCBLambda) {
        return doBatchUpdate(tBtrpickdetailList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     *     tBtrpickdetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tBtrpickdetail.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tBtrpickdetail.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tBtrpickdetail.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tBtrpickdetailList.add(tBtrpickdetail);
     * }
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tBtrpickdetailList);
     * </pre>
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TBtrpickdetail> tBtrpickdetailList) {
        return doBatchUpdateNonstrict(tBtrpickdetailList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tBtrpickdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tBtrpickdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TBtrpickdetail> tBtrpickdetailList, SpecifyQuery<TBtrpickdetailCB> colCBLambda) {
        return doBatchUpdateNonstrict(tBtrpickdetailList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TBtrpickdetail> tBtrpickdetailList) {
        return doBatchDelete(tBtrpickdetailList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TBtrpickdetail> tBtrpickdetailList) {
        return doBatchDeleteNonstrict(tBtrpickdetailList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TBtrpickdetail, TBtrpickdetailCB&gt;() {
     *     public ConditionBean setup(TBtrpickdetail entity, TBtrpickdetailCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TBtrpickdetail, TBtrpickdetailCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setPK...(value);</span>
     * tBtrpickdetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setVersionNo(value);</span>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tBtrpickdetail, cb);
     * </pre>
     * @param tBtrpickdetail The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TBtrpickdetail tBtrpickdetail, TBtrpickdetailCB cb) {
        return doQueryUpdate(tBtrpickdetail, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TBtrpickdetailCB cb = new TBtrpickdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">queryDelete</span>(tBtrpickdetail, cb);
     * </pre>
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TBtrpickdetailCB cb) {
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
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tBtrpickdetail.setFoo...(value);
     * tBtrpickdetail.setBar...(value);
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tBtrpickdetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tBtrpickdetail.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tBtrpickdetail The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, InsertOption<TBtrpickdetailCB>> opLambda) {
        doInsert(tBtrpickdetail, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tBtrpickdetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tBtrpickdetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tBtrpickdetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tBtrpickdetail The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> opLambda) {
        doUpdate(tBtrpickdetail, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * tBtrpickdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tBtrpickdetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tBtrpickdetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tBtrpickdetail The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> opLambda) {
        doUpdateNonstrict(tBtrpickdetail, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tBtrpickdetail The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, InsertOption<TBtrpickdetailCB>> insertOpLambda, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> updateOpLambda) {
        doInsertOrUpdate(tBtrpickdetail, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tBtrpickdetail The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, InsertOption<TBtrpickdetailCB>> insertOpLambda, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tBtrpickdetail, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tBtrpickdetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, DeleteOption<TBtrpickdetailCB>> opLambda) {
        doDelete(tBtrpickdetail, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tBtrpickdetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TBtrpickdetail tBtrpickdetail, WritableOptionCall<TBtrpickdetailCB, DeleteOption<TBtrpickdetailCB>> opLambda) {
        doDeleteNonstrict(tBtrpickdetail, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TBtrpickdetail> tBtrpickdetailList, WritableOptionCall<TBtrpickdetailCB, InsertOption<TBtrpickdetailCB>> opLambda) {
        return doBatchInsert(tBtrpickdetailList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TBtrpickdetail> tBtrpickdetailList, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> opLambda) {
        return doBatchUpdate(tBtrpickdetailList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TBtrpickdetail> tBtrpickdetailList, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> opLambda) {
        return doBatchUpdateNonstrict(tBtrpickdetailList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TBtrpickdetail> tBtrpickdetailList, WritableOptionCall<TBtrpickdetailCB, DeleteOption<TBtrpickdetailCB>> opLambda) {
        return doBatchDelete(tBtrpickdetailList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tBtrpickdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TBtrpickdetail> tBtrpickdetailList, WritableOptionCall<TBtrpickdetailCB, DeleteOption<TBtrpickdetailCB>> opLambda) {
        return doBatchDeleteNonstrict(tBtrpickdetailList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TBtrpickdetail, TBtrpickdetailCB> manyArgLambda, WritableOptionCall<TBtrpickdetailCB, InsertOption<TBtrpickdetailCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TBtrpickdetail tBtrpickdetail = <span style="color: #70226C">new</span> TBtrpickdetail();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setPK...(value);</span>
     * tBtrpickdetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tBtrpickdetail.setVersionNo(value);</span>
     * TBtrpickdetailCB cb = <span style="color: #70226C">new</span> TBtrpickdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tBtrpickdetailBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tBtrpickdetail, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tBtrpickdetail The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TBtrpickdetail tBtrpickdetail, TBtrpickdetailCB cb, WritableOptionCall<TBtrpickdetailCB, UpdateOption<TBtrpickdetailCB>> opLambda) {
        return doQueryUpdate(tBtrpickdetail, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TBtrpickdetail. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TBtrpickdetailCB cb, WritableOptionCall<TBtrpickdetailCB, DeleteOption<TBtrpickdetailCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tBtrpickdetailBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tBtrpickdetailBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tBtrpickdetailBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tBtrpickdetailBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tBtrpickdetailBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tBtrpickdetailBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tBtrpickdetailBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tBtrpickdetailBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tBtrpickdetailBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tBtrpickdetailBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tBtrpickdetailBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tBtrpickdetailBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tBtrpickdetailBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tBtrpickdetailBhv.outideSql().removeBlockComment().selectList()
     * tBtrpickdetailBhv.outideSql().removeLineComment().selectList()
     * tBtrpickdetailBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TBtrpickdetailBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TBtrpickdetailBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TBtrpickdetail> typeOfSelectedEntity() { return TBtrpickdetail.class; }
    protected Class<TBtrpickdetail> typeOfHandlingEntity() { return TBtrpickdetail.class; }
    protected Class<TBtrpickdetailCB> typeOfHandlingConditionBean() { return TBtrpickdetailCB.class; }
}
