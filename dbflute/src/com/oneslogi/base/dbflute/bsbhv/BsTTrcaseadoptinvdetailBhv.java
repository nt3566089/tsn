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
 * The behavior of T_TRCASEADOPTINVDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     T_TRCASEADOPTINVDETAIL_ID
 *
 * [column]
 *     T_TRCASEADOPTINVDETAIL_ID, CENTER_ID, CLIENT_ID, INVENTORY_KEY, INVENTORY_B_ID, PRODUCT_CD, QR_DATA, CASE_INV_QTY, MANUFACTURE_DATE, DESIGN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_TRCASEADOPTINVDETAIL_ID
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
public abstract class BsTTrcaseadoptinvdetailBhv extends AbstractBehaviorWritable<TTrcaseadoptinvdetail, TTrcaseadoptinvdetailCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrcaseadoptinvdetailDbm asDBMeta() { return TTrcaseadoptinvdetailDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRCASEADOPTINVDETAIL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrcaseadoptinvdetailDbm getMyDBMeta() { return TTrcaseadoptinvdetailDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrcaseadoptinvdetailCB newConditionBean() { return new TTrcaseadoptinvdetailCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrcaseadoptinvdetail newMyEntity() { return new TTrcaseadoptinvdetail(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrcaseadoptinvdetailCB newMyConditionBean() { return new TTrcaseadoptinvdetailCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrcaseadoptinvdetailCB cb) {
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
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().setFoo...(value);
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrcaseadoptinvdetail != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrcaseadoptinvdetail.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrcaseadoptinvdetail selectEntity(TTrcaseadoptinvdetailCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrcaseadoptinvdetail facadeSelectEntity(TTrcaseadoptinvdetailCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrcaseadoptinvdetail> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrcaseadoptinvdetailCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().set...;
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrcaseadoptinvdetail.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrcaseadoptinvdetail selectEntityWithDeletedCheck(TTrcaseadoptinvdetailCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param tTrcaseadoptinvdetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrcaseadoptinvdetail selectByPKValue(Long tTrcaseadoptinvdetailId) {
        return facadeSelectByPKValue(tTrcaseadoptinvdetailId);
    }

    protected TTrcaseadoptinvdetail facadeSelectByPKValue(Long tTrcaseadoptinvdetailId) {
        return doSelectByPK(tTrcaseadoptinvdetailId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrcaseadoptinvdetail> ENTITY doSelectByPK(Long tTrcaseadoptinvdetailId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(tTrcaseadoptinvdetailId), tp);
    }

    protected <ENTITY extends TTrcaseadoptinvdetail> OptionalEntity<ENTITY> doSelectOptionalByPK(Long tTrcaseadoptinvdetailId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(tTrcaseadoptinvdetailId, tp), tTrcaseadoptinvdetailId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param tTrcaseadoptinvdetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrcaseadoptinvdetail selectByPKValueWithDeletedCheck(Long tTrcaseadoptinvdetailId) {
        return doSelectByPKWithDeletedCheck(tTrcaseadoptinvdetailId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrcaseadoptinvdetail> ENTITY doSelectByPKWithDeletedCheck(Long tTrcaseadoptinvdetailId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(tTrcaseadoptinvdetailId), tp);
    }

    protected TTrcaseadoptinvdetailCB xprepareCBAsPK(Long tTrcaseadoptinvdetailId) {
        assertObjectNotNull("tTrcaseadoptinvdetailId", tTrcaseadoptinvdetailId);
        return newConditionBean().acceptPK(tTrcaseadoptinvdetailId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrcaseadoptinvdetail&gt; <span style="color: #553000">tTrcaseadoptinvdetailList</span> = <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrcaseadoptinvdetail tTrcaseadoptinvdetail : <span style="color: #553000">tTrcaseadoptinvdetailList</span>) {
     *     ... = tTrcaseadoptinvdetail.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrcaseadoptinvdetail> selectList(TTrcaseadoptinvdetailCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrcaseadoptinvdetail&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrcaseadoptinvdetail tTrcaseadoptinvdetail : <span style="color: #553000">page</span>) {
     *     ... = tTrcaseadoptinvdetail.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrcaseadoptinvdetail> selectPage(TTrcaseadoptinvdetailCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrcaseadoptinvdetail. (NotNull)
     */
    public void selectCursor(TTrcaseadoptinvdetailCB cb, EntityRowHandler<TTrcaseadoptinvdetail> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrcaseadoptinvdetailCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrcaseadoptinvdetailCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrcaseadoptinvdetailList The entity list of TTrcaseadoptinvdetail. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, ReferrerLoaderHandler<LoaderOfTTrcaseadoptinvdetail> loaderLambda) {
        xassLRArg(tTrcaseadoptinvdetailList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrcaseadoptinvdetail().ready(tTrcaseadoptinvdetailList, _behaviorSelector));
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
     * @param tTrcaseadoptinvdetail The entity of TTrcaseadoptinvdetail. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, ReferrerLoaderHandler<LoaderOfTTrcaseadoptinvdetail> loaderLambda) {
        xassLRArg(tTrcaseadoptinvdetail, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrcaseadoptinvdetail().ready(xnewLRAryLs(tTrcaseadoptinvdetail), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key tTrcaseadoptinvdetailId.
     * @param tTrcaseadoptinvdetailList The list of tTrcaseadoptinvdetail. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTTrcaseadoptinvdetailIdList(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList)
    { return helpExtractListInternally(tTrcaseadoptinvdetailList, "TTrcaseadoptinvdetailId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrcaseadoptinvdetail.setFoo...(value);
     * tTrcaseadoptinvdetail.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.set...;</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">insert</span>(tTrcaseadoptinvdetail);
     * ... = tTrcaseadoptinvdetail.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrcaseadoptinvdetail The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doInsert(tTrcaseadoptinvdetail, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrcaseadoptinvdetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrcaseadoptinvdetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">update</span>(tTrcaseadoptinvdetail);
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doUpdate(tTrcaseadoptinvdetail, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrcaseadoptinvdetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrcaseadoptinvdetail);
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doUpdateNonstrict(tTrcaseadoptinvdetail, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrcaseadoptinvdetail The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doInsertOrUpdate(tTrcaseadoptinvdetail, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrcaseadoptinvdetail The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doInsertOrUpdateNonstrict(tTrcaseadoptinvdetail, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrcaseadoptinvdetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">delete</span>(tTrcaseadoptinvdetail);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doDelete(tTrcaseadoptinvdetail, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrcaseadoptinvdetail);
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doDeleteNonstrict(tTrcaseadoptinvdetail, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrcaseadoptinvdetail);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrcaseadoptinvdetail tTrcaseadoptinvdetail) {
        doDeleteNonstrictIgnoreDeleted(tTrcaseadoptinvdetail, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrcaseadoptinvdetail et, final DeleteOption<TTrcaseadoptinvdetailCB> op) {
        assertObjectNotNull("tTrcaseadoptinvdetail", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     *     tTrcaseadoptinvdetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrcaseadoptinvdetail.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrcaseadoptinvdetailList.add(tTrcaseadoptinvdetail);
     * }
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrcaseadoptinvdetailList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList) {
        return doBatchInsert(tTrcaseadoptinvdetailList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     *     tTrcaseadoptinvdetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrcaseadoptinvdetail.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrcaseadoptinvdetail.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrcaseadoptinvdetailList.add(tTrcaseadoptinvdetail);
     * }
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrcaseadoptinvdetailList);
     * </pre>
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList) {
        return doBatchUpdate(tTrcaseadoptinvdetailList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrcaseadoptinvdetailBhv.<span style="color: #CC4747">batchUpdate</span>(tTrcaseadoptinvdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrcaseadoptinvdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, SpecifyQuery<TTrcaseadoptinvdetailCB> colCBLambda) {
        return doBatchUpdate(tTrcaseadoptinvdetailList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     *     tTrcaseadoptinvdetail.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrcaseadoptinvdetail.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrcaseadoptinvdetail.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrcaseadoptinvdetailList.add(tTrcaseadoptinvdetail);
     * }
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrcaseadoptinvdetailList);
     * </pre>
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList) {
        return doBatchUpdateNonstrict(tTrcaseadoptinvdetailList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrcaseadoptinvdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrcaseadoptinvdetailList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, SpecifyQuery<TTrcaseadoptinvdetailCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrcaseadoptinvdetailList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList) {
        return doBatchDelete(tTrcaseadoptinvdetailList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList) {
        return doBatchDeleteNonstrict(tTrcaseadoptinvdetailList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrcaseadoptinvdetail, TTrcaseadoptinvdetailCB&gt;() {
     *     public ConditionBean setup(TTrcaseadoptinvdetail entity, TTrcaseadoptinvdetailCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrcaseadoptinvdetail, TTrcaseadoptinvdetailCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setPK...(value);</span>
     * tTrcaseadoptinvdetail.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setVersionNo(value);</span>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrcaseadoptinvdetail, cb);
     * </pre>
     * @param tTrcaseadoptinvdetail The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, TTrcaseadoptinvdetailCB cb) {
        return doQueryUpdate(tTrcaseadoptinvdetail, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrcaseadoptinvdetailCB cb = new TTrcaseadoptinvdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrcaseadoptinvdetail, cb);
     * </pre>
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrcaseadoptinvdetailCB cb) {
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
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrcaseadoptinvdetail.setFoo...(value);
     * tTrcaseadoptinvdetail.setBar...(value);
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrcaseadoptinvdetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrcaseadoptinvdetail.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, InsertOption<TTrcaseadoptinvdetailCB>> opLambda) {
        doInsert(tTrcaseadoptinvdetail, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrcaseadoptinvdetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrcaseadoptinvdetail.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrcaseadoptinvdetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> opLambda) {
        doUpdate(tTrcaseadoptinvdetail, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * tTrcaseadoptinvdetail.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrcaseadoptinvdetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrcaseadoptinvdetail, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrcaseadoptinvdetail The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> opLambda) {
        doUpdateNonstrict(tTrcaseadoptinvdetail, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrcaseadoptinvdetail The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, InsertOption<TTrcaseadoptinvdetailCB>> insertOpLambda, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> updateOpLambda) {
        doInsertOrUpdate(tTrcaseadoptinvdetail, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrcaseadoptinvdetail The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, InsertOption<TTrcaseadoptinvdetailCB>> insertOpLambda, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrcaseadoptinvdetail, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrcaseadoptinvdetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, DeleteOption<TTrcaseadoptinvdetailCB>> opLambda) {
        doDelete(tTrcaseadoptinvdetail, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrcaseadoptinvdetail The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, WritableOptionCall<TTrcaseadoptinvdetailCB, DeleteOption<TTrcaseadoptinvdetailCB>> opLambda) {
        doDeleteNonstrict(tTrcaseadoptinvdetail, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, WritableOptionCall<TTrcaseadoptinvdetailCB, InsertOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doBatchInsert(tTrcaseadoptinvdetailList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doBatchUpdate(tTrcaseadoptinvdetailList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrcaseadoptinvdetailList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, WritableOptionCall<TTrcaseadoptinvdetailCB, DeleteOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doBatchDelete(tTrcaseadoptinvdetailList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrcaseadoptinvdetailList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrcaseadoptinvdetail> tTrcaseadoptinvdetailList, WritableOptionCall<TTrcaseadoptinvdetailCB, DeleteOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrcaseadoptinvdetailList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrcaseadoptinvdetail, TTrcaseadoptinvdetailCB> manyArgLambda, WritableOptionCall<TTrcaseadoptinvdetailCB, InsertOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrcaseadoptinvdetail tTrcaseadoptinvdetail = <span style="color: #70226C">new</span> TTrcaseadoptinvdetail();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setPK...(value);</span>
     * tTrcaseadoptinvdetail.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrcaseadoptinvdetail.setVersionNo(value);</span>
     * TTrcaseadoptinvdetailCB cb = <span style="color: #70226C">new</span> TTrcaseadoptinvdetailCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrcaseadoptinvdetailBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrcaseadoptinvdetail, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrcaseadoptinvdetail The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrcaseadoptinvdetail tTrcaseadoptinvdetail, TTrcaseadoptinvdetailCB cb, WritableOptionCall<TTrcaseadoptinvdetailCB, UpdateOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doQueryUpdate(tTrcaseadoptinvdetail, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrcaseadoptinvdetail. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrcaseadoptinvdetailCB cb, WritableOptionCall<TTrcaseadoptinvdetailCB, DeleteOption<TTrcaseadoptinvdetailCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrcaseadoptinvdetailBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrcaseadoptinvdetailBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrcaseadoptinvdetailBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrcaseadoptinvdetailBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrcaseadoptinvdetailBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrcaseadoptinvdetailBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrcaseadoptinvdetailBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrcaseadoptinvdetailBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrcaseadoptinvdetailBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrcaseadoptinvdetailBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrcaseadoptinvdetailBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrcaseadoptinvdetailBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrcaseadoptinvdetailBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrcaseadoptinvdetailBhv.outideSql().removeBlockComment().selectList()
     * tTrcaseadoptinvdetailBhv.outideSql().removeLineComment().selectList()
     * tTrcaseadoptinvdetailBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrcaseadoptinvdetailBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrcaseadoptinvdetailBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrcaseadoptinvdetail> typeOfSelectedEntity() { return TTrcaseadoptinvdetail.class; }
    protected Class<TTrcaseadoptinvdetail> typeOfHandlingEntity() { return TTrcaseadoptinvdetail.class; }
    protected Class<TTrcaseadoptinvdetailCB> typeOfHandlingConditionBean() { return TTrcaseadoptinvdetailCB.class; }
}
