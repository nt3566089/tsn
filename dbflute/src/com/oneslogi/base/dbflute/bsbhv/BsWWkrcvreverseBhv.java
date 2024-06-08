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
 * The behavior of W_WKRCVREVERSE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO
 *
 * [column]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO, WAREHOUSECD, WAREHOUSENAME, TRANSPORTNO, RCVSCHDATE, SUPPLIERCD, SUPPLIERNAME, PRODUCT_CD, ITEMNAME, RCVLIMITDATE, RCVDESIGNCD, RCVQTY, WORKDATETIME, LOC, LOCCD, LIMITDAY, DESIGNCD, QTYCASE, QTYBOWL, FLG, INSIDE_OUTSIDE_KBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkrcvreverseBhv extends AbstractBehaviorWritable<WWkrcvreverse, WWkrcvreverseCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WWkrcvreverseDbm asDBMeta() { return WWkrcvreverseDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "W_WKRCVREVERSE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WWkrcvreverseDbm getMyDBMeta() { return WWkrcvreverseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WWkrcvreverseCB newConditionBean() { return new WWkrcvreverseCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WWkrcvreverse newMyEntity() { return new WWkrcvreverse(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WWkrcvreverseCB newMyConditionBean() { return new WWkrcvreverseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WWkrcvreverseCB cb) {
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
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().setFoo...(value);
     * WWkrcvreverse wWkrcvreverse = <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wWkrcvreverse != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wWkrcvreverse.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkrcvreverse selectEntity(WWkrcvreverseCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WWkrcvreverse facadeSelectEntity(WWkrcvreverseCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WWkrcvreverse> OptionalEntity<ENTITY> doSelectOptionalEntity(WWkrcvreverseCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().set...;
     * WWkrcvreverse wWkrcvreverse = <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wWkrcvreverse.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkrcvreverse selectEntityWithDeletedCheck(WWkrcvreverseCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param printkey : PK, NotNull, decimal(16, 6). (NotNull)
     * @param rcvreverseno : PK, NotNull, decimal(16, 6). (NotNull)
     * @param rcvreverselineno : PK, NotNull, bigint(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkrcvreverse selectByPKValue(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno) {
        return facadeSelectByPKValue(printkey, rcvreverseno, rcvreverselineno);
    }

    protected WWkrcvreverse facadeSelectByPKValue(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno) {
        return doSelectByPK(printkey, rcvreverseno, rcvreverselineno, typeOfSelectedEntity());
    }

    protected <ENTITY extends WWkrcvreverse> ENTITY doSelectByPK(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(printkey, rcvreverseno, rcvreverselineno), tp);
    }

    protected <ENTITY extends WWkrcvreverse> OptionalEntity<ENTITY> doSelectOptionalByPK(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(printkey, rcvreverseno, rcvreverselineno, tp), printkey, rcvreverseno, rcvreverselineno);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param printkey : PK, NotNull, decimal(16, 6). (NotNull)
     * @param rcvreverseno : PK, NotNull, decimal(16, 6). (NotNull)
     * @param rcvreverselineno : PK, NotNull, bigint(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WWkrcvreverse selectByPKValueWithDeletedCheck(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno) {
        return doSelectByPKWithDeletedCheck(printkey, rcvreverseno, rcvreverselineno, typeOfSelectedEntity());
    }

    protected <ENTITY extends WWkrcvreverse> ENTITY doSelectByPKWithDeletedCheck(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(printkey, rcvreverseno, rcvreverselineno), tp);
    }

    protected WWkrcvreverseCB xprepareCBAsPK(java.math.BigDecimal printkey, java.math.BigDecimal rcvreverseno, Long rcvreverselineno) {
        assertObjectNotNull("printkey", printkey);assertObjectNotNull("rcvreverseno", rcvreverseno);assertObjectNotNull("rcvreverselineno", rcvreverselineno);
        return newConditionBean().acceptPK(printkey, rcvreverseno, rcvreverselineno);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WWkrcvreverse&gt; <span style="color: #553000">wWkrcvreverseList</span> = <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WWkrcvreverse wWkrcvreverse : <span style="color: #553000">wWkrcvreverseList</span>) {
     *     ... = wWkrcvreverse.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WWkrcvreverse> selectList(WWkrcvreverseCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WWkrcvreverse&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WWkrcvreverse wWkrcvreverse : <span style="color: #553000">page</span>) {
     *     ... = wWkrcvreverse.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WWkrcvreverse> selectPage(WWkrcvreverseCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().set...
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @param entityRowHandler The handler of entity row of WWkrcvreverse. (NotNull)
     */
    public void selectCursor(WWkrcvreverseCB cb, EntityRowHandler<WWkrcvreverse> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WWkrcvreverseCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WWkrcvreverseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wWkrcvreverseList The entity list of WWkrcvreverse. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WWkrcvreverse> wWkrcvreverseList, ReferrerLoaderHandler<LoaderOfWWkrcvreverse> loaderLambda) {
        xassLRArg(wWkrcvreverseList, loaderLambda);
        loaderLambda.handle(new LoaderOfWWkrcvreverse().ready(wWkrcvreverseList, _behaviorSelector));
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
     * @param wWkrcvreverse The entity of WWkrcvreverse. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WWkrcvreverse wWkrcvreverse, ReferrerLoaderHandler<LoaderOfWWkrcvreverse> loaderLambda) {
        xassLRArg(wWkrcvreverse, loaderLambda);
        loaderLambda.handle(new LoaderOfWWkrcvreverse().ready(xnewLRAryLs(wWkrcvreverse), _behaviorSelector));
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
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wWkrcvreverse.setFoo...(value);
     * wWkrcvreverse.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.set...;</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">insert</span>(wWkrcvreverse);
     * ... = wWkrcvreverse.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wWkrcvreverse The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WWkrcvreverse wWkrcvreverse) {
        doInsert(wWkrcvreverse, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkrcvreverse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wWkrcvreverse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">update</span>(wWkrcvreverse);
     * </pre>
     * @param wWkrcvreverse The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WWkrcvreverse wWkrcvreverse) {
        doUpdate(wWkrcvreverse, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkrcvreverse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wWkrcvreverse);
     * </pre>
     * @param wWkrcvreverse The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WWkrcvreverse wWkrcvreverse) {
        doUpdateNonstrict(wWkrcvreverse, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wWkrcvreverse The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WWkrcvreverse wWkrcvreverse) {
        doInsertOrUpdate(wWkrcvreverse, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wWkrcvreverse The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WWkrcvreverse wWkrcvreverse) {
        doInsertOrUpdateNonstrict(wWkrcvreverse, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wWkrcvreverse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">delete</span>(wWkrcvreverse);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wWkrcvreverse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WWkrcvreverse wWkrcvreverse) {
        doDelete(wWkrcvreverse, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wWkrcvreverse);
     * </pre>
     * @param wWkrcvreverse The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WWkrcvreverse wWkrcvreverse) {
        doDeleteNonstrict(wWkrcvreverse, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wWkrcvreverse);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wWkrcvreverse The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WWkrcvreverse wWkrcvreverse) {
        doDeleteNonstrictIgnoreDeleted(wWkrcvreverse, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WWkrcvreverse et, final DeleteOption<WWkrcvreverseCB> op) {
        assertObjectNotNull("wWkrcvreverse", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     *     wWkrcvreverse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wWkrcvreverse.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wWkrcvreverseList.add(wWkrcvreverse);
     * }
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">batchInsert</span>(wWkrcvreverseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WWkrcvreverse> wWkrcvreverseList) {
        return doBatchInsert(wWkrcvreverseList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     *     wWkrcvreverse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wWkrcvreverse.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wWkrcvreverse.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wWkrcvreverse.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wWkrcvreverseList.add(wWkrcvreverse);
     * }
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wWkrcvreverseList);
     * </pre>
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WWkrcvreverse> wWkrcvreverseList) {
        return doBatchUpdate(wWkrcvreverseList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wWkrcvreverseBhv.<span style="color: #CC4747">batchUpdate</span>(wWkrcvreverseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wWkrcvreverseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WWkrcvreverse> wWkrcvreverseList, SpecifyQuery<WWkrcvreverseCB> colCBLambda) {
        return doBatchUpdate(wWkrcvreverseList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     *     wWkrcvreverse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wWkrcvreverse.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wWkrcvreverse.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wWkrcvreverse.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wWkrcvreverseList.add(wWkrcvreverse);
     * }
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wWkrcvreverseList);
     * </pre>
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WWkrcvreverse> wWkrcvreverseList) {
        return doBatchUpdateNonstrict(wWkrcvreverseList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wWkrcvreverseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wWkrcvreverseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WWkrcvreverse> wWkrcvreverseList, SpecifyQuery<WWkrcvreverseCB> colCBLambda) {
        return doBatchUpdateNonstrict(wWkrcvreverseList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WWkrcvreverse> wWkrcvreverseList) {
        return doBatchDelete(wWkrcvreverseList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WWkrcvreverse> wWkrcvreverseList) {
        return doBatchDeleteNonstrict(wWkrcvreverseList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WWkrcvreverse, WWkrcvreverseCB&gt;() {
     *     public ConditionBean setup(WWkrcvreverse entity, WWkrcvreverseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WWkrcvreverse, WWkrcvreverseCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setPK...(value);</span>
     * wWkrcvreverse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setVersionNo(value);</span>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wWkrcvreverse, cb);
     * </pre>
     * @param wWkrcvreverse The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WWkrcvreverse wWkrcvreverse, WWkrcvreverseCB cb) {
        return doQueryUpdate(wWkrcvreverse, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WWkrcvreverseCB cb = new WWkrcvreverseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">queryDelete</span>(wWkrcvreverse, cb);
     * </pre>
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WWkrcvreverseCB cb) {
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
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wWkrcvreverse.setFoo...(value);
     * wWkrcvreverse.setBar...(value);
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wWkrcvreverse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wWkrcvreverse.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wWkrcvreverse The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, InsertOption<WWkrcvreverseCB>> opLambda) {
        doInsert(wWkrcvreverse, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkrcvreverse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wWkrcvreverse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wWkrcvreverse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wWkrcvreverse The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> opLambda) {
        doUpdate(wWkrcvreverse, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * wWkrcvreverse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wWkrcvreverse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setVersionNo(value);</span>
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wWkrcvreverse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wWkrcvreverse The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> opLambda) {
        doUpdateNonstrict(wWkrcvreverse, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wWkrcvreverse The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, InsertOption<WWkrcvreverseCB>> insertOpLambda, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> updateOpLambda) {
        doInsertOrUpdate(wWkrcvreverse, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wWkrcvreverse The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, InsertOption<WWkrcvreverseCB>> insertOpLambda, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wWkrcvreverse, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wWkrcvreverse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, DeleteOption<WWkrcvreverseCB>> opLambda) {
        doDelete(wWkrcvreverse, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wWkrcvreverse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WWkrcvreverse wWkrcvreverse, WritableOptionCall<WWkrcvreverseCB, DeleteOption<WWkrcvreverseCB>> opLambda) {
        doDeleteNonstrict(wWkrcvreverse, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WWkrcvreverse> wWkrcvreverseList, WritableOptionCall<WWkrcvreverseCB, InsertOption<WWkrcvreverseCB>> opLambda) {
        return doBatchInsert(wWkrcvreverseList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WWkrcvreverse> wWkrcvreverseList, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> opLambda) {
        return doBatchUpdate(wWkrcvreverseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WWkrcvreverse> wWkrcvreverseList, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> opLambda) {
        return doBatchUpdateNonstrict(wWkrcvreverseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WWkrcvreverse> wWkrcvreverseList, WritableOptionCall<WWkrcvreverseCB, DeleteOption<WWkrcvreverseCB>> opLambda) {
        return doBatchDelete(wWkrcvreverseList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wWkrcvreverseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WWkrcvreverse> wWkrcvreverseList, WritableOptionCall<WWkrcvreverseCB, DeleteOption<WWkrcvreverseCB>> opLambda) {
        return doBatchDeleteNonstrict(wWkrcvreverseList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WWkrcvreverse, WWkrcvreverseCB> manyArgLambda, WritableOptionCall<WWkrcvreverseCB, InsertOption<WWkrcvreverseCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WWkrcvreverse wWkrcvreverse = <span style="color: #70226C">new</span> WWkrcvreverse();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setPK...(value);</span>
     * wWkrcvreverse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wWkrcvreverse.setVersionNo(value);</span>
     * WWkrcvreverseCB cb = <span style="color: #70226C">new</span> WWkrcvreverseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wWkrcvreverseBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wWkrcvreverse, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wWkrcvreverse The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WWkrcvreverse wWkrcvreverse, WWkrcvreverseCB cb, WritableOptionCall<WWkrcvreverseCB, UpdateOption<WWkrcvreverseCB>> opLambda) {
        return doQueryUpdate(wWkrcvreverse, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WWkrcvreverse. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WWkrcvreverseCB cb, WritableOptionCall<WWkrcvreverseCB, DeleteOption<WWkrcvreverseCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wWkrcvreverseBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wWkrcvreverseBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wWkrcvreverseBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wWkrcvreverseBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wWkrcvreverseBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wWkrcvreverseBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wWkrcvreverseBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wWkrcvreverseBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wWkrcvreverseBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wWkrcvreverseBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wWkrcvreverseBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wWkrcvreverseBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wWkrcvreverseBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wWkrcvreverseBhv.outideSql().removeBlockComment().selectList()
     * wWkrcvreverseBhv.outideSql().removeLineComment().selectList()
     * wWkrcvreverseBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WWkrcvreverseBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WWkrcvreverseBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WWkrcvreverse> typeOfSelectedEntity() { return WWkrcvreverse.class; }
    protected Class<WWkrcvreverse> typeOfHandlingEntity() { return WWkrcvreverse.class; }
    protected Class<WWkrcvreverseCB> typeOfHandlingConditionBean() { return WWkrcvreverseCB.class; }
}
