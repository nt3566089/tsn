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
 * The behavior of T_TRSORCVDIRECT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SoRcvDirectKey, InstructionsDate, OwnerDirectNo, SalesType, SalesTypeCd, ShipToCode, OriginalPONo, PRODUCT_ID, ExpectQty, PlanPrice, PlanPriceTotal, PlanName, PlanPost, PlanAddress1, PlanAddress2, PlanItemName, WareHousePlant, WareHousePlantName, WareHouseName, OrderDate, DeliveryDate, PurchaseNumber, OrderNumber, ItemLineNo, SkuCode, CardBoard, CarTon, TotalExpectQty, TotalCardBoardQty, TotalCarTonQty, Note, Reserve2, Reserve3, Reserve, CenterId, ClientId, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
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
public abstract class BsTTrsorcvdirectBhv extends AbstractBehaviorWritable<TTrsorcvdirect, TTrsorcvdirectCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrsorcvdirectDbm asDBMeta() { return TTrsorcvdirectDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRSORCVDIRECT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrsorcvdirectDbm getMyDBMeta() { return TTrsorcvdirectDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrsorcvdirectCB newConditionBean() { return new TTrsorcvdirectCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrsorcvdirect newMyEntity() { return new TTrsorcvdirect(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrsorcvdirectCB newMyConditionBean() { return new TTrsorcvdirectCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrsorcvdirectCB cb) {
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
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().setFoo...(value);
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrsorcvdirect != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrsorcvdirect.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsorcvdirect selectEntity(TTrsorcvdirectCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrsorcvdirect facadeSelectEntity(TTrsorcvdirectCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrsorcvdirect> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrsorcvdirectCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().set...;
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrsorcvdirect.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsorcvdirect selectEntityWithDeletedCheck(TTrsorcvdirectCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param sojtlineid : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsorcvdirect selectByPKValue(Long sojtlineid) {
        return facadeSelectByPKValue(sojtlineid);
    }

    protected TTrsorcvdirect facadeSelectByPKValue(Long sojtlineid) {
        return doSelectByPK(sojtlineid, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrsorcvdirect> ENTITY doSelectByPK(Long sojtlineid, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(sojtlineid), tp);
    }

    protected <ENTITY extends TTrsorcvdirect> OptionalEntity<ENTITY> doSelectOptionalByPK(Long sojtlineid, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(sojtlineid, tp), sojtlineid);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sojtlineid : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsorcvdirect selectByPKValueWithDeletedCheck(Long sojtlineid) {
        return doSelectByPKWithDeletedCheck(sojtlineid, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrsorcvdirect> ENTITY doSelectByPKWithDeletedCheck(Long sojtlineid, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(sojtlineid), tp);
    }

    protected TTrsorcvdirectCB xprepareCBAsPK(Long sojtlineid) {
        assertObjectNotNull("sojtlineid", sojtlineid);
        return newConditionBean().acceptPK(sojtlineid);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrsorcvdirect&gt; <span style="color: #553000">tTrsorcvdirectList</span> = <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrsorcvdirect tTrsorcvdirect : <span style="color: #553000">tTrsorcvdirectList</span>) {
     *     ... = tTrsorcvdirect.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrsorcvdirect> selectList(TTrsorcvdirectCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrsorcvdirect&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrsorcvdirect tTrsorcvdirect : <span style="color: #553000">page</span>) {
     *     ... = tTrsorcvdirect.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrsorcvdirect> selectPage(TTrsorcvdirectCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrsorcvdirect. (NotNull)
     */
    public void selectCursor(TTrsorcvdirectCB cb, EntityRowHandler<TTrsorcvdirect> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrsorcvdirectCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrsorcvdirectCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrsorcvdirectList The entity list of TTrsorcvdirect. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrsorcvdirect> tTrsorcvdirectList, ReferrerLoaderHandler<LoaderOfTTrsorcvdirect> loaderLambda) {
        xassLRArg(tTrsorcvdirectList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrsorcvdirect().ready(tTrsorcvdirectList, _behaviorSelector));
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
     * @param tTrsorcvdirect The entity of TTrsorcvdirect. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrsorcvdirect tTrsorcvdirect, ReferrerLoaderHandler<LoaderOfTTrsorcvdirect> loaderLambda) {
        xassLRArg(tTrsorcvdirect, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrsorcvdirect().ready(xnewLRAryLs(tTrsorcvdirect), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sojtlineid.
     * @param tTrsorcvdirectList The list of tTrsorcvdirect. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSojtlineidList(List<TTrsorcvdirect> tTrsorcvdirectList)
    { return helpExtractListInternally(tTrsorcvdirectList, "sojtlineid"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrsorcvdirect.setFoo...(value);
     * tTrsorcvdirect.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.set...;</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">insert</span>(tTrsorcvdirect);
     * ... = tTrsorcvdirect.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrsorcvdirect The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrsorcvdirect tTrsorcvdirect) {
        doInsert(tTrsorcvdirect, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsorcvdirect.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrsorcvdirect.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">update</span>(tTrsorcvdirect);
     * </pre>
     * @param tTrsorcvdirect The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrsorcvdirect tTrsorcvdirect) {
        doUpdate(tTrsorcvdirect, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsorcvdirect.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrsorcvdirect);
     * </pre>
     * @param tTrsorcvdirect The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrsorcvdirect tTrsorcvdirect) {
        doUpdateNonstrict(tTrsorcvdirect, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrsorcvdirect The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrsorcvdirect tTrsorcvdirect) {
        doInsertOrUpdate(tTrsorcvdirect, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrsorcvdirect The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrsorcvdirect tTrsorcvdirect) {
        doInsertOrUpdateNonstrict(tTrsorcvdirect, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrsorcvdirect.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">delete</span>(tTrsorcvdirect);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrsorcvdirect The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrsorcvdirect tTrsorcvdirect) {
        doDelete(tTrsorcvdirect, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrsorcvdirect);
     * </pre>
     * @param tTrsorcvdirect The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrsorcvdirect tTrsorcvdirect) {
        doDeleteNonstrict(tTrsorcvdirect, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrsorcvdirect);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrsorcvdirect The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrsorcvdirect tTrsorcvdirect) {
        doDeleteNonstrictIgnoreDeleted(tTrsorcvdirect, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrsorcvdirect et, final DeleteOption<TTrsorcvdirectCB> op) {
        assertObjectNotNull("tTrsorcvdirect", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     *     tTrsorcvdirect.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrsorcvdirect.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrsorcvdirectList.add(tTrsorcvdirect);
     * }
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrsorcvdirectList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrsorcvdirect> tTrsorcvdirectList) {
        return doBatchInsert(tTrsorcvdirectList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     *     tTrsorcvdirect.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrsorcvdirect.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrsorcvdirect.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrsorcvdirect.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrsorcvdirectList.add(tTrsorcvdirect);
     * }
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrsorcvdirectList);
     * </pre>
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrsorcvdirect> tTrsorcvdirectList) {
        return doBatchUpdate(tTrsorcvdirectList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrsorcvdirectBhv.<span style="color: #CC4747">batchUpdate</span>(tTrsorcvdirectList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrsorcvdirectList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrsorcvdirect> tTrsorcvdirectList, SpecifyQuery<TTrsorcvdirectCB> colCBLambda) {
        return doBatchUpdate(tTrsorcvdirectList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     *     tTrsorcvdirect.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrsorcvdirect.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrsorcvdirect.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrsorcvdirect.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrsorcvdirectList.add(tTrsorcvdirect);
     * }
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrsorcvdirectList);
     * </pre>
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrsorcvdirect> tTrsorcvdirectList) {
        return doBatchUpdateNonstrict(tTrsorcvdirectList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrsorcvdirectList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrsorcvdirectList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrsorcvdirect> tTrsorcvdirectList, SpecifyQuery<TTrsorcvdirectCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrsorcvdirectList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrsorcvdirect> tTrsorcvdirectList) {
        return doBatchDelete(tTrsorcvdirectList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrsorcvdirect> tTrsorcvdirectList) {
        return doBatchDeleteNonstrict(tTrsorcvdirectList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrsorcvdirect, TTrsorcvdirectCB&gt;() {
     *     public ConditionBean setup(TTrsorcvdirect entity, TTrsorcvdirectCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrsorcvdirect, TTrsorcvdirectCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setPK...(value);</span>
     * tTrsorcvdirect.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setVersionNo(value);</span>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrsorcvdirect, cb);
     * </pre>
     * @param tTrsorcvdirect The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrsorcvdirect tTrsorcvdirect, TTrsorcvdirectCB cb) {
        return doQueryUpdate(tTrsorcvdirect, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrsorcvdirectCB cb = new TTrsorcvdirectCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrsorcvdirect, cb);
     * </pre>
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrsorcvdirectCB cb) {
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
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrsorcvdirect.setFoo...(value);
     * tTrsorcvdirect.setBar...(value);
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrsorcvdirect, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrsorcvdirect.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrsorcvdirect The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, InsertOption<TTrsorcvdirectCB>> opLambda) {
        doInsert(tTrsorcvdirect, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsorcvdirect.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrsorcvdirect.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrsorcvdirect, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrsorcvdirect The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> opLambda) {
        doUpdate(tTrsorcvdirect, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * tTrsorcvdirect.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsorcvdirect.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrsorcvdirect, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrsorcvdirect The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> opLambda) {
        doUpdateNonstrict(tTrsorcvdirect, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrsorcvdirect The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, InsertOption<TTrsorcvdirectCB>> insertOpLambda, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> updateOpLambda) {
        doInsertOrUpdate(tTrsorcvdirect, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrsorcvdirect The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, InsertOption<TTrsorcvdirectCB>> insertOpLambda, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrsorcvdirect, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrsorcvdirect The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, DeleteOption<TTrsorcvdirectCB>> opLambda) {
        doDelete(tTrsorcvdirect, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrsorcvdirect The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrsorcvdirect tTrsorcvdirect, WritableOptionCall<TTrsorcvdirectCB, DeleteOption<TTrsorcvdirectCB>> opLambda) {
        doDeleteNonstrict(tTrsorcvdirect, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrsorcvdirect> tTrsorcvdirectList, WritableOptionCall<TTrsorcvdirectCB, InsertOption<TTrsorcvdirectCB>> opLambda) {
        return doBatchInsert(tTrsorcvdirectList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrsorcvdirect> tTrsorcvdirectList, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> opLambda) {
        return doBatchUpdate(tTrsorcvdirectList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrsorcvdirect> tTrsorcvdirectList, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrsorcvdirectList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrsorcvdirect> tTrsorcvdirectList, WritableOptionCall<TTrsorcvdirectCB, DeleteOption<TTrsorcvdirectCB>> opLambda) {
        return doBatchDelete(tTrsorcvdirectList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrsorcvdirectList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrsorcvdirect> tTrsorcvdirectList, WritableOptionCall<TTrsorcvdirectCB, DeleteOption<TTrsorcvdirectCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrsorcvdirectList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrsorcvdirect, TTrsorcvdirectCB> manyArgLambda, WritableOptionCall<TTrsorcvdirectCB, InsertOption<TTrsorcvdirectCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrsorcvdirect tTrsorcvdirect = <span style="color: #70226C">new</span> TTrsorcvdirect();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setPK...(value);</span>
     * tTrsorcvdirect.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsorcvdirect.setVersionNo(value);</span>
     * TTrsorcvdirectCB cb = <span style="color: #70226C">new</span> TTrsorcvdirectCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrsorcvdirectBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrsorcvdirect, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrsorcvdirect The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrsorcvdirect tTrsorcvdirect, TTrsorcvdirectCB cb, WritableOptionCall<TTrsorcvdirectCB, UpdateOption<TTrsorcvdirectCB>> opLambda) {
        return doQueryUpdate(tTrsorcvdirect, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrsorcvdirect. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrsorcvdirectCB cb, WritableOptionCall<TTrsorcvdirectCB, DeleteOption<TTrsorcvdirectCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrsorcvdirectBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrsorcvdirectBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrsorcvdirectBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrsorcvdirectBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrsorcvdirectBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrsorcvdirectBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrsorcvdirectBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrsorcvdirectBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrsorcvdirectBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrsorcvdirectBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrsorcvdirectBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrsorcvdirectBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrsorcvdirectBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrsorcvdirectBhv.outideSql().removeBlockComment().selectList()
     * tTrsorcvdirectBhv.outideSql().removeLineComment().selectList()
     * tTrsorcvdirectBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrsorcvdirectBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrsorcvdirectBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrsorcvdirect> typeOfSelectedEntity() { return TTrsorcvdirect.class; }
    protected Class<TTrsorcvdirect> typeOfHandlingEntity() { return TTrsorcvdirect.class; }
    protected Class<TTrsorcvdirectCB> typeOfHandlingConditionBean() { return TTrsorcvdirectCB.class; }
}
