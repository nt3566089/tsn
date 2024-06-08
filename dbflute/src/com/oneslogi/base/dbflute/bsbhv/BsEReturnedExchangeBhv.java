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
 * The behavior of E_RETURNED_EXCHANGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     RETURNED_EXCHANGE_ID
 *
 * [column]
 *     RETURNED_EXCHANGE_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, RCVTYPE, SYHN_KBN, RECORD_TYPE, SUPPLIERRCVNO, SEQNO, WORK_TYPE, OTHERREFNO1, RMANO, OTHERREFNO3, SUPPLIERCD, FROMADDRESS2, FROMADDRESS1, IFITEMCD, RECEIVEDQTY1, PRICE_WHOLESALE, LOT2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_EXCHANGE_ID
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
public abstract class BsEReturnedExchangeBhv extends AbstractBehaviorWritable<EReturnedExchange, EReturnedExchangeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public EReturnedExchangeDbm asDBMeta() { return EReturnedExchangeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "E_RETURNED_EXCHANGE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EReturnedExchangeDbm getMyDBMeta() { return EReturnedExchangeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public EReturnedExchangeCB newConditionBean() { return new EReturnedExchangeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public EReturnedExchange newMyEntity() { return new EReturnedExchange(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EReturnedExchangeCB newMyConditionBean() { return new EReturnedExchangeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(EReturnedExchangeCB cb) {
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
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().setFoo...(value);
     * EReturnedExchange eReturnedExchange = <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (eReturnedExchange != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = eReturnedExchange.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EReturnedExchange selectEntity(EReturnedExchangeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected EReturnedExchange facadeSelectEntity(EReturnedExchangeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends EReturnedExchange> OptionalEntity<ENTITY> doSelectOptionalEntity(EReturnedExchangeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().set...;
     * EReturnedExchange eReturnedExchange = <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = eReturnedExchange.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EReturnedExchange selectEntityWithDeletedCheck(EReturnedExchangeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param returnedExchangeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EReturnedExchange selectByPKValue(Long returnedExchangeId) {
        return facadeSelectByPKValue(returnedExchangeId);
    }

    protected EReturnedExchange facadeSelectByPKValue(Long returnedExchangeId) {
        return doSelectByPK(returnedExchangeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EReturnedExchange> ENTITY doSelectByPK(Long returnedExchangeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(returnedExchangeId), tp);
    }

    protected <ENTITY extends EReturnedExchange> OptionalEntity<ENTITY> doSelectOptionalByPK(Long returnedExchangeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(returnedExchangeId, tp), returnedExchangeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param returnedExchangeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EReturnedExchange selectByPKValueWithDeletedCheck(Long returnedExchangeId) {
        return doSelectByPKWithDeletedCheck(returnedExchangeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EReturnedExchange> ENTITY doSelectByPKWithDeletedCheck(Long returnedExchangeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(returnedExchangeId), tp);
    }

    protected EReturnedExchangeCB xprepareCBAsPK(Long returnedExchangeId) {
        assertObjectNotNull("returnedExchangeId", returnedExchangeId);
        return newConditionBean().acceptPK(returnedExchangeId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;EReturnedExchange&gt; <span style="color: #553000">eReturnedExchangeList</span> = <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (EReturnedExchange eReturnedExchange : <span style="color: #553000">eReturnedExchangeList</span>) {
     *     ... = eReturnedExchange.get...;
     * }
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<EReturnedExchange> selectList(EReturnedExchangeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;EReturnedExchange&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (EReturnedExchange eReturnedExchange : <span style="color: #553000">page</span>) {
     *     ... = eReturnedExchange.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<EReturnedExchange> selectPage(EReturnedExchangeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().set...
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @param entityRowHandler The handler of entity row of EReturnedExchange. (NotNull)
     */
    public void selectCursor(EReturnedExchangeCB cb, EntityRowHandler<EReturnedExchange> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<EReturnedExchangeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<EReturnedExchangeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param eReturnedExchangeList The entity list of EReturnedExchange. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<EReturnedExchange> eReturnedExchangeList, ReferrerLoaderHandler<LoaderOfEReturnedExchange> loaderLambda) {
        xassLRArg(eReturnedExchangeList, loaderLambda);
        loaderLambda.handle(new LoaderOfEReturnedExchange().ready(eReturnedExchangeList, _behaviorSelector));
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
     * @param eReturnedExchange The entity of EReturnedExchange. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(EReturnedExchange eReturnedExchange, ReferrerLoaderHandler<LoaderOfEReturnedExchange> loaderLambda) {
        xassLRArg(eReturnedExchange, loaderLambda);
        loaderLambda.handle(new LoaderOfEReturnedExchange().ready(xnewLRAryLs(eReturnedExchange), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key returnedExchangeId.
     * @param eReturnedExchangeList The list of eReturnedExchange. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReturnedExchangeIdList(List<EReturnedExchange> eReturnedExchangeList)
    { return helpExtractListInternally(eReturnedExchangeList, "returnedExchangeId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * eReturnedExchange.setFoo...(value);
     * eReturnedExchange.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.set...;</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">insert</span>(eReturnedExchange);
     * ... = eReturnedExchange.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param eReturnedExchange The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(EReturnedExchange eReturnedExchange) {
        doInsert(eReturnedExchange, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eReturnedExchange.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eReturnedExchange.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">update</span>(eReturnedExchange);
     * </pre>
     * @param eReturnedExchange The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(EReturnedExchange eReturnedExchange) {
        doUpdate(eReturnedExchange, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eReturnedExchange.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setVersionNo(value);</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(eReturnedExchange);
     * </pre>
     * @param eReturnedExchange The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(EReturnedExchange eReturnedExchange) {
        doUpdateNonstrict(eReturnedExchange, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param eReturnedExchange The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(EReturnedExchange eReturnedExchange) {
        doInsertOrUpdate(eReturnedExchange, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param eReturnedExchange The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(EReturnedExchange eReturnedExchange) {
        doInsertOrUpdateNonstrict(eReturnedExchange, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eReturnedExchange.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">delete</span>(eReturnedExchange);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param eReturnedExchange The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(EReturnedExchange eReturnedExchange) {
        doDelete(eReturnedExchange, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setVersionNo(value);</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(eReturnedExchange);
     * </pre>
     * @param eReturnedExchange The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(EReturnedExchange eReturnedExchange) {
        doDeleteNonstrict(eReturnedExchange, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setVersionNo(value);</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(eReturnedExchange);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param eReturnedExchange The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(EReturnedExchange eReturnedExchange) {
        doDeleteNonstrictIgnoreDeleted(eReturnedExchange, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(EReturnedExchange et, final DeleteOption<EReturnedExchangeCB> op) {
        assertObjectNotNull("eReturnedExchange", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     *     eReturnedExchange.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eReturnedExchange.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     eReturnedExchangeList.add(eReturnedExchange);
     * }
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">batchInsert</span>(eReturnedExchangeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<EReturnedExchange> eReturnedExchangeList) {
        return doBatchInsert(eReturnedExchangeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     *     eReturnedExchange.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eReturnedExchange.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         eReturnedExchange.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//eReturnedExchange.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     eReturnedExchangeList.add(eReturnedExchange);
     * }
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eReturnedExchangeList);
     * </pre>
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<EReturnedExchange> eReturnedExchangeList) {
        return doBatchUpdate(eReturnedExchangeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * eReturnedExchangeBhv.<span style="color: #CC4747">batchUpdate</span>(eReturnedExchangeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eReturnedExchangeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<EReturnedExchange> eReturnedExchangeList, SpecifyQuery<EReturnedExchangeCB> colCBLambda) {
        return doBatchUpdate(eReturnedExchangeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     *     eReturnedExchange.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eReturnedExchange.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         eReturnedExchange.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//eReturnedExchange.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     eReturnedExchangeList.add(eReturnedExchange);
     * }
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eReturnedExchangeList);
     * </pre>
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<EReturnedExchange> eReturnedExchangeList) {
        return doBatchUpdateNonstrict(eReturnedExchangeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(eReturnedExchangeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(eReturnedExchangeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<EReturnedExchange> eReturnedExchangeList, SpecifyQuery<EReturnedExchangeCB> colCBLambda) {
        return doBatchUpdateNonstrict(eReturnedExchangeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<EReturnedExchange> eReturnedExchangeList) {
        return doBatchDelete(eReturnedExchangeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<EReturnedExchange> eReturnedExchangeList) {
        return doBatchDeleteNonstrict(eReturnedExchangeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;EReturnedExchange, EReturnedExchangeCB&gt;() {
     *     public ConditionBean setup(EReturnedExchange entity, EReturnedExchangeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<EReturnedExchange, EReturnedExchangeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setPK...(value);</span>
     * eReturnedExchange.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setVersionNo(value);</span>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(eReturnedExchange, cb);
     * </pre>
     * @param eReturnedExchange The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(EReturnedExchange eReturnedExchange, EReturnedExchangeCB cb) {
        return doQueryUpdate(eReturnedExchange, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * EReturnedExchangeCB cb = new EReturnedExchangeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">queryDelete</span>(eReturnedExchange, cb);
     * </pre>
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EReturnedExchangeCB cb) {
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
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * eReturnedExchange.setFoo...(value);
     * eReturnedExchange.setBar...(value);
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(eReturnedExchange, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = eReturnedExchange.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param eReturnedExchange The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, InsertOption<EReturnedExchangeCB>> opLambda) {
        doInsert(eReturnedExchange, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eReturnedExchange.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eReturnedExchange.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(eReturnedExchange, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param eReturnedExchange The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> opLambda) {
        doUpdate(eReturnedExchange, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * eReturnedExchange.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eReturnedExchange.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setVersionNo(value);</span>
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(eReturnedExchange, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param eReturnedExchange The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> opLambda) {
        doUpdateNonstrict(eReturnedExchange, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param eReturnedExchange The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, InsertOption<EReturnedExchangeCB>> insertOpLambda, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> updateOpLambda) {
        doInsertOrUpdate(eReturnedExchange, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param eReturnedExchange The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, InsertOption<EReturnedExchangeCB>> insertOpLambda, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(eReturnedExchange, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param eReturnedExchange The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, DeleteOption<EReturnedExchangeCB>> opLambda) {
        doDelete(eReturnedExchange, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param eReturnedExchange The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(EReturnedExchange eReturnedExchange, WritableOptionCall<EReturnedExchangeCB, DeleteOption<EReturnedExchangeCB>> opLambda) {
        doDeleteNonstrict(eReturnedExchange, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<EReturnedExchange> eReturnedExchangeList, WritableOptionCall<EReturnedExchangeCB, InsertOption<EReturnedExchangeCB>> opLambda) {
        return doBatchInsert(eReturnedExchangeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<EReturnedExchange> eReturnedExchangeList, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> opLambda) {
        return doBatchUpdate(eReturnedExchangeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<EReturnedExchange> eReturnedExchangeList, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> opLambda) {
        return doBatchUpdateNonstrict(eReturnedExchangeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<EReturnedExchange> eReturnedExchangeList, WritableOptionCall<EReturnedExchangeCB, DeleteOption<EReturnedExchangeCB>> opLambda) {
        return doBatchDelete(eReturnedExchangeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param eReturnedExchangeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<EReturnedExchange> eReturnedExchangeList, WritableOptionCall<EReturnedExchangeCB, DeleteOption<EReturnedExchangeCB>> opLambda) {
        return doBatchDeleteNonstrict(eReturnedExchangeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<EReturnedExchange, EReturnedExchangeCB> manyArgLambda, WritableOptionCall<EReturnedExchangeCB, InsertOption<EReturnedExchangeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * EReturnedExchange eReturnedExchange = <span style="color: #70226C">new</span> EReturnedExchange();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setPK...(value);</span>
     * eReturnedExchange.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eReturnedExchange.setVersionNo(value);</span>
     * EReturnedExchangeCB cb = <span style="color: #70226C">new</span> EReturnedExchangeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eReturnedExchangeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(eReturnedExchange, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param eReturnedExchange The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(EReturnedExchange eReturnedExchange, EReturnedExchangeCB cb, WritableOptionCall<EReturnedExchangeCB, UpdateOption<EReturnedExchangeCB>> opLambda) {
        return doQueryUpdate(eReturnedExchange, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of EReturnedExchange. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EReturnedExchangeCB cb, WritableOptionCall<EReturnedExchangeCB, DeleteOption<EReturnedExchangeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * eReturnedExchangeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * eReturnedExchangeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * eReturnedExchangeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * eReturnedExchangeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * eReturnedExchangeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * eReturnedExchangeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * eReturnedExchangeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * eReturnedExchangeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * eReturnedExchangeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * eReturnedExchangeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * eReturnedExchangeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * eReturnedExchangeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * eReturnedExchangeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * eReturnedExchangeBhv.outideSql().removeBlockComment().selectList()
     * eReturnedExchangeBhv.outideSql().removeLineComment().selectList()
     * eReturnedExchangeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<EReturnedExchangeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<EReturnedExchangeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends EReturnedExchange> typeOfSelectedEntity() { return EReturnedExchange.class; }
    protected Class<EReturnedExchange> typeOfHandlingEntity() { return EReturnedExchange.class; }
    protected Class<EReturnedExchangeCB> typeOfHandlingConditionBean() { return EReturnedExchangeCB.class; }
}
