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
 * The behavior of T_EC_ORDER_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, STATEMENT_OUT_FLG, STATEMENT_OUT_USER_ID, STATEMENT_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_EC_ORDER_H, B_CLASS_DTL(ByInvoiceCreateFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, tEcOrderH, bClassDtlByInvoiceCreateFlg, bClassDtlByStatementOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTEcOrderRBhv extends AbstractBehaviorWritable<TEcOrderR, TEcOrderRCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TEcOrderRDbm asDBMeta() { return TEcOrderRDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_EC_ORDER_R"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TEcOrderRDbm getMyDBMeta() { return TEcOrderRDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TEcOrderRCB newConditionBean() { return new TEcOrderRCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TEcOrderR newMyEntity() { return new TEcOrderR(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TEcOrderRCB newMyConditionBean() { return new TEcOrderRCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TEcOrderRCB cb) {
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
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().setFoo...(value);
     * TEcOrderR tEcOrderR = <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tEcOrderR != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tEcOrderR.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderR selectEntity(TEcOrderRCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TEcOrderR facadeSelectEntity(TEcOrderRCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderR> OptionalEntity<ENTITY> doSelectOptionalEntity(TEcOrderRCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().set...;
     * TEcOrderR tEcOrderR = <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tEcOrderR.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderR selectEntityWithDeletedCheck(TEcOrderRCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param ecOrderHId : PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderR selectByPKValue(Long ecOrderHId) {
        return facadeSelectByPKValue(ecOrderHId);
    }

    protected TEcOrderR facadeSelectByPKValue(Long ecOrderHId) {
        return doSelectByPK(ecOrderHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderR> ENTITY doSelectByPK(Long ecOrderHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(ecOrderHId), tp);
    }

    protected <ENTITY extends TEcOrderR> OptionalEntity<ENTITY> doSelectOptionalByPK(Long ecOrderHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(ecOrderHId, tp), ecOrderHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param ecOrderHId : PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderR selectByPKValueWithDeletedCheck(Long ecOrderHId) {
        return doSelectByPKWithDeletedCheck(ecOrderHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderR> ENTITY doSelectByPKWithDeletedCheck(Long ecOrderHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(ecOrderHId), tp);
    }

    protected TEcOrderRCB xprepareCBAsPK(Long ecOrderHId) {
        assertObjectNotNull("ecOrderHId", ecOrderHId);
        return newConditionBean().acceptPK(ecOrderHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TEcOrderR&gt; <span style="color: #553000">tEcOrderRList</span> = <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TEcOrderR tEcOrderR : <span style="color: #553000">tEcOrderRList</span>) {
     *     ... = tEcOrderR.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TEcOrderR> selectList(TEcOrderRCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TEcOrderR&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TEcOrderR tEcOrderR : <span style="color: #553000">page</span>) {
     *     ... = tEcOrderR.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TEcOrderR> selectPage(TEcOrderRCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().set...
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @param entityRowHandler The handler of entity row of TEcOrderR. (NotNull)
     */
    public void selectCursor(TEcOrderRCB cb, EntityRowHandler<TEcOrderR> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TEcOrderRCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TEcOrderRCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tEcOrderRList The entity list of TEcOrderR. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TEcOrderR> tEcOrderRList, ReferrerLoaderHandler<LoaderOfTEcOrderR> loaderLambda) {
        xassLRArg(tEcOrderRList, loaderLambda);
        loaderLambda.handle(new LoaderOfTEcOrderR().ready(tEcOrderRList, _behaviorSelector));
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
     * @param tEcOrderR The entity of TEcOrderR. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TEcOrderR tEcOrderR, ReferrerLoaderHandler<LoaderOfTEcOrderR> loaderLambda) {
        xassLRArg(tEcOrderR, loaderLambda);
        loaderLambda.handle(new LoaderOfTEcOrderR().ready(xnewLRAryLs(tEcOrderR), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tEcOrderRList The list of tEcOrderR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUser(List<TEcOrderR> tEcOrderRList)
    { return helpPulloutInternally(tEcOrderRList, "bUser"); }

    /**
     * Pull out the list of foreign table 'TEcOrderH'.
     * @param tEcOrderRList The list of tEcOrderR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TEcOrderH> pulloutTEcOrderH(List<TEcOrderR> tEcOrderRList)
    { return helpPulloutInternally(tEcOrderRList, "tEcOrderH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderRList The list of tEcOrderR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInvoiceCreateFlg(List<TEcOrderR> tEcOrderRList)
    { return helpPulloutInternally(tEcOrderRList, "bClassDtlByInvoiceCreateFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderRList The list of tEcOrderR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStatementOutFlg(List<TEcOrderR> tEcOrderRList)
    { return helpPulloutInternally(tEcOrderRList, "bClassDtlByStatementOutFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key ecOrderHId.
     * @param tEcOrderRList The list of tEcOrderR. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractEcOrderHIdList(List<TEcOrderR> tEcOrderRList)
    { return helpExtractListInternally(tEcOrderRList, "ecOrderHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tEcOrderR.setFoo...(value);
     * tEcOrderR.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderR.set...;</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">insert</span>(tEcOrderR);
     * ... = tEcOrderR.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tEcOrderR The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TEcOrderR tEcOrderR) {
        doInsert(tEcOrderR, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderR.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">update</span>(tEcOrderR);
     * </pre>
     * @param tEcOrderR The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TEcOrderR tEcOrderR) {
        doUpdate(tEcOrderR, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderR.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tEcOrderR);
     * </pre>
     * @param tEcOrderR The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TEcOrderR tEcOrderR) {
        doUpdateNonstrict(tEcOrderR, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tEcOrderR The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TEcOrderR tEcOrderR) {
        doInsertOrUpdate(tEcOrderR, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tEcOrderR The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TEcOrderR tEcOrderR) {
        doInsertOrUpdateNonstrict(tEcOrderR, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">delete</span>(tEcOrderR);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tEcOrderR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TEcOrderR tEcOrderR) {
        doDelete(tEcOrderR, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tEcOrderR);
     * </pre>
     * @param tEcOrderR The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TEcOrderR tEcOrderR) {
        doDeleteNonstrict(tEcOrderR, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tEcOrderR);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tEcOrderR The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TEcOrderR tEcOrderR) {
        doDeleteNonstrictIgnoreDeleted(tEcOrderR, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TEcOrderR et, final DeleteOption<TEcOrderRCB> op) {
        assertObjectNotNull("tEcOrderR", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     *     tEcOrderR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderR.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tEcOrderRList.add(tEcOrderR);
     * }
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">batchInsert</span>(tEcOrderRList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TEcOrderR> tEcOrderRList) {
        return doBatchInsert(tEcOrderRList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     *     tEcOrderR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderR.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tEcOrderR.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tEcOrderR.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tEcOrderRList.add(tEcOrderR);
     * }
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderRList);
     * </pre>
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TEcOrderR> tEcOrderRList) {
        return doBatchUpdate(tEcOrderRList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tEcOrderRBhv.<span style="color: #CC4747">batchUpdate</span>(tEcOrderRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TEcOrderR> tEcOrderRList, SpecifyQuery<TEcOrderRCB> colCBLambda) {
        return doBatchUpdate(tEcOrderRList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     *     tEcOrderR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderR.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tEcOrderR.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tEcOrderR.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tEcOrderRList.add(tEcOrderR);
     * }
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderRList);
     * </pre>
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TEcOrderR> tEcOrderRList) {
        return doBatchUpdateNonstrict(tEcOrderRList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tEcOrderRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tEcOrderRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TEcOrderR> tEcOrderRList, SpecifyQuery<TEcOrderRCB> colCBLambda) {
        return doBatchUpdateNonstrict(tEcOrderRList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TEcOrderR> tEcOrderRList) {
        return doBatchDelete(tEcOrderRList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TEcOrderR> tEcOrderRList) {
        return doBatchDeleteNonstrict(tEcOrderRList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TEcOrderR, TEcOrderRCB&gt;() {
     *     public ConditionBean setup(TEcOrderR entity, TEcOrderRCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TEcOrderR, TEcOrderRCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setPK...(value);</span>
     * tEcOrderR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderR.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setVersionNo(value);</span>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tEcOrderR, cb);
     * </pre>
     * @param tEcOrderR The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TEcOrderR tEcOrderR, TEcOrderRCB cb) {
        return doQueryUpdate(tEcOrderR, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TEcOrderRCB cb = new TEcOrderRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">queryDelete</span>(tEcOrderR, cb);
     * </pre>
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TEcOrderRCB cb) {
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
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tEcOrderR.setFoo...(value);
     * tEcOrderR.setBar...(value);
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tEcOrderR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tEcOrderR.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tEcOrderR The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, InsertOption<TEcOrderRCB>> opLambda) {
        doInsert(tEcOrderR, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tEcOrderR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderR The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> opLambda) {
        doUpdate(tEcOrderR, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * tEcOrderR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tEcOrderR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderR The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> opLambda) {
        doUpdateNonstrict(tEcOrderR, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tEcOrderR The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, InsertOption<TEcOrderRCB>> insertOpLambda, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> updateOpLambda) {
        doInsertOrUpdate(tEcOrderR, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tEcOrderR The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, InsertOption<TEcOrderRCB>> insertOpLambda, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tEcOrderR, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tEcOrderR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, DeleteOption<TEcOrderRCB>> opLambda) {
        doDelete(tEcOrderR, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tEcOrderR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TEcOrderR tEcOrderR, WritableOptionCall<TEcOrderRCB, DeleteOption<TEcOrderRCB>> opLambda) {
        doDeleteNonstrict(tEcOrderR, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TEcOrderR> tEcOrderRList, WritableOptionCall<TEcOrderRCB, InsertOption<TEcOrderRCB>> opLambda) {
        return doBatchInsert(tEcOrderRList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TEcOrderR> tEcOrderRList, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> opLambda) {
        return doBatchUpdate(tEcOrderRList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TEcOrderR> tEcOrderRList, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> opLambda) {
        return doBatchUpdateNonstrict(tEcOrderRList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TEcOrderR> tEcOrderRList, WritableOptionCall<TEcOrderRCB, DeleteOption<TEcOrderRCB>> opLambda) {
        return doBatchDelete(tEcOrderRList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tEcOrderRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TEcOrderR> tEcOrderRList, WritableOptionCall<TEcOrderRCB, DeleteOption<TEcOrderRCB>> opLambda) {
        return doBatchDeleteNonstrict(tEcOrderRList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TEcOrderR, TEcOrderRCB> manyArgLambda, WritableOptionCall<TEcOrderRCB, InsertOption<TEcOrderRCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TEcOrderR tEcOrderR = <span style="color: #70226C">new</span> TEcOrderR();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setPK...(value);</span>
     * tEcOrderR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderR.setVersionNo(value);</span>
     * TEcOrderRCB cb = <span style="color: #70226C">new</span> TEcOrderRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderRBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tEcOrderR, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderR The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TEcOrderR tEcOrderR, TEcOrderRCB cb, WritableOptionCall<TEcOrderRCB, UpdateOption<TEcOrderRCB>> opLambda) {
        return doQueryUpdate(tEcOrderR, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TEcOrderR. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TEcOrderRCB cb, WritableOptionCall<TEcOrderRCB, DeleteOption<TEcOrderRCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tEcOrderRBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tEcOrderRBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tEcOrderRBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tEcOrderRBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tEcOrderRBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tEcOrderRBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tEcOrderRBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tEcOrderRBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tEcOrderRBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tEcOrderRBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tEcOrderRBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tEcOrderRBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tEcOrderRBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tEcOrderRBhv.outideSql().removeBlockComment().selectList()
     * tEcOrderRBhv.outideSql().removeLineComment().selectList()
     * tEcOrderRBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TEcOrderRBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TEcOrderRBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TEcOrderR> typeOfSelectedEntity() { return TEcOrderR.class; }
    protected Class<TEcOrderR> typeOfHandlingEntity() { return TEcOrderR.class; }
    protected Class<TEcOrderRCB> typeOfHandlingConditionBean() { return TEcOrderRCB.class; }
}
