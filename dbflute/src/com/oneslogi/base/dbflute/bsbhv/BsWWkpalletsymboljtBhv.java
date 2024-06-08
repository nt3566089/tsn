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
 * The behavior of W_WKPALLETSYMBOLJT as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKSOJTKEY, SYMBOLNO
 *
 * [column]
 *     WKSOJTKEY, PALLETNO, OWNERSONO, SOPALLETNO, RCVKEY, SYMBOLNO, SORTEDQTY1, LOTKEY, PACKEDFLG, ENTERFLG, ACTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkpalletsymboljtBhv extends AbstractBehaviorWritable<WWkpalletsymboljt, WWkpalletsymboljtCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WWkpalletsymboljtDbm asDBMeta() { return WWkpalletsymboljtDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "W_WKPALLETSYMBOLJT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WWkpalletsymboljtDbm getMyDBMeta() { return WWkpalletsymboljtDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WWkpalletsymboljtCB newConditionBean() { return new WWkpalletsymboljtCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WWkpalletsymboljt newMyEntity() { return new WWkpalletsymboljt(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WWkpalletsymboljtCB newMyConditionBean() { return new WWkpalletsymboljtCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WWkpalletsymboljtCB cb) {
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
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().setFoo...(value);
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wWkpalletsymboljt != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wWkpalletsymboljt.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkpalletsymboljt selectEntity(WWkpalletsymboljtCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WWkpalletsymboljt facadeSelectEntity(WWkpalletsymboljtCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WWkpalletsymboljt> OptionalEntity<ENTITY> doSelectOptionalEntity(WWkpalletsymboljtCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().set...;
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wWkpalletsymboljt.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkpalletsymboljt selectEntityWithDeletedCheck(WWkpalletsymboljtCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param wksojtkey : PK, NotNull, decimal(16, 6). (NotNull)
     * @param symbolno : PK, NotNull, decimal(16, 6). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkpalletsymboljt selectByPKValue(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno) {
        return facadeSelectByPKValue(wksojtkey, symbolno);
    }

    protected WWkpalletsymboljt facadeSelectByPKValue(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno) {
        return doSelectByPK(wksojtkey, symbolno, typeOfSelectedEntity());
    }

    protected <ENTITY extends WWkpalletsymboljt> ENTITY doSelectByPK(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(wksojtkey, symbolno), tp);
    }

    protected <ENTITY extends WWkpalletsymboljt> OptionalEntity<ENTITY> doSelectOptionalByPK(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(wksojtkey, symbolno, tp), wksojtkey, symbolno);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param wksojtkey : PK, NotNull, decimal(16, 6). (NotNull)
     * @param symbolno : PK, NotNull, decimal(16, 6). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkpalletsymboljt selectByPKValueWithDeletedCheck(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno) {
        return doSelectByPKWithDeletedCheck(wksojtkey, symbolno, typeOfSelectedEntity());
    }

    protected <ENTITY extends WWkpalletsymboljt> ENTITY doSelectByPKWithDeletedCheck(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(wksojtkey, symbolno), tp);
    }

    protected WWkpalletsymboljtCB xprepareCBAsPK(java.math.BigDecimal wksojtkey, java.math.BigDecimal symbolno) {
        assertObjectNotNull("wksojtkey", wksojtkey);assertObjectNotNull("symbolno", symbolno);
        return newConditionBean().acceptPK(wksojtkey, symbolno);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WWkpalletsymboljt&gt; <span style="color: #553000">wWkpalletsymboljtList</span> = <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WWkpalletsymboljt wWkpalletsymboljt : <span style="color: #553000">wWkpalletsymboljtList</span>) {
     *     ... = wWkpalletsymboljt.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WWkpalletsymboljt> selectList(WWkpalletsymboljtCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WWkpalletsymboljt&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WWkpalletsymboljt wWkpalletsymboljt : <span style="color: #553000">page</span>) {
     *     ... = wWkpalletsymboljt.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WWkpalletsymboljt> selectPage(WWkpalletsymboljtCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().set...
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @param entityRowHandler The handler of entity row of WWkpalletsymboljt. (NotNull)
     */
    public void selectCursor(WWkpalletsymboljtCB cb, EntityRowHandler<WWkpalletsymboljt> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WWkpalletsymboljtCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WWkpalletsymboljtCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wWkpalletsymboljtList The entity list of WWkpalletsymboljt. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WWkpalletsymboljt> wWkpalletsymboljtList, ReferrerLoaderHandler<LoaderOfWWkpalletsymboljt> loaderLambda) {
        xassLRArg(wWkpalletsymboljtList, loaderLambda);
        loaderLambda.handle(new LoaderOfWWkpalletsymboljt().ready(wWkpalletsymboljtList, _behaviorSelector));
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
     * @param wWkpalletsymboljt The entity of WWkpalletsymboljt. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WWkpalletsymboljt wWkpalletsymboljt, ReferrerLoaderHandler<LoaderOfWWkpalletsymboljt> loaderLambda) {
        xassLRArg(wWkpalletsymboljt, loaderLambda);
        loaderLambda.handle(new LoaderOfWWkpalletsymboljt().ready(xnewLRAryLs(wWkpalletsymboljt), _behaviorSelector));
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
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wWkpalletsymboljt.setFoo...(value);
     * wWkpalletsymboljt.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.set...;</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">insert</span>(wWkpalletsymboljt);
     * ... = wWkpalletsymboljt.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wWkpalletsymboljt The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WWkpalletsymboljt wWkpalletsymboljt) {
        doInsert(wWkpalletsymboljt, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkpalletsymboljt.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wWkpalletsymboljt.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">update</span>(wWkpalletsymboljt);
     * </pre>
     * @param wWkpalletsymboljt The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WWkpalletsymboljt wWkpalletsymboljt) {
        doUpdate(wWkpalletsymboljt, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkpalletsymboljt.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wWkpalletsymboljt);
     * </pre>
     * @param wWkpalletsymboljt The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WWkpalletsymboljt wWkpalletsymboljt) {
        doUpdateNonstrict(wWkpalletsymboljt, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wWkpalletsymboljt The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WWkpalletsymboljt wWkpalletsymboljt) {
        doInsertOrUpdate(wWkpalletsymboljt, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wWkpalletsymboljt The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WWkpalletsymboljt wWkpalletsymboljt) {
        doInsertOrUpdateNonstrict(wWkpalletsymboljt, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wWkpalletsymboljt.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">delete</span>(wWkpalletsymboljt);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wWkpalletsymboljt The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WWkpalletsymboljt wWkpalletsymboljt) {
        doDelete(wWkpalletsymboljt, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wWkpalletsymboljt);
     * </pre>
     * @param wWkpalletsymboljt The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WWkpalletsymboljt wWkpalletsymboljt) {
        doDeleteNonstrict(wWkpalletsymboljt, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wWkpalletsymboljt);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wWkpalletsymboljt The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WWkpalletsymboljt wWkpalletsymboljt) {
        doDeleteNonstrictIgnoreDeleted(wWkpalletsymboljt, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WWkpalletsymboljt et, final DeleteOption<WWkpalletsymboljtCB> op) {
        assertObjectNotNull("wWkpalletsymboljt", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     *     wWkpalletsymboljt.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wWkpalletsymboljt.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wWkpalletsymboljtList.add(wWkpalletsymboljt);
     * }
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">batchInsert</span>(wWkpalletsymboljtList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WWkpalletsymboljt> wWkpalletsymboljtList) {
        return doBatchInsert(wWkpalletsymboljtList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     *     wWkpalletsymboljt.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wWkpalletsymboljt.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wWkpalletsymboljt.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wWkpalletsymboljt.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wWkpalletsymboljtList.add(wWkpalletsymboljt);
     * }
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wWkpalletsymboljtList);
     * </pre>
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WWkpalletsymboljt> wWkpalletsymboljtList) {
        return doBatchUpdate(wWkpalletsymboljtList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wWkpalletsymboljtBhv.<span style="color: #CC4747">batchUpdate</span>(wWkpalletsymboljtList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wWkpalletsymboljtList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WWkpalletsymboljt> wWkpalletsymboljtList, SpecifyQuery<WWkpalletsymboljtCB> colCBLambda) {
        return doBatchUpdate(wWkpalletsymboljtList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     *     wWkpalletsymboljt.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wWkpalletsymboljt.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wWkpalletsymboljt.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wWkpalletsymboljt.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wWkpalletsymboljtList.add(wWkpalletsymboljt);
     * }
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wWkpalletsymboljtList);
     * </pre>
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WWkpalletsymboljt> wWkpalletsymboljtList) {
        return doBatchUpdateNonstrict(wWkpalletsymboljtList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wWkpalletsymboljtList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wWkpalletsymboljtList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WWkpalletsymboljt> wWkpalletsymboljtList, SpecifyQuery<WWkpalletsymboljtCB> colCBLambda) {
        return doBatchUpdateNonstrict(wWkpalletsymboljtList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WWkpalletsymboljt> wWkpalletsymboljtList) {
        return doBatchDelete(wWkpalletsymboljtList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WWkpalletsymboljt> wWkpalletsymboljtList) {
        return doBatchDeleteNonstrict(wWkpalletsymboljtList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WWkpalletsymboljt, WWkpalletsymboljtCB&gt;() {
     *     public ConditionBean setup(WWkpalletsymboljt entity, WWkpalletsymboljtCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WWkpalletsymboljt, WWkpalletsymboljtCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setPK...(value);</span>
     * wWkpalletsymboljt.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setVersionNo(value);</span>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wWkpalletsymboljt, cb);
     * </pre>
     * @param wWkpalletsymboljt The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WWkpalletsymboljt wWkpalletsymboljt, WWkpalletsymboljtCB cb) {
        return doQueryUpdate(wWkpalletsymboljt, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WWkpalletsymboljtCB cb = new WWkpalletsymboljtCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">queryDelete</span>(wWkpalletsymboljt, cb);
     * </pre>
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WWkpalletsymboljtCB cb) {
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
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wWkpalletsymboljt.setFoo...(value);
     * wWkpalletsymboljt.setBar...(value);
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wWkpalletsymboljt, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wWkpalletsymboljt.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wWkpalletsymboljt The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, InsertOption<WWkpalletsymboljtCB>> opLambda) {
        doInsert(wWkpalletsymboljt, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkpalletsymboljt.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wWkpalletsymboljt.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wWkpalletsymboljt, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wWkpalletsymboljt The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> opLambda) {
        doUpdate(wWkpalletsymboljt, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * wWkpalletsymboljt.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkpalletsymboljt.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wWkpalletsymboljt, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wWkpalletsymboljt The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> opLambda) {
        doUpdateNonstrict(wWkpalletsymboljt, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wWkpalletsymboljt The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, InsertOption<WWkpalletsymboljtCB>> insertOpLambda, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> updateOpLambda) {
        doInsertOrUpdate(wWkpalletsymboljt, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wWkpalletsymboljt The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, InsertOption<WWkpalletsymboljtCB>> insertOpLambda, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wWkpalletsymboljt, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wWkpalletsymboljt The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, DeleteOption<WWkpalletsymboljtCB>> opLambda) {
        doDelete(wWkpalletsymboljt, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wWkpalletsymboljt The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WWkpalletsymboljt wWkpalletsymboljt, WritableOptionCall<WWkpalletsymboljtCB, DeleteOption<WWkpalletsymboljtCB>> opLambda) {
        doDeleteNonstrict(wWkpalletsymboljt, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WWkpalletsymboljt> wWkpalletsymboljtList, WritableOptionCall<WWkpalletsymboljtCB, InsertOption<WWkpalletsymboljtCB>> opLambda) {
        return doBatchInsert(wWkpalletsymboljtList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WWkpalletsymboljt> wWkpalletsymboljtList, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> opLambda) {
        return doBatchUpdate(wWkpalletsymboljtList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WWkpalletsymboljt> wWkpalletsymboljtList, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> opLambda) {
        return doBatchUpdateNonstrict(wWkpalletsymboljtList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WWkpalletsymboljt> wWkpalletsymboljtList, WritableOptionCall<WWkpalletsymboljtCB, DeleteOption<WWkpalletsymboljtCB>> opLambda) {
        return doBatchDelete(wWkpalletsymboljtList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wWkpalletsymboljtList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WWkpalletsymboljt> wWkpalletsymboljtList, WritableOptionCall<WWkpalletsymboljtCB, DeleteOption<WWkpalletsymboljtCB>> opLambda) {
        return doBatchDeleteNonstrict(wWkpalletsymboljtList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WWkpalletsymboljt, WWkpalletsymboljtCB> manyArgLambda, WritableOptionCall<WWkpalletsymboljtCB, InsertOption<WWkpalletsymboljtCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WWkpalletsymboljt wWkpalletsymboljt = <span style="color: #70226C">new</span> WWkpalletsymboljt();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setPK...(value);</span>
     * wWkpalletsymboljt.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkpalletsymboljt.setVersionNo(value);</span>
     * WWkpalletsymboljtCB cb = <span style="color: #70226C">new</span> WWkpalletsymboljtCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wWkpalletsymboljtBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wWkpalletsymboljt, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wWkpalletsymboljt The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WWkpalletsymboljt wWkpalletsymboljt, WWkpalletsymboljtCB cb, WritableOptionCall<WWkpalletsymboljtCB, UpdateOption<WWkpalletsymboljtCB>> opLambda) {
        return doQueryUpdate(wWkpalletsymboljt, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WWkpalletsymboljt. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WWkpalletsymboljtCB cb, WritableOptionCall<WWkpalletsymboljtCB, DeleteOption<WWkpalletsymboljtCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wWkpalletsymboljtBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wWkpalletsymboljtBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wWkpalletsymboljtBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wWkpalletsymboljtBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wWkpalletsymboljtBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wWkpalletsymboljtBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wWkpalletsymboljtBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wWkpalletsymboljtBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wWkpalletsymboljtBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wWkpalletsymboljtBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wWkpalletsymboljtBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wWkpalletsymboljtBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wWkpalletsymboljtBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wWkpalletsymboljtBhv.outideSql().removeBlockComment().selectList()
     * wWkpalletsymboljtBhv.outideSql().removeLineComment().selectList()
     * wWkpalletsymboljtBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WWkpalletsymboljtBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WWkpalletsymboljtBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WWkpalletsymboljt> typeOfSelectedEntity() { return WWkpalletsymboljt.class; }
    protected Class<WWkpalletsymboljt> typeOfHandlingEntity() { return WWkpalletsymboljt.class; }
    protected Class<WWkpalletsymboljtCB> typeOfHandlingConditionBean() { return WWkpalletsymboljtCB.class; }
}
