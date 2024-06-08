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
 * The behavior of T_STORE_RECORD_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_RECORD_OUT_FLG, RECEIVE_RECORD_OUT_USER_ID, RECEIVE_RECORD_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_STORE_RECORD_H, B_CLASS_DTL(ByReceiveRecordOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, tStoreRecordH, bClassDtlByReceiveRecordOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStoreRecordRBhv extends AbstractBehaviorWritable<TStoreRecordR, TStoreRecordRCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TStoreRecordRDbm asDBMeta() { return TStoreRecordRDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_STORE_RECORD_R"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TStoreRecordRDbm getMyDBMeta() { return TStoreRecordRDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TStoreRecordRCB newConditionBean() { return new TStoreRecordRCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TStoreRecordR newMyEntity() { return new TStoreRecordR(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TStoreRecordRCB newMyConditionBean() { return new TStoreRecordRCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TStoreRecordRCB cb) {
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
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().setFoo...(value);
     * TStoreRecordR tStoreRecordR = <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tStoreRecordR != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tStoreRecordR.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordR selectEntity(TStoreRecordRCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TStoreRecordR facadeSelectEntity(TStoreRecordRCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreRecordR> OptionalEntity<ENTITY> doSelectOptionalEntity(TStoreRecordRCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().set...;
     * TStoreRecordR tStoreRecordR = <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tStoreRecordR.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordR selectEntityWithDeletedCheck(TStoreRecordRCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param storeRecordHId : PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordR selectByPKValue(Long storeRecordHId) {
        return facadeSelectByPKValue(storeRecordHId);
    }

    protected TStoreRecordR facadeSelectByPKValue(Long storeRecordHId) {
        return doSelectByPK(storeRecordHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreRecordR> ENTITY doSelectByPK(Long storeRecordHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(storeRecordHId), tp);
    }

    protected <ENTITY extends TStoreRecordR> OptionalEntity<ENTITY> doSelectOptionalByPK(Long storeRecordHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(storeRecordHId, tp), storeRecordHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param storeRecordHId : PK, ID, NotNull, bigint identity(19), FK to T_STORE_RECORD_H. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TStoreRecordR selectByPKValueWithDeletedCheck(Long storeRecordHId) {
        return doSelectByPKWithDeletedCheck(storeRecordHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TStoreRecordR> ENTITY doSelectByPKWithDeletedCheck(Long storeRecordHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(storeRecordHId), tp);
    }

    protected TStoreRecordRCB xprepareCBAsPK(Long storeRecordHId) {
        assertObjectNotNull("storeRecordHId", storeRecordHId);
        return newConditionBean().acceptPK(storeRecordHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TStoreRecordR&gt; <span style="color: #553000">tStoreRecordRList</span> = <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TStoreRecordR tStoreRecordR : <span style="color: #553000">tStoreRecordRList</span>) {
     *     ... = tStoreRecordR.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TStoreRecordR> selectList(TStoreRecordRCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TStoreRecordR&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TStoreRecordR tStoreRecordR : <span style="color: #553000">page</span>) {
     *     ... = tStoreRecordR.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TStoreRecordR> selectPage(TStoreRecordRCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().set...
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @param entityRowHandler The handler of entity row of TStoreRecordR. (NotNull)
     */
    public void selectCursor(TStoreRecordRCB cb, EntityRowHandler<TStoreRecordR> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStoreRecordRCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TStoreRecordRCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tStoreRecordRList The entity list of TStoreRecordR. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TStoreRecordR> tStoreRecordRList, ReferrerLoaderHandler<LoaderOfTStoreRecordR> loaderLambda) {
        xassLRArg(tStoreRecordRList, loaderLambda);
        loaderLambda.handle(new LoaderOfTStoreRecordR().ready(tStoreRecordRList, _behaviorSelector));
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
     * @param tStoreRecordR The entity of TStoreRecordR. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TStoreRecordR tStoreRecordR, ReferrerLoaderHandler<LoaderOfTStoreRecordR> loaderLambda) {
        xassLRArg(tStoreRecordR, loaderLambda);
        loaderLambda.handle(new LoaderOfTStoreRecordR().ready(xnewLRAryLs(tStoreRecordR), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tStoreRecordRList The list of tStoreRecordR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUser(List<TStoreRecordR> tStoreRecordRList)
    { return helpPulloutInternally(tStoreRecordRList, "bUser"); }

    /**
     * Pull out the list of foreign table 'TStoreRecordH'.
     * @param tStoreRecordRList The list of tStoreRecordR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreRecordH> pulloutTStoreRecordH(List<TStoreRecordR> tStoreRecordRList)
    { return helpPulloutInternally(tStoreRecordRList, "tStoreRecordH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tStoreRecordRList The list of tStoreRecordR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByReceiveRecordOutFlg(List<TStoreRecordR> tStoreRecordRList)
    { return helpPulloutInternally(tStoreRecordRList, "bClassDtlByReceiveRecordOutFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key storeRecordHId.
     * @param tStoreRecordRList The list of tStoreRecordR. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStoreRecordHIdList(List<TStoreRecordR> tStoreRecordRList)
    { return helpExtractListInternally(tStoreRecordRList, "storeRecordHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStoreRecordR.setFoo...(value);
     * tStoreRecordR.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.set...;</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">insert</span>(tStoreRecordR);
     * ... = tStoreRecordR.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tStoreRecordR The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TStoreRecordR tStoreRecordR) {
        doInsert(tStoreRecordR, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreRecordR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">update</span>(tStoreRecordR);
     * </pre>
     * @param tStoreRecordR The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TStoreRecordR tStoreRecordR) {
        doUpdate(tStoreRecordR, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tStoreRecordR);
     * </pre>
     * @param tStoreRecordR The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TStoreRecordR tStoreRecordR) {
        doUpdateNonstrict(tStoreRecordR, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStoreRecordR The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TStoreRecordR tStoreRecordR) {
        doInsertOrUpdate(tStoreRecordR, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tStoreRecordR The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TStoreRecordR tStoreRecordR) {
        doInsertOrUpdateNonstrict(tStoreRecordR, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreRecordR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">delete</span>(tStoreRecordR);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tStoreRecordR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TStoreRecordR tStoreRecordR) {
        doDelete(tStoreRecordR, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tStoreRecordR);
     * </pre>
     * @param tStoreRecordR The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TStoreRecordR tStoreRecordR) {
        doDeleteNonstrict(tStoreRecordR, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tStoreRecordR);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tStoreRecordR The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TStoreRecordR tStoreRecordR) {
        doDeleteNonstrictIgnoreDeleted(tStoreRecordR, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TStoreRecordR et, final DeleteOption<TStoreRecordRCB> op) {
        assertObjectNotNull("tStoreRecordR", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     *     tStoreRecordR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreRecordR.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tStoreRecordRList.add(tStoreRecordR);
     * }
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">batchInsert</span>(tStoreRecordRList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TStoreRecordR> tStoreRecordRList) {
        return doBatchInsert(tStoreRecordRList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     *     tStoreRecordR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreRecordR.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStoreRecordR.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStoreRecordR.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStoreRecordRList.add(tStoreRecordR);
     * }
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordRList);
     * </pre>
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStoreRecordR> tStoreRecordRList) {
        return doBatchUpdate(tStoreRecordRList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tStoreRecordRBhv.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TStoreRecordR> tStoreRecordRList, SpecifyQuery<TStoreRecordRCB> colCBLambda) {
        return doBatchUpdate(tStoreRecordRList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     *     tStoreRecordR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tStoreRecordR.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tStoreRecordR.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tStoreRecordR.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tStoreRecordRList.add(tStoreRecordR);
     * }
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tStoreRecordRList);
     * </pre>
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStoreRecordR> tStoreRecordRList) {
        return doBatchUpdateNonstrict(tStoreRecordRList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStoreRecordRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tStoreRecordRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TStoreRecordR> tStoreRecordRList, SpecifyQuery<TStoreRecordRCB> colCBLambda) {
        return doBatchUpdateNonstrict(tStoreRecordRList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TStoreRecordR> tStoreRecordRList) {
        return doBatchDelete(tStoreRecordRList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TStoreRecordR> tStoreRecordRList) {
        return doBatchDeleteNonstrict(tStoreRecordRList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TStoreRecordR, TStoreRecordRCB&gt;() {
     *     public ConditionBean setup(TStoreRecordR entity, TStoreRecordRCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TStoreRecordR, TStoreRecordRCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setPK...(value);</span>
     * tStoreRecordR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setVersionNo(value);</span>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tStoreRecordR, cb);
     * </pre>
     * @param tStoreRecordR The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TStoreRecordR tStoreRecordR, TStoreRecordRCB cb) {
        return doQueryUpdate(tStoreRecordR, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TStoreRecordRCB cb = new TStoreRecordRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">queryDelete</span>(tStoreRecordR, cb);
     * </pre>
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TStoreRecordRCB cb) {
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
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tStoreRecordR.setFoo...(value);
     * tStoreRecordR.setBar...(value);
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tStoreRecordR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tStoreRecordR.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tStoreRecordR The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, InsertOption<TStoreRecordRCB>> opLambda) {
        doInsert(tStoreRecordR, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tStoreRecordR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tStoreRecordR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreRecordR The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> opLambda) {
        doUpdate(tStoreRecordR, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * tStoreRecordR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tStoreRecordR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tStoreRecordR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreRecordR The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> opLambda) {
        doUpdateNonstrict(tStoreRecordR, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tStoreRecordR The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, InsertOption<TStoreRecordRCB>> insertOpLambda, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> updateOpLambda) {
        doInsertOrUpdate(tStoreRecordR, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tStoreRecordR The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, InsertOption<TStoreRecordRCB>> insertOpLambda, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tStoreRecordR, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tStoreRecordR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, DeleteOption<TStoreRecordRCB>> opLambda) {
        doDelete(tStoreRecordR, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tStoreRecordR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TStoreRecordR tStoreRecordR, WritableOptionCall<TStoreRecordRCB, DeleteOption<TStoreRecordRCB>> opLambda) {
        doDeleteNonstrict(tStoreRecordR, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TStoreRecordR> tStoreRecordRList, WritableOptionCall<TStoreRecordRCB, InsertOption<TStoreRecordRCB>> opLambda) {
        return doBatchInsert(tStoreRecordRList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TStoreRecordR> tStoreRecordRList, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> opLambda) {
        return doBatchUpdate(tStoreRecordRList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TStoreRecordR> tStoreRecordRList, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> opLambda) {
        return doBatchUpdateNonstrict(tStoreRecordRList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TStoreRecordR> tStoreRecordRList, WritableOptionCall<TStoreRecordRCB, DeleteOption<TStoreRecordRCB>> opLambda) {
        return doBatchDelete(tStoreRecordRList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tStoreRecordRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TStoreRecordR> tStoreRecordRList, WritableOptionCall<TStoreRecordRCB, DeleteOption<TStoreRecordRCB>> opLambda) {
        return doBatchDeleteNonstrict(tStoreRecordRList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TStoreRecordR, TStoreRecordRCB> manyArgLambda, WritableOptionCall<TStoreRecordRCB, InsertOption<TStoreRecordRCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TStoreRecordR tStoreRecordR = <span style="color: #70226C">new</span> TStoreRecordR();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setPK...(value);</span>
     * tStoreRecordR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tStoreRecordR.setVersionNo(value);</span>
     * TStoreRecordRCB cb = <span style="color: #70226C">new</span> TStoreRecordRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tStoreRecordRBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tStoreRecordR, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tStoreRecordR The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TStoreRecordR tStoreRecordR, TStoreRecordRCB cb, WritableOptionCall<TStoreRecordRCB, UpdateOption<TStoreRecordRCB>> opLambda) {
        return doQueryUpdate(tStoreRecordR, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TStoreRecordR. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TStoreRecordRCB cb, WritableOptionCall<TStoreRecordRCB, DeleteOption<TStoreRecordRCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tStoreRecordRBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tStoreRecordRBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStoreRecordRBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tStoreRecordRBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tStoreRecordRBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tStoreRecordRBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tStoreRecordRBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tStoreRecordRBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tStoreRecordRBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tStoreRecordRBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tStoreRecordRBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tStoreRecordRBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tStoreRecordRBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tStoreRecordRBhv.outideSql().removeBlockComment().selectList()
     * tStoreRecordRBhv.outideSql().removeLineComment().selectList()
     * tStoreRecordRBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TStoreRecordRBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TStoreRecordRBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TStoreRecordR> typeOfSelectedEntity() { return TStoreRecordR.class; }
    protected Class<TStoreRecordR> typeOfHandlingEntity() { return TStoreRecordR.class; }
    protected Class<TStoreRecordRCB> typeOfHandlingConditionBean() { return TStoreRecordRCB.class; }
}
