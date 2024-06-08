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
 * The behavior of T_TRFLEXIBILITYINSTRUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     FLEXINSTRUCTNO, FLEXINSLINENO
 *
 * [column]
 *     FLEXINSTRUCTNO, FLEXINSLINENO, FLEXINSNO, SCHDATE, SUPPLIERCD, RCVDATE, SHIPCD, PRODUCT_CD, MANUFACTUREDATE, DESIGNCD, QTY, FLEXUPDUSER, FLEXINSTRUCTSTS, FLEXIBITYNO, TRANSPORTCD, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsTTrflexibilityinstructBhv extends AbstractBehaviorWritable<TTrflexibilityinstruct, TTrflexibilityinstructCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrflexibilityinstructDbm asDBMeta() { return TTrflexibilityinstructDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRFLEXIBILITYINSTRUCT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrflexibilityinstructDbm getMyDBMeta() { return TTrflexibilityinstructDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrflexibilityinstructCB newConditionBean() { return new TTrflexibilityinstructCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrflexibilityinstruct newMyEntity() { return new TTrflexibilityinstruct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrflexibilityinstructCB newMyConditionBean() { return new TTrflexibilityinstructCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrflexibilityinstructCB cb) {
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
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().setFoo...(value);
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrflexibilityinstruct != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrflexibilityinstruct.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityinstruct selectEntity(TTrflexibilityinstructCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrflexibilityinstruct facadeSelectEntity(TTrflexibilityinstructCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrflexibilityinstruct> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrflexibilityinstructCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().set...;
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrflexibilityinstruct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityinstruct selectEntityWithDeletedCheck(TTrflexibilityinstructCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param flexinstructno : PK, NotNull, decimal(16, 6). (NotNull)
     * @param flexinslineno : PK, NotNull, bigint(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityinstruct selectByPKValue(java.math.BigDecimal flexinstructno, Long flexinslineno) {
        return facadeSelectByPKValue(flexinstructno, flexinslineno);
    }

    protected TTrflexibilityinstruct facadeSelectByPKValue(java.math.BigDecimal flexinstructno, Long flexinslineno) {
        return doSelectByPK(flexinstructno, flexinslineno, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrflexibilityinstruct> ENTITY doSelectByPK(java.math.BigDecimal flexinstructno, Long flexinslineno, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(flexinstructno, flexinslineno), tp);
    }

    protected <ENTITY extends TTrflexibilityinstruct> OptionalEntity<ENTITY> doSelectOptionalByPK(java.math.BigDecimal flexinstructno, Long flexinslineno, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(flexinstructno, flexinslineno, tp), flexinstructno, flexinslineno);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param flexinstructno : PK, NotNull, decimal(16, 6). (NotNull)
     * @param flexinslineno : PK, NotNull, bigint(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityinstruct selectByPKValueWithDeletedCheck(java.math.BigDecimal flexinstructno, Long flexinslineno) {
        return doSelectByPKWithDeletedCheck(flexinstructno, flexinslineno, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrflexibilityinstruct> ENTITY doSelectByPKWithDeletedCheck(java.math.BigDecimal flexinstructno, Long flexinslineno, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(flexinstructno, flexinslineno), tp);
    }

    protected TTrflexibilityinstructCB xprepareCBAsPK(java.math.BigDecimal flexinstructno, Long flexinslineno) {
        assertObjectNotNull("flexinstructno", flexinstructno);assertObjectNotNull("flexinslineno", flexinslineno);
        return newConditionBean().acceptPK(flexinstructno, flexinslineno);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrflexibilityinstruct&gt; <span style="color: #553000">tTrflexibilityinstructList</span> = <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrflexibilityinstruct tTrflexibilityinstruct : <span style="color: #553000">tTrflexibilityinstructList</span>) {
     *     ... = tTrflexibilityinstruct.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrflexibilityinstruct> selectList(TTrflexibilityinstructCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrflexibilityinstruct&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrflexibilityinstruct tTrflexibilityinstruct : <span style="color: #553000">page</span>) {
     *     ... = tTrflexibilityinstruct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrflexibilityinstruct> selectPage(TTrflexibilityinstructCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrflexibilityinstruct. (NotNull)
     */
    public void selectCursor(TTrflexibilityinstructCB cb, EntityRowHandler<TTrflexibilityinstruct> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrflexibilityinstructCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrflexibilityinstructCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrflexibilityinstructList The entity list of TTrflexibilityinstruct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrflexibilityinstruct> tTrflexibilityinstructList, ReferrerLoaderHandler<LoaderOfTTrflexibilityinstruct> loaderLambda) {
        xassLRArg(tTrflexibilityinstructList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrflexibilityinstruct().ready(tTrflexibilityinstructList, _behaviorSelector));
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
     * @param tTrflexibilityinstruct The entity of TTrflexibilityinstruct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrflexibilityinstruct tTrflexibilityinstruct, ReferrerLoaderHandler<LoaderOfTTrflexibilityinstruct> loaderLambda) {
        xassLRArg(tTrflexibilityinstruct, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrflexibilityinstruct().ready(xnewLRAryLs(tTrflexibilityinstruct), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrflexibilityinstruct.setFoo...(value);
     * tTrflexibilityinstruct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.set...;</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">insert</span>(tTrflexibilityinstruct);
     * ... = tTrflexibilityinstruct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrflexibilityinstruct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doInsert(tTrflexibilityinstruct, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityinstruct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrflexibilityinstruct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">update</span>(tTrflexibilityinstruct);
     * </pre>
     * @param tTrflexibilityinstruct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doUpdate(tTrflexibilityinstruct, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityinstruct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrflexibilityinstruct);
     * </pre>
     * @param tTrflexibilityinstruct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doUpdateNonstrict(tTrflexibilityinstruct, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrflexibilityinstruct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doInsertOrUpdate(tTrflexibilityinstruct, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrflexibilityinstruct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doInsertOrUpdateNonstrict(tTrflexibilityinstruct, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrflexibilityinstruct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">delete</span>(tTrflexibilityinstruct);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrflexibilityinstruct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doDelete(tTrflexibilityinstruct, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrflexibilityinstruct);
     * </pre>
     * @param tTrflexibilityinstruct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doDeleteNonstrict(tTrflexibilityinstruct, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrflexibilityinstruct);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrflexibilityinstruct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrflexibilityinstruct tTrflexibilityinstruct) {
        doDeleteNonstrictIgnoreDeleted(tTrflexibilityinstruct, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrflexibilityinstruct et, final DeleteOption<TTrflexibilityinstructCB> op) {
        assertObjectNotNull("tTrflexibilityinstruct", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     *     tTrflexibilityinstruct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrflexibilityinstruct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrflexibilityinstructList.add(tTrflexibilityinstruct);
     * }
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrflexibilityinstructList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrflexibilityinstruct> tTrflexibilityinstructList) {
        return doBatchInsert(tTrflexibilityinstructList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     *     tTrflexibilityinstruct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrflexibilityinstruct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrflexibilityinstruct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrflexibilityinstruct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrflexibilityinstructList.add(tTrflexibilityinstruct);
     * }
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityinstructList);
     * </pre>
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrflexibilityinstruct> tTrflexibilityinstructList) {
        return doBatchUpdate(tTrflexibilityinstructList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrflexibilityinstructBhv.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityinstructList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityinstructList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrflexibilityinstruct> tTrflexibilityinstructList, SpecifyQuery<TTrflexibilityinstructCB> colCBLambda) {
        return doBatchUpdate(tTrflexibilityinstructList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     *     tTrflexibilityinstruct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrflexibilityinstruct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrflexibilityinstruct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrflexibilityinstruct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrflexibilityinstructList.add(tTrflexibilityinstruct);
     * }
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityinstructList);
     * </pre>
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrflexibilityinstruct> tTrflexibilityinstructList) {
        return doBatchUpdateNonstrict(tTrflexibilityinstructList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrflexibilityinstructList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrflexibilityinstructList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrflexibilityinstruct> tTrflexibilityinstructList, SpecifyQuery<TTrflexibilityinstructCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrflexibilityinstructList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrflexibilityinstruct> tTrflexibilityinstructList) {
        return doBatchDelete(tTrflexibilityinstructList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrflexibilityinstruct> tTrflexibilityinstructList) {
        return doBatchDeleteNonstrict(tTrflexibilityinstructList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrflexibilityinstruct, TTrflexibilityinstructCB&gt;() {
     *     public ConditionBean setup(TTrflexibilityinstruct entity, TTrflexibilityinstructCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrflexibilityinstruct, TTrflexibilityinstructCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setPK...(value);</span>
     * tTrflexibilityinstruct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setVersionNo(value);</span>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrflexibilityinstruct, cb);
     * </pre>
     * @param tTrflexibilityinstruct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrflexibilityinstruct tTrflexibilityinstruct, TTrflexibilityinstructCB cb) {
        return doQueryUpdate(tTrflexibilityinstruct, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrflexibilityinstructCB cb = new TTrflexibilityinstructCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrflexibilityinstruct, cb);
     * </pre>
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrflexibilityinstructCB cb) {
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
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrflexibilityinstruct.setFoo...(value);
     * tTrflexibilityinstruct.setBar...(value);
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrflexibilityinstruct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrflexibilityinstruct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrflexibilityinstruct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, InsertOption<TTrflexibilityinstructCB>> opLambda) {
        doInsert(tTrflexibilityinstruct, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityinstruct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrflexibilityinstruct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrflexibilityinstruct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrflexibilityinstruct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> opLambda) {
        doUpdate(tTrflexibilityinstruct, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * tTrflexibilityinstruct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityinstruct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrflexibilityinstruct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrflexibilityinstruct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> opLambda) {
        doUpdateNonstrict(tTrflexibilityinstruct, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrflexibilityinstruct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, InsertOption<TTrflexibilityinstructCB>> insertOpLambda, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> updateOpLambda) {
        doInsertOrUpdate(tTrflexibilityinstruct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrflexibilityinstruct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, InsertOption<TTrflexibilityinstructCB>> insertOpLambda, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrflexibilityinstruct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrflexibilityinstruct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, DeleteOption<TTrflexibilityinstructCB>> opLambda) {
        doDelete(tTrflexibilityinstruct, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrflexibilityinstruct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrflexibilityinstruct tTrflexibilityinstruct, WritableOptionCall<TTrflexibilityinstructCB, DeleteOption<TTrflexibilityinstructCB>> opLambda) {
        doDeleteNonstrict(tTrflexibilityinstruct, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrflexibilityinstruct> tTrflexibilityinstructList, WritableOptionCall<TTrflexibilityinstructCB, InsertOption<TTrflexibilityinstructCB>> opLambda) {
        return doBatchInsert(tTrflexibilityinstructList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrflexibilityinstruct> tTrflexibilityinstructList, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> opLambda) {
        return doBatchUpdate(tTrflexibilityinstructList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrflexibilityinstruct> tTrflexibilityinstructList, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrflexibilityinstructList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrflexibilityinstruct> tTrflexibilityinstructList, WritableOptionCall<TTrflexibilityinstructCB, DeleteOption<TTrflexibilityinstructCB>> opLambda) {
        return doBatchDelete(tTrflexibilityinstructList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrflexibilityinstructList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrflexibilityinstruct> tTrflexibilityinstructList, WritableOptionCall<TTrflexibilityinstructCB, DeleteOption<TTrflexibilityinstructCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrflexibilityinstructList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrflexibilityinstruct, TTrflexibilityinstructCB> manyArgLambda, WritableOptionCall<TTrflexibilityinstructCB, InsertOption<TTrflexibilityinstructCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrflexibilityinstruct tTrflexibilityinstruct = <span style="color: #70226C">new</span> TTrflexibilityinstruct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setPK...(value);</span>
     * tTrflexibilityinstruct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityinstruct.setVersionNo(value);</span>
     * TTrflexibilityinstructCB cb = <span style="color: #70226C">new</span> TTrflexibilityinstructCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrflexibilityinstructBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrflexibilityinstruct, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrflexibilityinstruct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrflexibilityinstruct tTrflexibilityinstruct, TTrflexibilityinstructCB cb, WritableOptionCall<TTrflexibilityinstructCB, UpdateOption<TTrflexibilityinstructCB>> opLambda) {
        return doQueryUpdate(tTrflexibilityinstruct, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrflexibilityinstruct. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrflexibilityinstructCB cb, WritableOptionCall<TTrflexibilityinstructCB, DeleteOption<TTrflexibilityinstructCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrflexibilityinstructBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrflexibilityinstructBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrflexibilityinstructBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrflexibilityinstructBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrflexibilityinstructBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrflexibilityinstructBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrflexibilityinstructBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrflexibilityinstructBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrflexibilityinstructBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrflexibilityinstructBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrflexibilityinstructBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrflexibilityinstructBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrflexibilityinstructBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrflexibilityinstructBhv.outideSql().removeBlockComment().selectList()
     * tTrflexibilityinstructBhv.outideSql().removeLineComment().selectList()
     * tTrflexibilityinstructBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrflexibilityinstructBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrflexibilityinstructBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrflexibilityinstruct> typeOfSelectedEntity() { return TTrflexibilityinstruct.class; }
    protected Class<TTrflexibilityinstruct> typeOfHandlingEntity() { return TTrflexibilityinstruct.class; }
    protected Class<TTrflexibilityinstructCB> typeOfHandlingConditionBean() { return TTrflexibilityinstructCB.class; }
}
